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
 * SubmitInteropDocument202Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class SubmitInteropDocument202Response {
  public static final String SERIALIZED_NAME_INTERCHANGE_ID = "interchangeId";
  @SerializedName(SERIALIZED_NAME_INTERCHANGE_ID)
  private String interchangeId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public SubmitInteropDocument202Response() {
  }

  public SubmitInteropDocument202Response interchangeId(String interchangeId) {
    this.interchangeId = interchangeId;
    return this;
  }

  /**
   * The unique interchange ID for this submission.
   * @return interchangeId
   */
  @javax.annotation.Nullable
  public String getInterchangeId() {
    return interchangeId;
  }

  public void setInterchangeId(String interchangeId) {
    this.interchangeId = interchangeId;
  }


  public SubmitInteropDocument202Response message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A message indicating that the document has been accepted.
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
    SubmitInteropDocument202Response submitInteropDocument202Response = (SubmitInteropDocument202Response) o;
    return Objects.equals(this.interchangeId, submitInteropDocument202Response.interchangeId) &&
        Objects.equals(this.message, submitInteropDocument202Response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interchangeId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitInteropDocument202Response {\n");
    sb.append("    interchangeId: ").append(toIndentedString(interchangeId)).append("\n");
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
    openapiFields.add("interchangeId");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitInteropDocument202Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitInteropDocument202Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitInteropDocument202Response is not found in the empty JSON string", SubmitInteropDocument202Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitInteropDocument202Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitInteropDocument202Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("interchangeId") != null && !jsonObj.get("interchangeId").isJsonNull()) && !jsonObj.get("interchangeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interchangeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interchangeId").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitInteropDocument202Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitInteropDocument202Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitInteropDocument202Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitInteropDocument202Response.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitInteropDocument202Response>() {
           @Override
           public void write(JsonWriter out, SubmitInteropDocument202Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitInteropDocument202Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitInteropDocument202Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitInteropDocument202Response
   * @throws IOException if the JSON string is invalid with respect to SubmitInteropDocument202Response
   */
  public static SubmitInteropDocument202Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitInteropDocument202Response.class);
  }

  /**
   * Convert an instance of SubmitInteropDocument202Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

