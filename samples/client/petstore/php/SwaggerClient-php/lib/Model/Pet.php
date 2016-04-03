<?php
/**
 * Pet
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
 * Pet Class Doc Comment
 *
 * @category    Class
 * @description 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Pet implements ArrayAccess
{
    /**
     * Array of property to type mappings. Used for (de)serialization 
     * @var string[]
     */
    static $swaggerTypes = array(
        'id' => 'int',
        'category' => '\Swagger\Client\Model\Category',
        'name' => 'string',
        'photo_urls' => 'string[]',
        'tags' => '\Swagger\Client\Model\Tag[]',
        'status' => 'string'
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
        'category' => 'category',
        'name' => 'name',
        'photo_urls' => 'photoUrls',
        'tags' => 'tags',
        'status' => 'status'
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
        'category' => 'setCategory',
        'name' => 'setName',
        'photo_urls' => 'setPhotoUrls',
        'tags' => 'setTags',
        'status' => 'setStatus'
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
        'category' => 'getCategory',
        'name' => 'getName',
        'photo_urls' => 'getPhotoUrls',
        'tags' => 'getTags',
        'status' => 'getStatus'
    );
 
    static function getters() {
        return self::$getters;
    }

    const Status_AVAILABLE = "available";
    const Status_PENDING = "pending";
    const Status_SOLD = "sold";
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getStatusAllowableValues() {
        return [
            self::Status_AVAILABLE,
            self::Status_PENDING,
            self::Status_SOLD,
        ];
    }
    

    
    /**
     * $id 
     * @var int
     */
    protected $id;
    
    /**
     * $category 
     * @var \Swagger\Client\Model\Category
     */
    protected $category;
    
    /**
     * $name 
     * @var string
     */
    protected $name;
    
    /**
     * $photo_urls 
     * @var string[]
     */
    protected $photo_urls;
    
    /**
     * $tags 
     * @var \Swagger\Client\Model\Tag[]
     */
    protected $tags;
    
    /**
     * $status pet status in the store
     * @var string
     */
    protected $status;
    

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        
        if ($data != null) {
            $this->id = $data["id"];
            $this->category = $data["category"];
            $this->name = $data["name"];
            $this->photo_urls = $data["photo_urls"];
            $this->tags = $data["tags"];
            $this->status = $data["status"];
        }
    }
    
    /**
     * Gets id.
     * @return int
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Sets id.
     * @param int $id 
     * @return $this
     */
    public function setId($id)
    {
        
        $this->id = $id;
        return $this;
    }
    
    /**
     * Gets category.
     * @return \Swagger\Client\Model\Category
     */
    public function getCategory()
    {
        return $this->category;
    }

    /**
     * Sets category.
     * @param \Swagger\Client\Model\Category $category 
     * @return $this
     */
    public function setCategory($category)
    {
        
        $this->category = $category;
        return $this;
    }
    
    /**
     * Gets name.
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Sets name.
     * @param string $name 
     * @return $this
     */
    public function setName($name)
    {
        
        $this->name = $name;
        return $this;
    }
    
    /**
     * Gets photo_urls.
     * @return string[]
     */
    public function getPhotoUrls()
    {
        return $this->photo_urls;
    }

    /**
     * Sets photo_urls.
     * @param string[] $photo_urls 
     * @return $this
     */
    public function setPhotoUrls($photo_urls)
    {
        
        $this->photo_urls = $photo_urls;
        return $this;
    }
    
    /**
     * Gets tags.
     * @return \Swagger\Client\Model\Tag[]
     */
    public function getTags()
    {
        return $this->tags;
    }

    /**
     * Sets tags.
     * @param \Swagger\Client\Model\Tag[] $tags 
     * @return $this
     */
    public function setTags($tags)
    {
        
        $this->tags = $tags;
        return $this;
    }
    
    /**
     * Gets status.
     * @return string
     */
    public function getStatus()
    {
        return $this->status;
    }

    /**
     * Sets status.
     * @param string $status pet status in the store
     * @return $this
     */
    public function setStatus($status)
    {
        $allowed_values = array("available", "pending", "sold");
        if (!in_array($status, $allowed_values)) {
            throw new \InvalidArgumentException("Invalid value for 'status', must be one of 'available', 'pending', 'sold'");
        }
        $this->status = $status;
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
     * Gets the string presentation of the object.
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) {
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        } else {
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
        }
    }
}

?>
