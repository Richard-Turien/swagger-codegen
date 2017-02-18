package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Model for testing model name starting with number")
public class Model200Response  {
  
  @ApiModelProperty(example = "null", value = "")
  private Integer name = null;
  @ApiModelProperty(example = "null", value = "")
  private String propertyClass = null;

 /**
   * Get name
   * @return name
  **/
  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }

  public Model200Response name(Integer name) {
    this.name = name;
    return this;
  }

 /**
   * Get propertyClass
   * @return propertyClass
  **/
  public String getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }

  public Model200Response propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model200Response {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

