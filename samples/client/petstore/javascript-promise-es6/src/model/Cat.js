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

import {ApiClient} from '../ApiClient';
import {Animal} from './Animal';

/**
 * The Cat model module.
 * @module model/Cat
 * @version 1.0.0
 */
export class Cat extends Animal {
  /**
   * Constructs a new <code>Cat</code>.
   * @alias module:model/Cat
   * @class
   * @extends module:model/Animal
   * @param className {String} 
   */
  constructor(className) {
    super(className);
  }

  /**
   * Constructs a <code>Cat</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Cat} obj Optional instance to populate.
   * @return {module:model/Cat} The populated <code>Cat</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Cat();
      Animal.constructFromObject(data, obj);
      if (data.hasOwnProperty('declawed'))
        obj.declawed = ApiClient.convertToType(data['declawed'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Boolean} declawed
 */
Cat.prototype.declawed = undefined;


