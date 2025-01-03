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
 * Displays when a status event occurred
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class StatusEvent {
  public static final String SERIALIZED_NAME_EVENT_DATE_TIME = "eventDateTime";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE_TIME)
  private String eventDateTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RESPONSE_KEY = "responseKey";
  @SerializedName(SERIALIZED_NAME_RESPONSE_KEY)
  private String responseKey;

  public static final String SERIALIZED_NAME_RESPONSE_VALUE = "responseValue";
  @SerializedName(SERIALIZED_NAME_RESPONSE_VALUE)
  private String responseValue;

  public StatusEvent() {
  }

  public StatusEvent eventDateTime(String eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }

  /**
   * The date and time when the status event occured, displayed in the format YYYY-MM-DDThh:mm:ss
   * @return eventDateTime
   */
  @javax.annotation.Nullable
  public String getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(String eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  public StatusEvent message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A message describing the status event
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public StatusEvent responseKey(String responseKey) {
    this.responseKey = responseKey;
    return this;
  }

  /**
   *  The type of number or acknowledgement returned by the tax authority (if applicable). For example, it could be an identification key, acknowledgement code, or any other relevant identifier.
   * @return responseKey
   */
  @javax.annotation.Nullable
  public String getResponseKey() {
    return responseKey;
  }

  public void setResponseKey(String responseKey) {
    this.responseKey = responseKey;
  }


  public StatusEvent responseValue(String responseValue) {
    this.responseValue = responseValue;
    return this;
  }

  /**
   * The corresponding value associated with the response key. This value is provided by the tax authority in response to the event.
   * @return responseValue
   */
  @javax.annotation.Nullable
  public String getResponseValue() {
    return responseValue;
  }

  public void setResponseValue(String responseValue) {
    this.responseValue = responseValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusEvent statusEvent = (StatusEvent) o;
    return Objects.equals(this.eventDateTime, statusEvent.eventDateTime) &&
        Objects.equals(this.message, statusEvent.message) &&
        Objects.equals(this.responseKey, statusEvent.responseKey) &&
        Objects.equals(this.responseValue, statusEvent.responseValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDateTime, message, responseKey, responseValue);
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
    sb.append("class StatusEvent {\n");
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    responseKey: ").append(toIndentedString(responseKey)).append("\n");
    sb.append("    responseValue: ").append(toIndentedString(responseValue)).append("\n");
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
    openapiFields.add("eventDateTime");
    openapiFields.add("message");
    openapiFields.add("responseKey");
    openapiFields.add("responseValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StatusEvent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StatusEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatusEvent is not found in the empty JSON string", StatusEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StatusEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatusEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("eventDateTime") != null && !jsonObj.get("eventDateTime").isJsonNull()) && !jsonObj.get("eventDateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventDateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventDateTime").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("responseKey") != null && !jsonObj.get("responseKey").isJsonNull()) && !jsonObj.get("responseKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseKey").toString()));
      }
      if ((jsonObj.get("responseValue") != null && !jsonObj.get("responseValue").isJsonNull()) && !jsonObj.get("responseValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatusEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatusEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatusEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatusEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<StatusEvent>() {
           @Override
           public void write(JsonWriter out, StatusEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatusEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StatusEvent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StatusEvent
   * @throws IOException if the JSON string is invalid with respect to StatusEvent
   */
  public static StatusEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatusEvent.class);
  }

  /**
   * Convert an instance of StatusEvent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

