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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
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
 * W8ImyFormRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class W8ImyFormRequest {
  /**
   * The form type (always \&quot;w8imy\&quot; for this model).
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

  public static final String SERIALIZED_NAME_TIN_TYPE = "tinType";
  @SerializedName(SERIALIZED_NAME_TIN_TYPE)
  private String tinType;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_GIIN = "giin";
  @SerializedName(SERIALIZED_NAME_GIIN)
  private String giin;

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

  public static final String SERIALIZED_NAME_QUALIFIED_INTERMEDIARY_CERTIFICATION = "qualifiedIntermediaryCertification";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_INTERMEDIARY_CERTIFICATION)
  private Boolean qualifiedIntermediaryCertification;

  public static final String SERIALIZED_NAME_QI_PRIMARY_WITHHOLDING_RESPONSIBILITY_CERTIFICATION = "qiPrimaryWithholdingResponsibilityCertification";
  @SerializedName(SERIALIZED_NAME_QI_PRIMARY_WITHHOLDING_RESPONSIBILITY_CERTIFICATION)
  private Boolean qiPrimaryWithholdingResponsibilityCertification;

  public static final String SERIALIZED_NAME_QI_WITHHOLDING_RESPONSIBILITY_FOR_PTP_SALES_CERTIFICATION = "qiWithholdingResponsibilityForPtpSalesCertification";
  @SerializedName(SERIALIZED_NAME_QI_WITHHOLDING_RESPONSIBILITY_FOR_PTP_SALES_CERTIFICATION)
  private Boolean qiWithholdingResponsibilityForPtpSalesCertification;

  public static final String SERIALIZED_NAME_QI_NOMINEE_WITHHOLDING_RESPONSIBILITY_FOR_PTP_DISTRIBUTIONS_CERTIFICATION = "qiNomineeWithholdingResponsibilityForPtpDistributionsCertification";
  @SerializedName(SERIALIZED_NAME_QI_NOMINEE_WITHHOLDING_RESPONSIBILITY_FOR_PTP_DISTRIBUTIONS_CERTIFICATION)
  private Boolean qiNomineeWithholdingResponsibilityForPtpDistributionsCertification;

  public static final String SERIALIZED_NAME_QI_SECURITIES_LENDER_SUBSTITUTE_DIVIDEND_WITHHOLDING_CERTIFICATION = "qiSecuritiesLenderSubstituteDividendWithholdingCertification";
  @SerializedName(SERIALIZED_NAME_QI_SECURITIES_LENDER_SUBSTITUTE_DIVIDEND_WITHHOLDING_CERTIFICATION)
  private Boolean qiSecuritiesLenderSubstituteDividendWithholdingCertification;

  public static final String SERIALIZED_NAME_QI_WITHHOLDING_AND1099_REPORTING_RESPONSIBILITY_CERTIFICATION = "qiWithholdingAnd1099ReportingResponsibilityCertification";
  @SerializedName(SERIALIZED_NAME_QI_WITHHOLDING_AND1099_REPORTING_RESPONSIBILITY_CERTIFICATION)
  private Boolean qiWithholdingAnd1099ReportingResponsibilityCertification;

  public static final String SERIALIZED_NAME_QI_FORM1099_OR_FATCA_REPORTING_RESPONSIBILITY_CERTIFICATION = "qiForm1099OrFatcaReportingResponsibilityCertification";
  @SerializedName(SERIALIZED_NAME_QI_FORM1099_OR_FATCA_REPORTING_RESPONSIBILITY_CERTIFICATION)
  private Boolean qiForm1099OrFatcaReportingResponsibilityCertification;

  public static final String SERIALIZED_NAME_QI_OPT_OUT_OF_FORM1099_REPORTING_CERTIFICATION = "qiOptOutOfForm1099ReportingCertification";
  @SerializedName(SERIALIZED_NAME_QI_OPT_OUT_OF_FORM1099_REPORTING_CERTIFICATION)
  private Boolean qiOptOutOfForm1099ReportingCertification;

  public static final String SERIALIZED_NAME_QI_WITHHOLDING_RATE_POOL_CERTIFICATION = "qiWithholdingRatePoolCertification";
  @SerializedName(SERIALIZED_NAME_QI_WITHHOLDING_RATE_POOL_CERTIFICATION)
  private Boolean qiWithholdingRatePoolCertification;

  public static final String SERIALIZED_NAME_QI_INTERMEDIARY_OR_FLOW_THROUGH_ENTITY_DOCUMENTATION_CERTIFICATION = "qiIntermediaryOrFlowThroughEntityDocumentationCertification";
  @SerializedName(SERIALIZED_NAME_QI_INTERMEDIARY_OR_FLOW_THROUGH_ENTITY_DOCUMENTATION_CERTIFICATION)
  private Boolean qiIntermediaryOrFlowThroughEntityDocumentationCertification;

  public static final String SERIALIZED_NAME_QUALIFIED_DERIVATIVES_DEALER_CERTIFICATION = "qualifiedDerivativesDealerCertification";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_DERIVATIVES_DEALER_CERTIFICATION)
  private Boolean qualifiedDerivativesDealerCertification;

  public static final String SERIALIZED_NAME_QDD_CORPORATION = "qddCorporation";
  @SerializedName(SERIALIZED_NAME_QDD_CORPORATION)
  private Boolean qddCorporation;

  public static final String SERIALIZED_NAME_QDD_PARTNERSHIP = "qddPartnership";
  @SerializedName(SERIALIZED_NAME_QDD_PARTNERSHIP)
  private Boolean qddPartnership;

  public static final String SERIALIZED_NAME_QDD_DISREGARDED_ENTITY = "qddDisregardedEntity";
  @SerializedName(SERIALIZED_NAME_QDD_DISREGARDED_ENTITY)
  private Boolean qddDisregardedEntity;

  public static final String SERIALIZED_NAME_NONQUALIFIED_INTERMEDIARY_CERTIFICATION = "nonqualifiedIntermediaryCertification";
  @SerializedName(SERIALIZED_NAME_NONQUALIFIED_INTERMEDIARY_CERTIFICATION)
  private Boolean nonqualifiedIntermediaryCertification;

  public static final String SERIALIZED_NAME_NQI_WITHHOLDING_STATEMENT_TRANSMISSION_CERTIFICATION = "nqiWithholdingStatementTransmissionCertification";
  @SerializedName(SERIALIZED_NAME_NQI_WITHHOLDING_STATEMENT_TRANSMISSION_CERTIFICATION)
  private Boolean nqiWithholdingStatementTransmissionCertification;

  public static final String SERIALIZED_NAME_NQI_WITHHOLDING_RATE_POOL_COMPLIANCE_CERTIFICATION = "nqiWithholdingRatePoolComplianceCertification";
  @SerializedName(SERIALIZED_NAME_NQI_WITHHOLDING_RATE_POOL_COMPLIANCE_CERTIFICATION)
  private Boolean nqiWithholdingRatePoolComplianceCertification;

  public static final String SERIALIZED_NAME_NQI_QUALIFIED_SECURITIES_LENDER_CERTIFICATION = "nqiQualifiedSecuritiesLenderCertification";
  @SerializedName(SERIALIZED_NAME_NQI_QUALIFIED_SECURITIES_LENDER_CERTIFICATION)
  private Boolean nqiQualifiedSecuritiesLenderCertification;

  public static final String SERIALIZED_NAME_NQI_ALTERNATIVE_WITHHOLDING_STATEMENT_VERIFICATION_CERTIFICATION = "nqiAlternativeWithholdingStatementVerificationCertification";
  @SerializedName(SERIALIZED_NAME_NQI_ALTERNATIVE_WITHHOLDING_STATEMENT_VERIFICATION_CERTIFICATION)
  private Boolean nqiAlternativeWithholdingStatementVerificationCertification;

  public static final String SERIALIZED_NAME_TERRITORY_FINANCIAL_INSTITUTION_CERTIFICATION = "territoryFinancialInstitutionCertification";
  @SerializedName(SERIALIZED_NAME_TERRITORY_FINANCIAL_INSTITUTION_CERTIFICATION)
  private Boolean territoryFinancialInstitutionCertification;

  public static final String SERIALIZED_NAME_TFI_TREATED_AS_US_PERSON_CERTIFICATION = "tfiTreatedAsUsPersonCertification";
  @SerializedName(SERIALIZED_NAME_TFI_TREATED_AS_US_PERSON_CERTIFICATION)
  private Boolean tfiTreatedAsUsPersonCertification;

  public static final String SERIALIZED_NAME_TFI_WITHHOLDING_STATEMENT_TRANSMISSION_CERTIFICATION = "tfiWithholdingStatementTransmissionCertification";
  @SerializedName(SERIALIZED_NAME_TFI_WITHHOLDING_STATEMENT_TRANSMISSION_CERTIFICATION)
  private Boolean tfiWithholdingStatementTransmissionCertification;

  public static final String SERIALIZED_NAME_TFI_TREATED_AS_US_PERSON_FOR_PTP_SALES_CERTIFICATION = "tfiTreatedAsUsPersonForPtpSalesCertification";
  @SerializedName(SERIALIZED_NAME_TFI_TREATED_AS_US_PERSON_FOR_PTP_SALES_CERTIFICATION)
  private Boolean tfiTreatedAsUsPersonForPtpSalesCertification;

  public static final String SERIALIZED_NAME_TFI_NOMINEE_US_PERSON_FOR_PTP_DISTRIBUTIONS_CERTIFICATION = "tfiNomineeUsPersonForPtpDistributionsCertification";
  @SerializedName(SERIALIZED_NAME_TFI_NOMINEE_US_PERSON_FOR_PTP_DISTRIBUTIONS_CERTIFICATION)
  private Boolean tfiNomineeUsPersonForPtpDistributionsCertification;

  public static final String SERIALIZED_NAME_TFI_NOT_NOMINEE_FOR_PTP_DISTRIBUTIONS_CERTIFICATION = "tfiNotNomineeForPtpDistributionsCertification";
  @SerializedName(SERIALIZED_NAME_TFI_NOT_NOMINEE_FOR_PTP_DISTRIBUTIONS_CERTIFICATION)
  private Boolean tfiNotNomineeForPtpDistributionsCertification;

  public static final String SERIALIZED_NAME_US_BRANCH_NON_EFFECTIVELY_CONNECTED_INCOME_CERTIFICATION = "usBranchNonEffectivelyConnectedIncomeCertification";
  @SerializedName(SERIALIZED_NAME_US_BRANCH_NON_EFFECTIVELY_CONNECTED_INCOME_CERTIFICATION)
  private Boolean usBranchNonEffectivelyConnectedIncomeCertification;

  public static final String SERIALIZED_NAME_US_BRANCH_AGREEMENT_TO_BE_TREATED_AS_US_PERSON_CERTIFICATION = "usBranchAgreementToBeTreatedAsUsPersonCertification";
  @SerializedName(SERIALIZED_NAME_US_BRANCH_AGREEMENT_TO_BE_TREATED_AS_US_PERSON_CERTIFICATION)
  private Boolean usBranchAgreementToBeTreatedAsUsPersonCertification;

  public static final String SERIALIZED_NAME_US_BRANCH_WITHHOLDING_STATEMENT_AND_COMPLIANCE_CERTIFICATION = "usBranchWithholdingStatementAndComplianceCertification";
  @SerializedName(SERIALIZED_NAME_US_BRANCH_WITHHOLDING_STATEMENT_AND_COMPLIANCE_CERTIFICATION)
  private Boolean usBranchWithholdingStatementAndComplianceCertification;

  public static final String SERIALIZED_NAME_US_BRANCH_ACTING_AS_US_PERSON_FOR_PTP_SALES_CERTIFICATION = "usBranchActingAsUsPersonForPtpSalesCertification";
  @SerializedName(SERIALIZED_NAME_US_BRANCH_ACTING_AS_US_PERSON_FOR_PTP_SALES_CERTIFICATION)
  private Boolean usBranchActingAsUsPersonForPtpSalesCertification;

  public static final String SERIALIZED_NAME_US_BRANCH_NOMINEE_FOR_PTP_DISTRIBUTIONS_CERTIFICATION = "usBranchNomineeForPtpDistributionsCertification";
  @SerializedName(SERIALIZED_NAME_US_BRANCH_NOMINEE_FOR_PTP_DISTRIBUTIONS_CERTIFICATION)
  private Boolean usBranchNomineeForPtpDistributionsCertification;

  public static final String SERIALIZED_NAME_US_BRANCH_NOT_NOMINEE_FOR_PTP_DISTRIBUTIONS_CERTIFICATION = "usBranchNotNomineeForPtpDistributionsCertification";
  @SerializedName(SERIALIZED_NAME_US_BRANCH_NOT_NOMINEE_FOR_PTP_DISTRIBUTIONS_CERTIFICATION)
  private Boolean usBranchNotNomineeForPtpDistributionsCertification;

  public static final String SERIALIZED_NAME_WITHHOLDING_FOREIGN_PARTNERSHIP_OR_TRUST_CERTIFICATION = "withholdingForeignPartnershipOrTrustCertification";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_FOREIGN_PARTNERSHIP_OR_TRUST_CERTIFICATION)
  private Boolean withholdingForeignPartnershipOrTrustCertification;

  public static final String SERIALIZED_NAME_NONWITHHOLDING_FOREIGN_ENTITY_WITHHOLDING_STATEMENT_CERTIFICATION = "nonwithholdingForeignEntityWithholdingStatementCertification";
  @SerializedName(SERIALIZED_NAME_NONWITHHOLDING_FOREIGN_ENTITY_WITHHOLDING_STATEMENT_CERTIFICATION)
  private Boolean nonwithholdingForeignEntityWithholdingStatementCertification;

  public static final String SERIALIZED_NAME_FOREIGN_ENTITY_PARTNER_IN_LOWER_TIER_PARTNERSHIP_CERTIFICATION = "foreignEntityPartnerInLowerTierPartnershipCertification";
  @SerializedName(SERIALIZED_NAME_FOREIGN_ENTITY_PARTNER_IN_LOWER_TIER_PARTNERSHIP_CERTIFICATION)
  private Boolean foreignEntityPartnerInLowerTierPartnershipCertification;

  public static final String SERIALIZED_NAME_FOREIGN_PARTNERSHIP_AMOUNT_REALIZED_SECTION1446_F_CERTIFICATION = "foreignPartnershipAmountRealizedSection1446FCertification";
  @SerializedName(SERIALIZED_NAME_FOREIGN_PARTNERSHIP_AMOUNT_REALIZED_SECTION1446_F_CERTIFICATION)
  private Boolean foreignPartnershipAmountRealizedSection1446FCertification;

  public static final String SERIALIZED_NAME_FOREIGN_PARTNERSHIP_MODIFIED_AMOUNT_REALIZED_CERTIFICATION = "foreignPartnershipModifiedAmountRealizedCertification";
  @SerializedName(SERIALIZED_NAME_FOREIGN_PARTNERSHIP_MODIFIED_AMOUNT_REALIZED_CERTIFICATION)
  private Boolean foreignPartnershipModifiedAmountRealizedCertification;

  public static final String SERIALIZED_NAME_FOREIGN_GRANTOR_TRUST_AMOUNT_REALIZED_ALLOCATION_CERTIFICATION = "foreignGrantorTrustAmountRealizedAllocationCertification";
  @SerializedName(SERIALIZED_NAME_FOREIGN_GRANTOR_TRUST_AMOUNT_REALIZED_ALLOCATION_CERTIFICATION)
  private Boolean foreignGrantorTrustAmountRealizedAllocationCertification;

  public static final String SERIALIZED_NAME_ALTERNATIVE_WITHHOLDING_STATEMENT_RELIANCE_CERTIFICATION = "alternativeWithholdingStatementRelianceCertification";
  @SerializedName(SERIALIZED_NAME_ALTERNATIVE_WITHHOLDING_STATEMENT_RELIANCE_CERTIFICATION)
  private Boolean alternativeWithholdingStatementRelianceCertification;

  public static final String SERIALIZED_NAME_NP_FFI_WITH_EXEMPT_BENEFICIAL_OWNERS_CERTIFICATION = "npFfiWithExemptBeneficialOwnersCertification";
  @SerializedName(SERIALIZED_NAME_NP_FFI_WITH_EXEMPT_BENEFICIAL_OWNERS_CERTIFICATION)
  private Boolean npFfiWithExemptBeneficialOwnersCertification;

  public static final String SERIALIZED_NAME_FFI_SPONSORING_ENTITY = "ffiSponsoringEntity";
  @SerializedName(SERIALIZED_NAME_FFI_SPONSORING_ENTITY)
  private String ffiSponsoringEntity;

  public static final String SERIALIZED_NAME_INVESTMENT_ENTITY_CERTIFICATION = "investmentEntityCertification";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_ENTITY_CERTIFICATION)
  private Boolean investmentEntityCertification;

  public static final String SERIALIZED_NAME_CONTROLLED_FOREIGN_CORPORATION_CERTIFICATION = "controlledForeignCorporationCertification";
  @SerializedName(SERIALIZED_NAME_CONTROLLED_FOREIGN_CORPORATION_CERTIFICATION)
  private Boolean controlledForeignCorporationCertification;

  public static final String SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_CERTIFICATION = "ownerDocumentedFfiCertification";
  @SerializedName(SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_CERTIFICATION)
  private Boolean ownerDocumentedFfiCertification;

  public static final String SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_REPORTING_STATEMENT_CERTIFICATION = "ownerDocumentedFfiReportingStatementCertification";
  @SerializedName(SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_REPORTING_STATEMENT_CERTIFICATION)
  private Boolean ownerDocumentedFfiReportingStatementCertification;

  public static final String SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_AUDITOR_LETTER_CERTIFICATION = "ownerDocumentedFfiAuditorLetterCertification";
  @SerializedName(SERIALIZED_NAME_OWNER_DOCUMENTED_FFI_AUDITOR_LETTER_CERTIFICATION)
  private Boolean ownerDocumentedFfiAuditorLetterCertification;

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

  public static final String SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_CERTIFICATION = "restrictedDistributorCertification";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_CERTIFICATION)
  private Boolean restrictedDistributorCertification;

  public static final String SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_AGREEMENT_CERTIFICATION = "restrictedDistributorAgreementCertification";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_AGREEMENT_CERTIFICATION)
  private Boolean restrictedDistributorAgreementCertification;

  public static final String SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_PREEXISTING_SALES_COMPLIANCE_CERTIFICATION = "restrictedDistributorPreexistingSalesComplianceCertification";
  @SerializedName(SERIALIZED_NAME_RESTRICTED_DISTRIBUTOR_PREEXISTING_SALES_COMPLIANCE_CERTIFICATION)
  private Boolean restrictedDistributorPreexistingSalesComplianceCertification;

  public static final String SERIALIZED_NAME_FOREIGN_CENTRAL_BANK_OF_ISSUE_CERTIFICATION = "foreignCentralBankOfIssueCertification";
  @SerializedName(SERIALIZED_NAME_FOREIGN_CENTRAL_BANK_OF_ISSUE_CERTIFICATION)
  private Boolean foreignCentralBankOfIssueCertification;

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

  public static final String SERIALIZED_NAME_SPONSORED_DIRECT_REPORTING_NFFE_CERTIFICATION = "sponsoredDirectReportingNffeCertification";
  @SerializedName(SERIALIZED_NAME_SPONSORED_DIRECT_REPORTING_NFFE_CERTIFICATION)
  private Boolean sponsoredDirectReportingNffeCertification;

  public static final String SERIALIZED_NAME_DIRECT_REPORTING_NFFE_SPONSORING_ENTITY = "directReportingNffeSponsoringEntity";
  @SerializedName(SERIALIZED_NAME_DIRECT_REPORTING_NFFE_SPONSORING_ENTITY)
  private String directReportingNffeSponsoringEntity;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT = "eDeliveryConsentedAt";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT)
  private OffsetDateTime eDeliveryConsentedAt;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public W8ImyFormRequest() {
  }

  public W8ImyFormRequest(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  /**
   * The form type (always \&quot;w8imy\&quot; for this model).
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }



  public W8ImyFormRequest name(String name) {
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


  public W8ImyFormRequest citizenshipCountry(String citizenshipCountry) {
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


  public W8ImyFormRequest disregardedEntity(String disregardedEntity) {
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


  public W8ImyFormRequest entityType(String entityType) {
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


  public W8ImyFormRequest fatcaStatus(String fatcaStatus) {
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


  public W8ImyFormRequest residenceAddress(String residenceAddress) {
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


  public W8ImyFormRequest residenceCity(String residenceCity) {
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


  public W8ImyFormRequest residenceState(String residenceState) {
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


  public W8ImyFormRequest residenceZip(String residenceZip) {
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


  public W8ImyFormRequest residenceCountry(String residenceCountry) {
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


  public W8ImyFormRequest residenceIsMailing(Boolean residenceIsMailing) {
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


  public W8ImyFormRequest mailingAddress(String mailingAddress) {
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


  public W8ImyFormRequest mailingCity(String mailingCity) {
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


  public W8ImyFormRequest mailingState(String mailingState) {
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


  public W8ImyFormRequest mailingZip(String mailingZip) {
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


  public W8ImyFormRequest mailingCountry(String mailingCountry) {
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


  public W8ImyFormRequest tinType(String tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * The type of TIN provided.
   * @return tinType
   */
  @javax.annotation.Nullable
  public String getTinType() {
    return tinType;
  }

  public void setTinType(String tinType) {
    this.tinType = tinType;
  }


  public W8ImyFormRequest tin(String tin) {
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


  public W8ImyFormRequest giin(String giin) {
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


  public W8ImyFormRequest foreignTin(String foreignTin) {
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


  public W8ImyFormRequest referenceNumber(String referenceNumber) {
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


  public W8ImyFormRequest disregardedEntityFatcaStatus(String disregardedEntityFatcaStatus) {
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


  public W8ImyFormRequest disregardedAddress(String disregardedAddress) {
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


  public W8ImyFormRequest disregardedCity(String disregardedCity) {
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


  public W8ImyFormRequest disregardedState(String disregardedState) {
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


  public W8ImyFormRequest disregardedZip(String disregardedZip) {
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


  public W8ImyFormRequest disregardedCountry(String disregardedCountry) {
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


  public W8ImyFormRequest disregardedEntityGiin(String disregardedEntityGiin) {
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


  public W8ImyFormRequest qualifiedIntermediaryCertification(Boolean qualifiedIntermediaryCertification) {
    this.qualifiedIntermediaryCertification = qualifiedIntermediaryCertification;
    return this;
  }

  /**
   * Certifies that the entity is a Qualified Intermediary (QI) acting in accordance with its QI Agreement,  providing required withholding statements and documentation for relevant tax withholding purposes.
   * @return qualifiedIntermediaryCertification
   */
  @javax.annotation.Nullable
  public Boolean getQualifiedIntermediaryCertification() {
    return qualifiedIntermediaryCertification;
  }

  public void setQualifiedIntermediaryCertification(Boolean qualifiedIntermediaryCertification) {
    this.qualifiedIntermediaryCertification = qualifiedIntermediaryCertification;
  }


  public W8ImyFormRequest qiPrimaryWithholdingResponsibilityCertification(Boolean qiPrimaryWithholdingResponsibilityCertification) {
    this.qiPrimaryWithholdingResponsibilityCertification = qiPrimaryWithholdingResponsibilityCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Intermediary assumes primary withholding responsibility  under chapters 3 and 4 for the specified accounts.
   * @return qiPrimaryWithholdingResponsibilityCertification
   */
  @javax.annotation.Nullable
  public Boolean getQiPrimaryWithholdingResponsibilityCertification() {
    return qiPrimaryWithholdingResponsibilityCertification;
  }

  public void setQiPrimaryWithholdingResponsibilityCertification(Boolean qiPrimaryWithholdingResponsibilityCertification) {
    this.qiPrimaryWithholdingResponsibilityCertification = qiPrimaryWithholdingResponsibilityCertification;
  }


  public W8ImyFormRequest qiWithholdingResponsibilityForPtpSalesCertification(Boolean qiWithholdingResponsibilityForPtpSalesCertification) {
    this.qiWithholdingResponsibilityForPtpSalesCertification = qiWithholdingResponsibilityForPtpSalesCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Intermediary assumes primary withholding and reporting responsibility under section 1446(f)  for amounts realized from sales of interests in publicly traded partnerships.
   * @return qiWithholdingResponsibilityForPtpSalesCertification
   */
  @javax.annotation.Nullable
  public Boolean getQiWithholdingResponsibilityForPtpSalesCertification() {
    return qiWithholdingResponsibilityForPtpSalesCertification;
  }

  public void setQiWithholdingResponsibilityForPtpSalesCertification(Boolean qiWithholdingResponsibilityForPtpSalesCertification) {
    this.qiWithholdingResponsibilityForPtpSalesCertification = qiWithholdingResponsibilityForPtpSalesCertification;
  }


  public W8ImyFormRequest qiNomineeWithholdingResponsibilityForPtpDistributionsCertification(Boolean qiNomineeWithholdingResponsibilityForPtpDistributionsCertification) {
    this.qiNomineeWithholdingResponsibilityForPtpDistributionsCertification = qiNomineeWithholdingResponsibilityForPtpDistributionsCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Intermediary assumes primary withholding responsibility as a nominee  under Regulations section 1.1446-4(b)(3) for publicly traded partnership distributions.
   * @return qiNomineeWithholdingResponsibilityForPtpDistributionsCertification
   */
  @javax.annotation.Nullable
  public Boolean getQiNomineeWithholdingResponsibilityForPtpDistributionsCertification() {
    return qiNomineeWithholdingResponsibilityForPtpDistributionsCertification;
  }

  public void setQiNomineeWithholdingResponsibilityForPtpDistributionsCertification(Boolean qiNomineeWithholdingResponsibilityForPtpDistributionsCertification) {
    this.qiNomineeWithholdingResponsibilityForPtpDistributionsCertification = qiNomineeWithholdingResponsibilityForPtpDistributionsCertification;
  }


  public W8ImyFormRequest qiSecuritiesLenderSubstituteDividendWithholdingCertification(Boolean qiSecuritiesLenderSubstituteDividendWithholdingCertification) {
    this.qiSecuritiesLenderSubstituteDividendWithholdingCertification = qiSecuritiesLenderSubstituteDividendWithholdingCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Intermediary is acting as a qualified securities lender and assumes primary withholding  and reporting responsibilities for U.S. source substitute dividend payments.
   * @return qiSecuritiesLenderSubstituteDividendWithholdingCertification
   */
  @javax.annotation.Nullable
  public Boolean getQiSecuritiesLenderSubstituteDividendWithholdingCertification() {
    return qiSecuritiesLenderSubstituteDividendWithholdingCertification;
  }

  public void setQiSecuritiesLenderSubstituteDividendWithholdingCertification(Boolean qiSecuritiesLenderSubstituteDividendWithholdingCertification) {
    this.qiSecuritiesLenderSubstituteDividendWithholdingCertification = qiSecuritiesLenderSubstituteDividendWithholdingCertification;
  }


  public W8ImyFormRequest qiWithholdingAnd1099ReportingResponsibilityCertification(Boolean qiWithholdingAnd1099ReportingResponsibilityCertification) {
    this.qiWithholdingAnd1099ReportingResponsibilityCertification = qiWithholdingAnd1099ReportingResponsibilityCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Intermediary assumes primary withholding under chapters 3 and 4, and primary Form 1099 reporting  and backup withholding responsibility for U.S. source interest and substitute interest payments.
   * @return qiWithholdingAnd1099ReportingResponsibilityCertification
   */
  @javax.annotation.Nullable
  public Boolean getQiWithholdingAnd1099ReportingResponsibilityCertification() {
    return qiWithholdingAnd1099ReportingResponsibilityCertification;
  }

  public void setQiWithholdingAnd1099ReportingResponsibilityCertification(Boolean qiWithholdingAnd1099ReportingResponsibilityCertification) {
    this.qiWithholdingAnd1099ReportingResponsibilityCertification = qiWithholdingAnd1099ReportingResponsibilityCertification;
  }


  public W8ImyFormRequest qiForm1099OrFatcaReportingResponsibilityCertification(Boolean qiForm1099OrFatcaReportingResponsibilityCertification) {
    this.qiForm1099OrFatcaReportingResponsibilityCertification = qiForm1099OrFatcaReportingResponsibilityCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Intermediary assumes Form 1099 reporting and backup withholding responsibility,  or FATCA reporting responsibility as a participating or registered deemed-compliant FFI,  for accounts held by specified U.S. persons.
   * @return qiForm1099OrFatcaReportingResponsibilityCertification
   */
  @javax.annotation.Nullable
  public Boolean getQiForm1099OrFatcaReportingResponsibilityCertification() {
    return qiForm1099OrFatcaReportingResponsibilityCertification;
  }

  public void setQiForm1099OrFatcaReportingResponsibilityCertification(Boolean qiForm1099OrFatcaReportingResponsibilityCertification) {
    this.qiForm1099OrFatcaReportingResponsibilityCertification = qiForm1099OrFatcaReportingResponsibilityCertification;
  }


  public W8ImyFormRequest qiOptOutOfForm1099ReportingCertification(Boolean qiOptOutOfForm1099ReportingCertification) {
    this.qiOptOutOfForm1099ReportingCertification = qiOptOutOfForm1099ReportingCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Intermediary does not assume primary Form 1099 reporting  and backup withholding responsibility for the accounts associated with this form.
   * @return qiOptOutOfForm1099ReportingCertification
   */
  @javax.annotation.Nullable
  public Boolean getQiOptOutOfForm1099ReportingCertification() {
    return qiOptOutOfForm1099ReportingCertification;
  }

  public void setQiOptOutOfForm1099ReportingCertification(Boolean qiOptOutOfForm1099ReportingCertification) {
    this.qiOptOutOfForm1099ReportingCertification = qiOptOutOfForm1099ReportingCertification;
  }


  public W8ImyFormRequest qiWithholdingRatePoolCertification(Boolean qiWithholdingRatePoolCertification) {
    this.qiWithholdingRatePoolCertification = qiWithholdingRatePoolCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Intermediary meets the requirements for allocating payments  to a chapter 4 withholding rate pool of U.S. payees under Regulations section 1.6049-4(c)(4)(iii).
   * @return qiWithholdingRatePoolCertification
   */
  @javax.annotation.Nullable
  public Boolean getQiWithholdingRatePoolCertification() {
    return qiWithholdingRatePoolCertification;
  }

  public void setQiWithholdingRatePoolCertification(Boolean qiWithholdingRatePoolCertification) {
    this.qiWithholdingRatePoolCertification = qiWithholdingRatePoolCertification;
  }


  public W8ImyFormRequest qiIntermediaryOrFlowThroughEntityDocumentationCertification(Boolean qiIntermediaryOrFlowThroughEntityDocumentationCertification) {
    this.qiIntermediaryOrFlowThroughEntityDocumentationCertification = qiIntermediaryOrFlowThroughEntityDocumentationCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Intermediary has obtained or will obtain documentation confirming the status of any intermediary  or flow-through entity as a participating FFI, registered deemed-compliant FFI,  or QI for U.S. payees in a chapter 4 withholding rate pool.
   * @return qiIntermediaryOrFlowThroughEntityDocumentationCertification
   */
  @javax.annotation.Nullable
  public Boolean getQiIntermediaryOrFlowThroughEntityDocumentationCertification() {
    return qiIntermediaryOrFlowThroughEntityDocumentationCertification;
  }

  public void setQiIntermediaryOrFlowThroughEntityDocumentationCertification(Boolean qiIntermediaryOrFlowThroughEntityDocumentationCertification) {
    this.qiIntermediaryOrFlowThroughEntityDocumentationCertification = qiIntermediaryOrFlowThroughEntityDocumentationCertification;
  }


  public W8ImyFormRequest qualifiedDerivativesDealerCertification(Boolean qualifiedDerivativesDealerCertification) {
    this.qualifiedDerivativesDealerCertification = qualifiedDerivativesDealerCertification;
    return this;
  }

  /**
   * Certifies that the Qualified Derivatives Dealer (QDD) is approved by the IRS and assumes primary withholding  and reporting responsibilities for payments related to potential section 871(m) transactions.
   * @return qualifiedDerivativesDealerCertification
   */
  @javax.annotation.Nullable
  public Boolean getQualifiedDerivativesDealerCertification() {
    return qualifiedDerivativesDealerCertification;
  }

  public void setQualifiedDerivativesDealerCertification(Boolean qualifiedDerivativesDealerCertification) {
    this.qualifiedDerivativesDealerCertification = qualifiedDerivativesDealerCertification;
  }


  public W8ImyFormRequest qddCorporation(Boolean qddCorporation) {
    this.qddCorporation = qddCorporation;
    return this;
  }

  /**
   * Indicates QDD classification is Corporation.
   * @return qddCorporation
   */
  @javax.annotation.Nullable
  public Boolean getQddCorporation() {
    return qddCorporation;
  }

  public void setQddCorporation(Boolean qddCorporation) {
    this.qddCorporation = qddCorporation;
  }


  public W8ImyFormRequest qddPartnership(Boolean qddPartnership) {
    this.qddPartnership = qddPartnership;
    return this;
  }

  /**
   * Indicates QDD classification is Partnership.
   * @return qddPartnership
   */
  @javax.annotation.Nullable
  public Boolean getQddPartnership() {
    return qddPartnership;
  }

  public void setQddPartnership(Boolean qddPartnership) {
    this.qddPartnership = qddPartnership;
  }


  public W8ImyFormRequest qddDisregardedEntity(Boolean qddDisregardedEntity) {
    this.qddDisregardedEntity = qddDisregardedEntity;
    return this;
  }

  /**
   * Indicates QDD classification is Disregarded Entity.
   * @return qddDisregardedEntity
   */
  @javax.annotation.Nullable
  public Boolean getQddDisregardedEntity() {
    return qddDisregardedEntity;
  }

  public void setQddDisregardedEntity(Boolean qddDisregardedEntity) {
    this.qddDisregardedEntity = qddDisregardedEntity;
  }


  public W8ImyFormRequest nonqualifiedIntermediaryCertification(Boolean nonqualifiedIntermediaryCertification) {
    this.nonqualifiedIntermediaryCertification = nonqualifiedIntermediaryCertification;
    return this;
  }

  /**
   * Certifies that the entity is not acting as a Qualified Intermediary  and is not acting for its own account for the accounts covered by this form.
   * @return nonqualifiedIntermediaryCertification
   */
  @javax.annotation.Nullable
  public Boolean getNonqualifiedIntermediaryCertification() {
    return nonqualifiedIntermediaryCertification;
  }

  public void setNonqualifiedIntermediaryCertification(Boolean nonqualifiedIntermediaryCertification) {
    this.nonqualifiedIntermediaryCertification = nonqualifiedIntermediaryCertification;
  }


  public W8ImyFormRequest nqiWithholdingStatementTransmissionCertification(Boolean nqiWithholdingStatementTransmissionCertification) {
    this.nqiWithholdingStatementTransmissionCertification = nqiWithholdingStatementTransmissionCertification;
    return this;
  }

  /**
   * Certifies that the nonqualified intermediary is submitting this form to transmit withholding certificates  and/or other required documentation along with a withholding statement.
   * @return nqiWithholdingStatementTransmissionCertification
   */
  @javax.annotation.Nullable
  public Boolean getNqiWithholdingStatementTransmissionCertification() {
    return nqiWithholdingStatementTransmissionCertification;
  }

  public void setNqiWithholdingStatementTransmissionCertification(Boolean nqiWithholdingStatementTransmissionCertification) {
    this.nqiWithholdingStatementTransmissionCertification = nqiWithholdingStatementTransmissionCertification;
  }


  public W8ImyFormRequest nqiWithholdingRatePoolComplianceCertification(Boolean nqiWithholdingRatePoolComplianceCertification) {
    this.nqiWithholdingRatePoolComplianceCertification = nqiWithholdingRatePoolComplianceCertification;
    return this;
  }

  /**
   * Certifies that the nonqualified intermediary meets the requirements of Regulations section 1.6049-4(c)(4)(iii)  for U.S. payees included in a withholding rate pool, excluding publicly traded partnership distributions.
   * @return nqiWithholdingRatePoolComplianceCertification
   */
  @javax.annotation.Nullable
  public Boolean getNqiWithholdingRatePoolComplianceCertification() {
    return nqiWithholdingRatePoolComplianceCertification;
  }

  public void setNqiWithholdingRatePoolComplianceCertification(Boolean nqiWithholdingRatePoolComplianceCertification) {
    this.nqiWithholdingRatePoolComplianceCertification = nqiWithholdingRatePoolComplianceCertification;
  }


  public W8ImyFormRequest nqiQualifiedSecuritiesLenderCertification(Boolean nqiQualifiedSecuritiesLenderCertification) {
    this.nqiQualifiedSecuritiesLenderCertification = nqiQualifiedSecuritiesLenderCertification;
    return this;
  }

  /**
   * Certifies that the nonqualified intermediary is acting as a qualified securities lender (not as a QI)  and assumes primary withholding and reporting responsibilities for U.S. source substitute dividend payments.
   * @return nqiQualifiedSecuritiesLenderCertification
   */
  @javax.annotation.Nullable
  public Boolean getNqiQualifiedSecuritiesLenderCertification() {
    return nqiQualifiedSecuritiesLenderCertification;
  }

  public void setNqiQualifiedSecuritiesLenderCertification(Boolean nqiQualifiedSecuritiesLenderCertification) {
    this.nqiQualifiedSecuritiesLenderCertification = nqiQualifiedSecuritiesLenderCertification;
  }


  public W8ImyFormRequest nqiAlternativeWithholdingStatementVerificationCertification(Boolean nqiAlternativeWithholdingStatementVerificationCertification) {
    this.nqiAlternativeWithholdingStatementVerificationCertification = nqiAlternativeWithholdingStatementVerificationCertification;
    return this;
  }

  /**
   * Certifies that the nonqualified intermediary has verified, or will verify,  all information on alternative withholding statements for consistency with account data to determine the correct withholding rate,  as required under sections 1441 or 1471.
   * @return nqiAlternativeWithholdingStatementVerificationCertification
   */
  @javax.annotation.Nullable
  public Boolean getNqiAlternativeWithholdingStatementVerificationCertification() {
    return nqiAlternativeWithholdingStatementVerificationCertification;
  }

  public void setNqiAlternativeWithholdingStatementVerificationCertification(Boolean nqiAlternativeWithholdingStatementVerificationCertification) {
    this.nqiAlternativeWithholdingStatementVerificationCertification = nqiAlternativeWithholdingStatementVerificationCertification;
  }


  public W8ImyFormRequest territoryFinancialInstitutionCertification(Boolean territoryFinancialInstitutionCertification) {
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


  public W8ImyFormRequest tfiTreatedAsUsPersonCertification(Boolean tfiTreatedAsUsPersonCertification) {
    this.tfiTreatedAsUsPersonCertification = tfiTreatedAsUsPersonCertification;
    return this;
  }

  /**
   * Certifies that the territory financial institution agrees to be treated as a U.S. person  for chapters 3 and 4 purposes concerning reportable amounts and withholdable payments.
   * @return tfiTreatedAsUsPersonCertification
   */
  @javax.annotation.Nullable
  public Boolean getTfiTreatedAsUsPersonCertification() {
    return tfiTreatedAsUsPersonCertification;
  }

  public void setTfiTreatedAsUsPersonCertification(Boolean tfiTreatedAsUsPersonCertification) {
    this.tfiTreatedAsUsPersonCertification = tfiTreatedAsUsPersonCertification;
  }


  public W8ImyFormRequest tfiWithholdingStatementTransmissionCertification(Boolean tfiWithholdingStatementTransmissionCertification) {
    this.tfiWithholdingStatementTransmissionCertification = tfiWithholdingStatementTransmissionCertification;
    return this;
  }

  /**
   * Certifies that the territory financial institution is transmitting withholding certificates or other required documentation  and has provided or will provide a withholding statement for reportable or withholdable payments.
   * @return tfiWithholdingStatementTransmissionCertification
   */
  @javax.annotation.Nullable
  public Boolean getTfiWithholdingStatementTransmissionCertification() {
    return tfiWithholdingStatementTransmissionCertification;
  }

  public void setTfiWithholdingStatementTransmissionCertification(Boolean tfiWithholdingStatementTransmissionCertification) {
    this.tfiWithholdingStatementTransmissionCertification = tfiWithholdingStatementTransmissionCertification;
  }


  public W8ImyFormRequest tfiTreatedAsUsPersonForPtpSalesCertification(Boolean tfiTreatedAsUsPersonForPtpSalesCertification) {
    this.tfiTreatedAsUsPersonForPtpSalesCertification = tfiTreatedAsUsPersonForPtpSalesCertification;
    return this;
  }

  /**
   * Certifies that the territory financial institution agrees to be treated as a U.S. person  under Regulations section 1.1446(f)-4(a)(2)(i)(B) for amounts realized from sales of publicly traded partnership interests.
   * @return tfiTreatedAsUsPersonForPtpSalesCertification
   */
  @javax.annotation.Nullable
  public Boolean getTfiTreatedAsUsPersonForPtpSalesCertification() {
    return tfiTreatedAsUsPersonForPtpSalesCertification;
  }

  public void setTfiTreatedAsUsPersonForPtpSalesCertification(Boolean tfiTreatedAsUsPersonForPtpSalesCertification) {
    this.tfiTreatedAsUsPersonForPtpSalesCertification = tfiTreatedAsUsPersonForPtpSalesCertification;
  }


  public W8ImyFormRequest tfiNomineeUsPersonForPtpDistributionsCertification(Boolean tfiNomineeUsPersonForPtpDistributionsCertification) {
    this.tfiNomineeUsPersonForPtpDistributionsCertification = tfiNomineeUsPersonForPtpDistributionsCertification;
    return this;
  }

  /**
   * Certifies that the territory financial institution agrees to be treated as a U.S. person  and as a nominee for purposes of publicly traded partnership distributions under the applicable regulations.
   * @return tfiNomineeUsPersonForPtpDistributionsCertification
   */
  @javax.annotation.Nullable
  public Boolean getTfiNomineeUsPersonForPtpDistributionsCertification() {
    return tfiNomineeUsPersonForPtpDistributionsCertification;
  }

  public void setTfiNomineeUsPersonForPtpDistributionsCertification(Boolean tfiNomineeUsPersonForPtpDistributionsCertification) {
    this.tfiNomineeUsPersonForPtpDistributionsCertification = tfiNomineeUsPersonForPtpDistributionsCertification;
  }


  public W8ImyFormRequest tfiNotNomineeForPtpDistributionsCertification(Boolean tfiNotNomineeForPtpDistributionsCertification) {
    this.tfiNotNomineeForPtpDistributionsCertification = tfiNotNomineeForPtpDistributionsCertification;
    return this;
  }

  /**
   * Certifies that the territory financial institution is not acting as a nominee for publicly traded partnership distributions  and is providing withholding statements for those distributions.
   * @return tfiNotNomineeForPtpDistributionsCertification
   */
  @javax.annotation.Nullable
  public Boolean getTfiNotNomineeForPtpDistributionsCertification() {
    return tfiNotNomineeForPtpDistributionsCertification;
  }

  public void setTfiNotNomineeForPtpDistributionsCertification(Boolean tfiNotNomineeForPtpDistributionsCertification) {
    this.tfiNotNomineeForPtpDistributionsCertification = tfiNotNomineeForPtpDistributionsCertification;
  }


  public W8ImyFormRequest usBranchNonEffectivelyConnectedIncomeCertification(Boolean usBranchNonEffectivelyConnectedIncomeCertification) {
    this.usBranchNonEffectivelyConnectedIncomeCertification = usBranchNonEffectivelyConnectedIncomeCertification;
    return this;
  }

  /**
   * Certifies that the U.S. branch is receiving reportable or withholdable payments  that are not effectively connected income, PTP distributions, or proceeds from PTP sales.
   * @return usBranchNonEffectivelyConnectedIncomeCertification
   */
  @javax.annotation.Nullable
  public Boolean getUsBranchNonEffectivelyConnectedIncomeCertification() {
    return usBranchNonEffectivelyConnectedIncomeCertification;
  }

  public void setUsBranchNonEffectivelyConnectedIncomeCertification(Boolean usBranchNonEffectivelyConnectedIncomeCertification) {
    this.usBranchNonEffectivelyConnectedIncomeCertification = usBranchNonEffectivelyConnectedIncomeCertification;
  }


  public W8ImyFormRequest usBranchAgreementToBeTreatedAsUsPersonCertification(Boolean usBranchAgreementToBeTreatedAsUsPersonCertification) {
    this.usBranchAgreementToBeTreatedAsUsPersonCertification = usBranchAgreementToBeTreatedAsUsPersonCertification;
    return this;
  }

  /**
   * Certifies that the U.S. branch of a foreign bank or insurance company agrees to be treated as a U.S. person  for reportable amounts or withholdable payments under the applicable regulations.
   * @return usBranchAgreementToBeTreatedAsUsPersonCertification
   */
  @javax.annotation.Nullable
  public Boolean getUsBranchAgreementToBeTreatedAsUsPersonCertification() {
    return usBranchAgreementToBeTreatedAsUsPersonCertification;
  }

  public void setUsBranchAgreementToBeTreatedAsUsPersonCertification(Boolean usBranchAgreementToBeTreatedAsUsPersonCertification) {
    this.usBranchAgreementToBeTreatedAsUsPersonCertification = usBranchAgreementToBeTreatedAsUsPersonCertification;
  }


  public W8ImyFormRequest usBranchWithholdingStatementAndComplianceCertification(Boolean usBranchWithholdingStatementAndComplianceCertification) {
    this.usBranchWithholdingStatementAndComplianceCertification = usBranchWithholdingStatementAndComplianceCertification;
    return this;
  }

  /**
   * Certifies that the U.S. branch is transmitting required documentation  and withholding statements for reportable or withholdable payments and is applying the appropriate FATCA regulations.
   * @return usBranchWithholdingStatementAndComplianceCertification
   */
  @javax.annotation.Nullable
  public Boolean getUsBranchWithholdingStatementAndComplianceCertification() {
    return usBranchWithholdingStatementAndComplianceCertification;
  }

  public void setUsBranchWithholdingStatementAndComplianceCertification(Boolean usBranchWithholdingStatementAndComplianceCertification) {
    this.usBranchWithholdingStatementAndComplianceCertification = usBranchWithholdingStatementAndComplianceCertification;
  }


  public W8ImyFormRequest usBranchActingAsUsPersonForPtpSalesCertification(Boolean usBranchActingAsUsPersonForPtpSalesCertification) {
    this.usBranchActingAsUsPersonForPtpSalesCertification = usBranchActingAsUsPersonForPtpSalesCertification;
    return this;
  }

  /**
   * Certifies that the U.S. branch is acting as a U.S. person  for purposes of amounts realized from sales of publicly traded partnership interests under the applicable regulations.
   * @return usBranchActingAsUsPersonForPtpSalesCertification
   */
  @javax.annotation.Nullable
  public Boolean getUsBranchActingAsUsPersonForPtpSalesCertification() {
    return usBranchActingAsUsPersonForPtpSalesCertification;
  }

  public void setUsBranchActingAsUsPersonForPtpSalesCertification(Boolean usBranchActingAsUsPersonForPtpSalesCertification) {
    this.usBranchActingAsUsPersonForPtpSalesCertification = usBranchActingAsUsPersonForPtpSalesCertification;
  }


  public W8ImyFormRequest usBranchNomineeForPtpDistributionsCertification(Boolean usBranchNomineeForPtpDistributionsCertification) {
    this.usBranchNomineeForPtpDistributionsCertification = usBranchNomineeForPtpDistributionsCertification;
    return this;
  }

  /**
   * Certifies that the U.S. branch is treated as a U.S. person  and as a nominee for publicly traded partnership distributions under the applicable regulations.
   * @return usBranchNomineeForPtpDistributionsCertification
   */
  @javax.annotation.Nullable
  public Boolean getUsBranchNomineeForPtpDistributionsCertification() {
    return usBranchNomineeForPtpDistributionsCertification;
  }

  public void setUsBranchNomineeForPtpDistributionsCertification(Boolean usBranchNomineeForPtpDistributionsCertification) {
    this.usBranchNomineeForPtpDistributionsCertification = usBranchNomineeForPtpDistributionsCertification;
  }


  public W8ImyFormRequest usBranchNotNomineeForPtpDistributionsCertification(Boolean usBranchNotNomineeForPtpDistributionsCertification) {
    this.usBranchNotNomineeForPtpDistributionsCertification = usBranchNotNomineeForPtpDistributionsCertification;
    return this;
  }

  /**
   * Certifies that the U.S. branch is not acting as a nominee for publicly traded partnership distributions  and is providing the required withholding statements.
   * @return usBranchNotNomineeForPtpDistributionsCertification
   */
  @javax.annotation.Nullable
  public Boolean getUsBranchNotNomineeForPtpDistributionsCertification() {
    return usBranchNotNomineeForPtpDistributionsCertification;
  }

  public void setUsBranchNotNomineeForPtpDistributionsCertification(Boolean usBranchNotNomineeForPtpDistributionsCertification) {
    this.usBranchNotNomineeForPtpDistributionsCertification = usBranchNotNomineeForPtpDistributionsCertification;
  }


  public W8ImyFormRequest withholdingForeignPartnershipOrTrustCertification(Boolean withholdingForeignPartnershipOrTrustCertification) {
    this.withholdingForeignPartnershipOrTrustCertification = withholdingForeignPartnershipOrTrustCertification;
    return this;
  }

  /**
   * Certifies that the entity is a withholding foreign partnership (WP) or a withholding foreign trust (WT)  that is compliant with the terms of its WP or WT agreement.
   * @return withholdingForeignPartnershipOrTrustCertification
   */
  @javax.annotation.Nullable
  public Boolean getWithholdingForeignPartnershipOrTrustCertification() {
    return withholdingForeignPartnershipOrTrustCertification;
  }

  public void setWithholdingForeignPartnershipOrTrustCertification(Boolean withholdingForeignPartnershipOrTrustCertification) {
    this.withholdingForeignPartnershipOrTrustCertification = withholdingForeignPartnershipOrTrustCertification;
  }


  public W8ImyFormRequest nonwithholdingForeignEntityWithholdingStatementCertification(Boolean nonwithholdingForeignEntityWithholdingStatementCertification) {
    this.nonwithholdingForeignEntityWithholdingStatementCertification = nonwithholdingForeignEntityWithholdingStatementCertification;
    return this;
  }

  /**
   * Certifies that the entity is a nonwithholding foreign partnership or trust,  providing the form for non-effectively connected payments and transmitting required withholding documentation for chapters 3 and 4.
   * @return nonwithholdingForeignEntityWithholdingStatementCertification
   */
  @javax.annotation.Nullable
  public Boolean getNonwithholdingForeignEntityWithholdingStatementCertification() {
    return nonwithholdingForeignEntityWithholdingStatementCertification;
  }

  public void setNonwithholdingForeignEntityWithholdingStatementCertification(Boolean nonwithholdingForeignEntityWithholdingStatementCertification) {
    this.nonwithholdingForeignEntityWithholdingStatementCertification = nonwithholdingForeignEntityWithholdingStatementCertification;
  }


  public W8ImyFormRequest foreignEntityPartnerInLowerTierPartnershipCertification(Boolean foreignEntityPartnerInLowerTierPartnershipCertification) {
    this.foreignEntityPartnerInLowerTierPartnershipCertification = foreignEntityPartnerInLowerTierPartnershipCertification;
    return this;
  }

  /**
   * Certifies that the entity is a foreign partnership or grantor trust acting as a partner in a lower-tier partnership  and is submitting the form for purposes of section 1446(a).
   * @return foreignEntityPartnerInLowerTierPartnershipCertification
   */
  @javax.annotation.Nullable
  public Boolean getForeignEntityPartnerInLowerTierPartnershipCertification() {
    return foreignEntityPartnerInLowerTierPartnershipCertification;
  }

  public void setForeignEntityPartnerInLowerTierPartnershipCertification(Boolean foreignEntityPartnerInLowerTierPartnershipCertification) {
    this.foreignEntityPartnerInLowerTierPartnershipCertification = foreignEntityPartnerInLowerTierPartnershipCertification;
  }


  public W8ImyFormRequest foreignPartnershipAmountRealizedSection1446FCertification(Boolean foreignPartnershipAmountRealizedSection1446FCertification) {
    this.foreignPartnershipAmountRealizedSection1446FCertification = foreignPartnershipAmountRealizedSection1446FCertification;
    return this;
  }

  /**
   * Certifies that the entity is a foreign partnership receiving an amount realized  from the transfer of a partnership interest for purposes of section 1446(f).
   * @return foreignPartnershipAmountRealizedSection1446FCertification
   */
  @javax.annotation.Nullable
  public Boolean getForeignPartnershipAmountRealizedSection1446FCertification() {
    return foreignPartnershipAmountRealizedSection1446FCertification;
  }

  public void setForeignPartnershipAmountRealizedSection1446FCertification(Boolean foreignPartnershipAmountRealizedSection1446FCertification) {
    this.foreignPartnershipAmountRealizedSection1446FCertification = foreignPartnershipAmountRealizedSection1446FCertification;
  }


  public W8ImyFormRequest foreignPartnershipModifiedAmountRealizedCertification(Boolean foreignPartnershipModifiedAmountRealizedCertification) {
    this.foreignPartnershipModifiedAmountRealizedCertification = foreignPartnershipModifiedAmountRealizedCertification;
    return this;
  }

  /**
   * Certifies that the foreign partnership is providing a withholding statement for a modified amount realized  from the transfer of a partnership interest, when applicable.
   * @return foreignPartnershipModifiedAmountRealizedCertification
   */
  @javax.annotation.Nullable
  public Boolean getForeignPartnershipModifiedAmountRealizedCertification() {
    return foreignPartnershipModifiedAmountRealizedCertification;
  }

  public void setForeignPartnershipModifiedAmountRealizedCertification(Boolean foreignPartnershipModifiedAmountRealizedCertification) {
    this.foreignPartnershipModifiedAmountRealizedCertification = foreignPartnershipModifiedAmountRealizedCertification;
  }


  public W8ImyFormRequest foreignGrantorTrustAmountRealizedAllocationCertification(Boolean foreignGrantorTrustAmountRealizedAllocationCertification) {
    this.foreignGrantorTrustAmountRealizedAllocationCertification = foreignGrantorTrustAmountRealizedAllocationCertification;
    return this;
  }

  /**
   * Certifies that the foreign grantor trust is submitting the form on behalf of each grantor or owner  and providing a withholding statement to allocate the amount realized in accordance with the regulations.
   * @return foreignGrantorTrustAmountRealizedAllocationCertification
   */
  @javax.annotation.Nullable
  public Boolean getForeignGrantorTrustAmountRealizedAllocationCertification() {
    return foreignGrantorTrustAmountRealizedAllocationCertification;
  }

  public void setForeignGrantorTrustAmountRealizedAllocationCertification(Boolean foreignGrantorTrustAmountRealizedAllocationCertification) {
    this.foreignGrantorTrustAmountRealizedAllocationCertification = foreignGrantorTrustAmountRealizedAllocationCertification;
  }


  public W8ImyFormRequest alternativeWithholdingStatementRelianceCertification(Boolean alternativeWithholdingStatementRelianceCertification) {
    this.alternativeWithholdingStatementRelianceCertification = alternativeWithholdingStatementRelianceCertification;
    return this;
  }

  /**
   * Certifies that the entity may rely on the information in all associated withholding certificates  under the applicable standards of knowledge in sections 1441 or 1471 when providing an alternative withholding statement.
   * @return alternativeWithholdingStatementRelianceCertification
   */
  @javax.annotation.Nullable
  public Boolean getAlternativeWithholdingStatementRelianceCertification() {
    return alternativeWithholdingStatementRelianceCertification;
  }

  public void setAlternativeWithholdingStatementRelianceCertification(Boolean alternativeWithholdingStatementRelianceCertification) {
    this.alternativeWithholdingStatementRelianceCertification = alternativeWithholdingStatementRelianceCertification;
  }


  public W8ImyFormRequest npFfiWithExemptBeneficialOwnersCertification(Boolean npFfiWithExemptBeneficialOwnersCertification) {
    this.npFfiWithExemptBeneficialOwnersCertification = npFfiWithExemptBeneficialOwnersCertification;
    return this;
  }

  /**
   * Certifies that the nonparticipating FFI is transmitting withholding documentation  and providing a statement allocating payment portions to exempt beneficial owners.
   * @return npFfiWithExemptBeneficialOwnersCertification
   */
  @javax.annotation.Nullable
  public Boolean getNpFfiWithExemptBeneficialOwnersCertification() {
    return npFfiWithExemptBeneficialOwnersCertification;
  }

  public void setNpFfiWithExemptBeneficialOwnersCertification(Boolean npFfiWithExemptBeneficialOwnersCertification) {
    this.npFfiWithExemptBeneficialOwnersCertification = npFfiWithExemptBeneficialOwnersCertification;
  }


  public W8ImyFormRequest ffiSponsoringEntity(String ffiSponsoringEntity) {
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


  public W8ImyFormRequest investmentEntityCertification(Boolean investmentEntityCertification) {
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


  public W8ImyFormRequest controlledForeignCorporationCertification(Boolean controlledForeignCorporationCertification) {
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


  public W8ImyFormRequest ownerDocumentedFfiCertification(Boolean ownerDocumentedFfiCertification) {
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


  public W8ImyFormRequest ownerDocumentedFfiReportingStatementCertification(Boolean ownerDocumentedFfiReportingStatementCertification) {
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


  public W8ImyFormRequest ownerDocumentedFfiAuditorLetterCertification(Boolean ownerDocumentedFfiAuditorLetterCertification) {
    this.ownerDocumentedFfiAuditorLetterCertification = ownerDocumentedFfiAuditorLetterCertification;
    return this;
  }

  /**
   * Certifies that the FFI has provided or will provide an auditor’s letter and required owner documentation,  including a reporting statement and Form W-9s, to meet owner-documented FFI requirements under the regulations.
   * @return ownerDocumentedFfiAuditorLetterCertification
   */
  @javax.annotation.Nullable
  public Boolean getOwnerDocumentedFfiAuditorLetterCertification() {
    return ownerDocumentedFfiAuditorLetterCertification;
  }

  public void setOwnerDocumentedFfiAuditorLetterCertification(Boolean ownerDocumentedFfiAuditorLetterCertification) {
    this.ownerDocumentedFfiAuditorLetterCertification = ownerDocumentedFfiAuditorLetterCertification;
  }


  public W8ImyFormRequest compliantNonregisteringLocalBankCertification(Boolean compliantNonregisteringLocalBankCertification) {
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


  public W8ImyFormRequest compliantFfiLowValueAccountsCertification(Boolean compliantFfiLowValueAccountsCertification) {
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


  public W8ImyFormRequest sponsoredCloselyHeldEntitySponsoringEntity(String sponsoredCloselyHeldEntitySponsoringEntity) {
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


  public W8ImyFormRequest sponsoredCloselyHeldInvestmentVehicleCertification(Boolean sponsoredCloselyHeldInvestmentVehicleCertification) {
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


  public W8ImyFormRequest compliantLimitedLifeDebtEntityCertification(Boolean compliantLimitedLifeDebtEntityCertification) {
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


  public W8ImyFormRequest investmentEntityNoFinancialAccountsCertification(Boolean investmentEntityNoFinancialAccountsCertification) {
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


  public W8ImyFormRequest restrictedDistributorCertification(Boolean restrictedDistributorCertification) {
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


  public W8ImyFormRequest restrictedDistributorAgreementCertification(Boolean restrictedDistributorAgreementCertification) {
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


  public W8ImyFormRequest restrictedDistributorPreexistingSalesComplianceCertification(Boolean restrictedDistributorPreexistingSalesComplianceCertification) {
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


  public W8ImyFormRequest foreignCentralBankOfIssueCertification(Boolean foreignCentralBankOfIssueCertification) {
    this.foreignCentralBankOfIssueCertification = foreignCentralBankOfIssueCertification;
    return this;
  }

  /**
   * Certifies that the entity is treated as the beneficial owner of the payment solely  for purposes of chapter 4 under Regulations section 1.1471-6(d)(4).
   * @return foreignCentralBankOfIssueCertification
   */
  @javax.annotation.Nullable
  public Boolean getForeignCentralBankOfIssueCertification() {
    return foreignCentralBankOfIssueCertification;
  }

  public void setForeignCentralBankOfIssueCertification(Boolean foreignCentralBankOfIssueCertification) {
    this.foreignCentralBankOfIssueCertification = foreignCentralBankOfIssueCertification;
  }


  public W8ImyFormRequest nonreportingIgaFfiCertification(Boolean nonreportingIgaFfiCertification) {
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


  public W8ImyFormRequest igaCountry(String igaCountry) {
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


  public W8ImyFormRequest igaModel(String igaModel) {
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


  public W8ImyFormRequest igaLegalStatusTreatment(String igaLegalStatusTreatment) {
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


  public W8ImyFormRequest igaFfiTrusteeOrSponsor(String igaFfiTrusteeOrSponsor) {
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


  public W8ImyFormRequest igaFfiTrusteeIsForeign(Boolean igaFfiTrusteeIsForeign) {
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


  public W8ImyFormRequest treatyQualifiedPensionFundCertification(Boolean treatyQualifiedPensionFundCertification) {
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


  public W8ImyFormRequest qualifiedRetirementFundCertification(Boolean qualifiedRetirementFundCertification) {
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


  public W8ImyFormRequest narrowParticipationRetirementFundCertification(Boolean narrowParticipationRetirementFundCertification) {
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


  public W8ImyFormRequest section401AEquivalentPensionPlanCertification(Boolean section401AEquivalentPensionPlanCertification) {
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


  public W8ImyFormRequest investmentEntityForRetirementFundsCertification(Boolean investmentEntityForRetirementFundsCertification) {
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


  public W8ImyFormRequest exemptBeneficialOwnerSponsoredRetirementFundCertification(Boolean exemptBeneficialOwnerSponsoredRetirementFundCertification) {
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


  public W8ImyFormRequest exceptedNonfinancialGroupEntityCertification(Boolean exceptedNonfinancialGroupEntityCertification) {
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


  public W8ImyFormRequest exceptedNonfinancialStartUpCertification(Boolean exceptedNonfinancialStartUpCertification) {
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


  public W8ImyFormRequest startupFormationOrResolutionDate(LocalDate startupFormationOrResolutionDate) {
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


  public W8ImyFormRequest exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification(Boolean exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification) {
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


  public W8ImyFormRequest nonfinancialEntityFilingDate(LocalDate nonfinancialEntityFilingDate) {
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


  public W8ImyFormRequest publiclyTradedNffeCertification(Boolean publiclyTradedNffeCertification) {
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


  public W8ImyFormRequest publiclyTradedNffeSecuritiesMarket(String publiclyTradedNffeSecuritiesMarket) {
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


  public W8ImyFormRequest nffeAffiliateOfPubliclyTradedEntityCertification(Boolean nffeAffiliateOfPubliclyTradedEntityCertification) {
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


  public W8ImyFormRequest publiclyTradedEntity(String publiclyTradedEntity) {
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


  public W8ImyFormRequest nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket(String nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket) {
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


  public W8ImyFormRequest exceptedTerritoryNffeCertification(Boolean exceptedTerritoryNffeCertification) {
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


  public W8ImyFormRequest activeNffeCertification(Boolean activeNffeCertification) {
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


  public W8ImyFormRequest passiveNffeCertification(Boolean passiveNffeCertification) {
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


  public W8ImyFormRequest sponsoredDirectReportingNffeCertification(Boolean sponsoredDirectReportingNffeCertification) {
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


  public W8ImyFormRequest directReportingNffeSponsoringEntity(String directReportingNffeSponsoringEntity) {
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


  public W8ImyFormRequest signerName(String signerName) {
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


  public W8ImyFormRequest eDeliveryConsentedAt(OffsetDateTime eDeliveryConsentedAt) {
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


  public W8ImyFormRequest signature(String signature) {
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


  public W8ImyFormRequest companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The ID of the associated company.
   * @return companyId
   */
  @javax.annotation.Nonnull
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public W8ImyFormRequest referenceId(String referenceId) {
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


  public W8ImyFormRequest email(String email) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W8ImyFormRequest w8ImyFormRequest = (W8ImyFormRequest) o;
    return Objects.equals(this.type, w8ImyFormRequest.type) &&
        Objects.equals(this.name, w8ImyFormRequest.name) &&
        Objects.equals(this.citizenshipCountry, w8ImyFormRequest.citizenshipCountry) &&
        Objects.equals(this.disregardedEntity, w8ImyFormRequest.disregardedEntity) &&
        Objects.equals(this.entityType, w8ImyFormRequest.entityType) &&
        Objects.equals(this.fatcaStatus, w8ImyFormRequest.fatcaStatus) &&
        Objects.equals(this.residenceAddress, w8ImyFormRequest.residenceAddress) &&
        Objects.equals(this.residenceCity, w8ImyFormRequest.residenceCity) &&
        Objects.equals(this.residenceState, w8ImyFormRequest.residenceState) &&
        Objects.equals(this.residenceZip, w8ImyFormRequest.residenceZip) &&
        Objects.equals(this.residenceCountry, w8ImyFormRequest.residenceCountry) &&
        Objects.equals(this.residenceIsMailing, w8ImyFormRequest.residenceIsMailing) &&
        Objects.equals(this.mailingAddress, w8ImyFormRequest.mailingAddress) &&
        Objects.equals(this.mailingCity, w8ImyFormRequest.mailingCity) &&
        Objects.equals(this.mailingState, w8ImyFormRequest.mailingState) &&
        Objects.equals(this.mailingZip, w8ImyFormRequest.mailingZip) &&
        Objects.equals(this.mailingCountry, w8ImyFormRequest.mailingCountry) &&
        Objects.equals(this.tinType, w8ImyFormRequest.tinType) &&
        Objects.equals(this.tin, w8ImyFormRequest.tin) &&
        Objects.equals(this.giin, w8ImyFormRequest.giin) &&
        Objects.equals(this.foreignTin, w8ImyFormRequest.foreignTin) &&
        Objects.equals(this.referenceNumber, w8ImyFormRequest.referenceNumber) &&
        Objects.equals(this.disregardedEntityFatcaStatus, w8ImyFormRequest.disregardedEntityFatcaStatus) &&
        Objects.equals(this.disregardedAddress, w8ImyFormRequest.disregardedAddress) &&
        Objects.equals(this.disregardedCity, w8ImyFormRequest.disregardedCity) &&
        Objects.equals(this.disregardedState, w8ImyFormRequest.disregardedState) &&
        Objects.equals(this.disregardedZip, w8ImyFormRequest.disregardedZip) &&
        Objects.equals(this.disregardedCountry, w8ImyFormRequest.disregardedCountry) &&
        Objects.equals(this.disregardedEntityGiin, w8ImyFormRequest.disregardedEntityGiin) &&
        Objects.equals(this.qualifiedIntermediaryCertification, w8ImyFormRequest.qualifiedIntermediaryCertification) &&
        Objects.equals(this.qiPrimaryWithholdingResponsibilityCertification, w8ImyFormRequest.qiPrimaryWithholdingResponsibilityCertification) &&
        Objects.equals(this.qiWithholdingResponsibilityForPtpSalesCertification, w8ImyFormRequest.qiWithholdingResponsibilityForPtpSalesCertification) &&
        Objects.equals(this.qiNomineeWithholdingResponsibilityForPtpDistributionsCertification, w8ImyFormRequest.qiNomineeWithholdingResponsibilityForPtpDistributionsCertification) &&
        Objects.equals(this.qiSecuritiesLenderSubstituteDividendWithholdingCertification, w8ImyFormRequest.qiSecuritiesLenderSubstituteDividendWithholdingCertification) &&
        Objects.equals(this.qiWithholdingAnd1099ReportingResponsibilityCertification, w8ImyFormRequest.qiWithholdingAnd1099ReportingResponsibilityCertification) &&
        Objects.equals(this.qiForm1099OrFatcaReportingResponsibilityCertification, w8ImyFormRequest.qiForm1099OrFatcaReportingResponsibilityCertification) &&
        Objects.equals(this.qiOptOutOfForm1099ReportingCertification, w8ImyFormRequest.qiOptOutOfForm1099ReportingCertification) &&
        Objects.equals(this.qiWithholdingRatePoolCertification, w8ImyFormRequest.qiWithholdingRatePoolCertification) &&
        Objects.equals(this.qiIntermediaryOrFlowThroughEntityDocumentationCertification, w8ImyFormRequest.qiIntermediaryOrFlowThroughEntityDocumentationCertification) &&
        Objects.equals(this.qualifiedDerivativesDealerCertification, w8ImyFormRequest.qualifiedDerivativesDealerCertification) &&
        Objects.equals(this.qddCorporation, w8ImyFormRequest.qddCorporation) &&
        Objects.equals(this.qddPartnership, w8ImyFormRequest.qddPartnership) &&
        Objects.equals(this.qddDisregardedEntity, w8ImyFormRequest.qddDisregardedEntity) &&
        Objects.equals(this.nonqualifiedIntermediaryCertification, w8ImyFormRequest.nonqualifiedIntermediaryCertification) &&
        Objects.equals(this.nqiWithholdingStatementTransmissionCertification, w8ImyFormRequest.nqiWithholdingStatementTransmissionCertification) &&
        Objects.equals(this.nqiWithholdingRatePoolComplianceCertification, w8ImyFormRequest.nqiWithholdingRatePoolComplianceCertification) &&
        Objects.equals(this.nqiQualifiedSecuritiesLenderCertification, w8ImyFormRequest.nqiQualifiedSecuritiesLenderCertification) &&
        Objects.equals(this.nqiAlternativeWithholdingStatementVerificationCertification, w8ImyFormRequest.nqiAlternativeWithholdingStatementVerificationCertification) &&
        Objects.equals(this.territoryFinancialInstitutionCertification, w8ImyFormRequest.territoryFinancialInstitutionCertification) &&
        Objects.equals(this.tfiTreatedAsUsPersonCertification, w8ImyFormRequest.tfiTreatedAsUsPersonCertification) &&
        Objects.equals(this.tfiWithholdingStatementTransmissionCertification, w8ImyFormRequest.tfiWithholdingStatementTransmissionCertification) &&
        Objects.equals(this.tfiTreatedAsUsPersonForPtpSalesCertification, w8ImyFormRequest.tfiTreatedAsUsPersonForPtpSalesCertification) &&
        Objects.equals(this.tfiNomineeUsPersonForPtpDistributionsCertification, w8ImyFormRequest.tfiNomineeUsPersonForPtpDistributionsCertification) &&
        Objects.equals(this.tfiNotNomineeForPtpDistributionsCertification, w8ImyFormRequest.tfiNotNomineeForPtpDistributionsCertification) &&
        Objects.equals(this.usBranchNonEffectivelyConnectedIncomeCertification, w8ImyFormRequest.usBranchNonEffectivelyConnectedIncomeCertification) &&
        Objects.equals(this.usBranchAgreementToBeTreatedAsUsPersonCertification, w8ImyFormRequest.usBranchAgreementToBeTreatedAsUsPersonCertification) &&
        Objects.equals(this.usBranchWithholdingStatementAndComplianceCertification, w8ImyFormRequest.usBranchWithholdingStatementAndComplianceCertification) &&
        Objects.equals(this.usBranchActingAsUsPersonForPtpSalesCertification, w8ImyFormRequest.usBranchActingAsUsPersonForPtpSalesCertification) &&
        Objects.equals(this.usBranchNomineeForPtpDistributionsCertification, w8ImyFormRequest.usBranchNomineeForPtpDistributionsCertification) &&
        Objects.equals(this.usBranchNotNomineeForPtpDistributionsCertification, w8ImyFormRequest.usBranchNotNomineeForPtpDistributionsCertification) &&
        Objects.equals(this.withholdingForeignPartnershipOrTrustCertification, w8ImyFormRequest.withholdingForeignPartnershipOrTrustCertification) &&
        Objects.equals(this.nonwithholdingForeignEntityWithholdingStatementCertification, w8ImyFormRequest.nonwithholdingForeignEntityWithholdingStatementCertification) &&
        Objects.equals(this.foreignEntityPartnerInLowerTierPartnershipCertification, w8ImyFormRequest.foreignEntityPartnerInLowerTierPartnershipCertification) &&
        Objects.equals(this.foreignPartnershipAmountRealizedSection1446FCertification, w8ImyFormRequest.foreignPartnershipAmountRealizedSection1446FCertification) &&
        Objects.equals(this.foreignPartnershipModifiedAmountRealizedCertification, w8ImyFormRequest.foreignPartnershipModifiedAmountRealizedCertification) &&
        Objects.equals(this.foreignGrantorTrustAmountRealizedAllocationCertification, w8ImyFormRequest.foreignGrantorTrustAmountRealizedAllocationCertification) &&
        Objects.equals(this.alternativeWithholdingStatementRelianceCertification, w8ImyFormRequest.alternativeWithholdingStatementRelianceCertification) &&
        Objects.equals(this.npFfiWithExemptBeneficialOwnersCertification, w8ImyFormRequest.npFfiWithExemptBeneficialOwnersCertification) &&
        Objects.equals(this.ffiSponsoringEntity, w8ImyFormRequest.ffiSponsoringEntity) &&
        Objects.equals(this.investmentEntityCertification, w8ImyFormRequest.investmentEntityCertification) &&
        Objects.equals(this.controlledForeignCorporationCertification, w8ImyFormRequest.controlledForeignCorporationCertification) &&
        Objects.equals(this.ownerDocumentedFfiCertification, w8ImyFormRequest.ownerDocumentedFfiCertification) &&
        Objects.equals(this.ownerDocumentedFfiReportingStatementCertification, w8ImyFormRequest.ownerDocumentedFfiReportingStatementCertification) &&
        Objects.equals(this.ownerDocumentedFfiAuditorLetterCertification, w8ImyFormRequest.ownerDocumentedFfiAuditorLetterCertification) &&
        Objects.equals(this.compliantNonregisteringLocalBankCertification, w8ImyFormRequest.compliantNonregisteringLocalBankCertification) &&
        Objects.equals(this.compliantFfiLowValueAccountsCertification, w8ImyFormRequest.compliantFfiLowValueAccountsCertification) &&
        Objects.equals(this.sponsoredCloselyHeldEntitySponsoringEntity, w8ImyFormRequest.sponsoredCloselyHeldEntitySponsoringEntity) &&
        Objects.equals(this.sponsoredCloselyHeldInvestmentVehicleCertification, w8ImyFormRequest.sponsoredCloselyHeldInvestmentVehicleCertification) &&
        Objects.equals(this.compliantLimitedLifeDebtEntityCertification, w8ImyFormRequest.compliantLimitedLifeDebtEntityCertification) &&
        Objects.equals(this.investmentEntityNoFinancialAccountsCertification, w8ImyFormRequest.investmentEntityNoFinancialAccountsCertification) &&
        Objects.equals(this.restrictedDistributorCertification, w8ImyFormRequest.restrictedDistributorCertification) &&
        Objects.equals(this.restrictedDistributorAgreementCertification, w8ImyFormRequest.restrictedDistributorAgreementCertification) &&
        Objects.equals(this.restrictedDistributorPreexistingSalesComplianceCertification, w8ImyFormRequest.restrictedDistributorPreexistingSalesComplianceCertification) &&
        Objects.equals(this.foreignCentralBankOfIssueCertification, w8ImyFormRequest.foreignCentralBankOfIssueCertification) &&
        Objects.equals(this.nonreportingIgaFfiCertification, w8ImyFormRequest.nonreportingIgaFfiCertification) &&
        Objects.equals(this.igaCountry, w8ImyFormRequest.igaCountry) &&
        Objects.equals(this.igaModel, w8ImyFormRequest.igaModel) &&
        Objects.equals(this.igaLegalStatusTreatment, w8ImyFormRequest.igaLegalStatusTreatment) &&
        Objects.equals(this.igaFfiTrusteeOrSponsor, w8ImyFormRequest.igaFfiTrusteeOrSponsor) &&
        Objects.equals(this.igaFfiTrusteeIsForeign, w8ImyFormRequest.igaFfiTrusteeIsForeign) &&
        Objects.equals(this.treatyQualifiedPensionFundCertification, w8ImyFormRequest.treatyQualifiedPensionFundCertification) &&
        Objects.equals(this.qualifiedRetirementFundCertification, w8ImyFormRequest.qualifiedRetirementFundCertification) &&
        Objects.equals(this.narrowParticipationRetirementFundCertification, w8ImyFormRequest.narrowParticipationRetirementFundCertification) &&
        Objects.equals(this.section401AEquivalentPensionPlanCertification, w8ImyFormRequest.section401AEquivalentPensionPlanCertification) &&
        Objects.equals(this.investmentEntityForRetirementFundsCertification, w8ImyFormRequest.investmentEntityForRetirementFundsCertification) &&
        Objects.equals(this.exemptBeneficialOwnerSponsoredRetirementFundCertification, w8ImyFormRequest.exemptBeneficialOwnerSponsoredRetirementFundCertification) &&
        Objects.equals(this.exceptedNonfinancialGroupEntityCertification, w8ImyFormRequest.exceptedNonfinancialGroupEntityCertification) &&
        Objects.equals(this.exceptedNonfinancialStartUpCertification, w8ImyFormRequest.exceptedNonfinancialStartUpCertification) &&
        Objects.equals(this.startupFormationOrResolutionDate, w8ImyFormRequest.startupFormationOrResolutionDate) &&
        Objects.equals(this.exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification, w8ImyFormRequest.exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification) &&
        Objects.equals(this.nonfinancialEntityFilingDate, w8ImyFormRequest.nonfinancialEntityFilingDate) &&
        Objects.equals(this.publiclyTradedNffeCertification, w8ImyFormRequest.publiclyTradedNffeCertification) &&
        Objects.equals(this.publiclyTradedNffeSecuritiesMarket, w8ImyFormRequest.publiclyTradedNffeSecuritiesMarket) &&
        Objects.equals(this.nffeAffiliateOfPubliclyTradedEntityCertification, w8ImyFormRequest.nffeAffiliateOfPubliclyTradedEntityCertification) &&
        Objects.equals(this.publiclyTradedEntity, w8ImyFormRequest.publiclyTradedEntity) &&
        Objects.equals(this.nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket, w8ImyFormRequest.nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket) &&
        Objects.equals(this.exceptedTerritoryNffeCertification, w8ImyFormRequest.exceptedTerritoryNffeCertification) &&
        Objects.equals(this.activeNffeCertification, w8ImyFormRequest.activeNffeCertification) &&
        Objects.equals(this.passiveNffeCertification, w8ImyFormRequest.passiveNffeCertification) &&
        Objects.equals(this.sponsoredDirectReportingNffeCertification, w8ImyFormRequest.sponsoredDirectReportingNffeCertification) &&
        Objects.equals(this.directReportingNffeSponsoringEntity, w8ImyFormRequest.directReportingNffeSponsoringEntity) &&
        Objects.equals(this.signerName, w8ImyFormRequest.signerName) &&
        Objects.equals(this.eDeliveryConsentedAt, w8ImyFormRequest.eDeliveryConsentedAt) &&
        Objects.equals(this.signature, w8ImyFormRequest.signature) &&
        Objects.equals(this.companyId, w8ImyFormRequest.companyId) &&
        Objects.equals(this.referenceId, w8ImyFormRequest.referenceId) &&
        Objects.equals(this.email, w8ImyFormRequest.email);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, citizenshipCountry, disregardedEntity, entityType, fatcaStatus, residenceAddress, residenceCity, residenceState, residenceZip, residenceCountry, residenceIsMailing, mailingAddress, mailingCity, mailingState, mailingZip, mailingCountry, tinType, tin, giin, foreignTin, referenceNumber, disregardedEntityFatcaStatus, disregardedAddress, disregardedCity, disregardedState, disregardedZip, disregardedCountry, disregardedEntityGiin, qualifiedIntermediaryCertification, qiPrimaryWithholdingResponsibilityCertification, qiWithholdingResponsibilityForPtpSalesCertification, qiNomineeWithholdingResponsibilityForPtpDistributionsCertification, qiSecuritiesLenderSubstituteDividendWithholdingCertification, qiWithholdingAnd1099ReportingResponsibilityCertification, qiForm1099OrFatcaReportingResponsibilityCertification, qiOptOutOfForm1099ReportingCertification, qiWithholdingRatePoolCertification, qiIntermediaryOrFlowThroughEntityDocumentationCertification, qualifiedDerivativesDealerCertification, qddCorporation, qddPartnership, qddDisregardedEntity, nonqualifiedIntermediaryCertification, nqiWithholdingStatementTransmissionCertification, nqiWithholdingRatePoolComplianceCertification, nqiQualifiedSecuritiesLenderCertification, nqiAlternativeWithholdingStatementVerificationCertification, territoryFinancialInstitutionCertification, tfiTreatedAsUsPersonCertification, tfiWithholdingStatementTransmissionCertification, tfiTreatedAsUsPersonForPtpSalesCertification, tfiNomineeUsPersonForPtpDistributionsCertification, tfiNotNomineeForPtpDistributionsCertification, usBranchNonEffectivelyConnectedIncomeCertification, usBranchAgreementToBeTreatedAsUsPersonCertification, usBranchWithholdingStatementAndComplianceCertification, usBranchActingAsUsPersonForPtpSalesCertification, usBranchNomineeForPtpDistributionsCertification, usBranchNotNomineeForPtpDistributionsCertification, withholdingForeignPartnershipOrTrustCertification, nonwithholdingForeignEntityWithholdingStatementCertification, foreignEntityPartnerInLowerTierPartnershipCertification, foreignPartnershipAmountRealizedSection1446FCertification, foreignPartnershipModifiedAmountRealizedCertification, foreignGrantorTrustAmountRealizedAllocationCertification, alternativeWithholdingStatementRelianceCertification, npFfiWithExemptBeneficialOwnersCertification, ffiSponsoringEntity, investmentEntityCertification, controlledForeignCorporationCertification, ownerDocumentedFfiCertification, ownerDocumentedFfiReportingStatementCertification, ownerDocumentedFfiAuditorLetterCertification, compliantNonregisteringLocalBankCertification, compliantFfiLowValueAccountsCertification, sponsoredCloselyHeldEntitySponsoringEntity, sponsoredCloselyHeldInvestmentVehicleCertification, compliantLimitedLifeDebtEntityCertification, investmentEntityNoFinancialAccountsCertification, restrictedDistributorCertification, restrictedDistributorAgreementCertification, restrictedDistributorPreexistingSalesComplianceCertification, foreignCentralBankOfIssueCertification, nonreportingIgaFfiCertification, igaCountry, igaModel, igaLegalStatusTreatment, igaFfiTrusteeOrSponsor, igaFfiTrusteeIsForeign, treatyQualifiedPensionFundCertification, qualifiedRetirementFundCertification, narrowParticipationRetirementFundCertification, section401AEquivalentPensionPlanCertification, investmentEntityForRetirementFundsCertification, exemptBeneficialOwnerSponsoredRetirementFundCertification, exceptedNonfinancialGroupEntityCertification, exceptedNonfinancialStartUpCertification, startupFormationOrResolutionDate, exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification, nonfinancialEntityFilingDate, publiclyTradedNffeCertification, publiclyTradedNffeSecuritiesMarket, nffeAffiliateOfPubliclyTradedEntityCertification, publiclyTradedEntity, nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket, exceptedTerritoryNffeCertification, activeNffeCertification, passiveNffeCertification, sponsoredDirectReportingNffeCertification, directReportingNffeSponsoringEntity, signerName, eDeliveryConsentedAt, signature, companyId, referenceId, email);
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
    sb.append("class W8ImyFormRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    citizenshipCountry: ").append(toIndentedString(citizenshipCountry)).append("\n");
    sb.append("    disregardedEntity: ").append(toIndentedString(disregardedEntity)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    giin: ").append(toIndentedString(giin)).append("\n");
    sb.append("    foreignTin: ").append(toIndentedString(foreignTin)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    disregardedEntityFatcaStatus: ").append(toIndentedString(disregardedEntityFatcaStatus)).append("\n");
    sb.append("    disregardedAddress: ").append(toIndentedString(disregardedAddress)).append("\n");
    sb.append("    disregardedCity: ").append(toIndentedString(disregardedCity)).append("\n");
    sb.append("    disregardedState: ").append(toIndentedString(disregardedState)).append("\n");
    sb.append("    disregardedZip: ").append(toIndentedString(disregardedZip)).append("\n");
    sb.append("    disregardedCountry: ").append(toIndentedString(disregardedCountry)).append("\n");
    sb.append("    disregardedEntityGiin: ").append(toIndentedString(disregardedEntityGiin)).append("\n");
    sb.append("    qualifiedIntermediaryCertification: ").append(toIndentedString(qualifiedIntermediaryCertification)).append("\n");
    sb.append("    qiPrimaryWithholdingResponsibilityCertification: ").append(toIndentedString(qiPrimaryWithholdingResponsibilityCertification)).append("\n");
    sb.append("    qiWithholdingResponsibilityForPtpSalesCertification: ").append(toIndentedString(qiWithholdingResponsibilityForPtpSalesCertification)).append("\n");
    sb.append("    qiNomineeWithholdingResponsibilityForPtpDistributionsCertification: ").append(toIndentedString(qiNomineeWithholdingResponsibilityForPtpDistributionsCertification)).append("\n");
    sb.append("    qiSecuritiesLenderSubstituteDividendWithholdingCertification: ").append(toIndentedString(qiSecuritiesLenderSubstituteDividendWithholdingCertification)).append("\n");
    sb.append("    qiWithholdingAnd1099ReportingResponsibilityCertification: ").append(toIndentedString(qiWithholdingAnd1099ReportingResponsibilityCertification)).append("\n");
    sb.append("    qiForm1099OrFatcaReportingResponsibilityCertification: ").append(toIndentedString(qiForm1099OrFatcaReportingResponsibilityCertification)).append("\n");
    sb.append("    qiOptOutOfForm1099ReportingCertification: ").append(toIndentedString(qiOptOutOfForm1099ReportingCertification)).append("\n");
    sb.append("    qiWithholdingRatePoolCertification: ").append(toIndentedString(qiWithholdingRatePoolCertification)).append("\n");
    sb.append("    qiIntermediaryOrFlowThroughEntityDocumentationCertification: ").append(toIndentedString(qiIntermediaryOrFlowThroughEntityDocumentationCertification)).append("\n");
    sb.append("    qualifiedDerivativesDealerCertification: ").append(toIndentedString(qualifiedDerivativesDealerCertification)).append("\n");
    sb.append("    qddCorporation: ").append(toIndentedString(qddCorporation)).append("\n");
    sb.append("    qddPartnership: ").append(toIndentedString(qddPartnership)).append("\n");
    sb.append("    qddDisregardedEntity: ").append(toIndentedString(qddDisregardedEntity)).append("\n");
    sb.append("    nonqualifiedIntermediaryCertification: ").append(toIndentedString(nonqualifiedIntermediaryCertification)).append("\n");
    sb.append("    nqiWithholdingStatementTransmissionCertification: ").append(toIndentedString(nqiWithholdingStatementTransmissionCertification)).append("\n");
    sb.append("    nqiWithholdingRatePoolComplianceCertification: ").append(toIndentedString(nqiWithholdingRatePoolComplianceCertification)).append("\n");
    sb.append("    nqiQualifiedSecuritiesLenderCertification: ").append(toIndentedString(nqiQualifiedSecuritiesLenderCertification)).append("\n");
    sb.append("    nqiAlternativeWithholdingStatementVerificationCertification: ").append(toIndentedString(nqiAlternativeWithholdingStatementVerificationCertification)).append("\n");
    sb.append("    territoryFinancialInstitutionCertification: ").append(toIndentedString(territoryFinancialInstitutionCertification)).append("\n");
    sb.append("    tfiTreatedAsUsPersonCertification: ").append(toIndentedString(tfiTreatedAsUsPersonCertification)).append("\n");
    sb.append("    tfiWithholdingStatementTransmissionCertification: ").append(toIndentedString(tfiWithholdingStatementTransmissionCertification)).append("\n");
    sb.append("    tfiTreatedAsUsPersonForPtpSalesCertification: ").append(toIndentedString(tfiTreatedAsUsPersonForPtpSalesCertification)).append("\n");
    sb.append("    tfiNomineeUsPersonForPtpDistributionsCertification: ").append(toIndentedString(tfiNomineeUsPersonForPtpDistributionsCertification)).append("\n");
    sb.append("    tfiNotNomineeForPtpDistributionsCertification: ").append(toIndentedString(tfiNotNomineeForPtpDistributionsCertification)).append("\n");
    sb.append("    usBranchNonEffectivelyConnectedIncomeCertification: ").append(toIndentedString(usBranchNonEffectivelyConnectedIncomeCertification)).append("\n");
    sb.append("    usBranchAgreementToBeTreatedAsUsPersonCertification: ").append(toIndentedString(usBranchAgreementToBeTreatedAsUsPersonCertification)).append("\n");
    sb.append("    usBranchWithholdingStatementAndComplianceCertification: ").append(toIndentedString(usBranchWithholdingStatementAndComplianceCertification)).append("\n");
    sb.append("    usBranchActingAsUsPersonForPtpSalesCertification: ").append(toIndentedString(usBranchActingAsUsPersonForPtpSalesCertification)).append("\n");
    sb.append("    usBranchNomineeForPtpDistributionsCertification: ").append(toIndentedString(usBranchNomineeForPtpDistributionsCertification)).append("\n");
    sb.append("    usBranchNotNomineeForPtpDistributionsCertification: ").append(toIndentedString(usBranchNotNomineeForPtpDistributionsCertification)).append("\n");
    sb.append("    withholdingForeignPartnershipOrTrustCertification: ").append(toIndentedString(withholdingForeignPartnershipOrTrustCertification)).append("\n");
    sb.append("    nonwithholdingForeignEntityWithholdingStatementCertification: ").append(toIndentedString(nonwithholdingForeignEntityWithholdingStatementCertification)).append("\n");
    sb.append("    foreignEntityPartnerInLowerTierPartnershipCertification: ").append(toIndentedString(foreignEntityPartnerInLowerTierPartnershipCertification)).append("\n");
    sb.append("    foreignPartnershipAmountRealizedSection1446FCertification: ").append(toIndentedString(foreignPartnershipAmountRealizedSection1446FCertification)).append("\n");
    sb.append("    foreignPartnershipModifiedAmountRealizedCertification: ").append(toIndentedString(foreignPartnershipModifiedAmountRealizedCertification)).append("\n");
    sb.append("    foreignGrantorTrustAmountRealizedAllocationCertification: ").append(toIndentedString(foreignGrantorTrustAmountRealizedAllocationCertification)).append("\n");
    sb.append("    alternativeWithholdingStatementRelianceCertification: ").append(toIndentedString(alternativeWithholdingStatementRelianceCertification)).append("\n");
    sb.append("    npFfiWithExemptBeneficialOwnersCertification: ").append(toIndentedString(npFfiWithExemptBeneficialOwnersCertification)).append("\n");
    sb.append("    ffiSponsoringEntity: ").append(toIndentedString(ffiSponsoringEntity)).append("\n");
    sb.append("    investmentEntityCertification: ").append(toIndentedString(investmentEntityCertification)).append("\n");
    sb.append("    controlledForeignCorporationCertification: ").append(toIndentedString(controlledForeignCorporationCertification)).append("\n");
    sb.append("    ownerDocumentedFfiCertification: ").append(toIndentedString(ownerDocumentedFfiCertification)).append("\n");
    sb.append("    ownerDocumentedFfiReportingStatementCertification: ").append(toIndentedString(ownerDocumentedFfiReportingStatementCertification)).append("\n");
    sb.append("    ownerDocumentedFfiAuditorLetterCertification: ").append(toIndentedString(ownerDocumentedFfiAuditorLetterCertification)).append("\n");
    sb.append("    compliantNonregisteringLocalBankCertification: ").append(toIndentedString(compliantNonregisteringLocalBankCertification)).append("\n");
    sb.append("    compliantFfiLowValueAccountsCertification: ").append(toIndentedString(compliantFfiLowValueAccountsCertification)).append("\n");
    sb.append("    sponsoredCloselyHeldEntitySponsoringEntity: ").append(toIndentedString(sponsoredCloselyHeldEntitySponsoringEntity)).append("\n");
    sb.append("    sponsoredCloselyHeldInvestmentVehicleCertification: ").append(toIndentedString(sponsoredCloselyHeldInvestmentVehicleCertification)).append("\n");
    sb.append("    compliantLimitedLifeDebtEntityCertification: ").append(toIndentedString(compliantLimitedLifeDebtEntityCertification)).append("\n");
    sb.append("    investmentEntityNoFinancialAccountsCertification: ").append(toIndentedString(investmentEntityNoFinancialAccountsCertification)).append("\n");
    sb.append("    restrictedDistributorCertification: ").append(toIndentedString(restrictedDistributorCertification)).append("\n");
    sb.append("    restrictedDistributorAgreementCertification: ").append(toIndentedString(restrictedDistributorAgreementCertification)).append("\n");
    sb.append("    restrictedDistributorPreexistingSalesComplianceCertification: ").append(toIndentedString(restrictedDistributorPreexistingSalesComplianceCertification)).append("\n");
    sb.append("    foreignCentralBankOfIssueCertification: ").append(toIndentedString(foreignCentralBankOfIssueCertification)).append("\n");
    sb.append("    nonreportingIgaFfiCertification: ").append(toIndentedString(nonreportingIgaFfiCertification)).append("\n");
    sb.append("    igaCountry: ").append(toIndentedString(igaCountry)).append("\n");
    sb.append("    igaModel: ").append(toIndentedString(igaModel)).append("\n");
    sb.append("    igaLegalStatusTreatment: ").append(toIndentedString(igaLegalStatusTreatment)).append("\n");
    sb.append("    igaFfiTrusteeOrSponsor: ").append(toIndentedString(igaFfiTrusteeOrSponsor)).append("\n");
    sb.append("    igaFfiTrusteeIsForeign: ").append(toIndentedString(igaFfiTrusteeIsForeign)).append("\n");
    sb.append("    treatyQualifiedPensionFundCertification: ").append(toIndentedString(treatyQualifiedPensionFundCertification)).append("\n");
    sb.append("    qualifiedRetirementFundCertification: ").append(toIndentedString(qualifiedRetirementFundCertification)).append("\n");
    sb.append("    narrowParticipationRetirementFundCertification: ").append(toIndentedString(narrowParticipationRetirementFundCertification)).append("\n");
    sb.append("    section401AEquivalentPensionPlanCertification: ").append(toIndentedString(section401AEquivalentPensionPlanCertification)).append("\n");
    sb.append("    investmentEntityForRetirementFundsCertification: ").append(toIndentedString(investmentEntityForRetirementFundsCertification)).append("\n");
    sb.append("    exemptBeneficialOwnerSponsoredRetirementFundCertification: ").append(toIndentedString(exemptBeneficialOwnerSponsoredRetirementFundCertification)).append("\n");
    sb.append("    exceptedNonfinancialGroupEntityCertification: ").append(toIndentedString(exceptedNonfinancialGroupEntityCertification)).append("\n");
    sb.append("    exceptedNonfinancialStartUpCertification: ").append(toIndentedString(exceptedNonfinancialStartUpCertification)).append("\n");
    sb.append("    startupFormationOrResolutionDate: ").append(toIndentedString(startupFormationOrResolutionDate)).append("\n");
    sb.append("    exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification: ").append(toIndentedString(exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification)).append("\n");
    sb.append("    nonfinancialEntityFilingDate: ").append(toIndentedString(nonfinancialEntityFilingDate)).append("\n");
    sb.append("    publiclyTradedNffeCertification: ").append(toIndentedString(publiclyTradedNffeCertification)).append("\n");
    sb.append("    publiclyTradedNffeSecuritiesMarket: ").append(toIndentedString(publiclyTradedNffeSecuritiesMarket)).append("\n");
    sb.append("    nffeAffiliateOfPubliclyTradedEntityCertification: ").append(toIndentedString(nffeAffiliateOfPubliclyTradedEntityCertification)).append("\n");
    sb.append("    publiclyTradedEntity: ").append(toIndentedString(publiclyTradedEntity)).append("\n");
    sb.append("    nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket: ").append(toIndentedString(nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket)).append("\n");
    sb.append("    exceptedTerritoryNffeCertification: ").append(toIndentedString(exceptedTerritoryNffeCertification)).append("\n");
    sb.append("    activeNffeCertification: ").append(toIndentedString(activeNffeCertification)).append("\n");
    sb.append("    passiveNffeCertification: ").append(toIndentedString(passiveNffeCertification)).append("\n");
    sb.append("    sponsoredDirectReportingNffeCertification: ").append(toIndentedString(sponsoredDirectReportingNffeCertification)).append("\n");
    sb.append("    directReportingNffeSponsoringEntity: ").append(toIndentedString(directReportingNffeSponsoringEntity)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    eDeliveryConsentedAt: ").append(toIndentedString(eDeliveryConsentedAt)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("eDeliveryConsentedAt");
    openapiFields.add("signature");
    openapiFields.add("type");
    openapiFields.add("companyId");
    openapiFields.add("referenceId");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("companyId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to W8ImyFormRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!W8ImyFormRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in W8ImyFormRequest is not found in the empty JSON string", W8ImyFormRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!W8ImyFormRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `W8ImyFormRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : W8ImyFormRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
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
      if ((jsonObj.get("tinType") != null && !jsonObj.get("tinType").isJsonNull()) && !jsonObj.get("tinType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinType").toString()));
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
      if ((jsonObj.get("signerName") != null && !jsonObj.get("signerName").isJsonNull()) && !jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if (!jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W8ImyFormRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W8ImyFormRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W8ImyFormRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W8ImyFormRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<W8ImyFormRequest>() {
           @Override
           public void write(JsonWriter out, W8ImyFormRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public W8ImyFormRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of W8ImyFormRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of W8ImyFormRequest
   * @throws IOException if the JSON string is invalid with respect to W8ImyFormRequest
   */
  public static W8ImyFormRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W8ImyFormRequest.class);
  }

  /**
   * Convert an instance of W8ImyFormRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

