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
 * Form1099KListItemResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099KListItemResponse {
  /**
   * Filer type (PSE or EPF)
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
   * Payment type (payment card or third party network)
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

  public Form1099KListItemResponse() {
  }

  public Form1099KListItemResponse(
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

  public Form1099KListItemResponse filerType(FilerTypeEnum filerType) {
    this.filerType = filerType;
    return this;
  }

  /**
   * Filer type (PSE or EPF)
   * @return filerType
   */
  @javax.annotation.Nullable
  public FilerTypeEnum getFilerType() {
    return filerType;
  }

  public void setFilerType(FilerTypeEnum filerType) {
    this.filerType = filerType;
  }


  public Form1099KListItemResponse paymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Payment type (payment card or third party network)
   * @return paymentType
   */
  @javax.annotation.Nullable
  public PaymentTypeEnum getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentTypeEnum paymentType) {
    this.paymentType = paymentType;
  }


  public Form1099KListItemResponse paymentSettlementEntityNamePhoneNumber(String paymentSettlementEntityNamePhoneNumber) {
    this.paymentSettlementEntityNamePhoneNumber = paymentSettlementEntityNamePhoneNumber;
    return this;
  }

  /**
   * Payment settlement entity name and phone number
   * @return paymentSettlementEntityNamePhoneNumber
   */
  @javax.annotation.Nullable
  public String getPaymentSettlementEntityNamePhoneNumber() {
    return paymentSettlementEntityNamePhoneNumber;
  }

  public void setPaymentSettlementEntityNamePhoneNumber(String paymentSettlementEntityNamePhoneNumber) {
    this.paymentSettlementEntityNamePhoneNumber = paymentSettlementEntityNamePhoneNumber;
  }


  public Form1099KListItemResponse grossAmountPaymentCard(Double grossAmountPaymentCard) {
    this.grossAmountPaymentCard = grossAmountPaymentCard;
    return this;
  }

  /**
   * Gross amount of payment card/third party network transactions
   * @return grossAmountPaymentCard
   */
  @javax.annotation.Nullable
  public Double getGrossAmountPaymentCard() {
    return grossAmountPaymentCard;
  }

  public void setGrossAmountPaymentCard(Double grossAmountPaymentCard) {
    this.grossAmountPaymentCard = grossAmountPaymentCard;
  }


  public Form1099KListItemResponse cardNotPresentTransactions(Double cardNotPresentTransactions) {
    this.cardNotPresentTransactions = cardNotPresentTransactions;
    return this;
  }

  /**
   * Card not present transactions
   * @return cardNotPresentTransactions
   */
  @javax.annotation.Nullable
  public Double getCardNotPresentTransactions() {
    return cardNotPresentTransactions;
  }

  public void setCardNotPresentTransactions(Double cardNotPresentTransactions) {
    this.cardNotPresentTransactions = cardNotPresentTransactions;
  }


  public Form1099KListItemResponse merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * Merchant category code
   * @return merchantCategoryCode
   */
  @javax.annotation.Nullable
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  public Form1099KListItemResponse paymentTransactionNumber(Double paymentTransactionNumber) {
    this.paymentTransactionNumber = paymentTransactionNumber;
    return this;
  }

  /**
   * Number of payment transactions
   * @return paymentTransactionNumber
   */
  @javax.annotation.Nullable
  public Double getPaymentTransactionNumber() {
    return paymentTransactionNumber;
  }

  public void setPaymentTransactionNumber(Double paymentTransactionNumber) {
    this.paymentTransactionNumber = paymentTransactionNumber;
  }


  public Form1099KListItemResponse federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
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


  public Form1099KListItemResponse january(Double january) {
    this.january = january;
    return this;
  }

  /**
   * January gross payments
   * @return january
   */
  @javax.annotation.Nullable
  public Double getJanuary() {
    return january;
  }

  public void setJanuary(Double january) {
    this.january = january;
  }


  public Form1099KListItemResponse february(Double february) {
    this.february = february;
    return this;
  }

  /**
   * February gross payments
   * @return february
   */
  @javax.annotation.Nullable
  public Double getFebruary() {
    return february;
  }

  public void setFebruary(Double february) {
    this.february = february;
  }


  public Form1099KListItemResponse march(Double march) {
    this.march = march;
    return this;
  }

  /**
   * March gross payments
   * @return march
   */
  @javax.annotation.Nullable
  public Double getMarch() {
    return march;
  }

  public void setMarch(Double march) {
    this.march = march;
  }


  public Form1099KListItemResponse april(Double april) {
    this.april = april;
    return this;
  }

  /**
   * April gross payments
   * @return april
   */
  @javax.annotation.Nullable
  public Double getApril() {
    return april;
  }

  public void setApril(Double april) {
    this.april = april;
  }


  public Form1099KListItemResponse may(Double may) {
    this.may = may;
    return this;
  }

  /**
   * May gross payments
   * @return may
   */
  @javax.annotation.Nullable
  public Double getMay() {
    return may;
  }

  public void setMay(Double may) {
    this.may = may;
  }


  public Form1099KListItemResponse june(Double june) {
    this.june = june;
    return this;
  }

  /**
   * June gross payments
   * @return june
   */
  @javax.annotation.Nullable
  public Double getJune() {
    return june;
  }

  public void setJune(Double june) {
    this.june = june;
  }


  public Form1099KListItemResponse july(Double july) {
    this.july = july;
    return this;
  }

  /**
   * July gross payments
   * @return july
   */
  @javax.annotation.Nullable
  public Double getJuly() {
    return july;
  }

  public void setJuly(Double july) {
    this.july = july;
  }


  public Form1099KListItemResponse august(Double august) {
    this.august = august;
    return this;
  }

  /**
   * August gross payments
   * @return august
   */
  @javax.annotation.Nullable
  public Double getAugust() {
    return august;
  }

  public void setAugust(Double august) {
    this.august = august;
  }


  public Form1099KListItemResponse sept(Double sept) {
    this.sept = sept;
    return this;
  }

  /**
   * September gross payments
   * @return sept
   */
  @javax.annotation.Nullable
  public Double getSept() {
    return sept;
  }

  public void setSept(Double sept) {
    this.sept = sept;
  }


  public Form1099KListItemResponse october(Double october) {
    this.october = october;
    return this;
  }

  /**
   * October gross payments
   * @return october
   */
  @javax.annotation.Nullable
  public Double getOctober() {
    return october;
  }

  public void setOctober(Double october) {
    this.october = october;
  }


  public Form1099KListItemResponse november(Double november) {
    this.november = november;
    return this;
  }

  /**
   * November gross payments
   * @return november
   */
  @javax.annotation.Nullable
  public Double getNovember() {
    return november;
  }

  public void setNovember(Double november) {
    this.november = november;
  }


  public Form1099KListItemResponse december(Double december) {
    this.december = december;
    return this;
  }

  /**
   * December gross payments
   * @return december
   */
  @javax.annotation.Nullable
  public Double getDecember() {
    return december;
  }

  public void setDecember(Double december) {
    this.december = december;
  }


  /**
   * ID of the form
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }



  public Form1099KListItemResponse type(String type) {
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


  public Form1099KListItemResponse issuerId(Integer issuerId) {
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


  public Form1099KListItemResponse issuerReferenceId(String issuerReferenceId) {
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


  public Form1099KListItemResponse issuerTin(String issuerTin) {
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


  public Form1099KListItemResponse taxYear(Integer taxYear) {
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


  public Form1099KListItemResponse federalEfile(Boolean federalEfile) {
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



  public Form1099KListItemResponse stateEfile(Boolean stateEfile) {
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



  public Form1099KListItemResponse postalMail(Boolean postalMail) {
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



  public Form1099KListItemResponse tinMatch(Boolean tinMatch) {
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



  public Form1099KListItemResponse addressVerification(Boolean addressVerification) {
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



  public Form1099KListItemResponse referenceId(String referenceId) {
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


  public Form1099KListItemResponse email(String email) {
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


  public Form1099KListItemResponse tinType(String tinType) {
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


  public Form1099KListItemResponse tin(String tin) {
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


  public Form1099KListItemResponse noTin(Boolean noTin) {
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


  public Form1099KListItemResponse secondTinNotice(Boolean secondTinNotice) {
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


  public Form1099KListItemResponse recipientName(String recipientName) {
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


  public Form1099KListItemResponse recipientSecondName(String recipientSecondName) {
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


  public Form1099KListItemResponse address(String address) {
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


  public Form1099KListItemResponse address2(String address2) {
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


  public Form1099KListItemResponse city(String city) {
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


  public Form1099KListItemResponse state(String state) {
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


  public Form1099KListItemResponse zip(String zip) {
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


  public Form1099KListItemResponse nonUsProvince(String nonUsProvince) {
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


  public Form1099KListItemResponse countryCode(String countryCode) {
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


  public Form1099KListItemResponse accountNumber(String accountNumber) {
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


  public Form1099KListItemResponse officeCode(String officeCode) {
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


  public Form1099KListItemResponse fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
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



  public Form1099KListItemResponse stateAndLocalWithholding(StateAndLocalWithholdingResponse stateAndLocalWithholding) {
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
    Form1099KListItemResponse form1099KListItemResponse = (Form1099KListItemResponse) o;
    return Objects.equals(this.filerType, form1099KListItemResponse.filerType) &&
        Objects.equals(this.paymentType, form1099KListItemResponse.paymentType) &&
        Objects.equals(this.paymentSettlementEntityNamePhoneNumber, form1099KListItemResponse.paymentSettlementEntityNamePhoneNumber) &&
        Objects.equals(this.grossAmountPaymentCard, form1099KListItemResponse.grossAmountPaymentCard) &&
        Objects.equals(this.cardNotPresentTransactions, form1099KListItemResponse.cardNotPresentTransactions) &&
        Objects.equals(this.merchantCategoryCode, form1099KListItemResponse.merchantCategoryCode) &&
        Objects.equals(this.paymentTransactionNumber, form1099KListItemResponse.paymentTransactionNumber) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099KListItemResponse.federalIncomeTaxWithheld) &&
        Objects.equals(this.january, form1099KListItemResponse.january) &&
        Objects.equals(this.february, form1099KListItemResponse.february) &&
        Objects.equals(this.march, form1099KListItemResponse.march) &&
        Objects.equals(this.april, form1099KListItemResponse.april) &&
        Objects.equals(this.may, form1099KListItemResponse.may) &&
        Objects.equals(this.june, form1099KListItemResponse.june) &&
        Objects.equals(this.july, form1099KListItemResponse.july) &&
        Objects.equals(this.august, form1099KListItemResponse.august) &&
        Objects.equals(this.sept, form1099KListItemResponse.sept) &&
        Objects.equals(this.october, form1099KListItemResponse.october) &&
        Objects.equals(this.november, form1099KListItemResponse.november) &&
        Objects.equals(this.december, form1099KListItemResponse.december) &&
        Objects.equals(this.id, form1099KListItemResponse.id) &&
        Objects.equals(this.type, form1099KListItemResponse.type) &&
        Objects.equals(this.issuerId, form1099KListItemResponse.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099KListItemResponse.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099KListItemResponse.issuerTin) &&
        Objects.equals(this.taxYear, form1099KListItemResponse.taxYear) &&
        Objects.equals(this.federalEfile, form1099KListItemResponse.federalEfile) &&
        Objects.equals(this.federalEfileStatus, form1099KListItemResponse.federalEfileStatus) &&
        Objects.equals(this.stateEfile, form1099KListItemResponse.stateEfile) &&
        Objects.equals(this.stateEfileStatus, form1099KListItemResponse.stateEfileStatus) &&
        Objects.equals(this.postalMail, form1099KListItemResponse.postalMail) &&
        Objects.equals(this.postalMailStatus, form1099KListItemResponse.postalMailStatus) &&
        Objects.equals(this.tinMatch, form1099KListItemResponse.tinMatch) &&
        Objects.equals(this.tinMatchStatus, form1099KListItemResponse.tinMatchStatus) &&
        Objects.equals(this.addressVerification, form1099KListItemResponse.addressVerification) &&
        Objects.equals(this.addressVerificationStatus, form1099KListItemResponse.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form1099KListItemResponse.eDeliveryStatus) &&
        Objects.equals(this.referenceId, form1099KListItemResponse.referenceId) &&
        Objects.equals(this.email, form1099KListItemResponse.email) &&
        Objects.equals(this.tinType, form1099KListItemResponse.tinType) &&
        Objects.equals(this.tin, form1099KListItemResponse.tin) &&
        Objects.equals(this.noTin, form1099KListItemResponse.noTin) &&
        Objects.equals(this.secondTinNotice, form1099KListItemResponse.secondTinNotice) &&
        Objects.equals(this.recipientName, form1099KListItemResponse.recipientName) &&
        Objects.equals(this.recipientSecondName, form1099KListItemResponse.recipientSecondName) &&
        Objects.equals(this.address, form1099KListItemResponse.address) &&
        Objects.equals(this.address2, form1099KListItemResponse.address2) &&
        Objects.equals(this.city, form1099KListItemResponse.city) &&
        Objects.equals(this.state, form1099KListItemResponse.state) &&
        Objects.equals(this.zip, form1099KListItemResponse.zip) &&
        Objects.equals(this.nonUsProvince, form1099KListItemResponse.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099KListItemResponse.countryCode) &&
        Objects.equals(this.accountNumber, form1099KListItemResponse.accountNumber) &&
        Objects.equals(this.officeCode, form1099KListItemResponse.officeCode) &&
        Objects.equals(this.fatcaFilingRequirement, form1099KListItemResponse.fatcaFilingRequirement) &&
        Objects.equals(this.validationErrors, form1099KListItemResponse.validationErrors) &&
        Objects.equals(this.createdAt, form1099KListItemResponse.createdAt) &&
        Objects.equals(this.updatedAt, form1099KListItemResponse.updatedAt) &&
        Objects.equals(this.stateAndLocalWithholding, form1099KListItemResponse.stateAndLocalWithholding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(filerType, paymentType, paymentSettlementEntityNamePhoneNumber, grossAmountPaymentCard, cardNotPresentTransactions, merchantCategoryCode, paymentTransactionNumber, federalIncomeTaxWithheld, january, february, march, april, may, june, july, august, sept, october, november, december, id, type, issuerId, issuerReferenceId, issuerTin, taxYear, federalEfile, federalEfileStatus, stateEfile, stateEfileStatus, postalMail, postalMailStatus, tinMatch, tinMatchStatus, addressVerification, addressVerificationStatus, eDeliveryStatus, referenceId, email, tinType, tin, noTin, secondTinNotice, recipientName, recipientSecondName, address, address2, city, state, zip, nonUsProvince, countryCode, accountNumber, officeCode, fatcaFilingRequirement, validationErrors, createdAt, updatedAt, stateAndLocalWithholding);
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
    sb.append("class Form1099KListItemResponse {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to Form1099KListItemResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099KListItemResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099KListItemResponse is not found in the empty JSON string", Form1099KListItemResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099KListItemResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099KListItemResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1099KListItemResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
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
       if (!Form1099KListItemResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099KListItemResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099KListItemResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099KListItemResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099KListItemResponse>() {
           @Override
           public void write(JsonWriter out, Form1099KListItemResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099KListItemResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099KListItemResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099KListItemResponse
   * @throws IOException if the JSON string is invalid with respect to Form1099KListItemResponse
   */
  public static Form1099KListItemResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099KListItemResponse.class);
  }

  /**
   * Convert an instance of Form1099KListItemResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

