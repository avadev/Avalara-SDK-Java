

# W4FormMinimalRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;w4\&quot; for this model). |  [optional] [readonly] |
|**email** | **String** | The email address of the individual associated with the form. |  |
|**employeeFirstName** | **String** | The first name of the employee. |  |
|**employeeLastName** | **String** | The last name of the employee. |  |
|**officeCode** | **String** | The office code associated with the form. |  [optional] |
|**companyId** | **String** | The ID of the associated company. Required when creating a form. |  [optional] |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| W4 | &quot;W4&quot; |
| W8_BEN | &quot;W8Ben&quot; |
| W8_BEN_E | &quot;W8BenE&quot; |
| W8_IMY | &quot;W8Imy&quot; |
| W9 | &quot;W9&quot; |



