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
 * Form 1099-R: Distributions From Pensions, Annuities, Retirement or Profit-Sharing Plans, IRAs, Insurance Contracts, etc.                *At least one of the following amounts must be provided:*   Gross distribution, Taxable amount, Capital gain, Employee contributions/Designated Roth contributions or insurance premiums,  Net unrealized appreciation in employer&#39;s securities, Other amount, Total employee contributions,  Traditional IRA/SEP/SIMPLE or Roth conversion amount, or Amount allocable to IRR within 5 years
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099R {
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

  /**
   * Distribution code.    Available values:  - 1: Early distribution, no known exception (in most cases, under age 59½)  - 2: Early distribution, exception applies (under age 59½)  - 3: Disability  - 4: Death  - 5: Prohibited transaction  - 6: Section 1035 exchange (a tax-free exchange of life insurance, annuity, qualified long-term care insurance, or endowment contracts)  - 7: Normal distribution  - 8: Excess contributions plus earnings/excess deferrals (and/or earnings) taxable in payment year  - 9: Cost of current life insurance protection (premiums paid by a trustee or custodian for current insurance protection)  - A: May be eligible for 10-year tax option  - B: Designated Roth account distribution  - C: Reportable Death Benefits Under Section 6050Y(c)  - D: Annuity payments from nonqualified annuity payments and distributions from life insurance contracts that may be subject to tax under section 1411  - E: Distribution under Employee Plans Compliance Resolution System (EPCRS)  - F: Charitable gift annuity  - G: Direct rollover and rollover contribution  - H: Direct rollover of distribution from a designated Roth account to a Roth IRA  - J: Early distribution from a Roth IRA (This code may be used with a Code 8 or P)  - K: Distribution of IRA Assets Not Having A Readily Available FMV  - L: Loans treated as deemed distributions under section 72(p)  - M: Qualified Plan Loan Offsets  - N: Recharacterized IRA contribution made for year following payment year  - P: Excess contributions plus earnings/excess deferrals taxable for year prior to payment year  - Q: Qualified distribution from a Roth IRA (Distribution from a Roth IRA when the 5-year holding period has been met, and the recipient has reached 59½, has died, or is disabled)  - R: Recharacterized IRA contribution made for year prior to payment year  - S: Early distribution from a SIMPLE IRA in first 2 years no known exceptions  - T: Roth IRA distribution exception applies because participant has reached 59½, died or is disabled, but it is unknown if the 5-year period has been met  - U: Distribution from ESOP under Section 404(k)  - W: Charges or payments for purchasing qualified long-term care insurance contracts under combined arrangements  - Y: Qualified charitable distribution (QCD) claimed under section 408(d)(8) (Available for 2025 on)
   */
  @JsonAdapter(DistributionCodeEnum.Adapter.class)
  public enum DistributionCodeEnum {
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5"),
    
    _6("6"),
    
    _7("7"),
    
    _8("8"),
    
    _9("9"),
    
    A("A"),
    
    B("B"),
    
    C("C"),
    
    D("D"),
    
    E("E"),
    
    F("F"),
    
    G("G"),
    
    H("H"),
    
    J("J"),
    
    K("K"),
    
    L("L"),
    
    M("M"),
    
    N("N"),
    
    P("P"),
    
    Q("Q"),
    
    R("R"),
    
    S("S"),
    
    T("T"),
    
    U("U"),
    
    W("W"),
    
    Y("Y");

    private String value;

    DistributionCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DistributionCodeEnum fromValue(String value) {
      for (DistributionCodeEnum b : DistributionCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DistributionCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DistributionCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DistributionCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DistributionCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DistributionCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DISTRIBUTION_CODE = "distributionCode";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_CODE)
  private DistributionCodeEnum distributionCode;

  /**
   * Second distribution code. Must be a valid combination with the first distribution code.  See DistributionCode property documentation for code descriptions.    Valid combinations based on first distribution code:  - 1: _, 8, B, D, K, L, M, P  - 2: _, 8, B, D, K, L, M, P  - 3: _, D  - 4: _, 8, A, B, D, G, H, K, L, M, P  - 5: _  - 6: _, W  - 7: _, A, B, D, K, L, M  - 8: _, 1, 2, 4, B, J, K  - 9: _  - A: 4, 7  - B: _, 1, 2, 4, 7, 8, G, L, M, P, U  - C: _, D  - D: 1, 2, 3, 4, 7, C  - E: _  - F: _  - G: _, 4, B, K  - H: _, 4  - J: _, 8, P  - K: 1, 2, 4, 7, 8, G  - L: _, 1, 2, 4, 7, B  - M: _, 1, 2, 4, 7, B  - N: _  - P: _, 1, 2, 4, B, J  - Q: _  - R: _  - S: _  - T: _  - U: _, B  - W: _, 6  - Y: 4, 7, K                (_ indicates no second distribution code)    (format: firstDistributionCode: availableSecondDistributionCodes)
   */
  @JsonAdapter(SecondDistributionCodeEnum.Adapter.class)
  public enum SecondDistributionCodeEnum {
    _1("1"),
    
    _2("2"),
    
    _3("3"),
    
    _4("4"),
    
    _5("5"),
    
    _6("6"),
    
    _7("7"),
    
    _8("8"),
    
    _9("9"),
    
    A("A"),
    
    B("B"),
    
    C("C"),
    
    D("D"),
    
    E("E"),
    
    F("F"),
    
    G("G"),
    
    H("H"),
    
    J("J"),
    
    K("K"),
    
    L("L"),
    
    M("M"),
    
    N("N"),
    
    P("P"),
    
    Q("Q"),
    
    R("R"),
    
    S("S"),
    
    T("T"),
    
    U("U"),
    
    W("W");

    private String value;

    SecondDistributionCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SecondDistributionCodeEnum fromValue(String value) {
      for (SecondDistributionCodeEnum b : SecondDistributionCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SecondDistributionCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecondDistributionCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SecondDistributionCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SecondDistributionCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SecondDistributionCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SECOND_DISTRIBUTION_CODE = "secondDistributionCode";
  @SerializedName(SERIALIZED_NAME_SECOND_DISTRIBUTION_CODE)
  private SecondDistributionCodeEnum secondDistributionCode;

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

  public static final String SERIALIZED_NAME_DATE_OF_PAYMENT = "dateOfPayment";
  @SerializedName(SERIALIZED_NAME_DATE_OF_PAYMENT)
  private LocalDate dateOfPayment;

  public static final String SERIALIZED_NAME_FATCA_FILING_REQUIREMENT = "fatcaFilingRequirement";
  @SerializedName(SERIALIZED_NAME_FATCA_FILING_REQUIREMENT)
  private Boolean fatcaFilingRequirement;

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
    
    _1099_R("1099-R");

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

  public Form1099R() {
  }

  public Form1099R(
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

  public Form1099R grossDistribution(Double grossDistribution) {
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


  public Form1099R taxableAmount(Double taxableAmount) {
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


  public Form1099R taxableAmountNotDetermined(Boolean taxableAmountNotDetermined) {
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


  public Form1099R totalDistributionDetermined(Boolean totalDistributionDetermined) {
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


  public Form1099R capitalGain(Double capitalGain) {
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


  public Form1099R federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
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


  public Form1099R employeeContributionsOrDesignatedRothOrInsurancePremiums(Double employeeContributionsOrDesignatedRothOrInsurancePremiums) {
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


  public Form1099R netUnrealizedAppreciationInEmployerSecurities(Double netUnrealizedAppreciationInEmployerSecurities) {
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


  public Form1099R distributionCode(DistributionCodeEnum distributionCode) {
    this.distributionCode = distributionCode;
    return this;
  }

  /**
   * Distribution code.    Available values:  - 1: Early distribution, no known exception (in most cases, under age 59½)  - 2: Early distribution, exception applies (under age 59½)  - 3: Disability  - 4: Death  - 5: Prohibited transaction  - 6: Section 1035 exchange (a tax-free exchange of life insurance, annuity, qualified long-term care insurance, or endowment contracts)  - 7: Normal distribution  - 8: Excess contributions plus earnings/excess deferrals (and/or earnings) taxable in payment year  - 9: Cost of current life insurance protection (premiums paid by a trustee or custodian for current insurance protection)  - A: May be eligible for 10-year tax option  - B: Designated Roth account distribution  - C: Reportable Death Benefits Under Section 6050Y(c)  - D: Annuity payments from nonqualified annuity payments and distributions from life insurance contracts that may be subject to tax under section 1411  - E: Distribution under Employee Plans Compliance Resolution System (EPCRS)  - F: Charitable gift annuity  - G: Direct rollover and rollover contribution  - H: Direct rollover of distribution from a designated Roth account to a Roth IRA  - J: Early distribution from a Roth IRA (This code may be used with a Code 8 or P)  - K: Distribution of IRA Assets Not Having A Readily Available FMV  - L: Loans treated as deemed distributions under section 72(p)  - M: Qualified Plan Loan Offsets  - N: Recharacterized IRA contribution made for year following payment year  - P: Excess contributions plus earnings/excess deferrals taxable for year prior to payment year  - Q: Qualified distribution from a Roth IRA (Distribution from a Roth IRA when the 5-year holding period has been met, and the recipient has reached 59½, has died, or is disabled)  - R: Recharacterized IRA contribution made for year prior to payment year  - S: Early distribution from a SIMPLE IRA in first 2 years no known exceptions  - T: Roth IRA distribution exception applies because participant has reached 59½, died or is disabled, but it is unknown if the 5-year period has been met  - U: Distribution from ESOP under Section 404(k)  - W: Charges or payments for purchasing qualified long-term care insurance contracts under combined arrangements  - Y: Qualified charitable distribution (QCD) claimed under section 408(d)(8) (Available for 2025 on)
   * @return distributionCode
   */
  @javax.annotation.Nullable
  public DistributionCodeEnum getDistributionCode() {
    return distributionCode;
  }

  public void setDistributionCode(DistributionCodeEnum distributionCode) {
    this.distributionCode = distributionCode;
  }


  public Form1099R secondDistributionCode(SecondDistributionCodeEnum secondDistributionCode) {
    this.secondDistributionCode = secondDistributionCode;
    return this;
  }

  /**
   * Second distribution code. Must be a valid combination with the first distribution code.  See DistributionCode property documentation for code descriptions.    Valid combinations based on first distribution code:  - 1: _, 8, B, D, K, L, M, P  - 2: _, 8, B, D, K, L, M, P  - 3: _, D  - 4: _, 8, A, B, D, G, H, K, L, M, P  - 5: _  - 6: _, W  - 7: _, A, B, D, K, L, M  - 8: _, 1, 2, 4, B, J, K  - 9: _  - A: 4, 7  - B: _, 1, 2, 4, 7, 8, G, L, M, P, U  - C: _, D  - D: 1, 2, 3, 4, 7, C  - E: _  - F: _  - G: _, 4, B, K  - H: _, 4  - J: _, 8, P  - K: 1, 2, 4, 7, 8, G  - L: _, 1, 2, 4, 7, B  - M: _, 1, 2, 4, 7, B  - N: _  - P: _, 1, 2, 4, B, J  - Q: _  - R: _  - S: _  - T: _  - U: _, B  - W: _, 6  - Y: 4, 7, K                (_ indicates no second distribution code)    (format: firstDistributionCode: availableSecondDistributionCodes)
   * @return secondDistributionCode
   */
  @javax.annotation.Nullable
  public SecondDistributionCodeEnum getSecondDistributionCode() {
    return secondDistributionCode;
  }

  public void setSecondDistributionCode(SecondDistributionCodeEnum secondDistributionCode) {
    this.secondDistributionCode = secondDistributionCode;
  }


  public Form1099R iraSepSimple(Boolean iraSepSimple) {
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


  public Form1099R traditionalIraSepSimpleOrRothConversionAmount(Double traditionalIraSepSimpleOrRothConversionAmount) {
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


  public Form1099R otherAmount(Double otherAmount) {
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


  public Form1099R otherPercentage(String otherPercentage) {
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


  public Form1099R totalDistributionPercentage(String totalDistributionPercentage) {
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


  public Form1099R totalEmployeeContributions(Double totalEmployeeContributions) {
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


  public Form1099R amountAllocableToIrrWithin5Years(Double amountAllocableToIrrWithin5Years) {
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


  public Form1099R firstYearOfDesignatedRothContribution(String firstYearOfDesignatedRothContribution) {
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


  public Form1099R dateOfPayment(LocalDate dateOfPayment) {
    this.dateOfPayment = dateOfPayment;
    return this;
  }

  /**
   * Date of payment
   * @return dateOfPayment
   */
  @javax.annotation.Nullable
  public LocalDate getDateOfPayment() {
    return dateOfPayment;
  }

  public void setDateOfPayment(LocalDate dateOfPayment) {
    this.dateOfPayment = dateOfPayment;
  }


  public Form1099R fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
    this.fatcaFilingRequirement = fatcaFilingRequirement;
    return this;
  }

  /**
   * FATCA filing requirement.
   * @return fatcaFilingRequirement
   */
  @javax.annotation.Nullable
  public Boolean getFatcaFilingRequirement() {
    return fatcaFilingRequirement;
  }

  public void setFatcaFilingRequirement(Boolean fatcaFilingRequirement) {
    this.fatcaFilingRequirement = fatcaFilingRequirement;
  }


  public Form1099R type(TypeEnum type) {
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



  public Form1099R issuerId(String issuerId) {
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


  public Form1099R issuerReferenceId(String issuerReferenceId) {
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


  public Form1099R issuerTin(String issuerTin) {
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


  public Form1099R taxYear(Integer taxYear) {
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


  public Form1099R referenceId(String referenceId) {
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


  public Form1099R tin(String tin) {
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


  public Form1099R recipientName(String recipientName) {
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


  public Form1099R tinType(TinTypeEnum tinType) {
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


  public Form1099R recipientSecondName(String recipientSecondName) {
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


  public Form1099R address(String address) {
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


  public Form1099R address2(String address2) {
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


  public Form1099R city(String city) {
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


  public Form1099R state(String state) {
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


  public Form1099R zip(String zip) {
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


  public Form1099R email(String email) {
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


  public Form1099R accountNumber(String accountNumber) {
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


  public Form1099R officeCode(String officeCode) {
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


  public Form1099R nonUsProvince(String nonUsProvince) {
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


  public Form1099R countryCode(String countryCode) {
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


  public Form1099R federalEfileDate(LocalDate federalEfileDate) {
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


  public Form1099R postalMail(Boolean postalMail) {
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


  public Form1099R stateEfileDate(LocalDate stateEfileDate) {
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


  public Form1099R recipientEdeliveryDate(LocalDate recipientEdeliveryDate) {
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


  public Form1099R tinMatch(Boolean tinMatch) {
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


  public Form1099R noTin(Boolean noTin) {
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


  public Form1099R addressVerification(Boolean addressVerification) {
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


  public Form1099R stateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
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


  public Form1099R secondTinNotice(Boolean secondTinNotice) {
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




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1099R form1099R = (Form1099R) o;
    return Objects.equals(this.grossDistribution, form1099R.grossDistribution) &&
        Objects.equals(this.taxableAmount, form1099R.taxableAmount) &&
        Objects.equals(this.taxableAmountNotDetermined, form1099R.taxableAmountNotDetermined) &&
        Objects.equals(this.totalDistributionDetermined, form1099R.totalDistributionDetermined) &&
        Objects.equals(this.capitalGain, form1099R.capitalGain) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099R.federalIncomeTaxWithheld) &&
        Objects.equals(this.employeeContributionsOrDesignatedRothOrInsurancePremiums, form1099R.employeeContributionsOrDesignatedRothOrInsurancePremiums) &&
        Objects.equals(this.netUnrealizedAppreciationInEmployerSecurities, form1099R.netUnrealizedAppreciationInEmployerSecurities) &&
        Objects.equals(this.distributionCode, form1099R.distributionCode) &&
        Objects.equals(this.secondDistributionCode, form1099R.secondDistributionCode) &&
        Objects.equals(this.iraSepSimple, form1099R.iraSepSimple) &&
        Objects.equals(this.traditionalIraSepSimpleOrRothConversionAmount, form1099R.traditionalIraSepSimpleOrRothConversionAmount) &&
        Objects.equals(this.otherAmount, form1099R.otherAmount) &&
        Objects.equals(this.otherPercentage, form1099R.otherPercentage) &&
        Objects.equals(this.totalDistributionPercentage, form1099R.totalDistributionPercentage) &&
        Objects.equals(this.totalEmployeeContributions, form1099R.totalEmployeeContributions) &&
        Objects.equals(this.amountAllocableToIrrWithin5Years, form1099R.amountAllocableToIrrWithin5Years) &&
        Objects.equals(this.firstYearOfDesignatedRothContribution, form1099R.firstYearOfDesignatedRothContribution) &&
        Objects.equals(this.dateOfPayment, form1099R.dateOfPayment) &&
        Objects.equals(this.fatcaFilingRequirement, form1099R.fatcaFilingRequirement) &&
        Objects.equals(this.type, form1099R.type) &&
        Objects.equals(this.id, form1099R.id) &&
        Objects.equals(this.issuerId, form1099R.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099R.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099R.issuerTin) &&
        Objects.equals(this.taxYear, form1099R.taxYear) &&
        Objects.equals(this.referenceId, form1099R.referenceId) &&
        Objects.equals(this.tin, form1099R.tin) &&
        Objects.equals(this.recipientName, form1099R.recipientName) &&
        Objects.equals(this.tinType, form1099R.tinType) &&
        Objects.equals(this.recipientSecondName, form1099R.recipientSecondName) &&
        Objects.equals(this.address, form1099R.address) &&
        Objects.equals(this.address2, form1099R.address2) &&
        Objects.equals(this.city, form1099R.city) &&
        Objects.equals(this.state, form1099R.state) &&
        Objects.equals(this.zip, form1099R.zip) &&
        Objects.equals(this.email, form1099R.email) &&
        Objects.equals(this.accountNumber, form1099R.accountNumber) &&
        Objects.equals(this.officeCode, form1099R.officeCode) &&
        Objects.equals(this.nonUsProvince, form1099R.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099R.countryCode) &&
        Objects.equals(this.federalEfileDate, form1099R.federalEfileDate) &&
        Objects.equals(this.postalMail, form1099R.postalMail) &&
        Objects.equals(this.stateEfileDate, form1099R.stateEfileDate) &&
        Objects.equals(this.recipientEdeliveryDate, form1099R.recipientEdeliveryDate) &&
        Objects.equals(this.tinMatch, form1099R.tinMatch) &&
        Objects.equals(this.noTin, form1099R.noTin) &&
        Objects.equals(this.addressVerification, form1099R.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form1099R.stateAndLocalWithholding) &&
        Objects.equals(this.secondTinNotice, form1099R.secondTinNotice) &&
        Objects.equals(this.federalEfileStatus, form1099R.federalEfileStatus) &&
        Objects.equals(this.stateEfileStatus, form1099R.stateEfileStatus) &&
        Objects.equals(this.postalMailStatus, form1099R.postalMailStatus) &&
        Objects.equals(this.tinMatchStatus, form1099R.tinMatchStatus) &&
        Objects.equals(this.addressVerificationStatus, form1099R.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form1099R.eDeliveryStatus) &&
        Objects.equals(this.validationErrors, form1099R.validationErrors) &&
        Objects.equals(this.createdAt, form1099R.createdAt) &&
        Objects.equals(this.updatedAt, form1099R.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossDistribution, taxableAmount, taxableAmountNotDetermined, totalDistributionDetermined, capitalGain, federalIncomeTaxWithheld, employeeContributionsOrDesignatedRothOrInsurancePremiums, netUnrealizedAppreciationInEmployerSecurities, distributionCode, secondDistributionCode, iraSepSimple, traditionalIraSepSimpleOrRothConversionAmount, otherAmount, otherPercentage, totalDistributionPercentage, totalEmployeeContributions, amountAllocableToIrrWithin5Years, firstYearOfDesignatedRothContribution, dateOfPayment, fatcaFilingRequirement, type, id, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, tin, recipientName, tinType, recipientSecondName, address, address2, city, state, zip, email, accountNumber, officeCode, nonUsProvince, countryCode, federalEfileDate, postalMail, stateEfileDate, recipientEdeliveryDate, tinMatch, noTin, addressVerification, stateAndLocalWithholding, secondTinNotice, federalEfileStatus, stateEfileStatus, postalMailStatus, tinMatchStatus, addressVerificationStatus, eDeliveryStatus, validationErrors, createdAt, updatedAt);
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
    sb.append("class Form1099R {\n");
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
    sb.append("    dateOfPayment: ").append(toIndentedString(dateOfPayment)).append("\n");
    sb.append("    fatcaFilingRequirement: ").append(toIndentedString(fatcaFilingRequirement)).append("\n");
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
    openapiRequiredFields.add("distributionCode");
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
   * @throws IOException if the JSON Element is invalid with respect to Form1099R
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099R.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099R is not found in the empty JSON string", Form1099R.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099R.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099R` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1099R.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("distributionCode") != null && !jsonObj.get("distributionCode").isJsonNull()) && !jsonObj.get("distributionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distributionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distributionCode").toString()));
      }
      // validate the required field `distributionCode`
      DistributionCodeEnum.validateJsonElement(jsonObj.get("distributionCode"));
      if ((jsonObj.get("secondDistributionCode") != null && !jsonObj.get("secondDistributionCode").isJsonNull()) && !jsonObj.get("secondDistributionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondDistributionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondDistributionCode").toString()));
      }
      // validate the optional field `secondDistributionCode`
      if (jsonObj.get("secondDistributionCode") != null && !jsonObj.get("secondDistributionCode").isJsonNull()) {
        SecondDistributionCodeEnum.validateJsonElement(jsonObj.get("secondDistributionCode"));
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
       if (!Form1099R.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099R' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099R> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099R.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099R>() {
           @Override
           public void write(JsonWriter out, Form1099R value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099R read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099R given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099R
   * @throws IOException if the JSON string is invalid with respect to Form1099R
   */
  public static Form1099R fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099R.class);
  }

  /**
   * Convert an instance of Form1099R to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

