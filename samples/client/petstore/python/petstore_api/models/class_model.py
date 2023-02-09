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


class ClassModel(object):
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
        '_class': 'str'
    }

    attribute_map = {
        '_class': '_class'
    }

    def __init__(self, _class: "typing.Optional[str]"=None, _configuration: "typing.Optional[Configuration]"=None) -> None:  # noqa: E501
        """ClassModel - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration: Configuration = _configuration

        self.__class: "str" = None
        self.discriminator: None = None

        if _class is not None:
            self._class = _class

    @property
    def _class(self) -> "str":
        """Gets the _class of this ClassModel.  # noqa: E501


        :return: The _class of this ClassModel.  # noqa: E501
        :rtype: str
        """
        return self.__class

    @_class.setter
    def _class(self, _class: "str") -> None:
        """Sets the _class of this ClassModel.


        :param _class: The _class of this ClassModel.  # noqa: E501
        :type: str
        """

        self.__class = _class

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
        if issubclass(ClassModel, dict):
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
        if not isinstance(other, ClassModel):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other: "typing.Any") -> bool:
        """Returns true if both objects are not equal"""
        if not isinstance(other, ClassModel):
            return True

        return self.to_dict() != other.to_dict()
