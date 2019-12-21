/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.11-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/ApiResponse', 'model/Pet'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/ApiResponse'), require('../model/Pet'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerPetstore) {
      root.SwaggerPetstore = {};
    }
    root.SwaggerPetstore.PetApi = factory(root.SwaggerPetstore.ApiClient, root.SwaggerPetstore.ApiResponse, root.SwaggerPetstore.Pet);
  }
}(this, function(ApiClient, ApiResponse, Pet) {
  'use strict';

  /**
   * Pet service.
   * @module api/PetApi
   * @version 1.0.0
   */

  /**
   * Constructs a new PetApi. 
   * @alias module:api/PetApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the addPet operation.
     * @callback module:api/PetApi~addPetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add a new pet to the store
     * 
     * @param {module:model/Pet} body Pet object that needs to be added to the store
     * @param {module:api/PetApi~addPetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.addPet = function(body, callback) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling addPet");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['petstore_auth'];
      var contentTypes = ['application/json', 'application/xml'];
      var accepts = ['application/xml', 'application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/pet', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the deletePet operation.
     * @callback module:api/PetApi~deletePetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a pet
     * 
     * @param {Number} petId Pet id to delete
     * @param {Object} opts Optional parameters
     * @param {String} opts.apiKey 
     * @param {module:api/PetApi~deletePetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.deletePet = function(petId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'petId' is set
      if (petId === undefined || petId === null) {
        throw new Error("Missing the required parameter 'petId' when calling deletePet");
      }


      var pathParams = {
        'petId': petId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
        'api_key': opts['apiKey']
      };
      var formParams = {
      };

      var authNames = ['petstore_auth'];
      var contentTypes = [];
      var accepts = ['application/xml', 'application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/pet/{petId}', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the findPetsByStatus operation.
     * @callback module:api/PetApi~findPetsByStatusCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Pet>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param {Array.<module:model/String>} status Status values that need to be considered for filter
     * @param {module:api/PetApi~findPetsByStatusCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Pet>}
     */
    this.findPetsByStatus = function(status, callback) {
      var postBody = null;

      // verify the required parameter 'status' is set
      if (status === undefined || status === null) {
        throw new Error("Missing the required parameter 'status' when calling findPetsByStatus");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
        'status': {
          value: status,
          collectionFormat: 'csv'
        },
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['petstore_auth'];
      var contentTypes = [];
      var accepts = ['application/xml', 'application/json'];
      var returnType = [Pet];

      return this.apiClient.callApi(
        '/pet/findByStatus', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the findPetsByTags operation.
     * @callback module:api/PetApi~findPetsByTagsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Pet>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param {Array.<String>} tags Tags to filter by
     * @param {module:api/PetApi~findPetsByTagsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Pet>}
     */
    this.findPetsByTags = function(tags, callback) {
      var postBody = null;

      // verify the required parameter 'tags' is set
      if (tags === undefined || tags === null) {
        throw new Error("Missing the required parameter 'tags' when calling findPetsByTags");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
        'tags': {
          value: tags,
          collectionFormat: 'csv'
        },
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['petstore_auth'];
      var contentTypes = [];
      var accepts = ['application/xml', 'application/json'];
      var returnType = [Pet];

      return this.apiClient.callApi(
        '/pet/findByTags', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getPetById operation.
     * @callback module:api/PetApi~getPetByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Pet} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Find pet by ID
     * Returns a single pet
     * @param {Number} petId ID of pet to return
     * @param {module:api/PetApi~getPetByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Pet}
     */
    this.getPetById = function(petId, callback) {
      var postBody = null;

      // verify the required parameter 'petId' is set
      if (petId === undefined || petId === null) {
        throw new Error("Missing the required parameter 'petId' when calling getPetById");
      }


      var pathParams = {
        'petId': petId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['api_key'];
      var contentTypes = [];
      var accepts = ['application/xml', 'application/json'];
      var returnType = Pet;

      return this.apiClient.callApi(
        '/pet/{petId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updatePet operation.
     * @callback module:api/PetApi~updatePetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update an existing pet
     * 
     * @param {module:model/Pet} body Pet object that needs to be added to the store
     * @param {module:api/PetApi~updatePetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updatePet = function(body, callback) {
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling updatePet");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['petstore_auth'];
      var contentTypes = ['application/json', 'application/xml'];
      var accepts = ['application/xml', 'application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/pet', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the updatePetWithForm operation.
     * @callback module:api/PetApi~updatePetWithFormCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a pet in the store with form data
     * 
     * @param {Number} petId ID of pet that needs to be updated
     * @param {Object} opts Optional parameters
     * @param {String} opts.name Updated name of the pet
     * @param {String} opts.status Updated status of the pet
     * @param {module:api/PetApi~updatePetWithFormCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.updatePetWithForm = function(petId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'petId' is set
      if (petId === undefined || petId === null) {
        throw new Error("Missing the required parameter 'petId' when calling updatePetWithForm");
      }


      var pathParams = {
        'petId': petId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'name': opts['name'],
        'status': opts['status']
      };

      var authNames = ['petstore_auth'];
      var contentTypes = ['application/x-www-form-urlencoded'];
      var accepts = ['application/xml', 'application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/pet/{petId}', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the uploadFile operation.
     * @callback module:api/PetApi~uploadFileCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ApiResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * uploads an image
     * 
     * @param {Number} petId ID of pet to update
     * @param {Object} opts Optional parameters
     * @param {String} opts.additionalMetadata Additional data to pass to server
     * @param {File} opts.file file to upload
     * @param {module:api/PetApi~uploadFileCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ApiResponse}
     */
    this.uploadFile = function(petId, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'petId' is set
      if (petId === undefined || petId === null) {
        throw new Error("Missing the required parameter 'petId' when calling uploadFile");
      }


      var pathParams = {
        'petId': petId
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'additionalMetadata': opts['additionalMetadata'],
        'file': opts['file']
      };

      var authNames = ['petstore_auth'];
      var contentTypes = ['multipart/form-data'];
      var accepts = ['application/json'];
      var returnType = ApiResponse;

      return this.apiClient.callApi(
        '/pet/{petId}/uploadImage', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
