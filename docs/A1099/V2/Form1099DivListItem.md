

# Form1099DivListItem


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
|**federalIncomeTaxWithheld** | **String** |  |  [optional] |
|**section199ADividends** | **String** |  |  [optional] |
|**investmentExpenses** | **String** |  |  [optional] |
|**foreignTaxPaid** | **String** |  |  [optional] |
|**foreignCountryOrUSPossession** | **String** |  |  [optional] |
|**cashLiquidationDistributions** | **String** |  |  [optional] |
|**noncashLiquidationDistributions** | **String** |  |  [optional] |
|**exemptInterestDividends** | **String** |  |  [optional] |
|**specifiedPrivateActivityBondInterestDividends** | **String** |  |  [optional] |
|**fatcaFilingRequirement** | **String** |  |  [optional] |
|**issuerReferenceId** | **String** |  |  [optional] |
|**issuerTin** | **String** |  |  [optional] |
|**taxYear** | **Integer** |  |  [optional] |
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



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



