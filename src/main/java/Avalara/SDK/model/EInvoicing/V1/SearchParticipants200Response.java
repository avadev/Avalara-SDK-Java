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
import Avalara.SDK.model.EInvoicing.V1.TradingPartner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * SearchParticipants200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class SearchParticipants200Response {
  public static final String SERIALIZED_NAME_AT_RECORD_SET_COUNT = "@recordSetCount";
  @SerializedName(SERIALIZED_NAME_AT_RECORD_SET_COUNT)
  private Integer atRecordSetCount;

  public static final String SERIALIZED_NAME_AT_NEXT_LINK = "@nextLink";
  @SerializedName(SERIALIZED_NAME_AT_NEXT_LINK)
  private String atNextLink;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<TradingPartner> value;

  public SearchParticipants200Response() {
  }

  public SearchParticipants200Response atRecordSetCount(Integer atRecordSetCount) {
    this.atRecordSetCount = atRecordSetCount;
    return this;
  }

  /**
   * The count of records in the result set.
   * @return atRecordSetCount
   */
  @javax.annotation.Nullable
  public Integer getAtRecordSetCount() {
    return atRecordSetCount;
  }

  public void setAtRecordSetCount(Integer atRecordSetCount) {
    this.atRecordSetCount = atRecordSetCount;
  }


  public SearchParticipants200Response atNextLink(String atNextLink) {
    this.atNextLink = atNextLink;
    return this;
  }

  /**
   * The next page link to get the next set of results.
   * @return atNextLink
   */
  @javax.annotation.Nullable
  public String getAtNextLink() {
    return atNextLink;
  }

  public void setAtNextLink(String atNextLink) {
    this.atNextLink = atNextLink;
  }


  public SearchParticipants200Response value(List<TradingPartner> value) {
    this.value = value;
    return this;
  }

  public SearchParticipants200Response addValueItem(TradingPartner valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public List<TradingPartner> getValue() {
    return value;
  }

  public void setValue(List<TradingPartner> value) {
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
    SearchParticipants200Response searchParticipants200Response = (SearchParticipants200Response) o;
    return Objects.equals(this.atRecordSetCount, searchParticipants200Response.atRecordSetCount) &&
        Objects.equals(this.atNextLink, searchParticipants200Response.atNextLink) &&
        Objects.equals(this.value, searchParticipants200Response.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atRecordSetCount, atNextLink, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchParticipants200Response {\n");
    sb.append("    atRecordSetCount: ").append(toIndentedString(atRecordSetCount)).append("\n");
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
    openapiFields.add("@recordSetCount");
    openapiFields.add("@nextLink");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchParticipants200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchParticipants200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchParticipants200Response is not found in the empty JSON string", SearchParticipants200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchParticipants200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchParticipants200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("@nextLink") != null && !jsonObj.get("@nextLink").isJsonNull()) && !jsonObj.get("@nextLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `@nextLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("@nextLink").toString()));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        JsonArray jsonArrayvalue = jsonObj.getAsJsonArray("value");
        if (jsonArrayvalue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("value").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `value` to be an array in the JSON string but got `%s`", jsonObj.get("value").toString()));
          }

          // validate the optional field `value` (array)
          for (int i = 0; i < jsonArrayvalue.size(); i++) {
            TradingPartner.validateJsonElement(jsonArrayvalue.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchParticipants200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchParticipants200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchParticipants200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchParticipants200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchParticipants200Response>() {
           @Override
           public void write(JsonWriter out, SearchParticipants200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchParticipants200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchParticipants200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchParticipants200Response
   * @throws IOException if the JSON string is invalid with respect to SearchParticipants200Response
   */
  public static SearchParticipants200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchParticipants200Response.class);
  }

  /**
   * Convert an instance of SearchParticipants200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

