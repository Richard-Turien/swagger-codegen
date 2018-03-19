/* 
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// EnumTest
    /// </summary>
    [DataContract]
    public partial class EnumTest :  IEquatable<EnumTest>
    {
        /// <summary>
        /// Defines EnumString
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EnumStringEnum
        {
            
            /// <summary>
            /// Enum UPPER for value: UPPER
            /// </summary>
            [EnumMember(Value = "UPPER")]
            UPPER = 1,
            
            /// <summary>
            /// Enum Lower for value: lower
            /// </summary>
            [EnumMember(Value = "lower")]
            Lower = 2,
            
            /// <summary>
            /// Enum Empty for value: 
            /// </summary>
            [EnumMember(Value = "")]
            Empty = 3
        }

        /// <summary>
        /// Gets or Sets EnumString
        /// </summary>
        [DataMember(Name="enum_string", EmitDefaultValue=false)]
        public EnumStringEnum? EnumString { get; set; }
        /// <summary>
        /// Defines EnumInteger
        /// </summary>
        public enum EnumIntegerEnum
        {
            
            /// <summary>
            /// Enum NUMBER_1 for value: 1
            /// </summary>
            
            NUMBER_1 = 1,
            
            /// <summary>
            /// Enum NUMBER_MINUS_1 for value: -1
            /// </summary>
            
            NUMBER_MINUS_1 = -1
        }

        /// <summary>
        /// Gets or Sets EnumInteger
        /// </summary>
        [DataMember(Name="enum_integer", EmitDefaultValue=false)]
        public EnumIntegerEnum? EnumInteger { get; set; }
        /// <summary>
        /// Defines EnumNumber
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EnumNumberEnum
        {
            
            /// <summary>
            /// Enum NUMBER_1_DOT_1 for value: 1.1
            /// </summary>
            [EnumMember(Value = "1.1")]
            NUMBER_1_DOT_1 = 1,
            
            /// <summary>
            /// Enum NUMBER_MINUS_1_DOT_2 for value: -1.2
            /// </summary>
            [EnumMember(Value = "-1.2")]
            NUMBER_MINUS_1_DOT_2 = 2
        }

        /// <summary>
        /// Gets or Sets EnumNumber
        /// </summary>
        [DataMember(Name="enum_number", EmitDefaultValue=false)]
        public EnumNumberEnum? EnumNumber { get; set; }
        /// <summary>
        /// Gets or Sets OuterEnum
        /// </summary>
        [DataMember(Name="outerEnum", EmitDefaultValue=false)]
        public OuterEnum? OuterEnum { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EnumTest" /> class.
        /// </summary>
        /// <param name="enumString">enumString.</param>
        /// <param name="enumInteger">enumInteger.</param>
        /// <param name="enumNumber">enumNumber.</param>
        /// <param name="outerEnum">outerEnum.</param>
        public EnumTest(EnumStringEnum? enumString = default(EnumStringEnum?), EnumIntegerEnum? enumInteger = default(EnumIntegerEnum?), EnumNumberEnum? enumNumber = default(EnumNumberEnum?), OuterEnum? outerEnum = default(OuterEnum?))
        {
            this.EnumString = enumString;
            this.EnumInteger = enumInteger;
            this.EnumNumber = enumNumber;
            this.OuterEnum = outerEnum;
        }
        




        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EnumTest {\n");
            sb.Append("  EnumString: ").Append(EnumString).Append("\n");
            sb.Append("  EnumInteger: ").Append(EnumInteger).Append("\n");
            sb.Append("  EnumNumber: ").Append(EnumNumber).Append("\n");
            sb.Append("  OuterEnum: ").Append(OuterEnum).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as EnumTest);
        }

        /// <summary>
        /// Returns true if EnumTest instances are equal
        /// </summary>
        /// <param name="input">Instance of EnumTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnumTest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.EnumString == input.EnumString ||
                    (this.EnumString != null &&
                    this.EnumString.Equals(input.EnumString))
                ) && 
                (
                    this.EnumInteger == input.EnumInteger ||
                    (this.EnumInteger != null &&
                    this.EnumInteger.Equals(input.EnumInteger))
                ) && 
                (
                    this.EnumNumber == input.EnumNumber ||
                    (this.EnumNumber != null &&
                    this.EnumNumber.Equals(input.EnumNumber))
                ) && 
                (
                    this.OuterEnum == input.OuterEnum ||
                    (this.OuterEnum != null &&
                    this.OuterEnum.Equals(input.OuterEnum))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.EnumString != null)
                    hashCode = hashCode * 59 + this.EnumString.GetHashCode();
                if (this.EnumInteger != null)
                    hashCode = hashCode * 59 + this.EnumInteger.GetHashCode();
                if (this.EnumNumber != null)
                    hashCode = hashCode * 59 + this.EnumNumber.GetHashCode();
                if (this.OuterEnum != null)
                    hashCode = hashCode * 59 + this.OuterEnum.GetHashCode();
                return hashCode;
            }
        }
    }

}
