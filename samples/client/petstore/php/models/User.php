<?php
/**
 *  Copyright 2015 Reverb Technologies, Inc.
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
 * $model.description$
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */

class User implements ArrayAccess {
  static $swaggerTypes = array(
      'id' => 'int',
      'username' => 'string',
      'firstName' => 'string',
      'lastName' => 'string',
      'email' => 'string',
      'password' => 'string',
      'phone' => 'string',
      'userStatus' => 'int'
  );

  static $attributeMap = array(
      'id' => 'id',
      'username' => 'username',
      'firstName' => 'firstName',
      'lastName' => 'lastName',
      'email' => 'email',
      'password' => 'password',
      'phone' => 'phone',
      'userStatus' => 'userStatus'
  );

  
  public $id; /* int */
  public $username; /* string */
  public $firstName; /* string */
  public $lastName; /* string */
  public $email; /* string */
  public $password; /* string */
  public $phone; /* string */
  /**
  * User Status
  */
  public $userStatus; /* int */

  public function __construct(array $data) {
    $this->id = $data["id"];
    $this->username = $data["username"];
    $this->firstName = $data["firstName"];
    $this->lastName = $data["lastName"];
    $this->email = $data["email"];
    $this->password = $data["password"];
    $this->phone = $data["phone"];
    $this->userStatus = $data["userStatus"];
  }

  public function offsetExists($offset) {
    return isset($this->$offset);
  }

  public function offsetGet($offset) {
    return $this->$offset;
  }

  public function offsetSet($offset, $value) {
    $this->$offset = $value;
  }

  public function offsetUnset($offset) {
    unset($this->$offset);
  }
}
