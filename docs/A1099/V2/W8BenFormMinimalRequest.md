

# W8BenFormMinimalRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;w8ben\&quot; for this model). |  [optional] [readonly] |
|**email** | **String** | The email address of the individual associated with the form. |  |
|**name** | **String** | The name of the individual or entity associated with the form. |  |
|**referenceNumber** | **String** | A reference number for the form. |  [optional] |
|**companyId** | **String** | The ID of the associated company. |  |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| W4 | &quot;W4&quot; |
| W8_BEN | &quot;W8Ben&quot; |
| W8_BEN_E | &quot;W8BenE&quot; |
| W8_IMY | &quot;W8Imy&quot; |
| W9 | &quot;W9&quot; |



