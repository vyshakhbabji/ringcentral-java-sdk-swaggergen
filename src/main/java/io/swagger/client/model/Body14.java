/*
 * RingCentral API
 * RingCentral Connect Platform API
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Body14
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class Body14 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("value")
  private String value = null;

  public Body14 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Custom data access key. Optional. If specified, must match the custom key in the URL
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Custom data access key. Optional. If specified, must match the custom key in the URL")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Body14 value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Description of custom data. Mandatory for create, if there is no attachment specified. Maximum length is limited to 256 symbols
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "Description of custom data. Mandatory for create, if there is no attachment specified. Maximum length is limited to 256 symbols")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body14 body14 = (Body14) o;
    return Objects.equals(this.id, body14.id) &&
        Objects.equals(this.value, body14.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body14 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
  
}

