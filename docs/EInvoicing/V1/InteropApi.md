# InteropApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitInteropDocument**](InteropApi.md#submitInteropDocument) | **POST** /interop/documents | Submit a document



## submitInteropDocument

> SubmitInteropDocument202Response submitInteropDocument(documentType, interchangeType, avalaraVersion, xAvalaraClient, xCorrelationID, fileName)

Submit a document

Upload documents on behalf of interoperability partners and submit them to trading partners through the Avalara platform.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.InteropApi;

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

        InteropApi apiInstance = new InteropApi(apiClient);
        String documentType = "ubl-invoice-2.1"; // String | Type of the document being uploaded. Partners will be configured in Avalara system to send only certain types of documents.
        String interchangeType = "FI-B2B-TIEKE"; // String | Type of interchange (codes in Avalara system that uniquely identifies a type of interchange). Partners will be configured in Avalara system to send documents belonging to certain types of interchanges.
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        File fileName = new File("/path/to/file"); // File | The file to be uploaded (e.g., UBL XML, CII XML).
        try {
            SubmitInteropDocument202Response result = apiInstance.submitInteropDocument(documentType, interchangeType, avalaraVersion, xAvalaraClient, xCorrelationID, fileName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InteropApi#submitInteropDocument");
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
 **documentType** | **String**| Type of the document being uploaded. Partners will be configured in Avalara system to send only certain types of documents. | [enum: ubl-invoice-2.1, ubl-creditnote-2.1, ubl-applicationresponse-2.1]
 **interchangeType** | **String**| Type of interchange (codes in Avalara system that uniquely identifies a type of interchange). Partners will be configured in Avalara system to send documents belonging to certain types of interchanges. | [enum: FI-B2B-TIEKE, FI-B2G-TIEKE]
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]
 **fileName** | **File**| The file to be uploaded (e.g., UBL XML, CII XML). | [optional]

### Return type

[**SubmitInteropDocument202Response**](SubmitInteropDocument202Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Document accepted for processing. Returns the interchange ID and acceptance message. This is a transport acknowledgment; processing occurs asynchronously. |  * X-Correlation-ID -  <br>  |
| **400** | Bad request. The request is invalid or contains missing or incorrect parameters. |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized. |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden. |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |

