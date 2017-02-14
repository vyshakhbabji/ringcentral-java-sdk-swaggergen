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
 * ExtensionInfoRequestContactInfoRegionalSettingsTimezone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ExtensionInfoRequestContactInfoRegionalSettingsTimezone {
  @SerializedName("id")
  private String id = null;

  public ExtensionInfoRequestContactInfoRegionalSettingsTimezone id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Timezone identifier. The default value is \"58\" (US&Canada)
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Timezone identifier. The default value is \"58\" (US&Canada)")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionInfoRequestContactInfoRegionalSettingsTimezone extensionInfoRequestContactInfoRegionalSettingsTimezone = (ExtensionInfoRequestContactInfoRegionalSettingsTimezone) o;
    return Objects.equals(this.id, extensionInfoRequestContactInfoRegionalSettingsTimezone.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionInfoRequestContactInfoRegionalSettingsTimezone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

