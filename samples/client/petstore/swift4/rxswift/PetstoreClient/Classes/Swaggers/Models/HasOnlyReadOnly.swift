//
// HasOnlyReadOnly.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class HasOnlyReadOnly: Codable {

    public var bar: String?
    public var foo: String?

    public init() {}


    private enum CodingKeys: String, CodingKey { 
        case bar = "bar"
        case foo = "foo"
    }

}
