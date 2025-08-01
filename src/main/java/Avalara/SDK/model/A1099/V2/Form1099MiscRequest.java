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
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholdingRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Form1099MiscRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099MiscRequest {
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

  public static final String SERIALIZED_NAME_MEDICAL_AND_HEALTH_CARE_PAYMENTS = "medicalAndHealthCarePayments";
  @SerializedName(SERIALIZED_NAME_MEDICAL_AND_HEALTH_CARE_PAYMENTS)
  private Double medicalAndHealthCarePayments;

  public static final String SERIALIZED_NAME_DIRECT_SALES_INDICATOR = "directSalesIndicator";
  @SerializedName(SERIALIZED_NAME_DIRECT_SALES_INDICATOR)
  private Boolean directSalesIndicator;

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
    
    _1095_C("1095-C");

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

  public static final String SERIALIZED_NAME_ISSUER_ID = "issuerId";
  @SerializedName(SERIALIZED_NAME_ISSUER_ID)
  private String issuerId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_RECIPIENT_TIN = "recipientTin";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_TIN)
  private String recipientTin;

  public static final String SERIALIZED_NAME_RECIPIENT_NAME = "recipientName";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_NAME)
  private String recipientName;

  /**
   * Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN
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

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholdingRequest stateAndLocalWithholding;

  public Form1099MiscRequest() {
  }

  public Form1099MiscRequest rents(Double rents) {
    this.rents = rents;
    return this;
  }

  /**
   * Rents
   * @return rents
   */
  @javax.annotation.Nullable
  public Double getRents() {
    return rents;
  }

  public void setRents(Double rents) {
    this.rents = rents;
  }


  public Form1099MiscRequest royalties(Double royalties) {
    this.royalties = royalties;
    return this;
  }

  /**
   * Royalties
   * @return royalties
   */
  @javax.annotation.Nullable
  public Double getRoyalties() {
    return royalties;
  }

  public void setRoyalties(Double royalties) {
    this.royalties = royalties;
  }


  public Form1099MiscRequest otherIncome(Double otherIncome) {
    this.otherIncome = otherIncome;
    return this;
  }

  /**
   * Other income
   * @return otherIncome
   */
  @javax.annotation.Nullable
  public Double getOtherIncome() {
    return otherIncome;
  }

  public void setOtherIncome(Double otherIncome) {
    this.otherIncome = otherIncome;
  }


  public Form1099MiscRequest fedIncomeTaxWithheld(Double fedIncomeTaxWithheld) {
    this.fedIncomeTaxWithheld = fedIncomeTaxWithheld;
    return this;
  }

  /**
   * Federal income tax withheld
   * @return fedIncomeTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getFedIncomeTaxWithheld() {
    return fedIncomeTaxWithheld;
  }

  public void setFedIncomeTaxWithheld(Double fedIncomeTaxWithheld) {
    this.fedIncomeTaxWithheld = fedIncomeTaxWithheld;
  }


  public Form1099MiscRequest fishingBoatProceeds(Double fishingBoatProceeds) {
    this.fishingBoatProceeds = fishingBoatProceeds;
    return this;
  }

  /**
   * Fishing boat proceeds
   * @return fishingBoatProceeds
   */
  @javax.annotation.Nullable
  public Double getFishingBoatProceeds() {
    return fishingBoatProceeds;
  }

  public void setFishingBoatProceeds(Double fishingBoatProceeds) {
    this.fishingBoatProceeds = fishingBoatProceeds;
  }


  public Form1099MiscRequest medicalAndHealthCarePayments(Double medicalAndHealthCarePayments) {
    this.medicalAndHealthCarePayments = medicalAndHealthCarePayments;
    return this;
  }

  /**
   * Medical and health care payments
   * @return medicalAndHealthCarePayments
   */
  @javax.annotation.Nullable
  public Double getMedicalAndHealthCarePayments() {
    return medicalAndHealthCarePayments;
  }

  public void setMedicalAndHealthCarePayments(Double medicalAndHealthCarePayments) {
    this.medicalAndHealthCarePayments = medicalAndHealthCarePayments;
  }


  public Form1099MiscRequest directSalesIndicator(Boolean directSalesIndicator) {
    this.directSalesIndicator = directSalesIndicator;
    return this;
  }

  /**
   * Payer made direct sales totaling $5,000 or more of consumer products to recipient for resale
   * @return directSalesIndicator
   */
  @javax.annotation.Nullable
  public Boolean getDirectSalesIndicator() {
    return directSalesIndicator;
  }

  public void setDirectSalesIndicator(Boolean directSalesIndicator) {
    this.directSalesIndicator = directSalesIndicator;
  }


  public Form1099MiscRequest substitutePayments(Double substitutePayments) {
    this.substitutePayments = substitutePayments;
    return this;
  }

  /**
   * Substitute payments in lieu of dividends or interest
   * @return substitutePayments
   */
  @javax.annotation.Nullable
  public Double getSubstitutePayments() {
    return substitutePayments;
  }

  public void setSubstitutePayments(Double substitutePayments) {
    this.substitutePayments = substitutePayments;
  }


  public Form1099MiscRequest cropInsuranceProceeds(Double cropInsuranceProceeds) {
    this.cropInsuranceProceeds = cropInsuranceProceeds;
    return this;
  }

  /**
   * Crop insurance proceeds
   * @return cropInsuranceProceeds
   */
  @javax.annotation.Nullable
  public Double getCropInsuranceProceeds() {
    return cropInsuranceProceeds;
  }

  public void setCropInsuranceProceeds(Double cropInsuranceProceeds) {
    this.cropInsuranceProceeds = cropInsuranceProceeds;
  }


  public Form1099MiscRequest grossProceedsPaidToAttorney(Double grossProceedsPaidToAttorney) {
    this.grossProceedsPaidToAttorney = grossProceedsPaidToAttorney;
    return this;
  }

  /**
   * Gross proceeds paid to an attorney
   * @return grossProceedsPaidToAttorney
   */
  @javax.annotation.Nullable
  public Double getGrossProceedsPaidToAttorney() {
    return grossProceedsPaidToAttorney;
  }

  public void setGrossProceedsPaidToAttorney(Double grossProceedsPaidToAttorney) {
    this.grossProceedsPaidToAttorney = grossProceedsPaidToAttorney;
  }


  public Form1099MiscRequest fishPurchasedForResale(Double fishPurchasedForResale) {
    this.fishPurchasedForResale = fishPurchasedForResale;
    return this;
  }

  /**
   * Fish purchased for resale
   * @return fishPurchasedForResale
   */
  @javax.annotation.Nullable
  public Double getFishPurchasedForResale() {
    return fishPurchasedForResale;
  }

  public void setFishPurchasedForResale(Double fishPurchasedForResale) {
    this.fishPurchasedForResale = fishPurchasedForResale;
  }


  public Form1099MiscRequest section409ADeferrals(Double section409ADeferrals) {
    this.section409ADeferrals = section409ADeferrals;
    return this;
  }

  /**
   * Section 409A deferrals
   * @return section409ADeferrals
   */
  @javax.annotation.Nullable
  public Double getSection409ADeferrals() {
    return section409ADeferrals;
  }

  public void setSection409ADeferrals(Double section409ADeferrals) {
    this.section409ADeferrals = section409ADeferrals;
  }


  public Form1099MiscRequest fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
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


  public Form1099MiscRequest excessGoldenParachutePayments(Double excessGoldenParachutePayments) {
    this.excessGoldenParachutePayments = excessGoldenParachutePayments;
    return this;
  }

  /**
   * (Legacy field) Excess golden parachute payments
   * @return excessGoldenParachutePayments
   */
  @javax.annotation.Nullable
  public Double getExcessGoldenParachutePayments() {
    return excessGoldenParachutePayments;
  }

  public void setExcessGoldenParachutePayments(Double excessGoldenParachutePayments) {
    this.excessGoldenParachutePayments = excessGoldenParachutePayments;
  }


  public Form1099MiscRequest nonqualifiedDeferredCompensation(Double nonqualifiedDeferredCompensation) {
    this.nonqualifiedDeferredCompensation = nonqualifiedDeferredCompensation;
    return this;
  }

  /**
   * Nonqualified deferred compensation
   * @return nonqualifiedDeferredCompensation
   */
  @javax.annotation.Nullable
  public Double getNonqualifiedDeferredCompensation() {
    return nonqualifiedDeferredCompensation;
  }

  public void setNonqualifiedDeferredCompensation(Double nonqualifiedDeferredCompensation) {
    this.nonqualifiedDeferredCompensation = nonqualifiedDeferredCompensation;
  }


  public Form1099MiscRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Form1099MiscRequest issuerId(String issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * Issuer ID
   * @return issuerId
   */
  @javax.annotation.Nullable
  public String getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(String issuerId) {
    this.issuerId = issuerId;
  }


  public Form1099MiscRequest referenceId(String referenceId) {
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


  public Form1099MiscRequest recipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
    return this;
  }

  /**
   * Recipient Tax ID Number
   * @return recipientTin
   */
  @javax.annotation.Nullable
  public String getRecipientTin() {
    return recipientTin;
  }

  public void setRecipientTin(String recipientTin) {
    this.recipientTin = recipientTin;
  }


  public Form1099MiscRequest recipientName(String recipientName) {
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


  public Form1099MiscRequest tinType(TinTypeEnum tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN
   * @return tinType
   */
  @javax.annotation.Nullable
  public TinTypeEnum getTinType() {
    return tinType;
  }

  public void setTinType(TinTypeEnum tinType) {
    this.tinType = tinType;
  }


  public Form1099MiscRequest recipientSecondName(String recipientSecondName) {
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


  public Form1099MiscRequest address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address
   * @return address
   */
  @javax.annotation.Nonnull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Form1099MiscRequest address2(String address2) {
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


  public Form1099MiscRequest city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
   */
  @javax.annotation.Nonnull
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public Form1099MiscRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * US state. Required if CountryCode is \&quot;US\&quot;.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Form1099MiscRequest zip(String zip) {
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


  public Form1099MiscRequest email(String email) {
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


  public Form1099MiscRequest accountNumber(String accountNumber) {
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


  public Form1099MiscRequest officeCode(String officeCode) {
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


  public Form1099MiscRequest nonUsProvince(String nonUsProvince) {
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


  public Form1099MiscRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code, as defined at https://www.irs.gov/e-file-providers/country-codes
   * @return countryCode
   */
  @javax.annotation.Nonnull
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Form1099MiscRequest federalEFile(Boolean federalEFile) {
    this.federalEFile = federalEFile;
    return this;
  }

  /**
   * Boolean indicating that federal e-filing should be scheduled for this form
   * @return federalEFile
   */
  @javax.annotation.Nullable
  public Boolean getFederalEFile() {
    return federalEFile;
  }

  public void setFederalEFile(Boolean federalEFile) {
    this.federalEFile = federalEFile;
  }


  public Form1099MiscRequest postalMail(Boolean postalMail) {
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


  public Form1099MiscRequest stateEFile(Boolean stateEFile) {
    this.stateEFile = stateEFile;
    return this;
  }

  /**
   * Boolean indicating that state e-filing should be scheduled for this form
   * @return stateEFile
   */
  @javax.annotation.Nullable
  public Boolean getStateEFile() {
    return stateEFile;
  }

  public void setStateEFile(Boolean stateEFile) {
    this.stateEFile = stateEFile;
  }


  public Form1099MiscRequest tinMatch(Boolean tinMatch) {
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


  public Form1099MiscRequest noTin(Boolean noTin) {
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


  public Form1099MiscRequest secondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
    return this;
  }

  /**
   * Second TIN notice in three years
   * @return secondTinNotice
   */
  @javax.annotation.Nullable
  public Boolean getSecondTinNotice() {
    return secondTinNotice;
  }

  public void setSecondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
  }


  public Form1099MiscRequest addressVerification(Boolean addressVerification) {
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


  public Form1099MiscRequest stateAndLocalWithholding(StateAndLocalWithholdingRequest stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
    return this;
  }

  /**
   * State and local withholding information
   * @return stateAndLocalWithholding
   */
  @javax.annotation.Nullable
  public StateAndLocalWithholdingRequest getStateAndLocalWithholding() {
    return stateAndLocalWithholding;
  }

  public void setStateAndLocalWithholding(StateAndLocalWithholdingRequest stateAndLocalWithholding) {
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
    Form1099MiscRequest form1099MiscRequest = (Form1099MiscRequest) o;
    return Objects.equals(this.rents, form1099MiscRequest.rents) &&
        Objects.equals(this.royalties, form1099MiscRequest.royalties) &&
        Objects.equals(this.otherIncome, form1099MiscRequest.otherIncome) &&
        Objects.equals(this.fedIncomeTaxWithheld, form1099MiscRequest.fedIncomeTaxWithheld) &&
        Objects.equals(this.fishingBoatProceeds, form1099MiscRequest.fishingBoatProceeds) &&
        Objects.equals(this.medicalAndHealthCarePayments, form1099MiscRequest.medicalAndHealthCarePayments) &&
        Objects.equals(this.directSalesIndicator, form1099MiscRequest.directSalesIndicator) &&
        Objects.equals(this.substitutePayments, form1099MiscRequest.substitutePayments) &&
        Objects.equals(this.cropInsuranceProceeds, form1099MiscRequest.cropInsuranceProceeds) &&
        Objects.equals(this.grossProceedsPaidToAttorney, form1099MiscRequest.grossProceedsPaidToAttorney) &&
        Objects.equals(this.fishPurchasedForResale, form1099MiscRequest.fishPurchasedForResale) &&
        Objects.equals(this.section409ADeferrals, form1099MiscRequest.section409ADeferrals) &&
        Objects.equals(this.fatcaFilingRequirement, form1099MiscRequest.fatcaFilingRequirement) &&
        Objects.equals(this.excessGoldenParachutePayments, form1099MiscRequest.excessGoldenParachutePayments) &&
        Objects.equals(this.nonqualifiedDeferredCompensation, form1099MiscRequest.nonqualifiedDeferredCompensation) &&
        Objects.equals(this.type, form1099MiscRequest.type) &&
        Objects.equals(this.issuerId, form1099MiscRequest.issuerId) &&
        Objects.equals(this.referenceId, form1099MiscRequest.referenceId) &&
        Objects.equals(this.recipientTin, form1099MiscRequest.recipientTin) &&
        Objects.equals(this.recipientName, form1099MiscRequest.recipientName) &&
        Objects.equals(this.tinType, form1099MiscRequest.tinType) &&
        Objects.equals(this.recipientSecondName, form1099MiscRequest.recipientSecondName) &&
        Objects.equals(this.address, form1099MiscRequest.address) &&
        Objects.equals(this.address2, form1099MiscRequest.address2) &&
        Objects.equals(this.city, form1099MiscRequest.city) &&
        Objects.equals(this.state, form1099MiscRequest.state) &&
        Objects.equals(this.zip, form1099MiscRequest.zip) &&
        Objects.equals(this.email, form1099MiscRequest.email) &&
        Objects.equals(this.accountNumber, form1099MiscRequest.accountNumber) &&
        Objects.equals(this.officeCode, form1099MiscRequest.officeCode) &&
        Objects.equals(this.nonUsProvince, form1099MiscRequest.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099MiscRequest.countryCode) &&
        Objects.equals(this.federalEFile, form1099MiscRequest.federalEFile) &&
        Objects.equals(this.postalMail, form1099MiscRequest.postalMail) &&
        Objects.equals(this.stateEFile, form1099MiscRequest.stateEFile) &&
        Objects.equals(this.tinMatch, form1099MiscRequest.tinMatch) &&
        Objects.equals(this.noTin, form1099MiscRequest.noTin) &&
        Objects.equals(this.secondTinNotice, form1099MiscRequest.secondTinNotice) &&
        Objects.equals(this.addressVerification, form1099MiscRequest.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form1099MiscRequest.stateAndLocalWithholding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(rents, royalties, otherIncome, fedIncomeTaxWithheld, fishingBoatProceeds, medicalAndHealthCarePayments, directSalesIndicator, substitutePayments, cropInsuranceProceeds, grossProceedsPaidToAttorney, fishPurchasedForResale, section409ADeferrals, fatcaFilingRequirement, excessGoldenParachutePayments, nonqualifiedDeferredCompensation, type, issuerId, referenceId, recipientTin, recipientName, tinType, recipientSecondName, address, address2, city, state, zip, email, accountNumber, officeCode, nonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, noTin, secondTinNotice, addressVerification, stateAndLocalWithholding);
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
    sb.append("class Form1099MiscRequest {\n");
    sb.append("    rents: ").append(toIndentedString(rents)).append("\n");
    sb.append("    royalties: ").append(toIndentedString(royalties)).append("\n");
    sb.append("    otherIncome: ").append(toIndentedString(otherIncome)).append("\n");
    sb.append("    fedIncomeTaxWithheld: ").append(toIndentedString(fedIncomeTaxWithheld)).append("\n");
    sb.append("    fishingBoatProceeds: ").append(toIndentedString(fishingBoatProceeds)).append("\n");
    sb.append("    medicalAndHealthCarePayments: ").append(toIndentedString(medicalAndHealthCarePayments)).append("\n");
    sb.append("    directSalesIndicator: ").append(toIndentedString(directSalesIndicator)).append("\n");
    sb.append("    substitutePayments: ").append(toIndentedString(substitutePayments)).append("\n");
    sb.append("    cropInsuranceProceeds: ").append(toIndentedString(cropInsuranceProceeds)).append("\n");
    sb.append("    grossProceedsPaidToAttorney: ").append(toIndentedString(grossProceedsPaidToAttorney)).append("\n");
    sb.append("    fishPurchasedForResale: ").append(toIndentedString(fishPurchasedForResale)).append("\n");
    sb.append("    section409ADeferrals: ").append(toIndentedString(section409ADeferrals)).append("\n");
    sb.append("    fatcaFilingRequirement: ").append(toIndentedString(fatcaFilingRequirement)).append("\n");
    sb.append("    excessGoldenParachutePayments: ").append(toIndentedString(excessGoldenParachutePayments)).append("\n");
    sb.append("    nonqualifiedDeferredCompensation: ").append(toIndentedString(nonqualifiedDeferredCompensation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
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
    sb.append("    federalEFile: ").append(toIndentedString(federalEFile)).append("\n");
    sb.append("    postalMail: ").append(toIndentedString(postalMail)).append("\n");
    sb.append("    stateEFile: ").append(toIndentedString(stateEFile)).append("\n");
    sb.append("    tinMatch: ").append(toIndentedString(tinMatch)).append("\n");
    sb.append("    noTin: ").append(toIndentedString(noTin)).append("\n");
    sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("issuerId");
    openapiFields.add("referenceId");
    openapiFields.add("recipientTin");
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
    openapiFields.add("federalEFile");
    openapiFields.add("postalMail");
    openapiFields.add("stateEFile");
    openapiFields.add("tinMatch");
    openapiFields.add("noTin");
    openapiFields.add("secondTinNotice");
    openapiFields.add("addressVerification");
    openapiFields.add("stateAndLocalWithholding");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("countryCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1099MiscRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099MiscRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099MiscRequest is not found in the empty JSON string", Form1099MiscRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099MiscRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099MiscRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1099MiscRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("issuerId") != null && !jsonObj.get("issuerId").isJsonNull()) && !jsonObj.get("issuerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerId").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("recipientTin") != null && !jsonObj.get("recipientTin").isJsonNull()) && !jsonObj.get("recipientTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientTin").toString()));
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
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("address2") != null && !jsonObj.get("address2").isJsonNull()) && !jsonObj.get("address2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address2").toString()));
      }
      if (!jsonObj.get("city").isJsonPrimitive()) {
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
      if (!jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholdingRequest.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form1099MiscRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099MiscRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099MiscRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099MiscRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099MiscRequest>() {
           @Override
           public void write(JsonWriter out, Form1099MiscRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099MiscRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099MiscRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099MiscRequest
   * @throws IOException if the JSON string is invalid with respect to Form1099MiscRequest
   */
  public static Form1099MiscRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099MiscRequest.class);
  }

  /**
   * Convert an instance of Form1099MiscRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

