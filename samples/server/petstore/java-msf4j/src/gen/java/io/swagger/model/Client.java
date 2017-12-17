/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Client
 */

public class Client   {
  @JsonProperty("client")
  private String client = null;

  public Client client(String client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.client, client.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    return toIndentedString(o, false);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line). Obfuscate the value, if required.
   */
  private String toIndentedString(java.lang.Object o, boolean isObfuscated) {
    if (o == null) {
      return "null";
    }
    if (isObfuscated) {
      return "***";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

