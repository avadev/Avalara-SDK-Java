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
 * Form1099KListItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099KListItem {
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

  public static final String SERIALIZED_NAME_ISSUER_REFERENCE_ID = "issuerReferenceId";
  @SerializedName(SERIALIZED_NAME_ISSUER_REFERENCE_ID)
  private String issuerReferenceId;

  public static final String SERIALIZED_NAME_ISSUER_TIN = "issuerTin";
  @SerializedName(SERIALIZED_NAME_ISSUER_TIN)
  private String issuerTin;

  public static final String SERIALIZED_NAME_TAX_YEAR = "taxYear";
  @SerializedName(SERIALIZED_NAME_TAX_YEAR)
  private Integer taxYear;

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

  public Form1099KListItem() {
  }

  public Form1099KListItem filerType(FilerTypeEnum filerType) {
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


  public Form1099KListItem paymentType(PaymentTypeEnum paymentType) {
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


  public Form1099KListItem paymentSettlementEntityNamePhoneNumber(String paymentSettlementEntityNamePhoneNumber) {
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


  public Form1099KListItem grossAmountPaymentCard(Double grossAmountPaymentCard) {
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


  public Form1099KListItem cardNotPresentTransactions(Double cardNotPresentTransactions) {
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


  public Form1099KListItem merchantCategoryCode(String merchantCategoryCode) {
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


  public Form1099KListItem paymentTransactionNumber(Double paymentTransactionNumber) {
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


  public Form1099KListItem federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
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


  public Form1099KListItem january(Double january) {
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


  public Form1099KListItem february(Double february) {
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


  public Form1099KListItem march(Double march) {
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


  public Form1099KListItem april(Double april) {
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


  public Form1099KListItem may(Double may) {
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


  public Form1099KListItem june(Double june) {
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


  public Form1099KListItem july(Double july) {
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


  public Form1099KListItem august(Double august) {
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


  public Form1099KListItem sept(Double sept) {
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


  public Form1099KListItem october(Double october) {
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


  public Form1099KListItem november(Double november) {
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


  public Form1099KListItem december(Double december) {
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


  public Form1099KListItem issuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
    return this;
  }

  /**
   * Issuer Reference ID. One of &#x60;issuerReferenceId&#x60; or &#x60;issuerTin&#x60; is required.
   * @return issuerReferenceId
   */
  @javax.annotation.Nullable
  public String getIssuerReferenceId() {
    return issuerReferenceId;
  }

  public void setIssuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
  }


  public Form1099KListItem issuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
    return this;
  }

  /**
   * Issuer TIN. One of &#x60;issuerReferenceId&#x60; or &#x60;issuerTin&#x60; is required.
   * @return issuerTin
   */
  @javax.annotation.Nullable
  public String getIssuerTin() {
    return issuerTin;
  }

  public void setIssuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
  }


  public Form1099KListItem taxYear(Integer taxYear) {
    this.taxYear = taxYear;
    return this;
  }

  /**
   * Tax year
   * @return taxYear
   */
  @javax.annotation.Nonnull
  public Integer getTaxYear() {
    return taxYear;
  }

  public void setTaxYear(Integer taxYear) {
    this.taxYear = taxYear;
  }


  public Form1099KListItem issuerId(String issuerId) {
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


  public Form1099KListItem referenceId(String referenceId) {
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


  public Form1099KListItem recipientTin(String recipientTin) {
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


  public Form1099KListItem recipientName(String recipientName) {
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


  public Form1099KListItem tinType(TinTypeEnum tinType) {
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


  public Form1099KListItem recipientSecondName(String recipientSecondName) {
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


  public Form1099KListItem address(String address) {
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


  public Form1099KListItem address2(String address2) {
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


  public Form1099KListItem city(String city) {
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


  public Form1099KListItem state(String state) {
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


  public Form1099KListItem zip(String zip) {
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


  public Form1099KListItem email(String email) {
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


  public Form1099KListItem accountNumber(String accountNumber) {
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


  public Form1099KListItem officeCode(String officeCode) {
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


  public Form1099KListItem nonUsProvince(String nonUsProvince) {
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


  public Form1099KListItem countryCode(String countryCode) {
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


  public Form1099KListItem federalEFile(Boolean federalEFile) {
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


  public Form1099KListItem postalMail(Boolean postalMail) {
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


  public Form1099KListItem stateEFile(Boolean stateEFile) {
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


  public Form1099KListItem tinMatch(Boolean tinMatch) {
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


  public Form1099KListItem noTin(Boolean noTin) {
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


  public Form1099KListItem secondTinNotice(Boolean secondTinNotice) {
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


  public Form1099KListItem addressVerification(Boolean addressVerification) {
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


  public Form1099KListItem stateAndLocalWithholding(StateAndLocalWithholdingRequest stateAndLocalWithholding) {
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
    Form1099KListItem form1099KListItem = (Form1099KListItem) o;
    return Objects.equals(this.filerType, form1099KListItem.filerType) &&
        Objects.equals(this.paymentType, form1099KListItem.paymentType) &&
        Objects.equals(this.paymentSettlementEntityNamePhoneNumber, form1099KListItem.paymentSettlementEntityNamePhoneNumber) &&
        Objects.equals(this.grossAmountPaymentCard, form1099KListItem.grossAmountPaymentCard) &&
        Objects.equals(this.cardNotPresentTransactions, form1099KListItem.cardNotPresentTransactions) &&
        Objects.equals(this.merchantCategoryCode, form1099KListItem.merchantCategoryCode) &&
        Objects.equals(this.paymentTransactionNumber, form1099KListItem.paymentTransactionNumber) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099KListItem.federalIncomeTaxWithheld) &&
        Objects.equals(this.january, form1099KListItem.january) &&
        Objects.equals(this.february, form1099KListItem.february) &&
        Objects.equals(this.march, form1099KListItem.march) &&
        Objects.equals(this.april, form1099KListItem.april) &&
        Objects.equals(this.may, form1099KListItem.may) &&
        Objects.equals(this.june, form1099KListItem.june) &&
        Objects.equals(this.july, form1099KListItem.july) &&
        Objects.equals(this.august, form1099KListItem.august) &&
        Objects.equals(this.sept, form1099KListItem.sept) &&
        Objects.equals(this.october, form1099KListItem.october) &&
        Objects.equals(this.november, form1099KListItem.november) &&
        Objects.equals(this.december, form1099KListItem.december) &&
        Objects.equals(this.issuerReferenceId, form1099KListItem.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099KListItem.issuerTin) &&
        Objects.equals(this.taxYear, form1099KListItem.taxYear) &&
        Objects.equals(this.issuerId, form1099KListItem.issuerId) &&
        Objects.equals(this.referenceId, form1099KListItem.referenceId) &&
        Objects.equals(this.recipientTin, form1099KListItem.recipientTin) &&
        Objects.equals(this.recipientName, form1099KListItem.recipientName) &&
        Objects.equals(this.tinType, form1099KListItem.tinType) &&
        Objects.equals(this.recipientSecondName, form1099KListItem.recipientSecondName) &&
        Objects.equals(this.address, form1099KListItem.address) &&
        Objects.equals(this.address2, form1099KListItem.address2) &&
        Objects.equals(this.city, form1099KListItem.city) &&
        Objects.equals(this.state, form1099KListItem.state) &&
        Objects.equals(this.zip, form1099KListItem.zip) &&
        Objects.equals(this.email, form1099KListItem.email) &&
        Objects.equals(this.accountNumber, form1099KListItem.accountNumber) &&
        Objects.equals(this.officeCode, form1099KListItem.officeCode) &&
        Objects.equals(this.nonUsProvince, form1099KListItem.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099KListItem.countryCode) &&
        Objects.equals(this.federalEFile, form1099KListItem.federalEFile) &&
        Objects.equals(this.postalMail, form1099KListItem.postalMail) &&
        Objects.equals(this.stateEFile, form1099KListItem.stateEFile) &&
        Objects.equals(this.tinMatch, form1099KListItem.tinMatch) &&
        Objects.equals(this.noTin, form1099KListItem.noTin) &&
        Objects.equals(this.secondTinNotice, form1099KListItem.secondTinNotice) &&
        Objects.equals(this.addressVerification, form1099KListItem.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form1099KListItem.stateAndLocalWithholding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(filerType, paymentType, paymentSettlementEntityNamePhoneNumber, grossAmountPaymentCard, cardNotPresentTransactions, merchantCategoryCode, paymentTransactionNumber, federalIncomeTaxWithheld, january, february, march, april, may, june, july, august, sept, october, november, december, issuerReferenceId, issuerTin, taxYear, issuerId, referenceId, recipientTin, recipientName, tinType, recipientSecondName, address, address2, city, state, zip, email, accountNumber, officeCode, nonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, noTin, secondTinNotice, addressVerification, stateAndLocalWithholding);
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
    sb.append("class Form1099KListItem {\n");
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
    sb.append("    issuerReferenceId: ").append(toIndentedString(issuerReferenceId)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
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
    openapiFields.add("issuerReferenceId");
    openapiFields.add("issuerTin");
    openapiFields.add("taxYear");
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
    openapiRequiredFields.add("taxYear");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("countryCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1099KListItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099KListItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099KListItem is not found in the empty JSON string", Form1099KListItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099KListItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099KListItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1099KListItem.openapiRequiredFields) {
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
      if ((jsonObj.get("issuerReferenceId") != null && !jsonObj.get("issuerReferenceId").isJsonNull()) && !jsonObj.get("issuerReferenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerReferenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerReferenceId").toString()));
      }
      if ((jsonObj.get("issuerTin") != null && !jsonObj.get("issuerTin").isJsonNull()) && !jsonObj.get("issuerTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerTin").toString()));
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
       if (!Form1099KListItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099KListItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099KListItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099KListItem.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099KListItem>() {
           @Override
           public void write(JsonWriter out, Form1099KListItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099KListItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099KListItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099KListItem
   * @throws IOException if the JSON string is invalid with respect to Form1099KListItem
   */
  public static Form1099KListItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099KListItem.class);
  }

  /**
   * Convert an instance of Form1099KListItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

