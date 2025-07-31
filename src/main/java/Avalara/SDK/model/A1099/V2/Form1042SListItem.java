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
import Avalara.SDK.model.A1099.V2.IntermediaryOrFlowThrough;
import Avalara.SDK.model.A1099.V2.PrimaryWithholdingAgent;
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
 * Form1042SListItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1042SListItem {
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

  /**
   * Limitation on benefits code
   */
  @JsonAdapter(LobCodeEnum.Adapter.class)
  public enum LobCodeEnum {
    INDIVIDUAL("Individual"),
    
    GOVERNMENT_CONTRACTING_STATE("GovernmentContractingState"),
    
    TAX_EXEMPT_PENSION_TRUST("TaxExemptPensionTrust"),
    
    TAX_EXEMPT_CHARITABLE_ORGANIZATION("TaxExemptCharitableOrganization"),
    
    PUBLICLY_TRADED_CORPORATION("PubliclyTradedCorporation"),
    
    SUBSIDIARY_OF_PUBLICLY_TRADED_CORPORATION("SubsidiaryOfPubliclyTradedCorporation"),
    
    COMPANY_OWNERSHIP_BASE_EROSION_TEST("CompanyOwnershipBaseErosionTest"),
    
    COMPANY_DERIVATIVE_BENEFITS_TEST("CompanyDerivativeBenefitsTest"),
    
    COMPANY_ACTIVE_TRADE_OR_BUSINESS_TEST("CompanyActiveTradeOrBusinessTest"),
    
    DISCRETIONARY_DETERMINATION("DiscretionaryDetermination"),
    
    OTHER("Other"),
    
    NO_LOB_ARTICLE_IN_TREATY("NoLobArticleInTreaty");

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

  /**
   * Exemption code (Chapter 3)
   */
  @JsonAdapter(ExemptionCodeChap3Enum.Adapter.class)
  public enum ExemptionCodeChap3Enum {
    TAX_RATE_DUE_TO_BACKUP_WITHHOLDING("TaxRateDueToBackupWithholding"),
    
    EFFECTIVELY_CONNECTED_INCOME("EffectivelyConnectedIncome"),
    
    EXEMPT_UNDER_IRC("ExemptUnderIrc"),
    
    INCOME_NOT_FROM_US_SOURCES("IncomeNotFromUsSources"),
    
    EXEMPT_UNDER_TAX_TREATY("ExemptUnderTaxTreaty"),
    
    PORTFOLIO_INTEREST_EXEMPT_UNDER_IRC("PortfolioInterestExemptUnderIrc"),
    
    QI_THAT_ASSUMES_PRIMARY_WITHHOLDING_RESPONSIBILITY("QiThatAssumesPrimaryWithholdingResponsibility"),
    
    WF_POR_WFT("WfPorWft"),
    
    US_BRANCH_TREATED_AS_US_PERSON("UsBranchTreatedAsUsPerson"),
    
    TERRITORY_FI_TREATED_AS_US_PERSON("TerritoryFiTreatedAsUsPerson"),
    
    QI_REPRESENTS_INCOME_EXEMPT("QiRepresentsIncomeExempt"),
    
    QSL_THAT_ASSUMES_PRIMARY_WITHHOLDING_RESPONSIBILITY("QslThatAssumesPrimaryWithholdingResponsibility"),
    
    PAYEE_SUBJECTED_TO_CHAPTER4_WITHHOLDING("PayeeSubjectedToChapter4Withholding"),
    
    QDD_THAT_ASSUMES_PRIMARY_WITHHOLDING_RESPONSIBILITY("QddThatAssumesPrimaryWithholdingResponsibility"),
    
    EXEMPT_UNDER_SECTION897_L("ExemptUnderSection897L"),
    
    EXEMPT_UNDER_SECTION892("ExemptUnderSection892");

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
   * Exemption code (Chapter 4)
   */
  @JsonAdapter(ExemptionCodeChap4Enum.Adapter.class)
  public enum ExemptionCodeChap4Enum {
    NOT_EXEMPT("NotExempt"),
    
    GRANDFATHERED_PAYMENT("GrandfatheredPayment"),
    
    EFFECTIVELY_CONNECTED_INCOME("EffectivelyConnectedIncome"),
    
    PAYEE_NOT_SUBJECT_TO_CHAPTER4_WITHHOLDING("PayeeNotSubjectToChapter4Withholding"),
    
    EXCLUDED_NONFINANCIAL_PAYMENT("ExcludedNonfinancialPayment"),
    
    FOREIGN_ENTITY_THAT_ASSUMES_PRIMARY_WITHHOLDING_RESPONSIBILITY("ForeignEntityThatAssumesPrimaryWithholdingResponsibility"),
    
    US_PAYEES_OF_PARTICIPATING_FFI("UsPayeesOfParticipatingFfi"),
    
    EXEMPT_FROM_WITHHOLDING_UNDER_IGA("ExemptFromWithholdingUnderIga"),
    
    DORMANT_ACCOUNT("DormantAccount"),
    
    OTHER_PAYMENT_NOT_SUBJECT_TO_CHAPTER4_WITHHOLDING("OtherPaymentNotSubjectToChapter4Withholding");

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

  /**
   * Chapter 3 status code
   */
  @JsonAdapter(Chap3StatusCodeEnum.Adapter.class)
  public enum Chap3StatusCodeEnum {
    US_WITHHOLDING_AGENT_FI("USWithholdingAgentFI"),
    
    US_WITHHOLDING_AGENT_OTHER("USWithholdingAgentOther"),
    
    TERRITORY_FI_TREATED_AS_US_PERSON("TerritoryFITreatedAsUSPerson"),
    
    TERRITORY_FI_NOT_TREATED_AS_US_PERSON("TerritoryFINotTreatedAsUSPerson"),
    
    US_BRANCH_TREATED_AS_US_PERSON("USBranchTreatedAsUSPerson"),
    
    US_BRANCH_NOT_TREATED_AS_US_PERSON("USBranchNotTreatedAsUSPerson"),
    
    US_BRANCH_ECI_PRESUMPTION_APPLIED("USBranchECIPresumptionApplied"),
    
    PARTNERSHIP_OTHER_THAN_WITHHOLDING_FOREIGN_PARTNERSHIP("PartnershipOtherThanWithholdingForeignPartnership"),
    
    WITHHOLDING_FOREIGN_PARTNERSHIP("WithholdingForeignPartnership"),
    
    TRUST_OTHER_THAN_WITHHOLDING_FOREIGN_TRUST("TrustOtherThanWithholdingForeignTrust"),
    
    WITHHOLDING_FOREIGN_TRUST("WithholdingForeignTrust"),
    
    QUALIFIED_INTERMEDIARY("QualifiedIntermediary"),
    
    QUALIFIED_SECURITIES_LENDER_QUALIFIED_INTERMEDIARY("QualifiedSecuritiesLenderQualifiedIntermediary"),
    
    QUALIFIED_SECURITIES_LENDER_OTHER("QualifiedSecuritiesLenderOther"),
    
    CORPORATION("Corporation"),
    
    INDIVIDUAL("Individual"),
    
    ESTATE("Estate"),
    
    PRIVATE_FOUNDATION("PrivateFoundation"),
    
    GOVERNMENT_OR_INTERNATIONAL_ORGANIZATION("GovernmentOrInternationalOrganization"),
    
    TAX_EXEMPT_ORGANIZATION_SECTION501C_ENTITIES("TaxExemptOrganizationSection501cEntities"),
    
    UNKNOWN_RECIPIENT("UnknownRecipient"),
    
    ARTIST_OR_ATHLETE("ArtistOrAthlete"),
    
    PENSION("Pension"),
    
    FOREIGN_CENTRAL_BANK_OF_ISSUE("ForeignCentralBankOfIssue"),
    
    NONQUALIFIED_INTERMEDIARY("NonqualifiedIntermediary"),
    
    HYBRID_ENTITY_MAKING_TREATY_CLAIM("HybridEntityMakingTreatyClaim"),
    
    WITHHOLDING_RATE_POOL_GENERAL("WithholdingRatePoolGeneral"),
    
    WITHHOLDING_RATE_POOL_EXEMPT_ORGANIZATION("WithholdingRatePoolExemptOrganization"),
    
    PAI_WITHHOLDING_RATE_POOL_GENERAL("PAIWithholdingRatePoolGeneral"),
    
    PAI_WITHHOLDING_RATE_POOL_EXEMPT_ORGANIZATION("PAIWithholdingRatePoolExemptOrganization"),
    
    AGENCY_WITHHOLDING_RATE_POOL_GENERAL("AgencyWithholdingRatePoolGeneral"),
    
    AGENCY_WITHHOLDING_RATE_POOL_EXEMPT_ORGANIZATION("AgencyWithholdingRatePoolExemptOrganization"),
    
    US_WITHHOLDING_AGENT_FOREIGN_BRANCH_OF_FI("USWithholdingAgentForeignBranchOfFI"),
    
    QUALIFIED_DERIVATIVES_DEALER("QualifiedDerivativesDealer"),
    
    FOREIGN_GOVERNMENT_INTEGRAL_PART("ForeignGovernmentIntegralPart"),
    
    FOREIGN_GOVERNMENT_CONTROLLED_ENTITY("ForeignGovernmentControlledEntity"),
    
    PUBLICLY_TRADED_PARTNERSHIP("PubliclyTradedPartnership"),
    
    DISCLOSING_QUALIFIED_INTERMEDIARY("DisclosingQualifiedIntermediary");

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
   * Chapter 4 status code
   */
  @JsonAdapter(Chap4StatusCodeEnum.Adapter.class)
  public enum Chap4StatusCodeEnum {
    US_WITHHOLDING_AGENT_FI("UsWithholdingAgentFi"),
    
    US_WITHHOLDING_AGENT_OTHER("UsWithholdingAgentOther"),
    
    TERRITORY_FI_NOT_TREATED_AS_US_PERSON("TerritoryFiNotTreatedAsUsPerson"),
    
    TERRITORY_FI_TREATED_AS_US_PERSON("TerritoryFiTreatedAsUsPerson"),
    
    PARTICIPATING_FFI_OTHER("ParticipatingFfiOther"),
    
    PARTICIPATING_FFI_REPORTING_MODEL2_FFI("ParticipatingFfiReportingModel2Ffi"),
    
    REGISTERED_DEEMED_COMPLIANT_FFI_REPORTING_MODEL1_FFI("RegisteredDeemedCompliantFfiReportingModel1Ffi"),
    
    REGISTERED_DEEMED_COMPLIANT_FFI_SPONSORED_ENTITY("RegisteredDeemedCompliantFfiSponsoredEntity"),
    
    REGISTERED_DEEMED_COMPLIANT_FFI_OTHER("RegisteredDeemedCompliantFfiOther"),
    
    CERTIFIED_DEEMED_COMPLIANT_FFI_OTHER("CertifiedDeemedCompliantFfiOther"),
    
    CERTIFIED_DEEMED_COMPLIANT_FFIFFI_WITH_LOW_VALUE_ACCOUNTS("CertifiedDeemedCompliantFfiffiWithLowValueAccounts"),
    
    CERTIFIED_DEEMED_COMPLIANT_FFI_NON_REGISTERING_LOCAL_BANK("CertifiedDeemedCompliantFfiNonRegisteringLocalBank"),
    
    CERTIFIED_DEEMED_COMPLIANT_FFI_SPONSORED_ENTITY("CertifiedDeemedCompliantFfiSponsoredEntity"),
    
    CERTIFIED_DEEMED_COMPLIANT_FFI_INVESTMENT_ADVISOR_OR_MANAGER("CertifiedDeemedCompliantFfiInvestmentAdvisorOrManager"),
    
    NONPARTICIPATING_FFI("NonparticipatingFfi"),
    
    OWNER_DOCUMENTED_FFI("OwnerDocumentedFfi"),
    
    US_BRANCH_TREATED_AS_US_PERSON("UsBranchTreatedAsUsPerson"),
    
    US_BRANCH_NOT_TREATED_AS_US_PERSON("UsBranchNotTreatedAsUsPerson"),
    
    PASSIVE_NFFE_IDENTIFYING_SUBSTANTIAL_US_OWNERS("PassiveNffeIdentifyingSubstantialUsOwners"),
    
    PASSIVE_NFFE_WITH_NO_SUBSTANTIAL_US_OWNERS("PassiveNffeWithNoSubstantialUsOwners"),
    
    PUBLICLY_TRADED_NFFE_OR_AFFILIATE("PubliclyTradedNffeOrAffiliate"),
    
    ACTIVE_NFFE("ActiveNffe"),
    
    INDIVIDUAL("Individual"),
    
    SECTION501_C_ENTITIES("Section501CEntities"),
    
    EXCEPTED_TERRITORY_NFFE("ExceptedTerritoryNffe"),
    
    EXCEPTED_NFFE_OTHER("ExceptedNffeOther"),
    
    EXEMPT_BENEFICIAL_OWNER("ExemptBeneficialOwner"),
    
    ENTITY_WHOLLY_OWNED_BY_EXEMPT_BENEFICIAL_OWNERS("EntityWhollyOwnedByExemptBeneficialOwners"),
    
    UNKNOWN_RECIPIENT("UnknownRecipient"),
    
    RECALCITRANT_ACCOUNT_HOLDER("RecalcitrantAccountHolder"),
    
    NONREPORTING_IGAFII("NonreportingIgafii"),
    
    DIRECT_REPORTING_NFFE("DirectReportingNffe"),
    
    US_REPORTABLE_ACCOUNT("UsReportableAccount"),
    
    NON_CONSENTING_US_ACCOUNT("NonConsentingUsAccount"),
    
    SPONSORED_DIRECT_REPORTING_NFFE("SponsoredDirectReportingNffe"),
    
    EXCEPTED_INTER_AFFILIATE_FFI("ExceptedInterAffiliateFfi"),
    
    UNDOCUMENTED_PREEXISTING_OBLIGATION("UndocumentedPreexistingObligation"),
    
    US_BRANCH_ECI_PRESUMPTION_APPLIED("UsBranchEciPresumptionApplied"),
    
    ACCOUNT_HOLDER_OF_EXCLUDED_FINANCIAL_ACCOUNT("AccountHolderOfExcludedFinancialAccount"),
    
    PASSIVE_NFFE_REPORTED_BY_FFI("PassiveNffeReportedByFfi"),
    
    NFFE_SUBJECT_TO1472_WITHHOLDING("NffeSubjectTo1472Withholding"),
    
    RECALCITRANT_POOL_NO_US_INDICIA("RecalcitrantPoolNoUsIndicia"),
    
    RECALCITRANT_POOL_US_INDICIA("RecalcitrantPoolUsIndicia"),
    
    RECALCITRANT_POOL_DORMANT_ACCOUNT("RecalcitrantPoolDormantAccount"),
    
    RECALCITRANT_POOL_US_PERSONS("RecalcitrantPoolUsPersons"),
    
    RECALCITRANT_POOL_PASSIVE_NFF_ES("RecalcitrantPoolPassiveNffEs"),
    
    NONPARTICIPATING_FFI_POOL("NonparticipatingFfiPool"),
    
    US_PAYEES_POOL("UsPayeesPool"),
    
    QI_RECALCITRANT_POOL_GENERAL("QiRecalcitrantPoolGeneral"),
    
    US_WITHHOLDING_AGENT_FOREIGN_BRANCH_OF_FI("UsWithholdingAgentForeignBranchOfFi");

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

  public static final String SERIALIZED_NAME_SECOND_TIN_NOTICE = "secondTinNotice";
  @SerializedName(SERIALIZED_NAME_SECOND_TIN_NOTICE)
  private Boolean secondTinNotice;

  public static final String SERIALIZED_NAME_ADDRESS_VERIFICATION = "addressVerification";
  @SerializedName(SERIALIZED_NAME_ADDRESS_VERIFICATION)
  private Boolean addressVerification;

  public static final String SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING = "stateAndLocalWithholding";
  @SerializedName(SERIALIZED_NAME_STATE_AND_LOCAL_WITHHOLDING)
  private StateAndLocalWithholdingRequest stateAndLocalWithholding;

  public Form1042SListItem() {
  }

  public Form1042SListItem uniqueFormId(String uniqueFormId) {
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


  public Form1042SListItem noTin(Boolean noTin) {
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


  public Form1042SListItem recipientDateOfBirth(OffsetDateTime recipientDateOfBirth) {
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


  public Form1042SListItem recipientGiin(String recipientGiin) {
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


  public Form1042SListItem recipientForeignTin(String recipientForeignTin) {
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


  public Form1042SListItem lobCode(LobCodeEnum lobCode) {
    this.lobCode = lobCode;
    return this;
  }

  /**
   * Limitation on benefits code
   * @return lobCode
   */
  @javax.annotation.Nullable
  public LobCodeEnum getLobCode() {
    return lobCode;
  }

  public void setLobCode(LobCodeEnum lobCode) {
    this.lobCode = lobCode;
  }


  public Form1042SListItem incomeCode(String incomeCode) {
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


  public Form1042SListItem grossIncome(Double grossIncome) {
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


  public Form1042SListItem withholdingIndicator(String withholdingIndicator) {
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


  public Form1042SListItem taxCountryCode(String taxCountryCode) {
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


  public Form1042SListItem exemptionCodeChap3(ExemptionCodeChap3Enum exemptionCodeChap3) {
    this.exemptionCodeChap3 = exemptionCodeChap3;
    return this;
  }

  /**
   * Exemption code (Chapter 3)
   * @return exemptionCodeChap3
   */
  @javax.annotation.Nullable
  public ExemptionCodeChap3Enum getExemptionCodeChap3() {
    return exemptionCodeChap3;
  }

  public void setExemptionCodeChap3(ExemptionCodeChap3Enum exemptionCodeChap3) {
    this.exemptionCodeChap3 = exemptionCodeChap3;
  }


  public Form1042SListItem exemptionCodeChap4(ExemptionCodeChap4Enum exemptionCodeChap4) {
    this.exemptionCodeChap4 = exemptionCodeChap4;
    return this;
  }

  /**
   * Exemption code (Chapter 4)
   * @return exemptionCodeChap4
   */
  @javax.annotation.Nullable
  public ExemptionCodeChap4Enum getExemptionCodeChap4() {
    return exemptionCodeChap4;
  }

  public void setExemptionCodeChap4(ExemptionCodeChap4Enum exemptionCodeChap4) {
    this.exemptionCodeChap4 = exemptionCodeChap4;
  }


  public Form1042SListItem taxRateChap3(String taxRateChap3) {
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


  public Form1042SListItem withholdingAllowance(Double withholdingAllowance) {
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


  public Form1042SListItem federalTaxWithheld(Double federalTaxWithheld) {
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


  public Form1042SListItem taxNotDepositedIndicator(Boolean taxNotDepositedIndicator) {
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


  public Form1042SListItem academicIndicator(Boolean academicIndicator) {
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


  public Form1042SListItem taxWithheldOtherAgents(Double taxWithheldOtherAgents) {
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


  public Form1042SListItem amountRepaid(Double amountRepaid) {
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


  public Form1042SListItem taxPaidAgent(Double taxPaidAgent) {
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


  public Form1042SListItem chap3StatusCode(Chap3StatusCodeEnum chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
    return this;
  }

  /**
   * Chapter 3 status code
   * @return chap3StatusCode
   */
  @javax.annotation.Nullable
  public Chap3StatusCodeEnum getChap3StatusCode() {
    return chap3StatusCode;
  }

  public void setChap3StatusCode(Chap3StatusCodeEnum chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
  }


  public Form1042SListItem chap4StatusCode(Chap4StatusCodeEnum chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
    return this;
  }

  /**
   * Chapter 4 status code
   * @return chap4StatusCode
   */
  @javax.annotation.Nullable
  public Chap4StatusCodeEnum getChap4StatusCode() {
    return chap4StatusCode;
  }

  public void setChap4StatusCode(Chap4StatusCodeEnum chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
  }


  public Form1042SListItem primaryWithholdingAgent(PrimaryWithholdingAgent primaryWithholdingAgent) {
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


  public Form1042SListItem intermediaryOrFlowThrough(IntermediaryOrFlowThrough intermediaryOrFlowThrough) {
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


  public Form1042SListItem issuerId(String issuerId) {
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


  public Form1042SListItem referenceId(String referenceId) {
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


  public Form1042SListItem recipientTin(String recipientTin) {
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


  public Form1042SListItem recipientName(String recipientName) {
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


  public Form1042SListItem tinType(TinTypeEnum tinType) {
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


  public Form1042SListItem recipientSecondName(String recipientSecondName) {
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


  public Form1042SListItem address(String address) {
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


  public Form1042SListItem address2(String address2) {
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


  public Form1042SListItem city(String city) {
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


  public Form1042SListItem state(String state) {
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


  public Form1042SListItem zip(String zip) {
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


  public Form1042SListItem email(String email) {
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


  public Form1042SListItem accountNumber(String accountNumber) {
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


  public Form1042SListItem officeCode(String officeCode) {
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


  public Form1042SListItem nonUsProvince(String nonUsProvince) {
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


  public Form1042SListItem countryCode(String countryCode) {
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


  public Form1042SListItem federalEFile(Boolean federalEFile) {
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


  public Form1042SListItem postalMail(Boolean postalMail) {
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


  public Form1042SListItem stateEFile(Boolean stateEFile) {
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


  public Form1042SListItem tinMatch(Boolean tinMatch) {
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


  public Form1042SListItem secondTinNotice(Boolean secondTinNotice) {
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


  public Form1042SListItem addressVerification(Boolean addressVerification) {
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


  public Form1042SListItem stateAndLocalWithholding(StateAndLocalWithholdingRequest stateAndLocalWithholding) {
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
    Form1042SListItem form1042SListItem = (Form1042SListItem) o;
    return Objects.equals(this.uniqueFormId, form1042SListItem.uniqueFormId) &&
        Objects.equals(this.noTin, form1042SListItem.noTin) &&
        Objects.equals(this.recipientDateOfBirth, form1042SListItem.recipientDateOfBirth) &&
        Objects.equals(this.recipientGiin, form1042SListItem.recipientGiin) &&
        Objects.equals(this.recipientForeignTin, form1042SListItem.recipientForeignTin) &&
        Objects.equals(this.lobCode, form1042SListItem.lobCode) &&
        Objects.equals(this.incomeCode, form1042SListItem.incomeCode) &&
        Objects.equals(this.grossIncome, form1042SListItem.grossIncome) &&
        Objects.equals(this.withholdingIndicator, form1042SListItem.withholdingIndicator) &&
        Objects.equals(this.taxCountryCode, form1042SListItem.taxCountryCode) &&
        Objects.equals(this.exemptionCodeChap3, form1042SListItem.exemptionCodeChap3) &&
        Objects.equals(this.exemptionCodeChap4, form1042SListItem.exemptionCodeChap4) &&
        Objects.equals(this.taxRateChap3, form1042SListItem.taxRateChap3) &&
        Objects.equals(this.withholdingAllowance, form1042SListItem.withholdingAllowance) &&
        Objects.equals(this.federalTaxWithheld, form1042SListItem.federalTaxWithheld) &&
        Objects.equals(this.taxNotDepositedIndicator, form1042SListItem.taxNotDepositedIndicator) &&
        Objects.equals(this.academicIndicator, form1042SListItem.academicIndicator) &&
        Objects.equals(this.taxWithheldOtherAgents, form1042SListItem.taxWithheldOtherAgents) &&
        Objects.equals(this.amountRepaid, form1042SListItem.amountRepaid) &&
        Objects.equals(this.taxPaidAgent, form1042SListItem.taxPaidAgent) &&
        Objects.equals(this.chap3StatusCode, form1042SListItem.chap3StatusCode) &&
        Objects.equals(this.chap4StatusCode, form1042SListItem.chap4StatusCode) &&
        Objects.equals(this.primaryWithholdingAgent, form1042SListItem.primaryWithholdingAgent) &&
        Objects.equals(this.intermediaryOrFlowThrough, form1042SListItem.intermediaryOrFlowThrough) &&
        Objects.equals(this.issuerId, form1042SListItem.issuerId) &&
        Objects.equals(this.referenceId, form1042SListItem.referenceId) &&
        Objects.equals(this.recipientTin, form1042SListItem.recipientTin) &&
        Objects.equals(this.recipientName, form1042SListItem.recipientName) &&
        Objects.equals(this.tinType, form1042SListItem.tinType) &&
        Objects.equals(this.recipientSecondName, form1042SListItem.recipientSecondName) &&
        Objects.equals(this.address, form1042SListItem.address) &&
        Objects.equals(this.address2, form1042SListItem.address2) &&
        Objects.equals(this.city, form1042SListItem.city) &&
        Objects.equals(this.state, form1042SListItem.state) &&
        Objects.equals(this.zip, form1042SListItem.zip) &&
        Objects.equals(this.email, form1042SListItem.email) &&
        Objects.equals(this.accountNumber, form1042SListItem.accountNumber) &&
        Objects.equals(this.officeCode, form1042SListItem.officeCode) &&
        Objects.equals(this.nonUsProvince, form1042SListItem.nonUsProvince) &&
        Objects.equals(this.countryCode, form1042SListItem.countryCode) &&
        Objects.equals(this.federalEFile, form1042SListItem.federalEFile) &&
        Objects.equals(this.postalMail, form1042SListItem.postalMail) &&
        Objects.equals(this.stateEFile, form1042SListItem.stateEFile) &&
        Objects.equals(this.tinMatch, form1042SListItem.tinMatch) &&
        Objects.equals(this.secondTinNotice, form1042SListItem.secondTinNotice) &&
        Objects.equals(this.addressVerification, form1042SListItem.addressVerification) &&
        Objects.equals(this.stateAndLocalWithholding, form1042SListItem.stateAndLocalWithholding);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueFormId, noTin, recipientDateOfBirth, recipientGiin, recipientForeignTin, lobCode, incomeCode, grossIncome, withholdingIndicator, taxCountryCode, exemptionCodeChap3, exemptionCodeChap4, taxRateChap3, withholdingAllowance, federalTaxWithheld, taxNotDepositedIndicator, academicIndicator, taxWithheldOtherAgents, amountRepaid, taxPaidAgent, chap3StatusCode, chap4StatusCode, primaryWithholdingAgent, intermediaryOrFlowThrough, issuerId, referenceId, recipientTin, recipientName, tinType, recipientSecondName, address, address2, city, state, zip, email, accountNumber, officeCode, nonUsProvince, countryCode, federalEFile, postalMail, stateEFile, tinMatch, secondTinNotice, addressVerification, stateAndLocalWithholding);
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
    sb.append("class Form1042SListItem {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to Form1042SListItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1042SListItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1042SListItem is not found in the empty JSON string", Form1042SListItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1042SListItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1042SListItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Form1042SListItem.openapiRequiredFields) {
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
      // validate the optional field `lobCode`
      if (jsonObj.get("lobCode") != null && !jsonObj.get("lobCode").isJsonNull()) {
        LobCodeEnum.validateJsonElement(jsonObj.get("lobCode"));
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
       if (!Form1042SListItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1042SListItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1042SListItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1042SListItem.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1042SListItem>() {
           @Override
           public void write(JsonWriter out, Form1042SListItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1042SListItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1042SListItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1042SListItem
   * @throws IOException if the JSON string is invalid with respect to Form1042SListItem
   */
  public static Form1042SListItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1042SListItem.class);
  }

  /**
   * Convert an instance of Form1042SListItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

