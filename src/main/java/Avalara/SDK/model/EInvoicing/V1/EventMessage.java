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
import Avalara.SDK.model.EInvoicing.V1.SignatureValueSignature;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * EventMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class EventMessage {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private Object message;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private SignatureValueSignature signature;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_CORRELATION_ID = "correlationId";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID)
  private String correlationId;

  public static final String SERIALIZED_NAME_SYSTEM_CODE = "systemCode";
  @SerializedName(SERIALIZED_NAME_SYSTEM_CODE)
  private String systemCode;

  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_EVENT_VERSION = "eventVersion";
  @SerializedName(SERIALIZED_NAME_EVENT_VERSION)
  private String eventVersion;

  public static final String SERIALIZED_NAME_RECEIPT_TIMESTAMP = "receiptTimestamp";
  @SerializedName(SERIALIZED_NAME_RECEIPT_TIMESTAMP)
  private OffsetDateTime receiptTimestamp;

  public EventMessage() {
  }

  public EventMessage message(Object message) {
    this.message = message;
    return this;
  }

  /**
   * Event-specific information
   * @return message
   */
  @javax.annotation.Nonnull
  public Object getMessage() {
    return message;
  }

  public void setMessage(Object message) {
    this.message = message;
  }


  public EventMessage signature(SignatureValueSignature signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
   */
  @javax.annotation.Nonnull
  public SignatureValueSignature getSignature() {
    return signature;
  }

  public void setSignature(SignatureValueSignature signature) {
    this.signature = signature;
  }


  public EventMessage tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant ID of the event
   * @return tenantId
   */
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public EventMessage correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation ID used by Avalara to aid in tracing through to provenance of this event massage.
   * @return correlationId
   */
  @javax.annotation.Nullable
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  public EventMessage systemCode(String systemCode) {
    this.systemCode = systemCode;
    return this;
  }

  /**
   * The Avalara registered code for the system. See &lt;a href&#x3D;\&quot;https://avalara.atlassian.net/wiki/spaces/AIM/pages/637250338966/Taxonomy+Avalara+Systems\&quot;&gt;Taxonomy&amp;#58; Avalara Systems&lt;/a&gt;
   * @return systemCode
   */
  @javax.annotation.Nonnull
  public String getSystemCode() {
    return systemCode;
  }

  public void setSystemCode(String systemCode) {
    this.systemCode = systemCode;
  }


  public EventMessage eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Type of the event
   * @return eventName
   */
  @javax.annotation.Nonnull
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public EventMessage eventVersion(String eventVersion) {
    this.eventVersion = eventVersion;
    return this;
  }

  /**
   * Version of the included payload.
   * @return eventVersion
   */
  @javax.annotation.Nullable
  public String getEventVersion() {
    return eventVersion;
  }

  public void setEventVersion(String eventVersion) {
    this.eventVersion = eventVersion;
  }


  public EventMessage receiptTimestamp(OffsetDateTime receiptTimestamp) {
    this.receiptTimestamp = receiptTimestamp;
    return this;
  }

  /**
   * Timestamp when the event was received by the dispatch service.
   * @return receiptTimestamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReceiptTimestamp() {
    return receiptTimestamp;
  }

  public void setReceiptTimestamp(OffsetDateTime receiptTimestamp) {
    this.receiptTimestamp = receiptTimestamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventMessage eventMessage = (EventMessage) o;
    return Objects.equals(this.message, eventMessage.message) &&
        Objects.equals(this.signature, eventMessage.signature) &&
        Objects.equals(this.tenantId, eventMessage.tenantId) &&
        Objects.equals(this.correlationId, eventMessage.correlationId) &&
        Objects.equals(this.systemCode, eventMessage.systemCode) &&
        Objects.equals(this.eventName, eventMessage.eventName) &&
        Objects.equals(this.eventVersion, eventMessage.eventVersion) &&
        Objects.equals(this.receiptTimestamp, eventMessage.receiptTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, signature, tenantId, correlationId, systemCode, eventName, eventVersion, receiptTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventMessage {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    systemCode: ").append(toIndentedString(systemCode)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventVersion: ").append(toIndentedString(eventVersion)).append("\n");
    sb.append("    receiptTimestamp: ").append(toIndentedString(receiptTimestamp)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("signature");
    openapiFields.add("tenantId");
    openapiFields.add("correlationId");
    openapiFields.add("systemCode");
    openapiFields.add("eventName");
    openapiFields.add("eventVersion");
    openapiFields.add("receiptTimestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("signature");
    openapiRequiredFields.add("tenantId");
    openapiRequiredFields.add("systemCode");
    openapiRequiredFields.add("eventName");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EventMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventMessage is not found in the empty JSON string", EventMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `signature`
      SignatureValueSignature.validateJsonElement(jsonObj.get("signature"));
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("correlationId") != null && !jsonObj.get("correlationId").isJsonNull()) && !jsonObj.get("correlationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlationId").toString()));
      }
      if (!jsonObj.get("systemCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemCode").toString()));
      }
      if (!jsonObj.get("eventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventName").toString()));
      }
      if ((jsonObj.get("eventVersion") != null && !jsonObj.get("eventVersion").isJsonNull()) && !jsonObj.get("eventVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<EventMessage>() {
           @Override
           public void write(JsonWriter out, EventMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EventMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventMessage
   * @throws IOException if the JSON string is invalid with respect to EventMessage
   */
  public static EventMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventMessage.class);
  }

  /**
   * Convert an instance of EventMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

