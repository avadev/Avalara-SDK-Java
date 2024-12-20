/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
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
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
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
import Avalara.SDK.model.EInvoicing.V1.DirectorySearchResponse;
import Avalara.SDK.model.EInvoicing.V1.ErrorResponse;
import java.io.File;

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
        String localVarPath = "/trading-partners/batch-searches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Set avalara-version header from swagger.json version number
        localVarHeaderParams.put("avalara-version", "1.2");

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
        if (localVarAccept != null) {
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
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
     * Creates a batch search and performs a batch search in the directory for participants in the background.
     * Handles batch search requests by uploading a file containing search parameters.
     * @param requestOptions Object which represents the options available for a given API/request
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
    public void batchSearchParticipants(BatchSearchParticipantsRequest requestParameters) throws ApiException {
        batchSearchParticipantsWithHttpInfo(requestParameters);
    }

    /**
     * Creates a batch search and performs a batch search in the directory for participants in the background.
     * Handles batch search requests by uploading a file containing search parameters.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
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
    public ApiResponse<Void> batchSearchParticipantsWithHttpInfo(BatchSearchParticipantsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = batchSearchParticipantsValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Creates a batch search and performs a batch search in the directory for participants in the background. (asynchronously)
     * Handles batch search requests by uploading a file containing search parameters.
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
    public okhttp3.Call batchSearchParticipantsAsync(BatchSearchParticipantsRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchSearchParticipantsValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the BatchSearchParticipants API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param name The human readable name given to this batch search.</param>
    * @param notificationEmail The email address of the user to whom the batch search completion notification must go to.</param>
    * @param _file CSV file containing search parameters.</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\" (optional)</param>
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

        public String getAvalaraVersion() { return avalaraVersion; }
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
     * Build call for downloadBatchSearchReport
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful report download </td><td>  * X-Correlation-Id -  <br>  </td></tr>
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
        String localVarPath = "/trading-partners/batch-searches/{id}/$download-results"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Set avalara-version header from swagger.json version number
        localVarHeaderParams.put("avalara-version", "1.2");

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
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
     * Download batch search results in a csv file.
     * Downloads the report for a specific batch search using the batch search ID.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful report download </td><td>  * X-Correlation-Id -  <br>  </td></tr>
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
     * Download batch search results in a csv file.
     * Downloads the report for a specific batch search using the batch search ID.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful report download </td><td>  * X-Correlation-Id -  <br>  </td></tr>
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
     * Download batch search results in a csv file. (asynchronously)
     * Downloads the report for a specific batch search using the batch search ID.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful report download </td><td>  * X-Correlation-Id -  <br>  </td></tr>
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
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param id The ID of the batch search whose report is to be downloaded.</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\" (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class DownloadBatchSearchReportRequest {
        private String avalaraVersion;
        private String id;
        private String xAvalaraClient;
        private String xCorrelationID;

        public DownloadBatchSearchReportRequest () {
        }

        public String getAvalaraVersion() { return avalaraVersion; }
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
        <tr><td> 200 </td><td> Get the batch search details for a given id. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
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
        String localVarPath = "/trading-partners/batch-searches/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Set avalara-version header from swagger.json version number
        localVarHeaderParams.put("avalara-version", "1.2");

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
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
     * Get the batch search details for a given id.
     * Get the batch search details for a given id.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return BatchSearch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get the batch search details for a given id. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public BatchSearch getBatchSearchDetail(GetBatchSearchDetailRequest requestParameters) throws ApiException {
        ApiResponse<BatchSearch> localVarResp = getBatchSearchDetailWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Get the batch search details for a given id.
     * Get the batch search details for a given id.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;BatchSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get the batch search details for a given id. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<BatchSearch> getBatchSearchDetailWithHttpInfo(GetBatchSearchDetailRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getBatchSearchDetailValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<BatchSearch>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the batch search details for a given id. (asynchronously)
     * Get the batch search details for a given id.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get the batch search details for a given id. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
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
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param id The ID of the batch search that was submitted earlier.</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\" (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class GetBatchSearchDetailRequest {
        private String avalaraVersion;
        private String id;
        private String xAvalaraClient;
        private String xCorrelationID;

        public GetBatchSearchDetailRequest () {
        }

        public String getAvalaraVersion() { return avalaraVersion; }
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
        String localVarPath = "/trading-partners/batch-searches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Set avalara-version header from swagger.json version number
        localVarHeaderParams.put("avalara-version", "1.2");

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
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
     * List all batch searches that were previously submitted.
     * Retrieves all batch searches performed by the user.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return BatchSearchListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of batch searches </td><td>  * X-Correlation-Id -  <br>  </td></tr>
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
     * List all batch searches that were previously submitted.
     * Retrieves all batch searches performed by the user.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;BatchSearchListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of batch searches </td><td>  * X-Correlation-Id -  <br>  </td></tr>
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
     * List all batch searches that were previously submitted. (asynchronously)
     * Retrieves all batch searches performed by the user.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of batch searches </td><td>  * X-Correlation-Id -  <br>  </td></tr>
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
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\" (optional)</param>
    * @param $filter Filter by field name and value. This filter only supports <code>eq</code> .The parameters supported is <code>name</code>.    Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided parameters. (optional)</param>
    * @param count When set to true, the count of the collection is included as @recordSetCount in the response body. (optional)</param>
    * @param $top If nonzero, return no more than this number of results. Used with <code>$skip</code> to provide pagination for large datasets. Unless otherwise specified, the maximum number of records that can be returned from an API call is 200 records. (optional)</param>
    * @param $skip If nonzero, skip this number of results before returning data. Used with <code>$top</code> to provide pagination for large datasets. (optional)</param>
    * @param $orderBy The $orderBy query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space. (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class ListBatchSearchesRequest {
        private String avalaraVersion;
        private String xAvalaraClient;
        private String $filter;
        private Boolean count;
        private String $top;
        private String $skip;
        private String $orderBy;
        private String xCorrelationID;

        public ListBatchSearchesRequest () {
        }

        public String getAvalaraVersion() { return avalaraVersion; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String get$filter() { return $filter; }
        public void set$filter(String $filter) { this.$filter = $filter; }
        public Boolean getCount() { return count; }
        public void setCount(Boolean count) { this.count = count; }
        public String get$top() { return $top; }
        public void set$top(String $top) { this.$top = $top; }
        public String get$skip() { return $skip; }
        public void set$skip(String $skip) { this.$skip = $skip; }
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
        String localVarPath = "/trading-partners";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        // Set avalara-version header from swagger.json version number
        localVarHeaderParams.put("avalara-version", "1.2");

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
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
     * Returns a list of participants matching the input query.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return DirectorySearchResponse
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
    public DirectorySearchResponse searchParticipants(SearchParticipantsRequest requestParameters) throws ApiException {
        ApiResponse<DirectorySearchResponse> localVarResp = searchParticipantsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns a list of participants matching the input query.
     * Returns a list of participants matching the input query.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;DirectorySearchResponse&gt;
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
    public ApiResponse<DirectorySearchResponse> searchParticipantsWithHttpInfo(SearchParticipantsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = searchParticipantsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<DirectorySearchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of participants matching the input query. (asynchronously)
     * Returns a list of participants matching the input query.
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
    public okhttp3.Call searchParticipantsAsync(SearchParticipantsRequest requestParameters, final ApiCallback<DirectorySearchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchParticipantsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<DirectorySearchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the SearchParticipants API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param $search Search by value supports logical AND and OR. Refer to [https://learn.microsoft.com/en-us/odata/concepts/queryoptions-overview#search](https://learn.microsoft.com/en-us/odata/concepts/queryoptions-overview#search) for more information on search. Search will be done over <code>name</code> and <code>identifier</code> parameters only.</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\" (optional)</param>
    * @param count When set to true, the count of the collection is included as @recordSetCount in the response body. (optional)</param>
    * @param $filter Filter by field name and value. This filter only supports <code>eq</code> .The parameters supported are <code>network</code>, <code>country</code>, <code>documentType</code>, <code>idType</code>.          Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided parameters. (optional)</param>
    * @param $top If nonzero, return no more than this number of results. Used with <code>$skip</code> to provide pagination for large datasets. Unless otherwise specified, the maximum number of records that can be returned from an API call is 200 records. (optional)</param>
    * @param $skip If nonzero, skip this number of results before returning data. Used with <code>$top</code> to provide pagination for large datasets. (optional)</param>
    * @param $orderBy The $orderBy query parameter specifies the field and sorting direction for ordering the result set. The value is a string that combines a field name and a sorting direction (asc for ascending or desc for descending), separated by a space. (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class SearchParticipantsRequest {
        private String avalaraVersion;
        private String $search;
        private String xAvalaraClient;
        private Boolean count;
        private String $filter;
        private String $top;
        private String $skip;
        private String $orderBy;
        private String xCorrelationID;

        public SearchParticipantsRequest () {
        }

        public String getAvalaraVersion() { return avalaraVersion; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String get$search() { return $search; }
        public void set$search(String $search) { this.$search = $search; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public Boolean getCount() { return count; }
        public void setCount(Boolean count) { this.count = count; }
        public String get$filter() { return $filter; }
        public void set$filter(String $filter) { this.$filter = $filter; }
        public String get$top() { return $top; }
        public void set$top(String $top) { this.$top = $top; }
        public String get$skip() { return $skip; }
        public void set$skip(String $skip) { this.$skip = $skip; }
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

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("");
    }
}

