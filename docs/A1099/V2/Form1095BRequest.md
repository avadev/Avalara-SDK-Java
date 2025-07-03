

# Form1095BRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeFirstName** | **String** |  |  [optional] |
|**employeeMiddleName** | **String** |  |  [optional] |
|**employeeLastName** | **String** |  |  [optional] |
|**employeeNameSuffix** | **String** |  |  [optional] |
|**employeeDateOfBirth** | **OffsetDateTime** |  |  [optional] |
|**originOfHealthCoverageCode** | [**OriginOfHealthCoverageCodeEnum**](#OriginOfHealthCoverageCodeEnum) |  |  [optional] |
|**coveredIndividuals** | [**List&lt;CoveredIndividualRequest&gt;**](CoveredIndividualRequest.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] [readonly] |
|**issuerId** | **String** |  |  [optional] |
|**referenceId** | **String** |  |  [optional] |
|**recipientName** | **String** |  |  [optional] |
|**recipientTin** | **String** |  |  [optional] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) |  |  [optional] |
|**recipientSecondName** | **String** |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**address2** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**zip** | **String** |  |  [optional] |
|**recipientEmail** | **String** |  |  [optional] |
|**accountNumber** | **String** |  |  [optional] |
|**officeCode** | **String** |  |  [optional] |
|**recipientNonUsProvince** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**federalEFile** | **Boolean** |  |  [optional] |
|**postalMail** | **Boolean** |  |  [optional] |
|**stateEFile** | **Boolean** |  |  [optional] |
|**tinMatch** | **Boolean** |  |  [optional] |
|**addressVerification** | **Boolean** |  |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingRequest**](StateAndLocalWithholdingRequest.md) |  |  [optional] |



## Enum: OriginOfHealthCoverageCodeEnum

| Name | Value |
|---- | -----|
| SMALL_BUSINESS_HEALTH_OPTIONS_PROGRAM | &quot;SmallBusinessHealthOptionsProgram&quot; |
| EMPLOYER_SPONSORED | &quot;EmployerSponsored&quot; |
| GOVERNMENT_SPONSORED | &quot;GovernmentSponsored&quot; |
| INDIVIDUAL_MARKET | &quot;IndividualMarket&quot; |
| MULTIEMPLOYER_PLAN | &quot;MultiemployerPlan&quot; |
| OTHER_DESIGNATED_MINIMUM_ESSENTIAL_COVERAGE | &quot;OtherDesignatedMinimumEssentialCoverage&quot; |
| EMPLOYER_SPONSORED_INDIVIDUAL_HRA | &quot;EmployerSponsoredIndividualHra&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FORM1099_NEC | &quot;Form1099Nec&quot; |
| FORM1099_MISC | &quot;Form1099Misc&quot; |
| FORM1099_DIV | &quot;Form1099Div&quot; |
| FORM1099_R | &quot;Form1099R&quot; |
| FORM1099_K | &quot;Form1099K&quot; |
| FORM1095_B | &quot;Form1095B&quot; |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



