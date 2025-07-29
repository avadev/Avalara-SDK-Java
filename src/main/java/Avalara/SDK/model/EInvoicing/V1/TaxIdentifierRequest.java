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
 * Represents a request to validate company’s tax identifier.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class TaxIdentifierRequest {
  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_IDENTIFIER_TYPE = "identifierType";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER_TYPE)
  private String identifierType;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private Object extensions;

  public TaxIdentifierRequest() {
  }

  public TaxIdentifierRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The two-letter ISO-3166 country code of the tax identifier.
   * @return countryCode
   */
  @javax.annotation.Nonnull
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public TaxIdentifierRequest identifierType(String identifierType) {
    this.identifierType = identifierType;
    return this;
  }

  /**
   * Type of the identifier.
   * @return identifierType
   */
  @javax.annotation.Nonnull
  public String getIdentifierType() {
    return identifierType;
  }

  public void setIdentifierType(String identifierType) {
    this.identifierType = identifierType;
  }


  public TaxIdentifierRequest identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * The tax identifier of the company.
   * @return identifier
   */
  @javax.annotation.Nonnull
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public TaxIdentifierRequest extensions(Object extensions) {
    this.extensions = extensions;
    return this;
  }

  /**
   * Optional field for adding additional details required by specific tax authorities. Refer to the GET /tax-identifiers/schema API endpoint for the full request structure for a given country.
   * @return extensions
   */
  @javax.annotation.Nullable
  public Object getExtensions() {
    return extensions;
  }

  public void setExtensions(Object extensions) {
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
    TaxIdentifierRequest taxIdentifierRequest = (TaxIdentifierRequest) o;
    return Objects.equals(this.countryCode, taxIdentifierRequest.countryCode) &&
        Objects.equals(this.identifierType, taxIdentifierRequest.identifierType) &&
        Objects.equals(this.identifier, taxIdentifierRequest.identifier) &&
        Objects.equals(this.extensions, taxIdentifierRequest.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, identifierType, identifier, extensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxIdentifierRequest {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
    openapiFields.add("countryCode");
    openapiFields.add("identifierType");
    openapiFields.add("identifier");
    openapiFields.add("extensions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("countryCode");
    openapiRequiredFields.add("identifierType");
    openapiRequiredFields.add("identifier");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TaxIdentifierRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaxIdentifierRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxIdentifierRequest is not found in the empty JSON string", TaxIdentifierRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TaxIdentifierRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxIdentifierRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxIdentifierRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if (!jsonObj.get("identifierType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifierType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifierType").toString()));
      }
      if (!jsonObj.get("identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxIdentifierRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxIdentifierRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxIdentifierRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxIdentifierRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxIdentifierRequest>() {
           @Override
           public void write(JsonWriter out, TaxIdentifierRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxIdentifierRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TaxIdentifierRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaxIdentifierRequest
   * @throws IOException if the JSON string is invalid with respect to TaxIdentifierRequest
   */
  public static TaxIdentifierRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxIdentifierRequest.class);
  }

  /**
   * Convert an instance of TaxIdentifierRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

