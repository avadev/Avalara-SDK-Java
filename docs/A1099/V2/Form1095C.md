

# Form1095C

Form 1095-C: Employer-Provided Health Insurance Offer and Coverage

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeFirstName** | **String** | Employee&#39;s first name |  |
|**employeeMiddleName** | **String** | Employee&#39;s middle name |  [optional] |
|**employeeLastName** | **String** | Employee&#39;s last name |  |
|**employeeNameSuffix** | **String** | Employee&#39;s name suffix |  [optional] |
|**recipientDateOfBirth** | **LocalDate** | Recipient&#39;s date of birth |  [optional] |
|**planStartMonth** | [**PlanStartMonthEnum**](#PlanStartMonthEnum) | Plan start month.  The calendar month during which the plan year begins of the health plan in which the employee is offered coverage (or would be offered coverage if the employee were eligible to participate in the plan).  Available values:  - 00: None  - 01: January  - 02: February  - 03: March  - 04: April  - 05: May  - 06: June  - 07: July  - 08: August  - 09: September  - 10: October  - 11: November  - 12: December |  |
|**employerProvidedSiCoverage** | **Boolean** | Employer provided self-insured coverage |  [optional] |
|**offerAndCoverages** | [**List&lt;OfferAndCoverage&gt;**](OfferAndCoverage.md) | Offer and coverage information |  |
|**coveredIndividuals** | [**List&lt;CoveredIndividual&gt;**](CoveredIndividual.md) | Covered individuals information |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Form type. |  |
|**id** | **String** | Form ID. Unique identifier set when the record is created. |  [optional] [readonly] |
|**issuerId** | **String** | Issuer ID - only required when creating forms |  [optional] |
|**issuerReferenceId** | **String** | Issuer Reference ID - only required when creating forms via $bulk-upsert |  [optional] |
|**issuerTin** | **String** | Issuer TIN - readonly |  [optional] |
|**taxYear** | **Integer** | Tax Year - only required when creating forms via $bulk-upsert |  [optional] |
|**referenceId** | **String** | Internal reference ID. Never shown to any agency or recipient. |  [optional] |
|**tin** | **String** | Recipient&#39;s Federal Tax Identification Number (TIN). |  [optional] |
|**recipientName** | **String** | Recipient name |  |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Tax Identification Number (TIN) type.  Available values: - EIN: Employer Identification Number - SSN: Social Security Number - ITIN: Individual Taxpayer Identification Number - ATIN: Adoption Taxpayer Identification Number |  [optional] |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address. |  |
|**address2** | **String** | Address line 2. |  [optional] |
|**city** | **String** | City. |  |
|**state** | **String** | Two-letter US state or Canadian province code (required for US/CA addresses). |  [optional] |
|**zip** | **String** | ZIP/postal code. |  [optional] |
|**email** | **String** | Recipient&#39;s Contact email address. |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**officeCode** | **String** | Office code |  [optional] |
|**nonUsProvince** | **String** | Province or region for non-US/CA addresses. |  [optional] |
|**countryCode** | **String** | Two-letter IRS country code (e.g., &#39;US&#39;, &#39;CA&#39;), as defined at https://www.irs.gov/e-file-providers/country-codes. |  |
|**federalEfileDate** | **LocalDate** | Date when federal e-filing should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled. |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEfileDate** | **LocalDate** | Date when state e-filing should be scheduled. Must be on or after federalEfileDate. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled. |  [optional] |
|**recipientEdeliveryDate** | **LocalDate** | Date when recipient e-delivery should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled. |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**noTin** | **Boolean** | No TIN indicator |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholding**](StateAndLocalWithholding.md) | State and local withholding information |  [optional] |
|**secondTinNotice** | **Boolean** | Second TIN notice |  [optional] |
|**federalEfileStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Federal e-file status.  Available values:  - unscheduled: Form has not been scheduled for federal e-filing  - scheduled: Form is scheduled for federal e-filing  - airlock: Form is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - sent: Form has been sent to the IRS  - accepted: Form was accepted by the IRS  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlock: Correction is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - corrected: A correction has been sent to the IRS  - corrected_accepted: Correction was accepted by the IRS  - rejected: Form was rejected by the IRS  - corrected_rejected: Correction was rejected by the IRS  - held: Form is held and will not be submitted to IRS (used for certain forms submitted only to states) |  [optional] [readonly] |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetail&gt;**](StateEfileStatusDetail.md) | State e-file status.  Available values:  - unscheduled: Form has not been scheduled for state e-filing  - scheduled: Form is scheduled for state e-filing  - airlocked: Form is in process of being uploaded to the state  - sent: Form has been sent to the state  - rejected: Form was rejected by the state  - accepted: Form was accepted by the state  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlocked: Correction is in process of being uploaded to the state  - corrected_sent: Correction has been sent to the state  - corrected_rejected: Correction was rejected by the state  - corrected_accepted: Correction was accepted by the state |  [optional] [readonly] |
|**postalMailStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Postal mail to recipient status.  Available values:  - unscheduled: Postal mail has not been scheduled  - pending: Postal mail is pending to be sent  - sent: Postal mail has been sent  - delivered: Postal mail has been delivered |  [optional] [readonly] |
|**tinMatchStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | TIN Match status.  Available values:  - none: TIN matching has not been performed  - pending: TIN matching request is pending  - matched: Name/TIN combination matches IRS records  - unknown: TIN is missing, invalid, or request contains errors  - rejected: Name/TIN combination does not match IRS records or TIN not currently issued |  [optional] [readonly] |
|**addressVerificationStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Address verification status.  Available values:  - unknown: Address verification has not been checked  - pending: Address verification is in progress  - failed: Address verification failed  - incomplete: Address verification is incomplete  - unchanged: User declined address changes  - verified: Address has been verified and accepted |  [optional] [readonly] |
|**eDeliveryStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | EDelivery status.  Available values:  - unscheduled: E-delivery has not been scheduled  - scheduled: E-delivery is scheduled to be sent  - sent: E-delivery has been sent to recipient  - bounced: E-delivery bounced back (invalid email)  - refused: E-delivery was refused by recipient  - bad_verify: E-delivery failed verification  - accepted: E-delivery was accepted by recipient  - bad_verify_limit: E-delivery failed verification limit reached  - second_delivery: Second e-delivery attempt  - undelivered: E-delivery is undelivered (temporary state allowing resend) |  [optional] [readonly] |
|**validationErrors** | [**List&lt;ValidationError&gt;**](ValidationError.md) | Validation errors |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Date time when the record was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Date time when the record was last updated. |  [optional] [readonly] |



## Enum: PlanStartMonthEnum

| Name | Value |
|---- | -----|
| _00 | &quot;00&quot; |
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |
| _07 | &quot;07&quot; |
| _08 | &quot;08&quot; |
| _09 | &quot;09&quot; |
| _10 | &quot;10&quot; |
| _11 | &quot;11&quot; |
| _12 | &quot;12&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FORM1099_NEC | &quot;Form1099Nec&quot; |
| FORM1099_MISC | &quot;Form1099Misc&quot; |
| FORM1099_DIV | &quot;Form1099Div&quot; |
| FORM1099_R | &quot;Form1099R&quot; |
| FORM1099_K | &quot;Form1099K&quot; |
| FORM1095_B | &quot;Form1095B&quot; |
| FORM1042_S | &quot;Form1042S&quot; |
| FORM1095_C | &quot;Form1095C&quot; |
| FORM1099_INT | &quot;Form1099Int&quot; |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



