

# TinMatchStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**time** | **OffsetDateTime** | The current timestamp for the TIN match request. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status for the TIN match request. |  [optional] |
|**irsResponse** | [**IrsResponse**](IrsResponse.md) | The IRS response. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| PENDING | &quot;Pending&quot; |
| MATCHED | &quot;Matched&quot; |
| FAILED | &quot;Failed&quot; |



