# Forms1099Api

All URIs are relative to *https://api-ava1099.eta.sbx.us-east-1.aws.avalara.io/avalara1099*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkUpsert1099Forms**](Forms1099Api.md#bulkUpsert1099Forms) | **POST** /1099/forms/$bulk-upsert | Creates or updates multiple 1099 forms.
[**create1099Form**](Forms1099Api.md#create1099Form) | **POST** /1099/forms | Creates a 1099 form.
[**delete1099Form**](Forms1099Api.md#delete1099Form) | **DELETE** /1099/forms/{id} | Deletes a 1099 form.
[**get1099Form**](Forms1099Api.md#get1099Form) | **GET** /1099/forms/{id} | Retrieves a 1099 form.
[**get1099FormPdf**](Forms1099Api.md#get1099FormPdf) | **GET** /1099/forms/{id}/pdf | Retrieves the PDF file for a single 1099 by form id.
[**list1099Forms**](Forms1099Api.md#list1099Forms) | **GET** /1099/forms | Retrieves a list of 1099 forms based on query parameters.
[**update1099Form**](Forms1099Api.md#update1099Form) | **PUT** /1099/forms/{id} | Updates a 1099 form.



## bulkUpsert1099Forms

> Form1099ProccessResult bulkUpsert1099Forms(avalaraVersion, xCorrelationId, dryRun, bulkUpsert1099FormsRequest)

Creates or updates multiple 1099 forms.

This endpoint allows you to create or update multiple 1099 forms.  You can use one of the following payload structures:                **Form 1099-MISC:**  &#x60;&#x60;&#x60;json  {     \&quot;formType\&quot;: \&quot;1099-MISC\&quot;,     \&quot;forms\&quot;: [         {             \&quot;IssuerId\&quot;: \&quot;123456\&quot;,             \&quot;IssuerReferenceId\&quot;: \&quot;REF123\&quot;,             \&quot;IssuerTin\&quot;: \&quot;12-3456789\&quot;,             \&quot;TaxYear\&quot;: 2023,             \&quot;ReferenceId\&quot;: \&quot;FORM123456\&quot;,             \&quot;RecipientName\&quot;: \&quot;John Doe\&quot;,             \&quot;RecipientTin\&quot;: \&quot;987-65-4321\&quot;,             \&quot;TinType\&quot;: 1,             \&quot;RecipientSecondName\&quot;: \&quot;Jane Doe\&quot;,             \&quot;StreetAddress\&quot;: \&quot;123 Main Street\&quot;,             \&quot;StreetAddressLine2\&quot;: \&quot;Apt 4B\&quot;,             \&quot;City\&quot;: \&quot;New York\&quot;,             \&quot;State\&quot;: \&quot;NY\&quot;,             \&quot;Zip\&quot;: \&quot;10001\&quot;,             \&quot;RecipientEmail\&quot;: \&quot;john.doe@email.com\&quot;,             \&quot;AccountNumber\&quot;: \&quot;ACC123456\&quot;,             \&quot;OfficeCode\&quot;: \&quot;NYC01\&quot;,             \&quot;SecondTinNotice\&quot;: false,             \&quot;RecipientNonUsProvince\&quot;: \&quot;\&quot;,             \&quot;CountryCode\&quot;: \&quot;US\&quot;,             \&quot;Rents\&quot;: 12000.00,             \&quot;Royalties\&quot;: 5000.00,             \&quot;OtherIncome\&quot;: 3000.00,             \&quot;FishingBoatProceeds\&quot;: 0.00,             \&quot;MedicalHealthCarePayments\&quot;: 15000.00,             \&quot;SubstitutePayments\&quot;: 1000.00,             \&quot;CropInsuranceProceeds\&quot;: 0.00,             \&quot;GrossProceedsPaidToAttorney\&quot;: 7500.00,             \&quot;FishPurchasedForResale\&quot;: 0.00,             \&quot;FedIncomeTaxWithheld\&quot;: 5000.00,             \&quot;Section409ADeferrals\&quot;: 0.00,             \&quot;ExcessGoldenParachutePayments\&quot;: 0.00,             \&quot;NonqualifiedDeferredCompensation\&quot;: 0.00,             \&quot;PayerMadeDirectSales\&quot;: false,             \&quot;FatcaFilingRequirement\&quot;: false,             \&quot;StateAndLocalWithholding\&quot;: {               \&quot;StateTaxWithheld\&quot;: 2500.00,               \&quot;LocalTaxWithheld\&quot;: 1000.00,               \&quot;State\&quot;: \&quot;NY\&quot;,               \&quot;StateIdNumber\&quot;: \&quot;NY123456\&quot;,               \&quot;Locality\&quot;: \&quot;New York City\&quot;,               \&quot;StateIncome\&quot;: 35000.00,               \&quot;LocalIncome\&quot;: 35000.00             }         }     ]  }  &#x60;&#x60;&#x60;                **Form 1099-NEC:**  &#x60;&#x60;&#x60;json  {    \&quot;formType\&quot;: \&quot;1099-NEC\&quot;,    \&quot;forms\&quot;: [      {        \&quot;issuerID\&quot;: \&quot;180337282\&quot;,        \&quot;issuerReferenceId\&quot;: \&quot;ISS123\&quot;,        \&quot;issuerTin\&quot;: \&quot;12-3000000\&quot;,        \&quot;taxYear\&quot;: 2024,        \&quot;referenceID\&quot;: \&quot;REF-002\&quot;,        \&quot;recipientName\&quot;: \&quot;Jane Smith\&quot;,        \&quot;recipientSecondName\&quot;: \&quot;\&quot;,        \&quot;recipientTin\&quot;: \&quot;987-65-4321\&quot;,        \&quot;tinType\&quot;: 1,        \&quot;streetAddress\&quot;: \&quot;123 Center St\&quot;,        \&quot;streetAddressLine2\&quot;: \&quot;\&quot;,        \&quot;city\&quot;: \&quot;Santa Monica\&quot;,        \&quot;state\&quot;: \&quot;CA\&quot;,        \&quot;zip\&quot;: \&quot;90401\&quot;,        \&quot;countryCode\&quot;: \&quot;US\&quot;,        \&quot;recipientNonUsProvince\&quot;: \&quot;\&quot;,        \&quot;recipientEmail\&quot;: \&quot;\&quot;,        \&quot;accountNumber\&quot;: \&quot;\&quot;,        \&quot;officeCode\&quot;: \&quot;\&quot;,        \&quot;secondTinNotice\&quot;: false,        \&quot;nonemployeeCompensation\&quot;: 123.45,        \&quot;payerMadeDirectSales\&quot;: false,        \&quot;federalIncomeTaxWithheld\&quot;: 12.34,        \&quot;stateAndLocalWithholding\&quot;: {          \&quot;state\&quot;: \&quot;CA\&quot;,          \&quot;stateIdNumber\&quot;: \&quot;123123123\&quot;          \&quot;stateIncome\&quot;: 123.45,          \&quot;stateTaxWithheld\&quot;: 12.34,          \&quot;locality\&quot;: \&quot;Santa Monica\&quot;,          \&quot;localityIdNumber\&quot;: \&quot;456456\&quot;,          \&quot;localTaxWithheld\&quot;: 12.34          \&quot;localIncome\&quot;: 50000.00         },        \&quot;federalEFile\&quot;: true,        \&quot;postalMail\&quot;: true,        \&quot;stateEFile\&quot;: true,        \&quot;tinMatch\&quot;: true,        \&quot;addressVerification\&quot;: true       }     ]   }  &#x60;&#x60;&#x60;  For the full version of the payload and its schema details, refer to the Swagger schemas section.

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "c9148e93-691e-4ffc-8a0f-4854dddf582d"; // String | Unique correlation Id in a GUID format
        Boolean dryRun = false; // Boolean | 
        BulkUpsert1099FormsRequest bulkUpsert1099FormsRequest = new BulkUpsert1099FormsRequest(); // BulkUpsert1099FormsRequest | 
        try {
            Form1099ProccessResult result = apiInstance.bulkUpsert1099Forms(avalaraVersion, xCorrelationId, dryRun, bulkUpsert1099FormsRequest);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |
 **dryRun** | **Boolean**|  | [optional] [default to false]
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

> FormResponseBase create1099Form(avalaraVersion, xCorrelationId, icreateForm1099Request)

Creates a 1099 form.

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "9e4362ae-d2a9-482c-974d-37de6f44c8cd"; // String | Unique correlation Id in a GUID format
        ICreateForm1099Request icreateForm1099Request = new ICreateForm1099Request(); // ICreateForm1099Request | 
        try {
            FormResponseBase result = apiInstance.create1099Form(avalaraVersion, xCorrelationId, icreateForm1099Request);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |
 **icreateForm1099Request** | [**ICreateForm1099Request**](ICreateForm1099Request.md)|  | [optional]

### Return type

[**FormResponseBase**](FormResponseBase.md)

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

> delete1099Form(id, avalaraVersion, xCorrelationId)

Deletes a 1099 form.

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "991cb520-be96-4b4e-8018-8db4a3e3aba6"; // String | Unique correlation Id in a GUID format
        try {
            apiInstance.delete1099Form(id, avalaraVersion, xCorrelationId);
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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Client Error |  -  |
| **500** | Server Error |  -  |
| **401** | Unauthorized |  -  |


## get1099Form

> FormResponseBase get1099Form(id, avalaraVersion, xCorrelationId)

Retrieves a 1099 form.

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "fc04cb19-afae-4f5f-a151-380b99017da7"; // String | Unique correlation Id in a GUID format
        try {
            FormResponseBase result = apiInstance.get1099Form(id, avalaraVersion, xCorrelationId);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |

### Return type

[**FormResponseBase**](FormResponseBase.md)

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

> FormResponseBase get1099FormPdf(id, avalaraVersion, xCorrelationId, markEdelivered)

Retrieves the PDF file for a single 1099 by form id.

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "583908f1-f45d-4c2b-aba5-25ae29dac119"; // String | Unique correlation Id in a GUID format
        Boolean markEdelivered = true; // Boolean | The parameter for marked e-delivered
        try {
            FormResponseBase result = apiInstance.get1099FormPdf(id, avalaraVersion, xCorrelationId, markEdelivered);
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
 **id** | **String**|  |
 **avalaraVersion** | **String**| API version |
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |
 **markEdelivered** | **Boolean**| The parameter for marked e-delivered | [optional]

### Return type

[**FormResponseBase**](FormResponseBase.md)

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


## list1099Forms

> Form1099List list1099Forms(avalaraVersion, xCorrelationId, $filter, $top, $skip, $orderBy)

Retrieves a list of 1099 forms based on query parameters.

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "340c5a6d-6b5e-4866-b71a-5657fa099fe2"; // String | Unique correlation Id in a GUID format
        String $filter = "$filter_example"; // String | A filter statement to identify specific records to retrieve. For more information on filtering, see <a href=\"https://developer.avalara.com/avatax/filtering-in-rest/\">Filtering in REST</a>.    Collections support filtering only on certain fields. An attempt to filter on an unsupported field will receive a 400 Bad Request response.    Supported filtering fields are as follows:        issuerId      issuerReferenceId      taxYear      addressVerificationStatus - possible values are: unknown, pending, failed, incomplete, unchanged, verified      createdAt      edeliveryStatus - possible values are: sent, unscheduled, bad_verify, bad_verify_limit, scheduled, bounced, accepted      email      federalEfileStatus - possible values are: unscheduled, scheduled, sent, corrected_scheduled, accepted, corrected, corrected_accepted, held      firstPayeeName      mailStatus - possible values are: sent, unscheduled, pending, delivered      referenceId      tinMatchStatus - possible values are: none, pending, matched, failed      type - possible values are: 940, 941, 943, 944, 945, 1042, 1042-S, 1095-B, 1095-C, 1097-BTC, 1098, 1098-C, 1098-E, 1098-Q, 1098-T, 3921, 3922, 5498, 5498-ESA, 5498-SA, 1099-MISC, 1099-A, 1099-B, 1099-C, 1099-CAP, 1099-DIV, 1099-G, 1099-INT, 1099-K, 1099-LS, 1099-LTC, 1099-NEC, 1099-OID, 1099-PATR, 1099-Q, 1099-R, 1099-S, 1099-SA, T4A, W-2, W-2G, 1099-HC      updatedAt      validity - possible values are: true, false
        Integer $top = 10; // Integer | If nonzero, return no more than this number of results.     Used with skip to provide pagination for large datasets.     Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records.
        Integer $skip = 0; // Integer | If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets.
        String $orderBy = "$orderBy_example"; // String | A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example issuerReferenceId ASC.    Supported sorting fields are:         issuerReferenceId       taxYear       createdAt       firstPayeeName      updatedAt
        try {
            Form1099List result = apiInstance.list1099Forms(avalaraVersion, xCorrelationId, $filter, $top, $skip, $orderBy);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |
 **$filter** | **String**| A filter statement to identify specific records to retrieve. For more information on filtering, see &lt;a href&#x3D;\&quot;https://developer.avalara.com/avatax/filtering-in-rest/\&quot;&gt;Filtering in REST&lt;/a&gt;.    Collections support filtering only on certain fields. An attempt to filter on an unsupported field will receive a 400 Bad Request response.    Supported filtering fields are as follows:        issuerId      issuerReferenceId      taxYear      addressVerificationStatus - possible values are: unknown, pending, failed, incomplete, unchanged, verified      createdAt      edeliveryStatus - possible values are: sent, unscheduled, bad_verify, bad_verify_limit, scheduled, bounced, accepted      email      federalEfileStatus - possible values are: unscheduled, scheduled, sent, corrected_scheduled, accepted, corrected, corrected_accepted, held      firstPayeeName      mailStatus - possible values are: sent, unscheduled, pending, delivered      referenceId      tinMatchStatus - possible values are: none, pending, matched, failed      type - possible values are: 940, 941, 943, 944, 945, 1042, 1042-S, 1095-B, 1095-C, 1097-BTC, 1098, 1098-C, 1098-E, 1098-Q, 1098-T, 3921, 3922, 5498, 5498-ESA, 5498-SA, 1099-MISC, 1099-A, 1099-B, 1099-C, 1099-CAP, 1099-DIV, 1099-G, 1099-INT, 1099-K, 1099-LS, 1099-LTC, 1099-NEC, 1099-OID, 1099-PATR, 1099-Q, 1099-R, 1099-S, 1099-SA, T4A, W-2, W-2G, 1099-HC      updatedAt      validity - possible values are: true, false | [optional]
 **$top** | **Integer**| If nonzero, return no more than this number of results.     Used with skip to provide pagination for large datasets.     Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. | [optional] [default to 10]
 **$skip** | **Integer**| If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets. | [optional] [default to 0]
 **$orderBy** | **String**| A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example issuerReferenceId ASC.    Supported sorting fields are:         issuerReferenceId       taxYear       createdAt       firstPayeeName      updatedAt | [optional]

### Return type

[**Form1099List**](Form1099List.md)

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

> FormResponseBase update1099Form(id, avalaraVersion, xCorrelationId, iupdateForm1099Request)

Updates a 1099 form.

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
        String avalaraVersion = "2.0"; // String | API version
        String xCorrelationId = "d51d57ca-2ad4-45b1-8823-8d45e1cc0af7"; // String | Unique correlation Id in a GUID format
        IUpdateForm1099Request iupdateForm1099Request = new IUpdateForm1099Request(); // IUpdateForm1099Request | 
        try {
            FormResponseBase result = apiInstance.update1099Form(id, avalaraVersion, xCorrelationId, iupdateForm1099Request);
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
 **xCorrelationId** | **String**| Unique correlation Id in a GUID format |
 **iupdateForm1099Request** | [**IUpdateForm1099Request**](IUpdateForm1099Request.md)|  | [optional]

### Return type

[**FormResponseBase**](FormResponseBase.md)

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

