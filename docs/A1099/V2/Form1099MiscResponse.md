

# Form1099MiscResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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
|**fatcaFilingRequirement** | **Boolean** |  |  [optional] |
|**excessGoldenParachutePayments** | **Double** |  |  [optional] |
|**nonqualifiedDeferredCompensation** | **Double** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingResponse**](StateAndLocalWithholdingResponse.md) |  |  [optional] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**issuerId** | **String** |  |  [optional] |
|**issuerReferenceId** | **String** |  |  [optional] |
|**issuerTin** | **String** |  |  [optional] |
|**taxYear** | **Integer** |  |  [optional] |
|**referenceId** | **String** |  |  [optional] |
|**recipientName** | **String** |  |  [optional] |
|**recipientTin** | **String** |  |  [optional] |
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
|**federalEfileStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetailApp&gt;**](StateEfileStatusDetailApp.md) |  |  [optional] |
|**postalMailStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**tinMatchStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**addressVerificationStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**validationErrors** | [**List&lt;ValidationErrorApp&gt;**](ValidationErrorApp.md) |  |  [optional] |



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



