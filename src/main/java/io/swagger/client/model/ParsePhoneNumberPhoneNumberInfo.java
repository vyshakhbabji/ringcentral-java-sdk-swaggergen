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
import io.swagger.client.model.ParsePhoneNumberCountryInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * ParsePhoneNumberPhoneNumberInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ParsePhoneNumberPhoneNumberInfo {
  @SerializedName("areaCode")
  private String areaCode = null;

  @SerializedName("country")
  private List<ParsePhoneNumberCountryInfo> country = new ArrayList<ParsePhoneNumberCountryInfo>();

  @SerializedName("dialable")
  private String dialable = null;

  @SerializedName("e164")
  private String e164 = null;

  @SerializedName("formattedInternational")
  private String formattedInternational = null;

  @SerializedName("formattedNational")
  private String formattedNational = null;

  @SerializedName("originalString")
  private String originalString = null;

  @SerializedName("special")
  private Boolean special = null;

  @SerializedName("normalized")
  private String normalized = null;

  public ParsePhoneNumberPhoneNumberInfo areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

   /**
   * Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See North American Numbering Plan for details
   * @return areaCode
  **/
  @ApiModelProperty(example = "null", value = "Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See North American Numbering Plan for details")
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public ParsePhoneNumberPhoneNumberInfo country(List<ParsePhoneNumberCountryInfo> country) {
    this.country = country;
    return this;
  }

  public ParsePhoneNumberPhoneNumberInfo addCountryItem(ParsePhoneNumberCountryInfo countryItem) {
    this.country.add(countryItem);
    return this;
  }

   /**
   * Information on a country the phone number belongs to
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Information on a country the phone number belongs to")
  public List<ParsePhoneNumberCountryInfo> getCountry() {
    return country;
  }

  public void setCountry(List<ParsePhoneNumberCountryInfo> country) {
    this.country = country;
  }

  public ParsePhoneNumberPhoneNumberInfo dialable(String dialable) {
    this.dialable = dialable;
    return this;
  }

   /**
   * Dialing format of a phone number
   * @return dialable
  **/
  @ApiModelProperty(example = "null", value = "Dialing format of a phone number")
  public String getDialable() {
    return dialable;
  }

  public void setDialable(String dialable) {
    this.dialable = dialable;
  }

  public ParsePhoneNumberPhoneNumberInfo e164(String e164) {
    this.e164 = e164;
    return this;
  }

   /**
   * E.164 (11-digits) format of a phone number
   * @return e164
  **/
  @ApiModelProperty(example = "null", value = "E.164 (11-digits) format of a phone number")
  public String getE164() {
    return e164;
  }

  public void setE164(String e164) {
    this.e164 = e164;
  }

  public ParsePhoneNumberPhoneNumberInfo formattedInternational(String formattedInternational) {
    this.formattedInternational = formattedInternational;
    return this;
  }

   /**
   * International format of a phone number
   * @return formattedInternational
  **/
  @ApiModelProperty(example = "null", value = "International format of a phone number")
  public String getFormattedInternational() {
    return formattedInternational;
  }

  public void setFormattedInternational(String formattedInternational) {
    this.formattedInternational = formattedInternational;
  }

  public ParsePhoneNumberPhoneNumberInfo formattedNational(String formattedNational) {
    this.formattedNational = formattedNational;
    return this;
  }

   /**
   * Domestic format of a phone number
   * @return formattedNational
  **/
  @ApiModelProperty(example = "null", value = "Domestic format of a phone number")
  public String getFormattedNational() {
    return formattedNational;
  }

  public void setFormattedNational(String formattedNational) {
    this.formattedNational = formattedNational;
  }

  public ParsePhoneNumberPhoneNumberInfo originalString(String originalString) {
    this.originalString = originalString;
    return this;
  }

   /**
   * One of the numbers to be parsed, passed as a string in response
   * @return originalString
  **/
  @ApiModelProperty(example = "null", value = "One of the numbers to be parsed, passed as a string in response")
  public String getOriginalString() {
    return originalString;
  }

  public void setOriginalString(String originalString) {
    this.originalString = originalString;
  }

  public ParsePhoneNumberPhoneNumberInfo special(Boolean special) {
    this.special = special;
    return this;
  }

   /**
   * \"True\" if the number is in a special format (for example N11 code)
   * @return special
  **/
  @ApiModelProperty(example = "null", value = "\"True\" if the number is in a special format (for example N11 code)")
  public Boolean getSpecial() {
    return special;
  }

  public void setSpecial(Boolean special) {
    this.special = special;
  }

  public ParsePhoneNumberPhoneNumberInfo normalized(String normalized) {
    this.normalized = normalized;
    return this;
  }

   /**
   * E.164 (11-digits) format of a phone number without the plus sign ('+')
   * @return normalized
  **/
  @ApiModelProperty(example = "null", value = "E.164 (11-digits) format of a phone number without the plus sign ('+')")
  public String getNormalized() {
    return normalized;
  }

  public void setNormalized(String normalized) {
    this.normalized = normalized;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParsePhoneNumberPhoneNumberInfo parsePhoneNumberPhoneNumberInfo = (ParsePhoneNumberPhoneNumberInfo) o;
    return Objects.equals(this.areaCode, parsePhoneNumberPhoneNumberInfo.areaCode) &&
        Objects.equals(this.country, parsePhoneNumberPhoneNumberInfo.country) &&
        Objects.equals(this.dialable, parsePhoneNumberPhoneNumberInfo.dialable) &&
        Objects.equals(this.e164, parsePhoneNumberPhoneNumberInfo.e164) &&
        Objects.equals(this.formattedInternational, parsePhoneNumberPhoneNumberInfo.formattedInternational) &&
        Objects.equals(this.formattedNational, parsePhoneNumberPhoneNumberInfo.formattedNational) &&
        Objects.equals(this.originalString, parsePhoneNumberPhoneNumberInfo.originalString) &&
        Objects.equals(this.special, parsePhoneNumberPhoneNumberInfo.special) &&
        Objects.equals(this.normalized, parsePhoneNumberPhoneNumberInfo.normalized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaCode, country, dialable, e164, formattedInternational, formattedNational, originalString, special, normalized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsePhoneNumberPhoneNumberInfo {\n");
    
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dialable: ").append(toIndentedString(dialable)).append("\n");
    sb.append("    e164: ").append(toIndentedString(e164)).append("\n");
    sb.append("    formattedInternational: ").append(toIndentedString(formattedInternational)).append("\n");
    sb.append("    formattedNational: ").append(toIndentedString(formattedNational)).append("\n");
    sb.append("    originalString: ").append(toIndentedString(originalString)).append("\n");
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
    sb.append("    normalized: ").append(toIndentedString(normalized)).append("\n");
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

