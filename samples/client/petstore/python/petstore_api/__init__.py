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

from __future__ import absolute_import

# import models into sdk package
from .models.additional_properties_class import AdditionalPropertiesClass
from .models.animal import Animal
from .models.animal_farm import AnimalFarm
from .models.api_response import ApiResponse
from .models.array_of_array_of_number_only import ArrayOfArrayOfNumberOnly
from .models.array_of_number_only import ArrayOfNumberOnly
from .models.array_test import ArrayTest
from .models.cat import Cat
from .models.category import Category
from .models.dog import Dog
from .models.enum_class import EnumClass
from .models.enum_test import EnumTest
from .models.format_test import FormatTest
from .models.has_only_read_only import HasOnlyReadOnly
from .models.map_test import MapTest
from .models.mixed_properties_and_additional_properties_class import MixedPropertiesAndAdditionalPropertiesClass
from .models.model_200_response import Model200Response
from .models.model_return import ModelReturn
from .models.name import Name
from .models.number_only import NumberOnly
from .models.order import Order
from .models.pet import Pet
from .models.read_only_first import ReadOnlyFirst
from .models.special_model_name import SpecialModelName
from .models.tag import Tag
from .models.user import User

# import apis into sdk package
from .apis.fake_api import FakeApi
from .apis.pet_api import PetApi
from .apis.store_api import StoreApi
from .apis.user_api import UserApi

# import ApiClient
from .api_client import ApiClient

from .configuration import Configuration

configuration = Configuration()
