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
import Avalara.SDK.model.EInvoicing.V1.DocumentSummary;
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
 * Returns the requested list of documents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class DocumentListResponse {
  public static final String SERIALIZED_NAME_AT_RECORDSET_COUNT = "@recordsetCount";
  @SerializedName(SERIALIZED_NAME_AT_RECORDSET_COUNT)
  private String atRecordsetCount;

  public static final String SERIALIZED_NAME_AT_NEXT_LINK = "@nextLink";
  @SerializedName(SERIALIZED_NAME_AT_NEXT_LINK)
  private String atNextLink;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<DocumentSummary> value = new ArrayList<>();

  public DocumentListResponse() {
  }

  public DocumentListResponse atRecordsetCount(String atRecordsetCount) {
    this.atRecordsetCount = atRecordsetCount;
    return this;
  }

  /**
   * Count of collections for the given date range
   * @return atRecordsetCount
   */
  @javax.annotation.Nullable
  public String getAtRecordsetCount() {
    return atRecordsetCount;
  }

  public void setAtRecordsetCount(String atRecordsetCount) {
    this.atRecordsetCount = atRecordsetCount;
  }


  public DocumentListResponse atNextLink(String atNextLink) {
    this.atNextLink = atNextLink;
    return this;
  }

  /**
   * Get atNextLink
   * @return atNextLink
   */
  @javax.annotation.Nullable
  public String getAtNextLink() {
    return atNextLink;
  }

  public void setAtNextLink(String atNextLink) {
    this.atNextLink = atNextLink;
  }


  public DocumentListResponse value(List<DocumentSummary> value) {
    this.value = value;
    return this;
  }

  public DocumentListResponse addValueItem(DocumentSummary valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Array of documents matching query parameters
   * @return value
   */
  @javax.annotation.Nonnull
  public List<DocumentSummary> getValue() {
    return value;
  }

  public void setValue(List<DocumentSummary> value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentListResponse documentListResponse = (DocumentListResponse) o;
    return Objects.equals(this.atRecordsetCount, documentListResponse.atRecordsetCount) &&
        Objects.equals(this.atNextLink, documentListResponse.atNextLink) &&
        Objects.equals(this.value, documentListResponse.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(atRecordsetCount, atNextLink, value);
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
    sb.append("class DocumentListResponse {\n");
    sb.append("    atRecordsetCount: ").append(toIndentedString(atRecordsetCount)).append("\n");
    sb.append("    atNextLink: ").append(toIndentedString(atNextLink)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("@recordsetCount");
    openapiFields.add("@nextLink");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentListResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentListResponse is not found in the empty JSON string", DocumentListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentListResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentListResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("@recordsetCount") != null && !jsonObj.get("@recordsetCount").isJsonNull()) && !jsonObj.get("@recordsetCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `@recordsetCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("@recordsetCount").toString()));
      }
      if ((jsonObj.get("@nextLink") != null && !jsonObj.get("@nextLink").isJsonNull()) && !jsonObj.get("@nextLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `@nextLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("@nextLink").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("value").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be an array in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }

      JsonArray jsonArrayvalue = jsonObj.getAsJsonArray("value");
      // validate the required field `value` (array)
      for (int i = 0; i < jsonArrayvalue.size(); i++) {
        DocumentSummary.validateJsonElement(jsonArrayvalue.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentListResponse>() {
           @Override
           public void write(JsonWriter out, DocumentListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentListResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentListResponse
   * @throws IOException if the JSON string is invalid with respect to DocumentListResponse
   */
  public static DocumentListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentListResponse.class);
  }

  /**
   * Convert an instance of DocumentListResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

