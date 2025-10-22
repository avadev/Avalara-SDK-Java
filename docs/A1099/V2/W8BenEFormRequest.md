

# W8BenEFormRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;w8bene\&quot; for this model). |  [optional] [readonly] |
|**name** | **String** | The name of the individual or entity associated with the form. |  |
|**citizenshipCountry** | **String** | The country of citizenship. |  |
|**disregardedEntity** | **String** | The name of the disregarded entity receiving the payment (if applicable). |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Represents the entity type for tax forms.  Each value corresponds to a specific entity classification.  - 1: Corporation  - 2: Disregarded entity  - 3: Partnership  - 4: Simple trust  - 5: Grantor trust  - 6: Complex trust  - 7: Estate  - 8: Foreign Government - Controlled Entity  - 9: Central Bank of Issue  - 10: Tax-exempt organization  - 11: Private foundation  - 12: International organization  - 13: Foreign Government - Controlled Integral Part |  |
|**makingTreatyClaim** | **Boolean** | Indicates whether the entity is making a treaty claim. |  [optional] |
|**fatcaStatus** | [**FatcaStatusEnum**](#FatcaStatusEnum) | Represents the FATCA status types for tax forms.  Used for W8-BEN-E forms and FATCA compliance validations.  Values correspond to numeric identifiers used in forms.  - 1: Nonparticipating FFI (including a limited FFI or an FFI related to a Reporting IGA FFI other than a deemed-compliant FFI, participating FFI, or exempt beneficial owner)  - 2: Participating FFI  - 3: Reporting Model 1 FFI  - 4: Reporting Model 2 FFI  - 5: Registered deemed-compliant FFI (other than a reporting Model 1 FFI, sponsored FFI, or nonreporting IGA FFI covered in Part XII)  - 6: Sponsored FFI that has not obtained a GIIN  - 7: Certified deemed-compliant nonregistering local bank  - 8: Certified deemed-compliant FFI with only low-value accounts  - 9: Certified deemed-compliant sponsored, closely held investment vehicle  - 10: Certified deemed-compliant limited life debt investment entity  - 11: Certified deemed-compliant investment advisors and investment managers  - 12: Owner-documented FFI  - 13: Restricted distributor  - 14: Nonreporting IGA FFI  - 15: Foreign government, government of a U.S. possession, or foreign central bank of issue  - 16: International organization  - 17: Exempt retirement plans  - 18: Entity wholly owned by exempt beneficial owners  - 19: Territory financial institution  - 20: Nonfinancial group entity  - 21: Excepted nonfinancial start-up company  - 22: Excepted nonfinancial entity in liquidation or bankruptcy  - 23: 501(c) organization  - 24: Nonprofit organization  - 25: Publicly traded NFFE or NFFE affiliate of a publicly traded corporation  - 26: Excepted territory NFFE  - 27: Active NFFE  - 28: Passive NFFE  - 29: Excepted inter-affiliate FFI  - 30: Direct reporting NFFE  - 31: Sponsored direct reporting NFFE  - 32: Account that is not a financial account |  |
|**residenceAddress** | **String** | The residential address of the individual or entity. |  [optional] |
|**residenceCity** | **String** | The city of residence. |  [optional] |
|**residenceState** | [**ResidenceStateEnum**](#ResidenceStateEnum) | The state of residence. |  [optional] |
|**residenceZip** | **String** | The ZIP code of the residence. |  [optional] |
|**residenceCountry** | **String** | The country of residence. |  |
|**residenceIsMailing** | **Boolean** | Indicates whether the residence address is also the mailing address. |  [optional] |
|**mailingAddress** | **String** | The mailing address. |  [optional] |
|**mailingCity** | **String** | The city of the mailing address. |  [optional] |
|**mailingState** | [**MailingStateEnum**](#MailingStateEnum) | The state of the mailing address. |  [optional] |
|**mailingZip** | **String** | The ZIP code of the mailing address. |  [optional] |
|**mailingCountry** | **String** | The country of the mailing address. |  [optional] |
|**tin** | **String** | The taxpayer identification number (TIN). |  [optional] |
|**giin** | **String** | The global intermediary identification number (GIIN). |  [optional] |
|**foreignTinNotRequired** | **Boolean** | Indicates whether a foreign TIN is not required. |  [optional] |
|**foreignTin** | **String** | The foreign taxpayer identification number (TIN). |  [optional] |
|**referenceNumber** | **String** | A reference number for the form. |  [optional] |
|**disregardedEntityFatcaStatus** | [**DisregardedEntityFatcaStatusEnum**](#DisregardedEntityFatcaStatusEnum) | The FATCA status of disregarded entity or branch receiving payment.  Available values:  - 1: Branch treated as nonparticipating FFI  - 2: U.S. Branch  - 3: Participating FFI  - 4: Reporting Model 1 FFI  - 5: Reporting Model 2 FFI |  [optional] |
|**disregardedAddress** | **String** | The address for disregarded entities. |  [optional] |
|**disregardedCity** | **String** | The city for disregarded entities. |  [optional] |
|**disregardedState** | [**DisregardedStateEnum**](#DisregardedStateEnum) | The state for disregarded entities. |  [optional] |
|**disregardedZip** | **String** | The ZIP code for disregarded entities. |  [optional] |
|**disregardedCountry** | **String** | The country for disregarded entities. |  [optional] |
|**disregardedEntityGiin** | **String** | The GIIN for disregarded entities. |  [optional] |
|**treatyCountryCertification** | **Boolean** | Certifies the beneficial owner&#39;s country under the U.S. tax treaty. |  [optional] |
|**treatyCountry** | **String** | The treaty country of the beneficial owner. |  [optional] |
|**benefitLimitationCertification** | **Boolean** | Certifies that the beneficial owner is eligible for treaty benefits and meets any limitation on benefits requirements. |  [optional] |
|**benefitLimitation** | [**BenefitLimitationEnum**](#BenefitLimitationEnum) | The benefit limitation for tax treaty claims.  Available values:  - 1: Government  - 2: Tax exempt pension trust or pension fund  - 3: Other tax exempt organization  - 4: Publicly traded corporation  - 5: Subsidiary of a publicly traded corporation  - 6: Company that meets the ownership and base erosion test  - 7: Company that meets the derivative benefits test  - 8: Company with an item of income that meets active trade or business test  - 9: Favorable discretionary determination by the U.S. competent authority received  - 10: Other  - 11: No LOB article in treaty |  [optional] |
|**qualifiedResidentStatusCertification** | **Boolean** | Certifies that the beneficial owner claims treaty benefits and meets the qualified resident status for specific U.S. source income. |  [optional] |
|**treatyArticle** | **String** | Indicates the specific article and paragraph of the tax treaty under which the beneficial owner is claiming benefits. |  [optional] |
|**withholdingRate** | **String** | Specifies the reduced withholding rate claimed under the applicable tax treaty. |  [optional] |
|**incomeType** | **String** | Specifies the type of income for which the reduced treaty withholding rate is being claimed. |  [optional] |
|**treatyReasons** | **String** | The additional conditions in the article the beneficial owner meets to be eligible for the rate of withholding. |  [optional] |
|**ffiSponsoringEntity** | **String** | The name of the entity that sponsors the foreign financial institution (FFI). |  [optional] |
|**investmentEntityCertification** | **Boolean** | Certifies that the entity is an investment entity, not a QI, WP, or WT, and has an agreement with a sponsoring entity. |  [optional] |
|**controlledForeignCorporationCertification** | **Boolean** | Certifies that the entity is a controlled foreign corporation sponsored by a U.S. financial institution, not a QI, WP, or WT,  and shares a common electronic account system for full transparency. |  [optional] |
|**compliantNonregisteringLocalBankCertification** | **Boolean** | Certifies that the FFI operates solely as a limited bank or credit union within its country, meets asset thresholds,  and has no foreign operations or affiliations outside its country of organization. |  [optional] |
|**compliantFfiLowValueAccountsCertification** | **Boolean** | Certifies that the FFI is not primarily engaged in investment activities, maintains only low-value accounts,  and has limited total assets within its group. |  [optional] |
|**sponsoredCloselyHeldEntitySponsoringEntity** | **String** | The name of sponsoring entity for a certified deemed-compliant, closely held investment vehicle. |  [optional] |
|**sponsoredCloselyHeldInvestmentVehicleCertification** | **Boolean** | Certifies that the entity is a sponsored investment entity with 20 or fewer individual owners,  and that all compliance obligations are fulfilled by the sponsoring entity. |  [optional] |
|**compliantLimitedLifeDebtEntityCertification** | **Boolean** | Certifies that the entity qualifies as a limited life debt investment entity based on its formation date, issuance terms,  and compliance with regulatory requirements. |  [optional] |
|**investmentEntityNoFinancialAccountsCertification** | **Boolean** | Certifies that the entity is a financial institution solely because it is an investment entity under regulations  and the entity does not maintain financial accounts. |  [optional] |
|**ownerDocumentedFfiCertification** | **Boolean** | Certifies that the FFI meets all requirements to qualify as an owner-documented FFI, including restrictions on activities,  ownership, and account relationships. |  [optional] |
|**ownerDocumentedFfiReportingStatementCertification** | **Boolean** | Certifies that the FFI will provide a complete owner reporting statement  and required documentation for each relevant owner or debt holder. |  [optional] |
|**ownerDocumentedFfiAuditorLetterCertification** | **Boolean** | Certifies that the FFI will provide an auditor’s letter and required owner reporting documentation  to confirm its status as an owner-documented FFI. |  [optional] |
|**ownerDocumentedFfiTrustBeneficiariesCertification** | **Boolean** | Certifies that the trust has no contingent or unidentified beneficiaries or designated classes of beneficiaries. |  [optional] |
|**restrictedDistributorCertification** | **Boolean** | Certifies that the entity qualifies as a restricted distributor based on its operations, customer base, regulatory compliance,  and financial and geographic limitations. |  [optional] |
|**restrictedDistributorAgreementCertification** | **Boolean** | Certifies that the entity is, and has been, bound by distribution agreements prohibiting sales of fund interests to  specified U.S. persons and certain non-U.S. entities. |  [optional] |
|**restrictedDistributorPreexistingSalesComplianceCertification** | **Boolean** | Certifies that the entity complies with distribution restrictions for U.S.-linked investors  and has addressed any preexisting sales in accordance with FATCA regulations. |  [optional] |
|**nonreportingIgaFfiCertification** | **Boolean** | Certifies that the entity meets the requirements to be considered a nonreporting financial institution to an applicable IGA. |  [optional] |
|**igaCountry** | **String** | The country for the applicable IGA with the United States. |  [optional] |
|**igaModel** | [**IgaModelEnum**](#IgaModelEnum) | The applicable IGA model.  Available values:  - 1: Model 1 IGA  - 2: Model 2 IGA |  [optional] |
|**igaLegalStatusTreatment** | **String** | Specifies how the applicable IGA is treated under the IGA provisions or Treasury regulations. |  [optional] |
|**igaFfiTrusteeOrSponsor** | **String** | The trustee or sponsor name for the nonreporting IGA FFI. |  [optional] |
|**igaFfiTrusteeIsForeign** | **Boolean** | Indicates whether the trustee for the nonreporting IGA FFI is foreign. |  [optional] |
|**nonCommercialFinancialActivityCertification** | **Boolean** | Certifies that the entity is the beneficial owner and is not engaged in commercial financial activities related  to the specified payments, accounts or obligations for which this form is submitted. |  [optional] |
|**internationOrganizationCertification** | **Boolean** | Certifies that the entity is an international organization described in section 7701(a)(18). |  [optional] |
|**intergovernmentalOrganizationCertification** | **Boolean** | Certifies that the entity is an intergovernmental or supranational organization primarily comprised of foreign governments,  is the beneficial owner, and is not engaged in commercial financial activities. |  [optional] |
|**treatyQualifiedPensionFundCertification** | **Boolean** | Certifies that the entity is a pension or retirement fund established in a treaty country  and is entitled to treaty benefits on U.S. source income. |  [optional] |
|**qualifiedRetirementFundCertification** | **Boolean** | Certifies that the entity is a government-regulated retirement fund meeting specific requirements for contributions, tax exemption,  beneficiary limits, and distribution restrictions. |  [optional] |
|**narrowParticipationRetirementFundCertification** | **Boolean** | Certifies that the entity is a government-regulated retirement fund with fewer than 50 participants, limited foreign ownership,  and employer sponsorship that is not from investment entities or passive NFFEs. |  [optional] |
|**section401AEquivalentPensionPlanCertification** | **Boolean** | Certifies that the entity is formed under a pension plan meeting section 401(a) requirements, except for being U.S.-trust funded. |  [optional] |
|**investmentEntityForRetirementFundsCertification** | **Boolean** | Certifies that the entity is established solely to earn income for the benefit of qualifying retirement funds  or accounts under applicable FATCA regulations or IGAs. |  [optional] |
|**exemptBeneficialOwnerSponsoredRetirementFundCertification** | **Boolean** | Certifies that the entity is established and sponsored by a qualifying exempt beneficial owner to provide retirement, disability,  or death benefits to individuals based on services performed for the sponsor. |  [optional] |
|**exemptBeneficialOwnerOwnedInvestmentEntityCertification** | **Boolean** | Certifies that the entity is an investment entity wholly owned by exempt beneficial owners and has provided complete ownership  and documentation details as required under FATCA regulations. |  [optional] |
|**territoryFinancialInstitutionCertification** | **Boolean** | Certifies that the entity is a financial institution (other than an investment entity) that is incorporated  or organized under the laws of a possession of the United States. |  [optional] |
|**exceptedNonfinancialGroupEntityCertification** | **Boolean** | Certifies that the entity is a holding company, treasury center, or captive finance company operating within a nonfinancial group  and not functioning as an investment or financial institution. |  [optional] |
|**exceptedNonfinancialStartUpCertification** | **Boolean** | Certifies that the entity is a recently formed startup NFFE investing in a non-financial business  and is not operating as or presenting itself as an investment fund. |  [optional] |
|**startupFormationOrResolutionDate** | **LocalDate** | The date the start-up company was formed on (or, in case of new line of business, the date of board resolution approving the  new line of business). |  [optional] |
|**exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification** | **Boolean** | Certifies that the entity is in liquidation, reorganization, or bankruptcy and intends to operate as a nonfinancial entity,  with supporting documentation available if the process exceeds three years. |  [optional] |
|**nonfinancialEntityFilingDate** | **LocalDate** | The filed date for a plan of reorganization, liquidation or bankruptcy. |  [optional] |
|**section501COrganizationCertification** | **Boolean** | Certifies that the entity is a section 501(c) organization based on a valid IRS determination letter  or a legal opinion from U.S. counsel. |  [optional] |
|**determinationLetterDate** | **LocalDate** | The date of the IRS determination letter confirming the entity’s section 501(c) status. |  [optional] |
|**nonprofitOrganizationCertification** | **Boolean** | Certifies that the entity is a nonprofit organization established for charitable or similar purposes, exempt from income tax,  and restricted in the use and distribution of its assets under applicable law. |  [optional] |
|**publiclyTradedNffeCertification** | **Boolean** | Certifies that the entity is a foreign corporation that is not a financial institution  and whose stock is regularly traded on an established securities market. |  [optional] |
|**publiclyTradedNffeSecuritiesMarket** | **String** | The name of the securities market where the corporation&#39;s stock is regularly traded. |  [optional] |
|**nffeAffiliateOfPubliclyTradedEntityCertification** | **Boolean** | Certifies that the entity is a foreign corporation that is not a financial institution  and is affiliated with a publicly traded entity within the same expanded affiliated group. |  [optional] |
|**publiclyTradedEntity** | **String** | The name of the affiliated entity whose stock is regularly traded on an established securities market. |  [optional] |
|**nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket** | **String** | The name of the established securities market where the affiliated entity&#39;s stock is traded. |  [optional] |
|**exceptedTerritoryNffeCertification** | **Boolean** | Certifies that the entity is organized in a U.S. possession, is not engaged in financial activities,  and is entirely owned by bona fide residents of that possession. |  [optional] |
|**activeNffeCertification** | **Boolean** | Certifies that the entity is a foreign non-financial institution with less than 50% passive income  and less than 50% of its assets producing or held to produce passive income. |  [optional] |
|**passiveNffeCertification** | **Boolean** | Certifies that the entity is a foreign non-financial entity that does not qualify for any other NFFE category  and is not a financial institution. |  [optional] |
|**passiveNffeNoSubstantialUsOwnersCertification** | **Boolean** | Certifies that the passive NFFE has no substantial U.S. owners or controlling U.S. persons. |  [optional] |
|**passiveNffeSubstantialUsOwnersProvidedCertification** | **Boolean** | Certifies that the passive NFFE has provided the name, address, and TIN of each substantial U.S. owner or controlling U.S. person. |  [optional] |
|**exceptedInterAffiliateFfiCertification** | **Boolean** | Certifies that the entity is an inter-affiliate FFI meeting all conditions for exemption,  including limited account activity and payment interactions within its expanded affiliated group. |  [optional] |
|**sponsoredDirectReportingNffeCertification** | **Boolean** | Certifies that the entity is a sponsored direct reporting NFFE. |  [optional] |
|**directReportingNffeSponsoringEntity** | **String** | The name of the entity that sponsors the direct reporting NFFE. |  [optional] |
|**substantialUsOwners** | [**List&lt;SubstantialUsOwnerRequest&gt;**](SubstantialUsOwnerRequest.md) | The list of substantial U.S. owners of passive NFFE. |  [optional] |
|**signerName** | **String** | The name of the signer. |  [optional] |
|**capacityToSignCertification** | **Boolean** | Certifies signer has the capacity to sign for the beneficial owner. |  [optional] |
|**eDeliveryConsentedAt** | **OffsetDateTime** | The date when e-delivery was consented. |  [optional] |
|**signature** | **String** | The signature of the form. |  [optional] |
|**companyId** | **String** | The ID of the associated company. Required when creating a form. |  [optional] |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |
|**email** | **String** | The email address of the individual associated with the form. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| W4 | &quot;W4&quot; |
| W8_BEN | &quot;W8Ben&quot; |
| W8_BEN_E | &quot;W8BenE&quot; |
| W8_IMY | &quot;W8Imy&quot; |
| W9 | &quot;W9&quot; |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| CORPORATION | &quot;Corporation&quot; |
| DISREGARDED_ENTITY | &quot;DisregardedEntity&quot; |
| PARTNERSHIP | &quot;Partnership&quot; |
| SIMPLE_TRUST | &quot;SimpleTrust&quot; |
| GRANTOR_TRUST | &quot;GrantorTrust&quot; |
| COMPLEX_TRUST | &quot;ComplexTrust&quot; |
| ESTATE | &quot;Estate&quot; |
| FOREIGN_GOVERNMENT_CONTROLLED_ENTITY | &quot;ForeignGovernmentControlledEntity&quot; |
| CENTRAL_BANK_OF_ISSUE | &quot;CentralBankOfIssue&quot; |
| TAX_EXEMPT_ORGANIZATION | &quot;TaxExemptOrganization&quot; |
| PRIVATE_FOUNDATION | &quot;PrivateFoundation&quot; |
| INTERNATIONAL_ORGANIZATION | &quot;InternationalOrganization&quot; |
| FOREIGN_GOVERNMENT_CONTROLLED_INTEGRAL_PART | &quot;ForeignGovernmentControlledIntegralPart&quot; |



## Enum: FatcaStatusEnum

| Name | Value |
|---- | -----|
| NONPARTICIPATING_FFI | &quot;NonparticipatingFFI&quot; |
| PARTICIPATING_FFI | &quot;ParticipatingFFI&quot; |
| REPORTING_MODEL1_FFI | &quot;ReportingModel1FFI&quot; |
| REPORTING_MODEL2_FFI | &quot;ReportingModel2FFI&quot; |
| REGISTERED_DEEMED_COMPLIANT_FFI | &quot;RegisteredDeemedCompliantFFI&quot; |
| SPONSORED_FFI_WITHOUT_GIIN | &quot;SponsoredFFIWithoutGIIN&quot; |
| CERTIFIED_DEEMED_COMPLIANT_NONREGISTERING_LOCAL_BANK | &quot;CertifiedDeemedCompliantNonregisteringLocalBank&quot; |
| CERTIFIED_DEEMED_COMPLIANT_FFI_WITH_LOW_VALUE_ACCOUNTS | &quot;CertifiedDeemedCompliantFFIWithLowValueAccounts&quot; |
| CERTIFIED_DEEMED_COMPLIANT_SPONSORED_CLOSELY_HELD_INVESTMENT_VEHICLE | &quot;CertifiedDeemedCompliantSponsoredCloselyHeldInvestmentVehicle&quot; |
| CERTIFIED_DEEMED_COMPLIANT_LIMITED_LIFE_DEBT_INVESTMENT_ENTITY | &quot;CertifiedDeemedCompliantLimitedLifeDebtInvestmentEntity&quot; |
| CERTAIN_INVESTMENT_ENTITIES_WITHOUT_FINANCIAL_ACCOUNTS | &quot;CertainInvestmentEntitiesWithoutFinancialAccounts&quot; |
| OWNER_DOCUMENTED_FFI | &quot;OwnerDocumentedFFI&quot; |
| RESTRICTED_DISTRIBUTOR | &quot;RestrictedDistributor&quot; |
| NONREPORTING_IGAFFI | &quot;NonreportingIGAFFI&quot; |
| FOREIGN_GOVERNMENT_OR_US_POSSESSION_OR_FOREIGN_CENTRAL_BANK | &quot;ForeignGovernmentOrUSPossessionOrForeignCentralBank&quot; |
| INTERNATIONAL_ORGANIZATION | &quot;InternationalOrganization&quot; |
| EXEMPT_RETIREMENT_PLANS | &quot;ExemptRetirementPlans&quot; |
| ENTITY_WHOLLY_OWNED_BY_EXEMPT_BENEFICIAL_OWNERS | &quot;EntityWhollyOwnedByExemptBeneficialOwners&quot; |
| TERRITORY_FINANCIAL_INSTITUTION | &quot;TerritoryFinancialInstitution&quot; |
| NONFINANCIAL_GROUP_ENTITY | &quot;NonfinancialGroupEntity&quot; |
| EXCEPTED_NONFINANCIAL_START_UP_COMPANY | &quot;ExceptedNonfinancialStartUpCompany&quot; |
| EXCEPTED_NONFINANCIAL_ENTITY_IN_LIQUIDATION_OR_BANKRUPTCY | &quot;ExceptedNonfinancialEntityInLiquidationOrBankruptcy&quot; |
| ORGANIZATION501C | &quot;Organization501c&quot; |
| NONPROFIT_ORGANIZATION | &quot;NonprofitOrganization&quot; |
| PUBLICLY_TRADED_NFFEOR_AFFILIATE_OF_PUBLICLY_TRADED_CORPORATION | &quot;PubliclyTradedNFFEOrAffiliateOfPubliclyTradedCorporation&quot; |
| EXCEPTED_TERRITORY_NFFE | &quot;ExceptedTerritoryNFFE&quot; |
| ACTIVE_NFFE | &quot;ActiveNFFE&quot; |
| PASSIVE_NFFE | &quot;PassiveNFFE&quot; |
| EXCEPTED_INTER_AFFILIATE_FFI | &quot;ExceptedInterAffiliateFFI&quot; |
| DIRECT_REPORTING_NFFE | &quot;DirectReportingNFFE&quot; |
| SPONSORED_DIRECT_REPORTING_NFFE | &quot;SponsoredDirectReportingNFFE&quot; |
| ACCOUNT_THAT_IS_NOT_FINANCIAL_ACCOUNT | &quot;AccountThatIsNotFinancialAccount&quot; |



## Enum: ResidenceStateEnum

| Name | Value |
|---- | -----|
| AA | &quot;AA&quot; |
| AE | &quot;AE&quot; |
| AK | &quot;AK&quot; |
| AL | &quot;AL&quot; |
| AP | &quot;AP&quot; |
| AR | &quot;AR&quot; |
| AS | &quot;AS&quot; |
| AZ | &quot;AZ&quot; |
| CA | &quot;CA&quot; |
| CO | &quot;CO&quot; |
| CT | &quot;CT&quot; |
| DC | &quot;DC&quot; |
| DE | &quot;DE&quot; |
| FL | &quot;FL&quot; |
| FM | &quot;FM&quot; |
| GA | &quot;GA&quot; |
| GU | &quot;GU&quot; |
| HI | &quot;HI&quot; |
| IA | &quot;IA&quot; |
| ID | &quot;ID&quot; |
| IL | &quot;IL&quot; |
| IN | &quot;IN&quot; |
| KS | &quot;KS&quot; |
| KY | &quot;KY&quot; |
| LA | &quot;LA&quot; |
| MA | &quot;MA&quot; |
| MD | &quot;MD&quot; |
| ME | &quot;ME&quot; |
| MH | &quot;MH&quot; |
| MI | &quot;MI&quot; |
| MN | &quot;MN&quot; |
| MO | &quot;MO&quot; |
| MP | &quot;MP&quot; |
| MS | &quot;MS&quot; |
| MT | &quot;MT&quot; |
| NC | &quot;NC&quot; |
| ND | &quot;ND&quot; |
| NE | &quot;NE&quot; |
| NH | &quot;NH&quot; |
| NJ | &quot;NJ&quot; |
| NM | &quot;NM&quot; |
| NV | &quot;NV&quot; |
| NY | &quot;NY&quot; |
| OH | &quot;OH&quot; |
| OK | &quot;OK&quot; |
| OR | &quot;OR&quot; |
| PA | &quot;PA&quot; |
| PR | &quot;PR&quot; |
| PW | &quot;PW&quot; |
| RI | &quot;RI&quot; |
| SC | &quot;SC&quot; |
| SD | &quot;SD&quot; |
| TN | &quot;TN&quot; |
| TX | &quot;TX&quot; |
| UT | &quot;UT&quot; |
| VA | &quot;VA&quot; |
| VI | &quot;VI&quot; |
| VT | &quot;VT&quot; |
| WA | &quot;WA&quot; |
| WI | &quot;WI&quot; |
| WV | &quot;WV&quot; |
| WY | &quot;WY&quot; |



## Enum: MailingStateEnum

| Name | Value |
|---- | -----|
| AA | &quot;AA&quot; |
| AE | &quot;AE&quot; |
| AK | &quot;AK&quot; |
| AL | &quot;AL&quot; |
| AP | &quot;AP&quot; |
| AR | &quot;AR&quot; |
| AS | &quot;AS&quot; |
| AZ | &quot;AZ&quot; |
| CA | &quot;CA&quot; |
| CO | &quot;CO&quot; |
| CT | &quot;CT&quot; |
| DC | &quot;DC&quot; |
| DE | &quot;DE&quot; |
| FL | &quot;FL&quot; |
| FM | &quot;FM&quot; |
| GA | &quot;GA&quot; |
| GU | &quot;GU&quot; |
| HI | &quot;HI&quot; |
| IA | &quot;IA&quot; |
| ID | &quot;ID&quot; |
| IL | &quot;IL&quot; |
| IN | &quot;IN&quot; |
| KS | &quot;KS&quot; |
| KY | &quot;KY&quot; |
| LA | &quot;LA&quot; |
| MA | &quot;MA&quot; |
| MD | &quot;MD&quot; |
| ME | &quot;ME&quot; |
| MH | &quot;MH&quot; |
| MI | &quot;MI&quot; |
| MN | &quot;MN&quot; |
| MO | &quot;MO&quot; |
| MP | &quot;MP&quot; |
| MS | &quot;MS&quot; |
| MT | &quot;MT&quot; |
| NC | &quot;NC&quot; |
| ND | &quot;ND&quot; |
| NE | &quot;NE&quot; |
| NH | &quot;NH&quot; |
| NJ | &quot;NJ&quot; |
| NM | &quot;NM&quot; |
| NV | &quot;NV&quot; |
| NY | &quot;NY&quot; |
| OH | &quot;OH&quot; |
| OK | &quot;OK&quot; |
| OR | &quot;OR&quot; |
| PA | &quot;PA&quot; |
| PR | &quot;PR&quot; |
| PW | &quot;PW&quot; |
| RI | &quot;RI&quot; |
| SC | &quot;SC&quot; |
| SD | &quot;SD&quot; |
| TN | &quot;TN&quot; |
| TX | &quot;TX&quot; |
| UT | &quot;UT&quot; |
| VA | &quot;VA&quot; |
| VI | &quot;VI&quot; |
| VT | &quot;VT&quot; |
| WA | &quot;WA&quot; |
| WI | &quot;WI&quot; |
| WV | &quot;WV&quot; |
| WY | &quot;WY&quot; |



## Enum: DisregardedEntityFatcaStatusEnum

| Name | Value |
|---- | -----|
| BRANCH_TREATED_AS_NONPARTICIPATING_FFI | &quot;BranchTreatedAsNonparticipatingFFI&quot; |
| US_BRANCH | &quot;USBranch&quot; |
| PARTICIPATING_FFI | &quot;ParticipatingFFI&quot; |
| REPORTING_MODEL1_FFI | &quot;ReportingModel1FFI&quot; |
| REPORTING_MODEL2_FFI | &quot;ReportingModel2FFI&quot; |



## Enum: DisregardedStateEnum

| Name | Value |
|---- | -----|
| AA | &quot;AA&quot; |
| AE | &quot;AE&quot; |
| AK | &quot;AK&quot; |
| AL | &quot;AL&quot; |
| AP | &quot;AP&quot; |
| AR | &quot;AR&quot; |
| AS | &quot;AS&quot; |
| AZ | &quot;AZ&quot; |
| CA | &quot;CA&quot; |
| CO | &quot;CO&quot; |
| CT | &quot;CT&quot; |
| DC | &quot;DC&quot; |
| DE | &quot;DE&quot; |
| FL | &quot;FL&quot; |
| FM | &quot;FM&quot; |
| GA | &quot;GA&quot; |
| GU | &quot;GU&quot; |
| HI | &quot;HI&quot; |
| IA | &quot;IA&quot; |
| ID | &quot;ID&quot; |
| IL | &quot;IL&quot; |
| IN | &quot;IN&quot; |
| KS | &quot;KS&quot; |
| KY | &quot;KY&quot; |
| LA | &quot;LA&quot; |
| MA | &quot;MA&quot; |
| MD | &quot;MD&quot; |
| ME | &quot;ME&quot; |
| MH | &quot;MH&quot; |
| MI | &quot;MI&quot; |
| MN | &quot;MN&quot; |
| MO | &quot;MO&quot; |
| MP | &quot;MP&quot; |
| MS | &quot;MS&quot; |
| MT | &quot;MT&quot; |
| NC | &quot;NC&quot; |
| ND | &quot;ND&quot; |
| NE | &quot;NE&quot; |
| NH | &quot;NH&quot; |
| NJ | &quot;NJ&quot; |
| NM | &quot;NM&quot; |
| NV | &quot;NV&quot; |
| NY | &quot;NY&quot; |
| OH | &quot;OH&quot; |
| OK | &quot;OK&quot; |
| OR | &quot;OR&quot; |
| PA | &quot;PA&quot; |
| PR | &quot;PR&quot; |
| PW | &quot;PW&quot; |
| RI | &quot;RI&quot; |
| SC | &quot;SC&quot; |
| SD | &quot;SD&quot; |
| TN | &quot;TN&quot; |
| TX | &quot;TX&quot; |
| UT | &quot;UT&quot; |
| VA | &quot;VA&quot; |
| VI | &quot;VI&quot; |
| VT | &quot;VT&quot; |
| WA | &quot;WA&quot; |
| WI | &quot;WI&quot; |
| WV | &quot;WV&quot; |
| WY | &quot;WY&quot; |



## Enum: BenefitLimitationEnum

| Name | Value |
|---- | -----|
| GOVERNMENT | &quot;Government&quot; |
| TAX_EXEMPT_PENSION_TRUST_OR_PENSION_FUND | &quot;TaxExemptPensionTrustOrPensionFund&quot; |
| OTHER_TAX_EXEMPT_ORGANIZATION | &quot;OtherTaxExemptOrganization&quot; |
| PUBLICLY_TRADED_CORPORATION | &quot;PubliclyTradedCorporation&quot; |
| SUBSIDIARY_OF_PUBLICLY_TRADED_CORPORATION | &quot;SubsidiaryOfPubliclyTradedCorporation&quot; |
| COMPANY_THAT_MEETS_OWNERSHIP_AND_BASE_EROSION_TEST | &quot;CompanyThatMeetsOwnershipAndBaseErosionTest&quot; |
| COMPANY_THAT_MEETS_DERIVATIVE_BENEFITS_TEST | &quot;CompanyThatMeetsDerivativeBenefitsTest&quot; |
| COMPANY_WITH_ITEM_OF_INCOME_THAT_MEETS_ACTIVE_TRADE_OR_BUSINESS_TEST | &quot;CompanyWithItemOfIncomeThatMeetsActiveTradeOrBusinessTest&quot; |
| FAVORABLE_DISCRETIONARY_DETERMINATION_BY_US_COMPETENT_AUTHORITY_RECEIVED | &quot;FavorableDiscretionaryDeterminationByUSCompetentAuthorityReceived&quot; |
| OTHER | &quot;Other&quot; |
| NO_LOB_ARTICLE_IN_TREATY | &quot;NoLOBArticleInTreaty&quot; |



## Enum: IgaModelEnum

| Name | Value |
|---- | -----|
| MODEL1_IGA | &quot;Model1IGA&quot; |
| MODEL2_IGA | &quot;Model2IGA&quot; |



