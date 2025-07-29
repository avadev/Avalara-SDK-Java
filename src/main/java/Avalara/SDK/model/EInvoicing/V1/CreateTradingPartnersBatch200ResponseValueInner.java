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
 * CreateTradingPartnersBatch200ResponseValueInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CreateTradingPartnersBatch200ResponseValueInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public CreateTradingPartnersBatch200ResponseValueInner() {
  }

  public CreateTradingPartnersBatch200ResponseValueInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the created trading partner.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CreateTradingPartnersBatch200ResponseValueInner index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Index number of the trading partner.
   * @return index
   */
  @javax.annotation.Nullable
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  public CreateTradingPartnersBatch200ResponseValueInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A success message for the specific created record.
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTradingPartnersBatch200ResponseValueInner createTradingPartnersBatch200ResponseValueInner = (CreateTradingPartnersBatch200ResponseValueInner) o;
    return Objects.equals(this.id, createTradingPartnersBatch200ResponseValueInner.id) &&
        Objects.equals(this.index, createTradingPartnersBatch200ResponseValueInner.index) &&
        Objects.equals(this.message, createTradingPartnersBatch200ResponseValueInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, index, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTradingPartnersBatch200ResponseValueInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("index");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTradingPartnersBatch200ResponseValueInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTradingPartnersBatch200ResponseValueInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTradingPartnersBatch200ResponseValueInner is not found in the empty JSON string", CreateTradingPartnersBatch200ResponseValueInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTradingPartnersBatch200ResponseValueInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTradingPartnersBatch200ResponseValueInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTradingPartnersBatch200ResponseValueInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTradingPartnersBatch200ResponseValueInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTradingPartnersBatch200ResponseValueInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTradingPartnersBatch200ResponseValueInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTradingPartnersBatch200ResponseValueInner>() {
           @Override
           public void write(JsonWriter out, CreateTradingPartnersBatch200ResponseValueInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTradingPartnersBatch200ResponseValueInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTradingPartnersBatch200ResponseValueInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTradingPartnersBatch200ResponseValueInner
   * @throws IOException if the JSON string is invalid with respect to CreateTradingPartnersBatch200ResponseValueInner
   */
  public static CreateTradingPartnersBatch200ResponseValueInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTradingPartnersBatch200ResponseValueInner.class);
  }

  /**
   * Convert an instance of CreateTradingPartnersBatch200ResponseValueInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

