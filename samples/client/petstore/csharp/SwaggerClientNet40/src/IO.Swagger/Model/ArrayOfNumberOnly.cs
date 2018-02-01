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
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// ArrayOfNumberOnly
    /// </summary>
    [DataContract]
    public partial class ArrayOfNumberOnly :  IEquatable<ArrayOfNumberOnly>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ArrayOfNumberOnly" /> class.
        /// </summary>
        /// <param name="ArrayNumber">ArrayNumber.</param>
        public ArrayOfNumberOnly(List<decimal?> ArrayNumber = default(List<decimal?>))
        {
            this.ArrayNumber = ArrayNumber;
        }
        
        /// <summary>
        /// Gets or Sets ArrayNumber
        /// </summary>
        [DataMember(Name="ArrayNumber", EmitDefaultValue=false)]
        public List<decimal?> ArrayNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ArrayOfNumberOnly {\n");
            sb.Append("  ArrayNumber: ").Append(ArrayNumber).Append("\n");
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
            return this.Equals(input as ArrayOfNumberOnly);
        }

        /// <summary>
        /// Returns true if ArrayOfNumberOnly instances are equal
        /// </summary>
        /// <param name="input">Instance of ArrayOfNumberOnly to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ArrayOfNumberOnly input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ArrayNumber == input.ArrayNumber ||
                    this.ArrayNumber != null &&
                    this.ArrayNumber.SequenceEqual(input.ArrayNumber)
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
                if (this.ArrayNumber != null)
                    hashCode = hashCode * 59 + this.ArrayNumber.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
