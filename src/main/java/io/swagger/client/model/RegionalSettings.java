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
import io.swagger.client.model.CountryInfo;
import io.swagger.client.model.FormattingLocaleInfo;
import io.swagger.client.model.GreetingLanguageInfo;
import io.swagger.client.model.LanguageInfo;
import io.swagger.client.model.TimezoneInfo;

/**
 * RegionalSettings
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class RegionalSettings {
  @SerializedName("homeCountry")
  private CountryInfo homeCountry = null;

  @SerializedName("timezone")
  private TimezoneInfo timezone = null;

  @SerializedName("language")
  private LanguageInfo language = null;

  @SerializedName("greetingLanguage")
  private GreetingLanguageInfo greetingLanguage = null;

  @SerializedName("formattingLocale")
  private FormattingLocaleInfo formattingLocale = null;

  public RegionalSettings homeCountry(CountryInfo homeCountry) {
    this.homeCountry = homeCountry;
    return this;
  }

   /**
   * Extension country information
   * @return homeCountry
  **/
  @ApiModelProperty(example = "null", value = "Extension country information")
  public CountryInfo getHomeCountry() {
    return homeCountry;
  }

  public void setHomeCountry(CountryInfo homeCountry) {
    this.homeCountry = homeCountry;
  }

  public RegionalSettings timezone(TimezoneInfo timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Extension timezone information
   * @return timezone
  **/
  @ApiModelProperty(example = "null", value = "Extension timezone information")
  public TimezoneInfo getTimezone() {
    return timezone;
  }

  public void setTimezone(TimezoneInfo timezone) {
    this.timezone = timezone;
  }

  public RegionalSettings language(LanguageInfo language) {
    this.language = language;
    return this;
  }

   /**
   * User interface language data
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "User interface language data")
  public LanguageInfo getLanguage() {
    return language;
  }

  public void setLanguage(LanguageInfo language) {
    this.language = language;
  }

  public RegionalSettings greetingLanguage(GreetingLanguageInfo greetingLanguage) {
    this.greetingLanguage = greetingLanguage;
    return this;
  }

   /**
   * Information on language used for telephony greetings
   * @return greetingLanguage
  **/
  @ApiModelProperty(example = "null", value = "Information on language used for telephony greetings")
  public GreetingLanguageInfo getGreetingLanguage() {
    return greetingLanguage;
  }

  public void setGreetingLanguage(GreetingLanguageInfo greetingLanguage) {
    this.greetingLanguage = greetingLanguage;
  }

  public RegionalSettings formattingLocale(FormattingLocaleInfo formattingLocale) {
    this.formattingLocale = formattingLocale;
    return this;
  }

   /**
   * Formatting language preferences for numbers, dates and currencies
   * @return formattingLocale
  **/
  @ApiModelProperty(example = "null", value = "Formatting language preferences for numbers, dates and currencies")
  public FormattingLocaleInfo getFormattingLocale() {
    return formattingLocale;
  }

  public void setFormattingLocale(FormattingLocaleInfo formattingLocale) {
    this.formattingLocale = formattingLocale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionalSettings regionalSettings = (RegionalSettings) o;
    return Objects.equals(this.homeCountry, regionalSettings.homeCountry) &&
        Objects.equals(this.timezone, regionalSettings.timezone) &&
        Objects.equals(this.language, regionalSettings.language) &&
        Objects.equals(this.greetingLanguage, regionalSettings.greetingLanguage) &&
        Objects.equals(this.formattingLocale, regionalSettings.formattingLocale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeCountry, timezone, language, greetingLanguage, formattingLocale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionalSettings {\n");
    
    sb.append("    homeCountry: ").append(toIndentedString(homeCountry)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    greetingLanguage: ").append(toIndentedString(greetingLanguage)).append("\n");
    sb.append("    formattingLocale: ").append(toIndentedString(formattingLocale)).append("\n");
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

