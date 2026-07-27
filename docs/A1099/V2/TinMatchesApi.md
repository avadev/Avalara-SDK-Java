# TinMatchesApi

All URIs are relative to *https://api.sbx.avalara.com/avalara1099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**performRealTimeTinMatch**](TinMatchesApi.md#performRealTimeTinMatch) | **POST** /tin-matches/$real-time | Perform real time TIN Match



## performRealTimeTinMatch

> RealTimeTinMatchResponse performRealTimeTinMatch(avalaraVersion, xCorrelationId, xAvalaraClient, realTimeTinMatchRequest)

Perform real time TIN Match

Perform real time TIN Match.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.TinMatchesApi;

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

        TinMatchesApi apiInstance = new TinMatchesApi(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "e4a00bdb-c8bf-4c27-930b-ba75ff3e865f"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        RealTimeTinMatchRequest realTimeTinMatchRequest = new RealTimeTinMatchRequest(); // RealTimeTinMatchRequest | Required data to perform TIN match
        try {
            RealTimeTinMatchResponse result = apiInstance.performRealTimeTinMatch(avalaraVersion, xCorrelationId, xAvalaraClient, realTimeTinMatchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TinMatchesApi#performRealTimeTinMatch");
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
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]
 **realTimeTinMatchRequest** | [**RealTimeTinMatchRequest**](RealTimeTinMatchRequest.md)| Required data to perform TIN match | [optional]

### Return type

[**RealTimeTinMatchResponse**](RealTimeTinMatchResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | TIN match result (matched or rejected) |  -  |
| **400** | Bad request (e.g. invalid field values) |  -  |
| **401** | Authentication failed |  -  |
| **429** | Usage limit exceeded (10,000 successful calls per 24 hours) |  -  |
| **403** | Authorization failed (lack of permissions or product not purchased) |  -  |
| **503** | IRS Service is not available. Client should retry later. |  -  |

