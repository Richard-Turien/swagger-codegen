# coding: utf-8

from __future__ import absolute_import

from ..configuration import configuration
from ..api_client import ApiClient


class StoreApi(object):
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

    def get_inventory(self, callback=None):
        """
        Returns pet inventories by status
        Returns a map of status codes to quantities

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.get_inventory(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :return: dict(str, int)
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/store/inventory'.replace('{format}', 'json')
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
        auth_settings = ['api_key']

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type='dict(str, int)',
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def place_order(self, body=None, callback=None):
        """
        Place an order for a pet
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.place_order(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param Order body: order placed for purchasing the pet
        :return: Order
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/store/order'.replace('{format}', 'json')
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
                                            response_type='Order',
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def get_order_by_id(self, order_id, callback=None):
        """
        Find purchase order by ID
        For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.get_order_by_id(order_id, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str order_id: ID of pet that needs to be fetched (required)
        :return: Order
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/store/order/{orderId}'.replace('{format}', 'json')
        method = 'GET'

        path_params = {
            'orderId': order_id,
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
                                            response_type='Order',
                                            auth_settings=auth_settings,
                                            callback=callback)
        return response

    def delete_order(self, order_id, callback=None):
        """
        Delete purchase order by ID
        For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.delete_order(order_id, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str order_id: ID of the order that needs to be deleted (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        resource_path = '/store/order/{orderId}'.replace('{format}', 'json')
        method = 'DELETE'

        path_params = {
            'orderId': order_id,
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
