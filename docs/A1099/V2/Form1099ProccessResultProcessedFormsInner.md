

# Form1099ProccessResultProcessedFormsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uniqueFormId** | **String** |  |  [optional] |
|**recipientDateOfBirth** | **OffsetDateTime** |  |  [optional] |
|**recipientGiin** | **String** |  |  [optional] |
|**recipientForeignTin** | **String** |  |  [optional] |
|**lobCode** | **String** |  |  [optional] |
|**incomeCode** | **String** |  |  [optional] |
|**grossIncome** | **Double** |  |  [optional] |
|**withholdingIndicator** | **String** |  |  [optional] |
|**taxCountryCode** | **String** |  |  [optional] |
|**exemptionCodeChap3** | **String** |  |  [optional] |
|**exemptionCodeChap4** | **String** |  |  [optional] |
|**taxRateChap3** | **String** |  |  [optional] |
|**withholdingAllowance** | **Double** |  |  [optional] |
|**federalTaxWithheld** | **Double** |  |  [optional] |
|**taxNotDepositedIndicator** | **Boolean** |  |  [optional] |
|**academicIndicator** | **Boolean** |  |  [optional] |
|**taxWithheldOtherAgents** | **Double** |  |  [optional] |
|**amountRepaid** | **Double** |  |  [optional] |
|**taxPaidAgent** | **Double** |  |  [optional] |
|**chap3StatusCode** | **String** |  |  [optional] |
|**chap4StatusCode** | **String** |  |  [optional] |
|**primaryWithholdingAgent** | [**PrimaryWithholdingAgent**](PrimaryWithholdingAgent.md) |  |  [optional] |
|**intermediaryOrFlowThrough** | [**IntermediaryOrFlowThrough**](IntermediaryOrFlowThrough.md) |  |  [optional] |
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
|**eDeliveryStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) |  |  [optional] |
|**referenceId** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**tinType** | **String** |  |  [optional] |
|**fatcaFilingRequirement** | **Boolean** |  |  [optional] |
|**tin** | **String** |  |  [optional] |
|**noTin** | **Boolean** |  |  [optional] |
|**secondTinNotice** | **Boolean** |  |  [optional] |
|**recipientName** | **String** |  |  [optional] |
|**recipientSecondName** | **String** |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**address2** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**zip** | **String** |  |  [optional] |
|**nonUsProvince** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**accountNumber** | **String** |  |  [optional] |
|**officeCode** | **String** |  |  [optional] |
|**validationErrors** | [**List&lt;ValidationError&gt;**](ValidationError.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholding**](StateAndLocalWithholding.md) |  |  [optional] |
|**originOfHealthCoverageCode** | **String** |  |  [optional] |
|**coveredIndividuals** | [**List&lt;CoveredIndividualReference&gt;**](CoveredIndividualReference.md) |  |  [optional] |
|**totalOrdinaryDividends** | **Double** |  |  [optional] |
|**qualifiedDividends** | **Double** |  |  [optional] |
|**totalCapitalGainDistributions** | **Double** |  |  [optional] |
|**unrecapturedSection1250Gain** | **Double** |  |  [optional] |
|**section1202Gain** | **Double** |  |  [optional] |
|**collectiblesGain** | **Double** |  |  [optional] |
|**section897OrdinaryDividends** | **Double** |  |  [optional] |
|**section897CapitalGain** | **Double** |  |  [optional] |
|**nondividendDistributions** | **Double** |  |  [optional] |
|**federalIncomeTaxWithheld** | **Double** |  |  [optional] |
|**section199ADividends** | **Double** |  |  [optional] |
|**investmentExpenses** | **Double** |  |  [optional] |
|**foreignTaxPaid** | **Double** |  |  [optional] |
|**foreignCountryOrUSPossession** | **String** |  |  [optional] |
|**cashLiquidationDistributions** | **Double** |  |  [optional] |
|**noncashLiquidationDistributions** | **Double** |  |  [optional] |
|**exemptInterestDividends** | **Double** |  |  [optional] |
|**specifiedPrivateActivityBondInterestDividends** | **Double** |  |  [optional] |
|**interestIncome** | **Double** |  |  [optional] |
|**earlyWithdrawalPenalty** | **Double** |  |  [optional] |
|**usSavingsBondsInterest** | **Double** |  |  [optional] |
|**foreignCountry** | **String** |  |  [optional] |
|**taxExemptInterest** | **Double** |  |  [optional] |
|**specifiedPrivateActivityBondInterest** | **Double** |  |  [optional] |
|**marketDiscount** | **Double** |  |  [optional] |
|**bondPremium** | **Double** |  |  [optional] |
|**bondPremiumOnTreasuryObligations** | **Double** |  |  [optional] |
|**bondPremiumOnTaxExemptBond** | **Double** |  |  [optional] |
|**taxExemptBondCusipNumber** | **String** |  |  [optional] |
|**filerType** | [**FilerTypeEnum**](#FilerTypeEnum) |  |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) |  |  [optional] |
|**paymentSettlementEntityNamePhoneNumber** | **String** |  |  [optional] |
|**grossAmountPaymentCard** | **Double** |  |  [optional] |
|**cardNotPresentTransactions** | **Double** |  |  [optional] |
|**merchantCategoryCode** | **String** |  |  [optional] |
|**paymentTransactionNumber** | **Double** |  |  [optional] |
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
|**medicalAndHealthCarePayments** | **Double** |  |  [optional] |
|**substitutePayments** | **Double** |  |  [optional] |
|**directSalesIndicator** | **Boolean** |  |  [optional] |
|**cropInsuranceProceeds** | **Double** |  |  [optional] |
|**excessGoldenParachutePayments** | **Double** |  |  [optional] |
|**grossProceedsPaidToAttorney** | **Double** |  |  [optional] |
|**fishPurchasedForResale** | **Double** |  |  [optional] |
|**section409ADeferrals** | **Double** |  |  [optional] |
|**nonqualifiedDeferredCompensation** | **Double** |  |  [optional] |
|**nonemployeeCompensation** | **Double** |  |  [optional] |
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



