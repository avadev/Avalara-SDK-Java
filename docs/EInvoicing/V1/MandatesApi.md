# MandatesApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMandateDataInputFields**](MandatesApi.md#getMandateDataInputFields) | **GET** /mandates/{mandateId}/data-input-fields | Returns document field information for a country mandate, a selected document type, and its version
[**getMandates**](MandatesApi.md#getMandates) | **GET** /mandates | List country mandates that are supported by the Avalara E-Invoicing platform



## getMandateDataInputFields

> List&lt;MandateDataInputField&gt; getMandateDataInputFields(avalaraVersion, mandateId, documentType, documentVersion, xAvalaraClient)

Returns document field information for a country mandate, a selected document type, and its version

This endpoint provides document field details and the optionality of fields (required, conditional, optional) of different documents supported by the country mandate. Use the GET &lt;code&gt;/mandates&lt;/code&gt; endpoint to retrieve all available country mandates, their supported document types and supported versions. You can use the &#x60;documentType&#x60; and &#x60;documentVersion&#x60; query parameters to retrieve the input fields for a particular document type and document version.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.MandatesApi;

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

        MandatesApi apiInstance = new MandatesApi(apiClient);
        String avalaraVersion = "1.2"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String mandateId = "AD-B2G-PEPPOL"; // String | The unique ID for the mandate that was returned in the GET /einvoicing/mandates response body
        String documentType = "ubl-invoice"; // String | Select the documentType for which you wish to view the data-input-fields (You may obtain the supported documentTypes from the GET /mandates endpoint)
        String documentVersion = "2.1"; // String | Select the document version of the documentType (You may obtain the supported documentVersion from the GET /mandates endpoint)
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint.
        try {
            List<MandateDataInputField> result = apiInstance.getMandateDataInputFields(avalaraVersion, mandateId, documentType, documentVersion, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MandatesApi#getMandateDataInputFields");
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
 **mandateId** | **String**| The unique ID for the mandate that was returned in the GET /einvoicing/mandates response body |
 **documentType** | **String**| Select the documentType for which you wish to view the data-input-fields (You may obtain the supported documentTypes from the GET /mandates endpoint) |
 **documentVersion** | **String**| Select the document version of the documentType (You may obtain the supported documentVersion from the GET /mandates endpoint) |
 **xAvalaraClient** | **String**| You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. | [optional]

### Return type

[**List&lt;MandateDataInputField&gt;**](MandateDataInputField.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Resource not found |  -  |
| **500** | Internal Server Error |  -  |


## getMandates

> MandatesResponse getMandates(avalaraVersion, xAvalaraClient, $filter, $top, $skip, $count, $countOnly)

List country mandates that are supported by the Avalara E-Invoicing platform

This endpoint offers a list of country mandates supported by the Avalara E-Invoicing API.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.MandatesApi;

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

        MandatesApi apiInstance = new MandatesApi(apiClient);
        String avalaraVersion = "1.2"; // String | The HTTP Header meant to specify the version of the API intended to be used
        String xAvalaraClient = "John's E-Invoicing-API Client"; // String | You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint.
        String $filter = "countryMandate eq DE-B2G-PEPPOL"; // String | Filter by field name and value. This filter only supports <code>eq</code> and <code>contains</code>. Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering.
        BigDecimal $top = new BigDecimal("10"); // BigDecimal | If nonzero, return no more than this number of results. Used with <code>$skip</code> to provide pagination for large datasets. Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records.
        BigDecimal $skip = new BigDecimal("10"); // BigDecimal | If nonzero, skip this number of results before returning data. Used with <code>$top</code> to provide pagination for large datasets.
        Boolean $count = true; // Boolean | When set to true, the count of the collection is also returned in the response body.
        Boolean $countOnly = true; // Boolean | When set to true, only the count of the collection is returned
        try {
            MandatesResponse result = apiInstance.getMandates(avalaraVersion, xAvalaraClient, $filter, $top, $skip, $count, $countOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MandatesApi#getMandates");
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
 **$filter** | **String**| Filter by field name and value. This filter only supports &lt;code&gt;eq&lt;/code&gt; and &lt;code&gt;contains&lt;/code&gt;. Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. | [optional]
 **$top** | **BigDecimal**| If nonzero, return no more than this number of results. Used with &lt;code&gt;$skip&lt;/code&gt; to provide pagination for large datasets. Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. | [optional]
 **$skip** | **BigDecimal**| If nonzero, skip this number of results before returning data. Used with &lt;code&gt;$top&lt;/code&gt; to provide pagination for large datasets. | [optional]
 **$count** | **Boolean**| When set to true, the count of the collection is also returned in the response body. | [optional]
 **$countOnly** | **Boolean**| When set to true, only the count of the collection is returned | [optional]

### Return type

[**MandatesResponse**](MandatesResponse.md)

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
| **404** | Resource not found |  -  |
| **500** | Internal Server Error |  -  |

