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
 * PrimaryWithholdingAgentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class PrimaryWithholdingAgentRequest {
  public static final String SERIALIZED_NAME_PRIMARY_WITHHOLDING_AGENT_NAME = "primaryWithholdingAgentName";
  @SerializedName(SERIALIZED_NAME_PRIMARY_WITHHOLDING_AGENT_NAME)
  private String primaryWithholdingAgentName;

  public static final String SERIALIZED_NAME_PRIMARY_WITHHOLDING_AGENT_EIN = "primaryWithholdingAgentEin";
  @SerializedName(SERIALIZED_NAME_PRIMARY_WITHHOLDING_AGENT_EIN)
  private String primaryWithholdingAgentEin;

  public PrimaryWithholdingAgentRequest() {
  }

  public PrimaryWithholdingAgentRequest primaryWithholdingAgentName(String primaryWithholdingAgentName) {
    this.primaryWithholdingAgentName = primaryWithholdingAgentName;
    return this;
  }

  /**
   * Get primaryWithholdingAgentName
   * @return primaryWithholdingAgentName
   */
  @javax.annotation.Nullable
  public String getPrimaryWithholdingAgentName() {
    return primaryWithholdingAgentName;
  }

  public void setPrimaryWithholdingAgentName(String primaryWithholdingAgentName) {
    this.primaryWithholdingAgentName = primaryWithholdingAgentName;
  }


  public PrimaryWithholdingAgentRequest primaryWithholdingAgentEin(String primaryWithholdingAgentEin) {
    this.primaryWithholdingAgentEin = primaryWithholdingAgentEin;
    return this;
  }

  /**
   * Get primaryWithholdingAgentEin
   * @return primaryWithholdingAgentEin
   */
  @javax.annotation.Nullable
  public String getPrimaryWithholdingAgentEin() {
    return primaryWithholdingAgentEin;
  }

  public void setPrimaryWithholdingAgentEin(String primaryWithholdingAgentEin) {
    this.primaryWithholdingAgentEin = primaryWithholdingAgentEin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrimaryWithholdingAgentRequest primaryWithholdingAgentRequest = (PrimaryWithholdingAgentRequest) o;
    return Objects.equals(this.primaryWithholdingAgentName, primaryWithholdingAgentRequest.primaryWithholdingAgentName) &&
        Objects.equals(this.primaryWithholdingAgentEin, primaryWithholdingAgentRequest.primaryWithholdingAgentEin);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryWithholdingAgentName, primaryWithholdingAgentEin);
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
    sb.append("class PrimaryWithholdingAgentRequest {\n");
    sb.append("    primaryWithholdingAgentName: ").append(toIndentedString(primaryWithholdingAgentName)).append("\n");
    sb.append("    primaryWithholdingAgentEin: ").append(toIndentedString(primaryWithholdingAgentEin)).append("\n");
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
    openapiFields.add("primaryWithholdingAgentName");
    openapiFields.add("primaryWithholdingAgentEin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PrimaryWithholdingAgentRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PrimaryWithholdingAgentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrimaryWithholdingAgentRequest is not found in the empty JSON string", PrimaryWithholdingAgentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PrimaryWithholdingAgentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrimaryWithholdingAgentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("primaryWithholdingAgentName") != null && !jsonObj.get("primaryWithholdingAgentName").isJsonNull()) && !jsonObj.get("primaryWithholdingAgentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryWithholdingAgentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryWithholdingAgentName").toString()));
      }
      if ((jsonObj.get("primaryWithholdingAgentEin") != null && !jsonObj.get("primaryWithholdingAgentEin").isJsonNull()) && !jsonObj.get("primaryWithholdingAgentEin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryWithholdingAgentEin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryWithholdingAgentEin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrimaryWithholdingAgentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrimaryWithholdingAgentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrimaryWithholdingAgentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrimaryWithholdingAgentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PrimaryWithholdingAgentRequest>() {
           @Override
           public void write(JsonWriter out, PrimaryWithholdingAgentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrimaryWithholdingAgentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PrimaryWithholdingAgentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PrimaryWithholdingAgentRequest
   * @throws IOException if the JSON string is invalid with respect to PrimaryWithholdingAgentRequest
   */
  public static PrimaryWithholdingAgentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrimaryWithholdingAgentRequest.class);
  }

  /**
   * Convert an instance of PrimaryWithholdingAgentRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

