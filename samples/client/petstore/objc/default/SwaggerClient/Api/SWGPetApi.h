#import <Foundation/Foundation.h>
#import "SWGPet.h"
#import "SWGApi.h"

/**
* Swagger Petstore
* This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
*
* OpenAPI spec version: 1.0.0
* Contact: apiteam@wordnik.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


@interface SWGPetApi: NSObject <SWGApi>

extern NSString* kSWGPetApiErrorDomain;
extern NSInteger kSWGPetApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// Add a new pet to the store
/// 
///
/// @param body Pet object that needs to be added to the store (optional)
/// 
///  code:405 message:"Invalid input"
///
/// @return 
-(NSNumber*) addPetWithBody: (SWGPet*) body
    completionHandler: (void (^)(NSError* error)) handler;


/// Deletes a pet
/// 
///
/// @param petId Pet id to delete
/// @param apiKey  (optional)
/// 
///  code:400 message:"Invalid pet value"
///
/// @return 
-(NSNumber*) deletePetWithPetId: (NSNumber*) petId
    apiKey: (NSString*) apiKey
    completionHandler: (void (^)(NSError* error)) handler;


/// Finds Pets by status
/// Multiple status values can be provided with comma seperated strings
///
/// @param status Status values that need to be considered for filter (optional) (default to available)
/// 
///  code:200 message:"successful operation",
///  code:400 message:"Invalid status value"
///
/// @return NSArray<SWGPet>*
-(NSNumber*) findPetsByStatusWithStatus: (NSArray<NSString*>*) status
    completionHandler: (void (^)(NSArray<SWGPet>* output, NSError* error)) handler;


/// Finds Pets by tags
/// Muliple tags can be provided with comma seperated strings. Use tag1, tag2, tag3 for testing.
///
/// @param tags Tags to filter by (optional)
/// 
///  code:200 message:"successful operation",
///  code:400 message:"Invalid tag value"
///
/// @return NSArray<SWGPet>*
-(NSNumber*) findPetsByTagsWithTags: (NSArray<NSString*>*) tags
    completionHandler: (void (^)(NSArray<SWGPet>* output, NSError* error)) handler;


/// Find pet by ID
/// Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error conditions
///
/// @param petId ID of pet that needs to be fetched
/// 
///  code:200 message:"successful operation",
///  code:400 message:"Invalid ID supplied",
///  code:404 message:"Pet not found"
///
/// @return SWGPet*
-(NSNumber*) getPetByIdWithPetId: (NSNumber*) petId
    completionHandler: (void (^)(SWGPet* output, NSError* error)) handler;


/// Update an existing pet
/// 
///
/// @param body Pet object that needs to be added to the store (optional)
/// 
///  code:400 message:"Invalid ID supplied",
///  code:404 message:"Pet not found",
///  code:405 message:"Validation exception"
///
/// @return 
-(NSNumber*) updatePetWithBody: (SWGPet*) body
    completionHandler: (void (^)(NSError* error)) handler;


/// Updates a pet in the store with form data
/// 
///
/// @param petId ID of pet that needs to be updated
/// @param name Updated name of the pet (optional)
/// @param status Updated status of the pet (optional)
/// 
///  code:405 message:"Invalid input"
///
/// @return 
-(NSNumber*) updatePetWithFormWithPetId: (NSString*) petId
    name: (NSString*) name
    status: (NSString*) status
    completionHandler: (void (^)(NSError* error)) handler;


/// uploads an image
/// 
///
/// @param petId ID of pet to update
/// @param additionalMetadata Additional data to pass to server (optional)
/// @param file file to upload (optional)
/// 
///  code:0 message:"successful operation"
///
/// @return 
-(NSNumber*) uploadFileWithPetId: (NSNumber*) petId
    additionalMetadata: (NSString*) additionalMetadata
    file: (NSURL*) file
    completionHandler: (void (^)(NSError* error)) handler;



@end
