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
 * ## Authentication  #### Step 1: Generate API Credentials  Generate a *client ID* and *client secret* from your [Avalara1099 account](https://sbx.track1099.com/api_tokens): *Your Profile → API*.  #### Step 2: Get an Identity Token  Send a `POST` request to the **Identity Token URL** with your *client ID* and *client secret* from Step 1 as form-encoded parameters:  ```http POST https://identity.avalara.com/connect/token Content-Type: application/x-www-form-urlencoded  grant_type=client_credentials client_id=<your client ID> client_secret=<your client secret> ```  **Body parameters** - `grant_type` — Always `client_credentials` - `client_id` — Your *client ID* from Step 1 - `client_secret` — Your *client secret* from Step 1  **Successful response**  ```json {   \"access_token\": \"eyJhbGci...\",   \"expires_in\": 3600,   \"token_type\": \"Bearer\" } ```  Use the `access_token` as a bearer token in the `Authorization` header on every A1099 API request:  ```http Authorization: Bearer <access_token> ```  ---  For more on authenticating requests, see the [A1099 authentication guide](https://developer.avalara.com/1099-and-w-9/kny2997001535374/).  ---  ## Environments  #### Production - **Avalara 1099 API URL:** [`https://api.avalara.com/avalara1099`](https://api.avalara.com/avalara1099) - **Identity Token URL:** [`https://identity.avalara.com/connect/token`](https://identity.avalara.com/connect/token)  #### Sandbox - **Avalara 1099 API URL:** [`https://api.sbx.avalara.com/avalara1099`](https://api.sbx.avalara.com/avalara1099) - **Identity Token URL:** [`https://ai-sbx.avlr.sh/connect/token`](https://ai-sbx.avlr.sh/connect/token)  ---  ## API & SDK Documentation  [Avalara 1099 API Reference](https://developer.avalara.com/api-reference/avalara1099/avalara1099/)  [Avalara SDKs](https://developer.avalara.com/sdk/)  [Swagger](https://api.avalara.com/avalara1099/swagger/index.html?api-version=2.0)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import Avalara.SDK.model.A1099.V2.Form1099StatusDetail;
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholding;
import Avalara.SDK.model.A1099.V2.StateEfileStatusDetail;
import Avalara.SDK.model.A1099.V2.ValidationError;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
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
 * Form W-2: Wage and Tax Statement.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099W2 {
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

  public static final String SERIALIZED_NAME_WAGES = "wages";
  @SerializedName(SERIALIZED_NAME_WAGES)
  private Double wages;

  public static final String SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD = "federalIncomeTaxWithheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD)
  private Double federalIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_WAGES = "socialSecurityWages";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_WAGES)
  private Double socialSecurityWages;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_TAX_WITHHELD = "socialSecurityTaxWithheld";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_TAX_WITHHELD)
  private Double socialSecurityTaxWithheld;

  public static final String SERIALIZED_NAME_MEDICARE_WAGES = "medicareWages";
  @SerializedName(SERIALIZED_NAME_MEDICARE_WAGES)
  private Double medicareWages;

  public static final String SERIALIZED_NAME_MEDICARE_TAX_WITHHELD = "medicareTaxWithheld";
  @SerializedName(SERIALIZED_NAME_MEDICARE_TAX_WITHHELD)
  private Double medicareTaxWithheld;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_TIPS = "socialSecurityTips";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_TIPS)
  private Double socialSecurityTips;

  public static final String SERIALIZED_NAME_ALLOCATED_TIPS = "allocatedTips";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_TIPS)
  private Double allocatedTips;

  public static final String SERIALIZED_NAME_DEPENDENT_CARE_BENEFITS = "dependentCareBenefits";
  @SerializedName(SERIALIZED_NAME_DEPENDENT_CARE_BENEFITS)
  private Double dependentCareBenefits;

  public static final String SERIALIZED_NAME_NONQUALIFIED_PLANS_SECTION457 = "nonqualifiedPlansSection457";
  @SerializedName(SERIALIZED_NAME_NONQUALIFIED_PLANS_SECTION457)
  private Double nonqualifiedPlansSection457;

  public static final String SERIALIZED_NAME_NONQUALIFIED_PLANS_NOT_SECTION457 = "nonqualifiedPlansNotSection457";
  @SerializedName(SERIALIZED_NAME_NONQUALIFIED_PLANS_NOT_SECTION457)
  private Double nonqualifiedPlansNotSection457;

  public static final String SERIALIZED_NAME_CODE12A = "code12a";
  @SerializedName(SERIALIZED_NAME_CODE12A)
  private String code12a;

  public static final String SERIALIZED_NAME_AMOUNT12A = "amount12a";
  @SerializedName(SERIALIZED_NAME_AMOUNT12A)
  private Double amount12a;

  public static final String SERIALIZED_NAME_CODE12B = "code12b";
  @SerializedName(SERIALIZED_NAME_CODE12B)
  private String code12b;

  public static final String SERIALIZED_NAME_AMOUNT12B = "amount12b";
  @SerializedName(SERIALIZED_NAME_AMOUNT12B)
  private Double amount12b;

  public static final String SERIALIZED_NAME_CODE12C = "code12c";
  @SerializedName(SERIALIZED_NAME_CODE12C)
  private String code12c;

  public static final String SERIALIZED_NAME_AMOUNT12C = "amount12c";
  @SerializedName(SERIALIZED_NAME_AMOUNT12C)
  private Double amount12c;

  public static final String SERIALIZED_NAME_CODE12D = "code12d";
  @SerializedName(SERIALIZED_NAME_CODE12D)
  private String code12d;

  public static final String SERIALIZED_NAME_AMOUNT12D = "amount12d";
  @SerializedName(SERIALIZED_NAME_AMOUNT12D)
  private Double amount12d;

  public static final String SERIALIZED_NAME_STATUTORY_EMPLOYEE_INDICATOR = "statutoryEmployeeIndicator";
  @SerializedName(SERIALIZED_NAME_STATUTORY_EMPLOYEE_INDICATOR)
  private Boolean statutoryEmployeeIndicator;

  public static final String SERIALIZED_NAME_RETIREMENT_PLAN_INDICATOR = "retirementPlanIndicator";
  @SerializedName(SERIALIZED_NAME_RETIREMENT_PLAN_INDICATOR)
  private Boolean retirementPlanIndicator;

  public static final String SERIALIZED_NAME_THIRD_PARTY_SICK_PAY_INDICATOR = "thirdPartySickPayIndicator";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_SICK_PAY_INDICATOR)
  private Boolean thirdPartySickPayIndicator;

  public static final String SERIALIZED_NAME_THIRD_PARTY_SICK_PAY_WITHHOLDING = "thirdPartySickPayWithholding";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_SICK_PAY_WITHHOLDING)
  private Double thirdPartySickPayWithholding;

  public static final String SERIALIZED_NAME_OTHER14A = "other14a";
  @SerializedName(SERIALIZED_NAME_OTHER14A)
  private String other14a;

  public static final String SERIALIZED_NAME_OTHER14B = "other14b";
  @SerializedName(SERIALIZED_NAME_OTHER14B)
  private String other14b;

  public static final String SERIALIZED_NAME_OTHER14C = "other14c";
  @SerializedName(SERIALIZED_NAME_OTHER14C)
  private String other14c;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING_SECONDARY = "stateAndLocalWithholdingSecondary";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING_SECONDARY)
  private StateAndLocalWithholding stateAndLocalWithholdingSecondary;

  /**
   * Form type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    _1042_S("1042-S"),
    
    _1095_B("1095-B"),
    
    _1095_C("1095-C"),
    
    _1099_DIV("1099-DIV"),
    
    _1099_INT("1099-INT"),
    
    _1099_K("1099-K"),
    
    _1099_MISC("1099-MISC"),
    
    _1099_NEC("1099-NEC"),
    
    _1099_R("1099-R"),
    
    W_2("W-2");

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

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_RECIPIENT_NAME = "recipientName";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_NAME)
  private String recipientName;

  /**
   * Tax Identification Number (TIN) type.  Available values: - EIN: Employer Identification Number - SSN: Social Security Number - ITIN: Individual Taxpayer Identification Number - ATIN: Adoption Taxpayer Identification Number
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
      return null;
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

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_OFFICE_CODE = "officeCode";
  @SerializedName(SERIALIZED_NAME_OFFICE_CODE)
  private String officeCode;

  public static final String SERIALIZED_NAME_NON_US_PROVINCE = "nonUsProvince";
  @SerializedName(SERIALIZED_NAME_NON_US_PROVINCE)
  private String nonUsProvince;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_FEDERAL_EFILE_DATE = "federalEfileDate";
  @SerializedName(SERIALIZED_NAME_FEDERAL_EFILE_DATE)
  private LocalDate federalEfileDate;

  public static final String SERIALIZED_NAME_POSTAL_MAIL = "postalMail";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL)
  private Boolean postalMail;

  public static final String SERIALIZED_NAME_STATE_EFILE_DATE = "stateEfileDate";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE_DATE)
  private LocalDate stateEfileDate;

  public static final String SERIALIZED_NAME_RECIPIENT_EDELIVERY_DATE = "recipientEdeliveryDate";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_EDELIVERY_DATE)
  private LocalDate recipientEdeliveryDate;

  public static final String SERIALIZED_NAME_TIN_MATCH = "tinMatch";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH)
  private Boolean tinMatch;

  public static final String SERIALIZED_NAME_NO_TIN = "noTin";
  @SerializedName(SERIALIZED_NAME_NO_TIN)
  private Boolean noTin;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "addressVerification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private Boolean addressVerification;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholding stateAndLocalWithholding;

  public static final String SERIALIZED_NAME_SECOND_TIN_NOTICE = "secondTinNotice";
  @SerializedName(SERIALIZED_NAME_SECOND_TIN_NOTICE)
  private Boolean secondTinNotice;

  public static final String SERIALIZED_NAME_FEDERAL_EFILE_STATUS = "federalEfileStatus";
  @SerializedName(SERIALIZED_NAME_FEDERAL_EFILE_STATUS)
  private Form1099StatusDetail federalEfileStatus;

  public static final String SERIALIZED_NAME_STATE_EFILE_STATUS = "stateEfileStatus";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE_STATUS)
  private List<StateEfileStatusDetail> stateEfileStatus;

  public static final String SERIALIZED_NAME_POSTAL_MAIL_STATUS = "postalMailStatus";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL_STATUS)
  private Form1099StatusDetail postalMailStatus;

  public static final String SERIALIZED_NAME_TIN_MATCH_STATUS = "tinMatchStatus";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH_STATUS)
  private Form1099StatusDetail tinMatchStatus;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS = "addressVerificationStatus";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS)
  private Form1099StatusDetail addressVerificationStatus;

  public static final String SERIALIZED_NAME_E_DELIVERY_STATUS = "eDeliveryStatus";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_STATUS)
  private Form1099StatusDetail eDeliveryStatus;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<ValidationError> validationErrors;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Form1099W2() {
  }

  public Form1099W2(
     String id, 
     Form1099StatusDetail federalEfileStatus, 
     List<StateEfileStatusDetail> stateEfileStatus, 
     Form1099StatusDetail postalMailStatus, 
     Form1099StatusDetail tinMatchStatus, 
     Form1099StatusDetail addressVerificationStatus, 
     Form1099StatusDetail eDeliveryStatus, 
     List<ValidationError> validationErrors, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.id = id;
    this.federalEfileStatus = federalEfileStatus;
    this.stateEfileStatus = stateEfileStatus;
    this.postalMailStatus = postalMailStatus;
    this.tinMatchStatus = tinMatchStatus;
    this.addressVerificationStatus = addressVerificationStatus;
    this.eDeliveryStatus = eDeliveryStatus;
    this.validationErrors = validationErrors;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public Form1099W2 employeeFirstName(String employeeFirstName) {
    this.employeeFirstName = employeeFirstName;
    return this;
  }

  /**
   * Employee first name (max 15 chars).
   * @return employeeFirstName
   */
  @javax.annotation.Nullable
  public String getEmployeeFirstName() {
    return employeeFirstName;
  }

  public void setEmployeeFirstName(String employeeFirstName) {
    this.employeeFirstName = employeeFirstName;
  }


  public Form1099W2 employeeMiddleName(String employeeMiddleName) {
    this.employeeMiddleName = employeeMiddleName;
    return this;
  }

  /**
   * Employee middle name (max 15 chars, optional).
   * @return employeeMiddleName
   */
  @javax.annotation.Nullable
  public String getEmployeeMiddleName() {
    return employeeMiddleName;
  }

  public void setEmployeeMiddleName(String employeeMiddleName) {
    this.employeeMiddleName = employeeMiddleName;
  }


  public Form1099W2 employeeLastName(String employeeLastName) {
    this.employeeLastName = employeeLastName;
    return this;
  }

  /**
   * Employee last name (max 20 chars).
   * @return employeeLastName
   */
  @javax.annotation.Nullable
  public String getEmployeeLastName() {
    return employeeLastName;
  }

  public void setEmployeeLastName(String employeeLastName) {
    this.employeeLastName = employeeLastName;
  }


  public Form1099W2 employeeNameSuffix(String employeeNameSuffix) {
    this.employeeNameSuffix = employeeNameSuffix;
    return this;
  }

  /**
   * Employee name suffix (Jr, Sr, III, etc — max 4 chars, optional).
   * @return employeeNameSuffix
   */
  @javax.annotation.Nullable
  public String getEmployeeNameSuffix() {
    return employeeNameSuffix;
  }

  public void setEmployeeNameSuffix(String employeeNameSuffix) {
    this.employeeNameSuffix = employeeNameSuffix;
  }


  public Form1099W2 wages(Double wages) {
    this.wages = wages;
    return this;
  }

  /**
   * Wages, tips, other compensation.
   * @return wages
   */
  @javax.annotation.Nullable
  public Double getWages() {
    return wages;
  }

  public void setWages(Double wages) {
    this.wages = wages;
  }


  public Form1099W2 federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
    return this;
  }

  /**
   * Federal income tax withheld.
   * @return federalIncomeTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getFederalIncomeTaxWithheld() {
    return federalIncomeTaxWithheld;
  }

  public void setFederalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
  }


  public Form1099W2 socialSecurityWages(Double socialSecurityWages) {
    this.socialSecurityWages = socialSecurityWages;
    return this;
  }

  /**
   * Social security wages.
   * @return socialSecurityWages
   */
  @javax.annotation.Nullable
  public Double getSocialSecurityWages() {
    return socialSecurityWages;
  }

  public void setSocialSecurityWages(Double socialSecurityWages) {
    this.socialSecurityWages = socialSecurityWages;
  }


  public Form1099W2 socialSecurityTaxWithheld(Double socialSecurityTaxWithheld) {
    this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
    return this;
  }

  /**
   * Social security tax withheld.
   * @return socialSecurityTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getSocialSecurityTaxWithheld() {
    return socialSecurityTaxWithheld;
  }

  public void setSocialSecurityTaxWithheld(Double socialSecurityTaxWithheld) {
    this.socialSecurityTaxWithheld = socialSecurityTaxWithheld;
  }


  public Form1099W2 medicareWages(Double medicareWages) {
    this.medicareWages = medicareWages;
    return this;
  }

  /**
   * Medicare wages and tips.
   * @return medicareWages
   */
  @javax.annotation.Nullable
  public Double getMedicareWages() {
    return medicareWages;
  }

  public void setMedicareWages(Double medicareWages) {
    this.medicareWages = medicareWages;
  }


  public Form1099W2 medicareTaxWithheld(Double medicareTaxWithheld) {
    this.medicareTaxWithheld = medicareTaxWithheld;
    return this;
  }

  /**
   * Medicare tax withheld.
   * @return medicareTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getMedicareTaxWithheld() {
    return medicareTaxWithheld;
  }

  public void setMedicareTaxWithheld(Double medicareTaxWithheld) {
    this.medicareTaxWithheld = medicareTaxWithheld;
  }


  public Form1099W2 socialSecurityTips(Double socialSecurityTips) {
    this.socialSecurityTips = socialSecurityTips;
    return this;
  }

  /**
   * Social security tips.
   * @return socialSecurityTips
   */
  @javax.annotation.Nullable
  public Double getSocialSecurityTips() {
    return socialSecurityTips;
  }

  public void setSocialSecurityTips(Double socialSecurityTips) {
    this.socialSecurityTips = socialSecurityTips;
  }


  public Form1099W2 allocatedTips(Double allocatedTips) {
    this.allocatedTips = allocatedTips;
    return this;
  }

  /**
   * Allocated tips.
   * @return allocatedTips
   */
  @javax.annotation.Nullable
  public Double getAllocatedTips() {
    return allocatedTips;
  }

  public void setAllocatedTips(Double allocatedTips) {
    this.allocatedTips = allocatedTips;
  }


  public Form1099W2 dependentCareBenefits(Double dependentCareBenefits) {
    this.dependentCareBenefits = dependentCareBenefits;
    return this;
  }

  /**
   * Dependent care benefits.
   * @return dependentCareBenefits
   */
  @javax.annotation.Nullable
  public Double getDependentCareBenefits() {
    return dependentCareBenefits;
  }

  public void setDependentCareBenefits(Double dependentCareBenefits) {
    this.dependentCareBenefits = dependentCareBenefits;
  }


  public Form1099W2 nonqualifiedPlansSection457(Double nonqualifiedPlansSection457) {
    this.nonqualifiedPlansSection457 = nonqualifiedPlansSection457;
    return this;
  }

  /**
   * Non-qualified plan Section 457 distributions or contributions.
   * @return nonqualifiedPlansSection457
   */
  @javax.annotation.Nullable
  public Double getNonqualifiedPlansSection457() {
    return nonqualifiedPlansSection457;
  }

  public void setNonqualifiedPlansSection457(Double nonqualifiedPlansSection457) {
    this.nonqualifiedPlansSection457 = nonqualifiedPlansSection457;
  }


  public Form1099W2 nonqualifiedPlansNotSection457(Double nonqualifiedPlansNotSection457) {
    this.nonqualifiedPlansNotSection457 = nonqualifiedPlansNotSection457;
    return this;
  }

  /**
   * Non-qualified plan NOT Section 457 distributions or contributions.
   * @return nonqualifiedPlansNotSection457
   */
  @javax.annotation.Nullable
  public Double getNonqualifiedPlansNotSection457() {
    return nonqualifiedPlansNotSection457;
  }

  public void setNonqualifiedPlansNotSection457(Double nonqualifiedPlansNotSection457) {
    this.nonqualifiedPlansNotSection457 = nonqualifiedPlansNotSection457;
  }


  public Form1099W2 code12a(String code12a) {
    this.code12a = code12a;
    return this;
  }

  /**
   * Letter code (A-Z, AA, BB, etc) for slot a.
   * @return code12a
   */
  @javax.annotation.Nullable
  public String getCode12a() {
    return code12a;
  }

  public void setCode12a(String code12a) {
    this.code12a = code12a;
  }


  public Form1099W2 amount12a(Double amount12a) {
    this.amount12a = amount12a;
    return this;
  }

  /**
   * Amount for slot a.
   * @return amount12a
   */
  @javax.annotation.Nullable
  public Double getAmount12a() {
    return amount12a;
  }

  public void setAmount12a(Double amount12a) {
    this.amount12a = amount12a;
  }


  public Form1099W2 code12b(String code12b) {
    this.code12b = code12b;
    return this;
  }

  /**
   * Letter code for slot b.
   * @return code12b
   */
  @javax.annotation.Nullable
  public String getCode12b() {
    return code12b;
  }

  public void setCode12b(String code12b) {
    this.code12b = code12b;
  }


  public Form1099W2 amount12b(Double amount12b) {
    this.amount12b = amount12b;
    return this;
  }

  /**
   * Amount for slot b.
   * @return amount12b
   */
  @javax.annotation.Nullable
  public Double getAmount12b() {
    return amount12b;
  }

  public void setAmount12b(Double amount12b) {
    this.amount12b = amount12b;
  }


  public Form1099W2 code12c(String code12c) {
    this.code12c = code12c;
    return this;
  }

  /**
   * Letter code for slot c.
   * @return code12c
   */
  @javax.annotation.Nullable
  public String getCode12c() {
    return code12c;
  }

  public void setCode12c(String code12c) {
    this.code12c = code12c;
  }


  public Form1099W2 amount12c(Double amount12c) {
    this.amount12c = amount12c;
    return this;
  }

  /**
   * Amount for slot c.
   * @return amount12c
   */
  @javax.annotation.Nullable
  public Double getAmount12c() {
    return amount12c;
  }

  public void setAmount12c(Double amount12c) {
    this.amount12c = amount12c;
  }


  public Form1099W2 code12d(String code12d) {
    this.code12d = code12d;
    return this;
  }

  /**
   * Letter code for slot d.
   * @return code12d
   */
  @javax.annotation.Nullable
  public String getCode12d() {
    return code12d;
  }

  public void setCode12d(String code12d) {
    this.code12d = code12d;
  }


  public Form1099W2 amount12d(Double amount12d) {
    this.amount12d = amount12d;
    return this;
  }

  /**
   * Amount for slot d.
   * @return amount12d
   */
  @javax.annotation.Nullable
  public Double getAmount12d() {
    return amount12d;
  }

  public void setAmount12d(Double amount12d) {
    this.amount12d = amount12d;
  }


  public Form1099W2 statutoryEmployeeIndicator(Boolean statutoryEmployeeIndicator) {
    this.statutoryEmployeeIndicator = statutoryEmployeeIndicator;
    return this;
  }

  /**
   * Statutory employee indicator.
   * @return statutoryEmployeeIndicator
   */
  @javax.annotation.Nullable
  public Boolean getStatutoryEmployeeIndicator() {
    return statutoryEmployeeIndicator;
  }

  public void setStatutoryEmployeeIndicator(Boolean statutoryEmployeeIndicator) {
    this.statutoryEmployeeIndicator = statutoryEmployeeIndicator;
  }


  public Form1099W2 retirementPlanIndicator(Boolean retirementPlanIndicator) {
    this.retirementPlanIndicator = retirementPlanIndicator;
    return this;
  }

  /**
   * Retirement plan indicator.
   * @return retirementPlanIndicator
   */
  @javax.annotation.Nullable
  public Boolean getRetirementPlanIndicator() {
    return retirementPlanIndicator;
  }

  public void setRetirementPlanIndicator(Boolean retirementPlanIndicator) {
    this.retirementPlanIndicator = retirementPlanIndicator;
  }


  public Form1099W2 thirdPartySickPayIndicator(Boolean thirdPartySickPayIndicator) {
    this.thirdPartySickPayIndicator = thirdPartySickPayIndicator;
    return this;
  }

  /**
   * Third-party sick pay indicator.
   * @return thirdPartySickPayIndicator
   */
  @javax.annotation.Nullable
  public Boolean getThirdPartySickPayIndicator() {
    return thirdPartySickPayIndicator;
  }

  public void setThirdPartySickPayIndicator(Boolean thirdPartySickPayIndicator) {
    this.thirdPartySickPayIndicator = thirdPartySickPayIndicator;
  }


  public Form1099W2 thirdPartySickPayWithholding(Double thirdPartySickPayWithholding) {
    this.thirdPartySickPayWithholding = thirdPartySickPayWithholding;
    return this;
  }

  /**
   * Third-party sick pay federal income tax withheld  (only effective when Avalara1099.Application.Forms1099.Models.Form1099W2.ThirdPartySickPayIndicator is true).
   * @return thirdPartySickPayWithholding
   */
  @javax.annotation.Nullable
  public Double getThirdPartySickPayWithholding() {
    return thirdPartySickPayWithholding;
  }

  public void setThirdPartySickPayWithholding(Double thirdPartySickPayWithholding) {
    this.thirdPartySickPayWithholding = thirdPartySickPayWithholding;
  }


  public Form1099W2 other14a(String other14a) {
    this.other14a = other14a;
    return this;
  }

  /**
   * Other (max 30 chars) for slot a.
   * @return other14a
   */
  @javax.annotation.Nullable
  public String getOther14a() {
    return other14a;
  }

  public void setOther14a(String other14a) {
    this.other14a = other14a;
  }


  public Form1099W2 other14b(String other14b) {
    this.other14b = other14b;
    return this;
  }

  /**
   * Other (max 30 chars) for slot b.
   * @return other14b
   */
  @javax.annotation.Nullable
  public String getOther14b() {
    return other14b;
  }

  public void setOther14b(String other14b) {
    this.other14b = other14b;
  }


  public Form1099W2 other14c(String other14c) {
    this.other14c = other14c;
    return this;
  }

  /**
   * Other (max 30 chars) for slot c.
   * @return other14c
   */
  @javax.annotation.Nullable
  public String getOther14c() {
    return other14c;
  }

  public void setOther14c(String other14c) {
    this.other14c = other14c;
  }


  public Form1099W2 stateAndLocalWithholdingSecondary(StateAndLocalWithholding stateAndLocalWithholdingSecondary) {
    this.stateAndLocalWithholdingSecondary = stateAndLocalWithholdingSecondary;
    return this;
  }

  /**
   * Secondary state and local withholding slot.
   * @return stateAndLocalWithholdingSecondary
   */
  @javax.annotation.Nullable
  public StateAndLocalWithholding getStateAndLocalWithholdingSecondary() {
    return stateAndLocalWithholdingSecondary;
  }

  public void setStateAndLocalWithholdingSecondary(StateAndLocalWithholding stateAndLocalWithholdingSecondary) {
    this.stateAndLocalWithholdingSecondary = stateAndLocalWithholdingSecondary;
  }


  public Form1099W2 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Form type.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Form ID. Unique identifier set when the record is created.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public Form1099W2 issuerId(String issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * Issuer ID - only required when creating forms
   * @return issuerId
   */
  @javax.annotation.Nullable
  public String getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(String issuerId) {
    this.issuerId = issuerId;
  }


  public Form1099W2 issuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
    return this;
  }

  /**
   * Issuer Reference ID - only required when creating forms via $bulk-upsert
   * @return issuerReferenceId
   */
  @javax.annotation.Nullable
  public String getIssuerReferenceId() {
    return issuerReferenceId;
  }

  public void setIssuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
  }


  public Form1099W2 issuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
    return this;
  }

  /**
   * Issuer TIN - readonly
   * @return issuerTin
   */
  @javax.annotation.Nullable
  public String getIssuerTin() {
    return issuerTin;
  }

  public void setIssuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
  }


  public Form1099W2 taxYear(Integer taxYear) {
    this.taxYear = taxYear;
    return this;
  }

  /**
   * Tax Year - only required when creating forms via $bulk-upsert
   * @return taxYear
   */
  @javax.annotation.Nullable
  public Integer getTaxYear() {
    return taxYear;
  }

  public void setTaxYear(Integer taxYear) {
    this.taxYear = taxYear;
  }


  public Form1099W2 referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Internal reference ID. Never shown to any agency or recipient.
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public Form1099W2 tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * Recipient&#39;s Federal Tax Identification Number (TIN).
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public Form1099W2 recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  /**
   * Recipient name
   * @return recipientName
   */
  @javax.annotation.Nullable
  public String getRecipientName() {
    return recipientName;
  }

  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }


  public Form1099W2 tinType(TinTypeEnum tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * Tax Identification Number (TIN) type.  Available values: - EIN: Employer Identification Number - SSN: Social Security Number - ITIN: Individual Taxpayer Identification Number - ATIN: Adoption Taxpayer Identification Number
   * @return tinType
   */
  @javax.annotation.Nullable
  public TinTypeEnum getTinType() {
    return tinType;
  }

  public void setTinType(TinTypeEnum tinType) {
    this.tinType = tinType;
  }


  public Form1099W2 recipientSecondName(String recipientSecondName) {
    this.recipientSecondName = recipientSecondName;
    return this;
  }

  /**
   * Recipient second name
   * @return recipientSecondName
   */
  @javax.annotation.Nullable
  public String getRecipientSecondName() {
    return recipientSecondName;
  }

  public void setRecipientSecondName(String recipientSecondName) {
    this.recipientSecondName = recipientSecondName;
  }


  public Form1099W2 address(String address) {
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


  public Form1099W2 address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Address line 2.
   * @return address2
   */
  @javax.annotation.Nullable
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public Form1099W2 city(String city) {
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


  public Form1099W2 state(String state) {
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


  public Form1099W2 zip(String zip) {
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


  public Form1099W2 email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Recipient&#39;s Contact email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Form1099W2 accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account number
   * @return accountNumber
   */
  @javax.annotation.Nullable
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public Form1099W2 officeCode(String officeCode) {
    this.officeCode = officeCode;
    return this;
  }

  /**
   * Office code
   * @return officeCode
   */
  @javax.annotation.Nullable
  public String getOfficeCode() {
    return officeCode;
  }

  public void setOfficeCode(String officeCode) {
    this.officeCode = officeCode;
  }


  public Form1099W2 nonUsProvince(String nonUsProvince) {
    this.nonUsProvince = nonUsProvince;
    return this;
  }

  /**
   * Province or region for non-US/CA addresses.
   * @return nonUsProvince
   */
  @javax.annotation.Nullable
  public String getNonUsProvince() {
    return nonUsProvince;
  }

  public void setNonUsProvince(String nonUsProvince) {
    this.nonUsProvince = nonUsProvince;
  }


  public Form1099W2 countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Two-letter IRS country code (e.g., &#39;US&#39;, &#39;CA&#39;), as defined at https://www.irs.gov/e-file-providers/country-codes.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Form1099W2 federalEfileDate(LocalDate federalEfileDate) {
    this.federalEfileDate = federalEfileDate;
    return this;
  }

  /**
   * Date when federal e-filing should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled.
   * @return federalEfileDate
   */
  @javax.annotation.Nullable
  public LocalDate getFederalEfileDate() {
    return federalEfileDate;
  }

  public void setFederalEfileDate(LocalDate federalEfileDate) {
    this.federalEfileDate = federalEfileDate;
  }


  public Form1099W2 postalMail(Boolean postalMail) {
    this.postalMail = postalMail;
    return this;
  }

  /**
   * Boolean indicating that postal mailing to the recipient should be scheduled for this form
   * @return postalMail
   */
  @javax.annotation.Nullable
  public Boolean getPostalMail() {
    return postalMail;
  }

  public void setPostalMail(Boolean postalMail) {
    this.postalMail = postalMail;
  }


  public Form1099W2 stateEfileDate(LocalDate stateEfileDate) {
    this.stateEfileDate = stateEfileDate;
    return this;
  }

  /**
   * Date when state e-filing should be scheduled. Must be on or after federalEfileDate. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled.
   * @return stateEfileDate
   */
  @javax.annotation.Nullable
  public LocalDate getStateEfileDate() {
    return stateEfileDate;
  }

  public void setStateEfileDate(LocalDate stateEfileDate) {
    this.stateEfileDate = stateEfileDate;
  }


  public Form1099W2 recipientEdeliveryDate(LocalDate recipientEdeliveryDate) {
    this.recipientEdeliveryDate = recipientEdeliveryDate;
    return this;
  }

  /**
   * Date when recipient e-delivery should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled.
   * @return recipientEdeliveryDate
   */
  @javax.annotation.Nullable
  public LocalDate getRecipientEdeliveryDate() {
    return recipientEdeliveryDate;
  }

  public void setRecipientEdeliveryDate(LocalDate recipientEdeliveryDate) {
    this.recipientEdeliveryDate = recipientEdeliveryDate;
  }


  public Form1099W2 tinMatch(Boolean tinMatch) {
    this.tinMatch = tinMatch;
    return this;
  }

  /**
   * Boolean indicating that TIN Matching should be scheduled for this form
   * @return tinMatch
   */
  @javax.annotation.Nullable
  public Boolean getTinMatch() {
    return tinMatch;
  }

  public void setTinMatch(Boolean tinMatch) {
    this.tinMatch = tinMatch;
  }


  public Form1099W2 noTin(Boolean noTin) {
    this.noTin = noTin;
    return this;
  }

  /**
   * No TIN indicator
   * @return noTin
   */
  @javax.annotation.Nullable
  public Boolean getNoTin() {
    return noTin;
  }

  public void setNoTin(Boolean noTin) {
    this.noTin = noTin;
  }


  public Form1099W2 addressVerification(Boolean addressVerification) {
    this.addressVerification = addressVerification;
    return this;
  }

  /**
   * Boolean indicating that address verification should be scheduled for this form
   * @return addressVerification
   */
  @javax.annotation.Nullable
  public Boolean getAddressVerification() {
    return addressVerification;
  }

  public void setAddressVerification(Boolean addressVerification) {
    this.addressVerification = addressVerification;
  }


  public Form1099W2 stateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
    return this;
  }

  /**
   * State and local withholding information
   * @return stateAndLocalWithholding
   */
  @javax.annotation.Nullable
  public StateAndLocalWithholding getStateAndLocalWithholding() {
    return stateAndLocalWithholding;
  }

  public void setStateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
  }


  public Form1099W2 secondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
    return this;
  }

  /**
   * Second TIN notice
   * @return secondTinNotice
   */
  @javax.annotation.Nullable
  public Boolean getSecondTinNotice() {
    return secondTinNotice;
  }

  public void setSecondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
  }


  /**
   * Federal e-file status.  Available values:  - unscheduled: Form has not been scheduled for federal e-filing  - scheduled: Form is scheduled for federal e-filing  - airlock: Form is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - sent: Form has been sent to the IRS  - accepted: Form was accepted by the IRS  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlock: Correction is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - corrected: A correction has been sent to the IRS  - corrected_accepted: Correction was accepted by the IRS  - rejected: Form was rejected by the IRS  - corrected_rejected: Correction was rejected by the IRS  - held: Form is held and will not be submitted to IRS (used for certain forms submitted only to states)
   * @return federalEfileStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getFederalEfileStatus() {
    return federalEfileStatus;
  }



  /**
   * State e-file status.  Available values:  - unscheduled: Form has not been scheduled for state e-filing  - scheduled: Form is scheduled for state e-filing  - airlocked: Form is in process of being uploaded to the state  - sent: Form has been sent to the state  - rejected: Form was rejected by the state  - accepted: Form was accepted by the state  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlocked: Correction is in process of being uploaded to the state  - corrected_sent: Correction has been sent to the state  - corrected_rejected: Correction was rejected by the state  - corrected_accepted: Correction was accepted by the state
   * @return stateEfileStatus
   */
  @javax.annotation.Nullable
  public List<StateEfileStatusDetail> getStateEfileStatus() {
    return stateEfileStatus;
  }



  /**
   * Postal mail to recipient status.  Available values:  - unscheduled: Postal mail has not been scheduled  - pending: Postal mail is pending to be sent  - sent: Postal mail has been sent  - delivered: Postal mail has been delivered
   * @return postalMailStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getPostalMailStatus() {
    return postalMailStatus;
  }



  /**
   * TIN Match status.  Available values:  - none: TIN matching has not been performed  - pending: TIN matching request is pending  - matched: Name/TIN combination matches IRS records  - unknown: TIN is missing, invalid, or request contains errors  - rejected: Name/TIN combination does not match IRS records or TIN not currently issued
   * @return tinMatchStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getTinMatchStatus() {
    return tinMatchStatus;
  }



  /**
   * Address verification status.  Available values:  - unknown: Address verification has not been checked  - pending: Address verification is in progress  - failed: Address verification failed  - incomplete: Address verification is incomplete  - unchanged: User declined address changes  - verified: Address has been verified and accepted
   * @return addressVerificationStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getAddressVerificationStatus() {
    return addressVerificationStatus;
  }



  /**
   * EDelivery status.  Available values:  - unscheduled: E-delivery has not been scheduled  - scheduled: E-delivery is scheduled to be sent  - sent: E-delivery has been sent to recipient  - bounced: E-delivery bounced back (invalid email)  - refused: E-delivery was refused by recipient  - bad_verify: E-delivery failed verification  - accepted: E-delivery was accepted by recipient  - bad_verify_limit: E-delivery failed verification limit reached  - second_delivery: Second e-delivery attempt  - undelivered: E-delivery is undelivered (temporary state allowing resend)
   * @return eDeliveryStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail geteDeliveryStatus() {
    return eDeliveryStatus;
  }



  /**
   * Validation errors
   * @return validationErrors
   */
  @javax.annotation.Nullable
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }



  /**
   * Date time when the record was created.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * Date time when the record was last updated.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Form1099W2 instance itself
   */
  public Form1099W2 putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1099W2 form1099W2 = (Form1099W2) o;
    return Objects.equals(this.employeeFirstName, form1099W2.employeeFirstName) &&
        Objects.equals(this.employeeMiddleName, form1099W2.employeeMiddleName) &&
        Objects.equals(this.employeeLastName, form1099W2.employeeLastName) &&
        Objects.equals(this.employeeNameSuffix, form1099W2.employeeNameSuffix) &&
        Objects.equals(this.wages, form1099W2.wages) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099W2.federalIncomeTaxWithheld) &&
        Objects.equals(this.socialSecurityWages, form1099W2.socialSecurityWages) &&
        Objects.equals(this.socialSecurityTaxWithheld, form1099W2.socialSecurityTaxWithheld) &&
        Objects.equals(this.medicareWages, form1099W2.medicareWages) &&
        Objects.equals(this.medicareTaxWithheld, form1099W2.medicareTaxWithheld) &&
        Objects.equals(this.socialSecurityTips, form1099W2.socialSecurityTips) &&
        Objects.equals(this.allocatedTips, form1099W2.allocatedTips) &&
        Objects.equals(this.dependentCareBenefits, form1099W2.dependentCareBenefits) &&
        Objects.equals(this.nonqualifiedPlansSection457, form1099W2.nonqualifiedPlansSection457) &&
        Objects.equals(this.nonqualifiedPlansNotSection457, form1099W2.nonqualifiedPlansNotSection457) &&
        Objects.equals(this.code12a, form1099W2.code12a) &&
        Objects.equals(this.amount12a, form1099W2.amount12a) &&
        Objects.equals(this.code12b, form1099W2.code12b) &&
        Objects.equals(this.amount12b, form1099W2.amount12b) &&
        Objects.equals(this.code12c, form1099W2.code12c) &&
        Objects.equals(this.amount12c, form1099W2.amount12c) &&
        Objects.equals(this.code12d, form1099W2.code12d) &&
        Objects.equals(this.amount12d, form1099W2.amount12d) &&
        Objects.equals(this.statutoryEmployeeIndicator, form1099W2.statutoryEmployeeIndicator) &&
        Objects.equals(this.retirementPlanIndicator, form1099W2.retirementPlanIndicator) &&
        Objects.equals(this.thirdPartySickPayIndicator, form1099W2.thirdPartySickPayIndicator) &&
        Objects.equals(this.thirdPartySickPayWithholding, form1099W2.thirdPartySickPayWithholding) &&
        Objects.equals(this.other14a, form1099W2.other14a) &&
        Objects.equals(this.other14b, form1099W2.other14b) &&
        Objects.equals(this.other14c, form1099W2.other14c) &&
        Objects.equals(this.stateAndLocalWithholdingSecondary, form1099W2.stateAndLocalWithholdingSecondary) &&
        Objects.equals(this.type, form1099W2.type) &&
        Objects.equals(this.id, form1099W2.id) &&
        Objects.equals(this.issuerId, form1099W2.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099W2.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099W2.issuerTin) &&
        Objects.equals(this.taxYear, form1099W2.taxYear) &&
        Objects.equals(this.referenceId, form1099W2.referenceId) &&
        Objects.equals(this.tin, form1099W2.tin) &&
        Objects.equals(this.recipientName, form1099W2.recipientName) &&
        Objects.equals(this.tinType, form1099W2.tinType) &&
        Objects.equals(this.recipientSecondName, form1099W2.recipientSecondName) &&
        Objects.equals(this.address, form1099W2.address) &&
        Objects.equals(this.address2, form1099W2.address2) &&
        Objects.equals(this.city, form1099W2.city) &&
        Objects.equals(this.state, form1099W2.state) &&
        Objects.equals(this.zip, form1099W2.zip) &&
        Objects.equals(this.email, form1099W2.email) &&
        Objects.equals(this.accountNumber, form1099W2.accountNumber) &&
        Objects.equals(this.officeCode, form1099W2.officeCode) &&
        Objects.equals(this.nonUsProvince, form1099W2.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099W2.countryCode) &&
        Objects.equals(this.federalEfileDate, form1099W2.federalEfileDate) &&
        Objects.equals(this.postalMail, form1099W2.postalMail) &&
        Objects.equals(this.stateEfileDate, form1099W2.stateEfileDate) &&
        Objects.equals(this.recipientEdeliveryDate, form1099W2.recipientEdeliveryDate) &&
        Objects.equals(this.tinMatch, form1099W2.tinMatch) &&
        Objects.equals(this.noTin, form1099W2.noTin) &&
        Objects.equals(this.addressVerification, form1099W2.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form1099W2.stateAndLocalWithholding) &&
        Objects.equals(this.secondTinNotice, form1099W2.secondTinNotice) &&
        Objects.equals(this.federalEfileStatus, form1099W2.federalEfileStatus) &&
        Objects.equals(this.stateEfileStatus, form1099W2.stateEfileStatus) &&
        Objects.equals(this.postalMailStatus, form1099W2.postalMailStatus) &&
        Objects.equals(this.tinMatchStatus, form1099W2.tinMatchStatus) &&
        Objects.equals(this.addressVerificationStatus, form1099W2.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form1099W2.eDeliveryStatus) &&
        Objects.equals(this.validationErrors, form1099W2.validationErrors) &&
        Objects.equals(this.createdAt, form1099W2.createdAt) &&
        Objects.equals(this.updatedAt, form1099W2.updatedAt)&&
        Objects.equals(this.additionalProperties, form1099W2.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeFirstName, employeeMiddleName, employeeLastName, employeeNameSuffix, wages, federalIncomeTaxWithheld, socialSecurityWages, socialSecurityTaxWithheld, medicareWages, medicareTaxWithheld, socialSecurityTips, allocatedTips, dependentCareBenefits, nonqualifiedPlansSection457, nonqualifiedPlansNotSection457, code12a, amount12a, code12b, amount12b, code12c, amount12c, code12d, amount12d, statutoryEmployeeIndicator, retirementPlanIndicator, thirdPartySickPayIndicator, thirdPartySickPayWithholding, other14a, other14b, other14c, stateAndLocalWithholdingSecondary, type, id, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, tin, recipientName, tinType, recipientSecondName, address, address2, city, state, zip, email, accountNumber, officeCode, nonUsProvince, countryCode, federalEfileDate, postalMail, stateEfileDate, recipientEdeliveryDate, tinMatch, noTin, addressVerification, stateAndLocalWithholding, secondTinNotice, federalEfileStatus, stateEfileStatus, postalMailStatus, tinMatchStatus, addressVerificationStatus, eDeliveryStatus, validationErrors, createdAt, updatedAt, additionalProperties);
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
    sb.append("class Form1099W2 {\n");
    sb.append("    employeeFirstName: ").append(toIndentedString(employeeFirstName)).append("\n");
    sb.append("    employeeMiddleName: ").append(toIndentedString(employeeMiddleName)).append("\n");
    sb.append("    employeeLastName: ").append(toIndentedString(employeeLastName)).append("\n");
    sb.append("    employeeNameSuffix: ").append(toIndentedString(employeeNameSuffix)).append("\n");
    sb.append("    wages: ").append(toIndentedString(wages)).append("\n");
    sb.append("    federalIncomeTaxWithheld: ").append(toIndentedString(federalIncomeTaxWithheld)).append("\n");
    sb.append("    socialSecurityWages: ").append(toIndentedString(socialSecurityWages)).append("\n");
    sb.append("    socialSecurityTaxWithheld: ").append(toIndentedString(socialSecurityTaxWithheld)).append("\n");
    sb.append("    medicareWages: ").append(toIndentedString(medicareWages)).append("\n");
    sb.append("    medicareTaxWithheld: ").append(toIndentedString(medicareTaxWithheld)).append("\n");
    sb.append("    socialSecurityTips: ").append(toIndentedString(socialSecurityTips)).append("\n");
    sb.append("    allocatedTips: ").append(toIndentedString(allocatedTips)).append("\n");
    sb.append("    dependentCareBenefits: ").append(toIndentedString(dependentCareBenefits)).append("\n");
    sb.append("    nonqualifiedPlansSection457: ").append(toIndentedString(nonqualifiedPlansSection457)).append("\n");
    sb.append("    nonqualifiedPlansNotSection457: ").append(toIndentedString(nonqualifiedPlansNotSection457)).append("\n");
    sb.append("    code12a: ").append(toIndentedString(code12a)).append("\n");
    sb.append("    amount12a: ").append(toIndentedString(amount12a)).append("\n");
    sb.append("    code12b: ").append(toIndentedString(code12b)).append("\n");
    sb.append("    amount12b: ").append(toIndentedString(amount12b)).append("\n");
    sb.append("    code12c: ").append(toIndentedString(code12c)).append("\n");
    sb.append("    amount12c: ").append(toIndentedString(amount12c)).append("\n");
    sb.append("    code12d: ").append(toIndentedString(code12d)).append("\n");
    sb.append("    amount12d: ").append(toIndentedString(amount12d)).append("\n");
    sb.append("    statutoryEmployeeIndicator: ").append(toIndentedString(statutoryEmployeeIndicator)).append("\n");
    sb.append("    retirementPlanIndicator: ").append(toIndentedString(retirementPlanIndicator)).append("\n");
    sb.append("    thirdPartySickPayIndicator: ").append(toIndentedString(thirdPartySickPayIndicator)).append("\n");
    sb.append("    thirdPartySickPayWithholding: ").append(toIndentedString(thirdPartySickPayWithholding)).append("\n");
    sb.append("    other14a: ").append(toIndentedString(other14a)).append("\n");
    sb.append("    other14b: ").append(toIndentedString(other14b)).append("\n");
    sb.append("    other14c: ").append(toIndentedString(other14c)).append("\n");
    sb.append("    stateAndLocalWithholdingSecondary: ").append(toIndentedString(stateAndLocalWithholdingSecondary)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerReferenceId: ").append(toIndentedString(issuerReferenceId)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
    sb.append("    recipientSecondName: ").append(toIndentedString(recipientSecondName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    officeCode: ").append(toIndentedString(officeCode)).append("\n");
    sb.append("    nonUsProvince: ").append(toIndentedString(nonUsProvince)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    federalEfileDate: ").append(toIndentedString(federalEfileDate)).append("\n");
    sb.append("    postalMail: ").append(toIndentedString(postalMail)).append("\n");
    sb.append("    stateEfileDate: ").append(toIndentedString(stateEfileDate)).append("\n");
    sb.append("    recipientEdeliveryDate: ").append(toIndentedString(recipientEdeliveryDate)).append("\n");
    sb.append("    tinMatch: ").append(toIndentedString(tinMatch)).append("\n");
    sb.append("    noTin: ").append(toIndentedString(noTin)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    stateAndLocalWithholding: ").append(toIndentedString(stateAndLocalWithholding)).append("\n");
    sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
    sb.append("    federalEfileStatus: ").append(toIndentedString(federalEfileStatus)).append("\n");
    sb.append("    stateEfileStatus: ").append(toIndentedString(stateEfileStatus)).append("\n");
    sb.append("    postalMailStatus: ").append(toIndentedString(postalMailStatus)).append("\n");
    sb.append("    tinMatchStatus: ").append(toIndentedString(tinMatchStatus)).append("\n");
    sb.append("    addressVerificationStatus: ").append(toIndentedString(addressVerificationStatus)).append("\n");
    sb.append("    eDeliveryStatus: ").append(toIndentedString(eDeliveryStatus)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("issuerId");
    openapiFields.add("issuerReferenceId");
    openapiFields.add("issuerTin");
    openapiFields.add("taxYear");
    openapiFields.add("referenceId");
    openapiFields.add("tin");
    openapiFields.add("recipientName");
    openapiFields.add("tinType");
    openapiFields.add("recipientSecondName");
    openapiFields.add("address");
    openapiFields.add("address2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("email");
    openapiFields.add("accountNumber");
    openapiFields.add("officeCode");
    openapiFields.add("nonUsProvince");
    openapiFields.add("countryCode");
    openapiFields.add("federalEfileDate");
    openapiFields.add("postalMail");
    openapiFields.add("stateEfileDate");
    openapiFields.add("recipientEdeliveryDate");
    openapiFields.add("tinMatch");
    openapiFields.add("noTin");
    openapiFields.add("addressVerification");
    openapiFields.add("stateAndLocalWithholding");
    openapiFields.add("secondTinNotice");
    openapiFields.add("federalEfileStatus");
    openapiFields.add("stateEfileStatus");
    openapiFields.add("postalMailStatus");
    openapiFields.add("tinMatchStatus");
    openapiFields.add("addressVerificationStatus");
    openapiFields.add("eDeliveryStatus");
    openapiFields.add("validationErrors");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("recipientName");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("countryCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1099W2
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099W2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099W2 is not found in the empty JSON string", Form1099W2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1099W2.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("employeeFirstName") != null && !jsonObj.get("employeeFirstName").isJsonNull()) && !jsonObj.get("employeeFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeFirstName").toString()));
      }
      if ((jsonObj.get("employeeMiddleName") != null && !jsonObj.get("employeeMiddleName").isJsonNull()) && !jsonObj.get("employeeMiddleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeMiddleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeMiddleName").toString()));
      }
      if ((jsonObj.get("employeeLastName") != null && !jsonObj.get("employeeLastName").isJsonNull()) && !jsonObj.get("employeeLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeLastName").toString()));
      }
      if ((jsonObj.get("employeeNameSuffix") != null && !jsonObj.get("employeeNameSuffix").isJsonNull()) && !jsonObj.get("employeeNameSuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeNameSuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeNameSuffix").toString()));
      }
      if ((jsonObj.get("code12a") != null && !jsonObj.get("code12a").isJsonNull()) && !jsonObj.get("code12a").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code12a` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code12a").toString()));
      }
      if ((jsonObj.get("code12b") != null && !jsonObj.get("code12b").isJsonNull()) && !jsonObj.get("code12b").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code12b` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code12b").toString()));
      }
      if ((jsonObj.get("code12c") != null && !jsonObj.get("code12c").isJsonNull()) && !jsonObj.get("code12c").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code12c` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code12c").toString()));
      }
      if ((jsonObj.get("code12d") != null && !jsonObj.get("code12d").isJsonNull()) && !jsonObj.get("code12d").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code12d` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code12d").toString()));
      }
      if ((jsonObj.get("other14a") != null && !jsonObj.get("other14a").isJsonNull()) && !jsonObj.get("other14a").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other14a` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other14a").toString()));
      }
      if ((jsonObj.get("other14b") != null && !jsonObj.get("other14b").isJsonNull()) && !jsonObj.get("other14b").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other14b` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other14b").toString()));
      }
      if ((jsonObj.get("other14c") != null && !jsonObj.get("other14c").isJsonNull()) && !jsonObj.get("other14c").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other14c` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other14c").toString()));
      }
      // validate the optional field `stateAndLocalWithholdingSecondary`
      if (jsonObj.get("stateAndLocalWithholdingSecondary") != null && !jsonObj.get("stateAndLocalWithholdingSecondary").isJsonNull()) {
        StateAndLocalWithholding.validateJsonElement(jsonObj.get("stateAndLocalWithholdingSecondary"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
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
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("recipientName") != null && !jsonObj.get("recipientName").isJsonNull()) && !jsonObj.get("recipientName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientName").toString()));
      }
      if ((jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) && !jsonObj.get("tinType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinType").toString()));
      }
      // validate the optional field `tinType`
      if (jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) {
        TinTypeEnum.validateJsonElement(jsonObj.get("tinType"));
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
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonNull()) && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if ((jsonObj.get("officeCode") != null && !jsonObj.get("officeCode").isJsonNull()) && !jsonObj.get("officeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `officeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("officeCode").toString()));
      }
      if ((jsonObj.get("nonUsProvince") != null && !jsonObj.get("nonUsProvince").isJsonNull()) && !jsonObj.get("nonUsProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonUsProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonUsProvince").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholding.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
      }
      // validate the optional field `federalEfileStatus`
      if (jsonObj.get("federalEfileStatus") != null && !jsonObj.get("federalEfileStatus").isJsonNull()) {
        Form1099StatusDetail.validateJsonElement(jsonObj.get("federalEfileStatus"));
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
            StateEfileStatusDetail.validateJsonElement(jsonArraystateEfileStatus.get(i));
          };
        }
      }
      // validate the optional field `postalMailStatus`
      if (jsonObj.get("postalMailStatus") != null && !jsonObj.get("postalMailStatus").isJsonNull()) {
        Form1099StatusDetail.validateJsonElement(jsonObj.get("postalMailStatus"));
      }
      // validate the optional field `tinMatchStatus`
      if (jsonObj.get("tinMatchStatus") != null && !jsonObj.get("tinMatchStatus").isJsonNull()) {
        Form1099StatusDetail.validateJsonElement(jsonObj.get("tinMatchStatus"));
      }
      // validate the optional field `addressVerificationStatus`
      if (jsonObj.get("addressVerificationStatus") != null && !jsonObj.get("addressVerificationStatus").isJsonNull()) {
        Form1099StatusDetail.validateJsonElement(jsonObj.get("addressVerificationStatus"));
      }
      // validate the optional field `eDeliveryStatus`
      if (jsonObj.get("eDeliveryStatus") != null && !jsonObj.get("eDeliveryStatus").isJsonNull()) {
        Form1099StatusDetail.validateJsonElement(jsonObj.get("eDeliveryStatus"));
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
            ValidationError.validateJsonElement(jsonArrayvalidationErrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form1099W2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099W2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099W2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099W2.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099W2>() {
           @Override
           public void write(JsonWriter out, Form1099W2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099W2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Form1099W2 instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099W2 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099W2
   * @throws IOException if the JSON string is invalid with respect to Form1099W2
   */
  public static Form1099W2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099W2.class);
  }

  /**
   * Convert an instance of Form1099W2 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

