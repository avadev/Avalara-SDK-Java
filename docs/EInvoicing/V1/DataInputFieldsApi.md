# DataInputFieldsApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataInputFields**](DataInputFieldsApi.md#getDataInputFields) | **GET** /data-input-fields | Returns the optionality of document fields for different country mandates



## getDataInputFields

> DataInputFieldsResponse getDataInputFields(avalaraVersion, xAvalaraClient, $filter, $top, $skip, $count, $countOnly)

Returns the optionality of document fields for different country mandates

This endpoint provides a list of required, conditional, and optional fields for each country mandate. You can use the &lt;code&gt;mandates&lt;/code&gt; endpoint to retrieve all available country mandates. You can use the $filter query parameter to retrieve fields for a particular mandate

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
        String avalaraVersion = "1.2"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint.
        String $filter = "requiredFor/countryMandate eq AU-B2G-PEPPOL"; // String | Filter by field name and value. This filter only supports <code>eq</code> and <code>contains</code>. Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering.
        BigDecimal $top = new BigDecimal(78); // BigDecimal | The number of items to include in the result.
        String $skip = "$skip_example"; // String | If nonzero, skip this number of results before returning data. Used with <code>$top</code> to provide pagination for large datasets.
        Boolean $count = true; // Boolean | When set to true, the count of the collection is also returned in the response body
        Boolean $countOnly = true; // Boolean | When set to true, only the count of the collection is returned
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
 **avalaraVersion** | **String**| The HTTP Header meant to specify the version of the API intended to be used |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. | [optional]
 **$filter** | **String**| Filter by field name and value. This filter only supports &lt;code&gt;eq&lt;/code&gt; and &lt;code&gt;contains&lt;/code&gt;. Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. | [optional]
 **$top** | **BigDecimal**| The number of items to include in the result. | [optional]
 **$skip** | **String**| If nonzero, skip this number of results before returning data. Used with &lt;code&gt;$top&lt;/code&gt; to provide pagination for large datasets. | [optional]
 **$count** | **Boolean**| When set to true, the count of the collection is also returned in the response body | [optional]
 **$countOnly** | **Boolean**| When set to true, only the count of the collection is returned | [optional]

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

