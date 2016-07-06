# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
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

from pprint import pformat
from six import iteritems
import re


class MapTest(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, map_map_of_string=None, map_of_enum_string=None):
        """
        MapTest - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'map_map_of_string': 'dict(str, dict(str, str))',
            'map_of_enum_string': 'dict(str, str)'
        }

        self.attribute_map = {
            'map_map_of_string': 'map_map_of_string',
            'map_of_enum_string': 'map_of_enum_string'
        }

        self._map_map_of_string = map_map_of_string
        self._map_of_enum_string = map_of_enum_string

    @property
    def map_map_of_string(self):
        """
        Gets the map_map_of_string of this MapTest.


        :return: The map_map_of_string of this MapTest.
        :rtype: dict(str, dict(str, str))
        """
        return self._map_map_of_string

    @map_map_of_string.setter
    def map_map_of_string(self, map_map_of_string):
        """
        Sets the map_map_of_string of this MapTest.


        :param map_map_of_string: The map_map_of_string of this MapTest.
        :type: dict(str, dict(str, str))
        """

        self._map_map_of_string = map_map_of_string

    @property
    def map_of_enum_string(self):
        """
        Gets the map_of_enum_string of this MapTest.


        :return: The map_of_enum_string of this MapTest.
        :rtype: dict(str, str)
        """
        return self._map_of_enum_string

    @map_of_enum_string.setter
    def map_of_enum_string(self, map_of_enum_string):
        """
        Sets the map_of_enum_string of this MapTest.


        :param map_of_enum_string: The map_of_enum_string of this MapTest.
        :type: dict(str, str)
        """
        allowed_values = []
        if map_of_enum_string not in allowed_values:
            raise ValueError(
                "Invalid value for `map_of_enum_string` ({0}), must be one of {1}"
                .format(map_of_enum_string, allowed_values)
            )

        self._map_of_enum_string = map_of_enum_string

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
