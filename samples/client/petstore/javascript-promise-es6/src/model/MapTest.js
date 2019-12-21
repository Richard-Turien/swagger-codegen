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

import {ApiClient} from '../ApiClient';

/**
 * The MapTest model module.
 * @module model/MapTest
 * @version 1.0.0
 */
export class MapTest {
  /**
   * Constructs a new <code>MapTest</code>.
   * @alias module:model/MapTest
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>MapTest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MapTest} obj Optional instance to populate.
   * @return {module:model/MapTest} The populated <code>MapTest</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MapTest();
      if (data.hasOwnProperty('map_map_of_string'))
        obj.mapMapOfString = ApiClient.convertToType(data['map_map_of_string'], {'String': {'String': 'String'}});
      if (data.hasOwnProperty('map_of_enum_string'))
        obj.mapOfEnumString = ApiClient.convertToType(data['map_of_enum_string'], {'String': 'String'});
    }
    return obj;
  }
}

/**
 * @member {Object.<String, Object.<String, String>>} mapMapOfString
 */
MapTest.prototype.mapMapOfString = undefined;

/**
 * Allowed values for the <code>inner</code> property.
 * @enum {String}
 * @readonly
 */
MapTest.InnerEnum = {
  /**
   * value: "UPPER"
   * @const
   */
  UPPER: "UPPER",

  /**
   * value: "lower"
   * @const
   */
  lower: "lower"
};

/**
 * @member {Object.<String, module:model/MapTest.InnerEnum>} mapOfEnumString
 */
MapTest.prototype.mapOfEnumString = undefined;


