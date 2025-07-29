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
 * AuthorizedApiRequestModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class AuthorizedApiRequestModel {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Integer ttl;

  public AuthorizedApiRequestModel() {
  }

  public AuthorizedApiRequestModel path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path and query of the API request you want to pre-authorize, omitting the leading /api/
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public AuthorizedApiRequestModel ttl(Integer ttl) {
    this.ttl = ttl;
    return this;
  }

  /**
   * Seconds until this AuthorizedApiRequest should expire, 3600 if omitted; values greater than 86400 will not be honored
   * @return ttl
   */
  @javax.annotation.Nullable
  public Integer getTtl() {
    return ttl;
  }

  public void setTtl(Integer ttl) {
    this.ttl = ttl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedApiRequestModel authorizedApiRequestModel = (AuthorizedApiRequestModel) o;
    return Objects.equals(this.path, authorizedApiRequestModel.path) &&
        Objects.equals(this.ttl, authorizedApiRequestModel.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedApiRequestModel {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthorizedApiRequestModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthorizedApiRequestModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizedApiRequestModel is not found in the empty JSON string", AuthorizedApiRequestModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthorizedApiRequestModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorizedApiRequestModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizedApiRequestModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizedApiRequestModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizedApiRequestModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizedApiRequestModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizedApiRequestModel>() {
           @Override
           public void write(JsonWriter out, AuthorizedApiRequestModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizedApiRequestModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthorizedApiRequestModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthorizedApiRequestModel
   * @throws IOException if the JSON string is invalid with respect to AuthorizedApiRequestModel
   */
  public static AuthorizedApiRequestModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizedApiRequestModel.class);
  }

  /**
   * Convert an instance of AuthorizedApiRequestModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

