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
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholdingResponse;
import Avalara.SDK.model.A1099.V2.StateEfileStatusDetailApp;
import Avalara.SDK.model.A1099.V2.StatusDetail;
import Avalara.SDK.model.A1099.V2.ValidationErrorApp;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * FormResponseBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class FormResponseBase {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FORM1099_NEC("Form1099Nec"),
    
    FORM1099_MISC("Form1099Misc"),
    
    FORM1099_DIV("Form1099Div"),
    
    FORM1099_R("Form1099R"),
    
    FORM1099_K("Form1099K"),
    
    FORM1095_B("Form1095B");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholdingResponse stateAndLocalWithholding;

  /**
   * Gets or Sets tinType
   */
  @JsonAdapter(TinTypeEnum.Adapter.class)
  public enum TinTypeEnum {
    EIN("EIN"),
    
    SSN("SSN"),
    
    ITIN("ITIN"),
    
    ATIN("ATIN");

    private String value;

    TinTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TinTypeEnum fromValue(String value) {
      for (TinTypeEnum b : TinTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TinTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TinTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TinTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TinTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TinTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIN_TYPE = "tinType";
  @SerializedName(SERIALIZED_NAME_TIN_TYPE)
  private TinTypeEnum tinType;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUER_ID = "issuerId";
  @SerializedName(SERIALIZED_NAME_ISSUER_ID)
  private String issuerId;

  public static final String SERIALIZED_NAME_ISSUER_REFERENCE_ID = "issuerReferenceId";
  @SerializedName(SERIALIZED_NAME_ISSUER_REFERENCE_ID)
  private String issuerReferenceId;

  public static final String SERIALIZED_NAME_ISSUER_TIN = "issuerTin";
  @SerializedName(SERIALIZED_NAME_ISSUER_TIN)
  private String issuerTin;

  public static final String SERIALIZED_NAME_TAX_YEAR = "taxYear";
  @SerializedName(SERIALIZED_NAME_TAX_YEAR)
  private Integer taxYear;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_RECIPIENT_NAME = "recipientName";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_NAME)
  private String recipientName;

  public static final String SERIALIZED_NAME_RECIPIENT_TIN = "recipientTin";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_TIN)
  private String recipientTin;

  public static final String SERIALIZED_NAME_RECIPIENT_SECOND_NAME = "recipientSecondName";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_SECOND_NAME)
  private String recipientSecondName;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_RECIPIENT_EMAIL = "recipientEmail";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_EMAIL)
  private String recipientEmail;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_OFFICE_CODE = "officeCode";
  @SerializedName(SERIALIZED_NAME_OFFICE_CODE)
  private String officeCode;

  public static final String SERIALIZED_NAME_RECIPIENT_NON_US_PROVINCE = "recipientNonUsProvince";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_NON_US_PROVINCE)
  private String recipientNonUsProvince;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_FEDERAL_E_FILE = "federalEFile";
  @SerializedName(SERIALIZED_NAME_FEDERAL_E_FILE)
  private Boolean federalEFile;

  public static final String SERIALIZED_NAME_POSTAL_MAIL = "postalMail";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL)
  private Boolean postalMail;

  public static final String SERIALIZED_NAME_STATE_E_FILE = "stateEFile";
  @SerializedName(SERIALIZED_NAME_STATE_E_FILE)
  private Boolean stateEFile;

  public static final String SERIALIZED_NAME_TIN_MATCH = "tinMatch";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH)
  private Boolean tinMatch;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "addressVerification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private Boolean addressVerification;

  public static final String SERIALIZED_NAME_FEDERAL_EFILE_STATUS = "federalEfileStatus";
  @SerializedName(SERIALIZED_NAME_FEDERAL_EFILE_STATUS)
  private StatusDetail federalEfileStatus;

  public static final String SERIALIZED_NAME_STATE_EFILE_STATUS = "stateEfileStatus";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE_STATUS)
  private List<StateEfileStatusDetailApp> stateEfileStatus;

  public static final String SERIALIZED_NAME_POSTAL_MAIL_STATUS = "postalMailStatus";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL_STATUS)
  private StatusDetail postalMailStatus;

  public static final String SERIALIZED_NAME_TIN_MATCH_STATUS = "tinMatchStatus";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH_STATUS)
  private StatusDetail tinMatchStatus;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS = "addressVerificationStatus";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS)
  private StatusDetail addressVerificationStatus;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<ValidationErrorApp> validationErrors;

  public FormResponseBase() {
  }

  public FormResponseBase(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }



  public FormResponseBase createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public FormResponseBase updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public FormResponseBase userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public FormResponseBase stateAndLocalWithholding(StateAndLocalWithholdingResponse stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
    return this;
  }

  /**
   * Get stateAndLocalWithholding
   * @return stateAndLocalWithholding
   */
  @javax.annotation.Nullable
  public StateAndLocalWithholdingResponse getStateAndLocalWithholding() {
    return stateAndLocalWithholding;
  }

  public void setStateAndLocalWithholding(StateAndLocalWithholdingResponse stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
  }


  public FormResponseBase tinType(TinTypeEnum tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * Get tinType
   * @return tinType
   */
  @javax.annotation.Nullable
  public TinTypeEnum getTinType() {
    return tinType;
  }

  public void setTinType(TinTypeEnum tinType) {
    this.tinType = tinType;
  }


  public FormResponseBase id(String id) {
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


  public FormResponseBase issuerId(String issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * Get issuerId
   * @return issuerId
   */
  @javax.annotation.Nullable
  public String getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(String issuerId) {
    this.issuerId = issuerId;
  }


  public FormResponseBase issuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
    return this;
  }

  /**
   * Get issuerReferenceId
   * @return issuerReferenceId
   */
  @javax.annotation.Nullable
  public String getIssuerReferenceId() {
    return issuerReferenceId;
  }

  public void setIssuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
  }


  public FormResponseBase issuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
    return this;
  }

  /**
   * Get issuerTin
   * @return issuerTin
   */
  @javax.annotation.Nullable
  public String getIssuerTin() {
    return issuerTin;
  }

  public void setIssuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
  }


  public FormResponseBase taxYear(Integer taxYear) {
    this.taxYear = taxYear;
    return this;
  }

  /**
   * Get taxYear
   * @return taxYear
   */
  @javax.annotation.Nullable
  public Integer getTaxYear() {
    return taxYear;
  }

  public void setTaxYear(Integer taxYear) {
    this.taxYear = taxYear;
  }


  public FormResponseBase referenceId(String referenceId) {
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


  public FormResponseBase recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  /**
   * Get recipientName
   * @return recipientName
   */
  @javax.annotation.Nullable
  public String getRecipientName() {
    return recipientName;
  }

  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }


  public FormResponseBase recipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
    return this;
  }

  /**
   * Get recipientTin
   * @return recipientTin
   */
  @javax.annotation.Nullable
  public String getRecipientTin() {
    return recipientTin;
  }

  public void setRecipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
  }


  public FormResponseBase recipientSecondName(String recipientSecondName) {
    this.recipientSecondName = recipientSecondName;
    return this;
  }

  /**
   * Get recipientSecondName
   * @return recipientSecondName
   */
  @javax.annotation.Nullable
  public String getRecipientSecondName() {
    return recipientSecondName;
  }

  public void setRecipientSecondName(String recipientSecondName) {
    this.recipientSecondName = recipientSecondName;
  }


  public FormResponseBase address(String address) {
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


  public FormResponseBase address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Get address2
   * @return address2
   */
  @javax.annotation.Nullable
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public FormResponseBase city(String city) {
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


  public FormResponseBase state(String state) {
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


  public FormResponseBase zip(String zip) {
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


  public FormResponseBase recipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
    return this;
  }

  /**
   * Get recipientEmail
   * @return recipientEmail
   */
  @javax.annotation.Nullable
  public String getRecipientEmail() {
    return recipientEmail;
  }

  public void setRecipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
  }


  public FormResponseBase accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   */
  @javax.annotation.Nullable
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public FormResponseBase officeCode(String officeCode) {
    this.officeCode = officeCode;
    return this;
  }

  /**
   * Get officeCode
   * @return officeCode
   */
  @javax.annotation.Nullable
  public String getOfficeCode() {
    return officeCode;
  }

  public void setOfficeCode(String officeCode) {
    this.officeCode = officeCode;
  }


  public FormResponseBase recipientNonUsProvince(String recipientNonUsProvince) {
    this.recipientNonUsProvince = recipientNonUsProvince;
    return this;
  }

  /**
   * Get recipientNonUsProvince
   * @return recipientNonUsProvince
   */
  @javax.annotation.Nullable
  public String getRecipientNonUsProvince() {
    return recipientNonUsProvince;
  }

  public void setRecipientNonUsProvince(String recipientNonUsProvince) {
    this.recipientNonUsProvince = recipientNonUsProvince;
  }


  public FormResponseBase countryCode(String countryCode) {
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


  public FormResponseBase federalEFile(Boolean federalEFile) {
    this.federalEFile = federalEFile;
    return this;
  }

  /**
   * Get federalEFile
   * @return federalEFile
   */
  @javax.annotation.Nullable
  public Boolean getFederalEFile() {
    return federalEFile;
  }

  public void setFederalEFile(Boolean federalEFile) {
    this.federalEFile = federalEFile;
  }


  public FormResponseBase postalMail(Boolean postalMail) {
    this.postalMail = postalMail;
    return this;
  }

  /**
   * Get postalMail
   * @return postalMail
   */
  @javax.annotation.Nullable
  public Boolean getPostalMail() {
    return postalMail;
  }

  public void setPostalMail(Boolean postalMail) {
    this.postalMail = postalMail;
  }


  public FormResponseBase stateEFile(Boolean stateEFile) {
    this.stateEFile = stateEFile;
    return this;
  }

  /**
   * Get stateEFile
   * @return stateEFile
   */
  @javax.annotation.Nullable
  public Boolean getStateEFile() {
    return stateEFile;
  }

  public void setStateEFile(Boolean stateEFile) {
    this.stateEFile = stateEFile;
  }


  public FormResponseBase tinMatch(Boolean tinMatch) {
    this.tinMatch = tinMatch;
    return this;
  }

  /**
   * Get tinMatch
   * @return tinMatch
   */
  @javax.annotation.Nullable
  public Boolean getTinMatch() {
    return tinMatch;
  }

  public void setTinMatch(Boolean tinMatch) {
    this.tinMatch = tinMatch;
  }


  public FormResponseBase addressVerification(Boolean addressVerification) {
    this.addressVerification = addressVerification;
    return this;
  }

  /**
   * Get addressVerification
   * @return addressVerification
   */
  @javax.annotation.Nullable
  public Boolean getAddressVerification() {
    return addressVerification;
  }

  public void setAddressVerification(Boolean addressVerification) {
    this.addressVerification = addressVerification;
  }


  public FormResponseBase federalEfileStatus(StatusDetail federalEfileStatus) {
    this.federalEfileStatus = federalEfileStatus;
    return this;
  }

  /**
   * Get federalEfileStatus
   * @return federalEfileStatus
   */
  @javax.annotation.Nullable
  public StatusDetail getFederalEfileStatus() {
    return federalEfileStatus;
  }

  public void setFederalEfileStatus(StatusDetail federalEfileStatus) {
    this.federalEfileStatus = federalEfileStatus;
  }


  public FormResponseBase stateEfileStatus(List<StateEfileStatusDetailApp> stateEfileStatus) {
    this.stateEfileStatus = stateEfileStatus;
    return this;
  }

  public FormResponseBase addStateEfileStatusItem(StateEfileStatusDetailApp stateEfileStatusItem) {
    if (this.stateEfileStatus == null) {
      this.stateEfileStatus = new ArrayList<>();
    }
    this.stateEfileStatus.add(stateEfileStatusItem);
    return this;
  }

  /**
   * Get stateEfileStatus
   * @return stateEfileStatus
   */
  @javax.annotation.Nullable
  public List<StateEfileStatusDetailApp> getStateEfileStatus() {
    return stateEfileStatus;
  }

  public void setStateEfileStatus(List<StateEfileStatusDetailApp> stateEfileStatus) {
    this.stateEfileStatus = stateEfileStatus;
  }


  public FormResponseBase postalMailStatus(StatusDetail postalMailStatus) {
    this.postalMailStatus = postalMailStatus;
    return this;
  }

  /**
   * Get postalMailStatus
   * @return postalMailStatus
   */
  @javax.annotation.Nullable
  public StatusDetail getPostalMailStatus() {
    return postalMailStatus;
  }

  public void setPostalMailStatus(StatusDetail postalMailStatus) {
    this.postalMailStatus = postalMailStatus;
  }


  public FormResponseBase tinMatchStatus(StatusDetail tinMatchStatus) {
    this.tinMatchStatus = tinMatchStatus;
    return this;
  }

  /**
   * Get tinMatchStatus
   * @return tinMatchStatus
   */
  @javax.annotation.Nullable
  public StatusDetail getTinMatchStatus() {
    return tinMatchStatus;
  }

  public void setTinMatchStatus(StatusDetail tinMatchStatus) {
    this.tinMatchStatus = tinMatchStatus;
  }


  public FormResponseBase addressVerificationStatus(StatusDetail addressVerificationStatus) {
    this.addressVerificationStatus = addressVerificationStatus;
    return this;
  }

  /**
   * Get addressVerificationStatus
   * @return addressVerificationStatus
   */
  @javax.annotation.Nullable
  public StatusDetail getAddressVerificationStatus() {
    return addressVerificationStatus;
  }

  public void setAddressVerificationStatus(StatusDetail addressVerificationStatus) {
    this.addressVerificationStatus = addressVerificationStatus;
  }


  public FormResponseBase validationErrors(List<ValidationErrorApp> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public FormResponseBase addValidationErrorsItem(ValidationErrorApp validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Get validationErrors
   * @return validationErrors
   */
  @javax.annotation.Nullable
  public List<ValidationErrorApp> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationErrorApp> validationErrors) {
    this.validationErrors = validationErrors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormResponseBase formResponseBase = (FormResponseBase) o;
    return Objects.equals(this.type, formResponseBase.type) &&
        Objects.equals(this.createdAt, formResponseBase.createdAt) &&
        Objects.equals(this.updatedAt, formResponseBase.updatedAt) &&
        Objects.equals(this.userId, formResponseBase.userId) &&
        Objects.equals(this.stateAndLocalWithholding, formResponseBase.stateAndLocalWithholding) &&
        Objects.equals(this.tinType, formResponseBase.tinType) &&
        Objects.equals(this.id, formResponseBase.id) &&
        Objects.equals(this.issuerId, formResponseBase.issuerId) &&
        Objects.equals(this.issuerReferenceId, formResponseBase.issuerReferenceId) &&
        Objects.equals(this.issuerTin, formResponseBase.issuerTin) &&
        Objects.equals(this.taxYear, formResponseBase.taxYear) &&
        Objects.equals(this.referenceId, formResponseBase.referenceId) &&
        Objects.equals(this.recipientName, formResponseBase.recipientName) &&
        Objects.equals(this.recipientTin, formResponseBase.recipientTin) &&
        Objects.equals(this.recipientSecondName, formResponseBase.recipientSecondName) &&
        Objects.equals(this.address, formResponseBase.address) &&
        Objects.equals(this.address2, formResponseBase.address2) &&
        Objects.equals(this.city, formResponseBase.city) &&
        Objects.equals(this.state, formResponseBase.state) &&
        Objects.equals(this.zip, formResponseBase.zip) &&
        Objects.equals(this.recipientEmail, formResponseBase.recipientEmail) &&
        Objects.equals(this.accountNumber, formResponseBase.accountNumber) &&
        Objects.equals(this.officeCode, formResponseBase.officeCode) &&
        Objects.equals(this.recipientNonUsProvince, formResponseBase.recipientNonUsProvince) &&
        Objects.equals(this.countryCode, formResponseBase.countryCode) &&
        Objects.equals(this.federalEFile, formResponseBase.federalEFile) &&
        Objects.equals(this.postalMail, formResponseBase.postalMail) &&
        Objects.equals(this.stateEFile, formResponseBase.stateEFile) &&
        Objects.equals(this.tinMatch, formResponseBase.tinMatch) &&
        Objects.equals(this.addressVerification, formResponseBase.addressVerification) &&
        Objects.equals(this.federalEfileStatus, formResponseBase.federalEfileStatus) &&
        Objects.equals(this.stateEfileStatus, formResponseBase.stateEfileStatus) &&
        Objects.equals(this.postalMailStatus, formResponseBase.postalMailStatus) &&
        Objects.equals(this.tinMatchStatus, formResponseBase.tinMatchStatus) &&
        Objects.equals(this.addressVerificationStatus, formResponseBase.addressVerificationStatus) &&
        Objects.equals(this.validationErrors, formResponseBase.validationErrors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, createdAt, updatedAt, userId, stateAndLocalWithholding, tinType, id, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, recipientName, recipientTin, recipientSecondName, address, address2, city, state, zip, recipientEmail, accountNumber, officeCode, recipientNonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, addressVerification, federalEfileStatus, stateEfileStatus, postalMailStatus, tinMatchStatus, addressVerificationStatus, validationErrors);
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
    sb.append("class FormResponseBase {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    stateAndLocalWithholding: ").append(toIndentedString(stateAndLocalWithholding)).append("\n");
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerReferenceId: ").append(toIndentedString(issuerReferenceId)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
    sb.append("    recipientSecondName: ").append(toIndentedString(recipientSecondName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    recipientEmail: ").append(toIndentedString(recipientEmail)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    officeCode: ").append(toIndentedString(officeCode)).append("\n");
    sb.append("    recipientNonUsProvince: ").append(toIndentedString(recipientNonUsProvince)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    federalEFile: ").append(toIndentedString(federalEFile)).append("\n");
    sb.append("    postalMail: ").append(toIndentedString(postalMail)).append("\n");
    sb.append("    stateEFile: ").append(toIndentedString(stateEFile)).append("\n");
    sb.append("    tinMatch: ").append(toIndentedString(tinMatch)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    federalEfileStatus: ").append(toIndentedString(federalEfileStatus)).append("\n");
    sb.append("    stateEfileStatus: ").append(toIndentedString(stateEfileStatus)).append("\n");
    sb.append("    postalMailStatus: ").append(toIndentedString(postalMailStatus)).append("\n");
    sb.append("    tinMatchStatus: ").append(toIndentedString(tinMatchStatus)).append("\n");
    sb.append("    addressVerificationStatus: ").append(toIndentedString(addressVerificationStatus)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("userId");
    openapiFields.add("stateAndLocalWithholding");
    openapiFields.add("tinType");
    openapiFields.add("id");
    openapiFields.add("issuerId");
    openapiFields.add("issuerReferenceId");
    openapiFields.add("issuerTin");
    openapiFields.add("taxYear");
    openapiFields.add("referenceId");
    openapiFields.add("recipientName");
    openapiFields.add("recipientTin");
    openapiFields.add("recipientSecondName");
    openapiFields.add("address");
    openapiFields.add("address2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("recipientEmail");
    openapiFields.add("accountNumber");
    openapiFields.add("officeCode");
    openapiFields.add("recipientNonUsProvince");
    openapiFields.add("countryCode");
    openapiFields.add("federalEFile");
    openapiFields.add("postalMail");
    openapiFields.add("stateEFile");
    openapiFields.add("tinMatch");
    openapiFields.add("addressVerification");
    openapiFields.add("federalEfileStatus");
    openapiFields.add("stateEfileStatus");
    openapiFields.add("postalMailStatus");
    openapiFields.add("tinMatchStatus");
    openapiFields.add("addressVerificationStatus");
    openapiFields.add("validationErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FormResponseBase
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FormResponseBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FormResponseBase is not found in the empty JSON string", FormResponseBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FormResponseBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FormResponseBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholdingResponse.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
      }
      if ((jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) && !jsonObj.get("tinType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinType").toString()));
      }
      // validate the optional field `tinType`
      if (jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) {
        TinTypeEnum.validateJsonElement(jsonObj.get("tinType"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("issuerId") != null && !jsonObj.get("issuerId").isJsonNull()) && !jsonObj.get("issuerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerId").toString()));
      }
      if ((jsonObj.get("issuerReferenceId") != null && !jsonObj.get("issuerReferenceId").isJsonNull()) && !jsonObj.get("issuerReferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerReferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerReferenceId").toString()));
      }
      if ((jsonObj.get("issuerTin") != null && !jsonObj.get("issuerTin").isJsonNull()) && !jsonObj.get("issuerTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerTin").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("recipientName") != null && !jsonObj.get("recipientName").isJsonNull()) && !jsonObj.get("recipientName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientName").toString()));
      }
      if ((jsonObj.get("recipientTin") != null && !jsonObj.get("recipientTin").isJsonNull()) && !jsonObj.get("recipientTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientTin").toString()));
      }
      if ((jsonObj.get("recipientSecondName") != null && !jsonObj.get("recipientSecondName").isJsonNull()) && !jsonObj.get("recipientSecondName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientSecondName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientSecondName").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("address2") != null && !jsonObj.get("address2").isJsonNull()) && !jsonObj.get("address2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address2").toString()));
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
      if ((jsonObj.get("recipientEmail") != null && !jsonObj.get("recipientEmail").isJsonNull()) && !jsonObj.get("recipientEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientEmail").toString()));
      }
      if ((jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonNull()) && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if ((jsonObj.get("officeCode") != null && !jsonObj.get("officeCode").isJsonNull()) && !jsonObj.get("officeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `officeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("officeCode").toString()));
      }
      if ((jsonObj.get("recipientNonUsProvince") != null && !jsonObj.get("recipientNonUsProvince").isJsonNull()) && !jsonObj.get("recipientNonUsProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientNonUsProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientNonUsProvince").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      // validate the optional field `federalEfileStatus`
      if (jsonObj.get("federalEfileStatus") != null && !jsonObj.get("federalEfileStatus").isJsonNull()) {
        StatusDetail.validateJsonElement(jsonObj.get("federalEfileStatus"));
      }
      if (jsonObj.get("stateEfileStatus") != null && !jsonObj.get("stateEfileStatus").isJsonNull()) {
        JsonArray jsonArraystateEfileStatus = jsonObj.getAsJsonArray("stateEfileStatus");
        if (jsonArraystateEfileStatus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("stateEfileStatus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `stateEfileStatus` to be an array in the JSON string but got `%s`", jsonObj.get("stateEfileStatus").toString()));
          }

          // validate the optional field `stateEfileStatus` (array)
          for (int i = 0; i < jsonArraystateEfileStatus.size(); i++) {
            StateEfileStatusDetailApp.validateJsonElement(jsonArraystateEfileStatus.get(i));
          };
        }
      }
      // validate the optional field `postalMailStatus`
      if (jsonObj.get("postalMailStatus") != null && !jsonObj.get("postalMailStatus").isJsonNull()) {
        StatusDetail.validateJsonElement(jsonObj.get("postalMailStatus"));
      }
      // validate the optional field `tinMatchStatus`
      if (jsonObj.get("tinMatchStatus") != null && !jsonObj.get("tinMatchStatus").isJsonNull()) {
        StatusDetail.validateJsonElement(jsonObj.get("tinMatchStatus"));
      }
      // validate the optional field `addressVerificationStatus`
      if (jsonObj.get("addressVerificationStatus") != null && !jsonObj.get("addressVerificationStatus").isJsonNull()) {
        StatusDetail.validateJsonElement(jsonObj.get("addressVerificationStatus"));
      }
      if (jsonObj.get("validationErrors") != null && !jsonObj.get("validationErrors").isJsonNull()) {
        JsonArray jsonArrayvalidationErrors = jsonObj.getAsJsonArray("validationErrors");
        if (jsonArrayvalidationErrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("validationErrors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `validationErrors` to be an array in the JSON string but got `%s`", jsonObj.get("validationErrors").toString()));
          }

          // validate the optional field `validationErrors` (array)
          for (int i = 0; i < jsonArrayvalidationErrors.size(); i++) {
            ValidationErrorApp.validateJsonElement(jsonArrayvalidationErrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FormResponseBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FormResponseBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FormResponseBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FormResponseBase.class));

       return (TypeAdapter<T>) new TypeAdapter<FormResponseBase>() {
           @Override
           public void write(JsonWriter out, FormResponseBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FormResponseBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FormResponseBase given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FormResponseBase
   * @throws IOException if the JSON string is invalid with respect to FormResponseBase
   */
  public static FormResponseBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FormResponseBase.class);
  }

  /**
   * Convert an instance of FormResponseBase to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

