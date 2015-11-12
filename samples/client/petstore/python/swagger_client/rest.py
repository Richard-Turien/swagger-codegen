# coding: utf-8

from __future__ import absolute_import

import logging
import requests
import json

from .configuration import configuration


try:
    # for python3
    from urllib.parse import urlencode
except ImportError:
    # for python2
    from urllib import urlencode


logger = logging.getLogger(__name__)


class RESTClient(object):

    def __init__(self):
        self.sessions = {
            None: requests.Session(),
        }
        
    def session(self, auth_settings=None):
        if auth_settings is None:
            auth_settings = [None]
        assert len(auth_settings) == 1
        auth_type = configuration.auth_settings().get(auth_settings[0], {'type': auth_settings[0]})['type']
        if auth_type in self.sessions:
            return self.sessions[auth_type]
        if auth_type == 'oauth2':
            from rauth import OAuth2Service
            service = OAuth2Service(
                base_url=configuration.host,
                client_id=configuration.client_id,
                client_secret=configuration.client_secret,
                access_token_url=configuration.oauth_url)

            self.sessions[auth_type] = service.get_auth_session(data={
                'username': configuration.username,
                'password': configuration.password, 
                'grant_type': 'password', 
                'scope': configuration.scope})
        else:
            self.sessions[auth_type] = requests.Session()
        return self.sessions[auth_type]

    def request(self, method, url, query_params=None, headers=None,
                body=None, post_params=None, auth_settings=None, files=None):
        """
        :param method: http request method
        :param url: http request url
        :param query_params: query parameters in the url
        :param headers: http request headers
        :param body: request json body, for `application/json`
        :param post_params: request post parameters,
                            `application/x-www-form-urlencode`
                            and `multipart/form-data`
        """
        method = method.upper()
        assert method in ['GET', 'HEAD', 'DELETE', 'POST', 'PUT', 'PATCH', 'OPTIONS']
        
        verify = configuration.cert_file or configuration.verify_ssl
        cert = configuration.ssl_ca_cert

        if post_params and body:
            raise ValueError(
                "body parameter cannot be used with post_params parameter."
            )

        post_params = post_params or {}
        headers = headers or {}

        if 'Content-Type' not in headers:
            headers['Content-Type'] = 'application/json'

        try:
            # For `POST`, `PUT`, `PATCH`, `OPTIONS`
            if method in ['POST', 'PUT', 'PATCH', 'OPTIONS']:
                if query_params:
                    url += '?' + urlencode(query_params)
                    
            if headers['Content-Type'] == 'application/json':
                data = json.dumps(body)
            elif headers['Content-Type'] == 'application/x-www-form-urlencoded':
                data = post_params
            elif headers['Content-Type'] == 'multipart/form-data':
                data = post_params
            else:
                data = query_params

            r = self.session(auth_settings).request(
                method, 
                url,
                data=data,
                headers=headers,
                cert=cert,
                files=files,
                verify=verify)
        except requests.exceptions.SSLError as e:
            msg = "{0}\n{1}".format(type(e).__name__, str(e))
            raise ApiException(status=0, reason=msg)

        # log response body
        logger.debug("response body: %s" % r.content)

        if r.status_code not in range(200, 206):
            raise ApiException(http_resp=r)

        return r


class ApiException(Exception):

    def __init__(self, status=None, reason=None, http_resp=None):
        if http_resp is not None:
            self.status = http_resp.status_code
            self.reason = http_resp.reason
            self.body = http_resp.content
            self.headers = http_resp.headers
        else:
            self.status = status
            self.reason = reason
            self.body = None
            self.headers = None

    def __str__(self):
        """
        Custom error messages for exception
        """
        error_message = "({0})\n"\
                        "Reason: {1}\n".format(self.status, self.reason)
        if self.headers:
            error_message += "HTTP response headers: {0}\n".format(self.headers)

        if self.body:
            error_message += "HTTP response body: {0}\n".format(self.body)

        return error_message
