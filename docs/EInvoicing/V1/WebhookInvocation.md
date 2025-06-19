

# WebhookInvocation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of this specific resource. |  |
|**retryCount** | **Integer** | The number of invocation attempts. |  [optional] |
|**retryMax** | **Integer** | The maximum retries that may be attempted in total. |  [optional] |
|**invocationTimestamp** | **OffsetDateTime** | Initial timestamp of the first invocation attempt. |  |
|**retryTimestamp** | **OffsetDateTime** | Timestamp of this invocation attempt. |  [optional] |
|**items** | [**List&lt;EventMessage&gt;**](EventMessage.md) | Array of events being delivered in the webhook |  |



