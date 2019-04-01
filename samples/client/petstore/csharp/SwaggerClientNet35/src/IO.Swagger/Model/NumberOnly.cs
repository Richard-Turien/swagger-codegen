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
    /// NumberOnly
    /// </summary>
    [DataContract]
    public partial class NumberOnly :  IEquatable<NumberOnly>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NumberOnly" /> class.
        /// </summary>
        /// <param name="justNumber">justNumber.</param>
        public NumberOnly(decimal? justNumber = default(decimal?))
        {
            this.JustNumber = justNumber;
        }
        
        /// <summary>
        /// Gets or Sets JustNumber
        /// </summary>
        [DataMember(Name="JustNumber", EmitDefaultValue=false)]
        public decimal? JustNumber { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NumberOnly {\n");
            sb.Append("  JustNumber: ").Append(JustNumber).Append("\n");
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
            return this.Equals(input as NumberOnly);
        }

        /// <summary>
        /// Returns true if NumberOnly instances are equal
        /// </summary>
        /// <param name="input">Instance of NumberOnly to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NumberOnly input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.JustNumber == input.JustNumber ||
                    (this.JustNumber != null &&
                    this.JustNumber.Equals(input.JustNumber))
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
                if (this.JustNumber != null)
                    hashCode = hashCode * 59 + this.JustNumber.GetHashCode();
                return hashCode;
            }
        }

    }

}
