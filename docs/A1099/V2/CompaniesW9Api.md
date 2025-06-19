# CompaniesW9Api

All URIs are relative to *https://api-ava1099.eta.sbx.us-east-1.aws.avalara.io/avalara1099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompany**](CompaniesW9Api.md#createCompany) | **POST** /w9/companies | Creates a new company
[**deleteCompany**](CompaniesW9Api.md#deleteCompany) | **DELETE** /w9/companies/{id} | Deletes a company
[**getCompanies**](CompaniesW9Api.md#getCompanies) | **GET** /w9/companies | List companies
[**getCompany**](CompaniesW9Api.md#getCompany) | **GET** /w9/companies/{id} | Retrieve a company
[**updateCompany**](CompaniesW9Api.md#updateCompany) | **PUT** /w9/companies/{id} | Update a company



## createCompany

> CompanyResponseModel createCompany(avalaraVersion, xCorrelationId, companyCreateUpdateRequestModel)

Creates a new company

Creates a new company

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "17aedf55-161e-4906-8dab-d2d31d76ff5f"; // String | Unique correlation Id in a GUID format
        CompanyCreateUpdateRequestModel companyCreateUpdateRequestModel = new CompanyCreateUpdateRequestModel(); // CompanyCreateUpdateRequestModel | The company to create
        try {
            CompanyResponseModel result = apiInstance.createCompany(avalaraVersion, xCorrelationId, companyCreateUpdateRequestModel);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |
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

> deleteCompany(id, avalaraVersion, xCorrelationId)

Deletes a company

Deletes a company

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "485cbb8a-410b-4452-ba05-2e13f062534c"; // String | Unique correlation Id in a GUID format
        try {
            apiInstance.deleteCompany(id, avalaraVersion, xCorrelationId);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |

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

> PaginatedQueryResultModelCompanyResponse getCompanies(avalaraVersion, xCorrelationId, $filter, $top, $skip, $orderBy, count, countOnly)

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "6568feaa-ad1a-4ba5-a374-f57501013a66"; // String | Unique correlation Id in a GUID format
        String $filter = "$filter_example"; // String | A filter statement to identify specific records to retrieve.  For more information on filtering, see <a href=\"https://developer.avalara.com/avatax/filtering-in-rest/\">Filtering in REST</a>.
        Integer $top = 56; // Integer | If zero or greater than 1000, return at most 1000 results.  Otherwise, return this number of results.  Used with skip to provide pagination for large datasets.
        Integer $skip = 56; // Integer | If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets.
        String $orderBy = "$orderBy_example"; // String | A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example id ASC.
        Boolean count = true; // Boolean | If true, return the global count of elements in the collection.
        Boolean countOnly = true; // Boolean | If true, return ONLY the global count of elements in the collection.  It only applies when count=true.
        try {
            PaginatedQueryResultModelCompanyResponse result = apiInstance.getCompanies(avalaraVersion, xCorrelationId, $filter, $top, $skip, $orderBy, count, countOnly);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |
 **$filter** | **String**| A filter statement to identify specific records to retrieve.  For more information on filtering, see &lt;a href&#x3D;\&quot;https://developer.avalara.com/avatax/filtering-in-rest/\&quot;&gt;Filtering in REST&lt;/a&gt;. | [optional]
 **$top** | **Integer**| If zero or greater than 1000, return at most 1000 results.  Otherwise, return this number of results.  Used with skip to provide pagination for large datasets. | [optional]
 **$skip** | **Integer**| If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets. | [optional]
 **$orderBy** | **String**| A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example id ASC. | [optional]
 **count** | **Boolean**| If true, return the global count of elements in the collection. | [optional]
 **countOnly** | **Boolean**| If true, return ONLY the global count of elements in the collection.  It only applies when count&#x3D;true. | [optional]

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

> CompanyResponse getCompany(id, avalaraVersion, xCorrelationId)

Retrieve a company

Retrieve an existing company

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "6a958572-faea-499c-b09b-d8743c190ef0"; // String | Unique correlation Id in a GUID format
        try {
            CompanyResponse result = apiInstance.getCompany(id, avalaraVersion, xCorrelationId);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |

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

> CompanyResponseModel updateCompany(id, avalaraVersion, xCorrelationId, companyCreateUpdateRequestModel)

Update a company

Update a company

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "8e0a7807-d0bb-419e-8272-ee585d7b5476"; // String | Unique correlation Id in a GUID format
        CompanyCreateUpdateRequestModel companyCreateUpdateRequestModel = new CompanyCreateUpdateRequestModel(); // CompanyCreateUpdateRequestModel | The updated company data
        try {
            CompanyResponseModel result = apiInstance.updateCompany(id, avalaraVersion, xCorrelationId, companyCreateUpdateRequestModel);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |
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

