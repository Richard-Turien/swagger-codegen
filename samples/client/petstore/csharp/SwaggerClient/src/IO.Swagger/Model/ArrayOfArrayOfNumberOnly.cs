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
    /// ArrayOfArrayOfNumberOnly
    /// </summary>
    [DataContract]
    public partial class ArrayOfArrayOfNumberOnly :  IEquatable<ArrayOfArrayOfNumberOnly>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ArrayOfArrayOfNumberOnly" /> class.
        /// </summary>
        /// <param name="ArrayArrayNumber">ArrayArrayNumber.</param>
        public ArrayOfArrayOfNumberOnly(List<List<decimal?>> ArrayArrayNumber = default(List<List<decimal?>>))
        {
            this.ArrayArrayNumber = ArrayArrayNumber;
        }
        
        /// <summary>
        /// Gets or Sets ArrayArrayNumber
        /// </summary>
        [DataMember(Name="ArrayArrayNumber", EmitDefaultValue=false)]
        public List<List<decimal?>> ArrayArrayNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ArrayOfArrayOfNumberOnly {\n");
            sb.Append("  ArrayArrayNumber: ").Append(ArrayArrayNumber).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as ArrayOfArrayOfNumberOnly);
        }

        /// <summary>
        /// Returns true if ArrayOfArrayOfNumberOnly instances are equal
        /// </summary>
        /// <param name="other">Instance of ArrayOfArrayOfNumberOnly to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ArrayOfArrayOfNumberOnly other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ArrayArrayNumber == other.ArrayArrayNumber ||
                    this.ArrayArrayNumber != null &&
                    this.ArrayArrayNumber.SequenceEqual(other.ArrayArrayNumber)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.ArrayArrayNumber != null)
                    hash = hash * 59 + this.ArrayArrayNumber.GetHashCode();
                return hash;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            return this.BaseValidate(validationContext);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        protected IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> BaseValidate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
