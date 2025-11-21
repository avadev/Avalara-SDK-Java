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
 * IssuerBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class IssuerBase {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DBA_NAME = "dbaName";
  @SerializedName(SERIALIZED_NAME_DBA_NAME)
  private String dbaName;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_TAX_YEAR = "taxYear";
  @SerializedName(SERIALIZED_NAME_TAX_YEAR)
  private Integer taxYear;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

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

  public static final String SERIALIZED_NAME_FOREIGN_PROVINCE = "foreignProvince";
  @SerializedName(SERIALIZED_NAME_FOREIGN_PROVINCE)
  private String foreignProvince;

  public static final String SERIALIZED_NAME_TRANSFER_AGENT_NAME = "transferAgentName";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AGENT_NAME)
  private String transferAgentName;

  public static final String SERIALIZED_NAME_LAST_FILING = "lastFiling";
  @SerializedName(SERIALIZED_NAME_LAST_FILING)
  private Boolean lastFiling;

  public IssuerBase() {
  }

  public IssuerBase name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Legal name. Not the DBA name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public IssuerBase dbaName(String dbaName) {
    this.dbaName = dbaName;
    return this;
  }

  /**
   * Doing Business As (DBA) name or continuation of a long legal name. Use either this or &#39;transferAgentName&#39;.
   * @return dbaName
   */
  @javax.annotation.Nullable
  public String getDbaName() {
    return dbaName;
  }

  public void setDbaName(String dbaName) {
    this.dbaName = dbaName;
  }


  public IssuerBase tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * Federal Tax Identification Number (TIN).
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public IssuerBase referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Internal reference ID. Never shown to any agency or recipient. If present, it will prefix download filenames. Allowed characters: letters, numbers, dashes, underscores, and spaces.
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public IssuerBase telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Contact phone number (must contain at least 10 digits, max 15 characters). For recipient inquiries.
   * @return telephone
   */
  @javax.annotation.Nullable
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public IssuerBase taxYear(Integer taxYear) {
    this.taxYear = taxYear;
    return this;
  }

  /**
   * Tax year for which the forms are being filed (e.g., 2024). Must be within current tax year and current tax year - 4. It&#39;s only required on creation, and cannot be modified on update.
   * @return taxYear
   */
  @javax.annotation.Nullable
  public Integer getTaxYear() {
    return taxYear;
  }

  public void setTaxYear(Integer taxYear) {
    this.taxYear = taxYear;
  }


  public IssuerBase countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Two-letter IRS country code (e.g., &#39;US&#39;, &#39;CA&#39;), as defined at https://www.irs.gov/e-file-providers/country-codes. If there is a transfer agent, use the transfer agent&#39;s shipping address.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public IssuerBase email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Contact email address. For recipient inquiries. Phone will be used on communications if you don&#39;t specify an email
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public IssuerBase address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address.
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public IssuerBase city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City.
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public IssuerBase state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Two-letter US state or Canadian province code (required for US/CA addresses).
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public IssuerBase zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * ZIP/postal code.
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  public IssuerBase foreignProvince(String foreignProvince) {
    this.foreignProvince = foreignProvince;
    return this;
  }

  /**
   * Province or region for non-US/CA addresses.
   * @return foreignProvince
   */
  @javax.annotation.Nullable
  public String getForeignProvince() {
    return foreignProvince;
  }

  public void setForeignProvince(String foreignProvince) {
    this.foreignProvince = foreignProvince;
  }


  public IssuerBase transferAgentName(String transferAgentName) {
    this.transferAgentName = transferAgentName;
    return this;
  }

  /**
   * Name of the transfer agent, if applicable — optional; use either this or &#39;dbaName&#39;.
   * @return transferAgentName
   */
  @javax.annotation.Nullable
  public String getTransferAgentName() {
    return transferAgentName;
  }

  public void setTransferAgentName(String transferAgentName) {
    this.transferAgentName = transferAgentName;
  }


  public IssuerBase lastFiling(Boolean lastFiling) {
    this.lastFiling = lastFiling;
    return this;
  }

  /**
   * Indicates if this is the issuer&#39;s final year filing.
   * @return lastFiling
   */
  @javax.annotation.Nullable
  public Boolean getLastFiling() {
    return lastFiling;
  }

  public void setLastFiling(Boolean lastFiling) {
    this.lastFiling = lastFiling;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuerBase issuerBase = (IssuerBase) o;
    return Objects.equals(this.name, issuerBase.name) &&
        Objects.equals(this.dbaName, issuerBase.dbaName) &&
        Objects.equals(this.tin, issuerBase.tin) &&
        Objects.equals(this.referenceId, issuerBase.referenceId) &&
        Objects.equals(this.telephone, issuerBase.telephone) &&
        Objects.equals(this.taxYear, issuerBase.taxYear) &&
        Objects.equals(this.countryCode, issuerBase.countryCode) &&
        Objects.equals(this.email, issuerBase.email) &&
        Objects.equals(this.address, issuerBase.address) &&
        Objects.equals(this.city, issuerBase.city) &&
        Objects.equals(this.state, issuerBase.state) &&
        Objects.equals(this.zip, issuerBase.zip) &&
        Objects.equals(this.foreignProvince, issuerBase.foreignProvince) &&
        Objects.equals(this.transferAgentName, issuerBase.transferAgentName) &&
        Objects.equals(this.lastFiling, issuerBase.lastFiling);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dbaName, tin, referenceId, telephone, taxYear, countryCode, email, address, city, state, zip, foreignProvince, transferAgentName, lastFiling);
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
    sb.append("class IssuerBase {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dbaName: ").append(toIndentedString(dbaName)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    foreignProvince: ").append(toIndentedString(foreignProvince)).append("\n");
    sb.append("    transferAgentName: ").append(toIndentedString(transferAgentName)).append("\n");
    sb.append("    lastFiling: ").append(toIndentedString(lastFiling)).append("\n");
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
    openapiFields.add("dbaName");
    openapiFields.add("tin");
    openapiFields.add("referenceId");
    openapiFields.add("telephone");
    openapiFields.add("taxYear");
    openapiFields.add("countryCode");
    openapiFields.add("email");
    openapiFields.add("address");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("foreignProvince");
    openapiFields.add("transferAgentName");
    openapiFields.add("lastFiling");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("telephone");
    openapiRequiredFields.add("taxYear");
    openapiRequiredFields.add("countryCode");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("zip");
    openapiRequiredFields.add("lastFiling");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssuerBase
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssuerBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssuerBase is not found in the empty JSON string", IssuerBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssuerBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssuerBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssuerBase.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("dbaName") != null && !jsonObj.get("dbaName").isJsonNull()) && !jsonObj.get("dbaName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dbaName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dbaName").toString()));
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("telephone") != null && !jsonObj.get("telephone").isJsonNull()) && !jsonObj.get("telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephone").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
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
      if ((jsonObj.get("foreignProvince") != null && !jsonObj.get("foreignProvince").isJsonNull()) && !jsonObj.get("foreignProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignProvince").toString()));
      }
      if ((jsonObj.get("transferAgentName") != null && !jsonObj.get("transferAgentName").isJsonNull()) && !jsonObj.get("transferAgentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferAgentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferAgentName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssuerBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssuerBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssuerBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssuerBase.class));

       return (TypeAdapter<T>) new TypeAdapter<IssuerBase>() {
           @Override
           public void write(JsonWriter out, IssuerBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssuerBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IssuerBase given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssuerBase
   * @throws IOException if the JSON string is invalid with respect to IssuerBase
   */
  public static IssuerBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuerBase.class);
  }

  /**
   * Convert an instance of IssuerBase to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

