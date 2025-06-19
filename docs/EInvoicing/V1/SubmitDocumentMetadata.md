

# SubmitDocumentMetadata

Key value pairs of metadata for a document submission <br><pre>{  \"workflowId\": \"partner-einvoicing\", \"dataFormat\": \"ubl-invoice\", \"dataFormatVersion\": \"2.1\", \"countryCode\": \"SA\", \"countryMandate\": \"SA-Phase1-B2B\" }</pre> <br> 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workflowId** | **String** | Specifies a unique ID for this workflow. |  |
|**dataFormat** | **String** | Specifies the data format for this workflow. |  |
|**dataFormatVersion** | **String** | Specifies the data format version number. |  |
|**outputDataFormat** | **String** | Specifies the format of the output document to be generated for the recipient. This format should be chosen based on the recipient&#39;s preferences or requirements as defined by applicable e-invoicing regulations. When not specified for mandates that don&#39;t require a specific output format, the system will use the default format defined for that mandate. |  [optional] |
|**outputDataFormatVersion** | **String** | Specifies the version of the selected output document format |  [optional] |
|**countryCode** | **String** | The two-letter ISO-3166 country code for the country where the document is being submitted |  |
|**countryMandate** | **String** | The e-invoicing mandate for the specified country. |  |



