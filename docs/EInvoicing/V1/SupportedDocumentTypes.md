

# SupportedDocumentTypes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Document type name. |  [optional] |
|**value** | **String** | Document type value. |  |
|**supportedByTradingPartner** | **Boolean** | Does trading partner support receiving this document type. |  |
|**supportedByAvalara** | **Boolean** | Does avalara support exchanging this document type. |  [optional] |
|**extensions** | [**List&lt;Extension&gt;**](Extension.md) | Optional array used to carry additional metadata or configuration values that may be required by specific document types. When creating or updating a trading partner, the keys provided in the &#39;extensions&#39; attribute must be selected from a predefined list of supported extensions. Using any unsupported keys will result in a validation error. |  [optional] |



