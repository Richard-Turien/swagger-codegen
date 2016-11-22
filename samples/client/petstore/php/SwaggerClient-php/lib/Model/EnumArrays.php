<?php
/**
 * EnumArrays
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * EnumArrays Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class EnumArrays implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'EnumArrays';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'just_symbol' => 'string',
        'array_enum' => 'string[]'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'just_symbol' => 'just_symbol',
        'array_enum' => 'array_enum'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'just_symbol' => 'setJustSymbol',
        'array_enum' => 'setArrayEnum'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'just_symbol' => 'getJustSymbol',
        'array_enum' => 'getArrayEnum'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    const JUST_SYMBOL_ = '>=';
    const JUST_SYMBOL_ = '$';
    const ARRAY_ENUM_FISH = 'fish';
    const ARRAY_ENUM_CRAB = 'crab';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getJustSymbolAllowableValues()
    {
        return [
            self::JUST_SYMBOL_,
            self::JUST_SYMBOL_,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getArrayEnumAllowableValues()
    {
        return [
            self::ARRAY_ENUM_FISH,
            self::ARRAY_ENUM_CRAB,
        ];
    }
    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['just_symbol'] = isset($data['just_symbol']) ? $data['just_symbol'] : null;
        $this->container['array_enum'] = isset($data['array_enum']) ? $data['array_enum'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        $allowed_values = [">=", "$"];
        if (!in_array($this->container['just_symbol'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'just_symbol', must be one of #{allowed_values}.";
        }

        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        $allowed_values = [">=", "$"];
        if (!in_array($this->container['just_symbol'], $allowed_values)) {
            return false;
        }
        return true;
    }


    /**
     * Gets just_symbol
     * @return string
     */
    public function getJustSymbol()
    {
        return $this->container['just_symbol'];
    }

    /**
     * Sets just_symbol
     * @param string $just_symbol
     * @return $this
     */
    public function setJustSymbol($just_symbol)
    {
        $allowed_values = array('>=', '$');
        if (!is_null($just_symbol) && (!in_array($just_symbol, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'just_symbol', must be one of '>=', '$'");
        }
        $this->container['just_symbol'] = $just_symbol;

        return $this;
    }

    /**
     * Gets array_enum
     * @return string[]
     */
    public function getArrayEnum()
    {
        return $this->container['array_enum'];
    }

    /**
     * Sets array_enum
     * @param string[] $array_enum
     * @return $this
     */
    public function setArrayEnum($array_enum)
    {
        $allowed_values = array('fish', 'crab');
        if (!is_null($array_enum) && (array_diff($array_enum, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'array_enum', must be one of 'fish', 'crab'");
        }
        $this->container['array_enum'] = $array_enum;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}

