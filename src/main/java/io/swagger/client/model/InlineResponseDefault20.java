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
import io.swagger.client.model.DialInNumbers;
import io.swagger.client.model.ExternalUserInfo;

/**
 * InlineResponseDefault20
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class InlineResponseDefault20 {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("supportUri")
  private String supportUri = null;

  @SerializedName("intlDialInNumbersUri")
  private String intlDialInNumbersUri = null;

  @SerializedName("externalUserInfo")
  private ExternalUserInfo externalUserInfo = null;

  @SerializedName("dialInNumbers")
  private DialInNumbers dialInNumbers = null;

  public InlineResponseDefault20 uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of a meeting service info resource
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of a meeting service info resource")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public InlineResponseDefault20 supportUri(String supportUri) {
    this.supportUri = supportUri;
    return this;
  }

   /**
   * URI to retrieve support information for meetings functionality
   * @return supportUri
  **/
  @ApiModelProperty(example = "null", value = "URI to retrieve support information for meetings functionality")
  public String getSupportUri() {
    return supportUri;
  }

  public void setSupportUri(String supportUri) {
    this.supportUri = supportUri;
  }

  public InlineResponseDefault20 intlDialInNumbersUri(String intlDialInNumbersUri) {
    this.intlDialInNumbersUri = intlDialInNumbersUri;
    return this;
  }

   /**
   * URI to retrieve international dial in numbers
   * @return intlDialInNumbersUri
  **/
  @ApiModelProperty(example = "null", value = "URI to retrieve international dial in numbers")
  public String getIntlDialInNumbersUri() {
    return intlDialInNumbersUri;
  }

  public void setIntlDialInNumbersUri(String intlDialInNumbersUri) {
    this.intlDialInNumbersUri = intlDialInNumbersUri;
  }

  public InlineResponseDefault20 externalUserInfo(ExternalUserInfo externalUserInfo) {
    this.externalUserInfo = externalUserInfo;
    return this;
  }

   /**
   * External user data
   * @return externalUserInfo
  **/
  @ApiModelProperty(example = "null", value = "External user data")
  public ExternalUserInfo getExternalUserInfo() {
    return externalUserInfo;
  }

  public void setExternalUserInfo(ExternalUserInfo externalUserInfo) {
    this.externalUserInfo = externalUserInfo;
  }

  public InlineResponseDefault20 dialInNumbers(DialInNumbers dialInNumbers) {
    this.dialInNumbers = dialInNumbers;
    return this;
  }

   /**
   * Dial-in numbers data
   * @return dialInNumbers
  **/
  @ApiModelProperty(example = "null", value = "Dial-in numbers data")
  public DialInNumbers getDialInNumbers() {
    return dialInNumbers;
  }

  public void setDialInNumbers(DialInNumbers dialInNumbers) {
    this.dialInNumbers = dialInNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefault20 inlineResponseDefault20 = (InlineResponseDefault20) o;
    return Objects.equals(this.uri, inlineResponseDefault20.uri) &&
        Objects.equals(this.supportUri, inlineResponseDefault20.supportUri) &&
        Objects.equals(this.intlDialInNumbersUri, inlineResponseDefault20.intlDialInNumbersUri) &&
        Objects.equals(this.externalUserInfo, inlineResponseDefault20.externalUserInfo) &&
        Objects.equals(this.dialInNumbers, inlineResponseDefault20.dialInNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, supportUri, intlDialInNumbersUri, externalUserInfo, dialInNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault20 {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    supportUri: ").append(toIndentedString(supportUri)).append("\n");
    sb.append("    intlDialInNumbersUri: ").append(toIndentedString(intlDialInNumbersUri)).append("\n");
    sb.append("    externalUserInfo: ").append(toIndentedString(externalUserInfo)).append("\n");
    sb.append("    dialInNumbers: ").append(toIndentedString(dialInNumbers)).append("\n");
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

