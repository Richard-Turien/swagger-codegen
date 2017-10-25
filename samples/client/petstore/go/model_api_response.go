/*
 * Swagger Petstore
 *
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

// Describes the result of uploading an image resource
type ModelApiResponse struct {

	Code int32 `json:"code,omitempty"`

	Type_ string `json:"type,omitempty"`

	Message string `json:"message,omitempty"`
}
