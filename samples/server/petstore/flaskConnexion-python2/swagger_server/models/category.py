# coding: utf-8

from __future__ import absolute_import
from .base_model_ import Model
from datetime import date, datetime
from typing import List, Dict
from ..util import deserialize_model


class Category(Model):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """


    def __init__(self, id=None, name=None):
        """
        Category - a model defined in Swagger

        :param id: The id of this Category.
        :type id: long
        :param name: The name of this Category.
        :type name: str
        """
        self.swagger_types = {
            'id': long,
            'name': str
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name'
        }

        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt):
        """
        Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Category of this Category.
        :rtype: Category
        """
        return deserialize_model(dikt, cls)

    @property
    def id(self):
        """
        Gets the id of this Category.

        :return: The id of this Category.
        :rtype: long
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this Category.

        :param id: The id of this Category.
        :type id: long
        """

        self._id = id

    @property
    def name(self):
        """
        Gets the name of this Category.

        :return: The name of this Category.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Category.

        :param name: The name of this Category.
        :type name: str
        """

        self._name = name

