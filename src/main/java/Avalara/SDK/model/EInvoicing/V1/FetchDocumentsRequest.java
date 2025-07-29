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
import Avalara.SDK.model.EInvoicing.V1.FetchDocumentsRequestDataInner;
import Avalara.SDK.model.EInvoicing.V1.FetchDocumentsRequestMetadata;
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
 * FetchDocumentsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class FetchDocumentsRequest {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<FetchDocumentsRequestDataInner> data;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private FetchDocumentsRequestMetadata metadata;

  public FetchDocumentsRequest() {
  }

  public FetchDocumentsRequest data(List<FetchDocumentsRequestDataInner> data) {
    this.data = data;
    return this;
  }

  public FetchDocumentsRequest addDataItem(FetchDocumentsRequestDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Array of key-value pairs used to retrieve inbound documents from the Tax Authority
   * @return data
   */
  @javax.annotation.Nullable
  public List<FetchDocumentsRequestDataInner> getData() {
    return data;
  }

  public void setData(List<FetchDocumentsRequestDataInner> data) {
    this.data = data;
  }


  public FetchDocumentsRequest metadata(FetchDocumentsRequestMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  public FetchDocumentsRequestMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(FetchDocumentsRequestMetadata metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FetchDocumentsRequest fetchDocumentsRequest = (FetchDocumentsRequest) o;
    return Objects.equals(this.data, fetchDocumentsRequest.data) &&
        Objects.equals(this.metadata, fetchDocumentsRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FetchDocumentsRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FetchDocumentsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FetchDocumentsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FetchDocumentsRequest is not found in the empty JSON string", FetchDocumentsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FetchDocumentsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FetchDocumentsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            FetchDocumentsRequestDataInner.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        FetchDocumentsRequestMetadata.validateJsonElement(jsonObj.get("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FetchDocumentsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FetchDocumentsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FetchDocumentsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FetchDocumentsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FetchDocumentsRequest>() {
           @Override
           public void write(JsonWriter out, FetchDocumentsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FetchDocumentsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FetchDocumentsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FetchDocumentsRequest
   * @throws IOException if the JSON string is invalid with respect to FetchDocumentsRequest
   */
  public static FetchDocumentsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FetchDocumentsRequest.class);
  }

  /**
   * Convert an instance of FetchDocumentsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

