

# W9FormRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;w9\&quot; for this model). |  [optional] [readonly] |
|**name** | **String** | The name of the individual or entity associated with the form. |  |
|**businessName** | **String** | The name of the business associated with the form. |  [optional] |
|**businessClassification** | **String** | The classification of the business.  Available values:  - Individual: Individual/sole proprietor  - C Corporation: C Corporation  - S Corporation: S Corporation  - Partnership: Partnership  - Trust/estate: Trust/estate  - LLC-C: Limited liability company (C Corporation)  - LLC-S: Limited liability company (S Corporation)  - LLC-P: Limited liability company (Partnership)  - Other: Other (requires BusinessOther field to be populated) |  |
|**businessOther** | **String** | The classification description when \&quot;businessClassification\&quot; is \&quot;Other\&quot;. |  [optional] |
|**foreignPartnerOwnerOrBeneficiary** | **Boolean** | Indicates whether the individual is a foreign partner, owner, or beneficiary. |  [optional] |
|**exemptPayeeCode** | **String** | The exempt payee code. |  [optional] |
|**exemptFatcaCode** | **String** | The exemption from FATCA reporting code. |  [optional] |
|**foreignCountryIndicator** | **Boolean** | Indicates whether the individual or entity is in a foreign country. |  [optional] |
|**address** | **String** | The address of the individual or entity. |  |
|**foreignAddress** | **String** | The foreign address of the individual or entity. |  [optional] |
|**city** | **String** | The city of the address. |  |
|**state** | **String** | The state of the address. |  |
|**zip** | **String** | The ZIP code of the address. |  |
|**accountNumber** | **String** | The account number associated with the form. |  [optional] |
|**tinType** | **String** | Tax Identification Number (TIN) type. SSN/ITIN (for individuals) and EIN (for businesses). |  |
|**tin** | **String** | The taxpayer identification number (TIN). |  |
|**backupWithholding** | **Boolean** | Indicates whether backup withholding applies. |  [optional] |
|**is1099able** | **Boolean** | Indicates whether the individual or entity should be issued a 1099 form. |  [optional] |
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



