

# TaxIdentifierRequest

Represents a request to validate company’s tax identifier.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryCode** | **String** | The two-letter ISO-3166 country code of the tax identifier. |  |
|**identifierType** | **String** | Type of the identifier. |  |
|**identifier** | **String** | The tax identifier of the company. |  |
|**extensions** | **Object** | Optional field for adding additional details required by specific tax authorities. Refer to the GET /tax-identifiers/schema API endpoint for the full request structure for a given country. |  [optional] |



