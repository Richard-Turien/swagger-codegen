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
    /// Cat
    /// </summary>
    [DataContract]
    public partial class Cat : Animal,  IEquatable<Cat>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Cat" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Cat() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Cat" /> class.
        /// </summary>
        /// <param name="declawed">declawed.</param>
        public Cat(bool? declawed = default(bool?), string className = "Cat", string color = "red") : base(className, color)
        {
            this.Declawed = declawed;
        }
        
        /// <summary>
        /// Gets or Sets Declawed
        /// </summary>
        [DataMember(Name="declawed", EmitDefaultValue=false)]
        public bool? Declawed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Cat {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Declawed: ").Append(Declawed).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
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
            return this.Equals(input as Cat);
        }

        /// <summary>
        /// Returns true if Cat instances are equal
        /// </summary>
        /// <param name="input">Instance of Cat to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Cat input)
        {
            if (input == null)
                return false;

            return base.Equals(input) && 
                (
                    this.Declawed == input.Declawed ||
                    (this.Declawed != null &&
                    this.Declawed.Equals(input.Declawed))
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
                int hashCode = base.GetHashCode();
                if (this.Declawed != null)
                    hashCode = hashCode * 59 + this.Declawed.GetHashCode();
                return hashCode;
            }
        }

    }

}
