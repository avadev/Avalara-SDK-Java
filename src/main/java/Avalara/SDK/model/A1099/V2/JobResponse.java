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
 * ## 🔐 Authentication  Generate a **license key** from: *[Avalara Portal](https://www.avalara.com/us/en/signin.html) → Settings → License and API Keys*.  [More on authentication methods](https://developer.avalara.com/avatax-dm-combined-erp/common-setup/authentication/authentication-methods/)  [Test your credentials](https://developer.avalara.com/avatax/test-credentials/)  ## 📘 API & SDK Documentation  [Avalara SDK (.NET) on GitHub](https://github.com/avadev/Avalara-SDK-DotNet#avalarasdk--the-unified-c-library-for-next-gen-avalara-services)  [Code Examples – 1099 API](https://github.com/avadev/Avalara-SDK-DotNet/blob/main/docs/A1099/V2/Class1099IssuersApi.md#call1099issuersget)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import Avalara.SDK.model.A1099.V2.Get1099Form200Response;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Response model for job operations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class JobResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  /**
   * Current status of the job (e.g., Success, Failed, InProgress)
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

  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_UPSERT = "upsert";
  @SerializedName(SERIALIZED_NAME_UPSERT)
  private Boolean upsert;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_PROCESSED_FORMS = "processedForms";
  @SerializedName(SERIALIZED_NAME_PROCESSED_FORMS)
  private List<Get1099Form200Response> processedForms;

  public JobResponse() {
  }

  public JobResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the job
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public JobResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Job type identifier. Will always be \&quot;update_job\&quot; for bulk upsert operations
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public JobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of the job (e.g., Success, Failed, InProgress)
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public JobResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Error message if the job failed, null otherwise
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public JobResponse totalProcessed(Integer totalProcessed) {
    this.totalProcessed = totalProcessed;
    return this;
  }

  /**
   * Total number of forms processed. Value can be 0 or another value based on what the job has available
   * @return totalProcessed
   */
  @javax.annotation.Nullable
  public Integer getTotalProcessed() {
    return totalProcessed;
  }

  public void setTotalProcessed(Integer totalProcessed) {
    this.totalProcessed = totalProcessed;
  }


  public JobResponse totalRows(Integer totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * Total number of forms in the request. Value can be 0 or another value based on what the job has available
   * @return totalRows
   */
  @javax.annotation.Nullable
  public Integer getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(Integer totalRows) {
    this.totalRows = totalRows;
  }


  public JobResponse updatedValid(Integer updatedValid) {
    this.updatedValid = updatedValid;
    return this;
  }

  /**
   * Number of forms updated and valid for e-filing and e-delivery. Value can be 0 or another value based on what the job has available
   * @return updatedValid
   */
  @javax.annotation.Nullable
  public Integer getUpdatedValid() {
    return updatedValid;
  }

  public void setUpdatedValid(Integer updatedValid) {
    this.updatedValid = updatedValid;
  }


  public JobResponse updatedNoEmail(Integer updatedNoEmail) {
    this.updatedNoEmail = updatedNoEmail;
    return this;
  }

  /**
   * Number of forms updated and valid for e-filing but missing email or email is undeliverable. Value can be 0 or another value based on what the job has available
   * @return updatedNoEmail
   */
  @javax.annotation.Nullable
  public Integer getUpdatedNoEmail() {
    return updatedNoEmail;
  }

  public void setUpdatedNoEmail(Integer updatedNoEmail) {
    this.updatedNoEmail = updatedNoEmail;
  }


  public JobResponse updatedInvalid(Integer updatedInvalid) {
    this.updatedInvalid = updatedInvalid;
    return this;
  }

  /**
   * Number of forms updated but invalid for e-filing. Value can be 0 or another value based on what the job has available
   * @return updatedInvalid
   */
  @javax.annotation.Nullable
  public Integer getUpdatedInvalid() {
    return updatedInvalid;
  }

  public void setUpdatedInvalid(Integer updatedInvalid) {
    this.updatedInvalid = updatedInvalid;
  }


  public JobResponse skippedDuplicate(Integer skippedDuplicate) {
    this.skippedDuplicate = skippedDuplicate;
    return this;
  }

  /**
   * Number of forms skipped because they would have updated a record already updated once in the request. Value can be 0 or another value based on what the job has available
   * @return skippedDuplicate
   */
  @javax.annotation.Nullable
  public Integer getSkippedDuplicate() {
    return skippedDuplicate;
  }

  public void setSkippedDuplicate(Integer skippedDuplicate) {
    this.skippedDuplicate = skippedDuplicate;
  }


  public JobResponse skippedInvalid(Integer skippedInvalid) {
    this.skippedInvalid = skippedInvalid;
    return this;
  }

  /**
   * Number of forms skipped because they would have made a form invalid and the form is already e-filed or scheduled for e-filing. Value can be 0 or another value based on what the job has available
   * @return skippedInvalid
   */
  @javax.annotation.Nullable
  public Integer getSkippedInvalid() {
    return skippedInvalid;
  }

  public void setSkippedInvalid(Integer skippedInvalid) {
    this.skippedInvalid = skippedInvalid;
  }


  public JobResponse skippedMultipleMatches(Integer skippedMultipleMatches) {
    this.skippedMultipleMatches = skippedMultipleMatches;
    return this;
  }

  /**
   * Number of forms skipped because they matched multiple forms. Value can be 0 or another value based on what the job has available
   * @return skippedMultipleMatches
   */
  @javax.annotation.Nullable
  public Integer getSkippedMultipleMatches() {
    return skippedMultipleMatches;
  }

  public void setSkippedMultipleMatches(Integer skippedMultipleMatches) {
    this.skippedMultipleMatches = skippedMultipleMatches;
  }


  public JobResponse notFound(Integer notFound) {
    this.notFound = notFound;
    return this;
  }

  /**
   * Number of forms skipped because no matching form or issuer could be found. Value can be 0 or another value based on what the job has available
   * @return notFound
   */
  @javax.annotation.Nullable
  public Integer getNotFound() {
    return notFound;
  }

  public void setNotFound(Integer notFound) {
    this.notFound = notFound;
  }


  public JobResponse createdInvalid(Integer createdInvalid) {
    this.createdInvalid = createdInvalid;
    return this;
  }

  /**
   * Number of new forms created because no matching form could be found (and &#x60;upsert&#x60; was true) - with errors. Value can be 0 or another value based on what the job has available
   * @return createdInvalid
   */
  @javax.annotation.Nullable
  public Integer getCreatedInvalid() {
    return createdInvalid;
  }

  public void setCreatedInvalid(Integer createdInvalid) {
    this.createdInvalid = createdInvalid;
  }


  public JobResponse createdNoEmail(Integer createdNoEmail) {
    this.createdNoEmail = createdNoEmail;
    return this;
  }

  /**
   * Number of new forms created because no matching form could be found (and &#x60;upsert&#x60; was true) - valid for e-filing but missing email or email is undeliverable. Value can be 0 or another value based on what the job has available
   * @return createdNoEmail
   */
  @javax.annotation.Nullable
  public Integer getCreatedNoEmail() {
    return createdNoEmail;
  }

  public void setCreatedNoEmail(Integer createdNoEmail) {
    this.createdNoEmail = createdNoEmail;
  }


  public JobResponse createdValid(Integer createdValid) {
    this.createdValid = createdValid;
    return this;
  }

  /**
   * Number of new forms created because no matching form could be found (and &#x60;upsert&#x60; was true) - valid for e-filing and e-delivery. Value can be 0 or another value based on what the job has available
   * @return createdValid
   */
  @javax.annotation.Nullable
  public Integer getCreatedValid() {
    return createdValid;
  }

  public void setCreatedValid(Integer createdValid) {
    this.createdValid = createdValid;
  }


  public JobResponse dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Dry run. If &#x60;true&#x60;, this job only simulates the changes but doesn&#39;t actually persist them.
   * @return dryRun
   */
  @javax.annotation.Nullable
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public JobResponse upsert(Boolean upsert) {
    this.upsert = upsert;
    return this;
  }

  /**
   * Upsert. If &#x60;true&#x60;, this job will first attempt to update existing records if matches can be found. Matches are done in the following order: Form ID, Form Reference ID and tax year, Form TIN and tax year.
   * @return upsert
   */
  @javax.annotation.Nullable
  public Boolean getUpsert() {
    return upsert;
  }

  public void setUpsert(Boolean upsert) {
    this.upsert = upsert;
  }


  public JobResponse link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Link to access the job details
   * @return link
   */
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  public JobResponse processedForms(List<Get1099Form200Response> processedForms) {
    this.processedForms = processedForms;
    return this;
  }

  public JobResponse addProcessedFormsItem(Get1099Form200Response processedFormsItem) {
    if (this.processedForms == null) {
      this.processedForms = new ArrayList<>();
    }
    this.processedForms.add(processedFormsItem);
    return this;
  }

  /**
   * List of processed forms returned when bulk-upsert processes ≤1000 records. Same format as GET /1099/forms response. Only available in bulk-upsert endpoint responses.
   * @return processedForms
   */
  @javax.annotation.Nullable
  public List<Get1099Form200Response> getProcessedForms() {
    return processedForms;
  }

  public void setProcessedForms(List<Get1099Form200Response> processedForms) {
    this.processedForms = processedForms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobResponse jobResponse = (JobResponse) o;
    return Objects.equals(this.id, jobResponse.id) &&
        Objects.equals(this.type, jobResponse.type) &&
        Objects.equals(this.status, jobResponse.status) &&
        Objects.equals(this.errorMessage, jobResponse.errorMessage) &&
        Objects.equals(this.totalProcessed, jobResponse.totalProcessed) &&
        Objects.equals(this.totalRows, jobResponse.totalRows) &&
        Objects.equals(this.updatedValid, jobResponse.updatedValid) &&
        Objects.equals(this.updatedNoEmail, jobResponse.updatedNoEmail) &&
        Objects.equals(this.updatedInvalid, jobResponse.updatedInvalid) &&
        Objects.equals(this.skippedDuplicate, jobResponse.skippedDuplicate) &&
        Objects.equals(this.skippedInvalid, jobResponse.skippedInvalid) &&
        Objects.equals(this.skippedMultipleMatches, jobResponse.skippedMultipleMatches) &&
        Objects.equals(this.notFound, jobResponse.notFound) &&
        Objects.equals(this.createdInvalid, jobResponse.createdInvalid) &&
        Objects.equals(this.createdNoEmail, jobResponse.createdNoEmail) &&
        Objects.equals(this.createdValid, jobResponse.createdValid) &&
        Objects.equals(this.dryRun, jobResponse.dryRun) &&
        Objects.equals(this.upsert, jobResponse.upsert) &&
        Objects.equals(this.link, jobResponse.link) &&
        Objects.equals(this.processedForms, jobResponse.processedForms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, errorMessage, totalProcessed, totalRows, updatedValid, updatedNoEmail, updatedInvalid, skippedDuplicate, skippedInvalid, skippedMultipleMatches, notFound, createdInvalid, createdNoEmail, createdValid, dryRun, upsert, link, processedForms);
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
    sb.append("class JobResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    upsert: ").append(toIndentedString(upsert)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    processedForms: ").append(toIndentedString(processedForms)).append("\n");
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
    openapiFields.add("dryRun");
    openapiFields.add("upsert");
    openapiFields.add("link");
    openapiFields.add("processedForms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to JobResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JobResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobResponse is not found in the empty JSON string", JobResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JobResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JobResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (jsonObj.get("processedForms") != null && !jsonObj.get("processedForms").isJsonNull()) {
        JsonArray jsonArrayprocessedForms = jsonObj.getAsJsonArray("processedForms");
        if (jsonArrayprocessedForms != null) {
          // ensure the json data is an array
          if (!jsonObj.get("processedForms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `processedForms` to be an array in the JSON string but got `%s`", jsonObj.get("processedForms").toString()));
          }

          // validate the optional field `processedForms` (array)
          for (int i = 0; i < jsonArrayprocessedForms.size(); i++) {
            Get1099Form200Response.validateJsonElement(jsonArrayprocessedForms.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<JobResponse>() {
           @Override
           public void write(JsonWriter out, JobResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JobResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of JobResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JobResponse
   * @throws IOException if the JSON string is invalid with respect to JobResponse
   */
  public static JobResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobResponse.class);
  }

  /**
   * Convert an instance of JobResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

