# Issuers1099Api

All URIs are relative to *https://api.sbx.avalara.com/avalara1099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIssuer**](Issuers1099Api.md#createIssuer) | **POST** /1099/issuers | Create an issuer
[**deleteIssuer**](Issuers1099Api.md#deleteIssuer) | **DELETE** /1099/issuers/{id} | Delete an issuer
[**getIssuer**](Issuers1099Api.md#getIssuer) | **GET** /1099/issuers/{id} | Retrieve an issuer
[**getIssuers**](Issuers1099Api.md#getIssuers) | **GET** /1099/issuers | List issuers
[**resubmitRejectedForms**](Issuers1099Api.md#resubmitRejectedForms) | **POST** /1099/issuers/{issuerId}/$resubmit-rejected-forms | Request a replacement submission for an issuer&#39;s rejected forms
[**updateIssuer**](Issuers1099Api.md#updateIssuer) | **PUT** /1099/issuers/{id} | Update an issuer



## createIssuer

> IssuerWriteResponse createIssuer(avalaraVersion, xCorrelationId, xAvalaraClient, issuerRequest)

Create an issuer

Create an issuer (also known as a Payer).

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Issuers1099Api;

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

        Issuers1099Api apiInstance = new Issuers1099Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "5ae71043-1efc-47f3-931c-194f239999b9"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        IssuerRequest issuerRequest = new IssuerRequest(); // IssuerRequest | The issuer to create
        try {
            IssuerWriteResponse result = apiInstance.createIssuer(avalaraVersion, xCorrelationId, xAvalaraClient, issuerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Issuers1099Api#createIssuer");
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
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]
 **issuerRequest** | [**IssuerRequest**](IssuerRequest.md)| The issuer to create | [optional]

### Return type

[**IssuerWriteResponse**](IssuerWriteResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created issuer |  -  |
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **401** | Authentication failed |  -  |


## deleteIssuer

> deleteIssuer(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Delete an issuer

Delete an issuer (also known as a Payer).

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Issuers1099Api;

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

        Issuers1099Api apiInstance = new Issuers1099Api(apiClient);
        String id = "id_example"; // String | Id of the issuer to delete
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "f7a15738-d958-4708-aad8-eac25b686d81"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            apiInstance.deleteIssuer(id, avalaraVersion, xCorrelationId, xAvalaraClient);
        } catch (ApiException e) {
            System.err.println("Exception when calling Issuers1099Api#deleteIssuer");
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
 **id** | **String**| Id of the issuer to delete |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty response |  -  |
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **401** | Authentication failed |  -  |


## getIssuer

> IssuerResponse getIssuer(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Retrieve an issuer

Retrieve an issuer (also known as a Payer).

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Issuers1099Api;

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

        Issuers1099Api apiInstance = new Issuers1099Api(apiClient);
        String id = "id_example"; // String | Id of the issuer to retrieve
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "27ab9711-3475-41e4-b82a-2b7ce52ca884"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            IssuerResponse result = apiInstance.getIssuer(id, avalaraVersion, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Issuers1099Api#getIssuer");
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
 **id** | **String**| Id of the issuer to retrieve |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**IssuerResponse**](IssuerResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Single issuer |  -  |
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **401** | Authentication failed |  -  |


## getIssuers

> PaginatedQueryResultModelIssuerResponse getIssuers(avalaraVersion, $filter, $top, $skip, $orderBy, count, countOnly, xCorrelationId, xAvalaraClient)

List issuers

List issuers (also known as Payers). Filterable fields are businessName, businessName2, referenceId, taxYear, firstName, and lastName.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Issuers1099Api;

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

        Issuers1099Api apiInstance = new Issuers1099Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String $filter = "taxYear eq 2025"; // String | A filter statement to identify specific records to retrieve.  For more information on filtering, see <a href=\"https://developer.avalara.com/avatax/filtering-in-rest/\">Filtering in REST</a>.
        Integer $top = 56; // Integer | If zero or greater than 1000, return at most 1000 results.  Otherwise, return this number of results.  Used with skip to provide pagination for large datasets.
        Integer $skip = 56; // Integer | If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets.
        String $orderBy = "$orderBy_example"; // String | A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example id ASC.
        Boolean count = true; // Boolean | If true, return the global count of elements in the collection.
        Boolean countOnly = true; // Boolean | If true, return ONLY the global count of elements in the collection.  It only applies when count=true.
        String xCorrelationId = "1dbcdaf4-7ea0-46e9-b83c-b663e6178568"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            PaginatedQueryResultModelIssuerResponse result = apiInstance.getIssuers(avalaraVersion, $filter, $top, $skip, $orderBy, count, countOnly, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Issuers1099Api#getIssuers");
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
 **avalaraVersion** | **String**| API version |
 **$filter** | **String**| A filter statement to identify specific records to retrieve.  For more information on filtering, see &lt;a href&#x3D;\&quot;https://developer.avalara.com/avatax/filtering-in-rest/\&quot;&gt;Filtering in REST&lt;/a&gt;. | [optional]
 **$top** | **Integer**| If zero or greater than 1000, return at most 1000 results.  Otherwise, return this number of results.  Used with skip to provide pagination for large datasets. | [optional]
 **$skip** | **Integer**| If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets. | [optional]
 **$orderBy** | **String**| A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example id ASC. | [optional]
 **count** | **Boolean**| If true, return the global count of elements in the collection. | [optional]
 **countOnly** | **Boolean**| If true, return ONLY the global count of elements in the collection.  It only applies when count&#x3D;true. | [optional]
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**PaginatedQueryResultModelIssuerResponse**](PaginatedQueryResultModelIssuerResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of issuers |  -  |
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |
| **401** | Authentication failed |  -  |


## resubmitRejectedForms

> ResubmitRejectedFormsResponse resubmitRejectedForms(issuerId, avalaraVersion, xCorrelationId, xAvalaraClient)

Request a replacement submission for an issuer&#39;s rejected forms

Mirrors the UI&#39;s \&quot;Resubmit Rejected Forms\&quot; action: schedules a replacement submission for every one  of the issuer&#39;s forms currently in Rejected or RejectedWithErrors status, in a single action. There  is no per-form or per-submission selection. This call only schedules the resubmission — actual  transmission to the IRS remains asynchronous and batch-driven.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Issuers1099Api;

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

        Issuers1099Api apiInstance = new Issuers1099Api(apiClient);
        Long issuerId = 56L; // Long | Id of the issuer whose rejected forms should be resubmitted
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "0520f85b-11b0-4246-953f-e06f87029486"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            ResubmitRejectedFormsResponse result = apiInstance.resubmitRejectedForms(issuerId, avalaraVersion, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Issuers1099Api#resubmitRejectedForms");
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
 **issuerId** | **Long**| Id of the issuer whose rejected forms should be resubmitted |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**ResubmitRejectedFormsResponse**](ResubmitRejectedFormsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rejected forms scheduled for replacement submission |  -  |
| **401** | Authentication failed |  -  |
| **403** | Caller does not have access to this issuer |  -  |
| **404** | Issuer has no forms in Rejected or RejectedWithErrors status |  -  |


## updateIssuer

> IssuerWriteResponse updateIssuer(id, avalaraVersion, xCorrelationId, xAvalaraClient, issuerRequest)

Update an issuer

Update an issuer (also known as a Payer). When the payload violates field-level business rules, the issuer is still persisted and the response body includes a &#x60;validationErrors[]&#x60; array describing each violation.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Issuers1099Api;

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

        Issuers1099Api apiInstance = new Issuers1099Api(apiClient);
        String id = "id_example"; // String | Id of the issuer to update
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "542fb8dd-e4ec-49c2-aef5-f9159dd46aaf"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        IssuerRequest issuerRequest = new IssuerRequest(); // IssuerRequest | The issuer to update
        try {
            IssuerWriteResponse result = apiInstance.updateIssuer(id, avalaraVersion, xCorrelationId, xAvalaraClient, issuerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Issuers1099Api#updateIssuer");
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
 **id** | **String**| Id of the issuer to update |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]
 **issuerRequest** | [**IssuerRequest**](IssuerRequest.md)| The issuer to update | [optional]

### Return type

[**IssuerWriteResponse**](IssuerWriteResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Issuer updated. Body may contain &#x60;validationErrors[]&#x60; when business rules failed. |  -  |
| **400** | Invalid id format, malformed JSON, or identity change rejected for an issuer with scheduled Forms 1099 (TIN, TIN type, or name are immutable in that case). |  -  |
| **401** | Unauthorized |  -  |
| **403** | Caller does not have access to this issuer. |  -  |
| **404** | Issuer not found. |  -  |

