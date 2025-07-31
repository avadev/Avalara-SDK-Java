

# Form1099RRequest


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
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**issuerId** | **String** | Issuer ID |  [optional] |
|**referenceId** | **String** | Reference ID |  [optional] |
|**recipientTin** | **String** | Recipient Tax ID Number |  [optional] |
|**recipientName** | **String** | Recipient name |  [optional] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address |  |
|**address2** | **String** | Address line 2 |  [optional] |
|**city** | **String** | City |  |
|**state** | **String** | US state. Required if CountryCode is \&quot;US\&quot;. |  [optional] |
|**zip** | **String** | Zip/postal code |  [optional] |
|**email** | **String** | Recipient email address |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**officeCode** | **String** | Office code |  [optional] |
|**nonUsProvince** | **String** | Foreign province |  [optional] |
|**countryCode** | **String** | Country code, as defined at https://www.irs.gov/e-file-providers/country-codes |  |
|**federalEFile** | **Boolean** | Boolean indicating that federal e-filing should be scheduled for this form |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEFile** | **Boolean** | Boolean indicating that state e-filing should be scheduled for this form |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**noTin** | **Boolean** | Indicates whether the recipient has no TIN |  [optional] |
|**secondTinNotice** | **Boolean** | Second TIN notice in three years |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingRequest**](StateAndLocalWithholdingRequest.md) | State and local withholding information |  [optional] |



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



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



