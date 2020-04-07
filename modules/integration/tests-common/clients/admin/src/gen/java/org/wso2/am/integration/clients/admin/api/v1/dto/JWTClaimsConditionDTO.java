/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.16.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.wso2.am.integration.clients.admin.api.v1.dto.ThrottleConditionDTO;

/**
 * JWTClaimsConditionDTO
 */

public class JWTClaimsConditionDTO {
  /**
   * Type of the thottling condition. Allowed values are HeaderCondition, IPCondition, JWTClaimsCondition, QueryParameterCondition 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    HEADERCONDITION("HeaderCondition"),
    
    IPCONDITION("IPCondition"),
    
    JWTCLAIMSCONDITION("JWTClaimsCondition"),
    
    QUERYPARAMETERCONDITION("QueryParameterCondition");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("invertCondition")
  private Boolean invertCondition = false;

  @SerializedName("claimUrl")
  private String claimUrl = null;

  @SerializedName("attribute")
  private String attribute = null;

  public JWTClaimsConditionDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the thottling condition. Allowed values are HeaderCondition, IPCondition, JWTClaimsCondition, QueryParameterCondition 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the thottling condition. Allowed values are HeaderCondition, IPCondition, JWTClaimsCondition, QueryParameterCondition ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public JWTClaimsConditionDTO invertCondition(Boolean invertCondition) {
    this.invertCondition = invertCondition;
    return this;
  }

   /**
   * Specifies whether inversion of the condition to be matched against the request.  **Note:** When you add conditional groups for advanced throttling policies, this paramater should have the same value (&#x60;true&#x60; or &#x60;false&#x60;) for the same type of conditional group. 
   * @return invertCondition
  **/
  @ApiModelProperty(value = "Specifies whether inversion of the condition to be matched against the request.  **Note:** When you add conditional groups for advanced throttling policies, this paramater should have the same value (`true` or `false`) for the same type of conditional group. ")
  public Boolean isInvertCondition() {
    return invertCondition;
  }

  public void setInvertCondition(Boolean invertCondition) {
    this.invertCondition = invertCondition;
  }

  public JWTClaimsConditionDTO claimUrl(String claimUrl) {
    this.claimUrl = claimUrl;
    return this;
  }

   /**
   * JWT claim URL
   * @return claimUrl
  **/
  @ApiModelProperty(value = "JWT claim URL")
  public String getClaimUrl() {
    return claimUrl;
  }

  public void setClaimUrl(String claimUrl) {
    this.claimUrl = claimUrl;
  }

  public JWTClaimsConditionDTO attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Attribute to be matched
   * @return attribute
  **/
  @ApiModelProperty(value = "Attribute to be matched")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTClaimsConditionDTO jwTClaimsCondition = (JWTClaimsConditionDTO) o;
    return Objects.equals(this.type, jwTClaimsCondition.type) &&
        Objects.equals(this.invertCondition, jwTClaimsCondition.invertCondition) &&
        Objects.equals(this.claimUrl, jwTClaimsCondition.claimUrl) &&
        Objects.equals(this.attribute, jwTClaimsCondition.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, invertCondition, claimUrl, attribute);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTClaimsConditionDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    invertCondition: ").append(toIndentedString(invertCondition)).append("\n");
    sb.append("    claimUrl: ").append(toIndentedString(claimUrl)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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

