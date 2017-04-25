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

#include "SWGStoreApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGStoreApi::SWGStoreApi() {}

SWGStoreApi::~SWGStoreApi() {}

SWGStoreApi::SWGStoreApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGStoreApi::deleteOrder(QString* order_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/store/order/{orderId}");

    QString order_idPathParam("{"); order_idPathParam.append("orderId").append("}");
    fullPath.replace(order_idPathParam, stringValue(order_id));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    



    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGStoreApi::deleteOrderCallback);

    worker->execute(&input);
}

void
SWGStoreApi::deleteOrderCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    

    worker->deleteLater();

    
    emit deleteOrderSignal();
}
void
SWGStoreApi::getInventory() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/store/inventory");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    



    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGStoreApi::getInventoryCallback);

    worker->execute(&input);
}

void
SWGStoreApi::getInventoryCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QMap<QString, qint32>* output = new QMap<QString, qint32>();

    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject obj = doc.object();

    foreach(QString key, obj.keys()) {
        qint32* val;
        setValue(&val, obj[key], "QMap", "");
        output->insert(key, *val);
    }


    

    worker->deleteLater();

    emit getInventorySignal(output);
    
}
void
SWGStoreApi::getOrderById(QString* order_id) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/store/order/{orderId}");

    QString order_idPathParam("{"); order_idPathParam.append("orderId").append("}");
    fullPath.replace(order_idPathParam, stringValue(order_id));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    



    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGStoreApi::getOrderByIdCallback);

    worker->execute(&input);
}

void
SWGStoreApi::getOrderByIdCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGOrder* output = static_cast<SWGOrder*>(create(json, QString("SWGOrder")));
    

    worker->deleteLater();

    emit getOrderByIdSignal(output);
    
}
void
SWGStoreApi::placeOrder(SWGOrder body) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/store/order");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    


    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGStoreApi::placeOrderCallback);

    worker->execute(&input);
}

void
SWGStoreApi::placeOrderCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGOrder* output = static_cast<SWGOrder*>(create(json, QString("SWGOrder")));
    

    worker->deleteLater();

    emit placeOrderSignal(output);
    
}
} /* namespace Swagger */
