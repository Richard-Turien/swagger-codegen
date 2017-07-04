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
 */


import ApiClient from '../ApiClient';
import OuterEnum from './OuterEnum';





/**
* The EnumTest model module.
* @module model/EnumTest
* @version 1.0.0
*/
export default class EnumTest{
    /**
    * Constructs a new <code>EnumTest</code>.
    * @alias module:model/EnumTest
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>EnumTest</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/EnumTest} obj Optional instance to populate.
    * @return {module:model/EnumTest} The populated <code>EnumTest</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EnumTest();

            
            
            

            if (data.hasOwnProperty('enum_string')) {
                obj['enum_string'] = ApiClient.convertToType(data['enum_string'], 'String');
            }
            if (data.hasOwnProperty('enum_integer')) {
                obj['enum_integer'] = ApiClient.convertToType(data['enum_integer'], 'Number');
            }
            if (data.hasOwnProperty('enum_number')) {
                obj['enum_number'] = ApiClient.convertToType(data['enum_number'], 'Number');
            }
            if (data.hasOwnProperty('outerEnum')) {
                obj['outerEnum'] = OuterEnum.constructFromObject(data['outerEnum']);
            }
        }
        return obj;
    }

    /**
    * @member {module:model/EnumTest.EnumStringEnum} enum_string
    */
    enum_string = undefined;
    /**
    * @member {module:model/EnumTest.EnumIntegerEnum} enum_integer
    */
    enum_integer = undefined;
    /**
    * @member {module:model/EnumTest.EnumNumberEnum} enum_number
    */
    enum_number = undefined;
    /**
    * @member {module:model/OuterEnum} outerEnum
    */
    outerEnum = undefined;






    /**
    * Allowed values for the <code>enum_string</code> property.
    * @enum {String}
    * @readonly
    */
    static EnumStringEnum = {
    
        /**
         * value: "UPPER"
         * @const
         */
        "UPPER": "UPPER",
    
        /**
         * value: "lower"
         * @const
         */
        "lower": "lower",
    
        /**
         * value: ""
         * @const
         */
        "empty": ""    
    };

    /**
    * Allowed values for the <code>enum_integer</code> property.
    * @enum {Number}
    * @readonly
    */
    static EnumIntegerEnum = {
    
        /**
         * value: 1
         * @const
         */
        "1": 1,
    
        /**
         * value: -1
         * @const
         */
        "-1": -1    
    };

    /**
    * Allowed values for the <code>enum_number</code> property.
    * @enum {Number}
    * @readonly
    */
    static EnumNumberEnum = {
    
        /**
         * value: 1.1
         * @const
         */
        "1.1": 1.1,
    
        /**
         * value: -1.2
         * @const
         */
        "-1.2": -1.2    
    };



}


