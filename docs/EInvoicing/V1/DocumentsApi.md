# DocumentsApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadDocument**](DocumentsApi.md#downloadDocument) | **GET** /documents/{documentId}/$download | Returns a copy of the document
[**fetchDocuments**](DocumentsApi.md#fetchDocuments) | **POST** /documents/$fetch | Fetch the inbound document from a tax authority
[**getDocumentList**](DocumentsApi.md#getDocumentList) | **GET** /documents | Returns a summary of documents for a date range
[**getDocumentStatus**](DocumentsApi.md#getDocumentStatus) | **GET** /documents/{documentId}/status | Checks the status of a document
[**submitDocument**](DocumentsApi.md#submitDocument) | **POST** /documents | Submits a document to Avalara E-Invoicing API



## downloadDocument

> File downloadDocument(avalaraVersion, accept, documentId, xAvalaraClient)

Returns a copy of the document

When the document is available, use this endpoint to download it as text, XML, or PDF. The output format needs to be specified in the Accept header, and it will vary depending on the mandate. If the file has not yet been created, then status code 404 (not found) is returned.

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
        String avalaraVersion = "1.4"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String accept = "application/pdf"; // String | This header indicates the MIME type of the document
        String documentId = "documentId_example"; // String | The unique ID for this document that was returned in the POST /einvoicing/document response body
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint.
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
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. | [optional]

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


## fetchDocuments

> DocumentFetch fetchDocuments(avalaraVersion, fetchDocumentsRequest, xAvalaraClient)

Fetch the inbound document from a tax authority

This API allows you to retrieve an inbound document. Pass key-value pairs as parameters in the request, such as the confirmation number, supplier number, and buyer VAT number.

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
        String avalaraVersion = "1.4"; // String | The HTTP Header meant to specify the version of the API intended to be used
        FetchDocumentsRequest fetchDocumentsRequest = new FetchDocumentsRequest(); // FetchDocumentsRequest | 
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint.
        try {
            DocumentFetch result = apiInstance.fetchDocuments(avalaraVersion, fetchDocumentsRequest, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#fetchDocuments");
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
 **fetchDocumentsRequest** | [**FetchDocumentsRequest**](FetchDocumentsRequest.md)|  |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. | [optional]

### Return type

[**DocumentFetch**](DocumentFetch.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Accepted DocumentFetch Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


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
        String avalaraVersion = "1.4"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint.
        OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Start date of documents to return. This defaults to the previous month.
        OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | End date of documents to return. This defaults to the current date.
        String flow = "out"; // String | Optionally filter by document direction, where issued = `out` and received = `in`
        String $count = "true"; // String | When set to true, the count of the collection is also returned in the response body
        String $countOnly = "false"; // String | When set to true, only the count of the collection is returned
        String $filter = "id eq 52f60401-44d0-4667-ad47-4afe519abb53"; // String | Filter by field name and value. This filter only supports <code>eq</code> . Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided startDate and endDate. If no startDate or endDate is provided, defaults will be assumed.
        Integer $top = 56; // Integer | The number of items to include in the result.
        Integer $skip = 56; // Integer | The number of items to skip in the result.
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
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. | [optional]
 **startDate** | **OffsetDateTime**| Start date of documents to return. This defaults to the previous month. | [optional]
 **endDate** | **OffsetDateTime**| End date of documents to return. This defaults to the current date. | [optional]
 **flow** | **String**| Optionally filter by document direction, where issued &#x3D; &#x60;out&#x60; and received &#x3D; &#x60;in&#x60; | [optional]
 **$count** | **String**| When set to true, the count of the collection is also returned in the response body | [optional]
 **$countOnly** | **String**| When set to true, only the count of the collection is returned | [optional]
 **$filter** | **String**| Filter by field name and value. This filter only supports &lt;code&gt;eq&lt;/code&gt; . Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided startDate and endDate. If no startDate or endDate is provided, defaults will be assumed. | [optional]
 **$top** | **Integer**| The number of items to include in the result. | [optional]
 **$skip** | **Integer**| The number of items to skip in the result. | [optional]

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
        String avalaraVersion = "1.4"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String documentId = "documentId_example"; // String | The unique ID for this document that was returned in the POST /einvoicing/documents response body
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint.
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
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. | [optional]

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

When a UBL document is sent to this endpoint, it generates a document in the required format as mandated by the specified country. Additionally, it initiates the workflow to transmit the generated document to the relevant tax authority, if necessary.&lt;br&gt;&lt;br&gt;The response from the endpoint contains a unique document ID, which can be used to request the status of the document and verify if it was successfully accepted at the destination.&lt;br&gt;&lt;br&gt;Furthermore, the unique ID enables the download of a copy of the generated document for reference purposes.

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
        String avalaraVersion = "1.4"; // String | The HTTP Header meant to specify the version of the API intended to be used
        SubmitDocumentMetadata metadata = new SubmitDocumentMetadata(); // SubmitDocumentMetadata | 
        Object data = null; // Object | The document to be submitted, as indicated by the metadata fields 'dataFormat' and 'dataFormatVersion'
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint.
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
 **data** | [**Object**](Object.md)| The document to be submitted, as indicated by the metadata fields &#39;dataFormat&#39; and &#39;dataFormatVersion&#39; |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. | [optional]

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

