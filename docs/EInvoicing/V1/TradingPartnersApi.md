# TradingPartnersApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchSearchParticipants**](TradingPartnersApi.md#batchSearchParticipants) | **POST** /trading-partners/batch-searches | Handles batch search requests by uploading a file containing search parameters.
[**createTradingPartner**](TradingPartnersApi.md#createTradingPartner) | **POST** /trading-partners | Creates a new trading partner.
[**createTradingPartnersBatch**](TradingPartnersApi.md#createTradingPartnersBatch) | **POST** /trading-partners/batch | Creates a batch of multiple trading partners.
[**deleteTradingPartner**](TradingPartnersApi.md#deleteTradingPartner) | **DELETE** /trading-partners/{id} | Deletes a trading partner using ID.
[**downloadBatchSearchReport**](TradingPartnersApi.md#downloadBatchSearchReport) | **GET** /trading-partners/batch-searches/{id}/$download-results | Downloads batch search results in a csv file.
[**getBatchSearchDetail**](TradingPartnersApi.md#getBatchSearchDetail) | **GET** /trading-partners/batch-searches/{id} | Returns the batch search details using ID.
[**listBatchSearches**](TradingPartnersApi.md#listBatchSearches) | **GET** /trading-partners/batch-searches | Lists all batch searches that were previously submitted.
[**searchParticipants**](TradingPartnersApi.md#searchParticipants) | **GET** /trading-partners | Returns a list of participants matching the input query.
[**updateTradingPartner**](TradingPartnersApi.md#updateTradingPartner) | **PUT** /trading-partners/{id} | Updates a trading partner using ID.



## batchSearchParticipants

> BatchSearchParticipants202Response batchSearchParticipants(avalaraVersion, name, notificationEmail, _file, xAvalaraClient, xCorrelationID)

Handles batch search requests by uploading a file containing search parameters.

This endpoint creates a batch search and performs a batch search in the directory for participants in the background.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String name = "Automotive Companies in London Search"; // String | A human-readable name for the batch search.
        String notificationEmail = "user@example.com"; // String | The email address to which a notification will be sent once the batch search is complete.
        File _file = new File("/path/to/file"); // File | CSV file containing search parameters.  Input Constraints: - Maximum file size: 1 MB - File Header: Must be less than 500 KB - Total number of lines (including header): Must be 101 or fewer
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **name** | **String**| A human-readable name for the batch search. |
 **notificationEmail** | **String**| The email address to which a notification will be sent once the batch search is complete. |
 **_file** | **File**| CSV file containing search parameters.  Input Constraints: - Maximum file size: 1 MB - File Header: Must be less than 500 KB - Total number of lines (including header): Must be 101 or fewer |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

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
| **202** | Batch search file accepted for processing the search. |  * X-Correlation-ID -  <br>  |
| **400** | Invalid request |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |


## createTradingPartner

> CreateTradingPartner201Response createTradingPartner(avalaraVersion, tradingPartner, xAvalaraClient, xCorrelationID)

Creates a new trading partner.

This endpoint creates a new trading partner with the provided details. The request body must include the necessary information as defined in the &#x60;TradingPartner&#x60; schema.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        TradingPartner tradingPartner = new TradingPartner(); // TradingPartner | 
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        try {
            CreateTradingPartner201Response result = apiInstance.createTradingPartner(avalaraVersion, tradingPartner, xAvalaraClient, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingPartnersApi#createTradingPartner");
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
 **tradingPartner** | [**TradingPartner**](TradingPartner.md)|  |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

### Return type

[**CreateTradingPartner201Response**](CreateTradingPartner201Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The trading partner has been successfully created. |  * X-Correlation-ID -  <br>  |
| **400** | Bad request |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized. |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden. |  * X-Correlation-ID -  <br>  |
| **409** | Conflict |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |


## createTradingPartnersBatch

> CreateTradingPartnersBatch200Response createTradingPartnersBatch(avalaraVersion, createTradingPartnersBatchRequest, xAvalaraClient, xCorrelationID)

Creates a batch of multiple trading partners.

This endpoint creates multiple trading partners in a single batch request. It accepts an array of trading partners and processes them synchronously. Supports a maximum of 100 records or a 1 MB request payload.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        CreateTradingPartnersBatchRequest createTradingPartnersBatchRequest = new CreateTradingPartnersBatchRequest(); // CreateTradingPartnersBatchRequest | 
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        try {
            CreateTradingPartnersBatch200Response result = apiInstance.createTradingPartnersBatch(avalaraVersion, createTradingPartnersBatchRequest, xAvalaraClient, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingPartnersApi#createTradingPartnersBatch");
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
 **createTradingPartnersBatchRequest** | [**CreateTradingPartnersBatchRequest**](CreateTradingPartnersBatchRequest.md)|  |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

### Return type

[**CreateTradingPartnersBatch200Response**](CreateTradingPartnersBatch200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch processing completed. Returns a list of created trading partners. |  * X-Correlation-ID -  <br>  |
| **400** | Bad request |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized. |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden. |  * X-Correlation-ID -  <br>  |
| **409** | Conflict |  * X-Correlation-ID -  <br>  |
| **413** | ContentTooLarge |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error |  * X-Correlation-ID -  <br>  |


## deleteTradingPartner

> deleteTradingPartner(avalaraVersion, id, xAvalaraClient, xCorrelationID)

Deletes a trading partner using ID.

This endpoint deletes an existing trading partner identified by the provided ID.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String id = "id_example"; // String | Unique identifier of the trading partner.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        try {
            apiInstance.deleteTradingPartner(avalaraVersion, id, xAvalaraClient, xCorrelationID);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingPartnersApi#deleteTradingPartner");
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
 **id** | **String**| Unique identifier of the trading partner. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Trading partner deleted successfully. |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden |  * X-Correlation-ID -  <br>  |
| **404** | NotFound |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error |  * X-Correlation-ID -  <br>  |


## downloadBatchSearchReport

> File downloadBatchSearchReport(avalaraVersion, id, xAvalaraClient, xCorrelationID)

Downloads batch search results in a csv file.

This endpoint downloads the report for a specific batch search using the batch search ID. It returns a CSV file containing up to 1,000 query results.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String id = "2f5ea4b5-4dae-445a-b3e4-9f65a61eaa99"; // String | Unique identifier of the batch search for which to download the report.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **id** | **String**| Unique identifier of the batch search for which to download the report. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

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
| **200** | Successful report download. Returns a CSV file containing up to 1,000 query results. |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized. |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden. |  * X-Correlation-ID -  <br>  |
| **404** | Report not found |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |


## getBatchSearchDetail

> BatchSearch getBatchSearchDetail(avalaraVersion, id, xAvalaraClient, xCorrelationID)

Returns the batch search details using ID.

This endpoint returns detailed information for a specific batch search using the provided ID. It is useful for tracking the status and progress of a previously initiated batch search operation.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String id = "2f5ea4b5-4dae-445a-b3e4-9f65a61eaa99"; // String | Unique identifier of the batch search.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **id** | **String**| Unique identifier of the batch search. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

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
| **200** | Returns the batch search details for the specified ID. |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden |  * X-Correlation-ID -  <br>  |
| **404** | Report not found |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |


## listBatchSearches

> BatchSearchListResponse listBatchSearches(avalaraVersion, xAvalaraClient, $filter, count, $top, $skip, $orderBy, xCorrelationID)

Lists all batch searches that were previously submitted.

This endpoint retrieves a list of all batch search operations that have been previously submitted. It returns details such as the batch search ID, status, creation date, and associated metadata. It is useful for tracking the progress of a previously initiated batch search operations.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String $filter = "name eq 'Batch_Search_Import_V4'"; // String | Filters the results by field name. Only the eq operator and the name field are supported. For more information, refer to the Avalara filtering guide.
        Boolean count = true; // Boolean | When set to <code>true</code>, returns the total count of matching records included as <code>@recordSetCount</code> in the response body.
        Integer $top = 56; // Integer | The number of items to include in the result.
        Integer $skip = 56; // Integer | The number of items to skip in the result.
        String $orderBy = "name desc"; // String | The <code>$orderBy</code> query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space.
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **$filter** | **String**| Filters the results by field name. Only the eq operator and the name field are supported. For more information, refer to the Avalara filtering guide. | [optional]
 **count** | **Boolean**| When set to &lt;code&gt;true&lt;/code&gt;, returns the total count of matching records included as &lt;code&gt;@recordSetCount&lt;/code&gt; in the response body. | [optional]
 **$top** | **Integer**| The number of items to include in the result. | [optional]
 **$skip** | **Integer**| The number of items to skip in the result. | [optional]
 **$orderBy** | **String**| The &lt;code&gt;$orderBy&lt;/code&gt; query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space. | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

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
| **200** | Returns a collection of batch searches. |  * X-Correlation-ID -  <br>  |
| **400** | Bad request |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |


## searchParticipants

> SearchParticipants200Response searchParticipants(avalaraVersion, $search, xAvalaraClient, count, $filter, $top, $skip, $orderBy, xCorrelationID)

Returns a list of participants matching the input query.

This endpoint retrieves a list of trading partners that match the specified search criteria. It supports filtering, search text, and other relevant query parameters to narrow down the results.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String $search = "Acme AND 7726627177 OR BMW"; // String | Search by value supports logical AND and OR operators (case-sensitive). Search is performed only over the name and identifier value fields. For more information, refer to the OData query options overview documentation.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        Boolean count = true; // Boolean | When set to true, returns the total count of matching records included as @recordSetCount in the response body.
        String $filter = "network eq 'Peppol' and country eq 'Australia'"; // String | Filters the results using the eq operator. Supported fields include network, country, documentType, and idType. For more information, refer to the Avalara filtering guide.
        Integer $top = 56; // Integer | The number of items to include in the result.
        Integer $skip = 56; // Integer | The number of items to skip in the result.
        String $orderBy = "name desc"; // String | The $orderBy query parameter specifies the field and sorting direction for ordering the result set. The value combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space.
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        try {
            SearchParticipants200Response result = apiInstance.searchParticipants(avalaraVersion, $search, xAvalaraClient, count, $filter, $top, $skip, $orderBy, xCorrelationID);
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
 **avalaraVersion** | **String**| Header that specifies the API version to use (for example \&quot;1.6\&quot;). |
 **$search** | **String**| Search by value supports logical AND and OR operators (case-sensitive). Search is performed only over the name and identifier value fields. For more information, refer to the OData query options overview documentation. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **count** | **Boolean**| When set to true, returns the total count of matching records included as @recordSetCount in the response body. | [optional]
 **$filter** | **String**| Filters the results using the eq operator. Supported fields include network, country, documentType, and idType. For more information, refer to the Avalara filtering guide. | [optional]
 **$top** | **Integer**| The number of items to include in the result. | [optional]
 **$skip** | **Integer**| The number of items to skip in the result. | [optional]
 **$orderBy** | **String**| The $orderBy query parameter specifies the field and sorting direction for ordering the result set. The value combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space. | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

### Return type

[**SearchParticipants200Response**](SearchParticipants200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a collection of trading partners matching the specified search criteria. |  * X-Correlation-ID -  <br>  |
| **400** | Bad request. |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized. |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden. |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |


## updateTradingPartner

> UpdateTradingPartner200Response updateTradingPartner(avalaraVersion, id, tradingPartner, xAvalaraClient, xCorrelationID)

Updates a trading partner using ID.

This endpoint updates the details of an existing trading partner specified by the provided ID. It performs a full update, and the request body must include all required fields.

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
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String id = "id_example"; // String | Unique identifier of the trading partner.
        TradingPartner tradingPartner = new TradingPartner(); // TradingPartner | 
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        String xCorrelationID = "f3f0d19a-01a1-4748-8a58-f000d0424f43"; // String | Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\").
        try {
            UpdateTradingPartner200Response result = apiInstance.updateTradingPartner(avalaraVersion, id, tradingPartner, xAvalaraClient, xCorrelationID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TradingPartnersApi#updateTradingPartner");
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
 **id** | **String**| Unique identifier of the trading partner. |
 **tradingPartner** | [**TradingPartner**](TradingPartner.md)|  |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **xCorrelationID** | **String**| Optional correlation identifier provided by the caller to trace the call (for example \&quot;f3f0d19a-01a1-4748-8a58-f000d0424f43\&quot;). | [optional]

### Return type

[**UpdateTradingPartner200Response**](UpdateTradingPartner200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The trading partner has been successfully created. |  -  |
| **400** | Bad request |  * X-Correlation-ID -  <br>  |
| **401** | Unauthorized |  * X-Correlation-ID -  <br>  |
| **403** | Forbidden |  * X-Correlation-ID -  <br>  |
| **404** | NotFound |  * X-Correlation-ID -  <br>  |
| **409** | Conflict |  * X-Correlation-ID -  <br>  |
| **500** | Internal server error. |  * X-Correlation-ID -  <br>  |

