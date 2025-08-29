# Forms1099Api

All URIs are relative to *https://api.sbx.avalara.com/avalara1099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkUpsert1099Forms**](Forms1099Api.md#bulkUpsert1099Forms) | **POST** /1099/forms/$bulk-upsert | Create or update multiple 1099/1095/W2/1042S forms
[**create1099Form**](Forms1099Api.md#create1099Form) | **POST** /1099/forms | Create a 1099/1095/W2/1042S form
[**delete1099Form**](Forms1099Api.md#delete1099Form) | **DELETE** /1099/forms/{id} | Delete a 1099/1095/W2/1042S form
[**get1099Form**](Forms1099Api.md#get1099Form) | **GET** /1099/forms/{id} | Retrieve a 1099/1095/W2/1042S form
[**get1099FormPdf**](Forms1099Api.md#get1099FormPdf) | **GET** /1099/forms/{id}/pdf | Retrieve the PDF file for a 1099/1095/W2/1042S form
[**list1099Forms**](Forms1099Api.md#list1099Forms) | **GET** /1099/forms | List 1099/1095/W2/1042S forms
[**update1099Form**](Forms1099Api.md#update1099Form) | **PUT** /1099/forms/{id} | Update a 1099/1095/W2/1042S form



## bulkUpsert1099Forms

> JobResponse bulkUpsert1099Forms(avalaraVersion, dryRun, xCorrelationId, xAvalaraClient, form1099ListRequest)

Create or update multiple 1099/1095/W2/1042S forms

This endpoint allows you to create or update multiple 1099/1095/W2/1042S forms.  Maximum of 5000 forms can be processed in a single bulk request.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Forms1099Api;

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

        Forms1099Api apiInstance = new Forms1099Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        Boolean dryRun = false; // Boolean | defaults to false. If true, it will NOT change the DB. It will just return a report of what would've have been changed in the DB
        String xCorrelationId = "16e56e1f-e623-4f23-9904-21c29b5b4545"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        Form1099ListRequest form1099ListRequest = new Form1099ListRequest(); // Form1099ListRequest | 
        try {
            JobResponse result = apiInstance.bulkUpsert1099Forms(avalaraVersion, dryRun, xCorrelationId, xAvalaraClient, form1099ListRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Forms1099Api#bulkUpsert1099Forms");
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
 **dryRun** | **Boolean**| defaults to false. If true, it will NOT change the DB. It will just return a report of what would&#39;ve have been changed in the DB | [optional] [default to false]
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]
 **form1099ListRequest** | [**Form1099ListRequest**](Form1099ListRequest.md)|  | [optional]

### Return type

[**JobResponse**](JobResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |
| **401** | Unauthorized |  -  |


## create1099Form

> Get1099Form200Response create1099Form(avalaraVersion, xCorrelationId, xAvalaraClient, get1099Form200Response)

Create a 1099/1095/W2/1042S form

Create a 1099/1095/W2/1042S form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Forms1099Api;

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

        Forms1099Api apiInstance = new Forms1099Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "e4a7bf40-da9f-452a-b2db-c8b64721610b"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        Get1099Form200Response get1099Form200Response = new Get1099Form200Response(); // Get1099Form200Response | 
        try {
            Get1099Form200Response result = apiInstance.create1099Form(avalaraVersion, xCorrelationId, xAvalaraClient, get1099Form200Response);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Forms1099Api#create1099Form");
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
 **get1099Form200Response** | [**Get1099Form200Response**](Get1099Form200Response.md)|  | [optional]

### Return type

[**Get1099Form200Response**](Get1099Form200Response.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |
| **401** | Unauthorized |  -  |


## delete1099Form

> delete1099Form(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Delete a 1099/1095/W2/1042S form

Delete a 1099/1095/W2/1042S form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Forms1099Api;

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

        Forms1099Api apiInstance = new Forms1099Api(apiClient);
        String id = "id_example"; // String | The unique identifier of the desired form to delete.
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "8e01e950-8e1c-4b1b-9120-2e2452c6d590"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            apiInstance.delete1099Form(id, avalaraVersion, xCorrelationId, xAvalaraClient);
        } catch (ApiException e) {
            System.err.println("Exception when calling Forms1099Api#delete1099Form");
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
 **id** | **String**| The unique identifier of the desired form to delete. |
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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Client Error |  -  |
| **500** | Server Error |  -  |
| **401** | Unauthorized |  -  |


## get1099Form

> Get1099Form200Response get1099Form(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Retrieve a 1099/1095/W2/1042S form

Retrieve a 1099/1095/W2/1042S form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Forms1099Api;

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

        Forms1099Api apiInstance = new Forms1099Api(apiClient);
        String id = "id_example"; // String | 
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "7b8174a3-a873-4a05-a619-f362955f4608"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            Get1099Form200Response result = apiInstance.get1099Form(id, avalaraVersion, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Forms1099Api#get1099Form");
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
 **id** | **String**|  |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**Get1099Form200Response**](Get1099Form200Response.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |
| **401** | Unauthorized |  -  |


## get1099FormPdf

> File get1099FormPdf(id, avalaraVersion, markEdelivered, xCorrelationId, xAvalaraClient)

Retrieve the PDF file for a 1099/1095/W2/1042S form

Retrieve the PDF file for a 1099/1095/W2/1042S form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Forms1099Api;

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

        Forms1099Api apiInstance = new Forms1099Api(apiClient);
        String id = "id_example"; // String | The ID of the form
        String avalaraVersion = "2.0.0"; // String | API version
        Boolean markEdelivered = true; // Boolean | Optional boolean that if set indicates that the form should be marked as having been successfully edelivered
        String xCorrelationId = "a4dd3a23-ae45-45a5-8612-75e2fe4c1f36"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            File result = apiInstance.get1099FormPdf(id, avalaraVersion, markEdelivered, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Forms1099Api#get1099FormPdf");
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
 **id** | **String**| The ID of the form |
 **avalaraVersion** | **String**| API version |
 **markEdelivered** | **Boolean**| Optional boolean that if set indicates that the form should be marked as having been successfully edelivered | [optional]
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**File**](File.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |
| **401** | Unauthorized |  -  |


## list1099Forms

> PaginatedQueryResultModelForm1099Base list1099Forms(avalaraVersion, $filter, $top, $skip, $orderBy, count, countOnly, xCorrelationId, xAvalaraClient)

List 1099/1095/W2/1042S forms

List 1099/1095/W2/1042S forms.                Collections support filtering only on certain fields. An attempt to filter on an unsupported field will receive a 400 Bad Request response.                Supported filtering fields are as follows:                - issuerId  - issuerReferenceId  - taxYear  - addressVerificationStatus - possible values are: unknown, pending, failed, incomplete, unchanged, verified  - createdAt  - edeliveryStatus - possible values are: sent, unscheduled, bad_verify, bad_verify_limit, scheduled, bounced, accepted  - email  - federalEfileStatus - possible values are: unscheduled, scheduled, sent, corrected_scheduled, accepted, corrected, corrected_accepted, held  - recipientName  - mailStatus - possible values are: sent, unscheduled, pending, delivered  - referenceId  - tinMatchStatus - possible values are: none, pending, matched, failed  - type - possible values are: 940, 941, 943, 944, 945, 1042, 1042-S, 1095-B, 1095-C, 1097-BTC, 1098, 1098-C, 1098-E, 1098-Q, 1098-T, 3921, 3922, 5498, 5498-ESA, 5498-SA, 1099-MISC, 1099-A, 1099-B, 1099-C, 1099-CAP, 1099-DIV, 1099-G, 1099-INT, 1099-K, 1099-LS, 1099-LTC, 1099-NEC, 1099-OID, 1099-PATR, 1099-Q, 1099-R, 1099-S, 1099-SA, T4A, W-2, W-2G, 1099-HC  - updatedAt  - validity - possible values are: true, false                For more information on filtering, see &lt;see href&#x3D;\&quot;https://developer.avalara.com/avatax/filtering-in-rest/\&quot;&gt;Filtering in REST&lt;/see&gt;.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Forms1099Api;

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

        Forms1099Api apiInstance = new Forms1099Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String $filter = "issuerId eq 884781823"; // String | A filter statement to identify specific records to retrieve.  For more information on filtering, see <a href=\"https://developer.avalara.com/avatax/filtering-in-rest/\">Filtering in REST</a>.
        Integer $top = 56; // Integer | If zero or greater than 1000, return at most 1000 results.  Otherwise, return this number of results.  Used with skip to provide pagination for large datasets.
        Integer $skip = 56; // Integer | If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets.
        String $orderBy = "$orderBy_example"; // String | A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example id ASC.
        Boolean count = true; // Boolean | If true, return the global count of elements in the collection.
        Boolean countOnly = true; // Boolean | If true, return ONLY the global count of elements in the collection.  It only applies when count=true.
        String xCorrelationId = "f808e46a-fc55-4dd7-960d-13c6ba8176f2"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            PaginatedQueryResultModelForm1099Base result = apiInstance.list1099Forms(avalaraVersion, $filter, $top, $skip, $orderBy, count, countOnly, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Forms1099Api#list1099Forms");
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

[**PaginatedQueryResultModelForm1099Base**](PaginatedQueryResultModelForm1099Base.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |
| **401** | Unauthorized |  -  |


## update1099Form

> Get1099Form200Response update1099Form(id, avalaraVersion, xCorrelationId, xAvalaraClient, get1099Form200Response)

Update a 1099/1095/W2/1042S form

Update a 1099/1095/W2/1042S form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.Forms1099Api;

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

        Forms1099Api apiInstance = new Forms1099Api(apiClient);
        String id = "id_example"; // String | 
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "944ee583-b810-471c-852c-d3c6f8b93a4b"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        Get1099Form200Response get1099Form200Response = new Get1099Form200Response(); // Get1099Form200Response | 
        try {
            Get1099Form200Response result = apiInstance.update1099Form(id, avalaraVersion, xCorrelationId, xAvalaraClient, get1099Form200Response);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling Forms1099Api#update1099Form");
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
 **id** | **String**|  |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]
 **get1099Form200Response** | [**Get1099Form200Response**](Get1099Form200Response.md)|  | [optional]

### Return type

[**Get1099Form200Response**](Get1099Form200Response.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |
| **401** | Unauthorized |  -  |

