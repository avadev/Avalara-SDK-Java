

# IW9FormDataModelsOneOf

Interface representing a union of W4FormDataModel, W8BeneFormDataModel, W8BenFormDataModel, W8ImyFormDataModel, or W9FormDataModel.  Used only for OpenAPI documentation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of the form, always W9 for this model. |  [optional] [readonly] |
|**signedDate** | **OffsetDateTime** | The date the form was signed. |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation date of the form. |  [optional] |
|**employeeFirstName** | **String** | The first name of the employee. |  [optional] |
|**employeeMiddleName** | **String** | The middle name of the employee. |  [optional] |
|**employeeLastName** | **String** | The last name of the employee. |  [optional] |
|**employeeNameSuffix** | **String** | The name suffix of the employee. |  [optional] |
|**address** | **String** | The address of the employee. |  [optional] |
|**city** | **String** | The city of residence of the employee. |  [optional] |
|**state** | **String** | The state of residence of the employee. |  [optional] |
|**zip** | **String** | The ZIP code of residence of the employee. |  [optional] |
|**typeOfTin** | **String** | The type of TIN provided. |  [optional] |
|**tin** | **String** | The taxpayer identification number (TIN) of the employee. |  [optional] |
|**box3MaritalStatus** | **String** | The marital status of the employee. |  [optional] |
|**box4LastNameDiffers** | **Boolean** | Indicates whether the last name differs from prior records. |  [optional] |
|**box5NumAllowances** | **Integer** | The number of allowances claimed by the employee. |  [optional] |
|**otherDependents** | **Integer** | The number of dependents other than allowances. |  [optional] |
|**nonJobIncome** | **Double** | The amount of non-job income. |  [optional] |
|**deductions** | **Double** | The amount of deductions claimed. |  [optional] |
|**box6AdditionalWithheld** | **Double** | The additional amount withheld. |  [optional] |
|**box7ExemptFromWithholding** | **Boolean** | Indicates whether the employee is exempt from withholding. |  [optional] |
|**officeCode** | **String** | The office code associated with the form. |  [optional] |
|**eDeliveryConsentedAt** | **OffsetDateTime** | The date when e-delivery was consented. |  [optional] |
|**disregardedEntityChapter4FatcaStatus** | **String** | The FATCA status for disregarded entities under Chapter 4. |  [optional] |
|**name** | **String** | The name of the individual or entity associated with the form. |  [optional] |
|**residenceAddress** | **String** | The residential address of the individual or entity. |  [optional] |
|**residenceCity** | **String** | The city of residence. |  [optional] |
|**residenceState** | **String** | The state of residence. |  [optional] |
|**residencePostalCode** | **String** | The postal code of the residence. |  [optional] |
|**residenceCountry** | **String** | The country of residence. |  [optional] |
|**mailingAddress** | **String** | The mailing address. |  [optional] |
|**mailingCity** | **String** | The city of the mailing address. |  [optional] |
|**mailingState** | **String** | The state of the mailing address. |  [optional] |
|**mailingPostalCode** | **String** | The postal code of the mailing address. |  [optional] |
|**mailingCountry** | **String** | The country of the mailing address. |  [optional] |
|**disregardedAddress** | **String** | The address for disregarded entities. |  [optional] |
|**disregardedCity** | **String** | The city for disregarded entities. |  [optional] |
|**disregardedState** | **String** | The state for disregarded entities. |  [optional] |
|**disregardedPostalCode** | **String** | The postal code for disregarded entities. |  [optional] |
|**disregardedCountry** | **String** | The country for disregarded entities. |  [optional] |
|**foreignTin** | **String** | The foreign taxpayer identification number (TIN). |  [optional] |
|**ftinNotRequired** | **Boolean** | Indicates whether a foreign TIN is not required. |  [optional] |
|**referenceNumber** | **String** | A reference number for the form. |  [optional] |
|**giin** | **String** | The global intermediary identification number (GIIN). |  [optional] |
|**chapter3EntityType** | **String** | The Chapter 3 entity type. |  [optional] |
|**chapter4FatcaStatus** | **String** | The Chapter 4 FATCA status. |  [optional] |
|**disregardedEntity** | **String** | The disregarded entity information. |  [optional] |
|**disregardedEntityGiin** | **String** | The GIIN for disregarded entities. |  [optional] |
|**benefitLimitation** | **String** | The benefit limitation for tax treaty claims. |  [optional] |
|**part4SponsoringEntity** | **String** | The sponsoring entity information for Part 4. |  [optional] |
|**part4SponsoringEntityGiin** | **String** | The GIIN for the sponsoring entity in Part 4. |  [optional] |
|**part7SponsoringEntity** | **String** | The sponsoring entity information for Part 7. |  [optional] |
|**part12IgaCountry** | **String** | The IGA country information for Part 12. |  [optional] |
|**part12IgaType** | **String** | The IGA type information for Part 12. |  [optional] |
|**part12FatcaStatusUnderIgaAnnexIi** | **String** | The FATCA status under IGA Annex II for Part 12. |  [optional] |
|**part12TrusteeName** | **String** | The trustee name for Part 12. |  [optional] |
|**part12TrusteeIsForeign** | **Boolean** | Indicates whether the trustee is foreign for Part 12. |  [optional] |
|**part12Model2IgaGiin** | **String** | The GIIN for Model 2 IGA in Part 12. |  [optional] |
|**box37AExchange** | **String** | The exchange information for Box 37A. |  [optional] |
|**box37BExchange** | **String** | The exchange information for Box 37B. |  [optional] |
|**box37BEntity** | **String** | The entity information for Box 37B. |  [optional] |
|**part28SponsoringEntity** | **String** | The sponsoring entity information for Part 28. |  [optional] |
|**part28SponsoringEntityGiin** | **String** | The GIIN for the sponsoring entity in Part 28. |  [optional] |
|**signerName** | **String** | The name of the signer of the form. |  [optional] |
|**residenceIsMailing** | **Boolean** | Indicates whether the residence address is also the mailing address. |  [optional] |
|**citizenshipCountry** | **String** | The country of citizenship. |  [optional] |
|**makingTreatyClaim** | **Boolean** |  |  [optional] |
|**treatyCountry** | **String** | The country for which the treaty applies. |  [optional] |
|**treatyArticle** | **String** | The specific article of the treaty being claimed. |  [optional] |
|**withholdingRate** | **String** | The withholding rate applied as per the treaty. |  [optional] |
|**incomeType** | **String** | The type of income covered by the treaty. |  [optional] |
|**treatyReasons** | **String** | The reasons for claiming treaty benefits. |  [optional] |
|**certifyBox14A** | **Boolean** |  |  [optional] |
|**certifyBox14B** | **Boolean** |  |  [optional] |
|**certifyBox14C** | **Boolean** |  |  [optional] |
|**certifyBox171** | **Boolean** |  |  [optional] |
|**certifyBox172** | **Boolean** |  |  [optional] |
|**certifyBox18** | **Boolean** |  |  [optional] |
|**certifyBox19** | **Boolean** |  |  [optional] |
|**certifyBox21** | **Boolean** |  |  [optional] |
|**certifyBox22** | **Boolean** | Indicates certification for box 22. |  [optional] |
|**certifyBox23** | **Boolean** |  |  [optional] |
|**certifyBox24A** | **Boolean** | Indicates certification for box 24A. |  [optional] |
|**certifyBox24B** | **Boolean** | Indicates certification for box 24B. |  [optional] |
|**certifyBox24C** | **Boolean** | Indicates certification for box 24C. |  [optional] |
|**certifyBox24D** | **Boolean** |  |  [optional] |
|**certifyBox25A** | **Boolean** |  |  [optional] |
|**certifyBox25B** | **Boolean** |  |  [optional] |
|**certifyBox25C** | **Boolean** |  |  [optional] |
|**certifyBox26** | **Boolean** | Indicates certification for box 26. |  [optional] |
|**certifyBox27** | **Boolean** |  |  [optional] |
|**certifyBox28A** | **Boolean** |  |  [optional] |
|**certifyBox28B** | **Boolean** |  |  [optional] |
|**certifyBox29A** | **Boolean** |  |  [optional] |
|**certifyBox29B** | **Boolean** |  |  [optional] |
|**certifyBox29C** | **Boolean** |  |  [optional] |
|**certifyBox29D** | **Boolean** |  |  [optional] |
|**certifyBox29E** | **Boolean** |  |  [optional] |
|**certifyBox29F** | **Boolean** |  |  [optional] |
|**certifyBox30** | **Boolean** |  |  [optional] |
|**certifyBox31** | **Boolean** | Indicates certification for box 31. |  [optional] |
|**certifyBox32** | **Boolean** | Indicates certification for box 32. |  [optional] |
|**certifyBox33** | **Boolean** |  |  [optional] |
|**certifyBox34** | **Boolean** | Indicates certification for box 34. |  [optional] |
|**certifyBox35** | **Boolean** | Indicates certification for box 35. |  [optional] |
|**certifyBox36** | **Boolean** | Indicates certification for box 36. |  [optional] |
|**certifyBox37A** | **Boolean** | Indicates certification for box 37A. |  [optional] |
|**certifyBox37B** | **Boolean** | Indicates certification for box 37B. |  [optional] |
|**certifyBox38** | **Boolean** | Indicates certification for box 38. |  [optional] |
|**certifyBox39** | **Boolean** | Indicates certification for box 39. |  [optional] |
|**certifyBox40A** | **Boolean** |  |  [optional] |
|**certifyBox40B** | **Boolean** |  |  [optional] |
|**certifyBox40C** | **Boolean** |  |  [optional] |
|**certifyBox41** | **Boolean** |  |  [optional] |
|**certifyBox43** | **Boolean** |  |  [optional] |
|**certifyPart29Signature** | **Boolean** |  |  [optional] |
|**part19FormationOrResolutionDate** | **OffsetDateTime** |  |  [optional] |
|**part20FilingDate** | **OffsetDateTime** |  |  [optional] |
|**part21DeterminationDate** | **OffsetDateTime** |  |  [optional] |
|**substantialUsOwners** | [**List&lt;W8BenESubstantialUsOwnerDataModel&gt;**](W8BenESubstantialUsOwnerDataModel.md) |  |  [optional] |
|**birthday** | **String** | The birthday of the individual associated with the form. |  [optional] |
|**foreignTinNotRequired** | **Boolean** | Indicates whether a foreign TIN is not required. |  [optional] |
|**archived** | **Boolean** | Indicates whether the form is archived. |  [optional] |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |
|**companyId** | **Integer** | The ID of the associated company. |  [optional] |
|**displayName** | **String** | The display name associated with the form. |  [optional] |
|**email** | **String** | The email address of the individual associated with the form. |  [optional] |
|**signerCapacity** | **String** | The capacity in which the signer is signing the form. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last updated date of the form. |  [optional] |
|**ein** | **String** | The employer identification number (EIN). |  [optional] |
|**einType** | **String** | The type of employer identification number (EIN). |  [optional] |
|**certifyBox14** | **Boolean** | Indicates certification for box 14. |  [optional] |
|**certifyBox15A** | **Boolean** | Indicates certification for box 15A. |  [optional] |
|**certifyBox15B** | **Boolean** | Indicates certification for box 15B. |  [optional] |
|**certifyBox15C** | **Boolean** | Indicates certification for box 15C. |  [optional] |
|**certifyBox15D** | **Boolean** | Indicates certification for box 15D. |  [optional] |
|**certifyBox15E** | **Boolean** | Indicates certification for box 15E. |  [optional] |
|**certifyBox15F** | **Boolean** | Indicates certification for box 15F. |  [optional] |
|**certifyBox15G** | **Boolean** | Indicates certification for box 15G. |  [optional] |
|**certifyBox15H** | **Boolean** | Indicates certification for box 15H. |  [optional] |
|**certifyBox15I** | **Boolean** | Indicates certification for box 15I. |  [optional] |
|**certifyBox16A** | **Boolean** | Indicates certification for box 16A. |  [optional] |
|**box16BQddCorporate** | **Boolean** | Indicates certification for box 16B as a QDD corporate entity. |  [optional] |
|**box16BQddPartnership** | **Boolean** | Indicates certification for box 16B as a QDD partnership. |  [optional] |
|**box16BQddDisregardedEntity** | **Boolean** | Indicates certification for box 16B as a QDD disregarded entity. |  [optional] |
|**certifyBox17A** | **Boolean** | Indicates certification for box 17A. |  [optional] |
|**certifyBox17B** | **Boolean** | Indicates certification for box 17B. |  [optional] |
|**certifyBox17C** | **Boolean** | Indicates certification for box 17C. |  [optional] |
|**certifyBox17D** | **Boolean** | Indicates certification for box 17D. |  [optional] |
|**certifyBox17E** | **Boolean** | Indicates certification for box 17E. |  [optional] |
|**certifyBox18A** | **Boolean** | Indicates certification for box 18A. |  [optional] |
|**certifyBox18B** | **Boolean** | Indicates certification for box 18B. |  [optional] |
|**certifyBox18C** | **Boolean** | Indicates certification for box 18C. |  [optional] |
|**certifyBox18D** | **Boolean** | Indicates certification for box 18D. |  [optional] |
|**certifyBox18E** | **Boolean** | Indicates certification for box 18E. |  [optional] |
|**certifyBox18F** | **Boolean** | Indicates certification for box 18F. |  [optional] |
|**certifyBox19A** | **Boolean** | Indicates certification for box 19A. |  [optional] |
|**certifyBox19B** | **Boolean** | Indicates certification for box 19B. |  [optional] |
|**certifyBox19C** | **Boolean** | Indicates certification for box 19C. |  [optional] |
|**certifyBox19D** | **Boolean** | Indicates certification for box 19D. |  [optional] |
|**certifyBox19E** | **Boolean** | Indicates certification for box 19E. |  [optional] |
|**certifyBox19F** | **Boolean** | Indicates certification for box 19F. |  [optional] |
|**certifyBox20** | **Boolean** | Indicates certification for box 20. |  [optional] |
|**certifyBox21A** | **Boolean** | Indicates certification for box 21A. |  [optional] |
|**certifyBox21B** | **Boolean** | Indicates certification for box 21B. |  [optional] |
|**certifyBox21C** | **Boolean** | Indicates certification for box 21C. |  [optional] |
|**certifyBox21D** | **Boolean** | Indicates certification for box 21D. |  [optional] |
|**certifyBox21E** | **Boolean** | Indicates certification for box 21E. |  [optional] |
|**certifyBox21F** | **Boolean** | Indicates certification for box 21F. |  [optional] |
|**box23ANameSponsoringEntity** | **String** | The name of the sponsoring entity for box 23A. |  [optional] |
|**certifyBox23B** | **Boolean** | Indicates certification for box 23B. |  [optional] |
|**certifyBox23C** | **Boolean** | Indicates certification for box 23C. |  [optional] |
|**certifyBox25** | **Boolean** | Indicates certification for box 25. |  [optional] |
|**box27ANameSponsoringEntity** | **String** | The name of the sponsoring entity for box 27A. |  [optional] |
|**certifyBox27B** | **Boolean** | Indicates certification for box 27B. |  [optional] |
|**certifyBox28** | **Boolean** | Indicates certification for box 28. |  [optional] |
|**certifyBox29** | **Boolean** | Indicates certification for box 29. |  [optional] |
|**certifyBox30A** | **Boolean** | Indicates certification for box 30A. |  [optional] |
|**certifyBox30B** | **Boolean** | Indicates certification for box 30B. |  [optional] |
|**certifyBox30C** | **Boolean** | Indicates certification for box 30C. |  [optional] |
|**box32IgaCountry** | **String** | The IGA country information for box 32. |  [optional] |
|**box32IgaType** | **String** | The IGA type information for box 32. |  [optional] |
|**box32IgaTreatedAs** | **String** | The IGA treatment information for box 32. |  [optional] |
|**box32TrusteeOrSponsor** | **String** | The trustee or sponsor information for box 32. |  [optional] |
|**box32TrusteeIsForeign** | **Boolean** | Indicates whether the trustee is foreign for box 32. |  [optional] |
|**certifyBox33A** | **Boolean** | Indicates certification for box 33A. |  [optional] |
|**certifyBox33B** | **Boolean** | Indicates certification for box 33B. |  [optional] |
|**certifyBox33C** | **Boolean** | Indicates certification for box 33C. |  [optional] |
|**certifyBox33D** | **Boolean** | Indicates certification for box 33D. |  [optional] |
|**certifyBox33E** | **Boolean** | Indicates certification for box 33E. |  [optional] |
|**certifyBox33F** | **Boolean** | Indicates certification for box 33F. |  [optional] |
|**box37ASecuritiesMarket** | **String** | The securities market information for box 37A. |  [optional] |
|**box37BNameOfEntity** | **String** | The name of the entity for box 37B. |  [optional] |
|**box37BSecuritiesMarket** | **String** | The securities market information for box 37B. |  [optional] |
|**certifyBox40** | **Boolean** | Indicates certification for box 40. |  [optional] |
|**box41SponsoringEntity** | **String** | The sponsoring entity information for box 41. |  [optional] |
|**certifyBox42** | **Boolean** | Indicates certification for box 42. |  [optional] |
|**box35FormedOnDate** | **OffsetDateTime** |  |  [optional] |
|**box36FiledOnDate** | **OffsetDateTime** |  |  [optional] |
|**tinMatchStatus** | **String** | The status of the TIN match. |  [optional] |
|**signature** | **String** | The signature itself |  [optional] |
|**businessClassification** | **String** | The classification of the business. |  [optional] |
|**businessName** | **String** | The name of the business associated with the form. |  [optional] |
|**businessOther** | **String** |  |  [optional] |
|**exemptPayeeCode** | **String** |  |  [optional] |
|**exemptFatcaCode** | **String** |  |  [optional] |
|**accountNumber** | **String** | The account number associated with the form. |  [optional] |
|**foreignCountryIndicator** | **Boolean** | Indicates whether the individual or entity is in a foreign country. |  [optional] |
|**foreignAddress** | **String** | The foreign address of the individual or entity. |  [optional] |
|**backupWithholding** | **Boolean** | Indicates whether backup withholding applies. |  [optional] |
|**is1099able** | **Boolean** |  |  [optional] |
|**foreignPartnerOwnerOrBeneficiary** | **Boolean** | Indicates whether the individual is a foreign partner, owner, or beneficiary. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| W9 | &quot;w9&quot; |
| W4 | &quot;w4&quot; |
| W8IMY | &quot;w8imy&quot; |
| W8BEN | &quot;w8ben&quot; |
| W8BENE | &quot;w8bene&quot; |



