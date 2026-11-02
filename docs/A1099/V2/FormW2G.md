

# FormW2G

Form W-2G: Certain Gambling Winnings                The recipient is the winner and the issuer is the payer.                *Required:* `reportableWinnings`, `dateWon`, which must fall in the tax year, and `typeOfWager`.  `reportableWinnings` only has to be present; zero is accepted.                When the issuer's account checks for reasonable withholding, `federalIncomeTaxWithheld` can't be more than  31.58% of `reportableWinnings` and `winningsFromIdenticalWagers` combined (40% in January).                The text fields are not length-checked, but only the first 15 characters (`transaction`, `firstId` and `secondId`)  or 5 characters (`race`, `cashier` and `window`) are e-filed.                `state` and `stateId` are required when `stateTaxWithheld` has an amount. W-2G has no locality ID field, so  `localityId` is discarded and reads back as `null`.                Form W-2G has no second TIN notice, so `secondTinNotice` is discarded and reads back as `null`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportableWinnings** | **Double** | Reportable winnings |  |
|**dateWon** | **LocalDate** | Date won. Must fall in the tax year. |  |
|**typeOfWager** | [**TypeOfWagerEnum**](#TypeOfWagerEnum) | Type of wager.                * &#x60;1&#x60; - Horse race track (or off-track betting of a horse track nature)  * &#x60;2&#x60; - Dog race track (or off-track betting of a dog track nature)  * &#x60;3&#x60; - Jai-alai  * &#x60;4&#x60; - State-conducted lottery  * &#x60;5&#x60; - Keno  * &#x60;6&#x60; - Bingo  * &#x60;7&#x60; - Slot machines  * &#x60;8&#x60; - Poker winnings  * &#x60;9&#x60; - Any other type of gambling winnings                Any other code is treated as missing, so the form is saved with a \&quot;can&#39;t be blank\&quot; error on  &#x60;#/box_3_type_wager&#x60;. |  |
|**federalIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**transaction** | **String** | Transaction, such as the ticket or card number |  [optional] |
|**race** | **String** | Race, such as the race or game number |  [optional] |
|**winningsFromIdenticalWagers** | **Double** | Winnings from identical wagers |  [optional] |
|**cashier** | **String** | Cashier |  [optional] |
|**window** | **String** | Window |  [optional] |
|**firstId** | **String** | First identification of the winner, such as a driver&#39;s license number |  [optional] |
|**secondId** | **String** | Second identification of the winner |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Form type. |  |
|**id** | **String** | Form ID. Unique identifier set when the record is created. |  [optional] [readonly] |
|**issuerId** | **String** | Issuer ID - only required when creating forms |  [optional] |
|**issuerReferenceId** | **String** | Issuer Reference ID - only required when creating forms via $bulk-upsert |  [optional] |
|**issuerTin** | **String** | Issuer TIN - readonly |  [optional] |
|**taxYear** | **Integer** | Tax Year - only required when creating forms via $bulk-upsert |  [optional] |
|**referenceId** | **String** | Internal reference ID. Never shown to any agency or recipient. |  [optional] |
|**tin** | **String** | Recipient&#39;s Federal Tax Identification Number (TIN). |  [optional] |
|**recipientName** | **String** | DEPRECATED: Use &#x60;businessName&#x60; for businesses; use &#x60;firstName&#x60;, &#x60;middleName&#x60;, &#x60;lastName&#x60;, and &#x60;suffixName&#x60; for individuals. |  [optional] |
|**address** | **String** | Address. |  |
|**address2** | **String** | Address line 2. |  [optional] |
|**city** | **String** | City. |  |
|**state** | **String** | Two-letter US state or Canadian province code (required for US/CA addresses). |  [optional] |
|**zip** | **String** | ZIP/postal code. |  [optional] |
|**email** | **String** | Recipient&#39;s Contact email address. |  [optional] |
|**nonUsProvince** | **String** | Province or region for non-US/CA addresses. |  [optional] |
|**countryCode** | **String** | Two-letter IRS country code (e.g., &#39;US&#39;, &#39;CA&#39;), as defined at https://www.irs.gov/e-file-providers/country-codes. |  |
|**federalEfileDate** | **LocalDate** | Date when federal e-filing should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled. |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEfileDate** | **LocalDate** | Date when state e-filing should be scheduled. Must be on or after federalEfileDate. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled. |  [optional] |
|**recipientEdeliveryDate** | **LocalDate** | Date when recipient e-delivery should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled. |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholding**](StateAndLocalWithholding.md) | State and local withholding information |  [optional] |
|**federalEfileStatus** | [**FederalEfileStatusDetail**](FederalEfileStatusDetail.md) | Federal e-file status.  Available values:  - unscheduled: Form has not been scheduled for federal e-filing  - scheduled: Form is scheduled for federal e-filing  - airlock: Form is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - sent: Form has been sent to the IRS  - accepted: Form was accepted by the IRS  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlock: Correction is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - corrected: A correction has been sent to the IRS  - corrected_accepted: Correction was accepted by the IRS  - rejected: Form was rejected by the IRS  - corrected_rejected: Correction was rejected by the IRS  - held: Form is held and will not be submitted to IRS (used for certain forms submitted only to states)  When the form&#39;s most recent IRIS filing was rejected or accepted with errors, &#x60;errors&#x60; lists what the IRS reported. |  [optional] [readonly] |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetail&gt;**](StateEfileStatusDetail.md) | State e-file status.  Available values:  - unscheduled: Form has not been scheduled for state e-filing  - scheduled: Form is scheduled for state e-filing  - airlocked: Form is in process of being uploaded to the state  - sent: Form has been sent to the state  - rejected: Form was rejected by the state  - accepted: Form was accepted by the state  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlocked: Correction is in process of being uploaded to the state  - corrected_sent: Correction has been sent to the state  - corrected_rejected: Correction was rejected by the state  - corrected_accepted: Correction was accepted by the state |  [optional] [readonly] |
|**postalMailStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Postal mail to recipient status.  Available values:  - unscheduled: Postal mail has not been scheduled  - pending: Postal mail is pending to be sent  - sent: Postal mail has been sent  - delivered: Postal mail has been delivered |  [optional] [readonly] |
|**tinMatchStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | TIN Match status.  Available values:  - none: TIN matching has not been performed  - pending: TIN matching request is pending  - matched: Name/TIN combination matches IRS records  - unknown: TIN is missing, invalid, or request contains errors  - rejected: Name/TIN combination does not match IRS records or TIN not currently issued |  [optional] [readonly] |
|**addressVerificationStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Address verification status.  Available values:  - unknown: Address verification has not been checked  - pending: Address verification is in progress  - failed: Address verification failed  - incomplete: Address verification is incomplete  - unchanged: User declined address changes  - verified: Address has been verified and accepted |  [optional] [readonly] |
|**eDeliveryStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | EDelivery status.  Available values:  - unscheduled: E-delivery has not been scheduled  - scheduled: E-delivery is scheduled to be sent  - sent: E-delivery has been sent to recipient  - bounced: E-delivery bounced back (invalid email)  - refused: E-delivery was refused by recipient  - bad_verify: E-delivery failed verification  - accepted: E-delivery was accepted by recipient  - bad_verify_limit: E-delivery failed verification limit reached  - second_delivery: Second e-delivery attempt  - undelivered: E-delivery is undelivered (temporary state allowing resend) |  [optional] [readonly] |
|**validationErrors** | [**List&lt;ValidationError&gt;**](ValidationError.md) | Validation errors |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Date time when the record was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Date time when the record was last updated. |  [optional] [readonly] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Recipient classification.  The platform is transitioning from tax identifier classifications to recipient entity classifications. New values represent recipient entity types and should be preferred. Deprecated values represent identifier formats and remain supported for backward compatibility only.  Available values: - INDIVIDUAL: Recipient is an individual - BUSINESS: Recipient is a business - UNKNOWN: Recipient classification is unknown - EIN: (Deprecated - use BUSINESS) Employer Identification Number - SSN: (Deprecated - use INDIVIDUAL) Social Security Number - ITIN: (Deprecated - use INDIVIDUAL) Individual Taxpayer Identification Number - ATIN: (Deprecated - use INDIVIDUAL) Adoption Taxpayer Identification Number |  [optional] |
|**businessName** | **String** | Business name. Required when the recipient of the form is a business; should only be used for businesses. |  [optional] |
|**businessName2** | **String** | Business name line 2. Should only be used for businesses. |  [optional] |
|**firstName** | **String** | First name. Required when the recipient of the form is an individual; should only be used for individuals. |  [optional] |
|**middleName** | **String** | Middle name. Should only be used for individuals. |  [optional] |
|**lastName** | **String** | Last name. Required when the recipient of the form is an individual; should only be used for individuals. |  [optional] |
|**suffixName** | **String** | Suffix name. Should only be used for individuals. |  [optional] |
|**recipientSecondName** | **String** | DEPRECATED: Use &#x60;businessName2&#x60; instead. |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**officeCode** | **String** | Office code |  [optional] |
|**noTin** | **Boolean** | No TIN indicator |  [optional] |
|**secondTinNotice** | **Boolean** | Second TIN notice |  [optional] |



## Enum: TypeOfWagerEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| _1042_S | &quot;1042-S&quot; |
| _1095_B | &quot;1095-B&quot; |
| _1095_C | &quot;1095-C&quot; |
| _1098 | &quot;1098&quot; |
| _1098_E | &quot;1098-E&quot; |
| _1098_T | &quot;1098-T&quot; |
| _1099_B | &quot;1099-B&quot; |
| _1099_C | &quot;1099-C&quot; |
| _1099_DIV | &quot;1099-DIV&quot; |
| _1099_G | &quot;1099-G&quot; |
| _1099_INT | &quot;1099-INT&quot; |
| _1099_K | &quot;1099-K&quot; |
| _1099_MISC | &quot;1099-MISC&quot; |
| _1099_NEC | &quot;1099-NEC&quot; |
| _1099_PATR | &quot;1099-PATR&quot; |
| _1099_R | &quot;1099-R&quot; |
| _1099_S | &quot;1099-S&quot; |
| _1099_SA | &quot;1099-SA&quot; |
| _5498 | &quot;5498&quot; |
| W_2 | &quot;W-2&quot; |
| W_2_G | &quot;W-2G&quot; |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| BUSINESS | &quot;BUSINESS&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



