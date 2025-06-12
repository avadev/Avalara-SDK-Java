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
 * ## 🔐 Authentication  Use **username/password** or generate a **license key** from: *Avalara Portal → Settings → License and API Keys*.  [More on authentication methods](https://developer.avalara.com/avatax-dm-combined-erp/common-setup/authentication/authentication-methods/)  [Test your credentials](https://developer.avalara.com/avatax/test-credentials/)  ## 📘 API & SDK Documentation  [Avalara SDK (.NET) on GitHub](https://github.com/avadev/Avalara-SDK-DotNet#avalarasdk--the-unified-c-library-for-next-gen-avalara-services)  [Code Examples – 1099 API](https://github.com/avadev/Avalara-SDK-DotNet/blob/main/docs/A1099/V2/Class1099IssuersApi.md#call1099issuersget)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import Avalara.SDK.model.A1099.V2.CompanyResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Generic paginated model to wrap query response data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class PaginatedQueryResultModelCompanyResponse {
  public static final String SERIALIZED_NAME_AT_RECORDSET_COUNT = "@recordsetCount";
  @SerializedName(SERIALIZED_NAME_AT_RECORDSET_COUNT)
  private Integer atRecordsetCount;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<CompanyResponse> value;

  public static final String SERIALIZED_NAME_AT_NEXT_LINK = "@nextLink";
  @SerializedName(SERIALIZED_NAME_AT_NEXT_LINK)
  private String atNextLink;

  public PaginatedQueryResultModelCompanyResponse() {
  }

  public PaginatedQueryResultModelCompanyResponse atRecordsetCount(Integer atRecordsetCount) {
    this.atRecordsetCount = atRecordsetCount;
    return this;
  }

  /**
   * Get atRecordsetCount
   * @return atRecordsetCount
   */
  @javax.annotation.Nullable
  public Integer getAtRecordsetCount() {
    return atRecordsetCount;
  }

  public void setAtRecordsetCount(Integer atRecordsetCount) {
    this.atRecordsetCount = atRecordsetCount;
  }


  public PaginatedQueryResultModelCompanyResponse value(List<CompanyResponse> value) {
    this.value = value;
    return this;
  }

  public PaginatedQueryResultModelCompanyResponse addValueItem(CompanyResponse valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public List<CompanyResponse> getValue() {
    return value;
  }

  public void setValue(List<CompanyResponse> value) {
    this.value = value;
  }


  public PaginatedQueryResultModelCompanyResponse atNextLink(String atNextLink) {
    this.atNextLink = atNextLink;
    return this;
  }

  /**
   * Get atNextLink
   * @return atNextLink
   */
  @javax.annotation.Nullable
  public String getAtNextLink() {
    return atNextLink;
  }

  public void setAtNextLink(String atNextLink) {
    this.atNextLink = atNextLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedQueryResultModelCompanyResponse paginatedQueryResultModelCompanyResponse = (PaginatedQueryResultModelCompanyResponse) o;
    return Objects.equals(this.atRecordsetCount, paginatedQueryResultModelCompanyResponse.atRecordsetCount) &&
        Objects.equals(this.value, paginatedQueryResultModelCompanyResponse.value) &&
        Objects.equals(this.atNextLink, paginatedQueryResultModelCompanyResponse.atNextLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(atRecordsetCount, value, atNextLink);
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
    sb.append("class PaginatedQueryResultModelCompanyResponse {\n");
    sb.append("    atRecordsetCount: ").append(toIndentedString(atRecordsetCount)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    atNextLink: ").append(toIndentedString(atNextLink)).append("\n");
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
    openapiFields.add("@recordsetCount");
    openapiFields.add("value");
    openapiFields.add("@nextLink");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PaginatedQueryResultModelCompanyResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaginatedQueryResultModelCompanyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaginatedQueryResultModelCompanyResponse is not found in the empty JSON string", PaginatedQueryResultModelCompanyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaginatedQueryResultModelCompanyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaginatedQueryResultModelCompanyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        JsonArray jsonArrayvalue = jsonObj.getAsJsonArray("value");
        if (jsonArrayvalue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("value").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `value` to be an array in the JSON string but got `%s`", jsonObj.get("value").toString()));
          }

          // validate the optional field `value` (array)
          for (int i = 0; i < jsonArrayvalue.size(); i++) {
            CompanyResponse.validateJsonElement(jsonArrayvalue.get(i));
          };
        }
      }
      if ((jsonObj.get("@nextLink") != null && !jsonObj.get("@nextLink").isJsonNull()) && !jsonObj.get("@nextLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `@nextLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("@nextLink").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaginatedQueryResultModelCompanyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaginatedQueryResultModelCompanyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaginatedQueryResultModelCompanyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaginatedQueryResultModelCompanyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaginatedQueryResultModelCompanyResponse>() {
           @Override
           public void write(JsonWriter out, PaginatedQueryResultModelCompanyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaginatedQueryResultModelCompanyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PaginatedQueryResultModelCompanyResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaginatedQueryResultModelCompanyResponse
   * @throws IOException if the JSON string is invalid with respect to PaginatedQueryResultModelCompanyResponse
   */
  public static PaginatedQueryResultModelCompanyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaginatedQueryResultModelCompanyResponse.class);
  }

  /**
   * Convert an instance of PaginatedQueryResultModelCompanyResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

