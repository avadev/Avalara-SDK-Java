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
 * > **Note:** You must have an active Avalara 1099 & W-9 subscription to authenticate and use these APIs. If you don't have a subscription, please contact our [Sales team](https://www.avalara.com/us/en/products/1099/request-a-demo.html).  ## Authentication  The Avalara 1099 & W-9 API uses **Bearer Token Authentication**. To authenticate, acquire a bearer token using a **Client ID** and **Client Secret** that you generate in the Avalara 1099 & W-9 web application.  The sample cURL commands below use **production** URLs. For **sandbox**, replace them with the sandbox URLs listed in the Sandbox Environment table.  ### Option 1 — Client ID and Client Secret (recommended)  **Step 1: Create API credentials in the Avalara 1099 & W-9 web app**  For a full walkthrough, see the [Avalara 1099 & W-9 integration guide](https://developer.avalara.com/products/avalara-1099-and-w9/integration-guides/1099-and-w-9/siu2796410674799/).  > **Note:** To enable credential creation you must first enter a valid company address in **Account Settings > Account** and enable two-factor authentication in **Account Settings > Security**.  1. In Avalara 1099 & W-9, open **Account Settings** (gear icon, top-right of any page) and select **API**. 2. Click **Create new credentials** (a valid company address and 2FA are required). 3. Copy your **Client Id** and **Client Secret** securely — they will not be shown again after you leave the screen.  **Step 2: Request a bearer token**  ```bash curl -X POST 'https://identity.avalara.com/connect/token' \\   --header 'Content-Type: application/x-www-form-urlencoded' \\   --data-urlencode 'grant_type=client_credentials' \\   --data-urlencode 'client_id={{client_id}}' \\   --data-urlencode 'client_secret={{client_secret}}' ```  ### Option 2 — Account ID and License Key  If your organization already uses other Avalara products (AvaTax, CertCapture) and has access to the logged-in area of Avalara.com, you can generate the bearer token using your **Account ID** and **License Key**.  > **Note:** If you already have a license key for other Avalara products you can reuse it. Generating a new key will reset any previously created key.  1. Log in to Avalara.com. 2. Go to **Settings → License and API Keys**. 3. Click **Generate New Key**. 4. Note your **Account ID** from the Account menu.  ```bash curl -X POST 'https://identity.avalara.com/connect/token' \\   --header 'Content-Type: application/x-www-form-urlencoded' \\   --data-urlencode 'grant_type=client_credentials' \\   --data-urlencode 'client_id={{accountId}}' \\   --data-urlencode 'client_secret={{licenseKey}}' ```  ### Using and renewing the bearer token  Include the token in the `Authorization` header on every request:  ```http Authorization: Bearer {access_token} ```  Tokens expire after the number of seconds in the `expires_in` field of the token response. Your integration must renew the token before it expires.  **Example token response**  ```json {   \"access_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI...\",   \"expires_in\": 3600,   \"token_type\": \"Bearer\",   \"scope\": \"avatax_api iam-ds\" } ```  ### Sandbox Environment  Use the same steps as production, replacing the base URLs:  | Purpose | Production | Sandbox | | --- | --- | --- | | Account & License Key management (web) | `https://www.avalara.com` | `https://sandbox.admin.avalara.com` | | Account & License Key management (API) | `https://rest.avatax.com` | `https://sandbox-rest.avatax.com` | | Token generation | `https://identity.avalara.com` | `https://ai-sbx.avlr.sh` |  ## Environments  #### Production - **Avalara 1099 API URL:** [`https://api.avalara.com/avalara1099`](https://api.avalara.com/avalara1099) - **Identity Token URL:** [`https://identity.avalara.com/connect/token`](https://identity.avalara.com/connect/token)  #### Sandbox - **Avalara 1099 API URL:** [`https://api.sbx.avalara.com/avalara1099`](https://api.sbx.avalara.com/avalara1099) - **Identity Token URL:** [`https://ai-sbx.avlr.sh/connect/token`](https://ai-sbx.avlr.sh/connect/token)  ---  ## API & SDK Documentation  [Avalara 1099 API Reference](https://developer.avalara.com/api-reference/avalara1099/avalara1099/)  [Avalara SDKs](https://developer.avalara.com/sdk/)  [Swagger](https://api.avalara.com/avalara1099/swagger/index.html?api-version=2.0)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import Avalara.SDK.model.A1099.V2.CoveredIndividual;
import Avalara.SDK.model.A1099.V2.Form1099StatusDetail;
import Avalara.SDK.model.A1099.V2.OfferAndCoverage;
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
 * Form 1095-C: Employer-Provided Health Insurance Offer and Coverage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1095C {
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

  public static final String SERIALIZED_NAME_RECIPIENT_DATE_OF_BIRTH = "recipientDateOfBirth";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_DATE_OF_BIRTH)
  private LocalDate recipientDateOfBirth;

  /**
   * Plan start month.  The calendar month during which the plan year begins of the health plan in which the employee is offered coverage (or would be offered coverage if the employee were eligible to participate in the plan).  Available values:  - 00: None  - 01: January  - 02: February  - 03: March  - 04: April  - 05: May  - 06: June  - 07: July  - 08: August  - 09: September  - 10: October  - 11: November  - 12: December
   */
  @JsonAdapter(PlanStartMonthEnum.Adapter.class)
  public enum PlanStartMonthEnum {
    _00("00"),
    
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

    PlanStartMonthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlanStartMonthEnum fromValue(String value) {
      for (PlanStartMonthEnum b : PlanStartMonthEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PlanStartMonthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlanStartMonthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlanStartMonthEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlanStartMonthEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PlanStartMonthEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PLAN_START_MONTH = "planStartMonth";
  @SerializedName(SERIALIZED_NAME_PLAN_START_MONTH)
  private PlanStartMonthEnum planStartMonth;

  public static final String SERIALIZED_NAME_EMPLOYER_PROVIDED_SI_COVERAGE = "employerProvidedSiCoverage";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_PROVIDED_SI_COVERAGE)
  private Boolean employerProvidedSiCoverage;

  public static final String SERIALIZED_NAME_OFFER_AND_COVERAGES = "offerAndCoverages";
  @SerializedName(SERIALIZED_NAME_OFFER_AND_COVERAGES)
  private List<OfferAndCoverage> offerAndCoverages;

  public static final String SERIALIZED_NAME_COVERED_INDIVIDUALS = "coveredIndividuals";
  @SerializedName(SERIALIZED_NAME_COVERED_INDIVIDUALS)
  private List<CoveredIndividual> coveredIndividuals;

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
  @Deprecated
  @SerializedName(SERIALIZED_NAME_RECIPIENT_NAME)
  private String recipientName;

  public static final String SERIALIZED_NAME_RECIPIENT_SECOND_NAME = "recipientSecondName";
  @Deprecated
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

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "addressVerification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private Boolean addressVerification;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholding stateAndLocalWithholding;

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

  public Form1095C() {
  }

  public Form1095C(
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

  public Form1095C employeeFirstName(String employeeFirstName) {
    this.employeeFirstName = employeeFirstName;
    return this;
  }

  /**
   * Employee&#39;s first name
   * @return employeeFirstName
   */
  @javax.annotation.Nullable
  public String getEmployeeFirstName() {
    return employeeFirstName;
  }

  public void setEmployeeFirstName(String employeeFirstName) {
    this.employeeFirstName = employeeFirstName;
  }


  public Form1095C employeeMiddleName(String employeeMiddleName) {
    this.employeeMiddleName = employeeMiddleName;
    return this;
  }

  /**
   * Employee&#39;s middle name
   * @return employeeMiddleName
   */
  @javax.annotation.Nullable
  public String getEmployeeMiddleName() {
    return employeeMiddleName;
  }

  public void setEmployeeMiddleName(String employeeMiddleName) {
    this.employeeMiddleName = employeeMiddleName;
  }


  public Form1095C employeeLastName(String employeeLastName) {
    this.employeeLastName = employeeLastName;
    return this;
  }

  /**
   * Employee&#39;s last name
   * @return employeeLastName
   */
  @javax.annotation.Nullable
  public String getEmployeeLastName() {
    return employeeLastName;
  }

  public void setEmployeeLastName(String employeeLastName) {
    this.employeeLastName = employeeLastName;
  }


  public Form1095C employeeNameSuffix(String employeeNameSuffix) {
    this.employeeNameSuffix = employeeNameSuffix;
    return this;
  }

  /**
   * Employee&#39;s name suffix
   * @return employeeNameSuffix
   */
  @javax.annotation.Nullable
  public String getEmployeeNameSuffix() {
    return employeeNameSuffix;
  }

  public void setEmployeeNameSuffix(String employeeNameSuffix) {
    this.employeeNameSuffix = employeeNameSuffix;
  }


  public Form1095C recipientDateOfBirth(LocalDate recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
    return this;
  }

  /**
   * Recipient&#39;s date of birth
   * @return recipientDateOfBirth
   */
  @javax.annotation.Nullable
  public LocalDate getRecipientDateOfBirth() {
    return recipientDateOfBirth;
  }

  public void setRecipientDateOfBirth(LocalDate recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
  }


  public Form1095C planStartMonth(PlanStartMonthEnum planStartMonth) {
    this.planStartMonth = planStartMonth;
    return this;
  }

  /**
   * Plan start month.  The calendar month during which the plan year begins of the health plan in which the employee is offered coverage (or would be offered coverage if the employee were eligible to participate in the plan).  Available values:  - 00: None  - 01: January  - 02: February  - 03: March  - 04: April  - 05: May  - 06: June  - 07: July  - 08: August  - 09: September  - 10: October  - 11: November  - 12: December
   * @return planStartMonth
   */
  @javax.annotation.Nullable
  public PlanStartMonthEnum getPlanStartMonth() {
    return planStartMonth;
  }

  public void setPlanStartMonth(PlanStartMonthEnum planStartMonth) {
    this.planStartMonth = planStartMonth;
  }


  public Form1095C employerProvidedSiCoverage(Boolean employerProvidedSiCoverage) {
    this.employerProvidedSiCoverage = employerProvidedSiCoverage;
    return this;
  }

  /**
   * Employer provided self-insured coverage
   * @return employerProvidedSiCoverage
   */
  @javax.annotation.Nullable
  public Boolean getEmployerProvidedSiCoverage() {
    return employerProvidedSiCoverage;
  }

  public void setEmployerProvidedSiCoverage(Boolean employerProvidedSiCoverage) {
    this.employerProvidedSiCoverage = employerProvidedSiCoverage;
  }


  public Form1095C offerAndCoverages(List<OfferAndCoverage> offerAndCoverages) {
    this.offerAndCoverages = offerAndCoverages;
    return this;
  }

  public Form1095C addOfferAndCoveragesItem(OfferAndCoverage offerAndCoveragesItem) {
    if (this.offerAndCoverages == null) {
      this.offerAndCoverages = new ArrayList<>();
    }
    this.offerAndCoverages.add(offerAndCoveragesItem);
    return this;
  }

  /**
   * Offer and coverage information
   * @return offerAndCoverages
   */
  @javax.annotation.Nonnull
  public List<OfferAndCoverage> getOfferAndCoverages() {
    return offerAndCoverages;
  }

  public void setOfferAndCoverages(List<OfferAndCoverage> offerAndCoverages) {
    this.offerAndCoverages = offerAndCoverages;
  }


  public Form1095C coveredIndividuals(List<CoveredIndividual> coveredIndividuals) {
    this.coveredIndividuals = coveredIndividuals;
    return this;
  }

  public Form1095C addCoveredIndividualsItem(CoveredIndividual coveredIndividualsItem) {
    if (this.coveredIndividuals == null) {
      this.coveredIndividuals = new ArrayList<>();
    }
    this.coveredIndividuals.add(coveredIndividualsItem);
    return this;
  }

  /**
   * Covered individuals information
   * @return coveredIndividuals
   */
  @javax.annotation.Nullable
  public List<CoveredIndividual> getCoveredIndividuals() {
    return coveredIndividuals;
  }

  public void setCoveredIndividuals(List<CoveredIndividual> coveredIndividuals) {
    this.coveredIndividuals = coveredIndividuals;
  }


  public Form1095C type(TypeEnum type) {
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



  public Form1095C issuerId(String issuerId) {
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


  public Form1095C issuerReferenceId(String issuerReferenceId) {
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


  public Form1095C issuerTin(String issuerTin) {
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


  public Form1095C taxYear(Integer taxYear) {
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


  public Form1095C referenceId(String referenceId) {
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


  public Form1095C tin(String tin) {
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


  @Deprecated
  public Form1095C recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  /**
   * DEPRECATED: Use &#x60;businessName&#x60; for businesses; use &#x60;firstName&#x60;, &#x60;middleName&#x60;, &#x60;lastName&#x60;, and &#x60;suffixName&#x60; for individuals.
   * @return recipientName
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getRecipientName() {
    return recipientName;
  }

  @Deprecated
  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }


  @Deprecated
  public Form1095C recipientSecondName(String recipientSecondName) {
    this.recipientSecondName = recipientSecondName;
    return this;
  }

  /**
   * DEPRECATED: Use &#x60;businessName2&#x60; instead.
   * @return recipientSecondName
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getRecipientSecondName() {
    return recipientSecondName;
  }

  @Deprecated
  public void setRecipientSecondName(String recipientSecondName) {
    this.recipientSecondName = recipientSecondName;
  }


  public Form1095C address(String address) {
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


  public Form1095C address2(String address2) {
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


  public Form1095C city(String city) {
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


  public Form1095C state(String state) {
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


  public Form1095C zip(String zip) {
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


  public Form1095C email(String email) {
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


  public Form1095C nonUsProvince(String nonUsProvince) {
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


  public Form1095C countryCode(String countryCode) {
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


  public Form1095C federalEfileDate(LocalDate federalEfileDate) {
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


  public Form1095C postalMail(Boolean postalMail) {
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


  public Form1095C stateEfileDate(LocalDate stateEfileDate) {
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


  public Form1095C recipientEdeliveryDate(LocalDate recipientEdeliveryDate) {
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


  public Form1095C tinMatch(Boolean tinMatch) {
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


  public Form1095C addressVerification(Boolean addressVerification) {
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


  public Form1095C stateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
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
   * @return the Form1095C instance itself
   */
  public Form1095C putAdditionalProperty(String key, Object value) {
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
    Form1095C form1095C = (Form1095C) o;
    return Objects.equals(this.employeeFirstName, form1095C.employeeFirstName) &&
        Objects.equals(this.employeeMiddleName, form1095C.employeeMiddleName) &&
        Objects.equals(this.employeeLastName, form1095C.employeeLastName) &&
        Objects.equals(this.employeeNameSuffix, form1095C.employeeNameSuffix) &&
        Objects.equals(this.recipientDateOfBirth, form1095C.recipientDateOfBirth) &&
        Objects.equals(this.planStartMonth, form1095C.planStartMonth) &&
        Objects.equals(this.employerProvidedSiCoverage, form1095C.employerProvidedSiCoverage) &&
        Objects.equals(this.offerAndCoverages, form1095C.offerAndCoverages) &&
        Objects.equals(this.coveredIndividuals, form1095C.coveredIndividuals) &&
        Objects.equals(this.type, form1095C.type) &&
        Objects.equals(this.id, form1095C.id) &&
        Objects.equals(this.issuerId, form1095C.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1095C.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1095C.issuerTin) &&
        Objects.equals(this.taxYear, form1095C.taxYear) &&
        Objects.equals(this.referenceId, form1095C.referenceId) &&
        Objects.equals(this.tin, form1095C.tin) &&
        Objects.equals(this.recipientName, form1095C.recipientName) &&
        Objects.equals(this.recipientSecondName, form1095C.recipientSecondName) &&
        Objects.equals(this.address, form1095C.address) &&
        Objects.equals(this.address2, form1095C.address2) &&
        Objects.equals(this.city, form1095C.city) &&
        Objects.equals(this.state, form1095C.state) &&
        Objects.equals(this.zip, form1095C.zip) &&
        Objects.equals(this.email, form1095C.email) &&
        Objects.equals(this.nonUsProvince, form1095C.nonUsProvince) &&
        Objects.equals(this.countryCode, form1095C.countryCode) &&
        Objects.equals(this.federalEfileDate, form1095C.federalEfileDate) &&
        Objects.equals(this.postalMail, form1095C.postalMail) &&
        Objects.equals(this.stateEfileDate, form1095C.stateEfileDate) &&
        Objects.equals(this.recipientEdeliveryDate, form1095C.recipientEdeliveryDate) &&
        Objects.equals(this.tinMatch, form1095C.tinMatch) &&
        Objects.equals(this.addressVerification, form1095C.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form1095C.stateAndLocalWithholding) &&
        Objects.equals(this.federalEfileStatus, form1095C.federalEfileStatus) &&
        Objects.equals(this.stateEfileStatus, form1095C.stateEfileStatus) &&
        Objects.equals(this.postalMailStatus, form1095C.postalMailStatus) &&
        Objects.equals(this.tinMatchStatus, form1095C.tinMatchStatus) &&
        Objects.equals(this.addressVerificationStatus, form1095C.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form1095C.eDeliveryStatus) &&
        Objects.equals(this.validationErrors, form1095C.validationErrors) &&
        Objects.equals(this.createdAt, form1095C.createdAt) &&
        Objects.equals(this.updatedAt, form1095C.updatedAt)&&
        Objects.equals(this.additionalProperties, form1095C.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeFirstName, employeeMiddleName, employeeLastName, employeeNameSuffix, recipientDateOfBirth, planStartMonth, employerProvidedSiCoverage, offerAndCoverages, coveredIndividuals, type, id, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, tin, recipientName, recipientSecondName, address, address2, city, state, zip, email, nonUsProvince, countryCode, federalEfileDate, postalMail, stateEfileDate, recipientEdeliveryDate, tinMatch, addressVerification, stateAndLocalWithholding, federalEfileStatus, stateEfileStatus, postalMailStatus, tinMatchStatus, addressVerificationStatus, eDeliveryStatus, validationErrors, createdAt, updatedAt, additionalProperties);
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
    sb.append("class Form1095C {\n");
    sb.append("    employeeFirstName: ").append(toIndentedString(employeeFirstName)).append("\n");
    sb.append("    employeeMiddleName: ").append(toIndentedString(employeeMiddleName)).append("\n");
    sb.append("    employeeLastName: ").append(toIndentedString(employeeLastName)).append("\n");
    sb.append("    employeeNameSuffix: ").append(toIndentedString(employeeNameSuffix)).append("\n");
    sb.append("    recipientDateOfBirth: ").append(toIndentedString(recipientDateOfBirth)).append("\n");
    sb.append("    planStartMonth: ").append(toIndentedString(planStartMonth)).append("\n");
    sb.append("    employerProvidedSiCoverage: ").append(toIndentedString(employerProvidedSiCoverage)).append("\n");
    sb.append("    offerAndCoverages: ").append(toIndentedString(offerAndCoverages)).append("\n");
    sb.append("    coveredIndividuals: ").append(toIndentedString(coveredIndividuals)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerReferenceId: ").append(toIndentedString(issuerReferenceId)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientSecondName: ").append(toIndentedString(recipientSecondName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nonUsProvince: ").append(toIndentedString(nonUsProvince)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    federalEfileDate: ").append(toIndentedString(federalEfileDate)).append("\n");
    sb.append("    postalMail: ").append(toIndentedString(postalMail)).append("\n");
    sb.append("    stateEfileDate: ").append(toIndentedString(stateEfileDate)).append("\n");
    sb.append("    recipientEdeliveryDate: ").append(toIndentedString(recipientEdeliveryDate)).append("\n");
    sb.append("    tinMatch: ").append(toIndentedString(tinMatch)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    stateAndLocalWithholding: ").append(toIndentedString(stateAndLocalWithholding)).append("\n");
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
    openapiFields.add("recipientSecondName");
    openapiFields.add("address");
    openapiFields.add("address2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("email");
    openapiFields.add("nonUsProvince");
    openapiFields.add("countryCode");
    openapiFields.add("federalEfileDate");
    openapiFields.add("postalMail");
    openapiFields.add("stateEfileDate");
    openapiFields.add("recipientEdeliveryDate");
    openapiFields.add("tinMatch");
    openapiFields.add("addressVerification");
    openapiFields.add("stateAndLocalWithholding");
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
    openapiRequiredFields.add("employeeFirstName");
    openapiRequiredFields.add("employeeLastName");
    openapiRequiredFields.add("planStartMonth");
    openapiRequiredFields.add("offerAndCoverages");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("countryCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1095C
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1095C.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1095C is not found in the empty JSON string", Form1095C.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1095C.openapiRequiredFields) {
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
      if ((jsonObj.get("planStartMonth") != null && !jsonObj.get("planStartMonth").isJsonNull()) && !jsonObj.get("planStartMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planStartMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planStartMonth").toString()));
      }
      // validate the required field `planStartMonth`
      PlanStartMonthEnum.validateJsonElement(jsonObj.get("planStartMonth"));
      // ensure the json data is an array
      if (!jsonObj.get("offerAndCoverages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `offerAndCoverages` to be an array in the JSON string but got `%s`", jsonObj.get("offerAndCoverages").toString()));
      }

      JsonArray jsonArrayofferAndCoverages = jsonObj.getAsJsonArray("offerAndCoverages");
      // validate the required field `offerAndCoverages` (array)
      for (int i = 0; i < jsonArrayofferAndCoverages.size(); i++) {
        OfferAndCoverage.validateJsonElement(jsonArrayofferAndCoverages.get(i));
      };
      if (jsonObj.get("coveredIndividuals") != null && !jsonObj.get("coveredIndividuals").isJsonNull()) {
        JsonArray jsonArraycoveredIndividuals = jsonObj.getAsJsonArray("coveredIndividuals");
        if (jsonArraycoveredIndividuals != null) {
          // ensure the json data is an array
          if (!jsonObj.get("coveredIndividuals").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `coveredIndividuals` to be an array in the JSON string but got `%s`", jsonObj.get("coveredIndividuals").toString()));
          }

          // validate the optional field `coveredIndividuals` (array)
          for (int i = 0; i < jsonArraycoveredIndividuals.size(); i++) {
            CoveredIndividual.validateJsonElement(jsonArraycoveredIndividuals.get(i));
          };
        }
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
       if (!Form1095C.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1095C' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1095C> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1095C.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1095C>() {
           @Override
           public void write(JsonWriter out, Form1095C value) throws IOException {
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
           public Form1095C read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Form1095C instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of Form1095C given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1095C
   * @throws IOException if the JSON string is invalid with respect to Form1095C
   */
  public static Form1095C fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1095C.class);
  }

  /**
   * Convert an instance of Form1095C to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

