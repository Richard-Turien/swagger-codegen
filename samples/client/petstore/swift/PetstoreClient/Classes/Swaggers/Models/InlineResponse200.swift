//
// InlineResponse200.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class InlineResponse200: JSONEncodable {

    public enum Status: String { 
        case Available = "available"
        case Pending = "pending"
        case Sold = "sold"
    }
    
    public var photoUrls: [String]?
    public var name: String?
    public var id: Int?
    public var category: AnyObject?
    public var tags: [Tag]?
    /** pet status in the store */
    public var status: Status?
    

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["photoUrls"] = self.photoUrls?.encodeToJSON()
        nillableDictionary["name"] = self.name
        nillableDictionary["id"] = self.id
        nillableDictionary["category"] = self.category
        nillableDictionary["tags"] = self.tags?.encodeToJSON()
        nillableDictionary["status"] = self.status?.rawValue
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
