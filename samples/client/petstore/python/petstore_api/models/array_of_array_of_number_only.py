# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class ArrayOfArrayOfNumberOnly(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, array_array_number=None):
        """
        ArrayOfArrayOfNumberOnly - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'array_array_number': 'list[list[float]]'
        }

        self.attribute_map = {
            'array_array_number': 'ArrayArrayNumber'
        }

        self._array_array_number = None

        # TODO: let required properties as mandatory parameter in the constructor.
        #       - to check if required property is not None (e.g. by calling setter)
        #       - ApiClient.__deserialize_model has to be adapted as well
        if array_array_number is not None:
          self.array_array_number = array_array_number

    @property
    def array_array_number(self):
        """
        Gets the array_array_number of this ArrayOfArrayOfNumberOnly.

        :return: The array_array_number of this ArrayOfArrayOfNumberOnly.
        :rtype: list[list[float]]
        """
        return self._array_array_number

    @array_array_number.setter
    def array_array_number(self, array_array_number):
        """
        Sets the array_array_number of this ArrayOfArrayOfNumberOnly.

        :param array_array_number: The array_array_number of this ArrayOfArrayOfNumberOnly.
        :type: list[list[float]]
        """

        self._array_array_number = array_array_number

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
        if not isinstance(other, ArrayOfArrayOfNumberOnly):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
