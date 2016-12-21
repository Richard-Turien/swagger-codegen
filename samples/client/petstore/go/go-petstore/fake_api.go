/* 
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
 *
 * @param body client model
 * @return *Client
 */
func (a FakeApi) TestClientModel(body Client) (*Client, *APIResponse, error) {

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
	localVarPostBody = &body
	var successPayload = new(Client)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "TestClientModel", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return successPayload, localVarAPIResponse, err
	}
	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 *
 * @param number None
 * @param double None
 * @param patternWithoutDelimiter None
 * @param byte_ None
 * @param optional (nil or map[string]interface{}) with one or more of:
 *     @param "integer" (int32) None
 *     @param "int32_" (int32) None
 *     @param "int64_" (int64) None
 *     @param "float" (float32) None
 *     @param "string_" (string) None
 *     @param "binary" (string) None
 *     @param "date" (time.Time) None
 *     @param "dateTime" (time.Time) None
 *     @param "password" (string) None
 *     @param "callback" (string) None
 * @return 
 */
func (a FakeApi) TestEndpointParameters(number float32, double float64, patternWithoutDelimiter string, byte_ string, localVarOptionals map[string]interface{}) (*APIResponse, error) {

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
	if localVarTempParam, localVarOk := localVarOptionals["integer"].(int32); localVarOptionals != nil && localVarOk {
		localVarFormParams["integer"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	if localVarTempParam, localVarOk := localVarOptionals["int32_"].(int32); localVarOptionals != nil && localVarOk {
		localVarFormParams["int32"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	if localVarTempParam, localVarOk := localVarOptionals["int64_"].(int64); localVarOptionals != nil && localVarOk {
		localVarFormParams["int64"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	localVarFormParams["number"] = a.Configuration.APIClient.ParameterToString(number, "")
	if localVarTempParam, localVarOk := localVarOptionals["float"].(float32); localVarOptionals != nil && localVarOk {
		localVarFormParams["float"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	localVarFormParams["double"] = a.Configuration.APIClient.ParameterToString(double, "")
	if localVarTempParam, localVarOk := localVarOptionals["string_"].(string); localVarOptionals != nil && localVarOk {
		localVarFormParams["string"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	localVarFormParams["pattern_without_delimiter"] = a.Configuration.APIClient.ParameterToString(patternWithoutDelimiter, "")
	localVarFormParams["byte"] = a.Configuration.APIClient.ParameterToString(byte_, "")
	if localVarTempParam, localVarOk := localVarOptionals["binary"].(string); localVarOptionals != nil && localVarOk {
		localVarFormParams["binary"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	if localVarTempParam, localVarOk := localVarOptionals["date"].(time.Time); localVarOptionals != nil && localVarOk {
		localVarFormParams["date"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	if localVarTempParam, localVarOk := localVarOptionals["dateTime"].(time.Time); localVarOptionals != nil && localVarOk {
		localVarFormParams["dateTime"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	if localVarTempParam, localVarOk := localVarOptionals["password"].(string); localVarOptionals != nil && localVarOk {
		localVarFormParams["password"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	if localVarTempParam, localVarOk := localVarOptionals["callback"].(string); localVarOptionals != nil && localVarOk {
		localVarFormParams["callback"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "TestEndpointParameters", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return localVarAPIResponse, err
	}
	return localVarAPIResponse, err
}

/**
 * To test enum parameters
 *
 * @param optional (nil or map[string]interface{}) with one or more of:
 *     @param "enumFormStringArray" ([]string) Form parameter enum test (string array)
 *     @param "enumFormString" (string) Form parameter enum test (string)
 *     @param "enumHeaderStringArray" ([]string) Header parameter enum test (string array)
 *     @param "enumHeaderString" (string) Header parameter enum test (string)
 *     @param "enumQueryStringArray" ([]string) Query parameter enum test (string array)
 *     @param "enumQueryString" (string) Query parameter enum test (string)
 *     @param "enumQueryInteger" (float32) Query parameter enum test (double)
 *     @param "enumQueryDouble" (float64) Query parameter enum test (double)
 * @return 
 */
func (a FakeApi) TestEnumParameters(localVarOptionals map[string]interface{}) (*APIResponse, error) {

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
	if localVarTempParam, localVarOk := localVarOptionals["enumQueryStringArray"].([]string); localVarOptionals != nil && localVarOk {
		localVarQueryParams.Add("enum_query_string_array", a.Configuration.APIClient.ParameterToString(localVarTempParam, "csv"))
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumQueryString"].(string); localVarOptionals != nil && localVarOk {
		localVarQueryParams.Add("enum_query_string", a.Configuration.APIClient.ParameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumQueryInteger"].(float32); localVarOptionals != nil && localVarOk {
		localVarQueryParams.Add("enum_query_integer", a.Configuration.APIClient.ParameterToString(localVarTempParam, ""))
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
	if localVarTempParam, localVarOk := localVarOptionals["enumHeaderStringArray"].([]string); localVarOptionals != nil && localVarOk {
		localVarHeaderParams["enum_header_string_array"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "csv")
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumHeaderString"].(string); localVarOptionals != nil && localVarOk {
		localVarHeaderParams["enum_header_string"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumFormStringArray"].([]string); localVarOptionals != nil && localVarOk {
		localVarFormParams["enum_form_string_array"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "csv")
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumFormString"].(string); localVarOptionals != nil && localVarOk {
		localVarFormParams["enum_form_string"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumQueryDouble"].(float64); localVarOptionals != nil && localVarOk {
		localVarFormParams["enum_query_double"] = a.Configuration.APIClient.ParameterToString(localVarTempParam, "")
	}
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	var localVarAPIResponse = &APIResponse{Operation: "TestEnumParameters", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	if err != nil {
		return localVarAPIResponse, err
	}
	return localVarAPIResponse, err
}

