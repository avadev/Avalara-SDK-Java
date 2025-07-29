# Forms1099Api

All URIs are relative to *https://api-ava1099.eta.sbx.us-east-1.aws.avalara.io/avalara1099*

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

> Form1099ProccessResult bulkUpsert1099Forms(avalaraVersion, dryRun, xCorrelationId, xAvalaraClient, bulkUpsert1099FormsRequest)

Create or update multiple 1099/1095/W2/1042S forms

This endpoint allows you to create or update multiple 1099/1095/W2/1042S forms.  You can use one of the following payload structures:                **Form 1099-MISC:**  &#x60;&#x60;&#x60;json  {     \&quot;formType\&quot;: \&quot;1099-MISC\&quot;,     \&quot;forms\&quot;: [         {             \&quot;IssuerId\&quot;: \&quot;123456\&quot;,             \&quot;IssuerReferenceId\&quot;: \&quot;REF123\&quot;,             \&quot;IssuerTin\&quot;: \&quot;12-3456789\&quot;,             \&quot;TaxYear\&quot;: 2023,             \&quot;ReferenceId\&quot;: \&quot;FORM123456\&quot;,             \&quot;RecipientName\&quot;: \&quot;John Doe\&quot;,             \&quot;RecipientTin\&quot;: \&quot;587-65-4321\&quot;,             \&quot;TinType\&quot;: \&quot;SSN\&quot;,             \&quot;RecipientSecondName\&quot;: \&quot;Jane Doe\&quot;,             \&quot;Address\&quot;: \&quot;123 Main Street\&quot;,             \&quot;Address2\&quot;: \&quot;Apt 4B\&quot;,             \&quot;City\&quot;: \&quot;New York\&quot;,             \&quot;State\&quot;: \&quot;NY\&quot;,             \&quot;Zip\&quot;: \&quot;10001\&quot;,             \&quot;RecipientEmail\&quot;: \&quot;john.doe@email.com\&quot;,             \&quot;AccountNumber\&quot;: \&quot;ACC123456\&quot;,             \&quot;OfficeCode\&quot;: \&quot;NYC01\&quot;,             \&quot;SecondTinNotice\&quot;: false,             \&quot;RecipientNonUsProvince\&quot;: \&quot;\&quot;,             \&quot;CountryCode\&quot;: \&quot;US\&quot;,             \&quot;Rents\&quot;: 12000.00,             \&quot;Royalties\&quot;: 5000.00,             \&quot;OtherIncome\&quot;: 3000.00,             \&quot;FishingBoatProceeds\&quot;: 0.00,             \&quot;MedicalHealthCarePayments\&quot;: 15000.00,             \&quot;SubstitutePayments\&quot;: 1000.00,             \&quot;CropInsuranceProceeds\&quot;: 0.00,             \&quot;GrossProceedsPaidToAttorney\&quot;: 7500.00,             \&quot;FishPurchasedForResale\&quot;: 0.00,             \&quot;FedIncomeTaxWithheld\&quot;: 5000.00,             \&quot;Section409ADeferrals\&quot;: 0.00,             \&quot;ExcessGoldenParachutePayments\&quot;: 0.00,             \&quot;NonqualifiedDeferredCompensation\&quot;: 0.00,             \&quot;DirectSalesIndicator\&quot;: false,             \&quot;FatcaFilingRequirement\&quot;: false,             \&quot;StateAndLocalWithholding\&quot;: {               \&quot;StateTaxWithheld\&quot;: 2500.00,               \&quot;LocalTaxWithheld\&quot;: 1000.00,               \&quot;State\&quot;: \&quot;NY\&quot;,               \&quot;StateIdNumber\&quot;: \&quot;NY123456\&quot;,               \&quot;Locality\&quot;: \&quot;New York City\&quot;,               \&quot;StateIncome\&quot;: 35000.00,               \&quot;LocalIncome\&quot;: 35000.00             }         }     ]  }  &#x60;&#x60;&#x60;                **Form 1099-NEC:**  &#x60;&#x60;&#x60;json  {    \&quot;formType\&quot;: \&quot;1099-NEC\&quot;,    \&quot;forms\&quot;: [      {        \&quot;issuerID\&quot;: \&quot;180337282\&quot;,        \&quot;issuerReferenceId\&quot;: \&quot;ISS123\&quot;,        \&quot;issuerTin\&quot;: \&quot;12-3000000\&quot;,        \&quot;taxYear\&quot;: 2024,        \&quot;referenceID\&quot;: \&quot;REF-002\&quot;,        \&quot;recipientName\&quot;: \&quot;Jane Smith\&quot;,        \&quot;recipientSecondName\&quot;: \&quot;\&quot;,        \&quot;recipientTin\&quot;: \&quot;587-65-4321\&quot;,        \&quot;tinType\&quot;: \&quot;SSN\&quot;,        \&quot;address\&quot;: \&quot;123 Center St\&quot;,        \&quot;address2\&quot;: \&quot;\&quot;,        \&quot;city\&quot;: \&quot;Santa Monica\&quot;,        \&quot;state\&quot;: \&quot;CA\&quot;,        \&quot;zip\&quot;: \&quot;90401\&quot;,        \&quot;countryCode\&quot;: \&quot;US\&quot;,        \&quot;recipientNonUsProvince\&quot;: \&quot;\&quot;,        \&quot;recipientEmail\&quot;: \&quot;\&quot;,        \&quot;accountNumber\&quot;: \&quot;\&quot;,        \&quot;officeCode\&quot;: \&quot;\&quot;,        \&quot;secondTinNotice\&quot;: false,        \&quot;nonemployeeCompensation\&quot;: 123.45,        \&quot;directSalesIndicator\&quot;: false,        \&quot;federalIncomeTaxWithheld\&quot;: 12.34,        \&quot;stateAndLocalWithholding\&quot;: {          \&quot;state\&quot;: \&quot;CA\&quot;,          \&quot;stateIdNumber\&quot;: \&quot;123123123\&quot;,          \&quot;stateIncome\&quot;: 123.45,          \&quot;stateTaxWithheld\&quot;: 12.34,          \&quot;locality\&quot;: \&quot;Santa Monica\&quot;,          \&quot;localityIdNumber\&quot;: \&quot;456456\&quot;,          \&quot;localTaxWithheld\&quot;: 12.34,          \&quot;localIncome\&quot;: 50000.00         },        \&quot;federalEFile\&quot;: true,        \&quot;postalMail\&quot;: true,        \&quot;stateEFile\&quot;: true,        \&quot;tinMatch\&quot;: true,        \&quot;addressVerification\&quot;: true       }     ]   }  &#x60;&#x60;&#x60;  For the full version of the payload and its schema details, refer to the Swagger schemas section.

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
        Boolean dryRun = false; // Boolean | 
        String xCorrelationId = "aff127a5-aceb-4e74-b5cd-37032b3ab781"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        BulkUpsert1099FormsRequest bulkUpsert1099FormsRequest = new BulkUpsert1099FormsRequest(); // BulkUpsert1099FormsRequest | 
        try {
            Form1099ProccessResult result = apiInstance.bulkUpsert1099Forms(avalaraVersion, dryRun, xCorrelationId, xAvalaraClient, bulkUpsert1099FormsRequest);
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
 **dryRun** | **Boolean**|  | [optional] [default to false]
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]
 **bulkUpsert1099FormsRequest** | [**BulkUpsert1099FormsRequest**](BulkUpsert1099FormsRequest.md)|  | [optional]

### Return type

[**Form1099ProccessResult**](Form1099ProccessResult.md)

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

> Create1099Form201Response create1099Form(avalaraVersion, xCorrelationId, xAvalaraClient, icreateForm1099Request)

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
        String xCorrelationId = "d8f30c6b-f514-421c-b165-e5d15688b6d7"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        ICreateForm1099Request icreateForm1099Request = new ICreateForm1099Request(); // ICreateForm1099Request | 
        try {
            Create1099Form201Response result = apiInstance.create1099Form(avalaraVersion, xCorrelationId, xAvalaraClient, icreateForm1099Request);
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
 **icreateForm1099Request** | [**ICreateForm1099Request**](ICreateForm1099Request.md)|  | [optional]

### Return type

[**Create1099Form201Response**](Create1099Form201Response.md)

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
        String xCorrelationId = "50e92233-3f45-4225-8362-f0dc0e52a3eb"; // String | Unique correlation Id in a GUID format
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
        String xCorrelationId = "67d0f161-df72-4818-a624-38b8c87e6c45"; // String | Unique correlation Id in a GUID format
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
        String xCorrelationId = "980d0161-907a-4d7d-a7a7-889aa091a9fa"; // String | Unique correlation Id in a GUID format
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

> Form1099ListResponse list1099Forms(avalaraVersion, $filter, $top, $skip, $orderBy, xCorrelationId, xAvalaraClient)

List 1099/1095/W2/1042S forms

List 1099/1095/W2/1042S forms. Filterable fields are name, referenceId and taxYear.

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
        String $filter = "$filter_example"; // String | A filter statement to identify specific records to retrieve. For more information on filtering, see <a href=\"https://developer.avalara.com/avatax/filtering-in-rest/\">Filtering in REST</a>.    Collections support filtering only on certain fields. An attempt to filter on an unsupported field will receive a 400 Bad Request response.    Supported filtering fields are as follows:        issuerId      issuerReferenceId      taxYear      addressVerificationStatus - possible values are: unknown, pending, failed, incomplete, unchanged, verified      createdAt      edeliveryStatus - possible values are: sent, unscheduled, bad_verify, bad_verify_limit, scheduled, bounced, accepted      email      federalEfileStatus - possible values are: unscheduled, scheduled, sent, corrected_scheduled, accepted, corrected, corrected_accepted, held      recipientName      mailStatus - possible values are: sent, unscheduled, pending, delivered      referenceId      tinMatchStatus - possible values are: none, pending, matched, failed      type - possible values are: 940, 941, 943, 944, 945, 1042, 1042-S, 1095-B, 1095-C, 1097-BTC, 1098, 1098-C, 1098-E, 1098-Q, 1098-T, 3921, 3922, 5498, 5498-ESA, 5498-SA, 1099-MISC, 1099-A, 1099-B, 1099-C, 1099-CAP, 1099-DIV, 1099-G, 1099-INT, 1099-K, 1099-LS, 1099-LTC, 1099-NEC, 1099-OID, 1099-PATR, 1099-Q, 1099-R, 1099-S, 1099-SA, T4A, W-2, W-2G, 1099-HC      updatedAt      validity - possible values are: true, false
        Integer $top = 10; // Integer | If nonzero, return no more than this number of results.     Used with skip to provide pagination for large datasets.     Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records.
        Integer $skip = 0; // Integer | If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets.
        String $orderBy = "$orderBy_example"; // String | A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example issuerReferenceId ASC.    Supported sorting fields are:         issuerReferenceId       taxYear       createdAt       recipientName      updatedAt
        String xCorrelationId = "c381cb3d-7c38-4989-a2ff-25784e48a235"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        try {
            Form1099ListResponse result = apiInstance.list1099Forms(avalaraVersion, $filter, $top, $skip, $orderBy, xCorrelationId, xAvalaraClient);
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
 **$filter** | **String**| A filter statement to identify specific records to retrieve. For more information on filtering, see &lt;a href&#x3D;\&quot;https://developer.avalara.com/avatax/filtering-in-rest/\&quot;&gt;Filtering in REST&lt;/a&gt;.    Collections support filtering only on certain fields. An attempt to filter on an unsupported field will receive a 400 Bad Request response.    Supported filtering fields are as follows:        issuerId      issuerReferenceId      taxYear      addressVerificationStatus - possible values are: unknown, pending, failed, incomplete, unchanged, verified      createdAt      edeliveryStatus - possible values are: sent, unscheduled, bad_verify, bad_verify_limit, scheduled, bounced, accepted      email      federalEfileStatus - possible values are: unscheduled, scheduled, sent, corrected_scheduled, accepted, corrected, corrected_accepted, held      recipientName      mailStatus - possible values are: sent, unscheduled, pending, delivered      referenceId      tinMatchStatus - possible values are: none, pending, matched, failed      type - possible values are: 940, 941, 943, 944, 945, 1042, 1042-S, 1095-B, 1095-C, 1097-BTC, 1098, 1098-C, 1098-E, 1098-Q, 1098-T, 3921, 3922, 5498, 5498-ESA, 5498-SA, 1099-MISC, 1099-A, 1099-B, 1099-C, 1099-CAP, 1099-DIV, 1099-G, 1099-INT, 1099-K, 1099-LS, 1099-LTC, 1099-NEC, 1099-OID, 1099-PATR, 1099-Q, 1099-R, 1099-S, 1099-SA, T4A, W-2, W-2G, 1099-HC      updatedAt      validity - possible values are: true, false | [optional]
 **$top** | **Integer**| If nonzero, return no more than this number of results.     Used with skip to provide pagination for large datasets.     Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. | [optional] [default to 10]
 **$skip** | **Integer**| If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets. | [optional] [default to 0]
 **$orderBy** | **String**| A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example issuerReferenceId ASC.    Supported sorting fields are:         issuerReferenceId       taxYear       createdAt       recipientName      updatedAt | [optional]
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format | [optional]
 **xAvalaraClient** | **String**| Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . | [optional]

### Return type

[**Form1099ListResponse**](Form1099ListResponse.md)

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

> Update1099Form200Response update1099Form(id, avalaraVersion, xCorrelationId, xAvalaraClient, iupdateForm1099Request)

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
        String xCorrelationId = "d4ff9598-63cc-4d6a-9af2-e25f4256f979"; // String | Unique correlation Id in a GUID format
        String xAvalaraClient = "Swagger UI; 22.1.0"; // String | Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
        IUpdateForm1099Request iupdateForm1099Request = new IUpdateForm1099Request(); // IUpdateForm1099Request | 
        try {
            Update1099Form200Response result = apiInstance.update1099Form(id, avalaraVersion, xCorrelationId, xAvalaraClient, iupdateForm1099Request);
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
 **iupdateForm1099Request** | [**IUpdateForm1099Request**](IUpdateForm1099Request.md)|  | [optional]

### Return type

[**Update1099Form200Response**](Update1099Form200Response.md)

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

