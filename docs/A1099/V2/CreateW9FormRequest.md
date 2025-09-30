

# CreateW9FormRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type. |  [optional] [readonly] |
|**name** | **String** | The name of the individual or entity associated with the form. |  |
|**businessName** | **String** | The name of the business associated with the form. |  [optional] |
|**businessClassification** | [**BusinessClassificationEnum**](#BusinessClassificationEnum) | The classification of the business.  Available values:  - Individual: Individual/sole proprietor  - C Corporation: C Corporation  - S Corporation: S Corporation  - Partnership: Partnership  - Trust/estate: Trust/estate  - LLC-C: Limited liability company (C Corporation)  - LLC-S: Limited liability company (S Corporation)  - LLC-P: Limited liability company (Partnership)  - Other: Other (requires BusinessOther field to be populated) |  |
|**businessOther** | **String** | The classification description when \&quot;businessClassification\&quot; is \&quot;Other\&quot;. |  [optional] |
|**foreignPartnerOwnerOrBeneficiary** | **Boolean** | Indicates whether the individual is a foreign partner, owner, or beneficiary. |  [optional] |
|**exemptPayeeCode** | **String** | The exempt payee code. Allowed values (1–13):  - 1 — Organization exempt under §501(a) or IRA; custodial account under §403(b)(7)  - 2 — U.S. government or its agencies/instrumentalities  - 3 — U.S. state, DC, U.S. territory/possession, or their political subdivisions/agencies/instrumentalities  - 4 — Foreign government or its political subdivisions/agencies/instrumentalities  - 5 — Corporation  - 6 — Dealer in securities or commodities required to register in the U.S., DC, or U.S. territory/possession  - 7 — Futures commission merchant registered with the CFTC  - 8 — Real estate investment trust (REIT)  - 9 — Entity registered at all times during the tax year under the Investment Company Act of 1940  - 10 — Common trust fund operated by a bank under §584(a)  - 11 — Financial institution (see §581)  - 12 — Broker (nominee/custodian)  - 13 — Trust exempt under §664 or described in §4947 |  [optional] |
|**exemptFatcaCode** | **String** | The exemption from FATCA reporting code. Allowed values (A–M):  - A — Tax‑exempt organization under §501(a) or IRA (§7701(a)(37))  - B — U.S. government or any of its agencies/instrumentalities  - C — U.S. state, DC, territory/possession, or their political subdivisions/instrumentalities  - D — Corporation whose stock is regularly traded on an established securities market  - E — Corporation that is a member of the same expanded affiliated group as a D corporation  - F — Registered dealer in securities/commodities/derivatives  - G — REIT (Real Estate Investment Trust)  - H — Regulated investment company (§851) or entity registered all year under the Investment Company Act of 1940  - I — Common trust fund (§584(a))  - J — Bank (§581)  - K — Broker  - L — Charitable remainder trust (§664) or trust described in §4947(a)(1)  - M — Trust under §403(b) plan or §457(g) plan |  [optional] |
|**foreignCountryIndicator** | **Boolean** | Indicates whether the individual or entity is in a foreign country. |  [optional] |
|**address** | **String** | The address of the employee. Required unless exempt. |  |
|**foreignAddress** | **String** | The foreign address of the individual or entity. |  [optional] |
|**city** | **String** | The city of residence of the employee. Required unless exempt. |  |
|**state** | [**StateEnum**](#StateEnum) | The state of residence of the employee. Required unless exempt. |  |
|**zip** | **String** | The ZIP code of residence of the employee. Required unless exempt. |  |
|**accountNumber** | **String** | The account number associated with the form. |  [optional] |
|**tinType** | **String** | Tax Identification Number (TIN) type. |  |
|**tin** | **String** | The taxpayer identification number (TIN). |  |
|**backupWithholding** | **Boolean** | Indicates whether backup withholding applies. |  [optional] |
|**is1099able** | **Boolean** | Indicates whether the individual or entity should be issued a 1099 form. |  [optional] |
|**eDeliveryConsentedAt** | **OffsetDateTime** | The date when e-delivery was consented. |  [optional] |
|**signature** | **String** | The signature of the form. |  [optional] |
|**companyId** | **String** | The ID of the associated company. Required when creating a form. |  [optional] |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |
|**email** | **String** | The email address of the individual associated with the form. |  [optional] |
|**citizenshipCountry** | **String** | The country of citizenship. |  |
|**disregardedEntity** | **String** | The name of the disregarded entity receiving the payment (if applicable). |  [optional] |
|**entityType** | **String** | The entity type.  Available values:  - 1: Corporation  - 2: Disregarded entity  - 3: Partnership  - 4: Simple trust  - 5: Grantor trust  - 6: Complex trust  - 7: Estate  - 8: Foreign Government - Controlled Entity  - 9: Central Bank of Issue  - 10: Tax-exempt organization  - 11: Private foundation  - 12: International organization  - 13: Foreign Government - Controlled Integral Part |  |
|**fatcaStatus** | **String** | The FATCA status.  Available values:  - 1: Nonparticipating FFI (including a limited FFI or an FFI related to a Reporting IGA FFI other than a deemed-compliant FFI, participating FFI, or exempt beneficial owner)  - 2: Participating FFI  - 3: Reporting Model 1 FFI  - 4: Reporting Model 2 FFI  - 5: Registered deemed-compliant FFI (other than a reporting Model 1 FFI, sponsored FFI, or nonreporting IGA FFI covered in Part XII)  - 6: Sponsored FFI that has not obtained a GIIN  - 7: Certified deemed-compliant nonregistering local bank  - 8: Certified deemed-compliant FFI with only low-value accounts  - 9: Certified deemed-compliant sponsored, closely held investment vehicle  - 10: Certified deemed-compliant limited life debt investment entity  - 11: Certified deemed-compliant investment advisors and investment managers  - 12: Owner-documented FFI  - 13: Restricted distributor  - 14: Nonreporting IGA FFI  - 15: Foreign government, government of a U.S. possession, or foreign central bank of issue  - 16: International organization  - 17: Exempt retirement plans  - 18: Entity wholly owned by exempt beneficial owners  - 19: Territory financial institution  - 20: Nonfinancial group entity  - 21: Excepted nonfinancial start-up company  - 22: Excepted nonfinancial entity in liquidation or bankruptcy  - 23: 501(c) organization  - 24: Nonprofit organization  - 25: Publicly traded NFFE or NFFE affiliate of a publicly traded corporation  - 26: Excepted territory NFFE  - 27: Active NFFE  - 28: Passive NFFE  - 29: Excepted inter-affiliate FFI  - 30: Direct reporting NFFE  - 31: Sponsored direct reporting NFFE  - 32: Account that is not a financial account |  |
|**residenceAddress** | **String** | The residential address of the individual or entity. |  [optional] |
|**residenceCity** | **String** | The city of residence. |  [optional] |
|**residenceState** | **String** | The state of residence. |  [optional] |
|**residenceZip** | **String** | The ZIP code of the residence. |  [optional] |
|**residenceCountry** | **String** | The country of residence. |  |
|**residenceIsMailing** | **Boolean** | Indicates whether the residence address is the mailing address. |  [optional] |
|**mailingAddress** | **String** | The mailing address. |  [optional] |
|**mailingCity** | **String** | The city of the mailing address. |  [optional] |
|**mailingState** | **String** | The state of the mailing address. |  [optional] |
|**mailingZip** | **String** | The ZIP code of the mailing address. |  [optional] |
|**mailingCountry** | **String** | The country of the mailing address. |  |
|**giin** | **String** | The global intermediary identification number (GIIN). |  [optional] |
|**foreignTin** | **String** | The foreign taxpayer identification number (TIN). |  [optional] |
|**referenceNumber** | **String** | A reference number for the form. |  [optional] |
|**disregardedEntityFatcaStatus** | **String** | The FATCA status of disregarded entity or branch receiving payment.  Available values:  - 1: Limited Branch  - 2: U.S. Branch  - 3: Participating FFI  - 4: Reporting Model 1 FFI  - 5: Reporting Model 2 FFI |  [optional] |
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
|**ownerDocumentedFfiAuditorLetterCertification** | **Boolean** | Certifies that the FFI will provide an auditor’s letter and required owner reporting documentation  to confirm its status as an owner-documented FFI. |  [optional] |
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
|**igaModel** | **String** | The applicable IGA model.  Available values:  - 1: Model 1 IGA  - 2: Model 2 IGA |  [optional] |
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
|**signerName** | **String** | The name of the signer of the form. |  [optional] |
|**makingTreatyClaim** | **Boolean** | Indicates whether the entity is making a treaty claim. |  [optional] |
|**foreignTinNotRequired** | **Boolean** | Indicates whether a foreign TIN is not legally required. |  [optional] |
|**treatyCountryCertification** | **Boolean** | Certifies the beneficial owner&#39;s country under the U.S. tax treaty. |  [optional] |
|**treatyCountry** | **String** | The country for which the treaty applies. |  [optional] |
|**benefitLimitationCertification** | **Boolean** | Certifies that the beneficial owner is eligible for treaty benefits and meets any limitation on benefits requirements. |  [optional] |
|**benefitLimitation** | **String** | The benefit limitation for tax treaty claims.  Available values:  - 1: Government  - 2: Tax exempt pension trust or pension fund  - 3: Other tax exempt organization  - 4: Publicly traded corporation  - 5: Subsidiary of a publicly traded corporation  - 6: Company that meets the ownership and base erosion test  - 7: Company that meets the derivative benefits test  - 8: Company with an item of income that meets active trade or business test  - 9: Favorable discretionary determination by the U.S. competent authority received  - 10: Other |  [optional] |
|**qualifiedResidentStatusCertification** | **Boolean** | Certifies that the beneficial owner claims treaty benefits and meets the qualified resident status for specific U.S. source income. |  [optional] |
|**treatyArticle** | **String** | The specific article of the treaty being claimed. |  [optional] |
|**withholdingRate** | **String** | The withholding rate applied as per the treaty. |  [optional] |
|**incomeType** | **String** | The type of income covered by the treaty. |  [optional] |
|**treatyReasons** | **String** | The reasons for claiming treaty benefits. |  [optional] |
|**ownerDocumentedFfiTrustBeneficiariesCertification** | **Boolean** | Certifies that the trust has no contingent or unidentified beneficiaries or designated classes of beneficiaries. |  [optional] |
|**nonCommercialFinancialActivityCertification** | **Boolean** | Certifies that the entity is the beneficial owner and is not engaged in commercial financial activities related  to the specified payments, accounts or obligations for which this form is submitted. |  [optional] |
|**internationOrganizationCertification** | **Boolean** | Certifies that the entity is an international organization described in section 7701(a)(18). |  [optional] |
|**intergovernmentalOrganizationCertification** | **Boolean** | Certifies that the entity is an intergovernmental or supranational organization primarily comprised of foreign governments,  is the beneficial owner, and is not engaged in commercial financial activities. |  [optional] |
|**exemptBeneficialOwnerOwnedInvestmentEntityCertification** | **Boolean** | Certifies that the entity is an investment entity wholly owned by exempt beneficial owners and has provided complete ownership  and documentation details as required under FATCA regulations. |  [optional] |
|**section501COrganizationCertification** | **Boolean** | Certifies that the entity is a section 501(c) organization based on a valid IRS determination letter  or a legal opinion from U.S. counsel. |  [optional] |
|**determinationLetterDate** | **LocalDate** | The date of the IRS determination letter confirming the entity’s section 501(c) status. |  [optional] |
|**nonprofitOrganizationCertification** | **Boolean** | Certifies that the entity is a nonprofit organization established for charitable or similar purposes, exempt from income tax,  and restricted in the use and distribution of its assets under applicable law. |  [optional] |
|**passiveNffeNoSubstantialUsOwnersCertification** | **Boolean** | Certifies that the passive NFFE has no substantial U.S. owners or controlling U.S. persons. |  [optional] |
|**passiveNffeSubstantialUsOwnersProvidedCertification** | **Boolean** | Certifies that the passive NFFE has provided the name, address, and TIN of each substantial U.S. owner or controlling U.S. person. |  [optional] |
|**exceptedInterAffiliateFfiCertification** | **Boolean** | Certifies that the entity is an inter-affiliate FFI meeting all conditions for exemption,  including limited account activity and payment interactions within its expanded affiliated group. |  [optional] |
|**substantialUsOwners** | [**List&lt;SubstantialUsOwnerRequest&gt;**](SubstantialUsOwnerRequest.md) | The list of substantial U.S. owners of passive NFFE. |  [optional] |
|**capacityToSignCertification** | **Boolean** | Certifies signer has the capacity to sign for the beneficial owner. |  [optional] |
|**birthday** | **LocalDate** | The birthday of the individual associated with the form. |  [optional] |
|**employeeFirstName** | **String** | The first name of the employee. |  |
|**employeeMiddleName** | **String** | The middle name of the employee. |  [optional] |
|**employeeLastName** | **String** | The last name of the employee. |  |
|**employeeNameSuffix** | **String** | The name suffix of the employee. |  [optional] |
|**maritalStatus** | [**MaritalStatusEnum**](#MaritalStatusEnum) | The marital status of the employee. Required unless exempt.  Available values:  - Single: Single or Married filing separately  - Married: Married filing jointly or qualifying surviving spouse  - MarriedBut: Head of household. Check only if you&#39;re unmarried and pay more than half the costs of keeping up a home for yourself and a qualifying individual. |  [optional] |
|**lastNameDiffers** | **Boolean** | Indicates whether the last name differs from prior records. |  [optional] |
|**numAllowances** | **Integer** | The number of allowances claimed by the employee. |  [optional] |
|**otherDependents** | **Integer** | The number of dependents other than allowances. |  [optional] |
|**nonJobIncome** | **Float** | The amount of non-job income. |  [optional] |
|**deductions** | **Float** | The amount of deductions claimed. |  [optional] |
|**additionalWithheld** | **Float** | The additional amount withheld. |  [optional] |
|**exemptFromWithholding** | **Boolean** | Indicates whether the employee is exempt from withholding. |  [optional] |
|**officeCode** | **String** | The office code associated with the form. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| W4 | &quot;W4&quot; |
| W8_BEN | &quot;W8Ben&quot; |
| W8_BEN_E | &quot;W8BenE&quot; |
| W8_IMY | &quot;W8Imy&quot; |
| W9 | &quot;W9&quot; |



## Enum: BusinessClassificationEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;Individual&quot; |
| C_CORPORATION | &quot;CCorporation&quot; |
| S_CORPORATION | &quot;SCorporation&quot; |
| PARTNERSHIP | &quot;Partnership&quot; |
| TRUST_ESTATE | &quot;TrustEstate&quot; |
| LLC_C | &quot;LlcC&quot; |
| LLC_S | &quot;LlcS&quot; |
| LLC_P | &quot;LlcP&quot; |
| OTHER | &quot;Other&quot; |



## Enum: StateEnum

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



## Enum: MaritalStatusEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;Single&quot; |
| MARRIED | &quot;Married&quot; |
| MARRIED_BUT | &quot;MarriedBut&quot; |



