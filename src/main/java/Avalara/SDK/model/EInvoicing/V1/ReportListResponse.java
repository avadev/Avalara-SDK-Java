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
import Avalara.SDK.model.EInvoicing.V1.ReportItem;
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
 * Returns the requested list of reports matching the query parameters.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ReportListResponse {
  public static final String SERIALIZED_NAME_AT_RECORDSET_COUNT = "@recordsetCount";
  @SerializedName(SERIALIZED_NAME_AT_RECORDSET_COUNT)
  private String atRecordsetCount;

  public static final String SERIALIZED_NAME_AT_NEXT_LINK = "@nextLink";
  @SerializedName(SERIALIZED_NAME_AT_NEXT_LINK)
  private String atNextLink;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<ReportItem> value;

  public ReportListResponse() {
  }

  public ReportListResponse atRecordsetCount(String atRecordsetCount) {
    this.atRecordsetCount = atRecordsetCount;
    return this;
  }

  /**
   * Count of reports matching the filter for the given query. Present when the request includes $count&#x3D;true.
   * @return atRecordsetCount
   */
  @javax.annotation.Nullable
  public String getAtRecordsetCount() {
    return atRecordsetCount;
  }

  public void setAtRecordsetCount(String atRecordsetCount) {
    this.atRecordsetCount = atRecordsetCount;
  }


  public ReportListResponse atNextLink(String atNextLink) {
    this.atNextLink = atNextLink;
    return this;
  }

  /**
   * URL to retrieve the next page of results when more items match the query. Omitted or null when there is no next page.
   * @return atNextLink
   */
  @javax.annotation.Nullable
  public String getAtNextLink() {
    return atNextLink;
  }

  public void setAtNextLink(String atNextLink) {
    this.atNextLink = atNextLink;
  }


  public ReportListResponse value(List<ReportItem> value) {
    this.value = value;
    return this;
  }

  public ReportListResponse addValueItem(ReportItem valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Array of reports matching the query parameters.
   * @return value
   */
  @javax.annotation.Nonnull
  public List<ReportItem> getValue() {
    return value;
  }

  public void setValue(List<ReportItem> value) {
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
    ReportListResponse reportListResponse = (ReportListResponse) o;
    return Objects.equals(this.atRecordsetCount, reportListResponse.atRecordsetCount) &&
        Objects.equals(this.atNextLink, reportListResponse.atNextLink) &&
        Objects.equals(this.value, reportListResponse.value);
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
    sb.append("class ReportListResponse {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to ReportListResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportListResponse is not found in the empty JSON string", ReportListResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportListResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportListResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReportListResponse.openapiRequiredFields) {
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
        ReportItem.validateJsonElement(jsonArrayvalue.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportListResponse>() {
           @Override
           public void write(JsonWriter out, ReportListResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportListResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReportListResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportListResponse
   * @throws IOException if the JSON string is invalid with respect to ReportListResponse
   */
  public static ReportListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportListResponse.class);
  }

  /**
   * Convert an instance of ReportListResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

