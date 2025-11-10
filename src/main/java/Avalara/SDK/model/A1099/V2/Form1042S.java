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
 * Form 1042-S: Foreign Person&#39;s U.S. Source Income Subject to Withholding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1042S {
  /**
   * Tax Identification Number (TIN) type.  Available values: - EIN: Employer Identification Number - SSN: Social Security Number - ITIN: Individual Taxpayer Identification Number - ATIN: Adoption Taxpayer Identification Number
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

  public static final String SERIALIZED_NAME_UNIQUE_FORM_ID = "uniqueFormId";
  @SerializedName(SERIALIZED_NAME_UNIQUE_FORM_ID)
  private String uniqueFormId;

  public static final String SERIALIZED_NAME_RECIPIENT_DATE_OF_BIRTH = "recipientDateOfBirth";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_DATE_OF_BIRTH)
  private LocalDate recipientDateOfBirth;

  public static final String SERIALIZED_NAME_RECIPIENT_GIIN = "recipientGiin";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_GIIN)
  private String recipientGiin;

  public static final String SERIALIZED_NAME_RECIPIENT_FOREIGN_TIN = "recipientForeignTin";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_FOREIGN_TIN)
  private String recipientForeignTin;

  /**
   * Limitation on Benefits (LOB) code for tax treaty purposes.  Available values:  - 01: Individual (Deprecated - valid only for tax years prior to 2019)  - 02: Government - contracting state/political subdivision/local authority  - 03: Tax exempt pension trust/Pension fund  - 04: Tax exempt/Charitable organization  - 05: Publicly-traded corporation  - 06: Subsidiary of publicly-traded corporation  - 07: Company that meets the ownership and base erosion test  - 08: Company that meets the derivative benefits test  - 09: Company with an item of income that meets the active trade or business test  - 10: Discretionary determination  - 11: Other  - 12: No LOB article in treaty
   */
  @JsonAdapter(LobCodeEnum.Adapter.class)
  public enum LobCodeEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _09("09"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12");

    private String value;

    LobCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LobCodeEnum fromValue(String value) {
      for (LobCodeEnum b : LobCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LobCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LobCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LobCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LobCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LobCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LOB_CODE = "lobCode";
  @SerializedName(SERIALIZED_NAME_LOB_CODE)
  private LobCodeEnum lobCode;

  /**
   * Income code.  Available values:    Interest:  - 01: Interest paid by US obligors - general  - 02: Interest paid on real property mortgages  - 03: Interest paid to controlling foreign corporations  - 04: Interest paid by foreign corporations  - 05: Interest on tax-free covenant bonds  - 22: Interest paid on deposit with a foreign branch of a domestic corporation or partnership  - 29: Deposit interest  - 30: Original issue discount (OID)  - 31: Short-term OID  - 33: Substitute payment - interest  - 51: Interest paid on certain actively traded or publicly offered securities(1)  - 54: Substitute payments - interest from certain actively traded or publicly offered securities(1)    Dividend:  - 06: Dividends paid by U.S. corporations - general  - 07: Dividends qualifying for direct dividend rate  - 08: Dividends paid by foreign corporations  - 34: Substitute payment - dividends  - 40: Other dividend equivalents under IRC section 871(m) (formerly 871(l))  - 52: Dividends paid on certain actively traded or publicly offered securities(1)  - 53: Substitute payments - dividends from certain actively traded or publicly offered securities(1)  - 56: Dividend equivalents under IRC section 871(m) as a result of applying the combined transaction rules    Other:  - 09: Capital gains  - 10: Industrial royalties  - 11: Motion picture or television copyright royalties  - 12: Other royalties (for example, copyright, software, broadcasting, endorsement payments)  - 13: Royalties paid on certain publicly offered securities(1)  - 14: Real property income and natural resources royalties  - 15: Pensions, annuities, alimony, and/or insurance premiums  - 16: Scholarship or fellowship grants  - 17: Compensation for independent personal services(2)  - 18: Compensation for dependent personal services(2)  - 19: Compensation for teaching(2)  - 20: Compensation during studying and training(2)  - 23: Other income  - 24: Qualified investment entity (QIE) distributions of capital gains  - 25: Trust distributions subject to IRC section 1445  - 26: Unsevered growing crops and timber distributions by a trust subject to IRC section 1445  - 27: Publicly traded partnership distributions subject to IRC section 1446  - 28: Gambling winnings(3)  - 32: Notional principal contract income(4)  - 35: Substitute payment - other  - 36: Capital gains distributions  - 37: Return of capital  - 38: Eligible deferred compensation items subject to IRC section 877A(d)(1)  - 39: Distributions from a nongrantor trust subject to IRC section 877A(f)(1)  - 41: Guarantee of indebtedness  - 42: Earnings as an artist or athlete - no central withholding agreement(5)  - 43: Earnings as an artist or athlete - central withholding agreement(5)  - 44: Specified Federal procurement payments  - 50: Income previously reported under escrow procedure(6)  - 55: Taxable death benefits on life insurance contracts  - 57: Amount realized under IRC section 1446(f)  - 58: Publicly traded partnership distributions-undetermined
   */
  @JsonAdapter(IncomeCodeEnum.Adapter.class)
  public enum IncomeCodeEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _22("22"),
    
    _29("29"),
    
    _30("30"),
    
    _31("31"),
    
    _33("33"),
    
    _51("51"),
    
    _54("54"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _34("34"),
    
    _40("40"),
    
    _52("52"),
    
    _53("53"),
    
    _56("56"),
    
    _09("09"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12"),
    
    _13("13"),
    
    _14("14"),
    
    _15("15"),
    
    _16("16"),
    
    _17("17"),
    
    _18("18"),
    
    _19("19"),
    
    _20("20"),
    
    _23("23"),
    
    _24("24"),
    
    _25("25"),
    
    _26("26"),
    
    _27("27"),
    
    _28("28"),
    
    _32("32"),
    
    _35("35"),
    
    _36("36"),
    
    _37("37"),
    
    _38("38"),
    
    _39("39"),
    
    _41("41"),
    
    _42("42"),
    
    _43("43"),
    
    _44("44"),
    
    _50("50"),
    
    _55("55"),
    
    _57("57"),
    
    _58("58");

    private String value;

    IncomeCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IncomeCodeEnum fromValue(String value) {
      for (IncomeCodeEnum b : IncomeCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<IncomeCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IncomeCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IncomeCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IncomeCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      IncomeCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_INCOME_CODE = "incomeCode";
  @SerializedName(SERIALIZED_NAME_INCOME_CODE)
  private IncomeCodeEnum incomeCode;

  public static final String SERIALIZED_NAME_GROSS_INCOME = "grossIncome";
  @SerializedName(SERIALIZED_NAME_GROSS_INCOME)
  private Double grossIncome;

  /**
   * Withholding indicator  Available values:  - 3: Chapter 3  - 4: Chapter 4
   */
  @JsonAdapter(WithholdingIndicatorEnum.Adapter.class)
  public enum WithholdingIndicatorEnum {
    _3("3"),
    
    _4("4");

    private String value;

    WithholdingIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WithholdingIndicatorEnum fromValue(String value) {
      for (WithholdingIndicatorEnum b : WithholdingIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WithholdingIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WithholdingIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WithholdingIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WithholdingIndicatorEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WithholdingIndicatorEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WITHHOLDING_INDICATOR = "withholdingIndicator";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_INDICATOR)
  private WithholdingIndicatorEnum withholdingIndicator;

  public static final String SERIALIZED_NAME_TAX_COUNTRY_CODE = "taxCountryCode";
  @SerializedName(SERIALIZED_NAME_TAX_COUNTRY_CODE)
  private String taxCountryCode;

  /**
   * Exemption code (Chapter 3). Required if WithholdingIndicator is 3 (Chapter 3). Required when using TaxRateChap3.  Available values:  - Empty: Tax rate is due to backup withholding  - 00: Not exempt  - 01: Effectively connected income  - 02: Exempt under IRC (other than portfolio interest)  - 03: Income is not from US sources  - 04: Exempt under tax treaty  - 05: Portfolio interest exempt under IRC  - 06: QI that assumes primary withholding responsibility  - 07: WFP or WFT  - 08: U.S. branch treated as U.S. Person  - 09: Territory FI treated as U.S. Person  - 10: QI represents that income is exempt  - 11: QSL that assumes primary withholding responsibility  - 12: Payee subjected to chapter 4 withholding  - 22: QDD that assumes primary withholding responsibility  - 23: Exempt under section 897(l)  - 24: Exempt under section 892
   */
  @JsonAdapter(ExemptionCodeChap3Enum.Adapter.class)
  public enum ExemptionCodeChap3Enum {
    _00("00"),
    
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _09("09"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12"),
    
    _22("22"),
    
    _23("23"),
    
    _24("24");

    private String value;

    ExemptionCodeChap3Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExemptionCodeChap3Enum fromValue(String value) {
      for (ExemptionCodeChap3Enum b : ExemptionCodeChap3Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExemptionCodeChap3Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExemptionCodeChap3Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExemptionCodeChap3Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExemptionCodeChap3Enum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ExemptionCodeChap3Enum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EXEMPTION_CODE_CHAP3 = "exemptionCodeChap3";
  @SerializedName(SERIALIZED_NAME_EXEMPTION_CODE_CHAP3)
  private ExemptionCodeChap3Enum exemptionCodeChap3;

  /**
   * Exemption code (Chapter 4). Required if WithholdingIndicator is 4 (Chapter 4).  Available values:  - 00: Not exempt  - 13: Grandfathered payment  - 14: Effectively connected income  - 15: Payee not subject to chapter 4 withholding  - 16: Excluded nonfinancial payment  - 17: Foreign Entity that assumes primary withholding responsibility  - 18: U.S. Payees - of participating FFI or registered deemed - compliant FFI  - 19: Exempt from withholding under IGA(6)  - 20: Dormant account(7)  - 21: Other - payment not subject to chapter 4 withholding
   */
  @JsonAdapter(ExemptionCodeChap4Enum.Adapter.class)
  public enum ExemptionCodeChap4Enum {
    _00("00"),
    
    _13("13"),
    
    _14("14"),
    
    _15("15"),
    
    _16("16"),
    
    _17("17"),
    
    _18("18"),
    
    _19("19"),
    
    _20("20"),
    
    _21("21");

    private String value;

    ExemptionCodeChap4Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExemptionCodeChap4Enum fromValue(String value) {
      for (ExemptionCodeChap4Enum b : ExemptionCodeChap4Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExemptionCodeChap4Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExemptionCodeChap4Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExemptionCodeChap4Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExemptionCodeChap4Enum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ExemptionCodeChap4Enum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EXEMPTION_CODE_CHAP4 = "exemptionCodeChap4";
  @SerializedName(SERIALIZED_NAME_EXEMPTION_CODE_CHAP4)
  private ExemptionCodeChap4Enum exemptionCodeChap4;

  /**
   * Tax rate (Chapter 3) - Required if WithholdingIndicator is 3 (Chapter 3).  Available values:  - 00.00: 0.00%  - 02.00: 2.00%  - 04.00: 4.00%  - 04.90: 4.90%  - 04.95: 4.95%  - 05.00: 5.00%  - 07.00: 7.00%  - 08.00: 8.00%  - 10.00: 10.00%  - 12.00: 12.00%  - 12.50: 12.50%  - 14.00: 14.00%  - 15.00: 15.00%  - 17.50: 17.50%  - 20.00: 20.00%  - 21.00: 21.00%  - 24.00: 24.00%  - 25.00: 25.00%  - 27.50: 27.50%  - 28.00: 28.00%  - 30.00: 30.00%  - 37.00: 37.00%
   */
  @JsonAdapter(TaxRateChap3Enum.Adapter.class)
  public enum TaxRateChap3Enum {
    _00_00("00.00"),
    
    _02_00("02.00"),
    
    _04_00("04.00"),
    
    _04_90("04.90"),
    
    _04_95("04.95"),
    
    _05_00("05.00"),
    
    _07_00("07.00"),
    
    _08_00("08.00"),
    
    _10_00("10.00"),
    
    _12_00("12.00"),
    
    _12_50("12.50"),
    
    _14_00("14.00"),
    
    _15_00("15.00"),
    
    _17_50("17.50"),
    
    _20_00("20.00"),
    
    _21_00("21.00"),
    
    _24_00("24.00"),
    
    _25_00("25.00"),
    
    _27_50("27.50"),
    
    _28_00("28.00"),
    
    _30_00("30.00"),
    
    _37_00("37.00");

    private String value;

    TaxRateChap3Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxRateChap3Enum fromValue(String value) {
      for (TaxRateChap3Enum b : TaxRateChap3Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TaxRateChap3Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxRateChap3Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxRateChap3Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaxRateChap3Enum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TaxRateChap3Enum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TAX_RATE_CHAP3 = "taxRateChap3";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_CHAP3)
  private TaxRateChap3Enum taxRateChap3;

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

  /**
   * Chapter 3 status code - Required if WithholdingIndicator is 3 (Chapter 3). Available values: - 01: U.S. Withholding Agent - FI (Deprecated - valid only for tax years prior to 2020) - 02: U.S. Withholding Agent - Other (Deprecated - valid only for tax years prior to 2020) - 03: Territory FI - treated as U.S. Person - 04: Territory FI - not treated as U.S. Person - 05: U.S. branch - treated as U.S. Person - 06: U.S. branch - not treated as U.S. Person - 07: U.S. branch - ECI presumption applied - 08: Partnership other than Withholding Foreign Partnership - 09: Withholding Foreign Partnership - 10: Trust other than Withholding Foreign Trust - 11: Withholding Foreign Trust - 12: Qualified Intermediary - 13: Qualified Securities Lender - Qualified Intermediary - 14: Qualified Securities Lender - Other - 15: Corporation - 16: Individual - 17: Estate - 18: Private Foundation - 19: Government or International Organization - 20: Tax Exempt Organization (Section 501(c) entities) - 21: Unknown Recipient - 22: Artist or Athlete - 23: Pension - 24: Foreign Central Bank of Issue - 25: Nonqualified Intermediary - 26: Hybrid entity making Treaty Claim - 27: Withholding Rate Pool - General - 28: Withholding Rate Pool - Exempt Organization - 29: PAI Withholding Rate Pool - General - 30: PAI Withholding Rate Pool - Exempt Organization - 31: Agency Withholding Rate Pool - General - 32: Agency Withholding Rate Pool - Exempt Organization - 34: U.S. Withholding Agent-Foreign branch of FI (Deprecated - valid only for tax years prior to 2020) - 35: Qualified Derivatives Dealer - 36: Foreign Government - Integral Part - 37: Foreign Government - Controlled Entity - 38: Publicly Traded Partnership - 39: Disclosing Qualified Intermediary
   */
  @JsonAdapter(Chap3StatusCodeEnum.Adapter.class)
  public enum Chap3StatusCodeEnum {
    _01("01"),
    
    _02("02"),
    
    _34("34"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _09("09"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12"),
    
    _13("13"),
    
    _14("14"),
    
    _15("15"),
    
    _16("16"),
    
    _17("17"),
    
    _18("18"),
    
    _19("19"),
    
    _20("20"),
    
    _21("21"),
    
    _22("22"),
    
    _23("23"),
    
    _24("24"),
    
    _25("25"),
    
    _26("26"),
    
    _27("27"),
    
    _28("28"),
    
    _29("29"),
    
    _30("30"),
    
    _31("31"),
    
    _32("32"),
    
    _35("35"),
    
    _36("36"),
    
    _37("37"),
    
    _38("38"),
    
    _39("39");

    private String value;

    Chap3StatusCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Chap3StatusCodeEnum fromValue(String value) {
      for (Chap3StatusCodeEnum b : Chap3StatusCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<Chap3StatusCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Chap3StatusCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Chap3StatusCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return Chap3StatusCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      Chap3StatusCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CHAP3_STATUS_CODE = "chap3StatusCode";
  @SerializedName(SERIALIZED_NAME_CHAP3_STATUS_CODE)
  private Chap3StatusCodeEnum chap3StatusCode;

  /**
   * Chapter 4 status code. Required if WithholdingIndicator is 4 (Chapter 4). Required if email is specified, must fill either this or RecipientForeignTin. Available values: - 01: U.S. Withholding Agent - FI - 02: U.S. Withholding Agent - Other - 03: Territory FI - not treated as U.S. Person - 04: Territory FI - treated as U.S. Person - 05: Participating FFI - Other - 06: Participating FFI - Reporting Model 2 FFI - 07: Registered Deemed - Compliant FFI-Reporting Model 1 FFI - 08: Registered Deemed - Compliant FFI-Sponsored Entity - 09: Registered Deemed - Compliant FFI-Other - 10: Certified Deemed - Compliant FFI-Other - 11: Certified Deemed - Compliant FFI-FFI with Low Value Accounts - 12: Certified Deemed - Compliant FFI-Non-Registering Local Bank - 13: Certified Deemed - Compliant FFI-Sponsored Entity - 14: Certified Deemed - Compliant FFI-Investment Advisor or Investment Manager - 15: Nonparticipating FFI - 16: Owner-Documented FFI - 17: U.S. Branch - treated as U.S. person - 18: U.S. Branch - not treated as U.S. person (reporting under section 1471) - 19: Passive NFFE identifying Substantial U.S. Owners - 20: Passive NFFE with no Substantial U.S. Owners - 21: Publicly Traded NFFE or Affiliate of Publicly Traded NFFE - 22: Active NFFE - 23: Individual - 24: Section 501(c) Entities - 25: Excepted Territory NFFE - 26: Excepted NFFE - Other - 27: Exempt Beneficial Owner - 28: Entity Wholly Owned by Exempt Beneficial Owners - 29: Unknown Recipient - 30: Recalcitrant Account Holder - 31: Nonreporting IGA FFI - 32: Direct reporting NFFE - 33: U.S. reportable account - 34: Non-consenting U.S. account - 35: Sponsored direct reporting NFFE - 36: Excepted Inter-affiliate FFI - 37: Undocumented Preexisting Obligation - 38: U.S. Branch - ECI presumption applied - 39: Account Holder of Excluded Financial Account - 40: Passive NFFE reported by FFI - 41: NFFE subject to 1472 withholding - 42: Recalcitrant Pool - No U.S. Indicia - 43: Recalcitrant Pool - U.S. Indicia - 44: Recalcitrant Pool - Dormant Account - 45: Recalcitrant Pool - U.S. Persons - 46: Recalcitrant Pool - Passive NFFEs - 47: Nonparticipating FFI Pool - 48: U.S. Payees Pool - 49: QI - Recalcitrant Pool-General - 50: U.S. Withholding Agent-Foreign branch of FI
   */
  @JsonAdapter(Chap4StatusCodeEnum.Adapter.class)
  public enum Chap4StatusCodeEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _09("09"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12"),
    
    _13("13"),
    
    _14("14"),
    
    _15("15"),
    
    _16("16"),
    
    _17("17"),
    
    _18("18"),
    
    _19("19"),
    
    _20("20"),
    
    _21("21"),
    
    _22("22"),
    
    _23("23"),
    
    _24("24"),
    
    _25("25"),
    
    _26("26"),
    
    _27("27"),
    
    _28("28"),
    
    _29("29"),
    
    _30("30"),
    
    _31("31"),
    
    _32("32"),
    
    _33("33"),
    
    _34("34"),
    
    _35("35"),
    
    _36("36"),
    
    _37("37"),
    
    _38("38"),
    
    _39("39"),
    
    _40("40"),
    
    _41("41"),
    
    _42("42"),
    
    _43("43"),
    
    _44("44"),
    
    _45("45"),
    
    _46("46"),
    
    _47("47"),
    
    _48("48"),
    
    _49("49"),
    
    _50("50");

    private String value;

    Chap4StatusCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Chap4StatusCodeEnum fromValue(String value) {
      for (Chap4StatusCodeEnum b : Chap4StatusCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<Chap4StatusCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Chap4StatusCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Chap4StatusCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return Chap4StatusCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      Chap4StatusCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CHAP4_STATUS_CODE = "chap4StatusCode";
  @SerializedName(SERIALIZED_NAME_CHAP4_STATUS_CODE)
  private Chap4StatusCodeEnum chap4StatusCode;

  public static final String SERIALIZED_NAME_PRIMARY_WITHHOLDING_AGENT = "primaryWithholdingAgent";
  @SerializedName(SERIALIZED_NAME_PRIMARY_WITHHOLDING_AGENT)
  private PrimaryWithholdingAgent primaryWithholdingAgent;

  public static final String SERIALIZED_NAME_INTERMEDIARY_OR_FLOW_THROUGH = "intermediaryOrFlowThrough";
  @SerializedName(SERIALIZED_NAME_INTERMEDIARY_OR_FLOW_THROUGH)
  private IntermediaryOrFlowThrough intermediaryOrFlowThrough;

  /**
   * Form type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    _1042_S("1042-S"),
    
    _1095_B("1095-B"),
    
    _1095_C("1095-C"),
    
    _1099_DIV("1099-DIV"),
    
    _1099_INT("1099-INT"),
    
    _1099_K("1099-K"),
    
    _1099_MISC("1099-MISC"),
    
    _1099_NEC("1099-NEC"),
    
    _1099_R("1099-R");

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

  public static final String SERIALIZED_NAME_NO_TIN = "noTin";
  @SerializedName(SERIALIZED_NAME_NO_TIN)
  private Boolean noTin;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "addressVerification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private Boolean addressVerification;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholding stateAndLocalWithholding;

  public static final String SERIALIZED_NAME_SECOND_TIN_NOTICE = "secondTinNotice";
  @SerializedName(SERIALIZED_NAME_SECOND_TIN_NOTICE)
  private Boolean secondTinNotice;

  public static final String SERIALIZED_NAME_FEDERAL_EFILE_STATUS = "federalEfileStatus";
  @SerializedName(SERIALIZED_NAME_FEDERAL_EFILE_STATUS)
  private Form1099StatusDetail federalEfileStatus;

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

  public Form1042S() {
  }

  public Form1042S(
     TinTypeEnum tinType, 
     String id, 
     Form1099StatusDetail federalEfileStatus, 
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
    this.tinType = tinType;
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

  /**
   * Tax Identification Number (TIN) type.  Available values: - EIN: Employer Identification Number - SSN: Social Security Number - ITIN: Individual Taxpayer Identification Number - ATIN: Adoption Taxpayer Identification Number
   * @return tinType
   */
  @javax.annotation.Nullable
  public TinTypeEnum getTinType() {
    return tinType;
  }



  public Form1042S uniqueFormId(String uniqueFormId) {
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


  public Form1042S recipientDateOfBirth(LocalDate recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
    return this;
  }

  /**
   * Recipient&#39;s date of birth
   * @return recipientDateOfBirth
   */
  @javax.annotation.Nullable
  public LocalDate getRecipientDateOfBirth() {
    return recipientDateOfBirth;
  }

  public void setRecipientDateOfBirth(LocalDate recipientDateOfBirth) {
    this.recipientDateOfBirth = recipientDateOfBirth;
  }


  public Form1042S recipientGiin(String recipientGiin) {
    this.recipientGiin = recipientGiin;
    return this;
  }

  /**
   * Recipient&#39;s Global Intermediary Identification Number (GIIN). A valid GIIN looks like &#39;XXXXXX.XXXXX.XX.XXX&#39;.
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
   * Recipient&#39;s foreign TIN. Required if email is specified, must fill either this or Chap3StatusCode.
   * @return recipientForeignTin
   */
  @javax.annotation.Nullable
  public String getRecipientForeignTin() {
    return recipientForeignTin;
  }

  public void setRecipientForeignTin(String recipientForeignTin) {
    this.recipientForeignTin = recipientForeignTin;
  }


  public Form1042S lobCode(LobCodeEnum lobCode) {
    this.lobCode = lobCode;
    return this;
  }

  /**
   * Limitation on Benefits (LOB) code for tax treaty purposes.  Available values:  - 01: Individual (Deprecated - valid only for tax years prior to 2019)  - 02: Government - contracting state/political subdivision/local authority  - 03: Tax exempt pension trust/Pension fund  - 04: Tax exempt/Charitable organization  - 05: Publicly-traded corporation  - 06: Subsidiary of publicly-traded corporation  - 07: Company that meets the ownership and base erosion test  - 08: Company that meets the derivative benefits test  - 09: Company with an item of income that meets the active trade or business test  - 10: Discretionary determination  - 11: Other  - 12: No LOB article in treaty
   * @return lobCode
   */
  @javax.annotation.Nullable
  public LobCodeEnum getLobCode() {
    return lobCode;
  }

  public void setLobCode(LobCodeEnum lobCode) {
    this.lobCode = lobCode;
  }


  public Form1042S incomeCode(IncomeCodeEnum incomeCode) {
    this.incomeCode = incomeCode;
    return this;
  }

  /**
   * Income code.  Available values:    Interest:  - 01: Interest paid by US obligors - general  - 02: Interest paid on real property mortgages  - 03: Interest paid to controlling foreign corporations  - 04: Interest paid by foreign corporations  - 05: Interest on tax-free covenant bonds  - 22: Interest paid on deposit with a foreign branch of a domestic corporation or partnership  - 29: Deposit interest  - 30: Original issue discount (OID)  - 31: Short-term OID  - 33: Substitute payment - interest  - 51: Interest paid on certain actively traded or publicly offered securities(1)  - 54: Substitute payments - interest from certain actively traded or publicly offered securities(1)    Dividend:  - 06: Dividends paid by U.S. corporations - general  - 07: Dividends qualifying for direct dividend rate  - 08: Dividends paid by foreign corporations  - 34: Substitute payment - dividends  - 40: Other dividend equivalents under IRC section 871(m) (formerly 871(l))  - 52: Dividends paid on certain actively traded or publicly offered securities(1)  - 53: Substitute payments - dividends from certain actively traded or publicly offered securities(1)  - 56: Dividend equivalents under IRC section 871(m) as a result of applying the combined transaction rules    Other:  - 09: Capital gains  - 10: Industrial royalties  - 11: Motion picture or television copyright royalties  - 12: Other royalties (for example, copyright, software, broadcasting, endorsement payments)  - 13: Royalties paid on certain publicly offered securities(1)  - 14: Real property income and natural resources royalties  - 15: Pensions, annuities, alimony, and/or insurance premiums  - 16: Scholarship or fellowship grants  - 17: Compensation for independent personal services(2)  - 18: Compensation for dependent personal services(2)  - 19: Compensation for teaching(2)  - 20: Compensation during studying and training(2)  - 23: Other income  - 24: Qualified investment entity (QIE) distributions of capital gains  - 25: Trust distributions subject to IRC section 1445  - 26: Unsevered growing crops and timber distributions by a trust subject to IRC section 1445  - 27: Publicly traded partnership distributions subject to IRC section 1446  - 28: Gambling winnings(3)  - 32: Notional principal contract income(4)  - 35: Substitute payment - other  - 36: Capital gains distributions  - 37: Return of capital  - 38: Eligible deferred compensation items subject to IRC section 877A(d)(1)  - 39: Distributions from a nongrantor trust subject to IRC section 877A(f)(1)  - 41: Guarantee of indebtedness  - 42: Earnings as an artist or athlete - no central withholding agreement(5)  - 43: Earnings as an artist or athlete - central withholding agreement(5)  - 44: Specified Federal procurement payments  - 50: Income previously reported under escrow procedure(6)  - 55: Taxable death benefits on life insurance contracts  - 57: Amount realized under IRC section 1446(f)  - 58: Publicly traded partnership distributions-undetermined
   * @return incomeCode
   */
  @javax.annotation.Nullable
  public IncomeCodeEnum getIncomeCode() {
    return incomeCode;
  }

  public void setIncomeCode(IncomeCodeEnum incomeCode) {
    this.incomeCode = incomeCode;
  }


  public Form1042S grossIncome(Double grossIncome) {
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


  public Form1042S withholdingIndicator(WithholdingIndicatorEnum withholdingIndicator) {
    this.withholdingIndicator = withholdingIndicator;
    return this;
  }

  /**
   * Withholding indicator  Available values:  - 3: Chapter 3  - 4: Chapter 4
   * @return withholdingIndicator
   */
  @javax.annotation.Nullable
  public WithholdingIndicatorEnum getWithholdingIndicator() {
    return withholdingIndicator;
  }

  public void setWithholdingIndicator(WithholdingIndicatorEnum withholdingIndicator) {
    this.withholdingIndicator = withholdingIndicator;
  }


  public Form1042S taxCountryCode(String taxCountryCode) {
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


  public Form1042S exemptionCodeChap3(ExemptionCodeChap3Enum exemptionCodeChap3) {
    this.exemptionCodeChap3 = exemptionCodeChap3;
    return this;
  }

  /**
   * Exemption code (Chapter 3). Required if WithholdingIndicator is 3 (Chapter 3). Required when using TaxRateChap3.  Available values:  - Empty: Tax rate is due to backup withholding  - 00: Not exempt  - 01: Effectively connected income  - 02: Exempt under IRC (other than portfolio interest)  - 03: Income is not from US sources  - 04: Exempt under tax treaty  - 05: Portfolio interest exempt under IRC  - 06: QI that assumes primary withholding responsibility  - 07: WFP or WFT  - 08: U.S. branch treated as U.S. Person  - 09: Territory FI treated as U.S. Person  - 10: QI represents that income is exempt  - 11: QSL that assumes primary withholding responsibility  - 12: Payee subjected to chapter 4 withholding  - 22: QDD that assumes primary withholding responsibility  - 23: Exempt under section 897(l)  - 24: Exempt under section 892
   * @return exemptionCodeChap3
   */
  @javax.annotation.Nullable
  public ExemptionCodeChap3Enum getExemptionCodeChap3() {
    return exemptionCodeChap3;
  }

  public void setExemptionCodeChap3(ExemptionCodeChap3Enum exemptionCodeChap3) {
    this.exemptionCodeChap3 = exemptionCodeChap3;
  }


  public Form1042S exemptionCodeChap4(ExemptionCodeChap4Enum exemptionCodeChap4) {
    this.exemptionCodeChap4 = exemptionCodeChap4;
    return this;
  }

  /**
   * Exemption code (Chapter 4). Required if WithholdingIndicator is 4 (Chapter 4).  Available values:  - 00: Not exempt  - 13: Grandfathered payment  - 14: Effectively connected income  - 15: Payee not subject to chapter 4 withholding  - 16: Excluded nonfinancial payment  - 17: Foreign Entity that assumes primary withholding responsibility  - 18: U.S. Payees - of participating FFI or registered deemed - compliant FFI  - 19: Exempt from withholding under IGA(6)  - 20: Dormant account(7)  - 21: Other - payment not subject to chapter 4 withholding
   * @return exemptionCodeChap4
   */
  @javax.annotation.Nullable
  public ExemptionCodeChap4Enum getExemptionCodeChap4() {
    return exemptionCodeChap4;
  }

  public void setExemptionCodeChap4(ExemptionCodeChap4Enum exemptionCodeChap4) {
    this.exemptionCodeChap4 = exemptionCodeChap4;
  }


  public Form1042S taxRateChap3(TaxRateChap3Enum taxRateChap3) {
    this.taxRateChap3 = taxRateChap3;
    return this;
  }

  /**
   * Tax rate (Chapter 3) - Required if WithholdingIndicator is 3 (Chapter 3).  Available values:  - 00.00: 0.00%  - 02.00: 2.00%  - 04.00: 4.00%  - 04.90: 4.90%  - 04.95: 4.95%  - 05.00: 5.00%  - 07.00: 7.00%  - 08.00: 8.00%  - 10.00: 10.00%  - 12.00: 12.00%  - 12.50: 12.50%  - 14.00: 14.00%  - 15.00: 15.00%  - 17.50: 17.50%  - 20.00: 20.00%  - 21.00: 21.00%  - 24.00: 24.00%  - 25.00: 25.00%  - 27.50: 27.50%  - 28.00: 28.00%  - 30.00: 30.00%  - 37.00: 37.00%
   * @return taxRateChap3
   */
  @javax.annotation.Nullable
  public TaxRateChap3Enum getTaxRateChap3() {
    return taxRateChap3;
  }

  public void setTaxRateChap3(TaxRateChap3Enum taxRateChap3) {
    this.taxRateChap3 = taxRateChap3;
  }


  public Form1042S withholdingAllowance(Double withholdingAllowance) {
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


  public Form1042S federalTaxWithheld(Double federalTaxWithheld) {
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


  public Form1042S taxNotDepositedIndicator(Boolean taxNotDepositedIndicator) {
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


  public Form1042S academicIndicator(Boolean academicIndicator) {
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


  public Form1042S taxWithheldOtherAgents(Double taxWithheldOtherAgents) {
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


  public Form1042S amountRepaid(Double amountRepaid) {
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


  public Form1042S taxPaidAgent(Double taxPaidAgent) {
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


  public Form1042S chap3StatusCode(Chap3StatusCodeEnum chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
    return this;
  }

  /**
   * Chapter 3 status code - Required if WithholdingIndicator is 3 (Chapter 3). Available values: - 01: U.S. Withholding Agent - FI (Deprecated - valid only for tax years prior to 2020) - 02: U.S. Withholding Agent - Other (Deprecated - valid only for tax years prior to 2020) - 03: Territory FI - treated as U.S. Person - 04: Territory FI - not treated as U.S. Person - 05: U.S. branch - treated as U.S. Person - 06: U.S. branch - not treated as U.S. Person - 07: U.S. branch - ECI presumption applied - 08: Partnership other than Withholding Foreign Partnership - 09: Withholding Foreign Partnership - 10: Trust other than Withholding Foreign Trust - 11: Withholding Foreign Trust - 12: Qualified Intermediary - 13: Qualified Securities Lender - Qualified Intermediary - 14: Qualified Securities Lender - Other - 15: Corporation - 16: Individual - 17: Estate - 18: Private Foundation - 19: Government or International Organization - 20: Tax Exempt Organization (Section 501(c) entities) - 21: Unknown Recipient - 22: Artist or Athlete - 23: Pension - 24: Foreign Central Bank of Issue - 25: Nonqualified Intermediary - 26: Hybrid entity making Treaty Claim - 27: Withholding Rate Pool - General - 28: Withholding Rate Pool - Exempt Organization - 29: PAI Withholding Rate Pool - General - 30: PAI Withholding Rate Pool - Exempt Organization - 31: Agency Withholding Rate Pool - General - 32: Agency Withholding Rate Pool - Exempt Organization - 34: U.S. Withholding Agent-Foreign branch of FI (Deprecated - valid only for tax years prior to 2020) - 35: Qualified Derivatives Dealer - 36: Foreign Government - Integral Part - 37: Foreign Government - Controlled Entity - 38: Publicly Traded Partnership - 39: Disclosing Qualified Intermediary
   * @return chap3StatusCode
   */
  @javax.annotation.Nullable
  public Chap3StatusCodeEnum getChap3StatusCode() {
    return chap3StatusCode;
  }

  public void setChap3StatusCode(Chap3StatusCodeEnum chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
  }


  public Form1042S chap4StatusCode(Chap4StatusCodeEnum chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
    return this;
  }

  /**
   * Chapter 4 status code. Required if WithholdingIndicator is 4 (Chapter 4). Required if email is specified, must fill either this or RecipientForeignTin. Available values: - 01: U.S. Withholding Agent - FI - 02: U.S. Withholding Agent - Other - 03: Territory FI - not treated as U.S. Person - 04: Territory FI - treated as U.S. Person - 05: Participating FFI - Other - 06: Participating FFI - Reporting Model 2 FFI - 07: Registered Deemed - Compliant FFI-Reporting Model 1 FFI - 08: Registered Deemed - Compliant FFI-Sponsored Entity - 09: Registered Deemed - Compliant FFI-Other - 10: Certified Deemed - Compliant FFI-Other - 11: Certified Deemed - Compliant FFI-FFI with Low Value Accounts - 12: Certified Deemed - Compliant FFI-Non-Registering Local Bank - 13: Certified Deemed - Compliant FFI-Sponsored Entity - 14: Certified Deemed - Compliant FFI-Investment Advisor or Investment Manager - 15: Nonparticipating FFI - 16: Owner-Documented FFI - 17: U.S. Branch - treated as U.S. person - 18: U.S. Branch - not treated as U.S. person (reporting under section 1471) - 19: Passive NFFE identifying Substantial U.S. Owners - 20: Passive NFFE with no Substantial U.S. Owners - 21: Publicly Traded NFFE or Affiliate of Publicly Traded NFFE - 22: Active NFFE - 23: Individual - 24: Section 501(c) Entities - 25: Excepted Territory NFFE - 26: Excepted NFFE - Other - 27: Exempt Beneficial Owner - 28: Entity Wholly Owned by Exempt Beneficial Owners - 29: Unknown Recipient - 30: Recalcitrant Account Holder - 31: Nonreporting IGA FFI - 32: Direct reporting NFFE - 33: U.S. reportable account - 34: Non-consenting U.S. account - 35: Sponsored direct reporting NFFE - 36: Excepted Inter-affiliate FFI - 37: Undocumented Preexisting Obligation - 38: U.S. Branch - ECI presumption applied - 39: Account Holder of Excluded Financial Account - 40: Passive NFFE reported by FFI - 41: NFFE subject to 1472 withholding - 42: Recalcitrant Pool - No U.S. Indicia - 43: Recalcitrant Pool - U.S. Indicia - 44: Recalcitrant Pool - Dormant Account - 45: Recalcitrant Pool - U.S. Persons - 46: Recalcitrant Pool - Passive NFFEs - 47: Nonparticipating FFI Pool - 48: U.S. Payees Pool - 49: QI - Recalcitrant Pool-General - 50: U.S. Withholding Agent-Foreign branch of FI
   * @return chap4StatusCode
   */
  @javax.annotation.Nullable
  public Chap4StatusCodeEnum getChap4StatusCode() {
    return chap4StatusCode;
  }

  public void setChap4StatusCode(Chap4StatusCodeEnum chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
  }


  public Form1042S primaryWithholdingAgent(PrimaryWithholdingAgent primaryWithholdingAgent) {
    this.primaryWithholdingAgent = primaryWithholdingAgent;
    return this;
  }

  /**
   * Primary withholding agent information
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
   * Intermediary or flow-through entity information
   * @return intermediaryOrFlowThrough
   */
  @javax.annotation.Nullable
  public IntermediaryOrFlowThrough getIntermediaryOrFlowThrough() {
    return intermediaryOrFlowThrough;
  }

  public void setIntermediaryOrFlowThrough(IntermediaryOrFlowThrough intermediaryOrFlowThrough) {
    this.intermediaryOrFlowThrough = intermediaryOrFlowThrough;
  }


  public Form1042S type(TypeEnum type) {
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



  public Form1042S issuerId(String issuerId) {
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


  public Form1042S issuerReferenceId(String issuerReferenceId) {
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


  public Form1042S issuerTin(String issuerTin) {
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


  public Form1042S taxYear(Integer taxYear) {
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


  public Form1042S referenceId(String referenceId) {
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


  public Form1042S tin(String tin) {
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


  public Form1042S recipientName(String recipientName) {
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


  public Form1042S recipientSecondName(String recipientSecondName) {
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


  public Form1042S address(String address) {
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


  public Form1042S address2(String address2) {
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


  public Form1042S city(String city) {
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


  public Form1042S state(String state) {
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


  public Form1042S zip(String zip) {
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


  public Form1042S email(String email) {
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


  public Form1042S accountNumber(String accountNumber) {
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


  public Form1042S officeCode(String officeCode) {
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


  public Form1042S nonUsProvince(String nonUsProvince) {
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


  public Form1042S countryCode(String countryCode) {
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


  public Form1042S federalEfileDate(LocalDate federalEfileDate) {
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


  public Form1042S postalMail(Boolean postalMail) {
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


  public Form1042S stateEfileDate(LocalDate stateEfileDate) {
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


  public Form1042S recipientEdeliveryDate(LocalDate recipientEdeliveryDate) {
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


  public Form1042S tinMatch(Boolean tinMatch) {
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


  public Form1042S noTin(Boolean noTin) {
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


  public Form1042S addressVerification(Boolean addressVerification) {
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


  public Form1042S stateAndLocalWithholding(StateAndLocalWithholding stateAndLocalWithholding) {
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


  public Form1042S secondTinNotice(Boolean secondTinNotice) {
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
   * Federal e-file status.  Available values:  - unscheduled: Form has not been scheduled for federal e-filing  - scheduled: Form is scheduled for federal e-filing  - airlock: Form is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - sent: Form has been sent to the IRS  - accepted: Form was accepted by the IRS  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlock: Correction is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - corrected: A correction has been sent to the IRS  - corrected_accepted: Correction was accepted by the IRS  - rejected: Form was rejected by the IRS  - corrected_rejected: Correction was rejected by the IRS  - held: Form is held and will not be submitted to IRS (used for certain forms submitted only to states)
   * @return federalEfileStatus
   */
  @javax.annotation.Nullable
  public Form1099StatusDetail getFederalEfileStatus() {
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




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1042S form1042S = (Form1042S) o;
    return Objects.equals(this.tinType, form1042S.tinType) &&
        Objects.equals(this.uniqueFormId, form1042S.uniqueFormId) &&
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
        Objects.equals(this.type, form1042S.type) &&
        Objects.equals(this.id, form1042S.id) &&
        Objects.equals(this.issuerId, form1042S.issuerId) &&
        Objects.equals(this.issuerReferenceId, form1042S.issuerReferenceId) &&
        Objects.equals(this.issuerTin, form1042S.issuerTin) &&
        Objects.equals(this.taxYear, form1042S.taxYear) &&
        Objects.equals(this.referenceId, form1042S.referenceId) &&
        Objects.equals(this.tin, form1042S.tin) &&
        Objects.equals(this.recipientName, form1042S.recipientName) &&
        Objects.equals(this.recipientSecondName, form1042S.recipientSecondName) &&
        Objects.equals(this.address, form1042S.address) &&
        Objects.equals(this.address2, form1042S.address2) &&
        Objects.equals(this.city, form1042S.city) &&
        Objects.equals(this.state, form1042S.state) &&
        Objects.equals(this.zip, form1042S.zip) &&
        Objects.equals(this.email, form1042S.email) &&
        Objects.equals(this.accountNumber, form1042S.accountNumber) &&
        Objects.equals(this.officeCode, form1042S.officeCode) &&
        Objects.equals(this.nonUsProvince, form1042S.nonUsProvince) &&
        Objects.equals(this.countryCode, form1042S.countryCode) &&
        Objects.equals(this.federalEfileDate, form1042S.federalEfileDate) &&
        Objects.equals(this.postalMail, form1042S.postalMail) &&
        Objects.equals(this.stateEfileDate, form1042S.stateEfileDate) &&
        Objects.equals(this.recipientEdeliveryDate, form1042S.recipientEdeliveryDate) &&
        Objects.equals(this.tinMatch, form1042S.tinMatch) &&
        Objects.equals(this.noTin, form1042S.noTin) &&
        Objects.equals(this.addressVerification, form1042S.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form1042S.stateAndLocalWithholding) &&
        Objects.equals(this.secondTinNotice, form1042S.secondTinNotice) &&
        Objects.equals(this.federalEfileStatus, form1042S.federalEfileStatus) &&
        Objects.equals(this.stateEfileStatus, form1042S.stateEfileStatus) &&
        Objects.equals(this.postalMailStatus, form1042S.postalMailStatus) &&
        Objects.equals(this.tinMatchStatus, form1042S.tinMatchStatus) &&
        Objects.equals(this.addressVerificationStatus, form1042S.addressVerificationStatus) &&
        Objects.equals(this.eDeliveryStatus, form1042S.eDeliveryStatus) &&
        Objects.equals(this.validationErrors, form1042S.validationErrors) &&
        Objects.equals(this.createdAt, form1042S.createdAt) &&
        Objects.equals(this.updatedAt, form1042S.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(tinType, uniqueFormId, recipientDateOfBirth, recipientGiin, recipientForeignTin, lobCode, incomeCode, grossIncome, withholdingIndicator, taxCountryCode, exemptionCodeChap3, exemptionCodeChap4, taxRateChap3, withholdingAllowance, federalTaxWithheld, taxNotDepositedIndicator, academicIndicator, taxWithheldOtherAgents, amountRepaid, taxPaidAgent, chap3StatusCode, chap4StatusCode, primaryWithholdingAgent, intermediaryOrFlowThrough, type, id, issuerId, issuerReferenceId, issuerTin, taxYear, referenceId, tin, recipientName, recipientSecondName, address, address2, city, state, zip, email, accountNumber, officeCode, nonUsProvince, countryCode, federalEfileDate, postalMail, stateEfileDate, recipientEdeliveryDate, tinMatch, noTin, addressVerification, stateAndLocalWithholding, secondTinNotice, federalEfileStatus, stateEfileStatus, postalMailStatus, tinMatchStatus, addressVerificationStatus, eDeliveryStatus, validationErrors, createdAt, updatedAt);
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
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
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
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerReferenceId: ").append(toIndentedString(issuerReferenceId)).append("\n");
    sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
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
    sb.append("    federalEfileDate: ").append(toIndentedString(federalEfileDate)).append("\n");
    sb.append("    postalMail: ").append(toIndentedString(postalMail)).append("\n");
    sb.append("    stateEfileDate: ").append(toIndentedString(stateEfileDate)).append("\n");
    sb.append("    recipientEdeliveryDate: ").append(toIndentedString(recipientEdeliveryDate)).append("\n");
    sb.append("    tinMatch: ").append(toIndentedString(tinMatch)).append("\n");
    sb.append("    noTin: ").append(toIndentedString(noTin)).append("\n");
    sb.append("    addressVerification: ").append(toIndentedString(addressVerification)).append("\n");
    sb.append("    stateAndLocalWithholding: ").append(toIndentedString(stateAndLocalWithholding)).append("\n");
    sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
    sb.append("    federalEfileStatus: ").append(toIndentedString(federalEfileStatus)).append("\n");
    sb.append("    stateEfileStatus: ").append(toIndentedString(stateEfileStatus)).append("\n");
    sb.append("    postalMailStatus: ").append(toIndentedString(postalMailStatus)).append("\n");
    sb.append("    tinMatchStatus: ").append(toIndentedString(tinMatchStatus)).append("\n");
    sb.append("    addressVerificationStatus: ").append(toIndentedString(addressVerificationStatus)).append("\n");
    sb.append("    eDeliveryStatus: ").append(toIndentedString(eDeliveryStatus)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("federalEfileDate");
    openapiFields.add("postalMail");
    openapiFields.add("stateEfileDate");
    openapiFields.add("recipientEdeliveryDate");
    openapiFields.add("tinMatch");
    openapiFields.add("noTin");
    openapiFields.add("addressVerification");
    openapiFields.add("stateAndLocalWithholding");
    openapiFields.add("secondTinNotice");
    openapiFields.add("federalEfileStatus");
    openapiFields.add("stateEfileStatus");
    openapiFields.add("postalMailStatus");
    openapiFields.add("tinMatchStatus");
    openapiFields.add("addressVerificationStatus");
    openapiFields.add("eDeliveryStatus");
    openapiFields.add("validationErrors");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uniqueFormId");
    openapiRequiredFields.add("incomeCode");
    openapiRequiredFields.add("grossIncome");
    openapiRequiredFields.add("withholdingIndicator");
    openapiRequiredFields.add("taxCountryCode");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("recipientName");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("countryCode");
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

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1042S.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) && !jsonObj.get("tinType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinType").toString()));
      }
      // validate the optional field `tinType`
      if (jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) {
        TinTypeEnum.validateJsonElement(jsonObj.get("tinType"));
      }
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
      // validate the optional field `lobCode`
      if (jsonObj.get("lobCode") != null && !jsonObj.get("lobCode").isJsonNull()) {
        LobCodeEnum.validateJsonElement(jsonObj.get("lobCode"));
      }
      if ((jsonObj.get("incomeCode") != null && !jsonObj.get("incomeCode").isJsonNull()) && !jsonObj.get("incomeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incomeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incomeCode").toString()));
      }
      // validate the required field `incomeCode`
      IncomeCodeEnum.validateJsonElement(jsonObj.get("incomeCode"));
      if ((jsonObj.get("withholdingIndicator") != null && !jsonObj.get("withholdingIndicator").isJsonNull()) && !jsonObj.get("withholdingIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withholdingIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withholdingIndicator").toString()));
      }
      // validate the required field `withholdingIndicator`
      WithholdingIndicatorEnum.validateJsonElement(jsonObj.get("withholdingIndicator"));
      if ((jsonObj.get("taxCountryCode") != null && !jsonObj.get("taxCountryCode").isJsonNull()) && !jsonObj.get("taxCountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxCountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxCountryCode").toString()));
      }
      if ((jsonObj.get("exemptionCodeChap3") != null && !jsonObj.get("exemptionCodeChap3").isJsonNull()) && !jsonObj.get("exemptionCodeChap3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptionCodeChap3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptionCodeChap3").toString()));
      }
      // validate the optional field `exemptionCodeChap3`
      if (jsonObj.get("exemptionCodeChap3") != null && !jsonObj.get("exemptionCodeChap3").isJsonNull()) {
        ExemptionCodeChap3Enum.validateJsonElement(jsonObj.get("exemptionCodeChap3"));
      }
      if ((jsonObj.get("exemptionCodeChap4") != null && !jsonObj.get("exemptionCodeChap4").isJsonNull()) && !jsonObj.get("exemptionCodeChap4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptionCodeChap4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptionCodeChap4").toString()));
      }
      // validate the optional field `exemptionCodeChap4`
      if (jsonObj.get("exemptionCodeChap4") != null && !jsonObj.get("exemptionCodeChap4").isJsonNull()) {
        ExemptionCodeChap4Enum.validateJsonElement(jsonObj.get("exemptionCodeChap4"));
      }
      if ((jsonObj.get("taxRateChap3") != null && !jsonObj.get("taxRateChap3").isJsonNull()) && !jsonObj.get("taxRateChap3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxRateChap3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxRateChap3").toString()));
      }
      // validate the optional field `taxRateChap3`
      if (jsonObj.get("taxRateChap3") != null && !jsonObj.get("taxRateChap3").isJsonNull()) {
        TaxRateChap3Enum.validateJsonElement(jsonObj.get("taxRateChap3"));
      }
      if ((jsonObj.get("chap3StatusCode") != null && !jsonObj.get("chap3StatusCode").isJsonNull()) && !jsonObj.get("chap3StatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chap3StatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chap3StatusCode").toString()));
      }
      // validate the optional field `chap3StatusCode`
      if (jsonObj.get("chap3StatusCode") != null && !jsonObj.get("chap3StatusCode").isJsonNull()) {
        Chap3StatusCodeEnum.validateJsonElement(jsonObj.get("chap3StatusCode"));
      }
      if ((jsonObj.get("chap4StatusCode") != null && !jsonObj.get("chap4StatusCode").isJsonNull()) && !jsonObj.get("chap4StatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chap4StatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chap4StatusCode").toString()));
      }
      // validate the optional field `chap4StatusCode`
      if (jsonObj.get("chap4StatusCode") != null && !jsonObj.get("chap4StatusCode").isJsonNull()) {
        Chap4StatusCodeEnum.validateJsonElement(jsonObj.get("chap4StatusCode"));
      }
      // validate the optional field `primaryWithholdingAgent`
      if (jsonObj.get("primaryWithholdingAgent") != null && !jsonObj.get("primaryWithholdingAgent").isJsonNull()) {
        PrimaryWithholdingAgent.validateJsonElement(jsonObj.get("primaryWithholdingAgent"));
      }
      // validate the optional field `intermediaryOrFlowThrough`
      if (jsonObj.get("intermediaryOrFlowThrough") != null && !jsonObj.get("intermediaryOrFlowThrough").isJsonNull()) {
        IntermediaryOrFlowThrough.validateJsonElement(jsonObj.get("intermediaryOrFlowThrough"));
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
      // validate the optional field `stateAndLocalWithholding`
      if (jsonObj.get("stateAndLocalWithholding") != null && !jsonObj.get("stateAndLocalWithholding").isJsonNull()) {
        StateAndLocalWithholding.validateJsonElement(jsonObj.get("stateAndLocalWithholding"));
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

