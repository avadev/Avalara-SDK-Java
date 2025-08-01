

# W8BenEFormResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the individual or entity associated with the form. |  [optional] |
|**citizenshipCountry** | **String** | The country of citizenship. |  [optional] |
|**disregardedEntity** | **String** | The name of the disregarded entity receiving the payment (if applicable). |  [optional] |
|**entityType** | **String** | The entity type. |  [optional] |
|**makingTreatyClaim** | **Boolean** | Indicates whether the entity is making a treaty claim. |  [optional] |
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
|**foreignTinNotRequired** | **Boolean** | Indicates whether a foreign TIN is not required. |  [optional] |
|**foreignTin** | **String** | The foreign taxpayer identification number (TIN). |  [optional] |
|**referenceNumber** | **String** | A reference number for the form. |  [optional] |
|**disregardedEntityFatcaStatus** | **String** | The FATCA status of disregarded entity or branch receiving payment. |  [optional] |
|**disregardedAddress** | **String** | The address for disregarded entities. |  [optional] |
|**disregardedCity** | **String** | The city for disregarded entities. |  [optional] |
|**disregardedState** | **String** | The state for disregarded entities. |  [optional] |
|**disregardedZip** | **String** | The ZIP code for disregarded entities. |  [optional] |
|**disregardedCountry** | **String** | The country for disregarded entities. |  [optional] |
|**disregardedEntityGiin** | **String** | The GIIN for disregarded entities. |  [optional] |
|**treatyCountryCertification** | **Boolean** | Certifies the beneficial owner&#39;s country under the U.S. tax treaty. |  [optional] |
|**treatyCountry** | **String** | The treaty country of the beneficial owner. |  [optional] |
|**benefitLimitationCertification** | **Boolean** | Certifies that the beneficial owner is eligible for treaty benefits and meets any limitation on benefits requirements. |  [optional] |
|**benefitLimitation** | **String** | The benefit limitation for tax treaty claims. |  [optional] |
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
|**igaModel** | **String** | The applicable IGA model. |  [optional] |
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
|**substantialUsOwners** | [**List&lt;SubstantialUsOwnerResponse&gt;**](SubstantialUsOwnerResponse.md) | The list of substantial U.S. owners of passive NFFE. |  [optional] |
|**signerName** | **String** | The name of the signer. |  [optional] |
|**capacityToSignCertification** | **Boolean** | Certifies signer has the capacity to sign for the beneficial owner. |  [optional] |
|**id** | **String** | The unique identifier for the form. |  [optional] |
|**type** | **String** | The form type. |  [optional] |
|**entryStatus** | **String** | The form status. |  [optional] |
|**entryStatusDate** | **OffsetDateTime** | The timestamp for the latest status update. |  [optional] |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |
|**companyId** | **String** | The ID of the associated company. |  [optional] |
|**displayName** | **String** | The display name associated with the form. |  [optional] |
|**email** | **String** | The email address of the individual associated with the form. |  [optional] |
|**archived** | **Boolean** | Indicates whether the form is archived. |  [optional] |
|**signature** | **String** | The signature of the form. |  [optional] |
|**signedDate** | **OffsetDateTime** | The date the form was signed. |  [optional] |
|**eDeliveryConsentedAt** | **OffsetDateTime** | The date when e-delivery was consented. |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation date of the form. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last updated date of the form. |  [optional] |



