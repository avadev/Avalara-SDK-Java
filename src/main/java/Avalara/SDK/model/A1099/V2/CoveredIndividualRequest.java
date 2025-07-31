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
import java.time.OffsetDateTime;
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
 * CoveredIndividualRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CoveredIndividualRequest {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_NAME_SUFFIX = "nameSuffix";
  @SerializedName(SERIALIZED_NAME_NAME_SUFFIX)
  private String nameSuffix;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birthDate";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private OffsetDateTime birthDate;

  public static final String SERIALIZED_NAME_COVERED_ALL_MONTHS = "coveredAllMonths";
  @SerializedName(SERIALIZED_NAME_COVERED_ALL_MONTHS)
  private Boolean coveredAllMonths;

  public static final String SERIALIZED_NAME_COVERED_JANUARY = "coveredJanuary";
  @SerializedName(SERIALIZED_NAME_COVERED_JANUARY)
  private Boolean coveredJanuary;

  public static final String SERIALIZED_NAME_COVERED_FEBRUARY = "coveredFebruary";
  @SerializedName(SERIALIZED_NAME_COVERED_FEBRUARY)
  private Boolean coveredFebruary;

  public static final String SERIALIZED_NAME_COVERED_MARCH = "coveredMarch";
  @SerializedName(SERIALIZED_NAME_COVERED_MARCH)
  private Boolean coveredMarch;

  public static final String SERIALIZED_NAME_COVERED_APRIL = "coveredApril";
  @SerializedName(SERIALIZED_NAME_COVERED_APRIL)
  private Boolean coveredApril;

  public static final String SERIALIZED_NAME_COVERED_MAY = "coveredMay";
  @SerializedName(SERIALIZED_NAME_COVERED_MAY)
  private Boolean coveredMay;

  public static final String SERIALIZED_NAME_COVERED_JUNE = "coveredJune";
  @SerializedName(SERIALIZED_NAME_COVERED_JUNE)
  private Boolean coveredJune;

  public static final String SERIALIZED_NAME_COVERED_JULY = "coveredJuly";
  @SerializedName(SERIALIZED_NAME_COVERED_JULY)
  private Boolean coveredJuly;

  public static final String SERIALIZED_NAME_COVERED_AUGUST = "coveredAugust";
  @SerializedName(SERIALIZED_NAME_COVERED_AUGUST)
  private Boolean coveredAugust;

  public static final String SERIALIZED_NAME_COVERED_SEPTEMBER = "coveredSeptember";
  @SerializedName(SERIALIZED_NAME_COVERED_SEPTEMBER)
  private Boolean coveredSeptember;

  public static final String SERIALIZED_NAME_COVERED_OCTOBER = "coveredOctober";
  @SerializedName(SERIALIZED_NAME_COVERED_OCTOBER)
  private Boolean coveredOctober;

  public static final String SERIALIZED_NAME_COVERED_NOVEMBER = "coveredNovember";
  @SerializedName(SERIALIZED_NAME_COVERED_NOVEMBER)
  private Boolean coveredNovember;

  public static final String SERIALIZED_NAME_COVERED_DECEMBER = "coveredDecember";
  @SerializedName(SERIALIZED_NAME_COVERED_DECEMBER)
  private Boolean coveredDecember;

  public CoveredIndividualRequest() {
  }

  public CoveredIndividualRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Covered individual&#39;s first name
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CoveredIndividualRequest middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Covered individual&#39;s middle name
   * @return middleName
   */
  @javax.annotation.Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public CoveredIndividualRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Covered individual&#39;s last name
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CoveredIndividualRequest nameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
    return this;
  }

  /**
   * Covered individual&#39;s name suffix
   * @return nameSuffix
   */
  @javax.annotation.Nullable
  public String getNameSuffix() {
    return nameSuffix;
  }

  public void setNameSuffix(String nameSuffix) {
    this.nameSuffix = nameSuffix;
  }


  public CoveredIndividualRequest tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * Covered individual&#39;s TIN (SSN or ITIN)
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public CoveredIndividualRequest birthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Covered individual&#39;s date of birth
   * @return birthDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
  }


  public CoveredIndividualRequest coveredAllMonths(Boolean coveredAllMonths) {
    this.coveredAllMonths = coveredAllMonths;
    return this;
  }

  /**
   * Coverage indicator for all 12 months
   * @return coveredAllMonths
   */
  @javax.annotation.Nullable
  public Boolean getCoveredAllMonths() {
    return coveredAllMonths;
  }

  public void setCoveredAllMonths(Boolean coveredAllMonths) {
    this.coveredAllMonths = coveredAllMonths;
  }


  public CoveredIndividualRequest coveredJanuary(Boolean coveredJanuary) {
    this.coveredJanuary = coveredJanuary;
    return this;
  }

  /**
   * Coverage indicator for January
   * @return coveredJanuary
   */
  @javax.annotation.Nullable
  public Boolean getCoveredJanuary() {
    return coveredJanuary;
  }

  public void setCoveredJanuary(Boolean coveredJanuary) {
    this.coveredJanuary = coveredJanuary;
  }


  public CoveredIndividualRequest coveredFebruary(Boolean coveredFebruary) {
    this.coveredFebruary = coveredFebruary;
    return this;
  }

  /**
   * Coverage indicator for February
   * @return coveredFebruary
   */
  @javax.annotation.Nullable
  public Boolean getCoveredFebruary() {
    return coveredFebruary;
  }

  public void setCoveredFebruary(Boolean coveredFebruary) {
    this.coveredFebruary = coveredFebruary;
  }


  public CoveredIndividualRequest coveredMarch(Boolean coveredMarch) {
    this.coveredMarch = coveredMarch;
    return this;
  }

  /**
   * Coverage indicator for March
   * @return coveredMarch
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMarch() {
    return coveredMarch;
  }

  public void setCoveredMarch(Boolean coveredMarch) {
    this.coveredMarch = coveredMarch;
  }


  public CoveredIndividualRequest coveredApril(Boolean coveredApril) {
    this.coveredApril = coveredApril;
    return this;
  }

  /**
   * Coverage indicator for April
   * @return coveredApril
   */
  @javax.annotation.Nullable
  public Boolean getCoveredApril() {
    return coveredApril;
  }

  public void setCoveredApril(Boolean coveredApril) {
    this.coveredApril = coveredApril;
  }


  public CoveredIndividualRequest coveredMay(Boolean coveredMay) {
    this.coveredMay = coveredMay;
    return this;
  }

  /**
   * Coverage indicator for May
   * @return coveredMay
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMay() {
    return coveredMay;
  }

  public void setCoveredMay(Boolean coveredMay) {
    this.coveredMay = coveredMay;
  }


  public CoveredIndividualRequest coveredJune(Boolean coveredJune) {
    this.coveredJune = coveredJune;
    return this;
  }

  /**
   * Coverage indicator for June
   * @return coveredJune
   */
  @javax.annotation.Nullable
  public Boolean getCoveredJune() {
    return coveredJune;
  }

  public void setCoveredJune(Boolean coveredJune) {
    this.coveredJune = coveredJune;
  }


  public CoveredIndividualRequest coveredJuly(Boolean coveredJuly) {
    this.coveredJuly = coveredJuly;
    return this;
  }

  /**
   * Coverage indicator for July
   * @return coveredJuly
   */
  @javax.annotation.Nullable
  public Boolean getCoveredJuly() {
    return coveredJuly;
  }

  public void setCoveredJuly(Boolean coveredJuly) {
    this.coveredJuly = coveredJuly;
  }


  public CoveredIndividualRequest coveredAugust(Boolean coveredAugust) {
    this.coveredAugust = coveredAugust;
    return this;
  }

  /**
   * Coverage indicator for August
   * @return coveredAugust
   */
  @javax.annotation.Nullable
  public Boolean getCoveredAugust() {
    return coveredAugust;
  }

  public void setCoveredAugust(Boolean coveredAugust) {
    this.coveredAugust = coveredAugust;
  }


  public CoveredIndividualRequest coveredSeptember(Boolean coveredSeptember) {
    this.coveredSeptember = coveredSeptember;
    return this;
  }

  /**
   * Coverage indicator for September
   * @return coveredSeptember
   */
  @javax.annotation.Nullable
  public Boolean getCoveredSeptember() {
    return coveredSeptember;
  }

  public void setCoveredSeptember(Boolean coveredSeptember) {
    this.coveredSeptember = coveredSeptember;
  }


  public CoveredIndividualRequest coveredOctober(Boolean coveredOctober) {
    this.coveredOctober = coveredOctober;
    return this;
  }

  /**
   * Coverage indicator for October
   * @return coveredOctober
   */
  @javax.annotation.Nullable
  public Boolean getCoveredOctober() {
    return coveredOctober;
  }

  public void setCoveredOctober(Boolean coveredOctober) {
    this.coveredOctober = coveredOctober;
  }


  public CoveredIndividualRequest coveredNovember(Boolean coveredNovember) {
    this.coveredNovember = coveredNovember;
    return this;
  }

  /**
   * Coverage indicator for November
   * @return coveredNovember
   */
  @javax.annotation.Nullable
  public Boolean getCoveredNovember() {
    return coveredNovember;
  }

  public void setCoveredNovember(Boolean coveredNovember) {
    this.coveredNovember = coveredNovember;
  }


  public CoveredIndividualRequest coveredDecember(Boolean coveredDecember) {
    this.coveredDecember = coveredDecember;
    return this;
  }

  /**
   * Coverage indicator for December
   * @return coveredDecember
   */
  @javax.annotation.Nullable
  public Boolean getCoveredDecember() {
    return coveredDecember;
  }

  public void setCoveredDecember(Boolean coveredDecember) {
    this.coveredDecember = coveredDecember;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoveredIndividualRequest coveredIndividualRequest = (CoveredIndividualRequest) o;
    return Objects.equals(this.firstName, coveredIndividualRequest.firstName) &&
        Objects.equals(this.middleName, coveredIndividualRequest.middleName) &&
        Objects.equals(this.lastName, coveredIndividualRequest.lastName) &&
        Objects.equals(this.nameSuffix, coveredIndividualRequest.nameSuffix) &&
        Objects.equals(this.tin, coveredIndividualRequest.tin) &&
        Objects.equals(this.birthDate, coveredIndividualRequest.birthDate) &&
        Objects.equals(this.coveredAllMonths, coveredIndividualRequest.coveredAllMonths) &&
        Objects.equals(this.coveredJanuary, coveredIndividualRequest.coveredJanuary) &&
        Objects.equals(this.coveredFebruary, coveredIndividualRequest.coveredFebruary) &&
        Objects.equals(this.coveredMarch, coveredIndividualRequest.coveredMarch) &&
        Objects.equals(this.coveredApril, coveredIndividualRequest.coveredApril) &&
        Objects.equals(this.coveredMay, coveredIndividualRequest.coveredMay) &&
        Objects.equals(this.coveredJune, coveredIndividualRequest.coveredJune) &&
        Objects.equals(this.coveredJuly, coveredIndividualRequest.coveredJuly) &&
        Objects.equals(this.coveredAugust, coveredIndividualRequest.coveredAugust) &&
        Objects.equals(this.coveredSeptember, coveredIndividualRequest.coveredSeptember) &&
        Objects.equals(this.coveredOctober, coveredIndividualRequest.coveredOctober) &&
        Objects.equals(this.coveredNovember, coveredIndividualRequest.coveredNovember) &&
        Objects.equals(this.coveredDecember, coveredIndividualRequest.coveredDecember);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, nameSuffix, tin, birthDate, coveredAllMonths, coveredJanuary, coveredFebruary, coveredMarch, coveredApril, coveredMay, coveredJune, coveredJuly, coveredAugust, coveredSeptember, coveredOctober, coveredNovember, coveredDecember);
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
    sb.append("class CoveredIndividualRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    coveredAllMonths: ").append(toIndentedString(coveredAllMonths)).append("\n");
    sb.append("    coveredJanuary: ").append(toIndentedString(coveredJanuary)).append("\n");
    sb.append("    coveredFebruary: ").append(toIndentedString(coveredFebruary)).append("\n");
    sb.append("    coveredMarch: ").append(toIndentedString(coveredMarch)).append("\n");
    sb.append("    coveredApril: ").append(toIndentedString(coveredApril)).append("\n");
    sb.append("    coveredMay: ").append(toIndentedString(coveredMay)).append("\n");
    sb.append("    coveredJune: ").append(toIndentedString(coveredJune)).append("\n");
    sb.append("    coveredJuly: ").append(toIndentedString(coveredJuly)).append("\n");
    sb.append("    coveredAugust: ").append(toIndentedString(coveredAugust)).append("\n");
    sb.append("    coveredSeptember: ").append(toIndentedString(coveredSeptember)).append("\n");
    sb.append("    coveredOctober: ").append(toIndentedString(coveredOctober)).append("\n");
    sb.append("    coveredNovember: ").append(toIndentedString(coveredNovember)).append("\n");
    sb.append("    coveredDecember: ").append(toIndentedString(coveredDecember)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("middleName");
    openapiFields.add("lastName");
    openapiFields.add("nameSuffix");
    openapiFields.add("tin");
    openapiFields.add("birthDate");
    openapiFields.add("coveredAllMonths");
    openapiFields.add("coveredJanuary");
    openapiFields.add("coveredFebruary");
    openapiFields.add("coveredMarch");
    openapiFields.add("coveredApril");
    openapiFields.add("coveredMay");
    openapiFields.add("coveredJune");
    openapiFields.add("coveredJuly");
    openapiFields.add("coveredAugust");
    openapiFields.add("coveredSeptember");
    openapiFields.add("coveredOctober");
    openapiFields.add("coveredNovember");
    openapiFields.add("coveredDecember");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CoveredIndividualRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoveredIndividualRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoveredIndividualRequest is not found in the empty JSON string", CoveredIndividualRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoveredIndividualRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoveredIndividualRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull()) && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("nameSuffix") != null && !jsonObj.get("nameSuffix").isJsonNull()) && !jsonObj.get("nameSuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameSuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameSuffix").toString()));
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoveredIndividualRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoveredIndividualRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoveredIndividualRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoveredIndividualRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CoveredIndividualRequest>() {
           @Override
           public void write(JsonWriter out, CoveredIndividualRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoveredIndividualRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CoveredIndividualRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CoveredIndividualRequest
   * @throws IOException if the JSON string is invalid with respect to CoveredIndividualRequest
   */
  public static CoveredIndividualRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoveredIndividualRequest.class);
  }

  /**
   * Convert an instance of CoveredIndividualRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

