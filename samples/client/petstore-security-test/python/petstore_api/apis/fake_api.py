# coding: utf-8

"""
    Swagger Petstore */ ' \" =end -- \\r\\n \\n \\r

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  */ ' \" =end --       

    OpenAPI spec version: 1.0.0 */ ' \" =end -- \\r\\n \\n \\r
    Contact: apiteam@swagger.io */ ' \" =end -- \\r\\n \\n \\r
    Generated by: https://github.com/swagger-api/swagger-codegen.git

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""

from __future__ import absolute_import

import sys
import os
import re

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class FakeApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def test_code_inject____end__rn_n_r(self, **kwargs):
        """
        To test code injection */ ' \" =end -- \\r\\n \\n \\r
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.test_code_inject____end__rn_n_r(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str test_code_inject____end____rn_n_r: To test code injection */ ' \" =end -- \\r\\n \\n \\r
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.test_code_inject____end__rn_n_r_with_http_info(**kwargs)
        else:
            (data) = self.test_code_inject____end__rn_n_r_with_http_info(**kwargs)
            return data

    def test_code_inject____end__rn_n_r_with_http_info(self, **kwargs):
        """
        To test code injection */ ' \" =end -- \\r\\n \\n \\r
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.test_code_inject____end__rn_n_r_with_http_info(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str test_code_inject____end____rn_n_r: To test code injection */ ' \" =end -- \\r\\n \\n \\r
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['test_code_inject____end____rn_n_r']
        all_params.append('callback')
        all_params.append('_return_http_data_only')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method test_code_inject____end__rn_n_r" % key
                )
            params[key] = val
        del params['kwargs']


        collection_formats = {}

        resource_path = '/fake'.replace('{format}', 'json')
        path_params = {}

        query_params = {}

        header_params = {}

        form_params = []
        local_var_files = {}
        if 'test_code_inject____end____rn_n_r' in params:
            form_params.append(('test code inject */ &#39; &quot; &#x3D;end -- \r\n \n \r', params['test_code_inject____end____rn_n_r']))

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', '*/  \" =end --       '])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json', '*/  \" =end --       '])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'PUT',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'),
                                            _return_http_data_only=params.get('_return_http_data_only'),
                                            collection_formats=collection_formats)
