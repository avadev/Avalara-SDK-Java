# TaxIdentifiersApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxIdentifierSchemaByCountry**](TaxIdentifiersApi.md#taxIdentifierSchemaByCountry) | **GET** /tax-identifiers/schema | Returns the tax identifier request &amp; response schema for a specific country.
[**validateTaxIdentifier**](TaxIdentifiersApi.md#validateTaxIdentifier) | **POST** /tax-identifiers/validate | Validates a tax identifier.



## taxIdentifierSchemaByCountry

> TaxIdentifierSchemaByCountry200Response taxIdentifierSchemaByCountry(avalaraVersion, countryCode, xAvalaraClient, xCorrelationID, type)

Returns the tax identifier request &amp; response schema for a specific country.

This endpoint retrieves the request and response schema required to validate tax identifiers based on a specific country&#39;s requirements. This can include both standard fields and any additional parameters required by the respective country&#39;s tax authority.

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
        String avalaraVersion = "1.4"; // String | The HTTP Header meant to specify the version of the API intended to be used.
        String countryCode = "DE"; // String | The two-letter ISO-3166 country code for which the schema should be retrieved.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\".
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | The caller can use this as an identifier to use as a correlation id to trace the call.
        String type = "request"; // String | Specifies whether to return the request or response schema.
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
 **avalaraVersion** | **String**| The HTTP Header meant to specify the version of the API intended to be used. |
 **countryCode** | **String**| The two-letter ISO-3166 country code for which the schema should be retrieved. |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot;. | [optional]
 **xCorrelationID** | **String**| The caller can use this as an identifier to use as a correlation id to trace the call. | [optional]
 **type** | **String**| Specifies whether to return the request or response schema. | [optional] [enum: request, response]

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
| **200** | OK |  * X-Correlation-Id -  <br>  |
| **400** | Invalid request |  * X-Correlation-Id -  <br>  |
| **401** | Unauthorized |  * X-Correlation-Id -  <br>  |
| **403** | Forbidden |  * X-Correlation-Id -  <br>  |
| **500** | Internal server error |  * X-Correlation-Id -  <br>  |


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
        String avalaraVersion = "1.4"; // String | The HTTP Header meant to specify the version of the API intended to be used.
        TaxIdentifierRequest taxIdentifierRequest = new TaxIdentifierRequest(); // TaxIdentifierRequest | 
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\".
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | The caller can use this as an identifier to use as a correlation id to trace the call.
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
 **avalaraVersion** | **String**| The HTTP Header meant to specify the version of the API intended to be used. |
 **taxIdentifierRequest** | [**TaxIdentifierRequest**](TaxIdentifierRequest.md)|  |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot;. | [optional]
 **xCorrelationID** | **String**| The caller can use this as an identifier to use as a correlation id to trace the call. | [optional]

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
| **200** | Success response. |  * X-Correlation-Id -  <br>  |
| **400** | Invalid request |  * X-Correlation-Id -  <br>  |
| **401** | Unauthorized |  * X-Correlation-Id -  <br>  |
| **403** | Forbidden |  * X-Correlation-Id -  <br>  |
| **429** | Rate limit exceeded |  * X-Correlation-Id -  <br>  |
| **500** | Internal server error |  * X-Correlation-Id -  <br>  |

