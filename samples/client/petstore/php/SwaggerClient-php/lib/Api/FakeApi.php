<?php
/**
 * FakeApi
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
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

namespace Swagger\Client\Api;

use GuzzleHttp\Psr7\MultipartStream;
use GuzzleHttp\Psr7\Request;
use Http\Client\Exception\NetworkException;
use Http\Client\HttpClient;
use Swagger\Client\ApiException;
use Swagger\Client\Configuration;
use Swagger\Client\HeaderSelector;
use Swagger\Client\ObjectSerializer;

/**
 * FakeApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class FakeApi
{
    /**
     * @var HttpClient
     */
    protected $client;

    /**
     * @var Configuration
     */
    protected $config;

    /**
     * @param HttpClient $client
     * @param HeaderSelector $selector
     * @param Configuration $config
     */
    public function __construct(
        HttpClient $client,
        Configuration $config = null,
        HeaderSelector $selector = null
    ) {
        $this->client = $client;
        $this->headerSelector = $selector ?: new HeaderSelector();
        $this->config = $config ?: new Configuration();
    }

    /**
     * @return Configuration
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation testClientModel
     *
     * To test \"client\" model
     *
     * @param \Swagger\Client\Model\Client $body client model (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \Swagger\Client\Model\Client
     */
    public function testClientModel($body)
    {
        list($response) = $this->testClientModelWithHttpInfo($body);
        return $response;
    }

    /**
     * Operation testClientModelWithHttpInfo
     *
     * To test \"client\" model
     *
     * @param \Swagger\Client\Model\Client $body client model (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \Swagger\Client\Model\Client, HTTP status code, HTTP response headers (array of strings)
     */
    public function testClientModelWithHttpInfo($body)
    {
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling testClientModel');
        }

        $resourcePath = '/fake';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;
        $returnType = '\Swagger\Client\Model\Client';



        // body params
        $_tempBody = null;
        if (isset($body)) {
            $_tempBody = $body;
        }

        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present

        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                $httpBody = new MultipartStream($multipartContents); // for HTTP post (form)

            } else {
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams); // for HTTP post (form)
            }
        }

        if ($httpBody instanceof MultipartStream) {
            $headers= $this->headerSelector->selectHeadersForMultipart(
                ['application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/json'],
                ['application/json']
            );
        }


        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        $url = $this->config->getHost() . $resourcePath . ($query ? '?' . $query : '');
        $headers = array_merge(
            $this->config->getDefaultHeaders(),
            $headerParams,
            $headers
        );

        $request = new Request(
            'PATCH',
            $url,
            $headers,
            $httpBody
        );

        try {
            try {
                $response = $this->client->sendRequest($request);
            } catch (NetworkException $e) {
                throw new ApiException($e->getMessage(), 0);
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    "[$statusCode] Error connecting to the API ($url)",
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            $responseBody = $response->getBody();
            if ($returnType === '\SplFileObject') {
                $content = $responseBody; //stream goes to serializer
            } else {
                $content = $responseBody->getContents();
                if ($returnType !== 'string') {
                    $content = json_decode($content);
                }
            }

            return [
                ObjectSerializer::deserialize($content, $returnType, []),
                $response->getStatusCode(),
                $response->getHeaders()
            ];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = ObjectSerializer::deserialize($e->getResponseBody(), '\Swagger\Client\Model\Client', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }
            throw $e;
        }
    }
    /**
     * Operation testEndpointParameters
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트
     *
     * @param float $number None (required)
     * @param double $double None (required)
     * @param string $pattern_without_delimiter None (required)
     * @param string $byte None (required)
     * @param int $integer None (optional)
     * @param int $int32 None (optional)
     * @param int $int64 None (optional)
     * @param float $float None (optional)
     * @param string $string None (optional)
     * @param string $binary None (optional)
     * @param \DateTime $date None (optional)
     * @param \DateTime $date_time None (optional)
     * @param string $password None (optional)
     * @param string $callback None (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function testEndpointParameters($number, $double, $pattern_without_delimiter, $byte, $integer = null, $int32 = null, $int64 = null, $float = null, $string = null, $binary = null, $date = null, $date_time = null, $password = null, $callback = null)
    {
        $this->testEndpointParametersWithHttpInfo($number, $double, $pattern_without_delimiter, $byte, $integer, $int32, $int64, $float, $string, $binary, $date, $date_time, $password, $callback);
    }

    /**
     * Operation testEndpointParametersWithHttpInfo
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트
     *
     * @param float $number None (required)
     * @param double $double None (required)
     * @param string $pattern_without_delimiter None (required)
     * @param string $byte None (required)
     * @param int $integer None (optional)
     * @param int $int32 None (optional)
     * @param int $int64 None (optional)
     * @param float $float None (optional)
     * @param string $string None (optional)
     * @param string $binary None (optional)
     * @param \DateTime $date None (optional)
     * @param \DateTime $date_time None (optional)
     * @param string $password None (optional)
     * @param string $callback None (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function testEndpointParametersWithHttpInfo($number, $double, $pattern_without_delimiter, $byte, $integer = null, $int32 = null, $int64 = null, $float = null, $string = null, $binary = null, $date = null, $date_time = null, $password = null, $callback = null)
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

        // verify the required parameter 'pattern_without_delimiter' is set
        if ($pattern_without_delimiter === null) {
            throw new \InvalidArgumentException('Missing the required parameter $pattern_without_delimiter when calling testEndpointParameters');
        }
        if (!preg_match("/^[A-Z].*_/", $pattern_without_delimiter)) {
            throw new \InvalidArgumentException("invalid value for \"pattern_without_delimiter\" when calling FakeApi.testEndpointParameters, must conform to the pattern /^[A-Z].*_/.");
        }

        // verify the required parameter 'byte' is set
        if ($byte === null) {
            throw new \InvalidArgumentException('Missing the required parameter $byte when calling testEndpointParameters');
        }
        if ($integer !== null && $integer > 100) {
            throw new \InvalidArgumentException('invalid value for "$integer" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 100.');
        }
        if ($integer !== null && $integer < 10) {
            throw new \InvalidArgumentException('invalid value for "$integer" when calling FakeApi.testEndpointParameters, must be bigger than or equal to 10.');
        }

        if ($int32 !== null && $int32 > 200) {
            throw new \InvalidArgumentException('invalid value for "$int32" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 200.');
        }
        if ($int32 !== null && $int32 < 20) {
            throw new \InvalidArgumentException('invalid value for "$int32" when calling FakeApi.testEndpointParameters, must be bigger than or equal to 20.');
        }

        if ($float !== null && $float > 987.6) {
            throw new \InvalidArgumentException('invalid value for "$float" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 987.6.');
        }

        if ($string !== null && !preg_match("/[a-z]/i", $string)) {
            throw new \InvalidArgumentException("invalid value for \"string\" when calling FakeApi.testEndpointParameters, must conform to the pattern /[a-z]/i.");
        }

        if ($password !== null && strlen($password) > 64) {
            throw new \InvalidArgumentException('invalid length for "$password" when calling FakeApi.testEndpointParameters, must be smaller than or equal to 64.');
        }
        if ($password !== null && strlen($password) < 10) {
            throw new \InvalidArgumentException('invalid length for "$password" when calling FakeApi.testEndpointParameters, must be bigger than or equal to 10.');
        }


        $resourcePath = '/fake';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;
        $returnType = '';



        // form params
        if ($integer !== null) {
            $formParams['integer'] = ObjectSerializer::toFormValue($integer);
        }
        // form params
        if ($int32 !== null) {
            $formParams['int32'] = ObjectSerializer::toFormValue($int32);
        }
        // form params
        if ($int64 !== null) {
            $formParams['int64'] = ObjectSerializer::toFormValue($int64);
        }
        // form params
        if ($number !== null) {
            $formParams['number'] = ObjectSerializer::toFormValue($number);
        }
        // form params
        if ($float !== null) {
            $formParams['float'] = ObjectSerializer::toFormValue($float);
        }
        // form params
        if ($double !== null) {
            $formParams['double'] = ObjectSerializer::toFormValue($double);
        }
        // form params
        if ($string !== null) {
            $formParams['string'] = ObjectSerializer::toFormValue($string);
        }
        // form params
        if ($pattern_without_delimiter !== null) {
            $formParams['pattern_without_delimiter'] = ObjectSerializer::toFormValue($pattern_without_delimiter);
        }
        // form params
        if ($byte !== null) {
            $formParams['byte'] = ObjectSerializer::toFormValue($byte);
        }
        // form params
        if ($binary !== null) {
            $formParams['binary'] = ObjectSerializer::toFormValue($binary);
        }
        // form params
        if ($date !== null) {
            $formParams['date'] = ObjectSerializer::toFormValue($date);
        }
        // form params
        if ($date_time !== null) {
            $formParams['dateTime'] = ObjectSerializer::toFormValue($date_time);
        }
        // form params
        if ($password !== null) {
            $formParams['password'] = ObjectSerializer::toFormValue($password);
        }
        // form params
        if ($callback !== null) {
            $formParams['callback'] = ObjectSerializer::toFormValue($callback);
        }
        
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present

        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                $httpBody = new MultipartStream($multipartContents); // for HTTP post (form)

            } else {
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams); // for HTTP post (form)
            }
        }

        if ($httpBody instanceof MultipartStream) {
            $headers= $this->headerSelector->selectHeadersForMultipart(
                ['application/xml; charset=utf-8', 'application/json; charset=utf-8']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/xml; charset=utf-8', 'application/json; charset=utf-8'],
                ['application/xml; charset=utf-8', 'application/json; charset=utf-8']
            );
        }

        // this endpoint requires HTTP basic authentication
        if ($this->config->getUsername() !== null || $this->config->getPassword() !== null) {
            $headers['Authorization'] = 'Basic ' . base64_encode($this->config->getUsername() . ":" . $this->config->getPassword());
        }

        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        $url = $this->config->getHost() . $resourcePath . ($query ? '?' . $query : '');
        $headers = array_merge(
            $this->config->getDefaultHeaders(),
            $headerParams,
            $headers
        );

        $request = new Request(
            'POST',
            $url,
            $headers,
            $httpBody
        );

        try {
            try {
                $response = $this->client->sendRequest($request);
            } catch (NetworkException $e) {
                throw new ApiException($e->getMessage(), 0);
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    "[$statusCode] Error connecting to the API ($url)",
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            return [null, $statusCode, $response->getHeaders()];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }
            throw $e;
        }
    }
    /**
     * Operation testEnumParameters
     *
     * To test enum parameters
     *
     * @param string[] $enum_form_string_array Form parameter enum test (string array) (optional)
     * @param string $enum_form_string Form parameter enum test (string) (optional, default to -efg)
     * @param string[] $enum_header_string_array Header parameter enum test (string array) (optional)
     * @param string $enum_header_string Header parameter enum test (string) (optional, default to -efg)
     * @param string[] $enum_query_string_array Query parameter enum test (string array) (optional)
     * @param string $enum_query_string Query parameter enum test (string) (optional, default to -efg)
     * @param int $enum_query_integer Query parameter enum test (double) (optional)
     * @param double $enum_query_double Query parameter enum test (double) (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function testEnumParameters($enum_form_string_array = null, $enum_form_string = null, $enum_header_string_array = null, $enum_header_string = null, $enum_query_string_array = null, $enum_query_string = null, $enum_query_integer = null, $enum_query_double = null)
    {
        $this->testEnumParametersWithHttpInfo($enum_form_string_array, $enum_form_string, $enum_header_string_array, $enum_header_string, $enum_query_string_array, $enum_query_string, $enum_query_integer, $enum_query_double);
    }

    /**
     * Operation testEnumParametersWithHttpInfo
     *
     * To test enum parameters
     *
     * @param string[] $enum_form_string_array Form parameter enum test (string array) (optional)
     * @param string $enum_form_string Form parameter enum test (string) (optional, default to -efg)
     * @param string[] $enum_header_string_array Header parameter enum test (string array) (optional)
     * @param string $enum_header_string Header parameter enum test (string) (optional, default to -efg)
     * @param string[] $enum_query_string_array Query parameter enum test (string array) (optional)
     * @param string $enum_query_string Query parameter enum test (string) (optional, default to -efg)
     * @param int $enum_query_integer Query parameter enum test (double) (optional)
     * @param double $enum_query_double Query parameter enum test (double) (optional)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function testEnumParametersWithHttpInfo($enum_form_string_array = null, $enum_form_string = null, $enum_header_string_array = null, $enum_header_string = null, $enum_query_string_array = null, $enum_query_string = null, $enum_query_integer = null, $enum_query_double = null)
    {

        $resourcePath = '/fake';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;
        $returnType = '';

        // query params
        if (is_array($enum_query_string_array)) {
            $enum_query_string_array = ObjectSerializer::serializeCollection($enum_query_string_array, 'csv', true);
        }
        if ($enum_query_string_array !== null) {
            $queryParams['enum_query_string_array'] = ObjectSerializer::toQueryValue($enum_query_string_array);
        }
        // query params
        if ($enum_query_string !== null) {
            $queryParams['enum_query_string'] = ObjectSerializer::toQueryValue($enum_query_string);
        }
        // query params
        if ($enum_query_integer !== null) {
            $queryParams['enum_query_integer'] = ObjectSerializer::toQueryValue($enum_query_integer);
        }
        // header params
        if (is_array($enum_header_string_array)) {
            $enum_header_string_array = ObjectSerializer::serializeCollection($enum_header_string_array, 'csv');
        }
        if ($enum_header_string_array !== null) {
            $headerParams['enum_header_string_array'] = ObjectSerializer::toHeaderValue($enum_header_string_array);
        }
        // header params
        if ($enum_header_string !== null) {
            $headerParams['enum_header_string'] = ObjectSerializer::toHeaderValue($enum_header_string);
        }


        // form params
        if ($enum_form_string_array !== null) {
            $formParams['enum_form_string_array'] = ObjectSerializer::toFormValue($enum_form_string_array);
        }
        // form params
        if ($enum_form_string !== null) {
            $formParams['enum_form_string'] = ObjectSerializer::toFormValue($enum_form_string);
        }
        // form params
        if ($enum_query_double !== null) {
            $formParams['enum_query_double'] = ObjectSerializer::toFormValue($enum_query_double);
        }
        
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present

        } elseif (count($formParams) > 0) {
            if ($multipart) {
                $multipartContents = [];
                foreach ($formParams as $formParamName => $formParamValue) {
                    $multipartContents[] = [
                        'name' => $formParamName,
                        'contents' => $formParamValue
                    ];
                }
                $httpBody = new MultipartStream($multipartContents); // for HTTP post (form)

            } else {
                $httpBody = \GuzzleHttp\Psr7\build_query($formParams); // for HTTP post (form)
            }
        }

        if ($httpBody instanceof MultipartStream) {
            $headers= $this->headerSelector->selectHeadersForMultipart(
                ['*/*']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['*/*'],
                ['*/*']
            );
        }


        $query = \GuzzleHttp\Psr7\build_query($queryParams);
        $url = $this->config->getHost() . $resourcePath . ($query ? '?' . $query : '');
        $headers = array_merge(
            $this->config->getDefaultHeaders(),
            $headerParams,
            $headers
        );

        $request = new Request(
            'GET',
            $url,
            $headers,
            $httpBody
        );

        try {
            try {
                $response = $this->client->sendRequest($request);
            } catch (NetworkException $e) {
                throw new ApiException($e->getMessage(), 0);
            }

            $statusCode = $response->getStatusCode();

            if ($statusCode < 200 || $statusCode > 299) {
                throw new ApiException(
                    "[$statusCode] Error connecting to the API ($url)",
                    $statusCode,
                    $response->getHeaders(),
                    $response->getBody()
                );
            }

            return [null, $statusCode, $response->getHeaders()];

        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }
            throw $e;
        }
    }
}
