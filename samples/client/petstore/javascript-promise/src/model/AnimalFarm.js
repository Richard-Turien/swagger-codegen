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
 * Swagger Codegen version: 2.4.18-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Animal'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Animal'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerPetstore) {
      root.SwaggerPetstore = {};
    }
    root.SwaggerPetstore.AnimalFarm = factory(root.SwaggerPetstore.ApiClient, root.SwaggerPetstore.Animal);
  }
}(this, function(ApiClient, Animal) {
  'use strict';

  /**
   * The AnimalFarm model module.
   * @module model/AnimalFarm
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>AnimalFarm</code>.
   * @alias module:model/AnimalFarm
   * @class
   * @extends Array
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>AnimalFarm</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AnimalFarm} obj Optional instance to populate.
   * @return {module:model/AnimalFarm} The populated <code>AnimalFarm</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      ApiClient.constructFromObject(data, obj, 'Animal');
    }
    return obj;
  }

  Object.setPrototypeOf(exports.prototype, new Array());
  return exports;

}));
