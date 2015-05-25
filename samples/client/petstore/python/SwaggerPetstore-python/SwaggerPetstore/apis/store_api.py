#!/usr/bin/env python
# coding: utf-8

"""
StoreApi.py
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

from .. import config

class StoreApi(object):

    def __init__(self, api_client=None):
        if api_client:
            self.api_client = api_client
        else:
            self.api_client = config.api_client
    
    def get_inventory(self, **kwargs):
        """
        Returns pet inventories by status
        Returns a map of status codes to quantities

        
        :return: map(String, int)
        """
        
        all_params = []

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method get_inventory" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/store/inventory'.replace('{format}', 'json')
        method = 'GET'

        path_params = remove_none(dict())
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = ApiClient.select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = ApiClient.select_header_content_type([])

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response='map(String, int)')
        
        return response
        
    def place_order(self, **kwargs):
        """
        Place an order for a pet
        

        :param Order body: order placed for purchasing the pet 
        
        :return: Order
        """
        
        all_params = ['body']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method place_order" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/store/order'.replace('{format}', 'json')
        method = 'POST'

        path_params = remove_none(dict())
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = params.get('body')

        # HTTP header `Accept`
        header_params['Accept'] = ApiClient.select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = ApiClient.select_header_content_type([])

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response='Order')
        
        return response
        
    def get_order_by_id(self, order_id, **kwargs):
        """
        Find purchase order by ID
        For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions

        :param str order_id: ID of pet that needs to be fetched (required)
        
        :return: Order
        """
        
        # verify the required parameter 'order_id' is set
        if order_id is None:
            raise ValueError("Missing the required parameter `order_id` when calling `get_order_by_id`")
        
        all_params = ['order_id']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method get_order_by_id" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/store/order/{orderId}'.replace('{format}', 'json')
        method = 'GET'

        path_params = remove_none(dict(orderId=params.get('order_id')))
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = ApiClient.select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = ApiClient.select_header_content_type([])

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response='Order')
        
        return response
        
    def delete_order(self, order_id, **kwargs):
        """
        Delete purchase order by ID
        For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors

        :param str order_id: ID of the order that needs to be deleted (required)
        
        :return: None
        """
        
        # verify the required parameter 'order_id' is set
        if order_id is None:
            raise ValueError("Missing the required parameter `order_id` when calling `delete_order`")
        
        all_params = ['order_id']

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError("Got an unexpected keyword argument '%s' to method delete_order" % key)
            params[key] = val
        del params['kwargs']

        resource_path = '/store/order/{orderId}'.replace('{format}', 'json')
        method = 'DELETE'

        path_params = remove_none(dict(orderId=params.get('order_id')))
        query_params = remove_none(dict())
        header_params = remove_none(dict())
        form_params = remove_none(dict())
        files = remove_none(dict())
        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = ApiClient.select_header_accept(['application/json', 'application/xml'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = ApiClient.select_header_content_type([])

        response = self.api_client.call_api(resource_path, method, path_params, query_params, header_params,
                                            body=body_params, post_params=form_params, files=files,
                                            response=None)
        









