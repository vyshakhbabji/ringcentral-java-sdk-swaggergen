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
 * GroupInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class GroupInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("contactsCount")
  private Integer contactsCount = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("notes")
  private String notes = null;

  public GroupInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Internal identifier of a group
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Internal identifier of a group")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GroupInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Canonical URI of a group
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "Canonical URI of a group")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public GroupInfo contactsCount(Integer contactsCount) {
    this.contactsCount = contactsCount;
    return this;
  }

   /**
   * Amount of contacts in a group
   * @return contactsCount
  **/
  @ApiModelProperty(example = "null", value = "Amount of contacts in a group")
  public Integer getContactsCount() {
    return contactsCount;
  }

  public void setContactsCount(Integer contactsCount) {
    this.contactsCount = contactsCount;
  }

  public GroupInfo groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Name of a group
   * @return groupName
  **/
  @ApiModelProperty(example = "null", value = "Name of a group")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public GroupInfo notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes for a group
   * @return notes
  **/
  @ApiModelProperty(example = "null", value = "Notes for a group")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupInfo groupInfo = (GroupInfo) o;
    return Objects.equals(this.id, groupInfo.id) &&
        Objects.equals(this.uri, groupInfo.uri) &&
        Objects.equals(this.contactsCount, groupInfo.contactsCount) &&
        Objects.equals(this.groupName, groupInfo.groupName) &&
        Objects.equals(this.notes, groupInfo.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, contactsCount, groupName, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    contactsCount: ").append(toIndentedString(contactsCount)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

