//
// FormatTest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct FormatTest: Codable {

    public var integer: Int?
    public var integerNum: NSNumber? {
        get {
            return integer.map({ return NSNumber(value: $0) })
        }
    }
    public var int32: Int?
    public var int32Num: NSNumber? {
        get {
            return int32.map({ return NSNumber(value: $0) })
        }
    }
    public var int64: Int64?
    public var int64Num: NSNumber? {
        get {
            return int64.map({ return NSNumber(value: $0) })
        }
    }
    public var number: Double?
    public var float: Float?
    public var floatNum: NSNumber? {
        get {
            return float.map({ return NSNumber(value: $0) })
        }
    }
    public var double: Double?
    public var doubleNum: NSNumber? {
        get {
            return double.map({ return NSNumber(value: $0) })
        }
    }
    public var string: String?
    public var byte: Data?
    public var binary: Data?
    public var date: Date?
    public var dateTime: Date?
    public var uuid: UUID?
    public var password: String?

    public init(integer: Int?, int32: Int?, int64: Int64?, number: Double?, float: Float?, double: Double?, string: String?, byte: Data?, binary: Data?, date: Date?, dateTime: Date?, uuid: UUID?, password: String?) {
        self.integer = integer
        self.int32 = int32
        self.int64 = int64
        self.number = number
        self.float = float
        self.double = double
        self.string = string
        self.byte = byte
        self.binary = binary
        self.date = date
        self.dateTime = dateTime
        self.uuid = uuid
        self.password = password
    }


}

