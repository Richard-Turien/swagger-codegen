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


class ArrayOfArrayOfNumberOnly(object):
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
        'array_array_number': 'typing.List[typing.List[float]]'
    }

    attribute_map = {
        'array_array_number': 'ArrayArrayNumber'
    }

    def __init__(self, array_array_number: "typing.Optional[typing.List[typing.List[float]]]"=None, _configuration: "typing.Optional[Configuration]"=None) -> None:  # noqa: E501
        """ArrayOfArrayOfNumberOnly - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration: Configuration = _configuration

        self._array_array_number: "typing.List[typing.List[float]]" = None
        self.discriminator: None = None

        if array_array_number is not None:
            self.array_array_number = array_array_number

    @property
    def array_array_number(self) -> "typing.List[typing.List[float]]":
        """Gets the array_array_number of this ArrayOfArrayOfNumberOnly.  # noqa: E501


        :return: The array_array_number of this ArrayOfArrayOfNumberOnly.  # noqa: E501
        :rtype: typing.List[typing.List[float]]
        """
        return self._array_array_number

    @array_array_number.setter
    def array_array_number(self, array_array_number: "typing.List[typing.List[float]]") -> None:
        """Sets the array_array_number of this ArrayOfArrayOfNumberOnly.


        :param array_array_number: The array_array_number of this ArrayOfArrayOfNumberOnly.  # noqa: E501
        :type: typing.List[typing.List[float]]
        """

        self._array_array_number = array_array_number

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
        if issubclass(ArrayOfArrayOfNumberOnly, dict):
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
        if not isinstance(other, ArrayOfArrayOfNumberOnly):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other: "typing.Any") -> bool:
        """Returns true if both objects are not equal"""
        if not isinstance(other, ArrayOfArrayOfNumberOnly):
            return True

        return self.to_dict() != other.to_dict()
