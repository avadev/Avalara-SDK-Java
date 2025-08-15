

# Form1099RListItemResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grossDistributions** | **Double** | Gross distribution |  [optional] |
|**taxableAmount** | **Double** | Taxable amount |  [optional] |
|**taxableAmountNotDetermined** | **Boolean** | Taxable amount not determined |  [optional] |
|**totalDistributionIndicator** | **Boolean** | Total distribution |  [optional] |
|**capitalGain** | **Double** | Capital gain (included in Box 2a) |  [optional] |
|**fedIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
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



