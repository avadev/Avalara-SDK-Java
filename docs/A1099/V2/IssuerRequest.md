

# IssuerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Legal name. Not the DBA name. |  |
|**dbaName** | **String** | Doing Business As (DBA) name or continuation of a long legal name. Use either this or &#39;transferAgentName&#39;. |  [optional] |
|**tin** | **String** | Federal Tax Identification Number (TIN). |  [optional] |
|**referenceId** | **String** | Internal reference ID. Never shown to any agency or recipient. If present, it will prefix download filenames. Allowed characters: letters, numbers, dashes, underscores, and spaces. |  [optional] |
|**telephone** | **String** | Contact phone number (must contain at least 10 digits, max 15 characters). For recipient inquiries. |  |
|**taxYear** | **Integer** | Tax year for which the forms are being filed (e.g., 2024). Must be within current tax year and current tax year - 4. |  |
|**countryCode** | **String** | Two-letter IRS country code (e.g., &#39;US&#39;, &#39;CA&#39;), as defined at https://www.irs.gov/e-file-providers/country-codes. If there is a transfer agent, use the transfer agent&#39;s shipping address. |  [optional] |
|**email** | **String** | Contact email address. For recipient inquiries. |  |
|**address** | **String** | Address. |  |
|**city** | **String** | City. |  |
|**state** | **String** | Two-letter US state or Canadian province code (required for US/CA addresses). |  |
|**zip** | **String** | ZIP/postal code. |  |
|**foreignProvince** | **String** | Province or region for non-US/CA addresses. |  [optional] |
|**transferAgentName** | **String** | Name of the transfer agent, if applicable — optional; use either this or &#39;dbaName&#39;. |  [optional] |
|**lastFiling** | **Boolean** | Indicates if this is the issuer&#39;s final year filing. |  |



