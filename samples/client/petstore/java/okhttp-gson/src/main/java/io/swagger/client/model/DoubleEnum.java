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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets DoubleEnum
 */
@JsonAdapter(DoubleEnum.Adapter.class)
public enum DoubleEnum {
  
  NUMBER_1_DOT_0(1.0d),
  
  NUMBER_2_DOT_0(2.0d),
  
  NUMBER_3_DOT_0(3.0d);

  private Double value;

  DoubleEnum(Double value) {
    this.value = value;
  }

  public Double getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DoubleEnum fromValue(String text) {
    for (DoubleEnum b : DoubleEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DoubleEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final DoubleEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DoubleEnum read(final JsonReader jsonReader) throws IOException {
      Double value = jsonReader.nextDouble();
      return DoubleEnum.fromValue(String.valueOf(value));
    }
  }
}

