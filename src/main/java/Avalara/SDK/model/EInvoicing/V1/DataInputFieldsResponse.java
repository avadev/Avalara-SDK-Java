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
import Avalara.SDK.model.EInvoicing.V1.DataInputField;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * DataInputFieldsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class DataInputFieldsResponse {
  public static final String SERIALIZED_NAME_AT_RECORDSET_COUNT = "@recordsetCount";
  @SerializedName(SERIALIZED_NAME_AT_RECORDSET_COUNT)
  private BigDecimal atRecordsetCount;

  public static final String SERIALIZED_NAME_AT_NEXT_LINK = "@nextLink";
  @SerializedName(SERIALIZED_NAME_AT_NEXT_LINK)
  private String atNextLink;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<DataInputField> value = new ArrayList<>();

  public DataInputFieldsResponse() {
  }

  public DataInputFieldsResponse atRecordsetCount(BigDecimal atRecordsetCount) {
    this.atRecordsetCount = atRecordsetCount;
    return this;
  }

  /**
   * Total count of results
   * @return atRecordsetCount
   */
  @javax.annotation.Nullable
  public BigDecimal getAtRecordsetCount() {
    return atRecordsetCount;
  }

  public void setAtRecordsetCount(BigDecimal atRecordsetCount) {
    this.atRecordsetCount = atRecordsetCount;
  }


  public DataInputFieldsResponse atNextLink(String atNextLink) {
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


  public DataInputFieldsResponse value(List<DataInputField> value) {
    this.value = value;
    return this;
  }

  public DataInputFieldsResponse addValueItem(DataInputField valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Array of Data Input Fields
   * @return value
   */
  @javax.annotation.Nullable
  public List<DataInputField> getValue() {
    return value;
  }

  public void setValue(List<DataInputField> value) {
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
    DataInputFieldsResponse dataInputFieldsResponse = (DataInputFieldsResponse) o;
    return Objects.equals(this.atRecordsetCount, dataInputFieldsResponse.atRecordsetCount) &&
        Objects.equals(this.atNextLink, dataInputFieldsResponse.atNextLink) &&
        Objects.equals(this.value, dataInputFieldsResponse.value);
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
    sb.append("class DataInputFieldsResponse {\n");
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
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DataInputFieldsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataInputFieldsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataInputFieldsResponse is not found in the empty JSON string", DataInputFieldsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataInputFieldsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataInputFieldsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("@nextLink") != null && !jsonObj.get("@nextLink").isJsonNull()) && !jsonObj.get("@nextLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `@nextLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("@nextLink").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull() && !jsonObj.get("value").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be an array in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataInputFieldsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataInputFieldsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataInputFieldsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataInputFieldsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DataInputFieldsResponse>() {
           @Override
           public void write(JsonWriter out, DataInputFieldsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataInputFieldsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DataInputFieldsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DataInputFieldsResponse
   * @throws IOException if the JSON string is invalid with respect to DataInputFieldsResponse
   */
  public static DataInputFieldsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataInputFieldsResponse.class);
  }

  /**
   * Convert an instance of DataInputFieldsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

