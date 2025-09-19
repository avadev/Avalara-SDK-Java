

# W9FormBaseResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type. |  [optional] [readonly] |
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



