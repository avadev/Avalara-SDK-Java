

# Get1099Form200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originOfHealthCoverageCode** | **String** |  |  [optional] |
|**coveredIndividuals** | [**List&lt;CoveredIndividualReference&gt;**](CoveredIndividualReference.md) |  |  [optional] |
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
|**rents** | **Double** |  |  [optional] |
|**royalties** | **Double** |  |  [optional] |
|**otherIncome** | **Double** |  |  [optional] |
|**fedIncomeTaxWithheld** | **Double** |  |  [optional] |
|**fishingBoatProceeds** | **Double** |  |  [optional] |
|**medicalAndHealthCare** | **Double** |  |  [optional] |
|**nonemployeeCompensation** | **Double** |  |  [optional] |
|**substitutePayments** | **Double** |  |  [optional] |
|**directSalesIndicator** | **Boolean** |  |  [optional] |
|**cropInsuranceProceeds** | **Double** |  |  [optional] |
|**excessGoldenParachute** | **Double** |  |  [optional] |
|**grossAmountPaidAttorney** | **Double** |  |  [optional] |
|**section409ADeferrals** | **Double** |  |  [optional] |
|**section409AIncome** | **Double** |  |  [optional] |
|**grossDistributions** | **Double** |  |  [optional] |
|**taxableAmount** | **Double** |  |  [optional] |
|**taxableAmountNotDetermined** | **Boolean** |  |  [optional] |
|**totalDistributionIndicator** | **Boolean** |  |  [optional] |
|**capitalGain** | **Double** |  |  [optional] |
|**employeeContributions** | **Double** |  |  [optional] |
|**netUnrealizedAppreciation** | **Double** |  |  [optional] |
|**distributionCodeRequired** | **String** |  |  [optional] |
|**distributionCodeOptional** | **String** |  |  [optional] |
|**iraSepSimpleIndicator** | **Boolean** |  |  [optional] |
|**totalIraSepSimpleDistribution** | **Double** |  |  [optional] |
|**other** | **Double** |  |  [optional] |
|**otherPercent** | **String** |  |  [optional] |
|**percentageTotalDistribution** | **String** |  |  [optional] |
|**totalEmployeeContributions** | **Double** |  |  [optional] |
|**amountAllocableToIrr** | **Double** |  |  [optional] |
|**firstYearDesignatedRothContrib** | **String** |  |  [optional] |
|**fatcaRequirementIndicator** | **Boolean** |  |  [optional] |
|**dateOfPayment** | **String** |  |  [optional] |



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



