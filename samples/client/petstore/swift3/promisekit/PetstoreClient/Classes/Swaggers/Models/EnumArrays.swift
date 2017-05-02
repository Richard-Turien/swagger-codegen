//
// EnumArrays.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class EnumArrays: JSONEncodable {
    public enum JustSymbol: String { 
        case greaterThanOrEqualTo = ">="
        case dollar = "$"
    }
    public enum ArrayEnum: String { 
        case fish = "fish"
        case crab = "crab"
    }
    public enum ArrayArrayEnum: String { 
        case cat = "Cat"
        case dog = "Dog"
    }
    public var justSymbol: JustSymbol?
    public var arrayEnum: [ArrayEnum]?
    public var arrayArrayEnum: [[ArrayArrayEnum]]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["just_symbol"] = self.justSymbol?.rawValue
        nillableDictionary["array_enum"] = self.arrayEnum?.map({$0.rawValue}).encodeToJSON()
        nillableDictionary["array_array_enum"] = self.arrayArrayEnum?.map({$0.rawValue}).encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
