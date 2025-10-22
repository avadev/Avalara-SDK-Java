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
import java.io.File;
import Avalara.SDK.model.EInvoicing.V1.SubmitInteropDocument202Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InteropApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InteropApi(ApiClient apiClient) {
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
     * Build call for submitInteropDocument
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Document Accepted. This doesn&#39;t mean it is processed. This is just a transport ack. </td><td>  * X-Correlation-ID -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad/Invalid Request. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call submitInteropDocumentCall(SubmitInteropDocumentRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/interop/documents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getFileName() != null) {
            localVarFormParams.put("fileName", requestParameters.getFileName());
        }

        if (requestParameters.getDocumentType() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("documentType", requestParameters.getDocumentType()));
        }

        if (requestParameters.getInterchangeType() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("interchangeType", requestParameters.getInterchangeType()));
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
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        String[] localVarAuthNames = new String[] { "OAuth", "Bearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call submitInteropDocumentValidateBeforeCall(SubmitInteropDocumentRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.documentType' is set
        if (requestParameters.getDocumentType() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.documentType' when calling submitInteropDocument(Async)");
        }
        
        // verify the required parameter 'requestParameters.interchangeType' is set
        if (requestParameters.getInterchangeType() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.interchangeType' when calling submitInteropDocument(Async)");
        }
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling submitInteropDocument(Async)");
        }
        

        okhttp3.Call localVarCall = submitInteropDocumentCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Submit a document
     * This API used by the interoperability partners to submit a document to  their trading partners in Avalara on behalf of their customers. 
     * @param requestOptions Object which represents the options available for a given API/request
     * @return SubmitInteropDocument202Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Document Accepted. This doesn&#39;t mean it is processed. This is just a transport ack. </td><td>  * X-Correlation-ID -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad/Invalid Request. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public SubmitInteropDocument202Response submitInteropDocument(SubmitInteropDocumentRequest requestParameters) throws ApiException {
        ApiResponse<SubmitInteropDocument202Response> localVarResp = submitInteropDocumentWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Submit a document
     * This API used by the interoperability partners to submit a document to  their trading partners in Avalara on behalf of their customers. 
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;SubmitInteropDocument202Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Document Accepted. This doesn&#39;t mean it is processed. This is just a transport ack. </td><td>  * X-Correlation-ID -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad/Invalid Request. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<SubmitInteropDocument202Response> submitInteropDocumentWithHttpInfo(SubmitInteropDocumentRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = submitInteropDocumentValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<SubmitInteropDocument202Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Submit a document (asynchronously)
     * This API used by the interoperability partners to submit a document to  their trading partners in Avalara on behalf of their customers. 
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Document Accepted. This doesn&#39;t mean it is processed. This is just a transport ack. </td><td>  * X-Correlation-ID -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad/Invalid Request. </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * X-Correlation-Id -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  * X-Correlation-Id -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call submitInteropDocumentAsync(SubmitInteropDocumentRequest requestParameters, final ApiCallback<SubmitInteropDocument202Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitInteropDocumentValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<SubmitInteropDocument202Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the SubmitInteropDocument API
    *
    * @param documentType Type of the document being uploaded. Partners will be configured in Avalara system to send only certain types of documents.</param>
    * @param interchangeType Type of interchange (codes in Avalara system that uniquely identifies a type of interchange). Partners will be configured in Avalara system to send documents belonging to certain types of interchanges.</param>
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a \"Fingerprint\" (optional)</param>
    * @param xCorrelationID The caller can use this as an identifier to use as a correlation id to trace the call. (optional)</param>
    * @param fileName The file to be uploaded (e.g., UBL XML, CII XML). (optional)</param>
    */
    public class SubmitInteropDocumentRequest {
        private String documentType;
        private String interchangeType;
        private String avalaraVersion;
        private String xAvalaraClient;
        private String xCorrelationID;
        private File fileName;

        public SubmitInteropDocumentRequest () {
        }

        public String getDocumentType() { return documentType; }
        public void setDocumentType(String documentType) { this.documentType = documentType; }
        public String getInterchangeType() { return interchangeType; }
        public void setInterchangeType(String interchangeType) { this.interchangeType = interchangeType; }
        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public String getXCorrelationID() { return xCorrelationID; }
        public void setXCorrelationID(String xCorrelationID) { this.xCorrelationID = xCorrelationID; }
        public File getFileName() { return fileName; }
        public void setFileName(File fileName) { this.fileName = fileName; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns SubmitInteropDocumentRequest
    */
    public SubmitInteropDocumentRequest getSubmitInteropDocumentRequest() {
        return this.new SubmitInteropDocumentRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("25.10.1");
    }
}

