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
 * > **Note:** You must have an active Avalara 1099 & W-9 subscription to authenticate and use these APIs. If you don't have a subscription, please contact our [Sales team](https://www.avalara.com/us/en/products/1099/request-a-demo.html).  ## Authentication  The Avalara 1099 & W-9 API uses **Bearer Token Authentication**. To authenticate, acquire a bearer token using a **Client ID** and **Client Secret** that you generate in the Avalara 1099 & W-9 web application.  The sample cURL commands below use **production** URLs. For **sandbox**, replace them with the sandbox URLs listed in the Sandbox Environment table.  ### Option 1 — Client ID and Client Secret (recommended)  **Step 1: Create API credentials in the Avalara 1099 & W-9 web app**  For a full walkthrough, see the [Avalara 1099 & W-9 integration guide](https://developer.avalara.com/products/avalara-1099-and-w9/integration-guides/1099-and-w-9/siu2796410674799/).  > **Note:** To enable credential creation you must first enter a valid company address in **Account Settings > Account** and enable two-factor authentication in **Account Settings > Security**.  1. In Avalara 1099 & W-9, open **Account Settings** (gear icon, top-right of any page) and select **API**. 2. Click **Create new credentials** (a valid company address and 2FA are required). 3. Copy your **Client Id** and **Client Secret** securely — they will not be shown again after you leave the screen.  **Step 2: Request a bearer token**  ```bash curl -X POST 'https://identity.avalara.com/connect/token' \\   --header 'Content-Type: application/x-www-form-urlencoded' \\   --data-urlencode 'grant_type=client_credentials' \\   --data-urlencode 'client_id={{client_id}}' \\   --data-urlencode 'client_secret={{client_secret}}' ```  ### Option 2 — Account ID and License Key  If your organization already uses other Avalara products (AvaTax, CertCapture) and has access to the logged-in area of Avalara.com, you can generate the bearer token using your **Account ID** and **License Key**.  > **Note:** If you already have a license key for other Avalara products you can reuse it. Generating a new key will reset any previously created key.  1. Log in to Avalara.com. 2. Go to **Settings → License and API Keys**. 3. Click **Generate New Key**. 4. Note your **Account ID** from the Account menu.  ```bash curl -X POST 'https://identity.avalara.com/connect/token' \\   --header 'Content-Type: application/x-www-form-urlencoded' \\   --data-urlencode 'grant_type=client_credentials' \\   --data-urlencode 'client_id={{accountId}}' \\   --data-urlencode 'client_secret={{licenseKey}}' ```  ### Using and renewing the bearer token  Include the token in the `Authorization` header on every request:  ```http Authorization: Bearer {access_token} ```  Tokens expire after the number of seconds in the `expires_in` field of the token response. Your integration must renew the token before it expires.  **Example token response**  ```json {   \"access_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI...\",   \"expires_in\": 3600,   \"token_type\": \"Bearer\",   \"scope\": \"avatax_api iam-ds\" } ```  ### Sandbox Environment  Use the same steps as production, replacing the base URLs:  | Purpose | Production | Sandbox | | --- | --- | --- | | Account & License Key management (web) | `https://www.avalara.com` | `https://sandbox.admin.avalara.com` | | Account & License Key management (API) | `https://rest.avatax.com` | `https://sandbox-rest.avatax.com` | | Token generation | `https://identity.avalara.com` | `https://ai-sbx.avlr.sh` |  ## Environments  #### Production - **Avalara 1099 API URL:** [`https://api.avalara.com/avalara1099`](https://api.avalara.com/avalara1099) - **Identity Token URL:** [`https://identity.avalara.com/connect/token`](https://identity.avalara.com/connect/token)  #### Sandbox - **Avalara 1099 API URL:** [`https://api.sbx.avalara.com/avalara1099`](https://api.sbx.avalara.com/avalara1099) - **Identity Token URL:** [`https://ai-sbx.avlr.sh/connect/token`](https://ai-sbx.avlr.sh/connect/token)  ---  ## API & SDK Documentation  [Avalara 1099 API Reference](https://developer.avalara.com/api-reference/avalara1099/avalara1099/)  [Avalara SDKs](https://developer.avalara.com/sdk/)  [Swagger](https://api.avalara.com/avalara1099/swagger/index.html?api-version=2.0)
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
import Avalara.SDK.model.A1099.V2.RealTimeTinMatchRequest;
import Avalara.SDK.model.A1099.V2.RealTimeTinMatchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TinMatchesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TinMatchesApi(ApiClient apiClient) {
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
     * Build call for performRealTimeTinMatch
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TIN match result (matched or rejected) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g. invalid field values) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Usage limit exceeded (10,000 successful calls per 24 hours) </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization failed (lack of permissions or product not purchased) </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> IRS Service is not available. Client should retry later. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call performRealTimeTinMatchCall(PerformRealTimeTinMatchRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getRealTimeTinMatchRequest();

        // create path and map variables
        String localVarPath = "/tin-matches/$real-time";

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
    private okhttp3.Call performRealTimeTinMatchValidateBeforeCall(PerformRealTimeTinMatchRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling performRealTimeTinMatch(Async)");
        }
        

        okhttp3.Call localVarCall = performRealTimeTinMatchCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Perform real time TIN Match
     * Perform real time TIN Match.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return RealTimeTinMatchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TIN match result (matched or rejected) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g. invalid field values) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Usage limit exceeded (10,000 successful calls per 24 hours) </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization failed (lack of permissions or product not purchased) </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> IRS Service is not available. Client should retry later. </td><td>  -  </td></tr>
     </table>
     */
    public RealTimeTinMatchResponse performRealTimeTinMatch(PerformRealTimeTinMatchRequest requestParameters) throws ApiException {
        ApiResponse<RealTimeTinMatchResponse> localVarResp = performRealTimeTinMatchWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Perform real time TIN Match
     * Perform real time TIN Match.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;RealTimeTinMatchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TIN match result (matched or rejected) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g. invalid field values) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Usage limit exceeded (10,000 successful calls per 24 hours) </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization failed (lack of permissions or product not purchased) </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> IRS Service is not available. Client should retry later. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RealTimeTinMatchResponse> performRealTimeTinMatchWithHttpInfo(PerformRealTimeTinMatchRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = performRealTimeTinMatchValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<RealTimeTinMatchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Perform real time TIN Match (asynchronously)
     * Perform real time TIN Match.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> TIN match result (matched or rejected) </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (e.g. invalid field values) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication failed </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Usage limit exceeded (10,000 successful calls per 24 hours) </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization failed (lack of permissions or product not purchased) </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> IRS Service is not available. Client should retry later. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call performRealTimeTinMatchAsync(PerformRealTimeTinMatchRequest requestParameters, final ApiCallback<RealTimeTinMatchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = performRealTimeTinMatchValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<RealTimeTinMatchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the PerformRealTimeTinMatch API
    *
    * @param avalaraVersion API version</param>
    * @param xCorrelationId Unique correlation Id in a GUID format (optional)</param>
    * @param xAvalaraClient Identifies the software you are using to call this API. For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) . (optional)</param>
    * @param realTimeTinMatchRequest Required data to perform TIN match (optional)</param>
    */
    public class PerformRealTimeTinMatchRequest {
        private String avalaraVersion;
        private String xCorrelationId;
        private String xAvalaraClient;
        private RealTimeTinMatchRequest realTimeTinMatchRequest;

        public PerformRealTimeTinMatchRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "2.0"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXCorrelationId() { return xCorrelationId; }
        public void setXCorrelationId(String xCorrelationId) { this.xCorrelationId = xCorrelationId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public RealTimeTinMatchRequest getRealTimeTinMatchRequest() { return realTimeTinMatchRequest; }
        public void setRealTimeTinMatchRequest(RealTimeTinMatchRequest realTimeTinMatchRequest) { this.realTimeTinMatchRequest = realTimeTinMatchRequest; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns PerformRealTimeTinMatchRequest
    */
    public PerformRealTimeTinMatchRequest getPerformRealTimeTinMatchRequest() {
        return this.new PerformRealTimeTinMatchRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("26.7.0");
    }
}

