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
	"net/http"
	"strings"
	"golang.org/x/net/context"
	"time"
	"encoding/json"
)

// Linger please
var (
	_ context.Context
)

type FakeApiService service


/* FakeApiService To test \&quot;client\&quot; model
 To test \&quot;client\&quot; model

 @param body client model
 @return Client*/
func (a *FakeApiService) TestClientModel(body Client) (Client,  *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Patch")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	 	successPayload  Client
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &body
	r, err := a.client.prepareRequest(nil, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return successPayload, nil, err
	}

	 localVarHttpResponse, err := a.client.callAPI(r)
	 if err != nil || localVarHttpResponse == nil {
		  return successPayload, localVarHttpResponse, err
	 }
	 defer localVarHttpResponse.Body.Close()
	 if localVarHttpResponse.StatusCode >= 300 {
		return successPayload, localVarHttpResponse, reportError(localVarHttpResponse.Status)
	 }
	
	if err = json.NewDecoder(localVarHttpResponse.Body).Decode(&successPayload); err != nil {
	 	return successPayload, localVarHttpResponse, err
	}


	return successPayload, localVarHttpResponse, err
}

/* FakeApiService Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 * @param ctx context.Context Authentication Context 
 @param number None
 @param double None
 @param patternWithoutDelimiter None
 @param byte_ None
 @param optional (nil or map[string]interface{}) with one or more of:
     @param "integer" (int32) None
     @param "int32_" (int32) None
     @param "int64_" (int64) None
     @param "float" (float32) None
     @param "string_" (string) None
     @param "binary" (string) None
     @param "date" (time.Time) None
     @param "dateTime" (time.Time) None
     @param "password" (string) None
     @param "callback" (string) None
 @return */
func (a *FakeApiService) TestEndpointParameters(ctx context.Context, number float32, double float64, patternWithoutDelimiter string, byte_ string, localVarOptionals map[string]interface{}) ( *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if number < 32.1 {
			return nil, reportError("number must be greater than 32.1")
	}
	if number > 543.2 {
			return nil, reportError("number must be less than 543.2")
	}
	if double < 67.8 {
			return nil, reportError("double must be greater than 67.8")
	}
	if double > 123.4 {
			return nil, reportError("double must be less than 123.4")
	}
	if err := typeCheckParameter(localVarOptionals["integer"], "int32", "integer"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["int32_"], "int32", "int32_"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["int64_"], "int64", "int64_"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["float"], "float32", "float"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["string_"], "string", "string_"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["binary"], "string", "binary"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["date"], "time.Time", "date"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["dateTime"], "time.Time", "dateTime"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["password"], "string", "password"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["callback"], "string", "callback"); err != nil {
		return nil, err
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/xml; charset=utf-8", "application/json; charset=utf-8",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/xml; charset=utf-8",
		"application/json; charset=utf-8",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if localVarTempParam, localVarOk := localVarOptionals["integer"].(int32); localVarOk {
		localVarFormParams.Add("integer", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["int32_"].(int32); localVarOk {
		localVarFormParams.Add("int32", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["int64_"].(int64); localVarOk {
		localVarFormParams.Add("int64", parameterToString(localVarTempParam, ""))
	}
	localVarFormParams.Add("number", parameterToString(number, ""))
	if localVarTempParam, localVarOk := localVarOptionals["float"].(float32); localVarOk {
		localVarFormParams.Add("float", parameterToString(localVarTempParam, ""))
	}
	localVarFormParams.Add("double", parameterToString(double, ""))
	if localVarTempParam, localVarOk := localVarOptionals["string_"].(string); localVarOk {
		localVarFormParams.Add("string", parameterToString(localVarTempParam, ""))
	}
	localVarFormParams.Add("pattern_without_delimiter", parameterToString(patternWithoutDelimiter, ""))
	localVarFormParams.Add("byte", parameterToString(byte_, ""))
	if localVarTempParam, localVarOk := localVarOptionals["binary"].(string); localVarOk {
		localVarFormParams.Add("binary", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["date"].(time.Time); localVarOk {
		localVarFormParams.Add("date", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["dateTime"].(time.Time); localVarOk {
		localVarFormParams.Add("dateTime", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["password"].(string); localVarOk {
		localVarFormParams.Add("password", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["callback"].(string); localVarOk {
		localVarFormParams.Add("callback", parameterToString(localVarTempParam, ""))
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	 localVarHttpResponse, err := a.client.callAPI(r)
	 if err != nil || localVarHttpResponse == nil {
		  return localVarHttpResponse, err
	 }
	 defer localVarHttpResponse.Body.Close()
	 if localVarHttpResponse.StatusCode >= 300 {
		return localVarHttpResponse, reportError(localVarHttpResponse.Status)
	 }

	return localVarHttpResponse, err
}

/* FakeApiService To test enum parameters
 To test enum parameters

 @param optional (nil or map[string]interface{}) with one or more of:
     @param "enumFormStringArray" ([]string) Form parameter enum test (string array)
     @param "enumFormString" (string) Form parameter enum test (string)
     @param "enumHeaderStringArray" ([]string) Header parameter enum test (string array)
     @param "enumHeaderString" (string) Header parameter enum test (string)
     @param "enumQueryStringArray" ([]string) Query parameter enum test (string array)
     @param "enumQueryString" (string) Query parameter enum test (string)
     @param "enumQueryInteger" (int32) Query parameter enum test (double)
     @param "enumQueryDouble" (float64) Query parameter enum test (double)
 @return */
func (a *FakeApiService) TestEnumParameters(localVarOptionals map[string]interface{}) ( *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody interface{}
		localVarFileName string
		localVarFileBytes []byte
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if err := typeCheckParameter(localVarOptionals["enumFormString"], "string", "enumFormString"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["enumHeaderString"], "string", "enumHeaderString"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["enumQueryString"], "string", "enumQueryString"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["enumQueryInteger"], "int32", "enumQueryInteger"); err != nil {
		return nil, err
	}
	if err := typeCheckParameter(localVarOptionals["enumQueryDouble"], "float64", "enumQueryDouble"); err != nil {
		return nil, err
	}

	if localVarTempParam, localVarOk := localVarOptionals["enumQueryStringArray"].([]string); localVarOk {
		localVarQueryParams.Add("enum_query_string_array", parameterToString(localVarTempParam, "csv"))
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumQueryString"].(string); localVarOk {
		localVarQueryParams.Add("enum_query_string", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumQueryInteger"].(int32); localVarOk {
		localVarQueryParams.Add("enum_query_integer", parameterToString(localVarTempParam, ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "*/*",  }

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"*/*",
		}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumHeaderStringArray"].([]string); localVarOk {
		localVarHeaderParams["enum_header_string_array"] = parameterToString(localVarTempParam, "csv")
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumHeaderString"].(string); localVarOk {
		localVarHeaderParams["enum_header_string"] = parameterToString(localVarTempParam, "")
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumFormStringArray"].([]string); localVarOk {
		localVarFormParams.Add("enum_form_string_array", parameterToString(localVarTempParam, "csv"))
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumFormString"].(string); localVarOk {
		localVarFormParams.Add("enum_form_string", parameterToString(localVarTempParam, ""))
	}
	if localVarTempParam, localVarOk := localVarOptionals["enumQueryDouble"].(float64); localVarOk {
		localVarFormParams.Add("enum_query_double", parameterToString(localVarTempParam, ""))
	}
	r, err := a.client.prepareRequest(nil, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	 localVarHttpResponse, err := a.client.callAPI(r)
	 if err != nil || localVarHttpResponse == nil {
		  return localVarHttpResponse, err
	 }
	 defer localVarHttpResponse.Body.Close()
	 if localVarHttpResponse.StatusCode >= 300 {
		return localVarHttpResponse, reportError(localVarHttpResponse.Status)
	 }

	return localVarHttpResponse, err
}

