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
 * AttachmentInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class AttachmentInfo {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("contentType")
  private String contentType = null;

  public AttachmentInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Link to custom data attachment
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Link to custom data attachment")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public AttachmentInfo contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Type of custom data attachment, see also MIME Types
   * @return contentType
  **/
  @ApiModelProperty(example = "null", value = "Type of custom data attachment, see also MIME Types")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentInfo attachmentInfo = (AttachmentInfo) o;
    return Objects.equals(this.uri, attachmentInfo.uri) &&
        Objects.equals(this.contentType, attachmentInfo.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, contentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentInfo {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
