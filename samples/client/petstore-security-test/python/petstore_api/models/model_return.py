# coding: utf-8

"""
    Swagger Petstore */ ' \" =end -- \\r\\n \\n \\r

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  */ ' \" =end --       

    OpenAPI spec version: 1.0.0 */ ' \" =end -- \\r\\n \\n \\r
    Contact: apiteam@swagger.io */ ' \" =end -- \\r\\n \\n \\r
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class ModelReturn(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, _return=None):
        """
        ModelReturn - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            '_return': 'int'
        }

        self.attribute_map = {
            '_return': 'return'
        }

        self.__return = None

        # TODO: let required properties as mandatory parameter in the constructor.
        #       - to check if required property is not None (e.g. by calling setter)
        #       - ApiClient.__deserialize_model has to be adapted as well
        if _return is not None:
          self._return = _return

    @property
    def _return(self):
        """
        Gets the _return of this ModelReturn.
        property description  */ ' \" =end -- \\r\\n \\n \\r

        :return: The _return of this ModelReturn.
        :rtype: int
        """
        return self.__return

    @_return.setter
    def _return(self, _return):
        """
        Sets the _return of this ModelReturn.
        property description  */ ' \" =end -- \\r\\n \\n \\r

        :param _return: The _return of this ModelReturn.
        :type: int
        """

        self.__return = _return

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
        if not isinstance(other, ModelReturn):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
