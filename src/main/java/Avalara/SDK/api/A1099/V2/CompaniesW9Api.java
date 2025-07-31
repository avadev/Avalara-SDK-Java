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


import Avalara.SDK.model.A1099.V2.CompanyCreateUpdateRequestModel;
import Avalara.SDK.model.A1099.V2.CompanyResponse;
import Avalara.SDK.model.A1099.V2.CompanyResponseModel;
import Avalara.SDK.model.A1099.V2.ErrorModel;
import Avalara.SDK.model.A1099.V2.ErrorResponse;
import Avalara.SDK.model.A1099.V2.PaginatedQueryResultModelCompanyResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompaniesW9Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CompaniesW9Api(ApiClient apiClient) {
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
     * Build call for createCompany
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., model validation failed) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCompanyCall(CreateCompanyRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getCompanyCreateUpdateRequestModel();

        // create path and map variables
        String localVarPath = "/w9/companies";

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
    private okhttp3.Call createCompanyValidateBeforeCall(CreateCompanyRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling createCompany(Async)");
        }
        

        okhttp3.Call localVarCall = createCompanyCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Create a company
     * Create a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CompanyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., model validation failed) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public CompanyResponseModel createCompany(CreateCompanyRequest requestParameters) throws ApiException {
        ApiResponse<CompanyResponseModel> localVarResp = createCompanyWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Create a company
     * Create a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CompanyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., model validation failed) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CompanyResponseModel> createCompanyWithHttpInfo(CreateCompanyRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = createCompanyValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CompanyResponseModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a company (asynchronously)
     * Create a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., model validation failed) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCompanyAsync(CreateCompanyRequest requestParameters, final ApiCallback<CompanyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createCompanyValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CompanyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the CreateCompany API
    *
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param companyCreateUpdateRequestModel The company to create (optional)</param>
    */
    public class CreateCompanyRequest {
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private CompanyCreateUpdateRequestModel companyCreateUpdateRequestModel;

        public CreateCompanyRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public CompanyCreateUpdateRequestModel getCompanyCreateUpdateRequestModel() { return companyCreateUpdateRequestModel; }
        public void setCompanyCreateUpdateRequestModel(CompanyCreateUpdateRequestModel companyCreateUpdateRequestModel) { this.companyCreateUpdateRequestModel = companyCreateUpdateRequestModel; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns CreateCompanyRequest
    */
    public CreateCompanyRequest getCreateCompanyRequest() {
        return this.new CreateCompanyRequest();
    }

    /**
     * Build call for deleteCompany
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Company deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company was not found or your user does not have to permission to delete it. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Company can&#39;t be deleted since it still have forms associated with it. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error happened while attempting to delete the company. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCompanyCall(DeleteCompanyRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/w9/companies/{id}"
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
    private okhttp3.Call deleteCompanyValidateBeforeCall(DeleteCompanyRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling deleteCompany(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling deleteCompany(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCompanyCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Delete a company
     * Delete a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Company deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company was not found or your user does not have to permission to delete it. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Company can&#39;t be deleted since it still have forms associated with it. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error happened while attempting to delete the company. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCompany(DeleteCompanyRequest requestParameters) throws ApiException {
        deleteCompanyWithHttpInfo(requestParameters);
    }

    /**
     * Delete a company
     * Delete a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Company deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company was not found or your user does not have to permission to delete it. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Company can&#39;t be deleted since it still have forms associated with it. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error happened while attempting to delete the company. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCompanyWithHttpInfo(DeleteCompanyRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = deleteCompanyValidateBeforeCall(requestParameters, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a company (asynchronously)
     * Delete a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Company deleted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company was not found or your user does not have to permission to delete it. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Company can&#39;t be deleted since it still have forms associated with it. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An error happened while attempting to delete the company. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCompanyAsync(DeleteCompanyRequest requestParameters, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCompanyValidateBeforeCall(requestParameters, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the DeleteCompany API
    *
    * @param id The company to delete</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class DeleteCompanyRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public DeleteCompanyRequest () {
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
    * @returns DeleteCompanyRequest
    */
    public DeleteCompanyRequest getDeleteCompanyRequest() {
        return this.new DeleteCompanyRequest();
    }

    /**
     * Build call for getCompanies
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of companies </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCompaniesCall(GetCompaniesRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/w9/companies";

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
    private okhttp3.Call getCompaniesValidateBeforeCall(GetCompaniesRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getCompanies(Async)");
        }
        

        okhttp3.Call localVarCall = getCompaniesCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * List companies
     * List existing companies. Filterable/Sortable fields are: \&quot;name\&quot;, \&quot;referenceId\&quot;, \&quot;group.name\&quot;, \&quot;createdAt\&quot; and \&quot;updatedAt\&quot;.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return PaginatedQueryResultModelCompanyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of companies </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public PaginatedQueryResultModelCompanyResponse getCompanies(GetCompaniesRequest requestParameters) throws ApiException {
        ApiResponse<PaginatedQueryResultModelCompanyResponse> localVarResp = getCompaniesWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * List companies
     * List existing companies. Filterable/Sortable fields are: \&quot;name\&quot;, \&quot;referenceId\&quot;, \&quot;group.name\&quot;, \&quot;createdAt\&quot; and \&quot;updatedAt\&quot;.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;PaginatedQueryResultModelCompanyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of companies </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaginatedQueryResultModelCompanyResponse> getCompaniesWithHttpInfo(GetCompaniesRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getCompaniesValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<PaginatedQueryResultModelCompanyResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List companies (asynchronously)
     * List existing companies. Filterable/Sortable fields are: \&quot;name\&quot;, \&quot;referenceId\&quot;, \&quot;group.name\&quot;, \&quot;createdAt\&quot; and \&quot;updatedAt\&quot;.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of companies </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCompaniesAsync(GetCompaniesRequest requestParameters, final ApiCallback<PaginatedQueryResultModelCompanyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCompaniesValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<PaginatedQueryResultModelCompanyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetCompanies API
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
    public class GetCompaniesRequest {
        private String avalaraVersion;
        private String $filter;
        private Integer $top;
        private Integer $skip;
        private String $orderBy;
        private Boolean count;
        private Boolean countOnly;
        private String xCorrelationId;
        private String xAvalaraClient;

        public GetCompaniesRequest () {
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
    * @returns GetCompaniesRequest
    */
    public GetCompaniesRequest getGetCompaniesRequest() {
        return this.new GetCompaniesRequest();
    }

    /**
     * Build call for getCompany
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Single company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCompanyCall(GetCompanyRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/w9/companies/{id}"
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
    private okhttp3.Call getCompanyValidateBeforeCall(GetCompanyRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling getCompany(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getCompany(Async)");
        }
        

        okhttp3.Call localVarCall = getCompanyCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a company
     * Retrieve a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CompanyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Single company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public CompanyResponse getCompany(GetCompanyRequest requestParameters) throws ApiException {
        ApiResponse<CompanyResponse> localVarResp = getCompanyWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Retrieve a company
     * Retrieve a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CompanyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Single company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CompanyResponse> getCompanyWithHttpInfo(GetCompanyRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getCompanyValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CompanyResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a company (asynchronously)
     * Retrieve a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Single company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., invalid sort key) </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCompanyAsync(GetCompanyRequest requestParameters, final ApiCallback<CompanyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCompanyValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CompanyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetCompany API
    *
    * @param id Id of the company</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    */
    public class GetCompanyRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;

        public GetCompanyRequest () {
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
    * @returns GetCompanyRequest
    */
    public GetCompanyRequest getGetCompanyRequest() {
        return this.new GetCompanyRequest();
    }

    /**
     * Build call for updateCompany
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Updated company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., model validation failed) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCompanyCall(UpdateCompanyRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getCompanyCreateUpdateRequestModel();

        // create path and map variables
        String localVarPath = "/w9/companies/{id}"
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
    private okhttp3.Call updateCompanyValidateBeforeCall(UpdateCompanyRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.id' is set
        if (requestParameters.getId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.id' when calling updateCompany(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling updateCompany(Async)");
        }
        

        okhttp3.Call localVarCall = updateCompanyCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Update a company
     * Update a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CompanyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Updated company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., model validation failed) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company not found </td><td>  -  </td></tr>
     </table>
     */
    public CompanyResponseModel updateCompany(UpdateCompanyRequest requestParameters) throws ApiException {
        ApiResponse<CompanyResponseModel> localVarResp = updateCompanyWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Update a company
     * Update a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CompanyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Updated company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., model validation failed) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CompanyResponseModel> updateCompanyWithHttpInfo(UpdateCompanyRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = updateCompanyValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CompanyResponseModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a company (asynchronously)
     * Update a company.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Updated company </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g., model validation failed) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Company not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCompanyAsync(UpdateCompanyRequest requestParameters, final ApiCallback<CompanyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCompanyValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CompanyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the UpdateCompany API
    *
    * @param id The ID of the company to update</param>
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param companyCreateUpdateRequestModel The updated company data (optional)</param>
    */
    public class UpdateCompanyRequest {
        private String id;
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private CompanyCreateUpdateRequestModel companyCreateUpdateRequestModel;

        public UpdateCompanyRequest () {
        }

        public String getId() { return id; }
        public void setId(String id) { this.id = id; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public CompanyCreateUpdateRequestModel getCompanyCreateUpdateRequestModel() { return companyCreateUpdateRequestModel; }
        public void setCompanyCreateUpdateRequestModel(CompanyCreateUpdateRequestModel companyCreateUpdateRequestModel) { this.companyCreateUpdateRequestModel = companyCreateUpdateRequestModel; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns UpdateCompanyRequest
    */
    public UpdateCompanyRequest getUpdateCompanyRequest() {
        return this.new UpdateCompanyRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("25.8.1");
    }
}

