

# W4FormRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;w4\&quot; for this model). |  [optional] [readonly] |
|**employeeFirstName** | **String** | The first name of the employee. |  |
|**employeeMiddleName** | **String** | The middle name of the employee. |  [optional] |
|**employeeLastName** | **String** | The last name of the employee. |  |
|**employeeNameSuffix** | **String** | The name suffix of the employee. |  [optional] |
|**tinType** | **String** | Tax Identification Number (TIN) type. |  |
|**tin** | **String** | The taxpayer identification number (TIN). |  |
|**address** | **String** | The address of the employee. Required unless exempt. |  [optional] |
|**city** | **String** | The city of residence of the employee. Required unless exempt. |  [optional] |
|**state** | **String** | The state of residence of the employee. Required unless exempt. |  [optional] |
|**zip** | **String** | The ZIP code of residence of the employee. Required unless exempt. |  [optional] |
|**maritalStatus** | **String** | The marital status of the employee. Required unless exempt.  Available values:  - Single: Single or Married filing separately  - Married: Married filing jointly or qualifying surviving spouse  - MarriedBut: Head of household. Check only if you&#39;re unmarried and pay more than half the costs of keeping up a home for yourself and a qualifying individual. |  [optional] |
|**lastNameDiffers** | **Boolean** | Indicates whether the last name differs from prior records. |  [optional] |
|**numAllowances** | **Integer** | The number of allowances claimed by the employee. |  [optional] |
|**otherDependents** | **Integer** | The number of dependents other than allowances. |  [optional] |
|**nonJobIncome** | **Float** | The amount of non-job income. |  [optional] |
|**deductions** | **Float** | The amount of deductions claimed. |  [optional] |
|**additionalWithheld** | **Float** | The additional amount withheld. |  [optional] |
|**exemptFromWithholding** | **Boolean** | Indicates whether the employee is exempt from withholding. |  [optional] |
|**officeCode** | **String** | The office code associated with the form. |  [optional] |
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



