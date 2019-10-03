# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from petstore_api.configuration import Configuration


class EnumArrays(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'just_symbol': 'str',
        'array_enum': 'list[str]'
    }

    attribute_map = {
        'just_symbol': 'just_symbol',
        'array_enum': 'array_enum'
    }

    def __init__(self, just_symbol=None, array_enum=None, _configuration=None):  # noqa: E501
        """EnumArrays - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._just_symbol = None
        self._array_enum = None
        self.discriminator = None

        if just_symbol is not None:
            self.just_symbol = just_symbol
        if array_enum is not None:
            self.array_enum = array_enum

    @property
    def just_symbol(self):
        """Gets the just_symbol of this EnumArrays.  # noqa: E501


        :return: The just_symbol of this EnumArrays.  # noqa: E501
        :rtype: str
        """
        return self._just_symbol

    @just_symbol.setter
    def just_symbol(self, just_symbol):
        """Sets the just_symbol of this EnumArrays.


        :param just_symbol: The just_symbol of this EnumArrays.  # noqa: E501
        :type: str
        """
        allowed_values = [">=", "$"]  # noqa: E501
        if self._configuration.client_side_validation and 
            just_symbol not in allowed_values:
            raise ValueError(
                "Invalid value for `just_symbol` ({0}), must be one of {1}"  # noqa: E501
                .format(just_symbol, allowed_values)
            )

        self._just_symbol = just_symbol

    @property
    def array_enum(self):
        """Gets the array_enum of this EnumArrays.  # noqa: E501


        :return: The array_enum of this EnumArrays.  # noqa: E501
        :rtype: list[str]
        """
        return self._array_enum

    @array_enum.setter
    def array_enum(self, array_enum):
        """Sets the array_enum of this EnumArrays.


        :param array_enum: The array_enum of this EnumArrays.  # noqa: E501
        :type: list[str]
        """
        allowed_values = ["fish", "crab"]  # noqa: E501
        if self._configuration.client_side_validation and not set(array_enum).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `array_enum` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(array_enum) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._array_enum = array_enum

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
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
        if issubclass(EnumArrays, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, EnumArrays):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, EnumArrays):
            return True

        return self.to_dict() != other.to_dict()
