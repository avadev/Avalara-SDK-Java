

# EventMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **Object** | Event-specific information |  |
|**signature** | [**SignatureValueSignature**](SignatureValueSignature.md) |  |  |
|**tenantId** | **String** | Tenant ID of the event |  |
|**correlationId** | **String** | The correlation ID used by Avalara to aid in tracing through to provenance of this event massage. |  [optional] |
|**systemCode** | **String** | The Avalara registered code for the system. See &lt;a href&#x3D;\&quot;https://avalara.atlassian.net/wiki/spaces/AIM/pages/637250338966/Taxonomy+Avalara+Systems\&quot;&gt;Taxonomy&amp;#58; Avalara Systems&lt;/a&gt; |  |
|**eventName** | **String** | Type of the event |  |
|**eventVersion** | **String** | Version of the included payload. |  [optional] |
|**receiptTimestamp** | **OffsetDateTime** | Timestamp when the event was received by the dispatch service. |  [optional] |



