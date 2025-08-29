# FormsW9Api

All URIs are relative to *https://api.sbx.avalara.com/avalara1099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAndSendW9FormEmail**](FormsW9Api.md#createAndSendW9FormEmail) | **POST** /w9/forms/$create-and-send-email | Create a minimal W9/W4/W8 form and sends the e-mail request
[**createW9Form**](FormsW9Api.md#createW9Form) | **POST** /w9/forms | Create a W9/W4/W8 form
[**deleteW9Form**](FormsW9Api.md#deleteW9Form) | **DELETE** /w9/forms/{id} | Delete a W9/W4/W8 form
[**getW9Form**](FormsW9Api.md#getW9Form) | **GET** /w9/forms/{id} | Retrieve a W9/W4/W8 form
[**listW9Forms**](FormsW9Api.md#listW9Forms) | **GET** /w9/forms | List W9/W4/W8 forms
[**sendW9FormEmail**](FormsW9Api.md#sendW9FormEmail) | **POST** /w9/forms/{id}/$send-email | Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form
[**updateW9Form**](FormsW9Api.md#updateW9Form) | **PUT** /w9/forms/{id} | Update a W9/W4/W8 form
[**uploadW9Files**](FormsW9Api.md#uploadW9Files) | **POST** /w9/forms/{id}/attachment | Replace the PDF file for a W9/W4/W8 form



## createAndSendW9FormEmail

> CreateW9Form201Response createAndSendW9FormEmail(avalaraVersion, xCorrelationId, xAvalaraClient, createAndSendW9FormEmailRequest)

Create a minimal W9/W4/W8 form and sends the e-mail request

Create a minimal W9/W4/W8 form and sends the e-mail request.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.FormsW9Api;

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

        FormsW9Api apiInstance = new FormsW9Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "daaba72b-ef09-4c15-9a83-344ad63c1533"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        CreateAndSendW9FormEmailRequest createAndSendW9FormEmailRequest = new CreateAndSendW9FormEmailRequest(); // CreateAndSendW9FormEmailRequest | Form to be created
        try {
            CreateW9Form201Response result = apiInstance.createAndSendW9FormEmail(avalaraVersion, xCorrelationId, xAvalaraClient, createAndSendW9FormEmailRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsW9Api#createAndSendW9FormEmail");
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
 **createAndSendW9FormEmailRequest** | [**CreateAndSendW9FormEmailRequest**](CreateAndSendW9FormEmailRequest.md)| Form to be created | [optional]

### Return type

[**CreateW9Form201Response**](CreateW9Form201Response.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created W9/W4/W8 form |  -  |
| **400** | Bad request (e.g. Unknown form type: W10\&quot;) |  -  |
| **401** | Authentication failed |  -  |


## createW9Form

> CreateW9Form201Response createW9Form(avalaraVersion, xCorrelationId, xAvalaraClient, createW9FormRequest)

Create a W9/W4/W8 form

Create a W9/W4/W8 form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.FormsW9Api;

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

        FormsW9Api apiInstance = new FormsW9Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "9ec7cabd-da9b-4ec2-b94f-9d344e3c9e50"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        CreateW9FormRequest createW9FormRequest = new CreateW9FormRequest(); // CreateW9FormRequest | Form to be created
        try {
            CreateW9Form201Response result = apiInstance.createW9Form(avalaraVersion, xCorrelationId, xAvalaraClient, createW9FormRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsW9Api#createW9Form");
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
 **createW9FormRequest** | [**CreateW9FormRequest**](CreateW9FormRequest.md)| Form to be created | [optional]

### Return type

[**CreateW9Form201Response**](CreateW9Form201Response.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created W9/W4/W8 form |  -  |
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **401** | Authentication failed |  -  |


## deleteW9Form

> deleteW9Form(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Delete a W9/W4/W8 form

Delete a W9/W4/W8 form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.FormsW9Api;

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

        FormsW9Api apiInstance = new FormsW9Api(apiClient);
        String id = "id_example"; // String | ID of the form to delete
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "a78693a0-ae1c-4c54-9220-72380bead3a7"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            apiInstance.deleteW9Form(id, avalaraVersion, xCorrelationId, xAvalaraClient);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsW9Api#deleteW9Form");
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
 **id** | **String**| ID of the form to delete |
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


## getW9Form

> CreateW9Form201Response getW9Form(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Retrieve a W9/W4/W8 form

Retrieve a W9/W4/W8 form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.FormsW9Api;

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

        FormsW9Api apiInstance = new FormsW9Api(apiClient);
        String id = "id_example"; // String | ID of the form
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "13cc90eb-cbcd-4425-baf5-8ae7cbe57113"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            CreateW9Form201Response result = apiInstance.getW9Form(id, avalaraVersion, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsW9Api#getW9Form");
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
 **id** | **String**| ID of the form |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**CreateW9Form201Response**](CreateW9Form201Response.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | W9/W4/W8 form with id |  -  |
| **401** | Authentication failed |  -  |
| **404** | W9/W4/W8 form not found |  -  |


## listW9Forms

> PaginatedQueryResultModelW9FormBaseResponse listW9Forms(avalaraVersion, $filter, $top, $skip, $orderBy, count, countOnly, xCorrelationId, xAvalaraClient)

List W9/W4/W8 forms

List W9/W4/W8 forms. Filterable/Sortable fields are: \&quot;companyId\&quot;, \&quot;type\&quot;, \&quot;displayName\&quot;, \&quot;entryStatus\&quot;, \&quot;email\&quot;, \&quot;archived\&quot; and \&quot;referenceId\&quot;.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.FormsW9Api;

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

        FormsW9Api apiInstance = new FormsW9Api(apiClient);
        String avalaraVersion = "2.0.0"; // String | API version
        String $filter = "$filter_example"; // String | A filter statement to identify specific records to retrieve.  For more information on filtering, see <a href=\"https://developer.avalara.com/avatax/filtering-in-rest/\">Filtering in REST</a>.
        Integer $top = 56; // Integer | If zero or greater than 1000, return at most 1000 results.  Otherwise, return this number of results.  Used with skip to provide pagination for large datasets.
        Integer $skip = 56; // Integer | If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets.
        String $orderBy = "$orderBy_example"; // String | A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example id ASC.
        Boolean count = true; // Boolean | If true, return the global count of elements in the collection.
        Boolean countOnly = true; // Boolean | If true, return ONLY the global count of elements in the collection.  It only applies when count=true.
        String xCorrelationId = "c3ac4fe7-8e06-49b7-8bdd-36c22d18d734"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            PaginatedQueryResultModelW9FormBaseResponse result = apiInstance.listW9Forms(avalaraVersion, $filter, $top, $skip, $orderBy, count, countOnly, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsW9Api#listW9Forms");
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

[**PaginatedQueryResultModelW9FormBaseResponse**](PaginatedQueryResultModelW9FormBaseResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **401** | Authentication failed |  -  |
| **200** | list |  -  |


## sendW9FormEmail

> CreateW9Form201Response sendW9FormEmail(id, avalaraVersion, xCorrelationId, xAvalaraClient)

Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form

Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form.   If the form is not in &#39;Requested&#39; status, it will either use an existing descendant form   in &#39;Requested&#39; status or create a new minimal form and send the email request.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.FormsW9Api;

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

        FormsW9Api apiInstance = new FormsW9Api(apiClient);
        String id = "id_example"; // String | The ID of the W9/W4/W8 form.
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "be1b2054-2262-4833-92e6-875a3533d944"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            CreateW9Form201Response result = apiInstance.sendW9FormEmail(id, avalaraVersion, xCorrelationId, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsW9Api#sendW9FormEmail");
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
 **id** | **String**| The ID of the W9/W4/W8 form. |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**CreateW9Form201Response**](CreateW9Form201Response.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Email sent using existing form (form was already in &#39;Requested&#39; status or descendant found) |  -  |
| **201** | Email sent using newly created minimal form |  -  |
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **401** | Authentication failed |  -  |


## updateW9Form

> IW9FormDataModelsOneOf updateW9Form(id, avalaraVersion, xCorrelationId, xAvalaraClient, iw9FormDataModelsOneOf)

Update a W9/W4/W8 form

Update a W9/W4/W8 form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.FormsW9Api;

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

        FormsW9Api apiInstance = new FormsW9Api(apiClient);
        String id = "id_example"; // String | ID of the form to update
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "b301d45c-08df-404f-954c-e7edeb163532"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        IW9FormDataModelsOneOf iw9FormDataModelsOneOf = new IW9FormDataModelsOneOf(); // IW9FormDataModelsOneOf | Form to be updated
        try {
            IW9FormDataModelsOneOf result = apiInstance.updateW9Form(id, avalaraVersion, xCorrelationId, xAvalaraClient, iw9FormDataModelsOneOf);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsW9Api#updateW9Form");
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
 **id** | **String**| ID of the form to update |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]
 **iw9FormDataModelsOneOf** | [**IW9FormDataModelsOneOf**](IW9FormDataModelsOneOf.md)| Form to be updated | [optional]

### Return type

[**IW9FormDataModelsOneOf**](IW9FormDataModelsOneOf.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated W9/W4/W8 form |  -  |
| **400** | Bad request (e.g., invalid sort key) |  -  |
| **401** | Authentication failed |  -  |
| **404** | W9/W4/W8 form not found |  -  |


## uploadW9Files

> uploadW9Files(id, avalaraVersion, xCorrelationId, xAvalaraClient, _file)

Replace the PDF file for a W9/W4/W8 form

Replaces the PDF file for a W9/W4/W8 form.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.A1099.V2.FormsW9Api;

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

        FormsW9Api apiInstance = new FormsW9Api(apiClient);
        String id = "id_example"; // String | Id of the form
        String avalaraVersion = "2.0.0"; // String | API version
        String xCorrelationId = "a945240a-b94f-476a-a436-863e27320f9d"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        File _file = new File("/path/to/file"); // File | 
        try {
            apiInstance.uploadW9Files(id, avalaraVersion, xCorrelationId, xAvalaraClient, _file);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsW9Api#uploadW9Files");
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
 **id** | **String**| Id of the form |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]
 **_file** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad request (e.g., Only .pdf files are allowed.) |  -  |
| **401** | Authentication failed |  -  |
| **404** | Not Found |  -  |

