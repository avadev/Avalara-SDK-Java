

# ICreateForm1099Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalOrdinaryDividends** | **String** |  |  [optional] |
|**qualifiedDividends** | **String** |  |  [optional] |
|**totalCapitalGainDistr** | **String** |  |  [optional] |
|**unrecapSec1250Gain** | **String** |  |  [optional] |
|**section1202Gain** | **String** |  |  [optional] |
|**collectiblesGain** | **String** |  |  [optional] |
|**section897OrdinaryDividends** | **String** |  |  [optional] |
|**section897CapitalGain** | **String** |  |  [optional] |
|**nondividendDistributions** | **String** |  |  [optional] |
|**federalIncomeTaxWithheld** | **Double** |  |  [optional] |
|**section199ADividends** | **String** |  |  [optional] |
|**investmentExpenses** | **String** |  |  [optional] |
|**foreignTaxPaid** | **String** |  |  [optional] |
|**foreignCountryOrUSPossession** | **String** |  |  [optional] |
|**cashLiquidationDistributions** | **String** |  |  [optional] |
|**noncashLiquidationDistributions** | **String** |  |  [optional] |
|**exemptInterestDividends** | **String** |  |  [optional] |
|**specifiedPrivateActivityBondInterestDividends** | **String** |  |  [optional] |
|**fatcaFilingRequirement** | **Boolean** |  |  [optional] |
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
|**secondTinNotice** | **Boolean** |  |  [optional] |
|**rents** | **Double** |  |  [optional] |
|**royalties** | **Double** |  |  [optional] |
|**otherIncome** | **Double** |  |  [optional] |
|**fedIncomeTaxWithheld** | **Double** |  |  [optional] |
|**fishingBoatProceeds** | **Double** |  |  [optional] |
|**medicalHealthCarePayments** | **Double** |  |  [optional] |
|**payerMadeDirectSales** | **Boolean** |  |  [optional] |
|**substitutePayments** | **Double** |  |  [optional] |
|**cropInsuranceProceeds** | **Double** |  |  [optional] |
|**grossProceedsPaidToAttorney** | **Double** |  |  [optional] |
|**fishPurchasedForResale** | **Double** |  |  [optional] |
|**section409ADeferrals** | **Double** |  |  [optional] |
|**excessGoldenParachutePayments** | **Double** |  |  [optional] |
|**nonqualifiedDeferredCompensation** | **Double** |  |  [optional] |
|**nonemployeeCompensation** | **Double** |  |  [optional] |



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



