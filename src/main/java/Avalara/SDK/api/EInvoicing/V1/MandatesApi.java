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

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.*;


import java.math.BigDecimal;
import Avalara.SDK.model.EInvoicing.V1.ForbiddenError;
import Avalara.SDK.model.EInvoicing.V1.InternalServerError;
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

        // Set avalara-version header from swagger.json version number
        localVarHeaderParams.put("avalara-version", "1.0");

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
        String[] localVarAuthNames = new String[] { "Bearer" };
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
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\" (optional)</param>
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

        public String getAvalaraVersion() { return avalaraVersion; }
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
        this.localVarApiClient.setSdkVersion("");
    }
}

