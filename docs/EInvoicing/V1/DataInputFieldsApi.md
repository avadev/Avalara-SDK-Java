# DataInputFieldsApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataInputFields**](DataInputFieldsApi.md#getDataInputFields) | **GET** /data-input-fields | Returns the optionality of document fields for different country mandates



## getDataInputFields

> DataInputFieldsResponse getDataInputFields(avalaraVersion, xAvalaraClient, $filter, $top, $skip, $count, $countOnly)

Returns the optionality of document fields for different country mandates

This endpoint returns a list of required, conditional, and optional fields for each country mandate. Use the mandates endpoint to retrieve all available country mandates. Use the $filter query parameter to retrieve fields for a specific mandate.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.DataInputFieldsApi;

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

        DataInputFieldsApi apiInstance = new DataInputFieldsApi(apiClient);
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String $filter = "requiredFor/countryMandate eq AU-B2G-PEPPOL"; // String | Filter by field name and value. This filter supports only eq and contains. For more information, refer to the Avalara filtering guide.
        Integer $top = 56; // Integer | The number of items to include in the result.
        Integer $skip = 56; // Integer | The number of items to skip in the result.
        Boolean $count = true; // Boolean | When set to true, the response body also includes the count of items in the collection.
        Boolean $countOnly = true; // Boolean | When set to true, the response returns only the count of items in the collection.
        try {
            DataInputFieldsResponse result = apiInstance.getDataInputFields(avalaraVersion, xAvalaraClient, $filter, $top, $skip, $count, $countOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataInputFieldsApi#getDataInputFields");
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
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **$filter** | **String**| Filter by field name and value. This filter supports only eq and contains. For more information, refer to the Avalara filtering guide. | [optional]
 **$top** | **Integer**| The number of items to include in the result. | [optional]
 **$skip** | **Integer**| The number of items to skip in the result. | [optional]
 **$count** | **Boolean**| When set to true, the response body also includes the count of items in the collection. | [optional]
 **$countOnly** | **Boolean**| When set to true, the response returns only the count of items in the collection. | [optional]

### Return type

[**DataInputFieldsResponse**](DataInputFieldsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a DataInputFieldsResponse object containing the data input fields and their optionality for the requested mandate. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **500** | Internal server error. |  -  |

