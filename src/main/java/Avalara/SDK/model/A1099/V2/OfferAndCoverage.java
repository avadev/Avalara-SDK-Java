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
 * Offer and coverage information for health coverage forms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class OfferAndCoverage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  /**
   * Month of coverage.  Available values:  - All: All months  - January: January  - February: February  - March: March  - April: April  - May: May  - June: June  - July: July  - August: August  - September: September  - October: October  - November: November  - December: December
   */
  @JsonAdapter(MonthEnum.Adapter.class)
  public enum MonthEnum {
    ALL("All"),
    
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _09("09"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12");

    private String value;

    MonthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonthEnum fromValue(String value) {
      for (MonthEnum b : MonthEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MonthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonthEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MonthEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MonthEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private MonthEnum month;

  /**
   * Offer of Coverage Code. Required if Share has a value, including zero.  Available values:    Pre-ICHRA Codes (available before 2020):  - 1A: Qualifying offer: minimum essential coverage providing minimum value offered to full-time employee with employee required contribution ≤ 9.5% (as adjusted) of mainland single federal poverty line and at least minimum essential coverage offered to spouse and dependent(s)  - 1B: Minimum essential coverage providing minimum value offered to employee only  - 1C: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage offered to dependent(s) (not spouse)  - 1D: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage offered to spouse (not dependent(s))  - 1E: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage offered to dependent(s) and spouse  - 1F: Minimum essential coverage NOT providing minimum value offered to employee; employee and spouse or dependent(s); or employee, spouse, and dependents  - 1G: Offer of coverage to an individual who was not an employee or not a full-time employee and who enrolled in self-insured coverage  - 1H: No offer of coverage (employee not offered any health coverage or employee offered coverage that is not minimum essential coverage)  - 1J: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage conditionally offered to spouse; minimum essential coverage not offered to dependent(s)  - 1K: Minimum essential coverage providing minimum value offered to employee; at least minimum essential coverage offered to dependents; and at least minimum essential coverage conditionally offered to spouse                ICHRA Codes (introduced 2020, require ZIP code):  - 1L: Individual coverage HRA offered to employee only  - 1M: Individual coverage HRA offered to employee and dependent(s) (not spouse)  - 1N: Individual coverage HRA offered to employee, spouse, and dependent(s)  - 1O: Individual coverage HRA offered to employee only using employment site ZIP code affordability safe harbor  - 1P: Individual coverage HRA offered to employee and dependent(s) (not spouse) using employment site ZIP code affordability safe harbor  - 1Q: Individual coverage HRA offered to employee, spouse, and dependent(s) using employment site ZIP code affordability safe harbor  - 1R: Individual coverage HRA that is NOT affordable  - 1S: Individual coverage HRA offered to an individual who was not a full-time employee  - 1T: Individual coverage HRA offered to employee and spouse (not dependents)  - 1U: Individual coverage HRA offered to employee and spouse (not dependents) using employment site ZIP code affordability safe harbor    Note: Codes 1B, 1C, 1D, 1E, 1J, 1K, 1L, 1M, 1N, 1O, 1P, 1Q, 1T, 1U require employee share amount (0.00 is a valid value).
   */
  @JsonAdapter(OfferCodeEnum.Adapter.class)
  public enum OfferCodeEnum {
    _1_A("1A"),
    
    _1_B("1B"),
    
    _1_C("1C"),
    
    _1_D("1D"),
    
    _1_E("1E"),
    
    _1_F("1F"),
    
    _1_G("1G"),
    
    _1_H("1H"),
    
    _1_J("1J"),
    
    _1_K("1K"),
    
    _1_L("1L"),
    
    _1_M("1M"),
    
    _1_N("1N"),
    
    _1_O("1O"),
    
    _1_P("1P"),
    
    _1_Q("1Q"),
    
    _1_R("1R"),
    
    _1_S("1S"),
    
    _1_T("1T"),
    
    _1_U("1U");

    private String value;

    OfferCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OfferCodeEnum fromValue(String value) {
      for (OfferCodeEnum b : OfferCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OfferCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfferCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfferCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OfferCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      OfferCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OFFER_CODE = "offerCode";
  @SerializedName(SERIALIZED_NAME_OFFER_CODE)
  private OfferCodeEnum offerCode;

  public static final String SERIALIZED_NAME_SHARE = "share";
  @SerializedName(SERIALIZED_NAME_SHARE)
  private Double share;

  /**
   * Safe harbor code - Applicable Section 4980H Safe Harbor Code.  Available values:  - 2A: Form W-2 safe harbor  - 2B: Federal poverty line safe harbor  - 2C: Rate of pay safe harbor  - 2D: Part-time employee safe harbor for employees who were not full-time for any month of the year  - 2E: Multiemployer interim rule relief  - 2F: Qualifying offer method  - 2G: Qualifying offer transition relief  - 2H: Other affordability safe harbor
   */
  @JsonAdapter(SafeHarborCodeEnum.Adapter.class)
  public enum SafeHarborCodeEnum {
    _2_A("2A"),
    
    _2_B("2B"),
    
    _2_C("2C"),
    
    _2_D("2D"),
    
    _2_E("2E"),
    
    _2_F("2F"),
    
    _2_G("2G"),
    
    _2_H("2H");

    private String value;

    SafeHarborCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SafeHarborCodeEnum fromValue(String value) {
      for (SafeHarborCodeEnum b : SafeHarborCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SafeHarborCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SafeHarborCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SafeHarborCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SafeHarborCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SafeHarborCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SAFE_HARBOR_CODE = "safeHarborCode";
  @SerializedName(SERIALIZED_NAME_SAFE_HARBOR_CODE)
  private SafeHarborCodeEnum safeHarborCode;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public OfferAndCoverage() {
  }

  public OfferAndCoverage(
     Integer id
  ) {
    this();
    this.id = id;
  }

  /**
   * Id
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }



  public OfferAndCoverage month(MonthEnum month) {
    this.month = month;
    return this;
  }

  /**
   * Month of coverage.  Available values:  - All: All months  - January: January  - February: February  - March: March  - April: April  - May: May  - June: June  - July: July  - August: August  - September: September  - October: October  - November: November  - December: December
   * @return month
   */
  @javax.annotation.Nullable
  public MonthEnum getMonth() {
    return month;
  }

  public void setMonth(MonthEnum month) {
    this.month = month;
  }


  public OfferAndCoverage offerCode(OfferCodeEnum offerCode) {
    this.offerCode = offerCode;
    return this;
  }

  /**
   * Offer of Coverage Code. Required if Share has a value, including zero.  Available values:    Pre-ICHRA Codes (available before 2020):  - 1A: Qualifying offer: minimum essential coverage providing minimum value offered to full-time employee with employee required contribution ≤ 9.5% (as adjusted) of mainland single federal poverty line and at least minimum essential coverage offered to spouse and dependent(s)  - 1B: Minimum essential coverage providing minimum value offered to employee only  - 1C: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage offered to dependent(s) (not spouse)  - 1D: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage offered to spouse (not dependent(s))  - 1E: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage offered to dependent(s) and spouse  - 1F: Minimum essential coverage NOT providing minimum value offered to employee; employee and spouse or dependent(s); or employee, spouse, and dependents  - 1G: Offer of coverage to an individual who was not an employee or not a full-time employee and who enrolled in self-insured coverage  - 1H: No offer of coverage (employee not offered any health coverage or employee offered coverage that is not minimum essential coverage)  - 1J: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage conditionally offered to spouse; minimum essential coverage not offered to dependent(s)  - 1K: Minimum essential coverage providing minimum value offered to employee; at least minimum essential coverage offered to dependents; and at least minimum essential coverage conditionally offered to spouse                ICHRA Codes (introduced 2020, require ZIP code):  - 1L: Individual coverage HRA offered to employee only  - 1M: Individual coverage HRA offered to employee and dependent(s) (not spouse)  - 1N: Individual coverage HRA offered to employee, spouse, and dependent(s)  - 1O: Individual coverage HRA offered to employee only using employment site ZIP code affordability safe harbor  - 1P: Individual coverage HRA offered to employee and dependent(s) (not spouse) using employment site ZIP code affordability safe harbor  - 1Q: Individual coverage HRA offered to employee, spouse, and dependent(s) using employment site ZIP code affordability safe harbor  - 1R: Individual coverage HRA that is NOT affordable  - 1S: Individual coverage HRA offered to an individual who was not a full-time employee  - 1T: Individual coverage HRA offered to employee and spouse (not dependents)  - 1U: Individual coverage HRA offered to employee and spouse (not dependents) using employment site ZIP code affordability safe harbor    Note: Codes 1B, 1C, 1D, 1E, 1J, 1K, 1L, 1M, 1N, 1O, 1P, 1Q, 1T, 1U require employee share amount (0.00 is a valid value).
   * @return offerCode
   */
  @javax.annotation.Nullable
  public OfferCodeEnum getOfferCode() {
    return offerCode;
  }

  public void setOfferCode(OfferCodeEnum offerCode) {
    this.offerCode = offerCode;
  }


  public OfferAndCoverage share(Double share) {
    this.share = share;
    return this;
  }

  /**
   * Employee required contribution share - Employee Share of Lowest Cost Monthly Premium, for Self-Only Minimum Value Coverage - May not exceed 3499.99
   * @return share
   */
  @javax.annotation.Nullable
  public Double getShare() {
    return share;
  }

  public void setShare(Double share) {
    this.share = share;
  }


  public OfferAndCoverage safeHarborCode(SafeHarborCodeEnum safeHarborCode) {
    this.safeHarborCode = safeHarborCode;
    return this;
  }

  /**
   * Safe harbor code - Applicable Section 4980H Safe Harbor Code.  Available values:  - 2A: Form W-2 safe harbor  - 2B: Federal poverty line safe harbor  - 2C: Rate of pay safe harbor  - 2D: Part-time employee safe harbor for employees who were not full-time for any month of the year  - 2E: Multiemployer interim rule relief  - 2F: Qualifying offer method  - 2G: Qualifying offer transition relief  - 2H: Other affordability safe harbor
   * @return safeHarborCode
   */
  @javax.annotation.Nullable
  public SafeHarborCodeEnum getSafeHarborCode() {
    return safeHarborCode;
  }

  public void setSafeHarborCode(SafeHarborCodeEnum safeHarborCode) {
    this.safeHarborCode = safeHarborCode;
  }


  public OfferAndCoverage zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * ZIP/postal code. For coverage area (optional, unless codes 1L to 1U are used).
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
    OfferAndCoverage offerAndCoverage = (OfferAndCoverage) o;
    return Objects.equals(this.id, offerAndCoverage.id) &&
        Objects.equals(this.month, offerAndCoverage.month) &&
        Objects.equals(this.offerCode, offerAndCoverage.offerCode) &&
        Objects.equals(this.share, offerAndCoverage.share) &&
        Objects.equals(this.safeHarborCode, offerAndCoverage.safeHarborCode) &&
        Objects.equals(this.zipCode, offerAndCoverage.zipCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, month, offerCode, share, safeHarborCode, zipCode);
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
    sb.append("class OfferAndCoverage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("id");
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
   * @throws IOException if the JSON Element is invalid with respect to OfferAndCoverage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OfferAndCoverage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OfferAndCoverage is not found in the empty JSON string", OfferAndCoverage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OfferAndCoverage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OfferAndCoverage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("month") != null && !jsonObj.get("month").isJsonNull()) && !jsonObj.get("month").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("month").toString()));
      }
      // validate the optional field `month`
      if (jsonObj.get("month") != null && !jsonObj.get("month").isJsonNull()) {
        MonthEnum.validateJsonElement(jsonObj.get("month"));
      }
      if ((jsonObj.get("offerCode") != null && !jsonObj.get("offerCode").isJsonNull()) && !jsonObj.get("offerCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offerCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offerCode").toString()));
      }
      // validate the optional field `offerCode`
      if (jsonObj.get("offerCode") != null && !jsonObj.get("offerCode").isJsonNull()) {
        OfferCodeEnum.validateJsonElement(jsonObj.get("offerCode"));
      }
      if ((jsonObj.get("safeHarborCode") != null && !jsonObj.get("safeHarborCode").isJsonNull()) && !jsonObj.get("safeHarborCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `safeHarborCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("safeHarborCode").toString()));
      }
      // validate the optional field `safeHarborCode`
      if (jsonObj.get("safeHarborCode") != null && !jsonObj.get("safeHarborCode").isJsonNull()) {
        SafeHarborCodeEnum.validateJsonElement(jsonObj.get("safeHarborCode"));
      }
      if ((jsonObj.get("zipCode") != null && !jsonObj.get("zipCode").isJsonNull()) && !jsonObj.get("zipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferAndCoverage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferAndCoverage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferAndCoverage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferAndCoverage.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferAndCoverage>() {
           @Override
           public void write(JsonWriter out, OfferAndCoverage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferAndCoverage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OfferAndCoverage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OfferAndCoverage
   * @throws IOException if the JSON string is invalid with respect to OfferAndCoverage
   */
  public static OfferAndCoverage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferAndCoverage.class);
  }

  /**
   * Convert an instance of OfferAndCoverage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

