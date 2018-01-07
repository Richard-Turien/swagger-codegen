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


#include "SWGCategory.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {

SWGCategory::SWGCategory(QString* json) {
    init();
    this->fromJson(*json);
}

SWGCategory::SWGCategory() {
    init();
}

SWGCategory::~SWGCategory() {
    this->cleanup();
}

void
SWGCategory::init() {
    id = 0L;
    m_id_isSet = false;
    name = new QString("");
    m_name_isSet = false;
}

void
SWGCategory::cleanup() {

    if(name != nullptr) {
        delete name;
    }
}

SWGCategory*
SWGCategory::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGCategory::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&id, pJson["id"], "qint64", "");
    ::Swagger::setValue(&name, pJson["name"], "QString", "QString");
}

QString
SWGCategory::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGCategory::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    if(m_id_isSet){
        obj->insert("id", QJsonValue(id));
    }
    if(name != nullptr && *name != QString("")){
        toJsonValue(QString("name"), name, obj, QString("QString"));
    }

    return obj;
}

qint64
SWGCategory::getId() {
    return id;
}
void
SWGCategory::setId(qint64 id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString*
SWGCategory::getName() {
    return name;
}
void
SWGCategory::setName(QString* name) {
    this->name = name;
    this->m_name_isSet = true;
}


bool 
SWGCategory::isSet(){
    bool isObjectUpdated = false;
    do{
        if(m_id_isSet){ isObjectUpdated = true; break;}
        if(name != nullptr && *name != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

