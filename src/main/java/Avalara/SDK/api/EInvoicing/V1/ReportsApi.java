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


import Avalara.SDK.model.EInvoicing.V1.BadRequest;
import Avalara.SDK.model.EInvoicing.V1.ForbiddenError;
import Avalara.SDK.model.EInvoicing.V1.NotFoundError;
import Avalara.SDK.model.EInvoicing.V1.ReportDownloadResponse;
import Avalara.SDK.model.EInvoicing.V1.ReportItem;
import Avalara.SDK.model.EInvoicing.V1.ReportListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportsApi(ApiClient apiClient) {
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
     * Build call for downloadReport
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a pre-signed URL to download the report. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found or not yet available for download. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadReportCall(DownloadReportRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/reports/{reportId}/$download"
            .replaceAll("\\{" + "reportId" + "\\}", localVarApiClient.escapeString(requestParameters.reportId.toString()));

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
    private okhttp3.Call downloadReportValidateBeforeCall(DownloadReportRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling downloadReport(Async)");
        }
        
        // verify the required parameter 'requestParameters.reportId' is set
        if (requestParameters.getReportId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.reportId' when calling downloadReport(Async)");
        }
        

        okhttp3.Call localVarCall = downloadReportCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns a pre-signed download URL for a report
     * Returns a pre-signed URL to download the report file when it is available. If the report has not yet been generated, a 404 (not found) is returned.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ReportDownloadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a pre-signed URL to download the report. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found or not yet available for download. </td><td>  -  </td></tr>
     </table>
     */
    public ReportDownloadResponse downloadReport(DownloadReportRequest requestParameters) throws ApiException {
        ApiResponse<ReportDownloadResponse> localVarResp = downloadReportWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns a pre-signed download URL for a report
     * Returns a pre-signed URL to download the report file when it is available. If the report has not yet been generated, a 404 (not found) is returned.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;ReportDownloadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a pre-signed URL to download the report. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found or not yet available for download. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportDownloadResponse> downloadReportWithHttpInfo(DownloadReportRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = downloadReportValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<ReportDownloadResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a pre-signed download URL for a report (asynchronously)
     * Returns a pre-signed URL to download the report file when it is available. If the report has not yet been generated, a 404 (not found) is returned.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a pre-signed URL to download the report. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found or not yet available for download. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadReportAsync(DownloadReportRequest requestParameters, final ApiCallback<ReportDownloadResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadReportValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<ReportDownloadResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the DownloadReport API
    *
    * @param avalaraVersion Header that specifies the API version to use (for example \"1.6\").</param>
    * @param reportId The unique ID for this report as returned in a GET /reports response.</param>
    * @param xAvalaraClient Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\"). (optional)</param>
    * @param xCorrelationID Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\"). (optional)</param>
    */
    public class DownloadReportRequest {
        private String avalaraVersion;
        private String reportId;
        private String xAvalaraClient;
        private String xCorrelationID;

        public DownloadReportRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.6"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getReportId() { return reportId; }
        public void setReportId(String reportId) { this.reportId = reportId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns DownloadReportRequest
    */
    public DownloadReportRequest getDownloadReportRequest() {
        return this.new DownloadReportRequest();
    }

    /**
     * Build call for getReportById
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Report found and returned successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportByIdCall(GetReportByIdRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/reports/{reportId}/status"
            .replaceAll("\\{" + "reportId" + "\\}", localVarApiClient.escapeString(requestParameters.reportId.toString()));

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
    private okhttp3.Call getReportByIdValidateBeforeCall(GetReportByIdRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getReportById(Async)");
        }
        
        // verify the required parameter 'requestParameters.reportId' is set
        if (requestParameters.getReportId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.reportId' when calling getReportById(Async)");
        }
        

        okhttp3.Call localVarCall = getReportByIdCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Retrieves a report by its unique ID
     * Retrieves a specific report by its unique identifier. Returns complete report details including metadata, status, and associated information.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ReportItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Report found and returned successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found. </td><td>  -  </td></tr>
     </table>
     */
    public ReportItem getReportById(GetReportByIdRequest requestParameters) throws ApiException {
        ApiResponse<ReportItem> localVarResp = getReportByIdWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Retrieves a report by its unique ID
     * Retrieves a specific report by its unique identifier. Returns complete report details including metadata, status, and associated information.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;ReportItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Report found and returned successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportItem> getReportByIdWithHttpInfo(GetReportByIdRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getReportByIdValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<ReportItem>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves a report by its unique ID (asynchronously)
     * Retrieves a specific report by its unique identifier. Returns complete report details including metadata, status, and associated information.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Report found and returned successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportByIdAsync(GetReportByIdRequest requestParameters, final ApiCallback<ReportItem> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportByIdValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<ReportItem>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetReportById API
    *
    * @param avalaraVersion Header that specifies the API version to use (for example \"1.6\").</param>
    * @param reportId The unique ID for this report as returned in a GET /reports response.</param>
    * @param xAvalaraClient Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\"). (optional)</param>
    * @param xCorrelationID Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\"). (optional)</param>
    */
    public class GetReportByIdRequest {
        private String avalaraVersion;
        private String reportId;
        private String xAvalaraClient;
        private String xCorrelationID;

        public GetReportByIdRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.6"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getReportId() { return reportId; }
        public void setReportId(String reportId) { this.reportId = reportId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetReportByIdRequest
    */
    public GetReportByIdRequest getGetReportByIdRequest() {
        return this.new GetReportByIdRequest();
    }

    /**
     * Build call for getReports
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Reports retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportsCall(GetReportsRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/reports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.get$filter() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$filter", requestParameters.get$filter()));
        }

        if (requestParameters.get$top() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$top", requestParameters.get$top()));
        }

        if (requestParameters.get$skip() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$skip", requestParameters.get$skip()));
        }

        if (requestParameters.get$count() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$count", requestParameters.get$count()));
        }

        if (requestParameters.get$countOnly() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$countOnly", requestParameters.get$countOnly()));
        }

        if (requestParameters.get$orderby() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$orderby", requestParameters.get$orderby()));
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
    private okhttp3.Call getReportsValidateBeforeCall(GetReportsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getReports(Async)");
        }
        

        okhttp3.Call localVarCall = getReportsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns a list of reports
     * Retrieves all reports with optional filtering, paging, and sorting. Results are filtered by tenant. Supports OData-style filtering using the $filter parameter. Use $top and $skip for paging; when more results exist, the response includes @nextLink to fetch the next page. Default sort order is by report generation date (descending).
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ReportListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Reports retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
     </table>
     */
    public ReportListResponse getReports(GetReportsRequest requestParameters) throws ApiException {
        ApiResponse<ReportListResponse> localVarResp = getReportsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns a list of reports
     * Retrieves all reports with optional filtering, paging, and sorting. Results are filtered by tenant. Supports OData-style filtering using the $filter parameter. Use $top and $skip for paging; when more results exist, the response includes @nextLink to fetch the next page. Default sort order is by report generation date (descending).
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;ReportListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Reports retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportListResponse> getReportsWithHttpInfo(GetReportsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getReportsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<ReportListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of reports (asynchronously)
     * Retrieves all reports with optional filtering, paging, and sorting. Results are filtered by tenant. Supports OData-style filtering using the $filter parameter. Use $top and $skip for paging; when more results exist, the response includes @nextLink to fetch the next page. Default sort order is by report generation date (descending).
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Reports retrieved successfully. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportsAsync(GetReportsRequest requestParameters, final ApiCallback<ReportListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<ReportListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetReports API
    *
    * @param avalaraVersion Header that specifies the API version to use (for example \"1.6\").</param>
    * @param xAvalaraClient Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\"). (optional)</param>
    * @param xCorrelationID Optional correlation identifier provided by the caller to trace the call (for example \"f3f0d19a-01a1-4748-8a58-f000d0424f43\"). (optional)</param>
    * @param $filter OData-style filter expression. Supports operators: eq, ne, gt, ge, lt, le, like, ilike, contains. Examples: status eq 'COMPLETED', reportGenerateDate gt '2025-11-01', transactionIds contains 'TXN-2025-001' (optional)</param>
    * @param $top The number of items to include in the result. (optional)</param>
    * @param $skip The number of items to skip in the result. (optional)</param>
    * @param $count When set to true, the response body also includes the count of items in the collection. (optional)</param>
    * @param $countOnly When set to true, the response returns only the count of items in the collection. (optional)</param>
    * @param $orderby OData-style orderby expression. Format: 'field asc' or 'field desc'. Default: reportGenerateDate desc (optional, default to reportGenerateDate desc)</param>
    */
    public class GetReportsRequest {
        private String avalaraVersion;
        private String xAvalaraClient;
        private String xCorrelationID;
        private String $filter;
        private Integer $top;
        private Integer $skip;
        private String $count;
        private String $countOnly;
        private String $orderby;

        public GetReportsRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.6"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
        public String get$filter() { return $filter; }
        public void set$filter(String $filter) { this.$filter = $filter; }
        public Integer get$top() { return $top; }
        public void set$top(Integer $top) { this.$top = $top; }
        public Integer get$skip() { return $skip; }
        public void set$skip(Integer $skip) { this.$skip = $skip; }
        public String get$count() { return $count; }
        public void set$count(String $count) { this.$count = $count; }
        public String get$countOnly() { return $countOnly; }
        public void set$countOnly(String $countOnly) { this.$countOnly = $countOnly; }
        public String get$orderby() { return $orderby; }
        public void set$orderby(String $orderby) { this.$orderby = $orderby; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetReportsRequest
    */
    public GetReportsRequest getGetReportsRequest() {
        return this.new GetReportsRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("26.4.0");
    }
}

