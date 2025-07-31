

# Form1042SRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uniqueFormId** | **String** | Unique form identifier |  [optional] |
|**recipientDateOfBirth** | **OffsetDateTime** | Recipient&#39;s date of birth |  [optional] |
|**recipientGiin** | **String** | Recipient&#39;s GIIN (Global Intermediary Identification Number) |  [optional] |
|**recipientForeignTin** | **String** | Recipient&#39;s foreign TIN |  [optional] |
|**lobCode** | **String** | Limitation on benefits code |  [optional] |
|**incomeCode** | **String** | Income code |  [optional] |
|**grossIncome** | **Double** | Gross income |  [optional] |
|**withholdingIndicator** | **String** | Withholding indicator |  [optional] |
|**taxCountryCode** | **String** | Country code |  [optional] |
|**exemptionCodeChap3** | **String** | Exemption code (Chapter 3) |  [optional] |
|**exemptionCodeChap4** | **String** | Exemption code (Chapter 4) |  [optional] |
|**taxRateChap3** | **String** | Tax rate (Chapter 3) |  [optional] |
|**withholdingAllowance** | **Double** | Withholding allowance |  [optional] |
|**federalTaxWithheld** | **Double** | Federal tax withheld |  [optional] |
|**taxNotDepositedIndicator** | **Boolean** | Tax not deposited indicator |  [optional] |
|**academicIndicator** | **Boolean** | Academic indicator |  [optional] |
|**taxWithheldOtherAgents** | **Double** | Tax withheld by other agents |  [optional] |
|**amountRepaid** | **Double** | Amount repaid to recipient |  [optional] |
|**taxPaidAgent** | **Double** | Tax paid by withholding agent |  [optional] |
|**chap3StatusCode** | **String** | Chapter 3 status code |  [optional] |
|**chap4StatusCode** | **String** | Chapter 4 status code |  [optional] |
|**primaryWithholdingAgent** | [**PrimaryWithholdingAgentRequest**](PrimaryWithholdingAgentRequest.md) | Primary withholding agent information |  [optional] |
|**intermediaryOrFlowThrough** | [**IntermediaryOrFlowThroughRequest**](IntermediaryOrFlowThroughRequest.md) | Intermediary or flow-through entity information |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingRequest**](StateAndLocalWithholdingRequest.md) | State and local withholding information |  [optional] |
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



