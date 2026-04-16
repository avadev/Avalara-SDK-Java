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

Downloads the document when it is available. Specify the output format in the Accept header. Returns 404 if the file has not been created.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String accept = "application/pdf"; // String | Header that specifies the MIME type of the returned document.
        String documentId = "documentId_example"; // String | The unique documentId returned in the POST /documents response body.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **accept** | **String**| Header that specifies the MIME type of the returned document. |
 **documentId** | **String**| The unique documentId returned in the POST /documents response body. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]

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
| **200** | Returns the document content in the format specified by the Accept header. |  * Content-type -  <br>  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | A document for the specified ID was not found. |  -  |
| **406** | Unsupported document format was requested in the Accept header. |  -  |


## fetchDocuments

> DocumentFetch fetchDocuments(avalaraVersion, fetchDocumentsRequest, xAvalaraClient)

Fetch the inbound document from a tax authority

Retrieves an inbound document. Provide key-value pairs as request parameters. Supported parameters vary by tax authority and country.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        FetchDocumentsRequest fetchDocumentsRequest = new FetchDocumentsRequest(); // FetchDocumentsRequest | 
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **fetchDocumentsRequest** | [**FetchDocumentsRequest**](FetchDocumentsRequest.md)|  |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]

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
| **200** | Response from the inbound document fetch endpoint. Contains the platform documentId for status checks and downloads, the returned status (e.g. Accepted), and eventDateTime when the document was accepted. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **500** | Internal server error. |  -  |


## getDocumentList

> DocumentListResponse getDocumentList(avalaraVersion, xAvalaraClient, startDate, endDate, flow, $count, $countOnly, $filter, $include, $top, $skip)

Returns a summary of documents for a date range

Returns a list of document summaries with a processing date within the specified date range.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Start date for documents to return. Defaults to the previous month. Format: \"YYYY-MM-DDThh:mm:ss\".
        OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | End date for documents to return. Defaults to the current date. Format: \"YYYY-MM-DDThh:mm:ss\".
        String flow = "out"; // String | Optional filter for document direction: issued uses \"out\" and received uses \"in\".
        String $count = "true"; // String | When set to true, the response body also includes the count of items in the collection.
        String $countOnly = "false"; // String | When set to true, the response returns only the count of items in the collection.
        String $filter = "id eq 52f60401-44d0-4667-ad47-4afe519abb53"; // String | Filter by field name and value. This filter supports only eq. For more information, refer to the Avalara filtering guide.
        String $include = "events"; // String | When set to `events`, each document in the response includes its events array. Omit this parameter or use any other value to exclude events from the response.
        Integer $top = 56; // Integer | The number of items to include in the result.
        Integer $skip = 56; // Integer | The number of items to skip in the result.
        try {
            DocumentListResponse result = apiInstance.getDocumentList(avalaraVersion, xAvalaraClient, startDate, endDate, flow, $count, $countOnly, $filter, $include, $top, $skip);
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **startDate** | **OffsetDateTime**| Start date for documents to return. Defaults to the previous month. Format: \&quot;YYYY-MM-DDThh:mm:ss\&quot;. | [optional]
 **endDate** | **OffsetDateTime**| End date for documents to return. Defaults to the current date. Format: \&quot;YYYY-MM-DDThh:mm:ss\&quot;. | [optional]
 **flow** | **String**| Optional filter for document direction: issued uses \&quot;out\&quot; and received uses \&quot;in\&quot;. | [optional]
 **$count** | **String**| When set to true, the response body also includes the count of items in the collection. | [optional]
 **$countOnly** | **String**| When set to true, the response returns only the count of items in the collection. | [optional]
 **$filter** | **String**| Filter by field name and value. This filter supports only eq. For more information, refer to the Avalara filtering guide. | [optional]
 **$include** | **String**| When set to &#x60;events&#x60;, each document in the response includes its events array. Omit this parameter or use any other value to exclude events from the response. | [optional]
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
| **200** | Returns a collection of document summaries for the specified date range. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |


## getDocumentStatus

> DocumentStatusResponse getDocumentStatus(avalaraVersion, documentId, xAvalaraClient)

Checks the status of a document

Uses the documentId from the POST /documents response body to return the current status of a document.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String documentId = "documentId_example"; // String | The unique documentId returned in the POST /documents response body.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **documentId** | **String**| The unique documentId returned in the POST /documents response body. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]

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
| **200** | Returns the current status for the specified documentId. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        SubmitDocumentMetadata metadata = new SubmitDocumentMetadata(); // SubmitDocumentMetadata | 
        Object data = null; // Object | The document to be submitted, as indicated by the metadata fields 'dataFormat' and 'dataFormatVersion'
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **metadata** | [**SubmitDocumentMetadata**](SubmitDocumentMetadata.md)|  |
 **data** | [**Object**](Object.md)| The document to be submitted, as indicated by the metadata fields &#39;dataFormat&#39; and &#39;dataFormatVersion&#39; |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]

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
| **201** | Returns a unique documentId for the submitted document. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |

