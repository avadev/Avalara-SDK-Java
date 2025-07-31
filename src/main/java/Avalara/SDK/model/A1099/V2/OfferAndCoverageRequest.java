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
 * OfferAndCoverageRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class OfferAndCoverageRequest {
  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private String month;

  public static final String SERIALIZED_NAME_OFFER_CODE = "offerCode";
  @SerializedName(SERIALIZED_NAME_OFFER_CODE)
  private String offerCode;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private Double share;

  public static final String SERIALIZED_NAME_SAFE_HARBOR_CODE = "safeHarborCode";
  @SerializedName(SERIALIZED_NAME_SAFE_HARBOR_CODE)
  private String safeHarborCode;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public OfferAndCoverageRequest() {
  }

  public OfferAndCoverageRequest month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Month of coverage
   * @return month
   */
  @javax.annotation.Nullable
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }


  public OfferAndCoverageRequest offerCode(String offerCode) {
    this.offerCode = offerCode;
    return this;
  }

  /**
   * Offer of coverage code
   * @return offerCode
   */
  @javax.annotation.Nullable
  public String getOfferCode() {
    return offerCode;
  }

  public void setOfferCode(String offerCode) {
    this.offerCode = offerCode;
  }


  public OfferAndCoverageRequest share(Double share) {
    this.share = share;
    return this;
  }

  /**
   * Employee required contribution share
   * @return share
   */
  @javax.annotation.Nullable
  public Double getShare() {
    return share;
  }

  public void setShare(Double share) {
    this.share = share;
  }


  public OfferAndCoverageRequest safeHarborCode(String safeHarborCode) {
    this.safeHarborCode = safeHarborCode;
    return this;
  }

  /**
   * Safe harbor code
   * @return safeHarborCode
   */
  @javax.annotation.Nullable
  public String getSafeHarborCode() {
    return safeHarborCode;
  }

  public void setSafeHarborCode(String safeHarborCode) {
    this.safeHarborCode = safeHarborCode;
  }


  public OfferAndCoverageRequest zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * ZIP code for coverage area
   * @return zipCode
   */
  @javax.annotation.Nullable
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferAndCoverageRequest offerAndCoverageRequest = (OfferAndCoverageRequest) o;
    return Objects.equals(this.month, offerAndCoverageRequest.month) &&
        Objects.equals(this.offerCode, offerAndCoverageRequest.offerCode) &&
        Objects.equals(this.share, offerAndCoverageRequest.share) &&
        Objects.equals(this.safeHarborCode, offerAndCoverageRequest.safeHarborCode) &&
        Objects.equals(this.zipCode, offerAndCoverageRequest.zipCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, offerCode, share, safeHarborCode, zipCode);
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
    sb.append("class OfferAndCoverageRequest {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    offerCode: ").append(toIndentedString(offerCode)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    safeHarborCode: ").append(toIndentedString(safeHarborCode)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
    openapiFields.add("month");
    openapiFields.add("offerCode");
    openapiFields.add("share");
    openapiFields.add("safeHarborCode");
    openapiFields.add("zipCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OfferAndCoverageRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OfferAndCoverageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfferAndCoverageRequest is not found in the empty JSON string", OfferAndCoverageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OfferAndCoverageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfferAndCoverageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("month") != null && !jsonObj.get("month").isJsonNull()) && !jsonObj.get("month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("month").toString()));
      }
      if ((jsonObj.get("offerCode") != null && !jsonObj.get("offerCode").isJsonNull()) && !jsonObj.get("offerCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offerCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offerCode").toString()));
      }
      if ((jsonObj.get("safeHarborCode") != null && !jsonObj.get("safeHarborCode").isJsonNull()) && !jsonObj.get("safeHarborCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `safeHarborCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("safeHarborCode").toString()));
      }
      if ((jsonObj.get("zipCode") != null && !jsonObj.get("zipCode").isJsonNull()) && !jsonObj.get("zipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferAndCoverageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferAndCoverageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferAndCoverageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferAndCoverageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferAndCoverageRequest>() {
           @Override
           public void write(JsonWriter out, OfferAndCoverageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferAndCoverageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OfferAndCoverageRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OfferAndCoverageRequest
   * @throws IOException if the JSON string is invalid with respect to OfferAndCoverageRequest
   */
  public static OfferAndCoverageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferAndCoverageRequest.class);
  }

  /**
   * Convert an instance of OfferAndCoverageRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

