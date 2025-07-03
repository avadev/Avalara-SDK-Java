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
 * CoveredIndividualReference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CoveredIndividualReference {
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

  public static final String SERIALIZED_NAME_COVERED_MONTH0 = "coveredMonth0";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH0)
  private Boolean coveredMonth0;

  public static final String SERIALIZED_NAME_COVERED_MONTH1 = "coveredMonth1";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH1)
  private Boolean coveredMonth1;

  public static final String SERIALIZED_NAME_COVERED_MONTH2 = "coveredMonth2";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH2)
  private Boolean coveredMonth2;

  public static final String SERIALIZED_NAME_COVERED_MONTH3 = "coveredMonth3";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH3)
  private Boolean coveredMonth3;

  public static final String SERIALIZED_NAME_COVERED_MONTH4 = "coveredMonth4";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH4)
  private Boolean coveredMonth4;

  public static final String SERIALIZED_NAME_COVERED_MONTH5 = "coveredMonth5";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH5)
  private Boolean coveredMonth5;

  public static final String SERIALIZED_NAME_COVERED_MONTH6 = "coveredMonth6";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH6)
  private Boolean coveredMonth6;

  public static final String SERIALIZED_NAME_COVERED_MONTH7 = "coveredMonth7";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH7)
  private Boolean coveredMonth7;

  public static final String SERIALIZED_NAME_COVERED_MONTH8 = "coveredMonth8";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH8)
  private Boolean coveredMonth8;

  public static final String SERIALIZED_NAME_COVERED_MONTH9 = "coveredMonth9";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH9)
  private Boolean coveredMonth9;

  public static final String SERIALIZED_NAME_COVERED_MONTH10 = "coveredMonth10";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH10)
  private Boolean coveredMonth10;

  public static final String SERIALIZED_NAME_COVERED_MONTH11 = "coveredMonth11";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH11)
  private Boolean coveredMonth11;

  public static final String SERIALIZED_NAME_COVERED_MONTH12 = "coveredMonth12";
  @SerializedName(SERIALIZED_NAME_COVERED_MONTH12)
  private Boolean coveredMonth12;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public CoveredIndividualReference() {
  }

  public CoveredIndividualReference firstName(String firstName) {
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


  public CoveredIndividualReference middleName(String middleName) {
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


  public CoveredIndividualReference lastName(String lastName) {
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


  public CoveredIndividualReference nameSuffix(String nameSuffix) {
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


  public CoveredIndividualReference tin(String tin) {
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


  public CoveredIndividualReference birthDate(OffsetDateTime birthDate) {
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


  public CoveredIndividualReference coveredMonth0(Boolean coveredMonth0) {
    this.coveredMonth0 = coveredMonth0;
    return this;
  }

  /**
   * Get coveredMonth0
   * @return coveredMonth0
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth0() {
    return coveredMonth0;
  }

  public void setCoveredMonth0(Boolean coveredMonth0) {
    this.coveredMonth0 = coveredMonth0;
  }


  public CoveredIndividualReference coveredMonth1(Boolean coveredMonth1) {
    this.coveredMonth1 = coveredMonth1;
    return this;
  }

  /**
   * Get coveredMonth1
   * @return coveredMonth1
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth1() {
    return coveredMonth1;
  }

  public void setCoveredMonth1(Boolean coveredMonth1) {
    this.coveredMonth1 = coveredMonth1;
  }


  public CoveredIndividualReference coveredMonth2(Boolean coveredMonth2) {
    this.coveredMonth2 = coveredMonth2;
    return this;
  }

  /**
   * Get coveredMonth2
   * @return coveredMonth2
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth2() {
    return coveredMonth2;
  }

  public void setCoveredMonth2(Boolean coveredMonth2) {
    this.coveredMonth2 = coveredMonth2;
  }


  public CoveredIndividualReference coveredMonth3(Boolean coveredMonth3) {
    this.coveredMonth3 = coveredMonth3;
    return this;
  }

  /**
   * Get coveredMonth3
   * @return coveredMonth3
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth3() {
    return coveredMonth3;
  }

  public void setCoveredMonth3(Boolean coveredMonth3) {
    this.coveredMonth3 = coveredMonth3;
  }


  public CoveredIndividualReference coveredMonth4(Boolean coveredMonth4) {
    this.coveredMonth4 = coveredMonth4;
    return this;
  }

  /**
   * Get coveredMonth4
   * @return coveredMonth4
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth4() {
    return coveredMonth4;
  }

  public void setCoveredMonth4(Boolean coveredMonth4) {
    this.coveredMonth4 = coveredMonth4;
  }


  public CoveredIndividualReference coveredMonth5(Boolean coveredMonth5) {
    this.coveredMonth5 = coveredMonth5;
    return this;
  }

  /**
   * Get coveredMonth5
   * @return coveredMonth5
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth5() {
    return coveredMonth5;
  }

  public void setCoveredMonth5(Boolean coveredMonth5) {
    this.coveredMonth5 = coveredMonth5;
  }


  public CoveredIndividualReference coveredMonth6(Boolean coveredMonth6) {
    this.coveredMonth6 = coveredMonth6;
    return this;
  }

  /**
   * Get coveredMonth6
   * @return coveredMonth6
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth6() {
    return coveredMonth6;
  }

  public void setCoveredMonth6(Boolean coveredMonth6) {
    this.coveredMonth6 = coveredMonth6;
  }


  public CoveredIndividualReference coveredMonth7(Boolean coveredMonth7) {
    this.coveredMonth7 = coveredMonth7;
    return this;
  }

  /**
   * Get coveredMonth7
   * @return coveredMonth7
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth7() {
    return coveredMonth7;
  }

  public void setCoveredMonth7(Boolean coveredMonth7) {
    this.coveredMonth7 = coveredMonth7;
  }


  public CoveredIndividualReference coveredMonth8(Boolean coveredMonth8) {
    this.coveredMonth8 = coveredMonth8;
    return this;
  }

  /**
   * Get coveredMonth8
   * @return coveredMonth8
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth8() {
    return coveredMonth8;
  }

  public void setCoveredMonth8(Boolean coveredMonth8) {
    this.coveredMonth8 = coveredMonth8;
  }


  public CoveredIndividualReference coveredMonth9(Boolean coveredMonth9) {
    this.coveredMonth9 = coveredMonth9;
    return this;
  }

  /**
   * Get coveredMonth9
   * @return coveredMonth9
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth9() {
    return coveredMonth9;
  }

  public void setCoveredMonth9(Boolean coveredMonth9) {
    this.coveredMonth9 = coveredMonth9;
  }


  public CoveredIndividualReference coveredMonth10(Boolean coveredMonth10) {
    this.coveredMonth10 = coveredMonth10;
    return this;
  }

  /**
   * Get coveredMonth10
   * @return coveredMonth10
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth10() {
    return coveredMonth10;
  }

  public void setCoveredMonth10(Boolean coveredMonth10) {
    this.coveredMonth10 = coveredMonth10;
  }


  public CoveredIndividualReference coveredMonth11(Boolean coveredMonth11) {
    this.coveredMonth11 = coveredMonth11;
    return this;
  }

  /**
   * Get coveredMonth11
   * @return coveredMonth11
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth11() {
    return coveredMonth11;
  }

  public void setCoveredMonth11(Boolean coveredMonth11) {
    this.coveredMonth11 = coveredMonth11;
  }


  public CoveredIndividualReference coveredMonth12(Boolean coveredMonth12) {
    this.coveredMonth12 = coveredMonth12;
    return this;
  }

  /**
   * Get coveredMonth12
   * @return coveredMonth12
   */
  @javax.annotation.Nullable
  public Boolean getCoveredMonth12() {
    return coveredMonth12;
  }

  public void setCoveredMonth12(Boolean coveredMonth12) {
    this.coveredMonth12 = coveredMonth12;
  }


  public CoveredIndividualReference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CoveredIndividualReference type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoveredIndividualReference coveredIndividualReference = (CoveredIndividualReference) o;
    return Objects.equals(this.firstName, coveredIndividualReference.firstName) &&
        Objects.equals(this.middleName, coveredIndividualReference.middleName) &&
        Objects.equals(this.lastName, coveredIndividualReference.lastName) &&
        Objects.equals(this.nameSuffix, coveredIndividualReference.nameSuffix) &&
        Objects.equals(this.tin, coveredIndividualReference.tin) &&
        Objects.equals(this.birthDate, coveredIndividualReference.birthDate) &&
        Objects.equals(this.coveredMonth0, coveredIndividualReference.coveredMonth0) &&
        Objects.equals(this.coveredMonth1, coveredIndividualReference.coveredMonth1) &&
        Objects.equals(this.coveredMonth2, coveredIndividualReference.coveredMonth2) &&
        Objects.equals(this.coveredMonth3, coveredIndividualReference.coveredMonth3) &&
        Objects.equals(this.coveredMonth4, coveredIndividualReference.coveredMonth4) &&
        Objects.equals(this.coveredMonth5, coveredIndividualReference.coveredMonth5) &&
        Objects.equals(this.coveredMonth6, coveredIndividualReference.coveredMonth6) &&
        Objects.equals(this.coveredMonth7, coveredIndividualReference.coveredMonth7) &&
        Objects.equals(this.coveredMonth8, coveredIndividualReference.coveredMonth8) &&
        Objects.equals(this.coveredMonth9, coveredIndividualReference.coveredMonth9) &&
        Objects.equals(this.coveredMonth10, coveredIndividualReference.coveredMonth10) &&
        Objects.equals(this.coveredMonth11, coveredIndividualReference.coveredMonth11) &&
        Objects.equals(this.coveredMonth12, coveredIndividualReference.coveredMonth12) &&
        Objects.equals(this.id, coveredIndividualReference.id) &&
        Objects.equals(this.type, coveredIndividualReference.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, nameSuffix, tin, birthDate, coveredMonth0, coveredMonth1, coveredMonth2, coveredMonth3, coveredMonth4, coveredMonth5, coveredMonth6, coveredMonth7, coveredMonth8, coveredMonth9, coveredMonth10, coveredMonth11, coveredMonth12, id, type);
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
    sb.append("class CoveredIndividualReference {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    coveredMonth0: ").append(toIndentedString(coveredMonth0)).append("\n");
    sb.append("    coveredMonth1: ").append(toIndentedString(coveredMonth1)).append("\n");
    sb.append("    coveredMonth2: ").append(toIndentedString(coveredMonth2)).append("\n");
    sb.append("    coveredMonth3: ").append(toIndentedString(coveredMonth3)).append("\n");
    sb.append("    coveredMonth4: ").append(toIndentedString(coveredMonth4)).append("\n");
    sb.append("    coveredMonth5: ").append(toIndentedString(coveredMonth5)).append("\n");
    sb.append("    coveredMonth6: ").append(toIndentedString(coveredMonth6)).append("\n");
    sb.append("    coveredMonth7: ").append(toIndentedString(coveredMonth7)).append("\n");
    sb.append("    coveredMonth8: ").append(toIndentedString(coveredMonth8)).append("\n");
    sb.append("    coveredMonth9: ").append(toIndentedString(coveredMonth9)).append("\n");
    sb.append("    coveredMonth10: ").append(toIndentedString(coveredMonth10)).append("\n");
    sb.append("    coveredMonth11: ").append(toIndentedString(coveredMonth11)).append("\n");
    sb.append("    coveredMonth12: ").append(toIndentedString(coveredMonth12)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CoveredIndividualReference
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CoveredIndividualReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoveredIndividualReference is not found in the empty JSON string", CoveredIndividualReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CoveredIndividualReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoveredIndividualReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoveredIndividualReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoveredIndividualReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoveredIndividualReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoveredIndividualReference.class));

       return (TypeAdapter<T>) new TypeAdapter<CoveredIndividualReference>() {
           @Override
           public void write(JsonWriter out, CoveredIndividualReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoveredIndividualReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CoveredIndividualReference given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CoveredIndividualReference
   * @throws IOException if the JSON string is invalid with respect to CoveredIndividualReference
   */
  public static CoveredIndividualReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoveredIndividualReference.class);
  }

  /**
   * Convert an instance of CoveredIndividualReference to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

