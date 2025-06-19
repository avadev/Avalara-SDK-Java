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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * JobResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class JobResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_UPSERT = "upsert";
  @SerializedName(SERIALIZED_NAME_UPSERT)
  private Boolean upsert;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

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

  public JobResult() {
  }

  public JobResult id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public JobResult type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public JobResult dryRun(Boolean dryRun) {
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


  public JobResult upsert(Boolean upsert) {
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


  public JobResult status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public JobResult errorMessage(String errorMessage) {
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


  public JobResult totalProcessed(Integer totalProcessed) {
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


  public JobResult totalRows(Integer totalRows) {
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


  public JobResult updatedValid(Integer updatedValid) {
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


  public JobResult updatedNoEmail(Integer updatedNoEmail) {
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


  public JobResult updatedInvalid(Integer updatedInvalid) {
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


  public JobResult skippedDuplicate(Integer skippedDuplicate) {
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


  public JobResult skippedInvalid(Integer skippedInvalid) {
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


  public JobResult skippedMultipleMatches(Integer skippedMultipleMatches) {
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


  public JobResult notFound(Integer notFound) {
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


  public JobResult createdInvalid(Integer createdInvalid) {
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


  public JobResult createdNoEmail(Integer createdNoEmail) {
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


  public JobResult createdValid(Integer createdValid) {
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
    JobResult jobResult = (JobResult) o;
    return Objects.equals(this.id, jobResult.id) &&
        Objects.equals(this.type, jobResult.type) &&
        Objects.equals(this.dryRun, jobResult.dryRun) &&
        Objects.equals(this.upsert, jobResult.upsert) &&
        Objects.equals(this.status, jobResult.status) &&
        Objects.equals(this.errorMessage, jobResult.errorMessage) &&
        Objects.equals(this.totalProcessed, jobResult.totalProcessed) &&
        Objects.equals(this.totalRows, jobResult.totalRows) &&
        Objects.equals(this.updatedValid, jobResult.updatedValid) &&
        Objects.equals(this.updatedNoEmail, jobResult.updatedNoEmail) &&
        Objects.equals(this.updatedInvalid, jobResult.updatedInvalid) &&
        Objects.equals(this.skippedDuplicate, jobResult.skippedDuplicate) &&
        Objects.equals(this.skippedInvalid, jobResult.skippedInvalid) &&
        Objects.equals(this.skippedMultipleMatches, jobResult.skippedMultipleMatches) &&
        Objects.equals(this.notFound, jobResult.notFound) &&
        Objects.equals(this.createdInvalid, jobResult.createdInvalid) &&
        Objects.equals(this.createdNoEmail, jobResult.createdNoEmail) &&
        Objects.equals(this.createdValid, jobResult.createdValid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, dryRun, upsert, status, errorMessage, totalProcessed, totalRows, updatedValid, updatedNoEmail, updatedInvalid, skippedDuplicate, skippedInvalid, skippedMultipleMatches, notFound, createdInvalid, createdNoEmail, createdValid);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("type");
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
   * @throws IOException if the JSON Element is invalid with respect to JobResult
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JobResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobResult is not found in the empty JSON string", JobResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JobResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobResult.class));

       return (TypeAdapter<T>) new TypeAdapter<JobResult>() {
           @Override
           public void write(JsonWriter out, JobResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JobResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JobResult
   * @throws IOException if the JSON string is invalid with respect to JobResult
   */
  public static JobResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobResult.class);
  }

  /**
   * Convert an instance of JobResult to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

