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
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholding;
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholdingRequest;
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
 * Form1099RRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099RRequest {
  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholdingRequest stateAndLocalWithholding;

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

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ISSUER_ID = "issuerId";
  @SerializedName(SERIALIZED_NAME_ISSUER_ID)
  private String issuerId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_RECIPIENT_NAME = "recipientName";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_NAME)
  private String recipientName;

  public static final String SERIALIZED_NAME_RECIPIENT_TIN = "recipientTin";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_TIN)
  private String recipientTin;

  public static final String SERIALIZED_NAME_TIN_TYPE = "tinType";
  @SerializedName(SERIALIZED_NAME_TIN_TYPE)
  private String tinType;

  public static final String SERIALIZED_NAME_RECIPIENT_SECOND_NAME = "recipientSecondName";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_SECOND_NAME)
  private String recipientSecondName;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "streetAddress";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private String streetAddress;

  public static final String SERIALIZED_NAME_STREET_ADDRESS_LINE2 = "streetAddressLine2";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS_LINE2)
  private String streetAddressLine2;

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

  public Form1099RRequest() {
  }

  public Form1099RRequest stateAndLocalWithholding(StateAndLocalWithholdingRequest stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
    return this;
  }

  /**
   * Get stateAndLocalWithholding
   * @return stateAndLocalWithholding
   */
  @javax.annotation.Nullable
  public StateAndLocalWithholdingRequest getStateAndLocalWithholding() {
    return stateAndLocalWithholding;
  }

  public void setStateAndLocalWithholding(StateAndLocalWithholdingRequest stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
  }


  public Form1099RRequest grossDistribution(Double grossDistribution) {
    this.grossDistribution = grossDistribution;
    return this;
  }

  /**
   * Get grossDistribution
   * @return grossDistribution
   */
  @javax.annotation.Nullable
  public Double getGrossDistribution() {
    return grossDistribution;
  }

  public void setGrossDistribution(Double grossDistribution) {
    this.grossDistribution = grossDistribution;
  }


  public Form1099RRequest taxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

  /**
   * Get taxableAmount
   * @return taxableAmount
   */
  @javax.annotation.Nullable
  public Double getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(Double taxableAmount) {
    this.taxableAmount = taxableAmount;
  }


  public Form1099RRequest taxableAmountNotDetermined(Boolean taxableAmountNotDetermined) {
    this.taxableAmountNotDetermined = taxableAmountNotDetermined;
    return this;
  }

  /**
   * Get taxableAmountNotDetermined
   * @return taxableAmountNotDetermined
   */
  @javax.annotation.Nullable
  public Boolean getTaxableAmountNotDetermined() {
    return taxableAmountNotDetermined;
  }

  public void setTaxableAmountNotDetermined(Boolean taxableAmountNotDetermined) {
    this.taxableAmountNotDetermined = taxableAmountNotDetermined;
  }


  public Form1099RRequest totalDistributionDetermined(Boolean totalDistributionDetermined) {
    this.totalDistributionDetermined = totalDistributionDetermined;
    return this;
  }

  /**
   * Get totalDistributionDetermined
   * @return totalDistributionDetermined
   */
  @javax.annotation.Nullable
  public Boolean getTotalDistributionDetermined() {
    return totalDistributionDetermined;
  }

  public void setTotalDistributionDetermined(Boolean totalDistributionDetermined) {
    this.totalDistributionDetermined = totalDistributionDetermined;
  }


  public Form1099RRequest capitalGain(Double capitalGain) {
    this.capitalGain = capitalGain;
    return this;
  }

  /**
   * Get capitalGain
   * @return capitalGain
   */
  @javax.annotation.Nullable
  public Double getCapitalGain() {
    return capitalGain;
  }

  public void setCapitalGain(Double capitalGain) {
    this.capitalGain = capitalGain;
  }


  public Form1099RRequest federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
    return this;
  }

  /**
   * Get federalIncomeTaxWithheld
   * @return federalIncomeTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getFederalIncomeTaxWithheld() {
    return federalIncomeTaxWithheld;
  }

  public void setFederalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
  }


  public Form1099RRequest employeeContributionsOrDesignatedRothOrInsurancePremiums(Double employeeContributionsOrDesignatedRothOrInsurancePremiums) {
    this.employeeContributionsOrDesignatedRothOrInsurancePremiums = employeeContributionsOrDesignatedRothOrInsurancePremiums;
    return this;
  }

  /**
   * Get employeeContributionsOrDesignatedRothOrInsurancePremiums
   * @return employeeContributionsOrDesignatedRothOrInsurancePremiums
   */
  @javax.annotation.Nullable
  public Double getEmployeeContributionsOrDesignatedRothOrInsurancePremiums() {
    return employeeContributionsOrDesignatedRothOrInsurancePremiums;
  }

  public void setEmployeeContributionsOrDesignatedRothOrInsurancePremiums(Double employeeContributionsOrDesignatedRothOrInsurancePremiums) {
    this.employeeContributionsOrDesignatedRothOrInsurancePremiums = employeeContributionsOrDesignatedRothOrInsurancePremiums;
  }


  public Form1099RRequest netUnrealizedAppreciationInEmployerSecurities(Double netUnrealizedAppreciationInEmployerSecurities) {
    this.netUnrealizedAppreciationInEmployerSecurities = netUnrealizedAppreciationInEmployerSecurities;
    return this;
  }

  /**
   * Get netUnrealizedAppreciationInEmployerSecurities
   * @return netUnrealizedAppreciationInEmployerSecurities
   */
  @javax.annotation.Nullable
  public Double getNetUnrealizedAppreciationInEmployerSecurities() {
    return netUnrealizedAppreciationInEmployerSecurities;
  }

  public void setNetUnrealizedAppreciationInEmployerSecurities(Double netUnrealizedAppreciationInEmployerSecurities) {
    this.netUnrealizedAppreciationInEmployerSecurities = netUnrealizedAppreciationInEmployerSecurities;
  }


  public Form1099RRequest distributionCode(String distributionCode) {
    this.distributionCode = distributionCode;
    return this;
  }

  /**
   * Get distributionCode
   * @return distributionCode
   */
  @javax.annotation.Nullable
  public String getDistributionCode() {
    return distributionCode;
  }

  public void setDistributionCode(String distributionCode) {
    this.distributionCode = distributionCode;
  }


  public Form1099RRequest secondDistributionCode(String secondDistributionCode) {
    this.secondDistributionCode = secondDistributionCode;
    return this;
  }

  /**
   * Get secondDistributionCode
   * @return secondDistributionCode
   */
  @javax.annotation.Nullable
  public String getSecondDistributionCode() {
    return secondDistributionCode;
  }

  public void setSecondDistributionCode(String secondDistributionCode) {
    this.secondDistributionCode = secondDistributionCode;
  }


  public Form1099RRequest iraSepSimple(Boolean iraSepSimple) {
    this.iraSepSimple = iraSepSimple;
    return this;
  }

  /**
   * Get iraSepSimple
   * @return iraSepSimple
   */
  @javax.annotation.Nullable
  public Boolean getIraSepSimple() {
    return iraSepSimple;
  }

  public void setIraSepSimple(Boolean iraSepSimple) {
    this.iraSepSimple = iraSepSimple;
  }


  public Form1099RRequest traditionalIraSepSimpleOrRothConversionAmount(Double traditionalIraSepSimpleOrRothConversionAmount) {
    this.traditionalIraSepSimpleOrRothConversionAmount = traditionalIraSepSimpleOrRothConversionAmount;
    return this;
  }

  /**
   * Get traditionalIraSepSimpleOrRothConversionAmount
   * @return traditionalIraSepSimpleOrRothConversionAmount
   */
  @javax.annotation.Nullable
  public Double getTraditionalIraSepSimpleOrRothConversionAmount() {
    return traditionalIraSepSimpleOrRothConversionAmount;
  }

  public void setTraditionalIraSepSimpleOrRothConversionAmount(Double traditionalIraSepSimpleOrRothConversionAmount) {
    this.traditionalIraSepSimpleOrRothConversionAmount = traditionalIraSepSimpleOrRothConversionAmount;
  }


  public Form1099RRequest otherAmount(Double otherAmount) {
    this.otherAmount = otherAmount;
    return this;
  }

  /**
   * Get otherAmount
   * @return otherAmount
   */
  @javax.annotation.Nullable
  public Double getOtherAmount() {
    return otherAmount;
  }

  public void setOtherAmount(Double otherAmount) {
    this.otherAmount = otherAmount;
  }


  public Form1099RRequest otherPercentage(String otherPercentage) {
    this.otherPercentage = otherPercentage;
    return this;
  }

  /**
   * Get otherPercentage
   * @return otherPercentage
   */
  @javax.annotation.Nullable
  public String getOtherPercentage() {
    return otherPercentage;
  }

  public void setOtherPercentage(String otherPercentage) {
    this.otherPercentage = otherPercentage;
  }


  public Form1099RRequest totalDistributionPercentage(String totalDistributionPercentage) {
    this.totalDistributionPercentage = totalDistributionPercentage;
    return this;
  }

  /**
   * Get totalDistributionPercentage
   * @return totalDistributionPercentage
   */
  @javax.annotation.Nullable
  public String getTotalDistributionPercentage() {
    return totalDistributionPercentage;
  }

  public void setTotalDistributionPercentage(String totalDistributionPercentage) {
    this.totalDistributionPercentage = totalDistributionPercentage;
  }


  public Form1099RRequest totalEmployeeContributions(Double totalEmployeeContributions) {
    this.totalEmployeeContributions = totalEmployeeContributions;
    return this;
  }

  /**
   * Get totalEmployeeContributions
   * @return totalEmployeeContributions
   */
  @javax.annotation.Nullable
  public Double getTotalEmployeeContributions() {
    return totalEmployeeContributions;
  }

  public void setTotalEmployeeContributions(Double totalEmployeeContributions) {
    this.totalEmployeeContributions = totalEmployeeContributions;
  }


  public Form1099RRequest amountAllocableToIrrWithin5Years(Double amountAllocableToIrrWithin5Years) {
    this.amountAllocableToIrrWithin5Years = amountAllocableToIrrWithin5Years;
    return this;
  }

  /**
   * Get amountAllocableToIrrWithin5Years
   * @return amountAllocableToIrrWithin5Years
   */
  @javax.annotation.Nullable
  public Double getAmountAllocableToIrrWithin5Years() {
    return amountAllocableToIrrWithin5Years;
  }

  public void setAmountAllocableToIrrWithin5Years(Double amountAllocableToIrrWithin5Years) {
    this.amountAllocableToIrrWithin5Years = amountAllocableToIrrWithin5Years;
  }


  public Form1099RRequest firstYearOfDesignatedRothContribution(String firstYearOfDesignatedRothContribution) {
    this.firstYearOfDesignatedRothContribution = firstYearOfDesignatedRothContribution;
    return this;
  }

  /**
   * Get firstYearOfDesignatedRothContribution
   * @return firstYearOfDesignatedRothContribution
   */
  @javax.annotation.Nullable
  public String getFirstYearOfDesignatedRothContribution() {
    return firstYearOfDesignatedRothContribution;
  }

  public void setFirstYearOfDesignatedRothContribution(String firstYearOfDesignatedRothContribution) {
    this.firstYearOfDesignatedRothContribution = firstYearOfDesignatedRothContribution;
  }


  public Form1099RRequest fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
    this.fatcaFilingRequirement = fatcaFilingRequirement;
    return this;
  }

  /**
   * Get fatcaFilingRequirement
   * @return fatcaFilingRequirement
   */
  @javax.annotation.Nullable
  public Boolean getFatcaFilingRequirement() {
    return fatcaFilingRequirement;
  }

  public void setFatcaFilingRequirement(Boolean fatcaFilingRequirement) {
    this.fatcaFilingRequirement = fatcaFilingRequirement;
  }


  public Form1099RRequest dateOfPayment(OffsetDateTime dateOfPayment) {
    this.dateOfPayment = dateOfPayment;
    return this;
  }

  /**
   * Get dateOfPayment
   * @return dateOfPayment
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDateOfPayment() {
    return dateOfPayment;
  }

  public void setDateOfPayment(OffsetDateTime dateOfPayment) {
    this.dateOfPayment = dateOfPayment;
  }


  public Form1099RRequest type(String type) {
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


  public Form1099RRequest issuerId(String issuerId) {
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


  public Form1099RRequest referenceId(String referenceId) {
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


  public Form1099RRequest recipientName(String recipientName) {
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


  public Form1099RRequest recipientTin(String recipientTin) {
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


  public Form1099RRequest tinType(String tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * Get tinType
   * @return tinType
   */
  @javax.annotation.Nullable
  public String getTinType() {
    return tinType;
  }

  public void setTinType(String tinType) {
    this.tinType = tinType;
  }


  public Form1099RRequest recipientSecondName(String recipientSecondName) {
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


  public Form1099RRequest streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Get streetAddress
   * @return streetAddress
   */
  @javax.annotation.Nullable
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public Form1099RRequest streetAddressLine2(String streetAddressLine2) {
    this.streetAddressLine2 = streetAddressLine2;
    return this;
  }

  /**
   * Get streetAddressLine2
   * @return streetAddressLine2
   */
  @javax.annotation.Nullable
  public String getStreetAddressLine2() {
    return streetAddressLine2;
  }

  public void setStreetAddressLine2(String streetAddressLine2) {
    this.streetAddressLine2 = streetAddressLine2;
  }


  public Form1099RRequest city(String city) {
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


  public Form1099RRequest state(String state) {
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


  public Form1099RRequest zip(String zip) {
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


  public Form1099RRequest recipientEmail(String recipientEmail) {
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


  public Form1099RRequest accountNumber(String accountNumber) {
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


  public Form1099RRequest officeCode(String officeCode) {
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


  public Form1099RRequest recipientNonUsProvince(String recipientNonUsProvince) {
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


  public Form1099RRequest countryCode(String countryCode) {
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


  public Form1099RRequest federalEFile(Boolean federalEFile) {
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


  public Form1099RRequest postalMail(Boolean postalMail) {
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


  public Form1099RRequest stateEFile(Boolean stateEFile) {
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


  public Form1099RRequest tinMatch(Boolean tinMatch) {
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


  public Form1099RRequest addressVerification(Boolean addressVerification) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1099RRequest form1099RRequest = (Form1099RRequest) o;
    return Objects.equals(this.stateAndLocalWithholding, form1099RRequest.stateAndLocalWithholding) &&
        Objects.equals(this.grossDistribution, form1099RRequest.grossDistribution) &&
        Objects.equals(this.taxableAmount, form1099RRequest.taxableAmount) &&
        Objects.equals(this.taxableAmountNotDetermined, form1099RRequest.taxableAmountNotDetermined) &&
        Objects.equals(this.totalDistributionDetermined, form1099RRequest.totalDistributionDetermined) &&
        Objects.equals(this.capitalGain, form1099RRequest.capitalGain) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099RRequest.federalIncomeTaxWithheld) &&
        Objects.equals(this.employeeContributionsOrDesignatedRothOrInsurancePremiums, form1099RRequest.employeeContributionsOrDesignatedRothOrInsurancePremiums) &&
        Objects.equals(this.netUnrealizedAppreciationInEmployerSecurities, form1099RRequest.netUnrealizedAppreciationInEmployerSecurities) &&
        Objects.equals(this.distributionCode, form1099RRequest.distributionCode) &&
        Objects.equals(this.secondDistributionCode, form1099RRequest.secondDistributionCode) &&
        Objects.equals(this.iraSepSimple, form1099RRequest.iraSepSimple) &&
        Objects.equals(this.traditionalIraSepSimpleOrRothConversionAmount, form1099RRequest.traditionalIraSepSimpleOrRothConversionAmount) &&
        Objects.equals(this.otherAmount, form1099RRequest.otherAmount) &&
        Objects.equals(this.otherPercentage, form1099RRequest.otherPercentage) &&
        Objects.equals(this.totalDistributionPercentage, form1099RRequest.totalDistributionPercentage) &&
        Objects.equals(this.totalEmployeeContributions, form1099RRequest.totalEmployeeContributions) &&
        Objects.equals(this.amountAllocableToIrrWithin5Years, form1099RRequest.amountAllocableToIrrWithin5Years) &&
        Objects.equals(this.firstYearOfDesignatedRothContribution, form1099RRequest.firstYearOfDesignatedRothContribution) &&
        Objects.equals(this.fatcaFilingRequirement, form1099RRequest.fatcaFilingRequirement) &&
        Objects.equals(this.dateOfPayment, form1099RRequest.dateOfPayment) &&
        Objects.equals(this.type, form1099RRequest.type) &&
        Objects.equals(this.issuerId, form1099RRequest.issuerId) &&
        Objects.equals(this.referenceId, form1099RRequest.referenceId) &&
        Objects.equals(this.recipientName, form1099RRequest.recipientName) &&
        Objects.equals(this.recipientTin, form1099RRequest.recipientTin) &&
        Objects.equals(this.tinType, form1099RRequest.tinType) &&
        Objects.equals(this.recipientSecondName, form1099RRequest.recipientSecondName) &&
        Objects.equals(this.streetAddress, form1099RRequest.streetAddress) &&
        Objects.equals(this.streetAddressLine2, form1099RRequest.streetAddressLine2) &&
        Objects.equals(this.city, form1099RRequest.city) &&
        Objects.equals(this.state, form1099RRequest.state) &&
        Objects.equals(this.zip, form1099RRequest.zip) &&
        Objects.equals(this.recipientEmail, form1099RRequest.recipientEmail) &&
        Objects.equals(this.accountNumber, form1099RRequest.accountNumber) &&
        Objects.equals(this.officeCode, form1099RRequest.officeCode) &&
        Objects.equals(this.recipientNonUsProvince, form1099RRequest.recipientNonUsProvince) &&
        Objects.equals(this.countryCode, form1099RRequest.countryCode) &&
        Objects.equals(this.federalEFile, form1099RRequest.federalEFile) &&
        Objects.equals(this.postalMail, form1099RRequest.postalMail) &&
        Objects.equals(this.stateEFile, form1099RRequest.stateEFile) &&
        Objects.equals(this.tinMatch, form1099RRequest.tinMatch) &&
        Objects.equals(this.addressVerification, form1099RRequest.addressVerification);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateAndLocalWithholding, grossDistribution, taxableAmount, taxableAmountNotDetermined, totalDistributionDetermined, capitalGain, federalIncomeTaxWithheld, employeeContributionsOrDesignatedRothOrInsurancePremiums, netUnrealizedAppreciationInEmployerSecurities, distributionCode, secondDistributionCode, iraSepSimple, traditionalIraSepSimpleOrRothConversionAmount, otherAmount, otherPercentage, totalDistributionPercentage, totalEmployeeContributions, amountAllocableToIrrWithin5Years, firstYearOfDesignatedRothContribution, fatcaFilingRequirement, dateOfPayment, type, issuerId, referenceId, recipientName, recipientTin, tinType, recipientSecondName, streetAddress, streetAddressLine2, city, state, zip, recipientEmail, accountNumber, officeCode, recipientNonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, addressVerification);
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
    sb.append("class Form1099RRequest {\n");
    sb.append("    stateAndLocalWithholding: ").append(toIndentedString(stateAndLocalWithholding)).append("\n");
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
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
    sb.append("    recipientSecondName: ").append(toIndentedString(recipientSecondName)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    streetAddressLine2: ").append(toIndentedString(streetAddressLine2)).append("\n");
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
    openapiFields.add("issuerId");
    openapiFields.add("referenceId");
    openapiFields.add("recipientName");
    openapiFields.add("recipientTin");
    openapiFields.add("tinType");
    openapiFields.add("recipientSecondName");
    openapiFields.add("streetAddress");
    openapiFields.add("streetAddressLine2");
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
    openapiFields.add("stateAndLocalWithholding");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1099RRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099RRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099RRequest is not found in the empty JSON string", Form1099RRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099RRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099RRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholdingRequest.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
      }
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
      if ((jsonObj.get("issuerId") != null && !jsonObj.get("issuerId").isJsonNull()) && !jsonObj.get("issuerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerId").toString()));
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
      if ((jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) && !jsonObj.get("tinType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinType").toString()));
      }
      if ((jsonObj.get("recipientSecondName") != null && !jsonObj.get("recipientSecondName").isJsonNull()) && !jsonObj.get("recipientSecondName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientSecondName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientSecondName").toString()));
      }
      if ((jsonObj.get("streetAddress") != null && !jsonObj.get("streetAddress").isJsonNull()) && !jsonObj.get("streetAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `streetAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("streetAddress").toString()));
      }
      if ((jsonObj.get("streetAddressLine2") != null && !jsonObj.get("streetAddressLine2").isJsonNull()) && !jsonObj.get("streetAddressLine2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `streetAddressLine2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("streetAddressLine2").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form1099RRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099RRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099RRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099RRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099RRequest>() {
           @Override
           public void write(JsonWriter out, Form1099RRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099RRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099RRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099RRequest
   * @throws IOException if the JSON string is invalid with respect to Form1099RRequest
   */
  public static Form1099RRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099RRequest.class);
  }

  /**
   * Convert an instance of Form1099RRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

