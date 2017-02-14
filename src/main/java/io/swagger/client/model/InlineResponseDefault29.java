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
import io.swagger.client.model.AttachmentInfo;

/**
 * InlineResponseDefault29
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class InlineResponseDefault29 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("lastModifiedTime")
  private String lastModifiedTime = null;

  @SerializedName("attachment")
  private AttachmentInfo attachment = null;

  public InlineResponseDefault29 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Custom data access key
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Custom data access key")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponseDefault29 uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Link to the custom data
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Link to the custom data")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public InlineResponseDefault29 value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Description of custom data
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "Description of custom data")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public InlineResponseDefault29 lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Time of the last change in custom data
   * @return lastModifiedTime
  **/
  @ApiModelProperty(example = "null", value = "Time of the last change in custom data")
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public InlineResponseDefault29 attachment(AttachmentInfo attachment) {
    this.attachment = attachment;
    return this;
  }

   /**
   * Attachment data: link and type
   * @return attachment
  **/
  @ApiModelProperty(example = "null", value = "Attachment data: link and type")
  public AttachmentInfo getAttachment() {
    return attachment;
  }

  public void setAttachment(AttachmentInfo attachment) {
    this.attachment = attachment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefault29 inlineResponseDefault29 = (InlineResponseDefault29) o;
    return Objects.equals(this.id, inlineResponseDefault29.id) &&
        Objects.equals(this.uri, inlineResponseDefault29.uri) &&
        Objects.equals(this.value, inlineResponseDefault29.value) &&
        Objects.equals(this.lastModifiedTime, inlineResponseDefault29.lastModifiedTime) &&
        Objects.equals(this.attachment, inlineResponseDefault29.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, value, lastModifiedTime, attachment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault29 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

