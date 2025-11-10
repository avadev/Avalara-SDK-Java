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


import Avalara.SDK.model.EInvoicing.V1.BatchSearch;
import Avalara.SDK.model.EInvoicing.V1.BatchSearchListResponse;
import Avalara.SDK.model.EInvoicing.V1.BatchSearchParticipants202Response;
import Avalara.SDK.model.EInvoicing.V1.CreateTradingPartner201Response;
import Avalara.SDK.model.EInvoicing.V1.CreateTradingPartnersBatch200Response;
import Avalara.SDK.model.EInvoicing.V1.CreateTradingPartnersBatchRequest;
import Avalara.SDK.model.EInvoicing.V1.ErrorResponse;
import java.io.File;
import Avalara.SDK.model.EInvoicing.V1.SearchParticipants200Response;
import Avalara.SDK.model.EInvoicing.V1.TradingPartner;
import Avalara.SDK.model.EInvoicing.V1.UpdateTradingPartner200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradingPartnersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TradingPartnersApi(ApiClient apiClient) {
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
     * Build call for batchSearchParticipants
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Batch search file accepted for processing the search. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call batchSearchParticipantsCall(BatchSearchParticipantsRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/trading-partners/batch-searches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.get_file() != null) {
            localVarFormParams.put("file", requestParameters.get_file());
        }

        if (requestParameters.getName() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", requestParameters.getName()));
        }

        if (requestParameters.getNotificationEmail() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("notificationEmail", requestParameters.getNotificationEmail()));
        }

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call batchSearchParticipantsValidateBeforeCall(BatchSearchParticipantsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling batchSearchParticipants(Async)");
        }
        
        // verify the required parameter 'requestParameters.name' is set
        if (requestParameters.getName() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.name' when calling batchSearchParticipants(Async)");
        }
        
        // verify the required parameter 'requestParameters.notificationEmail' is set
        if (requestParameters.getNotificationEmail() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.notificationEmail' when calling batchSearchParticipants(Async)");
        }
        
        // verify the required parameter 'requestParameters._file' is set
        if (requestParameters.get_file() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters._file' when calling batchSearchParticipants(Async)");
        }
        

        okhttp3.Call localVarCall = batchSearchParticipantsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Handles batch search requests by uploading a file containing search parameters.
     * This endpoint creates a batch search and performs a batch search in the directory for participants in the background.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return BatchSearchParticipants202Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Batch search file accepted for processing the search. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public BatchSearchParticipants202Response batchSearchParticipants(BatchSearchParticipantsRequest requestParameters) throws ApiException {
        ApiResponse<BatchSearchParticipants202Response> localVarResp = batchSearchParticipantsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Handles batch search requests by uploading a file containing search parameters.
     * This endpoint creates a batch search and performs a batch search in the directory for participants in the background.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;BatchSearchParticipants202Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Batch search file accepted for processing the search. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<BatchSearchParticipants202Response> batchSearchParticipantsWithHttpInfo(BatchSearchParticipantsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = batchSearchParticipantsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<BatchSearchParticipants202Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Handles batch search requests by uploading a file containing search parameters. (asynchronously)
     * This endpoint creates a batch search and performs a batch search in the directory for participants in the background.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Batch search file accepted for processing the search. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call batchSearchParticipantsAsync(BatchSearchParticipantsRequest requestParameters, final ApiCallback<BatchSearchParticipants202Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchSearchParticipantsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<BatchSearchParticipants202Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the BatchSearchParticipants API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param name A <b>human-readable</b> name for the batch search.</param>
    * @param notificationEmail The email address to which a notification will be sent once the batch search is complete.</param>
    * @param _file CSV file containing search parameters.  Input Constraints: - Maximum file size: 1 MB - File Header: Must be less than 500 KB - Total number of lines (including header): Must be 101 or fewer</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class BatchSearchParticipantsRequest {
        private String avalaraVersion;
        private String name;
        private String notificationEmail;
        private File _file;
        private String xAvalaraClient;
        private String xCorrelationID;

        public BatchSearchParticipantsRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getNotificationEmail() { return notificationEmail; }
        public void setNotificationEmail(String notificationEmail) { this.notificationEmail = notificationEmail; }
        public File get_file() { return _file; }
        public void set_file(File _file) { this._file = _file; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns BatchSearchParticipantsRequest
    */
    public BatchSearchParticipantsRequest getBatchSearchParticipantsRequest() {
        return this.new BatchSearchParticipantsRequest();
    }

    /**
     * Build call for createTradingPartner
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The trading partner has been successfully created. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createTradingPartnerCall(CreateTradingPartnerRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getTradingPartner();

        // create path and map variables
        String localVarPath = "/einvoicing/trading-partners";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
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
    private okhttp3.Call createTradingPartnerValidateBeforeCall(CreateTradingPartnerRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling createTradingPartner(Async)");
        }
        
        // verify the required parameter 'requestParameters.tradingPartner' is set
        if (requestParameters.getTradingPartner() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.tradingPartner' when calling createTradingPartner(Async)");
        }
        

        okhttp3.Call localVarCall = createTradingPartnerCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Creates a new trading partner.
     * This endpoint creates a new trading partner with the provided details. The request body must include the necessary information as defined in the &#x60;TradingPartner&#x60; schema.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CreateTradingPartner201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The trading partner has been successfully created. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public CreateTradingPartner201Response createTradingPartner(CreateTradingPartnerRequest requestParameters) throws ApiException {
        ApiResponse<CreateTradingPartner201Response> localVarResp = createTradingPartnerWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Creates a new trading partner.
     * This endpoint creates a new trading partner with the provided details. The request body must include the necessary information as defined in the &#x60;TradingPartner&#x60; schema.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CreateTradingPartner201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The trading partner has been successfully created. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<CreateTradingPartner201Response> createTradingPartnerWithHttpInfo(CreateTradingPartnerRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = createTradingPartnerValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CreateTradingPartner201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a new trading partner. (asynchronously)
     * This endpoint creates a new trading partner with the provided details. The request body must include the necessary information as defined in the &#x60;TradingPartner&#x60; schema.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The trading partner has been successfully created. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createTradingPartnerAsync(CreateTradingPartnerRequest requestParameters, final ApiCallback<CreateTradingPartner201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTradingPartnerValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CreateTradingPartner201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the CreateTradingPartner API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param tradingPartner </param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class CreateTradingPartnerRequest {
        private String avalaraVersion;
        private TradingPartner tradingPartner;
        private String xAvalaraClient;
        private String xCorrelationID;

        public CreateTradingPartnerRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public TradingPartner getTradingPartner() { return tradingPartner; }
        public void setTradingPartner(TradingPartner tradingPartner) { this.tradingPartner = tradingPartner; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns CreateTradingPartnerRequest
    */
    public CreateTradingPartnerRequest getCreateTradingPartnerRequest() {
        return this.new CreateTradingPartnerRequest();
    }

    /**
     * Build call for createTradingPartnersBatch
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Batch processing completed </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 413 </td><td> ContentTooLarge </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createTradingPartnersBatchCall(CreateTradingPartnersBatchRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getCreateTradingPartnersBatchRequest();

        // create path and map variables
        String localVarPath = "/einvoicing/trading-partners/batch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
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
    private okhttp3.Call createTradingPartnersBatchValidateBeforeCall(CreateTradingPartnersBatchRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling createTradingPartnersBatch(Async)");
        }
        
        // verify the required parameter 'requestParameters.createTradingPartnersBatchRequest' is set
        if (requestParameters.getCreateTradingPartnersBatchRequest() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.createTradingPartnersBatchRequest' when calling createTradingPartnersBatch(Async)");
        }
        

        okhttp3.Call localVarCall = createTradingPartnersBatchCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Creates a batch of multiple trading partners.
     * This endpoint creates multiple trading partners in a single batch request. It accepts an array of trading partners and processes them synchronously. Supports a maximum of 100 records or 1 MB request payload. The batch is processed atomically and partial success is not allowed.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CreateTradingPartnersBatch200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Batch processing completed </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 413 </td><td> ContentTooLarge </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public CreateTradingPartnersBatch200Response createTradingPartnersBatch(CreateTradingPartnersBatchRequest requestParameters) throws ApiException {
        ApiResponse<CreateTradingPartnersBatch200Response> localVarResp = createTradingPartnersBatchWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Creates a batch of multiple trading partners.
     * This endpoint creates multiple trading partners in a single batch request. It accepts an array of trading partners and processes them synchronously. Supports a maximum of 100 records or 1 MB request payload. The batch is processed atomically and partial success is not allowed.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CreateTradingPartnersBatch200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Batch processing completed </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 413 </td><td> ContentTooLarge </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<CreateTradingPartnersBatch200Response> createTradingPartnersBatchWithHttpInfo(CreateTradingPartnersBatchRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = createTradingPartnersBatchValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CreateTradingPartnersBatch200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Creates a batch of multiple trading partners. (asynchronously)
     * This endpoint creates multiple trading partners in a single batch request. It accepts an array of trading partners and processes them synchronously. Supports a maximum of 100 records or 1 MB request payload. The batch is processed atomically and partial success is not allowed.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Batch processing completed </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 413 </td><td> ContentTooLarge </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call createTradingPartnersBatchAsync(CreateTradingPartnersBatchRequest requestParameters, final ApiCallback<CreateTradingPartnersBatch200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTradingPartnersBatchValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CreateTradingPartnersBatch200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the CreateTradingPartnersBatch API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param createTradingPartnersBatchRequest </param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class CreateTradingPartnersBatchRequest {
        private String avalaraVersion;
        private CreateTradingPartnersBatchRequest createTradingPartnersBatchRequest;
        private String xAvalaraClient;
        private String xCorrelationID;

        public CreateTradingPartnersBatchRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public CreateTradingPartnersBatchRequest getCreateTradingPartnersBatchRequest() { return createTradingPartnersBatchRequest; }
        public void setCreateTradingPartnersBatchRequest(CreateTradingPartnersBatchRequest createTradingPartnersBatchRequest) { this.createTradingPartnersBatchRequest = createTradingPartnersBatchRequest; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns CreateTradingPartnersBatchRequest
    */
    public CreateTradingPartnersBatchRequest getCreateTradingPartnersBatchRequest() {
        return this.new CreateTradingPartnersBatchRequest();
    }

    /**
     * Build call for deleteTradingPartner
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Trading partner deleted successfully. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTradingPartnerCall(DeleteTradingPartnerRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/trading-partners/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
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
    private okhttp3.Call deleteTradingPartnerValidateBeforeCall(DeleteTradingPartnerRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling deleteTradingPartner(Async)");
        }
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling deleteTradingPartner(Async)");
        }
        

        okhttp3.Call localVarCall = deleteTradingPartnerCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Deletes a trading partner using ID.
     * This endpoint deletes an existing trading partner identified by the provided ID.
     * @param requestOptions Object which represents the options available for a given API/request
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Trading partner deleted successfully. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public void deleteTradingPartner(DeleteTradingPartnerRequest requestParameters) throws ApiException {
        deleteTradingPartnerWithHttpInfo(requestParameters);
    }

    /**
     * Deletes a trading partner using ID.
     * This endpoint deletes an existing trading partner identified by the provided ID.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Trading partner deleted successfully. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteTradingPartnerWithHttpInfo(DeleteTradingPartnerRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = deleteTradingPartnerValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Deletes a trading partner using ID. (asynchronously)
     * This endpoint deletes an existing trading partner identified by the provided ID.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Trading partner deleted successfully. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTradingPartnerAsync(DeleteTradingPartnerRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteTradingPartnerValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the DeleteTradingPartner API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param id The ID of the trading partner which is being deleted.</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class DeleteTradingPartnerRequest {
        private String avalaraVersion;
        private String id;
        private String xAvalaraClient;
        private String xCorrelationID;

        public DeleteTradingPartnerRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns DeleteTradingPartnerRequest
    */
    public DeleteTradingPartnerRequest getDeleteTradingPartnerRequest() {
        return this.new DeleteTradingPartnerRequest();
    }

    /**
     * Build call for downloadBatchSearchReport
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful report download  Output Constraints: - Maximum of 1000 query results returned in the CSV </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call downloadBatchSearchReportCall(DownloadBatchSearchReportRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/trading-partners/batch-searches/{id}/$download-results"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        final String[] localVarAccepts = {
            "text/csv", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
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
    private okhttp3.Call downloadBatchSearchReportValidateBeforeCall(DownloadBatchSearchReportRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling downloadBatchSearchReport(Async)");
        }
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling downloadBatchSearchReport(Async)");
        }
        

        okhttp3.Call localVarCall = downloadBatchSearchReportCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Downloads batch search results in a csv file.
     * This endpoint downloads the report for a specific batch search using the batch search ID. It returns a CSV file containing up to 1,000 query results.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful report download  Output Constraints: - Maximum of 1000 query results returned in the CSV </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public File downloadBatchSearchReport(DownloadBatchSearchReportRequest requestParameters) throws ApiException {
        ApiResponse<File> localVarResp = downloadBatchSearchReportWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Downloads batch search results in a csv file.
     * This endpoint downloads the report for a specific batch search using the batch search ID. It returns a CSV file containing up to 1,000 query results.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful report download  Output Constraints: - Maximum of 1000 query results returned in the CSV </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<File> downloadBatchSearchReportWithHttpInfo(DownloadBatchSearchReportRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = downloadBatchSearchReportValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Downloads batch search results in a csv file. (asynchronously)
     * This endpoint downloads the report for a specific batch search using the batch search ID. It returns a CSV file containing up to 1,000 query results.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful report download  Output Constraints: - Maximum of 1000 query results returned in the CSV </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call downloadBatchSearchReportAsync(DownloadBatchSearchReportRequest requestParameters, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadBatchSearchReportValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the DownloadBatchSearchReport API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param id The ID of the batch search for which the report should be downloaded.</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class DownloadBatchSearchReportRequest {
        private String avalaraVersion;
        private String id;
        private String xAvalaraClient;
        private String xCorrelationID;

        public DownloadBatchSearchReportRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns DownloadBatchSearchReportRequest
    */
    public DownloadBatchSearchReportRequest getDownloadBatchSearchReportRequest() {
        return this.new DownloadBatchSearchReportRequest();
    }

    /**
     * Build call for getBatchSearchDetail
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The batch search details for a given ID. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getBatchSearchDetailCall(GetBatchSearchDetailRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/trading-partners/batch-searches/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
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
    private okhttp3.Call getBatchSearchDetailValidateBeforeCall(GetBatchSearchDetailRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getBatchSearchDetail(Async)");
        }
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling getBatchSearchDetail(Async)");
        }
        

        okhttp3.Call localVarCall = getBatchSearchDetailCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns the batch search details using ID.
     * This endpoint returns detailed information for a specific batch search using the provided ID. It is useful for tracking the status and progress of a previously initiated batch search operation.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return BatchSearch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The batch search details for a given ID. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public BatchSearch getBatchSearchDetail(GetBatchSearchDetailRequest requestParameters) throws ApiException {
        ApiResponse<BatchSearch> localVarResp = getBatchSearchDetailWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns the batch search details using ID.
     * This endpoint returns detailed information for a specific batch search using the provided ID. It is useful for tracking the status and progress of a previously initiated batch search operation.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;BatchSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The batch search details for a given ID. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<BatchSearch> getBatchSearchDetailWithHttpInfo(GetBatchSearchDetailRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getBatchSearchDetailValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<BatchSearch>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns the batch search details using ID. (asynchronously)
     * This endpoint returns detailed information for a specific batch search using the provided ID. It is useful for tracking the status and progress of a previously initiated batch search operation.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The batch search details for a given ID. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getBatchSearchDetailAsync(GetBatchSearchDetailRequest requestParameters, final ApiCallback<BatchSearch> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBatchSearchDetailValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<BatchSearch>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetBatchSearchDetail API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param id The ID of the batch search that was submitted earlier.</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class GetBatchSearchDetailRequest {
        private String avalaraVersion;
        private String id;
        private String xAvalaraClient;
        private String xCorrelationID;

        public GetBatchSearchDetailRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetBatchSearchDetailRequest
    */
    public GetBatchSearchDetailRequest getGetBatchSearchDetailRequest() {
        return this.new GetBatchSearchDetailRequest();
    }

    /**
     * Build call for listBatchSearches
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of batch searches </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listBatchSearchesCall(ListBatchSearchesRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/trading-partners/batch-searches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.get$filter() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$filter", requestParameters.get$filter()));
        }

        if (requestParameters.getCount() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", requestParameters.getCount()));
        }

        if (requestParameters.get$top() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$top", requestParameters.get$top()));
        }

        if (requestParameters.get$skip() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$skip", requestParameters.get$skip()));
        }

        if (requestParameters.get$orderBy() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$orderBy", requestParameters.get$orderBy()));
        }

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
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
    private okhttp3.Call listBatchSearchesValidateBeforeCall(ListBatchSearchesRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling listBatchSearches(Async)");
        }
        

        okhttp3.Call localVarCall = listBatchSearchesCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Lists all batch searches that were previously submitted.
     * This endpoint retrieves a list of all batch search operations that have been previously submitted. It returns details such as the batch search ID, status, creation date, and associated metadata. It is useful for tracking the progress of a previously initiated batch search operations.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return BatchSearchListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of batch searches </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public BatchSearchListResponse listBatchSearches(ListBatchSearchesRequest requestParameters) throws ApiException {
        ApiResponse<BatchSearchListResponse> localVarResp = listBatchSearchesWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Lists all batch searches that were previously submitted.
     * This endpoint retrieves a list of all batch search operations that have been previously submitted. It returns details such as the batch search ID, status, creation date, and associated metadata. It is useful for tracking the progress of a previously initiated batch search operations.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;BatchSearchListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of batch searches </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<BatchSearchListResponse> listBatchSearchesWithHttpInfo(ListBatchSearchesRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = listBatchSearchesValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<BatchSearchListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lists all batch searches that were previously submitted. (asynchronously)
     * This endpoint retrieves a list of all batch search operations that have been previously submitted. It returns details such as the batch search ID, status, creation date, and associated metadata. It is useful for tracking the progress of a previously initiated batch search operations.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of batch searches </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listBatchSearchesAsync(ListBatchSearchesRequest requestParameters, final ApiCallback<BatchSearchListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listBatchSearchesValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<BatchSearchListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the ListBatchSearches API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param $filter Filters the results by field name. Only the <code>eq</code> operator and the name field is supported. For more information, refer to [AvaTax filtering guide](https://developer.avalara.com/avatax/filtering-in-rest/). (optional)</param>
    * @param count When set to <code>true</code>, returns the total count of matching records included as <code>@recordSetCount</code> in the response body. (optional)</param>
    * @param $top The number of items to include in the result. (optional)</param>
    * @param $skip The number of items to skip in the result. (optional)</param>
    * @param $orderBy The <code>$orderBy</code> query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space. (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class ListBatchSearchesRequest {
        private String avalaraVersion;
        private String xAvalaraClient;
        private String $filter;
        private Boolean count;
        private Integer $top;
        private Integer $skip;
        private String $orderBy;
        private String xCorrelationID;

        public ListBatchSearchesRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String get$filter() { return $filter; }
        public void set$filter(String $filter) { this.$filter = $filter; }
        public Boolean getCount() { return count; }
        public void setCount(Boolean count) { this.count = count; }
        public Integer get$top() { return $top; }
        public void set$top(Integer $top) { this.$top = $top; }
        public Integer get$skip() { return $skip; }
        public void set$skip(Integer $skip) { this.$skip = $skip; }
        public String get$orderBy() { return $orderBy; }
        public void set$orderBy(String $orderBy) { this.$orderBy = $orderBy; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns ListBatchSearchesRequest
    */
    public ListBatchSearchesRequest getListBatchSearchesRequest() {
        return this.new ListBatchSearchesRequest();
    }

    /**
     * Build call for searchParticipants
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call searchParticipantsCall(SearchParticipantsRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/trading-partners";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getCount() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", requestParameters.getCount()));
        }

        if (requestParameters.get$search() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$search", requestParameters.get$search()));
        }

        if (requestParameters.get$filter() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$filter", requestParameters.get$filter()));
        }

        if (requestParameters.get$top() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$top", requestParameters.get$top()));
        }

        if (requestParameters.get$skip() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$skip", requestParameters.get$skip()));
        }

        if (requestParameters.get$orderBy() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$orderBy", requestParameters.get$orderBy()));
        }

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
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
    private okhttp3.Call searchParticipantsValidateBeforeCall(SearchParticipantsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling searchParticipants(Async)");
        }
        
        // verify the required parameter 'requestParameters.$search' is set
        if (requestParameters.get$search() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.$search' when calling searchParticipants(Async)");
        }
        

        okhttp3.Call localVarCall = searchParticipantsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns a list of participants matching the input query.
     * This endpoint retrieves a list of trading partners that match the specified search criteria. It supports filtering, search text, and other relevant query parameters to narrow down the results.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return SearchParticipants200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public SearchParticipants200Response searchParticipants(SearchParticipantsRequest requestParameters) throws ApiException {
        ApiResponse<SearchParticipants200Response> localVarResp = searchParticipantsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns a list of participants matching the input query.
     * This endpoint retrieves a list of trading partners that match the specified search criteria. It supports filtering, search text, and other relevant query parameters to narrow down the results.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;SearchParticipants200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<SearchParticipants200Response> searchParticipantsWithHttpInfo(SearchParticipantsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = searchParticipantsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<SearchParticipants200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of participants matching the input query. (asynchronously)
     * This endpoint retrieves a list of trading partners that match the specified search criteria. It supports filtering, search text, and other relevant query parameters to narrow down the results.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call searchParticipantsAsync(SearchParticipantsRequest requestParameters, final ApiCallback<SearchParticipants200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchParticipantsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<SearchParticipants200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the SearchParticipants API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param $search Search by value supports logical <code>AND</code> / <code>OR</code> operators. Search is performed only over the name and identifier value fields. For more information, refer to [Query options overview - OData.](https://learn.microsoft.com/en-us/odata/concepts/queryoptions-overview#search).</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param count When set to <code>true</code>, returns the total count of matching records included as <code>@recordSetCount</code> in the response body. (optional)</param>
    * @param $filter Filters the results using the <code>eq</code> operator. Supported fields: <code>network</code>, <code>country</code>, <code>documentType</code>, <code>idType</code>. For more information, refer to [AvaTax filtering guide](https://developer.avalara.com/avatax/filtering-in-rest/). (optional)</param>
    * @param $top The number of items to include in the result. (optional)</param>
    * @param $skip The number of items to skip in the result. (optional)</param>
    * @param $orderBy The <code>$orderBy</code> query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space. (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class SearchParticipantsRequest {
        private String avalaraVersion;
        private String $search;
        private String xAvalaraClient;
        private Boolean count;
        private String $filter;
        private Integer $top;
        private Integer $skip;
        private String $orderBy;
        private String xCorrelationID;

        public SearchParticipantsRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String get$search() { return $search; }
        public void set$search(String $search) { this.$search = $search; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public Boolean getCount() { return count; }
        public void setCount(Boolean count) { this.count = count; }
        public String get$filter() { return $filter; }
        public void set$filter(String $filter) { this.$filter = $filter; }
        public Integer get$top() { return $top; }
        public void set$top(Integer $top) { this.$top = $top; }
        public Integer get$skip() { return $skip; }
        public void set$skip(Integer $skip) { this.$skip = $skip; }
        public String get$orderBy() { return $orderBy; }
        public void set$orderBy(String $orderBy) { this.$orderBy = $orderBy; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns SearchParticipantsRequest
    */
    public SearchParticipantsRequest getSearchParticipantsRequest() {
        return this.new SearchParticipantsRequest();
    }

    /**
     * Build call for updateTradingPartner
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The trading partner has been successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateTradingPartnerCall(UpdateTradingPartnerRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getTradingPartner();

        // create path and map variables
        String localVarPath = "/einvoicing/trading-partners/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        if (requestParameters.getXCorrelationID() != null) {
            localVarHeaderParams.put("X-Correlation-ID", localVarApiClient.parameterToString(requestParameters.getXCorrelationID()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateTradingPartnerValidateBeforeCall(UpdateTradingPartnerRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling updateTradingPartner(Async)");
        }
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling updateTradingPartner(Async)");
        }
        
        // verify the required parameter 'requestParameters.tradingPartner' is set
        if (requestParameters.getTradingPartner() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.tradingPartner' when calling updateTradingPartner(Async)");
        }
        

        okhttp3.Call localVarCall = updateTradingPartnerCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Updates a trading partner using ID.
     * This endpoint updates the details of an existing trading partner specified by the provided ID. It performs a full update, and the request body must include all required fields.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return UpdateTradingPartner200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The trading partner has been successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public UpdateTradingPartner200Response updateTradingPartner(UpdateTradingPartnerRequest requestParameters) throws ApiException {
        ApiResponse<UpdateTradingPartner200Response> localVarResp = updateTradingPartnerWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Updates a trading partner using ID.
     * This endpoint updates the details of an existing trading partner specified by the provided ID. It performs a full update, and the request body must include all required fields.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;UpdateTradingPartner200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The trading partner has been successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<UpdateTradingPartner200Response> updateTradingPartnerWithHttpInfo(UpdateTradingPartnerRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = updateTradingPartnerValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<UpdateTradingPartner200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updates a trading partner using ID. (asynchronously)
     * This endpoint updates the details of an existing trading partner specified by the provided ID. It performs a full update, and the request body must include all required fields.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The trading partner has been successfully created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call updateTradingPartnerAsync(UpdateTradingPartnerRequest requestParameters, final ApiCallback<UpdateTradingPartner200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTradingPartnerValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<UpdateTradingPartner200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the UpdateTradingPartner API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param id The ID of the trading partner which is being updated.</param>
    * @param tradingPartner </param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class UpdateTradingPartnerRequest {
        private String avalaraVersion;
        private String id;
        private TradingPartner tradingPartner;
        private String xAvalaraClient;
        private String xCorrelationID;

        public UpdateTradingPartnerRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public TradingPartner getTradingPartner() { return tradingPartner; }
        public void setTradingPartner(TradingPartner tradingPartner) { this.tradingPartner = tradingPartner; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns UpdateTradingPartnerRequest
    */
    public UpdateTradingPartnerRequest getUpdateTradingPartnerRequest() {
        return this.new UpdateTradingPartnerRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("25.11.1");
    }
}

