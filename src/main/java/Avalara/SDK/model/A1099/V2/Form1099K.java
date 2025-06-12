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
 * Form1099K
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099K {
  /**
   * Gets or Sets filerType
   */
  @JsonAdapter(FilerTypeEnum.Adapter.class)
  public enum FilerTypeEnum {
    PSE("PSE"),
    
    EPF("EPF"),
    
    OTHER("Other");

    private String value;

    FilerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FilerTypeEnum fromValue(String value) {
      for (FilerTypeEnum b : FilerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FilerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FilerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FilerTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FilerTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FILER_TYPE = "filerType";
  @SerializedName(SERIALIZED_NAME_FILER_TYPE)
  private FilerTypeEnum filerType;

  /**
   * Gets or Sets paymentType
   */
  @JsonAdapter(PaymentTypeEnum.Adapter.class)
  public enum PaymentTypeEnum {
    MERCHANT_PAYMENT_CARD("MerchantPaymentCard"),
    
    THIRD_PARTY_NETWORK("ThirdPartyNetwork");

    private String value;

    PaymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentTypeEnum fromValue(String value) {
      for (PaymentTypeEnum b : PaymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PaymentTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private PaymentTypeEnum paymentType;

  public static final String SERIALIZED_NAME_PAYMENT_SETTLEMENT_ENTITY_NAME_PHONE_NUMBER = "paymentSettlementEntityNamePhoneNumber";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SETTLEMENT_ENTITY_NAME_PHONE_NUMBER)
  private String paymentSettlementEntityNamePhoneNumber;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT_PAYMENT_CARD = "grossAmountPaymentCard";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT_PAYMENT_CARD)
  private Double grossAmountPaymentCard;

  public static final String SERIALIZED_NAME_CARD_NOT_PRESENT_TRANSACTIONS = "cardNotPresentTransactions";
  @SerializedName(SERIALIZED_NAME_CARD_NOT_PRESENT_TRANSACTIONS)
  private Double cardNotPresentTransactions;

  public static final String SERIALIZED_NAME_MERCHANT_CATEGORY_CODE = "merchantCategoryCode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CATEGORY_CODE)
  private String merchantCategoryCode;

  public static final String SERIALIZED_NAME_PAYMENT_TRANSACTION_NUMBER = "paymentTransactionNumber";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TRANSACTION_NUMBER)
  private Double paymentTransactionNumber;

  public static final String SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD = "federalIncomeTaxWithheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD)
  private Double federalIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_JANUARY = "january";
  @SerializedName(SERIALIZED_NAME_JANUARY)
  private Double january;

  public static final String SERIALIZED_NAME_FEBRUARY = "february";
  @SerializedName(SERIALIZED_NAME_FEBRUARY)
  private Double february;

  public static final String SERIALIZED_NAME_MARCH = "march";
  @SerializedName(SERIALIZED_NAME_MARCH)
  private Double march;

  public static final String SERIALIZED_NAME_APRIL = "april";
  @SerializedName(SERIALIZED_NAME_APRIL)
  private Double april;

  public static final String SERIALIZED_NAME_MAY = "may";
  @SerializedName(SERIALIZED_NAME_MAY)
  private Double may;

  public static final String SERIALIZED_NAME_JUNE = "june";
  @SerializedName(SERIALIZED_NAME_JUNE)
  private Double june;

  public static final String SERIALIZED_NAME_JULY = "july";
  @SerializedName(SERIALIZED_NAME_JULY)
  private Double july;

  public static final String SERIALIZED_NAME_AUGUST = "august";
  @SerializedName(SERIALIZED_NAME_AUGUST)
  private Double august;

  public static final String SERIALIZED_NAME_SEPT = "sept";
  @SerializedName(SERIALIZED_NAME_SEPT)
  private Double sept;

  public static final String SERIALIZED_NAME_OCTOBER = "october";
  @SerializedName(SERIALIZED_NAME_OCTOBER)
  private Double october;

  public static final String SERIALIZED_NAME_NOVEMBER = "november";
  @SerializedName(SERIALIZED_NAME_NOVEMBER)
  private Double november;

  public static final String SERIALIZED_NAME_DECEMBER = "december";
  @SerializedName(SERIALIZED_NAME_DECEMBER)
  private Double december;

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

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TYPE_OF_TIN = "typeOfTin";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_TIN)
  private String typeOfTin;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_FIRST_PAYEE_NAME = "firstPayeeName";
  @SerializedName(SERIALIZED_NAME_FIRST_PAYEE_NAME)
  private String firstPayeeName;

  public static final String SERIALIZED_NAME_SECOND_PAYEE_NAME = "secondPayeeName";
  @SerializedName(SERIALIZED_NAME_SECOND_PAYEE_NAME)
  private String secondPayeeName;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_RECIPIENT_SECOND = "addressRecipientSecond";
  @SerializedName(SERIALIZED_NAME_ADDRESS_RECIPIENT_SECOND)
  private String addressRecipientSecond;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_FOREIGN_PROVINCE = "foreignProvince";
  @SerializedName(SERIALIZED_NAME_FOREIGN_PROVINCE)
  private String foreignProvince;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

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

  public Form1099K() {
  }

  public Form1099K filerType(FilerTypeEnum filerType) {
    this.filerType = filerType;
    return this;
  }

  /**
   * Get filerType
   * @return filerType
   */
  @javax.annotation.Nullable
  public FilerTypeEnum getFilerType() {
    return filerType;
  }

  public void setFilerType(FilerTypeEnum filerType) {
    this.filerType = filerType;
  }


  public Form1099K paymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
   */
  @javax.annotation.Nullable
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }


  public Form1099K paymentSettlementEntityNamePhoneNumber(String paymentSettlementEntityNamePhoneNumber) {
    this.paymentSettlementEntityNamePhoneNumber = paymentSettlementEntityNamePhoneNumber;
    return this;
  }

  /**
   * Get paymentSettlementEntityNamePhoneNumber
   * @return paymentSettlementEntityNamePhoneNumber
   */
  @javax.annotation.Nullable
  public String getPaymentSettlementEntityNamePhoneNumber() {
    return paymentSettlementEntityNamePhoneNumber;
  }

  public void setPaymentSettlementEntityNamePhoneNumber(String paymentSettlementEntityNamePhoneNumber) {
    this.paymentSettlementEntityNamePhoneNumber = paymentSettlementEntityNamePhoneNumber;
  }


  public Form1099K grossAmountPaymentCard(Double grossAmountPaymentCard) {
    this.grossAmountPaymentCard = grossAmountPaymentCard;
    return this;
  }

  /**
   * Get grossAmountPaymentCard
   * @return grossAmountPaymentCard
   */
  @javax.annotation.Nullable
  public Double getGrossAmountPaymentCard() {
    return grossAmountPaymentCard;
  }

  public void setGrossAmountPaymentCard(Double grossAmountPaymentCard) {
    this.grossAmountPaymentCard = grossAmountPaymentCard;
  }


  public Form1099K cardNotPresentTransactions(Double cardNotPresentTransactions) {
    this.cardNotPresentTransactions = cardNotPresentTransactions;
    return this;
  }

  /**
   * Get cardNotPresentTransactions
   * @return cardNotPresentTransactions
   */
  @javax.annotation.Nullable
  public Double getCardNotPresentTransactions() {
    return cardNotPresentTransactions;
  }

  public void setCardNotPresentTransactions(Double cardNotPresentTransactions) {
    this.cardNotPresentTransactions = cardNotPresentTransactions;
  }


  public Form1099K merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * Get merchantCategoryCode
   * @return merchantCategoryCode
   */
  @javax.annotation.Nullable
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  public Form1099K paymentTransactionNumber(Double paymentTransactionNumber) {
    this.paymentTransactionNumber = paymentTransactionNumber;
    return this;
  }

  /**
   * Get paymentTransactionNumber
   * @return paymentTransactionNumber
   */
  @javax.annotation.Nullable
  public Double getPaymentTransactionNumber() {
    return paymentTransactionNumber;
  }

  public void setPaymentTransactionNumber(Double paymentTransactionNumber) {
    this.paymentTransactionNumber = paymentTransactionNumber;
  }


  public Form1099K federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
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


  public Form1099K january(Double january) {
    this.january = january;
    return this;
  }

  /**
   * Get january
   * @return january
   */
  @javax.annotation.Nullable
  public Double getJanuary() {
    return january;
  }

  public void setJanuary(Double january) {
    this.january = january;
  }


  public Form1099K february(Double february) {
    this.february = february;
    return this;
  }

  /**
   * Get february
   * @return february
   */
  @javax.annotation.Nullable
  public Double getFebruary() {
    return february;
  }

  public void setFebruary(Double february) {
    this.february = february;
  }


  public Form1099K march(Double march) {
    this.march = march;
    return this;
  }

  /**
   * Get march
   * @return march
   */
  @javax.annotation.Nullable
  public Double getMarch() {
    return march;
  }

  public void setMarch(Double march) {
    this.march = march;
  }


  public Form1099K april(Double april) {
    this.april = april;
    return this;
  }

  /**
   * Get april
   * @return april
   */
  @javax.annotation.Nullable
  public Double getApril() {
    return april;
  }

  public void setApril(Double april) {
    this.april = april;
  }


  public Form1099K may(Double may) {
    this.may = may;
    return this;
  }

  /**
   * Get may
   * @return may
   */
  @javax.annotation.Nullable
  public Double getMay() {
    return may;
  }

  public void setMay(Double may) {
    this.may = may;
  }


  public Form1099K june(Double june) {
    this.june = june;
    return this;
  }

  /**
   * Get june
   * @return june
   */
  @javax.annotation.Nullable
  public Double getJune() {
    return june;
  }

  public void setJune(Double june) {
    this.june = june;
  }


  public Form1099K july(Double july) {
    this.july = july;
    return this;
  }

  /**
   * Get july
   * @return july
   */
  @javax.annotation.Nullable
  public Double getJuly() {
    return july;
  }

  public void setJuly(Double july) {
    this.july = july;
  }


  public Form1099K august(Double august) {
    this.august = august;
    return this;
  }

  /**
   * Get august
   * @return august
   */
  @javax.annotation.Nullable
  public Double getAugust() {
    return august;
  }

  public void setAugust(Double august) {
    this.august = august;
  }


  public Form1099K sept(Double sept) {
    this.sept = sept;
    return this;
  }

  /**
   * Get sept
   * @return sept
   */
  @javax.annotation.Nullable
  public Double getSept() {
    return sept;
  }

  public void setSept(Double sept) {
    this.sept = sept;
  }


  public Form1099K october(Double october) {
    this.october = october;
    return this;
  }

  /**
   * Get october
   * @return october
   */
  @javax.annotation.Nullable
  public Double getOctober() {
    return october;
  }

  public void setOctober(Double october) {
    this.october = october;
  }


  public Form1099K november(Double november) {
    this.november = november;
    return this;
  }

  /**
   * Get november
   * @return november
   */
  @javax.annotation.Nullable
  public Double getNovember() {
    return november;
  }

  public void setNovember(Double november) {
    this.november = november;
  }


  public Form1099K december(Double december) {
    this.december = december;
    return this;
  }

  /**
   * Get december
   * @return december
   */
  @javax.annotation.Nullable
  public Double getDecember() {
    return december;
  }

  public void setDecember(Double december) {
    this.december = december;
  }


  public Form1099K id(String id) {
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


  public Form1099K type(String type) {
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


  public Form1099K issuerId(Integer issuerId) {
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


  public Form1099K issuerReferenceId(String issuerReferenceId) {
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


  public Form1099K issuerTin(String issuerTin) {
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


  public Form1099K taxYear(Integer taxYear) {
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


  public Form1099K federalEfile(Boolean federalEfile) {
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


  public Form1099K federalEfileStatus(Form1099StatusDetail federalEfileStatus) {
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


  public Form1099K stateEfile(Boolean stateEfile) {
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


  public Form1099K stateEfileStatus(List<StateEfileStatusDetail> stateEfileStatus) {
    this.stateEfileStatus = stateEfileStatus;
    return this;
  }

  public Form1099K addStateEfileStatusItem(StateEfileStatusDetail stateEfileStatusItem) {
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


  public Form1099K postalMail(Boolean postalMail) {
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


  public Form1099K postalMailStatus(Form1099StatusDetail postalMailStatus) {
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


  public Form1099K tinMatch(Boolean tinMatch) {
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


  public Form1099K tinMatchStatus(Form1099StatusDetail tinMatchStatus) {
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


  public Form1099K addressVerification(Boolean addressVerification) {
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


  public Form1099K addressVerificationStatus(Form1099StatusDetail addressVerificationStatus) {
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


  public Form1099K referenceId(String referenceId) {
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


  public Form1099K email(String email) {
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


  public Form1099K typeOfTin(String typeOfTin) {
    this.typeOfTin = typeOfTin;
    return this;
  }

  /**
   * Get typeOfTin
   * @return typeOfTin
   */
  @javax.annotation.Nullable
  public String getTypeOfTin() {
    return typeOfTin;
  }

  public void setTypeOfTin(String typeOfTin) {
    this.typeOfTin = typeOfTin;
  }


  public Form1099K tin(String tin) {
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


  public Form1099K firstPayeeName(String firstPayeeName) {
    this.firstPayeeName = firstPayeeName;
    return this;
  }

  /**
   * Get firstPayeeName
   * @return firstPayeeName
   */
  @javax.annotation.Nullable
  public String getFirstPayeeName() {
    return firstPayeeName;
  }

  public void setFirstPayeeName(String firstPayeeName) {
    this.firstPayeeName = firstPayeeName;
  }


  public Form1099K secondPayeeName(String secondPayeeName) {
    this.secondPayeeName = secondPayeeName;
    return this;
  }

  /**
   * Get secondPayeeName
   * @return secondPayeeName
   */
  @javax.annotation.Nullable
  public String getSecondPayeeName() {
    return secondPayeeName;
  }

  public void setSecondPayeeName(String secondPayeeName) {
    this.secondPayeeName = secondPayeeName;
  }


  public Form1099K address(String address) {
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


  public Form1099K addressRecipientSecond(String addressRecipientSecond) {
    this.addressRecipientSecond = addressRecipientSecond;
    return this;
  }

  /**
   * Get addressRecipientSecond
   * @return addressRecipientSecond
   */
  @javax.annotation.Nullable
  public String getAddressRecipientSecond() {
    return addressRecipientSecond;
  }

  public void setAddressRecipientSecond(String addressRecipientSecond) {
    this.addressRecipientSecond = addressRecipientSecond;
  }


  public Form1099K city(String city) {
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


  public Form1099K state(String state) {
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


  public Form1099K zip(String zip) {
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


  public Form1099K foreignProvince(String foreignProvince) {
    this.foreignProvince = foreignProvince;
    return this;
  }

  /**
   * Get foreignProvince
   * @return foreignProvince
   */
  @javax.annotation.Nullable
  public String getForeignProvince() {
    return foreignProvince;
  }

  public void setForeignProvince(String foreignProvince) {
    this.foreignProvince = foreignProvince;
  }


  public Form1099K countryCode(String countryCode) {
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


  public Form1099K validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Form1099K addValidationErrorsItem(ValidationError validationErrorsItem) {
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


  public Form1099K createdAt(OffsetDateTime createdAt) {
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


  public Form1099K updatedAt(OffsetDateTime updatedAt) {
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


  public Form1099K stateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
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
    Form1099K form1099K = (Form1099K) o;
    return Objects.equals(this.filerType, form1099K.filerType) &&
        Objects.equals(this.paymentType, form1099K.paymentType) &&
        Objects.equals(this.paymentSettlementEntityNamePhoneNumber, form1099K.paymentSettlementEntityNamePhoneNumber) &&
        Objects.equals(this.grossAmountPaymentCard, form1099K.grossAmountPaymentCard) &&
        Objects.equals(this.cardNotPresentTransactions, form1099K.cardNotPresentTransactions) &&
        Objects.equals(this.merchantCategoryCode, form1099K.merchantCategoryCode) &&
        Objects.equals(this.paymentTransactionNumber, form1099K.paymentTransactionNumber) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099K.federalIncomeTaxWithheld) &&
        Objects.equals(this.january, form1099K.january) &&
        Objects.equals(this.february, form1099K.february) &&
        Objects.equals(this.march, form1099K.march) &&
        Objects.equals(this.april, form1099K.april) &&
        Objects.equals(this.may, form1099K.may) &&
        Objects.equals(this.june, form1099K.june) &&
        Objects.equals(this.july, form1099K.july) &&
        Objects.equals(this.august, form1099K.august) &&
        Objects.equals(this.sept, form1099K.sept) &&
        Objects.equals(this.october, form1099K.october) &&
        Objects.equals(this.november, form1099K.november) &&
        Objects.equals(this.december, form1099K.december) &&
        Objects.equals(this.id, form1099K.id) &&
        Objects.equals(this.type, form1099K.type) &&
        Objects.equals(this.issuerId, form1099K.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099K.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099K.issuerTin) &&
        Objects.equals(this.taxYear, form1099K.taxYear) &&
        Objects.equals(this.federalEfile, form1099K.federalEfile) &&
        Objects.equals(this.federalEfileStatus, form1099K.federalEfileStatus) &&
        Objects.equals(this.stateEfile, form1099K.stateEfile) &&
        Objects.equals(this.stateEfileStatus, form1099K.stateEfileStatus) &&
        Objects.equals(this.postalMail, form1099K.postalMail) &&
        Objects.equals(this.postalMailStatus, form1099K.postalMailStatus) &&
        Objects.equals(this.tinMatch, form1099K.tinMatch) &&
        Objects.equals(this.tinMatchStatus, form1099K.tinMatchStatus) &&
        Objects.equals(this.addressVerification, form1099K.addressVerification) &&
        Objects.equals(this.addressVerificationStatus, form1099K.addressVerificationStatus) &&
        Objects.equals(this.referenceId, form1099K.referenceId) &&
        Objects.equals(this.email, form1099K.email) &&
        Objects.equals(this.typeOfTin, form1099K.typeOfTin) &&
        Objects.equals(this.tin, form1099K.tin) &&
        Objects.equals(this.firstPayeeName, form1099K.firstPayeeName) &&
        Objects.equals(this.secondPayeeName, form1099K.secondPayeeName) &&
        Objects.equals(this.address, form1099K.address) &&
        Objects.equals(this.addressRecipientSecond, form1099K.addressRecipientSecond) &&
        Objects.equals(this.city, form1099K.city) &&
        Objects.equals(this.state, form1099K.state) &&
        Objects.equals(this.zip, form1099K.zip) &&
        Objects.equals(this.foreignProvince, form1099K.foreignProvince) &&
        Objects.equals(this.countryCode, form1099K.countryCode) &&
        Objects.equals(this.validationErrors, form1099K.validationErrors) &&
        Objects.equals(this.createdAt, form1099K.createdAt) &&
        Objects.equals(this.updatedAt, form1099K.updatedAt) &&
        Objects.equals(this.stateAndLocalWithholding, form1099K.stateAndLocalWithholding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(filerType, paymentType, paymentSettlementEntityNamePhoneNumber, grossAmountPaymentCard, cardNotPresentTransactions, merchantCategoryCode, paymentTransactionNumber, federalIncomeTaxWithheld, january, february, march, april, may, june, july, august, sept, october, november, december, id, type, issuerId, issuerReferenceId, issuerTin, taxYear, federalEfile, federalEfileStatus, stateEfile, stateEfileStatus, postalMail, postalMailStatus, tinMatch, tinMatchStatus, addressVerification, addressVerificationStatus, referenceId, email, typeOfTin, tin, firstPayeeName, secondPayeeName, address, addressRecipientSecond, city, state, zip, foreignProvince, countryCode, validationErrors, createdAt, updatedAt, stateAndLocalWithholding);
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
    sb.append("class Form1099K {\n");
    sb.append("    filerType: ").append(toIndentedString(filerType)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentSettlementEntityNamePhoneNumber: ").append(toIndentedString(paymentSettlementEntityNamePhoneNumber)).append("\n");
    sb.append("    grossAmountPaymentCard: ").append(toIndentedString(grossAmountPaymentCard)).append("\n");
    sb.append("    cardNotPresentTransactions: ").append(toIndentedString(cardNotPresentTransactions)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    paymentTransactionNumber: ").append(toIndentedString(paymentTransactionNumber)).append("\n");
    sb.append("    federalIncomeTaxWithheld: ").append(toIndentedString(federalIncomeTaxWithheld)).append("\n");
    sb.append("    january: ").append(toIndentedString(january)).append("\n");
    sb.append("    february: ").append(toIndentedString(february)).append("\n");
    sb.append("    march: ").append(toIndentedString(march)).append("\n");
    sb.append("    april: ").append(toIndentedString(april)).append("\n");
    sb.append("    may: ").append(toIndentedString(may)).append("\n");
    sb.append("    june: ").append(toIndentedString(june)).append("\n");
    sb.append("    july: ").append(toIndentedString(july)).append("\n");
    sb.append("    august: ").append(toIndentedString(august)).append("\n");
    sb.append("    sept: ").append(toIndentedString(sept)).append("\n");
    sb.append("    october: ").append(toIndentedString(october)).append("\n");
    sb.append("    november: ").append(toIndentedString(november)).append("\n");
    sb.append("    december: ").append(toIndentedString(december)).append("\n");
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
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    typeOfTin: ").append(toIndentedString(typeOfTin)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    firstPayeeName: ").append(toIndentedString(firstPayeeName)).append("\n");
    sb.append("    secondPayeeName: ").append(toIndentedString(secondPayeeName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressRecipientSecond: ").append(toIndentedString(addressRecipientSecond)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    foreignProvince: ").append(toIndentedString(foreignProvince)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("referenceId");
    openapiFields.add("email");
    openapiFields.add("typeOfTin");
    openapiFields.add("tin");
    openapiFields.add("firstPayeeName");
    openapiFields.add("secondPayeeName");
    openapiFields.add("address");
    openapiFields.add("addressRecipientSecond");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("foreignProvince");
    openapiFields.add("countryCode");
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
   * @throws IOException if the JSON Element is invalid with respect to Form1099K
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099K.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099K is not found in the empty JSON string", Form1099K.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099K.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099K` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("filerType") != null && !jsonObj.get("filerType").isJsonNull()) && !jsonObj.get("filerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filerType").toString()));
      }
      // validate the optional field `filerType`
      if (jsonObj.get("filerType") != null && !jsonObj.get("filerType").isJsonNull()) {
        FilerTypeEnum.validateJsonElement(jsonObj.get("filerType"));
      }
      if ((jsonObj.get("paymentType") != null && !jsonObj.get("paymentType").isJsonNull()) && !jsonObj.get("paymentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentType").toString()));
      }
      // validate the optional field `paymentType`
      if (jsonObj.get("paymentType") != null && !jsonObj.get("paymentType").isJsonNull()) {
        PaymentTypeEnum.validateJsonElement(jsonObj.get("paymentType"));
      }
      if ((jsonObj.get("paymentSettlementEntityNamePhoneNumber") != null && !jsonObj.get("paymentSettlementEntityNamePhoneNumber").isJsonNull()) && !jsonObj.get("paymentSettlementEntityNamePhoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentSettlementEntityNamePhoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentSettlementEntityNamePhoneNumber").toString()));
      }
      if ((jsonObj.get("merchantCategoryCode") != null && !jsonObj.get("merchantCategoryCode").isJsonNull()) && !jsonObj.get("merchantCategoryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantCategoryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantCategoryCode").toString()));
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
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("typeOfTin") != null && !jsonObj.get("typeOfTin").isJsonNull()) && !jsonObj.get("typeOfTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeOfTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeOfTin").toString()));
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("firstPayeeName") != null && !jsonObj.get("firstPayeeName").isJsonNull()) && !jsonObj.get("firstPayeeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstPayeeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstPayeeName").toString()));
      }
      if ((jsonObj.get("secondPayeeName") != null && !jsonObj.get("secondPayeeName").isJsonNull()) && !jsonObj.get("secondPayeeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondPayeeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondPayeeName").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("addressRecipientSecond") != null && !jsonObj.get("addressRecipientSecond").isJsonNull()) && !jsonObj.get("addressRecipientSecond").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressRecipientSecond` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressRecipientSecond").toString()));
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
      if ((jsonObj.get("foreignProvince") != null && !jsonObj.get("foreignProvince").isJsonNull()) && !jsonObj.get("foreignProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignProvince").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
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
       if (!Form1099K.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099K' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099K> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099K.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099K>() {
           @Override
           public void write(JsonWriter out, Form1099K value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099K read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099K given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099K
   * @throws IOException if the JSON string is invalid with respect to Form1099K
   */
  public static Form1099K fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099K.class);
  }

  /**
   * Convert an instance of Form1099K to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

