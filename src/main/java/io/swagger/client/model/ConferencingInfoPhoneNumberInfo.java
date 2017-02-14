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
import io.swagger.client.model.ConferencingInfoPhoneNumberInfoCountryInfo;

/**
 * ConferencingInfoPhoneNumberInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ConferencingInfoPhoneNumberInfo {
  @SerializedName("country")
  private ConferencingInfoPhoneNumberInfoCountryInfo country = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("hasGreeting")
  private Boolean hasGreeting = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  public ConferencingInfoPhoneNumberInfo country(ConferencingInfoPhoneNumberInfoCountryInfo country) {
    this.country = country;
    return this;
  }

   /**
   * Information on a home country of a conference phone number
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Information on a home country of a conference phone number")
  public ConferencingInfoPhoneNumberInfoCountryInfo getCountry() {
    return country;
  }

  public void setCountry(ConferencingInfoPhoneNumberInfoCountryInfo country) {
    this.country = country;
  }

  public ConferencingInfoPhoneNumberInfo _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * 'True' if the number is default for the conference. Default conference number is a domestic number that can be set by user (otherwise it is set by the system). Only one default number per country is allowed
   * @return _default
  **/
  @ApiModelProperty(example = "null", value = "'True' if the number is default for the conference. Default conference number is a domestic number that can be set by user (otherwise it is set by the system). Only one default number per country is allowed")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public ConferencingInfoPhoneNumberInfo hasGreeting(Boolean hasGreeting) {
    this.hasGreeting = hasGreeting;
    return this;
  }

   /**
   * 'True' if the greeting message is played on this number
   * @return hasGreeting
  **/
  @ApiModelProperty(example = "null", value = "'True' if the greeting message is played on this number")
  public Boolean getHasGreeting() {
    return hasGreeting;
  }

  public void setHasGreeting(Boolean hasGreeting) {
    this.hasGreeting = hasGreeting;
  }

  public ConferencingInfoPhoneNumberInfo location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Location (city, region, state) of a conference phone number
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "Location (city, region, state) of a conference phone number")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ConferencingInfoPhoneNumberInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Dial-in phone number to connect to a conference
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "Dial-in phone number to connect to a conference")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferencingInfoPhoneNumberInfo conferencingInfoPhoneNumberInfo = (ConferencingInfoPhoneNumberInfo) o;
    return Objects.equals(this.country, conferencingInfoPhoneNumberInfo.country) &&
        Objects.equals(this._default, conferencingInfoPhoneNumberInfo._default) &&
        Objects.equals(this.hasGreeting, conferencingInfoPhoneNumberInfo.hasGreeting) &&
        Objects.equals(this.location, conferencingInfoPhoneNumberInfo.location) &&
        Objects.equals(this.phoneNumber, conferencingInfoPhoneNumberInfo.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, _default, hasGreeting, location, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferencingInfoPhoneNumberInfo {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    hasGreeting: ").append(toIndentedString(hasGreeting)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

