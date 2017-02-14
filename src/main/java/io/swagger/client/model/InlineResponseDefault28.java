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
import io.swagger.client.model.AccountLimits;
import io.swagger.client.model.ServiceFeatureInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponseDefault28
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class InlineResponseDefault28 {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("servicePlanName")
  private String servicePlanName = null;

  @SerializedName("serviceFeatures")
  private List<ServiceFeatureInfo> serviceFeatures = new ArrayList<ServiceFeatureInfo>();

  @SerializedName("limits")
  private AccountLimits limits = null;

  public InlineResponseDefault28 uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of the account Service Info resource
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of the account Service Info resource")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public InlineResponseDefault28 servicePlanName(String servicePlanName) {
    this.servicePlanName = servicePlanName;
    return this;
  }

   /**
   * Account Service Plan name
   * @return servicePlanName
  **/
  @ApiModelProperty(example = "null", value = "Account Service Plan name")
  public String getServicePlanName() {
    return servicePlanName;
  }

  public void setServicePlanName(String servicePlanName) {
    this.servicePlanName = servicePlanName;
  }

  public InlineResponseDefault28 serviceFeatures(List<ServiceFeatureInfo> serviceFeatures) {
    this.serviceFeatures = serviceFeatures;
    return this;
  }

  public InlineResponseDefault28 addServiceFeaturesItem(ServiceFeatureInfo serviceFeaturesItem) {
    this.serviceFeatures.add(serviceFeaturesItem);
    return this;
  }

   /**
   * Service features information, see Service Feature List
   * @return serviceFeatures
  **/
  @ApiModelProperty(example = "null", value = "Service features information, see Service Feature List")
  public List<ServiceFeatureInfo> getServiceFeatures() {
    return serviceFeatures;
  }

  public void setServiceFeatures(List<ServiceFeatureInfo> serviceFeatures) {
    this.serviceFeatures = serviceFeatures;
  }

  public InlineResponseDefault28 limits(AccountLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Limits which are effective for the account
   * @return limits
  **/
  @ApiModelProperty(example = "null", value = "Limits which are effective for the account")
  public AccountLimits getLimits() {
    return limits;
  }

  public void setLimits(AccountLimits limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefault28 inlineResponseDefault28 = (InlineResponseDefault28) o;
    return Objects.equals(this.uri, inlineResponseDefault28.uri) &&
        Objects.equals(this.servicePlanName, inlineResponseDefault28.servicePlanName) &&
        Objects.equals(this.serviceFeatures, inlineResponseDefault28.serviceFeatures) &&
        Objects.equals(this.limits, inlineResponseDefault28.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, servicePlanName, serviceFeatures, limits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault28 {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    servicePlanName: ").append(toIndentedString(servicePlanName)).append("\n");
    sb.append("    serviceFeatures: ").append(toIndentedString(serviceFeatures)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

