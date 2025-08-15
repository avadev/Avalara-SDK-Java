

# Update1099Form200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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
|**employeeFirstName** | **String** |  |  [optional] |
|**employeeMiddleName** | **String** |  |  [optional] |
|**employeeLastName** | **String** |  |  [optional] |
|**employeeNameSuffix** | **String** |  |  [optional] |
|**employeeDateOfBirth** | **OffsetDateTime** |  |  [optional] |
|**originOfHealthCoverageCode** | [**OriginOfHealthCoverageCodeEnum**](#OriginOfHealthCoverageCodeEnum) |  |  [optional] |
|**coveredIndividuals** | [**List&lt;CoveredIndividualRequest&gt;**](CoveredIndividualRequest.md) |  |  [optional] |
|**totalOrdinaryDividends** | **Double** |  |  [optional] |
|**qualifiedDividends** | **Double** |  |  [optional] |
|**totalCapitalGainDistributions** | **Double** |  |  [optional] |
|**unrecapturedSection1250Gain** | **Double** |  |  [optional] |
|**section1202Gain** | **Double** |  |  [optional] |
|**collectiblesGain** | **Double** |  |  [optional] |
|**section897OrdinaryDividends** | **Double** |  |  [optional] |
|**section897CapitalGain** | **Double** |  |  [optional] |
|**nondividendDistributions** | **Double** |  |  [optional] |
|**federalIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**section199ADividends** | **Double** |  |  [optional] |
|**investmentExpenses** | **Double** | Investment Expenses |  [optional] |
|**foreignTaxPaid** | **Double** | Foreign tax paid |  [optional] |
|**foreignCountryOrUSPossession** | **String** |  |  [optional] |
|**cashLiquidationDistributions** | **Double** |  |  [optional] |
|**noncashLiquidationDistributions** | **Double** |  |  [optional] |
|**exemptInterestDividends** | **Double** |  |  [optional] |
|**specifiedPrivateActivityBondInterestDividends** | **Double** |  |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | FATCA filing requirement |  [optional] |
|**interestIncome** | **Double** | Interest Income |  [optional] |
|**earlyWithdrawalPenalty** | **Double** | Early Withdrawal Penalty |  [optional] |
|**usSavingsBondsInterest** | **Double** | Interest on U.S. Savings Bonds and Treasury obligations |  [optional] |
|**foreignCountry** | **String** | Foreign country or U.S. possession |  [optional] |
|**taxExemptInterest** | **Double** | Tax-Exempt Interest |  [optional] |
|**specifiedPrivateActivityBondInterest** | **Double** | Specified Private activity |  [optional] |
|**marketDiscount** | **Double** | Market Discount |  [optional] |
|**bondPremium** | **Double** | Bond Premium |  [optional] |
|**bondPremiumOnTreasuryObligations** | **Double** | Bond Premium on Treasury obligations |  [optional] |
|**bondPremiumOnTaxExemptBond** | **Double** | Bond Premium on tax exempt bond |  [optional] |
|**taxExemptBondCusipNumber** | **String** | Tax exempt bond CUSIP no. |  [optional] |
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
|**directSalesIndicator** | **Boolean** |  |  [optional] |
|**substitutePayments** | **Double** |  |  [optional] |
|**cropInsuranceProceeds** | **Double** |  |  [optional] |
|**grossProceedsPaidToAttorney** | **Double** |  |  [optional] |
|**fishPurchasedForResale** | **Double** |  |  [optional] |
|**section409ADeferrals** | **Double** |  |  [optional] |
|**excessGoldenParachutePayments** | **Double** |  |  [optional] |
|**nonqualifiedDeferredCompensation** | **Double** |  |  [optional] |
|**nonemployeeCompensation** | **Double** |  |  [optional] |
|**grossDistribution** | **Double** | Gross distribution |  [optional] |
|**taxableAmount** | **Double** | Taxable amount |  [optional] |
|**taxableAmountNotDetermined** | **Boolean** | Taxable amount not determined |  [optional] |
|**totalDistributionDetermined** | **Boolean** | Total distribution |  [optional] |
|**capitalGain** | **Double** | Capital gain (included in Box 2a) |  [optional] |
|**employeeContributionsOrDesignatedRothOrInsurancePremiums** | **Double** | Employee contributions/Designated Roth contributions or insurance premiums |  [optional] |
|**netUnrealizedAppreciationInEmployerSecurities** | **Double** | Net unrealized appreciation in employer&#39;s securities |  [optional] |
|**distributionCode** | **String** | Distribution code |  [optional] |
|**secondDistributionCode** | **String** | Second distribution code |  [optional] |
|**iraSepSimple** | **Boolean** | IRA/SEP/SIMPLE |  [optional] |
|**traditionalIraSepSimpleOrRothConversionAmount** | **Double** | Traditional IRA/SEP/SIMPLE or Roth conversion amount |  [optional] |
|**otherAmount** | **Double** | Other amount |  [optional] |
|**otherPercentage** | **String** | Other percentage |  [optional] |
|**totalDistributionPercentage** | **String** | Total distribution percentage |  [optional] |
|**totalEmployeeContributions** | **Double** | Total employee contributions |  [optional] |
|**amountAllocableToIrrWithin5Years** | **Double** | Amount allocable to IRR within 5 years |  [optional] |
|**firstYearOfDesignatedRothContribution** | **String** | First year of designated Roth contribution |  [optional] |
|**dateOfPayment** | **OffsetDateTime** | Date of payment |  [optional] |



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



## Enum: OriginOfHealthCoverageCodeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| E | &quot;E&quot; |
| F | &quot;F&quot; |
| G | &quot;G&quot; |



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



