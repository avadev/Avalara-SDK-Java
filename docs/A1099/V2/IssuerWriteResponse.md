

# IssuerWriteResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validationErrors** | [**List&lt;ValidationError&gt;**](ValidationError.md) | Field-level validation errors. Populated when a POST or PUT request violated business rules  but the issuer was still persisted. Each entry identifies the affected field and the issue.  Empty array when the payload was fully valid. |  [optional] [readonly] |
|**id** | **String** | Unique identifier set when the record is created. |  [optional] |
|**createdAt** | **OffsetDateTime** | Date time when the record was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Date time when the record was last updated. |  [optional] |
|**businessName** | **String** | Business name. Required when the recipient of the form is a business; should only be used for businesses. |  |
|**businessName2** | **String** | Business name line 2. Should only be used for businesses. Use either this or &#39;transferAgentName&#39;. |  [optional] |
|**name** | **String** | Legal name. Not the DBA name. Deprecated alias for &#39;businessName&#39;. |  [optional] |
|**dbaName** | **String** | Doing Business As (DBA) name or continuation of a long legal name. Deprecated alias for &#39;businessName2&#39;. Use either this or &#39;transferAgentName&#39;. |  [optional] |
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Recipient classification.  The platform is transitioning from tax identifier classifications to recipient entity classifications. New values represent recipient entity types and should be preferred. Deprecated values represent identifier formats and remain supported for backward compatibility only.  Available values: - INDIVIDUAL: Recipient is an individual - BUSINESS: Recipient is a business - UNKNOWN: Recipient classification is unknown - EIN: (Deprecated - use BUSINESS) Employer Identification Number - SSN: (Deprecated - use INDIVIDUAL) Social Security Number - ITIN: (Deprecated - use INDIVIDUAL) Individual Taxpayer Identification Number - ATIN: (Deprecated - use INDIVIDUAL) Adoption Taxpayer Identification Number |  [optional] |
|**firstName** | **String** | First name. Required when the recipient of the form is an individual; should only be used for individuals. |  [optional] |
|**middleName** | **String** | Middle name. Should only be used for individuals. |  [optional] |
|**lastName** | **String** | Last name. Required when the recipient of the form is an individual; should only be used for individuals. |  [optional] |
|**suffix** | **String** | Suffix name. Should only be used for individuals. |  [optional] |
|**tin** | **String** | Federal Tax Identification Number (TIN). |  [optional] |
|**referenceId** | **String** | Internal reference ID. Never shown to any agency or recipient. If present, it will prefix download filenames. Allowed characters: letters, numbers, dashes, underscores, and spaces. |  [optional] |
|**telephone** | **String** | Contact phone number (must contain at least 10 digits, max 15 characters). For recipient inquiries. |  |
|**taxYear** | **Integer** | Tax year for which the forms are being filed (e.g., 2024). Must be within current tax year and current tax year - 4. It&#39;s only required on creation, and cannot be modified on update. |  |
|**countryCode** | **String** | Two-letter IRS country code (e.g., &#39;US&#39;, &#39;CA&#39;), as defined at https://www.irs.gov/e-file-providers/country-codes. If there is a transfer agent, use the transfer agent&#39;s shipping address. |  |
|**email** | **String** | Contact email address. For recipient inquiries. Phone will be used on communications if you don&#39;t specify an email |  [optional] |
|**address** | **String** | Address. |  |
|**city** | **String** | City. |  |
|**state** | **String** | Two-letter US state or Canadian province code (required for US/CA addresses). |  |
|**zip** | **String** | ZIP/postal code. |  |
|**foreignProvince** | **String** | Province or region for non-US/CA addresses. |  [optional] |
|**transferAgentName** | **String** | Name of the transfer agent, if applicable — optional; use either this or &#39;dbaName&#39;. |  [optional] |
|**lastFiling** | **Boolean** | Indicates if this is the issuer&#39;s final year filing. |  |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| BUSINESS | &quot;BUSINESS&quot; |



