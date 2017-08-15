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

#include "SWGPetApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {

SWGPetApi::SWGPetApi() {}

SWGPetApi::~SWGPetApi() {}

SWGPetApi::SWGPetApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGPetApi::addPet(Pet body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pet");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");


    QString output = body.asJson();
    input.request_body.append(output);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGPetApi::addPetCallback);

    worker->execute(&input);
}

void
SWGPetApi::addPetCallback(HttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit addPetSignal();
    } else {
        emit addPetSignalE(error_type, error_str);
    }
}

void
SWGPetApi::deletePet(qint64 pet_id, QString* api_key) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pet/{petId}");

    QString pet_idPathParam("{"); pet_idPathParam.append("petId").append("}");
    fullPath.replace(pet_idPathParam, stringValue(pet_id));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");




    if (api_key != nullptr) {
        input.headers.insert("api_key", "api_key");
    }

    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGPetApi::deletePetCallback);

    worker->execute(&input);
}

void
SWGPetApi::deletePetCallback(HttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit deletePetSignal();
    } else {
        emit deletePetSignalE(error_type, error_str);
    }
}

void
SWGPetApi::findPetsByStatus(QList<QString*>* status) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pet/findByStatus");




    if (status->size() > 0) {
      if (QString("csv").indexOf("multi") == 0) {
        foreach(QString* t, *status) {
          if (fullPath.indexOf("?") > 0)
            fullPath.append("&");
          else 
            fullPath.append("?");
          fullPath.append("status=").append(stringValue(t));
        }
      }
      else if (QString("csv").indexOf("ssv") == 0) {
        if (fullPath.indexOf("?") > 0)
          fullPath.append("&");
        else 
          fullPath.append("?");
        fullPath.append("status=");
        qint32 count = 0;
        foreach(QString* t, *status) {
          if (count > 0) {
            fullPath.append(" ");
          }
          fullPath.append(stringValue(t));
        }
      }
      else if (QString("csv").indexOf("tsv") == 0) {
        if (fullPath.indexOf("?") > 0)
          fullPath.append("&");
        else 
          fullPath.append("?");
        fullPath.append("status=");
        qint32 count = 0;
        foreach(QString* t, *status) {
          if (count > 0) {
            fullPath.append("\t");
          }
          fullPath.append(stringValue(t));
        }
      }
    }


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGPetApi::findPetsByStatusCallback);

    worker->execute(&input);
}

void
SWGPetApi::findPetsByStatusCallback(HttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QList<Pet*>* output = new QList<Pet*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();

    foreach(QJsonValue obj, jsonArray) {
        Pet* o = new Pet();
        QJsonObject jv = obj.toObject();
        QJsonObject * ptr = (QJsonObject*)&jv;
        o->fromJsonObject(*ptr);
        output->append(o);
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit findPetsByStatusSignal(output);
    } else {
        emit findPetsByStatusSignalE(output, error_type, error_str);
    }
}

void
SWGPetApi::findPetsByTags(QList<QString*>* tags) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pet/findByTags");




    if (tags->size() > 0) {
      if (QString("csv").indexOf("multi") == 0) {
        foreach(QString* t, *tags) {
          if (fullPath.indexOf("?") > 0)
            fullPath.append("&");
          else 
            fullPath.append("?");
          fullPath.append("tags=").append(stringValue(t));
        }
      }
      else if (QString("csv").indexOf("ssv") == 0) {
        if (fullPath.indexOf("?") > 0)
          fullPath.append("&");
        else 
          fullPath.append("?");
        fullPath.append("tags=");
        qint32 count = 0;
        foreach(QString* t, *tags) {
          if (count > 0) {
            fullPath.append(" ");
          }
          fullPath.append(stringValue(t));
        }
      }
      else if (QString("csv").indexOf("tsv") == 0) {
        if (fullPath.indexOf("?") > 0)
          fullPath.append("&");
        else 
          fullPath.append("?");
        fullPath.append("tags=");
        qint32 count = 0;
        foreach(QString* t, *tags) {
          if (count > 0) {
            fullPath.append("\t");
          }
          fullPath.append(stringValue(t));
        }
      }
    }


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGPetApi::findPetsByTagsCallback);

    worker->execute(&input);
}

void
SWGPetApi::findPetsByTagsCallback(HttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QList<Pet*>* output = new QList<Pet*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();

    foreach(QJsonValue obj, jsonArray) {
        Pet* o = new Pet();
        QJsonObject jv = obj.toObject();
        QJsonObject * ptr = (QJsonObject*)&jv;
        o->fromJsonObject(*ptr);
        output->append(o);
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit findPetsByTagsSignal(output);
    } else {
        emit findPetsByTagsSignalE(output, error_type, error_str);
    }
}

void
SWGPetApi::getPetById(qint64 pet_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pet/{petId}");

    QString pet_idPathParam("{"); pet_idPathParam.append("petId").append("}");
    fullPath.replace(pet_idPathParam, stringValue(pet_id));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGPetApi::getPetByIdCallback);

    worker->execute(&input);
}

void
SWGPetApi::getPetByIdCallback(HttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }


    QString json(worker->response);
    Pet* output = static_cast<Pet*>(create(json, QString("Pet")));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getPetByIdSignal(output);
    } else {
        emit getPetByIdSignalE(output, error_type, error_str);
    }
}

void
SWGPetApi::updatePet(Pet body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pet");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");


    QString output = body.asJson();
    input.request_body.append(output);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGPetApi::updatePetCallback);

    worker->execute(&input);
}

void
SWGPetApi::updatePetCallback(HttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit updatePetSignal();
    } else {
        emit updatePetSignalE(error_type, error_str);
    }
}

void
SWGPetApi::updatePetWithForm(qint64 pet_id, QString* name, QString* status) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pet/{petId}");

    QString pet_idPathParam("{"); pet_idPathParam.append("petId").append("}");
    fullPath.replace(pet_idPathParam, stringValue(pet_id));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    if (name != nullptr) {
        input.add_var("name", *name);
    }
    if (status != nullptr) {
        input.add_var("status", *status);
    }




    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGPetApi::updatePetWithFormCallback);

    worker->execute(&input);
}

void
SWGPetApi::updatePetWithFormCallback(HttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit updatePetWithFormSignal();
    } else {
        emit updatePetWithFormSignalE(error_type, error_str);
    }
}

void
SWGPetApi::uploadFile(qint64 pet_id, QString* additional_metadata, SWGHttpRequestInputFileElement* file) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/pet/{petId}/uploadImage");

    QString pet_idPathParam("{"); pet_idPathParam.append("petId").append("}");
    fullPath.replace(pet_idPathParam, stringValue(pet_id));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    if (additional_metadata != nullptr) {
        input.add_var("additionalMetadata", *additional_metadata);
    }
    if (file != nullptr) {
        input.add_file("file", (*file).local_filename, (*file).request_filename, (*file).mime_type);
    }




    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGPetApi::uploadFileCallback);

    worker->execute(&input);
}

void
SWGPetApi::uploadFileCallback(HttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }


    QString json(worker->response);
    ApiResponse* output = static_cast<ApiResponse*>(create(json, QString("ApiResponse")));
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit uploadFileSignal(output);
    } else {
        emit uploadFileSignalE(output, error_type, error_str);
    }
}


}
