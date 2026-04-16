# ReportsApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadReport**](ReportsApi.md#downloadReport) | **GET** /reports/{reportId}/$download | Returns a pre-signed download URL for a report
[**getReportById**](ReportsApi.md#getReportById) | **GET** /reports/{reportId}/status | Retrieves a report by its unique ID
[**getReports**](ReportsApi.md#getReports) | **GET** /reports | Returns a list of reports



## downloadReport

> ReportDownloadResponse downloadReport(avalaraVersion, reportId, xAvalaraClient, xCorrelationID)

Returns a pre-signed download URL for a report

Returns a pre-signed URL to download the report file when it is available. If the report has not yet been generated, a 404 (not found) is returned.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.ReportsApi;

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

        ReportsApi apiInstance = new ReportsApi(apiClient);
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String reportId = "reportId_example"; // String | The unique ID for this report as returned in a GET /reports response.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        try {
            ReportDownloadResponse result = apiInstance.downloadReport(avalaraVersion, reportId, xAvalaraClient, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#downloadReport");
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
 **reportId** | **String**| The unique ID for this report as returned in a GET /reports response. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

### Return type

[**ReportDownloadResponse**](ReportDownloadResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a pre-signed URL to download the report. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Report not found or not yet available for download. |  -  |


## getReportById

> ReportItem getReportById(avalaraVersion, reportId, xAvalaraClient, xCorrelationID)

Retrieves a report by its unique ID

Retrieves a specific report by its unique identifier. Returns complete report details including metadata, status, and associated information.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.ReportsApi;

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

        ReportsApi apiInstance = new ReportsApi(apiClient);
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String reportId = "reportId_example"; // String | The unique ID for this report as returned in a GET /reports response.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        try {
            ReportItem result = apiInstance.getReportById(avalaraVersion, reportId, xAvalaraClient, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#getReportById");
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
 **reportId** | **String**| The unique ID for this report as returned in a GET /reports response. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

### Return type

[**ReportItem**](ReportItem.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report found and returned successfully. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Report not found. |  -  |


## getReports

> ReportListResponse getReports(avalaraVersion, xAvalaraClient, xCorrelationID, $filter, $top, $skip, $count, $countOnly, $orderby)

Returns a list of reports

Retrieves all reports with optional filtering, paging, and sorting. Results are filtered by tenant. Supports OData-style filtering using the $filter parameter. Use $top and $skip for paging; when more results exist, the response includes @nextLink to fetch the next page. Default sort order is by report generation date (descending).

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.ReportsApi;

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

        ReportsApi apiInstance = new ReportsApi(apiClient);
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        String $filter = "status eq 'COMPLETED'"; // String | OData-style filter expression. Supports operators: eq, ne, gt, ge, lt, le, like, ilike, contains. Examples: status eq 'COMPLETED', reportGenerateDate gt '2025-11-01', transactionIds contains 'TXN-2025-001'
        Integer $top = 56; // Integer | The number of items to include in the result.
        Integer $skip = 56; // Integer | The number of items to skip in the result.
        String $count = "true"; // String | When set to true, the response body also includes the count of items in the collection.
        String $countOnly = "false"; // String | When set to true, the response returns only the count of items in the collection.
        String $orderby = "reportGenerateDate desc"; // String | OData-style orderby expression. Format: 'field asc' or 'field desc'. Default: reportGenerateDate desc
        try {
            ReportListResponse result = apiInstance.getReports(avalaraVersion, xAvalaraClient, xCorrelationID, $filter, $top, $skip, $count, $countOnly, $orderby);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportsApi#getReports");
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
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]
 **$filter** | **String**| OData-style filter expression. Supports operators: eq, ne, gt, ge, lt, le, like, ilike, contains. Examples: status eq &#39;COMPLETED&#39;, reportGenerateDate gt &#39;2025-11-01&#39;, transactionIds contains &#39;TXN-2025-001&#39; | [optional]
 **$top** | **Integer**| The number of items to include in the result. | [optional]
 **$skip** | **Integer**| The number of items to skip in the result. | [optional]
 **$count** | **String**| When set to true, the response body also includes the count of items in the collection. | [optional]
 **$countOnly** | **String**| When set to true, the response returns only the count of items in the collection. | [optional]
 **$orderby** | **String**| OData-style orderby expression. Format: &#39;field asc&#39; or &#39;field desc&#39;. Default: reportGenerateDate desc | [optional] [default to reportGenerateDate desc]

### Return type

[**ReportListResponse**](ReportListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reports retrieved successfully. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |

