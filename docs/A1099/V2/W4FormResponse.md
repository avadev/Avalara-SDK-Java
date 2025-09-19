

# W4FormResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;W4\&quot; for this model). |  [optional] [readonly] |
|**employeeFirstName** | **String** | The first name of the employee. |  [optional] |
|**employeeMiddleName** | **String** | The middle name of the employee. |  [optional] |
|**employeeLastName** | **String** | The last name of the employee. |  [optional] |
|**employeeNameSuffix** | **String** | The name suffix of the employee. |  [optional] |
|**tinType** | **String** | Tax Identification Number (TIN) type. |  [optional] |
|**tin** | **String** | The taxpayer identification number (TIN). |  [optional] |
|**address** | **String** | The address of the employee. |  [optional] |
|**city** | **String** | The city of residence of the employee. |  [optional] |
|**state** | **String** | The state of residence of the employee. |  [optional] |
|**zip** | **String** | The ZIP code of residence of the employee. |  [optional] |
|**maritalStatus** | **String** | The marital status of the employee. |  [optional] |
|**lastNameDiffers** | **Boolean** | Indicates whether the last name differs from prior records. |  [optional] |
|**numAllowances** | **Integer** | The number of allowances claimed by the employee. |  [optional] |
|**otherDependents** | **Integer** | The number of dependents other than allowances. |  [optional] |
|**nonJobIncome** | **Float** | The amount of non-job income. |  [optional] |
|**deductions** | **Float** | The amount of deductions claimed. |  [optional] |
|**additionalWithheld** | **Float** | The additional amount withheld. |  [optional] |
|**exemptFromWithholding** | **Boolean** | Indicates whether the employee is exempt from withholding. |  [optional] |
|**officeCode** | **String** | The office code associated with the form. |  [optional] |
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



