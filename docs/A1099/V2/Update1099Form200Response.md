

# Update1099Form200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetailResponse&gt;**](StateEfileStatusDetailResponse.md) |  |  [optional] |
|**postalMailStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**tinMatchStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**addressVerificationStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**validationErrors** | [**List&lt;ValidationErrorResponse&gt;**](ValidationErrorResponse.md) |  |  [optional] |
|**secondTinNotice** | **Boolean** |  |  [optional] |
|**rents** | **Double** |  |  [optional] |
|**royalties** | **Double** |  |  [optional] |
|**otherIncome** | **Double** |  |  [optional] |
|**fedIncomeTaxWithheld** | **Double** |  |  [optional] |
|**fishingBoatProceeds** | **Double** |  |  [optional] |
|**medicalHealthCarePayments** | **Double** |  |  [optional] |
|**directSalesIndicator** | **Boolean** |  |  [optional] |
|**substitutePayments** | **Double** |  |  [optional] |
|**cropInsuranceProceeds** | **Double** |  |  [optional] |
|**grossProceedsPaidToAttorney** | **Double** |  |  [optional] |
|**fishPurchasedForResale** | **Double** |  |  [optional] |
|**section409ADeferrals** | **Double** |  |  [optional] |
|**fatcaFilingRequirement** | **Boolean** |  |  [optional] |
|**excessGoldenParachutePayments** | **Double** |  |  [optional] |
|**nonqualifiedDeferredCompensation** | **Double** |  |  [optional] |
|**nonemployeeCompensation** | **Double** |  |  [optional] |
|**federalIncomeTaxWithheld** | **Double** |  |  [optional] |



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



