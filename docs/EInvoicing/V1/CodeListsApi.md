# CodeListsApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCodeList**](CodeListsApi.md#getCodeList) | **GET** /codelists/{codelistId} | Retrieves a code list by ID for a specific country
[**getCodeListList**](CodeListsApi.md#getCodeListList) | **GET** /codelists | Returns a list of code lists for a specific country



## getCodeList

> CodeListResponse getCodeList(avalaraVersion, codelistId, countryCode, xAvalaraClient, effectiveDate, sunsetDate)

Retrieves a code list by ID for a specific country

A Code List is a controlled set of predefined, standardized values used to populate specific fields in electronic documents (such as e-invoices). Each code has a stable, machine-readable identifier and a human-readable description. Code Lists are typically based on global standards (e.g., UN/CEFACT, ISO, EN16931) and may include jurisdiction-specific extensions or restrictions.&lt;br&gt;&lt;br&gt;Code Lists are versioned, and each version may have defined effective and sunset dates to ensure that the correct set of allowable values is applied according to regulatory or jurisdictional requirements.&lt;br&gt;&lt;br&gt;By default, the API returns only non-expired code list versions (versions where the sunset date has not passed). To retrieve expired versions or filter by specific date ranges, use the &lt;code&gt;effectiveDate&lt;/code&gt; and &lt;code&gt;sunsetDate&lt;/code&gt; query parameters.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.CodeListsApi;

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

        CodeListsApi apiInstance = new CodeListsApi(apiClient);
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String codelistId = "ab123343-3432-423c-ac3f-53453scs9999"; // String | System-generated unique identifier of the code list definition. Typically a UUID used to reference this code list internally or via APIs.
        String countryCode = "FR"; // String | Two-letter ISO 3166-1 alpha-2 country code indicating the jurisdiction this code list applies to.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        LocalDate effectiveDate = LocalDate.parse("Tue Dec 31 16:00:00 PST 2024"); // LocalDate | Filter code list versions by effective date. Returns versions that are effective on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, defaults to the current date. sunsetDate is required when effectiveDate is provided.
        LocalDate sunsetDate = LocalDate.parse("Wed Dec 30 16:00:00 PST 2026"); // LocalDate | Filter code list versions by sunset date. Returns versions that have not yet sunset on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, only non-expired versions are returned.
        try {
            CodeListResponse result = apiInstance.getCodeList(avalaraVersion, codelistId, countryCode, xAvalaraClient, effectiveDate, sunsetDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeListsApi#getCodeList");
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
 **codelistId** | **String**| System-generated unique identifier of the code list definition. Typically a UUID used to reference this code list internally or via APIs. |
 **countryCode** | **String**| Two-letter ISO 3166-1 alpha-2 country code indicating the jurisdiction this code list applies to. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **effectiveDate** | **LocalDate**| Filter code list versions by effective date. Returns versions that are effective on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, defaults to the current date. sunsetDate is required when effectiveDate is provided. | [optional]
 **sunsetDate** | **LocalDate**| Filter code list versions by sunset date. Returns versions that have not yet sunset on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, only non-expired versions are returned. | [optional]

### Return type

[**CodeListResponse**](CodeListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Code list not found. |  -  |


## getCodeListList

> CodeListListResponse getCodeListList(avalaraVersion, countryCode, xAvalaraClient, effectiveDate, sunsetDate, $count, $countOnly, $top, $skip)

Returns a list of code lists for a specific country

Get a list of code lists on the Avalara E-Invoicing platform for the specified country. By default, the API returns only non-expired code lists (code lists where the sunset date has not passed). To retrieve expired code lists or filter by specific date ranges, use the &lt;code&gt;effectiveDate&lt;/code&gt; and &lt;code&gt;sunsetDate&lt;/code&gt; query parameters.&lt;br&gt;&lt;br&gt;A Code List is a controlled set of predefined, standardized values used to populate specific fields in electronic documents (such as e-invoices). Each code has a stable, machine-readable identifier and a human-readable description. Code Lists are typically based on global standards (e.g., UN/CEFACT, ISO, EN16931) and may include jurisdiction-specific extensions or restrictions.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.CodeListsApi;

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

        CodeListsApi apiInstance = new CodeListsApi(apiClient);
        String avalaraVersion = "1.6"; // String | Header that specifies the API version to use (for example \"1.6\").
        String countryCode = "FR"; // String | Two-letter ISO 3166-1 alpha-2 country code indicating the jurisdiction for which code lists should be returned.
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\").
        LocalDate effectiveDate = LocalDate.parse("Tue Dec 31 16:00:00 PST 2024"); // LocalDate | Filter code lists by effective date. Returns code lists that are effective on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, defaults to the current date. sunsetDate is required when effectiveDate is provided.
        LocalDate sunsetDate = LocalDate.parse("Wed Dec 30 16:00:00 PST 2026"); // LocalDate | Filter code lists by sunset date. Returns code lists that have not yet sunset on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, only non-expired code lists are returned.
        String $count = "true"; // String | When set to true, the response body also includes the count of items in the collection.
        String $countOnly = "false"; // String | When set to true, the response returns only the count of items in the collection.
        Integer $top = 56; // Integer | The number of items to include in the result.
        Integer $skip = 56; // Integer | The number of items to skip in the result.
        try {
            CodeListListResponse result = apiInstance.getCodeListList(avalaraVersion, countryCode, xAvalaraClient, effectiveDate, sunsetDate, $count, $countOnly, $top, $skip);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeListsApi#getCodeListList");
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
 **countryCode** | **String**| Two-letter ISO 3166-1 alpha-2 country code indicating the jurisdiction for which code lists should be returned. |
 **xAvalaraClient** | **String**| Optional header for a client identifier string used for diagnostics (for example \&quot;Fingerprint\&quot;). | [optional]
 **effectiveDate** | **LocalDate**| Filter code lists by effective date. Returns code lists that are effective on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, defaults to the current date. sunsetDate is required when effectiveDate is provided. | [optional]
 **sunsetDate** | **LocalDate**| Filter code lists by sunset date. Returns code lists that have not yet sunset on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, only non-expired code lists are returned. | [optional]
 **$count** | **String**| When set to true, the response body also includes the count of items in the collection. | [optional]
 **$countOnly** | **String**| When set to true, the response returns only the count of items in the collection. | [optional]
 **$top** | **Integer**| The number of items to include in the result. | [optional]
 **$skip** | **Integer**| The number of items to skip in the result. | [optional]

### Return type

[**CodeListListResponse**](CodeListListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |

