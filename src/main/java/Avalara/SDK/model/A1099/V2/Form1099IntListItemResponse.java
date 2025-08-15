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
 * Form1099IntListItemResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099IntListItemResponse {
  public static final String SERIALIZED_NAME_INTEREST_INCOME = "interestIncome";
  @SerializedName(SERIALIZED_NAME_INTEREST_INCOME)
  private Double interestIncome;

  public static final String SERIALIZED_NAME_EARLY_WITHDRAWAL_PENALTY = "earlyWithdrawalPenalty";
  @SerializedName(SERIALIZED_NAME_EARLY_WITHDRAWAL_PENALTY)
  private Double earlyWithdrawalPenalty;

  public static final String SERIALIZED_NAME_US_SAVINGS_BONDS_INTEREST = "usSavingsBondsInterest";
  @SerializedName(SERIALIZED_NAME_US_SAVINGS_BONDS_INTEREST)
  private Double usSavingsBondsInterest;

  public static final String SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD = "federalIncomeTaxWithheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD)
  private Double federalIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_INVESTMENT_EXPENSES = "investmentExpenses";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_EXPENSES)
  private Double investmentExpenses;

  public static final String SERIALIZED_NAME_FOREIGN_TAX_PAID = "foreignTaxPaid";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TAX_PAID)
  private Double foreignTaxPaid;

  public static final String SERIALIZED_NAME_FOREIGN_COUNTRY = "foreignCountry";
  @SerializedName(SERIALIZED_NAME_FOREIGN_COUNTRY)
  private String foreignCountry;

  public static final String SERIALIZED_NAME_TAX_EXEMPT_INTEREST = "taxExemptInterest";
  @SerializedName(SERIALIZED_NAME_TAX_EXEMPT_INTEREST)
  private Double taxExemptInterest;

  public static final String SERIALIZED_NAME_SPECIFIED_PRIVATE_ACTIVITY_BOND_INTEREST = "specifiedPrivateActivityBondInterest";
  @SerializedName(SERIALIZED_NAME_SPECIFIED_PRIVATE_ACTIVITY_BOND_INTEREST)
  private Double specifiedPrivateActivityBondInterest;

  public static final String SERIALIZED_NAME_MARKET_DISCOUNT = "marketDiscount";
  @SerializedName(SERIALIZED_NAME_MARKET_DISCOUNT)
  private Double marketDiscount;

  public static final String SERIALIZED_NAME_BOND_PREMIUM = "bondPremium";
  @SerializedName(SERIALIZED_NAME_BOND_PREMIUM)
  private Double bondPremium;

  public static final String SERIALIZED_NAME_BOND_PREMIUM_ON_TREASURY_OBLIGATIONS = "bondPremiumOnTreasuryObligations";
  @SerializedName(SERIALIZED_NAME_BOND_PREMIUM_ON_TREASURY_OBLIGATIONS)
  private Double bondPremiumOnTreasuryObligations;

  public static final String SERIALIZED_NAME_BOND_PREMIUM_ON_TAX_EXEMPT_BOND = "bondPremiumOnTaxExemptBond";
  @SerializedName(SERIALIZED_NAME_BOND_PREMIUM_ON_TAX_EXEMPT_BOND)
  private Double bondPremiumOnTaxExemptBond;

  public static final String SERIALIZED_NAME_TAX_EXEMPT_BOND_CUSIP_NUMBER = "taxExemptBondCusipNumber";
  @SerializedName(SERIALIZED_NAME_TAX_EXEMPT_BOND_CUSIP_NUMBER)
  private String taxExemptBondCusipNumber;

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

  public static final String SERIALIZED_NAME_FATCA_FILING_REQUIREMENT = "fatcaFilingRequirement";
  @SerializedName(SERIALIZED_NAME_FATCA_FILING_REQUIREMENT)
  private Boolean fatcaFilingRequirement;

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

  public Form1099IntListItemResponse() {
  }

  public Form1099IntListItemResponse(
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

  public Form1099IntListItemResponse interestIncome(Double interestIncome) {
    this.interestIncome = interestIncome;
    return this;
  }

  /**
   * Interest Income
   * @return interestIncome
   */
  @javax.annotation.Nullable
  public Double getInterestIncome() {
    return interestIncome;
  }

  public void setInterestIncome(Double interestIncome) {
    this.interestIncome = interestIncome;
  }


  public Form1099IntListItemResponse earlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
    this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
    return this;
  }

  /**
   * Early withdrawal penalty
   * @return earlyWithdrawalPenalty
   */
  @javax.annotation.Nullable
  public Double getEarlyWithdrawalPenalty() {
    return earlyWithdrawalPenalty;
  }

  public void setEarlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
    this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
  }


  public Form1099IntListItemResponse usSavingsBondsInterest(Double usSavingsBondsInterest) {
    this.usSavingsBondsInterest = usSavingsBondsInterest;
    return this;
  }

  /**
   * Interest on U.S. Savings Bonds and Treasury obligations
   * @return usSavingsBondsInterest
   */
  @javax.annotation.Nullable
  public Double getUsSavingsBondsInterest() {
    return usSavingsBondsInterest;
  }

  public void setUsSavingsBondsInterest(Double usSavingsBondsInterest) {
    this.usSavingsBondsInterest = usSavingsBondsInterest;
  }


  public Form1099IntListItemResponse federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
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


  public Form1099IntListItemResponse investmentExpenses(Double investmentExpenses) {
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


  public Form1099IntListItemResponse foreignTaxPaid(Double foreignTaxPaid) {
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


  public Form1099IntListItemResponse foreignCountry(String foreignCountry) {
    this.foreignCountry = foreignCountry;
    return this;
  }

  /**
   * Foreign country or U.S. possession
   * @return foreignCountry
   */
  @javax.annotation.Nullable
  public String getForeignCountry() {
    return foreignCountry;
  }

  public void setForeignCountry(String foreignCountry) {
    this.foreignCountry = foreignCountry;
  }


  public Form1099IntListItemResponse taxExemptInterest(Double taxExemptInterest) {
    this.taxExemptInterest = taxExemptInterest;
    return this;
  }

  /**
   * Tax-exempt interest
   * @return taxExemptInterest
   */
  @javax.annotation.Nullable
  public Double getTaxExemptInterest() {
    return taxExemptInterest;
  }

  public void setTaxExemptInterest(Double taxExemptInterest) {
    this.taxExemptInterest = taxExemptInterest;
  }


  public Form1099IntListItemResponse specifiedPrivateActivityBondInterest(Double specifiedPrivateActivityBondInterest) {
    this.specifiedPrivateActivityBondInterest = specifiedPrivateActivityBondInterest;
    return this;
  }

  /**
   * Specified private activity bond interest
   * @return specifiedPrivateActivityBondInterest
   */
  @javax.annotation.Nullable
  public Double getSpecifiedPrivateActivityBondInterest() {
    return specifiedPrivateActivityBondInterest;
  }

  public void setSpecifiedPrivateActivityBondInterest(Double specifiedPrivateActivityBondInterest) {
    this.specifiedPrivateActivityBondInterest = specifiedPrivateActivityBondInterest;
  }


  public Form1099IntListItemResponse marketDiscount(Double marketDiscount) {
    this.marketDiscount = marketDiscount;
    return this;
  }

  /**
   * Market discount
   * @return marketDiscount
   */
  @javax.annotation.Nullable
  public Double getMarketDiscount() {
    return marketDiscount;
  }

  public void setMarketDiscount(Double marketDiscount) {
    this.marketDiscount = marketDiscount;
  }


  public Form1099IntListItemResponse bondPremium(Double bondPremium) {
    this.bondPremium = bondPremium;
    return this;
  }

  /**
   * Bond premium
   * @return bondPremium
   */
  @javax.annotation.Nullable
  public Double getBondPremium() {
    return bondPremium;
  }

  public void setBondPremium(Double bondPremium) {
    this.bondPremium = bondPremium;
  }


  public Form1099IntListItemResponse bondPremiumOnTreasuryObligations(Double bondPremiumOnTreasuryObligations) {
    this.bondPremiumOnTreasuryObligations = bondPremiumOnTreasuryObligations;
    return this;
  }

  /**
   * Bond premium on Treasury obligations
   * @return bondPremiumOnTreasuryObligations
   */
  @javax.annotation.Nullable
  public Double getBondPremiumOnTreasuryObligations() {
    return bondPremiumOnTreasuryObligations;
  }

  public void setBondPremiumOnTreasuryObligations(Double bondPremiumOnTreasuryObligations) {
    this.bondPremiumOnTreasuryObligations = bondPremiumOnTreasuryObligations;
  }


  public Form1099IntListItemResponse bondPremiumOnTaxExemptBond(Double bondPremiumOnTaxExemptBond) {
    this.bondPremiumOnTaxExemptBond = bondPremiumOnTaxExemptBond;
    return this;
  }

  /**
   * Bond premium on tax exempt bond
   * @return bondPremiumOnTaxExemptBond
   */
  @javax.annotation.Nullable
  public Double getBondPremiumOnTaxExemptBond() {
    return bondPremiumOnTaxExemptBond;
  }

  public void setBondPremiumOnTaxExemptBond(Double bondPremiumOnTaxExemptBond) {
    this.bondPremiumOnTaxExemptBond = bondPremiumOnTaxExemptBond;
  }


  public Form1099IntListItemResponse taxExemptBondCusipNumber(String taxExemptBondCusipNumber) {
    this.taxExemptBondCusipNumber = taxExemptBondCusipNumber;
    return this;
  }

  /**
   * Tax exempt bond CUSIP number
   * @return taxExemptBondCusipNumber
   */
  @javax.annotation.Nullable
  public String getTaxExemptBondCusipNumber() {
    return taxExemptBondCusipNumber;
  }

  public void setTaxExemptBondCusipNumber(String taxExemptBondCusipNumber) {
    this.taxExemptBondCusipNumber = taxExemptBondCusipNumber;
  }


  /**
   * ID of the form
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



  public Form1099IntListItemResponse type(String type) {
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


  public Form1099IntListItemResponse issuerId(Integer issuerId) {
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


  public Form1099IntListItemResponse issuerReferenceId(String issuerReferenceId) {
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


  public Form1099IntListItemResponse issuerTin(String issuerTin) {
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


  public Form1099IntListItemResponse taxYear(Integer taxYear) {
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


  public Form1099IntListItemResponse federalEfile(Boolean federalEfile) {
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



  public Form1099IntListItemResponse stateEfile(Boolean stateEfile) {
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



  public Form1099IntListItemResponse postalMail(Boolean postalMail) {
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



  public Form1099IntListItemResponse tinMatch(Boolean tinMatch) {
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



  public Form1099IntListItemResponse addressVerification(Boolean addressVerification) {
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



  public Form1099IntListItemResponse referenceId(String referenceId) {
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


  public Form1099IntListItemResponse email(String email) {
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


  public Form1099IntListItemResponse tinType(String tinType) {
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


  public Form1099IntListItemResponse tin(String tin) {
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


  public Form1099IntListItemResponse noTin(Boolean noTin) {
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


  public Form1099IntListItemResponse secondTinNotice(Boolean secondTinNotice) {
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


  public Form1099IntListItemResponse recipientName(String recipientName) {
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


  public Form1099IntListItemResponse recipientSecondName(String recipientSecondName) {
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


  public Form1099IntListItemResponse address(String address) {
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


  public Form1099IntListItemResponse address2(String address2) {
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


  public Form1099IntListItemResponse city(String city) {
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


  public Form1099IntListItemResponse state(String state) {
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


  public Form1099IntListItemResponse zip(String zip) {
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


  public Form1099IntListItemResponse nonUsProvince(String nonUsProvince) {
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


  public Form1099IntListItemResponse countryCode(String countryCode) {
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


  public Form1099IntListItemResponse accountNumber(String accountNumber) {
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


  public Form1099IntListItemResponse officeCode(String officeCode) {
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


  public Form1099IntListItemResponse fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
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



  public Form1099IntListItemResponse stateAndLocalWithholding(StateAndLocalWithholdingResponse stateAndLocalWithholding) {
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
    Form1099IntListItemResponse form1099IntListItemResponse = (Form1099IntListItemResponse) o;
    return Objects.equals(this.interestIncome, form1099IntListItemResponse.interestIncome) &&
        Objects.equals(this.earlyWithdrawalPenalty, form1099IntListItemResponse.earlyWithdrawalPenalty) &&
        Objects.equals(this.usSavingsBondsInterest, form1099IntListItemResponse.usSavingsBondsInterest) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099IntListItemResponse.federalIncomeTaxWithheld) &&
        Objects.equals(this.investmentExpenses, form1099IntListItemResponse.investmentExpenses) &&
        Objects.equals(this.foreignTaxPaid, form1099IntListItemResponse.foreignTaxPaid) &&
        Objects.equals(this.foreignCountry, form1099IntListItemResponse.foreignCountry) &&
        Objects.equals(this.taxExemptInterest, form1099IntListItemResponse.taxExemptInterest) &&
        Objects.equals(this.specifiedPrivateActivityBondInterest, form1099IntListItemResponse.specifiedPrivateActivityBondInterest) &&
        Objects.equals(this.marketDiscount, form1099IntListItemResponse.marketDiscount) &&
        Objects.equals(this.bondPremium, form1099IntListItemResponse.bondPremium) &&
        Objects.equals(this.bondPremiumOnTreasuryObligations, form1099IntListItemResponse.bondPremiumOnTreasuryObligations) &&
        Objects.equals(this.bondPremiumOnTaxExemptBond, form1099IntListItemResponse.bondPremiumOnTaxExemptBond) &&
        Objects.equals(this.taxExemptBondCusipNumber, form1099IntListItemResponse.taxExemptBondCusipNumber) &&
        Objects.equals(this.id, form1099IntListItemResponse.id) &&
        Objects.equals(this.type, form1099IntListItemResponse.type) &&
        Objects.equals(this.issuerId, form1099IntListItemResponse.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099IntListItemResponse.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099IntListItemResponse.issuerTin) &&
        Objects.equals(this.taxYear, form1099IntListItemResponse.taxYear) &&
        Objects.equals(this.federalEfile, form1099IntListItemResponse.federalEfile) &&
        Objects.equals(this.federalEfileStatus, form1099IntListItemResponse.federalEfileStatus) &&
        Objects.equals(this.stateEfile, form1099IntListItemResponse.stateEfile) &&
        Objects.equals(this.stateEfileStatus, form1099IntListItemResponse.stateEfileStatus) &&
        Objects.equals(this.postalMail, form1099IntListItemResponse.postalMail) &&
        Objects.equals(this.postalMailStatus, form1099IntListItemResponse.postalMailStatus) &&
        Objects.equals(this.tinMatch, form1099IntListItemResponse.tinMatch) &&
        Objects.equals(this.tinMatchStatus, form1099IntListItemResponse.tinMatchStatus) &&
        Objects.equals(this.addressVerification, form1099IntListItemResponse.addressVerification) &&
        Objects.equals(this.addressVerificationStatus, form1099IntListItemResponse.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form1099IntListItemResponse.eDeliveryStatus) &&
        Objects.equals(this.referenceId, form1099IntListItemResponse.referenceId) &&
        Objects.equals(this.email, form1099IntListItemResponse.email) &&
        Objects.equals(this.tinType, form1099IntListItemResponse.tinType) &&
        Objects.equals(this.tin, form1099IntListItemResponse.tin) &&
        Objects.equals(this.noTin, form1099IntListItemResponse.noTin) &&
        Objects.equals(this.secondTinNotice, form1099IntListItemResponse.secondTinNotice) &&
        Objects.equals(this.recipientName, form1099IntListItemResponse.recipientName) &&
        Objects.equals(this.recipientSecondName, form1099IntListItemResponse.recipientSecondName) &&
        Objects.equals(this.address, form1099IntListItemResponse.address) &&
        Objects.equals(this.address2, form1099IntListItemResponse.address2) &&
        Objects.equals(this.city, form1099IntListItemResponse.city) &&
        Objects.equals(this.state, form1099IntListItemResponse.state) &&
        Objects.equals(this.zip, form1099IntListItemResponse.zip) &&
        Objects.equals(this.nonUsProvince, form1099IntListItemResponse.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099IntListItemResponse.countryCode) &&
        Objects.equals(this.accountNumber, form1099IntListItemResponse.accountNumber) &&
        Objects.equals(this.officeCode, form1099IntListItemResponse.officeCode) &&
        Objects.equals(this.fatcaFilingRequirement, form1099IntListItemResponse.fatcaFilingRequirement) &&
        Objects.equals(this.validationErrors, form1099IntListItemResponse.validationErrors) &&
        Objects.equals(this.createdAt, form1099IntListItemResponse.createdAt) &&
        Objects.equals(this.updatedAt, form1099IntListItemResponse.updatedAt) &&
        Objects.equals(this.stateAndLocalWithholding, form1099IntListItemResponse.stateAndLocalWithholding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestIncome, earlyWithdrawalPenalty, usSavingsBondsInterest, federalIncomeTaxWithheld, investmentExpenses, foreignTaxPaid, foreignCountry, taxExemptInterest, specifiedPrivateActivityBondInterest, marketDiscount, bondPremium, bondPremiumOnTreasuryObligations, bondPremiumOnTaxExemptBond, taxExemptBondCusipNumber, id, type, issuerId, issuerReferenceId, issuerTin, taxYear, federalEfile, federalEfileStatus, stateEfile, stateEfileStatus, postalMail, postalMailStatus, tinMatch, tinMatchStatus, addressVerification, addressVerificationStatus, eDeliveryStatus, referenceId, email, tinType, tin, noTin, secondTinNotice, recipientName, recipientSecondName, address, address2, city, state, zip, nonUsProvince, countryCode, accountNumber, officeCode, fatcaFilingRequirement, validationErrors, createdAt, updatedAt, stateAndLocalWithholding);
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
    sb.append("class Form1099IntListItemResponse {\n");
    sb.append("    interestIncome: ").append(toIndentedString(interestIncome)).append("\n");
    sb.append("    earlyWithdrawalPenalty: ").append(toIndentedString(earlyWithdrawalPenalty)).append("\n");
    sb.append("    usSavingsBondsInterest: ").append(toIndentedString(usSavingsBondsInterest)).append("\n");
    sb.append("    federalIncomeTaxWithheld: ").append(toIndentedString(federalIncomeTaxWithheld)).append("\n");
    sb.append("    investmentExpenses: ").append(toIndentedString(investmentExpenses)).append("\n");
    sb.append("    foreignTaxPaid: ").append(toIndentedString(foreignTaxPaid)).append("\n");
    sb.append("    foreignCountry: ").append(toIndentedString(foreignCountry)).append("\n");
    sb.append("    taxExemptInterest: ").append(toIndentedString(taxExemptInterest)).append("\n");
    sb.append("    specifiedPrivateActivityBondInterest: ").append(toIndentedString(specifiedPrivateActivityBondInterest)).append("\n");
    sb.append("    marketDiscount: ").append(toIndentedString(marketDiscount)).append("\n");
    sb.append("    bondPremium: ").append(toIndentedString(bondPremium)).append("\n");
    sb.append("    bondPremiumOnTreasuryObligations: ").append(toIndentedString(bondPremiumOnTreasuryObligations)).append("\n");
    sb.append("    bondPremiumOnTaxExemptBond: ").append(toIndentedString(bondPremiumOnTaxExemptBond)).append("\n");
    sb.append("    taxExemptBondCusipNumber: ").append(toIndentedString(taxExemptBondCusipNumber)).append("\n");
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
    sb.append("    fatcaFilingRequirement: ").append(toIndentedString(fatcaFilingRequirement)).append("\n");
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
   * @throws IOException if the JSON Element is invalid with respect to Form1099IntListItemResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099IntListItemResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099IntListItemResponse is not found in the empty JSON string", Form1099IntListItemResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099IntListItemResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099IntListItemResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1099IntListItemResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("foreignCountry") != null && !jsonObj.get("foreignCountry").isJsonNull()) && !jsonObj.get("foreignCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignCountry").toString()));
      }
      if ((jsonObj.get("taxExemptBondCusipNumber") != null && !jsonObj.get("taxExemptBondCusipNumber").isJsonNull()) && !jsonObj.get("taxExemptBondCusipNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxExemptBondCusipNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxExemptBondCusipNumber").toString()));
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
       if (!Form1099IntListItemResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099IntListItemResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099IntListItemResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099IntListItemResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099IntListItemResponse>() {
           @Override
           public void write(JsonWriter out, Form1099IntListItemResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099IntListItemResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099IntListItemResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099IntListItemResponse
   * @throws IOException if the JSON string is invalid with respect to Form1099IntListItemResponse
   */
  public static Form1099IntListItemResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099IntListItemResponse.class);
  }

  /**
   * Convert an instance of Form1099IntListItemResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

