

# BatchSearch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the batch search |  [optional] |
|**name** | **String** | Name of the batch report |  [optional] |
|**createdBy** | **String** | Email of the user who created the batch search |  [optional] |
|**created** | **OffsetDateTime** | Timestamp when the batch search was created |  [optional] |
|**lastModified** | **OffsetDateTime** | Timestamp when the batch search was created |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the batch search |  [optional] |
|**error** | [**ErrorResponse**](ErrorResponse.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;Accepted&quot; |
| RUNNING | &quot;Running&quot; |
| COMPLETED | &quot;Completed&quot; |
| FAILED | &quot;Failed&quot; |



