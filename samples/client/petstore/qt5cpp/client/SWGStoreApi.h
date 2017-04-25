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

#ifndef _SWG_SWGStoreApi_H_
#define _SWG_SWGStoreApi_H_

#include "SWGHttpRequest.h"

#include <QMap>
#include <QString>
#include "SWGOrder.h"

#include <QObject>

namespace Swagger {

class SWGStoreApi: public QObject {
    Q_OBJECT

public:
    SWGStoreApi();
    SWGStoreApi(QString host, QString basePath);
    ~SWGStoreApi();

    QString host;
    QString basePath;

    void deleteOrder(QString* order_id);
    void getInventory();
    void getOrderById(QString* order_id);
    void placeOrder(SWGOrder body);
    
private:
    void deleteOrderCallback (HttpRequestWorker * worker);
    void getInventoryCallback (HttpRequestWorker * worker);
    void getOrderByIdCallback (HttpRequestWorker * worker);
    void placeOrderCallback (HttpRequestWorker * worker);
    
signals:
    void deleteOrderSignal();
    void getInventorySignal(QMap<QString, qint32>* summary);
    void getOrderByIdSignal(SWGOrder* summary);
    void placeOrderSignal(SWGOrder* summary);
    
};
}
#endif
