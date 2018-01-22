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
    /// MixedPropertiesAndAdditionalPropertiesClass
    /// </summary>
    [DataContract]
    public partial class MixedPropertiesAndAdditionalPropertiesClass :  IEquatable<MixedPropertiesAndAdditionalPropertiesClass>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MixedPropertiesAndAdditionalPropertiesClass" /> class.
        /// </summary>
        /// <param name="Uuid">Uuid.</param>
        /// <param name="DateTime">DateTime.</param>
        /// <param name="Map">Map.</param>
        public MixedPropertiesAndAdditionalPropertiesClass(Guid? Uuid = default(Guid?), DateTime? DateTime = default(DateTime?), Dictionary<string, Animal> Map = default(Dictionary<string, Animal>))
        {
            this.Uuid = Uuid;
            this.DateTime = DateTime;
            this.Map = Map;
        }
        
        /// <summary>
        /// Gets or Sets Uuid
        /// </summary>
        [DataMember(Name="uuid", EmitDefaultValue=false)]
        public Guid? Uuid { get; set; }

        /// <summary>
        /// Gets or Sets DateTime
        /// </summary>
        [DataMember(Name="dateTime", EmitDefaultValue=false)]
        public DateTime? DateTime { get; set; }

        /// <summary>
        /// Gets or Sets Map
        /// </summary>
        [DataMember(Name="map", EmitDefaultValue=false)]
        public Dictionary<string, Animal> Map { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
            sb.Append("  Uuid: ").Append(Uuid).Append("\n");
            sb.Append("  DateTime: ").Append(DateTime).Append("\n");
            sb.Append("  Map: ").Append(Map).Append("\n");
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
            return this.Equals(input as MixedPropertiesAndAdditionalPropertiesClass);
        }

        /// <summary>
        /// Returns true if MixedPropertiesAndAdditionalPropertiesClass instances are equal
        /// </summary>
        /// <param name="input">Instance of MixedPropertiesAndAdditionalPropertiesClass to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MixedPropertiesAndAdditionalPropertiesClass input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Uuid == input.Uuid ||
                    (this.Uuid != null &&
                    this.Uuid.Equals(input.Uuid))
                ) && 
                (
                    this.DateTime == input.DateTime ||
                    (this.DateTime != null &&
                    this.DateTime.Equals(input.DateTime))
                ) && 
                (
                    this.Map == input.Map ||
                    this.Map != null &&
                    this.Map.SequenceEqual(input.Map)
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
                if (this.Uuid != null)
                    hashCode = hashCode * 59 + this.Uuid.GetHashCode();
                if (this.DateTime != null)
                    hashCode = hashCode * 59 + this.DateTime.GetHashCode();
                if (this.Map != null)
                    hashCode = hashCode * 59 + this.Map.GetHashCode();
                return hashCode;
            }
        }
    }

}
