//
// ArrayOfNumberOnly.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class ArrayOfNumberOnly: NSObject, NSCoding ,JSONEncodable {

    public var arrayNumber: [Double]?

    public override init() {}


    public required init?(coder aDecoder: NSCoder){
        self.arrayNumber = aDecoder.decodeObject(forKey: "arrayNumber") as? [Double]
    }
    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["ArrayNumber"] = self.arrayNumber?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }

    public func encode(with aCoder: NSCoder) {
        aCoder.encode(arrayNumber, forKey: "arrayNumber")
    }
}
