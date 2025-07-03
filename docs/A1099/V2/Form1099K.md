

# Form1099K


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
|**id** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**issuerId** | **Integer** |  |  [optional] |
|**issuerReferenceId** | **String** |  |  [optional] |
|**issuerTin** | **String** |  |  [optional] |
|**taxYear** | **Integer** |  |  [optional] |
|**federalEfile** | **Boolean** |  |  [optional] |
|**federalEfileStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) |  |  [optional] |
|**stateEfile** | **Boolean** |  |  [optional] |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetail&gt;**](StateEfileStatusDetail.md) |  |  [optional] |
|**postalMail** | **Boolean** |  |  [optional] |
|**postalMailStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) |  |  [optional] |
|**tinMatch** | **Boolean** |  |  [optional] |
|**tinMatchStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) |  |  [optional] |
|**addressVerification** | **Boolean** |  |  [optional] |
|**addressVerificationStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) |  |  [optional] |
|**referenceId** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**tinType** | **String** |  |  [optional] |
|**tin** | **String** |  |  [optional] |
|**recipientName** | **String** |  |  [optional] |
|**recipientSecondName** | **String** |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**address2** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**zip** | **String** |  |  [optional] |
|**foreignProvince** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**validationErrors** | [**List&lt;ValidationError&gt;**](ValidationError.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholding**](StateAndLocalWithholding.md) |  |  [optional] |



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



