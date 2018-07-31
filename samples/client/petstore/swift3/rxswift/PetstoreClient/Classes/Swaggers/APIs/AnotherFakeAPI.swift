//
// AnotherFakeAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation
import Alamofire
import RxSwift


open class AnotherFakeAPI: APIBase {
    /**
     To test special tags
     - parameter body: (body) client model 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func testSpecialTags(body: Client, completion: @escaping ((_ data: Client?, _ error: ErrorResponse?) -> Void)) {
        testSpecialTagsWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }
    /**
     To test special tags
     - parameter body: (body) client model 
     - returns: Observable<Client>
     */
    open class func testSpecialTags(body: Client) -> Observable<Client> {
        return Observable.create { observer -> Disposable in
            testSpecialTags(body: body) { data, error in
                if let error = error {
                    observer.on(.error(error as Error))
                } else {
                    observer.on(.next(data!))
                }
                observer.on(.completed)
            }
            return Disposables.create()
        }
    }

    /**
     To test special tags
     - PATCH /another-fake/dummy
     - To test special tags
     - parameter body: (body) client model 
     - returns: RequestBuilder<Client> 
     */
    open class func testSpecialTagsWithRequestBuilder(body: Client) -> RequestBuilder<Client> {
        let path = "/another-fake/dummy"
        let URLString = PetstoreClientAPI.basePath + path
        let parameters = body.encodeToJSON()
        let url = URLComponents(string: URLString)
        let requestBuilder: RequestBuilder<Client>.Type = PetstoreClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PATCH", URLString: (url?.string ?? URLString), parameters: parameters, isBody: )
    }

}
