

# Form1099RResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grossDistribution** | **Double** | Gross distribution |  [optional] |
|**taxableAmount** | **Double** | Taxable amount |  [optional] |
|**taxableAmountNotDetermined** | **Boolean** | Taxable amount not determined |  [optional] |
|**totalDistributionDetermined** | **Boolean** | Total distribution |  [optional] |
|**capitalGain** | **Double** | Capital gain (included in Box 2a) |  [optional] |
|**federalIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**employeeContributionsOrDesignatedRothOrInsurancePremiums** | **Double** | Employee contributions/Designated Roth contributions or insurance premiums |  [optional] |
|**netUnrealizedAppreciationInEmployerSecurities** | **Double** | Net unrealized appreciation in employer&#39;s securities |  [optional] |
|**distributionCode** | **String** | Distribution code |  [optional] |
|**secondDistributionCode** | **String** | Second distribution code |  [optional] |
|**iraSepSimple** | **Boolean** | IRA/SEP/SIMPLE |  [optional] |
|**traditionalIraSepSimpleOrRothConversionAmount** | **Double** | Traditional IRA/SEP/SIMPLE or Roth conversion amount |  [optional] |
|**otherAmount** | **Double** | Other amount |  [optional] |
|**otherPercentage** | **String** | Other percentage |  [optional] |
|**totalDistributionPercentage** | **String** | Total distribution percentage |  [optional] |
|**totalEmployeeContributions** | **Double** | Total employee contributions |  [optional] |
|**amountAllocableToIrrWithin5Years** | **Double** | Amount allocable to IRR within 5 years |  [optional] |
|**firstYearOfDesignatedRothContribution** | **String** | First year of designated Roth contribution |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | FATCA filing requirement |  [optional] |
|**dateOfPayment** | **OffsetDateTime** | Date of payment |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingResponse**](StateAndLocalWithholdingResponse.md) |  |  [optional] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**issuerId** | **String** |  |  [optional] |
|**issuerReferenceId** | **String** |  |  [optional] |
|**issuerTin** | **String** |  |  [optional] |
|**taxYear** | **Integer** |  |  [optional] |
|**referenceId** | **String** |  |  [optional] |
|**recipientName** | **String** |  |  [optional] |
|**recipientTin** | **String** |  |  [optional] |
|**recipientSecondName** | **String** |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**address2** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**zip** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**accountNumber** | **String** |  |  [optional] |
|**officeCode** | **String** |  |  [optional] |
|**nonUsProvince** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**federalEFile** | **Boolean** |  |  [optional] |
|**postalMail** | **Boolean** |  |  [optional] |
|**stateEFile** | **Boolean** |  |  [optional] |
|**tinMatch** | **Boolean** |  |  [optional] |
|**noTin** | **Boolean** |  |  [optional] |
|**secondTinNotice** | **Boolean** |  |  [optional] |
|**addressVerification** | **Boolean** |  |  [optional] |
|**federalEfileStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**eDeliveryStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetailResponse&gt;**](StateEfileStatusDetailResponse.md) |  |  [optional] |
|**postalMailStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**tinMatchStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**addressVerificationStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**validationErrors** | [**List&lt;ValidationErrorResponse&gt;**](ValidationErrorResponse.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| _1099_NEC | &quot;1099-NEC&quot; |
| _1099_MISC | &quot;1099-MISC&quot; |
| _1099_DIV | &quot;1099-DIV&quot; |
| _1099_R | &quot;1099-R&quot; |
| _1099_K | &quot;1099-K&quot; |
| _1095_B | &quot;1095-B&quot; |
| _1042_S | &quot;1042-S&quot; |
| _1095_C | &quot;1095-C&quot; |
| _1099_INT | &quot;1099-INT&quot; |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



