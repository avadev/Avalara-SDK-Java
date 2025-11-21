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


import Avalara.SDK.model.EInvoicing.V1.ErrorResponse;
import Avalara.SDK.model.EInvoicing.V1.TaxIdentifierRequest;
import Avalara.SDK.model.EInvoicing.V1.TaxIdentifierResponse;
import Avalara.SDK.model.EInvoicing.V1.TaxIdentifierSchemaByCountry200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxIdentifiersApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TaxIdentifiersApi(ApiClient apiClient) {
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
     * Build call for taxIdentifierSchemaByCountry
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call taxIdentifierSchemaByCountryCall(TaxIdentifierSchemaByCountryRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/tax-identifiers/schema";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getCountryCode() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("countryCode", requestParameters.getCountryCode()));
        }

        if (requestParameters.getType() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", requestParameters.getType()));
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
    private okhttp3.Call taxIdentifierSchemaByCountryValidateBeforeCall(TaxIdentifierSchemaByCountryRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling taxIdentifierSchemaByCountry(Async)");
        }
        
        // verify the required parameter 'requestParameters.countryCode' is set
        if (requestParameters.getCountryCode() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.countryCode' when calling taxIdentifierSchemaByCountry(Async)");
        }
        

        okhttp3.Call localVarCall = taxIdentifierSchemaByCountryCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns the tax identifier request &amp; response schema for a specific country.
     * This endpoint retrieves the request and response schema required to validate tax identifiers based on a specific country&#39;s requirements. This can include both standard fields and any additional parameters required by the respective country&#39;s tax authority.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return TaxIdentifierSchemaByCountry200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public TaxIdentifierSchemaByCountry200Response taxIdentifierSchemaByCountry(TaxIdentifierSchemaByCountryRequest requestParameters) throws ApiException {
        ApiResponse<TaxIdentifierSchemaByCountry200Response> localVarResp = taxIdentifierSchemaByCountryWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns the tax identifier request &amp; response schema for a specific country.
     * This endpoint retrieves the request and response schema required to validate tax identifiers based on a specific country&#39;s requirements. This can include both standard fields and any additional parameters required by the respective country&#39;s tax authority.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;TaxIdentifierSchemaByCountry200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<TaxIdentifierSchemaByCountry200Response> taxIdentifierSchemaByCountryWithHttpInfo(TaxIdentifierSchemaByCountryRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = taxIdentifierSchemaByCountryValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<TaxIdentifierSchemaByCountry200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns the tax identifier request &amp; response schema for a specific country. (asynchronously)
     * This endpoint retrieves the request and response schema required to validate tax identifiers based on a specific country&#39;s requirements. This can include both standard fields and any additional parameters required by the respective country&#39;s tax authority.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call taxIdentifierSchemaByCountryAsync(TaxIdentifierSchemaByCountryRequest requestParameters, final ApiCallback<TaxIdentifierSchemaByCountry200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = taxIdentifierSchemaByCountryValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<TaxIdentifierSchemaByCountry200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the TaxIdentifierSchemaByCountry API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param countryCode The two-letter ISO-3166 country code for which the schema should be retrieved.</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    * @param type Specifies whether to return the request or response schema. (optional)</param>
    */
    public class TaxIdentifierSchemaByCountryRequest {
        private String avalaraVersion;
        private String countryCode;
        private String xAvalaraClient;
        private String xCorrelationID;
        private String type;

        public TaxIdentifierSchemaByCountryRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getCountryCode() { return countryCode; }
        public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns TaxIdentifierSchemaByCountryRequest
    */
    public TaxIdentifierSchemaByCountryRequest getTaxIdentifierSchemaByCountryRequest() {
        return this.new TaxIdentifierSchemaByCountryRequest();
    }

    /**
     * Build call for validateTaxIdentifier
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call validateTaxIdentifierCall(ValidateTaxIdentifierRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getTaxIdentifierRequest();

        // create path and map variables
        String localVarPath = "/einvoicing/tax-identifiers/validate";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call validateTaxIdentifierValidateBeforeCall(ValidateTaxIdentifierRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling validateTaxIdentifier(Async)");
        }
        
        // verify the required parameter 'requestParameters.taxIdentifierRequest' is set
        if (requestParameters.getTaxIdentifierRequest() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.taxIdentifierRequest' when calling validateTaxIdentifier(Async)");
        }
        

        okhttp3.Call localVarCall = validateTaxIdentifierCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Validates a tax identifier.
     * This endpoint verifies whether a given tax identifier is valid and properly formatted according to the rules of the applicable country or tax system.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return TaxIdentifierResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public TaxIdentifierResponse validateTaxIdentifier(ValidateTaxIdentifierRequest requestParameters) throws ApiException {
        ApiResponse<TaxIdentifierResponse> localVarResp = validateTaxIdentifierWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Validates a tax identifier.
     * This endpoint verifies whether a given tax identifier is valid and properly formatted according to the rules of the applicable country or tax system.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;TaxIdentifierResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<TaxIdentifierResponse> validateTaxIdentifierWithHttpInfo(ValidateTaxIdentifierRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = validateTaxIdentifierValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<TaxIdentifierResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Validates a tax identifier. (asynchronously)
     * This endpoint verifies whether a given tax identifier is valid and properly formatted according to the rules of the applicable country or tax system.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid request </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 429 </td><td> Rate limit exceeded </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call validateTaxIdentifierAsync(ValidateTaxIdentifierRequest requestParameters, final ApiCallback<TaxIdentifierResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateTaxIdentifierValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<TaxIdentifierResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the ValidateTaxIdentifier API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used.</param>
    * @param taxIdentifierRequest </param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\". (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    */
    public class ValidateTaxIdentifierRequest {
        private String avalaraVersion;
        private TaxIdentifierRequest taxIdentifierRequest;
        private String xAvalaraClient;
        private String xCorrelationID;

        public ValidateTaxIdentifierRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public TaxIdentifierRequest getTaxIdentifierRequest() { return taxIdentifierRequest; }
        public void setTaxIdentifierRequest(TaxIdentifierRequest taxIdentifierRequest) { this.taxIdentifierRequest = taxIdentifierRequest; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns ValidateTaxIdentifierRequest
    */
    public ValidateTaxIdentifierRequest getValidateTaxIdentifierRequest() {
        return this.new ValidateTaxIdentifierRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("25.11.2");
    }
}

