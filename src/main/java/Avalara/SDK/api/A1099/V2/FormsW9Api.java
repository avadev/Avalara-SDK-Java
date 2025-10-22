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


import Avalara.SDK.model.A1099.V2.CreateAndSendW9FormEmailRequest;
import Avalara.SDK.model.A1099.V2.CreateW9Form201Response;
import Avalara.SDK.model.A1099.V2.CreateW9FormRequest;
import Avalara.SDK.model.A1099.V2.ErrorResponse;
import java.io.File;
import Avalara.SDK.model.A1099.V2.PaginatedQueryResultModelW9FormBaseResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormsW9Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FormsW9Api(ApiClient apiClient) {
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
     * Build call for createAndSendW9FormEmail
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g. Unknown form type: W10\&quot;) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAndSendW9FormEmailCall(CreateAndSendW9FormEmailRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getCreateAndSendW9FormEmailRequest();

        // create path and map variables
        String localVarPath = "/w9/forms/$create-and-send-email";

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
    private okhttp3.Call createAndSendW9FormEmailValidateBeforeCall(CreateAndSendW9FormEmailRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling createAndSendW9FormEmail(Async)");
        }
        

        okhttp3.Call localVarCall = createAndSendW9FormEmailCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Create a minimal W9/W4/W8 form and sends the e-mail request
     * Create a minimal W9/W4/W8 form and sends the e-mail request.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CreateW9Form201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g. Unknown form type: W10\&quot;) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public CreateW9Form201Response createAndSendW9FormEmail(CreateAndSendW9FormEmailRequest requestParameters) throws ApiException {
        ApiResponse<CreateW9Form201Response> localVarResp = createAndSendW9FormEmailWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Create a minimal W9/W4/W8 form and sends the e-mail request
     * Create a minimal W9/W4/W8 form and sends the e-mail request.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CreateW9Form201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g. Unknown form type: W10\&quot;) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateW9Form201Response> createAndSendW9FormEmailWithHttpInfo(CreateAndSendW9FormEmailRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = createAndSendW9FormEmailValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a minimal W9/W4/W8 form and sends the e-mail request (asynchronously)
     * Create a minimal W9/W4/W8 form and sends the e-mail request.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g. Unknown form type: W10\&quot;) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAndSendW9FormEmailAsync(CreateAndSendW9FormEmailRequest requestParameters, final ApiCallback<CreateW9Form201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = createAndSendW9FormEmailValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the CreateAndSendW9FormEmail API
    *
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param createAndSendW9FormEmailRequest Form to be created (optional)</param>
    */
    public class CreateAndSendW9FormEmailRequest {
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private CreateAndSendW9FormEmailRequest createAndSendW9FormEmailRequest;

        public CreateAndSendW9FormEmailRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public CreateAndSendW9FormEmailRequest getCreateAndSendW9FormEmailRequest() { return createAndSendW9FormEmailRequest; }
        public void setCreateAndSendW9FormEmailRequest(CreateAndSendW9FormEmailRequest createAndSendW9FormEmailRequest) { this.createAndSendW9FormEmailRequest = createAndSendW9FormEmailRequest; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns CreateAndSendW9FormEmailRequest
    */
    public CreateAndSendW9FormEmailRequest getCreateAndSendW9FormEmailRequest() {
        return this.new CreateAndSendW9FormEmailRequest();
    }

    /**
     * Build call for createW9Form
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing required field) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createW9FormCall(CreateW9FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getCreateW9FormRequest();

        // create path and map variables
        String localVarPath = "/w9/forms";

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
    private okhttp3.Call createW9FormValidateBeforeCall(CreateW9FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling createW9Form(Async)");
        }
        

        okhttp3.Call localVarCall = createW9FormCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Create a W9/W4/W8 form
     * Create a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CreateW9Form201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing required field) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public CreateW9Form201Response createW9Form(CreateW9FormRequest requestParameters) throws ApiException {
        ApiResponse<CreateW9Form201Response> localVarResp = createW9FormWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Create a W9/W4/W8 form
     * Create a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CreateW9Form201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing required field) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateW9Form201Response> createW9FormWithHttpInfo(CreateW9FormRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = createW9FormValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a W9/W4/W8 form (asynchronously)
     * Create a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing required field) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createW9FormAsync(CreateW9FormRequest requestParameters, final ApiCallback<CreateW9Form201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = createW9FormValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the CreateW9Form API
    *
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param createW9FormRequest Form to be created (optional)</param>
    */
    public class CreateW9FormRequest {
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private CreateW9FormRequest createW9FormRequest;

        public CreateW9FormRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public CreateW9FormRequest getCreateW9FormRequest() { return createW9FormRequest; }
        public void setCreateW9FormRequest(CreateW9FormRequest createW9FormRequest) { this.createW9FormRequest = createW9FormRequest; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns CreateW9FormRequest
    */
    public CreateW9FormRequest getCreateW9FormRequest() {
        return this.new CreateW9FormRequest();
    }

    /**
     * Build call for deleteW9Form
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteW9FormCall(DeleteW9FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/w9/forms/{id}"
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
    private okhttp3.Call deleteW9FormValidateBeforeCall(DeleteW9FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling deleteW9Form(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling deleteW9Form(Async)");
        }
        

        okhttp3.Call localVarCall = deleteW9FormCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Delete a W9/W4/W8 form
     * Delete a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public void deleteW9Form(DeleteW9FormRequest requestParameters) throws ApiException {
        deleteW9FormWithHttpInfo(requestParameters);
    }

    /**
     * Delete a W9/W4/W8 form
     * Delete a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteW9FormWithHttpInfo(DeleteW9FormRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = deleteW9FormValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a W9/W4/W8 form (asynchronously)
     * Delete a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Empty response </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteW9FormAsync(DeleteW9FormRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteW9FormValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the DeleteW9Form API
    *
    * @param id ID of the form to delete</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class DeleteW9FormRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public DeleteW9FormRequest () {
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
    * @returns DeleteW9FormRequest
    */
    public DeleteW9FormRequest getDeleteW9FormRequest() {
        return this.new DeleteW9FormRequest();
    }

    /**
     * Build call for getW9Form
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> W9/W4/W8 form with id </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getW9FormCall(GetW9FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/w9/forms/{id}"
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
    private okhttp3.Call getW9FormValidateBeforeCall(GetW9FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling getW9Form(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getW9Form(Async)");
        }
        

        okhttp3.Call localVarCall = getW9FormCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a W9/W4/W8 form
     * Retrieve a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CreateW9Form201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> W9/W4/W8 form with id </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public CreateW9Form201Response getW9Form(GetW9FormRequest requestParameters) throws ApiException {
        ApiResponse<CreateW9Form201Response> localVarResp = getW9FormWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Retrieve a W9/W4/W8 form
     * Retrieve a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CreateW9Form201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> W9/W4/W8 form with id </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateW9Form201Response> getW9FormWithHttpInfo(GetW9FormRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getW9FormValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a W9/W4/W8 form (asynchronously)
     * Retrieve a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> W9/W4/W8 form with id </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getW9FormAsync(GetW9FormRequest requestParameters, final ApiCallback<CreateW9Form201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getW9FormValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetW9Form API
    *
    * @param id ID of the form</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class GetW9FormRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public GetW9FormRequest () {
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
    * @returns GetW9FormRequest
    */
    public GetW9FormRequest getGetW9FormRequest() {
        return this.new GetW9FormRequest();
    }

    /**
     * Build call for getW9FormPdf
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> PDF stream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid id) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getW9FormPdfCall(GetW9FormPdfRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/w9/forms/{id}/pdf"
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
    private okhttp3.Call getW9FormPdfValidateBeforeCall(GetW9FormPdfRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling getW9FormPdf(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getW9FormPdf(Async)");
        }
        

        okhttp3.Call localVarCall = getW9FormPdfCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Download the PDF for a W9/W4/W8 form.
     * Returns the PDF file for a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> PDF stream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid id) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public void getW9FormPdf(GetW9FormPdfRequest requestParameters) throws ApiException {
        getW9FormPdfWithHttpInfo(requestParameters);
    }

    /**
     * Download the PDF for a W9/W4/W8 form.
     * Returns the PDF file for a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> PDF stream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid id) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> getW9FormPdfWithHttpInfo(GetW9FormPdfRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getW9FormPdfValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Download the PDF for a W9/W4/W8 form. (asynchronously)
     * Returns the PDF file for a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> PDF stream </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid id) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getW9FormPdfAsync(GetW9FormPdfRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getW9FormPdfValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetW9FormPdf API
    *
    * @param id Id of the form</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class GetW9FormPdfRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public GetW9FormPdfRequest () {
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
    * @returns GetW9FormPdfRequest
    */
    public GetW9FormPdfRequest getGetW9FormPdfRequest() {
        return this.new GetW9FormPdfRequest();
    }

    /**
     * Build call for listW9Forms
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> list </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listW9FormsCall(ListW9FormsRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/w9/forms";

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
    private okhttp3.Call listW9FormsValidateBeforeCall(ListW9FormsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling listW9Forms(Async)");
        }
        

        okhttp3.Call localVarCall = listW9FormsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * List W9/W4/W8 forms
     * List W9/W4/W8 forms. Filterable/Sortable fields are: \&quot;companyId\&quot;, \&quot;type\&quot;, \&quot;displayName\&quot;, \&quot;entryStatus\&quot;, \&quot;email\&quot;, \&quot;archived\&quot; and \&quot;referenceId\&quot;.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return PaginatedQueryResultModelW9FormBaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> list </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedQueryResultModelW9FormBaseResponse listW9Forms(ListW9FormsRequest requestParameters) throws ApiException {
        ApiResponse<PaginatedQueryResultModelW9FormBaseResponse> localVarResp = listW9FormsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * List W9/W4/W8 forms
     * List W9/W4/W8 forms. Filterable/Sortable fields are: \&quot;companyId\&quot;, \&quot;type\&quot;, \&quot;displayName\&quot;, \&quot;entryStatus\&quot;, \&quot;email\&quot;, \&quot;archived\&quot; and \&quot;referenceId\&quot;.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;PaginatedQueryResultModelW9FormBaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> list </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedQueryResultModelW9FormBaseResponse> listW9FormsWithHttpInfo(ListW9FormsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = listW9FormsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<PaginatedQueryResultModelW9FormBaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List W9/W4/W8 forms (asynchronously)
     * List W9/W4/W8 forms. Filterable/Sortable fields are: \&quot;companyId\&quot;, \&quot;type\&quot;, \&quot;displayName\&quot;, \&quot;entryStatus\&quot;, \&quot;email\&quot;, \&quot;archived\&quot; and \&quot;referenceId\&quot;.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> list </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listW9FormsAsync(ListW9FormsRequest requestParameters, final ApiCallback<PaginatedQueryResultModelW9FormBaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listW9FormsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<PaginatedQueryResultModelW9FormBaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the ListW9Forms API
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
    public class ListW9FormsRequest {
        private String avalaraVersion;
        private String $filter;
        private Integer $top;
        private Integer $skip;
        private String $orderBy;
        private Boolean count;
        private Boolean countOnly;
        private String xCorrelationId;
        private String xAvalaraClient;

        public ListW9FormsRequest () {
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
    * @returns ListW9FormsRequest
    */
    public ListW9FormsRequest getListW9FormsRequest() {
        return this.new ListW9FormsRequest();
    }

    /**
     * Build call for sendW9FormEmail
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Email sent using existing form (form was already in &#39;Requested&#39; status or descendant found) </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Email sent using newly created minimal form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing vendor e-mail) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendW9FormEmailCall(SendW9FormEmailRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/w9/forms/{id}/$send-email"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.A1099);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendW9FormEmailValidateBeforeCall(SendW9FormEmailRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling sendW9FormEmail(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling sendW9FormEmail(Async)");
        }
        

        okhttp3.Call localVarCall = sendW9FormEmailCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form
     * Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form.  If the form is not in &#39;Requested&#39; status, it will either use an existing descendant form  in &#39;Requested&#39; status or create a new minimal form and send the email request.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CreateW9Form201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Email sent using existing form (form was already in &#39;Requested&#39; status or descendant found) </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Email sent using newly created minimal form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing vendor e-mail) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public CreateW9Form201Response sendW9FormEmail(SendW9FormEmailRequest requestParameters) throws ApiException {
        ApiResponse<CreateW9Form201Response> localVarResp = sendW9FormEmailWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form
     * Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form.  If the form is not in &#39;Requested&#39; status, it will either use an existing descendant form  in &#39;Requested&#39; status or create a new minimal form and send the email request.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CreateW9Form201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Email sent using existing form (form was already in &#39;Requested&#39; status or descendant found) </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Email sent using newly created minimal form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing vendor e-mail) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateW9Form201Response> sendW9FormEmailWithHttpInfo(SendW9FormEmailRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = sendW9FormEmailValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form (asynchronously)
     * Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form.  If the form is not in &#39;Requested&#39; status, it will either use an existing descendant form  in &#39;Requested&#39; status or create a new minimal form and send the email request.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Email sent using existing form (form was already in &#39;Requested&#39; status or descendant found) </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Email sent using newly created minimal form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing vendor e-mail) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendW9FormEmailAsync(SendW9FormEmailRequest requestParameters, final ApiCallback<CreateW9Form201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendW9FormEmailValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the SendW9FormEmail API
    *
    * @param id The ID of the W9/W4/W8 form.</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class SendW9FormEmailRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public SendW9FormEmailRequest () {
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
    * @returns SendW9FormEmailRequest
    */
    public SendW9FormEmailRequest getSendW9FormEmailRequest() {
        return this.new SendW9FormEmailRequest();
    }

    /**
     * Build call for updateW9Form
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing required field) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateW9FormCall(UpdateW9FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getCreateW9FormRequest();

        // create path and map variables
        String localVarPath = "/w9/forms/{id}"
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
    private okhttp3.Call updateW9FormValidateBeforeCall(UpdateW9FormRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling updateW9Form(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling updateW9Form(Async)");
        }
        

        okhttp3.Call localVarCall = updateW9FormCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Update a W9/W4/W8 form
     * Update a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CreateW9Form201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing required field) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public CreateW9Form201Response updateW9Form(UpdateW9FormRequest requestParameters) throws ApiException {
        ApiResponse<CreateW9Form201Response> localVarResp = updateW9FormWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Update a W9/W4/W8 form
     * Update a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CreateW9Form201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing required field) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateW9Form201Response> updateW9FormWithHttpInfo(UpdateW9FormRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = updateW9FormValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a W9/W4/W8 form (asynchronously)
     * Update a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated W9/W4/W8 form </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., missing required field) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateW9FormAsync(UpdateW9FormRequest requestParameters, final ApiCallback<CreateW9Form201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateW9FormValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CreateW9Form201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the UpdateW9Form API
    *
    * @param id ID of the form to update</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param createW9FormRequest Form to be updated (optional)</param>
    */
    public class UpdateW9FormRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private CreateW9FormRequest createW9FormRequest;

        public UpdateW9FormRequest () {
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public CreateW9FormRequest getCreateW9FormRequest() { return createW9FormRequest; }
        public void setCreateW9FormRequest(CreateW9FormRequest createW9FormRequest) { this.createW9FormRequest = createW9FormRequest; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns UpdateW9FormRequest
    */
    public UpdateW9FormRequest getUpdateW9FormRequest() {
        return this.new UpdateW9FormRequest();
    }

    /**
     * Build call for uploadW9Files
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., only .pdf files are allowed.) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadW9FilesCall(UploadW9FilesRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/w9/forms/{id}/attachment"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(requestParameters.id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.get_file() != null) {
            localVarFormParams.put("file", requestParameters.get_file());
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
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.A1099);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadW9FilesValidateBeforeCall(UploadW9FilesRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling uploadW9Files(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling uploadW9Files(Async)");
        }
        

        okhttp3.Call localVarCall = uploadW9FilesCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Replace the PDF file for a W9/W4/W8 form
     * Replaces the PDF file for a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., only .pdf files are allowed.) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public void uploadW9Files(UploadW9FilesRequest requestParameters) throws ApiException {
        uploadW9FilesWithHttpInfo(requestParameters);
    }

    /**
     * Replace the PDF file for a W9/W4/W8 form
     * Replaces the PDF file for a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., only .pdf files are allowed.) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> uploadW9FilesWithHttpInfo(UploadW9FilesRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = uploadW9FilesValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Replace the PDF file for a W9/W4/W8 form (asynchronously)
     * Replaces the PDF file for a W9/W4/W8 form.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., only .pdf files are allowed.) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> W9/W4/W8 form not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadW9FilesAsync(UploadW9FilesRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadW9FilesValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the UploadW9Files API
    *
    * @param id Id of the form</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param _file  (optional)</param>
    */
    public class UploadW9FilesRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private File _file;

        public UploadW9FilesRequest () {
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public File get_file() { return _file; }
        public void set_file(File _file) { this._file = _file; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns UploadW9FilesRequest
    */
    public UploadW9FilesRequest getUploadW9FilesRequest() {
        return this.new UploadW9FilesRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("25.10.1");
    }
}

