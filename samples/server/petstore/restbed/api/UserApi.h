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


#include <memory>
#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

#include "User.h"
#include <string>
#include <vector>

namespace io {
namespace swagger {
namespace server {
namespace api {

using namespace io::swagger::server::model;

class  UserApi: public restbed::Service
{
public:
	UserApi();
	~UserApi();
	void startService(int const& port);
	void stopService();
};


/// <summary>
/// Create user
/// </summary>
/// <remarks>
/// This can only be done by the logged in user.
/// </remarks>
class  UserApiCreateUserResource: public restbed::Resource
{
public:
	UserApiCreateUserResource();
    virtual ~UserApiCreateUserResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Creates list of users with given input array
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  UserApiCreateUsersWithArrayInputResource: public restbed::Resource
{
public:
	UserApiCreateUsersWithArrayInputResource();
    virtual ~UserApiCreateUsersWithArrayInputResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Creates list of users with given input array
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  UserApiCreateUsersWithListInputResource: public restbed::Resource
{
public:
	UserApiCreateUsersWithListInputResource();
    virtual ~UserApiCreateUsersWithListInputResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Delete user
/// </summary>
/// <remarks>
/// This can only be done by the logged in user.
/// </remarks>
class  UserApiDeleteUserResource: public restbed::Resource
{
public:
	UserApiDeleteUserResource();
    virtual ~UserApiDeleteUserResource();
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
    void PUT_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Logs user into the system
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  UserApiLoginUserResource: public restbed::Resource
{
public:
	UserApiLoginUserResource();
    virtual ~UserApiLoginUserResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// Logs out current logged in user session
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  UserApiLogoutUserResource: public restbed::Resource
{
public:
	UserApiLogoutUserResource();
    virtual ~UserApiLogoutUserResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
};


}
}
}
}

#endif /* UserApi_H_ */

