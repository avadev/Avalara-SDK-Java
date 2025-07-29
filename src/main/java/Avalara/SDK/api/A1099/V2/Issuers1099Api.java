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
import Avalara.SDK.model.A1099.V2.IssuerCommand;
import Avalara.SDK.model.A1099.V2.IssuerResponse;
import Avalara.SDK.model.A1099.V2.PaginatedQueryResultModelIssuerResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Issuers1099Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public Issuers1099Api(ApiClient apiClient) {
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
     * Build call for createIssuer
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created issuer </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createIssuerCall(CreateIssuerRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getIssuerCommand();

        // create path and map variables
        String localVarPath = "/1099/issuers";

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
        if (localVarAccept != null) {
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
    private okhttp3.Call createIssuerValidateBeforeCall(CreateIssuerRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling createIssuer(Async)");
        }
        

        okhttp3.Call localVarCall = createIssuerCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Create an issuer
     * Create an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @return IssuerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created issuer </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public IssuerResponse createIssuer(CreateIssuerRequest requestParameters) throws ApiException {
        ApiResponse<IssuerResponse> localVarResp = createIssuerWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Create an issuer
     * Create an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;IssuerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created issuer </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IssuerResponse> createIssuerWithHttpInfo(CreateIssuerRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = createIssuerValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<IssuerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create an issuer (asynchronously)
     * Create an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created issuer </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createIssuerAsync(CreateIssuerRequest requestParameters, final ApiCallback<IssuerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createIssuerValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<IssuerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the CreateIssuer API
    *
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param issuerCommand The issuer to create (optional)</param>
    */
    public class CreateIssuerRequest {
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private IssuerCommand issuerCommand;

        public CreateIssuerRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public IssuerCommand getIssuerCommand() { return issuerCommand; }
        public void setIssuerCommand(IssuerCommand issuerCommand) { this.issuerCommand = issuerCommand; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns CreateIssuerRequest
    */
    public CreateIssuerRequest getCreateIssuerRequest() {
        return this.new CreateIssuerRequest();
    }

    /**
     * Build call for deleteIssuer
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteIssuerCall(DeleteIssuerRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1099/issuers/{id}"
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
        if (localVarAccept != null) {
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
    private okhttp3.Call deleteIssuerValidateBeforeCall(DeleteIssuerRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling deleteIssuer(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling deleteIssuer(Async)");
        }
        

        okhttp3.Call localVarCall = deleteIssuerCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Delete an issuer
     * Delete an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public void deleteIssuer(DeleteIssuerRequest requestParameters) throws ApiException {
        deleteIssuerWithHttpInfo(requestParameters);
    }

    /**
     * Delete an issuer
     * Delete an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteIssuerWithHttpInfo(DeleteIssuerRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = deleteIssuerValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete an issuer (asynchronously)
     * Delete an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteIssuerAsync(DeleteIssuerRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteIssuerValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the DeleteIssuer API
    *
    * @param id Id of the issuer to delete</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class DeleteIssuerRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public DeleteIssuerRequest () {
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
    * @returns DeleteIssuerRequest
    */
    public DeleteIssuerRequest getDeleteIssuerRequest() {
        return this.new DeleteIssuerRequest();
    }

    /**
     * Build call for getIssuer
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Single issuer </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIssuerCall(GetIssuerRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1099/issuers/{id}"
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
        if (localVarAccept != null) {
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
    private okhttp3.Call getIssuerValidateBeforeCall(GetIssuerRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling getIssuer(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getIssuer(Async)");
        }
        

        okhttp3.Call localVarCall = getIssuerCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Retrieve an issuer
     * Retrieve an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @return IssuerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Single issuer </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public IssuerResponse getIssuer(GetIssuerRequest requestParameters) throws ApiException {
        ApiResponse<IssuerResponse> localVarResp = getIssuerWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Retrieve an issuer
     * Retrieve an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;IssuerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Single issuer </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IssuerResponse> getIssuerWithHttpInfo(GetIssuerRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getIssuerValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<IssuerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve an issuer (asynchronously)
     * Retrieve an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Single issuer </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIssuerAsync(GetIssuerRequest requestParameters, final ApiCallback<IssuerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIssuerValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<IssuerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetIssuer API
    *
    * @param id Id of the issuer to retrieve</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class GetIssuerRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public GetIssuerRequest () {
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
    * @returns GetIssuerRequest
    */
    public GetIssuerRequest getGetIssuerRequest() {
        return this.new GetIssuerRequest();
    }

    /**
     * Build call for getIssuers
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of issuers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIssuersCall(GetIssuersRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/1099/issuers";

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
        if (localVarAccept != null) {
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
    private okhttp3.Call getIssuersValidateBeforeCall(GetIssuersRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getIssuers(Async)");
        }
        

        okhttp3.Call localVarCall = getIssuersCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * List issuers
     * List issuers (also known as Payers). Filterable fields are name, referenceId and taxYear.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return PaginatedQueryResultModelIssuerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of issuers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedQueryResultModelIssuerResponse getIssuers(GetIssuersRequest requestParameters) throws ApiException {
        ApiResponse<PaginatedQueryResultModelIssuerResponse> localVarResp = getIssuersWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * List issuers
     * List issuers (also known as Payers). Filterable fields are name, referenceId and taxYear.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;PaginatedQueryResultModelIssuerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of issuers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedQueryResultModelIssuerResponse> getIssuersWithHttpInfo(GetIssuersRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getIssuersValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<PaginatedQueryResultModelIssuerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List issuers (asynchronously)
     * List issuers (also known as Payers). Filterable fields are name, referenceId and taxYear.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of issuers </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIssuersAsync(GetIssuersRequest requestParameters, final ApiCallback<PaginatedQueryResultModelIssuerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIssuersValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<PaginatedQueryResultModelIssuerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetIssuers API
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
    public class GetIssuersRequest {
        private String avalaraVersion;
        private String $filter;
        private Integer $top;
        private Integer $skip;
        private String $orderBy;
        private Boolean count;
        private Boolean countOnly;
        private String xCorrelationId;
        private String xAvalaraClient;

        public GetIssuersRequest () {
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
    * @returns GetIssuersRequest
    */
    public GetIssuersRequest getGetIssuersRequest() {
        return this.new GetIssuersRequest();
    }

    /**
     * Build call for updateIssuer
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Issuer updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateIssuerCall(UpdateIssuerRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getIssuerCommand();

        // create path and map variables
        String localVarPath = "/1099/issuers/{id}"
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
        if (localVarAccept != null) {
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
    private okhttp3.Call updateIssuerValidateBeforeCall(UpdateIssuerRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling updateIssuer(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling updateIssuer(Async)");
        }
        

        okhttp3.Call localVarCall = updateIssuerCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Update an issuer
     * Update an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Issuer updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
     </table>
     */
    public void updateIssuer(UpdateIssuerRequest requestParameters) throws ApiException {
        updateIssuerWithHttpInfo(requestParameters);
    }

    /**
     * Update an issuer
     * Update an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Issuer updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateIssuerWithHttpInfo(UpdateIssuerRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = updateIssuerValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update an issuer (asynchronously)
     * Update an issuer (also known as a Payer).
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Issuer updated </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateIssuerAsync(UpdateIssuerRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateIssuerValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the UpdateIssuer API
    *
    * @param id Id of the issuer to update</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param issuerCommand The issuer to update (optional)</param>
    */
    public class UpdateIssuerRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private IssuerCommand issuerCommand;

        public UpdateIssuerRequest () {
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public IssuerCommand getIssuerCommand() { return issuerCommand; }
        public void setIssuerCommand(IssuerCommand issuerCommand) { this.issuerCommand = issuerCommand; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns UpdateIssuerRequest
    */
    public UpdateIssuerRequest getUpdateIssuerRequest() {
        return this.new UpdateIssuerRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("25.8.0");
    }
}

