//
// ArrayTest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class ArrayTest: JSONEncodable {
    public enum ArrayOfEnum: String { 
        case upper = "UPPER"
        case lower = "lower"
    }
    public var arrayOfString: [String]?
    public var arrayArrayOfInteger: [[Int64]]?
    public var arrayArrayOfModel: [[ReadOnlyFirst]]?
    public var arrayOfEnum: [ArrayOfEnum]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["array_of_string"] = self.arrayOfString?.encodeToJSON()
        nillableDictionary["array_array_of_integer"] = self.arrayArrayOfInteger?.encodeToJSON()
        nillableDictionary["array_array_of_model"] = self.arrayArrayOfModel?.encodeToJSON()
        nillableDictionary["array_of_enum"] = self.arrayOfEnum?.map({$0.rawValue}).encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
