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
	"os"
	"io/ioutil"
	"encoding/json"
	"fmt"
)

type PetApi struct {
	Configuration *Configuration
}

func NewPetApi() *PetApi {
	configuration := NewConfiguration()
	return &PetApi{
		Configuration: configuration,
	}
}

func NewPetApiWithBasePath(basePath string) *PetApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &PetApi{
		Configuration: configuration,
	}
}

/**
 * Add a new pet to the store
 * 
 *
 * @param body *Pet (required) Pet object that needs to be added to the store
 * @return void
 */
func (a PetApi) AddPet(params map[string]interface{}) (localVarAPIResponse *APIResponse, err error) {

	var body *Pet
	if params["body"] == nil {
		err = fmt.Errorf("Param 'body' is required")	
		return
	} else {
		var ok bool
		body, ok = params["body"].(*Pet)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'body', must be '*Pet'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Post")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/pet"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(petstore_auth)' required
	// oauth required
	if a.Configuration.AccessToken != ""{
		localVarHeaderParams["Authorization"] =  "Bearer " + a.Configuration.AccessToken
	}
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/xml",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/xml",
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
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "AddPet", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	return localVarAPIResponse, err
}

/**
 * Deletes a pet
 * 
 *
 * @param petId int64 (required) Pet id to delete
 * @param api_key string 
 * @return void
 */
func (a PetApi) DeletePet(params map[string]interface{}) (localVarAPIResponse *APIResponse, err error) {

	var petId int64
	if params["petId"] == nil {
		err = fmt.Errorf("Param 'petId' is required")	
		return
	} else {
		var ok bool
		petId, ok = params["petId"].(int64)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'petId', must be 'int64'")
			return
		}
	}
	var apiKey string
	if params["api_key"] != nil {
		var ok bool
		apiKey, ok = params["api_key"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'api_key', must be 'string'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Delete")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/pet/{petId}"
	if params["petId"] != nil {
		localVarPath = strings.Replace(localVarPath, "{"+"petId"+"}", a.Configuration.APIClient.ParameterToString(
			petId, ""), -1)
	}

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(petstore_auth)' required
	// oauth required
	if a.Configuration.AccessToken != ""{
		localVarHeaderParams["Authorization"] =  "Bearer " + a.Configuration.AccessToken
	}
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/xml",
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	// header params "api_key"
	if params["api_key"] != nil {
		localVarHeaderParams["api_key"] = a.Configuration.APIClient.ParameterToString(apiKey, "")
	}
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "DeletePet", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	return localVarAPIResponse, err
}

/**
 * Finds Pets by status
 * Multiple status values can be provided with comma separated strings
 *
 * @param status []string (required) Status values that need to be considered for filter
 * @return []Pet
 */
func (a PetApi) FindPetsByStatus(params map[string]interface{}) (successPayload []Pet, localVarAPIResponse *APIResponse, err error) {

	var status []string
	if params["status"] == nil {
		err = fmt.Errorf("Param 'status' is required")	
		return
	} else {
		var ok bool
		status, ok = params["status"].([]string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'status', must be '[]string'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/pet/findByStatus"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(petstore_auth)' required
	// oauth required
	if a.Configuration.AccessToken != ""{
		localVarHeaderParams["Authorization"] =  "Bearer " + a.Configuration.AccessToken
	}
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}
	var collectionFormat = "csv"
	if collectionFormat == "multi" && params["status"] != nil {
		for _, value := range status {
			localVarQueryParams.Add("status", fmt.Sprintf("%v", value))
		}
	} else if params["status"] != nil {
		localVarQueryParams.Add("status", a.Configuration.APIClient.ParameterToString(status, collectionFormat))
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/xml",
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	successPayload = new([]Pet)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "FindPetsByStatus", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return *successPayload, localVarAPIResponse, err
}

/**
 * Finds Pets by tags
 * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
 *
 * @param tags []string (required) Tags to filter by
 * @return []Pet
 */
func (a PetApi) FindPetsByTags(params map[string]interface{}) (successPayload []Pet, localVarAPIResponse *APIResponse, err error) {

	var tags []string
	if params["tags"] == nil {
		err = fmt.Errorf("Param 'tags' is required")	
		return
	} else {
		var ok bool
		tags, ok = params["tags"].([]string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'tags', must be '[]string'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/pet/findByTags"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(petstore_auth)' required
	// oauth required
	if a.Configuration.AccessToken != ""{
		localVarHeaderParams["Authorization"] =  "Bearer " + a.Configuration.AccessToken
	}
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}
	var collectionFormat = "csv"
	if collectionFormat == "multi" && params["tags"] != nil {
		for _, value := range tags {
			localVarQueryParams.Add("tags", fmt.Sprintf("%v", value))
		}
	} else if params["tags"] != nil {
		localVarQueryParams.Add("tags", a.Configuration.APIClient.ParameterToString(tags, collectionFormat))
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/xml",
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	successPayload = new([]Pet)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "FindPetsByTags", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return *successPayload, localVarAPIResponse, err
}

/**
 * Find pet by ID
 * Returns a single pet
 *
 * @param petId int64 (required) ID of pet to return
 * @return *Pet
 */
func (a PetApi) GetPetById(params map[string]interface{}) (successPayload *Pet, localVarAPIResponse *APIResponse, err error) {

	var petId int64
	if params["petId"] == nil {
		err = fmt.Errorf("Param 'petId' is required")	
		return
	} else {
		var ok bool
		petId, ok = params["petId"].(int64)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'petId', must be 'int64'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Get")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/pet/{petId}"
	if params["petId"] != nil {
		localVarPath = strings.Replace(localVarPath, "{"+"petId"+"}", a.Configuration.APIClient.ParameterToString(
			petId, ""), -1)
	}

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(api_key)' required
	// set key with prefix in header
	localVarHeaderParams["api_key"] = a.Configuration.GetAPIKeyWithPrefix("api_key")
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/xml",
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	successPayload = new(Pet)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "GetPetById", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

/**
 * Update an existing pet
 * 
 *
 * @param body *Pet (required) Pet object that needs to be added to the store
 * @return void
 */
func (a PetApi) UpdatePet(params map[string]interface{}) (localVarAPIResponse *APIResponse, err error) {

	var body *Pet
	if params["body"] == nil {
		err = fmt.Errorf("Param 'body' is required")	
		return
	} else {
		var ok bool
		body, ok = params["body"].(*Pet)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'body', must be '*Pet'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Put")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/pet"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(petstore_auth)' required
	// oauth required
	if a.Configuration.AccessToken != ""{
		localVarHeaderParams["Authorization"] =  "Bearer " + a.Configuration.AccessToken
	}
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json", "application/xml",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/xml",
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
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "UpdatePet", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	return localVarAPIResponse, err
}

/**
 * Updates a pet in the store with form data
 * 
 *
 * @param petId int64 (required) ID of pet that needs to be updated
 * @param name string Updated name of the pet
 * @param status string Updated status of the pet
 * @return void
 */
func (a PetApi) UpdatePetWithForm(params map[string]interface{}) (localVarAPIResponse *APIResponse, err error) {

	var petId int64
	if params["petId"] == nil {
		err = fmt.Errorf("Param 'petId' is required")	
		return
	} else {
		var ok bool
		petId, ok = params["petId"].(int64)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'petId', must be 'int64'")
			return
		}
	}
	var name string
	if params["name"] != nil {
		var ok bool
		name, ok = params["name"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'name', must be 'string'")
			return
		}
	}
	var status string
	if params["status"] != nil {
		var ok bool
		status, ok = params["status"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'status', must be 'string'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Post")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/pet/{petId}"
	if params["petId"] != nil {
		localVarPath = strings.Replace(localVarPath, "{"+"petId"+"}", a.Configuration.APIClient.ParameterToString(
			petId, ""), -1)
	}

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(petstore_auth)' required
	// oauth required
	if a.Configuration.AccessToken != ""{
		localVarHeaderParams["Authorization"] =  "Bearer " + a.Configuration.AccessToken
	}
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/x-www-form-urlencoded",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/xml",
		"application/json",
		}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHttpHeaderAccept
	}
	if params["name"] != nil {
		localVarFormParams["name"] = a.Configuration.APIClient.ParameterToString(name, "")
	}
	if params["status"] != nil {
		localVarFormParams["status"] = a.Configuration.APIClient.ParameterToString(status, "")
	}
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "UpdatePetWithForm", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	return localVarAPIResponse, err
}

/**
 * uploads an image
 * 
 *
 * @param petId int64 (required) ID of pet to update
 * @param additionalMetadata string Additional data to pass to server
 * @param file **os.File file to upload
 * @return *ModelApiResponse
 */
func (a PetApi) UploadFile(params map[string]interface{}) (successPayload *ModelApiResponse, localVarAPIResponse *APIResponse, err error) {

	var petId int64
	if params["petId"] == nil {
		err = fmt.Errorf("Param 'petId' is required")	
		return
	} else {
		var ok bool
		petId, ok = params["petId"].(int64)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'petId', must be 'int64'")
			return
		}
	}
	var additionalMetadata string
	if params["additionalMetadata"] != nil {
		var ok bool
		additionalMetadata, ok = params["additionalMetadata"].(string)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'additionalMetadata', must be 'string'")
			return
		}
	}
	var file **os.File
	if params["file"] != nil {
		var ok bool
		file, ok = params["file"].(**os.File)
		if !ok {
			err = fmt.Errorf("Invalid type for param 'file', must be '**os.File'")
			return
		}
	}

	var localVarHttpMethod = strings.ToUpper("Post")
	// create path and map variables
	localVarPath := a.Configuration.BasePath + "/pet/{petId}/uploadImage"
	if params["petId"] != nil {
		localVarPath = strings.Replace(localVarPath, "{"+"petId"+"}", a.Configuration.APIClient.ParameterToString(
			petId, ""), -1)
	}

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := make(map[string]string)
	var localVarPostBody interface{}
	var localVarFileName string
	var localVarFileBytes []byte
	// authentication '(petstore_auth)' required
	// oauth required
	if a.Configuration.AccessToken != ""{
		localVarHeaderParams["Authorization"] =  "Bearer " + a.Configuration.AccessToken
	}
	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		localVarHeaderParams[key] = a.Configuration.DefaultHeader[key]
	}

	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "multipart/form-data",  }

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
	if params["additionalMetadata"] != nil {
		localVarFormParams["additionalMetadata"] = a.Configuration.APIClient.ParameterToString(additionalMetadata, "")
	}
	fbs, _ := ioutil.ReadAll(file)
	localVarFileBytes = fbs
	localVarFileName = file.Name()
	successPayload = new(ModelApiResponse)
	localVarHttpResponse, err := a.Configuration.APIClient.CallAPI(localVarPath, localVarHttpMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, localVarFileName, localVarFileBytes)
	if err != nil {
		return
	}

	var localVarURL, _ = url.Parse(localVarPath)
	localVarURL.RawQuery = localVarQueryParams.Encode()
	localVarAPIResponse = &APIResponse{Operation: "UploadFile", Method: localVarHttpMethod, RequestURL: localVarURL.String()}
	if localVarHttpResponse != nil {
		localVarAPIResponse.Response = localVarHttpResponse.RawResponse
		localVarAPIResponse.Payload = localVarHttpResponse.Body()
	}

	err = json.Unmarshal(localVarHttpResponse.Body(), &successPayload)
	return successPayload, localVarAPIResponse, err
}

