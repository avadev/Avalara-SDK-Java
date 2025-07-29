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
import Avalara.SDK.model.A1099.V2.IntermediaryOrFlowThroughRequest;
import Avalara.SDK.model.A1099.V2.PrimaryWithholdingAgentRequest;
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
 * Form1042SRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1042SRequest {
  public static final String SERIALIZED_NAME_UNIQUE_FORM_ID = "uniqueFormId";
  @SerializedName(SERIALIZED_NAME_UNIQUE_FORM_ID)
  private String uniqueFormId;

  public static final String SERIALIZED_NAME_NO_TIN = "noTin";
  @SerializedName(SERIALIZED_NAME_NO_TIN)
  private Boolean noTin;

  public static final String SERIALIZED_NAME_RECIPIENT_DATE_OF_BIRTH = "recipientDateOfBirth";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_DATE_OF_BIRTH)
  private OffsetDateTime recipientDateOfBirth;

  public static final String SERIALIZED_NAME_RECIPIENT_GIIN = "recipientGiin";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_GIIN)
  private String recipientGiin;

  public static final String SERIALIZED_NAME_RECIPIENT_FOREIGN_TIN = "recipientForeignTin";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_FOREIGN_TIN)
  private String recipientForeignTin;

  public static final String SERIALIZED_NAME_LOB_CODE = "lobCode";
  @SerializedName(SERIALIZED_NAME_LOB_CODE)
  private String lobCode;

  public static final String SERIALIZED_NAME_INCOME_CODE = "incomeCode";
  @SerializedName(SERIALIZED_NAME_INCOME_CODE)
  private String incomeCode;

  public static final String SERIALIZED_NAME_GROSS_INCOME = "grossIncome";
  @SerializedName(SERIALIZED_NAME_GROSS_INCOME)
  private Double grossIncome;

  public static final String SERIALIZED_NAME_WITHHOLDING_INDICATOR = "withholdingIndicator";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_INDICATOR)
  private String withholdingIndicator;

  public static final String SERIALIZED_NAME_TAX_COUNTRY_CODE = "taxCountryCode";
  @SerializedName(SERIALIZED_NAME_TAX_COUNTRY_CODE)
  private String taxCountryCode;

  public static final String SERIALIZED_NAME_EXEMPTION_CODE_CHAP3 = "exemptionCodeChap3";
  @SerializedName(SERIALIZED_NAME_EXEMPTION_CODE_CHAP3)
  private String exemptionCodeChap3;

  public static final String SERIALIZED_NAME_EXEMPTION_CODE_CHAP4 = "exemptionCodeChap4";
  @SerializedName(SERIALIZED_NAME_EXEMPTION_CODE_CHAP4)
  private String exemptionCodeChap4;

  public static final String SERIALIZED_NAME_TAX_RATE_CHAP3 = "taxRateChap3";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_CHAP3)
  private String taxRateChap3;

  public static final String SERIALIZED_NAME_WITHHOLDING_ALLOWANCE = "withholdingAllowance";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_ALLOWANCE)
  private Double withholdingAllowance;

  public static final String SERIALIZED_NAME_FEDERAL_TAX_WITHHELD = "federalTaxWithheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_TAX_WITHHELD)
  private Double federalTaxWithheld;

  public static final String SERIALIZED_NAME_TAX_NOT_DEPOSITED_INDICATOR = "taxNotDepositedIndicator";
  @SerializedName(SERIALIZED_NAME_TAX_NOT_DEPOSITED_INDICATOR)
  private Boolean taxNotDepositedIndicator;

  public static final String SERIALIZED_NAME_ACADEMIC_INDICATOR = "academicIndicator";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_INDICATOR)
  private Boolean academicIndicator;

  public static final String SERIALIZED_NAME_TAX_WITHHELD_OTHER_AGENTS = "taxWithheldOtherAgents";
  @SerializedName(SERIALIZED_NAME_TAX_WITHHELD_OTHER_AGENTS)
  private Double taxWithheldOtherAgents;

  public static final String SERIALIZED_NAME_AMOUNT_REPAID = "amountRepaid";
  @SerializedName(SERIALIZED_NAME_AMOUNT_REPAID)
  private Double amountRepaid;

  public static final String SERIALIZED_NAME_TAX_PAID_AGENT = "taxPaidAgent";
  @SerializedName(SERIALIZED_NAME_TAX_PAID_AGENT)
  private Double taxPaidAgent;

  public static final String SERIALIZED_NAME_CHAP3_STATUS_CODE = "chap3StatusCode";
  @SerializedName(SERIALIZED_NAME_CHAP3_STATUS_CODE)
  private String chap3StatusCode;

  public static final String SERIALIZED_NAME_CHAP4_STATUS_CODE = "chap4StatusCode";
  @SerializedName(SERIALIZED_NAME_CHAP4_STATUS_CODE)
  private String chap4StatusCode;

  public static final String SERIALIZED_NAME_PRIMARY_WITHHOLDING_AGENT = "primaryWithholdingAgent";
  @SerializedName(SERIALIZED_NAME_PRIMARY_WITHHOLDING_AGENT)
  private PrimaryWithholdingAgentRequest primaryWithholdingAgent;

  public static final String SERIALIZED_NAME_INTERMEDIARY_OR_FLOW_THROUGH = "intermediaryOrFlowThrough";
  @SerializedName(SERIALIZED_NAME_INTERMEDIARY_OR_FLOW_THROUGH)
  private IntermediaryOrFlowThroughRequest intermediaryOrFlowThrough;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholdingRequest stateAndLocalWithholding;

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
    
    _1042_S("1042-S");

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

  public Form1042SRequest() {
  }

  public Form1042SRequest uniqueFormId(String uniqueFormId) {
    this.uniqueFormId = uniqueFormId;
    return this;
  }

  /**
   * Unique form identifier
   * @return uniqueFormId
   */
  @javax.annotation.Nullable
  public String getUniqueFormId() {
    return uniqueFormId;
  }

  public void setUniqueFormId(String uniqueFormId) {
    this.uniqueFormId = uniqueFormId;
  }


  public Form1042SRequest noTin(Boolean noTin) {
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


  public Form1042SRequest recipientDateOfBirth(OffsetDateTime recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
    return this;
  }

  /**
   * Recipient&#39;s date of birth
   * @return recipientDateOfBirth
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRecipientDateOfBirth() {
    return recipientDateOfBirth;
  }

  public void setRecipientDateOfBirth(OffsetDateTime recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
  }


  public Form1042SRequest recipientGiin(String recipientGiin) {
    this.recipientGiin = recipientGiin;
    return this;
  }

  /**
   * Recipient&#39;s GIIN (Global Intermediary Identification Number)
   * @return recipientGiin
   */
  @javax.annotation.Nullable
  public String getRecipientGiin() {
    return recipientGiin;
  }

  public void setRecipientGiin(String recipientGiin) {
    this.recipientGiin = recipientGiin;
  }


  public Form1042SRequest recipientForeignTin(String recipientForeignTin) {
    this.recipientForeignTin = recipientForeignTin;
    return this;
  }

  /**
   * Recipient&#39;s foreign TIN
   * @return recipientForeignTin
   */
  @javax.annotation.Nullable
  public String getRecipientForeignTin() {
    return recipientForeignTin;
  }

  public void setRecipientForeignTin(String recipientForeignTin) {
    this.recipientForeignTin = recipientForeignTin;
  }


  public Form1042SRequest lobCode(String lobCode) {
    this.lobCode = lobCode;
    return this;
  }

  /**
   * Limitation on benefits code
   * @return lobCode
   */
  @javax.annotation.Nullable
  public String getLobCode() {
    return lobCode;
  }

  public void setLobCode(String lobCode) {
    this.lobCode = lobCode;
  }


  public Form1042SRequest incomeCode(String incomeCode) {
    this.incomeCode = incomeCode;
    return this;
  }

  /**
   * Income code
   * @return incomeCode
   */
  @javax.annotation.Nullable
  public String getIncomeCode() {
    return incomeCode;
  }

  public void setIncomeCode(String incomeCode) {
    this.incomeCode = incomeCode;
  }


  public Form1042SRequest grossIncome(Double grossIncome) {
    this.grossIncome = grossIncome;
    return this;
  }

  /**
   * Gross income
   * @return grossIncome
   */
  @javax.annotation.Nullable
  public Double getGrossIncome() {
    return grossIncome;
  }

  public void setGrossIncome(Double grossIncome) {
    this.grossIncome = grossIncome;
  }


  public Form1042SRequest withholdingIndicator(String withholdingIndicator) {
    this.withholdingIndicator = withholdingIndicator;
    return this;
  }

  /**
   * Withholding indicator
   * @return withholdingIndicator
   */
  @javax.annotation.Nullable
  public String getWithholdingIndicator() {
    return withholdingIndicator;
  }

  public void setWithholdingIndicator(String withholdingIndicator) {
    this.withholdingIndicator = withholdingIndicator;
  }


  public Form1042SRequest taxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
    return this;
  }

  /**
   * Country code
   * @return taxCountryCode
   */
  @javax.annotation.Nullable
  public String getTaxCountryCode() {
    return taxCountryCode;
  }

  public void setTaxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
  }


  public Form1042SRequest exemptionCodeChap3(String exemptionCodeChap3) {
    this.exemptionCodeChap3 = exemptionCodeChap3;
    return this;
  }

  /**
   * Exemption code (Chapter 3)
   * @return exemptionCodeChap3
   */
  @javax.annotation.Nullable
  public String getExemptionCodeChap3() {
    return exemptionCodeChap3;
  }

  public void setExemptionCodeChap3(String exemptionCodeChap3) {
    this.exemptionCodeChap3 = exemptionCodeChap3;
  }


  public Form1042SRequest exemptionCodeChap4(String exemptionCodeChap4) {
    this.exemptionCodeChap4 = exemptionCodeChap4;
    return this;
  }

  /**
   * Exemption code (Chapter 4)
   * @return exemptionCodeChap4
   */
  @javax.annotation.Nullable
  public String getExemptionCodeChap4() {
    return exemptionCodeChap4;
  }

  public void setExemptionCodeChap4(String exemptionCodeChap4) {
    this.exemptionCodeChap4 = exemptionCodeChap4;
  }


  public Form1042SRequest taxRateChap3(String taxRateChap3) {
    this.taxRateChap3 = taxRateChap3;
    return this;
  }

  /**
   * Tax rate (Chapter 3)
   * @return taxRateChap3
   */
  @javax.annotation.Nullable
  public String getTaxRateChap3() {
    return taxRateChap3;
  }

  public void setTaxRateChap3(String taxRateChap3) {
    this.taxRateChap3 = taxRateChap3;
  }


  public Form1042SRequest withholdingAllowance(Double withholdingAllowance) {
    this.withholdingAllowance = withholdingAllowance;
    return this;
  }

  /**
   * Withholding allowance
   * @return withholdingAllowance
   */
  @javax.annotation.Nullable
  public Double getWithholdingAllowance() {
    return withholdingAllowance;
  }

  public void setWithholdingAllowance(Double withholdingAllowance) {
    this.withholdingAllowance = withholdingAllowance;
  }


  public Form1042SRequest federalTaxWithheld(Double federalTaxWithheld) {
    this.federalTaxWithheld = federalTaxWithheld;
    return this;
  }

  /**
   * Federal tax withheld
   * @return federalTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getFederalTaxWithheld() {
    return federalTaxWithheld;
  }

  public void setFederalTaxWithheld(Double federalTaxWithheld) {
    this.federalTaxWithheld = federalTaxWithheld;
  }


  public Form1042SRequest taxNotDepositedIndicator(Boolean taxNotDepositedIndicator) {
    this.taxNotDepositedIndicator = taxNotDepositedIndicator;
    return this;
  }

  /**
   * Tax not deposited indicator
   * @return taxNotDepositedIndicator
   */
  @javax.annotation.Nullable
  public Boolean getTaxNotDepositedIndicator() {
    return taxNotDepositedIndicator;
  }

  public void setTaxNotDepositedIndicator(Boolean taxNotDepositedIndicator) {
    this.taxNotDepositedIndicator = taxNotDepositedIndicator;
  }


  public Form1042SRequest academicIndicator(Boolean academicIndicator) {
    this.academicIndicator = academicIndicator;
    return this;
  }

  /**
   * Academic indicator
   * @return academicIndicator
   */
  @javax.annotation.Nullable
  public Boolean getAcademicIndicator() {
    return academicIndicator;
  }

  public void setAcademicIndicator(Boolean academicIndicator) {
    this.academicIndicator = academicIndicator;
  }


  public Form1042SRequest taxWithheldOtherAgents(Double taxWithheldOtherAgents) {
    this.taxWithheldOtherAgents = taxWithheldOtherAgents;
    return this;
  }

  /**
   * Tax withheld by other agents
   * @return taxWithheldOtherAgents
   */
  @javax.annotation.Nullable
  public Double getTaxWithheldOtherAgents() {
    return taxWithheldOtherAgents;
  }

  public void setTaxWithheldOtherAgents(Double taxWithheldOtherAgents) {
    this.taxWithheldOtherAgents = taxWithheldOtherAgents;
  }


  public Form1042SRequest amountRepaid(Double amountRepaid) {
    this.amountRepaid = amountRepaid;
    return this;
  }

  /**
   * Amount repaid to recipient
   * @return amountRepaid
   */
  @javax.annotation.Nullable
  public Double getAmountRepaid() {
    return amountRepaid;
  }

  public void setAmountRepaid(Double amountRepaid) {
    this.amountRepaid = amountRepaid;
  }


  public Form1042SRequest taxPaidAgent(Double taxPaidAgent) {
    this.taxPaidAgent = taxPaidAgent;
    return this;
  }

  /**
   * Tax paid by withholding agent
   * @return taxPaidAgent
   */
  @javax.annotation.Nullable
  public Double getTaxPaidAgent() {
    return taxPaidAgent;
  }

  public void setTaxPaidAgent(Double taxPaidAgent) {
    this.taxPaidAgent = taxPaidAgent;
  }


  public Form1042SRequest chap3StatusCode(String chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
    return this;
  }

  /**
   * Chapter 3 status code
   * @return chap3StatusCode
   */
  @javax.annotation.Nullable
  public String getChap3StatusCode() {
    return chap3StatusCode;
  }

  public void setChap3StatusCode(String chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
  }


  public Form1042SRequest chap4StatusCode(String chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
    return this;
  }

  /**
   * Chapter 4 status code
   * @return chap4StatusCode
   */
  @javax.annotation.Nullable
  public String getChap4StatusCode() {
    return chap4StatusCode;
  }

  public void setChap4StatusCode(String chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
  }


  public Form1042SRequest primaryWithholdingAgent(PrimaryWithholdingAgentRequest primaryWithholdingAgent) {
    this.primaryWithholdingAgent = primaryWithholdingAgent;
    return this;
  }

  /**
   * Primary withholding agent information
   * @return primaryWithholdingAgent
   */
  @javax.annotation.Nullable
  public PrimaryWithholdingAgentRequest getPrimaryWithholdingAgent() {
    return primaryWithholdingAgent;
  }

  public void setPrimaryWithholdingAgent(PrimaryWithholdingAgentRequest primaryWithholdingAgent) {
    this.primaryWithholdingAgent = primaryWithholdingAgent;
  }


  public Form1042SRequest intermediaryOrFlowThrough(IntermediaryOrFlowThroughRequest intermediaryOrFlowThrough) {
    this.intermediaryOrFlowThrough = intermediaryOrFlowThrough;
    return this;
  }

  /**
   * Intermediary or flow-through entity information
   * @return intermediaryOrFlowThrough
   */
  @javax.annotation.Nullable
  public IntermediaryOrFlowThroughRequest getIntermediaryOrFlowThrough() {
    return intermediaryOrFlowThrough;
  }

  public void setIntermediaryOrFlowThrough(IntermediaryOrFlowThroughRequest intermediaryOrFlowThrough) {
    this.intermediaryOrFlowThrough = intermediaryOrFlowThrough;
  }


  public Form1042SRequest stateAndLocalWithholding(StateAndLocalWithholdingRequest stateAndLocalWithholding) {
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


  public Form1042SRequest type(TypeEnum type) {
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


  public Form1042SRequest issuerId(String issuerId) {
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


  public Form1042SRequest referenceId(String referenceId) {
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


  public Form1042SRequest recipientTin(String recipientTin) {
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


  public Form1042SRequest recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  /**
   * Recipient name
   * @return recipientName
   */
  @javax.annotation.Nonnull
  public String getRecipientName() {
    return recipientName;
  }

  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }


  public Form1042SRequest tinType(TinTypeEnum tinType) {
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


  public Form1042SRequest recipientSecondName(String recipientSecondName) {
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


  public Form1042SRequest address(String address) {
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


  public Form1042SRequest address2(String address2) {
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


  public Form1042SRequest city(String city) {
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


  public Form1042SRequest state(String state) {
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


  public Form1042SRequest zip(String zip) {
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


  public Form1042SRequest recipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
    return this;
  }

  /**
   * Recipient email address
   * @return recipientEmail
   */
  @javax.annotation.Nullable
  public String getRecipientEmail() {
    return recipientEmail;
  }

  public void setRecipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
  }


  public Form1042SRequest accountNumber(String accountNumber) {
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


  public Form1042SRequest officeCode(String officeCode) {
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


  public Form1042SRequest recipientNonUsProvince(String recipientNonUsProvince) {
    this.recipientNonUsProvince = recipientNonUsProvince;
    return this;
  }

  /**
   * Foreign province
   * @return recipientNonUsProvince
   */
  @javax.annotation.Nullable
  public String getRecipientNonUsProvince() {
    return recipientNonUsProvince;
  }

  public void setRecipientNonUsProvince(String recipientNonUsProvince) {
    this.recipientNonUsProvince = recipientNonUsProvince;
  }


  public Form1042SRequest countryCode(String countryCode) {
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


  public Form1042SRequest federalEFile(Boolean federalEFile) {
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


  public Form1042SRequest postalMail(Boolean postalMail) {
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


  public Form1042SRequest stateEFile(Boolean stateEFile) {
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


  public Form1042SRequest tinMatch(Boolean tinMatch) {
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


  public Form1042SRequest addressVerification(Boolean addressVerification) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1042SRequest form1042SRequest = (Form1042SRequest) o;
    return Objects.equals(this.uniqueFormId, form1042SRequest.uniqueFormId) &&
        Objects.equals(this.noTin, form1042SRequest.noTin) &&
        Objects.equals(this.recipientDateOfBirth, form1042SRequest.recipientDateOfBirth) &&
        Objects.equals(this.recipientGiin, form1042SRequest.recipientGiin) &&
        Objects.equals(this.recipientForeignTin, form1042SRequest.recipientForeignTin) &&
        Objects.equals(this.lobCode, form1042SRequest.lobCode) &&
        Objects.equals(this.incomeCode, form1042SRequest.incomeCode) &&
        Objects.equals(this.grossIncome, form1042SRequest.grossIncome) &&
        Objects.equals(this.withholdingIndicator, form1042SRequest.withholdingIndicator) &&
        Objects.equals(this.taxCountryCode, form1042SRequest.taxCountryCode) &&
        Objects.equals(this.exemptionCodeChap3, form1042SRequest.exemptionCodeChap3) &&
        Objects.equals(this.exemptionCodeChap4, form1042SRequest.exemptionCodeChap4) &&
        Objects.equals(this.taxRateChap3, form1042SRequest.taxRateChap3) &&
        Objects.equals(this.withholdingAllowance, form1042SRequest.withholdingAllowance) &&
        Objects.equals(this.federalTaxWithheld, form1042SRequest.federalTaxWithheld) &&
        Objects.equals(this.taxNotDepositedIndicator, form1042SRequest.taxNotDepositedIndicator) &&
        Objects.equals(this.academicIndicator, form1042SRequest.academicIndicator) &&
        Objects.equals(this.taxWithheldOtherAgents, form1042SRequest.taxWithheldOtherAgents) &&
        Objects.equals(this.amountRepaid, form1042SRequest.amountRepaid) &&
        Objects.equals(this.taxPaidAgent, form1042SRequest.taxPaidAgent) &&
        Objects.equals(this.chap3StatusCode, form1042SRequest.chap3StatusCode) &&
        Objects.equals(this.chap4StatusCode, form1042SRequest.chap4StatusCode) &&
        Objects.equals(this.primaryWithholdingAgent, form1042SRequest.primaryWithholdingAgent) &&
        Objects.equals(this.intermediaryOrFlowThrough, form1042SRequest.intermediaryOrFlowThrough) &&
        Objects.equals(this.stateAndLocalWithholding, form1042SRequest.stateAndLocalWithholding) &&
        Objects.equals(this.type, form1042SRequest.type) &&
        Objects.equals(this.issuerId, form1042SRequest.issuerId) &&
        Objects.equals(this.referenceId, form1042SRequest.referenceId) &&
        Objects.equals(this.recipientTin, form1042SRequest.recipientTin) &&
        Objects.equals(this.recipientName, form1042SRequest.recipientName) &&
        Objects.equals(this.tinType, form1042SRequest.tinType) &&
        Objects.equals(this.recipientSecondName, form1042SRequest.recipientSecondName) &&
        Objects.equals(this.address, form1042SRequest.address) &&
        Objects.equals(this.address2, form1042SRequest.address2) &&
        Objects.equals(this.city, form1042SRequest.city) &&
        Objects.equals(this.state, form1042SRequest.state) &&
        Objects.equals(this.zip, form1042SRequest.zip) &&
        Objects.equals(this.recipientEmail, form1042SRequest.recipientEmail) &&
        Objects.equals(this.accountNumber, form1042SRequest.accountNumber) &&
        Objects.equals(this.officeCode, form1042SRequest.officeCode) &&
        Objects.equals(this.recipientNonUsProvince, form1042SRequest.recipientNonUsProvince) &&
        Objects.equals(this.countryCode, form1042SRequest.countryCode) &&
        Objects.equals(this.federalEFile, form1042SRequest.federalEFile) &&
        Objects.equals(this.postalMail, form1042SRequest.postalMail) &&
        Objects.equals(this.stateEFile, form1042SRequest.stateEFile) &&
        Objects.equals(this.tinMatch, form1042SRequest.tinMatch) &&
        Objects.equals(this.addressVerification, form1042SRequest.addressVerification);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueFormId, noTin, recipientDateOfBirth, recipientGiin, recipientForeignTin, lobCode, incomeCode, grossIncome, withholdingIndicator, taxCountryCode, exemptionCodeChap3, exemptionCodeChap4, taxRateChap3, withholdingAllowance, federalTaxWithheld, taxNotDepositedIndicator, academicIndicator, taxWithheldOtherAgents, amountRepaid, taxPaidAgent, chap3StatusCode, chap4StatusCode, primaryWithholdingAgent, intermediaryOrFlowThrough, stateAndLocalWithholding, type, issuerId, referenceId, recipientTin, recipientName, tinType, recipientSecondName, address, address2, city, state, zip, recipientEmail, accountNumber, officeCode, recipientNonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, addressVerification);
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
    sb.append("class Form1042SRequest {\n");
    sb.append("    uniqueFormId: ").append(toIndentedString(uniqueFormId)).append("\n");
    sb.append("    noTin: ").append(toIndentedString(noTin)).append("\n");
    sb.append("    recipientDateOfBirth: ").append(toIndentedString(recipientDateOfBirth)).append("\n");
    sb.append("    recipientGiin: ").append(toIndentedString(recipientGiin)).append("\n");
    sb.append("    recipientForeignTin: ").append(toIndentedString(recipientForeignTin)).append("\n");
    sb.append("    lobCode: ").append(toIndentedString(lobCode)).append("\n");
    sb.append("    incomeCode: ").append(toIndentedString(incomeCode)).append("\n");
    sb.append("    grossIncome: ").append(toIndentedString(grossIncome)).append("\n");
    sb.append("    withholdingIndicator: ").append(toIndentedString(withholdingIndicator)).append("\n");
    sb.append("    taxCountryCode: ").append(toIndentedString(taxCountryCode)).append("\n");
    sb.append("    exemptionCodeChap3: ").append(toIndentedString(exemptionCodeChap3)).append("\n");
    sb.append("    exemptionCodeChap4: ").append(toIndentedString(exemptionCodeChap4)).append("\n");
    sb.append("    taxRateChap3: ").append(toIndentedString(taxRateChap3)).append("\n");
    sb.append("    withholdingAllowance: ").append(toIndentedString(withholdingAllowance)).append("\n");
    sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
    sb.append("    taxNotDepositedIndicator: ").append(toIndentedString(taxNotDepositedIndicator)).append("\n");
    sb.append("    academicIndicator: ").append(toIndentedString(academicIndicator)).append("\n");
    sb.append("    taxWithheldOtherAgents: ").append(toIndentedString(taxWithheldOtherAgents)).append("\n");
    sb.append("    amountRepaid: ").append(toIndentedString(amountRepaid)).append("\n");
    sb.append("    taxPaidAgent: ").append(toIndentedString(taxPaidAgent)).append("\n");
    sb.append("    chap3StatusCode: ").append(toIndentedString(chap3StatusCode)).append("\n");
    sb.append("    chap4StatusCode: ").append(toIndentedString(chap4StatusCode)).append("\n");
    sb.append("    primaryWithholdingAgent: ").append(toIndentedString(primaryWithholdingAgent)).append("\n");
    sb.append("    intermediaryOrFlowThrough: ").append(toIndentedString(intermediaryOrFlowThrough)).append("\n");
    sb.append("    stateAndLocalWithholding: ").append(toIndentedString(stateAndLocalWithholding)).append("\n");
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
    openapiFields.add("recipientTin");
    openapiFields.add("recipientName");
    openapiFields.add("tinType");
    openapiFields.add("recipientSecondName");
    openapiFields.add("address");
    openapiFields.add("address2");
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
    openapiRequiredFields.add("recipientName");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("countryCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1042SRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1042SRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1042SRequest is not found in the empty JSON string", Form1042SRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1042SRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1042SRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1042SRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uniqueFormId") != null && !jsonObj.get("uniqueFormId").isJsonNull()) && !jsonObj.get("uniqueFormId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uniqueFormId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uniqueFormId").toString()));
      }
      if ((jsonObj.get("recipientGiin") != null && !jsonObj.get("recipientGiin").isJsonNull()) && !jsonObj.get("recipientGiin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientGiin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientGiin").toString()));
      }
      if ((jsonObj.get("recipientForeignTin") != null && !jsonObj.get("recipientForeignTin").isJsonNull()) && !jsonObj.get("recipientForeignTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientForeignTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientForeignTin").toString()));
      }
      if ((jsonObj.get("lobCode") != null && !jsonObj.get("lobCode").isJsonNull()) && !jsonObj.get("lobCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lobCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lobCode").toString()));
      }
      if ((jsonObj.get("incomeCode") != null && !jsonObj.get("incomeCode").isJsonNull()) && !jsonObj.get("incomeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incomeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incomeCode").toString()));
      }
      if ((jsonObj.get("withholdingIndicator") != null && !jsonObj.get("withholdingIndicator").isJsonNull()) && !jsonObj.get("withholdingIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withholdingIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withholdingIndicator").toString()));
      }
      if ((jsonObj.get("taxCountryCode") != null && !jsonObj.get("taxCountryCode").isJsonNull()) && !jsonObj.get("taxCountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxCountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxCountryCode").toString()));
      }
      if ((jsonObj.get("exemptionCodeChap3") != null && !jsonObj.get("exemptionCodeChap3").isJsonNull()) && !jsonObj.get("exemptionCodeChap3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptionCodeChap3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptionCodeChap3").toString()));
      }
      if ((jsonObj.get("exemptionCodeChap4") != null && !jsonObj.get("exemptionCodeChap4").isJsonNull()) && !jsonObj.get("exemptionCodeChap4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptionCodeChap4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptionCodeChap4").toString()));
      }
      if ((jsonObj.get("taxRateChap3") != null && !jsonObj.get("taxRateChap3").isJsonNull()) && !jsonObj.get("taxRateChap3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxRateChap3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxRateChap3").toString()));
      }
      if ((jsonObj.get("chap3StatusCode") != null && !jsonObj.get("chap3StatusCode").isJsonNull()) && !jsonObj.get("chap3StatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chap3StatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chap3StatusCode").toString()));
      }
      if ((jsonObj.get("chap4StatusCode") != null && !jsonObj.get("chap4StatusCode").isJsonNull()) && !jsonObj.get("chap4StatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chap4StatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chap4StatusCode").toString()));
      }
      // validate the optional field `primaryWithholdingAgent`
      if (jsonObj.get("primaryWithholdingAgent") != null && !jsonObj.get("primaryWithholdingAgent").isJsonNull()) {
        PrimaryWithholdingAgentRequest.validateJsonElement(jsonObj.get("primaryWithholdingAgent"));
      }
      // validate the optional field `intermediaryOrFlowThrough`
      if (jsonObj.get("intermediaryOrFlowThrough") != null && !jsonObj.get("intermediaryOrFlowThrough").isJsonNull()) {
        IntermediaryOrFlowThroughRequest.validateJsonElement(jsonObj.get("intermediaryOrFlowThrough"));
      }
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholdingRequest.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
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
      if (!jsonObj.get("recipientName").isJsonPrimitive()) {
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
      if (!jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form1042SRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1042SRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1042SRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1042SRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1042SRequest>() {
           @Override
           public void write(JsonWriter out, Form1042SRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1042SRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1042SRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1042SRequest
   * @throws IOException if the JSON string is invalid with respect to Form1042SRequest
   */
  public static Form1042SRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1042SRequest.class);
  }

  /**
   * Convert an instance of Form1042SRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

