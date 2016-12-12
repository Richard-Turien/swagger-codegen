/* 
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package petstore

import (
	"net/url"
	"strings"
	"time"
	"encoding/json"
)

type FakeApi struct {
	Configuration *Configuration
}

func NewFakeApi() *FakeApi {
	configuration := NewConfiguration()
	return &FakeApi{
		Configuration: configuration,
	}
}

func NewFakeApiWithBasePath(basePath string) *FakeApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &FakeApi{
		Configuration: configuration,
	}
}

/**
 * To test \&quot;client\&quot; model
 * To test \&quot;client\&quot; model
 *
 * @param body *Client (required) client model
 * @return *Client
 */
func (a FakeApi) TestClientModel(params map[string]interface{}) (successPayload *Client, localVarAPIResponse *APIResponse, err error) {

	var body *Client
	if params["body"] == nil {
		err = fmt.Errorf("Param 'body' is required")	
		return
	} else {
		var ok bool
		body, ok = params["body"].(*Client)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'body', must be '*Client'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Patch")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/fake"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	if params["body"] != nil {
		localVarPostBody = body
	}
	successPayload = new(Client)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "TestClientModel", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 *
 * @param number float32 (required) None
 * @param double float64 (required) None
 * @param pattern_without_delimiter string (required) None
 * @param byte string (required) None
 * @param integer int32 None
 * @param int32 int32 None
 * @param int64 int64 None
 * @param float float32 None
 * @param string string None
 * @param binary string None
 * @param date time.Time None
 * @param dateTime time.Time None
 * @param password string None
 * @param callback string None
 * @return void
 */
func (a FakeApi) TestEndpointParameters(params map[string]interface{}) (localVarAPIResponse *APIResponse, err error) {

	var number float32
	if params["number"] == nil {
		err = fmt.Errorf("Param 'number' is required")	
		return
	} else {
		var ok bool
		number, ok = params["number"].(float32)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'number', must be 'float32'")
			return
		}
	}
	var double float64
	if params["double"] == nil {
		err = fmt.Errorf("Param 'double' is required")	
		return
	} else {
		var ok bool
		double, ok = params["double"].(float64)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'double', must be 'float64'")
			return
		}
	}
	var patternWithoutDelimiter string
	if params["pattern_without_delimiter"] == nil {
		err = fmt.Errorf("Param 'pattern_without_delimiter' is required")	
		return
	} else {
		var ok bool
		patternWithoutDelimiter, ok = params["pattern_without_delimiter"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'pattern_without_delimiter', must be 'string'")
			return
		}
	}
	var byte_ string
	if params["byte"] == nil {
		err = fmt.Errorf("Param 'byte' is required")	
		return
	} else {
		var ok bool
		byte_, ok = params["byte"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'byte', must be 'string'")
			return
		}
	}
	var integer int32
	if params["integer"] != nil {
		var ok bool
		integer, ok = params["integer"].(int32)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'integer', must be 'int32'")
			return
		}
	}
	var int32_ int32
	if params["int32"] != nil {
		var ok bool
		int32_, ok = params["int32"].(int32)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'int32', must be 'int32'")
			return
		}
	}
	var int64_ int64
	if params["int64"] != nil {
		var ok bool
		int64_, ok = params["int64"].(int64)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'int64', must be 'int64'")
			return
		}
	}
	var float float32
	if params["float"] != nil {
		var ok bool
		float, ok = params["float"].(float32)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'float', must be 'float32'")
			return
		}
	}
	var string_ string
	if params["string"] != nil {
		var ok bool
		string_, ok = params["string"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'string', must be 'string'")
			return
		}
	}
	var binary string
	if params["binary"] != nil {
		var ok bool
		binary, ok = params["binary"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'binary', must be 'string'")
			return
		}
	}
	var date time.Time
	if params["date"] != nil {
		var ok bool
		date, ok = params["date"].(time.Time)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'date', must be 'time.Time'")
			return
		}
	}
	var dateTime time.Time
	if params["dateTime"] != nil {
		var ok bool
		dateTime, ok = params["dateTime"].(time.Time)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'dateTime', must be 'time.Time'")
			return
		}
	}
	var password string
	if params["password"] != nil {
		var ok bool
		password, ok = params["password"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'password', must be 'string'")
			return
		}
	}
	var callback string
	if params["callback"] != nil {
		var ok bool
		callback, ok = params["callback"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'callback', must be 'string'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Post")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/fake"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(http_basic_test)' required
	// http basic authentication required
	if a.Configuration.UserName != "" || a.Configuration.Password != ""{
		localVarHeaderParams["Authorization"] =  "Basic " + a.Configuration.GetBasicAuthEncodedString()
	}
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/xml; charset=utf-8", "application/json; charset=utf-8",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/xml; charset=utf-8",
		"application/json; charset=utf-8",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if params["integer"] != nil {
		localVarFormParams["integer"] = a.Configuration.APIClient.ParameterToString(integer, "")
	}
	if params["int32"] != nil {
		localVarFormParams["int32_"] = a.Configuration.APIClient.ParameterToString(int32_, "")
	}
	if params["int64"] != nil {
		localVarFormParams["int64_"] = a.Configuration.APIClient.ParameterToString(int64_, "")
	}
	if params["number"] != nil {
		localVarFormParams["number"] = a.Configuration.APIClient.ParameterToString(number, "")
	}
	if params["float"] != nil {
		localVarFormParams["float"] = a.Configuration.APIClient.ParameterToString(float, "")
	}
	if params["double"] != nil {
		localVarFormParams["double"] = a.Configuration.APIClient.ParameterToString(double, "")
	}
	if params["string"] != nil {
		localVarFormParams["string_"] = a.Configuration.APIClient.ParameterToString(string_, "")
	}
	if params["pattern_without_delimiter"] != nil {
		localVarFormParams["patternWithoutDelimiter"] = a.Configuration.APIClient.ParameterToString(patternWithoutDelimiter, "")
	}
	if params["byte"] != nil {
		localVarFormParams["byte_"] = a.Configuration.APIClient.ParameterToString(byte_, "")
	}
	if params["binary"] != nil {
		localVarFormParams["binary"] = a.Configuration.APIClient.ParameterToString(binary, "")
	}
	if params["date"] != nil {
		localVarFormParams["date"] = a.Configuration.APIClient.ParameterToString(date, "")
	}
	if params["dateTime"] != nil {
		localVarFormParams["dateTime"] = a.Configuration.APIClient.ParameterToString(dateTime, "")
	}
	if params["password"] != nil {
		localVarFormParams["password"] = a.Configuration.APIClient.ParameterToString(password, "")
	}
	if params["callback"] != nil {
		localVarFormParams["callback"] = a.Configuration.APIClient.ParameterToString(callback, "")
	}
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "TestEndpointParameters", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	return localVarAPIResponse, err
}

/**
 * To test enum parameters
 * To test enum parameters
 *
 * @param enum_form_string_array []string Form parameter enum test (string array)
 * @param enum_form_string string Form parameter enum test (string)
 * @param enum_header_string_array []string Header parameter enum test (string array)
 * @param enum_header_string string Header parameter enum test (string)
 * @param enum_query_string_array []string Query parameter enum test (string array)
 * @param enum_query_string string Query parameter enum test (string)
 * @param enum_query_integer int32 Query parameter enum test (double)
 * @param enum_query_double float64 Query parameter enum test (double)
 * @return void
 */
func (a FakeApi) TestEnumParameters(params map[string]interface{}) (localVarAPIResponse *APIResponse, err error) {

	var enumFormStringArray []string
	if params["enum_form_string_array"] != nil {
		var ok bool
		enumFormStringArray, ok = params["enum_form_string_array"].([]string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'enum_form_string_array', must be '[]string'")
			return
		}
	}
	var enumFormString string
	if params["enum_form_string"] != nil {
		var ok bool
		enumFormString, ok = params["enum_form_string"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'enum_form_string', must be 'string'")
			return
		}
	}
	var enumHeaderStringArray []string
	if params["enum_header_string_array"] != nil {
		var ok bool
		enumHeaderStringArray, ok = params["enum_header_string_array"].([]string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'enum_header_string_array', must be '[]string'")
			return
		}
	}
	var enumHeaderString string
	if params["enum_header_string"] != nil {
		var ok bool
		enumHeaderString, ok = params["enum_header_string"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'enum_header_string', must be 'string'")
			return
		}
	}
	var enumQueryStringArray []string
	if params["enum_query_string_array"] != nil {
		var ok bool
		enumQueryStringArray, ok = params["enum_query_string_array"].([]string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'enum_query_string_array', must be '[]string'")
			return
		}
	}
	var enumQueryString string
	if params["enum_query_string"] != nil {
		var ok bool
		enumQueryString, ok = params["enum_query_string"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'enum_query_string', must be 'string'")
			return
		}
	}
	var enumQueryInteger int32
	if params["enum_query_integer"] != nil {
		var ok bool
		enumQueryInteger, ok = params["enum_query_integer"].(int32)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'enum_query_integer', must be 'int32'")
			return
		}
	}
	var enumQueryDouble float64
	if params["enum_query_double"] != nil {
		var ok bool
		enumQueryDouble, ok = params["enum_query_double"].(float64)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'enum_query_double', must be 'float64'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/fake"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}
	var collectionFormat = "csv"
	if collectionFormat == "multi" && params["enum_query_string_array"] != nil {
		for _, value := range enumQueryStringArray {
			localVarQueryParams.Add("enum_query_string_array", fmt.Sprintf("%v", value))
		}
	} else if params["enum_query_string_array"] != nil {
		localVarQueryParams.Add("enum_query_string_array", a.Configuration.APIClient.ParameterToString(enumQueryStringArray, collectionFormat))
	}
	if params["enum_query_string"] != nil {
		localVarQueryParams.Add("enum_query_string", a.Configuration.APIClient.ParameterToString(enumQueryString, ""))
	}
	if params["enum_query_integer"] != nil {
		localVarQueryParams.Add("enum_query_integer", a.Configuration.APIClient.ParameterToString(enumQueryInteger, ""))
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "*/*",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"*/*",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// header params "enum_header_string_array"
	if params["enum_header_string_array"] != nil {
		localVarHeaderParams["enum_header_string_array"] = a.Configuration.APIClient.ParameterToString(enumHeaderStringArray, "")
	}
	// header params "enum_header_string"
	if params["enum_header_string"] != nil {
		localVarHeaderParams["enum_header_string"] = a.Configuration.APIClient.ParameterToString(enumHeaderString, "")
	}
	if params["enum_form_string_array"] != nil {
		localVarFormParams["enumFormStringArray"] = a.Configuration.APIClient.ParameterToString(enumFormStringArray, "")
	}
	if params["enum_form_string"] != nil {
		localVarFormParams["enumFormString"] = a.Configuration.APIClient.ParameterToString(enumFormString, "")
	}
	if params["enum_query_double"] != nil {
		localVarFormParams["enumQueryDouble"] = a.Configuration.APIClient.ParameterToString(enumQueryDouble, "")
	}
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "TestEnumParameters", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	return localVarAPIResponse, err
}

