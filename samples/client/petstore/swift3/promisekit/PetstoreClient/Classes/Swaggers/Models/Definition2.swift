//
// Definition2.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


/** Definition 2 */
open class Definition2: JSONEncodable {
    /** nested Definition1 array */
    public var definition1: [Definition1]?
    /** Content Id for lookup */
    public var id: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["Definition1"] = self.definition1?.encodeToJSON()
        nillableDictionary["Id"] = self.id
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
