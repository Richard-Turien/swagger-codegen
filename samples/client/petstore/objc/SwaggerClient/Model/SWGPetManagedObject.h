#import <Foundation/Foundation.h>
#import <CoreData/CoreData.h>

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

#import "SWGCategoryManagedObject.h"
#import "SWGTagManagedObject.h"


NS_ASSUME_NONNULL_BEGIN

@interface SWGPetManagedObject : NSManagedObject


@property (nullable, nonatomic, retain) NSNumber* _id;

@property (nullable, nonatomic, retain) SWGCategoryManagedObject* category;

@property (nullable, nonatomic, retain) NSString* name;

@property (nullable, nonatomic, retain) NSArray<NSString*>* photoUrls;

@property (nullable, nonatomic, retain) NSSet<SWGTagManagedObject*>* tags;
/* pet status in the store [optional]
 */
@property (nullable, nonatomic, retain) NSString* status;
@end

@interface SWGPetManagedObject (GeneratedAccessors)
- (void)addTagsObject:(SWGTagManagedObject *)value;
- (void)removeTagsObject:(SWGTagManagedObject *)value;
- (void)addTags:(NSSet<SWGTagManagedObject*> *)values;
- (void)removeTags:(NSSet<SWGTagManagedObject*> *)values;

@end


NS_ASSUME_NONNULL_END
