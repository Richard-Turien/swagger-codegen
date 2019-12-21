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

import {ApiClient} from "../ApiClient";
import {Client} from '../model/Client';
import {OuterBoolean} from '../model/OuterBoolean';
import {OuterComposite} from '../model/OuterComposite';
import {OuterNumber} from '../model/OuterNumber';
import {OuterString} from '../model/OuterString';
import {User} from '../model/User';

/**
* Fake service.
* @module api/FakeApi
* @version 1.0.0
*/
export class FakeApi {

    /**
    * Constructs a new FakeApi. 
    * @alias module:api/FakeApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the fakeOuterBooleanSerialize operation.
     * @callback module:api/FakeApi~fakeOuterBooleanSerializeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OuterBoolean} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Test serialization of outer boolean types
     * @param {Object} opts Optional parameters
     * @param {module:model/OuterBoolean} opts.body Input boolean as post body
     * @param {module:api/FakeApi~fakeOuterBooleanSerializeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/OuterBoolean}
     */
    fakeOuterBooleanSerialize(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];


      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = OuterBoolean;

      return this.apiClient.callApi(
        '/fake/outer/boolean', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the fakeOuterCompositeSerialize operation.
     * @callback module:api/FakeApi~fakeOuterCompositeSerializeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OuterComposite} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Test serialization of object with outer number type
     * @param {Object} opts Optional parameters
     * @param {module:model/OuterComposite} opts.body Input composite as post body
     * @param {module:api/FakeApi~fakeOuterCompositeSerializeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/OuterComposite}
     */
    fakeOuterCompositeSerialize(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];


      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = OuterComposite;

      return this.apiClient.callApi(
        '/fake/outer/composite', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the fakeOuterNumberSerialize operation.
     * @callback module:api/FakeApi~fakeOuterNumberSerializeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OuterNumber} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Test serialization of outer number types
     * @param {Object} opts Optional parameters
     * @param {module:model/OuterNumber} opts.body Input number as post body
     * @param {module:api/FakeApi~fakeOuterNumberSerializeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/OuterNumber}
     */
    fakeOuterNumberSerialize(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];


      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = OuterNumber;

      return this.apiClient.callApi(
        '/fake/outer/number', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the fakeOuterStringSerialize operation.
     * @callback module:api/FakeApi~fakeOuterStringSerializeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OuterString} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Test serialization of outer string types
     * @param {Object} opts Optional parameters
     * @param {module:model/OuterString} opts.body Input string as post body
     * @param {module:api/FakeApi~fakeOuterStringSerializeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/OuterString}
     */
    fakeOuterStringSerialize(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];


      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = OuterString;

      return this.apiClient.callApi(
        '/fake/outer/string', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the testBodyWithQueryParams operation.
     * @callback module:api/FakeApi~testBodyWithQueryParamsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/User} body 
     * @param {String} query 
     * @param {module:api/FakeApi~testBodyWithQueryParamsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    testBodyWithQueryParams(body, query, callback) {
      let postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling testBodyWithQueryParams");
      }

      // verify the required parameter 'query' is set
      if (query === undefined || query === null) {
        throw new Error("Missing the required parameter 'query' when calling testBodyWithQueryParams");
      }


      let pathParams = {
      };
      let queryParams = {
        'query': query
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/fake/body-with-query-params', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the testClientModel operation.
     * @callback module:api/FakeApi~testClientModelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Client} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * To test \"client\" model
     * To test \"client\" model
     * @param {module:model/Client} body client model
     * @param {module:api/FakeApi~testClientModelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Client}
     */
    testClientModel(body, callback) {
      let postBody = body;

      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling testClientModel");
      }


      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Client;

      return this.apiClient.callApi(
        '/fake', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the testEndpointParameters operation.
     * @callback module:api/FakeApi~testEndpointParametersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * @param {Number} _number None
     * @param {Number} _double None
     * @param {String} patternWithoutDelimiter None
     * @param {Blob} _byte None
     * @param {Object} opts Optional parameters
     * @param {Number} opts.integer None
     * @param {Number} opts.int32 None
     * @param {Number} opts.int64 None
     * @param {Number} opts._float None
     * @param {String} opts._string None
     * @param {Blob} opts.binary None
     * @param {Date} opts._date None
     * @param {Date} opts.dateTime None
     * @param {String} opts.password None
     * @param {String} opts.callback None
     * @param {module:api/FakeApi~testEndpointParametersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    testEndpointParameters(_number, _double, patternWithoutDelimiter, _byte, opts, callback) {
      opts = opts || {};
      let postBody = null;

      // verify the required parameter '_number' is set
      if (_number === undefined || _number === null) {
        throw new Error("Missing the required parameter '_number' when calling testEndpointParameters");
      }

      // verify the required parameter '_double' is set
      if (_double === undefined || _double === null) {
        throw new Error("Missing the required parameter '_double' when calling testEndpointParameters");
      }

      // verify the required parameter 'patternWithoutDelimiter' is set
      if (patternWithoutDelimiter === undefined || patternWithoutDelimiter === null) {
        throw new Error("Missing the required parameter 'patternWithoutDelimiter' when calling testEndpointParameters");
      }

      // verify the required parameter '_byte' is set
      if (_byte === undefined || _byte === null) {
        throw new Error("Missing the required parameter '_byte' when calling testEndpointParameters");
      }


      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
        'integer': opts['integer'],
        'int32': opts['int32'],
        'int64': opts['int64'],
        'number': _number,
        'float': opts['_float'],
        'double': _double,
        'string': opts['_string'],
        'pattern_without_delimiter': patternWithoutDelimiter,
        'byte': _byte,
        'binary': opts['binary'],
        'date': opts['_date'],
        'dateTime': opts['dateTime'],
        'password': opts['password'],
        'callback': opts['callback']
      };

      let authNames = ['http_basic_test'];
      let contentTypes = ['application/xml; charset=utf-8', 'application/json; charset=utf-8'];
      let accepts = ['application/xml; charset=utf-8', 'application/json; charset=utf-8'];
      let returnType = null;

      return this.apiClient.callApi(
        '/fake', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the testEnumParameters operation.
     * @callback module:api/FakeApi~testEnumParametersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * To test enum parameters
     * To test enum parameters
     * @param {Object} opts Optional parameters
     * @param {Array.<module:model/String>} opts.enumFormStringArray Form parameter enum test (string array)
     * @param {module:model/String} opts.enumFormString Form parameter enum test (string) (default to -efg)
     * @param {Array.<module:model/String>} opts.enumHeaderStringArray Header parameter enum test (string array)
     * @param {module:model/String} opts.enumHeaderString Header parameter enum test (string) (default to -efg)
     * @param {Array.<module:model/String>} opts.enumQueryStringArray Query parameter enum test (string array)
     * @param {module:model/String} opts.enumQueryString Query parameter enum test (string) (default to -efg)
     * @param {module:model/Number} opts.enumQueryInteger Query parameter enum test (double)
     * @param {module:model/Number} opts.enumQueryDouble Query parameter enum test (double)
     * @param {module:api/FakeApi~testEnumParametersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    testEnumParameters(opts, callback) {
      opts = opts || {};
      let postBody = null;


      let pathParams = {
      };
      let queryParams = {
        'enum_query_string_array': this.apiClient.buildCollectionParam(opts['enumQueryStringArray'], 'csv'),
        'enum_query_string': opts['enumQueryString'],
        'enum_query_integer': opts['enumQueryInteger']
      };
      let headerParams = {
        'enum_header_string_array': opts['enumHeaderStringArray'],
        'enum_header_string': opts['enumHeaderString']
      };
      let formParams = {
        'enum_form_string_array': this.apiClient.buildCollectionParam(opts['enumFormStringArray'], 'csv'),
        'enum_form_string': opts['enumFormString'],
        'enum_query_double': opts['enumQueryDouble']
      };

      let authNames = [];
      let contentTypes = ['*/*'];
      let accepts = ['*/*'];
      let returnType = null;

      return this.apiClient.callApi(
        '/fake', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the testInlineAdditionalProperties operation.
     * @callback module:api/FakeApi~testInlineAdditionalPropertiesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * test inline additionalProperties
     * 
     * @param {Object} param request body
     * @param {module:api/FakeApi~testInlineAdditionalPropertiesCallback} callback The callback function, accepting three arguments: error, data, response
     */
    testInlineAdditionalProperties(param, callback) {
      let postBody = param;

      // verify the required parameter 'param' is set
      if (param === undefined || param === null) {
        throw new Error("Missing the required parameter 'param' when calling testInlineAdditionalProperties");
      }


      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/fake/inline-additionalProperties', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the testJsonFormData operation.
     * @callback module:api/FakeApi~testJsonFormDataCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * test json serialization of form data
     * 
     * @param {String} param field1
     * @param {String} param2 field2
     * @param {module:api/FakeApi~testJsonFormDataCallback} callback The callback function, accepting three arguments: error, data, response
     */
    testJsonFormData(param, param2, callback) {
      let postBody = null;

      // verify the required parameter 'param' is set
      if (param === undefined || param === null) {
        throw new Error("Missing the required parameter 'param' when calling testJsonFormData");
      }

      // verify the required parameter 'param2' is set
      if (param2 === undefined || param2 === null) {
        throw new Error("Missing the required parameter 'param2' when calling testJsonFormData");
      }


      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
        'param': param,
        'param2': param2
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/fake/jsonFormData', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }


}
