

# W8ImyFormRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;w8imy\&quot; for this model). |  [optional] [readonly] |
|**name** | **String** | The name of the individual or entity associated with the form. |  [optional] |
|**citizenshipCountry** | **String** | The country of citizenship. |  [optional] |
|**disregardedEntity** | **String** | The name of the disregarded entity receiving the payment (if applicable). |  [optional] |
|**entityType** | **String** | The entity type. |  [optional] |
|**fatcaStatus** | **String** | The FATCA status. |  [optional] |
|**residenceAddress** | **String** | The residential address of the individual or entity. |  [optional] |
|**residenceCity** | **String** | The city of residence. |  [optional] |
|**residenceState** | **String** | The state of residence. |  [optional] |
|**residenceZip** | **String** | The ZIP code of the residence. |  [optional] |
|**residenceCountry** | **String** | The country of residence. |  [optional] |
|**residenceIsMailing** | **Boolean** | Indicates whether the residence address is also the mailing address. |  [optional] |
|**mailingAddress** | **String** | The mailing address. |  [optional] |
|**mailingCity** | **String** | The city of the mailing address. |  [optional] |
|**mailingState** | **String** | The state of the mailing address. |  [optional] |
|**mailingZip** | **String** | The ZIP code of the mailing address. |  [optional] |
|**mailingCountry** | **String** | The country of the mailing address. |  [optional] |
|**tinType** | **String** | The type of TIN provided. |  [optional] |
|**tin** | **String** | The taxpayer identification number (TIN). |  [optional] |
|**giin** | **String** | The global intermediary identification number (GIIN). |  [optional] |
|**foreignTin** | **String** | The foreign taxpayer identification number (TIN). |  [optional] |
|**referenceNumber** | **String** | A reference number for the form. |  [optional] |
|**disregardedEntityFatcaStatus** | **String** | The FATCA status of disregarded entity or branch receiving payment. |  [optional] |
|**disregardedAddress** | **String** | The address for disregarded entities. |  [optional] |
|**disregardedCity** | **String** | The city for disregarded entities. |  [optional] |
|**disregardedState** | **String** | The state for disregarded entities. |  [optional] |
|**disregardedZip** | **String** | The ZIP code for disregarded entities. |  [optional] |
|**disregardedCountry** | **String** | The country for disregarded entities. |  [optional] |
|**disregardedEntityGiin** | **String** | The GIIN for disregarded entities. |  [optional] |
|**qualifiedIntermediaryCertification** | **Boolean** | Certifies that the entity is a Qualified Intermediary (QI) acting in accordance with its QI Agreement,  providing required withholding statements and documentation for relevant tax withholding purposes. |  [optional] |
|**qiPrimaryWithholdingResponsibilityCertification** | **Boolean** | Certifies that the Qualified Intermediary assumes primary withholding responsibility  under chapters 3 and 4 for the specified accounts. |  [optional] |
|**qiWithholdingResponsibilityForPtpSalesCertification** | **Boolean** | Certifies that the Qualified Intermediary assumes primary withholding and reporting responsibility under section 1446(f)  for amounts realized from sales of interests in publicly traded partnerships. |  [optional] |
|**qiNomineeWithholdingResponsibilityForPtpDistributionsCertification** | **Boolean** | Certifies that the Qualified Intermediary assumes primary withholding responsibility as a nominee  under Regulations section 1.1446-4(b)(3) for publicly traded partnership distributions. |  [optional] |
|**qiSecuritiesLenderSubstituteDividendWithholdingCertification** | **Boolean** | Certifies that the Qualified Intermediary is acting as a qualified securities lender and assumes primary withholding  and reporting responsibilities for U.S. source substitute dividend payments. |  [optional] |
|**qiWithholdingAnd1099ReportingResponsibilityCertification** | **Boolean** | Certifies that the Qualified Intermediary assumes primary withholding under chapters 3 and 4, and primary Form 1099 reporting  and backup withholding responsibility for U.S. source interest and substitute interest payments. |  [optional] |
|**qiForm1099OrFatcaReportingResponsibilityCertification** | **Boolean** | Certifies that the Qualified Intermediary assumes Form 1099 reporting and backup withholding responsibility,  or FATCA reporting responsibility as a participating or registered deemed-compliant FFI,  for accounts held by specified U.S. persons. |  [optional] |
|**qiOptOutOfForm1099ReportingCertification** | **Boolean** | Certifies that the Qualified Intermediary does not assume primary Form 1099 reporting  and backup withholding responsibility for the accounts associated with this form. |  [optional] |
|**qiWithholdingRatePoolCertification** | **Boolean** | Certifies that the Qualified Intermediary meets the requirements for allocating payments  to a chapter 4 withholding rate pool of U.S. payees under Regulations section 1.6049-4(c)(4)(iii). |  [optional] |
|**qiIntermediaryOrFlowThroughEntityDocumentationCertification** | **Boolean** | Certifies that the Qualified Intermediary has obtained or will obtain documentation confirming the status of any intermediary  or flow-through entity as a participating FFI, registered deemed-compliant FFI,  or QI for U.S. payees in a chapter 4 withholding rate pool. |  [optional] |
|**qualifiedDerivativesDealerCertification** | **Boolean** | Certifies that the Qualified Derivatives Dealer (QDD) is approved by the IRS and assumes primary withholding  and reporting responsibilities for payments related to potential section 871(m) transactions. |  [optional] |
|**qddCorporation** | **Boolean** | Indicates QDD classification is Corporation. |  [optional] |
|**qddPartnership** | **Boolean** | Indicates QDD classification is Partnership. |  [optional] |
|**qddDisregardedEntity** | **Boolean** | Indicates QDD classification is Disregarded Entity. |  [optional] |
|**nonqualifiedIntermediaryCertification** | **Boolean** | Certifies that the entity is not acting as a Qualified Intermediary  and is not acting for its own account for the accounts covered by this form. |  [optional] |
|**nqiWithholdingStatementTransmissionCertification** | **Boolean** | Certifies that the nonqualified intermediary is submitting this form to transmit withholding certificates  and/or other required documentation along with a withholding statement. |  [optional] |
|**nqiWithholdingRatePoolComplianceCertification** | **Boolean** | Certifies that the nonqualified intermediary meets the requirements of Regulations section 1.6049-4(c)(4)(iii)  for U.S. payees included in a withholding rate pool, excluding publicly traded partnership distributions. |  [optional] |
|**nqiQualifiedSecuritiesLenderCertification** | **Boolean** | Certifies that the nonqualified intermediary is acting as a qualified securities lender (not as a QI)  and assumes primary withholding and reporting responsibilities for U.S. source substitute dividend payments. |  [optional] |
|**nqiAlternativeWithholdingStatementVerificationCertification** | **Boolean** | Certifies that the nonqualified intermediary has verified, or will verify,  all information on alternative withholding statements for consistency with account data to determine the correct withholding rate,  as required under sections 1441 or 1471. |  [optional] |
|**territoryFinancialInstitutionCertification** | **Boolean** | Certifies that the entity is a financial institution (other than an investment entity) that is incorporated  or organized under the laws of a possession of the United States. |  [optional] |
|**tfiTreatedAsUsPersonCertification** | **Boolean** | Certifies that the territory financial institution agrees to be treated as a U.S. person  for chapters 3 and 4 purposes concerning reportable amounts and withholdable payments. |  [optional] |
|**tfiWithholdingStatementTransmissionCertification** | **Boolean** | Certifies that the territory financial institution is transmitting withholding certificates or other required documentation  and has provided or will provide a withholding statement for reportable or withholdable payments. |  [optional] |
|**tfiTreatedAsUsPersonForPtpSalesCertification** | **Boolean** | Certifies that the territory financial institution agrees to be treated as a U.S. person  under Regulations section 1.1446(f)-4(a)(2)(i)(B) for amounts realized from sales of publicly traded partnership interests. |  [optional] |
|**tfiNomineeUsPersonForPtpDistributionsCertification** | **Boolean** | Certifies that the territory financial institution agrees to be treated as a U.S. person  and as a nominee for purposes of publicly traded partnership distributions under the applicable regulations. |  [optional] |
|**tfiNotNomineeForPtpDistributionsCertification** | **Boolean** | Certifies that the territory financial institution is not acting as a nominee for publicly traded partnership distributions  and is providing withholding statements for those distributions. |  [optional] |
|**usBranchNonEffectivelyConnectedIncomeCertification** | **Boolean** | Certifies that the U.S. branch is receiving reportable or withholdable payments  that are not effectively connected income, PTP distributions, or proceeds from PTP sales. |  [optional] |
|**usBranchAgreementToBeTreatedAsUsPersonCertification** | **Boolean** | Certifies that the U.S. branch of a foreign bank or insurance company agrees to be treated as a U.S. person  for reportable amounts or withholdable payments under the applicable regulations. |  [optional] |
|**usBranchWithholdingStatementAndComplianceCertification** | **Boolean** | Certifies that the U.S. branch is transmitting required documentation  and withholding statements for reportable or withholdable payments and is applying the appropriate FATCA regulations. |  [optional] |
|**usBranchActingAsUsPersonForPtpSalesCertification** | **Boolean** | Certifies that the U.S. branch is acting as a U.S. person  for purposes of amounts realized from sales of publicly traded partnership interests under the applicable regulations. |  [optional] |
|**usBranchNomineeForPtpDistributionsCertification** | **Boolean** | Certifies that the U.S. branch is treated as a U.S. person  and as a nominee for publicly traded partnership distributions under the applicable regulations. |  [optional] |
|**usBranchNotNomineeForPtpDistributionsCertification** | **Boolean** | Certifies that the U.S. branch is not acting as a nominee for publicly traded partnership distributions  and is providing the required withholding statements. |  [optional] |
|**withholdingForeignPartnershipOrTrustCertification** | **Boolean** | Certifies that the entity is a withholding foreign partnership (WP) or a withholding foreign trust (WT)  that is compliant with the terms of its WP or WT agreement. |  [optional] |
|**nonwithholdingForeignEntityWithholdingStatementCertification** | **Boolean** | Certifies that the entity is a nonwithholding foreign partnership or trust,  providing the form for non-effectively connected payments and transmitting required withholding documentation for chapters 3 and 4. |  [optional] |
|**foreignEntityPartnerInLowerTierPartnershipCertification** | **Boolean** | Certifies that the entity is a foreign partnership or grantor trust acting as a partner in a lower-tier partnership  and is submitting the form for purposes of section 1446(a). |  [optional] |
|**foreignPartnershipAmountRealizedSection1446FCertification** | **Boolean** | Certifies that the entity is a foreign partnership receiving an amount realized  from the transfer of a partnership interest for purposes of section 1446(f). |  [optional] |
|**foreignPartnershipModifiedAmountRealizedCertification** | **Boolean** | Certifies that the foreign partnership is providing a withholding statement for a modified amount realized  from the transfer of a partnership interest, when applicable. |  [optional] |
|**foreignGrantorTrustAmountRealizedAllocationCertification** | **Boolean** | Certifies that the foreign grantor trust is submitting the form on behalf of each grantor or owner  and providing a withholding statement to allocate the amount realized in accordance with the regulations. |  [optional] |
|**alternativeWithholdingStatementRelianceCertification** | **Boolean** | Certifies that the entity may rely on the information in all associated withholding certificates  under the applicable standards of knowledge in sections 1441 or 1471 when providing an alternative withholding statement. |  [optional] |
|**npFfiWithExemptBeneficialOwnersCertification** | **Boolean** | Certifies that the nonparticipating FFI is transmitting withholding documentation  and providing a statement allocating payment portions to exempt beneficial owners. |  [optional] |
|**ffiSponsoringEntity** | **String** | The name of the entity that sponsors the foreign financial institution (FFI). |  [optional] |
|**investmentEntityCertification** | **Boolean** | Certifies that the entity is an investment entity, not a QI, WP, or WT, and has an agreement with a sponsoring entity. |  [optional] |
|**controlledForeignCorporationCertification** | **Boolean** | Certifies that the entity is a controlled foreign corporation sponsored by a U.S. financial institution, not a QI, WP, or WT,  and shares a common electronic account system for full transparency. |  [optional] |
|**ownerDocumentedFfiCertification** | **Boolean** | Certifies that the FFI meets all requirements to qualify as an owner-documented FFI, including restrictions on activities,  ownership, and account relationships. |  [optional] |
|**ownerDocumentedFfiReportingStatementCertification** | **Boolean** | Certifies that the FFI will provide a complete owner reporting statement  and required documentation for each relevant owner or debt holder. |  [optional] |
|**ownerDocumentedFfiAuditorLetterCertification** | **Boolean** | Certifies that the FFI has provided or will provide an auditor’s letter and required owner documentation,  including a reporting statement and Form W-9s, to meet owner-documented FFI requirements under the regulations. |  [optional] |
|**compliantNonregisteringLocalBankCertification** | **Boolean** | Certifies that the FFI operates solely as a limited bank or credit union within its country, meets asset thresholds,  and has no foreign operations or affiliations outside its country of organization. |  [optional] |
|**compliantFfiLowValueAccountsCertification** | **Boolean** | Certifies that the FFI is not primarily engaged in investment activities, maintains only low-value accounts,  and has limited total assets within its group. |  [optional] |
|**sponsoredCloselyHeldEntitySponsoringEntity** | **String** | The name of sponsoring entity for a certified deemed-compliant, closely held investment vehicle. |  [optional] |
|**sponsoredCloselyHeldInvestmentVehicleCertification** | **Boolean** | Certifies that the entity is a sponsored investment entity with 20 or fewer individual owners,  and that all compliance obligations are fulfilled by the sponsoring entity. |  [optional] |
|**compliantLimitedLifeDebtEntityCertification** | **Boolean** | Certifies that the entity qualifies as a limited life debt investment entity based on its formation date, issuance terms,  and compliance with regulatory requirements. |  [optional] |
|**investmentEntityNoFinancialAccountsCertification** | **Boolean** | Certifies that the entity is a financial institution solely because it is an investment entity under regulations  and the entity does not maintain financial accounts. |  [optional] |
|**restrictedDistributorCertification** | **Boolean** | Certifies that the entity qualifies as a restricted distributor based on its operations, customer base, regulatory compliance,  and financial and geographic limitations. |  [optional] |
|**restrictedDistributorAgreementCertification** | **Boolean** | Certifies that the entity is, and has been, bound by distribution agreements prohibiting sales of fund interests to  specified U.S. persons and certain non-U.S. entities. |  [optional] |
|**restrictedDistributorPreexistingSalesComplianceCertification** | **Boolean** | Certifies that the entity complies with distribution restrictions for U.S.-linked investors  and has addressed any preexisting sales in accordance with FATCA regulations. |  [optional] |
|**foreignCentralBankOfIssueCertification** | **Boolean** | Certifies that the entity is treated as the beneficial owner of the payment solely  for purposes of chapter 4 under Regulations section 1.1471-6(d)(4). |  [optional] |
|**nonreportingIgaFfiCertification** | **Boolean** | Certifies that the entity meets the requirements to be considered a nonreporting financial institution to an applicable IGA. |  [optional] |
|**igaCountry** | **String** | The country for the applicable IGA with the United States. |  [optional] |
|**igaModel** | **String** | The applicable IGA model. |  [optional] |
|**igaLegalStatusTreatment** | **String** | Specifies how the applicable IGA is treated under the IGA provisions or Treasury regulations. |  [optional] |
|**igaFfiTrusteeOrSponsor** | **String** | The trustee or sponsor name for the nonreporting IGA FFI. |  [optional] |
|**igaFfiTrusteeIsForeign** | **Boolean** | Indicates whether the trustee for the nonreporting IGA FFI is foreign. |  [optional] |
|**treatyQualifiedPensionFundCertification** | **Boolean** | Certifies that the entity is a pension or retirement fund established in a treaty country  and is entitled to treaty benefits on U.S. source income. |  [optional] |
|**qualifiedRetirementFundCertification** | **Boolean** | Certifies that the entity is a government-regulated retirement fund meeting specific requirements for contributions, tax exemption,  beneficiary limits, and distribution restrictions. |  [optional] |
|**narrowParticipationRetirementFundCertification** | **Boolean** | Certifies that the entity is a government-regulated retirement fund with fewer than 50 participants, limited foreign ownership,  and employer sponsorship that is not from investment entities or passive NFFEs. |  [optional] |
|**section401AEquivalentPensionPlanCertification** | **Boolean** | Certifies that the entity is formed under a pension plan meeting section 401(a) requirements, except for being U.S.-trust funded. |  [optional] |
|**investmentEntityForRetirementFundsCertification** | **Boolean** | Certifies that the entity is established solely to earn income for the benefit of qualifying retirement funds  or accounts under applicable FATCA regulations or IGAs. |  [optional] |
|**exemptBeneficialOwnerSponsoredRetirementFundCertification** | **Boolean** | Certifies that the entity is established and sponsored by a qualifying exempt beneficial owner to provide retirement, disability,  or death benefits to individuals based on services performed for the sponsor. |  [optional] |
|**exceptedNonfinancialGroupEntityCertification** | **Boolean** | Certifies that the entity is a holding company, treasury center, or captive finance company operating within a nonfinancial group  and not functioning as an investment or financial institution. |  [optional] |
|**exceptedNonfinancialStartUpCertification** | **Boolean** | Certifies that the entity is a recently formed startup NFFE investing in a non-financial business  and is not operating as or presenting itself as an investment fund. |  [optional] |
|**startupFormationOrResolutionDate** | **LocalDate** | The date the start-up company was formed on (or, in case of new line of business, the date of board resolution approving the  new line of business). |  [optional] |
|**exceptedNonfinancialEntityInLiquidationOrBankruptcyCertification** | **Boolean** | Certifies that the entity is in liquidation, reorganization, or bankruptcy and intends to operate as a nonfinancial entity,  with supporting documentation available if the process exceeds three years. |  [optional] |
|**nonfinancialEntityFilingDate** | **LocalDate** | The filed date for a plan of reorganization, liquidation or bankruptcy. |  [optional] |
|**publiclyTradedNffeCertification** | **Boolean** | Certifies that the entity is a foreign corporation that is not a financial institution  and whose stock is regularly traded on an established securities market. |  [optional] |
|**publiclyTradedNffeSecuritiesMarket** | **String** | The name of the securities market where the corporation&#39;s stock is regularly traded. |  [optional] |
|**nffeAffiliateOfPubliclyTradedEntityCertification** | **Boolean** | Certifies that the entity is a foreign corporation that is not a financial institution  and is affiliated with a publicly traded entity within the same expanded affiliated group. |  [optional] |
|**publiclyTradedEntity** | **String** | The name of the affiliated entity whose stock is regularly traded on an established securities market. |  [optional] |
|**nffeAffiliateOfPubliclyTradedEntitySecuritiesMarket** | **String** | The name of the established securities market where the affiliated entity&#39;s stock is traded. |  [optional] |
|**exceptedTerritoryNffeCertification** | **Boolean** | Certifies that the entity is organized in a U.S. possession, is not engaged in financial activities,  and is entirely owned by bona fide residents of that possession. |  [optional] |
|**activeNffeCertification** | **Boolean** | Certifies that the entity is a foreign non-financial institution with less than 50% passive income  and less than 50% of its assets producing or held to produce passive income. |  [optional] |
|**passiveNffeCertification** | **Boolean** | Certifies that the entity is a foreign non-financial entity that does not qualify for any other NFFE category  and is not a financial institution. |  [optional] |
|**sponsoredDirectReportingNffeCertification** | **Boolean** | Certifies that the entity is a sponsored direct reporting NFFE. |  [optional] |
|**directReportingNffeSponsoringEntity** | **String** | The name of the entity that sponsors the direct reporting NFFE. |  [optional] |
|**signerName** | **String** | The name of the signer. |  [optional] |
|**companyId** | **String** | The ID of the associated company. |  [optional] |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |
|**email** | **String** | The email address of the individual associated with the form. |  [optional] |
|**eDeliveryConsentedAt** | **OffsetDateTime** | The date when e-delivery was consented. |  [optional] |
|**signature** | **String** | The signature of the form. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| W4 | &quot;W4&quot; |
| W8_BEN | &quot;W8Ben&quot; |
| W8_BEN_E | &quot;W8BenE&quot; |
| W8_IMY | &quot;W8Imy&quot; |
| W9 | &quot;W9&quot; |



