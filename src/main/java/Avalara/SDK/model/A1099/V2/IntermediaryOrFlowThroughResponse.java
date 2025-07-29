/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2025 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara 1099 & W-9 API Definition
 *
 * ## 🔐 Authentication  Generate a **license key** from: *[Avalara Portal](https://www.avalara.com/us/en/signin.html) → Settings → License and API Keys*.  [More on authentication methods](https://developer.avalara.com/avatax-dm-combined-erp/common-setup/authentication/authentication-methods/)  [Test your credentials](https://developer.avalara.com/avatax/test-credentials/)  ## 📘 API & SDK Documentation  [Avalara SDK (.NET) on GitHub](https://github.com/avadev/Avalara-SDK-DotNet#avalarasdk--the-unified-c-library-for-next-gen-avalara-services)  [Code Examples – 1099 API](https://github.com/avadev/Avalara-SDK-DotNet/blob/main/docs/A1099/V2/Class1099IssuersApi.md#call1099issuersget)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

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
 * IntermediaryOrFlowThroughResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class IntermediaryOrFlowThroughResponse {
  public static final String SERIALIZED_NAME_EIN = "ein";
  @SerializedName(SERIALIZED_NAME_EIN)
  private String ein;

  public static final String SERIALIZED_NAME_CHAP3_STATUS_CODE = "chap3StatusCode";
  @SerializedName(SERIALIZED_NAME_CHAP3_STATUS_CODE)
  private String chap3StatusCode;

  public static final String SERIALIZED_NAME_CHAP4_STATUS_CODE = "chap4StatusCode";
  @SerializedName(SERIALIZED_NAME_CHAP4_STATUS_CODE)
  private String chap4StatusCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GIIN = "giin";
  @SerializedName(SERIALIZED_NAME_GIIN)
  private String giin;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_FOREIGN_TIN = "foreignTin";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TIN)
  private String foreignTin;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public IntermediaryOrFlowThroughResponse() {
  }

  public IntermediaryOrFlowThroughResponse ein(String ein) {
    this.ein = ein;
    return this;
  }

  /**
   * Get ein
   * @return ein
   */
  @javax.annotation.Nullable
  public String getEin() {
    return ein;
  }

  public void setEin(String ein) {
    this.ein = ein;
  }


  public IntermediaryOrFlowThroughResponse chap3StatusCode(String chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
    return this;
  }

  /**
   * Get chap3StatusCode
   * @return chap3StatusCode
   */
  @javax.annotation.Nullable
  public String getChap3StatusCode() {
    return chap3StatusCode;
  }

  public void setChap3StatusCode(String chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
  }


  public IntermediaryOrFlowThroughResponse chap4StatusCode(String chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
    return this;
  }

  /**
   * Get chap4StatusCode
   * @return chap4StatusCode
   */
  @javax.annotation.Nullable
  public String getChap4StatusCode() {
    return chap4StatusCode;
  }

  public void setChap4StatusCode(String chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
  }


  public IntermediaryOrFlowThroughResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public IntermediaryOrFlowThroughResponse giin(String giin) {
    this.giin = giin;
    return this;
  }

  /**
   * Get giin
   * @return giin
   */
  @javax.annotation.Nullable
  public String getGiin() {
    return giin;
  }

  public void setGiin(String giin) {
    this.giin = giin;
  }


  public IntermediaryOrFlowThroughResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public IntermediaryOrFlowThroughResponse foreignTin(String foreignTin) {
    this.foreignTin = foreignTin;
    return this;
  }

  /**
   * Get foreignTin
   * @return foreignTin
   */
  @javax.annotation.Nullable
  public String getForeignTin() {
    return foreignTin;
  }

  public void setForeignTin(String foreignTin) {
    this.foreignTin = foreignTin;
  }


  public IntermediaryOrFlowThroughResponse address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public IntermediaryOrFlowThroughResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public IntermediaryOrFlowThroughResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public IntermediaryOrFlowThroughResponse zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Get zip
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntermediaryOrFlowThroughResponse intermediaryOrFlowThroughResponse = (IntermediaryOrFlowThroughResponse) o;
    return Objects.equals(this.ein, intermediaryOrFlowThroughResponse.ein) &&
        Objects.equals(this.chap3StatusCode, intermediaryOrFlowThroughResponse.chap3StatusCode) &&
        Objects.equals(this.chap4StatusCode, intermediaryOrFlowThroughResponse.chap4StatusCode) &&
        Objects.equals(this.name, intermediaryOrFlowThroughResponse.name) &&
        Objects.equals(this.giin, intermediaryOrFlowThroughResponse.giin) &&
        Objects.equals(this.countryCode, intermediaryOrFlowThroughResponse.countryCode) &&
        Objects.equals(this.foreignTin, intermediaryOrFlowThroughResponse.foreignTin) &&
        Objects.equals(this.address, intermediaryOrFlowThroughResponse.address) &&
        Objects.equals(this.city, intermediaryOrFlowThroughResponse.city) &&
        Objects.equals(this.state, intermediaryOrFlowThroughResponse.state) &&
        Objects.equals(this.zip, intermediaryOrFlowThroughResponse.zip);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ein, chap3StatusCode, chap4StatusCode, name, giin, countryCode, foreignTin, address, city, state, zip);
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
    sb.append("class IntermediaryOrFlowThroughResponse {\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    chap3StatusCode: ").append(toIndentedString(chap3StatusCode)).append("\n");
    sb.append("    chap4StatusCode: ").append(toIndentedString(chap4StatusCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    giin: ").append(toIndentedString(giin)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    foreignTin: ").append(toIndentedString(foreignTin)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
    openapiFields.add("ein");
    openapiFields.add("chap3StatusCode");
    openapiFields.add("chap4StatusCode");
    openapiFields.add("name");
    openapiFields.add("giin");
    openapiFields.add("countryCode");
    openapiFields.add("foreignTin");
    openapiFields.add("address");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IntermediaryOrFlowThroughResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntermediaryOrFlowThroughResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntermediaryOrFlowThroughResponse is not found in the empty JSON string", IntermediaryOrFlowThroughResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntermediaryOrFlowThroughResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntermediaryOrFlowThroughResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ein") != null && !jsonObj.get("ein").isJsonNull()) && !jsonObj.get("ein").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ein` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ein").toString()));
      }
      if ((jsonObj.get("chap3StatusCode") != null && !jsonObj.get("chap3StatusCode").isJsonNull()) && !jsonObj.get("chap3StatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chap3StatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chap3StatusCode").toString()));
      }
      if ((jsonObj.get("chap4StatusCode") != null && !jsonObj.get("chap4StatusCode").isJsonNull()) && !jsonObj.get("chap4StatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chap4StatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chap4StatusCode").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("giin") != null && !jsonObj.get("giin").isJsonNull()) && !jsonObj.get("giin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `giin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("giin").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("foreignTin") != null && !jsonObj.get("foreignTin").isJsonNull()) && !jsonObj.get("foreignTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignTin").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntermediaryOrFlowThroughResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntermediaryOrFlowThroughResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntermediaryOrFlowThroughResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntermediaryOrFlowThroughResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<IntermediaryOrFlowThroughResponse>() {
           @Override
           public void write(JsonWriter out, IntermediaryOrFlowThroughResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntermediaryOrFlowThroughResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IntermediaryOrFlowThroughResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IntermediaryOrFlowThroughResponse
   * @throws IOException if the JSON string is invalid with respect to IntermediaryOrFlowThroughResponse
   */
  public static IntermediaryOrFlowThroughResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntermediaryOrFlowThroughResponse.class);
  }

  /**
   * Convert an instance of IntermediaryOrFlowThroughResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

