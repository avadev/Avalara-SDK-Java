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
 * TaxIdentifierSchemaByCountry200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class TaxIdentifierSchemaByCountry200Response {
  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private Object schema;

  public TaxIdentifierSchemaByCountry200Response() {
  }

  public TaxIdentifierSchemaByCountry200Response countryCode(String countryCode) {
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


  public TaxIdentifierSchemaByCountry200Response schema(Object schema) {
    this.schema = schema;
    return this;
  }

  /**
   * The JSON Schema definition, following Draft-07 specification, used to validate tax identifier data.
   * @return schema
   */
  @javax.annotation.Nonnull
  public Object getSchema() {
    return schema;
  }

  public void setSchema(Object schema) {
    this.schema = schema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxIdentifierSchemaByCountry200Response taxIdentifierSchemaByCountry200Response = (TaxIdentifierSchemaByCountry200Response) o;
    return Objects.equals(this.countryCode, taxIdentifierSchemaByCountry200Response.countryCode) &&
        Objects.equals(this.schema, taxIdentifierSchemaByCountry200Response.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxIdentifierSchemaByCountry200Response {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
    openapiFields.add("schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("countryCode");
    openapiRequiredFields.add("schema");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TaxIdentifierSchemaByCountry200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaxIdentifierSchemaByCountry200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxIdentifierSchemaByCountry200Response is not found in the empty JSON string", TaxIdentifierSchemaByCountry200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TaxIdentifierSchemaByCountry200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxIdentifierSchemaByCountry200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxIdentifierSchemaByCountry200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxIdentifierSchemaByCountry200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxIdentifierSchemaByCountry200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxIdentifierSchemaByCountry200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxIdentifierSchemaByCountry200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxIdentifierSchemaByCountry200Response>() {
           @Override
           public void write(JsonWriter out, TaxIdentifierSchemaByCountry200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxIdentifierSchemaByCountry200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TaxIdentifierSchemaByCountry200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaxIdentifierSchemaByCountry200Response
   * @throws IOException if the JSON string is invalid with respect to TaxIdentifierSchemaByCountry200Response
   */
  public static TaxIdentifierSchemaByCountry200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxIdentifierSchemaByCountry200Response.class);
  }

  /**
   * Convert an instance of TaxIdentifierSchemaByCountry200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

