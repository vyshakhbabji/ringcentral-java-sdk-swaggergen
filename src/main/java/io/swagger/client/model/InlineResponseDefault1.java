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
 * InlineResponseDefault1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:06:07.317Z")
public class InlineResponseDefault1 {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("expires_in")
  private Integer expiresIn = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  @SerializedName("refresh_token_expires_in")
  private Integer refreshTokenExpiresIn = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("token_type")
  private String tokenType = null;

  @SerializedName("owner_id")
  private String ownerId = null;

  @SerializedName("endpoint_id")
  private String endpointId = null;

  public InlineResponseDefault1 accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Access token to pass to subsequent API requests
   * @return accessToken
  **/
  @ApiModelProperty(example = "null", value = "Access token to pass to subsequent API requests")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public InlineResponseDefault1 expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Issued access token TTL (time to live), in seconds
   * @return expiresIn
  **/
  @ApiModelProperty(example = "null", value = "Issued access token TTL (time to live), in seconds")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public InlineResponseDefault1 refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Refresh token to get a new access token, when the issued one expires
   * @return refreshToken
  **/
  @ApiModelProperty(example = "null", value = "Refresh token to get a new access token, when the issued one expires")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public InlineResponseDefault1 refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

   /**
   * Issued refresh token TTL (time to live), in seconds
   * @return refreshTokenExpiresIn
  **/
  @ApiModelProperty(example = "null", value = "Issued refresh token TTL (time to live), in seconds")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  public InlineResponseDefault1 scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * List of permissions allowed with this access token, white-space separated
   * @return scope
  **/
  @ApiModelProperty(example = "null", value = "List of permissions allowed with this access token, white-space separated")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public InlineResponseDefault1 tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Type of token. Use this parameter in Authorization header of requests
   * @return tokenType
  **/
  @ApiModelProperty(example = "null", value = "Type of token. Use this parameter in Authorization header of requests")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public InlineResponseDefault1 ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Extension identifier
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", value = "Extension identifier")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public InlineResponseDefault1 endpointId(String endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Unique identifier of a client application passed by the client, or auto-generated by server if not specified in request
   * @return endpointId
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier of a client application passed by the client, or auto-generated by server if not specified in request")
  public String getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(String endpointId) {
    this.endpointId = endpointId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponseDefault1 inlineResponseDefault1 = (InlineResponseDefault1) o;
    return Objects.equals(this.accessToken, inlineResponseDefault1.accessToken) &&
        Objects.equals(this.expiresIn, inlineResponseDefault1.expiresIn) &&
        Objects.equals(this.refreshToken, inlineResponseDefault1.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresIn, inlineResponseDefault1.refreshTokenExpiresIn) &&
        Objects.equals(this.scope, inlineResponseDefault1.scope) &&
        Objects.equals(this.tokenType, inlineResponseDefault1.tokenType) &&
        Objects.equals(this.ownerId, inlineResponseDefault1.ownerId) &&
        Objects.equals(this.endpointId, inlineResponseDefault1.endpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, refreshToken, refreshTokenExpiresIn, scope, tokenType, ownerId, endpointId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponseDefault1 {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
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

