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
 * InlineResponseDefault
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class InlineResponseDefault {
  @SerializedName("code")
  private String code = null;

  @SerializedName("expires_in")
  private Integer expiresIn = null;

  @SerializedName("state")
  private String state = null;

  public InlineResponseDefault code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The authorization code returned for your application
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "The authorization code returned for your application")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InlineResponseDefault expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * The remaining lifetime of the authorization code
   * @return expiresIn
  **/
  @ApiModelProperty(example = "null", value = "The remaining lifetime of the authorization code")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public InlineResponseDefault state(String state) {
    this.state = state;
    return this;
  }

   /**
   * This parameter will be included in response if it was specified in the client authorization request. The value will be copied from the one received from the client
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "This parameter will be included in response if it was specified in the client authorization request. The value will be copied from the one received from the client")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefault inlineResponseDefault = (InlineResponseDefault) o;
    return Objects.equals(this.code, inlineResponseDefault.code) &&
        Objects.equals(this.expiresIn, inlineResponseDefault.expiresIn) &&
        Objects.equals(this.state, inlineResponseDefault.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, expiresIn, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
