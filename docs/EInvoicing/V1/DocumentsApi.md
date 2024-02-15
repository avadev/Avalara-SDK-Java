# DocumentsApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadDocument**](DocumentsApi.md#downloadDocument) | **GET** /documents/{documentId}/$download | Returns a copy of the document
[**getDocumentList**](DocumentsApi.md#getDocumentList) | **GET** /documents | Returns a summary of documents for a date range
[**getDocumentStatus**](DocumentsApi.md#getDocumentStatus) | **GET** /document/{documentId}/status | Checks the status of a document
[**submitDocument**](DocumentsApi.md#submitDocument) | **POST** /documents | Submits a document to Avalara E-Invoicing API



## downloadDocument

> File downloadDocument(avalaraVersion, accept, documentId, xAvalaraClient)

Returns a copy of the document

When the document is available, use this endpoint to download it as text, XML, or PDF. The output format needs to be specified in the Accept header and it will vary depending on the mandate. If the file has not yet been created, then status code 404 (not found) is returned.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(apiClient);
        String avalaraVersion = "1.0"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String accept = "application/pdf"; // String | This header indicates the MIME type of the document
        String documentId = "documentId_example"; // String | The unique ID for this document that was returned in the POST /einvoicing/document response body
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        try {
            File result = apiInstance.downloadDocument(avalaraVersion, accept, documentId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#downloadDocument");
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
 **accept** | **String**| This header indicates the MIME type of the document |
 **documentId** | **String**| The unique ID for this document that was returned in the POST /einvoicing/document response body |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot; | [optional]

### Return type

[**File**](File.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/xml, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-type -  <br>  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | A document for the specified ID was not found. |  -  |
| **406** | Unsupported document format was requested in the Accept header |  -  |


## getDocumentList

> DocumentListResponse getDocumentList(avalaraVersion, xAvalaraClient, startDate, endDate, flow, $count, $countOnly, $filter, $top, $skip)

Returns a summary of documents for a date range

Get a list of documents on the Avalara E-Invoicing platform that have a processing date within the specified date range.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(apiClient);
        String avalaraVersion = "1.0"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Start date of documents to return. This defaults to the previous month.
        OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | End date of documents to return. This defaults to the current date.
        String flow = "out"; // String | Optionally filter by document direction, where issued = `out` and received = `in`
        String $count = "true"; // String | When set to true, the count of the collection is also returned in the response body
        String $countOnly = "false"; // String | When set to true, only the count of the collection is returned
        String $filter = "id eq 2023-02-000016"; // String | Filter by field name and value. This filter only supports <code>eq</code> . Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided startDate and endDate. If no startDate or endDate is provided, defaults will be assumed.
        BigDecimal $top = new BigDecimal("10"); // BigDecimal | If nonzero, return no more than this number of results. Used with <code>$skip</code> to provide pagination for large datasets. Unless otherwise specified, the maximum number of records that can be returned from an API call is 200 records.
        String $skip = "10"; // String | If nonzero, skip this number of results before returning data. Used with <code>$top</code> to provide pagination for large datasets.
        try {
            DocumentListResponse result = apiInstance.getDocumentList(avalaraVersion, xAvalaraClient, startDate, endDate, flow, $count, $countOnly, $filter, $top, $skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#getDocumentList");
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
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot; | [optional]
 **startDate** | **OffsetDateTime**| Start date of documents to return. This defaults to the previous month. | [optional]
 **endDate** | **OffsetDateTime**| End date of documents to return. This defaults to the current date. | [optional]
 **flow** | **String**| Optionally filter by document direction, where issued &#x3D; &#x60;out&#x60; and received &#x3D; &#x60;in&#x60; | [optional]
 **$count** | **String**| When set to true, the count of the collection is also returned in the response body | [optional]
 **$countOnly** | **String**| When set to true, only the count of the collection is returned | [optional]
 **$filter** | **String**| Filter by field name and value. This filter only supports &lt;code&gt;eq&lt;/code&gt; . Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided startDate and endDate. If no startDate or endDate is provided, defaults will be assumed. | [optional]
 **$top** | **BigDecimal**| If nonzero, return no more than this number of results. Used with &lt;code&gt;$skip&lt;/code&gt; to provide pagination for large datasets. Unless otherwise specified, the maximum number of records that can be returned from an API call is 200 records. | [optional]
 **$skip** | **String**| If nonzero, skip this number of results before returning data. Used with &lt;code&gt;$top&lt;/code&gt; to provide pagination for large datasets. | [optional]

### Return type

[**DocumentListResponse**](DocumentListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |


## getDocumentStatus

> DocumentStatusResponse getDocumentStatus(avalaraVersion, documentId, xAvalaraClient)

Checks the status of a document

Using the unique ID from POST /einvoicing/documents response body, request the current status of a document.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(apiClient);
        String avalaraVersion = "1.0"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String documentId = "documentId_example"; // String | The unique ID for this document that was returned in the POST /einvoicing/documents response body
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        try {
            DocumentStatusResponse result = apiInstance.getDocumentStatus(avalaraVersion, documentId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#getDocumentStatus");
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
 **documentId** | **String**| The unique ID for this document that was returned in the POST /einvoicing/documents response body |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot; | [optional]

### Return type

[**DocumentStatusResponse**](DocumentStatusResponse.md)

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
| **404** | A document for the specified ID was not found. |  -  |


## submitDocument

> DocumentSubmitResponse submitDocument(avalaraVersion, metadata, data, xAvalaraClient)

Submits a document to Avalara E-Invoicing API

For both e-invoices and credit notes, when a document is sent to this endpoint, it generates an invoice or credit note in the required format as mandated by the specified country. Additionally, it initiates the workflow to transmit the generated document to the relevant tax authority, if necessary.&lt;br&gt;&lt;br&gt;The response from the endpoint contains a unique document ID, which can be used to request the status of the document and verify if it was successfully accepted at the destination.&lt;br&gt;&lt;br&gt;Furthermore, the unique ID enables the download of a copy of the e-invoice or credit note for reference purposes.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.DocumentsApi;

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

        DocumentsApi apiInstance = new DocumentsApi(apiClient);
        String avalaraVersion = "1.0"; // String | The HTTP Header meant to specify the version of the API intended to be used
        SubmitDocumentMetadata metadata = new SubmitDocumentMetadata(); // SubmitDocumentMetadata | 
        SubmitDocumentData data = new SubmitDocumentData(); // SubmitDocumentData | 
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        try {
            DocumentSubmitResponse result = apiInstance.submitDocument(avalaraVersion, metadata, data, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#submitDocument");
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
 **metadata** | [**SubmitDocumentMetadata**](SubmitDocumentMetadata.md)|  |
 **data** | [**SubmitDocumentData**](SubmitDocumentData.md)|  |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot; | [optional]

### Return type

[**DocumentSubmitResponse**](DocumentSubmitResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

