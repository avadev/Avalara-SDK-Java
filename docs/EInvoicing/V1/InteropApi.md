# InteropApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitInteropDocument**](InteropApi.md#submitInteropDocument) | **POST** /interop/documents | Submit a document



## submitInteropDocument

> SubmitInteropDocument202Response submitInteropDocument(documentType, interchangeType, avalaraVersion, xAvalaraClient, xCorrelationID, fileName)

Submit a document

This API used by the interoperability partners to submit a document to  their trading partners in Avalara on behalf of their customers. 

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
        String avalaraVersion = "1.4"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | The caller can use this as an identifier to use as a correlation id to trace the call.
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
 **avalaraVersion** | **String**| The HTTP Header meant to specify the version of the API intended to be used |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot; | [optional]
 **xCorrelationID** | **String**| The caller can use this as an identifier to use as a correlation id to trace the call. | [optional]
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
| **202** | Document Accepted. This doesn&#39;t mean it is processed. This is just a transport ack. |  * X-Correlation-ID -  <br>  |
| **400** | Bad/Invalid Request. |  * X-Correlation-Id -  <br>  |
| **401** | Unauthorized |  * X-Correlation-Id -  <br>  |
| **403** | Forbidden |  * X-Correlation-Id -  <br>  |
| **500** | Internal server error |  * X-Correlation-Id -  <br>  |

