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
import io.swagger.client.model.StateInfoCountryInfo;

/**
 * StateInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class StateInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("country")
  private StateInfoCountryInfo country = null;

  @SerializedName("isoCode")
  private String isoCode = null;

  @SerializedName("name")
  private String name = null;

  public StateInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Internal identifier of a state
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Internal identifier of a state")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StateInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of a state
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of a state")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public StateInfo country(StateInfoCountryInfo country) {
    this.country = country;
    return this;
  }

   /**
   * Information on a country the state belongs to
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Information on a country the state belongs to")
  public StateInfoCountryInfo getCountry() {
    return country;
  }

  public void setCountry(StateInfoCountryInfo country) {
    this.country = country;
  }

  public StateInfo isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

   /**
   * Short code for a state (2-letter usually)
   * @return isoCode
  **/
  @ApiModelProperty(example = "null", value = "Short code for a state (2-letter usually)")
  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  public StateInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Official name of a state
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Official name of a state")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateInfo stateInfo = (StateInfo) o;
    return Objects.equals(this.id, stateInfo.id) &&
        Objects.equals(this.uri, stateInfo.uri) &&
        Objects.equals(this.country, stateInfo.country) &&
        Objects.equals(this.isoCode, stateInfo.isoCode) &&
        Objects.equals(this.name, stateInfo.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, country, isoCode, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

