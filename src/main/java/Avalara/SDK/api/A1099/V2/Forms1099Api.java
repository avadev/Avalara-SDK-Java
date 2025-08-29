/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2025 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara 1099 & W-9 API Definition
 *
 * ## 🔐 Authentication  Generate a **license key** from: *[Avalara Portal](https://www.avalara.com/us/en/signin.html) → Settings → License and API Keys*.  [More on authentication methods](https://developer.avalara.com/avatax-dm-combined-erp/common-setup/authentication/authentication-methods/)  [Test your credentials](https://developer.avalara.com/avatax/test-credentials/)  ## 📘 API & SDK Documentation  [Avalara SDK (.NET) on GitHub](https://github.com/avadev/Avalara-SDK-DotNet#avalarasdk--the-unified-c-library-for-next-gen-avalara-services)  [Code Examples – 1099 API](https://github.com/avadev/Avalara-SDK-DotNet/blob/main/docs/A1099/V2/Class1099IssuersApi.md#call1099issuersget)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.api.A1099.V2;

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


import Avalara.SDK.model.A1099.V2.ErrorResponse;
import java.io.File;
import Avalara.SDK.model.A1099.V2.Form1099ListRequest;
import Avalara.SDK.model.A1099.V2.Get1099Form200Response;
import Avalara.SDK.model.A1099.V2.JobResponse;
import Avalara.SDK.model.A1099.V2.PaginatedQueryResultModelForm1099Base;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Forms1099Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public Forms1099Api(ApiClient apiClient) {
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
     * Build call for bulkUpsert1099Forms
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkUpsert1099FormsCall(BulkUpsert1099FormsRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getForm1099ListRequest();

        // create path and map variables
        String localVarPath = "/1099/forms/$bulk-upsert";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getDryRun() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", requestParameters.getDryRun()));
        }

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationId() != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(requestParameters.getXCorrelationId()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.A1099);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call bulkUpsert1099FormsValidateBeforeCall(BulkUpsert1099FormsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling bulkUpsert1099Forms(Async)");
        }
        

        okhttp3.Call localVarCall = bulkUpsert1099FormsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Create or update multiple 1099/1095/W2/1042S forms
     * This endpoint allows you to create or update multiple 1099/1095/W2/1042S forms.  Maximum of 5000 forms can be processed in a single bulk request.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return JobResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public JobResponse bulkUpsert1099Forms(BulkUpsert1099FormsRequest requestParameters) throws ApiException {
        ApiResponse<JobResponse> localVarResp = bulkUpsert1099FormsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Create or update multiple 1099/1095/W2/1042S forms
     * This endpoint allows you to create or update multiple 1099/1095/W2/1042S forms.  Maximum of 5000 forms can be processed in a single bulk request.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;JobResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JobResponse> bulkUpsert1099FormsWithHttpInfo(BulkUpsert1099FormsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = bulkUpsert1099FormsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<JobResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create or update multiple 1099/1095/W2/1042S forms (asynchronously)
     * This endpoint allows you to create or update multiple 1099/1095/W2/1042S forms.  Maximum of 5000 forms can be processed in a single bulk request.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call bulkUpsert1099FormsAsync(BulkUpsert1099FormsRequest requestParameters, final ApiCallback<JobResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = bulkUpsert1099FormsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<JobResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the BulkUpsert1099Forms API
    *
    * @param avalaraVersion API version</param>
    * @param dryRun defaults to false. If true, it will NOT change the DB. It will just return a report of what would've have been changed in the DB (optional, default to false)</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param form1099ListRequest  (optional)</param>
    */
    public class BulkUpsert1099FormsRequest {
        private String avalaraVersion;
        private Boolean dryRun;
        private String xCorrelationId;
        private String xAvalaraClient;
        private Form1099ListRequest form1099ListRequest;

        public BulkUpsert1099FormsRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public Boolean getDryRun() { return dryRun; }
        public void setDryRun(Boolean dryRun) { this.dryRun = dryRun; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public Form1099ListRequest getForm1099ListRequest() { return form1099ListRequest; }
        public void setForm1099ListRequest(Form1099ListRequest form1099ListRequest) { this.form1099ListRequest = form1099ListRequest; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns BulkUpsert1099FormsRequest
    */
    public BulkUpsert1099FormsRequest getBulkUpsert1099FormsRequest() {
        return this.new BulkUpsert1099FormsRequest();
    }

    /**
     * Build call for create1099Form
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call create1099FormCall(Create1099FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getGet1099Form200Response();

        // create path and map variables
        String localVarPath = "/1099/forms";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationId() != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(requestParameters.getXCorrelationId()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.A1099);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call create1099FormValidateBeforeCall(Create1099FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling create1099Form(Async)");
        }
        

        okhttp3.Call localVarCall = create1099FormCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Create a 1099/1095/W2/1042S form
     * Create a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return Get1099Form200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public Get1099Form200Response create1099Form(Create1099FormRequest requestParameters) throws ApiException {
        ApiResponse<Get1099Form200Response> localVarResp = create1099FormWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Create a 1099/1095/W2/1042S form
     * Create a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Get1099Form200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Get1099Form200Response> create1099FormWithHttpInfo(Create1099FormRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = create1099FormValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<Get1099Form200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a 1099/1095/W2/1042S form (asynchronously)
     * Create a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call create1099FormAsync(Create1099FormRequest requestParameters, final ApiCallback<Get1099Form200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = create1099FormValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<Get1099Form200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the Create1099Form API
    *
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param get1099Form200Response  (optional)</param>
    */
    public class Create1099FormRequest {
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private Get1099Form200Response get1099Form200Response;

        public Create1099FormRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public Get1099Form200Response getGet1099Form200Response() { return get1099Form200Response; }
        public void setGet1099Form200Response(Get1099Form200Response get1099Form200Response) { this.get1099Form200Response = get1099Form200Response; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns Create1099FormRequest
    */
    public Create1099FormRequest getCreate1099FormRequest() {
        return this.new Create1099FormRequest();
    }

    /**
     * Build call for delete1099Form
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call delete1099FormCall(Delete1099FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1099/forms/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationId() != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(requestParameters.getXCorrelationId()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
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
        String[] localVarAuthNames = new String[] { "OAuth", "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.A1099);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call delete1099FormValidateBeforeCall(Delete1099FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling delete1099Form(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling delete1099Form(Async)");
        }
        

        okhttp3.Call localVarCall = delete1099FormCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Delete a 1099/1095/W2/1042S form
     * Delete a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public void delete1099Form(Delete1099FormRequest requestParameters) throws ApiException {
        delete1099FormWithHttpInfo(requestParameters);
    }

    /**
     * Delete a 1099/1095/W2/1042S form
     * Delete a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> delete1099FormWithHttpInfo(Delete1099FormRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = delete1099FormValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a 1099/1095/W2/1042S form (asynchronously)
     * Delete a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Client Error </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call delete1099FormAsync(Delete1099FormRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = delete1099FormValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the Delete1099Form API
    *
    * @param id The unique identifier of the desired form to delete.</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class Delete1099FormRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public Delete1099FormRequest () {
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns Delete1099FormRequest
    */
    public Delete1099FormRequest getDelete1099FormRequest() {
        return this.new Delete1099FormRequest();
    }

    /**
     * Build call for get1099Form
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call get1099FormCall(Get1099FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1099/forms/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationId() != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(requestParameters.getXCorrelationId()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
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
        String[] localVarAuthNames = new String[] { "OAuth", "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.A1099);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call get1099FormValidateBeforeCall(Get1099FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling get1099Form(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling get1099Form(Async)");
        }
        

        okhttp3.Call localVarCall = get1099FormCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a 1099/1095/W2/1042S form
     * Retrieve a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return Get1099Form200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public Get1099Form200Response get1099Form(Get1099FormRequest requestParameters) throws ApiException {
        ApiResponse<Get1099Form200Response> localVarResp = get1099FormWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Retrieve a 1099/1095/W2/1042S form
     * Retrieve a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Get1099Form200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Get1099Form200Response> get1099FormWithHttpInfo(Get1099FormRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = get1099FormValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<Get1099Form200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a 1099/1095/W2/1042S form (asynchronously)
     * Retrieve a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call get1099FormAsync(Get1099FormRequest requestParameters, final ApiCallback<Get1099Form200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = get1099FormValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<Get1099Form200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the Get1099Form API
    *
    * @param id </param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class Get1099FormRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public Get1099FormRequest () {
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns Get1099FormRequest
    */
    public Get1099FormRequest getGet1099FormRequest() {
        return this.new Get1099FormRequest();
    }

    /**
     * Build call for get1099FormPdf
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call get1099FormPdfCall(Get1099FormPdfRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1099/forms/{id}/pdf"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getMarkEdelivered() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("markEdelivered", requestParameters.getMarkEdelivered()));
        }

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationId() != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(requestParameters.getXCorrelationId()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/pdf", "application/json"
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
        String[] localVarAuthNames = new String[] { "OAuth", "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.A1099);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call get1099FormPdfValidateBeforeCall(Get1099FormPdfRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling get1099FormPdf(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling get1099FormPdf(Async)");
        }
        

        okhttp3.Call localVarCall = get1099FormPdfCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Retrieve the PDF file for a 1099/1095/W2/1042S form
     * Retrieve the PDF file for a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public File get1099FormPdf(Get1099FormPdfRequest requestParameters) throws ApiException {
        ApiResponse<File> localVarResp = get1099FormPdfWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Retrieve the PDF file for a 1099/1095/W2/1042S form
     * Retrieve the PDF file for a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> get1099FormPdfWithHttpInfo(Get1099FormPdfRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = get1099FormPdfValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve the PDF file for a 1099/1095/W2/1042S form (asynchronously)
     * Retrieve the PDF file for a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call get1099FormPdfAsync(Get1099FormPdfRequest requestParameters, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = get1099FormPdfValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the Get1099FormPdf API
    *
    * @param id The ID of the form</param>
    * @param avalaraVersion API version</param>
    * @param markEdelivered Optional boolean that if set indicates that the form should be marked as having been successfully edelivered (optional)</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class Get1099FormPdfRequest {
        private String id;
        private String avalaraVersion;
        private Boolean markEdelivered;
        private String xCorrelationId;
        private String xAvalaraClient;

        public Get1099FormPdfRequest () {
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public Boolean getMarkEdelivered() { return markEdelivered; }
        public void setMarkEdelivered(Boolean markEdelivered) { this.markEdelivered = markEdelivered; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns Get1099FormPdfRequest
    */
    public Get1099FormPdfRequest getGet1099FormPdfRequest() {
        return this.new Get1099FormPdfRequest();
    }

    /**
     * Build call for list1099Forms
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call list1099FormsCall(List1099FormsRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1099/forms";

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

        if (requestParameters.get$orderBy() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$orderBy", requestParameters.get$orderBy()));
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

        if (requestParameters.getXCorrelationId() != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(requestParameters.getXCorrelationId()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
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
        String[] localVarAuthNames = new String[] { "OAuth", "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.A1099);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call list1099FormsValidateBeforeCall(List1099FormsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling list1099Forms(Async)");
        }
        

        okhttp3.Call localVarCall = list1099FormsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * List 1099/1095/W2/1042S forms
     * List 1099/1095/W2/1042S forms.                Collections support filtering only on certain fields. An attempt to filter on an unsupported field will receive a 400 Bad Request response.                Supported filtering fields are as follows:                - issuerId  - issuerReferenceId  - taxYear  - addressVerificationStatus - possible values are: unknown, pending, failed, incomplete, unchanged, verified  - createdAt  - edeliveryStatus - possible values are: sent, unscheduled, bad_verify, bad_verify_limit, scheduled, bounced, accepted  - email  - federalEfileStatus - possible values are: unscheduled, scheduled, sent, corrected_scheduled, accepted, corrected, corrected_accepted, held  - recipientName  - mailStatus - possible values are: sent, unscheduled, pending, delivered  - referenceId  - tinMatchStatus - possible values are: none, pending, matched, failed  - type - possible values are: 940, 941, 943, 944, 945, 1042, 1042-S, 1095-B, 1095-C, 1097-BTC, 1098, 1098-C, 1098-E, 1098-Q, 1098-T, 3921, 3922, 5498, 5498-ESA, 5498-SA, 1099-MISC, 1099-A, 1099-B, 1099-C, 1099-CAP, 1099-DIV, 1099-G, 1099-INT, 1099-K, 1099-LS, 1099-LTC, 1099-NEC, 1099-OID, 1099-PATR, 1099-Q, 1099-R, 1099-S, 1099-SA, T4A, W-2, W-2G, 1099-HC  - updatedAt  - validity - possible values are: true, false                For more information on filtering, see &lt;see href&#x3D;\&quot;https://developer.avalara.com/avatax/filtering-in-rest/\&quot;&gt;Filtering in REST&lt;/see&gt;.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return PaginatedQueryResultModelForm1099Base
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedQueryResultModelForm1099Base list1099Forms(List1099FormsRequest requestParameters) throws ApiException {
        ApiResponse<PaginatedQueryResultModelForm1099Base> localVarResp = list1099FormsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * List 1099/1095/W2/1042S forms
     * List 1099/1095/W2/1042S forms.                Collections support filtering only on certain fields. An attempt to filter on an unsupported field will receive a 400 Bad Request response.                Supported filtering fields are as follows:                - issuerId  - issuerReferenceId  - taxYear  - addressVerificationStatus - possible values are: unknown, pending, failed, incomplete, unchanged, verified  - createdAt  - edeliveryStatus - possible values are: sent, unscheduled, bad_verify, bad_verify_limit, scheduled, bounced, accepted  - email  - federalEfileStatus - possible values are: unscheduled, scheduled, sent, corrected_scheduled, accepted, corrected, corrected_accepted, held  - recipientName  - mailStatus - possible values are: sent, unscheduled, pending, delivered  - referenceId  - tinMatchStatus - possible values are: none, pending, matched, failed  - type - possible values are: 940, 941, 943, 944, 945, 1042, 1042-S, 1095-B, 1095-C, 1097-BTC, 1098, 1098-C, 1098-E, 1098-Q, 1098-T, 3921, 3922, 5498, 5498-ESA, 5498-SA, 1099-MISC, 1099-A, 1099-B, 1099-C, 1099-CAP, 1099-DIV, 1099-G, 1099-INT, 1099-K, 1099-LS, 1099-LTC, 1099-NEC, 1099-OID, 1099-PATR, 1099-Q, 1099-R, 1099-S, 1099-SA, T4A, W-2, W-2G, 1099-HC  - updatedAt  - validity - possible values are: true, false                For more information on filtering, see &lt;see href&#x3D;\&quot;https://developer.avalara.com/avatax/filtering-in-rest/\&quot;&gt;Filtering in REST&lt;/see&gt;.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;PaginatedQueryResultModelForm1099Base&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedQueryResultModelForm1099Base> list1099FormsWithHttpInfo(List1099FormsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = list1099FormsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<PaginatedQueryResultModelForm1099Base>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List 1099/1095/W2/1042S forms (asynchronously)
     * List 1099/1095/W2/1042S forms.                Collections support filtering only on certain fields. An attempt to filter on an unsupported field will receive a 400 Bad Request response.                Supported filtering fields are as follows:                - issuerId  - issuerReferenceId  - taxYear  - addressVerificationStatus - possible values are: unknown, pending, failed, incomplete, unchanged, verified  - createdAt  - edeliveryStatus - possible values are: sent, unscheduled, bad_verify, bad_verify_limit, scheduled, bounced, accepted  - email  - federalEfileStatus - possible values are: unscheduled, scheduled, sent, corrected_scheduled, accepted, corrected, corrected_accepted, held  - recipientName  - mailStatus - possible values are: sent, unscheduled, pending, delivered  - referenceId  - tinMatchStatus - possible values are: none, pending, matched, failed  - type - possible values are: 940, 941, 943, 944, 945, 1042, 1042-S, 1095-B, 1095-C, 1097-BTC, 1098, 1098-C, 1098-E, 1098-Q, 1098-T, 3921, 3922, 5498, 5498-ESA, 5498-SA, 1099-MISC, 1099-A, 1099-B, 1099-C, 1099-CAP, 1099-DIV, 1099-G, 1099-INT, 1099-K, 1099-LS, 1099-LTC, 1099-NEC, 1099-OID, 1099-PATR, 1099-Q, 1099-R, 1099-S, 1099-SA, T4A, W-2, W-2G, 1099-HC  - updatedAt  - validity - possible values are: true, false                For more information on filtering, see &lt;see href&#x3D;\&quot;https://developer.avalara.com/avatax/filtering-in-rest/\&quot;&gt;Filtering in REST&lt;/see&gt;.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call list1099FormsAsync(List1099FormsRequest requestParameters, final ApiCallback<PaginatedQueryResultModelForm1099Base> _callback) throws ApiException {

        okhttp3.Call localVarCall = list1099FormsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<PaginatedQueryResultModelForm1099Base>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the List1099Forms API
    *
    * @param avalaraVersion API version</param>
    * @param $filter A filter statement to identify specific records to retrieve.  For more information on filtering, see <a href=\"https://developer.avalara.com/avatax/filtering-in-rest/\">Filtering in REST</a>. (optional)</param>
    * @param $top If zero or greater than 1000, return at most 1000 results.  Otherwise, return this number of results.  Used with skip to provide pagination for large datasets. (optional)</param>
    * @param $skip If nonzero, skip this number of results before returning data. Used with top to provide pagination for large datasets. (optional)</param>
    * @param $orderBy A comma separated list of sort statements in the format (fieldname) [ASC|DESC], for example id ASC. (optional)</param>
    * @param count If true, return the global count of elements in the collection. (optional)</param>
    * @param countOnly If true, return ONLY the global count of elements in the collection.  It only applies when count=true. (optional)</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class List1099FormsRequest {
        private String avalaraVersion;
        private String $filter;
        private Integer $top;
        private Integer $skip;
        private String $orderBy;
        private Boolean count;
        private Boolean countOnly;
        private String xCorrelationId;
        private String xAvalaraClient;

        public List1099FormsRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String get$filter() { return $filter; }
        public void set$filter(String $filter) { this.$filter = $filter; }
        public Integer get$top() { return $top; }
        public void set$top(Integer $top) { this.$top = $top; }
        public Integer get$skip() { return $skip; }
        public void set$skip(Integer $skip) { this.$skip = $skip; }
        public String get$orderBy() { return $orderBy; }
        public void set$orderBy(String $orderBy) { this.$orderBy = $orderBy; }
        public Boolean getCount() { return count; }
        public void setCount(Boolean count) { this.count = count; }
        public Boolean getCountOnly() { return countOnly; }
        public void setCountOnly(Boolean countOnly) { this.countOnly = countOnly; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns List1099FormsRequest
    */
    public List1099FormsRequest getList1099FormsRequest() {
        return this.new List1099FormsRequest();
    }

    /**
     * Build call for update1099Form
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call update1099FormCall(Update1099FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getGet1099Form200Response();

        // create path and map variables
        String localVarPath = "/1099/forms/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXCorrelationId() != null) {
            localVarHeaderParams.put("X-Correlation-Id", localVarApiClient.parameterToString(requestParameters.getXCorrelationId()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null && !localVarHeaderParams.containsKey("Accept")) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.A1099);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call update1099FormValidateBeforeCall(Update1099FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling update1099Form(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling update1099Form(Async)");
        }
        

        okhttp3.Call localVarCall = update1099FormCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Update a 1099/1095/W2/1042S form
     * Update a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return Get1099Form200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public Get1099Form200Response update1099Form(Update1099FormRequest requestParameters) throws ApiException {
        ApiResponse<Get1099Form200Response> localVarResp = update1099FormWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Update a 1099/1095/W2/1042S form
     * Update a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Get1099Form200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Get1099Form200Response> update1099FormWithHttpInfo(Update1099FormRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = update1099FormValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<Get1099Form200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a 1099/1095/W2/1042S form (asynchronously)
     * Update a 1099/1095/W2/1042S form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call update1099FormAsync(Update1099FormRequest requestParameters, final ApiCallback<Get1099Form200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = update1099FormValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<Get1099Form200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the Update1099Form API
    *
    * @param id </param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param get1099Form200Response  (optional)</param>
    */
    public class Update1099FormRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private Get1099Form200Response get1099Form200Response;

        public Update1099FormRequest () {
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public Get1099Form200Response getGet1099Form200Response() { return get1099Form200Response; }
        public void setGet1099Form200Response(Get1099Form200Response get1099Form200Response) { this.get1099Form200Response = get1099Form200Response; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns Update1099FormRequest
    */
    public Update1099FormRequest getUpdate1099FormRequest() {
        return this.new Update1099FormRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("25.8.3");
    }
}

