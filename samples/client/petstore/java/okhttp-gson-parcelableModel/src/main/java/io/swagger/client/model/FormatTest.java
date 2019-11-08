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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * FormatTest
 */

public class FormatTest implements Parcelable {
  @SerializedName("integer")
  private Integer integer = null;

  @SerializedName("int32")
  private Integer int32 = null;

  @SerializedName("int64")
  private Long int64 = null;

  @SerializedName("number")
  private BigDecimal number = null;

  @SerializedName("float")
  private Float _float = null;

  @SerializedName("double")
  private Double _double = null;

  @SerializedName("string")
  private String string = null;

  @SerializedName("byte")
  private byte[] _byte = null;

  @SerializedName("binary")
  private File binary = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("dateTime")
  private OffsetDateTime dateTime = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("password")
  private String password = null;

  public FormatTest() {
  }
  public FormatTest integer(Integer integer) {
    this.integer = integer;
    return this;
  }

   /**
   * Get integer
   * minimum: 10
   * maximum: 100
   * @return integer
  **/
  @ApiModelProperty(value = "")
  public Integer getInteger() {
    return integer;
  }

  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  public FormatTest int32(Integer int32) {
    this.int32 = int32;
    return this;
  }

   /**
   * Get int32
   * minimum: 20
   * maximum: 200
   * @return int32
  **/
  @ApiModelProperty(value = "")
  public Integer getInt32() {
    return int32;
  }

  public void setInt32(Integer int32) {
    this.int32 = int32;
  }

  public FormatTest int64(Long int64) {
    this.int64 = int64;
    return this;
  }

   /**
   * Get int64
   * @return int64
  **/
  @ApiModelProperty(value = "")
  public Long getInt64() {
    return int64;
  }

  public void setInt64(Long int64) {
    this.int64 = int64;
  }

  public FormatTest number(BigDecimal number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * minimum: 32.1
   * maximum: 543.2
   * @return number
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public FormatTest _float(Float _float) {
    this._float = _float;
    return this;
  }

   /**
   * Get _float
   * minimum: 54.3
   * maximum: 987.6
   * @return _float
  **/
  @ApiModelProperty(value = "")
  public Float getFloat() {
    return _float;
  }

  public void setFloat(Float _float) {
    this._float = _float;
  }

  public FormatTest _double(Double _double) {
    this._double = _double;
    return this;
  }

   /**
   * Get _double
   * minimum: 67.8
   * maximum: 123.4
   * @return _double
  **/
  @ApiModelProperty(value = "")
  public Double getDouble() {
    return _double;
  }

  public void setDouble(Double _double) {
    this._double = _double;
  }

  public FormatTest string(String string) {
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @ApiModelProperty(value = "")
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public FormatTest _byte(byte[] _byte) {
    this._byte = _byte;
    return this;
  }

   /**
   * Get _byte
   * @return _byte
  **/
  @ApiModelProperty(required = true, value = "")
  public byte[] getByte() {
    return _byte;
  }

  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }

  public FormatTest binary(File binary) {
    this.binary = binary;
    return this;
  }

   /**
   * Get binary
   * @return binary
  **/
  @ApiModelProperty(value = "")
  public File getBinary() {
    return binary;
  }

  public void setBinary(File binary) {
    this.binary = binary;
  }

  public FormatTest date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public FormatTest dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public FormatTest uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public FormatTest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatTest formatTest = (FormatTest) o;
    return Objects.equals(this.integer, formatTest.integer) &&
        Objects.equals(this.int32, formatTest.int32) &&
        Objects.equals(this.int64, formatTest.int64) &&
        Objects.equals(this.number, formatTest.number) &&
        Objects.equals(this._float, formatTest._float) &&
        Objects.equals(this._double, formatTest._double) &&
        Objects.equals(this.string, formatTest.string) &&
        Arrays.equals(this._byte, formatTest._byte) &&
        Arrays.equals(this.binary, formatTest.binary) &&
        Objects.equals(this.date, formatTest.date) &&
        Objects.equals(this.dateTime, formatTest.dateTime) &&
        Objects.equals(this.uuid, formatTest.uuid) &&
        Objects.equals(this.password, formatTest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, string, Arrays.hashCode(_byte), Arrays.hashCode(binary), date, dateTime, uuid, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatTest {\n");
    
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(integer);
    out.writeValue(int32);
    out.writeValue(int64);
    out.writeValue(number);
    out.writeValue(_float);
    out.writeValue(_double);
    out.writeValue(string);
    out.writeValue(_byte);
    out.writeValue(binary);
    out.writeValue(date);
    out.writeValue(dateTime);
    out.writeValue(uuid);
    out.writeValue(password);
  }

  FormatTest(Parcel in) {
    integer = (Integer)in.readValue(null);
    int32 = (Integer)in.readValue(null);
    int64 = (Long)in.readValue(null);
    number = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    _float = (Float)in.readValue(null);
    _double = (Double)in.readValue(null);
    string = (String)in.readValue(null);
    _byte = (byte[])in.readValue(null);
    binary = (File)in.readValue(File.class.getClassLoader());
    date = (LocalDate)in.readValue(LocalDate.class.getClassLoader());
    dateTime = (OffsetDateTime)in.readValue(OffsetDateTime.class.getClassLoader());
    uuid = (UUID)in.readValue(UUID.class.getClassLoader());
    password = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<FormatTest> CREATOR = new Parcelable.Creator<FormatTest>() {
    public FormatTest createFromParcel(Parcel in) {
      return new FormatTest(in);
    }
    public FormatTest[] newArray(int size) {
      return new FormatTest[size];
    }
  };
}

