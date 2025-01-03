/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2025 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara E-Invoicing API
 *
 * An API that supports sending data for an E-Invoicing compliance use-case.
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.EInvoicing.V1;

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
 * Key value pairs of metadata for a document submission &lt;br&gt;&lt;pre&gt;{  \&quot;workflowId\&quot;: \&quot;partner-einvoicing\&quot;, \&quot;dataFormat\&quot;: \&quot;ubl-invoice\&quot;, \&quot;dataFormatVersion\&quot;: \&quot;2.1\&quot;, \&quot;countryCode\&quot;: \&quot;SA\&quot;, \&quot;countryMandate\&quot;: \&quot;SA-Phase1-B2B\&quot; }&lt;/pre&gt; &lt;br&gt; 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class SubmitDocumentMetadata {
  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_DATA_FORMAT = "dataFormat";
  @SerializedName(SERIALIZED_NAME_DATA_FORMAT)
  private String dataFormat;

  public static final String SERIALIZED_NAME_DATA_FORMAT_VERSION = "dataFormatVersion";
  @SerializedName(SERIALIZED_NAME_DATA_FORMAT_VERSION)
  private String dataFormatVersion;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_COUNTRY_MANDATE = "countryMandate";
  @SerializedName(SERIALIZED_NAME_COUNTRY_MANDATE)
  private String countryMandate;

  public SubmitDocumentMetadata() {
  }

  public SubmitDocumentMetadata workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * Specifies a unique ID for this workflow.
   * @return workflowId
   */
  @javax.annotation.Nonnull
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  public SubmitDocumentMetadata dataFormat(String dataFormat) {
    this.dataFormat = dataFormat;
    return this;
  }

  /**
   * Specifies the data format for this workflow.
   * @return dataFormat
   */
  @javax.annotation.Nonnull
  public String getDataFormat() {
    return dataFormat;
  }

  public void setDataFormat(String dataFormat) {
    this.dataFormat = dataFormat;
  }


  public SubmitDocumentMetadata dataFormatVersion(String dataFormatVersion) {
    this.dataFormatVersion = dataFormatVersion;
    return this;
  }

  /**
   * Specifies the data format version number.
   * @return dataFormatVersion
   */
  @javax.annotation.Nonnull
  public String getDataFormatVersion() {
    return dataFormatVersion;
  }

  public void setDataFormatVersion(String dataFormatVersion) {
    this.dataFormatVersion = dataFormatVersion;
  }


  public SubmitDocumentMetadata countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The two-letter ISO-3166 country code for the country where the document is being submitted
   * @return countryCode
   */
  @javax.annotation.Nonnull
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public SubmitDocumentMetadata countryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
    return this;
  }

  /**
   * The e-invoicing mandate for the specified country.
   * @return countryMandate
   */
  @javax.annotation.Nonnull
  public String getCountryMandate() {
    return countryMandate;
  }

  public void setCountryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitDocumentMetadata submitDocumentMetadata = (SubmitDocumentMetadata) o;
    return Objects.equals(this.workflowId, submitDocumentMetadata.workflowId) &&
        Objects.equals(this.dataFormat, submitDocumentMetadata.dataFormat) &&
        Objects.equals(this.dataFormatVersion, submitDocumentMetadata.dataFormatVersion) &&
        Objects.equals(this.countryCode, submitDocumentMetadata.countryCode) &&
        Objects.equals(this.countryMandate, submitDocumentMetadata.countryMandate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, dataFormat, dataFormatVersion, countryCode, countryMandate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitDocumentMetadata {\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
    sb.append("    dataFormatVersion: ").append(toIndentedString(dataFormatVersion)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryMandate: ").append(toIndentedString(countryMandate)).append("\n");
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
    openapiFields.add("workflowId");
    openapiFields.add("dataFormat");
    openapiFields.add("dataFormatVersion");
    openapiFields.add("countryCode");
    openapiFields.add("countryMandate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workflowId");
    openapiRequiredFields.add("dataFormat");
    openapiRequiredFields.add("dataFormatVersion");
    openapiRequiredFields.add("countryCode");
    openapiRequiredFields.add("countryMandate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitDocumentMetadata
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitDocumentMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitDocumentMetadata is not found in the empty JSON string", SubmitDocumentMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitDocumentMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitDocumentMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitDocumentMetadata.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("workflowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowId").toString()));
      }
      if (!jsonObj.get("dataFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataFormat").toString()));
      }
      if (!jsonObj.get("dataFormatVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataFormatVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataFormatVersion").toString()));
      }
      if (!jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if (!jsonObj.get("countryMandate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryMandate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryMandate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitDocumentMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitDocumentMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitDocumentMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitDocumentMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitDocumentMetadata>() {
           @Override
           public void write(JsonWriter out, SubmitDocumentMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitDocumentMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitDocumentMetadata given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitDocumentMetadata
   * @throws IOException if the JSON string is invalid with respect to SubmitDocumentMetadata
   */
  public static SubmitDocumentMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitDocumentMetadata.class);
  }

  /**
   * Convert an instance of SubmitDocumentMetadata to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

