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
 * > **Note:** You must have an active Avalara 1099 & W-9 subscription to authenticate and use these APIs. If you don't have a subscription, please contact our [Sales team](https://www.avalara.com/us/en/products/1099/request-a-demo.html).  ## Authentication  The Avalara 1099 & W-9 API uses **Bearer Token Authentication**. To authenticate, acquire a bearer token using a **Client ID** and **Client Secret** that you generate in the Avalara 1099 & W-9 web application.  The sample cURL commands below use **production** URLs. For **sandbox**, replace them with the sandbox URLs listed in the Sandbox Environment table.  ### Option 1 — Client ID and Client Secret (recommended)  **Step 1: Create API credentials in the Avalara 1099 & W-9 web app**  For a full walkthrough, see the [Avalara 1099 & W-9 integration guide](https://developer.avalara.com/products/avalara-1099-and-w9/integration-guides/1099-and-w-9/siu2796410674799/).  > **Note:** To enable credential creation you must first enter a valid company address in **Account Settings > Account** and enable two-factor authentication in **Account Settings > Security**.  1. In Avalara 1099 & W-9, open **Account Settings** (gear icon, top-right of any page) and select **API**. 2. Click **Create new credentials** (a valid company address and 2FA are required). 3. Copy your **Client Id** and **Client Secret** securely — they will not be shown again after you leave the screen.  **Step 2: Request a bearer token**  ```bash curl -X POST 'https://identity.avalara.com/connect/token' \\   --header 'Content-Type: application/x-www-form-urlencoded' \\   --data-urlencode 'grant_type=client_credentials' \\   --data-urlencode 'client_id={{client_id}}' \\   --data-urlencode 'client_secret={{client_secret}}' ```  ### Option 2 — Account ID and License Key  If your organization already uses other Avalara products (AvaTax, CertCapture) and has access to the logged-in area of Avalara.com, you can generate the bearer token using your **Account ID** and **License Key**.  > **Note:** If you already have a license key for other Avalara products you can reuse it. Generating a new key will reset any previously created key.  1. Log in to Avalara.com. 2. Go to **Settings → License and API Keys**. 3. Click **Generate New Key**. 4. Note your **Account ID** from the Account menu.  ```bash curl -X POST 'https://identity.avalara.com/connect/token' \\   --header 'Content-Type: application/x-www-form-urlencoded' \\   --data-urlencode 'grant_type=client_credentials' \\   --data-urlencode 'client_id={{accountId}}' \\   --data-urlencode 'client_secret={{licenseKey}}' ```  ### Using and renewing the bearer token  Include the token in the `Authorization` header on every request:  ```http Authorization: Bearer {access_token} ```  Tokens expire after the number of seconds in the `expires_in` field of the token response. Your integration must renew the token before it expires.  **Example token response**  ```json {   \"access_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI...\",   \"expires_in\": 3600,   \"token_type\": \"Bearer\",   \"scope\": \"avatax_api iam-ds\" } ```  ### Sandbox Environment  Use the same steps as production, replacing the base URLs:  | Purpose | Production | Sandbox | | --- | --- | --- | | Account & License Key management (web) | `https://www.avalara.com` | `https://sandbox.admin.avalara.com` | | Account & License Key management (API) | `https://rest.avatax.com` | `https://sandbox-rest.avatax.com` | | Token generation | `https://identity.avalara.com` | `https://ai-sbx.avlr.sh` |  ## Environments  #### Production - **Avalara 1099 API URL:** [`https://api.avalara.com/avalara1099`](https://api.avalara.com/avalara1099) - **Identity Token URL:** [`https://identity.avalara.com/connect/token`](https://identity.avalara.com/connect/token)  #### Sandbox - **Avalara 1099 API URL:** [`https://api.sbx.avalara.com/avalara1099`](https://api.sbx.avalara.com/avalara1099) - **Identity Token URL:** [`https://ai-sbx.avlr.sh/connect/token`](https://ai-sbx.avlr.sh/connect/token)  ---  ## API & SDK Documentation  [Avalara 1099 API Reference](https://developer.avalara.com/api-reference/avalara1099/avalara1099/)  [Avalara SDKs](https://developer.avalara.com/sdk/)  [Swagger](https://api.avalara.com/avalara1099/swagger/index.html?api-version=2.0)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import Avalara.SDK.model.A1099.V2.FederalEfileStatusDetail;
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
import java.time.LocalDate;
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
 * Form 1099-B: Proceeds From Broker and Barter Exchange Transactions                The recipient is the customer and the issuer is the broker or barter exchange. Each form reports one sale.                *Required:* &#x60;applicableCheckboxOnForm8949&#x60;, &#x60;descriptionOfProperty&#x60;, &#x60;proceeds&#x60; (which can be zero or negative) and  &#x60;proceedsReportedToIrs&#x60;. &#x60;typeOfGainOrLoss&#x60; is required unless &#x60;noncoveredSecurity&#x60; is &#x60;true&#x60;.                &#x60;dateSoldOrDisposed&#x60; must fall in the tax year. &#x60;dateAcquired&#x60; can&#39;t be after the tax year or before January 1 of the  year 50 years before the current filing year, whatever the form&#39;s tax year. &#x60;costOrOtherBasis&#x60;,  &#x60;washSaleLossDisallowed&#x60; and &#x60;federalIncomeTaxWithheld&#x60; can&#39;t be negative; the other amounts can.  &#x60;federalIncomeTaxWithheld&#x60; must be less than &#x60;proceeds&#x60; (zero when &#x60;proceeds&#x60; is zero or negative), and can&#39;t be more  than 24% of the other amounts on the form combined, not counting state and local withholding.                &#x60;stateAndLocalWithholding&#x60; carries &#x60;state&#x60;, &#x60;stateId&#x60;, &#x60;stateTaxWithheld&#x60;, &#x60;locality&#x60;, &#x60;localityId&#x60; and  &#x60;localTaxWithheld&#x60;. &#x60;state&#x60; and &#x60;stateId&#x60; are required when &#x60;stateTaxWithheld&#x60; has an amount. Form 1099-B has no state  or local income fields, so &#x60;stateIncome&#x60; and &#x60;localIncome&#x60; are discarded and read back as &#x60;null&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099B {
  /**
   * Applicable checkbox on Form 8949.                * &#x60;A&#x60; - Short-term transaction, basis reported to the IRS  * &#x60;B&#x60; - Short-term transaction, basis not reported to the IRS  * &#x60;D&#x60; - Long-term transaction, basis reported to the IRS  * &#x60;E&#x60; - Long-term transaction, basis not reported to the IRS  * &#x60;X&#x60; - Basis not reported to the IRS and the holding period is unknown
   */
  @JsonAdapter(ApplicableCheckboxOnForm8949Enum.Adapter.class)
  public enum ApplicableCheckboxOnForm8949Enum {
    A("A"),
    
    B("B"),
    
    D("D"),
    
    E("E"),
    
    X("X");

    private String value;

    ApplicableCheckboxOnForm8949Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicableCheckboxOnForm8949Enum fromValue(String value) {
      for (ApplicableCheckboxOnForm8949Enum b : ApplicableCheckboxOnForm8949Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ApplicableCheckboxOnForm8949Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicableCheckboxOnForm8949Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicableCheckboxOnForm8949Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApplicableCheckboxOnForm8949Enum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ApplicableCheckboxOnForm8949Enum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_APPLICABLE_CHECKBOX_ON_FORM8949 = "applicableCheckboxOnForm8949";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_CHECKBOX_ON_FORM8949)
  private ApplicableCheckboxOnForm8949Enum applicableCheckboxOnForm8949;

  public static final String SERIALIZED_NAME_CUSIP_NUMBER = "cusipNumber";
  @SerializedName(SERIALIZED_NAME_CUSIP_NUMBER)
  private String cusipNumber;

  public static final String SERIALIZED_NAME_DESCRIPTION_OF_PROPERTY = "descriptionOfProperty";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_OF_PROPERTY)
  private String descriptionOfProperty;

  public static final String SERIALIZED_NAME_DATE_ACQUIRED = "dateAcquired";
  @SerializedName(SERIALIZED_NAME_DATE_ACQUIRED)
  private LocalDate dateAcquired;

  public static final String SERIALIZED_NAME_DATE_SOLD_OR_DISPOSED = "dateSoldOrDisposed";
  @SerializedName(SERIALIZED_NAME_DATE_SOLD_OR_DISPOSED)
  private LocalDate dateSoldOrDisposed;

  public static final String SERIALIZED_NAME_PROCEEDS = "proceeds";
  @SerializedName(SERIALIZED_NAME_PROCEEDS)
  private Double proceeds;

  public static final String SERIALIZED_NAME_COST_OR_OTHER_BASIS = "costOrOtherBasis";
  @SerializedName(SERIALIZED_NAME_COST_OR_OTHER_BASIS)
  private Double costOrOtherBasis;

  public static final String SERIALIZED_NAME_ACCRUED_MARKET_DISCOUNT = "accruedMarketDiscount";
  @SerializedName(SERIALIZED_NAME_ACCRUED_MARKET_DISCOUNT)
  private Double accruedMarketDiscount;

  public static final String SERIALIZED_NAME_WASH_SALE_LOSS_DISALLOWED = "washSaleLossDisallowed";
  @SerializedName(SERIALIZED_NAME_WASH_SALE_LOSS_DISALLOWED)
  private Double washSaleLossDisallowed;

  /**
   * Type of gain or loss. Required unless &#x60;noncoveredSecurity&#x60; is &#x60;true&#x60;.                * &#x60;SHORT_TERM&#x60; - Short-term gain or loss  * &#x60;LONG_TERM&#x60; - Long-term gain or loss  * &#x60;ORDINARY_SHORT_TERM&#x60; - Ordinary, short-term  * &#x60;ORDINARY_LONG_TERM&#x60; - Ordinary, long-term
   */
  @JsonAdapter(TypeOfGainOrLossEnum.Adapter.class)
  public enum TypeOfGainOrLossEnum {
    SHORT_TERM("SHORT_TERM"),
    
    LONG_TERM("LONG_TERM"),
    
    ORDINARY_SHORT_TERM("ORDINARY_SHORT_TERM"),
    
    ORDINARY_LONG_TERM("ORDINARY_LONG_TERM");

    private String value;

    TypeOfGainOrLossEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeOfGainOrLossEnum fromValue(String value) {
      for (TypeOfGainOrLossEnum b : TypeOfGainOrLossEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeOfGainOrLossEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeOfGainOrLossEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeOfGainOrLossEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeOfGainOrLossEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeOfGainOrLossEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE_OF_GAIN_OR_LOSS = "typeOfGainOrLoss";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_GAIN_OR_LOSS)
  private TypeOfGainOrLossEnum typeOfGainOrLoss;

  /**
   * Source of the proceeds, if they are from collectibles or a Qualified Opportunity Fund.                * &#x60;COLLECTIBLES&#x60; - Collectibles  * &#x60;QOF&#x60; - Qualified Opportunity Fund (QOF)
   */
  @JsonAdapter(ProceedsFromEnum.Adapter.class)
  public enum ProceedsFromEnum {
    COLLECTIBLES("COLLECTIBLES"),
    
    QOF("QOF");

    private String value;

    ProceedsFromEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProceedsFromEnum fromValue(String value) {
      for (ProceedsFromEnum b : ProceedsFromEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProceedsFromEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProceedsFromEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProceedsFromEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProceedsFromEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProceedsFromEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROCEEDS_FROM = "proceedsFrom";
  @SerializedName(SERIALIZED_NAME_PROCEEDS_FROM)
  private ProceedsFromEnum proceedsFrom;

  public static final String SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD = "federalIncomeTaxWithheld";
  @SerializedName(SERIALIZED_NAME_FEDERAL_INCOME_TAX_WITHHELD)
  private Double federalIncomeTaxWithheld;

  public static final String SERIALIZED_NAME_NONCOVERED_SECURITY = "noncoveredSecurity";
  @SerializedName(SERIALIZED_NAME_NONCOVERED_SECURITY)
  private Boolean noncoveredSecurity;

  /**
   * Whether gross or net proceeds are reported to the IRS.                * &#x60;GROSS&#x60; - Gross proceeds  * &#x60;NET&#x60; - Net proceeds
   */
  @JsonAdapter(ProceedsReportedToIrsEnum.Adapter.class)
  public enum ProceedsReportedToIrsEnum {
    GROSS("GROSS"),
    
    NET("NET");

    private String value;

    ProceedsReportedToIrsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProceedsReportedToIrsEnum fromValue(String value) {
      for (ProceedsReportedToIrsEnum b : ProceedsReportedToIrsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProceedsReportedToIrsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProceedsReportedToIrsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProceedsReportedToIrsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProceedsReportedToIrsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ProceedsReportedToIrsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PROCEEDS_REPORTED_TO_IRS = "proceedsReportedToIrs";
  @SerializedName(SERIALIZED_NAME_PROCEEDS_REPORTED_TO_IRS)
  private ProceedsReportedToIrsEnum proceedsReportedToIrs;

  public static final String SERIALIZED_NAME_LOSS_NOT_ALLOWED = "lossNotAllowed";
  @SerializedName(SERIALIZED_NAME_LOSS_NOT_ALLOWED)
  private Boolean lossNotAllowed;

  public static final String SERIALIZED_NAME_PROFIT_OR_LOSS_REALIZED_ON_CLOSED_CONTRACTS = "profitOrLossRealizedOnClosedContracts";
  @SerializedName(SERIALIZED_NAME_PROFIT_OR_LOSS_REALIZED_ON_CLOSED_CONTRACTS)
  private Double profitOrLossRealizedOnClosedContracts;

  public static final String SERIALIZED_NAME_UNREALIZED_PROFIT_OR_LOSS_ON_OPEN_CONTRACTS_PRIOR_YEAR = "unrealizedProfitOrLossOnOpenContractsPriorYear";
  @SerializedName(SERIALIZED_NAME_UNREALIZED_PROFIT_OR_LOSS_ON_OPEN_CONTRACTS_PRIOR_YEAR)
  private Double unrealizedProfitOrLossOnOpenContractsPriorYear;

  public static final String SERIALIZED_NAME_UNREALIZED_PROFIT_OR_LOSS_ON_OPEN_CONTRACTS_CURRENT_YEAR = "unrealizedProfitOrLossOnOpenContractsCurrentYear";
  @SerializedName(SERIALIZED_NAME_UNREALIZED_PROFIT_OR_LOSS_ON_OPEN_CONTRACTS_CURRENT_YEAR)
  private Double unrealizedProfitOrLossOnOpenContractsCurrentYear;

  public static final String SERIALIZED_NAME_AGGREGATE_PROFIT_OR_LOSS_ON_CONTRACTS = "aggregateProfitOrLossOnContracts";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_PROFIT_OR_LOSS_ON_CONTRACTS)
  private Double aggregateProfitOrLossOnContracts;

  public static final String SERIALIZED_NAME_BASIS_REPORTED_TO_IRS = "basisReportedToIrs";
  @SerializedName(SERIALIZED_NAME_BASIS_REPORTED_TO_IRS)
  private Boolean basisReportedToIrs;

  public static final String SERIALIZED_NAME_BARTERING = "bartering";
  @SerializedName(SERIALIZED_NAME_BARTERING)
  private Double bartering;

  public static final String SERIALIZED_NAME_FATCA_FILING_REQUIREMENT = "fatcaFilingRequirement";
  @SerializedName(SERIALIZED_NAME_FATCA_FILING_REQUIREMENT)
  private Boolean fatcaFilingRequirement;

  /**
   * Form type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    _1042_S("1042-S"),
    
    _1095_B("1095-B"),
    
    _1095_C("1095-C"),
    
    _1098("1098"),
    
    _1098_E("1098-E"),
    
    _1098_T("1098-T"),
    
    _1099_B("1099-B"),
    
    _1099_C("1099-C"),
    
    _1099_DIV("1099-DIV"),
    
    _1099_G("1099-G"),
    
    _1099_INT("1099-INT"),
    
    _1099_K("1099-K"),
    
    _1099_MISC("1099-MISC"),
    
    _1099_NEC("1099-NEC"),
    
    _1099_PATR("1099-PATR"),
    
    _1099_R("1099-R"),
    
    _1099_S("1099-S"),
    
    _1099_SA("1099-SA"),
    
    _5498("5498"),
    
    W_2("W-2"),
    
    W_2_G("W-2G");

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

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_RECIPIENT_NAME = "recipientName";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_RECIPIENT_NAME)
  private String recipientName;

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

  public static final String SERIALIZED_NAME_NON_US_PROVINCE = "nonUsProvince";
  @SerializedName(SERIALIZED_NAME_NON_US_PROVINCE)
  private String nonUsProvince;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_FEDERAL_EFILE_DATE = "federalEfileDate";
  @SerializedName(SERIALIZED_NAME_FEDERAL_EFILE_DATE)
  private LocalDate federalEfileDate;

  public static final String SERIALIZED_NAME_POSTAL_MAIL = "postalMail";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL)
  private Boolean postalMail;

  public static final String SERIALIZED_NAME_STATE_EFILE_DATE = "stateEfileDate";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE_DATE)
  private LocalDate stateEfileDate;

  public static final String SERIALIZED_NAME_RECIPIENT_EDELIVERY_DATE = "recipientEdeliveryDate";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_EDELIVERY_DATE)
  private LocalDate recipientEdeliveryDate;

  public static final String SERIALIZED_NAME_TIN_MATCH = "tinMatch";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH)
  private Boolean tinMatch;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "addressVerification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private Boolean addressVerification;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholding stateAndLocalWithholding;

  public static final String SERIALIZED_NAME_FEDERAL_EFILE_STATUS = "federalEfileStatus";
  @SerializedName(SERIALIZED_NAME_FEDERAL_EFILE_STATUS)
  private FederalEfileStatusDetail federalEfileStatus;

  public static final String SERIALIZED_NAME_STATE_EFILE_STATUS = "stateEfileStatus";
  @SerializedName(SERIALIZED_NAME_STATE_EFILE_STATUS)
  private List<StateEfileStatusDetail> stateEfileStatus;

  public static final String SERIALIZED_NAME_POSTAL_MAIL_STATUS = "postalMailStatus";
  @SerializedName(SERIALIZED_NAME_POSTAL_MAIL_STATUS)
  private Form1099StatusDetail postalMailStatus;

  public static final String SERIALIZED_NAME_TIN_MATCH_STATUS = "tinMatchStatus";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH_STATUS)
  private Form1099StatusDetail tinMatchStatus;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS = "addressVerificationStatus";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION_STATUS)
  private Form1099StatusDetail addressVerificationStatus;

  public static final String SERIALIZED_NAME_E_DELIVERY_STATUS = "eDeliveryStatus";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_STATUS)
  private Form1099StatusDetail eDeliveryStatus;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<ValidationError> validationErrors;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * Recipient classification.  The platform is transitioning from tax identifier classifications to recipient entity classifications. New values represent recipient entity types and should be preferred. Deprecated values represent identifier formats and remain supported for backward compatibility only.  Available values: - INDIVIDUAL: Recipient is an individual - BUSINESS: Recipient is a business - UNKNOWN: Recipient classification is unknown - EIN: (Deprecated - use BUSINESS) Employer Identification Number - SSN: (Deprecated - use INDIVIDUAL) Social Security Number - ITIN: (Deprecated - use INDIVIDUAL) Individual Taxpayer Identification Number - ATIN: (Deprecated - use INDIVIDUAL) Adoption Taxpayer Identification Number
   */
  @JsonAdapter(TinTypeEnum.Adapter.class)
  public enum TinTypeEnum {
    EIN("EIN"),
    
    SSN("SSN"),
    
    ITIN("ITIN"),
    
    ATIN("ATIN"),
    
    INDIVIDUAL("INDIVIDUAL"),
    
    BUSINESS("BUSINESS"),
    
    UNKNOWN("UNKNOWN");

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
      return null;
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

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "businessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_BUSINESS_NAME2 = "businessName2";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME2)
  private String businessName2;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_SUFFIX_NAME = "suffixName";
  @SerializedName(SERIALIZED_NAME_SUFFIX_NAME)
  private String suffixName;

  public static final String SERIALIZED_NAME_RECIPIENT_SECOND_NAME = "recipientSecondName";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_RECIPIENT_SECOND_NAME)
  private String recipientSecondName;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_OFFICE_CODE = "officeCode";
  @SerializedName(SERIALIZED_NAME_OFFICE_CODE)
  private String officeCode;

  public static final String SERIALIZED_NAME_NO_TIN = "noTin";
  @SerializedName(SERIALIZED_NAME_NO_TIN)
  private Boolean noTin;

  public static final String SERIALIZED_NAME_SECOND_TIN_NOTICE = "secondTinNotice";
  @SerializedName(SERIALIZED_NAME_SECOND_TIN_NOTICE)
  private Boolean secondTinNotice;

  public Form1099B() {
  }

  public Form1099B(
     String id, 
     FederalEfileStatusDetail federalEfileStatus, 
     List<StateEfileStatusDetail> stateEfileStatus, 
     Form1099StatusDetail postalMailStatus, 
     Form1099StatusDetail tinMatchStatus, 
     Form1099StatusDetail addressVerificationStatus, 
     Form1099StatusDetail eDeliveryStatus, 
     List<ValidationError> validationErrors, 
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

  public Form1099B applicableCheckboxOnForm8949(ApplicableCheckboxOnForm8949Enum applicableCheckboxOnForm8949) {
    this.applicableCheckboxOnForm8949 = applicableCheckboxOnForm8949;
    return this;
  }

  /**
   * Applicable checkbox on Form 8949.                * &#x60;A&#x60; - Short-term transaction, basis reported to the IRS  * &#x60;B&#x60; - Short-term transaction, basis not reported to the IRS  * &#x60;D&#x60; - Long-term transaction, basis reported to the IRS  * &#x60;E&#x60; - Long-term transaction, basis not reported to the IRS  * &#x60;X&#x60; - Basis not reported to the IRS and the holding period is unknown
   * @return applicableCheckboxOnForm8949
   */
  @javax.annotation.Nullable
  public ApplicableCheckboxOnForm8949Enum getApplicableCheckboxOnForm8949() {
    return applicableCheckboxOnForm8949;
  }

  public void setApplicableCheckboxOnForm8949(ApplicableCheckboxOnForm8949Enum applicableCheckboxOnForm8949) {
    this.applicableCheckboxOnForm8949 = applicableCheckboxOnForm8949;
  }


  public Form1099B cusipNumber(String cusipNumber) {
    this.cusipNumber = cusipNumber;
    return this;
  }

  /**
   * CUSIP number (up to 13 letters or digits)
   * @return cusipNumber
   */
  @javax.annotation.Nullable
  public String getCusipNumber() {
    return cusipNumber;
  }

  public void setCusipNumber(String cusipNumber) {
    this.cusipNumber = cusipNumber;
  }


  public Form1099B descriptionOfProperty(String descriptionOfProperty) {
    this.descriptionOfProperty = descriptionOfProperty;
    return this;
  }

  /**
   * Description of property, such as the number of shares and the name of the stock
   * @return descriptionOfProperty
   */
  @javax.annotation.Nullable
  public String getDescriptionOfProperty() {
    return descriptionOfProperty;
  }

  public void setDescriptionOfProperty(String descriptionOfProperty) {
    this.descriptionOfProperty = descriptionOfProperty;
  }


  public Form1099B dateAcquired(LocalDate dateAcquired) {
    this.dateAcquired = dateAcquired;
    return this;
  }

  /**
   * Date acquired. Can&#39;t be after the tax year or before January 1 of the year 50 years before the current  filing year (for example, 1975-01-01 when filing for 2025), whatever the form&#39;s tax year.
   * @return dateAcquired
   */
  @javax.annotation.Nullable
  public LocalDate getDateAcquired() {
    return dateAcquired;
  }

  public void setDateAcquired(LocalDate dateAcquired) {
    this.dateAcquired = dateAcquired;
  }


  public Form1099B dateSoldOrDisposed(LocalDate dateSoldOrDisposed) {
    this.dateSoldOrDisposed = dateSoldOrDisposed;
    return this;
  }

  /**
   * Date sold or disposed. Must fall in the tax year.
   * @return dateSoldOrDisposed
   */
  @javax.annotation.Nullable
  public LocalDate getDateSoldOrDisposed() {
    return dateSoldOrDisposed;
  }

  public void setDateSoldOrDisposed(LocalDate dateSoldOrDisposed) {
    this.dateSoldOrDisposed = dateSoldOrDisposed;
  }


  public Form1099B proceeds(Double proceeds) {
    this.proceeds = proceeds;
    return this;
  }

  /**
   * Proceeds. Can be zero, or negative for a loss.
   * @return proceeds
   */
  @javax.annotation.Nullable
  public Double getProceeds() {
    return proceeds;
  }

  public void setProceeds(Double proceeds) {
    this.proceeds = proceeds;
  }


  public Form1099B costOrOtherBasis(Double costOrOtherBasis) {
    this.costOrOtherBasis = costOrOtherBasis;
    return this;
  }

  /**
   * Cost or other basis
   * @return costOrOtherBasis
   */
  @javax.annotation.Nullable
  public Double getCostOrOtherBasis() {
    return costOrOtherBasis;
  }

  public void setCostOrOtherBasis(Double costOrOtherBasis) {
    this.costOrOtherBasis = costOrOtherBasis;
  }


  public Form1099B accruedMarketDiscount(Double accruedMarketDiscount) {
    this.accruedMarketDiscount = accruedMarketDiscount;
    return this;
  }

  /**
   * Accrued market discount
   * @return accruedMarketDiscount
   */
  @javax.annotation.Nullable
  public Double getAccruedMarketDiscount() {
    return accruedMarketDiscount;
  }

  public void setAccruedMarketDiscount(Double accruedMarketDiscount) {
    this.accruedMarketDiscount = accruedMarketDiscount;
  }


  public Form1099B washSaleLossDisallowed(Double washSaleLossDisallowed) {
    this.washSaleLossDisallowed = washSaleLossDisallowed;
    return this;
  }

  /**
   * Wash sale loss disallowed
   * @return washSaleLossDisallowed
   */
  @javax.annotation.Nullable
  public Double getWashSaleLossDisallowed() {
    return washSaleLossDisallowed;
  }

  public void setWashSaleLossDisallowed(Double washSaleLossDisallowed) {
    this.washSaleLossDisallowed = washSaleLossDisallowed;
  }


  public Form1099B typeOfGainOrLoss(TypeOfGainOrLossEnum typeOfGainOrLoss) {
    this.typeOfGainOrLoss = typeOfGainOrLoss;
    return this;
  }

  /**
   * Type of gain or loss. Required unless &#x60;noncoveredSecurity&#x60; is &#x60;true&#x60;.                * &#x60;SHORT_TERM&#x60; - Short-term gain or loss  * &#x60;LONG_TERM&#x60; - Long-term gain or loss  * &#x60;ORDINARY_SHORT_TERM&#x60; - Ordinary, short-term  * &#x60;ORDINARY_LONG_TERM&#x60; - Ordinary, long-term
   * @return typeOfGainOrLoss
   */
  @javax.annotation.Nullable
  public TypeOfGainOrLossEnum getTypeOfGainOrLoss() {
    return typeOfGainOrLoss;
  }

  public void setTypeOfGainOrLoss(TypeOfGainOrLossEnum typeOfGainOrLoss) {
    this.typeOfGainOrLoss = typeOfGainOrLoss;
  }


  public Form1099B proceedsFrom(ProceedsFromEnum proceedsFrom) {
    this.proceedsFrom = proceedsFrom;
    return this;
  }

  /**
   * Source of the proceeds, if they are from collectibles or a Qualified Opportunity Fund.                * &#x60;COLLECTIBLES&#x60; - Collectibles  * &#x60;QOF&#x60; - Qualified Opportunity Fund (QOF)
   * @return proceedsFrom
   */
  @javax.annotation.Nullable
  public ProceedsFromEnum getProceedsFrom() {
    return proceedsFrom;
  }

  public void setProceedsFrom(ProceedsFromEnum proceedsFrom) {
    this.proceedsFrom = proceedsFrom;
  }


  public Form1099B federalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
    return this;
  }

  /**
   * Federal income tax withheld. Must be less than &#x60;proceeds&#x60; (zero when &#x60;proceeds&#x60; is zero or negative), and can&#39;t be  more than 24% of the other amounts on the form combined, not counting state and local withholding.
   * @return federalIncomeTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getFederalIncomeTaxWithheld() {
    return federalIncomeTaxWithheld;
  }

  public void setFederalIncomeTaxWithheld(Double federalIncomeTaxWithheld) {
    this.federalIncomeTaxWithheld = federalIncomeTaxWithheld;
  }


  public Form1099B noncoveredSecurity(Boolean noncoveredSecurity) {
    this.noncoveredSecurity = noncoveredSecurity;
    return this;
  }

  /**
   * If checked, the security is noncovered
   * @return noncoveredSecurity
   */
  @javax.annotation.Nullable
  public Boolean getNoncoveredSecurity() {
    return noncoveredSecurity;
  }

  public void setNoncoveredSecurity(Boolean noncoveredSecurity) {
    this.noncoveredSecurity = noncoveredSecurity;
  }


  public Form1099B proceedsReportedToIrs(ProceedsReportedToIrsEnum proceedsReportedToIrs) {
    this.proceedsReportedToIrs = proceedsReportedToIrs;
    return this;
  }

  /**
   * Whether gross or net proceeds are reported to the IRS.                * &#x60;GROSS&#x60; - Gross proceeds  * &#x60;NET&#x60; - Net proceeds
   * @return proceedsReportedToIrs
   */
  @javax.annotation.Nullable
  public ProceedsReportedToIrsEnum getProceedsReportedToIrs() {
    return proceedsReportedToIrs;
  }

  public void setProceedsReportedToIrs(ProceedsReportedToIrsEnum proceedsReportedToIrs) {
    this.proceedsReportedToIrs = proceedsReportedToIrs;
  }


  public Form1099B lossNotAllowed(Boolean lossNotAllowed) {
    this.lossNotAllowed = lossNotAllowed;
    return this;
  }

  /**
   * If checked, the loss is not allowed based on the amount in &#x60;proceeds&#x60;
   * @return lossNotAllowed
   */
  @javax.annotation.Nullable
  public Boolean getLossNotAllowed() {
    return lossNotAllowed;
  }

  public void setLossNotAllowed(Boolean lossNotAllowed) {
    this.lossNotAllowed = lossNotAllowed;
  }


  public Form1099B profitOrLossRealizedOnClosedContracts(Double profitOrLossRealizedOnClosedContracts) {
    this.profitOrLossRealizedOnClosedContracts = profitOrLossRealizedOnClosedContracts;
    return this;
  }

  /**
   * Profit or (loss) realized in the tax year on closed contracts
   * @return profitOrLossRealizedOnClosedContracts
   */
  @javax.annotation.Nullable
  public Double getProfitOrLossRealizedOnClosedContracts() {
    return profitOrLossRealizedOnClosedContracts;
  }

  public void setProfitOrLossRealizedOnClosedContracts(Double profitOrLossRealizedOnClosedContracts) {
    this.profitOrLossRealizedOnClosedContracts = profitOrLossRealizedOnClosedContracts;
  }


  public Form1099B unrealizedProfitOrLossOnOpenContractsPriorYear(Double unrealizedProfitOrLossOnOpenContractsPriorYear) {
    this.unrealizedProfitOrLossOnOpenContractsPriorYear = unrealizedProfitOrLossOnOpenContractsPriorYear;
    return this;
  }

  /**
   * Unrealized profit or (loss) on open contracts at the end of the prior tax year
   * @return unrealizedProfitOrLossOnOpenContractsPriorYear
   */
  @javax.annotation.Nullable
  public Double getUnrealizedProfitOrLossOnOpenContractsPriorYear() {
    return unrealizedProfitOrLossOnOpenContractsPriorYear;
  }

  public void setUnrealizedProfitOrLossOnOpenContractsPriorYear(Double unrealizedProfitOrLossOnOpenContractsPriorYear) {
    this.unrealizedProfitOrLossOnOpenContractsPriorYear = unrealizedProfitOrLossOnOpenContractsPriorYear;
  }


  public Form1099B unrealizedProfitOrLossOnOpenContractsCurrentYear(Double unrealizedProfitOrLossOnOpenContractsCurrentYear) {
    this.unrealizedProfitOrLossOnOpenContractsCurrentYear = unrealizedProfitOrLossOnOpenContractsCurrentYear;
    return this;
  }

  /**
   * Unrealized profit or (loss) on open contracts at the end of the tax year
   * @return unrealizedProfitOrLossOnOpenContractsCurrentYear
   */
  @javax.annotation.Nullable
  public Double getUnrealizedProfitOrLossOnOpenContractsCurrentYear() {
    return unrealizedProfitOrLossOnOpenContractsCurrentYear;
  }

  public void setUnrealizedProfitOrLossOnOpenContractsCurrentYear(Double unrealizedProfitOrLossOnOpenContractsCurrentYear) {
    this.unrealizedProfitOrLossOnOpenContractsCurrentYear = unrealizedProfitOrLossOnOpenContractsCurrentYear;
  }


  public Form1099B aggregateProfitOrLossOnContracts(Double aggregateProfitOrLossOnContracts) {
    this.aggregateProfitOrLossOnContracts = aggregateProfitOrLossOnContracts;
    return this;
  }

  /**
   * Aggregate profit or (loss) on contracts
   * @return aggregateProfitOrLossOnContracts
   */
  @javax.annotation.Nullable
  public Double getAggregateProfitOrLossOnContracts() {
    return aggregateProfitOrLossOnContracts;
  }

  public void setAggregateProfitOrLossOnContracts(Double aggregateProfitOrLossOnContracts) {
    this.aggregateProfitOrLossOnContracts = aggregateProfitOrLossOnContracts;
  }


  public Form1099B basisReportedToIrs(Boolean basisReportedToIrs) {
    this.basisReportedToIrs = basisReportedToIrs;
    return this;
  }

  /**
   * If checked, the basis is reported to the IRS. Only takes effect when &#x60;noncoveredSecurity&#x60; is also checked:  otherwise it isn&#39;t sent to the IRS, and changing it doesn&#39;t trigger a correction.
   * @return basisReportedToIrs
   */
  @javax.annotation.Nullable
  public Boolean getBasisReportedToIrs() {
    return basisReportedToIrs;
  }

  public void setBasisReportedToIrs(Boolean basisReportedToIrs) {
    this.basisReportedToIrs = basisReportedToIrs;
  }


  public Form1099B bartering(Double bartering) {
    this.bartering = bartering;
    return this;
  }

  /**
   * Bartering
   * @return bartering
   */
  @javax.annotation.Nullable
  public Double getBartering() {
    return bartering;
  }

  public void setBartering(Double bartering) {
    this.bartering = bartering;
  }


  public Form1099B fatcaFilingRequirement(Boolean fatcaFilingRequirement) {
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


  public Form1099B type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Form type.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Form ID. Unique identifier set when the record is created.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public Form1099B issuerId(String issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * Issuer ID - only required when creating forms
   * @return issuerId
   */
  @javax.annotation.Nullable
  public String getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(String issuerId) {
    this.issuerId = issuerId;
  }


  public Form1099B issuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
    return this;
  }

  /**
   * Issuer Reference ID - only required when creating forms via $bulk-upsert
   * @return issuerReferenceId
   */
  @javax.annotation.Nullable
  public String getIssuerReferenceId() {
    return issuerReferenceId;
  }

  public void setIssuerReferenceId(String issuerReferenceId) {
    this.issuerReferenceId = issuerReferenceId;
  }


  public Form1099B issuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
    return this;
  }

  /**
   * Issuer TIN - readonly
   * @return issuerTin
   */
  @javax.annotation.Nullable
  public String getIssuerTin() {
    return issuerTin;
  }

  public void setIssuerTin(String issuerTin) {
    this.issuerTin = issuerTin;
  }


  public Form1099B taxYear(Integer taxYear) {
    this.taxYear = taxYear;
    return this;
  }

  /**
   * Tax Year - only required when creating forms via $bulk-upsert
   * @return taxYear
   */
  @javax.annotation.Nullable
  public Integer getTaxYear() {
    return taxYear;
  }

  public void setTaxYear(Integer taxYear) {
    this.taxYear = taxYear;
  }


  public Form1099B referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Internal reference ID. Never shown to any agency or recipient.
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public Form1099B tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * Recipient&#39;s Federal Tax Identification Number (TIN).
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  @Deprecated
  public Form1099B recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

  /**
   * DEPRECATED: Use &#x60;businessName&#x60; for businesses; use &#x60;firstName&#x60;, &#x60;middleName&#x60;, &#x60;lastName&#x60;, and &#x60;suffixName&#x60; for individuals.
   * @return recipientName
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getRecipientName() {
    return recipientName;
  }

  @Deprecated
  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }


  public Form1099B address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address.
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Form1099B address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Address line 2.
   * @return address2
   */
  @javax.annotation.Nullable
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public Form1099B city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City.
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public Form1099B state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Two-letter US state or Canadian province code (required for US/CA addresses).
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Form1099B zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * ZIP/postal code.
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  public Form1099B email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Recipient&#39;s Contact email address.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Form1099B nonUsProvince(String nonUsProvince) {
    this.nonUsProvince = nonUsProvince;
    return this;
  }

  /**
   * Province or region for non-US/CA addresses.
   * @return nonUsProvince
   */
  @javax.annotation.Nullable
  public String getNonUsProvince() {
    return nonUsProvince;
  }

  public void setNonUsProvince(String nonUsProvince) {
    this.nonUsProvince = nonUsProvince;
  }


  public Form1099B countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Two-letter IRS country code (e.g., &#39;US&#39;, &#39;CA&#39;), as defined at https://www.irs.gov/e-file-providers/country-codes.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Form1099B federalEfileDate(LocalDate federalEfileDate) {
    this.federalEfileDate = federalEfileDate;
    return this;
  }

  /**
   * Date when federal e-filing should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled.
   * @return federalEfileDate
   */
  @javax.annotation.Nullable
  public LocalDate getFederalEfileDate() {
    return federalEfileDate;
  }

  public void setFederalEfileDate(LocalDate federalEfileDate) {
    this.federalEfileDate = federalEfileDate;
  }


  public Form1099B postalMail(Boolean postalMail) {
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


  public Form1099B stateEfileDate(LocalDate stateEfileDate) {
    this.stateEfileDate = stateEfileDate;
    return this;
  }

  /**
   * Date when state e-filing should be scheduled. Must be on or after federalEfileDate. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled.
   * @return stateEfileDate
   */
  @javax.annotation.Nullable
  public LocalDate getStateEfileDate() {
    return stateEfileDate;
  }

  public void setStateEfileDate(LocalDate stateEfileDate) {
    this.stateEfileDate = stateEfileDate;
  }


  public Form1099B recipientEdeliveryDate(LocalDate recipientEdeliveryDate) {
    this.recipientEdeliveryDate = recipientEdeliveryDate;
    return this;
  }

  /**
   * Date when recipient e-delivery should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled.
   * @return recipientEdeliveryDate
   */
  @javax.annotation.Nullable
  public LocalDate getRecipientEdeliveryDate() {
    return recipientEdeliveryDate;
  }

  public void setRecipientEdeliveryDate(LocalDate recipientEdeliveryDate) {
    this.recipientEdeliveryDate = recipientEdeliveryDate;
  }


  public Form1099B tinMatch(Boolean tinMatch) {
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


  public Form1099B addressVerification(Boolean addressVerification) {
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


  public Form1099B stateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
    return this;
  }

  /**
   * State and local withholding information
   * @return stateAndLocalWithholding
   */
  @javax.annotation.Nullable
  public StateAndLocalWithholding getStateAndLocalWithholding() {
    return stateAndLocalWithholding;
  }

  public void setStateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
    this.stateAndLocalWithholding = stateAndLocalWithholding;
  }


  /**
   * Federal e-file status.  Available values:  - unscheduled: Form has not been scheduled for federal e-filing  - scheduled: Form is scheduled for federal e-filing  - airlock: Form is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - sent: Form has been sent to the IRS  - accepted: Form was accepted by the IRS  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlock: Correction is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - corrected: A correction has been sent to the IRS  - corrected_accepted: Correction was accepted by the IRS  - rejected: Form was rejected by the IRS  - corrected_rejected: Correction was rejected by the IRS  - held: Form is held and will not be submitted to IRS (used for certain forms submitted only to states)  When the form&#39;s most recent IRIS filing was rejected or accepted with errors, &#x60;errors&#x60; lists what the IRS reported.
   * @return federalEfileStatus
   */
  @javax.annotation.Nullable
  public FederalEfileStatusDetail getFederalEfileStatus() {
    return federalEfileStatus;
  }



  /**
   * State e-file status.  Available values:  - unscheduled: Form has not been scheduled for state e-filing  - scheduled: Form is scheduled for state e-filing  - airlocked: Form is in process of being uploaded to the state  - sent: Form has been sent to the state  - rejected: Form was rejected by the state  - accepted: Form was accepted by the state  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlocked: Correction is in process of being uploaded to the state  - corrected_sent: Correction has been sent to the state  - corrected_rejected: Correction was rejected by the state  - corrected_accepted: Correction was accepted by the state
   * @return stateEfileStatus
   */
  @javax.annotation.Nullable
  public List<StateEfileStatusDetail> getStateEfileStatus() {
    return stateEfileStatus;
  }



  /**
   * Postal mail to recipient status.  Available values:  - unscheduled: Postal mail has not been scheduled  - pending: Postal mail is pending to be sent  - sent: Postal mail has been sent  - delivered: Postal mail has been delivered
   * @return postalMailStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getPostalMailStatus() {
    return postalMailStatus;
  }



  /**
   * TIN Match status.  Available values:  - none: TIN matching has not been performed  - pending: TIN matching request is pending  - matched: Name/TIN combination matches IRS records  - unknown: TIN is missing, invalid, or request contains errors  - rejected: Name/TIN combination does not match IRS records or TIN not currently issued
   * @return tinMatchStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getTinMatchStatus() {
    return tinMatchStatus;
  }



  /**
   * Address verification status.  Available values:  - unknown: Address verification has not been checked  - pending: Address verification is in progress  - failed: Address verification failed  - incomplete: Address verification is incomplete  - unchanged: User declined address changes  - verified: Address has been verified and accepted
   * @return addressVerificationStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getAddressVerificationStatus() {
    return addressVerificationStatus;
  }



  /**
   * EDelivery status.  Available values:  - unscheduled: E-delivery has not been scheduled  - scheduled: E-delivery is scheduled to be sent  - sent: E-delivery has been sent to recipient  - bounced: E-delivery bounced back (invalid email)  - refused: E-delivery was refused by recipient  - bad_verify: E-delivery failed verification  - accepted: E-delivery was accepted by recipient  - bad_verify_limit: E-delivery failed verification limit reached  - second_delivery: Second e-delivery attempt  - undelivered: E-delivery is undelivered (temporary state allowing resend)
   * @return eDeliveryStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail geteDeliveryStatus() {
    return eDeliveryStatus;
  }



  /**
   * Validation errors
   * @return validationErrors
   */
  @javax.annotation.Nullable
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }



  /**
   * Date time when the record was created.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * Date time when the record was last updated.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }



  public Form1099B tinType(TinTypeEnum tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * Recipient classification.  The platform is transitioning from tax identifier classifications to recipient entity classifications. New values represent recipient entity types and should be preferred. Deprecated values represent identifier formats and remain supported for backward compatibility only.  Available values: - INDIVIDUAL: Recipient is an individual - BUSINESS: Recipient is a business - UNKNOWN: Recipient classification is unknown - EIN: (Deprecated - use BUSINESS) Employer Identification Number - SSN: (Deprecated - use INDIVIDUAL) Social Security Number - ITIN: (Deprecated - use INDIVIDUAL) Individual Taxpayer Identification Number - ATIN: (Deprecated - use INDIVIDUAL) Adoption Taxpayer Identification Number
   * @return tinType
   */
  @javax.annotation.Nullable
  public TinTypeEnum getTinType() {
    return tinType;
  }

  public void setTinType(TinTypeEnum tinType) {
    this.tinType = tinType;
  }


  public Form1099B businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  /**
   * Business name. Required when the recipient of the form is a business; should only be used for businesses.
   * @return businessName
   */
  @javax.annotation.Nullable
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public Form1099B businessName2(String businessName2) {
    this.businessName2 = businessName2;
    return this;
  }

  /**
   * Business name line 2. Should only be used for businesses.
   * @return businessName2
   */
  @javax.annotation.Nullable
  public String getBusinessName2() {
    return businessName2;
  }

  public void setBusinessName2(String businessName2) {
    this.businessName2 = businessName2;
  }


  public Form1099B firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name. Required when the recipient of the form is an individual; should only be used for individuals.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Form1099B middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name. Should only be used for individuals.
   * @return middleName
   */
  @javax.annotation.Nullable
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public Form1099B lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name. Required when the recipient of the form is an individual; should only be used for individuals.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Form1099B suffixName(String suffixName) {
    this.suffixName = suffixName;
    return this;
  }

  /**
   * Suffix name. Should only be used for individuals.
   * @return suffixName
   */
  @javax.annotation.Nullable
  public String getSuffixName() {
    return suffixName;
  }

  public void setSuffixName(String suffixName) {
    this.suffixName = suffixName;
  }


  @Deprecated
  public Form1099B recipientSecondName(String recipientSecondName) {
    this.recipientSecondName = recipientSecondName;
    return this;
  }

  /**
   * DEPRECATED: Use &#x60;businessName2&#x60; instead.
   * @return recipientSecondName
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getRecipientSecondName() {
    return recipientSecondName;
  }

  @Deprecated
  public void setRecipientSecondName(String recipientSecondName) {
    this.recipientSecondName = recipientSecondName;
  }


  public Form1099B accountNumber(String accountNumber) {
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


  public Form1099B officeCode(String officeCode) {
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


  public Form1099B noTin(Boolean noTin) {
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


  public Form1099B secondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
    return this;
  }

  /**
   * Second TIN notice
   * @return secondTinNotice
   */
  @javax.annotation.Nullable
  public Boolean getSecondTinNotice() {
    return secondTinNotice;
  }

  public void setSecondTinNotice(Boolean secondTinNotice) {
    this.secondTinNotice = secondTinNotice;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Form1099B instance itself
   */
  public Form1099B putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1099B form1099B = (Form1099B) o;
    return Objects.equals(this.applicableCheckboxOnForm8949, form1099B.applicableCheckboxOnForm8949) &&
        Objects.equals(this.cusipNumber, form1099B.cusipNumber) &&
        Objects.equals(this.descriptionOfProperty, form1099B.descriptionOfProperty) &&
        Objects.equals(this.dateAcquired, form1099B.dateAcquired) &&
        Objects.equals(this.dateSoldOrDisposed, form1099B.dateSoldOrDisposed) &&
        Objects.equals(this.proceeds, form1099B.proceeds) &&
        Objects.equals(this.costOrOtherBasis, form1099B.costOrOtherBasis) &&
        Objects.equals(this.accruedMarketDiscount, form1099B.accruedMarketDiscount) &&
        Objects.equals(this.washSaleLossDisallowed, form1099B.washSaleLossDisallowed) &&
        Objects.equals(this.typeOfGainOrLoss, form1099B.typeOfGainOrLoss) &&
        Objects.equals(this.proceedsFrom, form1099B.proceedsFrom) &&
        Objects.equals(this.federalIncomeTaxWithheld, form1099B.federalIncomeTaxWithheld) &&
        Objects.equals(this.noncoveredSecurity, form1099B.noncoveredSecurity) &&
        Objects.equals(this.proceedsReportedToIrs, form1099B.proceedsReportedToIrs) &&
        Objects.equals(this.lossNotAllowed, form1099B.lossNotAllowed) &&
        Objects.equals(this.profitOrLossRealizedOnClosedContracts, form1099B.profitOrLossRealizedOnClosedContracts) &&
        Objects.equals(this.unrealizedProfitOrLossOnOpenContractsPriorYear, form1099B.unrealizedProfitOrLossOnOpenContractsPriorYear) &&
        Objects.equals(this.unrealizedProfitOrLossOnOpenContractsCurrentYear, form1099B.unrealizedProfitOrLossOnOpenContractsCurrentYear) &&
        Objects.equals(this.aggregateProfitOrLossOnContracts, form1099B.aggregateProfitOrLossOnContracts) &&
        Objects.equals(this.basisReportedToIrs, form1099B.basisReportedToIrs) &&
        Objects.equals(this.bartering, form1099B.bartering) &&
        Objects.equals(this.fatcaFilingRequirement, form1099B.fatcaFilingRequirement) &&
        Objects.equals(this.type, form1099B.type) &&
        Objects.equals(this.id, form1099B.id) &&
        Objects.equals(this.issuerId, form1099B.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1099B.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1099B.issuerTin) &&
        Objects.equals(this.taxYear, form1099B.taxYear) &&
        Objects.equals(this.referenceId, form1099B.referenceId) &&
        Objects.equals(this.tin, form1099B.tin) &&
        Objects.equals(this.recipientName, form1099B.recipientName) &&
        Objects.equals(this.address, form1099B.address) &&
        Objects.equals(this.address2, form1099B.address2) &&
        Objects.equals(this.city, form1099B.city) &&
        Objects.equals(this.state, form1099B.state) &&
        Objects.equals(this.zip, form1099B.zip) &&
        Objects.equals(this.email, form1099B.email) &&
        Objects.equals(this.nonUsProvince, form1099B.nonUsProvince) &&
        Objects.equals(this.countryCode, form1099B.countryCode) &&
        Objects.equals(this.federalEfileDate, form1099B.federalEfileDate) &&
        Objects.equals(this.postalMail, form1099B.postalMail) &&
        Objects.equals(this.stateEfileDate, form1099B.stateEfileDate) &&
        Objects.equals(this.recipientEdeliveryDate, form1099B.recipientEdeliveryDate) &&
        Objects.equals(this.tinMatch, form1099B.tinMatch) &&
        Objects.equals(this.addressVerification, form1099B.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form1099B.stateAndLocalWithholding) &&
        Objects.equals(this.federalEfileStatus, form1099B.federalEfileStatus) &&
        Objects.equals(this.stateEfileStatus, form1099B.stateEfileStatus) &&
        Objects.equals(this.postalMailStatus, form1099B.postalMailStatus) &&
        Objects.equals(this.tinMatchStatus, form1099B.tinMatchStatus) &&
        Objects.equals(this.addressVerificationStatus, form1099B.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form1099B.eDeliveryStatus) &&
        Objects.equals(this.validationErrors, form1099B.validationErrors) &&
        Objects.equals(this.createdAt, form1099B.createdAt) &&
        Objects.equals(this.updatedAt, form1099B.updatedAt) &&
        Objects.equals(this.tinType, form1099B.tinType) &&
        Objects.equals(this.businessName, form1099B.businessName) &&
        Objects.equals(this.businessName2, form1099B.businessName2) &&
        Objects.equals(this.firstName, form1099B.firstName) &&
        Objects.equals(this.middleName, form1099B.middleName) &&
        Objects.equals(this.lastName, form1099B.lastName) &&
        Objects.equals(this.suffixName, form1099B.suffixName) &&
        Objects.equals(this.recipientSecondName, form1099B.recipientSecondName) &&
        Objects.equals(this.accountNumber, form1099B.accountNumber) &&
        Objects.equals(this.officeCode, form1099B.officeCode) &&
        Objects.equals(this.noTin, form1099B.noTin) &&
        Objects.equals(this.secondTinNotice, form1099B.secondTinNotice)&&
        Objects.equals(this.additionalProperties, form1099B.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableCheckboxOnForm8949, cusipNumber, descriptionOfProperty, dateAcquired, dateSoldOrDisposed, proceeds, costOrOtherBasis, accruedMarketDiscount, washSaleLossDisallowed, typeOfGainOrLoss, proceedsFrom, federalIncomeTaxWithheld, noncoveredSecurity, proceedsReportedToIrs, lossNotAllowed, profitOrLossRealizedOnClosedContracts, unrealizedProfitOrLossOnOpenContractsPriorYear, unrealizedProfitOrLossOnOpenContractsCurrentYear, aggregateProfitOrLossOnContracts, basisReportedToIrs, bartering, fatcaFilingRequirement, type, id, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, tin, recipientName, address, address2, city, state, zip, email, nonUsProvince, countryCode, federalEfileDate, postalMail, stateEfileDate, recipientEdeliveryDate, tinMatch, addressVerification, stateAndLocalWithholding, federalEfileStatus, stateEfileStatus, postalMailStatus, tinMatchStatus, addressVerificationStatus, eDeliveryStatus, validationErrors, createdAt, updatedAt, tinType, businessName, businessName2, firstName, middleName, lastName, suffixName, recipientSecondName, accountNumber, officeCode, noTin, secondTinNotice, additionalProperties);
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
    sb.append("class Form1099B {\n");
    sb.append("    applicableCheckboxOnForm8949: ").append(toIndentedString(applicableCheckboxOnForm8949)).append("\n");
    sb.append("    cusipNumber: ").append(toIndentedString(cusipNumber)).append("\n");
    sb.append("    descriptionOfProperty: ").append(toIndentedString(descriptionOfProperty)).append("\n");
    sb.append("    dateAcquired: ").append(toIndentedString(dateAcquired)).append("\n");
    sb.append("    dateSoldOrDisposed: ").append(toIndentedString(dateSoldOrDisposed)).append("\n");
    sb.append("    proceeds: ").append(toIndentedString(proceeds)).append("\n");
    sb.append("    costOrOtherBasis: ").append(toIndentedString(costOrOtherBasis)).append("\n");
    sb.append("    accruedMarketDiscount: ").append(toIndentedString(accruedMarketDiscount)).append("\n");
    sb.append("    washSaleLossDisallowed: ").append(toIndentedString(washSaleLossDisallowed)).append("\n");
    sb.append("    typeOfGainOrLoss: ").append(toIndentedString(typeOfGainOrLoss)).append("\n");
    sb.append("    proceedsFrom: ").append(toIndentedString(proceedsFrom)).append("\n");
    sb.append("    federalIncomeTaxWithheld: ").append(toIndentedString(federalIncomeTaxWithheld)).append("\n");
    sb.append("    noncoveredSecurity: ").append(toIndentedString(noncoveredSecurity)).append("\n");
    sb.append("    proceedsReportedToIrs: ").append(toIndentedString(proceedsReportedToIrs)).append("\n");
    sb.append("    lossNotAllowed: ").append(toIndentedString(lossNotAllowed)).append("\n");
    sb.append("    profitOrLossRealizedOnClosedContracts: ").append(toIndentedString(profitOrLossRealizedOnClosedContracts)).append("\n");
    sb.append("    unrealizedProfitOrLossOnOpenContractsPriorYear: ").append(toIndentedString(unrealizedProfitOrLossOnOpenContractsPriorYear)).append("\n");
    sb.append("    unrealizedProfitOrLossOnOpenContractsCurrentYear: ").append(toIndentedString(unrealizedProfitOrLossOnOpenContractsCurrentYear)).append("\n");
    sb.append("    aggregateProfitOrLossOnContracts: ").append(toIndentedString(aggregateProfitOrLossOnContracts)).append("\n");
    sb.append("    basisReportedToIrs: ").append(toIndentedString(basisReportedToIrs)).append("\n");
    sb.append("    bartering: ").append(toIndentedString(bartering)).append("\n");
    sb.append("    fatcaFilingRequirement: ").append(toIndentedString(fatcaFilingRequirement)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerReferenceId: ").append(toIndentedString(issuerReferenceId)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nonUsProvince: ").append(toIndentedString(nonUsProvince)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    federalEfileDate: ").append(toIndentedString(federalEfileDate)).append("\n");
    sb.append("    postalMail: ").append(toIndentedString(postalMail)).append("\n");
    sb.append("    stateEfileDate: ").append(toIndentedString(stateEfileDate)).append("\n");
    sb.append("    recipientEdeliveryDate: ").append(toIndentedString(recipientEdeliveryDate)).append("\n");
    sb.append("    tinMatch: ").append(toIndentedString(tinMatch)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    stateAndLocalWithholding: ").append(toIndentedString(stateAndLocalWithholding)).append("\n");
    sb.append("    federalEfileStatus: ").append(toIndentedString(federalEfileStatus)).append("\n");
    sb.append("    stateEfileStatus: ").append(toIndentedString(stateEfileStatus)).append("\n");
    sb.append("    postalMailStatus: ").append(toIndentedString(postalMailStatus)).append("\n");
    sb.append("    tinMatchStatus: ").append(toIndentedString(tinMatchStatus)).append("\n");
    sb.append("    addressVerificationStatus: ").append(toIndentedString(addressVerificationStatus)).append("\n");
    sb.append("    eDeliveryStatus: ").append(toIndentedString(eDeliveryStatus)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessName2: ").append(toIndentedString(businessName2)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    suffixName: ").append(toIndentedString(suffixName)).append("\n");
    sb.append("    recipientSecondName: ").append(toIndentedString(recipientSecondName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    officeCode: ").append(toIndentedString(officeCode)).append("\n");
    sb.append("    noTin: ").append(toIndentedString(noTin)).append("\n");
    sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("issuerId");
    openapiFields.add("issuerReferenceId");
    openapiFields.add("issuerTin");
    openapiFields.add("taxYear");
    openapiFields.add("referenceId");
    openapiFields.add("tin");
    openapiFields.add("recipientName");
    openapiFields.add("address");
    openapiFields.add("address2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("email");
    openapiFields.add("nonUsProvince");
    openapiFields.add("countryCode");
    openapiFields.add("federalEfileDate");
    openapiFields.add("postalMail");
    openapiFields.add("stateEfileDate");
    openapiFields.add("recipientEdeliveryDate");
    openapiFields.add("tinMatch");
    openapiFields.add("addressVerification");
    openapiFields.add("stateAndLocalWithholding");
    openapiFields.add("federalEfileStatus");
    openapiFields.add("stateEfileStatus");
    openapiFields.add("postalMailStatus");
    openapiFields.add("tinMatchStatus");
    openapiFields.add("addressVerificationStatus");
    openapiFields.add("eDeliveryStatus");
    openapiFields.add("validationErrors");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("tinType");
    openapiFields.add("businessName");
    openapiFields.add("businessName2");
    openapiFields.add("firstName");
    openapiFields.add("middleName");
    openapiFields.add("lastName");
    openapiFields.add("suffixName");
    openapiFields.add("recipientSecondName");
    openapiFields.add("accountNumber");
    openapiFields.add("officeCode");
    openapiFields.add("noTin");
    openapiFields.add("secondTinNotice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("applicableCheckboxOnForm8949");
    openapiRequiredFields.add("descriptionOfProperty");
    openapiRequiredFields.add("proceeds");
    openapiRequiredFields.add("proceedsReportedToIrs");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("countryCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1099B
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099B.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099B is not found in the empty JSON string", Form1099B.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1099B.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("applicableCheckboxOnForm8949") != null && !jsonObj.get("applicableCheckboxOnForm8949").isJsonNull()) && !jsonObj.get("applicableCheckboxOnForm8949").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicableCheckboxOnForm8949` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicableCheckboxOnForm8949").toString()));
      }
      // validate the required field `applicableCheckboxOnForm8949`
      ApplicableCheckboxOnForm8949Enum.validateJsonElement(jsonObj.get("applicableCheckboxOnForm8949"));
      if ((jsonObj.get("cusipNumber") != null && !jsonObj.get("cusipNumber").isJsonNull()) && !jsonObj.get("cusipNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cusipNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cusipNumber").toString()));
      }
      if ((jsonObj.get("descriptionOfProperty") != null && !jsonObj.get("descriptionOfProperty").isJsonNull()) && !jsonObj.get("descriptionOfProperty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionOfProperty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionOfProperty").toString()));
      }
      if ((jsonObj.get("typeOfGainOrLoss") != null && !jsonObj.get("typeOfGainOrLoss").isJsonNull()) && !jsonObj.get("typeOfGainOrLoss").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeOfGainOrLoss` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeOfGainOrLoss").toString()));
      }
      // validate the optional field `typeOfGainOrLoss`
      if (jsonObj.get("typeOfGainOrLoss") != null && !jsonObj.get("typeOfGainOrLoss").isJsonNull()) {
        TypeOfGainOrLossEnum.validateJsonElement(jsonObj.get("typeOfGainOrLoss"));
      }
      if ((jsonObj.get("proceedsFrom") != null && !jsonObj.get("proceedsFrom").isJsonNull()) && !jsonObj.get("proceedsFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proceedsFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proceedsFrom").toString()));
      }
      // validate the optional field `proceedsFrom`
      if (jsonObj.get("proceedsFrom") != null && !jsonObj.get("proceedsFrom").isJsonNull()) {
        ProceedsFromEnum.validateJsonElement(jsonObj.get("proceedsFrom"));
      }
      if ((jsonObj.get("proceedsReportedToIrs") != null && !jsonObj.get("proceedsReportedToIrs").isJsonNull()) && !jsonObj.get("proceedsReportedToIrs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `proceedsReportedToIrs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("proceedsReportedToIrs").toString()));
      }
      // validate the required field `proceedsReportedToIrs`
      ProceedsReportedToIrsEnum.validateJsonElement(jsonObj.get("proceedsReportedToIrs"));
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
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
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("recipientName") != null && !jsonObj.get("recipientName").isJsonNull()) && !jsonObj.get("recipientName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientName").toString()));
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
      if ((jsonObj.get("nonUsProvince") != null && !jsonObj.get("nonUsProvince").isJsonNull()) && !jsonObj.get("nonUsProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonUsProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonUsProvince").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholding.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
      }
      // validate the optional field `federalEfileStatus`
      if (jsonObj.get("federalEfileStatus") != null && !jsonObj.get("federalEfileStatus").isJsonNull()) {
        FederalEfileStatusDetail.validateJsonElement(jsonObj.get("federalEfileStatus"));
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
      if ((jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) && !jsonObj.get("tinType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinType").toString()));
      }
      // validate the optional field `tinType`
      if (jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) {
        TinTypeEnum.validateJsonElement(jsonObj.get("tinType"));
      }
      if ((jsonObj.get("businessName") != null && !jsonObj.get("businessName").isJsonNull()) && !jsonObj.get("businessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessName").toString()));
      }
      if ((jsonObj.get("businessName2") != null && !jsonObj.get("businessName2").isJsonNull()) && !jsonObj.get("businessName2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessName2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessName2").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull()) && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("suffixName") != null && !jsonObj.get("suffixName").isJsonNull()) && !jsonObj.get("suffixName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suffixName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suffixName").toString()));
      }
      if ((jsonObj.get("recipientSecondName") != null && !jsonObj.get("recipientSecondName").isJsonNull()) && !jsonObj.get("recipientSecondName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientSecondName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientSecondName").toString()));
      }
      if ((jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonNull()) && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if ((jsonObj.get("officeCode") != null && !jsonObj.get("officeCode").isJsonNull()) && !jsonObj.get("officeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `officeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("officeCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form1099B.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099B' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099B> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099B.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099B>() {
           @Override
           public void write(JsonWriter out, Form1099B value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099B read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Form1099B instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099B given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099B
   * @throws IOException if the JSON string is invalid with respect to Form1099B
   */
  public static Form1099B fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099B.class);
  }

  /**
   * Convert an instance of Form1099B to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

