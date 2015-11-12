# coding: utf-8

from __future__ import absolute_import

from ..configuration import configuration
from ..api_client import ApiClient


class UserApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = configuration
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def create_user(self, body=None, callback=None):
        """
        Create user
        This can only be done by the logged in user.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.create_user(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param User body: Created user object
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/user'.replace('{format}', 'json')
        method = 'POST'

        path_params = {
        }

        query_params = {
        }

        header_params = {
        }

        form_params = {
        }

        files = {
        }

        body_params = {
            'body': body,
        }

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def create_users_with_array_input(self, body=None, callback=None):
        """
        Creates list of users with given input array
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.create_users_with_array_input(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param list[User] body: List of user object
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/user/createWithArray'.replace('{format}', 'json')
        method = 'POST'

        path_params = {
        }

        query_params = {
        }

        header_params = {
        }

        form_params = {
        }

        files = {
        }

        body_params = {
            'body': body,
        }

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def create_users_with_list_input(self, body=None, callback=None):
        """
        Creates list of users with given input array
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.create_users_with_list_input(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param list[User] body: List of user object
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/user/createWithList'.replace('{format}', 'json')
        method = 'POST'

        path_params = {
        }

        query_params = {
        }

        header_params = {
        }

        form_params = {
        }

        files = {
        }

        body_params = {
            'body': body,
        }

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def login_user(self, username=None, password=None, callback=None):
        """
        Logs user into the system
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.login_user(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str username: The user name for login
        :param str password: The password for login in clear text
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/user/login'.replace('{format}', 'json')
        method = 'GET'

        path_params = {
        }

        query_params = {
            'username': username,
            'password': password,
        }

        header_params = {
        }

        form_params = {
        }

        files = {
        }

        body_params = {
        }

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type='str',
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def logout_user(self, callback=None):
        """
        Logs out current logged in user session
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.logout_user(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/user/logout'.replace('{format}', 'json')
        method = 'GET'

        path_params = {
        }

        query_params = {
        }

        header_params = {
        }

        form_params = {
        }

        files = {
        }

        body_params = {
        }

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def get_user_by_name(self, username, callback=None):
        """
        Get user by user name
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.get_user_by_name(username, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str username: The name that needs to be fetched. Use user1 for testing. (required)
        :return: User
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/user/{username}'.replace('{format}', 'json')
        method = 'GET'

        path_params = {
            'username': username,
        }

        query_params = {
        }

        header_params = {
        }

        form_params = {
        }

        files = {
        }

        body_params = {
        }

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type='User',
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def update_user(self, username, body=None, callback=None):
        """
        Updated user
        This can only be done by the logged in user.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.update_user(username, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str username: name that need to be deleted (required)
        :param User body: Updated user object
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/user/{username}'.replace('{format}', 'json')
        method = 'PUT'

        path_params = {
            'username': username,
        }

        query_params = {
        }

        header_params = {
        }

        form_params = {
        }

        files = {
        }

        body_params = {
            'body': body,
        }

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def delete_user(self, username, callback=None):
        """
        Delete user
        This can only be done by the logged in user.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.delete_user(username, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str username: The name that needs to be deleted (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/user/{username}'.replace('{format}', 'json')
        method = 'DELETE'

        path_params = {
            'username': username,
        }

        query_params = {
        }

        header_params = {
        }

        form_params = {
        }

        files = {
        }

        body_params = {
        }

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response
