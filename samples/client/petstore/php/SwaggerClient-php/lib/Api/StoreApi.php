<?php
/**
 * StoreApi
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
use GuzzleHttp\Psr7\Uri;
use Http\Client\Exception\NetworkException;
use Http\Client\HttpClient;
use Swagger\Client\ApiException;
use Swagger\Client\Configuration;
use Swagger\Client\HeaderSelector;
use Swagger\Client\ObjectSerializer;

/**
 * StoreApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class StoreApi
{
    /**
     * @var HttpClient
     */
    protected $client;

    /**
     * @var ObjectSerializer
     */
    protected $serializer;

    /**
     * @var Configuration
     */
    protected $config;

    /**
     * @param HttpClient $client
     * @param HeaderSelector $selector
     * @param ObjectSerializer $serializer
     * @param Configuration $config
     */
    public function __construct(
        HttpClient $client,
        Configuration $config = null,
        HeaderSelector $selector = null,
        ObjectSerializer $serializer = null
    ) {
        $this->client = $client;
        $this->serializer = $serializer ?: new ObjectSerializer();
        $this->headerSelector = $selector ?: new HeaderSelector();
        $this->config = $config ?: new Configuration();
    }

    /**
     * @return Config
     */
    public function getConfig()
    {
        return $this->config;
    }

    /**
     * Operation deleteOrder
     *
     * Delete purchase order by ID
     *
     * @param string $order_id ID of the order that needs to be deleted (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return void
     */
    public function deleteOrder($order_id)
    {
        $this->deleteOrderWithHttpInfo($order_id);
    }

    /**
     * Operation deleteOrderWithHttpInfo
     *
     * Delete purchase order by ID
     *
     * @param string $order_id ID of the order that needs to be deleted (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of null, HTTP status code, HTTP response headers (array of strings)
     */
    public function deleteOrderWithHttpInfo($order_id)
    {
        // verify the required parameter 'order_id' is set
        if ($order_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $order_id when calling deleteOrder');
        }

        $resourcePath = '/store/order/{order_id}';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;
        $returnType = '';


        // path params
        if ($order_id !== null) {
            $resourcePath = str_replace('{' . 'order_id' . '}', $this->serializer->toPathValue($order_id), $resourcePath);
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
                ['application/xml', 'application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/xml', 'application/json'],
                []
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
            'DELETE',
            $url,
            $headers,
            $httpBody
        );
        try {
            $response = $this->client->sendRequest($request);
        } catch (NetworkException $e) {
            throw new ApiException($e->getMessage(), null, $e);
        }

        if ($response->getStatusCode() >= 400) {
            throw new ApiException("[{$response->getStatusCode()}] Error connecting to the API ($url)", $response->getStatusCode());
        }

        return [null, $response->getStatusCode(), $response->getHeaders()];
/**
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'DELETE',
                $queryParams,
                $httpBody,
                $headerParams,
                null,
                '/store/order/{order_id}'
            );

            return [null, $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
            }

            throw $e;
        }
*/
    }
    /**
     * Operation getInventory
     *
     * Returns pet inventories by status
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return map[string,int]
     */
    public function getInventory()
    {
        list($response) = $this->getInventoryWithHttpInfo();
        return $response;
    }

    /**
     * Operation getInventoryWithHttpInfo
     *
     * Returns pet inventories by status
     *
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of map[string,int], HTTP status code, HTTP response headers (array of strings)
     */
    public function getInventoryWithHttpInfo()
    {

        $resourcePath = '/store/inventory';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;
        $returnType = 'map[string,int]';



        
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
                []
            );
        }

        // this endpoint requires API key authentication
        $apiKey = $this->config->getApiKeyWithPrefix('api_key');
        if ($apiKey !== null) {
            $headers['api_key'] = $apiKey;
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
            $response = $this->client->sendRequest($request);
        } catch (NetworkException $e) {
            throw new ApiException($e->getMessage(), null, $e);
        }

        if ($response->getStatusCode() >= 400) {
            throw new ApiException("[{$response->getStatusCode()}] Error connecting to the API ($url)", $response->getStatusCode());
        }

        $responseBody = $response->getBody();
        if ($returnType === '\SplFileObject') {
            $content = $responseBody; //stream goes to serializer
        } else {
            $content = $responseBody->getContents();
            if ($returnType !== 'string' ) {
                $content = json_decode($content);
            }
        }

        return [
            ObjectSerializer::deserialize($content, 'map[string,int]', []),
            $response->getStatusCode(),
            $response->getHeaders()
        ];
/**
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                'map[string,int]',
                '/store/inventory'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, 'map[string,int]', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), 'map[string,int]', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
*/
    }
    /**
     * Operation getOrderById
     *
     * Find purchase order by ID
     *
     * @param int $order_id ID of pet that needs to be fetched (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \Swagger\Client\Model\Order
     */
    public function getOrderById($order_id)
    {
        list($response) = $this->getOrderByIdWithHttpInfo($order_id);
        return $response;
    }

    /**
     * Operation getOrderByIdWithHttpInfo
     *
     * Find purchase order by ID
     *
     * @param int $order_id ID of pet that needs to be fetched (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \Swagger\Client\Model\Order, HTTP status code, HTTP response headers (array of strings)
     */
    public function getOrderByIdWithHttpInfo($order_id)
    {
        // verify the required parameter 'order_id' is set
        if ($order_id === null) {
            throw new \InvalidArgumentException('Missing the required parameter $order_id when calling getOrderById');
        }
        if ($order_id > 5) {
            throw new \InvalidArgumentException('invalid value for "$order_id" when calling StoreApi.getOrderById, must be smaller than or equal to 5.');
        }
        if ($order_id < 1) {
            throw new \InvalidArgumentException('invalid value for "$order_id" when calling StoreApi.getOrderById, must be bigger than or equal to 1.');
        }


        $resourcePath = '/store/order/{order_id}';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;
        $returnType = '\Swagger\Client\Model\Order';


        // path params
        if ($order_id !== null) {
            $resourcePath = str_replace('{' . 'order_id' . '}', $this->serializer->toPathValue($order_id), $resourcePath);
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
                ['application/xml', 'application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/xml', 'application/json'],
                []
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
            $response = $this->client->sendRequest($request);
        } catch (NetworkException $e) {
            throw new ApiException($e->getMessage(), null, $e);
        }

        if ($response->getStatusCode() >= 400) {
            throw new ApiException("[{$response->getStatusCode()}] Error connecting to the API ($url)", $response->getStatusCode());
        }

        $responseBody = $response->getBody();
        if ($returnType === '\SplFileObject') {
            $content = $responseBody; //stream goes to serializer
        } else {
            $content = $responseBody->getContents();
            if ($returnType !== 'string' ) {
                $content = json_decode($content);
            }
        }

        return [
            ObjectSerializer::deserialize($content, '\Swagger\Client\Model\Order', []),
            $response->getStatusCode(),
            $response->getHeaders()
        ];
/**
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'GET',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\Order',
                '/store/order/{order_id}'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\Order', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Order', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
*/
    }
    /**
     * Operation placeOrder
     *
     * Place an order for a pet
     *
     * @param \Swagger\Client\Model\Order $body order placed for purchasing the pet (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return \Swagger\Client\Model\Order
     */
    public function placeOrder($body)
    {
        list($response) = $this->placeOrderWithHttpInfo($body);
        return $response;
    }

    /**
     * Operation placeOrderWithHttpInfo
     *
     * Place an order for a pet
     *
     * @param \Swagger\Client\Model\Order $body order placed for purchasing the pet (required)
     * @throws \Swagger\Client\ApiException on non-2xx response
     * @throws \InvalidArgumentException
     * @return array of \Swagger\Client\Model\Order, HTTP status code, HTTP response headers (array of strings)
     */
    public function placeOrderWithHttpInfo($body)
    {
        // verify the required parameter 'body' is set
        if ($body === null) {
            throw new \InvalidArgumentException('Missing the required parameter $body when calling placeOrder');
        }

        $resourcePath = '/store/order';
        $formParams = [];
        $queryParams = [];
        $headerParams = [];
        $httpBody = '';
        $multipart = false;
        $returnType = '\Swagger\Client\Model\Order';



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
                ['application/xml', 'application/json']
            );
        } else {
            $headers = $this->headerSelector->selectHeaders(
                ['application/xml', 'application/json'],
                []
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
            'POST',
            $url,
            $headers,
            $httpBody
        );
        try {
            $response = $this->client->sendRequest($request);
        } catch (NetworkException $e) {
            throw new ApiException($e->getMessage(), null, $e);
        }

        if ($response->getStatusCode() >= 400) {
            throw new ApiException("[{$response->getStatusCode()}] Error connecting to the API ($url)", $response->getStatusCode());
        }

        $responseBody = $response->getBody();
        if ($returnType === '\SplFileObject') {
            $content = $responseBody; //stream goes to serializer
        } else {
            $content = $responseBody->getContents();
            if ($returnType !== 'string' ) {
                $content = json_decode($content);
            }
        }

        return [
            ObjectSerializer::deserialize($content, '\Swagger\Client\Model\Order', []),
            $response->getStatusCode(),
            $response->getHeaders()
        ];
/**
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath,
                'POST',
                $queryParams,
                $httpBody,
                $headerParams,
                '\Swagger\Client\Model\Order',
                '/store/order'
            );

            return [$this->apiClient->getSerializer()->deserialize($response, '\Swagger\Client\Model\Order', $httpHeader), $statusCode, $httpHeader];
        } catch (ApiException $e) {
            switch ($e->getCode()) {
                case 200:
                    $data = $this->apiClient->getSerializer()->deserialize($e->getResponseBody(), '\Swagger\Client\Model\Order', $e->getResponseHeaders());
                    $e->setResponseObject($data);
                    break;
            }

            throw $e;
        }
*/
    }
}
