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
import Avalara.SDK.model.EInvoicing.V1.CodeListListResponse;
import Avalara.SDK.model.EInvoicing.V1.CodeListResponse;
import Avalara.SDK.model.EInvoicing.V1.ForbiddenError;
import java.time.LocalDate;
import Avalara.SDK.model.EInvoicing.V1.NotFoundError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeListsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CodeListsApi(ApiClient apiClient) {
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
     * Build call for getCodeList
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Code list not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCodeListCall(GetCodeListRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/codelists/{codelistId}"
            .replaceAll("\\{" + "codelistId" + "\\}", localVarApiClient.escapeString(requestParameters.codelistId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getCountryCode() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("countryCode", requestParameters.getCountryCode()));
        }

        if (requestParameters.getEffectiveDate() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveDate", requestParameters.getEffectiveDate()));
        }

        if (requestParameters.getSunsetDate() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sunsetDate", requestParameters.getSunsetDate()));
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
    private okhttp3.Call getCodeListValidateBeforeCall(GetCodeListRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getCodeList(Async)");
        }
        
        // verify the required parameter 'requestParameters.codelistId' is set
        if (requestParameters.getCodelistId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.codelistId' when calling getCodeList(Async)");
        }
        
        // verify the required parameter 'requestParameters.countryCode' is set
        if (requestParameters.getCountryCode() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.countryCode' when calling getCodeList(Async)");
        }
        

        okhttp3.Call localVarCall = getCodeListCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Retrieves a code list by ID for a specific country
     * A Code List is a controlled set of predefined, standardized values used to populate specific fields in electronic documents (such as e-invoices). Each code has a stable, machine-readable identifier and a human-readable description. Code Lists are typically based on global standards (e.g., UN/CEFACT, ISO, EN16931) and may include jurisdiction-specific extensions or restrictions.&lt;br&gt;&lt;br&gt;Code Lists are versioned, and each version may have defined effective and sunset dates to ensure that the correct set of allowable values is applied according to regulatory or jurisdictional requirements.&lt;br&gt;&lt;br&gt;By default, the API returns only non-expired code list versions (versions where the sunset date has not passed). To retrieve expired versions or filter by specific date ranges, use the &lt;code&gt;effectiveDate&lt;/code&gt; and &lt;code&gt;sunsetDate&lt;/code&gt; query parameters.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CodeListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Code list not found. </td><td>  -  </td></tr>
     </table>
     */
    public CodeListResponse getCodeList(GetCodeListRequest requestParameters) throws ApiException {
        ApiResponse<CodeListResponse> localVarResp = getCodeListWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Retrieves a code list by ID for a specific country
     * A Code List is a controlled set of predefined, standardized values used to populate specific fields in electronic documents (such as e-invoices). Each code has a stable, machine-readable identifier and a human-readable description. Code Lists are typically based on global standards (e.g., UN/CEFACT, ISO, EN16931) and may include jurisdiction-specific extensions or restrictions.&lt;br&gt;&lt;br&gt;Code Lists are versioned, and each version may have defined effective and sunset dates to ensure that the correct set of allowable values is applied according to regulatory or jurisdictional requirements.&lt;br&gt;&lt;br&gt;By default, the API returns only non-expired code list versions (versions where the sunset date has not passed). To retrieve expired versions or filter by specific date ranges, use the &lt;code&gt;effectiveDate&lt;/code&gt; and &lt;code&gt;sunsetDate&lt;/code&gt; query parameters.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CodeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Code list not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CodeListResponse> getCodeListWithHttpInfo(GetCodeListRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getCodeListValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CodeListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves a code list by ID for a specific country (asynchronously)
     * A Code List is a controlled set of predefined, standardized values used to populate specific fields in electronic documents (such as e-invoices). Each code has a stable, machine-readable identifier and a human-readable description. Code Lists are typically based on global standards (e.g., UN/CEFACT, ISO, EN16931) and may include jurisdiction-specific extensions or restrictions.&lt;br&gt;&lt;br&gt;Code Lists are versioned, and each version may have defined effective and sunset dates to ensure that the correct set of allowable values is applied according to regulatory or jurisdictional requirements.&lt;br&gt;&lt;br&gt;By default, the API returns only non-expired code list versions (versions where the sunset date has not passed). To retrieve expired versions or filter by specific date ranges, use the &lt;code&gt;effectiveDate&lt;/code&gt; and &lt;code&gt;sunsetDate&lt;/code&gt; query parameters.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Code list not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCodeListAsync(GetCodeListRequest requestParameters, final ApiCallback<CodeListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCodeListValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CodeListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetCodeList API
    *
    * @param avalaraVersion Header that specifies the API version to use (for example \"1.6\").</param>
    * @param codelistId System-generated unique identifier of the code list definition. Typically a UUID used to reference this code list internally or via APIs.</param>
    * @param countryCode Two-letter ISO 3166-1 alpha-2 country code indicating the jurisdiction this code list applies to.</param>
    * @param xAvalaraClient Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\"). (optional)</param>
    * @param effectiveDate Filter code list versions by effective date. Returns versions that are effective on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, defaults to the current date. sunsetDate is required when effectiveDate is provided. (optional)</param>
    * @param sunsetDate Filter code list versions by sunset date. Returns versions that have not yet sunset on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, only non-expired versions are returned. (optional)</param>
    */
    public class GetCodeListRequest {
        private String avalaraVersion;
        private String codelistId;
        private String countryCode;
        private String xAvalaraClient;
        private LocalDate effectiveDate;
        private LocalDate sunsetDate;

        public GetCodeListRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.6"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getCodelistId() { return codelistId; }
        public void setCodelistId(String codelistId) { this.codelistId = codelistId; }
        public String getCountryCode() { return countryCode; }
        public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public LocalDate getEffectiveDate() { return effectiveDate; }
        public void setEffectiveDate(LocalDate effectiveDate) { this.effectiveDate = effectiveDate; }
        public LocalDate getSunsetDate() { return sunsetDate; }
        public void setSunsetDate(LocalDate sunsetDate) { this.sunsetDate = sunsetDate; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetCodeListRequest
    */
    public GetCodeListRequest getGetCodeListRequest() {
        return this.new GetCodeListRequest();
    }

    /**
     * Build call for getCodeListList
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCodeListListCall(GetCodeListListRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/codelists";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getCountryCode() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("countryCode", requestParameters.getCountryCode()));
        }

        if (requestParameters.getEffectiveDate() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveDate", requestParameters.getEffectiveDate()));
        }

        if (requestParameters.getSunsetDate() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sunsetDate", requestParameters.getSunsetDate()));
        }

        if (requestParameters.get$count() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$count", requestParameters.get$count()));
        }

        if (requestParameters.get$countOnly() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$countOnly", requestParameters.get$countOnly()));
        }

        if (requestParameters.get$top() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$top", requestParameters.get$top()));
        }

        if (requestParameters.get$skip() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$skip", requestParameters.get$skip()));
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
    private okhttp3.Call getCodeListListValidateBeforeCall(GetCodeListListRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getCodeListList(Async)");
        }
        
        // verify the required parameter 'requestParameters.countryCode' is set
        if (requestParameters.getCountryCode() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.countryCode' when calling getCodeListList(Async)");
        }
        

        okhttp3.Call localVarCall = getCodeListListCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns a list of code lists for a specific country
     * Get a list of code lists on the Avalara E-Invoicing platform for the specified country. By default, the API returns only non-expired code lists (code lists where the sunset date has not passed). To retrieve expired code lists or filter by specific date ranges, use the &lt;code&gt;effectiveDate&lt;/code&gt; and &lt;code&gt;sunsetDate&lt;/code&gt; query parameters.&lt;br&gt;&lt;br&gt;A Code List is a controlled set of predefined, standardized values used to populate specific fields in electronic documents (such as e-invoices). Each code has a stable, machine-readable identifier and a human-readable description. Code Lists are typically based on global standards (e.g., UN/CEFACT, ISO, EN16931) and may include jurisdiction-specific extensions or restrictions.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return CodeListListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
     </table>
     */
    public CodeListListResponse getCodeListList(GetCodeListListRequest requestParameters) throws ApiException {
        ApiResponse<CodeListListResponse> localVarResp = getCodeListListWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns a list of code lists for a specific country
     * Get a list of code lists on the Avalara E-Invoicing platform for the specified country. By default, the API returns only non-expired code lists (code lists where the sunset date has not passed). To retrieve expired code lists or filter by specific date ranges, use the &lt;code&gt;effectiveDate&lt;/code&gt; and &lt;code&gt;sunsetDate&lt;/code&gt; query parameters.&lt;br&gt;&lt;br&gt;A Code List is a controlled set of predefined, standardized values used to populate specific fields in electronic documents (such as e-invoices). Each code has a stable, machine-readable identifier and a human-readable description. Code Lists are typically based on global standards (e.g., UN/CEFACT, ISO, EN16931) and may include jurisdiction-specific extensions or restrictions.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;CodeListListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CodeListListResponse> getCodeListListWithHttpInfo(GetCodeListListRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getCodeListListValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<CodeListListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of code lists for a specific country (asynchronously)
     * Get a list of code lists on the Avalara E-Invoicing platform for the specified country. By default, the API returns only non-expired code lists (code lists where the sunset date has not passed). To retrieve expired code lists or filter by specific date ranges, use the &lt;code&gt;effectiveDate&lt;/code&gt; and &lt;code&gt;sunsetDate&lt;/code&gt; query parameters.&lt;br&gt;&lt;br&gt;A Code List is a controlled set of predefined, standardized values used to populate specific fields in electronic documents (such as e-invoices). Each code has a stable, machine-readable identifier and a human-readable description. Code Lists are typically based on global standards (e.g., UN/CEFACT, ISO, EN16931) and may include jurisdiction-specific extensions or restrictions.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCodeListListAsync(GetCodeListListRequest requestParameters, final ApiCallback<CodeListListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCodeListListValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<CodeListListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetCodeListList API
    *
    * @param avalaraVersion Header that specifies the API version to use (for example \"1.6\").</param>
    * @param countryCode Two-letter ISO 3166-1 alpha-2 country code indicating the jurisdiction for which code lists should be returned.</param>
    * @param xAvalaraClient Optional header for a client identifier string used for diagnostics (for example \"Fingerprint\"). (optional)</param>
    * @param effectiveDate Filter code lists by effective date. Returns code lists that are effective on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, defaults to the current date. sunsetDate is required when effectiveDate is provided. (optional)</param>
    * @param sunsetDate Filter code lists by sunset date. Returns code lists that have not yet sunset on or before this date. Format: YYYY-MM-DD (ISO 8601). If not specified, only non-expired code lists are returned. (optional)</param>
    * @param $count When set to true, the response body also includes the count of items in the collection. (optional)</param>
    * @param $countOnly When set to true, the response returns only the count of items in the collection. (optional)</param>
    * @param $top The number of items to include in the result. (optional)</param>
    * @param $skip The number of items to skip in the result. (optional)</param>
    */
    public class GetCodeListListRequest {
        private String avalaraVersion;
        private String countryCode;
        private String xAvalaraClient;
        private LocalDate effectiveDate;
        private LocalDate sunsetDate;
        private String $count;
        private String $countOnly;
        private Integer $top;
        private Integer $skip;

        public GetCodeListListRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.6"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getCountryCode() { return countryCode; }
        public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public LocalDate getEffectiveDate() { return effectiveDate; }
        public void setEffectiveDate(LocalDate effectiveDate) { this.effectiveDate = effectiveDate; }
        public LocalDate getSunsetDate() { return sunsetDate; }
        public void setSunsetDate(LocalDate sunsetDate) { this.sunsetDate = sunsetDate; }
        public String get$count() { return $count; }
        public void set$count(String $count) { this.$count = $count; }
        public String get$countOnly() { return $countOnly; }
        public void set$countOnly(String $countOnly) { this.$countOnly = $countOnly; }
        public Integer get$top() { return $top; }
        public void set$top(Integer $top) { this.$top = $top; }
        public Integer get$skip() { return $skip; }
        public void set$skip(Integer $skip) { this.$skip = $skip; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetCodeListListRequest
    */
    public GetCodeListListRequest getGetCodeListListRequest() {
        return this.new GetCodeListListRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("26.5.0");
    }
}

