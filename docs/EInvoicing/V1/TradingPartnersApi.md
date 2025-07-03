# TradingPartnersApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchSearchParticipants**](TradingPartnersApi.md#batchSearchParticipants) | **POST** /trading-partners/batch-searches | Creates a batch search and performs a batch search in the directory for participants in the background.
[**downloadBatchSearchReport**](TradingPartnersApi.md#downloadBatchSearchReport) | **GET** /trading-partners/batch-searches/{id}/$download-results | Download batch search results in a csv file.
[**getBatchSearchDetail**](TradingPartnersApi.md#getBatchSearchDetail) | **GET** /trading-partners/batch-searches/{id} | Get the batch search details for a given id.
[**listBatchSearches**](TradingPartnersApi.md#listBatchSearches) | **GET** /trading-partners/batch-searches | List all batch searches that were previously submitted.
[**searchParticipants**](TradingPartnersApi.md#searchParticipants) | **GET** /trading-partners | Returns a list of participants matching the input query.



## batchSearchParticipants

> BatchSearchParticipants202Response batchSearchParticipants(avalaraVersion, name, notificationEmail, _file, xAvalaraClient, xCorrelationID)

Creates a batch search and performs a batch search in the directory for participants in the background.

Handles batch search requests by uploading a file containing search parameters.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.TradingPartnersApi;

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

        TradingPartnersApi apiInstance = new TradingPartnersApi(apiClient);
        String avalaraVersion = "1.2"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String name = "Automotive Companies in London Search"; // String | The human readable name given to this batch search.
        String notificationEmail = "user@example.com"; // String | The email address of the user to whom the batch search completion notification must go to.
        File _file = new File("/path/to/file"); // File | CSV file containing search parameters.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | The caller can use this as an identifier to use as a correlation id to trace the call.
        try {
            BatchSearchParticipants202Response result = apiInstance.batchSearchParticipants(avalaraVersion, name, notificationEmail, _file, xAvalaraClient, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingPartnersApi#batchSearchParticipants");
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
 **name** | **String**| The human readable name given to this batch search. |
 **notificationEmail** | **String**| The email address of the user to whom the batch search completion notification must go to. |
 **_file** | **File**| CSV file containing search parameters. |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot; | [optional]
 **xCorrelationID** | **String**| The caller can use this as an identifier to use as a correlation id to trace the call. | [optional]

### Return type

[**BatchSearchParticipants202Response**](BatchSearchParticipants202Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Batch search file accepted for processing the search. |  * X-Correlation-Id -  <br>  |
| **400** | Invalid request |  * X-Correlation-Id -  <br>  |
| **401** | Unauthorized |  * X-Correlation-Id -  <br>  |
| **403** | Forbidden |  * X-Correlation-Id -  <br>  |
| **500** | Internal server error |  * X-Correlation-Id -  <br>  |


## downloadBatchSearchReport

> File downloadBatchSearchReport(avalaraVersion, id, xAvalaraClient, xCorrelationID)

Download batch search results in a csv file.

Downloads the report for a specific batch search using the batch search ID.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.TradingPartnersApi;

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

        TradingPartnersApi apiInstance = new TradingPartnersApi(apiClient);
        String avalaraVersion = "1.2"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String id = "2f5ea4b5-4dae-445a-b3e4-9f65a61eaa99"; // String | The ID of the batch search whose report is to be downloaded.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | The caller can use this as an identifier to use as a correlation id to trace the call.
        try {
            File result = apiInstance.downloadBatchSearchReport(avalaraVersion, id, xAvalaraClient, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingPartnersApi#downloadBatchSearchReport");
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
 **id** | **String**| The ID of the batch search whose report is to be downloaded. |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot; | [optional]
 **xCorrelationID** | **String**| The caller can use this as an identifier to use as a correlation id to trace the call. | [optional]

### Return type

[**File**](File.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/csv, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful report download |  * X-Correlation-Id -  <br>  |
| **401** | Unauthorized |  * X-Correlation-Id -  <br>  |
| **403** | Forbidden |  * X-Correlation-Id -  <br>  |
| **404** | Report not found |  * X-Correlation-Id -  <br>  |
| **500** | Internal server error |  * X-Correlation-Id -  <br>  |


## getBatchSearchDetail

> BatchSearch getBatchSearchDetail(avalaraVersion, id, xAvalaraClient, xCorrelationID)

Get the batch search details for a given id.

This endpoint provides a detailed information for a specific batch search based on a given ID. It is ideal for tracking the progress of a previously initiated batch search operation.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.TradingPartnersApi;

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

        TradingPartnersApi apiInstance = new TradingPartnersApi(apiClient);
        String avalaraVersion = "1.2"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String id = "2f5ea4b5-4dae-445a-b3e4-9f65a61eaa99"; // String | The ID of the batch search that was submitted earlier.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | The caller can use this as an identifier to use as a correlation id to trace the call.
        try {
            BatchSearch result = apiInstance.getBatchSearchDetail(avalaraVersion, id, xAvalaraClient, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingPartnersApi#getBatchSearchDetail");
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
 **id** | **String**| The ID of the batch search that was submitted earlier. |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot; | [optional]
 **xCorrelationID** | **String**| The caller can use this as an identifier to use as a correlation id to trace the call. | [optional]

### Return type

[**BatchSearch**](BatchSearch.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the batch search details for a given id. |  * X-Correlation-Id -  <br>  |
| **401** | Unauthorized |  * X-Correlation-Id -  <br>  |
| **404** | Report not found |  * X-Correlation-Id -  <br>  |
| **403** | Forbidden |  * X-Correlation-Id -  <br>  |
| **500** | Internal server error |  * X-Correlation-Id -  <br>  |


## listBatchSearches

> BatchSearchListResponse listBatchSearches(avalaraVersion, xAvalaraClient, $filter, count, $top, $skip, $orderBy, xCorrelationID)

List all batch searches that were previously submitted.

This endpoint provides a way to retrieve a comprehensive list of all batch search operations that have been previously submitted. This endpoint returns details about each batch search, such as their id, status, created date and associated metadata, allowing users to easily view past batch search requests. It&#39;s particularly useful for tracking the progress of a previously initiated batch search operations.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.TradingPartnersApi;

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

        TradingPartnersApi apiInstance = new TradingPartnersApi(apiClient);
        String avalaraVersion = "1.2"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        String $filter = "name eq 'Batch_Search_Import_V4'"; // String | Filter by field name and value. This filter only supports <code>eq</code> .The parameters supported is <code>name</code>.    Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided parameters.
        Boolean count = true; // Boolean | When set to true, the count of the collection is included as @recordSetCount in the response body.
        BigDecimal $top = new BigDecimal(78); // BigDecimal | The number of items to include in the result.
        String $skip = "10"; // String | If nonzero, skip this number of results before returning data. Used with <code>$top</code> to provide pagination for large datasets.
        String $orderBy = "name desc"; // String | The $orderBy query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space.
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | The caller can use this as an identifier to use as a correlation id to trace the call.
        try {
            BatchSearchListResponse result = apiInstance.listBatchSearches(avalaraVersion, xAvalaraClient, $filter, count, $top, $skip, $orderBy, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingPartnersApi#listBatchSearches");
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
 **$filter** | **String**| Filter by field name and value. This filter only supports &lt;code&gt;eq&lt;/code&gt; .The parameters supported is &lt;code&gt;name&lt;/code&gt;.    Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided parameters. | [optional]
 **count** | **Boolean**| When set to true, the count of the collection is included as @recordSetCount in the response body. | [optional]
 **$top** | **BigDecimal**| The number of items to include in the result. | [optional]
 **$skip** | **String**| If nonzero, skip this number of results before returning data. Used with &lt;code&gt;$top&lt;/code&gt; to provide pagination for large datasets. | [optional]
 **$orderBy** | **String**| The $orderBy query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space. | [optional]
 **xCorrelationID** | **String**| The caller can use this as an identifier to use as a correlation id to trace the call. | [optional]

### Return type

[**BatchSearchListResponse**](BatchSearchListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of batch searches |  * X-Correlation-Id -  <br>  |
| **400** | Bad request |  * X-Correlation-Id -  <br>  |
| **401** | Unauthorized |  * X-Correlation-Id -  <br>  |
| **403** | Forbidden |  * X-Correlation-Id -  <br>  |
| **500** | Internal server error |  * X-Correlation-Id -  <br>  |


## searchParticipants

> DirectorySearchResponse searchParticipants(avalaraVersion, $search, xAvalaraClient, count, $filter, $top, $skip, $orderBy, xCorrelationID)

Returns a list of participants matching the input query.

This endpoint provides a list of trading partners that match a specified input query. The search is performed based on various filters, search text, and other relevant parameters.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.TradingPartnersApi;

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

        TradingPartnersApi apiInstance = new TradingPartnersApi(apiClient);
        String avalaraVersion = "1.2"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String $search = "Acme and 7726627177 or BMW"; // String | Search by value supports logical AND and OR. Refer to [https://learn.microsoft.com/en-us/odata/concepts/queryoptions-overview#search](https://learn.microsoft.com/en-us/odata/concepts/queryoptions-overview#search) for more information on search. Search will be done over <code>name</code> and <code>identifier</code> parameters only.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\"
        Boolean count = true; // Boolean | When set to true, the count of the collection is included as @recordSetCount in the response body.
        String $filter = "network eq 'Peppol' and country eq 'Australia'"; // String | Filter by field name and value. This filter only supports <code>eq</code> .The parameters supported are <code>network</code>, <code>country</code>, <code>documentType</code>, <code>idType</code>.          Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided parameters.
        BigDecimal $top = new BigDecimal(78); // BigDecimal | The number of items to include in the result.
        String $skip = "10"; // String | If nonzero, skip this number of results before returning data. Used with <code>$top</code> to provide pagination for large datasets.
        String $orderBy = "name desc"; // String | The $orderBy query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space.
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | The caller can use this as an identifier to use as a correlation id to trace the call.
        try {
            DirectorySearchResponse result = apiInstance.searchParticipants(avalaraVersion, $search, xAvalaraClient, count, $filter, $top, $skip, $orderBy, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingPartnersApi#searchParticipants");
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
 **$search** | **String**| Search by value supports logical AND and OR. Refer to [https://learn.microsoft.com/en-us/odata/concepts/queryoptions-overview#search](https://learn.microsoft.com/en-us/odata/concepts/queryoptions-overview#search) for more information on search. Search will be done over &lt;code&gt;name&lt;/code&gt; and &lt;code&gt;identifier&lt;/code&gt; parameters only. |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \&quot;Fingerprint\&quot; | [optional]
 **count** | **Boolean**| When set to true, the count of the collection is included as @recordSetCount in the response body. | [optional]
 **$filter** | **String**| Filter by field name and value. This filter only supports &lt;code&gt;eq&lt;/code&gt; .The parameters supported are &lt;code&gt;network&lt;/code&gt;, &lt;code&gt;country&lt;/code&gt;, &lt;code&gt;documentType&lt;/code&gt;, &lt;code&gt;idType&lt;/code&gt;.          Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided parameters. | [optional]
 **$top** | **BigDecimal**| The number of items to include in the result. | [optional]
 **$skip** | **String**| If nonzero, skip this number of results before returning data. Used with &lt;code&gt;$top&lt;/code&gt; to provide pagination for large datasets. | [optional]
 **$orderBy** | **String**| The $orderBy query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space. | [optional]
 **xCorrelationID** | **String**| The caller can use this as an identifier to use as a correlation id to trace the call. | [optional]

### Return type

[**DirectorySearchResponse**](DirectorySearchResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Correlation-Id -  <br>  |
| **400** | Bad request |  * X-Correlation-Id -  <br>  |
| **401** | Unauthorized |  * X-Correlation-Id -  <br>  |
| **403** | Forbidden |  * X-Correlation-Id -  <br>  |
| **500** | Internal server error |  * X-Correlation-Id -  <br>  |

