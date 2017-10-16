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


    public init(bar: String?, foo: String?) {
        self.bar = bar
        self.foo = foo
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {

        var container = encoder.container(keyedBy: String.self)

        try container.encodeIfPresent(bar, forKey: "bar")
        try container.encodeIfPresent(foo, forKey: "foo")
    }

    // Decodable protocol methods

    public required init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: String.self)

        bar = try container.decodeIfPresent(String.self, forKey: "bar")
        foo = try container.decodeIfPresent(String.self, forKey: "foo")
    }
}

