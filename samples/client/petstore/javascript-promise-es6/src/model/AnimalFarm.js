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
import {Animal} from './Animal';

/**
 * The AnimalFarm model module.
 * @module model/AnimalFarm
 * @version 1.0.0
 */
export class AnimalFarm extends Array {
  /**
   * Constructs a new <code>AnimalFarm</code>.
   * @alias module:model/AnimalFarm
   * @class
   * @extends Array
   */
  constructor() {
    super();
  }

  /**
   * Constructs a <code>AnimalFarm</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AnimalFarm} obj Optional instance to populate.
   * @return {module:model/AnimalFarm} The populated <code>AnimalFarm</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AnimalFarm();
      ApiClient.constructFromObject(data, obj, 'Animal');
    }
    return obj;
  }
}

