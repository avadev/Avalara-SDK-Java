# CompaniesW9Api

All URIs are relative to *https://api-ava1099.eta.sbx.us-east-1.aws.avalara.io/avalara1099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompany**](CompaniesW9Api.md#createCompany) | **POST** /w9/companies | Create a company
[**deleteCompany**](CompaniesW9Api.md#deleteCompany) | **DELETE** /w9/companies/{id} | Delete a company
[**getCompanies**](CompaniesW9Api.md#getCompanies) | **GET** /w9/companies | List companies
[**getCompany**](CompaniesW9Api.md#getCompany) | **GET** /w9/companies/{id} | Retrieve a company
[**updateCompany**](CompaniesW9Api.md#updateCompany) | **PUT** /w9/companies/{id} | Update a company



## createCompany

> CompanyResponseModel createCompany(avalaraVersion, xCorrelationId, xAvalaraClient, companyCreateUpdateRequestModel)

Create a company

Create a company.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.CompaniesW9Api;

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

        CompaniesW9Api apiInstance = new CompaniesW9Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "fe0b2c61-3b02-476a-ab45-cffe1b04e41a"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        CompanyCreateUpdateRequestModel companyCreateUpdateRequestModel = new CompanyCreateUpdateRequestModel(); // CompanyCreateUpdateRequestModel | The company to create
        try {
            CompanyResponseModel result = apiInstance.createCompany(avalaraVersion, xCorrelationId, xAvalaraClient, companyCreateUpdateRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesW9Api#createCompany");
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
 **companyCreateUpdateRequestModel** | [**CompanyCreateUpdateRequestModel**](CompanyCreateUpdateRequestModel.md)| The company to create | [optional]

### Return type

[**CompanyResponseModel**](CompanyResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created company |  -  |
| **400** | Bad request (e.g., model validation failed) |  -  |
| **401** | Authentication failed |  -  |


## deleteCompany

> deleteCompany(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Delete a company

Delete a company.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.CompaniesW9Api;

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

        CompaniesW9Api apiInstance = new CompaniesW9Api(apiClient);
        String id = "id_example"; // String | The company to delete
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "250cdf61-a491-4fce-9544-33316d95a0a2"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            apiInstance.deleteCompany(id, avalaraVersion, xCorrelationId, xAvalaraClient);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesW9Api#deleteCompany");
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
 **id** | **String**| The company to delete |
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
| **204** | Company deleted |  -  |
| **401** | Authentication failed. |  -  |
| **404** | Company was not found or your user does not have to permission to delete it. |  -  |
| **409** | Company can&#39;t be deleted since it still have forms associated with it. |  -  |
| **500** | An error happened while attempting to delete the company. |  -  |


## getCompanies

> PaginatedQueryResultModelCompanyResponse getCompanies(avalaraVersion, $filter, $top, $skip, $orderBy, count, countOnly, xCorrelationId, xAvalaraClient)

List companies

List existing companies. Filterable/Sortable fields are: \&quot;name\&quot;, \&quot;referenceId\&quot;, \&quot;group.name\&quot;, \&quot;createdAt\&quot; and \&quot;updatedAt\&quot;.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.CompaniesW9Api;

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

        CompaniesW9Api apiInstance = new CompaniesW9Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String $filter = "$filter_example"; // String | A filter statement to identify specific records to retrieve.  For more information on filtering, see <a href=\"https://developer.avalara.com/avatax/filtering-in-rest/\">Filtering in REST</a>.
        Integer $top = 56; // Integer | If zero or greater than 1000, return at most 1000 results.  Otherwise, return this number of results.  Used with skip to provide pagination for large datasets.
        Integer $skip = 56; // Integer | If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets.
        String $orderBy = "$orderBy_example"; // String | A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example id ASC.
        Boolean count = true; // Boolean | If true, return the global count of elements in the collection.
        Boolean countOnly = true; // Boolean | If true, return ONLY the global count of elements in the collection.  It only applies when count=true.
        String xCorrelationId = "9bc362f8-548a-4a98-b44b-37da159b8126"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            PaginatedQueryResultModelCompanyResponse result = apiInstance.getCompanies(avalaraVersion, $filter, $top, $skip, $orderBy, count, countOnly, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesW9Api#getCompanies");
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

[**PaginatedQueryResultModelCompanyResponse**](PaginatedQueryResultModelCompanyResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of companies |  -  |
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |
| **401** | Authentication failed |  -  |


## getCompany

> CompanyResponse getCompany(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Retrieve a company

Retrieve a company.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.CompaniesW9Api;

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

        CompaniesW9Api apiInstance = new CompaniesW9Api(apiClient);
        String id = "id_example"; // String | Id of the company
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "1c9d767c-523c-42c5-bbcb-5158761b48a0"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            CompanyResponse result = apiInstance.getCompany(id, avalaraVersion, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesW9Api#getCompany");
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
 **id** | **String**| Id of the company |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**CompanyResponse**](CompanyResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Single company |  -  |
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **404** | Company not found |  -  |
| **500** | Server Error |  -  |
| **401** | Authentication failed |  -  |


## updateCompany

> CompanyResponseModel updateCompany(id, avalaraVersion, xCorrelationId, xAvalaraClient, companyCreateUpdateRequestModel)

Update a company

Update a company.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.CompaniesW9Api;

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

        CompaniesW9Api apiInstance = new CompaniesW9Api(apiClient);
        String id = "id_example"; // String | The ID of the company to update
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "03774e95-4208-4f91-a5c8-e218fcb3c0a4"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        CompanyCreateUpdateRequestModel companyCreateUpdateRequestModel = new CompanyCreateUpdateRequestModel(); // CompanyCreateUpdateRequestModel | The updated company data
        try {
            CompanyResponseModel result = apiInstance.updateCompany(id, avalaraVersion, xCorrelationId, xAvalaraClient, companyCreateUpdateRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompaniesW9Api#updateCompany");
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
 **id** | **String**| The ID of the company to update |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]
 **companyCreateUpdateRequestModel** | [**CompanyCreateUpdateRequestModel**](CompanyCreateUpdateRequestModel.md)| The updated company data | [optional]

### Return type

[**CompanyResponseModel**](CompanyResponseModel.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated company |  -  |
| **400** | Bad request (e.g., model validation failed) |  -  |
| **401** | Authentication failed |  -  |
| **404** | Company not found |  -  |

