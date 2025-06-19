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
import Avalara.SDK.model.EInvoicing.V1.EventSubscription;
import Avalara.SDK.model.EInvoicing.V1.SignatureSignature;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
 * SubscriptionDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class SubscriptionDetail {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NOTIFICATION_URL = "notificationUrl";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_URL)
  private String notificationUrl;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private SignatureSignature signature;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<EventSubscription> events = new ArrayList<>();

  public SubscriptionDetail() {
  }

  public SubscriptionDetail id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of this specific resource.
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public SubscriptionDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the subscription
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public SubscriptionDetail notificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
    return this;
  }

  /**
   * The URL of the webhook endpoint to which event messages will be delivered
   * @return notificationUrl
   */
  @javax.annotation.Nonnull
  public String getNotificationUrl() {
    return notificationUrl;
  }

  public void setNotificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
  }


  public SubscriptionDetail signature(SignatureSignature signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
   */
  @javax.annotation.Nonnull
  public SignatureSignature getSignature() {
    return signature;
  }

  public void setSignature(SignatureSignature signature) {
    this.signature = signature;
  }


  public SubscriptionDetail events(List<EventSubscription> events) {
    this.events = events;
    return this;
  }

  public SubscriptionDetail addEventsItem(EventSubscription eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events
   * @return events
   */
  @javax.annotation.Nonnull
  public List<EventSubscription> getEvents() {
    return events;
  }

  public void setEvents(List<EventSubscription> events) {
    this.events = events;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDetail subscriptionDetail = (SubscriptionDetail) o;
    return Objects.equals(this.id, subscriptionDetail.id) &&
        Objects.equals(this.description, subscriptionDetail.description) &&
        Objects.equals(this.notificationUrl, subscriptionDetail.notificationUrl) &&
        Objects.equals(this.signature, subscriptionDetail.signature) &&
        Objects.equals(this.events, subscriptionDetail.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, notificationUrl, signature, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("notificationUrl");
    openapiFields.add("signature");
    openapiFields.add("events");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("notificationUrl");
    openapiRequiredFields.add("signature");
    openapiRequiredFields.add("events");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubscriptionDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubscriptionDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriptionDetail is not found in the empty JSON string", SubscriptionDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubscriptionDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubscriptionDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionDetail.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("notificationUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationUrl").toString()));
      }
      // validate the required field `signature`
      SignatureSignature.validateJsonElement(jsonObj.get("signature"));
      // ensure the json data is an array
      if (!jsonObj.get("events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `events` to be an array in the JSON string but got `%s`", jsonObj.get("events").toString()));
      }

      JsonArray jsonArrayevents = jsonObj.getAsJsonArray("events");
      // validate the required field `events` (array)
      for (int i = 0; i < jsonArrayevents.size(); i++) {
        EventSubscription.validateJsonElement(jsonArrayevents.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionDetail>() {
           @Override
           public void write(JsonWriter out, SubscriptionDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubscriptionDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubscriptionDetail
   * @throws IOException if the JSON string is invalid with respect to SubscriptionDetail
   */
  public static SubscriptionDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionDetail.class);
  }

  /**
   * Convert an instance of SubscriptionDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

