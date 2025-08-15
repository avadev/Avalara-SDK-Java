

# Form1099IntResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**interestIncome** | **Double** | Interest Income |  [optional] |
|**earlyWithdrawalPenalty** | **Double** | Early Withdrawal Penalty |  [optional] |
|**usSavingsBondsInterest** | **Double** | Interest on U.S. Savings Bonds and Treasury obligations |  [optional] |
|**federalIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**investmentExpenses** | **Double** | Investment Expenses |  [optional] |
|**foreignTaxPaid** | **Double** | Foreign tax paid |  [optional] |
|**foreignCountry** | **String** | Foreign country or U.S. possession |  [optional] |
|**taxExemptInterest** | **Double** | Tax-Exempt Interest |  [optional] |
|**specifiedPrivateActivityBondInterest** | **Double** | Specified Private activity |  [optional] |
|**marketDiscount** | **Double** | Market Discount |  [optional] |
|**bondPremium** | **Double** | Bond Premium |  [optional] |
|**bondPremiumOnTreasuryObligations** | **Double** | Bond Premium on Treasury obligations |  [optional] |
|**bondPremiumOnTaxExemptBond** | **Double** | Bond Premium on tax exempt bond |  [optional] |
|**taxExemptBondCusipNumber** | **String** | Tax exempt bond CUSIP no. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
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
|**email** | **String** |  |  [optional] |
|**accountNumber** | **String** |  |  [optional] |
|**officeCode** | **String** |  |  [optional] |
|**nonUsProvince** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**federalEFile** | **Boolean** |  |  [optional] |
|**postalMail** | **Boolean** |  |  [optional] |
|**stateEFile** | **Boolean** |  |  [optional] |
|**tinMatch** | **Boolean** |  |  [optional] |
|**noTin** | **Boolean** |  |  [optional] |
|**secondTinNotice** | **Boolean** |  |  [optional] |
|**addressVerification** | **Boolean** |  |  [optional] |
|**federalEfileStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**eDeliveryStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetailResponse&gt;**](StateEfileStatusDetailResponse.md) |  |  [optional] |
|**postalMailStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**tinMatchStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**addressVerificationStatus** | [**StatusDetail**](StatusDetail.md) |  |  [optional] |
|**validationErrors** | [**List&lt;ValidationErrorResponse&gt;**](ValidationErrorResponse.md) |  |  [optional] |



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
| _1099_INT | &quot;1099-INT&quot; |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



