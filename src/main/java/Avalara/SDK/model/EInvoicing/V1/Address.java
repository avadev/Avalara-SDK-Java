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
 * Address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Address {
  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public Address() {
  }

  public Address line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Address line 1
   * @return line1
   */
  @javax.annotation.Nullable
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public Address line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Address line 2
   * @return line2
   */
  @javax.annotation.Nullable
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country (ISO 3166)
   * @return country
   */
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal code
   * @return postalCode
   */
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.line2, address.line2) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.postalCode, address.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, city, state, country, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
    openapiFields.add("line1");
    openapiFields.add("line2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("country");
    openapiFields.add("postalCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("country");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Address
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Address.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Address is not found in the empty JSON string", Address.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Address.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Address` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Address.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("line1") != null && !jsonObj.get("line1").isJsonNull()) && !jsonObj.get("line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line1").toString()));
      }
      if ((jsonObj.get("line2") != null && !jsonObj.get("line2").isJsonNull()) && !jsonObj.get("line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line2").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Address.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Address' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Address> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Address.class));

       return (TypeAdapter<T>) new TypeAdapter<Address>() {
           @Override
           public void write(JsonWriter out, Address value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Address read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Address given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Address
   * @throws IOException if the JSON string is invalid with respect to Address
   */
  public static Address fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Address.class);
  }

  /**
   * Convert an instance of Address to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

