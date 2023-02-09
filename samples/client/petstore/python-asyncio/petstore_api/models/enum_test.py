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
from typing import TYPE_CHECKING

if TYPE_CHECKING:
    import typing
    import datetime  # noqa: F401
    from petstore_api.models import *

import six

from petstore_api.configuration import Configuration


class EnumTest(object):
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
        'enum_string': 'str',
        'enum_string_required': 'str',
        'enum_integer': 'int',
        'enum_number': 'float',
        'outer_enum': 'OuterEnum'
    }

    attribute_map = {
        'enum_string': 'enum_string',
        'enum_string_required': 'enum_string_required',
        'enum_integer': 'enum_integer',
        'enum_number': 'enum_number',
        'outer_enum': 'outerEnum'
    }

    def __init__(self, enum_string: "typing.Optional[str]"=None, enum_string_required: "typing.Optional[str]"=None, enum_integer: "typing.Optional[int]"=None, enum_number: "typing.Optional[float]"=None, outer_enum: "typing.Optional[OuterEnum]"=None, _configuration: "typing.Optional[Configuration]"=None) -> None:  # noqa: E501
        """EnumTest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration: Configuration = _configuration

        self._enum_string: "str" = None
        self._enum_string_required: "str" = None
        self._enum_integer: "int" = None
        self._enum_number: "float" = None
        self._outer_enum: "OuterEnum" = None
        self.discriminator: None = None

        if enum_string is not None:
            self.enum_string = enum_string
        self.enum_string_required: "str" = enum_string_required
        if enum_integer is not None:
            self.enum_integer = enum_integer
        if enum_number is not None:
            self.enum_number = enum_number
        if outer_enum is not None:
            self.outer_enum = outer_enum

    @property
    def enum_string(self) -> "str":
        """Gets the enum_string of this EnumTest.  # noqa: E501


        :return: The enum_string of this EnumTest.  # noqa: E501
        :rtype: str
        """
        return self._enum_string

    @enum_string.setter
    def enum_string(self, enum_string: "str") -> None:
        """Sets the enum_string of this EnumTest.


        :param enum_string: The enum_string of this EnumTest.  # noqa: E501
        :type: str
        """
        allowed_values = ["UPPER", "lower", ""]  # noqa: E501
        if (self._configuration.client_side_validation and
                enum_string not in allowed_values):
            raise ValueError(
                "Invalid value for `enum_string` ({0}), must be one of {1}"  # noqa: E501
                .format(enum_string, allowed_values)
            )

        self._enum_string = enum_string

    @property
    def enum_string_required(self) -> "str":
        """Gets the enum_string_required of this EnumTest.  # noqa: E501


        :return: The enum_string_required of this EnumTest.  # noqa: E501
        :rtype: str
        """
        return self._enum_string_required

    @enum_string_required.setter
    def enum_string_required(self, enum_string_required: "str") -> None:
        """Sets the enum_string_required of this EnumTest.


        :param enum_string_required: The enum_string_required of this EnumTest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and enum_string_required is None:
            raise ValueError("Invalid value for `enum_string_required`, must not be `None`")  # noqa: E501
        allowed_values = ["UPPER", "lower", ""]  # noqa: E501
        if (self._configuration.client_side_validation and
                enum_string_required not in allowed_values):
            raise ValueError(
                "Invalid value for `enum_string_required` ({0}), must be one of {1}"  # noqa: E501
                .format(enum_string_required, allowed_values)
            )

        self._enum_string_required = enum_string_required

    @property
    def enum_integer(self) -> "int":
        """Gets the enum_integer of this EnumTest.  # noqa: E501


        :return: The enum_integer of this EnumTest.  # noqa: E501
        :rtype: int
        """
        return self._enum_integer

    @enum_integer.setter
    def enum_integer(self, enum_integer: "int") -> None:
        """Sets the enum_integer of this EnumTest.


        :param enum_integer: The enum_integer of this EnumTest.  # noqa: E501
        :type: int
        """
        allowed_values = [1, -1]  # noqa: E501
        if (self._configuration.client_side_validation and
                enum_integer not in allowed_values):
            raise ValueError(
                "Invalid value for `enum_integer` ({0}), must be one of {1}"  # noqa: E501
                .format(enum_integer, allowed_values)
            )

        self._enum_integer = enum_integer

    @property
    def enum_number(self) -> "float":
        """Gets the enum_number of this EnumTest.  # noqa: E501


        :return: The enum_number of this EnumTest.  # noqa: E501
        :rtype: float
        """
        return self._enum_number

    @enum_number.setter
    def enum_number(self, enum_number: "float") -> None:
        """Sets the enum_number of this EnumTest.


        :param enum_number: The enum_number of this EnumTest.  # noqa: E501
        :type: float
        """
        allowed_values = [1.1, -1.2]  # noqa: E501
        if (self._configuration.client_side_validation and
                enum_number not in allowed_values):
            raise ValueError(
                "Invalid value for `enum_number` ({0}), must be one of {1}"  # noqa: E501
                .format(enum_number, allowed_values)
            )

        self._enum_number = enum_number

    @property
    def outer_enum(self) -> "OuterEnum":
        """Gets the outer_enum of this EnumTest.  # noqa: E501


        :return: The outer_enum of this EnumTest.  # noqa: E501
        :rtype: OuterEnum
        """
        return self._outer_enum

    @outer_enum.setter
    def outer_enum(self, outer_enum: "OuterEnum") -> None:
        """Sets the outer_enum of this EnumTest.


        :param outer_enum: The outer_enum of this EnumTest.  # noqa: E501
        :type: OuterEnum
        """

        self._outer_enum = outer_enum

    def to_dict(self) -> "typing.Dict[str, typing.Any]":
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
        if issubclass(EnumTest, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self) -> str:
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self) -> str:
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other: "typing.Any") -> bool:
        """Returns true if both objects are equal"""
        if not isinstance(other, EnumTest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other: "typing.Any") -> bool:
        """Returns true if both objects are not equal"""
        if not isinstance(other, EnumTest):
            return True

        return self.to_dict() != other.to_dict()
