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
 * CompanyCreateUpdateRequestModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CompanyCreateUpdateRequestModel {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

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

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_DBA_NAME = "dbaName";
  @SerializedName(SERIALIZED_NAME_DBA_NAME)
  private String dbaName;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_DO_TIN_MATCH = "doTinMatch";
  @SerializedName(SERIALIZED_NAME_DO_TIN_MATCH)
  private Boolean doTinMatch;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_FOREIGN_PROVINCE = "foreignProvince";
  @SerializedName(SERIALIZED_NAME_FOREIGN_PROVINCE)
  private String foreignProvince;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_RESEND_REQUESTS = "resendRequests";
  @SerializedName(SERIALIZED_NAME_RESEND_REQUESTS)
  private Boolean resendRequests;

  public static final String SERIALIZED_NAME_RESEND_INTERVAL_DAYS = "resendIntervalDays";
  @SerializedName(SERIALIZED_NAME_RESEND_INTERVAL_DAYS)
  private Integer resendIntervalDays;

  public static final String SERIALIZED_NAME_MAX_REMINDER_ATTEMPTS = "maxReminderAttempts";
  @SerializedName(SERIALIZED_NAME_MAX_REMINDER_ATTEMPTS)
  private Integer maxReminderAttempts;

  public CompanyCreateUpdateRequestModel() {
  }

  public CompanyCreateUpdateRequestModel name(String name) {
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


  public CompanyCreateUpdateRequestModel email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public CompanyCreateUpdateRequestModel address(String address) {
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


  public CompanyCreateUpdateRequestModel city(String city) {
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


  public CompanyCreateUpdateRequestModel state(String state) {
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


  public CompanyCreateUpdateRequestModel zip(String zip) {
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


  public CompanyCreateUpdateRequestModel telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Get telephone
   * @return telephone
   */
  @javax.annotation.Nullable
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public CompanyCreateUpdateRequestModel tin(String tin) {
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


  public CompanyCreateUpdateRequestModel dbaName(String dbaName) {
    this.dbaName = dbaName;
    return this;
  }

  /**
   * Get dbaName
   * @return dbaName
   */
  @javax.annotation.Nullable
  public String getDbaName() {
    return dbaName;
  }

  public void setDbaName(String dbaName) {
    this.dbaName = dbaName;
  }


  public CompanyCreateUpdateRequestModel referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public CompanyCreateUpdateRequestModel doTinMatch(Boolean doTinMatch) {
    this.doTinMatch = doTinMatch;
    return this;
  }

  /**
   * Get doTinMatch
   * @return doTinMatch
   */
  @javax.annotation.Nullable
  public Boolean getDoTinMatch() {
    return doTinMatch;
  }

  public void setDoTinMatch(Boolean doTinMatch) {
    this.doTinMatch = doTinMatch;
  }


  public CompanyCreateUpdateRequestModel groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
   */
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public CompanyCreateUpdateRequestModel foreignProvince(String foreignProvince) {
    this.foreignProvince = foreignProvince;
    return this;
  }

  /**
   * Get foreignProvince
   * @return foreignProvince
   */
  @javax.annotation.Nullable
  public String getForeignProvince() {
    return foreignProvince;
  }

  public void setForeignProvince(String foreignProvince) {
    this.foreignProvince = foreignProvince;
  }


  public CompanyCreateUpdateRequestModel countryCode(String countryCode) {
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


  public CompanyCreateUpdateRequestModel resendRequests(Boolean resendRequests) {
    this.resendRequests = resendRequests;
    return this;
  }

  /**
   * Get resendRequests
   * @return resendRequests
   */
  @javax.annotation.Nullable
  public Boolean getResendRequests() {
    return resendRequests;
  }

  public void setResendRequests(Boolean resendRequests) {
    this.resendRequests = resendRequests;
  }


  public CompanyCreateUpdateRequestModel resendIntervalDays(Integer resendIntervalDays) {
    this.resendIntervalDays = resendIntervalDays;
    return this;
  }

  /**
   * Get resendIntervalDays
   * @return resendIntervalDays
   */
  @javax.annotation.Nullable
  public Integer getResendIntervalDays() {
    return resendIntervalDays;
  }

  public void setResendIntervalDays(Integer resendIntervalDays) {
    this.resendIntervalDays = resendIntervalDays;
  }


  public CompanyCreateUpdateRequestModel maxReminderAttempts(Integer maxReminderAttempts) {
    this.maxReminderAttempts = maxReminderAttempts;
    return this;
  }

  /**
   * Get maxReminderAttempts
   * @return maxReminderAttempts
   */
  @javax.annotation.Nullable
  public Integer getMaxReminderAttempts() {
    return maxReminderAttempts;
  }

  public void setMaxReminderAttempts(Integer maxReminderAttempts) {
    this.maxReminderAttempts = maxReminderAttempts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyCreateUpdateRequestModel companyCreateUpdateRequestModel = (CompanyCreateUpdateRequestModel) o;
    return Objects.equals(this.name, companyCreateUpdateRequestModel.name) &&
        Objects.equals(this.email, companyCreateUpdateRequestModel.email) &&
        Objects.equals(this.address, companyCreateUpdateRequestModel.address) &&
        Objects.equals(this.city, companyCreateUpdateRequestModel.city) &&
        Objects.equals(this.state, companyCreateUpdateRequestModel.state) &&
        Objects.equals(this.zip, companyCreateUpdateRequestModel.zip) &&
        Objects.equals(this.telephone, companyCreateUpdateRequestModel.telephone) &&
        Objects.equals(this.tin, companyCreateUpdateRequestModel.tin) &&
        Objects.equals(this.dbaName, companyCreateUpdateRequestModel.dbaName) &&
        Objects.equals(this.referenceId, companyCreateUpdateRequestModel.referenceId) &&
        Objects.equals(this.doTinMatch, companyCreateUpdateRequestModel.doTinMatch) &&
        Objects.equals(this.groupName, companyCreateUpdateRequestModel.groupName) &&
        Objects.equals(this.foreignProvince, companyCreateUpdateRequestModel.foreignProvince) &&
        Objects.equals(this.countryCode, companyCreateUpdateRequestModel.countryCode) &&
        Objects.equals(this.resendRequests, companyCreateUpdateRequestModel.resendRequests) &&
        Objects.equals(this.resendIntervalDays, companyCreateUpdateRequestModel.resendIntervalDays) &&
        Objects.equals(this.maxReminderAttempts, companyCreateUpdateRequestModel.maxReminderAttempts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, address, city, state, zip, telephone, tin, dbaName, referenceId, doTinMatch, groupName, foreignProvince, countryCode, resendRequests, resendIntervalDays, maxReminderAttempts);
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
    sb.append("class CompanyCreateUpdateRequestModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    dbaName: ").append(toIndentedString(dbaName)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    doTinMatch: ").append(toIndentedString(doTinMatch)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    foreignProvince: ").append(toIndentedString(foreignProvince)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    resendRequests: ").append(toIndentedString(resendRequests)).append("\n");
    sb.append("    resendIntervalDays: ").append(toIndentedString(resendIntervalDays)).append("\n");
    sb.append("    maxReminderAttempts: ").append(toIndentedString(maxReminderAttempts)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("address");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("telephone");
    openapiFields.add("tin");
    openapiFields.add("dbaName");
    openapiFields.add("referenceId");
    openapiFields.add("doTinMatch");
    openapiFields.add("groupName");
    openapiFields.add("foreignProvince");
    openapiFields.add("countryCode");
    openapiFields.add("resendRequests");
    openapiFields.add("resendIntervalDays");
    openapiFields.add("maxReminderAttempts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CompanyCreateUpdateRequestModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CompanyCreateUpdateRequestModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompanyCreateUpdateRequestModel is not found in the empty JSON string", CompanyCreateUpdateRequestModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CompanyCreateUpdateRequestModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompanyCreateUpdateRequestModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
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
      if ((jsonObj.get("telephone") != null && !jsonObj.get("telephone").isJsonNull()) && !jsonObj.get("telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephone").toString()));
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("dbaName") != null && !jsonObj.get("dbaName").isJsonNull()) && !jsonObj.get("dbaName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbaName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbaName").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("groupName") != null && !jsonObj.get("groupName").isJsonNull()) && !jsonObj.get("groupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupName").toString()));
      }
      if ((jsonObj.get("foreignProvince") != null && !jsonObj.get("foreignProvince").isJsonNull()) && !jsonObj.get("foreignProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignProvince").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompanyCreateUpdateRequestModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompanyCreateUpdateRequestModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompanyCreateUpdateRequestModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompanyCreateUpdateRequestModel.class));

       return (TypeAdapter<T>) new TypeAdapter<CompanyCreateUpdateRequestModel>() {
           @Override
           public void write(JsonWriter out, CompanyCreateUpdateRequestModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompanyCreateUpdateRequestModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CompanyCreateUpdateRequestModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompanyCreateUpdateRequestModel
   * @throws IOException if the JSON string is invalid with respect to CompanyCreateUpdateRequestModel
   */
  public static CompanyCreateUpdateRequestModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompanyCreateUpdateRequestModel.class);
  }

  /**
   * Convert an instance of CompanyCreateUpdateRequestModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

