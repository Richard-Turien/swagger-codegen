/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package petstore

import (
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
	"time"
	"encoding/json"
)

// Linger please
var (
	_ context.Context
)

type FakeApiService service

/* 
FakeApiService
Test serialization of outer boolean types
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *FakeOuterBooleanSerializeOpts - Optional Parameters:
     * @param "Body" (optional.Interface of OuterBoolean) -  Input boolean as post body

@return OuterBoolean
*/

type FakeOuterBooleanSerializeOpts struct { 
	Body optional.Interface
}

func (a *FakeApiService) FakeOuterBooleanSerialize(ctx context.Context, localVarOptionals *FakeOuterBooleanSerializeOpts) (OuterBoolean, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue OuterBoolean
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake/outer/boolean"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	if localVarOptionals != nil && localVarOptionals.Body.IsSet() {
		
		localVarOptionalBody, localVarOptionalBodyok := localVarOptionals.Body.Value().(OuterBoolean)
		if !localVarOptionalBodyok {
				return localVarReturnValue, nil, reportError("body should be OuterBoolean")
		}
		localVarPostBody = &localVarOptionalBody
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		if localVarHttpResponse.StatusCode == 200 {
			var v OuterBoolean
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}

/* 
FakeApiService
Test serialization of object with outer number type
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *FakeOuterCompositeSerializeOpts - Optional Parameters:
     * @param "Body" (optional.Interface of OuterComposite) -  Input composite as post body

@return OuterComposite
*/

type FakeOuterCompositeSerializeOpts struct { 
	Body optional.Interface
}

func (a *FakeApiService) FakeOuterCompositeSerialize(ctx context.Context, localVarOptionals *FakeOuterCompositeSerializeOpts) (OuterComposite, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue OuterComposite
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake/outer/composite"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	if localVarOptionals != nil && localVarOptionals.Body.IsSet() {
		
		localVarOptionalBody, localVarOptionalBodyok := localVarOptionals.Body.Value().(OuterComposite)
		if !localVarOptionalBodyok {
				return localVarReturnValue, nil, reportError("body should be OuterComposite")
		}
		localVarPostBody = &localVarOptionalBody
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		if localVarHttpResponse.StatusCode == 200 {
			var v OuterComposite
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}

/* 
FakeApiService
Test serialization of outer number types
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *FakeOuterNumberSerializeOpts - Optional Parameters:
     * @param "Body" (optional.Interface of OuterNumber) -  Input number as post body

@return OuterNumber
*/

type FakeOuterNumberSerializeOpts struct { 
	Body optional.Interface
}

func (a *FakeApiService) FakeOuterNumberSerialize(ctx context.Context, localVarOptionals *FakeOuterNumberSerializeOpts) (OuterNumber, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue OuterNumber
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake/outer/number"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	if localVarOptionals != nil && localVarOptionals.Body.IsSet() {
		
		localVarOptionalBody, localVarOptionalBodyok := localVarOptionals.Body.Value().(OuterNumber)
		if !localVarOptionalBodyok {
				return localVarReturnValue, nil, reportError("body should be OuterNumber")
		}
		localVarPostBody = &localVarOptionalBody
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		if localVarHttpResponse.StatusCode == 200 {
			var v OuterNumber
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}

/* 
FakeApiService
Test serialization of outer string types
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *FakeOuterStringSerializeOpts - Optional Parameters:
     * @param "Body" (optional.Interface of OuterString) -  Input string as post body

@return OuterString
*/

type FakeOuterStringSerializeOpts struct { 
	Body optional.Interface
}

func (a *FakeApiService) FakeOuterStringSerialize(ctx context.Context, localVarOptionals *FakeOuterStringSerializeOpts) (OuterString, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue OuterString
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake/outer/string"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	if localVarOptionals != nil && localVarOptionals.Body.IsSet() {
		
		localVarOptionalBody, localVarOptionalBodyok := localVarOptionals.Body.Value().(OuterString)
		if !localVarOptionalBodyok {
				return localVarReturnValue, nil, reportError("body should be OuterString")
		}
		localVarPostBody = &localVarOptionalBody
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		if localVarHttpResponse.StatusCode == 200 {
			var v OuterString
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}

/* 
FakeApiService
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body
 * @param query


*/
func (a *FakeApiService) TestBodyWithQueryParams(ctx context.Context, body User, query string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Put")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake/body-with-query-params"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	localVarQueryParams.Add("query", parameterToString(query, ""))
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &body
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}

/* 
FakeApiService To test \&quot;client\&quot; model
To test \&quot;client\&quot; model
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param body client model

@return Client
*/
func (a *FakeApiService) TestClientModel(ctx context.Context, body Client) (Client, *http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Patch")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		localVarReturnValue Client
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &body
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarReturnValue, localVarHttpResponse, err
	}

	if localVarHttpResponse.StatusCode < 300 {
		// If we succeed, return the data, otherwise pass on to decode error.
		err = a.client.decode(&localVarReturnValue, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
		if err == nil { 
			return localVarReturnValue, localVarHttpResponse, err
		}
	}

	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		if localVarHttpResponse.StatusCode == 200 {
			var v Client
			err = a.client.decode(&v, localVarBody, localVarHttpResponse.Header.Get("Content-Type"));
				if err != nil {
					newErr.error = err.Error()
					return localVarReturnValue, localVarHttpResponse, newErr
				}
				newErr.model = v
				return localVarReturnValue, localVarHttpResponse, newErr
		}
		
		return localVarReturnValue, localVarHttpResponse, newErr
	}

	return localVarReturnValue, localVarHttpResponse, nil
}

/* 
FakeApiService Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param number None
 * @param double None
 * @param patternWithoutDelimiter None
 * @param byte_ None
 * @param optional nil or *TestEndpointParametersOpts - Optional Parameters:
     * @param "Integer" (optional.) -  None
     * @param "Int32_" (optional.) -  None
     * @param "Int64_" (optional.) -  None
     * @param "Float" (optional.) -  None
     * @param "String_" (optional.) -  None
     * @param "Binary" (optional.) -  None
     * @param "Date" (optional.) -  None
     * @param "DateTime" (optional.) -  None
     * @param "Password" (optional.) -  None
     * @param "Callback" (optional.) -  None


*/

type TestEndpointParametersOpts struct { 
	Integer optional.
	Int32_ optional.
	Int64_ optional.
	Float optional.
	String_ optional.
	Binary optional.
	Date optional.
	DateTime optional.
	Password optional.
	Callback optional.
}

func (a *FakeApiService) TestEndpointParameters(ctx context.Context, number float32, double float64, patternWithoutDelimiter string, byte_ string, localVarOptionals *TestEndpointParametersOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
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

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/xml; charset=utf-8", "application/json; charset=utf-8"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"application/xml; charset=utf-8", "application/json; charset=utf-8"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if localVarOptionals != nil && localVarOptionals.Integer.IsSet() {
		localVarFormParams.Add("integer", parameterToString(localVarOptionals.Integer.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Int32_.IsSet() {
		localVarFormParams.Add("int32", parameterToString(localVarOptionals.Int32_.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Int64_.IsSet() {
		localVarFormParams.Add("int64", parameterToString(localVarOptionals.Int64_.Value(), ""))
	}
	localVarFormParams.Add("number", parameterToString(number, ""))
	if localVarOptionals != nil && localVarOptionals.Float.IsSet() {
		localVarFormParams.Add("float", parameterToString(localVarOptionals.Float.Value(), ""))
	}
	localVarFormParams.Add("double", parameterToString(double, ""))
	if localVarOptionals != nil && localVarOptionals.String_.IsSet() {
		localVarFormParams.Add("string", parameterToString(localVarOptionals.String_.Value(), ""))
	}
	localVarFormParams.Add("pattern_without_delimiter", parameterToString(patternWithoutDelimiter, ""))
	localVarFormParams.Add("byte", parameterToString(byte_, ""))
	if localVarOptionals != nil && localVarOptionals.Binary.IsSet() {
		localVarFormParams.Add("binary", parameterToString(localVarOptionals.Binary.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Date.IsSet() {
		localVarFormParams.Add("date", parameterToString(localVarOptionals.Date.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.DateTime.IsSet() {
		localVarFormParams.Add("dateTime", parameterToString(localVarOptionals.DateTime.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Password.IsSet() {
		localVarFormParams.Add("password", parameterToString(localVarOptionals.Password.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.Callback.IsSet() {
		localVarFormParams.Add("callback", parameterToString(localVarOptionals.Callback.Value(), ""))
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}

/* 
FakeApiService To test enum parameters
To test enum parameters
 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param optional nil or *TestEnumParametersOpts - Optional Parameters:
     * @param "EnumFormStringArray" (optional.Interface of []string) -  Form parameter enum test (string array)
     * @param "EnumFormString" (optional.) -  Form parameter enum test (string)
     * @param "EnumHeaderStringArray" (optional.Interface of []string) -  Header parameter enum test (string array)
     * @param "EnumHeaderString" (optional.) -  Header parameter enum test (string)
     * @param "EnumQueryStringArray" (optional.Interface of []string) -  Query parameter enum test (string array)
     * @param "EnumQueryString" (optional.) -  Query parameter enum test (string)
     * @param "EnumQueryInteger" (optional.) -  Query parameter enum test (double)
     * @param "EnumQueryDouble" (optional.) -  Query parameter enum test (double)


*/

type TestEnumParametersOpts struct { 
	EnumFormStringArray optional.Interface
	EnumFormString optional.
	EnumHeaderStringArray optional.Interface
	EnumHeaderString optional.
	EnumQueryStringArray optional.Interface
	EnumQueryString optional.
	EnumQueryInteger optional.
	EnumQueryDouble optional.
}

func (a *FakeApiService) TestEnumParameters(ctx context.Context, localVarOptionals *TestEnumParametersOpts) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if localVarOptionals != nil && localVarOptionals.EnumQueryStringArray.IsSet() {
		localVarQueryParams.Add("enum_query_string_array", parameterToString(localVarOptionals.EnumQueryStringArray.Value(), "csv"))
	}
	if localVarOptionals != nil && localVarOptionals.EnumQueryString.IsSet() {
		localVarQueryParams.Add("enum_query_string", parameterToString(localVarOptionals.EnumQueryString.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnumQueryInteger.IsSet() {
		localVarQueryParams.Add("enum_query_integer", parameterToString(localVarOptionals.EnumQueryInteger.Value(), ""))
	}
	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"*/*"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{"*/*"}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if localVarOptionals != nil && localVarOptionals.EnumHeaderStringArray.IsSet() {
		localVarHeaderParams["enum_header_string_array"] = parameterToString(localVarOptionals.EnumHeaderStringArray.Value(), "csv")
	}
	if localVarOptionals != nil && localVarOptionals.EnumHeaderString.IsSet() {
		localVarHeaderParams["enum_header_string"] = parameterToString(localVarOptionals.EnumHeaderString.Value(), "")
	}
	if localVarOptionals != nil && localVarOptionals.EnumFormStringArray.IsSet() {
		localVarFormParams.Add("enum_form_string_array", parameterToString(localVarOptionals.EnumFormStringArray.Value(), "csv"))
	}
	if localVarOptionals != nil && localVarOptionals.EnumFormString.IsSet() {
		localVarFormParams.Add("enum_form_string", parameterToString(localVarOptionals.EnumFormString.Value(), ""))
	}
	if localVarOptionals != nil && localVarOptionals.EnumQueryDouble.IsSet() {
		localVarFormParams.Add("enum_query_double", parameterToString(localVarOptionals.EnumQueryDouble.Value(), ""))
	}
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}

/* 
FakeApiService test inline additionalProperties

 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param param request body


*/
func (a *FakeApiService) TestInlineAdditionalProperties(ctx context.Context, param interface{}) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Post")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake/inline-additionalProperties"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// body params
	localVarPostBody = &param
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}

/* 
FakeApiService test json serialization of form data

 * @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 * @param param field1
 * @param param2 field2


*/
func (a *FakeApiService) TestJsonFormData(ctx context.Context, param string, param2 string) (*http.Response, error) {
	var (
		localVarHttpMethod = strings.ToUpper("Get")
		localVarPostBody   interface{}
		localVarFileName   string
		localVarFileBytes  []byte
		
	)

	// create path and map variables
	localVarPath := a.client.cfg.BasePath + "/fake/jsonFormData"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{"application/json"}

	// set Content-Type header
	localVarHttpContentType := selectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}

	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{}

	// set Accept header
	localVarHttpHeaderAccept := selectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	localVarFormParams.Add("param", parameterToString(param, ""))
	localVarFormParams.Add("param2", parameterToString(param2, ""))
	r, err := a.client.prepareRequest(ctx, localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return nil, err
	}

	localVarHttpResponse, err := a.client.callAPI(r)
	if err != nil || localVarHttpResponse == nil {
		return localVarHttpResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHttpResponse.Body)
	localVarHttpResponse.Body.Close()
	if err != nil {
		return localVarHttpResponse, err
	}


	if localVarHttpResponse.StatusCode >= 300 {
		newErr := GenericSwaggerError{
			body: localVarBody,
			error: localVarHttpResponse.Status,
		}
		
		return localVarHttpResponse, newErr
	}

	return localVarHttpResponse, nil
}
