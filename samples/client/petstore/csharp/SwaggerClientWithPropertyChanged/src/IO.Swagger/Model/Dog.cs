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
using PropertyChanged;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// Dog
    /// </summary>
    [DataContract]
    [ImplementPropertyChanged]
    public partial class Dog : Animal,  IEquatable<Dog>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Dog" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Dog() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Dog" /> class.
        /// </summary>
        /// <param name="ClassName">ClassName (required).</param>
        /// <param name="Color">Color (default to &quot;red&quot;).</param>
        /// <param name="Breed">Breed.</param>
        public Dog(string ClassName = default(string), string Color = "red", string Breed = default(string))
        {
            // to ensure "ClassName" is required (not null)
            if (ClassName == null)
            {
                throw new InvalidDataException("ClassName is a required property for Dog and cannot be null");
            }
            else
            {
                this.ClassName = ClassName;
            }
            // use default value if no "Color" provided
            if (Color == null)
            {
                this.Color = "red";
            }
            else
            {
                this.Color = Color;
            }
            this.Breed = Breed;
        }
        
        /// <summary>
        /// Gets or Sets ClassName
        /// </summary>
        [DataMember(Name="className", EmitDefaultValue=false)]
        public string ClassName { get; set; }

        /// <summary>
        /// Gets or Sets Color
        /// </summary>
        [DataMember(Name="color", EmitDefaultValue=false)]
        public string Color { get; set; }

        /// <summary>
        /// Gets or Sets Breed
        /// </summary>
        [DataMember(Name="breed", EmitDefaultValue=false)]
        public string Breed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Dog {\n");
            sb.Append("  ClassName: ").Append(ClassName).Append("\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  Breed: ").Append(Breed).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public  new string ToJson()
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
            return this.Equals(input as Dog);
        }

        /// <summary>
        /// Returns true if Dog instances are equal
        /// </summary>
        /// <param name="input">Instance of Dog to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Dog input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ClassName == input.ClassName ||
                    (this.ClassName != null &&
                    this.ClassName.Equals(input.ClassName))
                ) && 
                (
                    this.Color == input.Color ||
                    (this.Color != null &&
                    this.Color.Equals(input.Color))
                ) && 
                (
                    this.Breed == input.Breed ||
                    (this.Breed != null &&
                    this.Breed.Equals(input.Breed))
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
                if (this.ClassName != null)
                    hashCode = hashCode * 59 + this.ClassName.GetHashCode();
                if (this.Color != null)
                    hashCode = hashCode * 59 + this.Color.GetHashCode();
                if (this.Breed != null)
                    hashCode = hashCode * 59 + this.Breed.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// Property changed event handler
        /// </summary>
        public event PropertyChangedEventHandler PropertyChanged;

        /// <summary>
        /// Trigger when a property changed
        /// </summary>
        /// <param name="propertyName">Property Name</param>
        public virtual void OnPropertyChanged(string propertyName)
        {
            // NOTE: property changed is handled via "code weaving" using Fody.
            // Properties with setters are modified at compile time to notify of changes.
            var propertyChanged = PropertyChanged;
            if (propertyChanged != null)
            {
                propertyChanged(this, new PropertyChangedEventArgs(propertyName));
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
