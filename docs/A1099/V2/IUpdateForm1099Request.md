

# IUpdateForm1099Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalOrdinaryDividends** | **String** | Total ordinary dividends |  [optional] |
|**qualifiedDividends** | **String** | Qualified dividends |  [optional] |
|**totalCapitalGainDistr** | **String** | Total capital gain distributions |  [optional] |
|**unrecapSec1250Gain** | **String** | Unrecaptured Section 1250 gain |  [optional] |
|**section1202Gain** | **String** | Section 1202 gain |  [optional] |
|**collectiblesGain** | **String** | Collectibles (28%) gain |  [optional] |
|**section897OrdinaryDividends** | **String** | Section 897 ordinary dividends |  [optional] |
|**section897CapitalGain** | **String** | Section 897 capital gain |  [optional] |
|**nondividendDistributions** | **String** | Nondividend distributions |  [optional] |
|**federalIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**section199ADividends** | **String** | Section 199A dividends |  [optional] |
|**investmentExpenses** | **String** | Investment expenses |  [optional] |
|**foreignTaxPaid** | **String** | Foreign tax paid |  [optional] |
|**foreignCountryOrUSPossession** | **String** | Foreign country or U.S. possession |  [optional] |
|**cashLiquidationDistributions** | **String** | Cash liquidation distributions |  [optional] |
|**noncashLiquidationDistributions** | **String** | Noncash liquidation distributions |  [optional] |
|**exemptInterestDividends** | **String** | Exempt-interest dividends |  [optional] |
|**specifiedPrivateActivityBondInterestDividends** | **String** | Specified private activity bond interest dividends |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | FATCA filing requirement |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
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
|**secondTinNotice** | **Boolean** | Second TIN notice |  [optional] |
|**rents** | **Double** | Rents |  [optional] |
|**royalties** | **Double** | Royalties |  [optional] |
|**otherIncome** | **Double** | Other income |  [optional] |
|**fedIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**fishingBoatProceeds** | **Double** | Fishing boat proceeds |  [optional] |
|**medicalHealthCarePayments** | **Double** | Medical and health care payments |  [optional] |
|**directSalesIndicator** | **Boolean** | Payer made direct sales totaling $5,000 or more of consumer products to recipient for resale |  [optional] |
|**substitutePayments** | **Double** | Substitute payments in lieu of dividends or interest |  [optional] |
|**cropInsuranceProceeds** | **Double** | Crop insurance proceeds |  [optional] |
|**grossProceedsPaidToAttorney** | **Double** | Gross proceeds paid to an attorney |  [optional] |
|**fishPurchasedForResale** | **Double** | Fish purchased for resale |  [optional] |
|**section409ADeferrals** | **Double** | Section 409A deferrals |  [optional] |
|**excessGoldenParachutePayments** | **Double** | (Legacy field) Excess golden parachute payments |  [optional] |
|**nonqualifiedDeferredCompensation** | **Double** | Nonqualified deferred compensation |  [optional] |
|**nonemployeeCompensation** | **Double** | Nonemployee compensation |  |



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



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



