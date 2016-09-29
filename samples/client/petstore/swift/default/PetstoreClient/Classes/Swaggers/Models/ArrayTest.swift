//
// ArrayTest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class ArrayTest: JSONEncodable {
    public var arrayOfString: [String]?
    public var arrayArrayOfInteger: [[Int64]]?
    public var arrayArrayOfModel: [[ReadOnlyFirst]]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["array_of_string"] = self.arrayOfString?.encodeToJSON()
        nillableDictionary["array_array_of_integer"] = self.arrayArrayOfInteger?.encodeToJSON()
        nillableDictionary["array_array_of_model"] = self.arrayArrayOfModel?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
