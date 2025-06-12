/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2025 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara 1099 & W-9 API Definition
 *
 * ## 🔐 Authentication  Use **username/password** or generate a **license key** from: *Avalara Portal → Settings → License and API Keys*.  [More on authentication methods](https://developer.avalara.com/avatax-dm-combined-erp/common-setup/authentication/authentication-methods/)  [Test your credentials](https://developer.avalara.com/avatax/test-credentials/)  ## 📘 API & SDK Documentation  [Avalara SDK (.NET) on GitHub](https://github.com/avadev/Avalara-SDK-DotNet#avalarasdk--the-unified-c-library-for-next-gen-avalara-services)  [Code Examples – 1099 API](https://github.com/avadev/Avalara-SDK-DotNet/blob/main/docs/A1099/V2/Class1099IssuersApi.md#call1099issuersget)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Avalara.SDK.JSON;

/**
 * Attribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Attribute {
  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_UPSERT = "upsert";
  @SerializedName(SERIALIZED_NAME_UPSERT)
  private Boolean upsert;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IN_PROGRESS("InProgress"),
    
    SUCCESS("Success"),
    
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_TOTAL_PROCESSED = "totalProcessed";
  @SerializedName(SERIALIZED_NAME_TOTAL_PROCESSED)
  private Integer totalProcessed;

  public static final String SERIALIZED_NAME_TOTAL_ROWS = "totalRows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  private Integer totalRows;

  public static final String SERIALIZED_NAME_UPDATED_VALID = "updatedValid";
  @SerializedName(SERIALIZED_NAME_UPDATED_VALID)
  private Integer updatedValid;

  public static final String SERIALIZED_NAME_UPDATED_NO_EMAIL = "updatedNoEmail";
  @SerializedName(SERIALIZED_NAME_UPDATED_NO_EMAIL)
  private Integer updatedNoEmail;

  public static final String SERIALIZED_NAME_UPDATED_INVALID = "updatedInvalid";
  @SerializedName(SERIALIZED_NAME_UPDATED_INVALID)
  private Integer updatedInvalid;

  public static final String SERIALIZED_NAME_SKIPPED_DUPLICATE = "skippedDuplicate";
  @SerializedName(SERIALIZED_NAME_SKIPPED_DUPLICATE)
  private Integer skippedDuplicate;

  public static final String SERIALIZED_NAME_SKIPPED_INVALID = "skippedInvalid";
  @SerializedName(SERIALIZED_NAME_SKIPPED_INVALID)
  private Integer skippedInvalid;

  public static final String SERIALIZED_NAME_SKIPPED_MULTIPLE_MATCHES = "skippedMultipleMatches";
  @SerializedName(SERIALIZED_NAME_SKIPPED_MULTIPLE_MATCHES)
  private Integer skippedMultipleMatches;

  public static final String SERIALIZED_NAME_NOT_FOUND = "notFound";
  @SerializedName(SERIALIZED_NAME_NOT_FOUND)
  private Integer notFound;

  public static final String SERIALIZED_NAME_CREATED_INVALID = "createdInvalid";
  @SerializedName(SERIALIZED_NAME_CREATED_INVALID)
  private Integer createdInvalid;

  public static final String SERIALIZED_NAME_CREATED_NO_EMAIL = "createdNoEmail";
  @SerializedName(SERIALIZED_NAME_CREATED_NO_EMAIL)
  private Integer createdNoEmail;

  public static final String SERIALIZED_NAME_CREATED_VALID = "createdValid";
  @SerializedName(SERIALIZED_NAME_CREATED_VALID)
  private Integer createdValid;

  public Attribute() {
  }

  public Attribute dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Get dryRun
   * @return dryRun
   */
  @javax.annotation.Nullable
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public Attribute upsert(Boolean upsert) {
    this.upsert = upsert;
    return this;
  }

  /**
   * Get upsert
   * @return upsert
   */
  @javax.annotation.Nullable
  public Boolean getUpsert() {
    return upsert;
  }

  public void setUpsert(Boolean upsert) {
    this.upsert = upsert;
  }


  public Attribute status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Attribute errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public Attribute totalProcessed(Integer totalProcessed) {
    this.totalProcessed = totalProcessed;
    return this;
  }

  /**
   * Get totalProcessed
   * @return totalProcessed
   */
  @javax.annotation.Nullable
  public Integer getTotalProcessed() {
    return totalProcessed;
  }

  public void setTotalProcessed(Integer totalProcessed) {
    this.totalProcessed = totalProcessed;
  }


  public Attribute totalRows(Integer totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * Get totalRows
   * @return totalRows
   */
  @javax.annotation.Nullable
  public Integer getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(Integer totalRows) {
    this.totalRows = totalRows;
  }


  public Attribute updatedValid(Integer updatedValid) {
    this.updatedValid = updatedValid;
    return this;
  }

  /**
   * Get updatedValid
   * @return updatedValid
   */
  @javax.annotation.Nullable
  public Integer getUpdatedValid() {
    return updatedValid;
  }

  public void setUpdatedValid(Integer updatedValid) {
    this.updatedValid = updatedValid;
  }


  public Attribute updatedNoEmail(Integer updatedNoEmail) {
    this.updatedNoEmail = updatedNoEmail;
    return this;
  }

  /**
   * Get updatedNoEmail
   * @return updatedNoEmail
   */
  @javax.annotation.Nullable
  public Integer getUpdatedNoEmail() {
    return updatedNoEmail;
  }

  public void setUpdatedNoEmail(Integer updatedNoEmail) {
    this.updatedNoEmail = updatedNoEmail;
  }


  public Attribute updatedInvalid(Integer updatedInvalid) {
    this.updatedInvalid = updatedInvalid;
    return this;
  }

  /**
   * Get updatedInvalid
   * @return updatedInvalid
   */
  @javax.annotation.Nullable
  public Integer getUpdatedInvalid() {
    return updatedInvalid;
  }

  public void setUpdatedInvalid(Integer updatedInvalid) {
    this.updatedInvalid = updatedInvalid;
  }


  public Attribute skippedDuplicate(Integer skippedDuplicate) {
    this.skippedDuplicate = skippedDuplicate;
    return this;
  }

  /**
   * Get skippedDuplicate
   * @return skippedDuplicate
   */
  @javax.annotation.Nullable
  public Integer getSkippedDuplicate() {
    return skippedDuplicate;
  }

  public void setSkippedDuplicate(Integer skippedDuplicate) {
    this.skippedDuplicate = skippedDuplicate;
  }


  public Attribute skippedInvalid(Integer skippedInvalid) {
    this.skippedInvalid = skippedInvalid;
    return this;
  }

  /**
   * Get skippedInvalid
   * @return skippedInvalid
   */
  @javax.annotation.Nullable
  public Integer getSkippedInvalid() {
    return skippedInvalid;
  }

  public void setSkippedInvalid(Integer skippedInvalid) {
    this.skippedInvalid = skippedInvalid;
  }


  public Attribute skippedMultipleMatches(Integer skippedMultipleMatches) {
    this.skippedMultipleMatches = skippedMultipleMatches;
    return this;
  }

  /**
   * Get skippedMultipleMatches
   * @return skippedMultipleMatches
   */
  @javax.annotation.Nullable
  public Integer getSkippedMultipleMatches() {
    return skippedMultipleMatches;
  }

  public void setSkippedMultipleMatches(Integer skippedMultipleMatches) {
    this.skippedMultipleMatches = skippedMultipleMatches;
  }


  public Attribute notFound(Integer notFound) {
    this.notFound = notFound;
    return this;
  }

  /**
   * Get notFound
   * @return notFound
   */
  @javax.annotation.Nullable
  public Integer getNotFound() {
    return notFound;
  }

  public void setNotFound(Integer notFound) {
    this.notFound = notFound;
  }


  public Attribute createdInvalid(Integer createdInvalid) {
    this.createdInvalid = createdInvalid;
    return this;
  }

  /**
   * Get createdInvalid
   * @return createdInvalid
   */
  @javax.annotation.Nullable
  public Integer getCreatedInvalid() {
    return createdInvalid;
  }

  public void setCreatedInvalid(Integer createdInvalid) {
    this.createdInvalid = createdInvalid;
  }


  public Attribute createdNoEmail(Integer createdNoEmail) {
    this.createdNoEmail = createdNoEmail;
    return this;
  }

  /**
   * Get createdNoEmail
   * @return createdNoEmail
   */
  @javax.annotation.Nullable
  public Integer getCreatedNoEmail() {
    return createdNoEmail;
  }

  public void setCreatedNoEmail(Integer createdNoEmail) {
    this.createdNoEmail = createdNoEmail;
  }


  public Attribute createdValid(Integer createdValid) {
    this.createdValid = createdValid;
    return this;
  }

  /**
   * Get createdValid
   * @return createdValid
   */
  @javax.annotation.Nullable
  public Integer getCreatedValid() {
    return createdValid;
  }

  public void setCreatedValid(Integer createdValid) {
    this.createdValid = createdValid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.dryRun, attribute.dryRun) &&
        Objects.equals(this.upsert, attribute.upsert) &&
        Objects.equals(this.status, attribute.status) &&
        Objects.equals(this.errorMessage, attribute.errorMessage) &&
        Objects.equals(this.totalProcessed, attribute.totalProcessed) &&
        Objects.equals(this.totalRows, attribute.totalRows) &&
        Objects.equals(this.updatedValid, attribute.updatedValid) &&
        Objects.equals(this.updatedNoEmail, attribute.updatedNoEmail) &&
        Objects.equals(this.updatedInvalid, attribute.updatedInvalid) &&
        Objects.equals(this.skippedDuplicate, attribute.skippedDuplicate) &&
        Objects.equals(this.skippedInvalid, attribute.skippedInvalid) &&
        Objects.equals(this.skippedMultipleMatches, attribute.skippedMultipleMatches) &&
        Objects.equals(this.notFound, attribute.notFound) &&
        Objects.equals(this.createdInvalid, attribute.createdInvalid) &&
        Objects.equals(this.createdNoEmail, attribute.createdNoEmail) &&
        Objects.equals(this.createdValid, attribute.createdValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, upsert, status, errorMessage, totalProcessed, totalRows, updatedValid, updatedNoEmail, updatedInvalid, skippedDuplicate, skippedInvalid, skippedMultipleMatches, notFound, createdInvalid, createdNoEmail, createdValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attribute {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    upsert: ").append(toIndentedString(upsert)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    totalProcessed: ").append(toIndentedString(totalProcessed)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    updatedValid: ").append(toIndentedString(updatedValid)).append("\n");
    sb.append("    updatedNoEmail: ").append(toIndentedString(updatedNoEmail)).append("\n");
    sb.append("    updatedInvalid: ").append(toIndentedString(updatedInvalid)).append("\n");
    sb.append("    skippedDuplicate: ").append(toIndentedString(skippedDuplicate)).append("\n");
    sb.append("    skippedInvalid: ").append(toIndentedString(skippedInvalid)).append("\n");
    sb.append("    skippedMultipleMatches: ").append(toIndentedString(skippedMultipleMatches)).append("\n");
    sb.append("    notFound: ").append(toIndentedString(notFound)).append("\n");
    sb.append("    createdInvalid: ").append(toIndentedString(createdInvalid)).append("\n");
    sb.append("    createdNoEmail: ").append(toIndentedString(createdNoEmail)).append("\n");
    sb.append("    createdValid: ").append(toIndentedString(createdValid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("dryRun");
    openapiFields.add("upsert");
    openapiFields.add("status");
    openapiFields.add("errorMessage");
    openapiFields.add("totalProcessed");
    openapiFields.add("totalRows");
    openapiFields.add("updatedValid");
    openapiFields.add("updatedNoEmail");
    openapiFields.add("updatedInvalid");
    openapiFields.add("skippedDuplicate");
    openapiFields.add("skippedInvalid");
    openapiFields.add("skippedMultipleMatches");
    openapiFields.add("notFound");
    openapiFields.add("createdInvalid");
    openapiFields.add("createdNoEmail");
    openapiFields.add("createdValid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Attribute
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Attribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Attribute is not found in the empty JSON string", Attribute.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Attribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Attribute` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Attribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Attribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Attribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Attribute.class));

       return (TypeAdapter<T>) new TypeAdapter<Attribute>() {
           @Override
           public void write(JsonWriter out, Attribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Attribute read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Attribute given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Attribute
   * @throws IOException if the JSON string is invalid with respect to Attribute
   */
  public static Attribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Attribute.class);
  }

  /**
   * Convert an instance of Attribute to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

