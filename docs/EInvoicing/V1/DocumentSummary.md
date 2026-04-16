

# DocumentSummary

Displays a summary of information about the document

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID for this document |  [optional] |
|**companyId** | **String** | Unique identifier that represents the company within the system. |  [optional] |
|**processDateTime** | **String** | The date and time when the document was processed, displayed in the format YYYY-MM-DDThh:mm:ss |  [optional] |
|**status** | **String** | The Document status |  [optional] |
|**businessStatus** | **String** | Represents the document&#39;s business lifecycle state based on responses from external actors (Tax Authority, PDP, or ERP), such as acceptance, rejection, or validation. |  [optional] |
|**supplierName** | **String** | The name of the supplier in the transaction |  [optional] |
|**customerName** | **String** | The name of the customer in the transaction |  [optional] |
|**documentType** | **String** | The document type |  [optional] |
|**documentVersion** | **String** | The document version |  [optional] |
|**documentNumber** | **String** | The document number |  [optional] |
|**documentDate** | **String** | The document issue date |  [optional] |
|**flow** | **String** | The document direction, where issued &#x3D; &#x60;out&#x60; and received &#x3D; &#x60;in&#x60; |  [optional] |
|**countryCode** | **String** | The two-letter ISO-3166 country code for the country where the document is being submitted |  [optional] |
|**countryMandate** | **String** | The e-invoicing mandate for the specified country |  [optional] |
|**_interface** | **String** | The interface where the document is sent |  [optional] |
|**receiver** | **String** | The document recipient based on the interface |  [optional] |
|**events** | [**List&lt;StatusEvent&gt;**](StatusEvent.md) | Array of status events associated with this document. Events are included in each document in the response only when the query parameter $include&#x3D;events is passed; otherwise the events array is not populated. |  [optional] |
|**createdAt** | **String** | The date and time when the document was created in the system, displayed in ISO 8601 format with timezone |  [optional] |
|**lastUpdatedAt** | **String** | The date and time when the document was last updated in the system, displayed in ISO 8601 format with timezone |  [optional] |



