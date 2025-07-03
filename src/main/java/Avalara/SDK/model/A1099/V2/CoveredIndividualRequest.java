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

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR0 = "coveredMonthIndicator0";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR0)
  private Boolean coveredMonthIndicator0;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR1 = "coveredMonthIndicator1";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR1)
  private Boolean coveredMonthIndicator1;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR2 = "coveredMonthIndicator2";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR2)
  private Boolean coveredMonthIndicator2;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR3 = "coveredMonthIndicator3";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR3)
  private Boolean coveredMonthIndicator3;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR4 = "coveredMonthIndicator4";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR4)
  private Boolean coveredMonthIndicator4;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR5 = "coveredMonthIndicator5";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR5)
  private Boolean coveredMonthIndicator5;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR6 = "coveredMonthIndicator6";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR6)
  private Boolean coveredMonthIndicator6;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR7 = "coveredMonthIndicator7";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR7)
  private Boolean coveredMonthIndicator7;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR8 = "coveredMonthIndicator8";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR8)
  private Boolean coveredMonthIndicator8;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR9 = "coveredMonthIndicator9";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR9)
  private Boolean coveredMonthIndicator9;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR10 = "coveredMonthIndicator10";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR10)
  private Boolean coveredMonthIndicator10;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR11 = "coveredMonthIndicator11";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR11)
  private Boolean coveredMonthIndicator11;

  public static final String SERIALIZED_NAME_COVERED_MONTH_INDICATOR12 = "coveredMonthIndicator12";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH_INDICATOR12)
  private Boolean coveredMonthIndicator12;

  public CoveredIndividualRequest() {
  }

  public CoveredIndividualRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
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
   * Get middleName
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
   * Get lastName
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
   * Get nameSuffix
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


  public CoveredIndividualRequest birthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
  }


  public CoveredIndividualRequest coveredMonthIndicator0(Boolean coveredMonthIndicator0) {
    this.coveredMonthIndicator0 = coveredMonthIndicator0;
    return this;
  }

  /**
   * Get coveredMonthIndicator0
   * @return coveredMonthIndicator0
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator0() {
    return coveredMonthIndicator0;
  }

  public void setCoveredMonthIndicator0(Boolean coveredMonthIndicator0) {
    this.coveredMonthIndicator0 = coveredMonthIndicator0;
  }


  public CoveredIndividualRequest coveredMonthIndicator1(Boolean coveredMonthIndicator1) {
    this.coveredMonthIndicator1 = coveredMonthIndicator1;
    return this;
  }

  /**
   * Get coveredMonthIndicator1
   * @return coveredMonthIndicator1
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator1() {
    return coveredMonthIndicator1;
  }

  public void setCoveredMonthIndicator1(Boolean coveredMonthIndicator1) {
    this.coveredMonthIndicator1 = coveredMonthIndicator1;
  }


  public CoveredIndividualRequest coveredMonthIndicator2(Boolean coveredMonthIndicator2) {
    this.coveredMonthIndicator2 = coveredMonthIndicator2;
    return this;
  }

  /**
   * Get coveredMonthIndicator2
   * @return coveredMonthIndicator2
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator2() {
    return coveredMonthIndicator2;
  }

  public void setCoveredMonthIndicator2(Boolean coveredMonthIndicator2) {
    this.coveredMonthIndicator2 = coveredMonthIndicator2;
  }


  public CoveredIndividualRequest coveredMonthIndicator3(Boolean coveredMonthIndicator3) {
    this.coveredMonthIndicator3 = coveredMonthIndicator3;
    return this;
  }

  /**
   * Get coveredMonthIndicator3
   * @return coveredMonthIndicator3
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator3() {
    return coveredMonthIndicator3;
  }

  public void setCoveredMonthIndicator3(Boolean coveredMonthIndicator3) {
    this.coveredMonthIndicator3 = coveredMonthIndicator3;
  }


  public CoveredIndividualRequest coveredMonthIndicator4(Boolean coveredMonthIndicator4) {
    this.coveredMonthIndicator4 = coveredMonthIndicator4;
    return this;
  }

  /**
   * Get coveredMonthIndicator4
   * @return coveredMonthIndicator4
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator4() {
    return coveredMonthIndicator4;
  }

  public void setCoveredMonthIndicator4(Boolean coveredMonthIndicator4) {
    this.coveredMonthIndicator4 = coveredMonthIndicator4;
  }


  public CoveredIndividualRequest coveredMonthIndicator5(Boolean coveredMonthIndicator5) {
    this.coveredMonthIndicator5 = coveredMonthIndicator5;
    return this;
  }

  /**
   * Get coveredMonthIndicator5
   * @return coveredMonthIndicator5
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator5() {
    return coveredMonthIndicator5;
  }

  public void setCoveredMonthIndicator5(Boolean coveredMonthIndicator5) {
    this.coveredMonthIndicator5 = coveredMonthIndicator5;
  }


  public CoveredIndividualRequest coveredMonthIndicator6(Boolean coveredMonthIndicator6) {
    this.coveredMonthIndicator6 = coveredMonthIndicator6;
    return this;
  }

  /**
   * Get coveredMonthIndicator6
   * @return coveredMonthIndicator6
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator6() {
    return coveredMonthIndicator6;
  }

  public void setCoveredMonthIndicator6(Boolean coveredMonthIndicator6) {
    this.coveredMonthIndicator6 = coveredMonthIndicator6;
  }


  public CoveredIndividualRequest coveredMonthIndicator7(Boolean coveredMonthIndicator7) {
    this.coveredMonthIndicator7 = coveredMonthIndicator7;
    return this;
  }

  /**
   * Get coveredMonthIndicator7
   * @return coveredMonthIndicator7
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator7() {
    return coveredMonthIndicator7;
  }

  public void setCoveredMonthIndicator7(Boolean coveredMonthIndicator7) {
    this.coveredMonthIndicator7 = coveredMonthIndicator7;
  }


  public CoveredIndividualRequest coveredMonthIndicator8(Boolean coveredMonthIndicator8) {
    this.coveredMonthIndicator8 = coveredMonthIndicator8;
    return this;
  }

  /**
   * Get coveredMonthIndicator8
   * @return coveredMonthIndicator8
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator8() {
    return coveredMonthIndicator8;
  }

  public void setCoveredMonthIndicator8(Boolean coveredMonthIndicator8) {
    this.coveredMonthIndicator8 = coveredMonthIndicator8;
  }


  public CoveredIndividualRequest coveredMonthIndicator9(Boolean coveredMonthIndicator9) {
    this.coveredMonthIndicator9 = coveredMonthIndicator9;
    return this;
  }

  /**
   * Get coveredMonthIndicator9
   * @return coveredMonthIndicator9
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator9() {
    return coveredMonthIndicator9;
  }

  public void setCoveredMonthIndicator9(Boolean coveredMonthIndicator9) {
    this.coveredMonthIndicator9 = coveredMonthIndicator9;
  }


  public CoveredIndividualRequest coveredMonthIndicator10(Boolean coveredMonthIndicator10) {
    this.coveredMonthIndicator10 = coveredMonthIndicator10;
    return this;
  }

  /**
   * Get coveredMonthIndicator10
   * @return coveredMonthIndicator10
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator10() {
    return coveredMonthIndicator10;
  }

  public void setCoveredMonthIndicator10(Boolean coveredMonthIndicator10) {
    this.coveredMonthIndicator10 = coveredMonthIndicator10;
  }


  public CoveredIndividualRequest coveredMonthIndicator11(Boolean coveredMonthIndicator11) {
    this.coveredMonthIndicator11 = coveredMonthIndicator11;
    return this;
  }

  /**
   * Get coveredMonthIndicator11
   * @return coveredMonthIndicator11
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator11() {
    return coveredMonthIndicator11;
  }

  public void setCoveredMonthIndicator11(Boolean coveredMonthIndicator11) {
    this.coveredMonthIndicator11 = coveredMonthIndicator11;
  }


  public CoveredIndividualRequest coveredMonthIndicator12(Boolean coveredMonthIndicator12) {
    this.coveredMonthIndicator12 = coveredMonthIndicator12;
    return this;
  }

  /**
   * Get coveredMonthIndicator12
   * @return coveredMonthIndicator12
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonthIndicator12() {
    return coveredMonthIndicator12;
  }

  public void setCoveredMonthIndicator12(Boolean coveredMonthIndicator12) {
    this.coveredMonthIndicator12 = coveredMonthIndicator12;
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
        Objects.equals(this.coveredMonthIndicator0, coveredIndividualRequest.coveredMonthIndicator0) &&
        Objects.equals(this.coveredMonthIndicator1, coveredIndividualRequest.coveredMonthIndicator1) &&
        Objects.equals(this.coveredMonthIndicator2, coveredIndividualRequest.coveredMonthIndicator2) &&
        Objects.equals(this.coveredMonthIndicator3, coveredIndividualRequest.coveredMonthIndicator3) &&
        Objects.equals(this.coveredMonthIndicator4, coveredIndividualRequest.coveredMonthIndicator4) &&
        Objects.equals(this.coveredMonthIndicator5, coveredIndividualRequest.coveredMonthIndicator5) &&
        Objects.equals(this.coveredMonthIndicator6, coveredIndividualRequest.coveredMonthIndicator6) &&
        Objects.equals(this.coveredMonthIndicator7, coveredIndividualRequest.coveredMonthIndicator7) &&
        Objects.equals(this.coveredMonthIndicator8, coveredIndividualRequest.coveredMonthIndicator8) &&
        Objects.equals(this.coveredMonthIndicator9, coveredIndividualRequest.coveredMonthIndicator9) &&
        Objects.equals(this.coveredMonthIndicator10, coveredIndividualRequest.coveredMonthIndicator10) &&
        Objects.equals(this.coveredMonthIndicator11, coveredIndividualRequest.coveredMonthIndicator11) &&
        Objects.equals(this.coveredMonthIndicator12, coveredIndividualRequest.coveredMonthIndicator12);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, nameSuffix, tin, birthDate, coveredMonthIndicator0, coveredMonthIndicator1, coveredMonthIndicator2, coveredMonthIndicator3, coveredMonthIndicator4, coveredMonthIndicator5, coveredMonthIndicator6, coveredMonthIndicator7, coveredMonthIndicator8, coveredMonthIndicator9, coveredMonthIndicator10, coveredMonthIndicator11, coveredMonthIndicator12);
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
    sb.append("    coveredMonthIndicator0: ").append(toIndentedString(coveredMonthIndicator0)).append("\n");
    sb.append("    coveredMonthIndicator1: ").append(toIndentedString(coveredMonthIndicator1)).append("\n");
    sb.append("    coveredMonthIndicator2: ").append(toIndentedString(coveredMonthIndicator2)).append("\n");
    sb.append("    coveredMonthIndicator3: ").append(toIndentedString(coveredMonthIndicator3)).append("\n");
    sb.append("    coveredMonthIndicator4: ").append(toIndentedString(coveredMonthIndicator4)).append("\n");
    sb.append("    coveredMonthIndicator5: ").append(toIndentedString(coveredMonthIndicator5)).append("\n");
    sb.append("    coveredMonthIndicator6: ").append(toIndentedString(coveredMonthIndicator6)).append("\n");
    sb.append("    coveredMonthIndicator7: ").append(toIndentedString(coveredMonthIndicator7)).append("\n");
    sb.append("    coveredMonthIndicator8: ").append(toIndentedString(coveredMonthIndicator8)).append("\n");
    sb.append("    coveredMonthIndicator9: ").append(toIndentedString(coveredMonthIndicator9)).append("\n");
    sb.append("    coveredMonthIndicator10: ").append(toIndentedString(coveredMonthIndicator10)).append("\n");
    sb.append("    coveredMonthIndicator11: ").append(toIndentedString(coveredMonthIndicator11)).append("\n");
    sb.append("    coveredMonthIndicator12: ").append(toIndentedString(coveredMonthIndicator12)).append("\n");
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
    openapiFields.add("coveredMonthIndicator0");
    openapiFields.add("coveredMonthIndicator1");
    openapiFields.add("coveredMonthIndicator2");
    openapiFields.add("coveredMonthIndicator3");
    openapiFields.add("coveredMonthIndicator4");
    openapiFields.add("coveredMonthIndicator5");
    openapiFields.add("coveredMonthIndicator6");
    openapiFields.add("coveredMonthIndicator7");
    openapiFields.add("coveredMonthIndicator8");
    openapiFields.add("coveredMonthIndicator9");
    openapiFields.add("coveredMonthIndicator10");
    openapiFields.add("coveredMonthIndicator11");
    openapiFields.add("coveredMonthIndicator12");

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

