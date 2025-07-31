

# Form1099MiscListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rents** | **Double** | Rents |  [optional] |
|**royalties** | **Double** | Royalties |  [optional] |
|**otherIncome** | **Double** | Other income |  [optional] |
|**fedIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**fishingBoatProceeds** | **Double** | Fishing boat proceeds |  [optional] |
|**medicalAndHealthCarePayments** | **Double** | Medical and health care payments |  [optional] |
|**directSalesIndicator** | **Boolean** | Payer made direct sales totaling $5,000 or more of consumer products to recipient for resale |  [optional] |
|**substitutePayments** | **Double** | Substitute payments in lieu of dividends or interest |  [optional] |
|**cropInsuranceProceeds** | **Double** | Crop insurance proceeds |  [optional] |
|**grossProceedsPaidToAttorney** | **Double** | Gross proceeds paid to an attorney |  [optional] |
|**fishPurchasedForResale** | **Double** | Fish purchased for resale |  [optional] |
|**section409ADeferrals** | **Double** | Section 409A deferrals |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | FATCA filing requirement |  [optional] |
|**excessGoldenParachutePayments** | **Double** | (Legacy field) Excess golden parachute payments |  [optional] |
|**nonqualifiedDeferredCompensation** | **Double** | Nonqualified deferred compensation |  [optional] |
|**issuerReferenceId** | **String** | Issuer Reference ID. One of &#x60;issuerReferenceId&#x60; or &#x60;issuerTin&#x60; is required. |  [optional] |
|**issuerTin** | **String** | Issuer TIN. One of &#x60;issuerReferenceId&#x60; or &#x60;issuerTin&#x60; is required. |  [optional] |
|**taxYear** | **Integer** | Tax year |  |
|**issuerId** | **String** | Issuer ID |  [optional] |
|**referenceId** | **String** | Reference ID |  [optional] |
|**recipientTin** | **String** | Recipient Tax ID Number |  [optional] |
|**recipientName** | **String** | Recipient name |  [optional] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address |  |
|**address2** | **String** | Address line 2 |  [optional] |
|**city** | **String** | City |  |
|**state** | **String** | US state. Required if CountryCode is \&quot;US\&quot;. |  [optional] |
|**zip** | **String** | Zip/postal code |  [optional] |
|**email** | **String** | Recipient email address |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**officeCode** | **String** | Office code |  [optional] |
|**nonUsProvince** | **String** | Foreign province |  [optional] |
|**countryCode** | **String** | Country code, as defined at https://www.irs.gov/e-file-providers/country-codes |  |
|**federalEFile** | **Boolean** | Boolean indicating that federal e-filing should be scheduled for this form |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEFile** | **Boolean** | Boolean indicating that state e-filing should be scheduled for this form |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**noTin** | **Boolean** | Indicates whether the recipient has no TIN |  [optional] |
|**secondTinNotice** | **Boolean** | Second TIN notice in three years |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingRequest**](StateAndLocalWithholdingRequest.md) | State and local withholding information |  [optional] |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



