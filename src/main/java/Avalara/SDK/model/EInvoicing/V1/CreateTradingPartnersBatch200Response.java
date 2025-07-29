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
import Avalara.SDK.model.EInvoicing.V1.CreateTradingPartnersBatch200ResponseValueInner;
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
 * CreateTradingPartnersBatch200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CreateTradingPartnersBatch200Response {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<CreateTradingPartnersBatch200ResponseValueInner> value;

  public CreateTradingPartnersBatch200Response() {
  }

  public CreateTradingPartnersBatch200Response status(String status) {
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


  public CreateTradingPartnersBatch200Response message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A message indicating the result of the batch operation.
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public CreateTradingPartnersBatch200Response value(List<CreateTradingPartnersBatch200ResponseValueInner> value) {
    this.value = value;
    return this;
  }

  public CreateTradingPartnersBatch200Response addValueItem(CreateTradingPartnersBatch200ResponseValueInner valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * A list of trading partners successfully created.
   * @return value
   */
  @javax.annotation.Nullable
  public List<CreateTradingPartnersBatch200ResponseValueInner> getValue() {
    return value;
  }

  public void setValue(List<CreateTradingPartnersBatch200ResponseValueInner> value) {
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
    CreateTradingPartnersBatch200Response createTradingPartnersBatch200Response = (CreateTradingPartnersBatch200Response) o;
    return Objects.equals(this.status, createTradingPartnersBatch200Response.status) &&
        Objects.equals(this.message, createTradingPartnersBatch200Response.message) &&
        Objects.equals(this.value, createTradingPartnersBatch200Response.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTradingPartnersBatch200Response {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("message");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateTradingPartnersBatch200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTradingPartnersBatch200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTradingPartnersBatch200Response is not found in the empty JSON string", CreateTradingPartnersBatch200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateTradingPartnersBatch200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateTradingPartnersBatch200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
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
            CreateTradingPartnersBatch200ResponseValueInner.validateJsonElement(jsonArrayvalue.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTradingPartnersBatch200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTradingPartnersBatch200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTradingPartnersBatch200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTradingPartnersBatch200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTradingPartnersBatch200Response>() {
           @Override
           public void write(JsonWriter out, CreateTradingPartnersBatch200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTradingPartnersBatch200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateTradingPartnersBatch200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateTradingPartnersBatch200Response
   * @throws IOException if the JSON string is invalid with respect to CreateTradingPartnersBatch200Response
   */
  public static CreateTradingPartnersBatch200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTradingPartnersBatch200Response.class);
  }

  /**
   * Convert an instance of CreateTradingPartnersBatch200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

