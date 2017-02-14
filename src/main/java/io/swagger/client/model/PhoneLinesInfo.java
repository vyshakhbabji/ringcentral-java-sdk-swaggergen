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
import io.swagger.client.model.PhoneLinesInfoPhoneNumberInfo;

/**
 * PhoneLinesInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class PhoneLinesInfo {
  /**
   * Type of phone line
   */
  public enum LineTypeEnum {
    @SerializedName("Standalone")
    STANDALONE("Standalone"),
    
    @SerializedName("StandaloneFree")
    STANDALONEFREE("StandaloneFree"),
    
    @SerializedName("BlaPrimary")
    BLAPRIMARY("BlaPrimary"),
    
    @SerializedName("BlaSecondary")
    BLASECONDARY("BlaSecondary");

    private String value;

    LineTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("lineType")
  private LineTypeEnum lineType = null;

  @SerializedName("phoneInfo")
  private PhoneLinesInfoPhoneNumberInfo phoneInfo = null;

  public PhoneLinesInfo lineType(LineTypeEnum lineType) {
    this.lineType = lineType;
    return this;
  }

   /**
   * Type of phone line
   * @return lineType
  **/
  @ApiModelProperty(example = "null", value = "Type of phone line")
  public LineTypeEnum getLineType() {
    return lineType;
  }

  public void setLineType(LineTypeEnum lineType) {
    this.lineType = lineType;
  }

  public PhoneLinesInfo phoneInfo(PhoneLinesInfoPhoneNumberInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
    return this;
  }

   /**
   * Phone number information
   * @return phoneInfo
  **/
  @ApiModelProperty(example = "null", value = "Phone number information")
  public PhoneLinesInfoPhoneNumberInfo getPhoneInfo() {
    return phoneInfo;
  }

  public void setPhoneInfo(PhoneLinesInfoPhoneNumberInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneLinesInfo phoneLinesInfo = (PhoneLinesInfo) o;
    return Objects.equals(this.lineType, phoneLinesInfo.lineType) &&
        Objects.equals(this.phoneInfo, phoneLinesInfo.phoneInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineType, phoneInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneLinesInfo {\n");
    
    sb.append("    lineType: ").append(toIndentedString(lineType)).append("\n");
    sb.append("    phoneInfo: ").append(toIndentedString(phoneInfo)).append("\n");
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

