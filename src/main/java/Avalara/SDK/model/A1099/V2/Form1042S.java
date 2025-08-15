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
import Avalara.SDK.model.A1099.V2.IntermediaryOrFlowThrough;
import Avalara.SDK.model.A1099.V2.PrimaryWithholdingAgent;
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholding;
import Avalara.SDK.model.A1099.V2.StateEfileStatusDetail;
import Avalara.SDK.model.A1099.V2.ValidationError;
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
 * Form1042S
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1042S {
  public static final String SERIALIZED_NAME_UNIQUE_FORM_ID = "uniqueFormId";
  @SerializedName(SERIALIZED_NAME_UNIQUE_FORM_ID)
  private String uniqueFormId;

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
  private PrimaryWithholdingAgent primaryWithholdingAgent;

  public static final String SERIALIZED_NAME_INTERMEDIARY_OR_FLOW_THROUGH = "intermediaryOrFlowThrough";
  @SerializedName(SERIALIZED_NAME_INTERMEDIARY_OR_FLOW_THROUGH)
  private IntermediaryOrFlowThrough intermediaryOrFlowThrough;

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
  private Form1099StatusDetail federalEfileStatus;

  public static final String SERIALIZED_NAME_STATE_EFILE = "stateEfile";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE)
  private Boolean stateEfile;

  public static final String SERIALIZED_NAME_STATE_EFILE_STATUS = "stateEfileStatus";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE_STATUS)
  private List<StateEfileStatusDetail> stateEfileStatus;

  public static final String SERIALIZED_NAME_POSTAL_MAIL = "postalMail";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL)
  private Boolean postalMail;

  public static final String SERIALIZED_NAME_POSTAL_MAIL_STATUS = "postalMailStatus";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL_STATUS)
  private Form1099StatusDetail postalMailStatus;

  public static final String SERIALIZED_NAME_TIN_MATCH = "tinMatch";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH)
  private Boolean tinMatch;

  public static final String SERIALIZED_NAME_TIN_MATCH_STATUS = "tinMatchStatus";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH_STATUS)
  private Form1099StatusDetail tinMatchStatus;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "addressVerification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private Boolean addressVerification;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS = "addressVerificationStatus";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS)
  private Form1099StatusDetail addressVerificationStatus;

  public static final String SERIALIZED_NAME_E_DELIVERY_STATUS = "eDeliveryStatus";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_STATUS)
  private Form1099StatusDetail eDeliveryStatus;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TIN_TYPE = "tinType";
  @SerializedName(SERIALIZED_NAME_TIN_TYPE)
  private String tinType;

  public static final String SERIALIZED_NAME_FATCA_FILING_REQUIREMENT = "fatcaFilingRequirement";
  @SerializedName(SERIALIZED_NAME_FATCA_FILING_REQUIREMENT)
  private Boolean fatcaFilingRequirement;

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
  private List<ValidationError> validationErrors;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholding stateAndLocalWithholding;

  public Form1042S() {
  }

  public Form1042S uniqueFormId(String uniqueFormId) {
    this.uniqueFormId = uniqueFormId;
    return this;
  }

  /**
   * Get uniqueFormId
   * @return uniqueFormId
   */
  @javax.annotation.Nullable
  public String getUniqueFormId() {
    return uniqueFormId;
  }

  public void setUniqueFormId(String uniqueFormId) {
    this.uniqueFormId = uniqueFormId;
  }


  public Form1042S recipientDateOfBirth(OffsetDateTime recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
    return this;
  }

  /**
   * Get recipientDateOfBirth
   * @return recipientDateOfBirth
   */
  @javax.annotation.Nullable
  public OffsetDateTime getRecipientDateOfBirth() {
    return recipientDateOfBirth;
  }

  public void setRecipientDateOfBirth(OffsetDateTime recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
  }


  public Form1042S recipientGiin(String recipientGiin) {
    this.recipientGiin = recipientGiin;
    return this;
  }

  /**
   * Get recipientGiin
   * @return recipientGiin
   */
  @javax.annotation.Nullable
  public String getRecipientGiin() {
    return recipientGiin;
  }

  public void setRecipientGiin(String recipientGiin) {
    this.recipientGiin = recipientGiin;
  }


  public Form1042S recipientForeignTin(String recipientForeignTin) {
    this.recipientForeignTin = recipientForeignTin;
    return this;
  }

  /**
   * Get recipientForeignTin
   * @return recipientForeignTin
   */
  @javax.annotation.Nullable
  public String getRecipientForeignTin() {
    return recipientForeignTin;
  }

  public void setRecipientForeignTin(String recipientForeignTin) {
    this.recipientForeignTin = recipientForeignTin;
  }


  public Form1042S lobCode(String lobCode) {
    this.lobCode = lobCode;
    return this;
  }

  /**
   * Get lobCode
   * @return lobCode
   */
  @javax.annotation.Nullable
  public String getLobCode() {
    return lobCode;
  }

  public void setLobCode(String lobCode) {
    this.lobCode = lobCode;
  }


  public Form1042S incomeCode(String incomeCode) {
    this.incomeCode = incomeCode;
    return this;
  }

  /**
   * Get incomeCode
   * @return incomeCode
   */
  @javax.annotation.Nullable
  public String getIncomeCode() {
    return incomeCode;
  }

  public void setIncomeCode(String incomeCode) {
    this.incomeCode = incomeCode;
  }


  public Form1042S grossIncome(Double grossIncome) {
    this.grossIncome = grossIncome;
    return this;
  }

  /**
   * Get grossIncome
   * @return grossIncome
   */
  @javax.annotation.Nullable
  public Double getGrossIncome() {
    return grossIncome;
  }

  public void setGrossIncome(Double grossIncome) {
    this.grossIncome = grossIncome;
  }


  public Form1042S withholdingIndicator(String withholdingIndicator) {
    this.withholdingIndicator = withholdingIndicator;
    return this;
  }

  /**
   * Get withholdingIndicator
   * @return withholdingIndicator
   */
  @javax.annotation.Nullable
  public String getWithholdingIndicator() {
    return withholdingIndicator;
  }

  public void setWithholdingIndicator(String withholdingIndicator) {
    this.withholdingIndicator = withholdingIndicator;
  }


  public Form1042S taxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
    return this;
  }

  /**
   * Get taxCountryCode
   * @return taxCountryCode
   */
  @javax.annotation.Nullable
  public String getTaxCountryCode() {
    return taxCountryCode;
  }

  public void setTaxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
  }


  public Form1042S exemptionCodeChap3(String exemptionCodeChap3) {
    this.exemptionCodeChap3 = exemptionCodeChap3;
    return this;
  }

  /**
   * Get exemptionCodeChap3
   * @return exemptionCodeChap3
   */
  @javax.annotation.Nullable
  public String getExemptionCodeChap3() {
    return exemptionCodeChap3;
  }

  public void setExemptionCodeChap3(String exemptionCodeChap3) {
    this.exemptionCodeChap3 = exemptionCodeChap3;
  }


  public Form1042S exemptionCodeChap4(String exemptionCodeChap4) {
    this.exemptionCodeChap4 = exemptionCodeChap4;
    return this;
  }

  /**
   * Get exemptionCodeChap4
   * @return exemptionCodeChap4
   */
  @javax.annotation.Nullable
  public String getExemptionCodeChap4() {
    return exemptionCodeChap4;
  }

  public void setExemptionCodeChap4(String exemptionCodeChap4) {
    this.exemptionCodeChap4 = exemptionCodeChap4;
  }


  public Form1042S taxRateChap3(String taxRateChap3) {
    this.taxRateChap3 = taxRateChap3;
    return this;
  }

  /**
   * Get taxRateChap3
   * @return taxRateChap3
   */
  @javax.annotation.Nullable
  public String getTaxRateChap3() {
    return taxRateChap3;
  }

  public void setTaxRateChap3(String taxRateChap3) {
    this.taxRateChap3 = taxRateChap3;
  }


  public Form1042S withholdingAllowance(Double withholdingAllowance) {
    this.withholdingAllowance = withholdingAllowance;
    return this;
  }

  /**
   * Get withholdingAllowance
   * @return withholdingAllowance
   */
  @javax.annotation.Nullable
  public Double getWithholdingAllowance() {
    return withholdingAllowance;
  }

  public void setWithholdingAllowance(Double withholdingAllowance) {
    this.withholdingAllowance = withholdingAllowance;
  }


  public Form1042S federalTaxWithheld(Double federalTaxWithheld) {
    this.federalTaxWithheld = federalTaxWithheld;
    return this;
  }

  /**
   * Get federalTaxWithheld
   * @return federalTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getFederalTaxWithheld() {
    return federalTaxWithheld;
  }

  public void setFederalTaxWithheld(Double federalTaxWithheld) {
    this.federalTaxWithheld = federalTaxWithheld;
  }


  public Form1042S taxNotDepositedIndicator(Boolean taxNotDepositedIndicator) {
    this.taxNotDepositedIndicator = taxNotDepositedIndicator;
    return this;
  }

  /**
   * Get taxNotDepositedIndicator
   * @return taxNotDepositedIndicator
   */
  @javax.annotation.Nullable
  public Boolean getTaxNotDepositedIndicator() {
    return taxNotDepositedIndicator;
  }

  public void setTaxNotDepositedIndicator(Boolean taxNotDepositedIndicator) {
    this.taxNotDepositedIndicator = taxNotDepositedIndicator;
  }


  public Form1042S academicIndicator(Boolean academicIndicator) {
    this.academicIndicator = academicIndicator;
    return this;
  }

  /**
   * Get academicIndicator
   * @return academicIndicator
   */
  @javax.annotation.Nullable
  public Boolean getAcademicIndicator() {
    return academicIndicator;
  }

  public void setAcademicIndicator(Boolean academicIndicator) {
    this.academicIndicator = academicIndicator;
  }


  public Form1042S taxWithheldOtherAgents(Double taxWithheldOtherAgents) {
    this.taxWithheldOtherAgents = taxWithheldOtherAgents;
    return this;
  }

  /**
   * Get taxWithheldOtherAgents
   * @return taxWithheldOtherAgents
   */
  @javax.annotation.Nullable
  public Double getTaxWithheldOtherAgents() {
    return taxWithheldOtherAgents;
  }

  public void setTaxWithheldOtherAgents(Double taxWithheldOtherAgents) {
    this.taxWithheldOtherAgents = taxWithheldOtherAgents;
  }


  public Form1042S amountRepaid(Double amountRepaid) {
    this.amountRepaid = amountRepaid;
    return this;
  }

  /**
   * Get amountRepaid
   * @return amountRepaid
   */
  @javax.annotation.Nullable
  public Double getAmountRepaid() {
    return amountRepaid;
  }

  public void setAmountRepaid(Double amountRepaid) {
    this.amountRepaid = amountRepaid;
  }


  public Form1042S taxPaidAgent(Double taxPaidAgent) {
    this.taxPaidAgent = taxPaidAgent;
    return this;
  }

  /**
   * Get taxPaidAgent
   * @return taxPaidAgent
   */
  @javax.annotation.Nullable
  public Double getTaxPaidAgent() {
    return taxPaidAgent;
  }

  public void setTaxPaidAgent(Double taxPaidAgent) {
    this.taxPaidAgent = taxPaidAgent;
  }


  public Form1042S chap3StatusCode(String chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
    return this;
  }

  /**
   * Get chap3StatusCode
   * @return chap3StatusCode
   */
  @javax.annotation.Nullable
  public String getChap3StatusCode() {
    return chap3StatusCode;
  }

  public void setChap3StatusCode(String chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
  }


  public Form1042S chap4StatusCode(String chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
    return this;
  }

  /**
   * Get chap4StatusCode
   * @return chap4StatusCode
   */
  @javax.annotation.Nullable
  public String getChap4StatusCode() {
    return chap4StatusCode;
  }

  public void setChap4StatusCode(String chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
  }


  public Form1042S primaryWithholdingAgent(PrimaryWithholdingAgent primaryWithholdingAgent) {
    this.primaryWithholdingAgent = primaryWithholdingAgent;
    return this;
  }

  /**
   * Get primaryWithholdingAgent
   * @return primaryWithholdingAgent
   */
  @javax.annotation.Nullable
  public PrimaryWithholdingAgent getPrimaryWithholdingAgent() {
    return primaryWithholdingAgent;
  }

  public void setPrimaryWithholdingAgent(PrimaryWithholdingAgent primaryWithholdingAgent) {
    this.primaryWithholdingAgent = primaryWithholdingAgent;
  }


  public Form1042S intermediaryOrFlowThrough(IntermediaryOrFlowThrough intermediaryOrFlowThrough) {
    this.intermediaryOrFlowThrough = intermediaryOrFlowThrough;
    return this;
  }

  /**
   * Get intermediaryOrFlowThrough
   * @return intermediaryOrFlowThrough
   */
  @javax.annotation.Nullable
  public IntermediaryOrFlowThrough getIntermediaryOrFlowThrough() {
    return intermediaryOrFlowThrough;
  }

  public void setIntermediaryOrFlowThrough(IntermediaryOrFlowThrough intermediaryOrFlowThrough) {
    this.intermediaryOrFlowThrough = intermediaryOrFlowThrough;
  }


  public Form1042S id(String id) {
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


  public Form1042S type(String type) {
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


  public Form1042S issuerId(Integer issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * Get issuerId
   * @return issuerId
   */
  @javax.annotation.Nullable
  public Integer getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(Integer issuerId) {
    this.issuerId = issuerId;
  }


  public Form1042S issuerReferenceId(String issuerReferenceId) {
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


  public Form1042S issuerTin(String issuerTin) {
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


  public Form1042S taxYear(Integer taxYear) {
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


  public Form1042S federalEfile(Boolean federalEfile) {
    this.federalEfile = federalEfile;
    return this;
  }

  /**
   * Get federalEfile
   * @return federalEfile
   */
  @javax.annotation.Nullable
  public Boolean getFederalEfile() {
    return federalEfile;
  }

  public void setFederalEfile(Boolean federalEfile) {
    this.federalEfile = federalEfile;
  }


  public Form1042S federalEfileStatus(Form1099StatusDetail federalEfileStatus) {
    this.federalEfileStatus = federalEfileStatus;
    return this;
  }

  /**
   * Get federalEfileStatus
   * @return federalEfileStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getFederalEfileStatus() {
    return federalEfileStatus;
  }

  public void setFederalEfileStatus(Form1099StatusDetail federalEfileStatus) {
    this.federalEfileStatus = federalEfileStatus;
  }


  public Form1042S stateEfile(Boolean stateEfile) {
    this.stateEfile = stateEfile;
    return this;
  }

  /**
   * Get stateEfile
   * @return stateEfile
   */
  @javax.annotation.Nullable
  public Boolean getStateEfile() {
    return stateEfile;
  }

  public void setStateEfile(Boolean stateEfile) {
    this.stateEfile = stateEfile;
  }


  public Form1042S stateEfileStatus(List<StateEfileStatusDetail> stateEfileStatus) {
    this.stateEfileStatus = stateEfileStatus;
    return this;
  }

  public Form1042S addStateEfileStatusItem(StateEfileStatusDetail stateEfileStatusItem) {
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
  public List<StateEfileStatusDetail> getStateEfileStatus() {
    return stateEfileStatus;
  }

  public void setStateEfileStatus(List<StateEfileStatusDetail> stateEfileStatus) {
    this.stateEfileStatus = stateEfileStatus;
  }


  public Form1042S postalMail(Boolean postalMail) {
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


  public Form1042S postalMailStatus(Form1099StatusDetail postalMailStatus) {
    this.postalMailStatus = postalMailStatus;
    return this;
  }

  /**
   * Get postalMailStatus
   * @return postalMailStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getPostalMailStatus() {
    return postalMailStatus;
  }

  public void setPostalMailStatus(Form1099StatusDetail postalMailStatus) {
    this.postalMailStatus = postalMailStatus;
  }


  public Form1042S tinMatch(Boolean tinMatch) {
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


  public Form1042S tinMatchStatus(Form1099StatusDetail tinMatchStatus) {
    this.tinMatchStatus = tinMatchStatus;
    return this;
  }

  /**
   * Get tinMatchStatus
   * @return tinMatchStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getTinMatchStatus() {
    return tinMatchStatus;
  }

  public void setTinMatchStatus(Form1099StatusDetail tinMatchStatus) {
    this.tinMatchStatus = tinMatchStatus;
  }


  public Form1042S addressVerification(Boolean addressVerification) {
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


  public Form1042S addressVerificationStatus(Form1099StatusDetail addressVerificationStatus) {
    this.addressVerificationStatus = addressVerificationStatus;
    return this;
  }

  /**
   * Get addressVerificationStatus
   * @return addressVerificationStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getAddressVerificationStatus() {
    return addressVerificationStatus;
  }

  public void setAddressVerificationStatus(Form1099StatusDetail addressVerificationStatus) {
    this.addressVerificationStatus = addressVerificationStatus;
  }


  public Form1042S eDeliveryStatus(Form1099StatusDetail eDeliveryStatus) {
    this.eDeliveryStatus = eDeliveryStatus;
    return this;
  }

  /**
   * Get eDeliveryStatus
   * @return eDeliveryStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail geteDeliveryStatus() {
    return eDeliveryStatus;
  }

  public void seteDeliveryStatus(Form1099StatusDetail eDeliveryStatus) {
    this.eDeliveryStatus = eDeliveryStatus;
  }


  public Form1042S referenceId(String referenceId) {
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


  public Form1042S email(String email) {
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


  public Form1042S tinType(String tinType) {
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


  public Form1042S fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
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


  public Form1042S tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * Get tin
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public Form1042S noTin(Boolean noTin) {
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


  public Form1042S secondTinNotice(Boolean secondTinNotice) {
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


  public Form1042S recipientName(String recipientName) {
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


  public Form1042S recipientSecondName(String recipientSecondName) {
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


  public Form1042S address(String address) {
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


  public Form1042S address2(String address2) {
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


  public Form1042S city(String city) {
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


  public Form1042S state(String state) {
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


  public Form1042S zip(String zip) {
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


  public Form1042S nonUsProvince(String nonUsProvince) {
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


  public Form1042S countryCode(String countryCode) {
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


  public Form1042S accountNumber(String accountNumber) {
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


  public Form1042S officeCode(String officeCode) {
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


  public Form1042S validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Form1042S addValidationErrorsItem(ValidationError validationErrorsItem) {
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
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }


  public Form1042S createdAt(OffsetDateTime createdAt) {
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


  public Form1042S updatedAt(OffsetDateTime updatedAt) {
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


  public Form1042S stateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1042S form1042S = (Form1042S) o;
    return Objects.equals(this.uniqueFormId, form1042S.uniqueFormId) &&
        Objects.equals(this.recipientDateOfBirth, form1042S.recipientDateOfBirth) &&
        Objects.equals(this.recipientGiin, form1042S.recipientGiin) &&
        Objects.equals(this.recipientForeignTin, form1042S.recipientForeignTin) &&
        Objects.equals(this.lobCode, form1042S.lobCode) &&
        Objects.equals(this.incomeCode, form1042S.incomeCode) &&
        Objects.equals(this.grossIncome, form1042S.grossIncome) &&
        Objects.equals(this.withholdingIndicator, form1042S.withholdingIndicator) &&
        Objects.equals(this.taxCountryCode, form1042S.taxCountryCode) &&
        Objects.equals(this.exemptionCodeChap3, form1042S.exemptionCodeChap3) &&
        Objects.equals(this.exemptionCodeChap4, form1042S.exemptionCodeChap4) &&
        Objects.equals(this.taxRateChap3, form1042S.taxRateChap3) &&
        Objects.equals(this.withholdingAllowance, form1042S.withholdingAllowance) &&
        Objects.equals(this.federalTaxWithheld, form1042S.federalTaxWithheld) &&
        Objects.equals(this.taxNotDepositedIndicator, form1042S.taxNotDepositedIndicator) &&
        Objects.equals(this.academicIndicator, form1042S.academicIndicator) &&
        Objects.equals(this.taxWithheldOtherAgents, form1042S.taxWithheldOtherAgents) &&
        Objects.equals(this.amountRepaid, form1042S.amountRepaid) &&
        Objects.equals(this.taxPaidAgent, form1042S.taxPaidAgent) &&
        Objects.equals(this.chap3StatusCode, form1042S.chap3StatusCode) &&
        Objects.equals(this.chap4StatusCode, form1042S.chap4StatusCode) &&
        Objects.equals(this.primaryWithholdingAgent, form1042S.primaryWithholdingAgent) &&
        Objects.equals(this.intermediaryOrFlowThrough, form1042S.intermediaryOrFlowThrough) &&
        Objects.equals(this.id, form1042S.id) &&
        Objects.equals(this.type, form1042S.type) &&
        Objects.equals(this.issuerId, form1042S.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1042S.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1042S.issuerTin) &&
        Objects.equals(this.taxYear, form1042S.taxYear) &&
        Objects.equals(this.federalEfile, form1042S.federalEfile) &&
        Objects.equals(this.federalEfileStatus, form1042S.federalEfileStatus) &&
        Objects.equals(this.stateEfile, form1042S.stateEfile) &&
        Objects.equals(this.stateEfileStatus, form1042S.stateEfileStatus) &&
        Objects.equals(this.postalMail, form1042S.postalMail) &&
        Objects.equals(this.postalMailStatus, form1042S.postalMailStatus) &&
        Objects.equals(this.tinMatch, form1042S.tinMatch) &&
        Objects.equals(this.tinMatchStatus, form1042S.tinMatchStatus) &&
        Objects.equals(this.addressVerification, form1042S.addressVerification) &&
        Objects.equals(this.addressVerificationStatus, form1042S.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form1042S.eDeliveryStatus) &&
        Objects.equals(this.referenceId, form1042S.referenceId) &&
        Objects.equals(this.email, form1042S.email) &&
        Objects.equals(this.tinType, form1042S.tinType) &&
        Objects.equals(this.fatcaFilingRequirement, form1042S.fatcaFilingRequirement) &&
        Objects.equals(this.tin, form1042S.tin) &&
        Objects.equals(this.noTin, form1042S.noTin) &&
        Objects.equals(this.secondTinNotice, form1042S.secondTinNotice) &&
        Objects.equals(this.recipientName, form1042S.recipientName) &&
        Objects.equals(this.recipientSecondName, form1042S.recipientSecondName) &&
        Objects.equals(this.address, form1042S.address) &&
        Objects.equals(this.address2, form1042S.address2) &&
        Objects.equals(this.city, form1042S.city) &&
        Objects.equals(this.state, form1042S.state) &&
        Objects.equals(this.zip, form1042S.zip) &&
        Objects.equals(this.nonUsProvince, form1042S.nonUsProvince) &&
        Objects.equals(this.countryCode, form1042S.countryCode) &&
        Objects.equals(this.accountNumber, form1042S.accountNumber) &&
        Objects.equals(this.officeCode, form1042S.officeCode) &&
        Objects.equals(this.validationErrors, form1042S.validationErrors) &&
        Objects.equals(this.createdAt, form1042S.createdAt) &&
        Objects.equals(this.updatedAt, form1042S.updatedAt) &&
        Objects.equals(this.stateAndLocalWithholding, form1042S.stateAndLocalWithholding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueFormId, recipientDateOfBirth, recipientGiin, recipientForeignTin, lobCode, incomeCode, grossIncome, withholdingIndicator, taxCountryCode, exemptionCodeChap3, exemptionCodeChap4, taxRateChap3, withholdingAllowance, federalTaxWithheld, taxNotDepositedIndicator, academicIndicator, taxWithheldOtherAgents, amountRepaid, taxPaidAgent, chap3StatusCode, chap4StatusCode, primaryWithholdingAgent, intermediaryOrFlowThrough, id, type, issuerId, issuerReferenceId, issuerTin, taxYear, federalEfile, federalEfileStatus, stateEfile, stateEfileStatus, postalMail, postalMailStatus, tinMatch, tinMatchStatus, addressVerification, addressVerificationStatus, eDeliveryStatus, referenceId, email, tinType, fatcaFilingRequirement, tin, noTin, secondTinNotice, recipientName, recipientSecondName, address, address2, city, state, zip, nonUsProvince, countryCode, accountNumber, officeCode, validationErrors, createdAt, updatedAt, stateAndLocalWithholding);
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
    sb.append("class Form1042S {\n");
    sb.append("    uniqueFormId: ").append(toIndentedString(uniqueFormId)).append("\n");
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
    sb.append("    fatcaFilingRequirement: ").append(toIndentedString(fatcaFilingRequirement)).append("\n");
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
    openapiFields.add("fatcaFilingRequirement");
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
    openapiFields.add("validationErrors");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("stateAndLocalWithholding");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1042S
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1042S.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1042S is not found in the empty JSON string", Form1042S.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1042S.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1042S` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
        PrimaryWithholdingAgent.validateJsonElement(jsonObj.get("primaryWithholdingAgent"));
      }
      // validate the optional field `intermediaryOrFlowThrough`
      if (jsonObj.get("intermediaryOrFlowThrough") != null && !jsonObj.get("intermediaryOrFlowThrough").isJsonNull()) {
        IntermediaryOrFlowThrough.validateJsonElement(jsonObj.get("intermediaryOrFlowThrough"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
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
            ValidationError.validateJsonElement(jsonArrayvalidationErrors.get(i));
          };
        }
      }
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholding.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form1042S.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1042S' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1042S> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1042S.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1042S>() {
           @Override
           public void write(JsonWriter out, Form1042S value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1042S read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1042S given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1042S
   * @throws IOException if the JSON string is invalid with respect to Form1042S
   */
  public static Form1042S fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1042S.class);
  }

  /**
   * Convert an instance of Form1042S to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

