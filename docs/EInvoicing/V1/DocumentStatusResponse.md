

# DocumentStatusResponse

Returns the current document ID and status

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique ID for this document |  [optional] |
|**status** | **String** | Document status. See the &#x60;supportedDocumentStatuses&#x60; field in the GET /mandates response for full status definitions. |  [optional] |
|**businessStatus** | **String** | Represents the document&#39;s business lifecycle state based on responses from external actors (Tax Authority, PDP, or ERP), such as acceptance, rejection, or validation. |  [optional] |
|**events** | [**List&lt;StatusEvent&gt;**](StatusEvent.md) |  |  [optional] |



