#import <Foundation/Foundation.h>
#import "SWGApi.h"

/**
* Swagger Petstore *_/ ' \" =end -- \\r\\n \\n \\r
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  *_/ ' \" =end --       
*
* OpenAPI spec version: 1.0.0 *_/ ' \" =end -- \\r\\n \\n \\r
* Contact: apiteam@swagger.io *_/ ' \" =end -- \\r\\n \\n \\r
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/



@interface SWGFakeApi: NSObject <SWGApi>

extern NSString* kSWGFakeApiErrorDomain;
extern NSInteger kSWGFakeApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// To test code injection *_/ ' \" =end -- \\r\\n \\n \\r
/// 
///
/// @param testCodeInjectEndRnNR To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r (optional)
/// 
///  code:400 message:"To test code injection *_/ ' \" =end -- \\r\\n \\n \\r"
///
/// @return 
-(NSURLSessionTask*) testCodeInjectEndRnNRWithTestCodeInjectEndRnNR: (NSString*) testCodeInjectEndRnNR
    completionHandler: (void (^)(NSError* error)) handler;



@end
