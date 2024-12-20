/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
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
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
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
 * DirectorySearchResponseValueInnerSupportedDocumentTypesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class DirectorySearchResponseValueInnerSupportedDocumentTypesInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_SUPPORTED_BY_TRADING_PARTNER = "supportedByTradingPartner";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_BY_TRADING_PARTNER)
  private Boolean supportedByTradingPartner;

  public static final String SERIALIZED_NAME_SUPPORTED_BY_AVALARA = "supportedByAvalara";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_BY_AVALARA)
  private Boolean supportedByAvalara;

  public DirectorySearchResponseValueInnerSupportedDocumentTypesInner() {
  }

  public DirectorySearchResponseValueInnerSupportedDocumentTypesInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Document type name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DirectorySearchResponseValueInnerSupportedDocumentTypesInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Document type identifier.
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public DirectorySearchResponseValueInnerSupportedDocumentTypesInner supportedByTradingPartner(Boolean supportedByTradingPartner) {
    this.supportedByTradingPartner = supportedByTradingPartner;
    return this;
  }

  /**
   * Does trading partner support receiving this document type
   * @return supportedByTradingPartner
   */
  @javax.annotation.Nullable
  public Boolean getSupportedByTradingPartner() {
    return supportedByTradingPartner;
  }

  public void setSupportedByTradingPartner(Boolean supportedByTradingPartner) {
    this.supportedByTradingPartner = supportedByTradingPartner;
  }


  public DirectorySearchResponseValueInnerSupportedDocumentTypesInner supportedByAvalara(Boolean supportedByAvalara) {
    this.supportedByAvalara = supportedByAvalara;
    return this;
  }

  /**
   * Does avalara support exchanging this document type
   * @return supportedByAvalara
   */
  @javax.annotation.Nullable
  public Boolean getSupportedByAvalara() {
    return supportedByAvalara;
  }

  public void setSupportedByAvalara(Boolean supportedByAvalara) {
    this.supportedByAvalara = supportedByAvalara;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectorySearchResponseValueInnerSupportedDocumentTypesInner directorySearchResponseValueInnerSupportedDocumentTypesInner = (DirectorySearchResponseValueInnerSupportedDocumentTypesInner) o;
    return Objects.equals(this.name, directorySearchResponseValueInnerSupportedDocumentTypesInner.name) &&
        Objects.equals(this.value, directorySearchResponseValueInnerSupportedDocumentTypesInner.value) &&
        Objects.equals(this.supportedByTradingPartner, directorySearchResponseValueInnerSupportedDocumentTypesInner.supportedByTradingPartner) &&
        Objects.equals(this.supportedByAvalara, directorySearchResponseValueInnerSupportedDocumentTypesInner.supportedByAvalara);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, supportedByTradingPartner, supportedByAvalara);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectorySearchResponseValueInnerSupportedDocumentTypesInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    supportedByTradingPartner: ").append(toIndentedString(supportedByTradingPartner)).append("\n");
    sb.append("    supportedByAvalara: ").append(toIndentedString(supportedByAvalara)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("value");
    openapiFields.add("supportedByTradingPartner");
    openapiFields.add("supportedByAvalara");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DirectorySearchResponseValueInnerSupportedDocumentTypesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DirectorySearchResponseValueInnerSupportedDocumentTypesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DirectorySearchResponseValueInnerSupportedDocumentTypesInner is not found in the empty JSON string", DirectorySearchResponseValueInnerSupportedDocumentTypesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DirectorySearchResponseValueInnerSupportedDocumentTypesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DirectorySearchResponseValueInnerSupportedDocumentTypesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DirectorySearchResponseValueInnerSupportedDocumentTypesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DirectorySearchResponseValueInnerSupportedDocumentTypesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DirectorySearchResponseValueInnerSupportedDocumentTypesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DirectorySearchResponseValueInnerSupportedDocumentTypesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DirectorySearchResponseValueInnerSupportedDocumentTypesInner>() {
           @Override
           public void write(JsonWriter out, DirectorySearchResponseValueInnerSupportedDocumentTypesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DirectorySearchResponseValueInnerSupportedDocumentTypesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DirectorySearchResponseValueInnerSupportedDocumentTypesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DirectorySearchResponseValueInnerSupportedDocumentTypesInner
   * @throws IOException if the JSON string is invalid with respect to DirectorySearchResponseValueInnerSupportedDocumentTypesInner
   */
  public static DirectorySearchResponseValueInnerSupportedDocumentTypesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DirectorySearchResponseValueInnerSupportedDocumentTypesInner.class);
  }

  /**
   * Convert an instance of DirectorySearchResponseValueInnerSupportedDocumentTypesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

