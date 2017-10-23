// APIs.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation

open class PetstoreClientAPI {
    open static var basePath = "http://petstore.swagger.io:80/v2"
    open static var credential: URLCredential?
    open static var customHeaders: [String:String] = [:]
    open static var requestBuilderFactory: RequestBuilderFactory = AlamofireRequestBuilderFactory()
}

open class APIBase {
    func toParameters(_ encodable: JSONEncodable?) -> [String: Any]? {
        let encoded: Any? = encodable?.encodeToJSON()

        if encoded! is [Any] {
            var dictionary = [String:Any]()
            for (index, item) in (encoded as! [Any]).enumerated() {
                dictionary["\(index)"] = item
            }
            return dictionary
        } else {
            return encoded as? [String:Any]
        }
    }
}

open class RequestBuilder<T> {
    var credential: URLCredential?
    var headers: [String:String]
    let parameters: Any?
    let isBody: Bool
    let method: String
    let URLString: String

    /// Optional block to obtain a reference to the request's progress instance when available.
    public var onProgressReady: ((Progress) -> ())?

    required public init(method: String, URLString: String, parameters: Any?, isBody: Bool, headers: [String:String] = [:]) {
        self.method = method
        self.URLString = URLString
        self.parameters = parameters
        self.isBody = isBody
        self.headers = headers

        addHeaders(PetstoreClientAPI.customHeaders)
    }

    open func addHeaders(_ aHeaders:[String:String]) {
        for (header, value) in aHeaders {
            addHeader(name: header, value: value)
        }
    }

    open func execute(_ completion: @escaping (_ response: Response<T>?, _ error: ErrorResponse?) -> Void) { }

    @discardableResult public func addHeader(name: String, value: String) -> Self {
        if !value.isEmpty {
            headers[name] = value
        }
        return self
    }

    open func addCredential() -> Self {
        self.credential = PetstoreClientAPI.credential
        return self
    }
}

public protocol RequestBuilderFactory {
    func getBuilder<T>() -> RequestBuilder<T>.Type
}

