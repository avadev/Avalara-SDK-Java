

# Form1099DivListItemResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalOrdinaryDividends** | **String** | Total ordinary dividends |  [optional] |
|**qualifiedDividends** | **String** | Qualified dividends |  [optional] |
|**totalCapitalGainDistributions** | **String** | Total capital gain distributions |  [optional] |
|**unrecapturedSection1250Gain** | **String** | Unrecaptured Section 1250 gain |  [optional] |
|**section1202Gain** | **String** | Section 1202 gain |  [optional] |
|**collectiblesGain** | **String** | Collectibles (28%) gain |  [optional] |
|**section897OrdinaryDividends** | **String** | Section 897 ordinary dividends |  [optional] |
|**section897CapitalGain** | **String** | Section 897 capital gain |  [optional] |
|**nondividendDistributions** | **String** | Nondividend distributions |  [optional] |
|**federalIncomeTaxWithheld** | **String** | Federal income tax withheld |  [optional] |
|**section199ADividends** | **String** | Section 199A dividends |  [optional] |
|**investmentExpenses** | **String** | Investment expenses |  [optional] |
|**foreignTaxPaid** | **String** | Foreign tax paid |  [optional] |
|**foreignCountryOrUSPossession** | **String** | Foreign country or U.S. possession |  [optional] |
|**cashLiquidationDistributions** | **String** | Cash liquidation distributions |  [optional] |
|**noncashLiquidationDistributions** | **String** | Noncash liquidation distributions |  [optional] |
|**exemptInterestDividends** | **String** | Exempt-interest dividends |  [optional] |
|**specifiedPrivateActivityBondInterestDividends** | **String** | Specified private activity bond interest dividends |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | FATCA filing requirement |  [optional] |
|**id** | **String** | ID of the form |  [readonly] |
|**type** | **String** | Type of the form. Will be one of:  * 940  * 941  * 943  * 944  * 945  * 1042  * 1042-S  * 1095-B  * 1095-C  * 1097-BTC  * 1098  * 1098-C  * 1098-E  * 1098-Q  * 1098-T  * 3921  * 3922  * 5498  * 5498-ESA  * 5498-SA  * 1099-MISC  * 1099-A  * 1099-B  * 1099-C  * 1099-CAP  * 1099-DIV  * 1099-G  * 1099-INT  * 1099-K  * 1099-LS  * 1099-LTC  * 1099-NEC  * 1099-OID  * 1099-PATR  * 1099-Q  * 1099-R  * 1099-S  * 1099-SA  * T4A  * W-2  * W-2G  * 1099-HC |  |
|**issuerId** | **Integer** | Issuer ID |  |
|**issuerReferenceId** | **String** | Issuer Reference ID |  [optional] |
|**issuerTin** | **String** | Issuer TIN |  [optional] |
|**taxYear** | **Integer** | Tax year |  [optional] |
|**federalEfile** | **Boolean** | Boolean indicating that federal e-filing has been scheduled for this form |  |
|**federalEfileStatus** | [**StatusDetail**](StatusDetail.md) | Federal e-file status |  [optional] [readonly] |
|**stateEfile** | **Boolean** | Boolean indicating that state e-filing has been scheduled for this form |  |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetailResponse&gt;**](StateEfileStatusDetailResponse.md) | State e-file status |  [optional] [readonly] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient has been scheduled for this form |  |
|**postalMailStatus** | [**StatusDetail**](StatusDetail.md) | Postal mail to recipient status |  [optional] [readonly] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching has been scheduled for this form |  |
|**tinMatchStatus** | [**StatusDetail**](StatusDetail.md) | TIN Match status |  [optional] [readonly] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification has been scheduled for this form |  |
|**addressVerificationStatus** | [**StatusDetail**](StatusDetail.md) | Address verification status |  [optional] [readonly] |
|**eDeliveryStatus** | [**StatusDetail**](StatusDetail.md) | EDelivery status |  [optional] [readonly] |
|**referenceId** | **String** | Reference ID |  [optional] |
|**email** | **String** | Recipient email address |  [optional] |
|**tinType** | **String** | Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN |  [optional] |
|**tin** | **String** | Recipient Tax ID Number |  [optional] |
|**noTin** | **Boolean** | Indicates whether the recipient has no TIN |  [optional] |
|**secondTinNotice** | **Boolean** | Second Tin Notice |  [optional] |
|**recipientName** | **String** | Recipient name |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address |  [optional] |
|**address2** | **String** | Address line 2 |  [optional] |
|**city** | **String** | City |  [optional] |
|**state** | **String** | US state |  [optional] |
|**zip** | **String** | Zip/postal code |  [optional] |
|**nonUsProvince** | **String** | Foreign province |  [optional] |
|**countryCode** | **String** | Country code, as defined at https://www.irs.gov/e-file-providers/country-codes |  [optional] |
|**accountNumber** | **String** | Account Number |  [optional] |
|**officeCode** | **String** | Office Code |  [optional] |
|**validationErrors** | [**List&lt;ValidationErrorResponse&gt;**](ValidationErrorResponse.md) | Validation errors |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Creation time |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Update time |  [optional] [readonly] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingResponse**](StateAndLocalWithholdingResponse.md) |  |  [optional] |



