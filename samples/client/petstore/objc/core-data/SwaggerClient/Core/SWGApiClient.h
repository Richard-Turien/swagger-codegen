#import <AFNetworking/AFNetworking.h>
#import "SWGConfiguration.h"
#import "SWGResponseDeserializer.h"
#import "SWGSanitizer.h"

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
*/


/**
 * A key for `NSError` user info dictionaries.
 *
 * The corresponding value is the parsed response body for an HTTP error.
 */
extern NSString *const SWGResponseObjectErrorKey;


@interface SWGApiClient : AFHTTPSessionManager

@property (nonatomic, strong, readonly) id<SWGConfiguration> configuration;

@property(nonatomic, assign) NSTimeInterval timeoutInterval;

@property(nonatomic, strong) id<SWGResponseDeserializer> responseDeserializer;

@property(nonatomic, strong) id<SWGSanitizer> sanitizer;

@property (nonatomic, strong) NSDictionary< NSString *, AFHTTPRequestSerializer <AFURLRequestSerialization> *>* requestSerializerForContentType;

/**
 * Gets client singleton instance
 */
+ (instancetype) sharedClient;


/**
 * Updates header parameters and query parameters for authentication
 *
 * @param headers The header parameter will be udpated, passed by pointer to pointer.
 * @param querys The query parameters will be updated, passed by pointer to pointer.
 * @param authSettings The authentication names NSArray.
 */
- (void) updateHeaderParams:(NSDictionary **)headers queryParams:(NSDictionary **)querys WithAuthSettings:(NSArray *)authSettings;

/**
 * Initializes the session manager with a configuration.
 *
 * @param configuration The configuration implementation
 */
- (instancetype)initWithConfiguration:(id<SWGConfiguration>)configuration;

/**
* Initializes the session manager with a configuration and url
*
* @param url The base url
* @param configuration The configuration implementation
*/
- (instancetype)initWithBaseURL:(NSURL *)url configuration:(id<SWGConfiguration>)configuration;

/**
 * Performs request
 *
 * @param path Request url.
 * @param method Request method.
 * @param pathParams Request path parameters.
 * @param queryParams Request query parameters.
 * @param body Request body.
 * @param headerParams Request header parameters.
 * @param authSettings Request authentication names.
 * @param requestContentType Request content-type.
 * @param responseContentType Response content-type.
 * @param completionBlock The block will be executed when the request completed.
 *
 * @return The created session task.
 */
- (NSURLSessionTask*) requestWithPath: (NSString*) path
                               method: (NSString*) method
                           pathParams: (NSDictionary *) pathParams
                          queryParams: (NSDictionary*) queryParams
                           formParams: (NSDictionary *) formParams
                                files: (NSDictionary *) files
                                 body: (id) body
                         headerParams: (NSDictionary*) headerParams
                         authSettings: (NSArray *) authSettings
                   requestContentType: (NSString*) requestContentType
                  responseContentType: (NSString*) responseContentType
                         responseType: (NSString *) responseType
                      completionBlock: (void (^)(id, NSError *))completionBlock;

@end
