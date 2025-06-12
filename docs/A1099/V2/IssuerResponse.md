

# IssuerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier set when the record is created |  [optional] [readonly] |
|**name** | **String** | Legal name, not DBA |  [optional] |
|**nameDba** | **String** | Optional DBA name or continuation of a long legal name |  [optional] |
|**tin** | **String** | Tax identification number |  [optional] |
|**referenceId** | **String** | Optional identifier for your reference, never shown to any agency or recipient.  We will also prefix download filenames with this value, if present.  Can only include letters, numbers, dashes, underscores and spaces. |  [optional] |
|**telephone** | **String** | Telephone number |  [optional] |
|**taxYear** | **Integer** | Tax year |  [optional] |
|**countryCode** | **String** | If there is a transfer agent, use the address of the transfer agent. |  [optional] |
|**email** | **String** | Email address |  [optional] |
|**address** | **String** | Address |  [optional] |
|**city** | **String** | City |  [optional] |
|**state** | **String** | State |  [optional] |
|**zip** | **String** | Zip code |  [optional] |
|**foreignProvince** | **String** | Foreign province |  [optional] |
|**transferAgentName** | **String** | Transfer Agent&#39;s Name |  [optional] |
|**lastFiling** | **Boolean** | Last year of filing for this payer |  [optional] |
|**createdAt** | **OffsetDateTime** | Date time when the issuer was created |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Date time when the issuer was updated |  [optional] [readonly] |



