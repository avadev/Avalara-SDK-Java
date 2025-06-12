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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * Form1099MiscListItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099MiscListItem {
  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholding stateAndLocalWithholding;

  public static final String SERIALIZED_NAME_SECOND_TIN_NOTICE = "secondTinNotice";
  @SerializedName(SERIALIZED_NAME_SECOND_TIN_NOTICE)
  private Boolean secondTinNotice;

  public static final String SERIALIZED_NAME_RENTS = "rents";
  @SerializedName(SERIALIZED_NAME_RENTS)
  private Double rents;

  public static final String SERIALIZED_NAME_ROYALTIES = "royalties";
  @SerializedName(SERIALIZED_NAME_ROYALTIES)
  private Double royalties;

  public static final String SERIALIZED_NAME_OTHER_INCOME = "otherIncome";
  @SerializedName(SERIALIZED_NAME_OTHER_INCOME)
  private Double otherIncome;

  public static final String SERIALIZED_NAME_FED_INCOME_TAX_WITHHELD = "fedIncomeTaxWithheld";
  @SerializedName(SERIALIZED_NAME_FED_INCOME_TAX_WITHHELD)
  private Double fedIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_FISHING_BOAT_PROCEEDS = "fishingBoatProceeds";
  @SerializedName(SERIALIZED_NAME_FISHING_BOAT_PROCEEDS)
  private Double fishingBoatProceeds;

  public static final String SERIALIZED_NAME_MEDICAL_HEALTH_CARE_PAYMENTS = "medicalHealthCarePayments";
  @SerializedName(SERIALIZED_NAME_MEDICAL_HEALTH_CARE_PAYMENTS)
  private Double medicalHealthCarePayments;

  public static final String SERIALIZED_NAME_PAYER_MADE_DIRECT_SALES = "payerMadeDirectSales";
  @SerializedName(SERIALIZED_NAME_PAYER_MADE_DIRECT_SALES)
  private Boolean payerMadeDirectSales;

  public static final String SERIALIZED_NAME_SUBSTITUTE_PAYMENTS = "substitutePayments";
  @SerializedName(SERIALIZED_NAME_SUBSTITUTE_PAYMENTS)
  private Double substitutePayments;

  public static final String SERIALIZED_NAME_CROP_INSURANCE_PROCEEDS = "cropInsuranceProceeds";
  @SerializedName(SERIALIZED_NAME_CROP_INSURANCE_PROCEEDS)
  private Double cropInsuranceProceeds;

  public static final String SERIALIZED_NAME_GROSS_PROCEEDS_PAID_TO_ATTORNEY = "grossProceedsPaidToAttorney";
  @SerializedName(SERIALIZED_NAME_GROSS_PROCEEDS_PAID_TO_ATTORNEY)
  private Double grossProceedsPaidToAttorney;

  public static final String SERIALIZED_NAME_FISH_PURCHASED_FOR_RESALE = "fishPurchasedForResale";
  @SerializedName(SERIALIZED_NAME_FISH_PURCHASED_FOR_RESALE)
  private Double fishPurchasedForResale;

  public static final String SERIALIZED_NAME_SECTION409_A_DEFERRALS = "section409ADeferrals";
  @SerializedName(SERIALIZED_NAME_SECTION409_A_DEFERRALS)
  private Double section409ADeferrals;

  public static final String SERIALIZED_NAME_FATCA_FILING_REQUIREMENT = "fatcaFilingRequirement";
  @SerializedName(SERIALIZED_NAME_FATCA_FILING_REQUIREMENT)
  private Boolean fatcaFilingRequirement;

  public static final String SERIALIZED_NAME_EXCESS_GOLDEN_PARACHUTE_PAYMENTS = "excessGoldenParachutePayments";
  @SerializedName(SERIALIZED_NAME_EXCESS_GOLDEN_PARACHUTE_PAYMENTS)
  private Double excessGoldenParachutePayments;

  public static final String SERIALIZED_NAME_NONQUALIFIED_DEFERRED_COMPENSATION = "nonqualifiedDeferredCompensation";
  @SerializedName(SERIALIZED_NAME_NONQUALIFIED_DEFERRED_COMPENSATION)
  private Double nonqualifiedDeferredCompensation;

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

  public static final String SERIALIZED_NAME_TIN_TYPE = "tinType";
  @SerializedName(SERIALIZED_NAME_TIN_TYPE)
  private Integer tinType;

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

  public Form1099MiscListItem() {
  }

  public Form1099MiscListItem stateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
    return this;
  }

  /**
   * Get stateAndLocalWithholding
   * @return stateAndLocalWithholding
   */
  @javax.annotation.Nullable
  public StateAndLocalWithholding getStateAndLocalWithholding() {
    return stateAndLocalWithholding;
  }

  public void setStateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
  }


  public Form1099MiscListItem secondTinNotice(Boolean secondTinNotice) {
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


  public Form1099MiscListItem rents(Double rents) {
    this.rents = rents;
    return this;
  }

  /**
   * Get rents
   * @return rents
   */
  @javax.annotation.Nullable
  public Double getRents() {
    return rents;
  }

  public void setRents(Double rents) {
    this.rents = rents;
  }


  public Form1099MiscListItem royalties(Double royalties) {
    this.royalties = royalties;
    return this;
  }

  /**
   * Get royalties
   * @return royalties
   */
  @javax.annotation.Nullable
  public Double getRoyalties() {
    return royalties;
  }

  public void setRoyalties(Double royalties) {
    this.royalties = royalties;
  }


  public Form1099MiscListItem otherIncome(Double otherIncome) {
    this.otherIncome = otherIncome;
    return this;
  }

  /**
   * Get otherIncome
   * @return otherIncome
   */
  @javax.annotation.Nullable
  public Double getOtherIncome() {
    return otherIncome;
  }

  public void setOtherIncome(Double otherIncome) {
    this.otherIncome = otherIncome;
  }


  public Form1099MiscListItem fedIncomeTaxWithheld(Double fedIncomeTaxWithheld) {
    this.fedIncomeTaxWithheld = fedIncomeTaxWithheld;
    return this;
  }

  /**
   * Get fedIncomeTaxWithheld
   * @return fedIncomeTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getFedIncomeTaxWithheld() {
    return fedIncomeTaxWithheld;
  }

  public void setFedIncomeTaxWithheld(Double fedIncomeTaxWithheld) {
    this.fedIncomeTaxWithheld = fedIncomeTaxWithheld;
  }


  public Form1099MiscListItem fishingBoatProceeds(Double fishingBoatProceeds) {
    this.fishingBoatProceeds = fishingBoatProceeds;
    return this;
  }

  /**
   * Get fishingBoatProceeds
   * @return fishingBoatProceeds
   */
  @javax.annotation.Nullable
  public Double getFishingBoatProceeds() {
    return fishingBoatProceeds;
  }

  public void setFishingBoatProceeds(Double fishingBoatProceeds) {
    this.fishingBoatProceeds = fishingBoatProceeds;
  }


  public Form1099MiscListItem medicalHealthCarePayments(Double medicalHealthCarePayments) {
    this.medicalHealthCarePayments = medicalHealthCarePayments;
    return this;
  }

  /**
   * Get medicalHealthCarePayments
   * @return medicalHealthCarePayments
   */
  @javax.annotation.Nullable
  public Double getMedicalHealthCarePayments() {
    return medicalHealthCarePayments;
  }

  public void setMedicalHealthCarePayments(Double medicalHealthCarePayments) {
    this.medicalHealthCarePayments = medicalHealthCarePayments;
  }


  public Form1099MiscListItem payerMadeDirectSales(Boolean payerMadeDirectSales) {
    this.payerMadeDirectSales = payerMadeDirectSales;
    return this;
  }

  /**
   * Get payerMadeDirectSales
   * @return payerMadeDirectSales
   */
  @javax.annotation.Nullable
  public Boolean getPayerMadeDirectSales() {
    return payerMadeDirectSales;
  }

  public void setPayerMadeDirectSales(Boolean payerMadeDirectSales) {
    this.payerMadeDirectSales = payerMadeDirectSales;
  }


  public Form1099MiscListItem substitutePayments(Double substitutePayments) {
    this.substitutePayments = substitutePayments;
    return this;
  }

  /**
   * Get substitutePayments
   * @return substitutePayments
   */
  @javax.annotation.Nullable
  public Double getSubstitutePayments() {
    return substitutePayments;
  }

  public void setSubstitutePayments(Double substitutePayments) {
    this.substitutePayments = substitutePayments;
  }


  public Form1099MiscListItem cropInsuranceProceeds(Double cropInsuranceProceeds) {
    this.cropInsuranceProceeds = cropInsuranceProceeds;
    return this;
  }

  /**
   * Get cropInsuranceProceeds
   * @return cropInsuranceProceeds
   */
  @javax.annotation.Nullable
  public Double getCropInsuranceProceeds() {
    return cropInsuranceProceeds;
  }

  public void setCropInsuranceProceeds(Double cropInsuranceProceeds) {
    this.cropInsuranceProceeds = cropInsuranceProceeds;
  }


  public Form1099MiscListItem grossProceedsPaidToAttorney(Double grossProceedsPaidToAttorney) {
    this.grossProceedsPaidToAttorney = grossProceedsPaidToAttorney;
    return this;
  }

  /**
   * Get grossProceedsPaidToAttorney
   * @return grossProceedsPaidToAttorney
   */
  @javax.annotation.Nullable
  public Double getGrossProceedsPaidToAttorney() {
    return grossProceedsPaidToAttorney;
  }

  public void setGrossProceedsPaidToAttorney(Double grossProceedsPaidToAttorney) {
    this.grossProceedsPaidToAttorney = grossProceedsPaidToAttorney;
  }


  public Form1099MiscListItem fishPurchasedForResale(Double fishPurchasedForResale) {
    this.fishPurchasedForResale = fishPurchasedForResale;
    return this;
  }

  /**
   * Get fishPurchasedForResale
   * @return fishPurchasedForResale
   */
  @javax.annotation.Nullable
  public Double getFishPurchasedForResale() {
    return fishPurchasedForResale;
  }

  public void setFishPurchasedForResale(Double fishPurchasedForResale) {
    this.fishPurchasedForResale = fishPurchasedForResale;
  }


  public Form1099MiscListItem section409ADeferrals(Double section409ADeferrals) {
    this.section409ADeferrals = section409ADeferrals;
    return this;
  }

  /**
   * Get section409ADeferrals
   * @return section409ADeferrals
   */
  @javax.annotation.Nullable
  public Double getSection409ADeferrals() {
    return section409ADeferrals;
  }

  public void setSection409ADeferrals(Double section409ADeferrals) {
    this.section409ADeferrals = section409ADeferrals;
  }


  public Form1099MiscListItem fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
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


  public Form1099MiscListItem excessGoldenParachutePayments(Double excessGoldenParachutePayments) {
    this.excessGoldenParachutePayments = excessGoldenParachutePayments;
    return this;
  }

  /**
   * Get excessGoldenParachutePayments
   * @return excessGoldenParachutePayments
   */
  @javax.annotation.Nullable
  public Double getExcessGoldenParachutePayments() {
    return excessGoldenParachutePayments;
  }

  public void setExcessGoldenParachutePayments(Double excessGoldenParachutePayments) {
    this.excessGoldenParachutePayments = excessGoldenParachutePayments;
  }


  public Form1099MiscListItem nonqualifiedDeferredCompensation(Double nonqualifiedDeferredCompensation) {
    this.nonqualifiedDeferredCompensation = nonqualifiedDeferredCompensation;
    return this;
  }

  /**
   * Get nonqualifiedDeferredCompensation
   * @return nonqualifiedDeferredCompensation
   */
  @javax.annotation.Nullable
  public Double getNonqualifiedDeferredCompensation() {
    return nonqualifiedDeferredCompensation;
  }

  public void setNonqualifiedDeferredCompensation(Double nonqualifiedDeferredCompensation) {
    this.nonqualifiedDeferredCompensation = nonqualifiedDeferredCompensation;
  }


  public Form1099MiscListItem issuerId(String issuerId) {
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


  public Form1099MiscListItem issuerReferenceId(String issuerReferenceId) {
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


  public Form1099MiscListItem issuerTin(String issuerTin) {
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


  public Form1099MiscListItem taxYear(Integer taxYear) {
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


  public Form1099MiscListItem referenceId(String referenceId) {
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


  public Form1099MiscListItem recipientName(String recipientName) {
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


  public Form1099MiscListItem recipientTin(String recipientTin) {
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


  public Form1099MiscListItem tinType(Integer tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * Get tinType
   * @return tinType
   */
  @javax.annotation.Nullable
  public Integer getTinType() {
    return tinType;
  }

  public void setTinType(Integer tinType) {
    this.tinType = tinType;
  }


  public Form1099MiscListItem recipientSecondName(String recipientSecondName) {
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


  public Form1099MiscListItem streetAddress(String streetAddress) {
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


  public Form1099MiscListItem streetAddressLine2(String streetAddressLine2) {
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


  public Form1099MiscListItem city(String city) {
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


  public Form1099MiscListItem state(String state) {
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


  public Form1099MiscListItem zip(String zip) {
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


  public Form1099MiscListItem recipientEmail(String recipientEmail) {
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


  public Form1099MiscListItem accountNumber(String accountNumber) {
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


  public Form1099MiscListItem officeCode(String officeCode) {
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


  public Form1099MiscListItem recipientNonUsProvince(String recipientNonUsProvince) {
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


  public Form1099MiscListItem countryCode(String countryCode) {
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


  public Form1099MiscListItem federalEFile(Boolean federalEFile) {
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


  public Form1099MiscListItem postalMail(Boolean postalMail) {
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


  public Form1099MiscListItem stateEFile(Boolean stateEFile) {
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


  public Form1099MiscListItem tinMatch(Boolean tinMatch) {
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


  public Form1099MiscListItem addressVerification(Boolean addressVerification) {
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
    Form1099MiscListItem form1099MiscListItem = (Form1099MiscListItem) o;
    return Objects.equals(this.stateAndLocalWithholding, form1099MiscListItem.stateAndLocalWithholding) &&
        Objects.equals(this.secondTinNotice, form1099MiscListItem.secondTinNotice) &&
        Objects.equals(this.rents, form1099MiscListItem.rents) &&
        Objects.equals(this.royalties, form1099MiscListItem.royalties) &&
        Objects.equals(this.otherIncome, form1099MiscListItem.otherIncome) &&
        Objects.equals(this.fedIncomeTaxWithheld, form1099MiscListItem.fedIncomeTaxWithheld) &&
        Objects.equals(this.fishingBoatProceeds, form1099MiscListItem.fishingBoatProceeds) &&
        Objects.equals(this.medicalHealthCarePayments, form1099MiscListItem.medicalHealthCarePayments) &&
        Objects.equals(this.payerMadeDirectSales, form1099MiscListItem.payerMadeDirectSales) &&
        Objects.equals(this.substitutePayments, form1099MiscListItem.substitutePayments) &&
        Objects.equals(this.cropInsuranceProceeds, form1099MiscListItem.cropInsuranceProceeds) &&
        Objects.equals(this.grossProceedsPaidToAttorney, form1099MiscListItem.grossProceedsPaidToAttorney) &&
        Objects.equals(this.fishPurchasedForResale, form1099MiscListItem.fishPurchasedForResale) &&
        Objects.equals(this.section409ADeferrals, form1099MiscListItem.section409ADeferrals) &&
        Objects.equals(this.fatcaFilingRequirement, form1099MiscListItem.fatcaFilingRequirement) &&
        Objects.equals(this.excessGoldenParachutePayments, form1099MiscListItem.excessGoldenParachutePayments) &&
        Objects.equals(this.nonqualifiedDeferredCompensation, form1099MiscListItem.nonqualifiedDeferredCompensation) &&
        Objects.equals(this.issuerId, form1099MiscListItem.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099MiscListItem.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099MiscListItem.issuerTin) &&
        Objects.equals(this.taxYear, form1099MiscListItem.taxYear) &&
        Objects.equals(this.referenceId, form1099MiscListItem.referenceId) &&
        Objects.equals(this.recipientName, form1099MiscListItem.recipientName) &&
        Objects.equals(this.recipientTin, form1099MiscListItem.recipientTin) &&
        Objects.equals(this.tinType, form1099MiscListItem.tinType) &&
        Objects.equals(this.recipientSecondName, form1099MiscListItem.recipientSecondName) &&
        Objects.equals(this.streetAddress, form1099MiscListItem.streetAddress) &&
        Objects.equals(this.streetAddressLine2, form1099MiscListItem.streetAddressLine2) &&
        Objects.equals(this.city, form1099MiscListItem.city) &&
        Objects.equals(this.state, form1099MiscListItem.state) &&
        Objects.equals(this.zip, form1099MiscListItem.zip) &&
        Objects.equals(this.recipientEmail, form1099MiscListItem.recipientEmail) &&
        Objects.equals(this.accountNumber, form1099MiscListItem.accountNumber) &&
        Objects.equals(this.officeCode, form1099MiscListItem.officeCode) &&
        Objects.equals(this.recipientNonUsProvince, form1099MiscListItem.recipientNonUsProvince) &&
        Objects.equals(this.countryCode, form1099MiscListItem.countryCode) &&
        Objects.equals(this.federalEFile, form1099MiscListItem.federalEFile) &&
        Objects.equals(this.postalMail, form1099MiscListItem.postalMail) &&
        Objects.equals(this.stateEFile, form1099MiscListItem.stateEFile) &&
        Objects.equals(this.tinMatch, form1099MiscListItem.tinMatch) &&
        Objects.equals(this.addressVerification, form1099MiscListItem.addressVerification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateAndLocalWithholding, secondTinNotice, rents, royalties, otherIncome, fedIncomeTaxWithheld, fishingBoatProceeds, medicalHealthCarePayments, payerMadeDirectSales, substitutePayments, cropInsuranceProceeds, grossProceedsPaidToAttorney, fishPurchasedForResale, section409ADeferrals, fatcaFilingRequirement, excessGoldenParachutePayments, nonqualifiedDeferredCompensation, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, recipientName, recipientTin, tinType, recipientSecondName, streetAddress, streetAddressLine2, city, state, zip, recipientEmail, accountNumber, officeCode, recipientNonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, addressVerification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form1099MiscListItem {\n");
    sb.append("    stateAndLocalWithholding: ").append(toIndentedString(stateAndLocalWithholding)).append("\n");
    sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
    sb.append("    rents: ").append(toIndentedString(rents)).append("\n");
    sb.append("    royalties: ").append(toIndentedString(royalties)).append("\n");
    sb.append("    otherIncome: ").append(toIndentedString(otherIncome)).append("\n");
    sb.append("    fedIncomeTaxWithheld: ").append(toIndentedString(fedIncomeTaxWithheld)).append("\n");
    sb.append("    fishingBoatProceeds: ").append(toIndentedString(fishingBoatProceeds)).append("\n");
    sb.append("    medicalHealthCarePayments: ").append(toIndentedString(medicalHealthCarePayments)).append("\n");
    sb.append("    payerMadeDirectSales: ").append(toIndentedString(payerMadeDirectSales)).append("\n");
    sb.append("    substitutePayments: ").append(toIndentedString(substitutePayments)).append("\n");
    sb.append("    cropInsuranceProceeds: ").append(toIndentedString(cropInsuranceProceeds)).append("\n");
    sb.append("    grossProceedsPaidToAttorney: ").append(toIndentedString(grossProceedsPaidToAttorney)).append("\n");
    sb.append("    fishPurchasedForResale: ").append(toIndentedString(fishPurchasedForResale)).append("\n");
    sb.append("    section409ADeferrals: ").append(toIndentedString(section409ADeferrals)).append("\n");
    sb.append("    fatcaFilingRequirement: ").append(toIndentedString(fatcaFilingRequirement)).append("\n");
    sb.append("    excessGoldenParachutePayments: ").append(toIndentedString(excessGoldenParachutePayments)).append("\n");
    sb.append("    nonqualifiedDeferredCompensation: ").append(toIndentedString(nonqualifiedDeferredCompensation)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerReferenceId: ").append(toIndentedString(issuerReferenceId)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
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
    openapiFields.add("issuerId");
    openapiFields.add("issuerReferenceId");
    openapiFields.add("issuerTin");
    openapiFields.add("taxYear");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1099MiscListItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099MiscListItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099MiscListItem is not found in the empty JSON string", Form1099MiscListItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099MiscListItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099MiscListItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholding.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
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
       if (!Form1099MiscListItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099MiscListItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099MiscListItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099MiscListItem.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099MiscListItem>() {
           @Override
           public void write(JsonWriter out, Form1099MiscListItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099MiscListItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099MiscListItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099MiscListItem
   * @throws IOException if the JSON string is invalid with respect to Form1099MiscListItem
   */
  public static Form1099MiscListItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099MiscListItem.class);
  }

  /**
   * Convert an instance of Form1099MiscListItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

