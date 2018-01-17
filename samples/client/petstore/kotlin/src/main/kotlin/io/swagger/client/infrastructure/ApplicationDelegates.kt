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
package io.swagger.client.infrastructure

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

object ApplicationDelegates {
    /**
     * Provides a property delegate, allowing the property to be set once and only once.
     *
     * If unset (no default value), a get on the property will throw [IllegalStateException].
     */
    fun <T> setOnce(defaultValue: T? = null) : ReadWriteProperty<Any?, T> = SetOnce(defaultValue)

    private class SetOnce<T>(defaultValue: T? = null) : ReadWriteProperty<Any?, T> {
        private var isSet = false
        private var value: T? = defaultValue

        override fun getValue(thisRef: Any?, property: KProperty<*>): T {
            return value ?: throw IllegalStateException("${property.name} not initialized")
        }

        override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) = synchronized(this) {
            if (!isSet) {
                this.value = value
                isSet = true
            }
        }
    }
}