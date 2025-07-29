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
import Avalara.SDK.model.A1099.V2.SubstantialUsOwnerRequest;
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
 * W8BenEFormRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class W8BenEFormRequest {
  /**
   * The form type (always \&quot;w8bene\&quot; for this model).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    W4("W4"),
    
    W8_BEN("W8Ben"),
    
    W8_BEN_E("W8BenE"),
    
    W8_IMY("W8Imy"),
    
    W9("W9");

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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CITIZENSHIP_COUNTRY = "citizenshipCountry";
  @SerializedName(SERIALIZED_NAME_CITIZENSHIP_COUNTRY)
  private String citizenshipCountry;

  public static final String SERIALIZED_NAME_DISREGARDED_ENTITY = "disregardedEntity";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_ENTITY)
  private String disregardedEntity;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_MAKING_TREATY_CLAIM = "makingTreatyClaim";
  @SerializedName(SERIALIZED_NAME_MAKING_TREATY_CLAIM)
  private Boolean makingTreatyClaim;

  public static final String SERIALIZED_NAME_FATCA_STATUS = "fatcaStatus";
  @SerializedName(SERIALIZED_NAME_FATCA_STATUS)
  private String fatcaStatus;

  public static final String SERIALIZED_NAME_RESIDENCE_ADDRESS = "residenceAddress";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_ADDRESS)
  private String residenceAddress;

  public static final String SERIALIZED_NAME_RESIDENCE_CITY = "residenceCity";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_CITY)
  private String residenceCity;

  public static final String SERIALIZED_NAME_RESIDENCE_STATE = "residenceState";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_STATE)
  private String residenceState;

  public static final String SERIALIZED_NAME_RESIDENCE_ZIP = "residenceZip";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_ZIP)
  private String residenceZip;

  public static final String SERIALIZED_NAME_RESIDENCE_COUNTRY = "residenceCountry";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_COUNTRY)
  private String residenceCountry;

  public static final String SERIALIZED_NAME_RESIDENCE_IS_MAILING = "residenceIsMailing";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_IS_MAILING)
  private Boolean residenceIsMailing;

  public static final String SERIALIZED_NAME_MAILING_ADDRESS = "mailingAddress";
  @SerializedName(SERIALIZED_NAME_MAILING_ADDRESS)
  private String mailingAddress;

  public static final String SERIALIZED_NAME_MAILING_CITY = "mailingCity";
  @SerializedName(SERIALIZED_NAME_MAILING_CITY)
  private String mailingCity;

  public static final String SERIALIZED_NAME_MAILING_STATE = "mailingState";
  @SerializedName(SERIALIZED_NAME_MAILING_STATE)
  private String mailingState;

  public static final String SERIALIZED_NAME_MAILING_ZIP = "mailingZip";
  @SerializedName(SERIALIZED_NAME_MAILING_ZIP)
  private String mailingZip;

  public static final String SERIALIZED_NAME_MAILING_COUNTRY = "mailingCountry";
  @SerializedName(SERIALIZED_NAME_MAILING_COUNTRY)
  private String mailingCountry;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_GIIN = "giin";
  @SerializedName(SERIALIZED_NAME_GIIN)
  private String giin;

  public static final String SERIALIZED_NAME_FOREIGN_TIN_NOT_REQUIRED = "foreignTinNotRequired";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TIN_NOT_REQUIRED)
  private Boolean foreignTinNotRequired;

  public static final String SERIALIZED_NAME_FOREIGN_TIN = "foreignTin";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TIN)
  private String foreignTin;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_DISREGARDED_ENTITY_FATCA_STATUS = "disregardedEntityFatcaStatus";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_ENTITY_FATCA_STATUS)
  private String disregardedEntityFatcaStatus;

  public static final String SERIALIZED_NAME_DISREGARDED_ADDRESS = "disregardedAddress";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_ADDRESS)
  private String disregardedAddress;

  public static final String SERIALIZED_NAME_DISREGARDED_CITY = "disregardedCity";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_CITY)
  private String disregardedCity;

  public static final String SERIALIZED_NAME_DISREGARDED_STATE = "disregardedState";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_STATE)
  private String disregardedState;

  public static final String SERIALIZED_NAME_DISREGARDED_ZIP = "disregardedZip";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_ZIP)
  private String disregardedZip;

  public static final String SERIALIZED_NAME_DISREGARDED_COUNTRY = "disregardedCountry";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_COUNTRY)
  private String disregardedCountry;

  public static final String SERIALIZED_NAME_DISREGARDED_ENTITY_GIIN = "disregardedEntityGiin";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_ENTITY_GIIN)
  private String disregardedEntityGiin;

  public static final String SERIALIZED_NAME_TREATY_COUNTRY_CERTIFICATION = "treatyCountryCertification";
  @SerializedName(SERIALIZED_NAME_TREATY_COUNTRY_CERTIFICATION)
  private Boolean treatyCountryCertification;

  public static final String SERIALIZED_NAME_TREATY_COUNTRY = "treatyCountry";
  @SerializedName(SERIALIZED_NAME_TREATY_COUNTRY)
  private String treatyCountry;

  public static final String SERIALIZED_NAME_BENEFIT_LIMITATION_CERTIFICATION = "benefitLimitationCertification";
  @SerializedName(SERIALIZED_NAME_BENEFIT_LIMITATION_CERTIFICATION)
  private Boolean benefitLimitationCertification;

  public static final String SERIALIZED_NAME_BENEFIT_LIMITATION = "benefitLimitation";
  @SerializedName(SERIALIZED_NAME_BENEFIT_LIMITATION)
  private String benefitLimitation;

  public static final String SERIALIZED_NAME_QUALIFIED_RESIDENT_STATUS_CERTIFICATION = "qualifiedResidentStatusCertification";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_RESIDENT_STATUS_CERTIFICATION)
  private Boolean qualifiedResidentStatusCertification;

  public static final String SERIALIZED_NAME_TREATY_ARTICLE = "treatyArticle";
  @SerializedName(SERIALIZED_NAME_TREATY_ARTICLE)
  private String treatyArticle;

  public static final String SERIALIZED_NAME_WITHHOLDING_RATE = "withholdingRate";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_RATE)
  private String withholdingRate;

  public static final String SERIALIZED_NAME_INCOME_TYPE = "incomeType";
  @SerializedName(SERIALIZED_NAME_INCOME_TYPE)
  private String incomeType;

  public static final String SERIALIZED_NAME_TREATY_REASONS = "treatyReasons";
  @SerializedName(SERIALIZED_NAME_TREATY_REASONS)
  private String treatyReasons;

  public static final String SERIALIZED_NAME_FFI_SPONSORING_ENTITY = "ffiSponsoringEntity";
  @SerializedName(SERIALIZED_NAME_FFI_SPONSORING_ENTITY)
  private String ffiSponsoringEntity;

  public static final String SERIALIZED_NAME_INVESTMENT_ENTITY_CERTIFICATION = "investmentEntityCertification";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_ENTITY_CERTIFICATION)
  private Boolean investmentEntityCertification;

  public static final String SERIALIZED_NAME_CONTROLLED_FOREIGN_CORPORATION_CERTIFICATION = "controlledForeignCorporationCertification";
  @SerializedName(SERIALIZED_NAME_CONTROLLED_FOREIGN_CORPORATION_CERTIFICATION)
  private Boolean controlledForeignCorporationCertification;

  public static final String SERIALIZED_NAME_COMPLIANT_NONREGISTERING_LOCAL_BANK_CERTIFICATION = "compliantNonregisteringLocalBankCertification";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_NONREGISTERING_LOCAL_BANK_CERTIFICATION)
  private Boolean compliantNonregisteringLocalBankCertification;

  public static final String SERIALIZED_NAME_COMPLIANT_FFI_LOW_VALUE_ACCOUNTS_CERTIFICATION = "compliantFfiLowValueAccountsCertification";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_FFI_LOW_VALUE_ACCOUNTS_CERTIFICATION)
  private Boolean compliantFfiLowValueAccountsCertification;

  public static final String SERIALIZED_NAME_SPONSORED_CLOSELY_HELD_ENTITY_SPONSORING_ENTITY = "sponsoredCloselyHeldEntitySponsoringEntity";
  @SerializedName(SERIALIZED_NAME_SPONSORED_CLOSELY_HELD_ENTITY_SPONSORING_ENTITY)
  private String sponsoredCloselyHeldEntitySponsoringEntity;

  public static final String SERIALIZED_NAME_SPONSORED_CLOSELY_HELD_INVESTMENT_VEHICLE_CERTIFICATION = "sponsoredCloselyHeldInvestmentVehicleCertification";
  @SerializedName(SERIALIZED_NAME_SPONSORED_CLOSELY_HELD_INVESTMENT_VEHICLE_CERTIFICATION)
  private Boolean sponsoredCloselyHeldInvestmentVehicleCertification;

  public static final String SERIALIZED_NAME_COMPLIANT_LIMITED_LIFE_DEBT_ENTITY_CERTIFICATION = "compliantLimitedLifeDebtEntityCertification";
  @SerializedName(SERIALIZED_NAME_COMPLIANT_LIMITED_LIFE_DEBT_ENTITY_CERTIFICATION)
  private Boolean compliantLimitedLifeDebtEntityCertification;

  public static final String SERIALIZED_NAME_INVESTMENT_ENTITY_NO_FINANCIAL_ACCOUNTS_CERTIFICATION = "investmentEntityNoFinancialAccountsCertification";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_ENTITY_NO_FINANCIAL_ACCOUNTS_CERTIFICATION)
  private Boolean investmentEntityNoFinancialAccountsCertification;

  public static final String SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_CERTIFICATION = "ownerDocumentedFfiCertification";
  @SerializedName(SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_CERTIFICATION)
  private Boolean ownerDocumentedFfiCertification;

  public static final String SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_REPORTING_STATEMENT_CERTIFICATION = "ownerDocumentedFfiReportingStatementCertification";
  @SerializedName(SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_REPORTING_STATEMENT_CERTIFICATION)
  private Boolean ownerDocumentedFfiReportingStatementCertification;

  public static final String SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_AUDITOR_LETTER_CERTIFICATION = "ownerDocumentedFfiAuditorLetterCertification";
  @SerializedName(SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_AUDITOR_LETTER_CERTIFICATION)
  private Boolean ownerDocumentedFfiAuditorLetterCertification;

  public static final String SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_TRUST_BENEFICIARIES_CERTIFICATION = "ownerDocumentedFfiTrustBeneficiariesCertification";
  @SerializedName(SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_TRUST_BENEFICIARIES_CERTIFICATION)
  private Boolean ownerDocumentedFfiTrustBeneficiariesCertification;

  public static final String SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_CERTIFICATION = "restrictedDistributorCertification";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_CERTIFICATION)
  private Boolean restrictedDistributorCertification;

  public static final String SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_AGREEMENT_CERTIFICATION = "restrictedDistributorAgreementCertification";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_AGREEMENT_CERTIFICATION)
  private Boolean restrictedDistributorAgreementCertification;

  public static final String SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_PREEXISTING_SALES_COMPLIANCE_CERTIFICATION = "restrictedDistributorPreexistingSalesComplianceCertification";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_PREEXISTING_SALES_COMPLIANCE_CERTIFICATION)
  private Boolean restrictedDistributorPreexistingSalesComplianceCertification;

  public static final String SERIALIZED_NAME_NONREPORTING_IGA_FFI_CERTIFICATION = "nonreportingIgaFfiCertification";
  @SerializedName(SERIALIZED_NAME_NONREPORTING_IGA_FFI_CERTIFICATION)
  private Boolean nonreportingIgaFfiCertification;

  public static final String SERIALIZED_NAME_IGA_COUNTRY = "igaCountry";
  @SerializedName(SERIALIZED_NAME_IGA_COUNTRY)
  private String igaCountry;

  public static final String SERIALIZED_NAME_IGA_MODEL = "igaModel";
  @SerializedName(SERIALIZED_NAME_IGA_MODEL)
  private String igaModel;

  public static final String SERIALIZED_NAME_IGA_LEGAL_STATUS_TREATMENT = "igaLegalStatusTreatment";
  @SerializedName(SERIALIZED_NAME_IGA_LEGAL_STATUS_TREATMENT)
  private String igaLegalStatusTreatment;

  public static final String SERIALIZED_NAME_IGA_FFI_TRUSTEE_OR_SPONSOR = "igaFfiTrusteeOrSponsor";
  @SerializedName(SERIALIZED_NAME_IGA_FFI_TRUSTEE_OR_SPONSOR)
  private String igaFfiTrusteeOrSponsor;

  public static final String SERIALIZED_NAME_IGA_FFI_TRUSTEE_IS_FOREIGN = "igaFfiTrusteeIsForeign";
  @SerializedName(SERIALIZED_NAME_IGA_FFI_TRUSTEE_IS_FOREIGN)
  private Boolean igaFfiTrusteeIsForeign;

  public static final String SERIALIZED_NAME_NON_COMMERCIAL_FINANCIAL_ACTIVITY_CERTIFICATION = "nonCommercialFinancialActivityCertification";
  @SerializedName(SERIALIZED_NAME_NON_COMMERCIAL_FINANCIAL_ACTIVITY_CERTIFICATION)
  private Boolean nonCommercialFinancialActivityCertification;

  public static final String SERIALIZED_NAME_INTERNATION_ORGANIZATION_CERTIFICATION = "internationOrganizationCertification";
  @SerializedName(SERIALIZED_NAME_INTERNATION_ORGANIZATION_CERTIFICATION)
  private Boolean internationOrganizationCertification;

  public static final String SERIALIZED_NAME_INTERGOVERNMENTAL_ORGANIZATION_CERTIFICATION = "intergovernmentalOrganizationCertification";
  @SerializedName(SERIALIZED_NAME_INTERGOVERNMENTAL_ORGANIZATION_CERTIFICATION)
  private Boolean intergovernmentalOrganizationCertification;

  public static final String SERIALIZED_NAME_TREATY_QUALIFIED_PENSION_FUND_CERTIFICATION = "treatyQualifiedPensionFundCertification";
  @SerializedName(SERIALIZED_NAME_TREATY_QUALIFIED_PENSION_FUND_CERTIFICATION)
  private Boolean treatyQualifiedPensionFundCertification;

  public static final String SERIALIZED_NAME_QUALIFIED_RETIREMENT_FUND_CERTIFICATION = "qualifiedRetirementFundCertification";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_RETIREMENT_FUND_CERTIFICATION)
  private Boolean qualifiedRetirementFundCertification;

  public static final String SERIALIZED_NAME_NARROW_PARTICIPATION_RETIREMENT_FUND_CERTIFICATION = "narrowParticipationRetirementFundCertification";
  @SerializedName(SERIALIZED_NAME_NARROW_PARTICIPATION_RETIREMENT_FUND_CERTIFICATION)
  private Boolean narrowParticipationRetirementFundCertification;

  public static final String SERIALIZED_NAME_SECTION401_A_EQUIVALENT_PENSION_PLAN_CERTIFICATION = "section401AEquivalentPensionPlanCertification";
  @SerializedName(SERIALIZED_NAME_SECTION401_A_EQUIVALENT_PENSION_PLAN_CERTIFICATION)
  private Boolean section401AEquivalentPensionPlanCertification;

  public static final String SERIALIZED_NAME_INVESTMENT_ENTITY_FOR_RETIREMENT_FUNDS_CERTIFICATION = "investmentEntityForRetirementFundsCertification";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_ENTITY_FOR_RETIREMENT_FUNDS_CERTIFICATION)
  private Boolean investmentEntityForRetirementFundsCertification;

  public static final String SERIALIZED_NAME_EXEMPT_BENEFICIAL_OWNER_SPONSORED_RETIREMENT_FUND_CERTIFICATION = "exemptBeneficialOwnerSponsoredRetirementFundCertification";
  @SerializedName(SERIALIZED_NAME_EXEMPT_BENEFICIAL_OWNER_SPONSORED_RETIREMENT_FUND_CERTIFICATION)
  private Boolean exemptBeneficialOwnerSponsoredRetirementFundCertification;

  public static final String SERIALIZED_NAME_EXEMPT_BENEFICIAL_OWNER_OWNED_INVESTMENT_ENTITY_CERTIFICATION = "exemptBeneficialOwnerOwnedInvestmentEntityCertification";
  @SerializedName(SERIALIZED_NAME_EXEMPT_BENEFICIAL_OWNER_OWNED_INVESTMENT_ENTITY_CERTIFICATION)
  private Boolean exemptBeneficialOwnerOwnedInvestmentEntityCertification;

  public static final String SERIALIZED_NAME_TERRITORY_FINANCIAL_INSTITUTION_CERTIFICATION = "territoryFinancialInstitutionCertification";
  @SerializedName(SERIALIZED_NAME_TERRITORY_FINANCIAL_INSTITUTION_CERTIFICATION)
  private Boolean territoryFinancialInstitutionCertification;

  public static final String SERIALIZED_NAME_EXCEPTED_NONFINANCIAL_GROUP_ENTITY_CERTIFICATION = "exceptedNonfinancialGroupEntityCertification";
  @SerializedName(SERIALIZED_NAME_EXCEPTED_NONFINANCIAL_GROUP_ENTITY_CERTIFICATION)
  private Boolean exceptedNonfinancialGroupEntityCertification;

  public static final String SERIALIZED_NAME_EXCEPTED_NONFINANCIAL_START_UP_CERTIFICATION = "exceptedNonfinancialStartUpCertification";
  @SerializedName(SERIALIZED_NAME_EXCEPTED_NONFINANCIAL_START_UP_CERTIFICATION)
  private Boolean exceptedNonfinancialStartUpCertification;

  public static final String SERIALIZED_NAME_STARTUP_FORMATION_OR_RESOLUTION_DATE = "startupFormationOrResolutionDate";
  @SerializedName(SERIALIZED_NAME_STARTUP_FORMATION_OR_RESOLUTION_DATE)
  private LocalDate startupFormationOrResolutionDate;

  public static final String SERIALIZED_NAME_EXCEPTED_NONFINANCIAL_ENTITY_IN_LIQUIDATION_OR_BANKRUPTCY_CERTIFICATION = "exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification";
  @SerializedName(SERIALIZED_NAME_EXCEPTED_NONFINANCIAL_ENTITY_IN_LIQUIDATION_OR_BANKRUPTCY_CERTIFICATION)
  private Boolean exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification;

  public static final String SERIALIZED_NAME_NONFINANCIAL_ENTITY_FILING_DATE = "nonfinancialEntityFilingDate";
  @SerializedName(SERIALIZED_NAME_NONFINANCIAL_ENTITY_FILING_DATE)
  private LocalDate nonfinancialEntityFilingDate;

  public static final String SERIALIZED_NAME_SECTION501_C_ORGANIZATION_CERTIFICATION = "section501COrganizationCertification";
  @SerializedName(SERIALIZED_NAME_SECTION501_C_ORGANIZATION_CERTIFICATION)
  private Boolean section501COrganizationCertification;

  public static final String SERIALIZED_NAME_DETERMINATION_LETTER_DATE = "determinationLetterDate";
  @SerializedName(SERIALIZED_NAME_DETERMINATION_LETTER_DATE)
  private LocalDate determinationLetterDate;

  public static final String SERIALIZED_NAME_NONPROFIT_ORGANIZATION_CERTIFICATION = "nonprofitOrganizationCertification";
  @SerializedName(SERIALIZED_NAME_NONPROFIT_ORGANIZATION_CERTIFICATION)
  private Boolean nonprofitOrganizationCertification;

  public static final String SERIALIZED_NAME_PUBLICLY_TRADED_NFFE_CERTIFICATION = "publiclyTradedNffeCertification";
  @SerializedName(SERIALIZED_NAME_PUBLICLY_TRADED_NFFE_CERTIFICATION)
  private Boolean publiclyTradedNffeCertification;

  public static final String SERIALIZED_NAME_PUBLICLY_TRADED_NFFE_SECURITIES_MARKET = "publiclyTradedNffeSecuritiesMarket";
  @SerializedName(SERIALIZED_NAME_PUBLICLY_TRADED_NFFE_SECURITIES_MARKET)
  private String publiclyTradedNffeSecuritiesMarket;

  public static final String SERIALIZED_NAME_NFFE_AFFILIATE_OF_PUBLICLY_TRADED_ENTITY_CERTIFICATION = "nffeAffiliateOfPubliclyTradedEntityCertification";
  @SerializedName(SERIALIZED_NAME_NFFE_AFFILIATE_OF_PUBLICLY_TRADED_ENTITY_CERTIFICATION)
  private Boolean nffeAffiliateOfPubliclyTradedEntityCertification;

  public static final String SERIALIZED_NAME_PUBLICLY_TRADED_ENTITY = "publiclyTradedEntity";
  @SerializedName(SERIALIZED_NAME_PUBLICLY_TRADED_ENTITY)
  private String publiclyTradedEntity;

  public static final String SERIALIZED_NAME_NFFE_AFFILIATE_OF_PUBLICLY_TRADED_ENTITY_SECURITIES_MARKET = "nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket";
  @SerializedName(SERIALIZED_NAME_NFFE_AFFILIATE_OF_PUBLICLY_TRADED_ENTITY_SECURITIES_MARKET)
  private String nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket;

  public static final String SERIALIZED_NAME_EXCEPTED_TERRITORY_NFFE_CERTIFICATION = "exceptedTerritoryNffeCertification";
  @SerializedName(SERIALIZED_NAME_EXCEPTED_TERRITORY_NFFE_CERTIFICATION)
  private Boolean exceptedTerritoryNffeCertification;

  public static final String SERIALIZED_NAME_ACTIVE_NFFE_CERTIFICATION = "activeNffeCertification";
  @SerializedName(SERIALIZED_NAME_ACTIVE_NFFE_CERTIFICATION)
  private Boolean activeNffeCertification;

  public static final String SERIALIZED_NAME_PASSIVE_NFFE_CERTIFICATION = "passiveNffeCertification";
  @SerializedName(SERIALIZED_NAME_PASSIVE_NFFE_CERTIFICATION)
  private Boolean passiveNffeCertification;

  public static final String SERIALIZED_NAME_PASSIVE_NFFE_NO_SUBSTANTIAL_US_OWNERS_CERTIFICATION = "passiveNffeNoSubstantialUsOwnersCertification";
  @SerializedName(SERIALIZED_NAME_PASSIVE_NFFE_NO_SUBSTANTIAL_US_OWNERS_CERTIFICATION)
  private Boolean passiveNffeNoSubstantialUsOwnersCertification;

  public static final String SERIALIZED_NAME_PASSIVE_NFFE_SUBSTANTIAL_US_OWNERS_PROVIDED_CERTIFICATION = "passiveNffeSubstantialUsOwnersProvidedCertification";
  @SerializedName(SERIALIZED_NAME_PASSIVE_NFFE_SUBSTANTIAL_US_OWNERS_PROVIDED_CERTIFICATION)
  private Boolean passiveNffeSubstantialUsOwnersProvidedCertification;

  public static final String SERIALIZED_NAME_EXCEPTED_INTER_AFFILIATE_FFI_CERTIFICATION = "exceptedInterAffiliateFfiCertification";
  @SerializedName(SERIALIZED_NAME_EXCEPTED_INTER_AFFILIATE_FFI_CERTIFICATION)
  private Boolean exceptedInterAffiliateFfiCertification;

  public static final String SERIALIZED_NAME_SPONSORED_DIRECT_REPORTING_NFFE_CERTIFICATION = "sponsoredDirectReportingNffeCertification";
  @SerializedName(SERIALIZED_NAME_SPONSORED_DIRECT_REPORTING_NFFE_CERTIFICATION)
  private Boolean sponsoredDirectReportingNffeCertification;

  public static final String SERIALIZED_NAME_DIRECT_REPORTING_NFFE_SPONSORING_ENTITY = "directReportingNffeSponsoringEntity";
  @SerializedName(SERIALIZED_NAME_DIRECT_REPORTING_NFFE_SPONSORING_ENTITY)
  private String directReportingNffeSponsoringEntity;

  public static final String SERIALIZED_NAME_SUBSTANTIAL_US_OWNERS = "substantialUsOwners";
  @SerializedName(SERIALIZED_NAME_SUBSTANTIAL_US_OWNERS)
  private List<SubstantialUsOwnerRequest> substantialUsOwners;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_CAPACITY_TO_SIGN_CERTIFICATION = "capacityToSignCertification";
  @SerializedName(SERIALIZED_NAME_CAPACITY_TO_SIGN_CERTIFICATION)
  private Boolean capacityToSignCertification;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT = "eDeliveryConsentedAt";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT)
  private OffsetDateTime eDeliveryConsentedAt;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public W8BenEFormRequest() {
  }

  public W8BenEFormRequest(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  /**
   * The form type (always \&quot;w8bene\&quot; for this model).
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }



  public W8BenEFormRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the individual or entity associated with the form.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public W8BenEFormRequest citizenshipCountry(String citizenshipCountry) {
    this.citizenshipCountry = citizenshipCountry;
    return this;
  }

  /**
   * The country of citizenship.
   * @return citizenshipCountry
   */
  @javax.annotation.Nullable
  public String getCitizenshipCountry() {
    return citizenshipCountry;
  }

  public void setCitizenshipCountry(String citizenshipCountry) {
    this.citizenshipCountry = citizenshipCountry;
  }


  public W8BenEFormRequest disregardedEntity(String disregardedEntity) {
    this.disregardedEntity = disregardedEntity;
    return this;
  }

  /**
   * The name of the disregarded entity receiving the payment (if applicable).
   * @return disregardedEntity
   */
  @javax.annotation.Nullable
  public String getDisregardedEntity() {
    return disregardedEntity;
  }

  public void setDisregardedEntity(String disregardedEntity) {
    this.disregardedEntity = disregardedEntity;
  }


  public W8BenEFormRequest entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * The entity type.
   * @return entityType
   */
  @javax.annotation.Nullable
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public W8BenEFormRequest makingTreatyClaim(Boolean makingTreatyClaim) {
    this.makingTreatyClaim = makingTreatyClaim;
    return this;
  }

  /**
   * Indicates whether the entity is making a treaty claim.
   * @return makingTreatyClaim
   */
  @javax.annotation.Nullable
  public Boolean getMakingTreatyClaim() {
    return makingTreatyClaim;
  }

  public void setMakingTreatyClaim(Boolean makingTreatyClaim) {
    this.makingTreatyClaim = makingTreatyClaim;
  }


  public W8BenEFormRequest fatcaStatus(String fatcaStatus) {
    this.fatcaStatus = fatcaStatus;
    return this;
  }

  /**
   * The FATCA status.
   * @return fatcaStatus
   */
  @javax.annotation.Nullable
  public String getFatcaStatus() {
    return fatcaStatus;
  }

  public void setFatcaStatus(String fatcaStatus) {
    this.fatcaStatus = fatcaStatus;
  }


  public W8BenEFormRequest residenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
    return this;
  }

  /**
   * The residential address of the individual or entity.
   * @return residenceAddress
   */
  @javax.annotation.Nullable
  public String getResidenceAddress() {
    return residenceAddress;
  }

  public void setResidenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
  }


  public W8BenEFormRequest residenceCity(String residenceCity) {
    this.residenceCity = residenceCity;
    return this;
  }

  /**
   * The city of residence.
   * @return residenceCity
   */
  @javax.annotation.Nullable
  public String getResidenceCity() {
    return residenceCity;
  }

  public void setResidenceCity(String residenceCity) {
    this.residenceCity = residenceCity;
  }


  public W8BenEFormRequest residenceState(String residenceState) {
    this.residenceState = residenceState;
    return this;
  }

  /**
   * The state of residence.
   * @return residenceState
   */
  @javax.annotation.Nullable
  public String getResidenceState() {
    return residenceState;
  }

  public void setResidenceState(String residenceState) {
    this.residenceState = residenceState;
  }


  public W8BenEFormRequest residenceZip(String residenceZip) {
    this.residenceZip = residenceZip;
    return this;
  }

  /**
   * The ZIP code of the residence.
   * @return residenceZip
   */
  @javax.annotation.Nullable
  public String getResidenceZip() {
    return residenceZip;
  }

  public void setResidenceZip(String residenceZip) {
    this.residenceZip = residenceZip;
  }


  public W8BenEFormRequest residenceCountry(String residenceCountry) {
    this.residenceCountry = residenceCountry;
    return this;
  }

  /**
   * The country of residence.
   * @return residenceCountry
   */
  @javax.annotation.Nullable
  public String getResidenceCountry() {
    return residenceCountry;
  }

  public void setResidenceCountry(String residenceCountry) {
    this.residenceCountry = residenceCountry;
  }


  public W8BenEFormRequest residenceIsMailing(Boolean residenceIsMailing) {
    this.residenceIsMailing = residenceIsMailing;
    return this;
  }

  /**
   * Indicates whether the residence address is also the mailing address.
   * @return residenceIsMailing
   */
  @javax.annotation.Nullable
  public Boolean getResidenceIsMailing() {
    return residenceIsMailing;
  }

  public void setResidenceIsMailing(Boolean residenceIsMailing) {
    this.residenceIsMailing = residenceIsMailing;
  }


  public W8BenEFormRequest mailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
    return this;
  }

  /**
   * The mailing address.
   * @return mailingAddress
   */
  @javax.annotation.Nullable
  public String getMailingAddress() {
    return mailingAddress;
  }

  public void setMailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
  }


  public W8BenEFormRequest mailingCity(String mailingCity) {
    this.mailingCity = mailingCity;
    return this;
  }

  /**
   * The city of the mailing address.
   * @return mailingCity
   */
  @javax.annotation.Nullable
  public String getMailingCity() {
    return mailingCity;
  }

  public void setMailingCity(String mailingCity) {
    this.mailingCity = mailingCity;
  }


  public W8BenEFormRequest mailingState(String mailingState) {
    this.mailingState = mailingState;
    return this;
  }

  /**
   * The state of the mailing address.
   * @return mailingState
   */
  @javax.annotation.Nullable
  public String getMailingState() {
    return mailingState;
  }

  public void setMailingState(String mailingState) {
    this.mailingState = mailingState;
  }


  public W8BenEFormRequest mailingZip(String mailingZip) {
    this.mailingZip = mailingZip;
    return this;
  }

  /**
   * The ZIP code of the mailing address.
   * @return mailingZip
   */
  @javax.annotation.Nullable
  public String getMailingZip() {
    return mailingZip;
  }

  public void setMailingZip(String mailingZip) {
    this.mailingZip = mailingZip;
  }


  public W8BenEFormRequest mailingCountry(String mailingCountry) {
    this.mailingCountry = mailingCountry;
    return this;
  }

  /**
   * The country of the mailing address.
   * @return mailingCountry
   */
  @javax.annotation.Nullable
  public String getMailingCountry() {
    return mailingCountry;
  }

  public void setMailingCountry(String mailingCountry) {
    this.mailingCountry = mailingCountry;
  }


  public W8BenEFormRequest tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * The taxpayer identification number (TIN).
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public W8BenEFormRequest giin(String giin) {
    this.giin = giin;
    return this;
  }

  /**
   * The global intermediary identification number (GIIN).
   * @return giin
   */
  @javax.annotation.Nullable
  public String getGiin() {
    return giin;
  }

  public void setGiin(String giin) {
    this.giin = giin;
  }


  public W8BenEFormRequest foreignTinNotRequired(Boolean foreignTinNotRequired) {
    this.foreignTinNotRequired = foreignTinNotRequired;
    return this;
  }

  /**
   * Indicates whether a foreign TIN is not required.
   * @return foreignTinNotRequired
   */
  @javax.annotation.Nullable
  public Boolean getForeignTinNotRequired() {
    return foreignTinNotRequired;
  }

  public void setForeignTinNotRequired(Boolean foreignTinNotRequired) {
    this.foreignTinNotRequired = foreignTinNotRequired;
  }


  public W8BenEFormRequest foreignTin(String foreignTin) {
    this.foreignTin = foreignTin;
    return this;
  }

  /**
   * The foreign taxpayer identification number (TIN).
   * @return foreignTin
   */
  @javax.annotation.Nullable
  public String getForeignTin() {
    return foreignTin;
  }

  public void setForeignTin(String foreignTin) {
    this.foreignTin = foreignTin;
  }


  public W8BenEFormRequest referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * A reference number for the form.
   * @return referenceNumber
   */
  @javax.annotation.Nullable
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public W8BenEFormRequest disregardedEntityFatcaStatus(String disregardedEntityFatcaStatus) {
    this.disregardedEntityFatcaStatus = disregardedEntityFatcaStatus;
    return this;
  }

  /**
   * The FATCA status of disregarded entity or branch receiving payment.
   * @return disregardedEntityFatcaStatus
   */
  @javax.annotation.Nullable
  public String getDisregardedEntityFatcaStatus() {
    return disregardedEntityFatcaStatus;
  }

  public void setDisregardedEntityFatcaStatus(String disregardedEntityFatcaStatus) {
    this.disregardedEntityFatcaStatus = disregardedEntityFatcaStatus;
  }


  public W8BenEFormRequest disregardedAddress(String disregardedAddress) {
    this.disregardedAddress = disregardedAddress;
    return this;
  }

  /**
   * The address for disregarded entities.
   * @return disregardedAddress
   */
  @javax.annotation.Nullable
  public String getDisregardedAddress() {
    return disregardedAddress;
  }

  public void setDisregardedAddress(String disregardedAddress) {
    this.disregardedAddress = disregardedAddress;
  }


  public W8BenEFormRequest disregardedCity(String disregardedCity) {
    this.disregardedCity = disregardedCity;
    return this;
  }

  /**
   * The city for disregarded entities.
   * @return disregardedCity
   */
  @javax.annotation.Nullable
  public String getDisregardedCity() {
    return disregardedCity;
  }

  public void setDisregardedCity(String disregardedCity) {
    this.disregardedCity = disregardedCity;
  }


  public W8BenEFormRequest disregardedState(String disregardedState) {
    this.disregardedState = disregardedState;
    return this;
  }

  /**
   * The state for disregarded entities.
   * @return disregardedState
   */
  @javax.annotation.Nullable
  public String getDisregardedState() {
    return disregardedState;
  }

  public void setDisregardedState(String disregardedState) {
    this.disregardedState = disregardedState;
  }


  public W8BenEFormRequest disregardedZip(String disregardedZip) {
    this.disregardedZip = disregardedZip;
    return this;
  }

  /**
   * The ZIP code for disregarded entities.
   * @return disregardedZip
   */
  @javax.annotation.Nullable
  public String getDisregardedZip() {
    return disregardedZip;
  }

  public void setDisregardedZip(String disregardedZip) {
    this.disregardedZip = disregardedZip;
  }


  public W8BenEFormRequest disregardedCountry(String disregardedCountry) {
    this.disregardedCountry = disregardedCountry;
    return this;
  }

  /**
   * The country for disregarded entities.
   * @return disregardedCountry
   */
  @javax.annotation.Nullable
  public String getDisregardedCountry() {
    return disregardedCountry;
  }

  public void setDisregardedCountry(String disregardedCountry) {
    this.disregardedCountry = disregardedCountry;
  }


  public W8BenEFormRequest disregardedEntityGiin(String disregardedEntityGiin) {
    this.disregardedEntityGiin = disregardedEntityGiin;
    return this;
  }

  /**
   * The GIIN for disregarded entities.
   * @return disregardedEntityGiin
   */
  @javax.annotation.Nullable
  public String getDisregardedEntityGiin() {
    return disregardedEntityGiin;
  }

  public void setDisregardedEntityGiin(String disregardedEntityGiin) {
    this.disregardedEntityGiin = disregardedEntityGiin;
  }


  public W8BenEFormRequest treatyCountryCertification(Boolean treatyCountryCertification) {
    this.treatyCountryCertification = treatyCountryCertification;
    return this;
  }

  /**
   * Certifies the beneficial owner&#39;s country under the U.S. tax treaty.
   * @return treatyCountryCertification
   */
  @javax.annotation.Nullable
  public Boolean getTreatyCountryCertification() {
    return treatyCountryCertification;
  }

  public void setTreatyCountryCertification(Boolean treatyCountryCertification) {
    this.treatyCountryCertification = treatyCountryCertification;
  }


  public W8BenEFormRequest treatyCountry(String treatyCountry) {
    this.treatyCountry = treatyCountry;
    return this;
  }

  /**
   * The treaty country of the beneficial owner.
   * @return treatyCountry
   */
  @javax.annotation.Nullable
  public String getTreatyCountry() {
    return treatyCountry;
  }

  public void setTreatyCountry(String treatyCountry) {
    this.treatyCountry = treatyCountry;
  }


  public W8BenEFormRequest benefitLimitationCertification(Boolean benefitLimitationCertification) {
    this.benefitLimitationCertification = benefitLimitationCertification;
    return this;
  }

  /**
   * Certifies that the beneficial owner is eligible for treaty benefits and meets any limitation on benefits requirements.
   * @return benefitLimitationCertification
   */
  @javax.annotation.Nullable
  public Boolean getBenefitLimitationCertification() {
    return benefitLimitationCertification;
  }

  public void setBenefitLimitationCertification(Boolean benefitLimitationCertification) {
    this.benefitLimitationCertification = benefitLimitationCertification;
  }


  public W8BenEFormRequest benefitLimitation(String benefitLimitation) {
    this.benefitLimitation = benefitLimitation;
    return this;
  }

  /**
   * The benefit limitation for tax treaty claims.
   * @return benefitLimitation
   */
  @javax.annotation.Nullable
  public String getBenefitLimitation() {
    return benefitLimitation;
  }

  public void setBenefitLimitation(String benefitLimitation) {
    this.benefitLimitation = benefitLimitation;
  }


  public W8BenEFormRequest qualifiedResidentStatusCertification(Boolean qualifiedResidentStatusCertification) {
    this.qualifiedResidentStatusCertification = qualifiedResidentStatusCertification;
    return this;
  }

  /**
   * Certifies that the beneficial owner claims treaty benefits and meets the qualified resident status for specific U.S. source income.
   * @return qualifiedResidentStatusCertification
   */
  @javax.annotation.Nullable
  public Boolean getQualifiedResidentStatusCertification() {
    return qualifiedResidentStatusCertification;
  }

  public void setQualifiedResidentStatusCertification(Boolean qualifiedResidentStatusCertification) {
    this.qualifiedResidentStatusCertification = qualifiedResidentStatusCertification;
  }


  public W8BenEFormRequest treatyArticle(String treatyArticle) {
    this.treatyArticle = treatyArticle;
    return this;
  }

  /**
   * Indicates the specific article and paragraph of the tax treaty under which the beneficial owner is claiming benefits.
   * @return treatyArticle
   */
  @javax.annotation.Nullable
  public String getTreatyArticle() {
    return treatyArticle;
  }

  public void setTreatyArticle(String treatyArticle) {
    this.treatyArticle = treatyArticle;
  }


  public W8BenEFormRequest withholdingRate(String withholdingRate) {
    this.withholdingRate = withholdingRate;
    return this;
  }

  /**
   * Specifies the reduced withholding rate claimed under the applicable tax treaty.
   * @return withholdingRate
   */
  @javax.annotation.Nullable
  public String getWithholdingRate() {
    return withholdingRate;
  }

  public void setWithholdingRate(String withholdingRate) {
    this.withholdingRate = withholdingRate;
  }


  public W8BenEFormRequest incomeType(String incomeType) {
    this.incomeType = incomeType;
    return this;
  }

  /**
   * Specifies the type of income for which the reduced treaty withholding rate is being claimed.
   * @return incomeType
   */
  @javax.annotation.Nullable
  public String getIncomeType() {
    return incomeType;
  }

  public void setIncomeType(String incomeType) {
    this.incomeType = incomeType;
  }


  public W8BenEFormRequest treatyReasons(String treatyReasons) {
    this.treatyReasons = treatyReasons;
    return this;
  }

  /**
   * The additional conditions in the article the beneficial owner meets to be eligible for the rate of withholding.
   * @return treatyReasons
   */
  @javax.annotation.Nullable
  public String getTreatyReasons() {
    return treatyReasons;
  }

  public void setTreatyReasons(String treatyReasons) {
    this.treatyReasons = treatyReasons;
  }


  public W8BenEFormRequest ffiSponsoringEntity(String ffiSponsoringEntity) {
    this.ffiSponsoringEntity = ffiSponsoringEntity;
    return this;
  }

  /**
   * The name of the entity that sponsors the foreign financial institution (FFI).
   * @return ffiSponsoringEntity
   */
  @javax.annotation.Nullable
  public String getFfiSponsoringEntity() {
    return ffiSponsoringEntity;
  }

  public void setFfiSponsoringEntity(String ffiSponsoringEntity) {
    this.ffiSponsoringEntity = ffiSponsoringEntity;
  }


  public W8BenEFormRequest investmentEntityCertification(Boolean investmentEntityCertification) {
    this.investmentEntityCertification = investmentEntityCertification;
    return this;
  }

  /**
   * Certifies that the entity is an investment entity, not a QI, WP, or WT, and has an agreement with a sponsoring entity.
   * @return investmentEntityCertification
   */
  @javax.annotation.Nullable
  public Boolean getInvestmentEntityCertification() {
    return investmentEntityCertification;
  }

  public void setInvestmentEntityCertification(Boolean investmentEntityCertification) {
    this.investmentEntityCertification = investmentEntityCertification;
  }


  public W8BenEFormRequest controlledForeignCorporationCertification(Boolean controlledForeignCorporationCertification) {
    this.controlledForeignCorporationCertification = controlledForeignCorporationCertification;
    return this;
  }

  /**
   * Certifies that the entity is a controlled foreign corporation sponsored by a U.S. financial institution, not a QI, WP, or WT,  and shares a common electronic account system for full transparency.
   * @return controlledForeignCorporationCertification
   */
  @javax.annotation.Nullable
  public Boolean getControlledForeignCorporationCertification() {
    return controlledForeignCorporationCertification;
  }

  public void setControlledForeignCorporationCertification(Boolean controlledForeignCorporationCertification) {
    this.controlledForeignCorporationCertification = controlledForeignCorporationCertification;
  }


  public W8BenEFormRequest compliantNonregisteringLocalBankCertification(Boolean compliantNonregisteringLocalBankCertification) {
    this.compliantNonregisteringLocalBankCertification = compliantNonregisteringLocalBankCertification;
    return this;
  }

  /**
   * Certifies that the FFI operates solely as a limited bank or credit union within its country, meets asset thresholds,  and has no foreign operations or affiliations outside its country of organization.
   * @return compliantNonregisteringLocalBankCertification
   */
  @javax.annotation.Nullable
  public Boolean getCompliantNonregisteringLocalBankCertification() {
    return compliantNonregisteringLocalBankCertification;
  }

  public void setCompliantNonregisteringLocalBankCertification(Boolean compliantNonregisteringLocalBankCertification) {
    this.compliantNonregisteringLocalBankCertification = compliantNonregisteringLocalBankCertification;
  }


  public W8BenEFormRequest compliantFfiLowValueAccountsCertification(Boolean compliantFfiLowValueAccountsCertification) {
    this.compliantFfiLowValueAccountsCertification = compliantFfiLowValueAccountsCertification;
    return this;
  }

  /**
   * Certifies that the FFI is not primarily engaged in investment activities, maintains only low-value accounts,  and has limited total assets within its group.
   * @return compliantFfiLowValueAccountsCertification
   */
  @javax.annotation.Nullable
  public Boolean getCompliantFfiLowValueAccountsCertification() {
    return compliantFfiLowValueAccountsCertification;
  }

  public void setCompliantFfiLowValueAccountsCertification(Boolean compliantFfiLowValueAccountsCertification) {
    this.compliantFfiLowValueAccountsCertification = compliantFfiLowValueAccountsCertification;
  }


  public W8BenEFormRequest sponsoredCloselyHeldEntitySponsoringEntity(String sponsoredCloselyHeldEntitySponsoringEntity) {
    this.sponsoredCloselyHeldEntitySponsoringEntity = sponsoredCloselyHeldEntitySponsoringEntity;
    return this;
  }

  /**
   * The name of sponsoring entity for a certified deemed-compliant, closely held investment vehicle.
   * @return sponsoredCloselyHeldEntitySponsoringEntity
   */
  @javax.annotation.Nullable
  public String getSponsoredCloselyHeldEntitySponsoringEntity() {
    return sponsoredCloselyHeldEntitySponsoringEntity;
  }

  public void setSponsoredCloselyHeldEntitySponsoringEntity(String sponsoredCloselyHeldEntitySponsoringEntity) {
    this.sponsoredCloselyHeldEntitySponsoringEntity = sponsoredCloselyHeldEntitySponsoringEntity;
  }


  public W8BenEFormRequest sponsoredCloselyHeldInvestmentVehicleCertification(Boolean sponsoredCloselyHeldInvestmentVehicleCertification) {
    this.sponsoredCloselyHeldInvestmentVehicleCertification = sponsoredCloselyHeldInvestmentVehicleCertification;
    return this;
  }

  /**
   * Certifies that the entity is a sponsored investment entity with 20 or fewer individual owners,  and that all compliance obligations are fulfilled by the sponsoring entity.
   * @return sponsoredCloselyHeldInvestmentVehicleCertification
   */
  @javax.annotation.Nullable
  public Boolean getSponsoredCloselyHeldInvestmentVehicleCertification() {
    return sponsoredCloselyHeldInvestmentVehicleCertification;
  }

  public void setSponsoredCloselyHeldInvestmentVehicleCertification(Boolean sponsoredCloselyHeldInvestmentVehicleCertification) {
    this.sponsoredCloselyHeldInvestmentVehicleCertification = sponsoredCloselyHeldInvestmentVehicleCertification;
  }


  public W8BenEFormRequest compliantLimitedLifeDebtEntityCertification(Boolean compliantLimitedLifeDebtEntityCertification) {
    this.compliantLimitedLifeDebtEntityCertification = compliantLimitedLifeDebtEntityCertification;
    return this;
  }

  /**
   * Certifies that the entity qualifies as a limited life debt investment entity based on its formation date, issuance terms,  and compliance with regulatory requirements.
   * @return compliantLimitedLifeDebtEntityCertification
   */
  @javax.annotation.Nullable
  public Boolean getCompliantLimitedLifeDebtEntityCertification() {
    return compliantLimitedLifeDebtEntityCertification;
  }

  public void setCompliantLimitedLifeDebtEntityCertification(Boolean compliantLimitedLifeDebtEntityCertification) {
    this.compliantLimitedLifeDebtEntityCertification = compliantLimitedLifeDebtEntityCertification;
  }


  public W8BenEFormRequest investmentEntityNoFinancialAccountsCertification(Boolean investmentEntityNoFinancialAccountsCertification) {
    this.investmentEntityNoFinancialAccountsCertification = investmentEntityNoFinancialAccountsCertification;
    return this;
  }

  /**
   * Certifies that the entity is a financial institution solely because it is an investment entity under regulations  and the entity does not maintain financial accounts.
   * @return investmentEntityNoFinancialAccountsCertification
   */
  @javax.annotation.Nullable
  public Boolean getInvestmentEntityNoFinancialAccountsCertification() {
    return investmentEntityNoFinancialAccountsCertification;
  }

  public void setInvestmentEntityNoFinancialAccountsCertification(Boolean investmentEntityNoFinancialAccountsCertification) {
    this.investmentEntityNoFinancialAccountsCertification = investmentEntityNoFinancialAccountsCertification;
  }


  public W8BenEFormRequest ownerDocumentedFfiCertification(Boolean ownerDocumentedFfiCertification) {
    this.ownerDocumentedFfiCertification = ownerDocumentedFfiCertification;
    return this;
  }

  /**
   * Certifies that the FFI meets all requirements to qualify as an owner-documented FFI, including restrictions on activities,  ownership, and account relationships.
   * @return ownerDocumentedFfiCertification
   */
  @javax.annotation.Nullable
  public Boolean getOwnerDocumentedFfiCertification() {
    return ownerDocumentedFfiCertification;
  }

  public void setOwnerDocumentedFfiCertification(Boolean ownerDocumentedFfiCertification) {
    this.ownerDocumentedFfiCertification = ownerDocumentedFfiCertification;
  }


  public W8BenEFormRequest ownerDocumentedFfiReportingStatementCertification(Boolean ownerDocumentedFfiReportingStatementCertification) {
    this.ownerDocumentedFfiReportingStatementCertification = ownerDocumentedFfiReportingStatementCertification;
    return this;
  }

  /**
   * Certifies that the FFI will provide a complete owner reporting statement  and required documentation for each relevant owner or debt holder.
   * @return ownerDocumentedFfiReportingStatementCertification
   */
  @javax.annotation.Nullable
  public Boolean getOwnerDocumentedFfiReportingStatementCertification() {
    return ownerDocumentedFfiReportingStatementCertification;
  }

  public void setOwnerDocumentedFfiReportingStatementCertification(Boolean ownerDocumentedFfiReportingStatementCertification) {
    this.ownerDocumentedFfiReportingStatementCertification = ownerDocumentedFfiReportingStatementCertification;
  }


  public W8BenEFormRequest ownerDocumentedFfiAuditorLetterCertification(Boolean ownerDocumentedFfiAuditorLetterCertification) {
    this.ownerDocumentedFfiAuditorLetterCertification = ownerDocumentedFfiAuditorLetterCertification;
    return this;
  }

  /**
   * Certifies that the FFI will provide an auditor’s letter and required owner reporting documentation  to confirm its status as an owner-documented FFI.
   * @return ownerDocumentedFfiAuditorLetterCertification
   */
  @javax.annotation.Nullable
  public Boolean getOwnerDocumentedFfiAuditorLetterCertification() {
    return ownerDocumentedFfiAuditorLetterCertification;
  }

  public void setOwnerDocumentedFfiAuditorLetterCertification(Boolean ownerDocumentedFfiAuditorLetterCertification) {
    this.ownerDocumentedFfiAuditorLetterCertification = ownerDocumentedFfiAuditorLetterCertification;
  }


  public W8BenEFormRequest ownerDocumentedFfiTrustBeneficiariesCertification(Boolean ownerDocumentedFfiTrustBeneficiariesCertification) {
    this.ownerDocumentedFfiTrustBeneficiariesCertification = ownerDocumentedFfiTrustBeneficiariesCertification;
    return this;
  }

  /**
   * Certifies that the trust has no contingent or unidentified beneficiaries or designated classes of beneficiaries.
   * @return ownerDocumentedFfiTrustBeneficiariesCertification
   */
  @javax.annotation.Nullable
  public Boolean getOwnerDocumentedFfiTrustBeneficiariesCertification() {
    return ownerDocumentedFfiTrustBeneficiariesCertification;
  }

  public void setOwnerDocumentedFfiTrustBeneficiariesCertification(Boolean ownerDocumentedFfiTrustBeneficiariesCertification) {
    this.ownerDocumentedFfiTrustBeneficiariesCertification = ownerDocumentedFfiTrustBeneficiariesCertification;
  }


  public W8BenEFormRequest restrictedDistributorCertification(Boolean restrictedDistributorCertification) {
    this.restrictedDistributorCertification = restrictedDistributorCertification;
    return this;
  }

  /**
   * Certifies that the entity qualifies as a restricted distributor based on its operations, customer base, regulatory compliance,  and financial and geographic limitations.
   * @return restrictedDistributorCertification
   */
  @javax.annotation.Nullable
  public Boolean getRestrictedDistributorCertification() {
    return restrictedDistributorCertification;
  }

  public void setRestrictedDistributorCertification(Boolean restrictedDistributorCertification) {
    this.restrictedDistributorCertification = restrictedDistributorCertification;
  }


  public W8BenEFormRequest restrictedDistributorAgreementCertification(Boolean restrictedDistributorAgreementCertification) {
    this.restrictedDistributorAgreementCertification = restrictedDistributorAgreementCertification;
    return this;
  }

  /**
   * Certifies that the entity is, and has been, bound by distribution agreements prohibiting sales of fund interests to  specified U.S. persons and certain non-U.S. entities.
   * @return restrictedDistributorAgreementCertification
   */
  @javax.annotation.Nullable
  public Boolean getRestrictedDistributorAgreementCertification() {
    return restrictedDistributorAgreementCertification;
  }

  public void setRestrictedDistributorAgreementCertification(Boolean restrictedDistributorAgreementCertification) {
    this.restrictedDistributorAgreementCertification = restrictedDistributorAgreementCertification;
  }


  public W8BenEFormRequest restrictedDistributorPreexistingSalesComplianceCertification(Boolean restrictedDistributorPreexistingSalesComplianceCertification) {
    this.restrictedDistributorPreexistingSalesComplianceCertification = restrictedDistributorPreexistingSalesComplianceCertification;
    return this;
  }

  /**
   * Certifies that the entity complies with distribution restrictions for U.S.-linked investors  and has addressed any preexisting sales in accordance with FATCA regulations.
   * @return restrictedDistributorPreexistingSalesComplianceCertification
   */
  @javax.annotation.Nullable
  public Boolean getRestrictedDistributorPreexistingSalesComplianceCertification() {
    return restrictedDistributorPreexistingSalesComplianceCertification;
  }

  public void setRestrictedDistributorPreexistingSalesComplianceCertification(Boolean restrictedDistributorPreexistingSalesComplianceCertification) {
    this.restrictedDistributorPreexistingSalesComplianceCertification = restrictedDistributorPreexistingSalesComplianceCertification;
  }


  public W8BenEFormRequest nonreportingIgaFfiCertification(Boolean nonreportingIgaFfiCertification) {
    this.nonreportingIgaFfiCertification = nonreportingIgaFfiCertification;
    return this;
  }

  /**
   * Certifies that the entity meets the requirements to be considered a nonreporting financial institution to an applicable IGA.
   * @return nonreportingIgaFfiCertification
   */
  @javax.annotation.Nullable
  public Boolean getNonreportingIgaFfiCertification() {
    return nonreportingIgaFfiCertification;
  }

  public void setNonreportingIgaFfiCertification(Boolean nonreportingIgaFfiCertification) {
    this.nonreportingIgaFfiCertification = nonreportingIgaFfiCertification;
  }


  public W8BenEFormRequest igaCountry(String igaCountry) {
    this.igaCountry = igaCountry;
    return this;
  }

  /**
   * The country for the applicable IGA with the United States.
   * @return igaCountry
   */
  @javax.annotation.Nullable
  public String getIgaCountry() {
    return igaCountry;
  }

  public void setIgaCountry(String igaCountry) {
    this.igaCountry = igaCountry;
  }


  public W8BenEFormRequest igaModel(String igaModel) {
    this.igaModel = igaModel;
    return this;
  }

  /**
   * The applicable IGA model.
   * @return igaModel
   */
  @javax.annotation.Nullable
  public String getIgaModel() {
    return igaModel;
  }

  public void setIgaModel(String igaModel) {
    this.igaModel = igaModel;
  }


  public W8BenEFormRequest igaLegalStatusTreatment(String igaLegalStatusTreatment) {
    this.igaLegalStatusTreatment = igaLegalStatusTreatment;
    return this;
  }

  /**
   * Specifies how the applicable IGA is treated under the IGA provisions or Treasury regulations.
   * @return igaLegalStatusTreatment
   */
  @javax.annotation.Nullable
  public String getIgaLegalStatusTreatment() {
    return igaLegalStatusTreatment;
  }

  public void setIgaLegalStatusTreatment(String igaLegalStatusTreatment) {
    this.igaLegalStatusTreatment = igaLegalStatusTreatment;
  }


  public W8BenEFormRequest igaFfiTrusteeOrSponsor(String igaFfiTrusteeOrSponsor) {
    this.igaFfiTrusteeOrSponsor = igaFfiTrusteeOrSponsor;
    return this;
  }

  /**
   * The trustee or sponsor name for the nonreporting IGA FFI.
   * @return igaFfiTrusteeOrSponsor
   */
  @javax.annotation.Nullable
  public String getIgaFfiTrusteeOrSponsor() {
    return igaFfiTrusteeOrSponsor;
  }

  public void setIgaFfiTrusteeOrSponsor(String igaFfiTrusteeOrSponsor) {
    this.igaFfiTrusteeOrSponsor = igaFfiTrusteeOrSponsor;
  }


  public W8BenEFormRequest igaFfiTrusteeIsForeign(Boolean igaFfiTrusteeIsForeign) {
    this.igaFfiTrusteeIsForeign = igaFfiTrusteeIsForeign;
    return this;
  }

  /**
   * Indicates whether the trustee for the nonreporting IGA FFI is foreign.
   * @return igaFfiTrusteeIsForeign
   */
  @javax.annotation.Nullable
  public Boolean getIgaFfiTrusteeIsForeign() {
    return igaFfiTrusteeIsForeign;
  }

  public void setIgaFfiTrusteeIsForeign(Boolean igaFfiTrusteeIsForeign) {
    this.igaFfiTrusteeIsForeign = igaFfiTrusteeIsForeign;
  }


  public W8BenEFormRequest nonCommercialFinancialActivityCertification(Boolean nonCommercialFinancialActivityCertification) {
    this.nonCommercialFinancialActivityCertification = nonCommercialFinancialActivityCertification;
    return this;
  }

  /**
   * Certifies that the entity is the beneficial owner and is not engaged in commercial financial activities related  to the specified payments, accounts or obligations for which this form is submitted.
   * @return nonCommercialFinancialActivityCertification
   */
  @javax.annotation.Nullable
  public Boolean getNonCommercialFinancialActivityCertification() {
    return nonCommercialFinancialActivityCertification;
  }

  public void setNonCommercialFinancialActivityCertification(Boolean nonCommercialFinancialActivityCertification) {
    this.nonCommercialFinancialActivityCertification = nonCommercialFinancialActivityCertification;
  }


  public W8BenEFormRequest internationOrganizationCertification(Boolean internationOrganizationCertification) {
    this.internationOrganizationCertification = internationOrganizationCertification;
    return this;
  }

  /**
   * Certifies that the entity is an international organization described in section 7701(a)(18).
   * @return internationOrganizationCertification
   */
  @javax.annotation.Nullable
  public Boolean getInternationOrganizationCertification() {
    return internationOrganizationCertification;
  }

  public void setInternationOrganizationCertification(Boolean internationOrganizationCertification) {
    this.internationOrganizationCertification = internationOrganizationCertification;
  }


  public W8BenEFormRequest intergovernmentalOrganizationCertification(Boolean intergovernmentalOrganizationCertification) {
    this.intergovernmentalOrganizationCertification = intergovernmentalOrganizationCertification;
    return this;
  }

  /**
   * Certifies that the entity is an intergovernmental or supranational organization primarily comprised of foreign governments,  is the beneficial owner, and is not engaged in commercial financial activities.
   * @return intergovernmentalOrganizationCertification
   */
  @javax.annotation.Nullable
  public Boolean getIntergovernmentalOrganizationCertification() {
    return intergovernmentalOrganizationCertification;
  }

  public void setIntergovernmentalOrganizationCertification(Boolean intergovernmentalOrganizationCertification) {
    this.intergovernmentalOrganizationCertification = intergovernmentalOrganizationCertification;
  }


  public W8BenEFormRequest treatyQualifiedPensionFundCertification(Boolean treatyQualifiedPensionFundCertification) {
    this.treatyQualifiedPensionFundCertification = treatyQualifiedPensionFundCertification;
    return this;
  }

  /**
   * Certifies that the entity is a pension or retirement fund established in a treaty country  and is entitled to treaty benefits on U.S. source income.
   * @return treatyQualifiedPensionFundCertification
   */
  @javax.annotation.Nullable
  public Boolean getTreatyQualifiedPensionFundCertification() {
    return treatyQualifiedPensionFundCertification;
  }

  public void setTreatyQualifiedPensionFundCertification(Boolean treatyQualifiedPensionFundCertification) {
    this.treatyQualifiedPensionFundCertification = treatyQualifiedPensionFundCertification;
  }


  public W8BenEFormRequest qualifiedRetirementFundCertification(Boolean qualifiedRetirementFundCertification) {
    this.qualifiedRetirementFundCertification = qualifiedRetirementFundCertification;
    return this;
  }

  /**
   * Certifies that the entity is a government-regulated retirement fund meeting specific requirements for contributions, tax exemption,  beneficiary limits, and distribution restrictions.
   * @return qualifiedRetirementFundCertification
   */
  @javax.annotation.Nullable
  public Boolean getQualifiedRetirementFundCertification() {
    return qualifiedRetirementFundCertification;
  }

  public void setQualifiedRetirementFundCertification(Boolean qualifiedRetirementFundCertification) {
    this.qualifiedRetirementFundCertification = qualifiedRetirementFundCertification;
  }


  public W8BenEFormRequest narrowParticipationRetirementFundCertification(Boolean narrowParticipationRetirementFundCertification) {
    this.narrowParticipationRetirementFundCertification = narrowParticipationRetirementFundCertification;
    return this;
  }

  /**
   * Certifies that the entity is a government-regulated retirement fund with fewer than 50 participants, limited foreign ownership,  and employer sponsorship that is not from investment entities or passive NFFEs.
   * @return narrowParticipationRetirementFundCertification
   */
  @javax.annotation.Nullable
  public Boolean getNarrowParticipationRetirementFundCertification() {
    return narrowParticipationRetirementFundCertification;
  }

  public void setNarrowParticipationRetirementFundCertification(Boolean narrowParticipationRetirementFundCertification) {
    this.narrowParticipationRetirementFundCertification = narrowParticipationRetirementFundCertification;
  }


  public W8BenEFormRequest section401AEquivalentPensionPlanCertification(Boolean section401AEquivalentPensionPlanCertification) {
    this.section401AEquivalentPensionPlanCertification = section401AEquivalentPensionPlanCertification;
    return this;
  }

  /**
   * Certifies that the entity is formed under a pension plan meeting section 401(a) requirements, except for being U.S.-trust funded.
   * @return section401AEquivalentPensionPlanCertification
   */
  @javax.annotation.Nullable
  public Boolean getSection401AEquivalentPensionPlanCertification() {
    return section401AEquivalentPensionPlanCertification;
  }

  public void setSection401AEquivalentPensionPlanCertification(Boolean section401AEquivalentPensionPlanCertification) {
    this.section401AEquivalentPensionPlanCertification = section401AEquivalentPensionPlanCertification;
  }


  public W8BenEFormRequest investmentEntityForRetirementFundsCertification(Boolean investmentEntityForRetirementFundsCertification) {
    this.investmentEntityForRetirementFundsCertification = investmentEntityForRetirementFundsCertification;
    return this;
  }

  /**
   * Certifies that the entity is established solely to earn income for the benefit of qualifying retirement funds  or accounts under applicable FATCA regulations or IGAs.
   * @return investmentEntityForRetirementFundsCertification
   */
  @javax.annotation.Nullable
  public Boolean getInvestmentEntityForRetirementFundsCertification() {
    return investmentEntityForRetirementFundsCertification;
  }

  public void setInvestmentEntityForRetirementFundsCertification(Boolean investmentEntityForRetirementFundsCertification) {
    this.investmentEntityForRetirementFundsCertification = investmentEntityForRetirementFundsCertification;
  }


  public W8BenEFormRequest exemptBeneficialOwnerSponsoredRetirementFundCertification(Boolean exemptBeneficialOwnerSponsoredRetirementFundCertification) {
    this.exemptBeneficialOwnerSponsoredRetirementFundCertification = exemptBeneficialOwnerSponsoredRetirementFundCertification;
    return this;
  }

  /**
   * Certifies that the entity is established and sponsored by a qualifying exempt beneficial owner to provide retirement, disability,  or death benefits to individuals based on services performed for the sponsor.
   * @return exemptBeneficialOwnerSponsoredRetirementFundCertification
   */
  @javax.annotation.Nullable
  public Boolean getExemptBeneficialOwnerSponsoredRetirementFundCertification() {
    return exemptBeneficialOwnerSponsoredRetirementFundCertification;
  }

  public void setExemptBeneficialOwnerSponsoredRetirementFundCertification(Boolean exemptBeneficialOwnerSponsoredRetirementFundCertification) {
    this.exemptBeneficialOwnerSponsoredRetirementFundCertification = exemptBeneficialOwnerSponsoredRetirementFundCertification;
  }


  public W8BenEFormRequest exemptBeneficialOwnerOwnedInvestmentEntityCertification(Boolean exemptBeneficialOwnerOwnedInvestmentEntityCertification) {
    this.exemptBeneficialOwnerOwnedInvestmentEntityCertification = exemptBeneficialOwnerOwnedInvestmentEntityCertification;
    return this;
  }

  /**
   * Certifies that the entity is an investment entity wholly owned by exempt beneficial owners and has provided complete ownership  and documentation details as required under FATCA regulations.
   * @return exemptBeneficialOwnerOwnedInvestmentEntityCertification
   */
  @javax.annotation.Nullable
  public Boolean getExemptBeneficialOwnerOwnedInvestmentEntityCertification() {
    return exemptBeneficialOwnerOwnedInvestmentEntityCertification;
  }

  public void setExemptBeneficialOwnerOwnedInvestmentEntityCertification(Boolean exemptBeneficialOwnerOwnedInvestmentEntityCertification) {
    this.exemptBeneficialOwnerOwnedInvestmentEntityCertification = exemptBeneficialOwnerOwnedInvestmentEntityCertification;
  }


  public W8BenEFormRequest territoryFinancialInstitutionCertification(Boolean territoryFinancialInstitutionCertification) {
    this.territoryFinancialInstitutionCertification = territoryFinancialInstitutionCertification;
    return this;
  }

  /**
   * Certifies that the entity is a financial institution (other than an investment entity) that is incorporated  or organized under the laws of a possession of the United States.
   * @return territoryFinancialInstitutionCertification
   */
  @javax.annotation.Nullable
  public Boolean getTerritoryFinancialInstitutionCertification() {
    return territoryFinancialInstitutionCertification;
  }

  public void setTerritoryFinancialInstitutionCertification(Boolean territoryFinancialInstitutionCertification) {
    this.territoryFinancialInstitutionCertification = territoryFinancialInstitutionCertification;
  }


  public W8BenEFormRequest exceptedNonfinancialGroupEntityCertification(Boolean exceptedNonfinancialGroupEntityCertification) {
    this.exceptedNonfinancialGroupEntityCertification = exceptedNonfinancialGroupEntityCertification;
    return this;
  }

  /**
   * Certifies that the entity is a holding company, treasury center, or captive finance company operating within a nonfinancial group  and not functioning as an investment or financial institution.
   * @return exceptedNonfinancialGroupEntityCertification
   */
  @javax.annotation.Nullable
  public Boolean getExceptedNonfinancialGroupEntityCertification() {
    return exceptedNonfinancialGroupEntityCertification;
  }

  public void setExceptedNonfinancialGroupEntityCertification(Boolean exceptedNonfinancialGroupEntityCertification) {
    this.exceptedNonfinancialGroupEntityCertification = exceptedNonfinancialGroupEntityCertification;
  }


  public W8BenEFormRequest exceptedNonfinancialStartUpCertification(Boolean exceptedNonfinancialStartUpCertification) {
    this.exceptedNonfinancialStartUpCertification = exceptedNonfinancialStartUpCertification;
    return this;
  }

  /**
   * Certifies that the entity is a recently formed startup NFFE investing in a non-financial business  and is not operating as or presenting itself as an investment fund.
   * @return exceptedNonfinancialStartUpCertification
   */
  @javax.annotation.Nullable
  public Boolean getExceptedNonfinancialStartUpCertification() {
    return exceptedNonfinancialStartUpCertification;
  }

  public void setExceptedNonfinancialStartUpCertification(Boolean exceptedNonfinancialStartUpCertification) {
    this.exceptedNonfinancialStartUpCertification = exceptedNonfinancialStartUpCertification;
  }


  public W8BenEFormRequest startupFormationOrResolutionDate(LocalDate startupFormationOrResolutionDate) {
    this.startupFormationOrResolutionDate = startupFormationOrResolutionDate;
    return this;
  }

  /**
   * The date the start-up company was formed on (or, in case of new line of business, the date of board resolution approving the  new line of business).
   * @return startupFormationOrResolutionDate
   */
  @javax.annotation.Nullable
  public LocalDate getStartupFormationOrResolutionDate() {
    return startupFormationOrResolutionDate;
  }

  public void setStartupFormationOrResolutionDate(LocalDate startupFormationOrResolutionDate) {
    this.startupFormationOrResolutionDate = startupFormationOrResolutionDate;
  }


  public W8BenEFormRequest exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification(Boolean exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification) {
    this.exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification = exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification;
    return this;
  }

  /**
   * Certifies that the entity is in liquidation, reorganization, or bankruptcy and intends to operate as a nonfinancial entity,  with supporting documentation available if the process exceeds three years.
   * @return exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification
   */
  @javax.annotation.Nullable
  public Boolean getExceptedNonfinancialEntityInLiquidationOrBankruptcyCertification() {
    return exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification;
  }

  public void setExceptedNonfinancialEntityInLiquidationOrBankruptcyCertification(Boolean exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification) {
    this.exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification = exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification;
  }


  public W8BenEFormRequest nonfinancialEntityFilingDate(LocalDate nonfinancialEntityFilingDate) {
    this.nonfinancialEntityFilingDate = nonfinancialEntityFilingDate;
    return this;
  }

  /**
   * The filed date for a plan of reorganization, liquidation or bankruptcy.
   * @return nonfinancialEntityFilingDate
   */
  @javax.annotation.Nullable
  public LocalDate getNonfinancialEntityFilingDate() {
    return nonfinancialEntityFilingDate;
  }

  public void setNonfinancialEntityFilingDate(LocalDate nonfinancialEntityFilingDate) {
    this.nonfinancialEntityFilingDate = nonfinancialEntityFilingDate;
  }


  public W8BenEFormRequest section501COrganizationCertification(Boolean section501COrganizationCertification) {
    this.section501COrganizationCertification = section501COrganizationCertification;
    return this;
  }

  /**
   * Certifies that the entity is a section 501(c) organization based on a valid IRS determination letter  or a legal opinion from U.S. counsel.
   * @return section501COrganizationCertification
   */
  @javax.annotation.Nullable
  public Boolean getSection501COrganizationCertification() {
    return section501COrganizationCertification;
  }

  public void setSection501COrganizationCertification(Boolean section501COrganizationCertification) {
    this.section501COrganizationCertification = section501COrganizationCertification;
  }


  public W8BenEFormRequest determinationLetterDate(LocalDate determinationLetterDate) {
    this.determinationLetterDate = determinationLetterDate;
    return this;
  }

  /**
   * The date of the IRS determination letter confirming the entity’s section 501(c) status.
   * @return determinationLetterDate
   */
  @javax.annotation.Nullable
  public LocalDate getDeterminationLetterDate() {
    return determinationLetterDate;
  }

  public void setDeterminationLetterDate(LocalDate determinationLetterDate) {
    this.determinationLetterDate = determinationLetterDate;
  }


  public W8BenEFormRequest nonprofitOrganizationCertification(Boolean nonprofitOrganizationCertification) {
    this.nonprofitOrganizationCertification = nonprofitOrganizationCertification;
    return this;
  }

  /**
   * Certifies that the entity is a nonprofit organization established for charitable or similar purposes, exempt from income tax,  and restricted in the use and distribution of its assets under applicable law.
   * @return nonprofitOrganizationCertification
   */
  @javax.annotation.Nullable
  public Boolean getNonprofitOrganizationCertification() {
    return nonprofitOrganizationCertification;
  }

  public void setNonprofitOrganizationCertification(Boolean nonprofitOrganizationCertification) {
    this.nonprofitOrganizationCertification = nonprofitOrganizationCertification;
  }


  public W8BenEFormRequest publiclyTradedNffeCertification(Boolean publiclyTradedNffeCertification) {
    this.publiclyTradedNffeCertification = publiclyTradedNffeCertification;
    return this;
  }

  /**
   * Certifies that the entity is a foreign corporation that is not a financial institution  and whose stock is regularly traded on an established securities market.
   * @return publiclyTradedNffeCertification
   */
  @javax.annotation.Nullable
  public Boolean getPubliclyTradedNffeCertification() {
    return publiclyTradedNffeCertification;
  }

  public void setPubliclyTradedNffeCertification(Boolean publiclyTradedNffeCertification) {
    this.publiclyTradedNffeCertification = publiclyTradedNffeCertification;
  }


  public W8BenEFormRequest publiclyTradedNffeSecuritiesMarket(String publiclyTradedNffeSecuritiesMarket) {
    this.publiclyTradedNffeSecuritiesMarket = publiclyTradedNffeSecuritiesMarket;
    return this;
  }

  /**
   * The name of the securities market where the corporation&#39;s stock is regularly traded.
   * @return publiclyTradedNffeSecuritiesMarket
   */
  @javax.annotation.Nullable
  public String getPubliclyTradedNffeSecuritiesMarket() {
    return publiclyTradedNffeSecuritiesMarket;
  }

  public void setPubliclyTradedNffeSecuritiesMarket(String publiclyTradedNffeSecuritiesMarket) {
    this.publiclyTradedNffeSecuritiesMarket = publiclyTradedNffeSecuritiesMarket;
  }


  public W8BenEFormRequest nffeAffiliateOfPubliclyTradedEntityCertification(Boolean nffeAffiliateOfPubliclyTradedEntityCertification) {
    this.nffeAffiliateOfPubliclyTradedEntityCertification = nffeAffiliateOfPubliclyTradedEntityCertification;
    return this;
  }

  /**
   * Certifies that the entity is a foreign corporation that is not a financial institution  and is affiliated with a publicly traded entity within the same expanded affiliated group.
   * @return nffeAffiliateOfPubliclyTradedEntityCertification
   */
  @javax.annotation.Nullable
  public Boolean getNffeAffiliateOfPubliclyTradedEntityCertification() {
    return nffeAffiliateOfPubliclyTradedEntityCertification;
  }

  public void setNffeAffiliateOfPubliclyTradedEntityCertification(Boolean nffeAffiliateOfPubliclyTradedEntityCertification) {
    this.nffeAffiliateOfPubliclyTradedEntityCertification = nffeAffiliateOfPubliclyTradedEntityCertification;
  }


  public W8BenEFormRequest publiclyTradedEntity(String publiclyTradedEntity) {
    this.publiclyTradedEntity = publiclyTradedEntity;
    return this;
  }

  /**
   * The name of the affiliated entity whose stock is regularly traded on an established securities market.
   * @return publiclyTradedEntity
   */
  @javax.annotation.Nullable
  public String getPubliclyTradedEntity() {
    return publiclyTradedEntity;
  }

  public void setPubliclyTradedEntity(String publiclyTradedEntity) {
    this.publiclyTradedEntity = publiclyTradedEntity;
  }


  public W8BenEFormRequest nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket(String nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket) {
    this.nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket = nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket;
    return this;
  }

  /**
   * The name of the established securities market where the affiliated entity&#39;s stock is traded.
   * @return nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket
   */
  @javax.annotation.Nullable
  public String getNffeAffiliateOfPubliclyTradedEntitySecuritiesMarket() {
    return nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket;
  }

  public void setNffeAffiliateOfPubliclyTradedEntitySecuritiesMarket(String nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket) {
    this.nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket = nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket;
  }


  public W8BenEFormRequest exceptedTerritoryNffeCertification(Boolean exceptedTerritoryNffeCertification) {
    this.exceptedTerritoryNffeCertification = exceptedTerritoryNffeCertification;
    return this;
  }

  /**
   * Certifies that the entity is organized in a U.S. possession, is not engaged in financial activities,  and is entirely owned by bona fide residents of that possession.
   * @return exceptedTerritoryNffeCertification
   */
  @javax.annotation.Nullable
  public Boolean getExceptedTerritoryNffeCertification() {
    return exceptedTerritoryNffeCertification;
  }

  public void setExceptedTerritoryNffeCertification(Boolean exceptedTerritoryNffeCertification) {
    this.exceptedTerritoryNffeCertification = exceptedTerritoryNffeCertification;
  }


  public W8BenEFormRequest activeNffeCertification(Boolean activeNffeCertification) {
    this.activeNffeCertification = activeNffeCertification;
    return this;
  }

  /**
   * Certifies that the entity is a foreign non-financial institution with less than 50% passive income  and less than 50% of its assets producing or held to produce passive income.
   * @return activeNffeCertification
   */
  @javax.annotation.Nullable
  public Boolean getActiveNffeCertification() {
    return activeNffeCertification;
  }

  public void setActiveNffeCertification(Boolean activeNffeCertification) {
    this.activeNffeCertification = activeNffeCertification;
  }


  public W8BenEFormRequest passiveNffeCertification(Boolean passiveNffeCertification) {
    this.passiveNffeCertification = passiveNffeCertification;
    return this;
  }

  /**
   * Certifies that the entity is a foreign non-financial entity that does not qualify for any other NFFE category  and is not a financial institution.
   * @return passiveNffeCertification
   */
  @javax.annotation.Nullable
  public Boolean getPassiveNffeCertification() {
    return passiveNffeCertification;
  }

  public void setPassiveNffeCertification(Boolean passiveNffeCertification) {
    this.passiveNffeCertification = passiveNffeCertification;
  }


  public W8BenEFormRequest passiveNffeNoSubstantialUsOwnersCertification(Boolean passiveNffeNoSubstantialUsOwnersCertification) {
    this.passiveNffeNoSubstantialUsOwnersCertification = passiveNffeNoSubstantialUsOwnersCertification;
    return this;
  }

  /**
   * Certifies that the passive NFFE has no substantial U.S. owners or controlling U.S. persons.
   * @return passiveNffeNoSubstantialUsOwnersCertification
   */
  @javax.annotation.Nullable
  public Boolean getPassiveNffeNoSubstantialUsOwnersCertification() {
    return passiveNffeNoSubstantialUsOwnersCertification;
  }

  public void setPassiveNffeNoSubstantialUsOwnersCertification(Boolean passiveNffeNoSubstantialUsOwnersCertification) {
    this.passiveNffeNoSubstantialUsOwnersCertification = passiveNffeNoSubstantialUsOwnersCertification;
  }


  public W8BenEFormRequest passiveNffeSubstantialUsOwnersProvidedCertification(Boolean passiveNffeSubstantialUsOwnersProvidedCertification) {
    this.passiveNffeSubstantialUsOwnersProvidedCertification = passiveNffeSubstantialUsOwnersProvidedCertification;
    return this;
  }

  /**
   * Certifies that the passive NFFE has provided the name, address, and TIN of each substantial U.S. owner or controlling U.S. person.
   * @return passiveNffeSubstantialUsOwnersProvidedCertification
   */
  @javax.annotation.Nullable
  public Boolean getPassiveNffeSubstantialUsOwnersProvidedCertification() {
    return passiveNffeSubstantialUsOwnersProvidedCertification;
  }

  public void setPassiveNffeSubstantialUsOwnersProvidedCertification(Boolean passiveNffeSubstantialUsOwnersProvidedCertification) {
    this.passiveNffeSubstantialUsOwnersProvidedCertification = passiveNffeSubstantialUsOwnersProvidedCertification;
  }


  public W8BenEFormRequest exceptedInterAffiliateFfiCertification(Boolean exceptedInterAffiliateFfiCertification) {
    this.exceptedInterAffiliateFfiCertification = exceptedInterAffiliateFfiCertification;
    return this;
  }

  /**
   * Certifies that the entity is an inter-affiliate FFI meeting all conditions for exemption,  including limited account activity and payment interactions within its expanded affiliated group.
   * @return exceptedInterAffiliateFfiCertification
   */
  @javax.annotation.Nullable
  public Boolean getExceptedInterAffiliateFfiCertification() {
    return exceptedInterAffiliateFfiCertification;
  }

  public void setExceptedInterAffiliateFfiCertification(Boolean exceptedInterAffiliateFfiCertification) {
    this.exceptedInterAffiliateFfiCertification = exceptedInterAffiliateFfiCertification;
  }


  public W8BenEFormRequest sponsoredDirectReportingNffeCertification(Boolean sponsoredDirectReportingNffeCertification) {
    this.sponsoredDirectReportingNffeCertification = sponsoredDirectReportingNffeCertification;
    return this;
  }

  /**
   * Certifies that the entity is a sponsored direct reporting NFFE.
   * @return sponsoredDirectReportingNffeCertification
   */
  @javax.annotation.Nullable
  public Boolean getSponsoredDirectReportingNffeCertification() {
    return sponsoredDirectReportingNffeCertification;
  }

  public void setSponsoredDirectReportingNffeCertification(Boolean sponsoredDirectReportingNffeCertification) {
    this.sponsoredDirectReportingNffeCertification = sponsoredDirectReportingNffeCertification;
  }


  public W8BenEFormRequest directReportingNffeSponsoringEntity(String directReportingNffeSponsoringEntity) {
    this.directReportingNffeSponsoringEntity = directReportingNffeSponsoringEntity;
    return this;
  }

  /**
   * The name of the entity that sponsors the direct reporting NFFE.
   * @return directReportingNffeSponsoringEntity
   */
  @javax.annotation.Nullable
  public String getDirectReportingNffeSponsoringEntity() {
    return directReportingNffeSponsoringEntity;
  }

  public void setDirectReportingNffeSponsoringEntity(String directReportingNffeSponsoringEntity) {
    this.directReportingNffeSponsoringEntity = directReportingNffeSponsoringEntity;
  }


  public W8BenEFormRequest substantialUsOwners(List<SubstantialUsOwnerRequest> substantialUsOwners) {
    this.substantialUsOwners = substantialUsOwners;
    return this;
  }

  public W8BenEFormRequest addSubstantialUsOwnersItem(SubstantialUsOwnerRequest substantialUsOwnersItem) {
    if (this.substantialUsOwners == null) {
      this.substantialUsOwners = new ArrayList<>();
    }
    this.substantialUsOwners.add(substantialUsOwnersItem);
    return this;
  }

  /**
   * The list of substantial U.S. owners of passive NFFE.
   * @return substantialUsOwners
   */
  @javax.annotation.Nullable
  public List<SubstantialUsOwnerRequest> getSubstantialUsOwners() {
    return substantialUsOwners;
  }

  public void setSubstantialUsOwners(List<SubstantialUsOwnerRequest> substantialUsOwners) {
    this.substantialUsOwners = substantialUsOwners;
  }


  public W8BenEFormRequest signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * The name of the signer.
   * @return signerName
   */
  @javax.annotation.Nullable
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


  public W8BenEFormRequest capacityToSignCertification(Boolean capacityToSignCertification) {
    this.capacityToSignCertification = capacityToSignCertification;
    return this;
  }

  /**
   * Certifies signer has the capacity to sign for the beneficial owner.
   * @return capacityToSignCertification
   */
  @javax.annotation.Nullable
  public Boolean getCapacityToSignCertification() {
    return capacityToSignCertification;
  }

  public void setCapacityToSignCertification(Boolean capacityToSignCertification) {
    this.capacityToSignCertification = capacityToSignCertification;
  }


  public W8BenEFormRequest companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The ID of the associated company.
   * @return companyId
   */
  @javax.annotation.Nullable
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public W8BenEFormRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * A reference identifier for the form.
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public W8BenEFormRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the individual associated with the form.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public W8BenEFormRequest eDeliveryConsentedAt(OffsetDateTime eDeliveryConsentedAt) {
    this.eDeliveryConsentedAt = eDeliveryConsentedAt;
    return this;
  }

  /**
   * The date when e-delivery was consented.
   * @return eDeliveryConsentedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime geteDeliveryConsentedAt() {
    return eDeliveryConsentedAt;
  }

  public void seteDeliveryConsentedAt(OffsetDateTime eDeliveryConsentedAt) {
    this.eDeliveryConsentedAt = eDeliveryConsentedAt;
  }


  public W8BenEFormRequest signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * The signature of the form.
   * @return signature
   */
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W8BenEFormRequest w8BenEFormRequest = (W8BenEFormRequest) o;
    return Objects.equals(this.type, w8BenEFormRequest.type) &&
        Objects.equals(this.name, w8BenEFormRequest.name) &&
        Objects.equals(this.citizenshipCountry, w8BenEFormRequest.citizenshipCountry) &&
        Objects.equals(this.disregardedEntity, w8BenEFormRequest.disregardedEntity) &&
        Objects.equals(this.entityType, w8BenEFormRequest.entityType) &&
        Objects.equals(this.makingTreatyClaim, w8BenEFormRequest.makingTreatyClaim) &&
        Objects.equals(this.fatcaStatus, w8BenEFormRequest.fatcaStatus) &&
        Objects.equals(this.residenceAddress, w8BenEFormRequest.residenceAddress) &&
        Objects.equals(this.residenceCity, w8BenEFormRequest.residenceCity) &&
        Objects.equals(this.residenceState, w8BenEFormRequest.residenceState) &&
        Objects.equals(this.residenceZip, w8BenEFormRequest.residenceZip) &&
        Objects.equals(this.residenceCountry, w8BenEFormRequest.residenceCountry) &&
        Objects.equals(this.residenceIsMailing, w8BenEFormRequest.residenceIsMailing) &&
        Objects.equals(this.mailingAddress, w8BenEFormRequest.mailingAddress) &&
        Objects.equals(this.mailingCity, w8BenEFormRequest.mailingCity) &&
        Objects.equals(this.mailingState, w8BenEFormRequest.mailingState) &&
        Objects.equals(this.mailingZip, w8BenEFormRequest.mailingZip) &&
        Objects.equals(this.mailingCountry, w8BenEFormRequest.mailingCountry) &&
        Objects.equals(this.tin, w8BenEFormRequest.tin) &&
        Objects.equals(this.giin, w8BenEFormRequest.giin) &&
        Objects.equals(this.foreignTinNotRequired, w8BenEFormRequest.foreignTinNotRequired) &&
        Objects.equals(this.foreignTin, w8BenEFormRequest.foreignTin) &&
        Objects.equals(this.referenceNumber, w8BenEFormRequest.referenceNumber) &&
        Objects.equals(this.disregardedEntityFatcaStatus, w8BenEFormRequest.disregardedEntityFatcaStatus) &&
        Objects.equals(this.disregardedAddress, w8BenEFormRequest.disregardedAddress) &&
        Objects.equals(this.disregardedCity, w8BenEFormRequest.disregardedCity) &&
        Objects.equals(this.disregardedState, w8BenEFormRequest.disregardedState) &&
        Objects.equals(this.disregardedZip, w8BenEFormRequest.disregardedZip) &&
        Objects.equals(this.disregardedCountry, w8BenEFormRequest.disregardedCountry) &&
        Objects.equals(this.disregardedEntityGiin, w8BenEFormRequest.disregardedEntityGiin) &&
        Objects.equals(this.treatyCountryCertification, w8BenEFormRequest.treatyCountryCertification) &&
        Objects.equals(this.treatyCountry, w8BenEFormRequest.treatyCountry) &&
        Objects.equals(this.benefitLimitationCertification, w8BenEFormRequest.benefitLimitationCertification) &&
        Objects.equals(this.benefitLimitation, w8BenEFormRequest.benefitLimitation) &&
        Objects.equals(this.qualifiedResidentStatusCertification, w8BenEFormRequest.qualifiedResidentStatusCertification) &&
        Objects.equals(this.treatyArticle, w8BenEFormRequest.treatyArticle) &&
        Objects.equals(this.withholdingRate, w8BenEFormRequest.withholdingRate) &&
        Objects.equals(this.incomeType, w8BenEFormRequest.incomeType) &&
        Objects.equals(this.treatyReasons, w8BenEFormRequest.treatyReasons) &&
        Objects.equals(this.ffiSponsoringEntity, w8BenEFormRequest.ffiSponsoringEntity) &&
        Objects.equals(this.investmentEntityCertification, w8BenEFormRequest.investmentEntityCertification) &&
        Objects.equals(this.controlledForeignCorporationCertification, w8BenEFormRequest.controlledForeignCorporationCertification) &&
        Objects.equals(this.compliantNonregisteringLocalBankCertification, w8BenEFormRequest.compliantNonregisteringLocalBankCertification) &&
        Objects.equals(this.compliantFfiLowValueAccountsCertification, w8BenEFormRequest.compliantFfiLowValueAccountsCertification) &&
        Objects.equals(this.sponsoredCloselyHeldEntitySponsoringEntity, w8BenEFormRequest.sponsoredCloselyHeldEntitySponsoringEntity) &&
        Objects.equals(this.sponsoredCloselyHeldInvestmentVehicleCertification, w8BenEFormRequest.sponsoredCloselyHeldInvestmentVehicleCertification) &&
        Objects.equals(this.compliantLimitedLifeDebtEntityCertification, w8BenEFormRequest.compliantLimitedLifeDebtEntityCertification) &&
        Objects.equals(this.investmentEntityNoFinancialAccountsCertification, w8BenEFormRequest.investmentEntityNoFinancialAccountsCertification) &&
        Objects.equals(this.ownerDocumentedFfiCertification, w8BenEFormRequest.ownerDocumentedFfiCertification) &&
        Objects.equals(this.ownerDocumentedFfiReportingStatementCertification, w8BenEFormRequest.ownerDocumentedFfiReportingStatementCertification) &&
        Objects.equals(this.ownerDocumentedFfiAuditorLetterCertification, w8BenEFormRequest.ownerDocumentedFfiAuditorLetterCertification) &&
        Objects.equals(this.ownerDocumentedFfiTrustBeneficiariesCertification, w8BenEFormRequest.ownerDocumentedFfiTrustBeneficiariesCertification) &&
        Objects.equals(this.restrictedDistributorCertification, w8BenEFormRequest.restrictedDistributorCertification) &&
        Objects.equals(this.restrictedDistributorAgreementCertification, w8BenEFormRequest.restrictedDistributorAgreementCertification) &&
        Objects.equals(this.restrictedDistributorPreexistingSalesComplianceCertification, w8BenEFormRequest.restrictedDistributorPreexistingSalesComplianceCertification) &&
        Objects.equals(this.nonreportingIgaFfiCertification, w8BenEFormRequest.nonreportingIgaFfiCertification) &&
        Objects.equals(this.igaCountry, w8BenEFormRequest.igaCountry) &&
        Objects.equals(this.igaModel, w8BenEFormRequest.igaModel) &&
        Objects.equals(this.igaLegalStatusTreatment, w8BenEFormRequest.igaLegalStatusTreatment) &&
        Objects.equals(this.igaFfiTrusteeOrSponsor, w8BenEFormRequest.igaFfiTrusteeOrSponsor) &&
        Objects.equals(this.igaFfiTrusteeIsForeign, w8BenEFormRequest.igaFfiTrusteeIsForeign) &&
        Objects.equals(this.nonCommercialFinancialActivityCertification, w8BenEFormRequest.nonCommercialFinancialActivityCertification) &&
        Objects.equals(this.internationOrganizationCertification, w8BenEFormRequest.internationOrganizationCertification) &&
        Objects.equals(this.intergovernmentalOrganizationCertification, w8BenEFormRequest.intergovernmentalOrganizationCertification) &&
        Objects.equals(this.treatyQualifiedPensionFundCertification, w8BenEFormRequest.treatyQualifiedPensionFundCertification) &&
        Objects.equals(this.qualifiedRetirementFundCertification, w8BenEFormRequest.qualifiedRetirementFundCertification) &&
        Objects.equals(this.narrowParticipationRetirementFundCertification, w8BenEFormRequest.narrowParticipationRetirementFundCertification) &&
        Objects.equals(this.section401AEquivalentPensionPlanCertification, w8BenEFormRequest.section401AEquivalentPensionPlanCertification) &&
        Objects.equals(this.investmentEntityForRetirementFundsCertification, w8BenEFormRequest.investmentEntityForRetirementFundsCertification) &&
        Objects.equals(this.exemptBeneficialOwnerSponsoredRetirementFundCertification, w8BenEFormRequest.exemptBeneficialOwnerSponsoredRetirementFundCertification) &&
        Objects.equals(this.exemptBeneficialOwnerOwnedInvestmentEntityCertification, w8BenEFormRequest.exemptBeneficialOwnerOwnedInvestmentEntityCertification) &&
        Objects.equals(this.territoryFinancialInstitutionCertification, w8BenEFormRequest.territoryFinancialInstitutionCertification) &&
        Objects.equals(this.exceptedNonfinancialGroupEntityCertification, w8BenEFormRequest.exceptedNonfinancialGroupEntityCertification) &&
        Objects.equals(this.exceptedNonfinancialStartUpCertification, w8BenEFormRequest.exceptedNonfinancialStartUpCertification) &&
        Objects.equals(this.startupFormationOrResolutionDate, w8BenEFormRequest.startupFormationOrResolutionDate) &&
        Objects.equals(this.exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification, w8BenEFormRequest.exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification) &&
        Objects.equals(this.nonfinancialEntityFilingDate, w8BenEFormRequest.nonfinancialEntityFilingDate) &&
        Objects.equals(this.section501COrganizationCertification, w8BenEFormRequest.section501COrganizationCertification) &&
        Objects.equals(this.determinationLetterDate, w8BenEFormRequest.determinationLetterDate) &&
        Objects.equals(this.nonprofitOrganizationCertification, w8BenEFormRequest.nonprofitOrganizationCertification) &&
        Objects.equals(this.publiclyTradedNffeCertification, w8BenEFormRequest.publiclyTradedNffeCertification) &&
        Objects.equals(this.publiclyTradedNffeSecuritiesMarket, w8BenEFormRequest.publiclyTradedNffeSecuritiesMarket) &&
        Objects.equals(this.nffeAffiliateOfPubliclyTradedEntityCertification, w8BenEFormRequest.nffeAffiliateOfPubliclyTradedEntityCertification) &&
        Objects.equals(this.publiclyTradedEntity, w8BenEFormRequest.publiclyTradedEntity) &&
        Objects.equals(this.nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket, w8BenEFormRequest.nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket) &&
        Objects.equals(this.exceptedTerritoryNffeCertification, w8BenEFormRequest.exceptedTerritoryNffeCertification) &&
        Objects.equals(this.activeNffeCertification, w8BenEFormRequest.activeNffeCertification) &&
        Objects.equals(this.passiveNffeCertification, w8BenEFormRequest.passiveNffeCertification) &&
        Objects.equals(this.passiveNffeNoSubstantialUsOwnersCertification, w8BenEFormRequest.passiveNffeNoSubstantialUsOwnersCertification) &&
        Objects.equals(this.passiveNffeSubstantialUsOwnersProvidedCertification, w8BenEFormRequest.passiveNffeSubstantialUsOwnersProvidedCertification) &&
        Objects.equals(this.exceptedInterAffiliateFfiCertification, w8BenEFormRequest.exceptedInterAffiliateFfiCertification) &&
        Objects.equals(this.sponsoredDirectReportingNffeCertification, w8BenEFormRequest.sponsoredDirectReportingNffeCertification) &&
        Objects.equals(this.directReportingNffeSponsoringEntity, w8BenEFormRequest.directReportingNffeSponsoringEntity) &&
        Objects.equals(this.substantialUsOwners, w8BenEFormRequest.substantialUsOwners) &&
        Objects.equals(this.signerName, w8BenEFormRequest.signerName) &&
        Objects.equals(this.capacityToSignCertification, w8BenEFormRequest.capacityToSignCertification) &&
        Objects.equals(this.companyId, w8BenEFormRequest.companyId) &&
        Objects.equals(this.referenceId, w8BenEFormRequest.referenceId) &&
        Objects.equals(this.email, w8BenEFormRequest.email) &&
        Objects.equals(this.eDeliveryConsentedAt, w8BenEFormRequest.eDeliveryConsentedAt) &&
        Objects.equals(this.signature, w8BenEFormRequest.signature);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, citizenshipCountry, disregardedEntity, entityType, makingTreatyClaim, fatcaStatus, residenceAddress, residenceCity, residenceState, residenceZip, residenceCountry, residenceIsMailing, mailingAddress, mailingCity, mailingState, mailingZip, mailingCountry, tin, giin, foreignTinNotRequired, foreignTin, referenceNumber, disregardedEntityFatcaStatus, disregardedAddress, disregardedCity, disregardedState, disregardedZip, disregardedCountry, disregardedEntityGiin, treatyCountryCertification, treatyCountry, benefitLimitationCertification, benefitLimitation, qualifiedResidentStatusCertification, treatyArticle, withholdingRate, incomeType, treatyReasons, ffiSponsoringEntity, investmentEntityCertification, controlledForeignCorporationCertification, compliantNonregisteringLocalBankCertification, compliantFfiLowValueAccountsCertification, sponsoredCloselyHeldEntitySponsoringEntity, sponsoredCloselyHeldInvestmentVehicleCertification, compliantLimitedLifeDebtEntityCertification, investmentEntityNoFinancialAccountsCertification, ownerDocumentedFfiCertification, ownerDocumentedFfiReportingStatementCertification, ownerDocumentedFfiAuditorLetterCertification, ownerDocumentedFfiTrustBeneficiariesCertification, restrictedDistributorCertification, restrictedDistributorAgreementCertification, restrictedDistributorPreexistingSalesComplianceCertification, nonreportingIgaFfiCertification, igaCountry, igaModel, igaLegalStatusTreatment, igaFfiTrusteeOrSponsor, igaFfiTrusteeIsForeign, nonCommercialFinancialActivityCertification, internationOrganizationCertification, intergovernmentalOrganizationCertification, treatyQualifiedPensionFundCertification, qualifiedRetirementFundCertification, narrowParticipationRetirementFundCertification, section401AEquivalentPensionPlanCertification, investmentEntityForRetirementFundsCertification, exemptBeneficialOwnerSponsoredRetirementFundCertification, exemptBeneficialOwnerOwnedInvestmentEntityCertification, territoryFinancialInstitutionCertification, exceptedNonfinancialGroupEntityCertification, exceptedNonfinancialStartUpCertification, startupFormationOrResolutionDate, exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification, nonfinancialEntityFilingDate, section501COrganizationCertification, determinationLetterDate, nonprofitOrganizationCertification, publiclyTradedNffeCertification, publiclyTradedNffeSecuritiesMarket, nffeAffiliateOfPubliclyTradedEntityCertification, publiclyTradedEntity, nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket, exceptedTerritoryNffeCertification, activeNffeCertification, passiveNffeCertification, passiveNffeNoSubstantialUsOwnersCertification, passiveNffeSubstantialUsOwnersProvidedCertification, exceptedInterAffiliateFfiCertification, sponsoredDirectReportingNffeCertification, directReportingNffeSponsoringEntity, substantialUsOwners, signerName, capacityToSignCertification, companyId, referenceId, email, eDeliveryConsentedAt, signature);
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
    sb.append("class W8BenEFormRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    citizenshipCountry: ").append(toIndentedString(citizenshipCountry)).append("\n");
    sb.append("    disregardedEntity: ").append(toIndentedString(disregardedEntity)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    makingTreatyClaim: ").append(toIndentedString(makingTreatyClaim)).append("\n");
    sb.append("    fatcaStatus: ").append(toIndentedString(fatcaStatus)).append("\n");
    sb.append("    residenceAddress: ").append(toIndentedString(residenceAddress)).append("\n");
    sb.append("    residenceCity: ").append(toIndentedString(residenceCity)).append("\n");
    sb.append("    residenceState: ").append(toIndentedString(residenceState)).append("\n");
    sb.append("    residenceZip: ").append(toIndentedString(residenceZip)).append("\n");
    sb.append("    residenceCountry: ").append(toIndentedString(residenceCountry)).append("\n");
    sb.append("    residenceIsMailing: ").append(toIndentedString(residenceIsMailing)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
    sb.append("    mailingCity: ").append(toIndentedString(mailingCity)).append("\n");
    sb.append("    mailingState: ").append(toIndentedString(mailingState)).append("\n");
    sb.append("    mailingZip: ").append(toIndentedString(mailingZip)).append("\n");
    sb.append("    mailingCountry: ").append(toIndentedString(mailingCountry)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    giin: ").append(toIndentedString(giin)).append("\n");
    sb.append("    foreignTinNotRequired: ").append(toIndentedString(foreignTinNotRequired)).append("\n");
    sb.append("    foreignTin: ").append(toIndentedString(foreignTin)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    disregardedEntityFatcaStatus: ").append(toIndentedString(disregardedEntityFatcaStatus)).append("\n");
    sb.append("    disregardedAddress: ").append(toIndentedString(disregardedAddress)).append("\n");
    sb.append("    disregardedCity: ").append(toIndentedString(disregardedCity)).append("\n");
    sb.append("    disregardedState: ").append(toIndentedString(disregardedState)).append("\n");
    sb.append("    disregardedZip: ").append(toIndentedString(disregardedZip)).append("\n");
    sb.append("    disregardedCountry: ").append(toIndentedString(disregardedCountry)).append("\n");
    sb.append("    disregardedEntityGiin: ").append(toIndentedString(disregardedEntityGiin)).append("\n");
    sb.append("    treatyCountryCertification: ").append(toIndentedString(treatyCountryCertification)).append("\n");
    sb.append("    treatyCountry: ").append(toIndentedString(treatyCountry)).append("\n");
    sb.append("    benefitLimitationCertification: ").append(toIndentedString(benefitLimitationCertification)).append("\n");
    sb.append("    benefitLimitation: ").append(toIndentedString(benefitLimitation)).append("\n");
    sb.append("    qualifiedResidentStatusCertification: ").append(toIndentedString(qualifiedResidentStatusCertification)).append("\n");
    sb.append("    treatyArticle: ").append(toIndentedString(treatyArticle)).append("\n");
    sb.append("    withholdingRate: ").append(toIndentedString(withholdingRate)).append("\n");
    sb.append("    incomeType: ").append(toIndentedString(incomeType)).append("\n");
    sb.append("    treatyReasons: ").append(toIndentedString(treatyReasons)).append("\n");
    sb.append("    ffiSponsoringEntity: ").append(toIndentedString(ffiSponsoringEntity)).append("\n");
    sb.append("    investmentEntityCertification: ").append(toIndentedString(investmentEntityCertification)).append("\n");
    sb.append("    controlledForeignCorporationCertification: ").append(toIndentedString(controlledForeignCorporationCertification)).append("\n");
    sb.append("    compliantNonregisteringLocalBankCertification: ").append(toIndentedString(compliantNonregisteringLocalBankCertification)).append("\n");
    sb.append("    compliantFfiLowValueAccountsCertification: ").append(toIndentedString(compliantFfiLowValueAccountsCertification)).append("\n");
    sb.append("    sponsoredCloselyHeldEntitySponsoringEntity: ").append(toIndentedString(sponsoredCloselyHeldEntitySponsoringEntity)).append("\n");
    sb.append("    sponsoredCloselyHeldInvestmentVehicleCertification: ").append(toIndentedString(sponsoredCloselyHeldInvestmentVehicleCertification)).append("\n");
    sb.append("    compliantLimitedLifeDebtEntityCertification: ").append(toIndentedString(compliantLimitedLifeDebtEntityCertification)).append("\n");
    sb.append("    investmentEntityNoFinancialAccountsCertification: ").append(toIndentedString(investmentEntityNoFinancialAccountsCertification)).append("\n");
    sb.append("    ownerDocumentedFfiCertification: ").append(toIndentedString(ownerDocumentedFfiCertification)).append("\n");
    sb.append("    ownerDocumentedFfiReportingStatementCertification: ").append(toIndentedString(ownerDocumentedFfiReportingStatementCertification)).append("\n");
    sb.append("    ownerDocumentedFfiAuditorLetterCertification: ").append(toIndentedString(ownerDocumentedFfiAuditorLetterCertification)).append("\n");
    sb.append("    ownerDocumentedFfiTrustBeneficiariesCertification: ").append(toIndentedString(ownerDocumentedFfiTrustBeneficiariesCertification)).append("\n");
    sb.append("    restrictedDistributorCertification: ").append(toIndentedString(restrictedDistributorCertification)).append("\n");
    sb.append("    restrictedDistributorAgreementCertification: ").append(toIndentedString(restrictedDistributorAgreementCertification)).append("\n");
    sb.append("    restrictedDistributorPreexistingSalesComplianceCertification: ").append(toIndentedString(restrictedDistributorPreexistingSalesComplianceCertification)).append("\n");
    sb.append("    nonreportingIgaFfiCertification: ").append(toIndentedString(nonreportingIgaFfiCertification)).append("\n");
    sb.append("    igaCountry: ").append(toIndentedString(igaCountry)).append("\n");
    sb.append("    igaModel: ").append(toIndentedString(igaModel)).append("\n");
    sb.append("    igaLegalStatusTreatment: ").append(toIndentedString(igaLegalStatusTreatment)).append("\n");
    sb.append("    igaFfiTrusteeOrSponsor: ").append(toIndentedString(igaFfiTrusteeOrSponsor)).append("\n");
    sb.append("    igaFfiTrusteeIsForeign: ").append(toIndentedString(igaFfiTrusteeIsForeign)).append("\n");
    sb.append("    nonCommercialFinancialActivityCertification: ").append(toIndentedString(nonCommercialFinancialActivityCertification)).append("\n");
    sb.append("    internationOrganizationCertification: ").append(toIndentedString(internationOrganizationCertification)).append("\n");
    sb.append("    intergovernmentalOrganizationCertification: ").append(toIndentedString(intergovernmentalOrganizationCertification)).append("\n");
    sb.append("    treatyQualifiedPensionFundCertification: ").append(toIndentedString(treatyQualifiedPensionFundCertification)).append("\n");
    sb.append("    qualifiedRetirementFundCertification: ").append(toIndentedString(qualifiedRetirementFundCertification)).append("\n");
    sb.append("    narrowParticipationRetirementFundCertification: ").append(toIndentedString(narrowParticipationRetirementFundCertification)).append("\n");
    sb.append("    section401AEquivalentPensionPlanCertification: ").append(toIndentedString(section401AEquivalentPensionPlanCertification)).append("\n");
    sb.append("    investmentEntityForRetirementFundsCertification: ").append(toIndentedString(investmentEntityForRetirementFundsCertification)).append("\n");
    sb.append("    exemptBeneficialOwnerSponsoredRetirementFundCertification: ").append(toIndentedString(exemptBeneficialOwnerSponsoredRetirementFundCertification)).append("\n");
    sb.append("    exemptBeneficialOwnerOwnedInvestmentEntityCertification: ").append(toIndentedString(exemptBeneficialOwnerOwnedInvestmentEntityCertification)).append("\n");
    sb.append("    territoryFinancialInstitutionCertification: ").append(toIndentedString(territoryFinancialInstitutionCertification)).append("\n");
    sb.append("    exceptedNonfinancialGroupEntityCertification: ").append(toIndentedString(exceptedNonfinancialGroupEntityCertification)).append("\n");
    sb.append("    exceptedNonfinancialStartUpCertification: ").append(toIndentedString(exceptedNonfinancialStartUpCertification)).append("\n");
    sb.append("    startupFormationOrResolutionDate: ").append(toIndentedString(startupFormationOrResolutionDate)).append("\n");
    sb.append("    exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification: ").append(toIndentedString(exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification)).append("\n");
    sb.append("    nonfinancialEntityFilingDate: ").append(toIndentedString(nonfinancialEntityFilingDate)).append("\n");
    sb.append("    section501COrganizationCertification: ").append(toIndentedString(section501COrganizationCertification)).append("\n");
    sb.append("    determinationLetterDate: ").append(toIndentedString(determinationLetterDate)).append("\n");
    sb.append("    nonprofitOrganizationCertification: ").append(toIndentedString(nonprofitOrganizationCertification)).append("\n");
    sb.append("    publiclyTradedNffeCertification: ").append(toIndentedString(publiclyTradedNffeCertification)).append("\n");
    sb.append("    publiclyTradedNffeSecuritiesMarket: ").append(toIndentedString(publiclyTradedNffeSecuritiesMarket)).append("\n");
    sb.append("    nffeAffiliateOfPubliclyTradedEntityCertification: ").append(toIndentedString(nffeAffiliateOfPubliclyTradedEntityCertification)).append("\n");
    sb.append("    publiclyTradedEntity: ").append(toIndentedString(publiclyTradedEntity)).append("\n");
    sb.append("    nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket: ").append(toIndentedString(nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket)).append("\n");
    sb.append("    exceptedTerritoryNffeCertification: ").append(toIndentedString(exceptedTerritoryNffeCertification)).append("\n");
    sb.append("    activeNffeCertification: ").append(toIndentedString(activeNffeCertification)).append("\n");
    sb.append("    passiveNffeCertification: ").append(toIndentedString(passiveNffeCertification)).append("\n");
    sb.append("    passiveNffeNoSubstantialUsOwnersCertification: ").append(toIndentedString(passiveNffeNoSubstantialUsOwnersCertification)).append("\n");
    sb.append("    passiveNffeSubstantialUsOwnersProvidedCertification: ").append(toIndentedString(passiveNffeSubstantialUsOwnersProvidedCertification)).append("\n");
    sb.append("    exceptedInterAffiliateFfiCertification: ").append(toIndentedString(exceptedInterAffiliateFfiCertification)).append("\n");
    sb.append("    sponsoredDirectReportingNffeCertification: ").append(toIndentedString(sponsoredDirectReportingNffeCertification)).append("\n");
    sb.append("    directReportingNffeSponsoringEntity: ").append(toIndentedString(directReportingNffeSponsoringEntity)).append("\n");
    sb.append("    substantialUsOwners: ").append(toIndentedString(substantialUsOwners)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    capacityToSignCertification: ").append(toIndentedString(capacityToSignCertification)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    eDeliveryConsentedAt: ").append(toIndentedString(eDeliveryConsentedAt)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
    openapiFields.add("companyId");
    openapiFields.add("referenceId");
    openapiFields.add("email");
    openapiFields.add("eDeliveryConsentedAt");
    openapiFields.add("signature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to W8BenEFormRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!W8BenEFormRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in W8BenEFormRequest is not found in the empty JSON string", W8BenEFormRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!W8BenEFormRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `W8BenEFormRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("citizenshipCountry") != null && !jsonObj.get("citizenshipCountry").isJsonNull()) && !jsonObj.get("citizenshipCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `citizenshipCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("citizenshipCountry").toString()));
      }
      if ((jsonObj.get("disregardedEntity") != null && !jsonObj.get("disregardedEntity").isJsonNull()) && !jsonObj.get("disregardedEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedEntity").toString()));
      }
      if ((jsonObj.get("entityType") != null && !jsonObj.get("entityType").isJsonNull()) && !jsonObj.get("entityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
      }
      if ((jsonObj.get("fatcaStatus") != null && !jsonObj.get("fatcaStatus").isJsonNull()) && !jsonObj.get("fatcaStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fatcaStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fatcaStatus").toString()));
      }
      if ((jsonObj.get("residenceAddress") != null && !jsonObj.get("residenceAddress").isJsonNull()) && !jsonObj.get("residenceAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceAddress").toString()));
      }
      if ((jsonObj.get("residenceCity") != null && !jsonObj.get("residenceCity").isJsonNull()) && !jsonObj.get("residenceCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceCity").toString()));
      }
      if ((jsonObj.get("residenceState") != null && !jsonObj.get("residenceState").isJsonNull()) && !jsonObj.get("residenceState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceState").toString()));
      }
      if ((jsonObj.get("residenceZip") != null && !jsonObj.get("residenceZip").isJsonNull()) && !jsonObj.get("residenceZip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceZip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceZip").toString()));
      }
      if ((jsonObj.get("residenceCountry") != null && !jsonObj.get("residenceCountry").isJsonNull()) && !jsonObj.get("residenceCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceCountry").toString()));
      }
      if ((jsonObj.get("mailingAddress") != null && !jsonObj.get("mailingAddress").isJsonNull()) && !jsonObj.get("mailingAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingAddress").toString()));
      }
      if ((jsonObj.get("mailingCity") != null && !jsonObj.get("mailingCity").isJsonNull()) && !jsonObj.get("mailingCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingCity").toString()));
      }
      if ((jsonObj.get("mailingState") != null && !jsonObj.get("mailingState").isJsonNull()) && !jsonObj.get("mailingState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingState").toString()));
      }
      if ((jsonObj.get("mailingZip") != null && !jsonObj.get("mailingZip").isJsonNull()) && !jsonObj.get("mailingZip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingZip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingZip").toString()));
      }
      if ((jsonObj.get("mailingCountry") != null && !jsonObj.get("mailingCountry").isJsonNull()) && !jsonObj.get("mailingCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingCountry").toString()));
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("giin") != null && !jsonObj.get("giin").isJsonNull()) && !jsonObj.get("giin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `giin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("giin").toString()));
      }
      if ((jsonObj.get("foreignTin") != null && !jsonObj.get("foreignTin").isJsonNull()) && !jsonObj.get("foreignTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignTin").toString()));
      }
      if ((jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonNull()) && !jsonObj.get("referenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceNumber").toString()));
      }
      if ((jsonObj.get("disregardedEntityFatcaStatus") != null && !jsonObj.get("disregardedEntityFatcaStatus").isJsonNull()) && !jsonObj.get("disregardedEntityFatcaStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedEntityFatcaStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedEntityFatcaStatus").toString()));
      }
      if ((jsonObj.get("disregardedAddress") != null && !jsonObj.get("disregardedAddress").isJsonNull()) && !jsonObj.get("disregardedAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedAddress").toString()));
      }
      if ((jsonObj.get("disregardedCity") != null && !jsonObj.get("disregardedCity").isJsonNull()) && !jsonObj.get("disregardedCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedCity").toString()));
      }
      if ((jsonObj.get("disregardedState") != null && !jsonObj.get("disregardedState").isJsonNull()) && !jsonObj.get("disregardedState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedState").toString()));
      }
      if ((jsonObj.get("disregardedZip") != null && !jsonObj.get("disregardedZip").isJsonNull()) && !jsonObj.get("disregardedZip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedZip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedZip").toString()));
      }
      if ((jsonObj.get("disregardedCountry") != null && !jsonObj.get("disregardedCountry").isJsonNull()) && !jsonObj.get("disregardedCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedCountry").toString()));
      }
      if ((jsonObj.get("disregardedEntityGiin") != null && !jsonObj.get("disregardedEntityGiin").isJsonNull()) && !jsonObj.get("disregardedEntityGiin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedEntityGiin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedEntityGiin").toString()));
      }
      if ((jsonObj.get("treatyCountry") != null && !jsonObj.get("treatyCountry").isJsonNull()) && !jsonObj.get("treatyCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `treatyCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("treatyCountry").toString()));
      }
      if ((jsonObj.get("benefitLimitation") != null && !jsonObj.get("benefitLimitation").isJsonNull()) && !jsonObj.get("benefitLimitation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefitLimitation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefitLimitation").toString()));
      }
      if ((jsonObj.get("treatyArticle") != null && !jsonObj.get("treatyArticle").isJsonNull()) && !jsonObj.get("treatyArticle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `treatyArticle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("treatyArticle").toString()));
      }
      if ((jsonObj.get("withholdingRate") != null && !jsonObj.get("withholdingRate").isJsonNull()) && !jsonObj.get("withholdingRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withholdingRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withholdingRate").toString()));
      }
      if ((jsonObj.get("incomeType") != null && !jsonObj.get("incomeType").isJsonNull()) && !jsonObj.get("incomeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incomeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incomeType").toString()));
      }
      if ((jsonObj.get("treatyReasons") != null && !jsonObj.get("treatyReasons").isJsonNull()) && !jsonObj.get("treatyReasons").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `treatyReasons` to be a primitive type in the JSON string but got `%s`", jsonObj.get("treatyReasons").toString()));
      }
      if ((jsonObj.get("ffiSponsoringEntity") != null && !jsonObj.get("ffiSponsoringEntity").isJsonNull()) && !jsonObj.get("ffiSponsoringEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ffiSponsoringEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ffiSponsoringEntity").toString()));
      }
      if ((jsonObj.get("sponsoredCloselyHeldEntitySponsoringEntity") != null && !jsonObj.get("sponsoredCloselyHeldEntitySponsoringEntity").isJsonNull()) && !jsonObj.get("sponsoredCloselyHeldEntitySponsoringEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sponsoredCloselyHeldEntitySponsoringEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sponsoredCloselyHeldEntitySponsoringEntity").toString()));
      }
      if ((jsonObj.get("igaCountry") != null && !jsonObj.get("igaCountry").isJsonNull()) && !jsonObj.get("igaCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `igaCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("igaCountry").toString()));
      }
      if ((jsonObj.get("igaModel") != null && !jsonObj.get("igaModel").isJsonNull()) && !jsonObj.get("igaModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `igaModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("igaModel").toString()));
      }
      if ((jsonObj.get("igaLegalStatusTreatment") != null && !jsonObj.get("igaLegalStatusTreatment").isJsonNull()) && !jsonObj.get("igaLegalStatusTreatment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `igaLegalStatusTreatment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("igaLegalStatusTreatment").toString()));
      }
      if ((jsonObj.get("igaFfiTrusteeOrSponsor") != null && !jsonObj.get("igaFfiTrusteeOrSponsor").isJsonNull()) && !jsonObj.get("igaFfiTrusteeOrSponsor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `igaFfiTrusteeOrSponsor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("igaFfiTrusteeOrSponsor").toString()));
      }
      if ((jsonObj.get("publiclyTradedNffeSecuritiesMarket") != null && !jsonObj.get("publiclyTradedNffeSecuritiesMarket").isJsonNull()) && !jsonObj.get("publiclyTradedNffeSecuritiesMarket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publiclyTradedNffeSecuritiesMarket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publiclyTradedNffeSecuritiesMarket").toString()));
      }
      if ((jsonObj.get("publiclyTradedEntity") != null && !jsonObj.get("publiclyTradedEntity").isJsonNull()) && !jsonObj.get("publiclyTradedEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publiclyTradedEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publiclyTradedEntity").toString()));
      }
      if ((jsonObj.get("nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket") != null && !jsonObj.get("nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket").isJsonNull()) && !jsonObj.get("nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket").toString()));
      }
      if ((jsonObj.get("directReportingNffeSponsoringEntity") != null && !jsonObj.get("directReportingNffeSponsoringEntity").isJsonNull()) && !jsonObj.get("directReportingNffeSponsoringEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directReportingNffeSponsoringEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directReportingNffeSponsoringEntity").toString()));
      }
      if (jsonObj.get("substantialUsOwners") != null && !jsonObj.get("substantialUsOwners").isJsonNull()) {
        JsonArray jsonArraysubstantialUsOwners = jsonObj.getAsJsonArray("substantialUsOwners");
        if (jsonArraysubstantialUsOwners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("substantialUsOwners").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `substantialUsOwners` to be an array in the JSON string but got `%s`", jsonObj.get("substantialUsOwners").toString()));
          }

          // validate the optional field `substantialUsOwners` (array)
          for (int i = 0; i < jsonArraysubstantialUsOwners.size(); i++) {
            SubstantialUsOwnerRequest.validateJsonElement(jsonArraysubstantialUsOwners.get(i));
          };
        }
      }
      if ((jsonObj.get("signerName") != null && !jsonObj.get("signerName").isJsonNull()) && !jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W8BenEFormRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W8BenEFormRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W8BenEFormRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W8BenEFormRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<W8BenEFormRequest>() {
           @Override
           public void write(JsonWriter out, W8BenEFormRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public W8BenEFormRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of W8BenEFormRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of W8BenEFormRequest
   * @throws IOException if the JSON string is invalid with respect to W8BenEFormRequest
   */
  public static W8BenEFormRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W8BenEFormRequest.class);
  }

  /**
   * Convert an instance of W8BenEFormRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

