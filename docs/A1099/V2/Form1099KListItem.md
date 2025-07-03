

# Form1099KListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filerType** | [**FilerTypeEnum**](#FilerTypeEnum) |  |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional] |
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



## Enum: FilerTypeEnum

| Name | Value |
|---- | -----|
| PSE | &quot;PSE&quot; |
| EPF | &quot;EPF&quot; |
| OTHER | &quot;Other&quot; |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| MERCHANT_PAYMENT_CARD | &quot;MerchantPaymentCard&quot; |
| THIRD_PARTY_NETWORK | &quot;ThirdPartyNetwork&quot; |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



