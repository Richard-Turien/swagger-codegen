<?php

/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Swagger Petstore
 * @version 1.0.0
 */

$app->get('/', function () use ($app) {
    return $app->version();
});

/**
 * POST testEndpointParameters
 * Summary: Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 * Notes: Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 * Output-Formats: [application/xml; charset=utf-8, application/json; charset=utf-8]
 */
$app->POST('/fake', 'FakeApi@testEndpointParameters');
/**
 * GET testEnumQueryParameters
 * Summary: To test enum query parameters
 * Notes: 
 * Output-Formats: [application/json]
 */
$app->GET('/fake', 'FakeApi@testEnumQueryParameters');
/**
 * POST addPet
 * Summary: Add a new pet to the store
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->POST('/pet', 'PetApi@addPet');
/**
 * PUT updatePet
 * Summary: Update an existing pet
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->PUT('/pet', 'PetApi@updatePet');
/**
 * GET findPetsByStatus
 * Summary: Finds Pets by status
 * Notes: Multiple status values can be provided with comma separated strings
 * Output-Formats: [application/xml, application/json]
 */
$app->GET('/pet/findByStatus', 'PetApi@findPetsByStatus');
/**
 * GET findPetsByTags
 * Summary: Finds Pets by tags
 * Notes: Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
 * Output-Formats: [application/xml, application/json]
 */
$app->GET('/pet/findByTags', 'PetApi@findPetsByTags');
/**
 * DELETE deletePet
 * Summary: Deletes a pet
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->DELETE('/pet/{petId}', 'PetApi@deletePet');
/**
 * GET getPetById
 * Summary: Find pet by ID
 * Notes: Returns a single pet
 * Output-Formats: [application/xml, application/json]
 */
$app->GET('/pet/{petId}', 'PetApi@getPetById');
/**
 * POST updatePetWithForm
 * Summary: Updates a pet in the store with form data
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->POST('/pet/{petId}', 'PetApi@updatePetWithForm');
/**
 * POST uploadFile
 * Summary: uploads an image
 * Notes: 
 * Output-Formats: [application/json]
 */
$app->POST('/pet/{petId}/uploadImage', 'PetApi@uploadFile');
/**
 * GET getInventory
 * Summary: Returns pet inventories by status
 * Notes: Returns a map of status codes to quantities
 * Output-Formats: [application/json]
 */
$app->GET('/store/inventory', 'StoreApi@getInventory');
/**
 * POST placeOrder
 * Summary: Place an order for a pet
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->POST('/store/order', 'StoreApi@placeOrder');
/**
 * DELETE deleteOrder
 * Summary: Delete purchase order by ID
 * Notes: For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
 * Output-Formats: [application/xml, application/json]
 */
$app->DELETE('/store/order/{orderId}', 'StoreApi@deleteOrder');
/**
 * GET getOrderById
 * Summary: Find purchase order by ID
 * Notes: For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
 * Output-Formats: [application/xml, application/json]
 */
$app->GET('/store/order/{orderId}', 'StoreApi@getOrderById');
/**
 * POST createUser
 * Summary: Create user
 * Notes: This can only be done by the logged in user.
 * Output-Formats: [application/xml, application/json]
 */
$app->POST('/user', 'UserApi@createUser');
/**
 * POST createUsersWithArrayInput
 * Summary: Creates list of users with given input array
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->POST('/user/createWithArray', 'UserApi@createUsersWithArrayInput');
/**
 * POST createUsersWithListInput
 * Summary: Creates list of users with given input array
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->POST('/user/createWithList', 'UserApi@createUsersWithListInput');
/**
 * GET loginUser
 * Summary: Logs user into the system
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->GET('/user/login', 'UserApi@loginUser');
/**
 * GET logoutUser
 * Summary: Logs out current logged in user session
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->GET('/user/logout', 'UserApi@logoutUser');
/**
 * DELETE deleteUser
 * Summary: Delete user
 * Notes: This can only be done by the logged in user.
 * Output-Formats: [application/xml, application/json]
 */
$app->DELETE('/user/{username}', 'UserApi@deleteUser');
/**
 * GET getUserByName
 * Summary: Get user by user name
 * Notes: 
 * Output-Formats: [application/xml, application/json]
 */
$app->GET('/user/{username}', 'UserApi@getUserByName');
/**
 * PUT updateUser
 * Summary: Updated user
 * Notes: This can only be done by the logged in user.
 * Output-Formats: [application/xml, application/json]
 */
$app->PUT('/user/{username}', 'UserApi@updateUser');

