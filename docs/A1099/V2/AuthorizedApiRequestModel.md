

# AuthorizedApiRequestModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**path** | **String** | The path and query of the API request you want to pre-authorize, omitting the leading /api/ |  [optional] |
|**ttl** | **Integer** | Seconds until this AuthorizedApiRequest should expire, 3600 if omitted; values greater than 86400 will not be honored |  [optional] |



