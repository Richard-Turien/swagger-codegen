<?php
/**
 * User
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
/**
 * User Class Doc Comment
 *
 * @category    Class
 * @description 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class User implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    static $swaggerModelName = 'User';

    /**
      * Array of property to type mappings. Used for (de)serialization 
      * @var string[]
      */
    static $swaggerTypes = array(
        'id' => 'int',
        'username' => 'string',
        'first_name' => 'string',
        'last_name' => 'string',
        'email' => 'string',
        'password' => 'string',
        'phone' => 'string',
        'user_status' => 'int'
    );
  
    static function swaggerTypes() {
        return self::$swaggerTypes;
    }

    /** 
      * Array of attributes where the key is the local name, and the value is the original name
      * @var string[] 
      */
    static $attributeMap = array(
        'id' => 'id',
        'username' => 'username',
        'first_name' => 'firstName',
        'last_name' => 'lastName',
        'email' => 'email',
        'password' => 'password',
        'phone' => 'phone',
        'user_status' => 'userStatus'
    );
  
    static function attributeMap() {
        return self::$attributeMap;
    }

    /**
      * Array of attributes to setter functions (for deserialization of responses)
      * @var string[]
      */
    static $setters = array(
        'id' => 'setId',
        'username' => 'setUsername',
        'first_name' => 'setFirstName',
        'last_name' => 'setLastName',
        'email' => 'setEmail',
        'password' => 'setPassword',
        'phone' => 'setPhone',
        'user_status' => 'setUserStatus'
    );
  
    static function setters() {
        return self::$setters;
    }

    /**
      * Array of attributes to getter functions (for serialization of requests)
      * @var string[]
      */
    static $getters = array(
        'id' => 'getId',
        'username' => 'getUsername',
        'first_name' => 'getFirstName',
        'last_name' => 'getLastName',
        'email' => 'getEmail',
        'password' => 'getPassword',
        'phone' => 'getPhone',
        'user_status' => 'getUserStatus'
    );
  
    static function getters() {
        return self::$getters;
    }

    /**
      * $id 
      * @var int
      */
    protected $id;
    /**
      * $username 
      * @var string
      */
    protected $username;
    /**
      * $first_name 
      * @var string
      */
    protected $first_name;
    /**
      * $last_name 
      * @var string
      */
    protected $last_name;
    /**
      * $email 
      * @var string
      */
    protected $email;
    /**
      * $password 
      * @var string
      */
    protected $password;
    /**
      * $phone 
      * @var string
      */
    protected $phone;
    /**
      * $user_status User Status
      * @var int
      */
    protected $user_status;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        
        
        if ($data != null) {
            if (isset($data["id"])) {
                $this->id = $data["id"];
            }
            if (isset($data["username"])) {
                $this->username = $data["username"];
            }
            if (isset($data["first_name"])) {
                $this->first_name = $data["first_name"];
            }
            if (isset($data["last_name"])) {
                $this->last_name = $data["last_name"];
            }
            if (isset($data["email"])) {
                $this->email = $data["email"];
            }
            if (isset($data["password"])) {
                $this->password = $data["password"];
            }
            if (isset($data["phone"])) {
                $this->phone = $data["phone"];
            }
            if (isset($data["user_status"])) {
                $this->user_status = $data["user_status"];
            }
        }
    }

    /**
     * show all the invalid properties with reasons.
     * 
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        
        

        

        

        

        

        

        

        

        return $invalid_properties;
    }

    /**
     * validate all the parameters in the model
     * return true if all passed
     * 
     * @return bool [description]
     */
    public function valid()
    {
        
        

        

        

        

        

        

        

        

        return true;
    }


    /**
     * Gets id
     * @return int
     */
    public function getId()
    {
        return $this->id;
    }
  
    /**
     * Sets id
     * @param int $id 
     * @return $this
     */
    public function setId($id)
    {
        

        $this->id = $id;
        return $this;
    }
    /**
     * Gets username
     * @return string
     */
    public function getUsername()
    {
        return $this->username;
    }
  
    /**
     * Sets username
     * @param string $username 
     * @return $this
     */
    public function setUsername($username)
    {
        

        $this->username = $username;
        return $this;
    }
    /**
     * Gets first_name
     * @return string
     */
    public function getFirstName()
    {
        return $this->first_name;
    }
  
    /**
     * Sets first_name
     * @param string $first_name 
     * @return $this
     */
    public function setFirstName($first_name)
    {
        

        $this->first_name = $first_name;
        return $this;
    }
    /**
     * Gets last_name
     * @return string
     */
    public function getLastName()
    {
        return $this->last_name;
    }
  
    /**
     * Sets last_name
     * @param string $last_name 
     * @return $this
     */
    public function setLastName($last_name)
    {
        

        $this->last_name = $last_name;
        return $this;
    }
    /**
     * Gets email
     * @return string
     */
    public function getEmail()
    {
        return $this->email;
    }
  
    /**
     * Sets email
     * @param string $email 
     * @return $this
     */
    public function setEmail($email)
    {
        

        $this->email = $email;
        return $this;
    }
    /**
     * Gets password
     * @return string
     */
    public function getPassword()
    {
        return $this->password;
    }
  
    /**
     * Sets password
     * @param string $password 
     * @return $this
     */
    public function setPassword($password)
    {
        

        $this->password = $password;
        return $this;
    }
    /**
     * Gets phone
     * @return string
     */
    public function getPhone()
    {
        return $this->phone;
    }
  
    /**
     * Sets phone
     * @param string $phone 
     * @return $this
     */
    public function setPhone($phone)
    {
        

        $this->phone = $phone;
        return $this;
    }
    /**
     * Gets user_status
     * @return int
     */
    public function getUserStatus()
    {
        return $this->user_status;
    }
  
    /**
     * Sets user_status
     * @param int $user_status User Status
     * @return $this
     */
    public function setUserStatus($user_status)
    {
        

        $this->user_status = $user_status;
        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset 
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->$offset);
    }
  
    /**
     * Gets offset.
     * @param  integer $offset Offset 
     * @return mixed 
     */
    public function offsetGet($offset)
    {
        return $this->$offset;
    }
  
    /**
     * Sets value based on offset.
     * @param  integer $offset Offset 
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        $this->$offset = $value;
    }
  
    /**
     * Unsets offset.
     * @param  integer $offset Offset 
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->$offset);
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
