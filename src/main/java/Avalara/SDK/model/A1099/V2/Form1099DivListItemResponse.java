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
 * Form1099DivListItemResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099DivListItemResponse {
  public static final String SERIALIZED_NAME_TOTAL_ORDINARY_DIVIDENDS = "totalOrdinaryDividends";
  @SerializedName(SERIALIZED_NAME_TOTAL_ORDINARY_DIVIDENDS)
  private Double totalOrdinaryDividends;

  public static final String SERIALIZED_NAME_QUALIFIED_DIVIDENDS = "qualifiedDividends";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_DIVIDENDS)
  private Double qualifiedDividends;

  public static final String SERIALIZED_NAME_TOTAL_CAPITAL_GAIN_DISTRIBUTIONS = "totalCapitalGainDistributions";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPITAL_GAIN_DISTRIBUTIONS)
  private Double totalCapitalGainDistributions;

  public static final String SERIALIZED_NAME_UNRECAPTURED_SECTION1250_GAIN = "unrecapturedSection1250Gain";
  @SerializedName(SERIALIZED_NAME_UNRECAPTURED_SECTION1250_GAIN)
  private Double unrecapturedSection1250Gain;

  public static final String SERIALIZED_NAME_SECTION1202_GAIN = "section1202Gain";
  @SerializedName(SERIALIZED_NAME_SECTION1202_GAIN)
  private Double section1202Gain;

  public static final String SERIALIZED_NAME_COLLECTIBLES_GAIN = "collectiblesGain";
  @SerializedName(SERIALIZED_NAME_COLLECTIBLES_GAIN)
  private Double collectiblesGain;

  public static final String SERIALIZED_NAME_SECTION897_ORDINARY_DIVIDENDS = "section897OrdinaryDividends";
  @SerializedName(SERIALIZED_NAME_SECTION897_ORDINARY_DIVIDENDS)
  private Double section897OrdinaryDividends;

  public static final String SERIALIZED_NAME_SECTION897_CAPITAL_GAIN = "section897CapitalGain";
  @SerializedName(SERIALIZED_NAME_SECTION897_CAPITAL_GAIN)
  private Double section897CapitalGain;

  public static final String SERIALIZED_NAME_NONDIVIDEND_DISTRIBUTIONS = "nondividendDistributions";
  @SerializedName(SERIALIZED_NAME_NONDIVIDEND_DISTRIBUTIONS)
  private Double nondividendDistributions;

  public static final String SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD = "federalIncomeTaxWithheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD)
  private Double federalIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_SECTION199_A_DIVIDENDS = "section199ADividends";
  @SerializedName(SERIALIZED_NAME_SECTION199_A_DIVIDENDS)
  private Double section199ADividends;

  public static final String SERIALIZED_NAME_INVESTMENT_EXPENSES = "investmentExpenses";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_EXPENSES)
  private Double investmentExpenses;

  public static final String SERIALIZED_NAME_FOREIGN_TAX_PAID = "foreignTaxPaid";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TAX_PAID)
  private Double foreignTaxPaid;

  public static final String SERIALIZED_NAME_FOREIGN_COUNTRY_OR_U_S_POSSESSION = "foreignCountryOrUSPossession";
  @SerializedName(SERIALIZED_NAME_FOREIGN_COUNTRY_OR_U_S_POSSESSION)
  private String foreignCountryOrUSPossession;

  public static final String SERIALIZED_NAME_CASH_LIQUIDATION_DISTRIBUTIONS = "cashLiquidationDistributions";
  @SerializedName(SERIALIZED_NAME_CASH_LIQUIDATION_DISTRIBUTIONS)
  private Double cashLiquidationDistributions;

  public static final String SERIALIZED_NAME_NONCASH_LIQUIDATION_DISTRIBUTIONS = "noncashLiquidationDistributions";
  @SerializedName(SERIALIZED_NAME_NONCASH_LIQUIDATION_DISTRIBUTIONS)
  private Double noncashLiquidationDistributions;

  public static final String SERIALIZED_NAME_EXEMPT_INTEREST_DIVIDENDS = "exemptInterestDividends";
  @SerializedName(SERIALIZED_NAME_EXEMPT_INTEREST_DIVIDENDS)
  private Double exemptInterestDividends;

  public static final String SERIALIZED_NAME_SPECIFIED_PRIVATE_ACTIVITY_BOND_INTEREST_DIVIDENDS = "specifiedPrivateActivityBondInterestDividends";
  @SerializedName(SERIALIZED_NAME_SPECIFIED_PRIVATE_ACTIVITY_BOND_INTEREST_DIVIDENDS)
  private Double specifiedPrivateActivityBondInterestDividends;

  public static final String SERIALIZED_NAME_FATCA_FILING_REQUIREMENT = "fatcaFilingRequirement";
  @SerializedName(SERIALIZED_NAME_FATCA_FILING_REQUIREMENT)
  private Boolean fatcaFilingRequirement;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ISSUER_ID = "issuerId";
  @SerializedName(SERIALIZED_NAME_ISSUER_ID)
  private Integer issuerId;

  public static final String SERIALIZED_NAME_ISSUER_REFERENCE_ID = "issuerReferenceId";
  @SerializedName(SERIALIZED_NAME_ISSUER_REFERENCE_ID)
  private String issuerReferenceId;

  public static final String SERIALIZED_NAME_ISSUER_TIN = "issuerTin";
  @SerializedName(SERIALIZED_NAME_ISSUER_TIN)
  private String issuerTin;

  public static final String SERIALIZED_NAME_TAX_YEAR = "taxYear";
  @SerializedName(SERIALIZED_NAME_TAX_YEAR)
  private Integer taxYear;

  public static final String SERIALIZED_NAME_FEDERAL_EFILE = "federalEfile";
  @SerializedName(SERIALIZED_NAME_FEDERAL_EFILE)
  private Boolean federalEfile;

  public static final String SERIALIZED_NAME_FEDERAL_EFILE_STATUS = "federalEfileStatus";
  @SerializedName(SERIALIZED_NAME_FEDERAL_EFILE_STATUS)
  private StatusDetail federalEfileStatus;

  public static final String SERIALIZED_NAME_STATE_EFILE = "stateEfile";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE)
  private Boolean stateEfile;

  public static final String SERIALIZED_NAME_STATE_EFILE_STATUS = "stateEfileStatus";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE_STATUS)
  private List<StateEfileStatusDetailResponse> stateEfileStatus;

  public static final String SERIALIZED_NAME_POSTAL_MAIL = "postalMail";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL)
  private Boolean postalMail;

  public static final String SERIALIZED_NAME_POSTAL_MAIL_STATUS = "postalMailStatus";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL_STATUS)
  private StatusDetail postalMailStatus;

  public static final String SERIALIZED_NAME_TIN_MATCH = "tinMatch";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH)
  private Boolean tinMatch;

  public static final String SERIALIZED_NAME_TIN_MATCH_STATUS = "tinMatchStatus";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH_STATUS)
  private StatusDetail tinMatchStatus;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "addressVerification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private Boolean addressVerification;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS = "addressVerificationStatus";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS)
  private StatusDetail addressVerificationStatus;

  public static final String SERIALIZED_NAME_E_DELIVERY_STATUS = "eDeliveryStatus";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_STATUS)
  private StatusDetail eDeliveryStatus;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TIN_TYPE = "tinType";
  @SerializedName(SERIALIZED_NAME_TIN_TYPE)
  private String tinType;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_NO_TIN = "noTin";
  @SerializedName(SERIALIZED_NAME_NO_TIN)
  private Boolean noTin;

  public static final String SERIALIZED_NAME_SECOND_TIN_NOTICE = "secondTinNotice";
  @SerializedName(SERIALIZED_NAME_SECOND_TIN_NOTICE)
  private Boolean secondTinNotice;

  public static final String SERIALIZED_NAME_RECIPIENT_NAME = "recipientName";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_NAME)
  private String recipientName;

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

  public static final String SERIALIZED_NAME_NON_US_PROVINCE = "nonUsProvince";
  @SerializedName(SERIALIZED_NAME_NON_US_PROVINCE)
  private String nonUsProvince;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_OFFICE_CODE = "officeCode";
  @SerializedName(SERIALIZED_NAME_OFFICE_CODE)
  private String officeCode;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<ValidationErrorResponse> validationErrors;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholdingResponse stateAndLocalWithholding;

  public Form1099DivListItemResponse() {
  }

  public Form1099DivListItemResponse(
     String id, 
     StatusDetail federalEfileStatus, 
     List<StateEfileStatusDetailResponse> stateEfileStatus, 
     StatusDetail postalMailStatus, 
     StatusDetail tinMatchStatus, 
     StatusDetail addressVerificationStatus, 
     StatusDetail eDeliveryStatus, 
     List<ValidationErrorResponse> validationErrors, 
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

  public Form1099DivListItemResponse totalOrdinaryDividends(Double totalOrdinaryDividends) {
    this.totalOrdinaryDividends = totalOrdinaryDividends;
    return this;
  }

  /**
   * Total ordinary dividends
   * @return totalOrdinaryDividends
   */
  @javax.annotation.Nullable
  public Double getTotalOrdinaryDividends() {
    return totalOrdinaryDividends;
  }

  public void setTotalOrdinaryDividends(Double totalOrdinaryDividends) {
    this.totalOrdinaryDividends = totalOrdinaryDividends;
  }


  public Form1099DivListItemResponse qualifiedDividends(Double qualifiedDividends) {
    this.qualifiedDividends = qualifiedDividends;
    return this;
  }

  /**
   * Qualified dividends
   * @return qualifiedDividends
   */
  @javax.annotation.Nullable
  public Double getQualifiedDividends() {
    return qualifiedDividends;
  }

  public void setQualifiedDividends(Double qualifiedDividends) {
    this.qualifiedDividends = qualifiedDividends;
  }


  public Form1099DivListItemResponse totalCapitalGainDistributions(Double totalCapitalGainDistributions) {
    this.totalCapitalGainDistributions = totalCapitalGainDistributions;
    return this;
  }

  /**
   * Total capital gain distributions
   * @return totalCapitalGainDistributions
   */
  @javax.annotation.Nullable
  public Double getTotalCapitalGainDistributions() {
    return totalCapitalGainDistributions;
  }

  public void setTotalCapitalGainDistributions(Double totalCapitalGainDistributions) {
    this.totalCapitalGainDistributions = totalCapitalGainDistributions;
  }


  public Form1099DivListItemResponse unrecapturedSection1250Gain(Double unrecapturedSection1250Gain) {
    this.unrecapturedSection1250Gain = unrecapturedSection1250Gain;
    return this;
  }

  /**
   * Unrecaptured Section 1250 gain
   * @return unrecapturedSection1250Gain
   */
  @javax.annotation.Nullable
  public Double getUnrecapturedSection1250Gain() {
    return unrecapturedSection1250Gain;
  }

  public void setUnrecapturedSection1250Gain(Double unrecapturedSection1250Gain) {
    this.unrecapturedSection1250Gain = unrecapturedSection1250Gain;
  }


  public Form1099DivListItemResponse section1202Gain(Double section1202Gain) {
    this.section1202Gain = section1202Gain;
    return this;
  }

  /**
   * Section 1202 gain
   * @return section1202Gain
   */
  @javax.annotation.Nullable
  public Double getSection1202Gain() {
    return section1202Gain;
  }

  public void setSection1202Gain(Double section1202Gain) {
    this.section1202Gain = section1202Gain;
  }


  public Form1099DivListItemResponse collectiblesGain(Double collectiblesGain) {
    this.collectiblesGain = collectiblesGain;
    return this;
  }

  /**
   * Collectibles (28%) gain
   * @return collectiblesGain
   */
  @javax.annotation.Nullable
  public Double getCollectiblesGain() {
    return collectiblesGain;
  }

  public void setCollectiblesGain(Double collectiblesGain) {
    this.collectiblesGain = collectiblesGain;
  }


  public Form1099DivListItemResponse section897OrdinaryDividends(Double section897OrdinaryDividends) {
    this.section897OrdinaryDividends = section897OrdinaryDividends;
    return this;
  }

  /**
   * Section 897 ordinary dividends
   * @return section897OrdinaryDividends
   */
  @javax.annotation.Nullable
  public Double getSection897OrdinaryDividends() {
    return section897OrdinaryDividends;
  }

  public void setSection897OrdinaryDividends(Double section897OrdinaryDividends) {
    this.section897OrdinaryDividends = section897OrdinaryDividends;
  }


  public Form1099DivListItemResponse section897CapitalGain(Double section897CapitalGain) {
    this.section897CapitalGain = section897CapitalGain;
    return this;
  }

  /**
   * Section 897 capital gain
   * @return section897CapitalGain
   */
  @javax.annotation.Nullable
  public Double getSection897CapitalGain() {
    return section897CapitalGain;
  }

  public void setSection897CapitalGain(Double section897CapitalGain) {
    this.section897CapitalGain = section897CapitalGain;
  }


  public Form1099DivListItemResponse nondividendDistributions(Double nondividendDistributions) {
    this.nondividendDistributions = nondividendDistributions;
    return this;
  }

  /**
   * Nondividend distributions
   * @return nondividendDistributions
   */
  @javax.annotation.Nullable
  public Double getNondividendDistributions() {
    return nondividendDistributions;
  }

  public void setNondividendDistributions(Double nondividendDistributions) {
    this.nondividendDistributions = nondividendDistributions;
  }


  public Form1099DivListItemResponse federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
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


  public Form1099DivListItemResponse section199ADividends(Double section199ADividends) {
    this.section199ADividends = section199ADividends;
    return this;
  }

  /**
   * Section 199A dividends
   * @return section199ADividends
   */
  @javax.annotation.Nullable
  public Double getSection199ADividends() {
    return section199ADividends;
  }

  public void setSection199ADividends(Double section199ADividends) {
    this.section199ADividends = section199ADividends;
  }


  public Form1099DivListItemResponse investmentExpenses(Double investmentExpenses) {
    this.investmentExpenses = investmentExpenses;
    return this;
  }

  /**
   * Investment expenses
   * @return investmentExpenses
   */
  @javax.annotation.Nullable
  public Double getInvestmentExpenses() {
    return investmentExpenses;
  }

  public void setInvestmentExpenses(Double investmentExpenses) {
    this.investmentExpenses = investmentExpenses;
  }


  public Form1099DivListItemResponse foreignTaxPaid(Double foreignTaxPaid) {
    this.foreignTaxPaid = foreignTaxPaid;
    return this;
  }

  /**
   * Foreign tax paid
   * @return foreignTaxPaid
   */
  @javax.annotation.Nullable
  public Double getForeignTaxPaid() {
    return foreignTaxPaid;
  }

  public void setForeignTaxPaid(Double foreignTaxPaid) {
    this.foreignTaxPaid = foreignTaxPaid;
  }


  public Form1099DivListItemResponse foreignCountryOrUSPossession(String foreignCountryOrUSPossession) {
    this.foreignCountryOrUSPossession = foreignCountryOrUSPossession;
    return this;
  }

  /**
   * Foreign country or U.S. possession
   * @return foreignCountryOrUSPossession
   */
  @javax.annotation.Nullable
  public String getForeignCountryOrUSPossession() {
    return foreignCountryOrUSPossession;
  }

  public void setForeignCountryOrUSPossession(String foreignCountryOrUSPossession) {
    this.foreignCountryOrUSPossession = foreignCountryOrUSPossession;
  }


  public Form1099DivListItemResponse cashLiquidationDistributions(Double cashLiquidationDistributions) {
    this.cashLiquidationDistributions = cashLiquidationDistributions;
    return this;
  }

  /**
   * Cash liquidation distributions
   * @return cashLiquidationDistributions
   */
  @javax.annotation.Nullable
  public Double getCashLiquidationDistributions() {
    return cashLiquidationDistributions;
  }

  public void setCashLiquidationDistributions(Double cashLiquidationDistributions) {
    this.cashLiquidationDistributions = cashLiquidationDistributions;
  }


  public Form1099DivListItemResponse noncashLiquidationDistributions(Double noncashLiquidationDistributions) {
    this.noncashLiquidationDistributions = noncashLiquidationDistributions;
    return this;
  }

  /**
   * Noncash liquidation distributions
   * @return noncashLiquidationDistributions
   */
  @javax.annotation.Nullable
  public Double getNoncashLiquidationDistributions() {
    return noncashLiquidationDistributions;
  }

  public void setNoncashLiquidationDistributions(Double noncashLiquidationDistributions) {
    this.noncashLiquidationDistributions = noncashLiquidationDistributions;
  }


  public Form1099DivListItemResponse exemptInterestDividends(Double exemptInterestDividends) {
    this.exemptInterestDividends = exemptInterestDividends;
    return this;
  }

  /**
   * Exempt-interest dividends
   * @return exemptInterestDividends
   */
  @javax.annotation.Nullable
  public Double getExemptInterestDividends() {
    return exemptInterestDividends;
  }

  public void setExemptInterestDividends(Double exemptInterestDividends) {
    this.exemptInterestDividends = exemptInterestDividends;
  }


  public Form1099DivListItemResponse specifiedPrivateActivityBondInterestDividends(Double specifiedPrivateActivityBondInterestDividends) {
    this.specifiedPrivateActivityBondInterestDividends = specifiedPrivateActivityBondInterestDividends;
    return this;
  }

  /**
   * Specified private activity bond interest dividends
   * @return specifiedPrivateActivityBondInterestDividends
   */
  @javax.annotation.Nullable
  public Double getSpecifiedPrivateActivityBondInterestDividends() {
    return specifiedPrivateActivityBondInterestDividends;
  }

  public void setSpecifiedPrivateActivityBondInterestDividends(Double specifiedPrivateActivityBondInterestDividends) {
    this.specifiedPrivateActivityBondInterestDividends = specifiedPrivateActivityBondInterestDividends;
  }


  public Form1099DivListItemResponse fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
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


  /**
   * ID of the form
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



  public Form1099DivListItemResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the form. Will be one of:  * 940  * 941  * 943  * 944  * 945  * 1042  * 1042-S  * 1095-B  * 1095-C  * 1097-BTC  * 1098  * 1098-C  * 1098-E  * 1098-Q  * 1098-T  * 3921  * 3922  * 5498  * 5498-ESA  * 5498-SA  * 1099-MISC  * 1099-A  * 1099-B  * 1099-C  * 1099-CAP  * 1099-DIV  * 1099-G  * 1099-INT  * 1099-K  * 1099-LS  * 1099-LTC  * 1099-NEC  * 1099-OID  * 1099-PATR  * 1099-Q  * 1099-R  * 1099-S  * 1099-SA  * T4A  * W-2  * W-2G  * 1099-HC
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Form1099DivListItemResponse issuerId(Integer issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * Issuer ID
   * @return issuerId
   */
  @javax.annotation.Nonnull
  public Integer getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(Integer issuerId) {
    this.issuerId = issuerId;
  }


  public Form1099DivListItemResponse issuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
    return this;
  }

  /**
   * Issuer Reference ID
   * @return issuerReferenceId
   */
  @javax.annotation.Nullable
  public String getIssuerReferenceId() {
    return issuerReferenceId;
  }

  public void setIssuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
  }


  public Form1099DivListItemResponse issuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
    return this;
  }

  /**
   * Issuer TIN
   * @return issuerTin
   */
  @javax.annotation.Nullable
  public String getIssuerTin() {
    return issuerTin;
  }

  public void setIssuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
  }


  public Form1099DivListItemResponse taxYear(Integer taxYear) {
    this.taxYear = taxYear;
    return this;
  }

  /**
   * Tax year
   * @return taxYear
   */
  @javax.annotation.Nullable
  public Integer getTaxYear() {
    return taxYear;
  }

  public void setTaxYear(Integer taxYear) {
    this.taxYear = taxYear;
  }


  public Form1099DivListItemResponse federalEfile(Boolean federalEfile) {
    this.federalEfile = federalEfile;
    return this;
  }

  /**
   * Boolean indicating that federal e-filing has been scheduled for this form
   * @return federalEfile
   */
  @javax.annotation.Nonnull
  public Boolean getFederalEfile() {
    return federalEfile;
  }

  public void setFederalEfile(Boolean federalEfile) {
    this.federalEfile = federalEfile;
  }


  /**
   * Federal e-file status
   * @return federalEfileStatus
   */
  @javax.annotation.Nullable
  public StatusDetail getFederalEfileStatus() {
    return federalEfileStatus;
  }



  public Form1099DivListItemResponse stateEfile(Boolean stateEfile) {
    this.stateEfile = stateEfile;
    return this;
  }

  /**
   * Boolean indicating that state e-filing has been scheduled for this form
   * @return stateEfile
   */
  @javax.annotation.Nonnull
  public Boolean getStateEfile() {
    return stateEfile;
  }

  public void setStateEfile(Boolean stateEfile) {
    this.stateEfile = stateEfile;
  }


  /**
   * State e-file status
   * @return stateEfileStatus
   */
  @javax.annotation.Nullable
  public List<StateEfileStatusDetailResponse> getStateEfileStatus() {
    return stateEfileStatus;
  }



  public Form1099DivListItemResponse postalMail(Boolean postalMail) {
    this.postalMail = postalMail;
    return this;
  }

  /**
   * Boolean indicating that postal mailing to the recipient has been scheduled for this form
   * @return postalMail
   */
  @javax.annotation.Nonnull
  public Boolean getPostalMail() {
    return postalMail;
  }

  public void setPostalMail(Boolean postalMail) {
    this.postalMail = postalMail;
  }


  /**
   * Postal mail to recipient status
   * @return postalMailStatus
   */
  @javax.annotation.Nullable
  public StatusDetail getPostalMailStatus() {
    return postalMailStatus;
  }



  public Form1099DivListItemResponse tinMatch(Boolean tinMatch) {
    this.tinMatch = tinMatch;
    return this;
  }

  /**
   * Boolean indicating that TIN Matching has been scheduled for this form
   * @return tinMatch
   */
  @javax.annotation.Nonnull
  public Boolean getTinMatch() {
    return tinMatch;
  }

  public void setTinMatch(Boolean tinMatch) {
    this.tinMatch = tinMatch;
  }


  /**
   * TIN Match status
   * @return tinMatchStatus
   */
  @javax.annotation.Nullable
  public StatusDetail getTinMatchStatus() {
    return tinMatchStatus;
  }



  public Form1099DivListItemResponse addressVerification(Boolean addressVerification) {
    this.addressVerification = addressVerification;
    return this;
  }

  /**
   * Boolean indicating that address verification has been scheduled for this form
   * @return addressVerification
   */
  @javax.annotation.Nonnull
  public Boolean getAddressVerification() {
    return addressVerification;
  }

  public void setAddressVerification(Boolean addressVerification) {
    this.addressVerification = addressVerification;
  }


  /**
   * Address verification status
   * @return addressVerificationStatus
   */
  @javax.annotation.Nullable
  public StatusDetail getAddressVerificationStatus() {
    return addressVerificationStatus;
  }



  /**
   * EDelivery status
   * @return eDeliveryStatus
   */
  @javax.annotation.Nullable
  public StatusDetail geteDeliveryStatus() {
    return eDeliveryStatus;
  }



  public Form1099DivListItemResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Reference ID
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public Form1099DivListItemResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Recipient email address
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Form1099DivListItemResponse tinType(String tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN
   * @return tinType
   */
  @javax.annotation.Nullable
  public String getTinType() {
    return tinType;
  }

  public void setTinType(String tinType) {
    this.tinType = tinType;
  }


  public Form1099DivListItemResponse tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * Recipient Tax ID Number
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public Form1099DivListItemResponse noTin(Boolean noTin) {
    this.noTin = noTin;
    return this;
  }

  /**
   * Indicates whether the recipient has no TIN
   * @return noTin
   */
  @javax.annotation.Nullable
  public Boolean getNoTin() {
    return noTin;
  }

  public void setNoTin(Boolean noTin) {
    this.noTin = noTin;
  }


  public Form1099DivListItemResponse secondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
    return this;
  }

  /**
   * Second Tin Notice
   * @return secondTinNotice
   */
  @javax.annotation.Nullable
  public Boolean getSecondTinNotice() {
    return secondTinNotice;
  }

  public void setSecondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
  }


  public Form1099DivListItemResponse recipientName(String recipientName) {
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


  public Form1099DivListItemResponse recipientSecondName(String recipientSecondName) {
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


  public Form1099DivListItemResponse address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Form1099DivListItemResponse address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Address line 2
   * @return address2
   */
  @javax.annotation.Nullable
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public Form1099DivListItemResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public Form1099DivListItemResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * US state
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Form1099DivListItemResponse zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Zip/postal code
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  public Form1099DivListItemResponse nonUsProvince(String nonUsProvince) {
    this.nonUsProvince = nonUsProvince;
    return this;
  }

  /**
   * Foreign province
   * @return nonUsProvince
   */
  @javax.annotation.Nullable
  public String getNonUsProvince() {
    return nonUsProvince;
  }

  public void setNonUsProvince(String nonUsProvince) {
    this.nonUsProvince = nonUsProvince;
  }


  public Form1099DivListItemResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code, as defined at https://www.irs.gov/e-file-providers/country-codes
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Form1099DivListItemResponse accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Account Number
   * @return accountNumber
   */
  @javax.annotation.Nullable
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public Form1099DivListItemResponse officeCode(String officeCode) {
    this.officeCode = officeCode;
    return this;
  }

  /**
   * Office Code
   * @return officeCode
   */
  @javax.annotation.Nullable
  public String getOfficeCode() {
    return officeCode;
  }

  public void setOfficeCode(String officeCode) {
    this.officeCode = officeCode;
  }


  /**
   * Validation errors
   * @return validationErrors
   */
  @javax.annotation.Nullable
  public List<ValidationErrorResponse> getValidationErrors() {
    return validationErrors;
  }



  /**
   * Creation time
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * Update time
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }



  public Form1099DivListItemResponse stateAndLocalWithholding(StateAndLocalWithholdingResponse stateAndLocalWithholding) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1099DivListItemResponse form1099DivListItemResponse = (Form1099DivListItemResponse) o;
    return Objects.equals(this.totalOrdinaryDividends, form1099DivListItemResponse.totalOrdinaryDividends) &&
        Objects.equals(this.qualifiedDividends, form1099DivListItemResponse.qualifiedDividends) &&
        Objects.equals(this.totalCapitalGainDistributions, form1099DivListItemResponse.totalCapitalGainDistributions) &&
        Objects.equals(this.unrecapturedSection1250Gain, form1099DivListItemResponse.unrecapturedSection1250Gain) &&
        Objects.equals(this.section1202Gain, form1099DivListItemResponse.section1202Gain) &&
        Objects.equals(this.collectiblesGain, form1099DivListItemResponse.collectiblesGain) &&
        Objects.equals(this.section897OrdinaryDividends, form1099DivListItemResponse.section897OrdinaryDividends) &&
        Objects.equals(this.section897CapitalGain, form1099DivListItemResponse.section897CapitalGain) &&
        Objects.equals(this.nondividendDistributions, form1099DivListItemResponse.nondividendDistributions) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099DivListItemResponse.federalIncomeTaxWithheld) &&
        Objects.equals(this.section199ADividends, form1099DivListItemResponse.section199ADividends) &&
        Objects.equals(this.investmentExpenses, form1099DivListItemResponse.investmentExpenses) &&
        Objects.equals(this.foreignTaxPaid, form1099DivListItemResponse.foreignTaxPaid) &&
        Objects.equals(this.foreignCountryOrUSPossession, form1099DivListItemResponse.foreignCountryOrUSPossession) &&
        Objects.equals(this.cashLiquidationDistributions, form1099DivListItemResponse.cashLiquidationDistributions) &&
        Objects.equals(this.noncashLiquidationDistributions, form1099DivListItemResponse.noncashLiquidationDistributions) &&
        Objects.equals(this.exemptInterestDividends, form1099DivListItemResponse.exemptInterestDividends) &&
        Objects.equals(this.specifiedPrivateActivityBondInterestDividends, form1099DivListItemResponse.specifiedPrivateActivityBondInterestDividends) &&
        Objects.equals(this.fatcaFilingRequirement, form1099DivListItemResponse.fatcaFilingRequirement) &&
        Objects.equals(this.id, form1099DivListItemResponse.id) &&
        Objects.equals(this.type, form1099DivListItemResponse.type) &&
        Objects.equals(this.issuerId, form1099DivListItemResponse.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099DivListItemResponse.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099DivListItemResponse.issuerTin) &&
        Objects.equals(this.taxYear, form1099DivListItemResponse.taxYear) &&
        Objects.equals(this.federalEfile, form1099DivListItemResponse.federalEfile) &&
        Objects.equals(this.federalEfileStatus, form1099DivListItemResponse.federalEfileStatus) &&
        Objects.equals(this.stateEfile, form1099DivListItemResponse.stateEfile) &&
        Objects.equals(this.stateEfileStatus, form1099DivListItemResponse.stateEfileStatus) &&
        Objects.equals(this.postalMail, form1099DivListItemResponse.postalMail) &&
        Objects.equals(this.postalMailStatus, form1099DivListItemResponse.postalMailStatus) &&
        Objects.equals(this.tinMatch, form1099DivListItemResponse.tinMatch) &&
        Objects.equals(this.tinMatchStatus, form1099DivListItemResponse.tinMatchStatus) &&
        Objects.equals(this.addressVerification, form1099DivListItemResponse.addressVerification) &&
        Objects.equals(this.addressVerificationStatus, form1099DivListItemResponse.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form1099DivListItemResponse.eDeliveryStatus) &&
        Objects.equals(this.referenceId, form1099DivListItemResponse.referenceId) &&
        Objects.equals(this.email, form1099DivListItemResponse.email) &&
        Objects.equals(this.tinType, form1099DivListItemResponse.tinType) &&
        Objects.equals(this.tin, form1099DivListItemResponse.tin) &&
        Objects.equals(this.noTin, form1099DivListItemResponse.noTin) &&
        Objects.equals(this.secondTinNotice, form1099DivListItemResponse.secondTinNotice) &&
        Objects.equals(this.recipientName, form1099DivListItemResponse.recipientName) &&
        Objects.equals(this.recipientSecondName, form1099DivListItemResponse.recipientSecondName) &&
        Objects.equals(this.address, form1099DivListItemResponse.address) &&
        Objects.equals(this.address2, form1099DivListItemResponse.address2) &&
        Objects.equals(this.city, form1099DivListItemResponse.city) &&
        Objects.equals(this.state, form1099DivListItemResponse.state) &&
        Objects.equals(this.zip, form1099DivListItemResponse.zip) &&
        Objects.equals(this.nonUsProvince, form1099DivListItemResponse.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099DivListItemResponse.countryCode) &&
        Objects.equals(this.accountNumber, form1099DivListItemResponse.accountNumber) &&
        Objects.equals(this.officeCode, form1099DivListItemResponse.officeCode) &&
        Objects.equals(this.validationErrors, form1099DivListItemResponse.validationErrors) &&
        Objects.equals(this.createdAt, form1099DivListItemResponse.createdAt) &&
        Objects.equals(this.updatedAt, form1099DivListItemResponse.updatedAt) &&
        Objects.equals(this.stateAndLocalWithholding, form1099DivListItemResponse.stateAndLocalWithholding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalOrdinaryDividends, qualifiedDividends, totalCapitalGainDistributions, unrecapturedSection1250Gain, section1202Gain, collectiblesGain, section897OrdinaryDividends, section897CapitalGain, nondividendDistributions, federalIncomeTaxWithheld, section199ADividends, investmentExpenses, foreignTaxPaid, foreignCountryOrUSPossession, cashLiquidationDistributions, noncashLiquidationDistributions, exemptInterestDividends, specifiedPrivateActivityBondInterestDividends, fatcaFilingRequirement, id, type, issuerId, issuerReferenceId, issuerTin, taxYear, federalEfile, federalEfileStatus, stateEfile, stateEfileStatus, postalMail, postalMailStatus, tinMatch, tinMatchStatus, addressVerification, addressVerificationStatus, eDeliveryStatus, referenceId, email, tinType, tin, noTin, secondTinNotice, recipientName, recipientSecondName, address, address2, city, state, zip, nonUsProvince, countryCode, accountNumber, officeCode, validationErrors, createdAt, updatedAt, stateAndLocalWithholding);
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
    sb.append("class Form1099DivListItemResponse {\n");
    sb.append("    totalOrdinaryDividends: ").append(toIndentedString(totalOrdinaryDividends)).append("\n");
    sb.append("    qualifiedDividends: ").append(toIndentedString(qualifiedDividends)).append("\n");
    sb.append("    totalCapitalGainDistributions: ").append(toIndentedString(totalCapitalGainDistributions)).append("\n");
    sb.append("    unrecapturedSection1250Gain: ").append(toIndentedString(unrecapturedSection1250Gain)).append("\n");
    sb.append("    section1202Gain: ").append(toIndentedString(section1202Gain)).append("\n");
    sb.append("    collectiblesGain: ").append(toIndentedString(collectiblesGain)).append("\n");
    sb.append("    section897OrdinaryDividends: ").append(toIndentedString(section897OrdinaryDividends)).append("\n");
    sb.append("    section897CapitalGain: ").append(toIndentedString(section897CapitalGain)).append("\n");
    sb.append("    nondividendDistributions: ").append(toIndentedString(nondividendDistributions)).append("\n");
    sb.append("    federalIncomeTaxWithheld: ").append(toIndentedString(federalIncomeTaxWithheld)).append("\n");
    sb.append("    section199ADividends: ").append(toIndentedString(section199ADividends)).append("\n");
    sb.append("    investmentExpenses: ").append(toIndentedString(investmentExpenses)).append("\n");
    sb.append("    foreignTaxPaid: ").append(toIndentedString(foreignTaxPaid)).append("\n");
    sb.append("    foreignCountryOrUSPossession: ").append(toIndentedString(foreignCountryOrUSPossession)).append("\n");
    sb.append("    cashLiquidationDistributions: ").append(toIndentedString(cashLiquidationDistributions)).append("\n");
    sb.append("    noncashLiquidationDistributions: ").append(toIndentedString(noncashLiquidationDistributions)).append("\n");
    sb.append("    exemptInterestDividends: ").append(toIndentedString(exemptInterestDividends)).append("\n");
    sb.append("    specifiedPrivateActivityBondInterestDividends: ").append(toIndentedString(specifiedPrivateActivityBondInterestDividends)).append("\n");
    sb.append("    fatcaFilingRequirement: ").append(toIndentedString(fatcaFilingRequirement)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerReferenceId: ").append(toIndentedString(issuerReferenceId)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    federalEfile: ").append(toIndentedString(federalEfile)).append("\n");
    sb.append("    federalEfileStatus: ").append(toIndentedString(federalEfileStatus)).append("\n");
    sb.append("    stateEfile: ").append(toIndentedString(stateEfile)).append("\n");
    sb.append("    stateEfileStatus: ").append(toIndentedString(stateEfileStatus)).append("\n");
    sb.append("    postalMail: ").append(toIndentedString(postalMail)).append("\n");
    sb.append("    postalMailStatus: ").append(toIndentedString(postalMailStatus)).append("\n");
    sb.append("    tinMatch: ").append(toIndentedString(tinMatch)).append("\n");
    sb.append("    tinMatchStatus: ").append(toIndentedString(tinMatchStatus)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    addressVerificationStatus: ").append(toIndentedString(addressVerificationStatus)).append("\n");
    sb.append("    eDeliveryStatus: ").append(toIndentedString(eDeliveryStatus)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    noTin: ").append(toIndentedString(noTin)).append("\n");
    sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientSecondName: ").append(toIndentedString(recipientSecondName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    nonUsProvince: ").append(toIndentedString(nonUsProvince)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    officeCode: ").append(toIndentedString(officeCode)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    stateAndLocalWithholding: ").append(toIndentedString(stateAndLocalWithholding)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("issuerId");
    openapiFields.add("issuerReferenceId");
    openapiFields.add("issuerTin");
    openapiFields.add("taxYear");
    openapiFields.add("federalEfile");
    openapiFields.add("federalEfileStatus");
    openapiFields.add("stateEfile");
    openapiFields.add("stateEfileStatus");
    openapiFields.add("postalMail");
    openapiFields.add("postalMailStatus");
    openapiFields.add("tinMatch");
    openapiFields.add("tinMatchStatus");
    openapiFields.add("addressVerification");
    openapiFields.add("addressVerificationStatus");
    openapiFields.add("eDeliveryStatus");
    openapiFields.add("referenceId");
    openapiFields.add("email");
    openapiFields.add("tinType");
    openapiFields.add("tin");
    openapiFields.add("noTin");
    openapiFields.add("secondTinNotice");
    openapiFields.add("recipientName");
    openapiFields.add("recipientSecondName");
    openapiFields.add("address");
    openapiFields.add("address2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("nonUsProvince");
    openapiFields.add("countryCode");
    openapiFields.add("accountNumber");
    openapiFields.add("officeCode");
    openapiFields.add("fatcaFilingRequirement");
    openapiFields.add("validationErrors");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("stateAndLocalWithholding");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("issuerId");
    openapiRequiredFields.add("federalEfile");
    openapiRequiredFields.add("stateEfile");
    openapiRequiredFields.add("postalMail");
    openapiRequiredFields.add("tinMatch");
    openapiRequiredFields.add("addressVerification");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1099DivListItemResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099DivListItemResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099DivListItemResponse is not found in the empty JSON string", Form1099DivListItemResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099DivListItemResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099DivListItemResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1099DivListItemResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("foreignCountryOrUSPossession") != null && !jsonObj.get("foreignCountryOrUSPossession").isJsonNull()) && !jsonObj.get("foreignCountryOrUSPossession").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignCountryOrUSPossession` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignCountryOrUSPossession").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("issuerReferenceId") != null && !jsonObj.get("issuerReferenceId").isJsonNull()) && !jsonObj.get("issuerReferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerReferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerReferenceId").toString()));
      }
      if ((jsonObj.get("issuerTin") != null && !jsonObj.get("issuerTin").isJsonNull()) && !jsonObj.get("issuerTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerTin").toString()));
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
      // validate the optional field `eDeliveryStatus`
      if (jsonObj.get("eDeliveryStatus") != null && !jsonObj.get("eDeliveryStatus").isJsonNull()) {
        StatusDetail.validateJsonElement(jsonObj.get("eDeliveryStatus"));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) && !jsonObj.get("tinType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinType").toString()));
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
      if ((jsonObj.get("nonUsProvince") != null && !jsonObj.get("nonUsProvince").isJsonNull()) && !jsonObj.get("nonUsProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonUsProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonUsProvince").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonNull()) && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if ((jsonObj.get("officeCode") != null && !jsonObj.get("officeCode").isJsonNull()) && !jsonObj.get("officeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `officeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("officeCode").toString()));
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
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholdingResponse.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form1099DivListItemResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099DivListItemResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099DivListItemResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099DivListItemResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099DivListItemResponse>() {
           @Override
           public void write(JsonWriter out, Form1099DivListItemResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099DivListItemResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099DivListItemResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099DivListItemResponse
   * @throws IOException if the JSON string is invalid with respect to Form1099DivListItemResponse
   */
  public static Form1099DivListItemResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099DivListItemResponse.class);
  }

  /**
   * Convert an instance of Form1099DivListItemResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

