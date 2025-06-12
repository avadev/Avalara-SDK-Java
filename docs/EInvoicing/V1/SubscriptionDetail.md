

# SubscriptionDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of this specific resource. |  |
|**description** | **String** | Description of the subscription |  [optional] |
|**notificationUrl** | **String** | The URL of the webhook endpoint to which event messages will be delivered |  |
|**signature** | [**SignatureSignature**](SignatureSignature.md) |  |  |
|**events** | [**List&lt;EventSubscription&gt;**](EventSubscription.md) |  |  |



