

# W8BenFormRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;w8ben\&quot; for this model). |  [optional] [readonly] |
|**name** | **String** | The name of the individual or entity associated with the form. |  [optional] |
|**citizenshipCountry** | **String** | The country of citizenship. |  [optional] |
|**residenceAddress** | **String** | The residential address of the individual or entity. |  [optional] |
|**residenceCity** | **String** | The city of residence. |  [optional] |
|**residenceState** | **String** | The state of residence. |  [optional] |
|**residenceZip** | **String** | The ZIP code of the residence. |  [optional] |
|**residenceCountry** | **String** | The country of residence. |  [optional] |
|**residenceIsMailing** | **Boolean** | Indicates whether the residence address is the mailing address. |  [optional] |
|**mailingAddress** | **String** | The mailing address. |  [optional] |
|**mailingCity** | **String** | The city of the mailing address. |  [optional] |
|**mailingState** | **String** | The state of the mailing address. |  [optional] |
|**mailingZip** | **String** | The ZIP code of the mailing address. |  [optional] |
|**mailingCountry** | **String** | The country of the mailing address. |  [optional] |
|**tin** | **String** | The taxpayer identification number (TIN). |  [optional] |
|**foreignTinNotRequired** | **Boolean** | Indicates whether a foreign TIN is not legally required. |  [optional] |
|**foreignTin** | **String** | The foreign taxpayer identification number (TIN). |  [optional] |
|**referenceNumber** | **String** | A reference number for the form. |  [optional] |
|**birthday** | **LocalDate** | The birthday of the individual associated with the form. |  [optional] |
|**treatyCountry** | **String** | The country for which the treaty applies. |  [optional] |
|**treatyArticle** | **String** | The specific article of the treaty being claimed. |  [optional] |
|**treatyReasons** | **String** | The reasons for claiming treaty benefits. |  [optional] |
|**withholdingRate** | **String** | The withholding rate applied as per the treaty. |  [optional] |
|**incomeType** | **String** | The type of income covered by the treaty. |  [optional] |
|**signerName** | **String** | The name of the signer of the form. |  [optional] |
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



