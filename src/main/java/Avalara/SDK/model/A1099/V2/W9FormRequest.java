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
 * W9FormRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class W9FormRequest {
  /**
   * The form type (always \&quot;w9\&quot; for this model).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    W4("W4"),
    
    W8_BEN("W8Ben"),
    
    W8_BEN_E("W8BenE"),
    
    W8_IMY("W8Imy"),
    
    W9("W9");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "businessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_BUSINESS_CLASSIFICATION = "businessClassification";
  @SerializedName(SERIALIZED_NAME_BUSINESS_CLASSIFICATION)
  private String businessClassification;

  public static final String SERIALIZED_NAME_BUSINESS_OTHER = "businessOther";
  @SerializedName(SERIALIZED_NAME_BUSINESS_OTHER)
  private String businessOther;

  public static final String SERIALIZED_NAME_FOREIGN_PARTNER_OWNER_OR_BENEFICIARY = "foreignPartnerOwnerOrBeneficiary";
  @SerializedName(SERIALIZED_NAME_FOREIGN_PARTNER_OWNER_OR_BENEFICIARY)
  private Boolean foreignPartnerOwnerOrBeneficiary;

  public static final String SERIALIZED_NAME_EXEMPT_PAYEE_CODE = "exemptPayeeCode";
  @SerializedName(SERIALIZED_NAME_EXEMPT_PAYEE_CODE)
  private String exemptPayeeCode;

  public static final String SERIALIZED_NAME_EXEMPT_FATCA_CODE = "exemptFatcaCode";
  @SerializedName(SERIALIZED_NAME_EXEMPT_FATCA_CODE)
  private String exemptFatcaCode;

  public static final String SERIALIZED_NAME_FOREIGN_COUNTRY_INDICATOR = "foreignCountryIndicator";
  @SerializedName(SERIALIZED_NAME_FOREIGN_COUNTRY_INDICATOR)
  private Boolean foreignCountryIndicator;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_FOREIGN_ADDRESS = "foreignAddress";
  @SerializedName(SERIALIZED_NAME_FOREIGN_ADDRESS)
  private String foreignAddress;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_TIN_TYPE = "tinType";
  @SerializedName(SERIALIZED_NAME_TIN_TYPE)
  private String tinType;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_BACKUP_WITHHOLDING = "backupWithholding";
  @SerializedName(SERIALIZED_NAME_BACKUP_WITHHOLDING)
  private Boolean backupWithholding;

  public static final String SERIALIZED_NAME_IS1099ABLE = "is1099able";
  @SerializedName(SERIALIZED_NAME_IS1099ABLE)
  private Boolean is1099able;

  public static final String SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT = "eDeliveryConsentedAt";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT)
  private OffsetDateTime eDeliveryConsentedAt;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public W9FormRequest() {
  }

  public W9FormRequest(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  /**
   * The form type (always \&quot;w9\&quot; for this model).
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }



  public W9FormRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the individual or entity associated with the form.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public W9FormRequest businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  /**
   * The name of the business associated with the form.
   * @return businessName
   */
  @javax.annotation.Nullable
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public W9FormRequest businessClassification(String businessClassification) {
    this.businessClassification = businessClassification;
    return this;
  }

  /**
   * The classification of the business.  Available values:  - Individual: Individual/sole proprietor  - C Corporation: C Corporation  - S Corporation: S Corporation  - Partnership: Partnership  - Trust/estate: Trust/estate  - LLC-C: Limited liability company (C Corporation)  - LLC-S: Limited liability company (S Corporation)  - LLC-P: Limited liability company (Partnership)  - Other: Other (requires BusinessOther field to be populated)
   * @return businessClassification
   */
  @javax.annotation.Nonnull
  public String getBusinessClassification() {
    return businessClassification;
  }

  public void setBusinessClassification(String businessClassification) {
    this.businessClassification = businessClassification;
  }


  public W9FormRequest businessOther(String businessOther) {
    this.businessOther = businessOther;
    return this;
  }

  /**
   * The classification description when \&quot;businessClassification\&quot; is \&quot;Other\&quot;.
   * @return businessOther
   */
  @javax.annotation.Nullable
  public String getBusinessOther() {
    return businessOther;
  }

  public void setBusinessOther(String businessOther) {
    this.businessOther = businessOther;
  }


  public W9FormRequest foreignPartnerOwnerOrBeneficiary(Boolean foreignPartnerOwnerOrBeneficiary) {
    this.foreignPartnerOwnerOrBeneficiary = foreignPartnerOwnerOrBeneficiary;
    return this;
  }

  /**
   * Indicates whether the individual is a foreign partner, owner, or beneficiary.
   * @return foreignPartnerOwnerOrBeneficiary
   */
  @javax.annotation.Nullable
  public Boolean getForeignPartnerOwnerOrBeneficiary() {
    return foreignPartnerOwnerOrBeneficiary;
  }

  public void setForeignPartnerOwnerOrBeneficiary(Boolean foreignPartnerOwnerOrBeneficiary) {
    this.foreignPartnerOwnerOrBeneficiary = foreignPartnerOwnerOrBeneficiary;
  }


  public W9FormRequest exemptPayeeCode(String exemptPayeeCode) {
    this.exemptPayeeCode = exemptPayeeCode;
    return this;
  }

  /**
   * The exempt payee code.
   * @return exemptPayeeCode
   */
  @javax.annotation.Nullable
  public String getExemptPayeeCode() {
    return exemptPayeeCode;
  }

  public void setExemptPayeeCode(String exemptPayeeCode) {
    this.exemptPayeeCode = exemptPayeeCode;
  }


  public W9FormRequest exemptFatcaCode(String exemptFatcaCode) {
    this.exemptFatcaCode = exemptFatcaCode;
    return this;
  }

  /**
   * The exemption from FATCA reporting code.
   * @return exemptFatcaCode
   */
  @javax.annotation.Nullable
  public String getExemptFatcaCode() {
    return exemptFatcaCode;
  }

  public void setExemptFatcaCode(String exemptFatcaCode) {
    this.exemptFatcaCode = exemptFatcaCode;
  }


  public W9FormRequest foreignCountryIndicator(Boolean foreignCountryIndicator) {
    this.foreignCountryIndicator = foreignCountryIndicator;
    return this;
  }

  /**
   * Indicates whether the individual or entity is in a foreign country.
   * @return foreignCountryIndicator
   */
  @javax.annotation.Nullable
  public Boolean getForeignCountryIndicator() {
    return foreignCountryIndicator;
  }

  public void setForeignCountryIndicator(Boolean foreignCountryIndicator) {
    this.foreignCountryIndicator = foreignCountryIndicator;
  }


  public W9FormRequest address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The address of the individual or entity.
   * @return address
   */
  @javax.annotation.Nonnull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public W9FormRequest foreignAddress(String foreignAddress) {
    this.foreignAddress = foreignAddress;
    return this;
  }

  /**
   * The foreign address of the individual or entity.
   * @return foreignAddress
   */
  @javax.annotation.Nullable
  public String getForeignAddress() {
    return foreignAddress;
  }

  public void setForeignAddress(String foreignAddress) {
    this.foreignAddress = foreignAddress;
  }


  public W9FormRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city of the address.
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public W9FormRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state of the address.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public W9FormRequest zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * The ZIP code of the address.
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  public W9FormRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number associated with the form.
   * @return accountNumber
   */
  @javax.annotation.Nullable
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public W9FormRequest tinType(String tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * Tax Identification Number (TIN) type. SSN/ITIN (for individuals) and EIN (for businesses).
   * @return tinType
   */
  @javax.annotation.Nonnull
  public String getTinType() {
    return tinType;
  }

  public void setTinType(String tinType) {
    this.tinType = tinType;
  }


  public W9FormRequest tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * The taxpayer identification number (TIN).
   * @return tin
   */
  @javax.annotation.Nonnull
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public W9FormRequest backupWithholding(Boolean backupWithholding) {
    this.backupWithholding = backupWithholding;
    return this;
  }

  /**
   * Indicates whether backup withholding applies.
   * @return backupWithholding
   */
  @javax.annotation.Nullable
  public Boolean getBackupWithholding() {
    return backupWithholding;
  }

  public void setBackupWithholding(Boolean backupWithholding) {
    this.backupWithholding = backupWithholding;
  }


  public W9FormRequest is1099able(Boolean is1099able) {
    this.is1099able = is1099able;
    return this;
  }

  /**
   * Indicates whether the individual or entity should be issued a 1099 form.
   * @return is1099able
   */
  @javax.annotation.Nullable
  public Boolean getIs1099able() {
    return is1099able;
  }

  public void setIs1099able(Boolean is1099able) {
    this.is1099able = is1099able;
  }


  public W9FormRequest eDeliveryConsentedAt(OffsetDateTime eDeliveryConsentedAt) {
    this.eDeliveryConsentedAt = eDeliveryConsentedAt;
    return this;
  }

  /**
   * The date when e-delivery was consented.
   * @return eDeliveryConsentedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime geteDeliveryConsentedAt() {
    return eDeliveryConsentedAt;
  }

  public void seteDeliveryConsentedAt(OffsetDateTime eDeliveryConsentedAt) {
    this.eDeliveryConsentedAt = eDeliveryConsentedAt;
  }


  public W9FormRequest signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * The signature of the form.
   * @return signature
   */
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  public W9FormRequest companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The ID of the associated company. Required when creating a form.
   * @return companyId
   */
  @javax.annotation.Nullable
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public W9FormRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * A reference identifier for the form.
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public W9FormRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the individual associated with the form.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W9FormRequest w9FormRequest = (W9FormRequest) o;
    return Objects.equals(this.type, w9FormRequest.type) &&
        Objects.equals(this.name, w9FormRequest.name) &&
        Objects.equals(this.businessName, w9FormRequest.businessName) &&
        Objects.equals(this.businessClassification, w9FormRequest.businessClassification) &&
        Objects.equals(this.businessOther, w9FormRequest.businessOther) &&
        Objects.equals(this.foreignPartnerOwnerOrBeneficiary, w9FormRequest.foreignPartnerOwnerOrBeneficiary) &&
        Objects.equals(this.exemptPayeeCode, w9FormRequest.exemptPayeeCode) &&
        Objects.equals(this.exemptFatcaCode, w9FormRequest.exemptFatcaCode) &&
        Objects.equals(this.foreignCountryIndicator, w9FormRequest.foreignCountryIndicator) &&
        Objects.equals(this.address, w9FormRequest.address) &&
        Objects.equals(this.foreignAddress, w9FormRequest.foreignAddress) &&
        Objects.equals(this.city, w9FormRequest.city) &&
        Objects.equals(this.state, w9FormRequest.state) &&
        Objects.equals(this.zip, w9FormRequest.zip) &&
        Objects.equals(this.accountNumber, w9FormRequest.accountNumber) &&
        Objects.equals(this.tinType, w9FormRequest.tinType) &&
        Objects.equals(this.tin, w9FormRequest.tin) &&
        Objects.equals(this.backupWithholding, w9FormRequest.backupWithholding) &&
        Objects.equals(this.is1099able, w9FormRequest.is1099able) &&
        Objects.equals(this.eDeliveryConsentedAt, w9FormRequest.eDeliveryConsentedAt) &&
        Objects.equals(this.signature, w9FormRequest.signature) &&
        Objects.equals(this.companyId, w9FormRequest.companyId) &&
        Objects.equals(this.referenceId, w9FormRequest.referenceId) &&
        Objects.equals(this.email, w9FormRequest.email);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, businessName, businessClassification, businessOther, foreignPartnerOwnerOrBeneficiary, exemptPayeeCode, exemptFatcaCode, foreignCountryIndicator, address, foreignAddress, city, state, zip, accountNumber, tinType, tin, backupWithholding, is1099able, eDeliveryConsentedAt, signature, companyId, referenceId, email);
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
    sb.append("class W9FormRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessClassification: ").append(toIndentedString(businessClassification)).append("\n");
    sb.append("    businessOther: ").append(toIndentedString(businessOther)).append("\n");
    sb.append("    foreignPartnerOwnerOrBeneficiary: ").append(toIndentedString(foreignPartnerOwnerOrBeneficiary)).append("\n");
    sb.append("    exemptPayeeCode: ").append(toIndentedString(exemptPayeeCode)).append("\n");
    sb.append("    exemptFatcaCode: ").append(toIndentedString(exemptFatcaCode)).append("\n");
    sb.append("    foreignCountryIndicator: ").append(toIndentedString(foreignCountryIndicator)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    foreignAddress: ").append(toIndentedString(foreignAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    backupWithholding: ").append(toIndentedString(backupWithholding)).append("\n");
    sb.append("    is1099able: ").append(toIndentedString(is1099able)).append("\n");
    sb.append("    eDeliveryConsentedAt: ").append(toIndentedString(eDeliveryConsentedAt)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("eDeliveryConsentedAt");
    openapiFields.add("signature");
    openapiFields.add("type");
    openapiFields.add("companyId");
    openapiFields.add("referenceId");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("businessClassification");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("zip");
    openapiRequiredFields.add("tinType");
    openapiRequiredFields.add("tin");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to W9FormRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!W9FormRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in W9FormRequest is not found in the empty JSON string", W9FormRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!W9FormRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `W9FormRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : W9FormRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("businessName") != null && !jsonObj.get("businessName").isJsonNull()) && !jsonObj.get("businessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessName").toString()));
      }
      if (!jsonObj.get("businessClassification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessClassification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessClassification").toString()));
      }
      if ((jsonObj.get("businessOther") != null && !jsonObj.get("businessOther").isJsonNull()) && !jsonObj.get("businessOther").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessOther` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessOther").toString()));
      }
      if ((jsonObj.get("exemptPayeeCode") != null && !jsonObj.get("exemptPayeeCode").isJsonNull()) && !jsonObj.get("exemptPayeeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptPayeeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptPayeeCode").toString()));
      }
      if ((jsonObj.get("exemptFatcaCode") != null && !jsonObj.get("exemptFatcaCode").isJsonNull()) && !jsonObj.get("exemptFatcaCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptFatcaCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptFatcaCode").toString()));
      }
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("foreignAddress") != null && !jsonObj.get("foreignAddress").isJsonNull()) && !jsonObj.get("foreignAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignAddress").toString()));
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
      if ((jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonNull()) && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if (!jsonObj.get("tinType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinType").toString()));
      }
      if (!jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W9FormRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W9FormRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W9FormRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W9FormRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<W9FormRequest>() {
           @Override
           public void write(JsonWriter out, W9FormRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public W9FormRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of W9FormRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of W9FormRequest
   * @throws IOException if the JSON string is invalid with respect to W9FormRequest
   */
  public static W9FormRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W9FormRequest.class);
  }

  /**
   * Convert an instance of W9FormRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

