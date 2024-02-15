

# DocumentSummary

Displays a summary of information about the document

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID for this document |  [optional] |
|**processDateTime** | **String** | The date and time when the document was processed, displayed in the format YYYY-MM-DDThh:mm:ss |  [optional] |
|**status** | **String** | The transaction status: &lt;br&gt; &#39;Pending&#39; &lt;br&gt; &#39;Failed&#39; &lt;br&gt; &#39;Complete&#39; |  [optional] |
|**supplierName** | **String** | The name of the supplier in the transaction |  [optional] |
|**customerName** | **String** | The name of the customer in the transaction |  [optional] |
|**documentNumber** | **String** | The invoice document number |  [optional] |
|**documentDate** | **String** | The invoice issue date |  [optional] |
|**flow** | **String** | The invoice direction, where issued &#x3D; &#x60;out&#x60; and received &#x3D; &#x60;in&#x60; |  [optional] |
|**countryCode** | **String** | The two-letter ISO-3166 country code for the country where the e-invoice is being submitted |  [optional] |
|**countryMandate** | **String** | The e-invoicing mandate for the specified country |  [optional] |
|**_interface** | **String** | The interface where the invoice data is sent |  [optional] |
|**receiver** | **String** | The invoice recipient based on the interface |  [optional] |



