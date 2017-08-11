//
// ApiResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class ApiResponse: NSObject, NSCoding ,JSONEncodable {

    public var code: Int32?
    public var type: String?
    public var message: String?


    public init(code: Int32?=nil, type: String?=nil, message: String?=nil) {
        self.code = code
        self.type = type
        self.message = message
    }

    public required init?(coder aDecoder: NSCoder){
        self.code = aDecoder.decodeObject(forKey: "code") as? Int32
        self.type = aDecoder.decodeObject(forKey: "type") as? String
        self.message = aDecoder.decodeObject(forKey: "message") as? String
    }
    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["code"] = self.code?.encodeToJSON()
        nillableDictionary["type"] = self.type
        nillableDictionary["message"] = self.message

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }

    public func encode(with aCoder: NSCoder) {
        aCoder.encode(code, forKey: "code")
        aCoder.encode(type, forKey: "type")
        aCoder.encode(message, forKey: "message")
    }
}
