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
 * ContactAddressInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ContactAddressInfo {
  @SerializedName("country")
  private String country = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("zip")
  private String zip = null;

  public ContactAddressInfo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country name of extension user company. Not returned for Address Book
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Country name of extension user company. Not returned for Address Book")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ContactAddressInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State/province name of extension user company
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "State/province name of extension user company")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ContactAddressInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City name of extension user company
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "City name of extension user company")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ContactAddressInfo street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Street address of extension user company
   * @return street
  **/
  @ApiModelProperty(example = "null", value = "Street address of extension user company")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public ContactAddressInfo zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Zip code of extension user company
   * @return zip
  **/
  @ApiModelProperty(example = "null", value = "Zip code of extension user company")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactAddressInfo contactAddressInfo = (ContactAddressInfo) o;
    return Objects.equals(this.country, contactAddressInfo.country) &&
        Objects.equals(this.state, contactAddressInfo.state) &&
        Objects.equals(this.city, contactAddressInfo.city) &&
        Objects.equals(this.street, contactAddressInfo.street) &&
        Objects.equals(this.zip, contactAddressInfo.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, state, city, street, zip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactAddressInfo {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
