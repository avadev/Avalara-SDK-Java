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
import Avalara.SDK.model.EInvoicing.V1.EventMessage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * WebhookInvocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class WebhookInvocation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_RETRY_COUNT = "retryCount";
  @SerializedName(SERIALIZED_NAME_RETRY_COUNT)
  private Integer retryCount;

  public static final String SERIALIZED_NAME_RETRY_MAX = "retryMax";
  @SerializedName(SERIALIZED_NAME_RETRY_MAX)
  private Integer retryMax;

  public static final String SERIALIZED_NAME_INVOCATION_TIMESTAMP = "invocationTimestamp";
  @SerializedName(SERIALIZED_NAME_INVOCATION_TIMESTAMP)
  private OffsetDateTime invocationTimestamp;

  public static final String SERIALIZED_NAME_RETRY_TIMESTAMP = "retryTimestamp";
  @SerializedName(SERIALIZED_NAME_RETRY_TIMESTAMP)
  private OffsetDateTime retryTimestamp;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<EventMessage> items = new ArrayList<>();

  public WebhookInvocation() {
  }

  public WebhookInvocation id(UUID id) {
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


  public WebhookInvocation retryCount(Integer retryCount) {
    this.retryCount = retryCount;
    return this;
  }

  /**
   * The number of invocation attempts.
   * @return retryCount
   */
  @javax.annotation.Nullable
  public Integer getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }


  public WebhookInvocation retryMax(Integer retryMax) {
    this.retryMax = retryMax;
    return this;
  }

  /**
   * The maximum retries that may be attempted in total.
   * @return retryMax
   */
  @javax.annotation.Nullable
  public Integer getRetryMax() {
    return retryMax;
  }

  public void setRetryMax(Integer retryMax) {
    this.retryMax = retryMax;
  }


  public WebhookInvocation invocationTimestamp(OffsetDateTime invocationTimestamp) {
    this.invocationTimestamp = invocationTimestamp;
    return this;
  }

  /**
   * Initial timestamp of the first invocation attempt.
   * @return invocationTimestamp
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getInvocationTimestamp() {
    return invocationTimestamp;
  }

  public void setInvocationTimestamp(OffsetDateTime invocationTimestamp) {
    this.invocationTimestamp = invocationTimestamp;
  }


  public WebhookInvocation retryTimestamp(OffsetDateTime retryTimestamp) {
    this.retryTimestamp = retryTimestamp;
    return this;
  }

  /**
   * Timestamp of this invocation attempt.
   * @return retryTimestamp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRetryTimestamp() {
    return retryTimestamp;
  }

  public void setRetryTimestamp(OffsetDateTime retryTimestamp) {
    this.retryTimestamp = retryTimestamp;
  }


  public WebhookInvocation items(List<EventMessage> items) {
    this.items = items;
    return this;
  }

  public WebhookInvocation addItemsItem(EventMessage itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array of events being delivered in the webhook
   * @return items
   */
  @javax.annotation.Nonnull
  public List<EventMessage> getItems() {
    return items;
  }

  public void setItems(List<EventMessage> items) {
    this.items = items;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookInvocation webhookInvocation = (WebhookInvocation) o;
    return Objects.equals(this.id, webhookInvocation.id) &&
        Objects.equals(this.retryCount, webhookInvocation.retryCount) &&
        Objects.equals(this.retryMax, webhookInvocation.retryMax) &&
        Objects.equals(this.invocationTimestamp, webhookInvocation.invocationTimestamp) &&
        Objects.equals(this.retryTimestamp, webhookInvocation.retryTimestamp) &&
        Objects.equals(this.items, webhookInvocation.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, retryCount, retryMax, invocationTimestamp, retryTimestamp, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookInvocation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    retryMax: ").append(toIndentedString(retryMax)).append("\n");
    sb.append("    invocationTimestamp: ").append(toIndentedString(invocationTimestamp)).append("\n");
    sb.append("    retryTimestamp: ").append(toIndentedString(retryTimestamp)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("retryCount");
    openapiFields.add("retryMax");
    openapiFields.add("invocationTimestamp");
    openapiFields.add("retryTimestamp");
    openapiFields.add("items");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("invocationTimestamp");
    openapiRequiredFields.add("items");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to WebhookInvocation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookInvocation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookInvocation is not found in the empty JSON string", WebhookInvocation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WebhookInvocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookInvocation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookInvocation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        EventMessage.validateJsonElement(jsonArrayitems.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookInvocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookInvocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookInvocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookInvocation.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookInvocation>() {
           @Override
           public void write(JsonWriter out, WebhookInvocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookInvocation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of WebhookInvocation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WebhookInvocation
   * @throws IOException if the JSON string is invalid with respect to WebhookInvocation
   */
  public static WebhookInvocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookInvocation.class);
  }

  /**
   * Convert an instance of WebhookInvocation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

