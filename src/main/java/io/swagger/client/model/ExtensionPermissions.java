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
import io.swagger.client.model.PermissionInfo;

/**
 * ExtensionPermissions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class ExtensionPermissions {
  @SerializedName("admin")
  private PermissionInfo admin = null;

  @SerializedName("internationalCalling")
  private PermissionInfo internationalCalling = null;

  public ExtensionPermissions admin(PermissionInfo admin) {
    this.admin = admin;
    return this;
  }

   /**
   * Admin permission
   * @return admin
  **/
  @ApiModelProperty(example = "null", value = "Admin permission")
  public PermissionInfo getAdmin() {
    return admin;
  }

  public void setAdmin(PermissionInfo admin) {
    this.admin = admin;
  }

  public ExtensionPermissions internationalCalling(PermissionInfo internationalCalling) {
    this.internationalCalling = internationalCalling;
    return this;
  }

   /**
   * International Calling permission
   * @return internationalCalling
  **/
  @ApiModelProperty(example = "null", value = "International Calling permission")
  public PermissionInfo getInternationalCalling() {
    return internationalCalling;
  }

  public void setInternationalCalling(PermissionInfo internationalCalling) {
    this.internationalCalling = internationalCalling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionPermissions extensionPermissions = (ExtensionPermissions) o;
    return Objects.equals(this.admin, extensionPermissions.admin) &&
        Objects.equals(this.internationalCalling, extensionPermissions.internationalCalling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, internationalCalling);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionPermissions {\n");
    
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    internationalCalling: ").append(toIndentedString(internationalCalling)).append("\n");
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
