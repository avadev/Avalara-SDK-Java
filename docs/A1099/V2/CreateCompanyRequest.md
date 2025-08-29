

# CreateCompanyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Legal name. Not the DBA name. |  |
|**dbaName** | **String** | Doing Business As (DBA) name or continuation of a long legal name. |  [optional] |
|**email** | **String** | Contact email address. For inquiries by vendors/employees. |  |
|**address** | **String** | Address. |  |
|**city** | **String** | City. |  |
|**state** | **String** | Two-letter US state or Canadian province code (required for US/CA addresses). |  [optional] |
|**zip** | **String** | ZIP/postal code. |  |
|**telephone** | **String** | Contact phone number (must contain at least 10 digits, max 15 characters). |  |
|**tin** | **String** | Federal Tax Identification Number (TIN). EIN/Tax ID (required for US companies). |  |
|**referenceId** | **String** | Internal reference ID. Never shown to any agency or recipient. |  [optional] |
|**doTinMatch** | **Boolean** | Indicates whether the company authorizes IRS TIN matching. |  [optional] |
|**groupName** | **String** | Group name for organizing companies (creates or finds group by name). |  [optional] |
|**foreignProvince** | **String** | Province or region for non-US/CA addresses. |  [optional] |
|**countryCode** | **String** | Two-letter IRS country code (e.g., &#39;US&#39;, &#39;CA&#39;), as defined at https://www.irs.gov/e-file-providers/country-codes. |  |
|**resendRequests** | **Boolean** | Boolean to enable automatic reminder emails (default: false). |  [optional] |
|**resendIntervalDays** | **Integer** | Days between reminder emails (7-365, required if resendRequests is true). |  [optional] |
|**maxReminderAttempts** | **Integer** | Maximum number of reminder attempts (1-52, required if resendRequests is true). |  [optional] |
|**id** | **String** | Unique identifier set when the record is created. |  [optional] |
|**createdAt** | **OffsetDateTime** | Date time when the record was created. |  [optional] |
|**updatedAt** | **OffsetDateTime** | Date time when the record was last updated. |  [optional] |



