/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * UserApi.h
 * 
 * 
 */
 
#ifndef UserApi_H_
#define UserApi_H_


#include "ApiClient.h"

#include "User.h"
#include <vector>
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  UserApi
{
public:
    UserApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~UserApi();
    /// <summary>
    /// Create user
    /// </summary>
    /// <remarks>
    /// This can only be done by the logged in user.
    /// </remarks>
    /// <param name="body">Created user object</param>
    pplx::task<void> createUser(std::shared_ptr<User> body);
    /// <summary>
    /// Creates list of users with given input array
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="body">List of user object</param>
    pplx::task<void> createUsersWithArrayInput(std::vector<std::shared_ptr<User>> body);
    /// <summary>
    /// Creates list of users with given input array
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="body">List of user object</param>
    pplx::task<void> createUsersWithListInput(std::vector<std::shared_ptr<User>> body);
    /// <summary>
    /// Delete user
    /// </summary>
    /// <remarks>
    /// This can only be done by the logged in user.
    /// </remarks>
    /// <param name="username">The name that needs to be deleted</param>
    pplx::task<void> deleteUser(utility::string_t username);
    /// <summary>
    /// Get user by user name
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="username">The name that needs to be fetched. Use user1 for testing. </param>
    pplx::task<std::shared_ptr<User>> getUserByName(utility::string_t username);
    /// <summary>
    /// Logs user into the system
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="username">The user name for login</param>/// <param name="password">The password for login in clear text</param>
    pplx::task<utility::string_t> loginUser(utility::string_t username, utility::string_t password);
    /// <summary>
    /// Logs out current logged in user session
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    
    pplx::task<void> logoutUser();
    /// <summary>
    /// Updated user
    /// </summary>
    /// <remarks>
    /// This can only be done by the logged in user.
    /// </remarks>
    /// <param name="username">name that need to be deleted</param>/// <param name="body">Updated user object</param>
    pplx::task<void> updateUser(utility::string_t username, std::shared_ptr<User> body);
    
protected:
    std::shared_ptr<ApiClient> m_ApiClient;    
};
    
}
}
}
}

#endif /* UserApi_H_ */

