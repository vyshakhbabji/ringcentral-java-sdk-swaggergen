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
import io.swagger.client.model.CallerInfo;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Body6
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class Body6 {
  @SerializedName("to")
  private List<CallerInfo> to = new ArrayList<CallerInfo>();

  /**
   * Fax resolution
   */
  public enum FaxResolutionEnum {
    @SerializedName("High")
    HIGH("High"),
    
    @SerializedName("Low")
    LOW("Low");

    private String value;

    FaxResolutionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("faxResolution")
  private FaxResolutionEnum faxResolution = null;

  @SerializedName("sendTime")
  private DateTime sendTime = null;

  @SerializedName("coverIndex")
  private Integer coverIndex = null;

  @SerializedName("coverPageText")
  private String coverPageText = null;

  @SerializedName("originalMessageId")
  private String originalMessageId = null;

  public Body6 to(List<CallerInfo> to) {
    this.to = to;
    return this;
  }

  public Body6 addToItem(CallerInfo toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Recipient information. Phone number property is mandatory. Optional for resend fax request
   * @return to
  **/
  @ApiModelProperty(example = "null", value = "Recipient information. Phone number property is mandatory. Optional for resend fax request")
  public List<CallerInfo> getTo() {
    return to;
  }

  public void setTo(List<CallerInfo> to) {
    this.to = to;
  }

  public Body6 faxResolution(FaxResolutionEnum faxResolution) {
    this.faxResolution = faxResolution;
    return this;
  }

   /**
   * Fax resolution
   * @return faxResolution
  **/
  @ApiModelProperty(example = "null", value = "Fax resolution")
  public FaxResolutionEnum getFaxResolution() {
    return faxResolution;
  }

  public void setFaxResolution(FaxResolutionEnum faxResolution) {
    this.faxResolution = faxResolution;
  }

  public Body6 sendTime(DateTime sendTime) {
    this.sendTime = sendTime;
    return this;
  }

   /**
   * The datetime to send fax at, in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. If time is not specified, the fax will be send immediately
   * @return sendTime
  **/
  @ApiModelProperty(example = "null", value = "The datetime to send fax at, in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. If time is not specified, the fax will be send immediately")
  public DateTime getSendTime() {
    return sendTime;
  }

  public void setSendTime(DateTime sendTime) {
    this.sendTime = sendTime;
  }

  public Body6 coverIndex(Integer coverIndex) {
    this.coverIndex = coverIndex;
    return this;
  }

   /**
   * Optional. Cover page index. If not specified, the default cover page which is configured in \"Outbound Fax Settings\" is attached. See also 'Available Cover Pages' table below
   * @return coverIndex
  **/
  @ApiModelProperty(example = "null", value = "Optional. Cover page index. If not specified, the default cover page which is configured in \"Outbound Fax Settings\" is attached. See also 'Available Cover Pages' table below")
  public Integer getCoverIndex() {
    return coverIndex;
  }

  public void setCoverIndex(Integer coverIndex) {
    this.coverIndex = coverIndex;
  }

  public Body6 coverPageText(String coverPageText) {
    this.coverPageText = coverPageText;
    return this;
  }

   /**
   * Optional. Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
   * @return coverPageText
  **/
  @ApiModelProperty(example = "null", value = "Optional. Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols")
  public String getCoverPageText() {
    return coverPageText;
  }

  public void setCoverPageText(String coverPageText) {
    this.coverPageText = coverPageText;
  }

  public Body6 originalMessageId(String originalMessageId) {
    this.originalMessageId = originalMessageId;
    return this;
  }

   /**
   * Internal identifier of the original fax message which needs to be resent. Mandatory for resend fax request
   * @return originalMessageId
  **/
  @ApiModelProperty(example = "null", value = "Internal identifier of the original fax message which needs to be resent. Mandatory for resend fax request")
  public String getOriginalMessageId() {
    return originalMessageId;
  }

  public void setOriginalMessageId(String originalMessageId) {
    this.originalMessageId = originalMessageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body6 body6 = (Body6) o;
    return Objects.equals(this.to, body6.to) &&
        Objects.equals(this.faxResolution, body6.faxResolution) &&
        Objects.equals(this.sendTime, body6.sendTime) &&
        Objects.equals(this.coverIndex, body6.coverIndex) &&
        Objects.equals(this.coverPageText, body6.coverPageText) &&
        Objects.equals(this.originalMessageId, body6.originalMessageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, faxResolution, sendTime, coverIndex, coverPageText, originalMessageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body6 {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    faxResolution: ").append(toIndentedString(faxResolution)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    coverIndex: ").append(toIndentedString(coverIndex)).append("\n");
    sb.append("    coverPageText: ").append(toIndentedString(coverPageText)).append("\n");
    sb.append("    originalMessageId: ").append(toIndentedString(originalMessageId)).append("\n");
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
