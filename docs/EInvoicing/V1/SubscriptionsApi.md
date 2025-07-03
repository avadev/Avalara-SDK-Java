# SubscriptionsApi

All URIs are relative to *https://api.sbx.avalara.com/einvoicing*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhookSubscription**](SubscriptionsApi.md#createWebhookSubscription) | **POST** /webhooks/subscriptions | Create a subscription to events
[**deleteWebhookSubscription**](SubscriptionsApi.md#deleteWebhookSubscription) | **DELETE** /webhooks/subscriptions/{subscription-id} | Unsubscribe from events
[**getWebhookSubscription**](SubscriptionsApi.md#getWebhookSubscription) | **GET** /webhooks/subscriptions/{subscription-id} | Get details of a subscription
[**listWebhookSubscriptions**](SubscriptionsApi.md#listWebhookSubscriptions) | **GET** /webhooks/subscriptions | List all subscriptions



## createWebhookSubscription

> SuccessResponse createWebhookSubscription(avalaraVersion, subscriptionRegistration, xCorrelationID, xAvalaraClient)

Create a subscription to events

Create a subscription to events exposed by registered systems.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(apiClient);
        String avalaraVersion = "avalaraVersion_example"; // String | The version of the API to use, e.g., \"1.3\".
        SubscriptionRegistration subscriptionRegistration = new SubscriptionRegistration(); // SubscriptionRegistration | 
        String xCorrelationID = "xCorrelationID_example"; // String | A unique identifier for tracking the request and its response
        String xAvalaraClient = "xAvalaraClient_example"; // String | Client application identification
        try {
            SuccessResponse result = apiInstance.createWebhookSubscription(avalaraVersion, subscriptionRegistration, xCorrelationID, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#createWebhookSubscription");
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
 **avalaraVersion** | **String**| The version of the API to use, e.g., \&quot;1.3\&quot;. |
 **subscriptionRegistration** | [**SubscriptionRegistration**](SubscriptionRegistration.md)|  |
 **xCorrelationID** | **String**| A unique identifier for tracking the request and its response | [optional]
 **xAvalaraClient** | **String**| Client application identification | [optional]

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Subscribed successfully |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **400** | Invalid input |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **401** | Not authenticated |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **403** | Access token does not have the required scope |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |


## deleteWebhookSubscription

> deleteWebhookSubscription(subscriptionId, avalaraVersion, xCorrelationID, xAvalaraClient)

Unsubscribe from events

Remove a subscription from the webhooks dispatch service. All events and subscriptions are also deleted.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(apiClient);
        String subscriptionId = "subscriptionId_example"; // String | 
        String avalaraVersion = "avalaraVersion_example"; // String | The version of the API to use, e.g., \"1.3\".
        String xCorrelationID = "xCorrelationID_example"; // String | A unique identifier for tracking the request and its response
        String xAvalaraClient = "xAvalaraClient_example"; // String | Client application identification
        try {
            apiInstance.deleteWebhookSubscription(subscriptionId, avalaraVersion, xCorrelationID, xAvalaraClient);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#deleteWebhookSubscription");
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
 **subscriptionId** | **String**|  |
 **avalaraVersion** | **String**| The version of the API to use, e.g., \&quot;1.3\&quot;. |
 **xCorrelationID** | **String**| A unique identifier for tracking the request and its response | [optional]
 **xAvalaraClient** | **String**| Client application identification | [optional]

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
| **204** | Unsubscribed successfully |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **401** | Not authenticated |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **403** | Access token does not have the required scope |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **404** | Subscription not found |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |


## getWebhookSubscription

> SubscriptionDetail getWebhookSubscription(subscriptionId, avalaraVersion, xCorrelationID, xAvalaraClient)

Get details of a subscription

Retrieve details of a specific subscription.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(apiClient);
        String subscriptionId = "subscriptionId_example"; // String | 
        String avalaraVersion = "avalaraVersion_example"; // String | The version of the API to use, e.g., \"1.3\".
        String xCorrelationID = "xCorrelationID_example"; // String | A unique identifier for tracking the request and its response
        String xAvalaraClient = "xAvalaraClient_example"; // String | Client application identification
        try {
            SubscriptionDetail result = apiInstance.getWebhookSubscription(subscriptionId, avalaraVersion, xCorrelationID, xAvalaraClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#getWebhookSubscription");
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
 **subscriptionId** | **String**|  |
 **avalaraVersion** | **String**| The version of the API to use, e.g., \&quot;1.3\&quot;. |
 **xCorrelationID** | **String**| A unique identifier for tracking the request and its response | [optional]
 **xAvalaraClient** | **String**| Client application identification | [optional]

### Return type

[**SubscriptionDetail**](SubscriptionDetail.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscription details retrieved successfully |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **401** | Not authenticated |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **403** | Access token does not have the required scope |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **404** | Subscription not found |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |


## listWebhookSubscriptions

> SubscriptionListResponse listWebhookSubscriptions(avalaraVersion, xCorrelationID, xAvalaraClient, $top, $skip, count, countOnly)

List all subscriptions

Retrieve a list of all subscriptions.

### Example

```java
// Import classes:
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.Configuration;
import Avalara.SDK.auth.*;
import Avalara.SDK.models.*;
import Avalara.SDK.api.EInvoicing.V1.SubscriptionsApi;

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

        SubscriptionsApi apiInstance = new SubscriptionsApi(apiClient);
        String avalaraVersion = "avalaraVersion_example"; // String | The version of the API to use, e.g., \"1.3\".
        String xCorrelationID = "xCorrelationID_example"; // String | A unique identifier for tracking the request and its response
        String xAvalaraClient = "xAvalaraClient_example"; // String | Client application identification
        BigDecimal $top = new BigDecimal(78); // BigDecimal | The number of items to include in the result.
        BigDecimal $skip = new BigDecimal(78); // BigDecimal | The number of items to skip in the result.
        Boolean count = true; // Boolean | Whether to include the total count of records in the result.
        Boolean countOnly = true; // Boolean | Whether to return only the count of records, without the list of records.
        try {
            SubscriptionListResponse result = apiInstance.listWebhookSubscriptions(avalaraVersion, xCorrelationID, xAvalaraClient, $top, $skip, count, countOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#listWebhookSubscriptions");
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
 **avalaraVersion** | **String**| The version of the API to use, e.g., \&quot;1.3\&quot;. |
 **xCorrelationID** | **String**| A unique identifier for tracking the request and its response | [optional]
 **xAvalaraClient** | **String**| Client application identification | [optional]
 **$top** | **BigDecimal**| The number of items to include in the result. | [optional]
 **$skip** | **BigDecimal**| The number of items to skip in the result. | [optional]
 **count** | **Boolean**| Whether to include the total count of records in the result. | [optional]
 **countOnly** | **Boolean**| Whether to return only the count of records, without the list of records. | [optional]

### Return type

[**SubscriptionListResponse**](SubscriptionListResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of subscriptions |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **401** | Not authenticated |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **403** | Access token does not have the required scope |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |
| **500** | Internal server error |  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  |

