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
import java.math.BigDecimal;
import Avalara.SDK.model.EInvoicing.V1.ForbiddenError;
import Avalara.SDK.model.EInvoicing.V1.InternalServerError;
import Avalara.SDK.model.EInvoicing.V1.MandateDataInputField;
import Avalara.SDK.model.EInvoicing.V1.MandatesResponse;
import Avalara.SDK.model.EInvoicing.V1.NotFoundError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MandatesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MandatesApi(ApiClient apiClient) {
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
     * Build call for getMandateDataInputFields
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMandateDataInputFieldsCall(GetMandateDataInputFieldsRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/mandates/{mandateId}/data-input-fields"
            .replaceAll("\\{" + "mandateId" + "\\}", localVarApiClient.escapeString(requestParameters.mandateId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getDocumentType() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentType", requestParameters.getDocumentType()));
        }

        if (requestParameters.getDocumentVersion() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentVersion", requestParameters.getDocumentVersion()));
        }

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMandateDataInputFieldsValidateBeforeCall(GetMandateDataInputFieldsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getMandateDataInputFields(Async)");
        }
        
        // verify the required parameter 'requestParameters.mandateId' is set
        if (requestParameters.getMandateId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.mandateId' when calling getMandateDataInputFields(Async)");
        }
        
        // verify the required parameter 'requestParameters.documentType' is set
        if (requestParameters.getDocumentType() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.documentType' when calling getMandateDataInputFields(Async)");
        }
        
        // verify the required parameter 'requestParameters.documentVersion' is set
        if (requestParameters.getDocumentVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.documentVersion' when calling getMandateDataInputFields(Async)");
        }
        

        okhttp3.Call localVarCall = getMandateDataInputFieldsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns document field information for a country mandate, a selected document type, and its version
     * This endpoint provides document field details and the optionality of fields (required, conditional, optional) of different documents supported by the country mandate. Use the GET &lt;code&gt;/mandates&lt;/code&gt; endpoint to retrieve all available country mandates, their supported document types and supported versions. You can use the &#x60;documentType&#x60; and &#x60;documentVersion&#x60; query parameters to retrieve the input fields for a particular document type and document version.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return List&lt;MandateDataInputField&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public List<MandateDataInputField> getMandateDataInputFields(GetMandateDataInputFieldsRequest requestParameters) throws ApiException {
        ApiResponse<List<MandateDataInputField>> localVarResp = getMandateDataInputFieldsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns document field information for a country mandate, a selected document type, and its version
     * This endpoint provides document field details and the optionality of fields (required, conditional, optional) of different documents supported by the country mandate. Use the GET &lt;code&gt;/mandates&lt;/code&gt; endpoint to retrieve all available country mandates, their supported document types and supported versions. You can use the &#x60;documentType&#x60; and &#x60;documentVersion&#x60; query parameters to retrieve the input fields for a particular document type and document version.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;List&lt;MandateDataInputField&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<MandateDataInputField>> getMandateDataInputFieldsWithHttpInfo(GetMandateDataInputFieldsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getMandateDataInputFieldsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<List<MandateDataInputField>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns document field information for a country mandate, a selected document type, and its version (asynchronously)
     * This endpoint provides document field details and the optionality of fields (required, conditional, optional) of different documents supported by the country mandate. Use the GET &lt;code&gt;/mandates&lt;/code&gt; endpoint to retrieve all available country mandates, their supported document types and supported versions. You can use the &#x60;documentType&#x60; and &#x60;documentVersion&#x60; query parameters to retrieve the input fields for a particular document type and document version.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMandateDataInputFieldsAsync(GetMandateDataInputFieldsRequest requestParameters, final ApiCallback<List<MandateDataInputField>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMandateDataInputFieldsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<List<MandateDataInputField>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetMandateDataInputFields API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param mandateId The unique ID for the mandate that was returned in the GET /einvoicing/mandates response body</param>
    * @param documentType Select the documentType for which you wish to view the data-input-fields (You may obtain the supported documentTypes from the GET /mandates endpoint)</param>
    * @param documentVersion Select the document version of the documentType (You may obtain the supported documentVersion from the GET /mandates endpoint)</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. (optional)</param>
    */
    public class GetMandateDataInputFieldsRequest {
        private String avalaraVersion;
        private String mandateId;
        private String documentType;
        private String documentVersion;
        private String xAvalaraClient;

        public GetMandateDataInputFieldsRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.2"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getMandateId() { return mandateId; }
        public void setMandateId(String mandateId) { this.mandateId = mandateId; }
        public String getDocumentType() { return documentType; }
        public void setDocumentType(String documentType) { this.documentType = documentType; }
        public String getDocumentVersion() { return documentVersion; }
        public void setDocumentVersion(String documentVersion) { this.documentVersion = documentVersion; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetMandateDataInputFieldsRequest
    */
    public GetMandateDataInputFieldsRequest getGetMandateDataInputFieldsRequest() {
        return this.new GetMandateDataInputFieldsRequest();
    }

    /**
     * Build call for getMandates
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMandatesCall(GetMandatesRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/mandates";

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

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getMandatesValidateBeforeCall(GetMandatesRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getMandates(Async)");
        }
        

        okhttp3.Call localVarCall = getMandatesCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * List country mandates that are supported by the Avalara E-Invoicing platform
     * This endpoint offers a list of country mandates supported by the Avalara E-Invoicing API.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return MandatesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public MandatesResponse getMandates(GetMandatesRequest requestParameters) throws ApiException {
        ApiResponse<MandatesResponse> localVarResp = getMandatesWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * List country mandates that are supported by the Avalara E-Invoicing platform
     * This endpoint offers a list of country mandates supported by the Avalara E-Invoicing API.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;MandatesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MandatesResponse> getMandatesWithHttpInfo(GetMandatesRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getMandatesValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<MandatesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List country mandates that are supported by the Avalara E-Invoicing platform (asynchronously)
     * This endpoint offers a list of country mandates supported by the Avalara E-Invoicing API.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource not found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMandatesAsync(GetMandatesRequest requestParameters, final ApiCallback<MandatesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMandatesValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<MandatesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetMandates API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. (optional)</param>
    * @param $filter Filter by field name and value. This filter only supports <code>eq</code> and <code>contains</code>. Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. (optional)</param>
    * @param $top If nonzero, return no more than this number of results. Used with <code>$skip</code> to provide pagination for large datasets. Unless otherwise specified, the maximum number of records that can be returned from an API call is 1,000 records. (optional)</param>
    * @param $skip If nonzero, skip this number of results before returning data. Used with <code>$top</code> to provide pagination for large datasets. (optional)</param>
    * @param $count When set to true, the count of the collection is also returned in the response body. (optional)</param>
    * @param $countOnly When set to true, only the count of the collection is returned (optional)</param>
    */
    public class GetMandatesRequest {
        private String avalaraVersion;
        private String xAvalaraClient;
        private String $filter;
        private BigDecimal $top;
        private BigDecimal $skip;
        private Boolean $count;
        private Boolean $countOnly;

        public GetMandatesRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.2"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String get$filter() { return $filter; }
        public void set$filter(String $filter) { this.$filter = $filter; }
        public BigDecimal get$top() { return $top; }
        public void set$top(BigDecimal $top) { this.$top = $top; }
        public BigDecimal get$skip() { return $skip; }
        public void set$skip(BigDecimal $skip) { this.$skip = $skip; }
        public Boolean get$count() { return $count; }
        public void set$count(Boolean $count) { this.$count = $count; }
        public Boolean get$countOnly() { return $countOnly; }
        public void set$countOnly(Boolean $countOnly) { this.$countOnly = $countOnly; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetMandatesRequest
    */
    public GetMandatesRequest getGetMandatesRequest() {
        return this.new GetMandatesRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("24.12.1");
    }
}

