/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2025 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara E-Invoicing API
 *
 * An API that supports sending data for an E-Invoicing compliance use-case.
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.api.EInvoicing.V1;

import Avalara.SDK.ApiCallback;
import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiException;
import Avalara.SDK.ApiResponse;
import Avalara.SDK.Configuration;
import Avalara.SDK.Pair;
import Avalara.SDK.ProgressRequestBody;
import Avalara.SDK.ProgressResponseBody;
import Avalara.SDK.AvalaraMicroservice;


import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.*;


import Avalara.SDK.model.EInvoicing.V1.SubscriptionDetail;
import Avalara.SDK.model.EInvoicing.V1.SubscriptionListResponse;
import Avalara.SDK.model.EInvoicing.V1.SubscriptionRegistration;
import Avalara.SDK.model.EInvoicing.V1.SuccessResponse;
import Avalara.SDK.model.EInvoicing.V1.WebhooksErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SubscriptionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
        SetConfiguration(apiClient);
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createWebhookSubscription
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Subscribed successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createWebhookSubscriptionCall(CreateWebhookSubscriptionRequest requestParameters, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "";

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = requestParameters.getSubscriptionRegistration();

        // create path and map variables
        String localVarPath = "/einvoicing/webhooks/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createWebhookSubscriptionValidateBeforeCall(CreateWebhookSubscriptionRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling createWebhookSubscription(Async)");
        }
        
        // verify the required parameter 'requestParameters.subscriptionRegistration' is set
        if (requestParameters.getSubscriptionRegistration() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.subscriptionRegistration' when calling createWebhookSubscription(Async)");
        }
        

        okhttp3.Call localVarCall = createWebhookSubscriptionCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Create a subscription to events
     * Create a subscription to events exposed by registered systems.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return SuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Subscribed successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public SuccessResponse createWebhookSubscription(CreateWebhookSubscriptionRequest requestParameters) throws ApiException {
        ApiResponse<SuccessResponse> localVarResp = createWebhookSubscriptionWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Create a subscription to events
     * Create a subscription to events exposed by registered systems.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;SuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Subscribed successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public ApiResponse<SuccessResponse> createWebhookSubscriptionWithHttpInfo(CreateWebhookSubscriptionRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = createWebhookSubscriptionValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a subscription to events (asynchronously)
     * Create a subscription to events exposed by registered systems.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Subscribed successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid input </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createWebhookSubscriptionAsync(CreateWebhookSubscriptionRequest requestParameters, final ApiCallback<SuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createWebhookSubscriptionValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the CreateWebhookSubscription API
    *
    * @param avalaraVersion The version of the API to use, e.g., \"1.4\".</param>
    * @param subscriptionRegistration </param>
    * @param xCorrelationID A unique identifier for tracking the request and its response (optional)</param>
    * @param xAvalaraClient Client application identification (optional)</param>
    */
    public class CreateWebhookSubscriptionRequest {
        private String avalaraVersion;
        private SubscriptionRegistration subscriptionRegistration;
        private String xCorrelationID;
        private String xAvalaraClient;

        public CreateWebhookSubscriptionRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public SubscriptionRegistration getSubscriptionRegistration() { return subscriptionRegistration; }
        public void setSubscriptionRegistration(SubscriptionRegistration subscriptionRegistration) { this.subscriptionRegistration = subscriptionRegistration; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns CreateWebhookSubscriptionRequest
    */
    public CreateWebhookSubscriptionRequest getCreateWebhookSubscriptionRequest() {
        return this.new CreateWebhookSubscriptionRequest();
    }

    /**
     * Build call for deleteWebhookSubscription
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Unsubscribed successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 404 </td><td> Subscription not found </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteWebhookSubscriptionCall(DeleteWebhookSubscriptionRequest requestParameters, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "";

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/einvoicing/webhooks/subscriptions/{subscription-id}"
            .replaceAll("\\{" + "subscription-id" + "\\}", localVarApiClient.escapeString(requestParameters.subscriptionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteWebhookSubscriptionValidateBeforeCall(DeleteWebhookSubscriptionRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.subscriptionId' is set
        if (requestParameters.getSubscriptionId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.subscriptionId' when calling deleteWebhookSubscription(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling deleteWebhookSubscription(Async)");
        }
        

        okhttp3.Call localVarCall = deleteWebhookSubscriptionCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Unsubscribe from events
     * Remove a subscription from the webhooks dispatch service. All events and subscriptions are also deleted.
     * @param requestOptions Object which represents the options available for a given API/request
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Unsubscribed successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 404 </td><td> Subscription not found </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public void deleteWebhookSubscription(DeleteWebhookSubscriptionRequest requestParameters) throws ApiException {
        deleteWebhookSubscriptionWithHttpInfo(requestParameters);
    }

    /**
     * Unsubscribe from events
     * Remove a subscription from the webhooks dispatch service. All events and subscriptions are also deleted.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Unsubscribed successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 404 </td><td> Subscription not found </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteWebhookSubscriptionWithHttpInfo(DeleteWebhookSubscriptionRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = deleteWebhookSubscriptionValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Unsubscribe from events (asynchronously)
     * Remove a subscription from the webhooks dispatch service. All events and subscriptions are also deleted.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Unsubscribed successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 404 </td><td> Subscription not found </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteWebhookSubscriptionAsync(DeleteWebhookSubscriptionRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteWebhookSubscriptionValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the DeleteWebhookSubscription API
    *
    * @param subscriptionId </param>
    * @param avalaraVersion The version of the API to use, e.g., \"1.4\".</param>
    * @param xCorrelationID A unique identifier for tracking the request and its response (optional)</param>
    * @param xAvalaraClient Client application identification (optional)</param>
    */
    public class DeleteWebhookSubscriptionRequest {
        private String subscriptionId;
        private String avalaraVersion;
        private String xCorrelationID;
        private String xAvalaraClient;

        public DeleteWebhookSubscriptionRequest () {
        }

        public String getSubscriptionId() { return subscriptionId; }
        public void setSubscriptionId(String subscriptionId) { this.subscriptionId = subscriptionId; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns DeleteWebhookSubscriptionRequest
    */
    public DeleteWebhookSubscriptionRequest getDeleteWebhookSubscriptionRequest() {
        return this.new DeleteWebhookSubscriptionRequest();
    }

    /**
     * Build call for getWebhookSubscription
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Subscription details retrieved successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 404 </td><td> Subscription not found </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getWebhookSubscriptionCall(GetWebhookSubscriptionRequest requestParameters, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "";

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/einvoicing/webhooks/subscriptions/{subscription-id}"
            .replaceAll("\\{" + "subscription-id" + "\\}", localVarApiClient.escapeString(requestParameters.subscriptionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWebhookSubscriptionValidateBeforeCall(GetWebhookSubscriptionRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.subscriptionId' is set
        if (requestParameters.getSubscriptionId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.subscriptionId' when calling getWebhookSubscription(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getWebhookSubscription(Async)");
        }
        

        okhttp3.Call localVarCall = getWebhookSubscriptionCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Get details of a subscription
     * Retrieve details of a specific subscription.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return SubscriptionDetail
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Subscription details retrieved successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 404 </td><td> Subscription not found </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public SubscriptionDetail getWebhookSubscription(GetWebhookSubscriptionRequest requestParameters) throws ApiException {
        ApiResponse<SubscriptionDetail> localVarResp = getWebhookSubscriptionWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Get details of a subscription
     * Retrieve details of a specific subscription.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;SubscriptionDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Subscription details retrieved successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 404 </td><td> Subscription not found </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public ApiResponse<SubscriptionDetail> getWebhookSubscriptionWithHttpInfo(GetWebhookSubscriptionRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getWebhookSubscriptionValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<SubscriptionDetail>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get details of a subscription (asynchronously)
     * Retrieve details of a specific subscription.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Subscription details retrieved successfully </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 404 </td><td> Subscription not found </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getWebhookSubscriptionAsync(GetWebhookSubscriptionRequest requestParameters, final ApiCallback<SubscriptionDetail> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWebhookSubscriptionValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionDetail>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetWebhookSubscription API
    *
    * @param subscriptionId </param>
    * @param avalaraVersion The version of the API to use, e.g., \"1.4\".</param>
    * @param xCorrelationID A unique identifier for tracking the request and its response (optional)</param>
    * @param xAvalaraClient Client application identification (optional)</param>
    */
    public class GetWebhookSubscriptionRequest {
        private String subscriptionId;
        private String avalaraVersion;
        private String xCorrelationID;
        private String xAvalaraClient;

        public GetWebhookSubscriptionRequest () {
        }

        public String getSubscriptionId() { return subscriptionId; }
        public void setSubscriptionId(String subscriptionId) { this.subscriptionId = subscriptionId; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetWebhookSubscriptionRequest
    */
    public GetWebhookSubscriptionRequest getGetWebhookSubscriptionRequest() {
        return this.new GetWebhookSubscriptionRequest();
    }

    /**
     * Build call for listWebhookSubscriptions
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of subscriptions </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listWebhookSubscriptionsCall(ListWebhookSubscriptionsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        //OAuth2 Scopes
        String requiredScopes = "";

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/einvoicing/webhooks/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.get$top() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$top", requestParameters.get$top()));
        }

        if (requestParameters.get$skip() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$skip", requestParameters.get$skip()));
        }

        if (requestParameters.getCount() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", requestParameters.getCount()));
        }

        if (requestParameters.getCountOnly() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("countOnly", requestParameters.getCountOnly()));
        }

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listWebhookSubscriptionsValidateBeforeCall(ListWebhookSubscriptionsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling listWebhookSubscriptions(Async)");
        }
        

        okhttp3.Call localVarCall = listWebhookSubscriptionsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * List all subscriptions
     * Retrieve a list of all subscriptions.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return SubscriptionListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of subscriptions </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public SubscriptionListResponse listWebhookSubscriptions(ListWebhookSubscriptionsRequest requestParameters) throws ApiException {
        ApiResponse<SubscriptionListResponse> localVarResp = listWebhookSubscriptionsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * List all subscriptions
     * Retrieve a list of all subscriptions.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;SubscriptionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of subscriptions </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public ApiResponse<SubscriptionListResponse> listWebhookSubscriptionsWithHttpInfo(ListWebhookSubscriptionsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = listWebhookSubscriptionsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<SubscriptionListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all subscriptions (asynchronously)
     * Retrieve a list of all subscriptions.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of subscriptions </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 401 </td><td> Not authenticated </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 403 </td><td> Access token does not have the required scope </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-ID - Correlation ID from the request, or a new one if not provided in request <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listWebhookSubscriptionsAsync(ListWebhookSubscriptionsRequest requestParameters, final ApiCallback<SubscriptionListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listWebhookSubscriptionsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<SubscriptionListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the ListWebhookSubscriptions API
    *
    * @param avalaraVersion The version of the API to use, e.g., \"1.4\".</param>
    * @param xCorrelationID A unique identifier for tracking the request and its response (optional)</param>
    * @param xAvalaraClient Client application identification (optional)</param>
    * @param $top The number of items to include in the result. (optional)</param>
    * @param $skip The number of items to skip in the result. (optional)</param>
    * @param count Whether to include the total count of records in the result. (optional)</param>
    * @param countOnly Whether to return only the count of records, without the list of records. (optional)</param>
    */
    public class ListWebhookSubscriptionsRequest {
        private String avalaraVersion;
        private String xCorrelationID;
        private String xAvalaraClient;
        private Integer $top;
        private Integer $skip;
        private Boolean count;
        private Boolean countOnly;

        public ListWebhookSubscriptionsRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public Integer get$top() { return $top; }
        public void set$top(Integer $top) { this.$top = $top; }
        public Integer get$skip() { return $skip; }
        public void set$skip(Integer $skip) { this.$skip = $skip; }
        public Boolean getCount() { return count; }
        public void setCount(Boolean count) { this.count = count; }
        public Boolean getCountOnly() { return countOnly; }
        public void setCountOnly(Boolean countOnly) { this.countOnly = countOnly; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns ListWebhookSubscriptionsRequest
    */
    public ListWebhookSubscriptionsRequest getListWebhookSubscriptionsRequest() {
        return this.new ListWebhookSubscriptionsRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("25.8.1");
    }
}

