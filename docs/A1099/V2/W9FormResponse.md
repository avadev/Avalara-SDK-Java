

# W9FormResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;W9\&quot; for this model). |  [optional] [readonly] |
|**name** | **String** | The name of the individual or entity associated with the form. |  [optional] |
|**businessName** | **String** | The name of the business associated with the form. |  [optional] |
|**businessClassification** | **String** | The classification of the business. |  [optional] |
|**businessOther** | **String** | The classification description when \&quot;businessClassification\&quot; is \&quot;Other\&quot;. |  [optional] |
|**foreignPartnerOwnerOrBeneficiary** | **Boolean** | Indicates whether the individual is a foreign partner, owner, or beneficiary. |  [optional] |
|**exemptPayeeCode** | **String** | The exempt payee code. |  [optional] |
|**exemptFatcaCode** | **String** | The exemption from FATCA reporting code. |  [optional] |
|**foreignCountryIndicator** | **Boolean** | Indicates whether the individual or entity is in a foreign country. |  [optional] |
|**address** | **String** | The address of the individual or entity. |  [optional] |
|**foreignAddress** | **String** | The foreign address of the individual or entity. |  [optional] |
|**city** | **String** | The city of the address. |  [optional] |
|**state** | **String** | The state of the address. |  [optional] |
|**zip** | **String** | The ZIP code of the address. |  [optional] |
|**accountNumber** | **String** | The account number associated with the form. |  [optional] |
|**tinType** | **String** | Recipient classification.  The platform is transitioning from tax identifier classifications to recipient entity classifications. New values represent recipient entity types and should be preferred. Deprecated values represent identifier formats and remain supported for backward compatibility only.  Available values: - INDIVIDUAL: Recipient is an individual - BUSINESS: Recipient is a business - UNKNOWN: Recipient classification is unknown - EIN: (Deprecated - use BUSINESS) Employer Identification Number - SSN: (Deprecated - use INDIVIDUAL) Social Security Number - ITIN: (Deprecated - use INDIVIDUAL) Individual Taxpayer Identification Number - ATIN: (Deprecated - use INDIVIDUAL) Adoption Taxpayer Identification Number |  [optional] |
|**tin** | **String** | The taxpayer identification number (TIN). |  [optional] |
|**backupWithholding** | **Boolean** | Indicates whether backup withholding applies. |  [optional] |
|**is1099able** | **Boolean** | Indicates whether the individual or entity should be issued a 1099 form. |  [optional] |
|**tinMatchStatus** | [**TinMatchStatusResponse**](TinMatchStatusResponse.md) | The TIN Match status from IRS. |  [optional] |
|**id** | **String** | The unique identifier for the form. |  [optional] |
|**entryStatus** | [**EntryStatusResponse**](EntryStatusResponse.md) | The entry status information for the form. |  [optional] |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |
|**companyId** | **String** | The ID of the associated company. |  [optional] |
|**displayName** | **String** | The display name associated with the form. |  [optional] |
|**email** | **String** | The email address of the individual associated with the form. |  [optional] |
|**archived** | **Boolean** | Indicates whether the form is archived. |  [optional] |
|**ancestorId** | **String** | Form ID of previous version. |  [optional] |
|**signature** | **String** | The signature of the form. |  [optional] |
|**signedDate** | **OffsetDateTime** | The date the form was signed. |  [optional] |
|**eDeliveryConsentedAt** | **OffsetDateTime** | The date when e-delivery was consented. |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation date of the form. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last updated date of the form. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| W4 | &quot;W4&quot; |
| W8_BEN | &quot;W8Ben&quot; |
| W8_BEN_E | &quot;W8BenE&quot; |
| W8_IMY | &quot;W8Imy&quot; |
| W9 | &quot;W9&quot; |



