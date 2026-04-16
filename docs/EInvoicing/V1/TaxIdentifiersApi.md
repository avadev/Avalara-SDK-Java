# TaxIdentifiersApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxIdentifierSchemaByCountry**](TaxIdentifiersApi.md#taxIdentifierSchemaByCountry) | **GET** /tax-identifiers/schema | Returns the tax identifier request and response schema for a specific country.
[**validateTaxIdentifier**](TaxIdentifiersApi.md#validateTaxIdentifier) | **POST** /tax-identifiers/validate | Validates a tax identifier.



## taxIdentifierSchemaByCountry

> TaxIdentifierSchemaByCountry200Response taxIdentifierSchemaByCountry(avalaraVersion, countryCode, xAvalaraClient, xCorrelationID, type)

Returns the tax identifier request and response schema for a specific country.

Returns the tax identifier request and response schema for a specific country.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.TaxIdentifiersApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        configuration.setTimeout(5000);
        configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
        // Configure HTTP basic authorization
        configuration.setUsername("YOUR USERNAME");
        configuration.setPassword("YOUR PASSWORD");
        // Configure OAuth2 access token for authorization
        configuration.setBearerToken("YOUR ACCESS TOKEN");
        
        ApiClient apiClient = new ApiClient(configuration);

        TaxIdentifiersApi apiInstance = new TaxIdentifiersApi(apiClient);
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String countryCode = "DE"; // String | Two-letter ISO 3166 country code for which to retrieve the schema (for example \"DE\").
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        String type = "request"; // String | Specifies which schema to return: \"request\" to receive the request validation schema or \"response\" to receive the response validation schema.
        try {
            TaxIdentifierSchemaByCountry200Response result = apiInstance.taxIdentifierSchemaByCountry(avalaraVersion, countryCode, xAvalaraClient, xCorrelationID, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxIdentifiersApi#taxIdentifierSchemaByCountry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **countryCode** | **String**| Two-letter ISO 3166 country code for which to retrieve the schema (for example \&quot;DE\&quot;). |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]
 **type** | **String**| Specifies which schema to return: \&quot;request\&quot; to receive the request validation schema or \&quot;response\&quot; to receive the response validation schema. | [optional] [enum: request, response]

### Return type

[**TaxIdentifierSchemaByCountry200Response**](TaxIdentifierSchemaByCountry200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an object containing countryCode, schemaType, and schema. The schema property contains a JSON Schema (Draft-07) used to validate tax identifier requests or responses for the specified country. |  * X-Correlation-ID -  <br>  |
| **400** | Invalid request |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized. |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden. |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |


## validateTaxIdentifier

> TaxIdentifierResponse validateTaxIdentifier(avalaraVersion, taxIdentifierRequest, xAvalaraClient, xCorrelationID)

Validates a tax identifier.

This endpoint verifies whether a given tax identifier is valid and properly formatted according to the rules of the applicable country or tax system.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.TaxIdentifiersApi;

public class Example {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        configuration.setTimeout(5000);
        configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
        // Configure HTTP basic authorization
        configuration.setUsername("YOUR USERNAME");
        configuration.setPassword("YOUR PASSWORD");
        // Configure OAuth2 access token for authorization
        configuration.setBearerToken("YOUR ACCESS TOKEN");
        
        ApiClient apiClient = new ApiClient(configuration);

        TaxIdentifiersApi apiInstance = new TaxIdentifiersApi(apiClient);
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        TaxIdentifierRequest taxIdentifierRequest = new TaxIdentifierRequest(); // TaxIdentifierRequest | 
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        try {
            TaxIdentifierResponse result = apiInstance.validateTaxIdentifier(avalaraVersion, taxIdentifierRequest, xAvalaraClient, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxIdentifiersApi#validateTaxIdentifier");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **taxIdentifierRequest** | [**TaxIdentifierRequest**](TaxIdentifierRequest.md)|  |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

### Return type

[**TaxIdentifierResponse**](TaxIdentifierResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Validation completed. Returns a TaxIdentifierResponse object that includes countryCode and a value object with identifierType, identifier, and optional extensions when available. |  * X-Correlation-ID -  <br>  |
| **400** | Bad request. The request is invalid or contains missing or incorrect parameters. |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized. |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden. |  * X-Correlation-ID -  <br>  |
| **429** | Rate limit exceeded. |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |

