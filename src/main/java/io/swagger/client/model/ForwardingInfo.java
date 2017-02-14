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
import io.swagger.client.model.RuleInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * ForwardingInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ForwardingInfo {
  @SerializedName("notifyMySoftPhones")
  private Boolean notifyMySoftPhones = null;

  @SerializedName("notifyAdminSoftPhones")
  private Boolean notifyAdminSoftPhones = null;

  @SerializedName("softPhonesRingCount")
  private Integer softPhonesRingCount = null;

  /**
   * Specifies the order in which forwarding numbers ring. 'Sequentially' means that forwarding numbers are ringing one at a time, in order of priority. 'Simultaneously' means that forwarding numbers are ring all at the same time
   */
  public enum RingingModeEnum {
    @SerializedName("Sequentially")
    SEQUENTIALLY("Sequentially"),
    
    @SerializedName("Simultaneously")
    SIMULTANEOUSLY("Simultaneously");

    private String value;

    RingingModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ringingMode")
  private RingingModeEnum ringingMode = null;

  @SerializedName("rules")
  private List<RuleInfo> rules = new ArrayList<RuleInfo>();

  public ForwardingInfo notifyMySoftPhones(Boolean notifyMySoftPhones) {
    this.notifyMySoftPhones = notifyMySoftPhones;
    return this;
  }

   /**
   * Specifies if the user's softphone(s) are notified before forwarding the incoming call to desk phones and forwarding numbers
   * @return notifyMySoftPhones
  **/
  @ApiModelProperty(example = "null", value = "Specifies if the user's softphone(s) are notified before forwarding the incoming call to desk phones and forwarding numbers")
  public Boolean getNotifyMySoftPhones() {
    return notifyMySoftPhones;
  }

  public void setNotifyMySoftPhones(Boolean notifyMySoftPhones) {
    this.notifyMySoftPhones = notifyMySoftPhones;
  }

  public ForwardingInfo notifyAdminSoftPhones(Boolean notifyAdminSoftPhones) {
    this.notifyAdminSoftPhones = notifyAdminSoftPhones;
    return this;
  }

   /**
   * Specifies if the administrator's softphone is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is 'False'
   * @return notifyAdminSoftPhones
  **/
  @ApiModelProperty(example = "null", value = "Specifies if the administrator's softphone is notified before forwarding the incoming call to desk phones and forwarding numbers. The default value is 'False'")
  public Boolean getNotifyAdminSoftPhones() {
    return notifyAdminSoftPhones;
  }

  public void setNotifyAdminSoftPhones(Boolean notifyAdminSoftPhones) {
    this.notifyAdminSoftPhones = notifyAdminSoftPhones;
  }

  public ForwardingInfo softPhonesRingCount(Integer softPhonesRingCount) {
    this.softPhonesRingCount = softPhonesRingCount;
    return this;
  }

   /**
   * Number of rings before forwarding starts
   * @return softPhonesRingCount
  **/
  @ApiModelProperty(example = "null", value = "Number of rings before forwarding starts")
  public Integer getSoftPhonesRingCount() {
    return softPhonesRingCount;
  }

  public void setSoftPhonesRingCount(Integer softPhonesRingCount) {
    this.softPhonesRingCount = softPhonesRingCount;
  }

  public ForwardingInfo ringingMode(RingingModeEnum ringingMode) {
    this.ringingMode = ringingMode;
    return this;
  }

   /**
   * Specifies the order in which forwarding numbers ring. 'Sequentially' means that forwarding numbers are ringing one at a time, in order of priority. 'Simultaneously' means that forwarding numbers are ring all at the same time
   * @return ringingMode
  **/
  @ApiModelProperty(example = "null", value = "Specifies the order in which forwarding numbers ring. 'Sequentially' means that forwarding numbers are ringing one at a time, in order of priority. 'Simultaneously' means that forwarding numbers are ring all at the same time")
  public RingingModeEnum getRingingMode() {
    return ringingMode;
  }

  public void setRingingMode(RingingModeEnum ringingMode) {
    this.ringingMode = ringingMode;
  }

  public ForwardingInfo rules(List<RuleInfo> rules) {
    this.rules = rules;
    return this;
  }

  public ForwardingInfo addRulesItem(RuleInfo rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Information on a call forwarding rule
   * @return rules
  **/
  @ApiModelProperty(example = "null", value = "Information on a call forwarding rule")
  public List<RuleInfo> getRules() {
    return rules;
  }

  public void setRules(List<RuleInfo> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForwardingInfo forwardingInfo = (ForwardingInfo) o;
    return Objects.equals(this.notifyMySoftPhones, forwardingInfo.notifyMySoftPhones) &&
        Objects.equals(this.notifyAdminSoftPhones, forwardingInfo.notifyAdminSoftPhones) &&
        Objects.equals(this.softPhonesRingCount, forwardingInfo.softPhonesRingCount) &&
        Objects.equals(this.ringingMode, forwardingInfo.ringingMode) &&
        Objects.equals(this.rules, forwardingInfo.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyMySoftPhones, notifyAdminSoftPhones, softPhonesRingCount, ringingMode, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardingInfo {\n");
    
    sb.append("    notifyMySoftPhones: ").append(toIndentedString(notifyMySoftPhones)).append("\n");
    sb.append("    notifyAdminSoftPhones: ").append(toIndentedString(notifyAdminSoftPhones)).append("\n");
    sb.append("    softPhonesRingCount: ").append(toIndentedString(softPhonesRingCount)).append("\n");
    sb.append("    ringingMode: ").append(toIndentedString(ringingMode)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

