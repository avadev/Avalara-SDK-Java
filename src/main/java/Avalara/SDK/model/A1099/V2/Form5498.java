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
 * Form 5498: IRA Contribution Information                The recipient is the participant and the issuer is the trustee or issuer of the IRA.                *Required:* at least one amount above zero in Boxes 1-5, 8-10, 13a or 14a. Amounts can&#39;t be negative.                Paired boxes are all-or-nothing: Box 7 is required when Box 2 or Box 5 has an amount, and Boxes 8, 9 and 10 are  only allowed with Box 7 type SEP, SIMPLE and Roth IRA; Boxes 12a and 12b are required when Box 11 is checked and  not allowed otherwise; Boxes 13b and 13c go with Box 13a, Box 14b with Box 14a, and Box 15b with Box 15a.                Form 5498 has no state or local boxes, so &#x60;stateAndLocalWithholding&#x60; is discarded and reads back as &#x60;null&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form5498 {
  public static final String SERIALIZED_NAME_IRA_CONTRIBUTIONS = "iraContributions";
  @SerializedName(SERIALIZED_NAME_IRA_CONTRIBUTIONS)
  private Double iraContributions;

  public static final String SERIALIZED_NAME_ROLLOVER_CONTRIBUTIONS = "rolloverContributions";
  @SerializedName(SERIALIZED_NAME_ROLLOVER_CONTRIBUTIONS)
  private Double rolloverContributions;

  public static final String SERIALIZED_NAME_ROTH_IRA_CONVERSION_AMOUNT = "rothIraConversionAmount";
  @SerializedName(SERIALIZED_NAME_ROTH_IRA_CONVERSION_AMOUNT)
  private Double rothIraConversionAmount;

  public static final String SERIALIZED_NAME_RECHARACTERIZED_CONTRIBUTIONS = "recharacterizedContributions";
  @SerializedName(SERIALIZED_NAME_RECHARACTERIZED_CONTRIBUTIONS)
  private Double recharacterizedContributions;

  public static final String SERIALIZED_NAME_FAIR_MARKET_VALUE_OF_ACCOUNT = "fairMarketValueOfAccount";
  @SerializedName(SERIALIZED_NAME_FAIR_MARKET_VALUE_OF_ACCOUNT)
  private Double fairMarketValueOfAccount;

  public static final String SERIALIZED_NAME_LIFE_INSURANCE_COST_INCLUDED_IN_IRA_CONTRIBUTIONS = "lifeInsuranceCostIncludedInIraContributions";
  @SerializedName(SERIALIZED_NAME_LIFE_INSURANCE_COST_INCLUDED_IN_IRA_CONTRIBUTIONS)
  private Double lifeInsuranceCostIncludedInIraContributions;

  /**
   * Type of IRA. Required when Box 2 or Box 5 has an amount.                * &#x60;IRA&#x60; - Traditional IRA  * &#x60;SEP&#x60; - SEP IRA  * &#x60;SIMPLE&#x60; - SIMPLE IRA  * &#x60;ROTH&#x60; - Roth IRA
   */
  @JsonAdapter(IraTypeEnum.Adapter.class)
  public enum IraTypeEnum {
    IRA("IRA"),
    
    SEP("SEP"),
    
    SIMPLE("SIMPLE"),
    
    ROTH("ROTH");

    private String value;

    IraTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IraTypeEnum fromValue(String value) {
      for (IraTypeEnum b : IraTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IraTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IraTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IraTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IraTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IraTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_IRA_TYPE = "iraType";
  @SerializedName(SERIALIZED_NAME_IRA_TYPE)
  private IraTypeEnum iraType;

  public static final String SERIALIZED_NAME_SEP_CONTRIBUTIONS = "sepContributions";
  @SerializedName(SERIALIZED_NAME_SEP_CONTRIBUTIONS)
  private Double sepContributions;

  public static final String SERIALIZED_NAME_SIMPLE_CONTRIBUTIONS = "simpleContributions";
  @SerializedName(SERIALIZED_NAME_SIMPLE_CONTRIBUTIONS)
  private Double simpleContributions;

  public static final String SERIALIZED_NAME_ROTH_IRA_CONTRIBUTIONS = "rothIraContributions";
  @SerializedName(SERIALIZED_NAME_ROTH_IRA_CONTRIBUTIONS)
  private Double rothIraContributions;

  public static final String SERIALIZED_NAME_REQUIRED_MINIMUM_DISTRIBUTION_INDICATOR = "requiredMinimumDistributionIndicator";
  @SerializedName(SERIALIZED_NAME_REQUIRED_MINIMUM_DISTRIBUTION_INDICATOR)
  private Boolean requiredMinimumDistributionIndicator;

  public static final String SERIALIZED_NAME_REQUIRED_MINIMUM_DISTRIBUTION_DATE = "requiredMinimumDistributionDate";
  @SerializedName(SERIALIZED_NAME_REQUIRED_MINIMUM_DISTRIBUTION_DATE)
  private LocalDate requiredMinimumDistributionDate;

  public static final String SERIALIZED_NAME_REQUIRED_MINIMUM_DISTRIBUTION_AMOUNT = "requiredMinimumDistributionAmount";
  @SerializedName(SERIALIZED_NAME_REQUIRED_MINIMUM_DISTRIBUTION_AMOUNT)
  private Double requiredMinimumDistributionAmount;

  public static final String SERIALIZED_NAME_POSTPONED_LATE_CONTRIBUTION = "postponedLateContribution";
  @SerializedName(SERIALIZED_NAME_POSTPONED_LATE_CONTRIBUTION)
  private Double postponedLateContribution;

  public static final String SERIALIZED_NAME_POSTPONED_LATE_CONTRIBUTION_YEAR = "postponedLateContributionYear";
  @SerializedName(SERIALIZED_NAME_POSTPONED_LATE_CONTRIBUTION_YEAR)
  private Integer postponedLateContributionYear;

  /**
   * Postponed or late contribution code. Required when &#x60;postponedLateContribution&#x60; has an amount.                * &#x60;FD&#x60; - Federally designated disaster area  * &#x60;PL&#x60; - Public law  * &#x60;EO&#x60; - Executive order  * &#x60;PO&#x60; - Rollover of a qualified plan loan offset amount  * &#x60;SC&#x60; - Late rollover under the self-certification procedure
   */
  @JsonAdapter(PostponedLateContributionCodeEnum.Adapter.class)
  public enum PostponedLateContributionCodeEnum {
    FD("FD"),
    
    PL("PL"),
    
    EO("EO"),
    
    PO("PO"),
    
    SC("SC");

    private String value;

    PostponedLateContributionCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PostponedLateContributionCodeEnum fromValue(String value) {
      for (PostponedLateContributionCodeEnum b : PostponedLateContributionCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PostponedLateContributionCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PostponedLateContributionCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PostponedLateContributionCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PostponedLateContributionCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PostponedLateContributionCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_POSTPONED_LATE_CONTRIBUTION_CODE = "postponedLateContributionCode";
  @SerializedName(SERIALIZED_NAME_POSTPONED_LATE_CONTRIBUTION_CODE)
  private PostponedLateContributionCodeEnum postponedLateContributionCode;

  public static final String SERIALIZED_NAME_POSTPONED_LATE_CONTRIBUTION_REASON = "postponedLateContributionReason";
  @SerializedName(SERIALIZED_NAME_POSTPONED_LATE_CONTRIBUTION_REASON)
  private String postponedLateContributionReason;

  public static final String SERIALIZED_NAME_REPAYMENTS = "repayments";
  @SerializedName(SERIALIZED_NAME_REPAYMENTS)
  private Double repayments;

  /**
   * Repayment code. Required when &#x60;repayments&#x60; has an amount.                * &#x60;QR&#x60; - Qualified reservist distribution  * &#x60;DD&#x60; - Federally designated disaster distribution  * &#x60;BA&#x60; - Qualified birth or adoption distribution  * &#x60;EP&#x60; - Emergency personal expense distribution  * &#x60;DA&#x60; - Domestic abuse victim distribution  * &#x60;TI&#x60; - Terminally ill individual distribution
   */
  @JsonAdapter(RepaymentCodeEnum.Adapter.class)
  public enum RepaymentCodeEnum {
    QR("QR"),
    
    DD("DD"),
    
    BA("BA"),
    
    EP("EP"),
    
    DA("DA"),
    
    TI("TI");

    private String value;

    RepaymentCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RepaymentCodeEnum fromValue(String value) {
      for (RepaymentCodeEnum b : RepaymentCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RepaymentCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RepaymentCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RepaymentCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RepaymentCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RepaymentCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REPAYMENT_CODE = "repaymentCode";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_CODE)
  private RepaymentCodeEnum repaymentCode;

  public static final String SERIALIZED_NAME_FAIR_MARKET_VALUE_OF_CERTAIN_SPECIFIED_ASSETS = "fairMarketValueOfCertainSpecifiedAssets";
  @SerializedName(SERIALIZED_NAME_FAIR_MARKET_VALUE_OF_CERTAIN_SPECIFIED_ASSETS)
  private Double fairMarketValueOfCertainSpecifiedAssets;

  /**
   * Specified asset code. Required when &#x60;fairMarketValueOfCertainSpecifiedAssets&#x60; has an amount.                * &#x60;A&#x60; - Stock or other ownership interest in a corporation that is not readily tradable on an established  securities market  * &#x60;B&#x60; - Short- or long-term debt obligation that is not traded on an established securities market  * &#x60;C&#x60; - Ownership interest in a limited liability company or similar entity (unless the interest is traded on  an established securities market)  * &#x60;D&#x60; - Real estate  * &#x60;E&#x60; - Ownership interest in a partnership, trust, or similar entity (unless the interest is traded on an  established securities market)  * &#x60;F&#x60; - Option contract or similar product that is not offered for trade on an established option exchange  * &#x60;G&#x60; - Other asset that does not have a readily available FMV  * &#x60;H&#x60; - More than two types of assets (listed in &#x60;A&#x60; through &#x60;G&#x60;) are held in this IRA
   */
  @JsonAdapter(SpecifiedAssetCodeEnum.Adapter.class)
  public enum SpecifiedAssetCodeEnum {
    A("A"),
    
    B("B"),
    
    C("C"),
    
    D("D"),
    
    E("E"),
    
    F("F"),
    
    G("G"),
    
    H("H");

    private String value;

    SpecifiedAssetCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpecifiedAssetCodeEnum fromValue(String value) {
      for (SpecifiedAssetCodeEnum b : SpecifiedAssetCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SpecifiedAssetCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpecifiedAssetCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpecifiedAssetCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpecifiedAssetCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SpecifiedAssetCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SPECIFIED_ASSET_CODE = "specifiedAssetCode";
  @SerializedName(SERIALIZED_NAME_SPECIFIED_ASSET_CODE)
  private SpecifiedAssetCodeEnum specifiedAssetCode;

  /**
   * Second specified asset code, when the IRA holds two types of specified assets. Takes the codes &#x60;A&#x60; through &#x60;G&#x60;;  it can&#39;t repeat &#x60;specifiedAssetCode&#x60;, and isn&#39;t allowed when &#x60;specifiedAssetCode&#x60; is &#x60;H&#x60;.
   */
  @JsonAdapter(SecondSpecifiedAssetCodeEnum.Adapter.class)
  public enum SecondSpecifiedAssetCodeEnum {
    A("A"),
    
    B("B"),
    
    C("C"),
    
    D("D"),
    
    E("E"),
    
    F("F"),
    
    G("G"),
    
    H("H");

    private String value;

    SecondSpecifiedAssetCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SecondSpecifiedAssetCodeEnum fromValue(String value) {
      for (SecondSpecifiedAssetCodeEnum b : SecondSpecifiedAssetCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SecondSpecifiedAssetCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecondSpecifiedAssetCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SecondSpecifiedAssetCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SecondSpecifiedAssetCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SecondSpecifiedAssetCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SECOND_SPECIFIED_ASSET_CODE = "secondSpecifiedAssetCode";
  @SerializedName(SERIALIZED_NAME_SECOND_SPECIFIED_ASSET_CODE)
  private SecondSpecifiedAssetCodeEnum secondSpecifiedAssetCode;

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

  public Form5498() {
  }

  public Form5498(
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

  public Form5498 iraContributions(Double iraContributions) {
    this.iraContributions = iraContributions;
    return this;
  }

  /**
   * IRA contributions (other than amounts in Boxes 2-4, 8-10, 13a, and 14a)
   * @return iraContributions
   */
  @javax.annotation.Nullable
  public Double getIraContributions() {
    return iraContributions;
  }

  public void setIraContributions(Double iraContributions) {
    this.iraContributions = iraContributions;
  }


  public Form5498 rolloverContributions(Double rolloverContributions) {
    this.rolloverContributions = rolloverContributions;
    return this;
  }

  /**
   * Rollover contributions
   * @return rolloverContributions
   */
  @javax.annotation.Nullable
  public Double getRolloverContributions() {
    return rolloverContributions;
  }

  public void setRolloverContributions(Double rolloverContributions) {
    this.rolloverContributions = rolloverContributions;
  }


  public Form5498 rothIraConversionAmount(Double rothIraConversionAmount) {
    this.rothIraConversionAmount = rothIraConversionAmount;
    return this;
  }

  /**
   * Roth IRA conversion amount
   * @return rothIraConversionAmount
   */
  @javax.annotation.Nullable
  public Double getRothIraConversionAmount() {
    return rothIraConversionAmount;
  }

  public void setRothIraConversionAmount(Double rothIraConversionAmount) {
    this.rothIraConversionAmount = rothIraConversionAmount;
  }


  public Form5498 recharacterizedContributions(Double recharacterizedContributions) {
    this.recharacterizedContributions = recharacterizedContributions;
    return this;
  }

  /**
   * Recharacterized contributions
   * @return recharacterizedContributions
   */
  @javax.annotation.Nullable
  public Double getRecharacterizedContributions() {
    return recharacterizedContributions;
  }

  public void setRecharacterizedContributions(Double recharacterizedContributions) {
    this.recharacterizedContributions = recharacterizedContributions;
  }


  public Form5498 fairMarketValueOfAccount(Double fairMarketValueOfAccount) {
    this.fairMarketValueOfAccount = fairMarketValueOfAccount;
    return this;
  }

  /**
   * Fair market value (FMV) of the account
   * @return fairMarketValueOfAccount
   */
  @javax.annotation.Nullable
  public Double getFairMarketValueOfAccount() {
    return fairMarketValueOfAccount;
  }

  public void setFairMarketValueOfAccount(Double fairMarketValueOfAccount) {
    this.fairMarketValueOfAccount = fairMarketValueOfAccount;
  }


  public Form5498 lifeInsuranceCostIncludedInIraContributions(Double lifeInsuranceCostIncludedInIraContributions) {
    this.lifeInsuranceCostIncludedInIraContributions = lifeInsuranceCostIncludedInIraContributions;
    return this;
  }

  /**
   * Life insurance cost included in the IRA contributions (Box 1). Can&#39;t be more than Box 1.
   * @return lifeInsuranceCostIncludedInIraContributions
   */
  @javax.annotation.Nullable
  public Double getLifeInsuranceCostIncludedInIraContributions() {
    return lifeInsuranceCostIncludedInIraContributions;
  }

  public void setLifeInsuranceCostIncludedInIraContributions(Double lifeInsuranceCostIncludedInIraContributions) {
    this.lifeInsuranceCostIncludedInIraContributions = lifeInsuranceCostIncludedInIraContributions;
  }


  public Form5498 iraType(IraTypeEnum iraType) {
    this.iraType = iraType;
    return this;
  }

  /**
   * Type of IRA. Required when Box 2 or Box 5 has an amount.                * &#x60;IRA&#x60; - Traditional IRA  * &#x60;SEP&#x60; - SEP IRA  * &#x60;SIMPLE&#x60; - SIMPLE IRA  * &#x60;ROTH&#x60; - Roth IRA
   * @return iraType
   */
  @javax.annotation.Nullable
  public IraTypeEnum getIraType() {
    return iraType;
  }

  public void setIraType(IraTypeEnum iraType) {
    this.iraType = iraType;
  }


  public Form5498 sepContributions(Double sepContributions) {
    this.sepContributions = sepContributions;
    return this;
  }

  /**
   * SEP contributions. Only allowed when &#x60;iraType&#x60; is &#x60;SEP&#x60;.
   * @return sepContributions
   */
  @javax.annotation.Nullable
  public Double getSepContributions() {
    return sepContributions;
  }

  public void setSepContributions(Double sepContributions) {
    this.sepContributions = sepContributions;
  }


  public Form5498 simpleContributions(Double simpleContributions) {
    this.simpleContributions = simpleContributions;
    return this;
  }

  /**
   * SIMPLE contributions. Only allowed when &#x60;iraType&#x60; is &#x60;SIMPLE&#x60;.
   * @return simpleContributions
   */
  @javax.annotation.Nullable
  public Double getSimpleContributions() {
    return simpleContributions;
  }

  public void setSimpleContributions(Double simpleContributions) {
    this.simpleContributions = simpleContributions;
  }


  public Form5498 rothIraContributions(Double rothIraContributions) {
    this.rothIraContributions = rothIraContributions;
    return this;
  }

  /**
   * Roth IRA contributions. Only allowed when &#x60;iraType&#x60; is &#x60;ROTH&#x60;.
   * @return rothIraContributions
   */
  @javax.annotation.Nullable
  public Double getRothIraContributions() {
    return rothIraContributions;
  }

  public void setRothIraContributions(Double rothIraContributions) {
    this.rothIraContributions = rothIraContributions;
  }


  public Form5498 requiredMinimumDistributionIndicator(Boolean requiredMinimumDistributionIndicator) {
    this.requiredMinimumDistributionIndicator = requiredMinimumDistributionIndicator;
    return this;
  }

  /**
   * If checked, a required minimum distribution (RMD) is due for the year after the tax year
   * @return requiredMinimumDistributionIndicator
   */
  @javax.annotation.Nullable
  public Boolean getRequiredMinimumDistributionIndicator() {
    return requiredMinimumDistributionIndicator;
  }

  public void setRequiredMinimumDistributionIndicator(Boolean requiredMinimumDistributionIndicator) {
    this.requiredMinimumDistributionIndicator = requiredMinimumDistributionIndicator;
  }


  public Form5498 requiredMinimumDistributionDate(LocalDate requiredMinimumDistributionDate) {
    this.requiredMinimumDistributionDate = requiredMinimumDistributionDate;
    return this;
  }

  /**
   * RMD date, in the year after the tax year. Required when &#x60;requiredMinimumDistributionIndicator&#x60; is &#x60;true&#x60;.
   * @return requiredMinimumDistributionDate
   */
  @javax.annotation.Nullable
  public LocalDate getRequiredMinimumDistributionDate() {
    return requiredMinimumDistributionDate;
  }

  public void setRequiredMinimumDistributionDate(LocalDate requiredMinimumDistributionDate) {
    this.requiredMinimumDistributionDate = requiredMinimumDistributionDate;
  }


  public Form5498 requiredMinimumDistributionAmount(Double requiredMinimumDistributionAmount) {
    this.requiredMinimumDistributionAmount = requiredMinimumDistributionAmount;
    return this;
  }

  /**
   * RMD amount. Required when &#x60;requiredMinimumDistributionIndicator&#x60; is &#x60;true&#x60;.
   * @return requiredMinimumDistributionAmount
   */
  @javax.annotation.Nullable
  public Double getRequiredMinimumDistributionAmount() {
    return requiredMinimumDistributionAmount;
  }

  public void setRequiredMinimumDistributionAmount(Double requiredMinimumDistributionAmount) {
    this.requiredMinimumDistributionAmount = requiredMinimumDistributionAmount;
  }


  public Form5498 postponedLateContribution(Double postponedLateContribution) {
    this.postponedLateContribution = postponedLateContribution;
    return this;
  }

  /**
   * Postponed or late contribution
   * @return postponedLateContribution
   */
  @javax.annotation.Nullable
  public Double getPostponedLateContribution() {
    return postponedLateContribution;
  }

  public void setPostponedLateContribution(Double postponedLateContribution) {
    this.postponedLateContribution = postponedLateContribution;
  }


  public Form5498 postponedLateContributionYear(Integer postponedLateContributionYear) {
    this.postponedLateContributionYear = postponedLateContributionYear;
    return this;
  }

  /**
   * Year the postponed or late contribution was for (four digits, from 1998 to the tax year). Required when  &#x60;postponedLateContribution&#x60; has an amount.
   * @return postponedLateContributionYear
   */
  @javax.annotation.Nullable
  public Integer getPostponedLateContributionYear() {
    return postponedLateContributionYear;
  }

  public void setPostponedLateContributionYear(Integer postponedLateContributionYear) {
    this.postponedLateContributionYear = postponedLateContributionYear;
  }


  public Form5498 postponedLateContributionCode(PostponedLateContributionCodeEnum postponedLateContributionCode) {
    this.postponedLateContributionCode = postponedLateContributionCode;
    return this;
  }

  /**
   * Postponed or late contribution code. Required when &#x60;postponedLateContribution&#x60; has an amount.                * &#x60;FD&#x60; - Federally designated disaster area  * &#x60;PL&#x60; - Public law  * &#x60;EO&#x60; - Executive order  * &#x60;PO&#x60; - Rollover of a qualified plan loan offset amount  * &#x60;SC&#x60; - Late rollover under the self-certification procedure
   * @return postponedLateContributionCode
   */
  @javax.annotation.Nullable
  public PostponedLateContributionCodeEnum getPostponedLateContributionCode() {
    return postponedLateContributionCode;
  }

  public void setPostponedLateContributionCode(PostponedLateContributionCodeEnum postponedLateContributionCode) {
    this.postponedLateContributionCode = postponedLateContributionCode;
  }


  public Form5498 postponedLateContributionReason(String postponedLateContributionReason) {
    this.postponedLateContributionReason = postponedLateContributionReason;
    return this;
  }

  /**
   * Postponed or late contribution reason, such as the public law or executive order number (up to 6 characters)
   * @return postponedLateContributionReason
   */
  @javax.annotation.Nullable
  public String getPostponedLateContributionReason() {
    return postponedLateContributionReason;
  }

  public void setPostponedLateContributionReason(String postponedLateContributionReason) {
    this.postponedLateContributionReason = postponedLateContributionReason;
  }


  public Form5498 repayments(Double repayments) {
    this.repayments = repayments;
    return this;
  }

  /**
   * Repayments
   * @return repayments
   */
  @javax.annotation.Nullable
  public Double getRepayments() {
    return repayments;
  }

  public void setRepayments(Double repayments) {
    this.repayments = repayments;
  }


  public Form5498 repaymentCode(RepaymentCodeEnum repaymentCode) {
    this.repaymentCode = repaymentCode;
    return this;
  }

  /**
   * Repayment code. Required when &#x60;repayments&#x60; has an amount.                * &#x60;QR&#x60; - Qualified reservist distribution  * &#x60;DD&#x60; - Federally designated disaster distribution  * &#x60;BA&#x60; - Qualified birth or adoption distribution  * &#x60;EP&#x60; - Emergency personal expense distribution  * &#x60;DA&#x60; - Domestic abuse victim distribution  * &#x60;TI&#x60; - Terminally ill individual distribution
   * @return repaymentCode
   */
  @javax.annotation.Nullable
  public RepaymentCodeEnum getRepaymentCode() {
    return repaymentCode;
  }

  public void setRepaymentCode(RepaymentCodeEnum repaymentCode) {
    this.repaymentCode = repaymentCode;
  }


  public Form5498 fairMarketValueOfCertainSpecifiedAssets(Double fairMarketValueOfCertainSpecifiedAssets) {
    this.fairMarketValueOfCertainSpecifiedAssets = fairMarketValueOfCertainSpecifiedAssets;
    return this;
  }

  /**
   * FMV of certain specified assets
   * @return fairMarketValueOfCertainSpecifiedAssets
   */
  @javax.annotation.Nullable
  public Double getFairMarketValueOfCertainSpecifiedAssets() {
    return fairMarketValueOfCertainSpecifiedAssets;
  }

  public void setFairMarketValueOfCertainSpecifiedAssets(Double fairMarketValueOfCertainSpecifiedAssets) {
    this.fairMarketValueOfCertainSpecifiedAssets = fairMarketValueOfCertainSpecifiedAssets;
  }


  public Form5498 specifiedAssetCode(SpecifiedAssetCodeEnum specifiedAssetCode) {
    this.specifiedAssetCode = specifiedAssetCode;
    return this;
  }

  /**
   * Specified asset code. Required when &#x60;fairMarketValueOfCertainSpecifiedAssets&#x60; has an amount.                * &#x60;A&#x60; - Stock or other ownership interest in a corporation that is not readily tradable on an established  securities market  * &#x60;B&#x60; - Short- or long-term debt obligation that is not traded on an established securities market  * &#x60;C&#x60; - Ownership interest in a limited liability company or similar entity (unless the interest is traded on  an established securities market)  * &#x60;D&#x60; - Real estate  * &#x60;E&#x60; - Ownership interest in a partnership, trust, or similar entity (unless the interest is traded on an  established securities market)  * &#x60;F&#x60; - Option contract or similar product that is not offered for trade on an established option exchange  * &#x60;G&#x60; - Other asset that does not have a readily available FMV  * &#x60;H&#x60; - More than two types of assets (listed in &#x60;A&#x60; through &#x60;G&#x60;) are held in this IRA
   * @return specifiedAssetCode
   */
  @javax.annotation.Nullable
  public SpecifiedAssetCodeEnum getSpecifiedAssetCode() {
    return specifiedAssetCode;
  }

  public void setSpecifiedAssetCode(SpecifiedAssetCodeEnum specifiedAssetCode) {
    this.specifiedAssetCode = specifiedAssetCode;
  }


  public Form5498 secondSpecifiedAssetCode(SecondSpecifiedAssetCodeEnum secondSpecifiedAssetCode) {
    this.secondSpecifiedAssetCode = secondSpecifiedAssetCode;
    return this;
  }

  /**
   * Second specified asset code, when the IRA holds two types of specified assets. Takes the codes &#x60;A&#x60; through &#x60;G&#x60;;  it can&#39;t repeat &#x60;specifiedAssetCode&#x60;, and isn&#39;t allowed when &#x60;specifiedAssetCode&#x60; is &#x60;H&#x60;.
   * @return secondSpecifiedAssetCode
   */
  @javax.annotation.Nullable
  public SecondSpecifiedAssetCodeEnum getSecondSpecifiedAssetCode() {
    return secondSpecifiedAssetCode;
  }

  public void setSecondSpecifiedAssetCode(SecondSpecifiedAssetCodeEnum secondSpecifiedAssetCode) {
    this.secondSpecifiedAssetCode = secondSpecifiedAssetCode;
  }


  public Form5498 type(TypeEnum type) {
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



  public Form5498 issuerId(String issuerId) {
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


  public Form5498 issuerReferenceId(String issuerReferenceId) {
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


  public Form5498 issuerTin(String issuerTin) {
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


  public Form5498 taxYear(Integer taxYear) {
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


  public Form5498 referenceId(String referenceId) {
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


  public Form5498 tin(String tin) {
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
  public Form5498 recipientName(String recipientName) {
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


  public Form5498 address(String address) {
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


  public Form5498 address2(String address2) {
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


  public Form5498 city(String city) {
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


  public Form5498 state(String state) {
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


  public Form5498 zip(String zip) {
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


  public Form5498 email(String email) {
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


  public Form5498 nonUsProvince(String nonUsProvince) {
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


  public Form5498 countryCode(String countryCode) {
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


  public Form5498 federalEfileDate(LocalDate federalEfileDate) {
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


  public Form5498 postalMail(Boolean postalMail) {
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


  public Form5498 stateEfileDate(LocalDate stateEfileDate) {
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


  public Form5498 recipientEdeliveryDate(LocalDate recipientEdeliveryDate) {
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


  public Form5498 tinMatch(Boolean tinMatch) {
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


  public Form5498 addressVerification(Boolean addressVerification) {
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


  public Form5498 stateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
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



  public Form5498 tinType(TinTypeEnum tinType) {
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


  public Form5498 businessName(String businessName) {
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


  public Form5498 businessName2(String businessName2) {
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


  public Form5498 firstName(String firstName) {
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


  public Form5498 middleName(String middleName) {
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


  public Form5498 lastName(String lastName) {
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


  public Form5498 suffixName(String suffixName) {
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
  public Form5498 recipientSecondName(String recipientSecondName) {
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


  public Form5498 accountNumber(String accountNumber) {
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


  public Form5498 officeCode(String officeCode) {
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


  public Form5498 noTin(Boolean noTin) {
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


  public Form5498 secondTinNotice(Boolean secondTinNotice) {
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
   * @return the Form5498 instance itself
   */
  public Form5498 putAdditionalProperty(String key, Object value) {
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
    Form5498 form5498 = (Form5498) o;
    return Objects.equals(this.iraContributions, form5498.iraContributions) &&
        Objects.equals(this.rolloverContributions, form5498.rolloverContributions) &&
        Objects.equals(this.rothIraConversionAmount, form5498.rothIraConversionAmount) &&
        Objects.equals(this.recharacterizedContributions, form5498.recharacterizedContributions) &&
        Objects.equals(this.fairMarketValueOfAccount, form5498.fairMarketValueOfAccount) &&
        Objects.equals(this.lifeInsuranceCostIncludedInIraContributions, form5498.lifeInsuranceCostIncludedInIraContributions) &&
        Objects.equals(this.iraType, form5498.iraType) &&
        Objects.equals(this.sepContributions, form5498.sepContributions) &&
        Objects.equals(this.simpleContributions, form5498.simpleContributions) &&
        Objects.equals(this.rothIraContributions, form5498.rothIraContributions) &&
        Objects.equals(this.requiredMinimumDistributionIndicator, form5498.requiredMinimumDistributionIndicator) &&
        Objects.equals(this.requiredMinimumDistributionDate, form5498.requiredMinimumDistributionDate) &&
        Objects.equals(this.requiredMinimumDistributionAmount, form5498.requiredMinimumDistributionAmount) &&
        Objects.equals(this.postponedLateContribution, form5498.postponedLateContribution) &&
        Objects.equals(this.postponedLateContributionYear, form5498.postponedLateContributionYear) &&
        Objects.equals(this.postponedLateContributionCode, form5498.postponedLateContributionCode) &&
        Objects.equals(this.postponedLateContributionReason, form5498.postponedLateContributionReason) &&
        Objects.equals(this.repayments, form5498.repayments) &&
        Objects.equals(this.repaymentCode, form5498.repaymentCode) &&
        Objects.equals(this.fairMarketValueOfCertainSpecifiedAssets, form5498.fairMarketValueOfCertainSpecifiedAssets) &&
        Objects.equals(this.specifiedAssetCode, form5498.specifiedAssetCode) &&
        Objects.equals(this.secondSpecifiedAssetCode, form5498.secondSpecifiedAssetCode) &&
        Objects.equals(this.type, form5498.type) &&
        Objects.equals(this.id, form5498.id) &&
        Objects.equals(this.issuerId, form5498.issuerId) &&
        Objects.equals(this.issuerReferenceId, form5498.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form5498.issuerTin) &&
        Objects.equals(this.taxYear, form5498.taxYear) &&
        Objects.equals(this.referenceId, form5498.referenceId) &&
        Objects.equals(this.tin, form5498.tin) &&
        Objects.equals(this.recipientName, form5498.recipientName) &&
        Objects.equals(this.address, form5498.address) &&
        Objects.equals(this.address2, form5498.address2) &&
        Objects.equals(this.city, form5498.city) &&
        Objects.equals(this.state, form5498.state) &&
        Objects.equals(this.zip, form5498.zip) &&
        Objects.equals(this.email, form5498.email) &&
        Objects.equals(this.nonUsProvince, form5498.nonUsProvince) &&
        Objects.equals(this.countryCode, form5498.countryCode) &&
        Objects.equals(this.federalEfileDate, form5498.federalEfileDate) &&
        Objects.equals(this.postalMail, form5498.postalMail) &&
        Objects.equals(this.stateEfileDate, form5498.stateEfileDate) &&
        Objects.equals(this.recipientEdeliveryDate, form5498.recipientEdeliveryDate) &&
        Objects.equals(this.tinMatch, form5498.tinMatch) &&
        Objects.equals(this.addressVerification, form5498.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form5498.stateAndLocalWithholding) &&
        Objects.equals(this.federalEfileStatus, form5498.federalEfileStatus) &&
        Objects.equals(this.stateEfileStatus, form5498.stateEfileStatus) &&
        Objects.equals(this.postalMailStatus, form5498.postalMailStatus) &&
        Objects.equals(this.tinMatchStatus, form5498.tinMatchStatus) &&
        Objects.equals(this.addressVerificationStatus, form5498.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form5498.eDeliveryStatus) &&
        Objects.equals(this.validationErrors, form5498.validationErrors) &&
        Objects.equals(this.createdAt, form5498.createdAt) &&
        Objects.equals(this.updatedAt, form5498.updatedAt) &&
        Objects.equals(this.tinType, form5498.tinType) &&
        Objects.equals(this.businessName, form5498.businessName) &&
        Objects.equals(this.businessName2, form5498.businessName2) &&
        Objects.equals(this.firstName, form5498.firstName) &&
        Objects.equals(this.middleName, form5498.middleName) &&
        Objects.equals(this.lastName, form5498.lastName) &&
        Objects.equals(this.suffixName, form5498.suffixName) &&
        Objects.equals(this.recipientSecondName, form5498.recipientSecondName) &&
        Objects.equals(this.accountNumber, form5498.accountNumber) &&
        Objects.equals(this.officeCode, form5498.officeCode) &&
        Objects.equals(this.noTin, form5498.noTin) &&
        Objects.equals(this.secondTinNotice, form5498.secondTinNotice)&&
        Objects.equals(this.additionalProperties, form5498.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(iraContributions, rolloverContributions, rothIraConversionAmount, recharacterizedContributions, fairMarketValueOfAccount, lifeInsuranceCostIncludedInIraContributions, iraType, sepContributions, simpleContributions, rothIraContributions, requiredMinimumDistributionIndicator, requiredMinimumDistributionDate, requiredMinimumDistributionAmount, postponedLateContribution, postponedLateContributionYear, postponedLateContributionCode, postponedLateContributionReason, repayments, repaymentCode, fairMarketValueOfCertainSpecifiedAssets, specifiedAssetCode, secondSpecifiedAssetCode, type, id, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, tin, recipientName, address, address2, city, state, zip, email, nonUsProvince, countryCode, federalEfileDate, postalMail, stateEfileDate, recipientEdeliveryDate, tinMatch, addressVerification, stateAndLocalWithholding, federalEfileStatus, stateEfileStatus, postalMailStatus, tinMatchStatus, addressVerificationStatus, eDeliveryStatus, validationErrors, createdAt, updatedAt, tinType, businessName, businessName2, firstName, middleName, lastName, suffixName, recipientSecondName, accountNumber, officeCode, noTin, secondTinNotice, additionalProperties);
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
    sb.append("class Form5498 {\n");
    sb.append("    iraContributions: ").append(toIndentedString(iraContributions)).append("\n");
    sb.append("    rolloverContributions: ").append(toIndentedString(rolloverContributions)).append("\n");
    sb.append("    rothIraConversionAmount: ").append(toIndentedString(rothIraConversionAmount)).append("\n");
    sb.append("    recharacterizedContributions: ").append(toIndentedString(recharacterizedContributions)).append("\n");
    sb.append("    fairMarketValueOfAccount: ").append(toIndentedString(fairMarketValueOfAccount)).append("\n");
    sb.append("    lifeInsuranceCostIncludedInIraContributions: ").append(toIndentedString(lifeInsuranceCostIncludedInIraContributions)).append("\n");
    sb.append("    iraType: ").append(toIndentedString(iraType)).append("\n");
    sb.append("    sepContributions: ").append(toIndentedString(sepContributions)).append("\n");
    sb.append("    simpleContributions: ").append(toIndentedString(simpleContributions)).append("\n");
    sb.append("    rothIraContributions: ").append(toIndentedString(rothIraContributions)).append("\n");
    sb.append("    requiredMinimumDistributionIndicator: ").append(toIndentedString(requiredMinimumDistributionIndicator)).append("\n");
    sb.append("    requiredMinimumDistributionDate: ").append(toIndentedString(requiredMinimumDistributionDate)).append("\n");
    sb.append("    requiredMinimumDistributionAmount: ").append(toIndentedString(requiredMinimumDistributionAmount)).append("\n");
    sb.append("    postponedLateContribution: ").append(toIndentedString(postponedLateContribution)).append("\n");
    sb.append("    postponedLateContributionYear: ").append(toIndentedString(postponedLateContributionYear)).append("\n");
    sb.append("    postponedLateContributionCode: ").append(toIndentedString(postponedLateContributionCode)).append("\n");
    sb.append("    postponedLateContributionReason: ").append(toIndentedString(postponedLateContributionReason)).append("\n");
    sb.append("    repayments: ").append(toIndentedString(repayments)).append("\n");
    sb.append("    repaymentCode: ").append(toIndentedString(repaymentCode)).append("\n");
    sb.append("    fairMarketValueOfCertainSpecifiedAssets: ").append(toIndentedString(fairMarketValueOfCertainSpecifiedAssets)).append("\n");
    sb.append("    specifiedAssetCode: ").append(toIndentedString(specifiedAssetCode)).append("\n");
    sb.append("    secondSpecifiedAssetCode: ").append(toIndentedString(secondSpecifiedAssetCode)).append("\n");
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
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("countryCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form5498
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form5498.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form5498 is not found in the empty JSON string", Form5498.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form5498.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("iraType") != null && !jsonObj.get("iraType").isJsonNull()) && !jsonObj.get("iraType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iraType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iraType").toString()));
      }
      // validate the optional field `iraType`
      if (jsonObj.get("iraType") != null && !jsonObj.get("iraType").isJsonNull()) {
        IraTypeEnum.validateJsonElement(jsonObj.get("iraType"));
      }
      if ((jsonObj.get("postponedLateContributionCode") != null && !jsonObj.get("postponedLateContributionCode").isJsonNull()) && !jsonObj.get("postponedLateContributionCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postponedLateContributionCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postponedLateContributionCode").toString()));
      }
      // validate the optional field `postponedLateContributionCode`
      if (jsonObj.get("postponedLateContributionCode") != null && !jsonObj.get("postponedLateContributionCode").isJsonNull()) {
        PostponedLateContributionCodeEnum.validateJsonElement(jsonObj.get("postponedLateContributionCode"));
      }
      if ((jsonObj.get("postponedLateContributionReason") != null && !jsonObj.get("postponedLateContributionReason").isJsonNull()) && !jsonObj.get("postponedLateContributionReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postponedLateContributionReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postponedLateContributionReason").toString()));
      }
      if ((jsonObj.get("repaymentCode") != null && !jsonObj.get("repaymentCode").isJsonNull()) && !jsonObj.get("repaymentCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `repaymentCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("repaymentCode").toString()));
      }
      // validate the optional field `repaymentCode`
      if (jsonObj.get("repaymentCode") != null && !jsonObj.get("repaymentCode").isJsonNull()) {
        RepaymentCodeEnum.validateJsonElement(jsonObj.get("repaymentCode"));
      }
      if ((jsonObj.get("specifiedAssetCode") != null && !jsonObj.get("specifiedAssetCode").isJsonNull()) && !jsonObj.get("specifiedAssetCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specifiedAssetCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specifiedAssetCode").toString()));
      }
      // validate the optional field `specifiedAssetCode`
      if (jsonObj.get("specifiedAssetCode") != null && !jsonObj.get("specifiedAssetCode").isJsonNull()) {
        SpecifiedAssetCodeEnum.validateJsonElement(jsonObj.get("specifiedAssetCode"));
      }
      if ((jsonObj.get("secondSpecifiedAssetCode") != null && !jsonObj.get("secondSpecifiedAssetCode").isJsonNull()) && !jsonObj.get("secondSpecifiedAssetCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondSpecifiedAssetCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondSpecifiedAssetCode").toString()));
      }
      // validate the optional field `secondSpecifiedAssetCode`
      if (jsonObj.get("secondSpecifiedAssetCode") != null && !jsonObj.get("secondSpecifiedAssetCode").isJsonNull()) {
        SecondSpecifiedAssetCodeEnum.validateJsonElement(jsonObj.get("secondSpecifiedAssetCode"));
      }
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
       if (!Form5498.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form5498' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form5498> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form5498.class));

       return (TypeAdapter<T>) new TypeAdapter<Form5498>() {
           @Override
           public void write(JsonWriter out, Form5498 value) throws IOException {
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
           public Form5498 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Form5498 instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of Form5498 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form5498
   * @throws IOException if the JSON string is invalid with respect to Form5498
   */
  public static Form5498 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form5498.class);
  }

  /**
   * Convert an instance of Form5498 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

