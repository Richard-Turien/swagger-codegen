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


class FormatTest(object):
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
        'integer': 'int',
        'int32': 'int',
        'int64': 'int',
        'number': 'float',
        '_float': 'float',
        'double': 'float',
        'string': 'str',
        'byte': 'str',
        'binary': 'str',
        '_date': 'date',
        'date_time': 'datetime.datetime',
        'uuid': 'str',
        'password': 'str'
    }

    attribute_map = {
        'integer': 'integer',
        'int32': 'int32',
        'int64': 'int64',
        'number': 'number',
        '_float': 'float',
        'double': 'double',
        'string': 'string',
        'byte': 'byte',
        'binary': 'binary',
        '_date': 'date',
        'date_time': 'dateTime',
        'uuid': 'uuid',
        'password': 'password'
    }

    def __init__(self, integer: "typing.Optional[int]"=None, int32: "typing.Optional[int]"=None, int64: "typing.Optional[int]"=None, number: "typing.Optional[float]"=None, _float: "typing.Optional[float]"=None, double: "typing.Optional[float]"=None, string: "typing.Optional[str]"=None, byte: "typing.Optional[str]"=None, binary: "typing.Optional[str]"=None, _date: "typing.Optional[date]"=None, date_time: "typing.Optional[datetime.datetime]"=None, uuid: "typing.Optional[str]"=None, password: "typing.Optional[str]"=None, _configuration: "typing.Optional[Configuration]"=None) -> None:  # noqa: E501
        """FormatTest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration: Configuration = _configuration

        self._integer: "int" = None
        self._int32: "int" = None
        self._int64: "int" = None
        self._number: "float" = None
        self.__float: "float" = None
        self._double: "float" = None
        self._string: "str" = None
        self._byte: "str" = None
        self._binary: "str" = None
        self.__date: "date" = None
        self._date_time: "datetime.datetime" = None
        self._uuid: "str" = None
        self._password: "str" = None
        self.discriminator: None = None

        if integer is not None:
            self.integer = integer
        if int32 is not None:
            self.int32 = int32
        if int64 is not None:
            self.int64 = int64
        self.number: "float" = number
        if _float is not None:
            self._float = _float
        if double is not None:
            self.double = double
        if string is not None:
            self.string = string
        self.byte: "str" = byte
        if binary is not None:
            self.binary = binary
        self._date: "date" = _date
        if date_time is not None:
            self.date_time = date_time
        if uuid is not None:
            self.uuid = uuid
        self.password: "str" = password

    @property
    def integer(self) -> "int":
        """Gets the integer of this FormatTest.  # noqa: E501


        :return: The integer of this FormatTest.  # noqa: E501
        :rtype: int
        """
        return self._integer

    @integer.setter
    def integer(self, integer: "int") -> None:
        """Sets the integer of this FormatTest.


        :param integer: The integer of this FormatTest.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                integer is not None and integer > 100):  # noqa: E501
            raise ValueError("Invalid value for `integer`, must be a value less than or equal to `100`")  # noqa: E501
        if (self._configuration.client_side_validation and
                integer is not None and integer < 10):  # noqa: E501
            raise ValueError("Invalid value for `integer`, must be a value greater than or equal to `10`")  # noqa: E501

        self._integer = integer

    @property
    def int32(self) -> "int":
        """Gets the int32 of this FormatTest.  # noqa: E501


        :return: The int32 of this FormatTest.  # noqa: E501
        :rtype: int
        """
        return self._int32

    @int32.setter
    def int32(self, int32: "int") -> None:
        """Sets the int32 of this FormatTest.


        :param int32: The int32 of this FormatTest.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                int32 is not None and int32 > 200):  # noqa: E501
            raise ValueError("Invalid value for `int32`, must be a value less than or equal to `200`")  # noqa: E501
        if (self._configuration.client_side_validation and
                int32 is not None and int32 < 20):  # noqa: E501
            raise ValueError("Invalid value for `int32`, must be a value greater than or equal to `20`")  # noqa: E501

        self._int32 = int32

    @property
    def int64(self) -> "int":
        """Gets the int64 of this FormatTest.  # noqa: E501


        :return: The int64 of this FormatTest.  # noqa: E501
        :rtype: int
        """
        return self._int64

    @int64.setter
    def int64(self, int64: "int") -> None:
        """Sets the int64 of this FormatTest.


        :param int64: The int64 of this FormatTest.  # noqa: E501
        :type: int
        """

        self._int64 = int64

    @property
    def number(self) -> "float":
        """Gets the number of this FormatTest.  # noqa: E501


        :return: The number of this FormatTest.  # noqa: E501
        :rtype: float
        """
        return self._number

    @number.setter
    def number(self, number: "float") -> None:
        """Sets the number of this FormatTest.


        :param number: The number of this FormatTest.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and number is None:
            raise ValueError("Invalid value for `number`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                number is not None and number > 543.2):  # noqa: E501
            raise ValueError("Invalid value for `number`, must be a value less than or equal to `543.2`")  # noqa: E501
        if (self._configuration.client_side_validation and
                number is not None and number < 32.1):  # noqa: E501
            raise ValueError("Invalid value for `number`, must be a value greater than or equal to `32.1`")  # noqa: E501

        self._number = number

    @property
    def _float(self) -> "float":
        """Gets the _float of this FormatTest.  # noqa: E501


        :return: The _float of this FormatTest.  # noqa: E501
        :rtype: float
        """
        return self.__float

    @_float.setter
    def _float(self, _float: "float") -> None:
        """Sets the _float of this FormatTest.


        :param _float: The _float of this FormatTest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                _float is not None and _float > 987.6):  # noqa: E501
            raise ValueError("Invalid value for `_float`, must be a value less than or equal to `987.6`")  # noqa: E501
        if (self._configuration.client_side_validation and
                _float is not None and _float < 54.3):  # noqa: E501
            raise ValueError("Invalid value for `_float`, must be a value greater than or equal to `54.3`")  # noqa: E501

        self.__float = _float

    @property
    def double(self) -> "float":
        """Gets the double of this FormatTest.  # noqa: E501


        :return: The double of this FormatTest.  # noqa: E501
        :rtype: float
        """
        return self._double

    @double.setter
    def double(self, double: "float") -> None:
        """Sets the double of this FormatTest.


        :param double: The double of this FormatTest.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                double is not None and double > 123.4):  # noqa: E501
            raise ValueError("Invalid value for `double`, must be a value less than or equal to `123.4`")  # noqa: E501
        if (self._configuration.client_side_validation and
                double is not None and double < 67.8):  # noqa: E501
            raise ValueError("Invalid value for `double`, must be a value greater than or equal to `67.8`")  # noqa: E501

        self._double = double

    @property
    def string(self) -> "str":
        """Gets the string of this FormatTest.  # noqa: E501


        :return: The string of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._string

    @string.setter
    def string(self, string: "str") -> None:
        """Sets the string of this FormatTest.


        :param string: The string of this FormatTest.  # noqa: E501
        :type: str
        """
        if (self._configuration.client_side_validation and
                string is not None and not re.search(r'[a-z]', string, flags=re.IGNORECASE)):  # noqa: E501
            raise ValueError(r"Invalid value for `string`, must be a follow pattern or equal to `/[a-z]/i`")  # noqa: E501

        self._string = string

    @property
    def byte(self) -> "str":
        """Gets the byte of this FormatTest.  # noqa: E501


        :return: The byte of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._byte

    @byte.setter
    def byte(self, byte: "str") -> None:
        """Sets the byte of this FormatTest.


        :param byte: The byte of this FormatTest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and byte is None:
            raise ValueError("Invalid value for `byte`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                byte is not None and not re.search(r'^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$', byte)):  # noqa: E501
            raise ValueError(r"Invalid value for `byte`, must be a follow pattern or equal to `/^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$/`")  # noqa: E501

        self._byte = byte

    @property
    def binary(self) -> "str":
        """Gets the binary of this FormatTest.  # noqa: E501


        :return: The binary of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._binary

    @binary.setter
    def binary(self, binary: "str") -> None:
        """Sets the binary of this FormatTest.


        :param binary: The binary of this FormatTest.  # noqa: E501
        :type: str
        """

        self._binary = binary

    @property
    def _date(self) -> "date":
        """Gets the _date of this FormatTest.  # noqa: E501


        :return: The _date of this FormatTest.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date: "date") -> None:
        """Sets the _date of this FormatTest.


        :param _date: The _date of this FormatTest.  # noqa: E501
        :type: date
        """
        if self._configuration.client_side_validation and _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def date_time(self) -> "datetime.datetime":
        """Gets the date_time of this FormatTest.  # noqa: E501


        :return: The date_time of this FormatTest.  # noqa: E501
        :rtype: datetime.datetime
        """
        return self._date_time

    @date_time.setter
    def date_time(self, date_time: "datetime.datetime") -> None:
        """Sets the date_time of this FormatTest.


        :param date_time: The date_time of this FormatTest.  # noqa: E501
        :type: datetime.datetime
        """

        self._date_time = date_time

    @property
    def uuid(self) -> "str":
        """Gets the uuid of this FormatTest.  # noqa: E501


        :return: The uuid of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid: "str") -> None:
        """Sets the uuid of this FormatTest.


        :param uuid: The uuid of this FormatTest.  # noqa: E501
        :type: str
        """

        self._uuid = uuid

    @property
    def password(self) -> "str":
        """Gets the password of this FormatTest.  # noqa: E501


        :return: The password of this FormatTest.  # noqa: E501
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password: "str") -> None:
        """Sets the password of this FormatTest.


        :param password: The password of this FormatTest.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and password is None:
            raise ValueError("Invalid value for `password`, must not be `None`")  # noqa: E501
        if (self._configuration.client_side_validation and
                password is not None and len(password) > 64):
            raise ValueError("Invalid value for `password`, length must be less than or equal to `64`")  # noqa: E501
        if (self._configuration.client_side_validation and
                password is not None and len(password) < 10):
            raise ValueError("Invalid value for `password`, length must be greater than or equal to `10`")  # noqa: E501

        self._password = password

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
        if issubclass(FormatTest, dict):
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
        if not isinstance(other, FormatTest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other: "typing.Any") -> bool:
        """Returns true if both objects are not equal"""
        if not isinstance(other, FormatTest):
            return True

        return self.to_dict() != other.to_dict()
