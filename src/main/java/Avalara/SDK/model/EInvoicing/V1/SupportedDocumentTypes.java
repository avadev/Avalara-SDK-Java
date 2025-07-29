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
import Avalara.SDK.model.EInvoicing.V1.Extension;
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
 * SupportedDocumentTypes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class SupportedDocumentTypes {
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

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private List<Extension> extensions;

  public SupportedDocumentTypes() {
  }

  public SupportedDocumentTypes name(String name) {
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


  public SupportedDocumentTypes value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Document type value.
   * @return value
   */
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public SupportedDocumentTypes supportedByTradingPartner(Boolean supportedByTradingPartner) {
    this.supportedByTradingPartner = supportedByTradingPartner;
    return this;
  }

  /**
   * Does trading partner support receiving this document type.
   * @return supportedByTradingPartner
   */
  @javax.annotation.Nonnull
  public Boolean getSupportedByTradingPartner() {
    return supportedByTradingPartner;
  }

  public void setSupportedByTradingPartner(Boolean supportedByTradingPartner) {
    this.supportedByTradingPartner = supportedByTradingPartner;
  }


  public SupportedDocumentTypes supportedByAvalara(Boolean supportedByAvalara) {
    this.supportedByAvalara = supportedByAvalara;
    return this;
  }

  /**
   * Does avalara support exchanging this document type.
   * @return supportedByAvalara
   */
  @javax.annotation.Nullable
  public Boolean getSupportedByAvalara() {
    return supportedByAvalara;
  }

  public void setSupportedByAvalara(Boolean supportedByAvalara) {
    this.supportedByAvalara = supportedByAvalara;
  }


  public SupportedDocumentTypes extensions(List<Extension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public SupportedDocumentTypes addExtensionsItem(Extension extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

  /**
   * Optional array used to carry additional metadata or configuration values that may be required by specific document types. When creating or updating a trading partner, the keys provided in the &#39;extensions&#39; attribute must be selected from a predefined list of supported extensions. Using any unsupported keys will result in a validation error.
   * @return extensions
   */
  @javax.annotation.Nullable
  public List<Extension> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Extension> extensions) {
    this.extensions = extensions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedDocumentTypes supportedDocumentTypes = (SupportedDocumentTypes) o;
    return Objects.equals(this.name, supportedDocumentTypes.name) &&
        Objects.equals(this.value, supportedDocumentTypes.value) &&
        Objects.equals(this.supportedByTradingPartner, supportedDocumentTypes.supportedByTradingPartner) &&
        Objects.equals(this.supportedByAvalara, supportedDocumentTypes.supportedByAvalara) &&
        Objects.equals(this.extensions, supportedDocumentTypes.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, supportedByTradingPartner, supportedByAvalara, extensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedDocumentTypes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    supportedByTradingPartner: ").append(toIndentedString(supportedByTradingPartner)).append("\n");
    sb.append("    supportedByAvalara: ").append(toIndentedString(supportedByAvalara)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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
    openapiFields.add("extensions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("supportedByTradingPartner");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SupportedDocumentTypes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SupportedDocumentTypes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupportedDocumentTypes is not found in the empty JSON string", SupportedDocumentTypes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SupportedDocumentTypes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SupportedDocumentTypes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SupportedDocumentTypes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if (jsonObj.get("extensions") != null && !jsonObj.get("extensions").isJsonNull()) {
        JsonArray jsonArrayextensions = jsonObj.getAsJsonArray("extensions");
        if (jsonArrayextensions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extensions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extensions` to be an array in the JSON string but got `%s`", jsonObj.get("extensions").toString()));
          }

          // validate the optional field `extensions` (array)
          for (int i = 0; i < jsonArrayextensions.size(); i++) {
            Extension.validateJsonElement(jsonArrayextensions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupportedDocumentTypes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupportedDocumentTypes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupportedDocumentTypes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupportedDocumentTypes.class));

       return (TypeAdapter<T>) new TypeAdapter<SupportedDocumentTypes>() {
           @Override
           public void write(JsonWriter out, SupportedDocumentTypes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SupportedDocumentTypes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SupportedDocumentTypes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SupportedDocumentTypes
   * @throws IOException if the JSON string is invalid with respect to SupportedDocumentTypes
   */
  public static SupportedDocumentTypes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupportedDocumentTypes.class);
  }

  /**
   * Convert an instance of SupportedDocumentTypes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

