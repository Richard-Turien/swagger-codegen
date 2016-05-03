<?php
/**
 * FakeApi
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

namespace Swagger\Client\Api;

use \Swagger\Client\Configuration;
use \Swagger\Client\ApiClient;
use \Swagger\Client\ApiException;
use \Swagger\Client\ObjectSerializer;

/**
 * FakeApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class FakeApi
{

    /**
     * API Client
     * @var \Swagger\Client\ApiClient instance of the ApiClient
     */
    protected $apiClient;
  
    /**
     * Constructor
     * @param \Swagger\Client\ApiClient|null $apiClient The api client to use
     */
    function __construct($apiClient = null)
    {
        if ($apiClient == null) {
            $apiClient = new ApiClient();
            $apiClient->getConfig()->setHost('http://petstore.swagger.io/v2');
        }
  
        $this->apiClient = $apiClient;
    }
  
    /**
     * Get API client
     * @return \Swagger\Client\ApiClient get the API client
     */
    public function getApiClient()
    {
        return $this->apiClient;
    }
  
    /**
     * Set the API client
     * @param \Swagger\Client\ApiClient $apiClient set the API client
     * @return FakeApi
     */
    public function setApiClient(ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }
  
    /**
     * testEndpointParameters
     *
     * Fake endpoint for testing various parameters
     *
     * @param float $number None (required)
     * @param double $double None (required)
     * @param string $string None (required)
     * @param string $byte None (required)
     * @param int $integer None (optional)
     * @param int $int32 None (optional)
     * @param int $int64 None (optional)
     * @param float $float None (optional)
     * @param string $binary None (optional)
     * @param \DateTime $date None (optional)
     * @param \DateTime $date_time None (optional)
     * @param string $password None (optional)
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function testEndpointParameters($number, $double, $string, $byte, $integer = null, $int32 = null, $int64 = null, $float = null, $binary = null, $date = null, $date_time = null, $password = null)
    {
        list($response) = $this->testEndpointParametersWithHttpInfo ($number, $double, $string, $byte, $integer, $int32, $int64, $float, $binary, $date, $date_time, $password);
        return $response; 
    }


    /**
     * testEndpointParametersWithHttpInfo
     *
     * Fake endpoint for testing various parameters
     *
     * @param float $number None (required)
     * @param double $double None (required)
     * @param string $string None (required)
     * @param string $byte None (required)
     * @param int $integer None (optional)
     * @param int $int32 None (optional)
     * @param int $int64 None (optional)
     * @param float $float None (optional)
     * @param string $binary None (optional)
     * @param \DateTime $date None (optional)
     * @param \DateTime $date_time None (optional)
     * @param string $password None (optional)
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function testEndpointParametersWithHttpInfo($number, $double, $string, $byte, $integer = null, $int32 = null, $int64 = null, $float = null, $binary = null, $date = null, $date_time = null, $password = null)
    {
        
        // verify the required parameter 'number' is set
        if ($number === null) {
            throw new \InvalidArgumentException('Missing the required parameter $number when calling testEndpointParameters');
        }
        if ($number > 543.2) {
            throw new \InvalidArgumentException('invalid value for "$number" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 543.2.');
        }
        if ($number < 32.1) {
            throw new \InvalidArgumentException('invalid value for "$number" when calling FakeApi.testEndpointParameters, must be bigger than or equal to 32.1.');
        }


        // verify the required parameter 'double' is set
        if ($double === null) {
            throw new \InvalidArgumentException('Missing the required parameter $double when calling testEndpointParameters');
        }
        if ($double > 123.4) {
            throw new \InvalidArgumentException('invalid value for "$double" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 123.4.');
        }
        if ($double < 67.8) {
            throw new \InvalidArgumentException('invalid value for "$double" when calling FakeApi.testEndpointParameters, must be bigger than or equal to 67.8.');
        }


        // verify the required parameter 'string' is set
        if ($string === null) {
            throw new \InvalidArgumentException('Missing the required parameter $string when calling testEndpointParameters');
        }
        if (!preg_match("/[a-z]/i", $string)) {
            throw new \InvalidArgumentException('invalid value for "string" when calling FakeApi.testEndpointParameters, must conform to the pattern /[a-z]/i.');
        }


        // verify the required parameter 'byte' is set
        if ($byte === null) {
            throw new \InvalidArgumentException('Missing the required parameter $byte when calling testEndpointParameters');
        }
        if ($integer > 100.0) {
            throw new \InvalidArgumentException('invalid value for "$integer" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 100.0.');
        }
        if ($integer < 10.0) {
            throw new \InvalidArgumentException('invalid value for "$integer" when calling FakeApi.testEndpointParameters, must be bigger than or equal to 10.0.');
        }

        if ($int32 > 200.0) {
            throw new \InvalidArgumentException('invalid value for "$int32" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 200.0.');
        }
        if ($int32 < 20.0) {
            throw new \InvalidArgumentException('invalid value for "$int32" when calling FakeApi.testEndpointParameters, must be bigger than or equal to 20.0.');
        }

        if ($float > 987.6) {
            throw new \InvalidArgumentException('invalid value for "$float" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 987.6.');
        }

        if (strlen($password) > 64) {
            throw new \InvalidArgumentException('invalid length for "$password" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 64.');
        }
        if (strlen($password) > 10) {
            throw new \InvalidArgumentException('invalid length for "$password" when calling FakeApi.testEndpointParameters, must be bigger than or equal to 10.');
        }

  
        // parse inputs
        $resourcePath = "/fake";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = $this->apiClient->selectHeaderAccept(array('application/xml', 'application/json'));
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = $this->apiClient->selectHeaderContentType(array());
  
        
        
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        // form params
        if ($integer !== null) {
            $formParams['integer'] = $this->apiClient->getSerializer()->toFormValue($integer);
        }// form params
        if ($int32 !== null) {
            $formParams['int32'] = $this->apiClient->getSerializer()->toFormValue($int32);
        }// form params
        if ($int64 !== null) {
            $formParams['int64'] = $this->apiClient->getSerializer()->toFormValue($int64);
        }// form params
        if ($number !== null) {
            $formParams['number'] = $this->apiClient->getSerializer()->toFormValue($number);
        }// form params
        if ($float !== null) {
            $formParams['float'] = $this->apiClient->getSerializer()->toFormValue($float);
        }// form params
        if ($double !== null) {
            $formParams['double'] = $this->apiClient->getSerializer()->toFormValue($double);
        }// form params
        if ($string !== null) {
            $formParams['string'] = $this->apiClient->getSerializer()->toFormValue($string);
        }// form params
        if ($byte !== null) {
            $formParams['byte'] = $this->apiClient->getSerializer()->toFormValue($byte);
        }// form params
        if ($binary !== null) {
            $formParams['binary'] = $this->apiClient->getSerializer()->toFormValue($binary);
        }// form params
        if ($date !== null) {
            $formParams['date'] = $this->apiClient->getSerializer()->toFormValue($date);
        }// form params
        if ($date_time !== null) {
            $formParams['dateTime'] = $this->apiClient->getSerializer()->toFormValue($date_time);
        }// form params
        if ($password !== null) {
            $formParams['password'] = $this->apiClient->getSerializer()->toFormValue($password);
        }
        
  
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
                // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath, 'POST',
                $queryParams, $httpBody,
                $headerParams
            );

            return array(null, $statusCode, $httpHeader);
        } catch (ApiException $e) {
            switch ($e->getCode()) { 
            }
  
            throw $e;
        }
    }
}
