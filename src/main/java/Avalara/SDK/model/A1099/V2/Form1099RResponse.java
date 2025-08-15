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
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholdingResponse;
import Avalara.SDK.model.A1099.V2.StateEfileStatusDetailResponse;
import Avalara.SDK.model.A1099.V2.StatusDetail;
import Avalara.SDK.model.A1099.V2.ValidationErrorResponse;
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
 * Form1099RResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099RResponse {
  public static final String SERIALIZED_NAME_GROSS_DISTRIBUTION = "grossDistribution";
  @SerializedName(SERIALIZED_NAME_GROSS_DISTRIBUTION)
  private Double grossDistribution;

  public static final String SERIALIZED_NAME_TAXABLE_AMOUNT = "taxableAmount";
  @SerializedName(SERIALIZED_NAME_TAXABLE_AMOUNT)
  private Double taxableAmount;

  public static final String SERIALIZED_NAME_TAXABLE_AMOUNT_NOT_DETERMINED = "taxableAmountNotDetermined";
  @SerializedName(SERIALIZED_NAME_TAXABLE_AMOUNT_NOT_DETERMINED)
  private Boolean taxableAmountNotDetermined;

  public static final String SERIALIZED_NAME_TOTAL_DISTRIBUTION_DETERMINED = "totalDistributionDetermined";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISTRIBUTION_DETERMINED)
  private Boolean totalDistributionDetermined;

  public static final String SERIALIZED_NAME_CAPITAL_GAIN = "capitalGain";
  @SerializedName(SERIALIZED_NAME_CAPITAL_GAIN)
  private Double capitalGain;

  public static final String SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD = "federalIncomeTaxWithheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD)
  private Double federalIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_EMPLOYEE_CONTRIBUTIONS_OR_DESIGNATED_ROTH_OR_INSURANCE_PREMIUMS = "employeeContributionsOrDesignatedRothOrInsurancePremiums";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_CONTRIBUTIONS_OR_DESIGNATED_ROTH_OR_INSURANCE_PREMIUMS)
  private Double employeeContributionsOrDesignatedRothOrInsurancePremiums;

  public static final String SERIALIZED_NAME_NET_UNREALIZED_APPRECIATION_IN_EMPLOYER_SECURITIES = "netUnrealizedAppreciationInEmployerSecurities";
  @SerializedName(SERIALIZED_NAME_NET_UNREALIZED_APPRECIATION_IN_EMPLOYER_SECURITIES)
  private Double netUnrealizedAppreciationInEmployerSecurities;

  public static final String SERIALIZED_NAME_DISTRIBUTION_CODE = "distributionCode";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_CODE)
  private String distributionCode;

  public static final String SERIALIZED_NAME_SECOND_DISTRIBUTION_CODE = "secondDistributionCode";
  @SerializedName(SERIALIZED_NAME_SECOND_DISTRIBUTION_CODE)
  private String secondDistributionCode;

  public static final String SERIALIZED_NAME_IRA_SEP_SIMPLE = "iraSepSimple";
  @SerializedName(SERIALIZED_NAME_IRA_SEP_SIMPLE)
  private Boolean iraSepSimple;

  public static final String SERIALIZED_NAME_TRADITIONAL_IRA_SEP_SIMPLE_OR_ROTH_CONVERSION_AMOUNT = "traditionalIraSepSimpleOrRothConversionAmount";
  @SerializedName(SERIALIZED_NAME_TRADITIONAL_IRA_SEP_SIMPLE_OR_ROTH_CONVERSION_AMOUNT)
  private Double traditionalIraSepSimpleOrRothConversionAmount;

  public static final String SERIALIZED_NAME_OTHER_AMOUNT = "otherAmount";
  @SerializedName(SERIALIZED_NAME_OTHER_AMOUNT)
  private Double otherAmount;

  public static final String SERIALIZED_NAME_OTHER_PERCENTAGE = "otherPercentage";
  @SerializedName(SERIALIZED_NAME_OTHER_PERCENTAGE)
  private String otherPercentage;

  public static final String SERIALIZED_NAME_TOTAL_DISTRIBUTION_PERCENTAGE = "totalDistributionPercentage";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISTRIBUTION_PERCENTAGE)
  private String totalDistributionPercentage;

  public static final String SERIALIZED_NAME_TOTAL_EMPLOYEE_CONTRIBUTIONS = "totalEmployeeContributions";
  @SerializedName(SERIALIZED_NAME_TOTAL_EMPLOYEE_CONTRIBUTIONS)
  private Double totalEmployeeContributions;

  public static final String SERIALIZED_NAME_AMOUNT_ALLOCABLE_TO_IRR_WITHIN5_YEARS = "amountAllocableToIrrWithin5Years";
  @SerializedName(SERIALIZED_NAME_AMOUNT_ALLOCABLE_TO_IRR_WITHIN5_YEARS)
  private Double amountAllocableToIrrWithin5Years;

  public static final String SERIALIZED_NAME_FIRST_YEAR_OF_DESIGNATED_ROTH_CONTRIBUTION = "firstYearOfDesignatedRothContribution";
  @SerializedName(SERIALIZED_NAME_FIRST_YEAR_OF_DESIGNATED_ROTH_CONTRIBUTION)
  private String firstYearOfDesignatedRothContribution;

  public static final String SERIALIZED_NAME_FATCA_FILING_REQUIREMENT = "fatcaFilingRequirement";
  @SerializedName(SERIALIZED_NAME_FATCA_FILING_REQUIREMENT)
  private Boolean fatcaFilingRequirement;

  public static final String SERIALIZED_NAME_DATE_OF_PAYMENT = "dateOfPayment";
  @SerializedName(SERIALIZED_NAME_DATE_OF_PAYMENT)
  private OffsetDateTime dateOfPayment;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    _1099_NEC("1099-NEC"),
    
    _1099_MISC("1099-MISC"),
    
    _1099_DIV("1099-DIV"),
    
    _1099_R("1099-R"),
    
    _1099_K("1099-K"),
    
    _1095_B("1095-B"),
    
    _1042_S("1042-S"),
    
    _1095_C("1095-C"),
    
    _1099_INT("1099-INT");

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

  public static final String SERIALIZED_NAME_NO_TIN = "noTin";
  @SerializedName(SERIALIZED_NAME_NO_TIN)
  private Boolean noTin;

  public static final String SERIALIZED_NAME_SECOND_TIN_NOTICE = "secondTinNotice";
  @SerializedName(SERIALIZED_NAME_SECOND_TIN_NOTICE)
  private Boolean secondTinNotice;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "addressVerification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private Boolean addressVerification;

  public static final String SERIALIZED_NAME_FEDERAL_EFILE_STATUS = "federalEfileStatus";
  @SerializedName(SERIALIZED_NAME_FEDERAL_EFILE_STATUS)
  private StatusDetail federalEfileStatus;

  public static final String SERIALIZED_NAME_E_DELIVERY_STATUS = "eDeliveryStatus";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_STATUS)
  private StatusDetail eDeliveryStatus;

  public static final String SERIALIZED_NAME_STATE_EFILE_STATUS = "stateEfileStatus";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE_STATUS)
  private List<StateEfileStatusDetailResponse> stateEfileStatus;

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
  private List<ValidationErrorResponse> validationErrors;

  public Form1099RResponse() {
  }

  public Form1099RResponse(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  public Form1099RResponse grossDistribution(Double grossDistribution) {
    this.grossDistribution = grossDistribution;
    return this;
  }

  /**
   * Gross distribution
   * @return grossDistribution
   */
  @javax.annotation.Nullable
  public Double getGrossDistribution() {
    return grossDistribution;
  }

  public void setGrossDistribution(Double grossDistribution) {
    this.grossDistribution = grossDistribution;
  }


  public Form1099RResponse taxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * Taxable amount
   * @return taxableAmount
   */
  @javax.annotation.Nullable
  public Double getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
  }


  public Form1099RResponse taxableAmountNotDetermined(Boolean taxableAmountNotDetermined) {
    this.taxableAmountNotDetermined = taxableAmountNotDetermined;
    return this;
  }

  /**
   * Taxable amount not determined
   * @return taxableAmountNotDetermined
   */
  @javax.annotation.Nullable
  public Boolean getTaxableAmountNotDetermined() {
    return taxableAmountNotDetermined;
  }

  public void setTaxableAmountNotDetermined(Boolean taxableAmountNotDetermined) {
    this.taxableAmountNotDetermined = taxableAmountNotDetermined;
  }


  public Form1099RResponse totalDistributionDetermined(Boolean totalDistributionDetermined) {
    this.totalDistributionDetermined = totalDistributionDetermined;
    return this;
  }

  /**
   * Total distribution
   * @return totalDistributionDetermined
   */
  @javax.annotation.Nullable
  public Boolean getTotalDistributionDetermined() {
    return totalDistributionDetermined;
  }

  public void setTotalDistributionDetermined(Boolean totalDistributionDetermined) {
    this.totalDistributionDetermined = totalDistributionDetermined;
  }


  public Form1099RResponse capitalGain(Double capitalGain) {
    this.capitalGain = capitalGain;
    return this;
  }

  /**
   * Capital gain (included in Box 2a)
   * @return capitalGain
   */
  @javax.annotation.Nullable
  public Double getCapitalGain() {
    return capitalGain;
  }

  public void setCapitalGain(Double capitalGain) {
    this.capitalGain = capitalGain;
  }


  public Form1099RResponse federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
    return this;
  }

  /**
   * Federal income tax withheld
   * @return federalIncomeTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getFederalIncomeTaxWithheld() {
    return federalIncomeTaxWithheld;
  }

  public void setFederalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
  }


  public Form1099RResponse employeeContributionsOrDesignatedRothOrInsurancePremiums(Double employeeContributionsOrDesignatedRothOrInsurancePremiums) {
    this.employeeContributionsOrDesignatedRothOrInsurancePremiums = employeeContributionsOrDesignatedRothOrInsurancePremiums;
    return this;
  }

  /**
   * Employee contributions/Designated Roth contributions or insurance premiums
   * @return employeeContributionsOrDesignatedRothOrInsurancePremiums
   */
  @javax.annotation.Nullable
  public Double getEmployeeContributionsOrDesignatedRothOrInsurancePremiums() {
    return employeeContributionsOrDesignatedRothOrInsurancePremiums;
  }

  public void setEmployeeContributionsOrDesignatedRothOrInsurancePremiums(Double employeeContributionsOrDesignatedRothOrInsurancePremiums) {
    this.employeeContributionsOrDesignatedRothOrInsurancePremiums = employeeContributionsOrDesignatedRothOrInsurancePremiums;
  }


  public Form1099RResponse netUnrealizedAppreciationInEmployerSecurities(Double netUnrealizedAppreciationInEmployerSecurities) {
    this.netUnrealizedAppreciationInEmployerSecurities = netUnrealizedAppreciationInEmployerSecurities;
    return this;
  }

  /**
   * Net unrealized appreciation in employer&#39;s securities
   * @return netUnrealizedAppreciationInEmployerSecurities
   */
  @javax.annotation.Nullable
  public Double getNetUnrealizedAppreciationInEmployerSecurities() {
    return netUnrealizedAppreciationInEmployerSecurities;
  }

  public void setNetUnrealizedAppreciationInEmployerSecurities(Double netUnrealizedAppreciationInEmployerSecurities) {
    this.netUnrealizedAppreciationInEmployerSecurities = netUnrealizedAppreciationInEmployerSecurities;
  }


  public Form1099RResponse distributionCode(String distributionCode) {
    this.distributionCode = distributionCode;
    return this;
  }

  /**
   * Distribution code
   * @return distributionCode
   */
  @javax.annotation.Nullable
  public String getDistributionCode() {
    return distributionCode;
  }

  public void setDistributionCode(String distributionCode) {
    this.distributionCode = distributionCode;
  }


  public Form1099RResponse secondDistributionCode(String secondDistributionCode) {
    this.secondDistributionCode = secondDistributionCode;
    return this;
  }

  /**
   * Second distribution code
   * @return secondDistributionCode
   */
  @javax.annotation.Nullable
  public String getSecondDistributionCode() {
    return secondDistributionCode;
  }

  public void setSecondDistributionCode(String secondDistributionCode) {
    this.secondDistributionCode = secondDistributionCode;
  }


  public Form1099RResponse iraSepSimple(Boolean iraSepSimple) {
    this.iraSepSimple = iraSepSimple;
    return this;
  }

  /**
   * IRA/SEP/SIMPLE
   * @return iraSepSimple
   */
  @javax.annotation.Nullable
  public Boolean getIraSepSimple() {
    return iraSepSimple;
  }

  public void setIraSepSimple(Boolean iraSepSimple) {
    this.iraSepSimple = iraSepSimple;
  }


  public Form1099RResponse traditionalIraSepSimpleOrRothConversionAmount(Double traditionalIraSepSimpleOrRothConversionAmount) {
    this.traditionalIraSepSimpleOrRothConversionAmount = traditionalIraSepSimpleOrRothConversionAmount;
    return this;
  }

  /**
   * Traditional IRA/SEP/SIMPLE or Roth conversion amount
   * @return traditionalIraSepSimpleOrRothConversionAmount
   */
  @javax.annotation.Nullable
  public Double getTraditionalIraSepSimpleOrRothConversionAmount() {
    return traditionalIraSepSimpleOrRothConversionAmount;
  }

  public void setTraditionalIraSepSimpleOrRothConversionAmount(Double traditionalIraSepSimpleOrRothConversionAmount) {
    this.traditionalIraSepSimpleOrRothConversionAmount = traditionalIraSepSimpleOrRothConversionAmount;
  }


  public Form1099RResponse otherAmount(Double otherAmount) {
    this.otherAmount = otherAmount;
    return this;
  }

  /**
   * Other amount
   * @return otherAmount
   */
  @javax.annotation.Nullable
  public Double getOtherAmount() {
    return otherAmount;
  }

  public void setOtherAmount(Double otherAmount) {
    this.otherAmount = otherAmount;
  }


  public Form1099RResponse otherPercentage(String otherPercentage) {
    this.otherPercentage = otherPercentage;
    return this;
  }

  /**
   * Other percentage
   * @return otherPercentage
   */
  @javax.annotation.Nullable
  public String getOtherPercentage() {
    return otherPercentage;
  }

  public void setOtherPercentage(String otherPercentage) {
    this.otherPercentage = otherPercentage;
  }


  public Form1099RResponse totalDistributionPercentage(String totalDistributionPercentage) {
    this.totalDistributionPercentage = totalDistributionPercentage;
    return this;
  }

  /**
   * Total distribution percentage
   * @return totalDistributionPercentage
   */
  @javax.annotation.Nullable
  public String getTotalDistributionPercentage() {
    return totalDistributionPercentage;
  }

  public void setTotalDistributionPercentage(String totalDistributionPercentage) {
    this.totalDistributionPercentage = totalDistributionPercentage;
  }


  public Form1099RResponse totalEmployeeContributions(Double totalEmployeeContributions) {
    this.totalEmployeeContributions = totalEmployeeContributions;
    return this;
  }

  /**
   * Total employee contributions
   * @return totalEmployeeContributions
   */
  @javax.annotation.Nullable
  public Double getTotalEmployeeContributions() {
    return totalEmployeeContributions;
  }

  public void setTotalEmployeeContributions(Double totalEmployeeContributions) {
    this.totalEmployeeContributions = totalEmployeeContributions;
  }


  public Form1099RResponse amountAllocableToIrrWithin5Years(Double amountAllocableToIrrWithin5Years) {
    this.amountAllocableToIrrWithin5Years = amountAllocableToIrrWithin5Years;
    return this;
  }

  /**
   * Amount allocable to IRR within 5 years
   * @return amountAllocableToIrrWithin5Years
   */
  @javax.annotation.Nullable
  public Double getAmountAllocableToIrrWithin5Years() {
    return amountAllocableToIrrWithin5Years;
  }

  public void setAmountAllocableToIrrWithin5Years(Double amountAllocableToIrrWithin5Years) {
    this.amountAllocableToIrrWithin5Years = amountAllocableToIrrWithin5Years;
  }


  public Form1099RResponse firstYearOfDesignatedRothContribution(String firstYearOfDesignatedRothContribution) {
    this.firstYearOfDesignatedRothContribution = firstYearOfDesignatedRothContribution;
    return this;
  }

  /**
   * First year of designated Roth contribution
   * @return firstYearOfDesignatedRothContribution
   */
  @javax.annotation.Nullable
  public String getFirstYearOfDesignatedRothContribution() {
    return firstYearOfDesignatedRothContribution;
  }

  public void setFirstYearOfDesignatedRothContribution(String firstYearOfDesignatedRothContribution) {
    this.firstYearOfDesignatedRothContribution = firstYearOfDesignatedRothContribution;
  }


  public Form1099RResponse fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
    this.fatcaFilingRequirement = fatcaFilingRequirement;
    return this;
  }

  /**
   * FATCA filing requirement
   * @return fatcaFilingRequirement
   */
  @javax.annotation.Nullable
  public Boolean getFatcaFilingRequirement() {
    return fatcaFilingRequirement;
  }

  public void setFatcaFilingRequirement(Boolean fatcaFilingRequirement) {
    this.fatcaFilingRequirement = fatcaFilingRequirement;
  }


  public Form1099RResponse dateOfPayment(OffsetDateTime dateOfPayment) {
    this.dateOfPayment = dateOfPayment;
    return this;
  }

  /**
   * Date of payment
   * @return dateOfPayment
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateOfPayment() {
    return dateOfPayment;
  }

  public void setDateOfPayment(OffsetDateTime dateOfPayment) {
    this.dateOfPayment = dateOfPayment;
  }


  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }



  public Form1099RResponse createdAt(OffsetDateTime createdAt) {
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


  public Form1099RResponse updatedAt(OffsetDateTime updatedAt) {
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


  public Form1099RResponse stateAndLocalWithholding(StateAndLocalWithholdingResponse stateAndLocalWithholding) {
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


  public Form1099RResponse tinType(TinTypeEnum tinType) {
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


  public Form1099RResponse id(String id) {
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


  public Form1099RResponse issuerId(String issuerId) {
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


  public Form1099RResponse issuerReferenceId(String issuerReferenceId) {
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


  public Form1099RResponse issuerTin(String issuerTin) {
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


  public Form1099RResponse taxYear(Integer taxYear) {
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


  public Form1099RResponse referenceId(String referenceId) {
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


  public Form1099RResponse recipientName(String recipientName) {
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


  public Form1099RResponse recipientTin(String recipientTin) {
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


  public Form1099RResponse recipientSecondName(String recipientSecondName) {
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


  public Form1099RResponse address(String address) {
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


  public Form1099RResponse address2(String address2) {
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


  public Form1099RResponse city(String city) {
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


  public Form1099RResponse state(String state) {
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


  public Form1099RResponse zip(String zip) {
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


  public Form1099RResponse email(String email) {
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


  public Form1099RResponse accountNumber(String accountNumber) {
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


  public Form1099RResponse officeCode(String officeCode) {
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


  public Form1099RResponse nonUsProvince(String nonUsProvince) {
    this.nonUsProvince = nonUsProvince;
    return this;
  }

  /**
   * Get nonUsProvince
   * @return nonUsProvince
   */
  @javax.annotation.Nullable
  public String getNonUsProvince() {
    return nonUsProvince;
  }

  public void setNonUsProvince(String nonUsProvince) {
    this.nonUsProvince = nonUsProvince;
  }


  public Form1099RResponse countryCode(String countryCode) {
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


  public Form1099RResponse federalEFile(Boolean federalEFile) {
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


  public Form1099RResponse postalMail(Boolean postalMail) {
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


  public Form1099RResponse stateEFile(Boolean stateEFile) {
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


  public Form1099RResponse tinMatch(Boolean tinMatch) {
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


  public Form1099RResponse noTin(Boolean noTin) {
    this.noTin = noTin;
    return this;
  }

  /**
   * Get noTin
   * @return noTin
   */
  @javax.annotation.Nullable
  public Boolean getNoTin() {
    return noTin;
  }

  public void setNoTin(Boolean noTin) {
    this.noTin = noTin;
  }


  public Form1099RResponse secondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
    return this;
  }

  /**
   * Get secondTinNotice
   * @return secondTinNotice
   */
  @javax.annotation.Nullable
  public Boolean getSecondTinNotice() {
    return secondTinNotice;
  }

  public void setSecondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
  }


  public Form1099RResponse addressVerification(Boolean addressVerification) {
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


  public Form1099RResponse federalEfileStatus(StatusDetail federalEfileStatus) {
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


  public Form1099RResponse eDeliveryStatus(StatusDetail eDeliveryStatus) {
    this.eDeliveryStatus = eDeliveryStatus;
    return this;
  }

  /**
   * Get eDeliveryStatus
   * @return eDeliveryStatus
   */
  @javax.annotation.Nullable
  public StatusDetail geteDeliveryStatus() {
    return eDeliveryStatus;
  }

  public void seteDeliveryStatus(StatusDetail eDeliveryStatus) {
    this.eDeliveryStatus = eDeliveryStatus;
  }


  public Form1099RResponse stateEfileStatus(List<StateEfileStatusDetailResponse> stateEfileStatus) {
    this.stateEfileStatus = stateEfileStatus;
    return this;
  }

  public Form1099RResponse addStateEfileStatusItem(StateEfileStatusDetailResponse stateEfileStatusItem) {
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
  public List<StateEfileStatusDetailResponse> getStateEfileStatus() {
    return stateEfileStatus;
  }

  public void setStateEfileStatus(List<StateEfileStatusDetailResponse> stateEfileStatus) {
    this.stateEfileStatus = stateEfileStatus;
  }


  public Form1099RResponse postalMailStatus(StatusDetail postalMailStatus) {
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


  public Form1099RResponse tinMatchStatus(StatusDetail tinMatchStatus) {
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


  public Form1099RResponse addressVerificationStatus(StatusDetail addressVerificationStatus) {
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


  public Form1099RResponse validationErrors(List<ValidationErrorResponse> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Form1099RResponse addValidationErrorsItem(ValidationErrorResponse validationErrorsItem) {
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
  public List<ValidationErrorResponse> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationErrorResponse> validationErrors) {
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
    Form1099RResponse form1099RResponse = (Form1099RResponse) o;
    return Objects.equals(this.grossDistribution, form1099RResponse.grossDistribution) &&
        Objects.equals(this.taxableAmount, form1099RResponse.taxableAmount) &&
        Objects.equals(this.taxableAmountNotDetermined, form1099RResponse.taxableAmountNotDetermined) &&
        Objects.equals(this.totalDistributionDetermined, form1099RResponse.totalDistributionDetermined) &&
        Objects.equals(this.capitalGain, form1099RResponse.capitalGain) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099RResponse.federalIncomeTaxWithheld) &&
        Objects.equals(this.employeeContributionsOrDesignatedRothOrInsurancePremiums, form1099RResponse.employeeContributionsOrDesignatedRothOrInsurancePremiums) &&
        Objects.equals(this.netUnrealizedAppreciationInEmployerSecurities, form1099RResponse.netUnrealizedAppreciationInEmployerSecurities) &&
        Objects.equals(this.distributionCode, form1099RResponse.distributionCode) &&
        Objects.equals(this.secondDistributionCode, form1099RResponse.secondDistributionCode) &&
        Objects.equals(this.iraSepSimple, form1099RResponse.iraSepSimple) &&
        Objects.equals(this.traditionalIraSepSimpleOrRothConversionAmount, form1099RResponse.traditionalIraSepSimpleOrRothConversionAmount) &&
        Objects.equals(this.otherAmount, form1099RResponse.otherAmount) &&
        Objects.equals(this.otherPercentage, form1099RResponse.otherPercentage) &&
        Objects.equals(this.totalDistributionPercentage, form1099RResponse.totalDistributionPercentage) &&
        Objects.equals(this.totalEmployeeContributions, form1099RResponse.totalEmployeeContributions) &&
        Objects.equals(this.amountAllocableToIrrWithin5Years, form1099RResponse.amountAllocableToIrrWithin5Years) &&
        Objects.equals(this.firstYearOfDesignatedRothContribution, form1099RResponse.firstYearOfDesignatedRothContribution) &&
        Objects.equals(this.fatcaFilingRequirement, form1099RResponse.fatcaFilingRequirement) &&
        Objects.equals(this.dateOfPayment, form1099RResponse.dateOfPayment) &&
        Objects.equals(this.type, form1099RResponse.type) &&
        Objects.equals(this.createdAt, form1099RResponse.createdAt) &&
        Objects.equals(this.updatedAt, form1099RResponse.updatedAt) &&
        Objects.equals(this.stateAndLocalWithholding, form1099RResponse.stateAndLocalWithholding) &&
        Objects.equals(this.tinType, form1099RResponse.tinType) &&
        Objects.equals(this.id, form1099RResponse.id) &&
        Objects.equals(this.issuerId, form1099RResponse.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099RResponse.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099RResponse.issuerTin) &&
        Objects.equals(this.taxYear, form1099RResponse.taxYear) &&
        Objects.equals(this.referenceId, form1099RResponse.referenceId) &&
        Objects.equals(this.recipientName, form1099RResponse.recipientName) &&
        Objects.equals(this.recipientTin, form1099RResponse.recipientTin) &&
        Objects.equals(this.recipientSecondName, form1099RResponse.recipientSecondName) &&
        Objects.equals(this.address, form1099RResponse.address) &&
        Objects.equals(this.address2, form1099RResponse.address2) &&
        Objects.equals(this.city, form1099RResponse.city) &&
        Objects.equals(this.state, form1099RResponse.state) &&
        Objects.equals(this.zip, form1099RResponse.zip) &&
        Objects.equals(this.email, form1099RResponse.email) &&
        Objects.equals(this.accountNumber, form1099RResponse.accountNumber) &&
        Objects.equals(this.officeCode, form1099RResponse.officeCode) &&
        Objects.equals(this.nonUsProvince, form1099RResponse.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099RResponse.countryCode) &&
        Objects.equals(this.federalEFile, form1099RResponse.federalEFile) &&
        Objects.equals(this.postalMail, form1099RResponse.postalMail) &&
        Objects.equals(this.stateEFile, form1099RResponse.stateEFile) &&
        Objects.equals(this.tinMatch, form1099RResponse.tinMatch) &&
        Objects.equals(this.noTin, form1099RResponse.noTin) &&
        Objects.equals(this.secondTinNotice, form1099RResponse.secondTinNotice) &&
        Objects.equals(this.addressVerification, form1099RResponse.addressVerification) &&
        Objects.equals(this.federalEfileStatus, form1099RResponse.federalEfileStatus) &&
        Objects.equals(this.eDeliveryStatus, form1099RResponse.eDeliveryStatus) &&
        Objects.equals(this.stateEfileStatus, form1099RResponse.stateEfileStatus) &&
        Objects.equals(this.postalMailStatus, form1099RResponse.postalMailStatus) &&
        Objects.equals(this.tinMatchStatus, form1099RResponse.tinMatchStatus) &&
        Objects.equals(this.addressVerificationStatus, form1099RResponse.addressVerificationStatus) &&
        Objects.equals(this.validationErrors, form1099RResponse.validationErrors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossDistribution, taxableAmount, taxableAmountNotDetermined, totalDistributionDetermined, capitalGain, federalIncomeTaxWithheld, employeeContributionsOrDesignatedRothOrInsurancePremiums, netUnrealizedAppreciationInEmployerSecurities, distributionCode, secondDistributionCode, iraSepSimple, traditionalIraSepSimpleOrRothConversionAmount, otherAmount, otherPercentage, totalDistributionPercentage, totalEmployeeContributions, amountAllocableToIrrWithin5Years, firstYearOfDesignatedRothContribution, fatcaFilingRequirement, dateOfPayment, type, createdAt, updatedAt, stateAndLocalWithholding, tinType, id, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, recipientName, recipientTin, recipientSecondName, address, address2, city, state, zip, email, accountNumber, officeCode, nonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, noTin, secondTinNotice, addressVerification, federalEfileStatus, eDeliveryStatus, stateEfileStatus, postalMailStatus, tinMatchStatus, addressVerificationStatus, validationErrors);
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
    sb.append("class Form1099RResponse {\n");
    sb.append("    grossDistribution: ").append(toIndentedString(grossDistribution)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    taxableAmountNotDetermined: ").append(toIndentedString(taxableAmountNotDetermined)).append("\n");
    sb.append("    totalDistributionDetermined: ").append(toIndentedString(totalDistributionDetermined)).append("\n");
    sb.append("    capitalGain: ").append(toIndentedString(capitalGain)).append("\n");
    sb.append("    federalIncomeTaxWithheld: ").append(toIndentedString(federalIncomeTaxWithheld)).append("\n");
    sb.append("    employeeContributionsOrDesignatedRothOrInsurancePremiums: ").append(toIndentedString(employeeContributionsOrDesignatedRothOrInsurancePremiums)).append("\n");
    sb.append("    netUnrealizedAppreciationInEmployerSecurities: ").append(toIndentedString(netUnrealizedAppreciationInEmployerSecurities)).append("\n");
    sb.append("    distributionCode: ").append(toIndentedString(distributionCode)).append("\n");
    sb.append("    secondDistributionCode: ").append(toIndentedString(secondDistributionCode)).append("\n");
    sb.append("    iraSepSimple: ").append(toIndentedString(iraSepSimple)).append("\n");
    sb.append("    traditionalIraSepSimpleOrRothConversionAmount: ").append(toIndentedString(traditionalIraSepSimpleOrRothConversionAmount)).append("\n");
    sb.append("    otherAmount: ").append(toIndentedString(otherAmount)).append("\n");
    sb.append("    otherPercentage: ").append(toIndentedString(otherPercentage)).append("\n");
    sb.append("    totalDistributionPercentage: ").append(toIndentedString(totalDistributionPercentage)).append("\n");
    sb.append("    totalEmployeeContributions: ").append(toIndentedString(totalEmployeeContributions)).append("\n");
    sb.append("    amountAllocableToIrrWithin5Years: ").append(toIndentedString(amountAllocableToIrrWithin5Years)).append("\n");
    sb.append("    firstYearOfDesignatedRothContribution: ").append(toIndentedString(firstYearOfDesignatedRothContribution)).append("\n");
    sb.append("    fatcaFilingRequirement: ").append(toIndentedString(fatcaFilingRequirement)).append("\n");
    sb.append("    dateOfPayment: ").append(toIndentedString(dateOfPayment)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    officeCode: ").append(toIndentedString(officeCode)).append("\n");
    sb.append("    nonUsProvince: ").append(toIndentedString(nonUsProvince)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    federalEFile: ").append(toIndentedString(federalEFile)).append("\n");
    sb.append("    postalMail: ").append(toIndentedString(postalMail)).append("\n");
    sb.append("    stateEFile: ").append(toIndentedString(stateEFile)).append("\n");
    sb.append("    tinMatch: ").append(toIndentedString(tinMatch)).append("\n");
    sb.append("    noTin: ").append(toIndentedString(noTin)).append("\n");
    sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    federalEfileStatus: ").append(toIndentedString(federalEfileStatus)).append("\n");
    sb.append("    eDeliveryStatus: ").append(toIndentedString(eDeliveryStatus)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("accountNumber");
    openapiFields.add("officeCode");
    openapiFields.add("nonUsProvince");
    openapiFields.add("countryCode");
    openapiFields.add("federalEFile");
    openapiFields.add("postalMail");
    openapiFields.add("stateEFile");
    openapiFields.add("tinMatch");
    openapiFields.add("noTin");
    openapiFields.add("secondTinNotice");
    openapiFields.add("addressVerification");
    openapiFields.add("federalEfileStatus");
    openapiFields.add("eDeliveryStatus");
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
   * @throws IOException if the JSON Element is invalid with respect to Form1099RResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099RResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099RResponse is not found in the empty JSON string", Form1099RResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099RResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099RResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("distributionCode") != null && !jsonObj.get("distributionCode").isJsonNull()) && !jsonObj.get("distributionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distributionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distributionCode").toString()));
      }
      if ((jsonObj.get("secondDistributionCode") != null && !jsonObj.get("secondDistributionCode").isJsonNull()) && !jsonObj.get("secondDistributionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondDistributionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondDistributionCode").toString()));
      }
      if ((jsonObj.get("otherPercentage") != null && !jsonObj.get("otherPercentage").isJsonNull()) && !jsonObj.get("otherPercentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otherPercentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otherPercentage").toString()));
      }
      if ((jsonObj.get("totalDistributionPercentage") != null && !jsonObj.get("totalDistributionPercentage").isJsonNull()) && !jsonObj.get("totalDistributionPercentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalDistributionPercentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalDistributionPercentage").toString()));
      }
      if ((jsonObj.get("firstYearOfDesignatedRothContribution") != null && !jsonObj.get("firstYearOfDesignatedRothContribution").isJsonNull()) && !jsonObj.get("firstYearOfDesignatedRothContribution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstYearOfDesignatedRothContribution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstYearOfDesignatedRothContribution").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
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
      // validate the optional field `federalEfileStatus`
      if (jsonObj.get("federalEfileStatus") != null && !jsonObj.get("federalEfileStatus").isJsonNull()) {
        StatusDetail.validateJsonElement(jsonObj.get("federalEfileStatus"));
      }
      // validate the optional field `eDeliveryStatus`
      if (jsonObj.get("eDeliveryStatus") != null && !jsonObj.get("eDeliveryStatus").isJsonNull()) {
        StatusDetail.validateJsonElement(jsonObj.get("eDeliveryStatus"));
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
            StateEfileStatusDetailResponse.validateJsonElement(jsonArraystateEfileStatus.get(i));
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
            ValidationErrorResponse.validateJsonElement(jsonArrayvalidationErrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form1099RResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099RResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099RResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099RResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099RResponse>() {
           @Override
           public void write(JsonWriter out, Form1099RResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099RResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099RResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099RResponse
   * @throws IOException if the JSON string is invalid with respect to Form1099RResponse
   */
  public static Form1099RResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099RResponse.class);
  }

  /**
   * Convert an instance of Form1099RResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

