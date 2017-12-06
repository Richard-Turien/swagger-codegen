/*
 * Swagger Petstore
 *
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.WebUtilities;
using Microsoft.Extensions.Logging;
using Microsoft.Extensions.Primitives;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using IO.Swagger.Attributes;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    public class PetApiController : Controller
    { 
        /// <summary>
        /// Add a new pet to the store
        /// </summary>
        
        /// <param name="body">Pet object that needs to be added to the store</param>
        /// <response code="405">Invalid input</response>
        [HttpPost]
        [Route("/v2/pet")]
        [ValidateModelState]
        [SwaggerOperation("AddPet")]
        public virtual IActionResult AddPet(

[FromBody]Pet body

)
        { 
            //TODO: Uncomment the next line to return response 405 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(405);


            throw new NotImplementedException();
        }

        /// <summary>
        /// Deletes a pet
        /// </summary>
        
        /// <param name="petId">Pet id to delete</param>
        /// <param name="apiKey"></param>
        /// <response code="400">Invalid pet value</response>
        [HttpDelete]
        [Route("/v2/pet/{petId}")]
        [ValidateModelState]
        [SwaggerOperation("DeletePet")]
        public virtual IActionResult DeletePet([FromRoute][Required]long? petId



, 


[FromHeader]string apiKey
)
        { 
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);


            throw new NotImplementedException();
        }

        /// <summary>
        /// Finds Pets by status
        /// </summary>
        /// <remarks>Multiple status values can be provided with comma separated strings</remarks>
        /// <param name="status">Status values that need to be considered for filter</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid status value</response>
        [HttpGet]
        [Route("/v2/pet/findByStatus")]
        [ValidateModelState]
        [SwaggerOperation("FindPetsByStatus")]
        [SwaggerResponse(200, typeof(List<Pet>), "successful operation")]
        [SwaggerResponse(400, typeof(List<Pet>), "Invalid status value")]
        public virtual IActionResult FindPetsByStatus(
[FromQuery][Required()]List<string> status


)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Pet>));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            string exampleJson = null;
            exampleJson = "<Pet>\n  <id>123456789</id>\n  <name>doggie</name>\n  <photoUrls>\n    <photoUrls>aeiou</photoUrls>\n  </photoUrls>\n  <tags>\n  </tags>\n  <status>aeiou</status>\n</Pet>";
            exampleJson = "[ {\n  \"tags\" : [ {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  }, {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  } ],\n  \"id\" : 0,\n  \"category\" : {\n    \"id\" : 6,\n    \"name\" : \"name\"\n  },\n  \"status\" : \"available\",\n  \"name\" : \"doggie\",\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ]\n}, {\n  \"tags\" : [ {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  }, {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  } ],\n  \"id\" : 0,\n  \"category\" : {\n    \"id\" : 6,\n    \"name\" : \"name\"\n  },\n  \"status\" : \"available\",\n  \"name\" : \"doggie\",\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ]\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Pet>>(exampleJson)
            : default(List<Pet>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Finds Pets by tags
        /// </summary>
        /// <remarks>Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.</remarks>
        /// <param name="tags">Tags to filter by</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid tag value</response>
        [HttpGet]
        [Route("/v2/pet/findByTags")]
        [ValidateModelState]
        [SwaggerOperation("FindPetsByTags")]
        [SwaggerResponse(200, typeof(List<Pet>), "successful operation")]
        [SwaggerResponse(400, typeof(List<Pet>), "Invalid tag value")]
        public virtual IActionResult FindPetsByTags(
[FromQuery][Required()]List<string> tags


)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Pet>));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            string exampleJson = null;
            exampleJson = "<Pet>\n  <id>123456789</id>\n  <name>doggie</name>\n  <photoUrls>\n    <photoUrls>aeiou</photoUrls>\n  </photoUrls>\n  <tags>\n  </tags>\n  <status>aeiou</status>\n</Pet>";
            exampleJson = "[ {\n  \"tags\" : [ {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  }, {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  } ],\n  \"id\" : 0,\n  \"category\" : {\n    \"id\" : 6,\n    \"name\" : \"name\"\n  },\n  \"status\" : \"available\",\n  \"name\" : \"doggie\",\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ]\n}, {\n  \"tags\" : [ {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  }, {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  } ],\n  \"id\" : 0,\n  \"category\" : {\n    \"id\" : 6,\n    \"name\" : \"name\"\n  },\n  \"status\" : \"available\",\n  \"name\" : \"doggie\",\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ]\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Pet>>(exampleJson)
            : default(List<Pet>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Find pet by ID
        /// </summary>
        /// <remarks>Returns a single pet</remarks>
        /// <param name="petId">ID of pet to return</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Pet not found</response>
        [HttpGet]
        [Route("/v2/pet/{petId}")]
        [ValidateModelState]
        [SwaggerOperation("GetPetById")]
        [SwaggerResponse(200, typeof(Pet), "successful operation")]
        [SwaggerResponse(400, typeof(Pet), "Invalid ID supplied")]
        [SwaggerResponse(404, typeof(Pet), "Pet not found")]
        public virtual IActionResult GetPetById([FromRoute][Required]long? petId



)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Pet));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            string exampleJson = null;
            exampleJson = "<Pet>\n  <id>123456789</id>\n  <name>doggie</name>\n  <photoUrls>\n    <photoUrls>aeiou</photoUrls>\n  </photoUrls>\n  <tags>\n  </tags>\n  <status>aeiou</status>\n</Pet>";
            exampleJson = "{\n  \"tags\" : [ {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  }, {\n    \"id\" : 1,\n    \"name\" : \"name\"\n  } ],\n  \"id\" : 0,\n  \"category\" : {\n    \"id\" : 6,\n    \"name\" : \"name\"\n  },\n  \"status\" : \"available\",\n  \"name\" : \"doggie\",\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Pet>(exampleJson)
            : default(Pet);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update an existing pet
        /// </summary>
        
        /// <param name="body">Pet object that needs to be added to the store</param>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Pet not found</response>
        /// <response code="405">Validation exception</response>
        [HttpPut]
        [Route("/v2/pet")]
        [ValidateModelState]
        [SwaggerOperation("UpdatePet")]
        public virtual IActionResult UpdatePet(

[FromBody]Pet body

)
        { 
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            //TODO: Uncomment the next line to return response 405 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(405);


            throw new NotImplementedException();
        }

        /// <summary>
        /// Updates a pet in the store with form data
        /// </summary>
        
        /// <param name="petId">ID of pet that needs to be updated</param>
        /// <param name="name">Updated name of the pet</param>
        /// <param name="status">Updated status of the pet</param>
        /// <response code="405">Invalid input</response>
        [HttpPost]
        [Route("/v2/pet/{petId}")]
        [ValidateModelState]
        [SwaggerOperation("UpdatePetWithForm")]
        public virtual IActionResult UpdatePetWithForm([FromRoute][Required]long? petId



, 

[FromForm]string name

, 

[FromForm]string status

)
        { 
            //TODO: Uncomment the next line to return response 405 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(405);


            throw new NotImplementedException();
        }

        /// <summary>
        /// uploads an image
        /// </summary>
        
        /// <param name="petId">ID of pet to update</param>
        /// <param name="additionalMetadata">Additional data to pass to server</param>
        /// <param name="file">file to upload</param>
        /// <response code="200">successful operation</response>
        [HttpPost]
        [Route("/v2/pet/{petId}/uploadImage")]
        [ValidateModelState]
        [SwaggerOperation("UploadFile")]
        [SwaggerResponse(200, typeof(ApiResponse), "successful operation")]
        public virtual IActionResult UploadFile([FromRoute][Required]long? petId



, 

[FromForm]string additionalMetadata

, 

[FromForm]System.IO.Stream file

)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ApiResponse));

            string exampleJson = null;
            exampleJson = "{\n  \"message\" : \"message\",\n  \"code\" : 0,\n  \"type\" : \"type\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ApiResponse>(exampleJson)
            : default(ApiResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
