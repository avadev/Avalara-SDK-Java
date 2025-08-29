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
import Avalara.SDK.model.A1099.V2.EntryStatusResponse;
import Avalara.SDK.model.A1099.V2.W9FormBaseResponse;
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
 * W4FormResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class W4FormResponse extends W9FormBaseResponse {
  public static final String SERIALIZED_NAME_EMPLOYEE_FIRST_NAME = "employeeFirstName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_FIRST_NAME)
  private String employeeFirstName;

  public static final String SERIALIZED_NAME_EMPLOYEE_MIDDLE_NAME = "employeeMiddleName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_MIDDLE_NAME)
  private String employeeMiddleName;

  public static final String SERIALIZED_NAME_EMPLOYEE_LAST_NAME = "employeeLastName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_LAST_NAME)
  private String employeeLastName;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME_SUFFIX = "employeeNameSuffix";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME_SUFFIX)
  private String employeeNameSuffix;

  public static final String SERIALIZED_NAME_TIN_TYPE = "tinType";
  @SerializedName(SERIALIZED_NAME_TIN_TYPE)
  private String tinType;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

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

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "maritalStatus";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private String maritalStatus;

  public static final String SERIALIZED_NAME_LAST_NAME_DIFFERS = "lastNameDiffers";
  @SerializedName(SERIALIZED_NAME_LAST_NAME_DIFFERS)
  private Boolean lastNameDiffers;

  public static final String SERIALIZED_NAME_NUM_ALLOWANCES = "numAllowances";
  @SerializedName(SERIALIZED_NAME_NUM_ALLOWANCES)
  private Integer numAllowances;

  public static final String SERIALIZED_NAME_OTHER_DEPENDENTS = "otherDependents";
  @SerializedName(SERIALIZED_NAME_OTHER_DEPENDENTS)
  private Integer otherDependents;

  public static final String SERIALIZED_NAME_NON_JOB_INCOME = "nonJobIncome";
  @SerializedName(SERIALIZED_NAME_NON_JOB_INCOME)
  private Float nonJobIncome;

  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private Float deductions;

  public static final String SERIALIZED_NAME_ADDITIONAL_WITHHELD = "additionalWithheld";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_WITHHELD)
  private Float additionalWithheld;

  public static final String SERIALIZED_NAME_EXEMPT_FROM_WITHHOLDING = "exemptFromWithholding";
  @SerializedName(SERIALIZED_NAME_EXEMPT_FROM_WITHHOLDING)
  private Boolean exemptFromWithholding;

  public static final String SERIALIZED_NAME_OFFICE_CODE = "officeCode";
  @SerializedName(SERIALIZED_NAME_OFFICE_CODE)
  private String officeCode;

  public W4FormResponse() {
    this.type = this.getClass().getSimpleName();
  }

  public W4FormResponse employeeFirstName(String employeeFirstName) {
    this.employeeFirstName = employeeFirstName;
    return this;
  }

  /**
   * The first name of the employee.
   * @return employeeFirstName
   */
  @javax.annotation.Nullable
  public String getEmployeeFirstName() {
    return employeeFirstName;
  }

  public void setEmployeeFirstName(String employeeFirstName) {
    this.employeeFirstName = employeeFirstName;
  }


  public W4FormResponse employeeMiddleName(String employeeMiddleName) {
    this.employeeMiddleName = employeeMiddleName;
    return this;
  }

  /**
   * The middle name of the employee.
   * @return employeeMiddleName
   */
  @javax.annotation.Nullable
  public String getEmployeeMiddleName() {
    return employeeMiddleName;
  }

  public void setEmployeeMiddleName(String employeeMiddleName) {
    this.employeeMiddleName = employeeMiddleName;
  }


  public W4FormResponse employeeLastName(String employeeLastName) {
    this.employeeLastName = employeeLastName;
    return this;
  }

  /**
   * The last name of the employee.
   * @return employeeLastName
   */
  @javax.annotation.Nullable
  public String getEmployeeLastName() {
    return employeeLastName;
  }

  public void setEmployeeLastName(String employeeLastName) {
    this.employeeLastName = employeeLastName;
  }


  public W4FormResponse employeeNameSuffix(String employeeNameSuffix) {
    this.employeeNameSuffix = employeeNameSuffix;
    return this;
  }

  /**
   * The name suffix of the employee.
   * @return employeeNameSuffix
   */
  @javax.annotation.Nullable
  public String getEmployeeNameSuffix() {
    return employeeNameSuffix;
  }

  public void setEmployeeNameSuffix(String employeeNameSuffix) {
    this.employeeNameSuffix = employeeNameSuffix;
  }


  public W4FormResponse tinType(String tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * The type of TIN provided.
   * @return tinType
   */
  @javax.annotation.Nullable
  public String getTinType() {
    return tinType;
  }

  public void setTinType(String tinType) {
    this.tinType = tinType;
  }


  public W4FormResponse tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * The taxpayer identification number (TIN).
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public W4FormResponse address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The address of the employee.
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public W4FormResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city of residence of the employee.
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public W4FormResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state of residence of the employee.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public W4FormResponse zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * The ZIP code of residence of the employee.
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  public W4FormResponse maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * The marital status of the employee.
   * @return maritalStatus
   */
  @javax.annotation.Nullable
  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  public W4FormResponse lastNameDiffers(Boolean lastNameDiffers) {
    this.lastNameDiffers = lastNameDiffers;
    return this;
  }

  /**
   * Indicates whether the last name differs from prior records.
   * @return lastNameDiffers
   */
  @javax.annotation.Nullable
  public Boolean getLastNameDiffers() {
    return lastNameDiffers;
  }

  public void setLastNameDiffers(Boolean lastNameDiffers) {
    this.lastNameDiffers = lastNameDiffers;
  }


  public W4FormResponse numAllowances(Integer numAllowances) {
    this.numAllowances = numAllowances;
    return this;
  }

  /**
   * The number of allowances claimed by the employee.
   * @return numAllowances
   */
  @javax.annotation.Nullable
  public Integer getNumAllowances() {
    return numAllowances;
  }

  public void setNumAllowances(Integer numAllowances) {
    this.numAllowances = numAllowances;
  }


  public W4FormResponse otherDependents(Integer otherDependents) {
    this.otherDependents = otherDependents;
    return this;
  }

  /**
   * The number of dependents other than allowances.
   * @return otherDependents
   */
  @javax.annotation.Nullable
  public Integer getOtherDependents() {
    return otherDependents;
  }

  public void setOtherDependents(Integer otherDependents) {
    this.otherDependents = otherDependents;
  }


  public W4FormResponse nonJobIncome(Float nonJobIncome) {
    this.nonJobIncome = nonJobIncome;
    return this;
  }

  /**
   * The amount of non-job income.
   * @return nonJobIncome
   */
  @javax.annotation.Nullable
  public Float getNonJobIncome() {
    return nonJobIncome;
  }

  public void setNonJobIncome(Float nonJobIncome) {
    this.nonJobIncome = nonJobIncome;
  }


  public W4FormResponse deductions(Float deductions) {
    this.deductions = deductions;
    return this;
  }

  /**
   * The amount of deductions claimed.
   * @return deductions
   */
  @javax.annotation.Nullable
  public Float getDeductions() {
    return deductions;
  }

  public void setDeductions(Float deductions) {
    this.deductions = deductions;
  }


  public W4FormResponse additionalWithheld(Float additionalWithheld) {
    this.additionalWithheld = additionalWithheld;
    return this;
  }

  /**
   * The additional amount withheld.
   * @return additionalWithheld
   */
  @javax.annotation.Nullable
  public Float getAdditionalWithheld() {
    return additionalWithheld;
  }

  public void setAdditionalWithheld(Float additionalWithheld) {
    this.additionalWithheld = additionalWithheld;
  }


  public W4FormResponse exemptFromWithholding(Boolean exemptFromWithholding) {
    this.exemptFromWithholding = exemptFromWithholding;
    return this;
  }

  /**
   * Indicates whether the employee is exempt from withholding.
   * @return exemptFromWithholding
   */
  @javax.annotation.Nullable
  public Boolean getExemptFromWithholding() {
    return exemptFromWithholding;
  }

  public void setExemptFromWithholding(Boolean exemptFromWithholding) {
    this.exemptFromWithholding = exemptFromWithholding;
  }


  public W4FormResponse officeCode(String officeCode) {
    this.officeCode = officeCode;
    return this;
  }

  /**
   * The office code associated with the form.
   * @return officeCode
   */
  @javax.annotation.Nullable
  public String getOfficeCode() {
    return officeCode;
  }

  public void setOfficeCode(String officeCode) {
    this.officeCode = officeCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W4FormResponse w4FormResponse = (W4FormResponse) o;
    return Objects.equals(this.employeeFirstName, w4FormResponse.employeeFirstName) &&
        Objects.equals(this.employeeMiddleName, w4FormResponse.employeeMiddleName) &&
        Objects.equals(this.employeeLastName, w4FormResponse.employeeLastName) &&
        Objects.equals(this.employeeNameSuffix, w4FormResponse.employeeNameSuffix) &&
        Objects.equals(this.tinType, w4FormResponse.tinType) &&
        Objects.equals(this.tin, w4FormResponse.tin) &&
        Objects.equals(this.address, w4FormResponse.address) &&
        Objects.equals(this.city, w4FormResponse.city) &&
        Objects.equals(this.state, w4FormResponse.state) &&
        Objects.equals(this.zip, w4FormResponse.zip) &&
        Objects.equals(this.maritalStatus, w4FormResponse.maritalStatus) &&
        Objects.equals(this.lastNameDiffers, w4FormResponse.lastNameDiffers) &&
        Objects.equals(this.numAllowances, w4FormResponse.numAllowances) &&
        Objects.equals(this.otherDependents, w4FormResponse.otherDependents) &&
        Objects.equals(this.nonJobIncome, w4FormResponse.nonJobIncome) &&
        Objects.equals(this.deductions, w4FormResponse.deductions) &&
        Objects.equals(this.additionalWithheld, w4FormResponse.additionalWithheld) &&
        Objects.equals(this.exemptFromWithholding, w4FormResponse.exemptFromWithholding) &&
        Objects.equals(this.officeCode, w4FormResponse.officeCode) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeFirstName, employeeMiddleName, employeeLastName, employeeNameSuffix, tinType, tin, address, city, state, zip, maritalStatus, lastNameDiffers, numAllowances, otherDependents, nonJobIncome, deductions, additionalWithheld, exemptFromWithholding, officeCode, super.hashCode());
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
    sb.append("class W4FormResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    employeeFirstName: ").append(toIndentedString(employeeFirstName)).append("\n");
    sb.append("    employeeMiddleName: ").append(toIndentedString(employeeMiddleName)).append("\n");
    sb.append("    employeeLastName: ").append(toIndentedString(employeeLastName)).append("\n");
    sb.append("    employeeNameSuffix: ").append(toIndentedString(employeeNameSuffix)).append("\n");
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    lastNameDiffers: ").append(toIndentedString(lastNameDiffers)).append("\n");
    sb.append("    numAllowances: ").append(toIndentedString(numAllowances)).append("\n");
    sb.append("    otherDependents: ").append(toIndentedString(otherDependents)).append("\n");
    sb.append("    nonJobIncome: ").append(toIndentedString(nonJobIncome)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    additionalWithheld: ").append(toIndentedString(additionalWithheld)).append("\n");
    sb.append("    exemptFromWithholding: ").append(toIndentedString(exemptFromWithholding)).append("\n");
    sb.append("    officeCode: ").append(toIndentedString(officeCode)).append("\n");
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
    openapiFields.add("entryStatus");
    openapiFields.add("referenceId");
    openapiFields.add("companyId");
    openapiFields.add("displayName");
    openapiFields.add("email");
    openapiFields.add("archived");
    openapiFields.add("ancestorId");
    openapiFields.add("signature");
    openapiFields.add("signedDate");
    openapiFields.add("eDeliveryConsentedAt");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to W4FormResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!W4FormResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in W4FormResponse is not found in the empty JSON string", W4FormResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!W4FormResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `W4FormResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W4FormResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W4FormResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W4FormResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W4FormResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<W4FormResponse>() {
           @Override
           public void write(JsonWriter out, W4FormResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public W4FormResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of W4FormResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of W4FormResponse
   * @throws IOException if the JSON string is invalid with respect to W4FormResponse
   */
  public static W4FormResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W4FormResponse.class);
  }

  /**
   * Convert an instance of W4FormResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

