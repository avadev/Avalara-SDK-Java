

# ReportListResponse

Returns the requested list of reports matching the query parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atRecordsetCount** | **String** | Count of reports matching the filter for the given query. Present when the request includes $count&#x3D;true. |  [optional] |
|**atNextLink** | **String** | URL to retrieve the next page of results when more items match the query. Omitted or null when there is no next page. |  [optional] |
|**value** | [**List&lt;ReportItem&gt;**](ReportItem.md) | Array of reports matching the query parameters. |  |



