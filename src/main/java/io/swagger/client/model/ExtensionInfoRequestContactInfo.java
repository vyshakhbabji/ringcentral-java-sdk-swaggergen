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
import io.swagger.client.model.ContactInfo;
import io.swagger.client.model.ExtensionInfoRequestContactInfoRegionalSettings;

/**
 * ExtensionInfoRequestContactInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ExtensionInfoRequestContactInfo {
  @SerializedName("contact")
  private ContactInfo contact = null;

  @SerializedName("regionalSettings")
  private ExtensionInfoRequestContactInfoRegionalSettings regionalSettings = null;

  /**
   * Specifies extension configuration wizard state (web service setup). The default value is 'NotStarted'
   */
  public enum SetupWizardStateEnum {
    @SerializedName("NotStarted")
    NOTSTARTED("NotStarted"),
    
    @SerializedName("Incomplete")
    INCOMPLETE("Incomplete"),
    
    @SerializedName("Completed")
    COMPLETED("Completed");

    private String value;

    SetupWizardStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("setupWizardState")
  private SetupWizardStateEnum setupWizardState = null;

  @SerializedName("department")
  private String department = null;

  public ExtensionInfoRequestContactInfo contact(ContactInfo contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact information
   * @return contact
  **/
  @ApiModelProperty(example = "null", value = "Contact information")
  public ContactInfo getContact() {
    return contact;
  }

  public void setContact(ContactInfo contact) {
    this.contact = contact;
  }

  public ExtensionInfoRequestContactInfo regionalSettings(ExtensionInfoRequestContactInfoRegionalSettings regionalSettings) {
    this.regionalSettings = regionalSettings;
    return this;
  }

   /**
   * Region data (timezone, home country, language)
   * @return regionalSettings
  **/
  @ApiModelProperty(example = "null", value = "Region data (timezone, home country, language)")
  public ExtensionInfoRequestContactInfoRegionalSettings getRegionalSettings() {
    return regionalSettings;
  }

  public void setRegionalSettings(ExtensionInfoRequestContactInfoRegionalSettings regionalSettings) {
    this.regionalSettings = regionalSettings;
  }

  public ExtensionInfoRequestContactInfo setupWizardState(SetupWizardStateEnum setupWizardState) {
    this.setupWizardState = setupWizardState;
    return this;
  }

   /**
   * Specifies extension configuration wizard state (web service setup). The default value is 'NotStarted'
   * @return setupWizardState
  **/
  @ApiModelProperty(example = "null", value = "Specifies extension configuration wizard state (web service setup). The default value is 'NotStarted'")
  public SetupWizardStateEnum getSetupWizardState() {
    return setupWizardState;
  }

  public void setSetupWizardState(SetupWizardStateEnum setupWizardState) {
    this.setupWizardState = setupWizardState;
  }

  public ExtensionInfoRequestContactInfo department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Extension user department
   * @return department
  **/
  @ApiModelProperty(example = "null", value = "Extension user department")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionInfoRequestContactInfo extensionInfoRequestContactInfo = (ExtensionInfoRequestContactInfo) o;
    return Objects.equals(this.contact, extensionInfoRequestContactInfo.contact) &&
        Objects.equals(this.regionalSettings, extensionInfoRequestContactInfo.regionalSettings) &&
        Objects.equals(this.setupWizardState, extensionInfoRequestContactInfo.setupWizardState) &&
        Objects.equals(this.department, extensionInfoRequestContactInfo.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, regionalSettings, setupWizardState, department);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionInfoRequestContactInfo {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    regionalSettings: ").append(toIndentedString(regionalSettings)).append("\n");
    sb.append("    setupWizardState: ").append(toIndentedString(setupWizardState)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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

