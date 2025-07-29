

# Form1099RListItem


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
|**distributionCode** | [**DistributionCodeEnum**](#DistributionCodeEnum) | Distribution code |  [optional] |
|**secondDistributionCode** | [**SecondDistributionCodeEnum**](#SecondDistributionCodeEnum) | Second distribution code |  [optional] |
|**iraSepSimple** | **Boolean** | IRA/SEP/SIMPLE |  [optional] |
|**traditionalIraSepSimpleOrRothConversionAmount** | **Double** | Traditional IRA/SEP/SIMPLE or Roth conversion amount |  [optional] |
|**otherAmount** | **Double** | Other amount |  [optional] |
|**otherPercentage** | **String** | Other percentage |  [optional] |
|**totalDistributionPercentage** | **String** | Total distribution percentage |  [optional] |
|**totalEmployeeContributions** | **Double** | Total employee contributions |  [optional] |
|**amountAllocableToIrrWithin5Years** | **Double** | Amount allocable to IRR within 5 years |  [optional] |
|**firstYearOfDesignatedRothContribution** | **Integer** | First year of designated Roth contribution |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | FATCA filing requirement |  [optional] |
|**dateOfPayment** | **OffsetDateTime** | Date of payment |  [optional] |
|**issuerReferenceId** | **String** | Issuer Reference ID. One of &#x60;issuerReferenceId&#x60; or &#x60;issuerTin&#x60; is required. |  [optional] |
|**issuerTin** | **String** | Issuer TIN. One of &#x60;issuerReferenceId&#x60; or &#x60;issuerTin&#x60; is required. |  [optional] |
|**taxYear** | **Integer** | Tax year |  |
|**issuerId** | **String** | Issuer ID |  [optional] |
|**referenceId** | **String** | Reference ID |  [optional] |
|**recipientTin** | **String** | Recipient Tax ID Number |  [optional] |
|**recipientName** | **String** | Recipient name |  |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address |  |
|**address2** | **String** | Address line 2 |  [optional] |
|**city** | **String** | City |  |
|**state** | **String** | US state. Required if CountryCode is \&quot;US\&quot;. |  [optional] |
|**zip** | **String** | Zip/postal code |  [optional] |
|**recipientEmail** | **String** | Recipient email address |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**officeCode** | **String** | Office code |  [optional] |
|**recipientNonUsProvince** | **String** | Foreign province |  [optional] |
|**countryCode** | **String** | Country code, as defined at https://www.irs.gov/e-file-providers/country-codes |  |
|**federalEFile** | **Boolean** | Boolean indicating that federal e-filing should be scheduled for this form |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEFile** | **Boolean** | Boolean indicating that state e-filing should be scheduled for this form |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingRequest**](StateAndLocalWithholdingRequest.md) | State and local withholding information |  [optional] |



## Enum: DistributionCodeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| E | &quot;E&quot; |
| F | &quot;F&quot; |
| G | &quot;G&quot; |
| H | &quot;H&quot; |
| J | &quot;J&quot; |
| K | &quot;K&quot; |
| L | &quot;L&quot; |
| M | &quot;M&quot; |
| N | &quot;N&quot; |
| P | &quot;P&quot; |
| Q | &quot;Q&quot; |
| R | &quot;R&quot; |
| S | &quot;S&quot; |
| T | &quot;T&quot; |
| U | &quot;U&quot; |
| W | &quot;W&quot; |



## Enum: SecondDistributionCodeEnum

| Name | Value |
|---- | -----|
| EARLY_DISTRIBUTION_NO_EXCEPTION | &quot;EarlyDistributionNoException&quot; |
| EARLY_DISTRIBUTION_WITH_EXCEPTION | &quot;EarlyDistributionWithException&quot; |
| DISABILITY | &quot;Disability&quot; |
| DEATH | &quot;Death&quot; |
| PROHIBITED_TRANSACTION | &quot;ProhibitedTransaction&quot; |
| SECTION1035_EXCHANGE | &quot;Section1035Exchange&quot; |
| NORMAL_DISTRIBUTION | &quot;NormalDistribution&quot; |
| EXCESS_CONTRIBUTIONS_CURRENT_YEAR | &quot;ExcessContributionsCurrentYear&quot; |
| CURRENT_LIFE_INSURANCE_PROTECTION_COST | &quot;CurrentLifeInsuranceProtectionCost&quot; |
| TEN_YEAR_TAX_OPTION | &quot;TenYearTaxOption&quot; |
| DESIGNATED_ROTH_DISTRIBUTION | &quot;DesignatedRothDistribution&quot; |
| REPORTABLE_DEATH_BENEFITS | &quot;ReportableDeathBenefits&quot; |
| NONQUALIFIED_ANNUITY_PAYMENTS | &quot;NonqualifiedAnnuityPayments&quot; |
| EPCRS_DISTRIBUTION | &quot;EPCRSDistribution&quot; |
| CHARITABLE_GIFT_ANNUITY | &quot;CharitableGiftAnnuity&quot; |
| DIRECT_ROLLOVER | &quot;DirectRollover&quot; |
| ROTH_ACCOUNT_TO_IRA_DIRECT_ROLLOVER | &quot;RothAccountToIRADirectRollover&quot; |
| EARLY_ROTH_IRA_DISTRIBUTION | &quot;EarlyRothIRADistribution&quot; |
| IRA_ASSETS_NO_FMV | &quot;IRAAssetsNoFMV&quot; |
| LOANS_DEEMED_DISTRIBUTIONS | &quot;LoansDeemedDistributions&quot; |
| QUALIFIED_PLAN_LOAN_OFFSETS | &quot;QualifiedPlanLoanOffsets&quot; |
| RECHARACTERIZED_IRA_NEXT_YEAR | &quot;RecharacterizedIRANextYear&quot; |
| EXCESS_CONTRIBUTIONS_PREVIOUS_YEAR | &quot;ExcessContributionsPreviousYear&quot; |
| QUALIFIED_ROTH_IRA_DISTRIBUTION | &quot;QualifiedRothIRADistribution&quot; |
| RECHARACTERIZED_IRA_PREVIOUS_YEAR | &quot;RecharacterizedIRAPreviousYear&quot; |
| EARLY_SIMPLE_IRA_DISTRIBUTION | &quot;EarlySimpleIRADistribution&quot; |
| ROTH_IRA_DISTRIBUTION_EXCEPTION | &quot;RothIRADistributionException&quot; |
| ESOP_DISTRIBUTION | &quot;ESOPDistribution&quot; |
| LONG_TERM_CARE_INSURANCE | &quot;LongTermCareInsurance&quot; |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



