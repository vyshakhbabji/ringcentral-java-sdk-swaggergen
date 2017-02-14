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
 * LocationInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class LocationInfo {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("areaCode")
  private String areaCode = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("npa")
  private String npa = null;

  @SerializedName("nxx")
  private String nxx = null;

  @SerializedName("state")
  private String state = null;

  public LocationInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of a location
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of a location")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public LocationInfo areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

   /**
   * Area code of the location
   * @return areaCode
  **/
  @ApiModelProperty(example = "null", value = "Area code of the location")
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public LocationInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Official name of the city, belonging to the certain state
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "Official name of the city, belonging to the certain state")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public LocationInfo npa(String npa) {
    this.npa = npa;
    return this;
  }

   /**
   * Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See for details North American Numbering Plan
   * @return npa
  **/
  @ApiModelProperty(example = "null", value = "Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See for details North American Numbering Plan")
  public String getNpa() {
    return npa;
  }

  public void setNpa(String npa) {
    this.npa = npa;
  }

  public LocationInfo nxx(String nxx) {
    this.nxx = nxx;
    return this;
  }

   /**
   * Central office code of the location, according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See for details North American Numbering Plan
   * @return nxx
  **/
  @ApiModelProperty(example = "null", value = "Central office code of the location, according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See for details North American Numbering Plan")
  public String getNxx() {
    return nxx;
  }

  public void setNxx(String nxx) {
    this.nxx = nxx;
  }

  public LocationInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * ID and URI of the state this location belongs to, see State Info
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "ID and URI of the state this location belongs to, see State Info")
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
    LocationInfo locationInfo = (LocationInfo) o;
    return Objects.equals(this.uri, locationInfo.uri) &&
        Objects.equals(this.areaCode, locationInfo.areaCode) &&
        Objects.equals(this.city, locationInfo.city) &&
        Objects.equals(this.npa, locationInfo.npa) &&
        Objects.equals(this.nxx, locationInfo.nxx) &&
        Objects.equals(this.state, locationInfo.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, areaCode, city, npa, nxx, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationInfo {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    npa: ").append(toIndentedString(npa)).append("\n");
    sb.append("    nxx: ").append(toIndentedString(nxx)).append("\n");
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
