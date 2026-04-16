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


import Avalara.SDK.model.EInvoicing.V1.DataInputFieldsResponse;
import Avalara.SDK.model.EInvoicing.V1.ForbiddenError;
import Avalara.SDK.model.EInvoicing.V1.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataInputFieldsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DataInputFieldsApi(ApiClient apiClient) {
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
     * Build call for getDataInputFields
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a DataInputFieldsResponse object containing the data input fields and their optionality for the requested mandate. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDataInputFieldsCall(GetDataInputFieldsRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/data-input-fields";

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
    private okhttp3.Call getDataInputFieldsValidateBeforeCall(GetDataInputFieldsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getDataInputFields(Async)");
        }
        

        okhttp3.Call localVarCall = getDataInputFieldsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns the optionality of document fields for different country mandates
     * This endpoint returns a list of required, conditional, and optional fields for each country mandate. Use the mandates endpoint to retrieve all available country mandates. Use the $filter query parameter to retrieve fields for a specific mandate.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return DataInputFieldsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a DataInputFieldsResponse object containing the data input fields and their optionality for the requested mandate. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public DataInputFieldsResponse getDataInputFields(GetDataInputFieldsRequest requestParameters) throws ApiException {
        ApiResponse<DataInputFieldsResponse> localVarResp = getDataInputFieldsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns the optionality of document fields for different country mandates
     * This endpoint returns a list of required, conditional, and optional fields for each country mandate. Use the mandates endpoint to retrieve all available country mandates. Use the $filter query parameter to retrieve fields for a specific mandate.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;DataInputFieldsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a DataInputFieldsResponse object containing the data input fields and their optionality for the requested mandate. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DataInputFieldsResponse> getDataInputFieldsWithHttpInfo(GetDataInputFieldsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getDataInputFieldsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<DataInputFieldsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns the optionality of document fields for different country mandates (asynchronously)
     * This endpoint returns a list of required, conditional, and optional fields for each country mandate. Use the mandates endpoint to retrieve all available country mandates. Use the $filter query parameter to retrieve fields for a specific mandate.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a DataInputFieldsResponse object containing the data input fields and their optionality for the requested mandate. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDataInputFieldsAsync(GetDataInputFieldsRequest requestParameters, final ApiCallback<DataInputFieldsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDataInputFieldsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<DataInputFieldsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetDataInputFields API
    *
    * @param avalaraVersion Header that specifies the API version to use (for example \"1.6\").</param>
    * @param xAvalaraClient Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\"). (optional)</param>
    * @param $filter Filter by field name and value. This filter supports only eq and contains. For more information, refer to the Avalara filtering guide. (optional)</param>
    * @param $top The number of items to include in the result. (optional)</param>
    * @param $skip The number of items to skip in the result. (optional)</param>
    * @param $count When set to true, the response body also includes the count of items in the collection. (optional)</param>
    * @param $countOnly When set to true, the response returns only the count of items in the collection. (optional)</param>
    */
    public class GetDataInputFieldsRequest {
        private String avalaraVersion;
        private String xAvalaraClient;
        private String $filter;
        private Integer $top;
        private Integer $skip;
        private Boolean $count;
        private Boolean $countOnly;

        public GetDataInputFieldsRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.6"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String get$filter() { return $filter; }
        public void set$filter(String $filter) { this.$filter = $filter; }
        public Integer get$top() { return $top; }
        public void set$top(Integer $top) { this.$top = $top; }
        public Integer get$skip() { return $skip; }
        public void set$skip(Integer $skip) { this.$skip = $skip; }
        public Boolean get$count() { return $count; }
        public void set$count(Boolean $count) { this.$count = $count; }
        public Boolean get$countOnly() { return $countOnly; }
        public void set$countOnly(Boolean $countOnly) { this.$countOnly = $countOnly; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetDataInputFieldsRequest
    */
    public GetDataInputFieldsRequest getGetDataInputFieldsRequest() {
        return this.new GetDataInputFieldsRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("26.4.0");
    }
}

