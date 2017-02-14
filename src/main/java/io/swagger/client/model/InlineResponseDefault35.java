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
import io.swagger.client.model.ParsePhoneNumberPhoneNumberInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponseDefault35
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class InlineResponseDefault35 {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("homeCountry")
  private List<ParsePhoneNumberCountryInfo> homeCountry = new ArrayList<ParsePhoneNumberCountryInfo>();

  @SerializedName("phoneNumbers")
  private List<ParsePhoneNumberPhoneNumberInfo> phoneNumbers = new ArrayList<ParsePhoneNumberPhoneNumberInfo>();

  @SerializedName("originalString")
  private String originalString = null;

  @SerializedName("areaCode")
  private String areaCode = null;

  @SerializedName("formattedNational")
  private String formattedNational = null;

  @SerializedName("formattedInternational")
  private String formattedInternational = null;

  @SerializedName("dialable")
  private String dialable = null;

  @SerializedName("e164")
  private String e164 = null;

  @SerializedName("special")
  private Boolean special = null;

  @SerializedName("normalized")
  private String normalized = null;

  @SerializedName("country")
  private List<ParsePhoneNumberCountryInfo> country = new ArrayList<ParsePhoneNumberCountryInfo>();

  public InlineResponseDefault35 uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of a resource
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of a resource")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public InlineResponseDefault35 homeCountry(List<ParsePhoneNumberCountryInfo> homeCountry) {
    this.homeCountry = homeCountry;
    return this;
  }

  public InlineResponseDefault35 addHomeCountryItem(ParsePhoneNumberCountryInfo homeCountryItem) {
    this.homeCountry.add(homeCountryItem);
    return this;
  }

   /**
   * Information on a user home country
   * @return homeCountry
  **/
  @ApiModelProperty(example = "null", value = "Information on a user home country")
  public List<ParsePhoneNumberCountryInfo> getHomeCountry() {
    return homeCountry;
  }

  public void setHomeCountry(List<ParsePhoneNumberCountryInfo> homeCountry) {
    this.homeCountry = homeCountry;
  }

  public InlineResponseDefault35 phoneNumbers(List<ParsePhoneNumberPhoneNumberInfo> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public InlineResponseDefault35 addPhoneNumbersItem(ParsePhoneNumberPhoneNumberInfo phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Parsed phone numbers data
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "Parsed phone numbers data")
  public List<ParsePhoneNumberPhoneNumberInfo> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<ParsePhoneNumberPhoneNumberInfo> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public InlineResponseDefault35 originalString(String originalString) {
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

  public InlineResponseDefault35 areaCode(String areaCode) {
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

  public InlineResponseDefault35 formattedNational(String formattedNational) {
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

  public InlineResponseDefault35 formattedInternational(String formattedInternational) {
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

  public InlineResponseDefault35 dialable(String dialable) {
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

  public InlineResponseDefault35 e164(String e164) {
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

  public InlineResponseDefault35 special(Boolean special) {
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

  public InlineResponseDefault35 normalized(String normalized) {
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

  public InlineResponseDefault35 country(List<ParsePhoneNumberCountryInfo> country) {
    this.country = country;
    return this;
  }

  public InlineResponseDefault35 addCountryItem(ParsePhoneNumberCountryInfo countryItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefault35 inlineResponseDefault35 = (InlineResponseDefault35) o;
    return Objects.equals(this.uri, inlineResponseDefault35.uri) &&
        Objects.equals(this.homeCountry, inlineResponseDefault35.homeCountry) &&
        Objects.equals(this.phoneNumbers, inlineResponseDefault35.phoneNumbers) &&
        Objects.equals(this.originalString, inlineResponseDefault35.originalString) &&
        Objects.equals(this.areaCode, inlineResponseDefault35.areaCode) &&
        Objects.equals(this.formattedNational, inlineResponseDefault35.formattedNational) &&
        Objects.equals(this.formattedInternational, inlineResponseDefault35.formattedInternational) &&
        Objects.equals(this.dialable, inlineResponseDefault35.dialable) &&
        Objects.equals(this.e164, inlineResponseDefault35.e164) &&
        Objects.equals(this.special, inlineResponseDefault35.special) &&
        Objects.equals(this.normalized, inlineResponseDefault35.normalized) &&
        Objects.equals(this.country, inlineResponseDefault35.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, homeCountry, phoneNumbers, originalString, areaCode, formattedNational, formattedInternational, dialable, e164, special, normalized, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault35 {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    homeCountry: ").append(toIndentedString(homeCountry)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    originalString: ").append(toIndentedString(originalString)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    formattedNational: ").append(toIndentedString(formattedNational)).append("\n");
    sb.append("    formattedInternational: ").append(toIndentedString(formattedInternational)).append("\n");
    sb.append("    dialable: ").append(toIndentedString(dialable)).append("\n");
    sb.append("    e164: ").append(toIndentedString(e164)).append("\n");
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
    sb.append("    normalized: ").append(toIndentedString(normalized)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

