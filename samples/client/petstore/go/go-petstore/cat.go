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


type Cat struct {

	ClassName string `json:"className"`

	Color string `json:"color,omitempty"`

	Declawed bool `json:"declawed,omitempty"`
}
