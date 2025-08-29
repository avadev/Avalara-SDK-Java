

# CreateAndSendW9FormEmailRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type. |  [optional] [readonly] |
|**email** | **String** | The email address of the individual associated with the form. |  |
|**employeeFirstName** | **String** | The first name of the employee. |  |
|**employeeLastName** | **String** | The last name of the employee. |  |
|**officeCode** | **String** | The office code associated with the form. |  [optional] |
|**companyId** | **String** | The ID of the associated company. |  |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |
|**name** | **String** | The name of the individual or entity associated with the form. |  |
|**referenceNumber** | **String** | A reference number for the form. |  [optional] |
|**accountNumber** | **String** | The account number associated with the form. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| W4 | &quot;W4&quot; |
| W8_BEN | &quot;W8Ben&quot; |
| W8_BEN_E | &quot;W8BenE&quot; |
| W8_IMY | &quot;W8Imy&quot; |
| W9 | &quot;W9&quot; |



