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



#include "ApiResponse.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

ApiResponse::ApiResponse()
{
    m_Code = 0;
    m_CodeIsSet = false;
    m_Type = U("");
    m_TypeIsSet = false;
    m_Message = U("");
    m_MessageIsSet = false;
}

ApiResponse::~ApiResponse()
{
}

void ApiResponse::validate()
{
    // TODO: implement validation
}

web::json::value ApiResponse::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CodeIsSet)
    {
        val[U("code")] = ModelBase::toJson(m_Code);
    }
    if(m_TypeIsSet)
    {
        val[U("type")] = ModelBase::toJson(m_Type);
    }
    if(m_MessageIsSet)
    {
        val[U("message")] = ModelBase::toJson(m_Message);
    }

    return val;
}

void ApiResponse::fromJson(web::json::value& val)
{
    if(val.has_field(U("code")))
    {
        setCode(ModelBase::int32_tFromJson(val[U("code")]));
    }
    if(val.has_field(U("type")))
    {
        setType(ModelBase::stringFromJson(val[U("type")]));
    }
    if(val.has_field(U("message")))
    {
        setMessage(ModelBase::stringFromJson(val[U("message")]));
    }
}

void ApiResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_CodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("code"), m_Code));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("type"), m_Type));
        
    }
    if(m_MessageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("message"), m_Message));
        
    }
}

void ApiResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("code")))
    {
        setCode(ModelBase::int32_tFromHttpContent(multipart->getContent(U("code"))));
    }
    if(multipart->hasContent(U("type")))
    {
        setType(ModelBase::stringFromHttpContent(multipart->getContent(U("type"))));
    }
    if(multipart->hasContent(U("message")))
    {
        setMessage(ModelBase::stringFromHttpContent(multipart->getContent(U("message"))));
    }
}

int32_t ApiResponse::getCode() const
{
    return m_Code;
}


void ApiResponse::setCode(int32_t value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool ApiResponse::codeIsSet() const
{
    return m_CodeIsSet;
}

void ApiResponse::unsetCode()
{
    m_CodeIsSet = false;
}

utility::string_t ApiResponse::getType() const
{
    return m_Type;
}


void ApiResponse::setType(utility::string_t value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool ApiResponse::typeIsSet() const
{
    return m_TypeIsSet;
}

void ApiResponse::unsetType()
{
    m_TypeIsSet = false;
}

utility::string_t ApiResponse::getMessage() const
{
    return m_Message;
}


void ApiResponse::setMessage(utility::string_t value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool ApiResponse::messageIsSet() const
{
    return m_MessageIsSet;
}

void ApiResponse::unsetMessage()
{
    m_MessageIsSet = false;
}

}
}
}
}

