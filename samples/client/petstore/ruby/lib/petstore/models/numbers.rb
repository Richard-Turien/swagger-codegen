=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.30-SNAPSHOT

=end

require 'date'

module Petstore
  class Numbers
    
    N7 = 7.freeze
    N8 = 8.freeze
    N9 = 9.freeze
    N10 = 10.freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = Numbers.constants.select { |c| Numbers::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #Numbers" if constantValues.empty?
      value
    end
  end
end
