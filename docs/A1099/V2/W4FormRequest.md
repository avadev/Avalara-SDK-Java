

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
|**state** | [**StateEnum**](#StateEnum) | The state of residence of the employee. Required unless exempt. |  [optional] |
|**zip** | **String** | The ZIP code of residence of the employee. Required unless exempt. |  [optional] |
|**maritalStatus** | [**MaritalStatusEnum**](#MaritalStatusEnum) | The marital status of the employee. Required unless exempt.  Available values:  - Single: Single or Married filing separately  - Married: Married filing jointly or qualifying surviving spouse  - MarriedBut: Head of household. Check only if you&#39;re unmarried and pay more than half the costs of keeping up a home for yourself and a qualifying individual. |  [optional] |
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



## Enum: StateEnum

| Name | Value |
|---- | -----|
| AA | &quot;AA&quot; |
| AE | &quot;AE&quot; |
| AK | &quot;AK&quot; |
| AL | &quot;AL&quot; |
| AP | &quot;AP&quot; |
| AR | &quot;AR&quot; |
| AS | &quot;AS&quot; |
| AZ | &quot;AZ&quot; |
| CA | &quot;CA&quot; |
| CO | &quot;CO&quot; |
| CT | &quot;CT&quot; |
| DC | &quot;DC&quot; |
| DE | &quot;DE&quot; |
| FL | &quot;FL&quot; |
| FM | &quot;FM&quot; |
| GA | &quot;GA&quot; |
| GU | &quot;GU&quot; |
| HI | &quot;HI&quot; |
| IA | &quot;IA&quot; |
| ID | &quot;ID&quot; |
| IL | &quot;IL&quot; |
| IN | &quot;IN&quot; |
| KS | &quot;KS&quot; |
| KY | &quot;KY&quot; |
| LA | &quot;LA&quot; |
| MA | &quot;MA&quot; |
| MD | &quot;MD&quot; |
| ME | &quot;ME&quot; |
| MH | &quot;MH&quot; |
| MI | &quot;MI&quot; |
| MN | &quot;MN&quot; |
| MO | &quot;MO&quot; |
| MP | &quot;MP&quot; |
| MS | &quot;MS&quot; |
| MT | &quot;MT&quot; |
| NC | &quot;NC&quot; |
| ND | &quot;ND&quot; |
| NE | &quot;NE&quot; |
| NH | &quot;NH&quot; |
| NJ | &quot;NJ&quot; |
| NM | &quot;NM&quot; |
| NV | &quot;NV&quot; |
| NY | &quot;NY&quot; |
| OH | &quot;OH&quot; |
| OK | &quot;OK&quot; |
| OR | &quot;OR&quot; |
| PA | &quot;PA&quot; |
| PR | &quot;PR&quot; |
| PW | &quot;PW&quot; |
| RI | &quot;RI&quot; |
| SC | &quot;SC&quot; |
| SD | &quot;SD&quot; |
| TN | &quot;TN&quot; |
| TX | &quot;TX&quot; |
| UT | &quot;UT&quot; |
| VA | &quot;VA&quot; |
| VI | &quot;VI&quot; |
| VT | &quot;VT&quot; |
| WA | &quot;WA&quot; |
| WI | &quot;WI&quot; |
| WV | &quot;WV&quot; |
| WY | &quot;WY&quot; |



## Enum: MaritalStatusEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;Single&quot; |
| MARRIED | &quot;Married&quot; |
| MARRIED_BUT | &quot;MarriedBut&quot; |



