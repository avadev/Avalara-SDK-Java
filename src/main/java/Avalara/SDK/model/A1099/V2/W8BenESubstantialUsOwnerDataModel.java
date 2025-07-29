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
 * W8BenESubstantialUsOwnerDataModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class W8BenESubstantialUsOwnerDataModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public W8BenESubstantialUsOwnerDataModel() {
  }

  public W8BenESubstantialUsOwnerDataModel name(String name) {
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


  public W8BenESubstantialUsOwnerDataModel address(String address) {
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


  public W8BenESubstantialUsOwnerDataModel tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * Get tin
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W8BenESubstantialUsOwnerDataModel w8BenESubstantialUsOwnerDataModel = (W8BenESubstantialUsOwnerDataModel) o;
    return Objects.equals(this.name, w8BenESubstantialUsOwnerDataModel.name) &&
        Objects.equals(this.address, w8BenESubstantialUsOwnerDataModel.address) &&
        Objects.equals(this.tin, w8BenESubstantialUsOwnerDataModel.tin);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, tin);
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
    sb.append("class W8BenESubstantialUsOwnerDataModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("tin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to W8BenESubstantialUsOwnerDataModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!W8BenESubstantialUsOwnerDataModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in W8BenESubstantialUsOwnerDataModel is not found in the empty JSON string", W8BenESubstantialUsOwnerDataModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!W8BenESubstantialUsOwnerDataModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `W8BenESubstantialUsOwnerDataModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W8BenESubstantialUsOwnerDataModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W8BenESubstantialUsOwnerDataModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W8BenESubstantialUsOwnerDataModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W8BenESubstantialUsOwnerDataModel.class));

       return (TypeAdapter<T>) new TypeAdapter<W8BenESubstantialUsOwnerDataModel>() {
           @Override
           public void write(JsonWriter out, W8BenESubstantialUsOwnerDataModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public W8BenESubstantialUsOwnerDataModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of W8BenESubstantialUsOwnerDataModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of W8BenESubstantialUsOwnerDataModel
   * @throws IOException if the JSON string is invalid with respect to W8BenESubstantialUsOwnerDataModel
   */
  public static W8BenESubstantialUsOwnerDataModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W8BenESubstantialUsOwnerDataModel.class);
  }

  /**
   * Convert an instance of W8BenESubstantialUsOwnerDataModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

