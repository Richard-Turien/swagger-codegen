#!/usr/bin/env python
# coding: utf-8

"""
UserApi.py
Copyright 2015 Reverb Technologies, Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
"""
from __future__ import absolute_import

import sys
import os

# python 2 and python 3 compatibility library
from six import iteritems

from ..util import remove_none

from ..swagger import ApiClient

class UserApi(object):

    def __init__(self, api_client):
        self.api_client = api_client
    
    def create_user(self, **kwargs):
        """
        Create user
        This can only be done by the logged in user.

        :param User body: Created user object 
        
        :return: None
        """
        
        all_params = ['body']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method create_user" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/user'.replace('{format}', 'json')
        method = 'POST'

        path_params = remove_none(dict())
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = params.get('body')

        # HTTP header `Accept`
        accepts = ['application/json', 'application/xml']
        header_params['Accept'] = ApiClient.select_header_accept(accepts)

        # HTTP header `Content-Type`
        content_types = []
        header_params['Content-Type'] = ApiClient.select_header_content_type(content_types)

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response=None)
        
    def create_users_with_array_input(self, **kwargs):
        """
        Creates list of users with given input array
        

        :param list[User] body: List of user object 
        
        :return: None
        """
        
        all_params = ['body']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method create_users_with_array_input" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/user/createWithArray'.replace('{format}', 'json')
        method = 'POST'

        path_params = remove_none(dict())
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = params.get('body')

        # HTTP header `Accept`
        accepts = ['application/json', 'application/xml']
        header_params['Accept'] = ApiClient.select_header_accept(accepts)

        # HTTP header `Content-Type`
        content_types = []
        header_params['Content-Type'] = ApiClient.select_header_content_type(content_types)

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response=None)
        
    def create_users_with_list_input(self, **kwargs):
        """
        Creates list of users with given input array
        

        :param list[User] body: List of user object 
        
        :return: None
        """
        
        all_params = ['body']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method create_users_with_list_input" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/user/createWithList'.replace('{format}', 'json')
        method = 'POST'

        path_params = remove_none(dict())
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = params.get('body')

        # HTTP header `Accept`
        accepts = ['application/json', 'application/xml']
        header_params['Accept'] = ApiClient.select_header_accept(accepts)

        # HTTP header `Content-Type`
        content_types = []
        header_params['Content-Type'] = ApiClient.select_header_content_type(content_types)

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response=None)
        
    def login_user(self, **kwargs):
        """
        Logs user into the system
        

        :param str username: The user name for login 
        :param str password: The password for login in clear text 
        
        :return: str
        """
        
        all_params = ['username', 'password']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method login_user" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/user/login'.replace('{format}', 'json')
        method = 'GET'

        path_params = remove_none(dict())
        query_params = remove_none(dict(username=params.get('username'), password=params.get('password')))
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = None

        # HTTP header `Accept`
        accepts = ['application/json', 'application/xml']
        header_params['Accept'] = ApiClient.select_header_accept(accepts)

        # HTTP header `Content-Type`
        content_types = []
        header_params['Content-Type'] = ApiClient.select_header_content_type(content_types)

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response='str')
        
        return response
        
    def logout_user(self, **kwargs):
        """
        Logs out current logged in user session
        

        
        :return: None
        """
        
        all_params = []

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method logout_user" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/user/logout'.replace('{format}', 'json')
        method = 'GET'

        path_params = remove_none(dict())
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = None

        # HTTP header `Accept`
        accepts = ['application/json', 'application/xml']
        header_params['Accept'] = ApiClient.select_header_accept(accepts)

        # HTTP header `Content-Type`
        content_types = []
        header_params['Content-Type'] = ApiClient.select_header_content_type(content_types)

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response=None)
        
    def get_user_by_name(self, username, **kwargs):
        """
        Get user by user name
        

        :param str username: The name that needs to be fetched. Use user1 for testing.  (required)
        
        :return: User
        """
        
        # verify the required parameter 'username' is set
        if username is None:
            raise ValueError("Missing the required parameter `username` when calling `get_user_by_name`")
        
        all_params = ['username']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method get_user_by_name" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/user/{username}'.replace('{format}', 'json')
        method = 'GET'

        path_params = remove_none(dict(username=params.get('username')))
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = None

        # HTTP header `Accept`
        accepts = ['application/json', 'application/xml']
        header_params['Accept'] = ApiClient.select_header_accept(accepts)

        # HTTP header `Content-Type`
        content_types = []
        header_params['Content-Type'] = ApiClient.select_header_content_type(content_types)

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response='User')
        
        return response
        
    def update_user(self, username, **kwargs):
        """
        Updated user
        This can only be done by the logged in user.

        :param str username: name that need to be deleted (required)
        :param User body: Updated user object 
        
        :return: None
        """
        
        # verify the required parameter 'username' is set
        if username is None:
            raise ValueError("Missing the required parameter `username` when calling `update_user`")
        
        all_params = ['username', 'body']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method update_user" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/user/{username}'.replace('{format}', 'json')
        method = 'PUT'

        path_params = remove_none(dict(username=params.get('username')))
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = params.get('body')

        # HTTP header `Accept`
        accepts = ['application/json', 'application/xml']
        header_params['Accept'] = ApiClient.select_header_accept(accepts)

        # HTTP header `Content-Type`
        content_types = []
        header_params['Content-Type'] = ApiClient.select_header_content_type(content_types)

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response=None)
        
    def delete_user(self, username, **kwargs):
        """
        Delete user
        This can only be done by the logged in user.

        :param str username: The name that needs to be deleted (required)
        
        :return: None
        """
        
        # verify the required parameter 'username' is set
        if username is None:
            raise ValueError("Missing the required parameter `username` when calling `delete_user`")
        
        all_params = ['username']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method delete_user" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/user/{username}'.replace('{format}', 'json')
        method = 'DELETE'

        path_params = remove_none(dict(username=params.get('username')))
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = None

        # HTTP header `Accept`
        accepts = ['application/json', 'application/xml']
        header_params['Accept'] = ApiClient.select_header_accept(accepts)

        # HTTP header `Content-Type`
        content_types = []
        header_params['Content-Type'] = ApiClient.select_header_content_type(content_types)

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response=None)
        









