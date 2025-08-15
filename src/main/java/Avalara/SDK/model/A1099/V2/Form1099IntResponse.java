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
 * Form1099IntResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099IntResponse {
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

  public Form1099IntResponse() {
  }

  public Form1099IntResponse(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  public Form1099IntResponse interestIncome(Double interestIncome) {
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


  public Form1099IntResponse earlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
    this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
    return this;
  }

  /**
   * Early Withdrawal Penalty
   * @return earlyWithdrawalPenalty
   */
  @javax.annotation.Nullable
  public Double getEarlyWithdrawalPenalty() {
    return earlyWithdrawalPenalty;
  }

  public void setEarlyWithdrawalPenalty(Double earlyWithdrawalPenalty) {
    this.earlyWithdrawalPenalty = earlyWithdrawalPenalty;
  }


  public Form1099IntResponse usSavingsBondsInterest(Double usSavingsBondsInterest) {
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


  public Form1099IntResponse federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
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


  public Form1099IntResponse investmentExpenses(Double investmentExpenses) {
    this.investmentExpenses = investmentExpenses;
    return this;
  }

  /**
   * Investment Expenses
   * @return investmentExpenses
   */
  @javax.annotation.Nullable
  public Double getInvestmentExpenses() {
    return investmentExpenses;
  }

  public void setInvestmentExpenses(Double investmentExpenses) {
    this.investmentExpenses = investmentExpenses;
  }


  public Form1099IntResponse foreignTaxPaid(Double foreignTaxPaid) {
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


  public Form1099IntResponse foreignCountry(String foreignCountry) {
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


  public Form1099IntResponse taxExemptInterest(Double taxExemptInterest) {
    this.taxExemptInterest = taxExemptInterest;
    return this;
  }

  /**
   * Tax-Exempt Interest
   * @return taxExemptInterest
   */
  @javax.annotation.Nullable
  public Double getTaxExemptInterest() {
    return taxExemptInterest;
  }

  public void setTaxExemptInterest(Double taxExemptInterest) {
    this.taxExemptInterest = taxExemptInterest;
  }


  public Form1099IntResponse specifiedPrivateActivityBondInterest(Double specifiedPrivateActivityBondInterest) {
    this.specifiedPrivateActivityBondInterest = specifiedPrivateActivityBondInterest;
    return this;
  }

  /**
   * Specified Private activity
   * @return specifiedPrivateActivityBondInterest
   */
  @javax.annotation.Nullable
  public Double getSpecifiedPrivateActivityBondInterest() {
    return specifiedPrivateActivityBondInterest;
  }

  public void setSpecifiedPrivateActivityBondInterest(Double specifiedPrivateActivityBondInterest) {
    this.specifiedPrivateActivityBondInterest = specifiedPrivateActivityBondInterest;
  }


  public Form1099IntResponse marketDiscount(Double marketDiscount) {
    this.marketDiscount = marketDiscount;
    return this;
  }

  /**
   * Market Discount
   * @return marketDiscount
   */
  @javax.annotation.Nullable
  public Double getMarketDiscount() {
    return marketDiscount;
  }

  public void setMarketDiscount(Double marketDiscount) {
    this.marketDiscount = marketDiscount;
  }


  public Form1099IntResponse bondPremium(Double bondPremium) {
    this.bondPremium = bondPremium;
    return this;
  }

  /**
   * Bond Premium
   * @return bondPremium
   */
  @javax.annotation.Nullable
  public Double getBondPremium() {
    return bondPremium;
  }

  public void setBondPremium(Double bondPremium) {
    this.bondPremium = bondPremium;
  }


  public Form1099IntResponse bondPremiumOnTreasuryObligations(Double bondPremiumOnTreasuryObligations) {
    this.bondPremiumOnTreasuryObligations = bondPremiumOnTreasuryObligations;
    return this;
  }

  /**
   * Bond Premium on Treasury obligations
   * @return bondPremiumOnTreasuryObligations
   */
  @javax.annotation.Nullable
  public Double getBondPremiumOnTreasuryObligations() {
    return bondPremiumOnTreasuryObligations;
  }

  public void setBondPremiumOnTreasuryObligations(Double bondPremiumOnTreasuryObligations) {
    this.bondPremiumOnTreasuryObligations = bondPremiumOnTreasuryObligations;
  }


  public Form1099IntResponse bondPremiumOnTaxExemptBond(Double bondPremiumOnTaxExemptBond) {
    this.bondPremiumOnTaxExemptBond = bondPremiumOnTaxExemptBond;
    return this;
  }

  /**
   * Bond Premium on tax exempt bond
   * @return bondPremiumOnTaxExemptBond
   */
  @javax.annotation.Nullable
  public Double getBondPremiumOnTaxExemptBond() {
    return bondPremiumOnTaxExemptBond;
  }

  public void setBondPremiumOnTaxExemptBond(Double bondPremiumOnTaxExemptBond) {
    this.bondPremiumOnTaxExemptBond = bondPremiumOnTaxExemptBond;
  }


  public Form1099IntResponse taxExemptBondCusipNumber(String taxExemptBondCusipNumber) {
    this.taxExemptBondCusipNumber = taxExemptBondCusipNumber;
    return this;
  }

  /**
   * Tax exempt bond CUSIP no.
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
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }



  public Form1099IntResponse createdAt(OffsetDateTime createdAt) {
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


  public Form1099IntResponse updatedAt(OffsetDateTime updatedAt) {
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


  public Form1099IntResponse stateAndLocalWithholding(StateAndLocalWithholdingResponse stateAndLocalWithholding) {
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


  public Form1099IntResponse tinType(TinTypeEnum tinType) {
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


  public Form1099IntResponse id(String id) {
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


  public Form1099IntResponse issuerId(String issuerId) {
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


  public Form1099IntResponse issuerReferenceId(String issuerReferenceId) {
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


  public Form1099IntResponse issuerTin(String issuerTin) {
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


  public Form1099IntResponse taxYear(Integer taxYear) {
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


  public Form1099IntResponse referenceId(String referenceId) {
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


  public Form1099IntResponse recipientName(String recipientName) {
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


  public Form1099IntResponse recipientTin(String recipientTin) {
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


  public Form1099IntResponse recipientSecondName(String recipientSecondName) {
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


  public Form1099IntResponse address(String address) {
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


  public Form1099IntResponse address2(String address2) {
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


  public Form1099IntResponse city(String city) {
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


  public Form1099IntResponse state(String state) {
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


  public Form1099IntResponse zip(String zip) {
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


  public Form1099IntResponse email(String email) {
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


  public Form1099IntResponse accountNumber(String accountNumber) {
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


  public Form1099IntResponse officeCode(String officeCode) {
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


  public Form1099IntResponse nonUsProvince(String nonUsProvince) {
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


  public Form1099IntResponse countryCode(String countryCode) {
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


  public Form1099IntResponse federalEFile(Boolean federalEFile) {
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


  public Form1099IntResponse postalMail(Boolean postalMail) {
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


  public Form1099IntResponse stateEFile(Boolean stateEFile) {
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


  public Form1099IntResponse tinMatch(Boolean tinMatch) {
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


  public Form1099IntResponse noTin(Boolean noTin) {
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


  public Form1099IntResponse secondTinNotice(Boolean secondTinNotice) {
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


  public Form1099IntResponse addressVerification(Boolean addressVerification) {
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


  public Form1099IntResponse federalEfileStatus(StatusDetail federalEfileStatus) {
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


  public Form1099IntResponse eDeliveryStatus(StatusDetail eDeliveryStatus) {
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


  public Form1099IntResponse stateEfileStatus(List<StateEfileStatusDetailResponse> stateEfileStatus) {
    this.stateEfileStatus = stateEfileStatus;
    return this;
  }

  public Form1099IntResponse addStateEfileStatusItem(StateEfileStatusDetailResponse stateEfileStatusItem) {
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


  public Form1099IntResponse postalMailStatus(StatusDetail postalMailStatus) {
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


  public Form1099IntResponse tinMatchStatus(StatusDetail tinMatchStatus) {
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


  public Form1099IntResponse addressVerificationStatus(StatusDetail addressVerificationStatus) {
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


  public Form1099IntResponse validationErrors(List<ValidationErrorResponse> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Form1099IntResponse addValidationErrorsItem(ValidationErrorResponse validationErrorsItem) {
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
    Form1099IntResponse form1099IntResponse = (Form1099IntResponse) o;
    return Objects.equals(this.interestIncome, form1099IntResponse.interestIncome) &&
        Objects.equals(this.earlyWithdrawalPenalty, form1099IntResponse.earlyWithdrawalPenalty) &&
        Objects.equals(this.usSavingsBondsInterest, form1099IntResponse.usSavingsBondsInterest) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099IntResponse.federalIncomeTaxWithheld) &&
        Objects.equals(this.investmentExpenses, form1099IntResponse.investmentExpenses) &&
        Objects.equals(this.foreignTaxPaid, form1099IntResponse.foreignTaxPaid) &&
        Objects.equals(this.foreignCountry, form1099IntResponse.foreignCountry) &&
        Objects.equals(this.taxExemptInterest, form1099IntResponse.taxExemptInterest) &&
        Objects.equals(this.specifiedPrivateActivityBondInterest, form1099IntResponse.specifiedPrivateActivityBondInterest) &&
        Objects.equals(this.marketDiscount, form1099IntResponse.marketDiscount) &&
        Objects.equals(this.bondPremium, form1099IntResponse.bondPremium) &&
        Objects.equals(this.bondPremiumOnTreasuryObligations, form1099IntResponse.bondPremiumOnTreasuryObligations) &&
        Objects.equals(this.bondPremiumOnTaxExemptBond, form1099IntResponse.bondPremiumOnTaxExemptBond) &&
        Objects.equals(this.taxExemptBondCusipNumber, form1099IntResponse.taxExemptBondCusipNumber) &&
        Objects.equals(this.type, form1099IntResponse.type) &&
        Objects.equals(this.createdAt, form1099IntResponse.createdAt) &&
        Objects.equals(this.updatedAt, form1099IntResponse.updatedAt) &&
        Objects.equals(this.stateAndLocalWithholding, form1099IntResponse.stateAndLocalWithholding) &&
        Objects.equals(this.tinType, form1099IntResponse.tinType) &&
        Objects.equals(this.id, form1099IntResponse.id) &&
        Objects.equals(this.issuerId, form1099IntResponse.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099IntResponse.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099IntResponse.issuerTin) &&
        Objects.equals(this.taxYear, form1099IntResponse.taxYear) &&
        Objects.equals(this.referenceId, form1099IntResponse.referenceId) &&
        Objects.equals(this.recipientName, form1099IntResponse.recipientName) &&
        Objects.equals(this.recipientTin, form1099IntResponse.recipientTin) &&
        Objects.equals(this.recipientSecondName, form1099IntResponse.recipientSecondName) &&
        Objects.equals(this.address, form1099IntResponse.address) &&
        Objects.equals(this.address2, form1099IntResponse.address2) &&
        Objects.equals(this.city, form1099IntResponse.city) &&
        Objects.equals(this.state, form1099IntResponse.state) &&
        Objects.equals(this.zip, form1099IntResponse.zip) &&
        Objects.equals(this.email, form1099IntResponse.email) &&
        Objects.equals(this.accountNumber, form1099IntResponse.accountNumber) &&
        Objects.equals(this.officeCode, form1099IntResponse.officeCode) &&
        Objects.equals(this.nonUsProvince, form1099IntResponse.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099IntResponse.countryCode) &&
        Objects.equals(this.federalEFile, form1099IntResponse.federalEFile) &&
        Objects.equals(this.postalMail, form1099IntResponse.postalMail) &&
        Objects.equals(this.stateEFile, form1099IntResponse.stateEFile) &&
        Objects.equals(this.tinMatch, form1099IntResponse.tinMatch) &&
        Objects.equals(this.noTin, form1099IntResponse.noTin) &&
        Objects.equals(this.secondTinNotice, form1099IntResponse.secondTinNotice) &&
        Objects.equals(this.addressVerification, form1099IntResponse.addressVerification) &&
        Objects.equals(this.federalEfileStatus, form1099IntResponse.federalEfileStatus) &&
        Objects.equals(this.eDeliveryStatus, form1099IntResponse.eDeliveryStatus) &&
        Objects.equals(this.stateEfileStatus, form1099IntResponse.stateEfileStatus) &&
        Objects.equals(this.postalMailStatus, form1099IntResponse.postalMailStatus) &&
        Objects.equals(this.tinMatchStatus, form1099IntResponse.tinMatchStatus) &&
        Objects.equals(this.addressVerificationStatus, form1099IntResponse.addressVerificationStatus) &&
        Objects.equals(this.validationErrors, form1099IntResponse.validationErrors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestIncome, earlyWithdrawalPenalty, usSavingsBondsInterest, federalIncomeTaxWithheld, investmentExpenses, foreignTaxPaid, foreignCountry, taxExemptInterest, specifiedPrivateActivityBondInterest, marketDiscount, bondPremium, bondPremiumOnTreasuryObligations, bondPremiumOnTaxExemptBond, taxExemptBondCusipNumber, type, createdAt, updatedAt, stateAndLocalWithholding, tinType, id, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, recipientName, recipientTin, recipientSecondName, address, address2, city, state, zip, email, accountNumber, officeCode, nonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, noTin, secondTinNotice, addressVerification, federalEfileStatus, eDeliveryStatus, stateEfileStatus, postalMailStatus, tinMatchStatus, addressVerificationStatus, validationErrors);
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
    sb.append("class Form1099IntResponse {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to Form1099IntResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099IntResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099IntResponse is not found in the empty JSON string", Form1099IntResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099IntResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099IntResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("foreignCountry") != null && !jsonObj.get("foreignCountry").isJsonNull()) && !jsonObj.get("foreignCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignCountry").toString()));
      }
      if ((jsonObj.get("taxExemptBondCusipNumber") != null && !jsonObj.get("taxExemptBondCusipNumber").isJsonNull()) && !jsonObj.get("taxExemptBondCusipNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxExemptBondCusipNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxExemptBondCusipNumber").toString()));
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
       if (!Form1099IntResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099IntResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099IntResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099IntResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099IntResponse>() {
           @Override
           public void write(JsonWriter out, Form1099IntResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099IntResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099IntResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099IntResponse
   * @throws IOException if the JSON string is invalid with respect to Form1099IntResponse
   */
  public static Form1099IntResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099IntResponse.class);
  }

  /**
   * Convert an instance of Form1099IntResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

