

# Create1099Form201Response


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
|**federalEfileStatus** | [**Form1099StatusDetailResponse**](Form1099StatusDetailResponse.md) | Federal e-file status |  [optional] [readonly] |
|**stateEfile** | **Boolean** | Boolean indicating that state e-filing has been scheduled for this form |  |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetailResponse&gt;**](StateEfileStatusDetailResponse.md) | State e-file status |  [optional] [readonly] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient has been scheduled for this form |  |
|**postalMailStatus** | [**Form1099StatusDetailResponse**](Form1099StatusDetailResponse.md) | Postal mail to recipient status |  [optional] [readonly] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching has been scheduled for this form |  |
|**tinMatchStatus** | [**Form1099StatusDetailResponse**](Form1099StatusDetailResponse.md) | TIN Match status |  [optional] [readonly] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification has been scheduled for this form |  |
|**addressVerificationStatus** | [**Form1099StatusDetailResponse**](Form1099StatusDetailResponse.md) | Address verification status |  [optional] [readonly] |
|**referenceId** | **String** | Reference ID |  [optional] |
|**email** | **String** | Recipient email address |  [optional] |
|**tinType** | **String** | Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN |  [optional] |
|**tin** | **String** | Recipient Tax ID Number |  [optional] |
|**recipientName** | **String** | Recipient name |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address |  [optional] |
|**address2** | **String** | Address line 2 |  [optional] |
|**city** | **String** | City |  [optional] |
|**state** | **String** | US state |  [optional] |
|**zip** | **String** | Zip/postal code |  [optional] |
|**foreignProvince** | **String** | Foreign province |  [optional] |
|**countryCode** | **String** | Country code, as defined at https://www.irs.gov/e-file-providers/country-codes |  [optional] |
|**validationErrors** | [**List&lt;ValidationErrorResponse&gt;**](ValidationErrorResponse.md) | Validation errors |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Creation time |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Update time |  [optional] [readonly] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingResponse**](StateAndLocalWithholdingResponse.md) |  |  [optional] |
|**uniqueFormId** | **String** | Unique form identifier |  [optional] |
|**noTin** | **Boolean** | No TIN indicator |  [optional] |
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
|**filerType** | [**FilerTypeEnum**](#FilerTypeEnum) | Filer type (PSE or EPF) |  [optional] |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | Payment type (payment card or third party network) |  [optional] |
|**paymentSettlementEntityNamePhoneNumber** | **String** | Payment settlement entity name and phone number |  [optional] |
|**grossAmountPaymentCard** | **Double** | Gross amount of payment card/third party network transactions |  [optional] |
|**cardNotPresentTransactions** | **Double** | Card not present transactions |  [optional] |
|**merchantCategoryCode** | **String** | Merchant category code |  [optional] |
|**paymentTransactionNumber** | **Double** | Number of payment transactions |  [optional] |
|**federalIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
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
|**medicalAndHealthCare** | **Double** | Medical and health care payments |  [optional] |
|**substitutePayments** | **Double** | Substitute payments in lieu of dividends or interest |  [optional] |
|**directSalesIndicator** | **Boolean** | Payer made direct sales totaling $5,000 or more of consumer products to recipient for resale |  [optional] |
|**cropInsuranceProceeds** | **Double** | Crop insurance proceeds |  [optional] |
|**excessGoldenParachute** | **Double** | (Legacy field) Excess golden parachute payments |  [optional] |
|**grossAmountPaidAttorney** | **Double** | Gross proceeds paid to an attorney |  [optional] |
|**section409ADeferrals** | **Double** | Section 409A deferrals |  [optional] |
|**section409AIncome** | **Double** | Nonqualified deferred compensation |  [optional] |
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
|**fatcaRequirementIndicator** | **Boolean** | FATCA filing requirement |  [optional] |
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



