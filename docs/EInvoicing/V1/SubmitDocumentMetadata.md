

# SubmitDocumentMetadata

Key value pairs of metadata for a document submission. dataFormat can be ubl-invoice or ubl-creditnote:  <br><pre>{  \"workflowId\": \"partner-einvoicing\", \"dataFormat\": \"ubl-invoice\", \"dataFormatVersion\": \"2.1\", \"countryCode\": \"SA\", \"countryMandate\": \"SA-Phase1-B2B\" }</pre> <br> 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workflowId** | **String** | Specifies a unique ID for this workflow. |  |
|**dataFormat** | **String** | Specifies the data format for this workflow. |  |
|**dataFormatVersion** | **String** | Specifies the data format version number. |  |
|**countryCode** | **String** | The two-letter ISO-3166 country code for the country where the e-invoice is being submitted |  |
|**countryMandate** | **String** | The e-invoicing mandate for the specified country. |  |



