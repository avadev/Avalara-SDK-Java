

# Form1099DivListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalOrdinaryDividends** | **Double** | Total ordinary dividends |  [optional] |
|**qualifiedDividends** | **Double** | Qualified dividends |  [optional] |
|**totalCapitalGainDistributions** | **Double** | Total capital gain distributions |  [optional] |
|**unrecapturedSection1250Gain** | **Double** | Unrecaptured Section 1250 gain |  [optional] |
|**section1202Gain** | **Double** | Section 1202 gain |  [optional] |
|**collectiblesGain** | **Double** | Collectibles (28%) gain |  [optional] |
|**section897OrdinaryDividends** | **Double** | Section 897 ordinary dividends |  [optional] |
|**section897CapitalGain** | **Double** | Section 897 capital gain |  [optional] |
|**nondividendDistributions** | **Double** | Nondividend distributions |  [optional] |
|**federalIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**section199ADividends** | **Double** | Section 199A dividends |  [optional] |
|**investmentExpenses** | **Double** | Investment expenses |  [optional] |
|**foreignTaxPaid** | **Double** | Foreign tax paid |  [optional] |
|**foreignCountryOrUSPossession** | **String** | Foreign country or U.S. possession |  [optional] |
|**cashLiquidationDistributions** | **Double** | Cash liquidation distributions |  [optional] |
|**noncashLiquidationDistributions** | **Double** | Noncash liquidation distributions |  [optional] |
|**exemptInterestDividends** | **Double** | Exempt-interest dividends |  [optional] |
|**specifiedPrivateActivityBondInterestDividends** | **Double** | Specified private activity bond interest dividends |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | FATCA filing requirement |  [optional] |
|**issuerReferenceId** | **String** | Issuer Reference ID. One of &#x60;issuerReferenceId&#x60; or &#x60;issuerTin&#x60; is required. |  [optional] |
|**issuerTin** | **String** | Issuer TIN. One of &#x60;issuerReferenceId&#x60; or &#x60;issuerTin&#x60; is required. |  [optional] |
|**taxYear** | **Integer** | Tax year |  |
|**issuerId** | **String** | Issuer ID |  [optional] |
|**referenceId** | **String** | Reference ID |  [optional] |
|**recipientTin** | **String** | Recipient Tax ID Number |  [optional] |
|**recipientName** | **String** | Recipient name |  [optional] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address |  [optional] |
|**address2** | **String** | Address line 2 |  [optional] |
|**city** | **String** | City |  [optional] |
|**state** | **String** | US state. Required if CountryCode is \&quot;US\&quot;. |  [optional] |
|**zip** | **String** | Zip/postal code |  [optional] |
|**email** | **String** | Recipient email address |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**officeCode** | **String** | Office code |  [optional] |
|**nonUsProvince** | **String** | Foreign province |  [optional] |
|**countryCode** | **String** | Country code, as defined at https://www.irs.gov/e-file-providers/country-codes |  [optional] |
|**federalEFile** | **Boolean** | Boolean indicating that federal e-filing should be scheduled for this form |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEFile** | **Boolean** | Boolean indicating that state e-filing should be scheduled for this form |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**noTin** | **Boolean** | Indicates whether the recipient has no TIN |  [optional] |
|**secondTinNotice** | **Boolean** | Second TIN notice in three years |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingRequest**](StateAndLocalWithholdingRequest.md) | State and local withholding information |  [optional] |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



