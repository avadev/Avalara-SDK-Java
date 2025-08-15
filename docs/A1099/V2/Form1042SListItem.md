

# Form1042SListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uniqueFormId** | **String** | Unique form identifier |  [optional] |
|**noTin** | **Boolean** | No TIN indicator |  [optional] |
|**recipientDateOfBirth** | **OffsetDateTime** | Recipient&#39;s date of birth |  [optional] |
|**recipientGiin** | **String** | Recipient&#39;s GIIN (Global Intermediary Identification Number) |  [optional] |
|**recipientForeignTin** | **String** | Recipient&#39;s foreign TIN |  [optional] |
|**lobCode** | [**LobCodeEnum**](#LobCodeEnum) | Limitation on benefits code |  [optional] |
|**incomeCode** | **String** | Income code |  [optional] |
|**grossIncome** | **Double** | Gross income |  [optional] |
|**withholdingIndicator** | **String** | Withholding indicator |  [optional] |
|**taxCountryCode** | **String** | Country code |  [optional] |
|**exemptionCodeChap3** | [**ExemptionCodeChap3Enum**](#ExemptionCodeChap3Enum) | Exemption code (Chapter 3) |  [optional] |
|**exemptionCodeChap4** | [**ExemptionCodeChap4Enum**](#ExemptionCodeChap4Enum) | Exemption code (Chapter 4) |  [optional] |
|**taxRateChap3** | **String** | Tax rate (Chapter 3) |  [optional] |
|**withholdingAllowance** | **Double** | Withholding allowance |  [optional] |
|**federalTaxWithheld** | **Double** | Federal tax withheld |  [optional] |
|**taxNotDepositedIndicator** | **Boolean** | Tax not deposited indicator |  [optional] |
|**academicIndicator** | **Boolean** | Academic indicator |  [optional] |
|**taxWithheldOtherAgents** | **Double** | Tax withheld by other agents |  [optional] |
|**amountRepaid** | **Double** | Amount repaid to recipient |  [optional] |
|**taxPaidAgent** | **Double** | Tax paid by withholding agent |  [optional] |
|**chap3StatusCode** | [**Chap3StatusCodeEnum**](#Chap3StatusCodeEnum) | Chapter 3 status code |  [optional] |
|**chap4StatusCode** | [**Chap4StatusCodeEnum**](#Chap4StatusCodeEnum) | Chapter 4 status code |  [optional] |
|**primaryWithholdingAgent** | [**PrimaryWithholdingAgent**](PrimaryWithholdingAgent.md) | Primary withholding agent information |  [optional] |
|**intermediaryOrFlowThrough** | [**IntermediaryOrFlowThrough**](IntermediaryOrFlowThrough.md) | Intermediary or flow-through entity information |  [optional] |
|**issuerId** | **String** | Issuer ID |  [optional] |
|**referenceId** | **String** | Reference ID |  [optional] |
|**recipientTin** | **String** | Recipient Tax ID Number |  [optional] |
|**recipientName** | **String** | Recipient name |  [optional] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address |  [optional] |
|**address2** | **String** | Address line 2 |  [optional] |
|**city** | **String** | City |  [optional] |
|**state** | **String** | US state. Required if CountryCode is \&quot;US\&quot;. |  [optional] |
|**zip** | **String** | Zip/postal code |  [optional] |
|**email** | **String** | Recipient email address |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**officeCode** | **String** | Office code |  [optional] |
|**nonUsProvince** | **String** | Foreign province |  [optional] |
|**countryCode** | **String** | Country code, as defined at https://www.irs.gov/e-file-providers/country-codes |  [optional] |
|**federalEFile** | **Boolean** | Boolean indicating that federal e-filing should be scheduled for this form |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEFile** | **Boolean** | Boolean indicating that state e-filing should be scheduled for this form |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**secondTinNotice** | **Boolean** | Second TIN notice in three years |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | Fatca filing requirement |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingRequest**](StateAndLocalWithholdingRequest.md) | State and local withholding information |  [optional] |



## Enum: LobCodeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;Individual&quot; |
| GOVERNMENT_CONTRACTING_STATE | &quot;GovernmentContractingState&quot; |
| TAX_EXEMPT_PENSION_TRUST | &quot;TaxExemptPensionTrust&quot; |
| TAX_EXEMPT_CHARITABLE_ORGANIZATION | &quot;TaxExemptCharitableOrganization&quot; |
| PUBLICLY_TRADED_CORPORATION | &quot;PubliclyTradedCorporation&quot; |
| SUBSIDIARY_OF_PUBLICLY_TRADED_CORPORATION | &quot;SubsidiaryOfPubliclyTradedCorporation&quot; |
| COMPANY_OWNERSHIP_BASE_EROSION_TEST | &quot;CompanyOwnershipBaseErosionTest&quot; |
| COMPANY_DERIVATIVE_BENEFITS_TEST | &quot;CompanyDerivativeBenefitsTest&quot; |
| COMPANY_ACTIVE_TRADE_OR_BUSINESS_TEST | &quot;CompanyActiveTradeOrBusinessTest&quot; |
| DISCRETIONARY_DETERMINATION | &quot;DiscretionaryDetermination&quot; |
| OTHER | &quot;Other&quot; |
| NO_LOB_ARTICLE_IN_TREATY | &quot;NoLobArticleInTreaty&quot; |



## Enum: ExemptionCodeChap3Enum

| Name | Value |
|---- | -----|
| TAX_RATE_DUE_TO_BACKUP_WITHHOLDING | &quot;TaxRateDueToBackupWithholding&quot; |
| EFFECTIVELY_CONNECTED_INCOME | &quot;EffectivelyConnectedIncome&quot; |
| EXEMPT_UNDER_IRC | &quot;ExemptUnderIrc&quot; |
| INCOME_NOT_FROM_US_SOURCES | &quot;IncomeNotFromUsSources&quot; |
| EXEMPT_UNDER_TAX_TREATY | &quot;ExemptUnderTaxTreaty&quot; |
| PORTFOLIO_INTEREST_EXEMPT_UNDER_IRC | &quot;PortfolioInterestExemptUnderIrc&quot; |
| QI_THAT_ASSUMES_PRIMARY_WITHHOLDING_RESPONSIBILITY | &quot;QiThatAssumesPrimaryWithholdingResponsibility&quot; |
| WF_POR_WFT | &quot;WfPorWft&quot; |
| US_BRANCH_TREATED_AS_US_PERSON | &quot;UsBranchTreatedAsUsPerson&quot; |
| TERRITORY_FI_TREATED_AS_US_PERSON | &quot;TerritoryFiTreatedAsUsPerson&quot; |
| QI_REPRESENTS_INCOME_EXEMPT | &quot;QiRepresentsIncomeExempt&quot; |
| QSL_THAT_ASSUMES_PRIMARY_WITHHOLDING_RESPONSIBILITY | &quot;QslThatAssumesPrimaryWithholdingResponsibility&quot; |
| PAYEE_SUBJECTED_TO_CHAPTER4_WITHHOLDING | &quot;PayeeSubjectedToChapter4Withholding&quot; |
| QDD_THAT_ASSUMES_PRIMARY_WITHHOLDING_RESPONSIBILITY | &quot;QddThatAssumesPrimaryWithholdingResponsibility&quot; |
| EXEMPT_UNDER_SECTION897_L | &quot;ExemptUnderSection897L&quot; |
| EXEMPT_UNDER_SECTION892 | &quot;ExemptUnderSection892&quot; |



## Enum: ExemptionCodeChap4Enum

| Name | Value |
|---- | -----|
| NOT_EXEMPT | &quot;NotExempt&quot; |
| GRANDFATHERED_PAYMENT | &quot;GrandfatheredPayment&quot; |
| EFFECTIVELY_CONNECTED_INCOME | &quot;EffectivelyConnectedIncome&quot; |
| PAYEE_NOT_SUBJECT_TO_CHAPTER4_WITHHOLDING | &quot;PayeeNotSubjectToChapter4Withholding&quot; |
| EXCLUDED_NONFINANCIAL_PAYMENT | &quot;ExcludedNonfinancialPayment&quot; |
| FOREIGN_ENTITY_THAT_ASSUMES_PRIMARY_WITHHOLDING_RESPONSIBILITY | &quot;ForeignEntityThatAssumesPrimaryWithholdingResponsibility&quot; |
| US_PAYEES_OF_PARTICIPATING_FFI | &quot;UsPayeesOfParticipatingFfi&quot; |
| EXEMPT_FROM_WITHHOLDING_UNDER_IGA | &quot;ExemptFromWithholdingUnderIga&quot; |
| DORMANT_ACCOUNT | &quot;DormantAccount&quot; |
| OTHER_PAYMENT_NOT_SUBJECT_TO_CHAPTER4_WITHHOLDING | &quot;OtherPaymentNotSubjectToChapter4Withholding&quot; |



## Enum: Chap3StatusCodeEnum

| Name | Value |
|---- | -----|
| US_WITHHOLDING_AGENT_FI | &quot;USWithholdingAgentFI&quot; |
| US_WITHHOLDING_AGENT_OTHER | &quot;USWithholdingAgentOther&quot; |
| TERRITORY_FI_TREATED_AS_US_PERSON | &quot;TerritoryFITreatedAsUSPerson&quot; |
| TERRITORY_FI_NOT_TREATED_AS_US_PERSON | &quot;TerritoryFINotTreatedAsUSPerson&quot; |
| US_BRANCH_TREATED_AS_US_PERSON | &quot;USBranchTreatedAsUSPerson&quot; |
| US_BRANCH_NOT_TREATED_AS_US_PERSON | &quot;USBranchNotTreatedAsUSPerson&quot; |
| US_BRANCH_ECI_PRESUMPTION_APPLIED | &quot;USBranchECIPresumptionApplied&quot; |
| PARTNERSHIP_OTHER_THAN_WITHHOLDING_FOREIGN_PARTNERSHIP | &quot;PartnershipOtherThanWithholdingForeignPartnership&quot; |
| WITHHOLDING_FOREIGN_PARTNERSHIP | &quot;WithholdingForeignPartnership&quot; |
| TRUST_OTHER_THAN_WITHHOLDING_FOREIGN_TRUST | &quot;TrustOtherThanWithholdingForeignTrust&quot; |
| WITHHOLDING_FOREIGN_TRUST | &quot;WithholdingForeignTrust&quot; |
| QUALIFIED_INTERMEDIARY | &quot;QualifiedIntermediary&quot; |
| QUALIFIED_SECURITIES_LENDER_QUALIFIED_INTERMEDIARY | &quot;QualifiedSecuritiesLenderQualifiedIntermediary&quot; |
| QUALIFIED_SECURITIES_LENDER_OTHER | &quot;QualifiedSecuritiesLenderOther&quot; |
| CORPORATION | &quot;Corporation&quot; |
| INDIVIDUAL | &quot;Individual&quot; |
| ESTATE | &quot;Estate&quot; |
| PRIVATE_FOUNDATION | &quot;PrivateFoundation&quot; |
| GOVERNMENT_OR_INTERNATIONAL_ORGANIZATION | &quot;GovernmentOrInternationalOrganization&quot; |
| TAX_EXEMPT_ORGANIZATION_SECTION501C_ENTITIES | &quot;TaxExemptOrganizationSection501cEntities&quot; |
| UNKNOWN_RECIPIENT | &quot;UnknownRecipient&quot; |
| ARTIST_OR_ATHLETE | &quot;ArtistOrAthlete&quot; |
| PENSION | &quot;Pension&quot; |
| FOREIGN_CENTRAL_BANK_OF_ISSUE | &quot;ForeignCentralBankOfIssue&quot; |
| NONQUALIFIED_INTERMEDIARY | &quot;NonqualifiedIntermediary&quot; |
| HYBRID_ENTITY_MAKING_TREATY_CLAIM | &quot;HybridEntityMakingTreatyClaim&quot; |
| WITHHOLDING_RATE_POOL_GENERAL | &quot;WithholdingRatePoolGeneral&quot; |
| WITHHOLDING_RATE_POOL_EXEMPT_ORGANIZATION | &quot;WithholdingRatePoolExemptOrganization&quot; |
| PAI_WITHHOLDING_RATE_POOL_GENERAL | &quot;PAIWithholdingRatePoolGeneral&quot; |
| PAI_WITHHOLDING_RATE_POOL_EXEMPT_ORGANIZATION | &quot;PAIWithholdingRatePoolExemptOrganization&quot; |
| AGENCY_WITHHOLDING_RATE_POOL_GENERAL | &quot;AgencyWithholdingRatePoolGeneral&quot; |
| AGENCY_WITHHOLDING_RATE_POOL_EXEMPT_ORGANIZATION | &quot;AgencyWithholdingRatePoolExemptOrganization&quot; |
| US_WITHHOLDING_AGENT_FOREIGN_BRANCH_OF_FI | &quot;USWithholdingAgentForeignBranchOfFI&quot; |
| QUALIFIED_DERIVATIVES_DEALER | &quot;QualifiedDerivativesDealer&quot; |
| FOREIGN_GOVERNMENT_INTEGRAL_PART | &quot;ForeignGovernmentIntegralPart&quot; |
| FOREIGN_GOVERNMENT_CONTROLLED_ENTITY | &quot;ForeignGovernmentControlledEntity&quot; |
| PUBLICLY_TRADED_PARTNERSHIP | &quot;PubliclyTradedPartnership&quot; |
| DISCLOSING_QUALIFIED_INTERMEDIARY | &quot;DisclosingQualifiedIntermediary&quot; |



## Enum: Chap4StatusCodeEnum

| Name | Value |
|---- | -----|
| US_WITHHOLDING_AGENT_FI | &quot;UsWithholdingAgentFi&quot; |
| US_WITHHOLDING_AGENT_OTHER | &quot;UsWithholdingAgentOther&quot; |
| TERRITORY_FI_NOT_TREATED_AS_US_PERSON | &quot;TerritoryFiNotTreatedAsUsPerson&quot; |
| TERRITORY_FI_TREATED_AS_US_PERSON | &quot;TerritoryFiTreatedAsUsPerson&quot; |
| PARTICIPATING_FFI_OTHER | &quot;ParticipatingFfiOther&quot; |
| PARTICIPATING_FFI_REPORTING_MODEL2_FFI | &quot;ParticipatingFfiReportingModel2Ffi&quot; |
| REGISTERED_DEEMED_COMPLIANT_FFI_REPORTING_MODEL1_FFI | &quot;RegisteredDeemedCompliantFfiReportingModel1Ffi&quot; |
| REGISTERED_DEEMED_COMPLIANT_FFI_SPONSORED_ENTITY | &quot;RegisteredDeemedCompliantFfiSponsoredEntity&quot; |
| REGISTERED_DEEMED_COMPLIANT_FFI_OTHER | &quot;RegisteredDeemedCompliantFfiOther&quot; |
| CERTIFIED_DEEMED_COMPLIANT_FFI_OTHER | &quot;CertifiedDeemedCompliantFfiOther&quot; |
| CERTIFIED_DEEMED_COMPLIANT_FFIFFI_WITH_LOW_VALUE_ACCOUNTS | &quot;CertifiedDeemedCompliantFfiffiWithLowValueAccounts&quot; |
| CERTIFIED_DEEMED_COMPLIANT_FFI_NON_REGISTERING_LOCAL_BANK | &quot;CertifiedDeemedCompliantFfiNonRegisteringLocalBank&quot; |
| CERTIFIED_DEEMED_COMPLIANT_FFI_SPONSORED_ENTITY | &quot;CertifiedDeemedCompliantFfiSponsoredEntity&quot; |
| CERTIFIED_DEEMED_COMPLIANT_FFI_INVESTMENT_ADVISOR_OR_MANAGER | &quot;CertifiedDeemedCompliantFfiInvestmentAdvisorOrManager&quot; |
| NONPARTICIPATING_FFI | &quot;NonparticipatingFfi&quot; |
| OWNER_DOCUMENTED_FFI | &quot;OwnerDocumentedFfi&quot; |
| US_BRANCH_TREATED_AS_US_PERSON | &quot;UsBranchTreatedAsUsPerson&quot; |
| US_BRANCH_NOT_TREATED_AS_US_PERSON | &quot;UsBranchNotTreatedAsUsPerson&quot; |
| PASSIVE_NFFE_IDENTIFYING_SUBSTANTIAL_US_OWNERS | &quot;PassiveNffeIdentifyingSubstantialUsOwners&quot; |
| PASSIVE_NFFE_WITH_NO_SUBSTANTIAL_US_OWNERS | &quot;PassiveNffeWithNoSubstantialUsOwners&quot; |
| PUBLICLY_TRADED_NFFE_OR_AFFILIATE | &quot;PubliclyTradedNffeOrAffiliate&quot; |
| ACTIVE_NFFE | &quot;ActiveNffe&quot; |
| INDIVIDUAL | &quot;Individual&quot; |
| SECTION501_C_ENTITIES | &quot;Section501CEntities&quot; |
| EXCEPTED_TERRITORY_NFFE | &quot;ExceptedTerritoryNffe&quot; |
| EXCEPTED_NFFE_OTHER | &quot;ExceptedNffeOther&quot; |
| EXEMPT_BENEFICIAL_OWNER | &quot;ExemptBeneficialOwner&quot; |
| ENTITY_WHOLLY_OWNED_BY_EXEMPT_BENEFICIAL_OWNERS | &quot;EntityWhollyOwnedByExemptBeneficialOwners&quot; |
| UNKNOWN_RECIPIENT | &quot;UnknownRecipient&quot; |
| RECALCITRANT_ACCOUNT_HOLDER | &quot;RecalcitrantAccountHolder&quot; |
| NONREPORTING_IGAFII | &quot;NonreportingIgafii&quot; |
| DIRECT_REPORTING_NFFE | &quot;DirectReportingNffe&quot; |
| US_REPORTABLE_ACCOUNT | &quot;UsReportableAccount&quot; |
| NON_CONSENTING_US_ACCOUNT | &quot;NonConsentingUsAccount&quot; |
| SPONSORED_DIRECT_REPORTING_NFFE | &quot;SponsoredDirectReportingNffe&quot; |
| EXCEPTED_INTER_AFFILIATE_FFI | &quot;ExceptedInterAffiliateFfi&quot; |
| UNDOCUMENTED_PREEXISTING_OBLIGATION | &quot;UndocumentedPreexistingObligation&quot; |
| US_BRANCH_ECI_PRESUMPTION_APPLIED | &quot;UsBranchEciPresumptionApplied&quot; |
| ACCOUNT_HOLDER_OF_EXCLUDED_FINANCIAL_ACCOUNT | &quot;AccountHolderOfExcludedFinancialAccount&quot; |
| PASSIVE_NFFE_REPORTED_BY_FFI | &quot;PassiveNffeReportedByFfi&quot; |
| NFFE_SUBJECT_TO1472_WITHHOLDING | &quot;NffeSubjectTo1472Withholding&quot; |
| RECALCITRANT_POOL_NO_US_INDICIA | &quot;RecalcitrantPoolNoUsIndicia&quot; |
| RECALCITRANT_POOL_US_INDICIA | &quot;RecalcitrantPoolUsIndicia&quot; |
| RECALCITRANT_POOL_DORMANT_ACCOUNT | &quot;RecalcitrantPoolDormantAccount&quot; |
| RECALCITRANT_POOL_US_PERSONS | &quot;RecalcitrantPoolUsPersons&quot; |
| RECALCITRANT_POOL_PASSIVE_NFF_ES | &quot;RecalcitrantPoolPassiveNffEs&quot; |
| NONPARTICIPATING_FFI_POOL | &quot;NonparticipatingFfiPool&quot; |
| US_PAYEES_POOL | &quot;UsPayeesPool&quot; |
| QI_RECALCITRANT_POOL_GENERAL | &quot;QiRecalcitrantPoolGeneral&quot; |
| US_WITHHOLDING_AGENT_FOREIGN_BRANCH_OF_FI | &quot;UsWithholdingAgentForeignBranchOfFi&quot; |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



