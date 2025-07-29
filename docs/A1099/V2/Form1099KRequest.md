

# Form1099KRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filerType** | **Integer** | Filer type (PSE or EPF) |  [optional] |
|**paymentType** | **Integer** | Payment type (payment card or third party network) |  [optional] |
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
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**issuerId** | **String** | Issuer ID |  [optional] |
|**referenceId** | **String** | Reference ID |  [optional] |
|**recipientTin** | **String** | Recipient Tax ID Number |  [optional] |
|**recipientName** | **String** | Recipient name |  |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Type of TIN (Tax ID Number). Will be one of:  * SSN  * EIN  * ITIN  * ATIN |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address |  |
|**address2** | **String** | Address line 2 |  [optional] |
|**city** | **String** | City |  |
|**state** | **String** | US state. Required if CountryCode is \&quot;US\&quot;. |  [optional] |
|**zip** | **String** | Zip/postal code |  [optional] |
|**recipientEmail** | **String** | Recipient email address |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**officeCode** | **String** | Office code |  [optional] |
|**recipientNonUsProvince** | **String** | Foreign province |  [optional] |
|**countryCode** | **String** | Country code, as defined at https://www.irs.gov/e-file-providers/country-codes |  |
|**federalEFile** | **Boolean** | Boolean indicating that federal e-filing should be scheduled for this form |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEFile** | **Boolean** | Boolean indicating that state e-filing should be scheduled for this form |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholdingRequest**](StateAndLocalWithholdingRequest.md) | State and local withholding information |  [optional] |



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



