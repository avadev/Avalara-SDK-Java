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
 * Form1099DivRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099DivRequest {
  public static final String SERIALIZED_NAME_TOTAL_ORDINARY_DIVIDENDS = "totalOrdinaryDividends";
  @SerializedName(SERIALIZED_NAME_TOTAL_ORDINARY_DIVIDENDS)
  private String totalOrdinaryDividends;

  public static final String SERIALIZED_NAME_QUALIFIED_DIVIDENDS = "qualifiedDividends";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_DIVIDENDS)
  private String qualifiedDividends;

  public static final String SERIALIZED_NAME_TOTAL_CAPITAL_GAIN_DISTRIBUTIONS = "totalCapitalGainDistributions";
  @SerializedName(SERIALIZED_NAME_TOTAL_CAPITAL_GAIN_DISTRIBUTIONS)
  private String totalCapitalGainDistributions;

  public static final String SERIALIZED_NAME_UNRECAPTURED_SECTION1250_GAIN = "unrecapturedSection1250Gain";
  @SerializedName(SERIALIZED_NAME_UNRECAPTURED_SECTION1250_GAIN)
  private String unrecapturedSection1250Gain;

  public static final String SERIALIZED_NAME_SECTION1202_GAIN = "section1202Gain";
  @SerializedName(SERIALIZED_NAME_SECTION1202_GAIN)
  private String section1202Gain;

  public static final String SERIALIZED_NAME_COLLECTIBLES_GAIN = "collectiblesGain";
  @SerializedName(SERIALIZED_NAME_COLLECTIBLES_GAIN)
  private String collectiblesGain;

  public static final String SERIALIZED_NAME_SECTION897_ORDINARY_DIVIDENDS = "section897OrdinaryDividends";
  @SerializedName(SERIALIZED_NAME_SECTION897_ORDINARY_DIVIDENDS)
  private String section897OrdinaryDividends;

  public static final String SERIALIZED_NAME_SECTION897_CAPITAL_GAIN = "section897CapitalGain";
  @SerializedName(SERIALIZED_NAME_SECTION897_CAPITAL_GAIN)
  private String section897CapitalGain;

  public static final String SERIALIZED_NAME_NONDIVIDEND_DISTRIBUTIONS = "nondividendDistributions";
  @SerializedName(SERIALIZED_NAME_NONDIVIDEND_DISTRIBUTIONS)
  private String nondividendDistributions;

  public static final String SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD = "federalIncomeTaxWithheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD)
  private String federalIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_SECTION199_A_DIVIDENDS = "section199ADividends";
  @SerializedName(SERIALIZED_NAME_SECTION199_A_DIVIDENDS)
  private String section199ADividends;

  public static final String SERIALIZED_NAME_INVESTMENT_EXPENSES = "investmentExpenses";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_EXPENSES)
  private String investmentExpenses;

  public static final String SERIALIZED_NAME_FOREIGN_TAX_PAID = "foreignTaxPaid";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TAX_PAID)
  private String foreignTaxPaid;

  public static final String SERIALIZED_NAME_FOREIGN_COUNTRY_OR_U_S_POSSESSION = "foreignCountryOrUSPossession";
  @SerializedName(SERIALIZED_NAME_FOREIGN_COUNTRY_OR_U_S_POSSESSION)
  private String foreignCountryOrUSPossession;

  public static final String SERIALIZED_NAME_CASH_LIQUIDATION_DISTRIBUTIONS = "cashLiquidationDistributions";
  @SerializedName(SERIALIZED_NAME_CASH_LIQUIDATION_DISTRIBUTIONS)
  private String cashLiquidationDistributions;

  public static final String SERIALIZED_NAME_NONCASH_LIQUIDATION_DISTRIBUTIONS = "noncashLiquidationDistributions";
  @SerializedName(SERIALIZED_NAME_NONCASH_LIQUIDATION_DISTRIBUTIONS)
  private String noncashLiquidationDistributions;

  public static final String SERIALIZED_NAME_EXEMPT_INTEREST_DIVIDENDS = "exemptInterestDividends";
  @SerializedName(SERIALIZED_NAME_EXEMPT_INTEREST_DIVIDENDS)
  private String exemptInterestDividends;

  public static final String SERIALIZED_NAME_SPECIFIED_PRIVATE_ACTIVITY_BOND_INTEREST_DIVIDENDS = "specifiedPrivateActivityBondInterestDividends";
  @SerializedName(SERIALIZED_NAME_SPECIFIED_PRIVATE_ACTIVITY_BOND_INTEREST_DIVIDENDS)
  private String specifiedPrivateActivityBondInterestDividends;

  public static final String SERIALIZED_NAME_FATCA_FILING_REQUIREMENT = "fatcaFilingRequirement";
  @SerializedName(SERIALIZED_NAME_FATCA_FILING_REQUIREMENT)
  private Boolean fatcaFilingRequirement;

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

  public Form1099DivRequest() {
  }

  public Form1099DivRequest totalOrdinaryDividends(String totalOrdinaryDividends) {
    this.totalOrdinaryDividends = totalOrdinaryDividends;
    return this;
  }

  /**
   * Total ordinary dividends
   * @return totalOrdinaryDividends
   */
  @javax.annotation.Nullable
  public String getTotalOrdinaryDividends() {
    return totalOrdinaryDividends;
  }

  public void setTotalOrdinaryDividends(String totalOrdinaryDividends) {
    this.totalOrdinaryDividends = totalOrdinaryDividends;
  }


  public Form1099DivRequest qualifiedDividends(String qualifiedDividends) {
    this.qualifiedDividends = qualifiedDividends;
    return this;
  }

  /**
   * Qualified dividends
   * @return qualifiedDividends
   */
  @javax.annotation.Nullable
  public String getQualifiedDividends() {
    return qualifiedDividends;
  }

  public void setQualifiedDividends(String qualifiedDividends) {
    this.qualifiedDividends = qualifiedDividends;
  }


  public Form1099DivRequest totalCapitalGainDistributions(String totalCapitalGainDistributions) {
    this.totalCapitalGainDistributions = totalCapitalGainDistributions;
    return this;
  }

  /**
   * Total capital gain distributions
   * @return totalCapitalGainDistributions
   */
  @javax.annotation.Nullable
  public String getTotalCapitalGainDistributions() {
    return totalCapitalGainDistributions;
  }

  public void setTotalCapitalGainDistributions(String totalCapitalGainDistributions) {
    this.totalCapitalGainDistributions = totalCapitalGainDistributions;
  }


  public Form1099DivRequest unrecapturedSection1250Gain(String unrecapturedSection1250Gain) {
    this.unrecapturedSection1250Gain = unrecapturedSection1250Gain;
    return this;
  }

  /**
   * Unrecaptured Section 1250 gain
   * @return unrecapturedSection1250Gain
   */
  @javax.annotation.Nullable
  public String getUnrecapturedSection1250Gain() {
    return unrecapturedSection1250Gain;
  }

  public void setUnrecapturedSection1250Gain(String unrecapturedSection1250Gain) {
    this.unrecapturedSection1250Gain = unrecapturedSection1250Gain;
  }


  public Form1099DivRequest section1202Gain(String section1202Gain) {
    this.section1202Gain = section1202Gain;
    return this;
  }

  /**
   * Section 1202 gain
   * @return section1202Gain
   */
  @javax.annotation.Nullable
  public String getSection1202Gain() {
    return section1202Gain;
  }

  public void setSection1202Gain(String section1202Gain) {
    this.section1202Gain = section1202Gain;
  }


  public Form1099DivRequest collectiblesGain(String collectiblesGain) {
    this.collectiblesGain = collectiblesGain;
    return this;
  }

  /**
   * Collectibles (28%) gain
   * @return collectiblesGain
   */
  @javax.annotation.Nullable
  public String getCollectiblesGain() {
    return collectiblesGain;
  }

  public void setCollectiblesGain(String collectiblesGain) {
    this.collectiblesGain = collectiblesGain;
  }


  public Form1099DivRequest section897OrdinaryDividends(String section897OrdinaryDividends) {
    this.section897OrdinaryDividends = section897OrdinaryDividends;
    return this;
  }

  /**
   * Section 897 ordinary dividends
   * @return section897OrdinaryDividends
   */
  @javax.annotation.Nullable
  public String getSection897OrdinaryDividends() {
    return section897OrdinaryDividends;
  }

  public void setSection897OrdinaryDividends(String section897OrdinaryDividends) {
    this.section897OrdinaryDividends = section897OrdinaryDividends;
  }


  public Form1099DivRequest section897CapitalGain(String section897CapitalGain) {
    this.section897CapitalGain = section897CapitalGain;
    return this;
  }

  /**
   * Section 897 capital gain
   * @return section897CapitalGain
   */
  @javax.annotation.Nullable
  public String getSection897CapitalGain() {
    return section897CapitalGain;
  }

  public void setSection897CapitalGain(String section897CapitalGain) {
    this.section897CapitalGain = section897CapitalGain;
  }


  public Form1099DivRequest nondividendDistributions(String nondividendDistributions) {
    this.nondividendDistributions = nondividendDistributions;
    return this;
  }

  /**
   * Nondividend distributions
   * @return nondividendDistributions
   */
  @javax.annotation.Nullable
  public String getNondividendDistributions() {
    return nondividendDistributions;
  }

  public void setNondividendDistributions(String nondividendDistributions) {
    this.nondividendDistributions = nondividendDistributions;
  }


  public Form1099DivRequest federalIncomeTaxWithheld(String federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
    return this;
  }

  /**
   * Federal income tax withheld
   * @return federalIncomeTaxWithheld
   */
  @javax.annotation.Nullable
  public String getFederalIncomeTaxWithheld() {
    return federalIncomeTaxWithheld;
  }

  public void setFederalIncomeTaxWithheld(String federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
  }


  public Form1099DivRequest section199ADividends(String section199ADividends) {
    this.section199ADividends = section199ADividends;
    return this;
  }

  /**
   * Section 199A dividends
   * @return section199ADividends
   */
  @javax.annotation.Nullable
  public String getSection199ADividends() {
    return section199ADividends;
  }

  public void setSection199ADividends(String section199ADividends) {
    this.section199ADividends = section199ADividends;
  }


  public Form1099DivRequest investmentExpenses(String investmentExpenses) {
    this.investmentExpenses = investmentExpenses;
    return this;
  }

  /**
   * Investment expenses
   * @return investmentExpenses
   */
  @javax.annotation.Nullable
  public String getInvestmentExpenses() {
    return investmentExpenses;
  }

  public void setInvestmentExpenses(String investmentExpenses) {
    this.investmentExpenses = investmentExpenses;
  }


  public Form1099DivRequest foreignTaxPaid(String foreignTaxPaid) {
    this.foreignTaxPaid = foreignTaxPaid;
    return this;
  }

  /**
   * Foreign tax paid
   * @return foreignTaxPaid
   */
  @javax.annotation.Nullable
  public String getForeignTaxPaid() {
    return foreignTaxPaid;
  }

  public void setForeignTaxPaid(String foreignTaxPaid) {
    this.foreignTaxPaid = foreignTaxPaid;
  }


  public Form1099DivRequest foreignCountryOrUSPossession(String foreignCountryOrUSPossession) {
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


  public Form1099DivRequest cashLiquidationDistributions(String cashLiquidationDistributions) {
    this.cashLiquidationDistributions = cashLiquidationDistributions;
    return this;
  }

  /**
   * Cash liquidation distributions
   * @return cashLiquidationDistributions
   */
  @javax.annotation.Nullable
  public String getCashLiquidationDistributions() {
    return cashLiquidationDistributions;
  }

  public void setCashLiquidationDistributions(String cashLiquidationDistributions) {
    this.cashLiquidationDistributions = cashLiquidationDistributions;
  }


  public Form1099DivRequest noncashLiquidationDistributions(String noncashLiquidationDistributions) {
    this.noncashLiquidationDistributions = noncashLiquidationDistributions;
    return this;
  }

  /**
   * Noncash liquidation distributions
   * @return noncashLiquidationDistributions
   */
  @javax.annotation.Nullable
  public String getNoncashLiquidationDistributions() {
    return noncashLiquidationDistributions;
  }

  public void setNoncashLiquidationDistributions(String noncashLiquidationDistributions) {
    this.noncashLiquidationDistributions = noncashLiquidationDistributions;
  }


  public Form1099DivRequest exemptInterestDividends(String exemptInterestDividends) {
    this.exemptInterestDividends = exemptInterestDividends;
    return this;
  }

  /**
   * Exempt-interest dividends
   * @return exemptInterestDividends
   */
  @javax.annotation.Nullable
  public String getExemptInterestDividends() {
    return exemptInterestDividends;
  }

  public void setExemptInterestDividends(String exemptInterestDividends) {
    this.exemptInterestDividends = exemptInterestDividends;
  }


  public Form1099DivRequest specifiedPrivateActivityBondInterestDividends(String specifiedPrivateActivityBondInterestDividends) {
    this.specifiedPrivateActivityBondInterestDividends = specifiedPrivateActivityBondInterestDividends;
    return this;
  }

  /**
   * Specified private activity bond interest dividends
   * @return specifiedPrivateActivityBondInterestDividends
   */
  @javax.annotation.Nullable
  public String getSpecifiedPrivateActivityBondInterestDividends() {
    return specifiedPrivateActivityBondInterestDividends;
  }

  public void setSpecifiedPrivateActivityBondInterestDividends(String specifiedPrivateActivityBondInterestDividends) {
    this.specifiedPrivateActivityBondInterestDividends = specifiedPrivateActivityBondInterestDividends;
  }


  public Form1099DivRequest fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
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


  public Form1099DivRequest type(TypeEnum type) {
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


  public Form1099DivRequest issuerId(String issuerId) {
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


  public Form1099DivRequest referenceId(String referenceId) {
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


  public Form1099DivRequest recipientTin(String recipientTin) {
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


  public Form1099DivRequest recipientName(String recipientName) {
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


  public Form1099DivRequest tinType(TinTypeEnum tinType) {
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


  public Form1099DivRequest recipientSecondName(String recipientSecondName) {
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


  public Form1099DivRequest address(String address) {
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


  public Form1099DivRequest address2(String address2) {
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


  public Form1099DivRequest city(String city) {
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


  public Form1099DivRequest state(String state) {
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


  public Form1099DivRequest zip(String zip) {
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


  public Form1099DivRequest email(String email) {
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


  public Form1099DivRequest accountNumber(String accountNumber) {
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


  public Form1099DivRequest officeCode(String officeCode) {
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


  public Form1099DivRequest nonUsProvince(String nonUsProvince) {
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


  public Form1099DivRequest countryCode(String countryCode) {
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


  public Form1099DivRequest federalEFile(Boolean federalEFile) {
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


  public Form1099DivRequest postalMail(Boolean postalMail) {
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


  public Form1099DivRequest stateEFile(Boolean stateEFile) {
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


  public Form1099DivRequest tinMatch(Boolean tinMatch) {
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


  public Form1099DivRequest noTin(Boolean noTin) {
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


  public Form1099DivRequest secondTinNotice(Boolean secondTinNotice) {
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


  public Form1099DivRequest addressVerification(Boolean addressVerification) {
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


  public Form1099DivRequest stateAndLocalWithholding(StateAndLocalWithholdingRequest stateAndLocalWithholding) {
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
    Form1099DivRequest form1099DivRequest = (Form1099DivRequest) o;
    return Objects.equals(this.totalOrdinaryDividends, form1099DivRequest.totalOrdinaryDividends) &&
        Objects.equals(this.qualifiedDividends, form1099DivRequest.qualifiedDividends) &&
        Objects.equals(this.totalCapitalGainDistributions, form1099DivRequest.totalCapitalGainDistributions) &&
        Objects.equals(this.unrecapturedSection1250Gain, form1099DivRequest.unrecapturedSection1250Gain) &&
        Objects.equals(this.section1202Gain, form1099DivRequest.section1202Gain) &&
        Objects.equals(this.collectiblesGain, form1099DivRequest.collectiblesGain) &&
        Objects.equals(this.section897OrdinaryDividends, form1099DivRequest.section897OrdinaryDividends) &&
        Objects.equals(this.section897CapitalGain, form1099DivRequest.section897CapitalGain) &&
        Objects.equals(this.nondividendDistributions, form1099DivRequest.nondividendDistributions) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099DivRequest.federalIncomeTaxWithheld) &&
        Objects.equals(this.section199ADividends, form1099DivRequest.section199ADividends) &&
        Objects.equals(this.investmentExpenses, form1099DivRequest.investmentExpenses) &&
        Objects.equals(this.foreignTaxPaid, form1099DivRequest.foreignTaxPaid) &&
        Objects.equals(this.foreignCountryOrUSPossession, form1099DivRequest.foreignCountryOrUSPossession) &&
        Objects.equals(this.cashLiquidationDistributions, form1099DivRequest.cashLiquidationDistributions) &&
        Objects.equals(this.noncashLiquidationDistributions, form1099DivRequest.noncashLiquidationDistributions) &&
        Objects.equals(this.exemptInterestDividends, form1099DivRequest.exemptInterestDividends) &&
        Objects.equals(this.specifiedPrivateActivityBondInterestDividends, form1099DivRequest.specifiedPrivateActivityBondInterestDividends) &&
        Objects.equals(this.fatcaFilingRequirement, form1099DivRequest.fatcaFilingRequirement) &&
        Objects.equals(this.type, form1099DivRequest.type) &&
        Objects.equals(this.issuerId, form1099DivRequest.issuerId) &&
        Objects.equals(this.referenceId, form1099DivRequest.referenceId) &&
        Objects.equals(this.recipientTin, form1099DivRequest.recipientTin) &&
        Objects.equals(this.recipientName, form1099DivRequest.recipientName) &&
        Objects.equals(this.tinType, form1099DivRequest.tinType) &&
        Objects.equals(this.recipientSecondName, form1099DivRequest.recipientSecondName) &&
        Objects.equals(this.address, form1099DivRequest.address) &&
        Objects.equals(this.address2, form1099DivRequest.address2) &&
        Objects.equals(this.city, form1099DivRequest.city) &&
        Objects.equals(this.state, form1099DivRequest.state) &&
        Objects.equals(this.zip, form1099DivRequest.zip) &&
        Objects.equals(this.email, form1099DivRequest.email) &&
        Objects.equals(this.accountNumber, form1099DivRequest.accountNumber) &&
        Objects.equals(this.officeCode, form1099DivRequest.officeCode) &&
        Objects.equals(this.nonUsProvince, form1099DivRequest.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099DivRequest.countryCode) &&
        Objects.equals(this.federalEFile, form1099DivRequest.federalEFile) &&
        Objects.equals(this.postalMail, form1099DivRequest.postalMail) &&
        Objects.equals(this.stateEFile, form1099DivRequest.stateEFile) &&
        Objects.equals(this.tinMatch, form1099DivRequest.tinMatch) &&
        Objects.equals(this.noTin, form1099DivRequest.noTin) &&
        Objects.equals(this.secondTinNotice, form1099DivRequest.secondTinNotice) &&
        Objects.equals(this.addressVerification, form1099DivRequest.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form1099DivRequest.stateAndLocalWithholding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalOrdinaryDividends, qualifiedDividends, totalCapitalGainDistributions, unrecapturedSection1250Gain, section1202Gain, collectiblesGain, section897OrdinaryDividends, section897CapitalGain, nondividendDistributions, federalIncomeTaxWithheld, section199ADividends, investmentExpenses, foreignTaxPaid, foreignCountryOrUSPossession, cashLiquidationDistributions, noncashLiquidationDistributions, exemptInterestDividends, specifiedPrivateActivityBondInterestDividends, fatcaFilingRequirement, type, issuerId, referenceId, recipientTin, recipientName, tinType, recipientSecondName, address, address2, city, state, zip, email, accountNumber, officeCode, nonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, noTin, secondTinNotice, addressVerification, stateAndLocalWithholding);
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
    sb.append("class Form1099DivRequest {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to Form1099DivRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099DivRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099DivRequest is not found in the empty JSON string", Form1099DivRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099DivRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099DivRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1099DivRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("totalOrdinaryDividends") != null && !jsonObj.get("totalOrdinaryDividends").isJsonNull()) && !jsonObj.get("totalOrdinaryDividends").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalOrdinaryDividends` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalOrdinaryDividends").toString()));
      }
      if ((jsonObj.get("qualifiedDividends") != null && !jsonObj.get("qualifiedDividends").isJsonNull()) && !jsonObj.get("qualifiedDividends").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualifiedDividends` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qualifiedDividends").toString()));
      }
      if ((jsonObj.get("totalCapitalGainDistributions") != null && !jsonObj.get("totalCapitalGainDistributions").isJsonNull()) && !jsonObj.get("totalCapitalGainDistributions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalCapitalGainDistributions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalCapitalGainDistributions").toString()));
      }
      if ((jsonObj.get("unrecapturedSection1250Gain") != null && !jsonObj.get("unrecapturedSection1250Gain").isJsonNull()) && !jsonObj.get("unrecapturedSection1250Gain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unrecapturedSection1250Gain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unrecapturedSection1250Gain").toString()));
      }
      if ((jsonObj.get("section1202Gain") != null && !jsonObj.get("section1202Gain").isJsonNull()) && !jsonObj.get("section1202Gain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `section1202Gain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("section1202Gain").toString()));
      }
      if ((jsonObj.get("collectiblesGain") != null && !jsonObj.get("collectiblesGain").isJsonNull()) && !jsonObj.get("collectiblesGain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectiblesGain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectiblesGain").toString()));
      }
      if ((jsonObj.get("section897OrdinaryDividends") != null && !jsonObj.get("section897OrdinaryDividends").isJsonNull()) && !jsonObj.get("section897OrdinaryDividends").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `section897OrdinaryDividends` to be a primitive type in the JSON string but got `%s`", jsonObj.get("section897OrdinaryDividends").toString()));
      }
      if ((jsonObj.get("section897CapitalGain") != null && !jsonObj.get("section897CapitalGain").isJsonNull()) && !jsonObj.get("section897CapitalGain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `section897CapitalGain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("section897CapitalGain").toString()));
      }
      if ((jsonObj.get("nondividendDistributions") != null && !jsonObj.get("nondividendDistributions").isJsonNull()) && !jsonObj.get("nondividendDistributions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nondividendDistributions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nondividendDistributions").toString()));
      }
      if ((jsonObj.get("federalIncomeTaxWithheld") != null && !jsonObj.get("federalIncomeTaxWithheld").isJsonNull()) && !jsonObj.get("federalIncomeTaxWithheld").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `federalIncomeTaxWithheld` to be a primitive type in the JSON string but got `%s`", jsonObj.get("federalIncomeTaxWithheld").toString()));
      }
      if ((jsonObj.get("section199ADividends") != null && !jsonObj.get("section199ADividends").isJsonNull()) && !jsonObj.get("section199ADividends").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `section199ADividends` to be a primitive type in the JSON string but got `%s`", jsonObj.get("section199ADividends").toString()));
      }
      if ((jsonObj.get("investmentExpenses") != null && !jsonObj.get("investmentExpenses").isJsonNull()) && !jsonObj.get("investmentExpenses").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `investmentExpenses` to be a primitive type in the JSON string but got `%s`", jsonObj.get("investmentExpenses").toString()));
      }
      if ((jsonObj.get("foreignTaxPaid") != null && !jsonObj.get("foreignTaxPaid").isJsonNull()) && !jsonObj.get("foreignTaxPaid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignTaxPaid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignTaxPaid").toString()));
      }
      if ((jsonObj.get("foreignCountryOrUSPossession") != null && !jsonObj.get("foreignCountryOrUSPossession").isJsonNull()) && !jsonObj.get("foreignCountryOrUSPossession").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignCountryOrUSPossession` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignCountryOrUSPossession").toString()));
      }
      if ((jsonObj.get("cashLiquidationDistributions") != null && !jsonObj.get("cashLiquidationDistributions").isJsonNull()) && !jsonObj.get("cashLiquidationDistributions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cashLiquidationDistributions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cashLiquidationDistributions").toString()));
      }
      if ((jsonObj.get("noncashLiquidationDistributions") != null && !jsonObj.get("noncashLiquidationDistributions").isJsonNull()) && !jsonObj.get("noncashLiquidationDistributions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `noncashLiquidationDistributions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("noncashLiquidationDistributions").toString()));
      }
      if ((jsonObj.get("exemptInterestDividends") != null && !jsonObj.get("exemptInterestDividends").isJsonNull()) && !jsonObj.get("exemptInterestDividends").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptInterestDividends` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptInterestDividends").toString()));
      }
      if ((jsonObj.get("specifiedPrivateActivityBondInterestDividends") != null && !jsonObj.get("specifiedPrivateActivityBondInterestDividends").isJsonNull()) && !jsonObj.get("specifiedPrivateActivityBondInterestDividends").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specifiedPrivateActivityBondInterestDividends` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specifiedPrivateActivityBondInterestDividends").toString()));
      }
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
       if (!Form1099DivRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099DivRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099DivRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099DivRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099DivRequest>() {
           @Override
           public void write(JsonWriter out, Form1099DivRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099DivRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099DivRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099DivRequest
   * @throws IOException if the JSON string is invalid with respect to Form1099DivRequest
   */
  public static Form1099DivRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099DivRequest.class);
  }

  /**
   * Convert an instance of Form1099DivRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

