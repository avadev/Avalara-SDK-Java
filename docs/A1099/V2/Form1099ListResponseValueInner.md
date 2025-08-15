

# Form1099ListResponseValueInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the form |  [readonly] |
|**type** | **String** | Type of the form. Will be one of:  * 940  * 941  * 943  * 944  * 945  * 1042  * 1042-S  * 1095-B  * 1095-C  * 1097-BTC  * 1098  * 1098-C  * 1098-E  * 1098-Q  * 1098-T  * 3921  * 3922  * 5498  * 5498-ESA  * 5498-SA  * 1099-MISC  * 1099-A  * 1099-B  * 1099-C  * 1099-CAP  * 1099-DIV  * 1099-G  * 1099-INT  * 1099-K  * 1099-LS  * 1099-LTC  * 1099-NEC  * 1099-OID  * 1099-PATR  * 1099-Q  * 1099-R  * 1099-S  * 1099-SA  * T4A  * W-2  * W-2G  * 1099-HC |  |
|**issuerId** | **Integer** | Issuer ID |  |
|**issuerReferenceId** | **String** | Issuer Reference ID |  [optional] |
|**issuerTin** | **String** | Issuer TIN |  [optional] |
|**taxYear** | **Integer** | Tax year |  [optional] |
|**federalEfile** | **Boolean** | Boolean indicating that federal e-filing has been scheduled for this form |  |
|**federalEfileStatus** | [**StatusDetail**](StatusDetail.md) | Federal e-file status |  [optional] [readonly] |
|**stateEfile** | **Boolean** | Boolean indicating that state e-filing has been scheduled for this form |  |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetailResponse&gt;**](StateEfileStatusDetailResponse.md) | State e-file status |  [optional] [readonly] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient has been scheduled for this form |  |
|**postalMailStatus** | [**StatusDetail**](StatusDetail.md) | Postal mail to recipient status |  [optional] [readonly] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching has been scheduled for this form |  |
|**tinMatchStatus** | [**StatusDetail**](StatusDetail.md) | TIN Match status |  [optional] [readonly] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification has been scheduled for this form |  |
|**addressVerificationStatus** | [**StatusDetail**](StatusDetail.md) | Address verification status |  [optional] [readonly] |
|**eDeliveryStatus** | [**StatusDetail**](StatusDetail.md) | EDelivery status |  [optional] [readonly] |
|**referenceId** | **String** | Reference ID |  [optional] |
|**email** | **String** | Recipient email address |  [optional] |
|**tinType** | **String** | Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN |  [optional] |
|**tin** | **String** | Recipient Tax ID Number |  [optional] |
|**noTin** | **Boolean** | Indicates whether the recipient has no TIN |  [optional] |
|**secondTinNotice** | **Boolean** | Second Tin Notice |  [optional] |
|**recipientName** | **String** | Recipient name |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address |  [optional] |
|**address2** | **String** | Address line 2 |  [optional] |
|**city** | **String** | City |  [optional] |
|**state** | **String** | US state |  [optional] |
|**zip** | **String** | Zip/postal code |  [optional] |
|**nonUsProvince** | **String** | Foreign province |  [optional] |
|**countryCode** | **String** | Country code, as defined at https://www.irs.gov/e-file-providers/country-codes |  [optional] |
|**accountNumber** | **String** | Account Number |  [optional] |
|**officeCode** | **String** | Office Code |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | FATCA filing requirement |  [optional] |
|**validationErrors** | [**List&lt;ValidationErrorResponse&gt;**](ValidationErrorResponse.md) | Validation errors |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Creation time |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Update time |  [optional] [readonly] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingResponse**](StateAndLocalWithholdingResponse.md) |  |  [optional] |
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
|**primaryWithholdingAgent** | [**PrimaryWithholdingAgentResponse**](PrimaryWithholdingAgentResponse.md) | Primary withholding agent information |  [optional] |
|**intermediaryOrFlowThrough** | [**IntermediaryOrFlowThroughResponse**](IntermediaryOrFlowThroughResponse.md) | Intermediary or flow-through entity information |  [optional] |
|**originOfHealthCoverageCode** | **String** | Origin of health coverage code |  [optional] |
|**coveredIndividuals** | [**List&lt;CoveredIndividualReferenceResponse&gt;**](CoveredIndividualReferenceResponse.md) | Covered individuals information |  [optional] |
|**totalOrdinaryDividends** | **Double** | Total ordinary dividends |  [optional] |
|**qualifiedDividends** | **Double** | Qualified dividends |  [optional] |
|**totalCapitalGainDistributions** | **Double** | Total capital gain distributions |  [optional] |
|**unrecapturedSection1250Gain** | **Double** | Unrecaptured Section 1250 gain |  [optional] |
|**section1202Gain** | **Double** | Section 1202 gain |  [optional] |
|**collectiblesGain** | **Double** | Collectibles (28%) gain |  [optional] |
|**section897OrdinaryDividends** | **Double** | Section 897 ordinary dividends |  [optional] |
|**section897CapitalGain** | **Double** | Section 897 capital gain |  [optional] |
|**nondividendDistributions** | **Double** | Nondividend distributions |  [optional] |
|**federalIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**section199ADividends** | **Double** | Section 199A dividends |  [optional] |
|**investmentExpenses** | **Double** | Investment expenses |  [optional] |
|**foreignTaxPaid** | **Double** | Foreign tax paid |  [optional] |
|**foreignCountryOrUSPossession** | **String** | Foreign country or U.S. possession |  [optional] |
|**cashLiquidationDistributions** | **Double** | Cash liquidation distributions |  [optional] |
|**noncashLiquidationDistributions** | **Double** | Noncash liquidation distributions |  [optional] |
|**exemptInterestDividends** | **Double** | Exempt-interest dividends |  [optional] |
|**specifiedPrivateActivityBondInterestDividends** | **Double** | Specified private activity bond interest dividends |  [optional] |
|**interestIncome** | **Double** | Interest Income |  [optional] |
|**earlyWithdrawalPenalty** | **Double** | Early withdrawal penalty |  [optional] |
|**usSavingsBondsInterest** | **Double** | Interest on U.S. Savings Bonds and Treasury obligations |  [optional] |
|**foreignCountry** | **String** | Foreign country or U.S. possession |  [optional] |
|**taxExemptInterest** | **Double** | Tax-exempt interest |  [optional] |
|**specifiedPrivateActivityBondInterest** | **Double** | Specified private activity bond interest |  [optional] |
|**marketDiscount** | **Double** | Market discount |  [optional] |
|**bondPremium** | **Double** | Bond premium |  [optional] |
|**bondPremiumOnTreasuryObligations** | **Double** | Bond premium on Treasury obligations |  [optional] |
|**bondPremiumOnTaxExemptBond** | **Double** | Bond premium on tax exempt bond |  [optional] |
|**taxExemptBondCusipNumber** | **String** | Tax exempt bond CUSIP number |  [optional] |
|**filerType** | [**FilerTypeEnum**](#FilerTypeEnum) | Filer type (PSE or EPF) |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | Payment type (payment card or third party network) |  [optional] |
|**paymentSettlementEntityNamePhoneNumber** | **String** | Payment settlement entity name and phone number |  [optional] |
|**grossAmountPaymentCard** | **Double** | Gross amount of payment card/third party network transactions |  [optional] |
|**cardNotPresentTransactions** | **Double** | Card not present transactions |  [optional] |
|**merchantCategoryCode** | **String** | Merchant category code |  [optional] |
|**paymentTransactionNumber** | **Double** | Number of payment transactions |  [optional] |
|**january** | **Double** | January gross payments |  [optional] |
|**february** | **Double** | February gross payments |  [optional] |
|**march** | **Double** | March gross payments |  [optional] |
|**april** | **Double** | April gross payments |  [optional] |
|**may** | **Double** | May gross payments |  [optional] |
|**june** | **Double** | June gross payments |  [optional] |
|**july** | **Double** | July gross payments |  [optional] |
|**august** | **Double** | August gross payments |  [optional] |
|**sept** | **Double** | September gross payments |  [optional] |
|**october** | **Double** | October gross payments |  [optional] |
|**november** | **Double** | November gross payments |  [optional] |
|**december** | **Double** | December gross payments |  [optional] |
|**rents** | **Double** | Rents |  [optional] |
|**royalties** | **Double** | Royalties |  [optional] |
|**otherIncome** | **Double** | Other income |  [optional] |
|**fedIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**fishingBoatProceeds** | **Double** | Fishing boat proceeds |  [optional] |
|**medicalAndHealthCarePayments** | **Double** | Medical and health care payments |  [optional] |
|**substitutePayments** | **Double** | Substitute payments in lieu of dividends or interest |  [optional] |
|**directSalesIndicator** | **Boolean** | Payer made direct sales totaling $5,000 or more of consumer products to recipient for resale |  [optional] |
|**cropInsuranceProceeds** | **Double** | Crop insurance proceeds |  [optional] |
|**excessGoldenParachutePayments** | **Double** | (Legacy field) Excess golden parachute payments |  [optional] |
|**grossProceedsPaidToAttorney** | **Double** | Gross proceeds paid to an attorney |  [optional] |
|**fishPurchasedForResale** | **Double** | Fish purchased for resale |  [optional] |
|**section409ADeferrals** | **Double** | Section 409A deferrals |  [optional] |
|**nonqualifiedDeferredCompensation** | **Double** | Nonqualified deferred compensation |  [optional] |
|**nonemployeeCompensation** | **Double** | Nonemployee compensation |  [optional] |
|**grossDistributions** | **Double** | Gross distribution |  [optional] |
|**taxableAmount** | **Double** | Taxable amount |  [optional] |
|**taxableAmountNotDetermined** | **Boolean** | Taxable amount not determined |  [optional] |
|**totalDistributionIndicator** | **Boolean** | Total distribution |  [optional] |
|**capitalGain** | **Double** | Capital gain (included in Box 2a) |  [optional] |
|**employeeContributions** | **Double** | Employee contributions/Designated Roth contributions or insurance premiums |  [optional] |
|**netUnrealizedAppreciation** | **Double** | Net unrealized appreciation in employer&#39;s securities |  [optional] |
|**distributionCodeRequired** | **String** | Distribution code |  [optional] |
|**distributionCodeOptional** | **String** | Second distribution code |  [optional] |
|**iraSepSimpleIndicator** | **Boolean** | IRA/SEP/SIMPLE |  [optional] |
|**totalIraSepSimpleDistribution** | **Double** | Traditional IRA/SEP/SIMPLE or Roth conversion amount |  [optional] |
|**other** | **Double** | Other amount |  [optional] |
|**otherPercent** | **String** | Other percentage |  [optional] |
|**percentageTotalDistribution** | **String** | Total distribution percentage |  [optional] |
|**totalEmployeeContributions** | **Double** | Total employee contributions |  [optional] |
|**amountAllocableToIrr** | **Double** | Amount allocable to IRR within 5 years |  [optional] |
|**firstYearDesignatedRothContrib** | **String** | First year of designated Roth contribution |  [optional] |
|**dateOfPayment** | **String** | Date of payment |  [optional] |



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



