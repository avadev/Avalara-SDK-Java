

# FormRequestModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**formType** | [**FormTypeEnum**](#FormTypeEnum) | \&quot;W9\&quot; is currently the only supported value |  [optional] |
|**companyId** | **Integer** | Track1099&#39;s ID of your company, found in the W-9 UI |  [optional] |
|**companyName** | **String** | Name of your company, set in the W-9 UI |  [optional] |
|**companyEmail** | **String** | Contact email of your company, set in the W-9 UI |  [optional] |
|**referenceId** | **String** | Your internal identifier for the vendor from whom you are requesting a form |  [optional] |
|**signedAt** | **OffsetDateTime** | The timestamp this vendor (identified by your ReferenceId) last signed a complete W-9, null if you did not include a ReferenceId or the vendor has not yet signed a W-9 in Track1099 |  [optional] |
|**tinMatchStatus** | [**TinMatchStatusEnum**](#TinMatchStatusEnum) | Result of IRS TIN match query for name and TIN in the last signed form, null if signed_at is null |  [optional] |
|**expiresAt** | **OffsetDateTime** | Timestamp when this FormRequest will expire, ttl (or 3600) seconds from creation |  [optional] |
|**signedPdf** | **String** | URL of PDF representation of just-signed form, otherwise null. Integrations may use this value to offer a \&quot;download for your records\&quot; function after a vendor completes and signs a form. Link expires at the same time as this FormRequest. Treat the format of this URL as opaque and expect it to change in the future. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FORM_REQUEST | &quot;FormRequest&quot; |



## Enum: FormTypeEnum

| Name | Value |
|---- | -----|
| W9 | &quot;W9&quot; |



## Enum: TinMatchStatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| MATCHED | &quot;Matched&quot; |



