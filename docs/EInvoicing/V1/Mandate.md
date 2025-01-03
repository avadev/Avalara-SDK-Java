

# Mandate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mandateId** | **String** | The &#x60;mandateId&#x60; is comprised of the country code, mandate type, and the network or regulation type (for example, AU-B2G-PEPPOL). Keep in mind the following when specifying a &#x60;mandateId&#x60;. - A country can have multiple mandate types (B2C, B2B, B2G). - A entity/company can opt in for multiple mandates. - A &#x60;mandateId&#x60; is the combination of country + mandate type + network/regulation. |  [optional] |
|**countryMandate** | **String** | **[LEGACY]** This field is retained for backward compatibility. It is recommended to use &#x60;mandateId&#x60; instead. The &#x60;countryMandate&#x60; similar to the &#x60;mandateId&#x60; is comprised of the country code, mandate type, and the network or regulation type (for example, AU-B2G-PEPPOL).  |  [optional] |
|**countryCode** | **String** | Country code |  [optional] |
|**description** | **String** | Mandate description |  [optional] |
|**supportedByPartnerAPI** | **Boolean** | Indicates whether this mandate supported by the partner API |  [optional] |
|**mandateFormat** | **String** | Mandate format |  [optional] |
|**inputDataFormats** | [**List&lt;InputDataFormats&gt;**](InputDataFormats.md) | Format and version used when inputting the data |  [optional] |
|**workflowIds** | [**List&lt;WorkflowIds&gt;**](WorkflowIds.md) | Workflow ID list |  [optional] |



