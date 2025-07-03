

# Form1099KRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filerType** | **Integer** |  |  [optional] |
|**paymentType** | **Integer** |  |  [optional] |
|**paymentSettlementEntityNamePhoneNumber** | **String** |  |  [optional] |
|**grossAmountPaymentCard** | **Double** |  |  [optional] |
|**cardNotPresentTransactions** | **Double** |  |  [optional] |
|**merchantCategoryCode** | **String** |  |  [optional] |
|**paymentTransactionNumber** | **Double** |  |  [optional] |
|**federalIncomeTaxWithheld** | **Double** |  |  [optional] |
|**january** | **Double** |  |  [optional] |
|**february** | **Double** |  |  [optional] |
|**march** | **Double** |  |  [optional] |
|**april** | **Double** |  |  [optional] |
|**may** | **Double** |  |  [optional] |
|**june** | **Double** |  |  [optional] |
|**july** | **Double** |  |  [optional] |
|**august** | **Double** |  |  [optional] |
|**sept** | **Double** |  |  [optional] |
|**october** | **Double** |  |  [optional] |
|**november** | **Double** |  |  [optional] |
|**december** | **Double** |  |  [optional] |
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



