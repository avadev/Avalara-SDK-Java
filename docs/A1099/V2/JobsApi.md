# JobsApi

All URIs are relative to *https://api.sbx.avalara.com/avalara1099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJob**](JobsApi.md#getJob) | **GET** /jobs/{id} | Retrieves information about the job



## getJob

> JobResponse getJob(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Retrieves information about the job

Retrieves information about the job

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.JobsApi;

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

        JobsApi apiInstance = new JobsApi(apiClient);
        String id = "id_example"; // String | Job id obtained from other API responses, like `/1099/bulk-upsert`.
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "19c729e6-45f1-4b1f-8a4c-a1293f8da8bd"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            JobResponse result = apiInstance.getJob(id, avalaraVersion, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#getJob");
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
 **id** | **String**| Job id obtained from other API responses, like &#x60;/1099/bulk-upsert&#x60;. |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |
| **401** | Unauthorized |  -  |

