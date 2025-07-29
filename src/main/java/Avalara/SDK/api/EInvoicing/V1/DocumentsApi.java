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


import Avalara.SDK.model.EInvoicing.V1.BadDownloadRequest;
import Avalara.SDK.model.EInvoicing.V1.BadRequest;
import Avalara.SDK.model.EInvoicing.V1.DocumentFetch;
import Avalara.SDK.model.EInvoicing.V1.DocumentListResponse;
import Avalara.SDK.model.EInvoicing.V1.DocumentStatusResponse;
import Avalara.SDK.model.EInvoicing.V1.DocumentSubmissionError;
import Avalara.SDK.model.EInvoicing.V1.DocumentSubmitResponse;
import Avalara.SDK.model.EInvoicing.V1.FetchDocumentsRequest;
import java.io.File;
import Avalara.SDK.model.EInvoicing.V1.ForbiddenError;
import Avalara.SDK.model.EInvoicing.V1.InternalServerError;
import Avalara.SDK.model.EInvoicing.V1.NotFoundError;
import java.time.OffsetDateTime;
import Avalara.SDK.model.EInvoicing.V1.SubmitDocumentMetadata;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DocumentsApi(ApiClient apiClient) {
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
     * Build call for downloadDocument
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Content-type -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A document for the specified ID was not found. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Unsupported document format was requested in the Accept header </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadDocumentCall(DownloadDocumentRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/documents/{documentId}/$download"
            .replaceAll("\\{" + "documentId" + "\\}", localVarApiClient.escapeString(requestParameters.documentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getAccept() != null) {
            localVarHeaderParams.put("Accept", localVarApiClient.parameterToString(requestParameters.getAccept()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/pdf", "application/xml", "application/json"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadDocumentValidateBeforeCall(DownloadDocumentRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling downloadDocument(Async)");
        }
        
        // verify the required parameter 'requestParameters.accept' is set
        if (requestParameters.getAccept() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.accept' when calling downloadDocument(Async)");
        }
        
        // verify the required parameter 'requestParameters.documentId' is set
        if (requestParameters.getDocumentId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.documentId' when calling downloadDocument(Async)");
        }
        

        okhttp3.Call localVarCall = downloadDocumentCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns a copy of the document
     * When the document is available, use this endpoint to download it as text, XML, or PDF. The output format needs to be specified in the Accept header, and it will vary depending on the mandate. If the file has not yet been created, then status code 404 (not found) is returned.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Content-type -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A document for the specified ID was not found. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Unsupported document format was requested in the Accept header </td><td>  -  </td></tr>
     </table>
     */
    public File downloadDocument(DownloadDocumentRequest requestParameters) throws ApiException {
        ApiResponse<File> localVarResp = downloadDocumentWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns a copy of the document
     * When the document is available, use this endpoint to download it as text, XML, or PDF. The output format needs to be specified in the Accept header, and it will vary depending on the mandate. If the file has not yet been created, then status code 404 (not found) is returned.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Content-type -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A document for the specified ID was not found. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Unsupported document format was requested in the Accept header </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> downloadDocumentWithHttpInfo(DownloadDocumentRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = downloadDocumentValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a copy of the document (asynchronously)
     * When the document is available, use this endpoint to download it as text, XML, or PDF. The output format needs to be specified in the Accept header, and it will vary depending on the mandate. If the file has not yet been created, then status code 404 (not found) is returned.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * Content-type -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A document for the specified ID was not found. </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Unsupported document format was requested in the Accept header </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadDocumentAsync(DownloadDocumentRequest requestParameters, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadDocumentValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the DownloadDocument API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param accept This header indicates the MIME type of the document</param>
    * @param documentId The unique ID for this document that was returned in the POST /einvoicing/document response body</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. (optional)</param>
    */
    public class DownloadDocumentRequest {
        private String avalaraVersion;
        private String accept;
        private String documentId;
        private String xAvalaraClient;

        public DownloadDocumentRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getAccept() { return accept; }
        public void setAccept(String accept) { this.accept = accept; }
        public String getDocumentId() { return documentId; }
        public void setDocumentId(String documentId) { this.documentId = documentId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns DownloadDocumentRequest
    */
    public DownloadDocumentRequest getDownloadDocumentRequest() {
        return this.new DownloadDocumentRequest();
    }

    /**
     * Build call for fetchDocuments
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Accepted DocumentFetch Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchDocumentsCall(FetchDocumentsRequest requestParameters, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestParameters.getFetchDocumentsRequest();

        // create path and map variables
        String localVarPath = "/einvoicing/documents/$fetch";

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

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
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
    private okhttp3.Call fetchDocumentsValidateBeforeCall(FetchDocumentsRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling fetchDocuments(Async)");
        }
        
        // verify the required parameter 'requestParameters.fetchDocumentsRequest' is set
        if (requestParameters.getFetchDocumentsRequest() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.fetchDocumentsRequest' when calling fetchDocuments(Async)");
        }
        

        okhttp3.Call localVarCall = fetchDocumentsCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Fetch the inbound document from a tax authority
     * This API allows you to retrieve an inbound document. Pass key-value pairs as parameters in the request, such as the confirmation number, supplier number, and buyer VAT number.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return DocumentFetch
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Accepted DocumentFetch Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public DocumentFetch fetchDocuments(FetchDocumentsRequest requestParameters) throws ApiException {
        ApiResponse<DocumentFetch> localVarResp = fetchDocumentsWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Fetch the inbound document from a tax authority
     * This API allows you to retrieve an inbound document. Pass key-value pairs as parameters in the request, such as the confirmation number, supplier number, and buyer VAT number.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;DocumentFetch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Accepted DocumentFetch Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentFetch> fetchDocumentsWithHttpInfo(FetchDocumentsRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = fetchDocumentsValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<DocumentFetch>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch the inbound document from a tax authority (asynchronously)
     * This API allows you to retrieve an inbound document. Pass key-value pairs as parameters in the request, such as the confirmation number, supplier number, and buyer VAT number.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Accepted DocumentFetch Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call fetchDocumentsAsync(FetchDocumentsRequest requestParameters, final ApiCallback<DocumentFetch> _callback) throws ApiException {

        okhttp3.Call localVarCall = fetchDocumentsValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<DocumentFetch>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the FetchDocuments API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param fetchDocumentsRequest </param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. (optional)</param>
    */
    public class FetchDocumentsRequest {
        private String avalaraVersion;
        private FetchDocumentsRequest fetchDocumentsRequest;
        private String xAvalaraClient;

        public FetchDocumentsRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public FetchDocumentsRequest getFetchDocumentsRequest() { return fetchDocumentsRequest; }
        public void setFetchDocumentsRequest(FetchDocumentsRequest fetchDocumentsRequest) { this.fetchDocumentsRequest = fetchDocumentsRequest; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns FetchDocumentsRequest
    */
    public FetchDocumentsRequest getFetchDocumentsRequest() {
        return this.new FetchDocumentsRequest();
    }

    /**
     * Build call for getDocumentList
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentListCall(GetDocumentListRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/documents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getStartDate() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", requestParameters.getStartDate()));
        }

        if (requestParameters.getEndDate() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDate", requestParameters.getEndDate()));
        }

        if (requestParameters.getFlow() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("flow", requestParameters.getFlow()));
        }

        if (requestParameters.get$count() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$count", requestParameters.get$count()));
        }

        if (requestParameters.get$countOnly() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$countOnly", requestParameters.get$countOnly()));
        }

        if (requestParameters.get$filter() != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("$filter", requestParameters.get$filter()));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDocumentListValidateBeforeCall(GetDocumentListRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getDocumentList(Async)");
        }
        

        okhttp3.Call localVarCall = getDocumentListCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Returns a summary of documents for a date range
     * Get a list of documents on the Avalara E-Invoicing platform that have a processing date within the specified date range.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return DocumentListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public DocumentListResponse getDocumentList(GetDocumentListRequest requestParameters) throws ApiException {
        ApiResponse<DocumentListResponse> localVarResp = getDocumentListWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Returns a summary of documents for a date range
     * Get a list of documents on the Avalara E-Invoicing platform that have a processing date within the specified date range.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;DocumentListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentListResponse> getDocumentListWithHttpInfo(GetDocumentListRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getDocumentListValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<DocumentListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a summary of documents for a date range (asynchronously)
     * Get a list of documents on the Avalara E-Invoicing platform that have a processing date within the specified date range.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentListAsync(GetDocumentListRequest requestParameters, final ApiCallback<DocumentListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentListValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<DocumentListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetDocumentList API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. (optional)</param>
    * @param startDate Start date of documents to return. This defaults to the previous month. (optional)</param>
    * @param endDate End date of documents to return. This defaults to the current date. (optional)</param>
    * @param flow Optionally filter by document direction, where issued = `out` and received = `in` (optional)</param>
    * @param $count When set to true, the count of the collection is also returned in the response body (optional)</param>
    * @param $countOnly When set to true, only the count of the collection is returned (optional)</param>
    * @param $filter Filter by field name and value. This filter only supports <code>eq</code> . Refer to [https://developer.avalara.com/avatax/filtering-in-rest/](https://developer.avalara.com/avatax/filtering-in-rest/) for more information on filtering. Filtering will be done over the provided startDate and endDate. If no startDate or endDate is provided, defaults will be assumed. (optional)</param>
    * @param $top The number of items to include in the result. (optional)</param>
    * @param $skip If nonzero, skip this number of results before returning data. Used with <code>$top</code> to provide pagination for large datasets. (optional)</param>
    */
    public class GetDocumentListRequest {
        private String avalaraVersion;
        private String xAvalaraClient;
        private OffsetDateTime startDate;
        private OffsetDateTime endDate;
        private String flow;
        private String $count;
        private String $countOnly;
        private String $filter;
        private Integer $top;
        private String $skip;

        public GetDocumentListRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
        public OffsetDateTime getStartDate() { return startDate; }
        public void setStartDate(OffsetDateTime startDate) { this.startDate = startDate; }
        public OffsetDateTime getEndDate() { return endDate; }
        public void setEndDate(OffsetDateTime endDate) { this.endDate = endDate; }
        public String getFlow() { return flow; }
        public void setFlow(String flow) { this.flow = flow; }
        public String get$count() { return $count; }
        public void set$count(String $count) { this.$count = $count; }
        public String get$countOnly() { return $countOnly; }
        public void set$countOnly(String $countOnly) { this.$countOnly = $countOnly; }
        public String get$filter() { return $filter; }
        public void set$filter(String $filter) { this.$filter = $filter; }
        public Integer get$top() { return $top; }
        public void set$top(Integer $top) { this.$top = $top; }
        public String get$skip() { return $skip; }
        public void set$skip(String $skip) { this.$skip = $skip; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetDocumentListRequest
    */
    public GetDocumentListRequest getGetDocumentListRequest() {
        return this.new GetDocumentListRequest();
    }

    /**
     * Build call for getDocumentStatus
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
        <tr><td> 404 </td><td> A document for the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentStatusCall(GetDocumentStatusRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/documents/{documentId}/status"
            .replaceAll("\\{" + "documentId" + "\\}", localVarApiClient.escapeString(requestParameters.documentId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, requiredScopes, AvalaraMicroservice.EInvoicing);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDocumentStatusValidateBeforeCall(GetDocumentStatusRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling getDocumentStatus(Async)");
        }
        
        // verify the required parameter 'requestParameters.documentId' is set
        if (requestParameters.getDocumentId() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.documentId' when calling getDocumentStatus(Async)");
        }
        

        okhttp3.Call localVarCall = getDocumentStatusCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Checks the status of a document
     * Using the unique ID from POST /einvoicing/documents response body, request the current status of a document.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return DocumentStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A document for the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public DocumentStatusResponse getDocumentStatus(GetDocumentStatusRequest requestParameters) throws ApiException {
        ApiResponse<DocumentStatusResponse> localVarResp = getDocumentStatusWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Checks the status of a document
     * Using the unique ID from POST /einvoicing/documents response body, request the current status of a document.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;DocumentStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> A document for the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentStatusResponse> getDocumentStatusWithHttpInfo(GetDocumentStatusRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = getDocumentStatusValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<DocumentStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Checks the status of a document (asynchronously)
     * Using the unique ID from POST /einvoicing/documents response body, request the current status of a document.
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
        <tr><td> 404 </td><td> A document for the specified ID was not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentStatusAsync(GetDocumentStatusRequest requestParameters, final ApiCallback<DocumentStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentStatusValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<DocumentStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the GetDocumentStatus API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param documentId The unique ID for this document that was returned in the POST /einvoicing/documents response body</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. (optional)</param>
    */
    public class GetDocumentStatusRequest {
        private String avalaraVersion;
        private String documentId;
        private String xAvalaraClient;

        public GetDocumentStatusRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public String getDocumentId() { return documentId; }
        public void setDocumentId(String documentId) { this.documentId = documentId; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns GetDocumentStatusRequest
    */
    public GetDocumentStatusRequest getGetDocumentStatusRequest() {
        return this.new GetDocumentStatusRequest();
    }

    /**
     * Build call for submitDocument
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitDocumentCall(SubmitDocumentRequest requestParameters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/einvoicing/documents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (requestParameters.getMetadata() != null) {
            localVarFormParams.put("metadata", requestParameters.getMetadata());
        }

        if (requestParameters.getData() != null) {
            localVarFormParams.put("data", requestParameters.getData());
        }

        if (requestParameters.getAvalaraVersion() != null) {
            localVarHeaderParams.put("avalara-version", localVarApiClient.parameterToString(requestParameters.getAvalaraVersion()));
        }

        if (requestParameters.getXAvalaraClient() != null) {
            localVarHeaderParams.put("X-Avalara-Client", localVarApiClient.parameterToString(requestParameters.getXAvalaraClient()));
        }

        final String[] localVarAccepts = {
            "application/json", "text/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
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
    private okhttp3.Call submitDocumentValidateBeforeCall(SubmitDocumentRequest requestParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestParameters.avalaraVersion' is set
        if (requestParameters.getAvalaraVersion() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.avalaraVersion' when calling submitDocument(Async)");
        }
        
        // verify the required parameter 'requestParameters.metadata' is set
        if (requestParameters.getMetadata() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.metadata' when calling submitDocument(Async)");
        }
        
        // verify the required parameter 'requestParameters.data' is set
        if (requestParameters.getData() == null) {
            throw new ApiException("Missing the required parameter 'requestParameters.data' when calling submitDocument(Async)");
        }
        

        okhttp3.Call localVarCall = submitDocumentCall(requestParameters, _callback);
        return localVarCall;

    }

    /**
     * Submits a document to Avalara E-Invoicing API
     * When a UBL document is sent to this endpoint, it generates a document in the required format as mandated by the specified country. Additionally, it initiates the workflow to transmit the generated document to the relevant tax authority, if necessary.&lt;br&gt;&lt;br&gt;The response from the endpoint contains a unique document ID, which can be used to request the status of the document and verify if it was successfully accepted at the destination.&lt;br&gt;&lt;br&gt;Furthermore, the unique ID enables the download of a copy of the generated document for reference purposes.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return DocumentSubmitResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public DocumentSubmitResponse submitDocument(SubmitDocumentRequest requestParameters) throws ApiException {
        ApiResponse<DocumentSubmitResponse> localVarResp = submitDocumentWithHttpInfo(requestParameters);
        return localVarResp.getData();
    }

    /**
     * Submits a document to Avalara E-Invoicing API
     * When a UBL document is sent to this endpoint, it generates a document in the required format as mandated by the specified country. Additionally, it initiates the workflow to transmit the generated document to the relevant tax authority, if necessary.&lt;br&gt;&lt;br&gt;The response from the endpoint contains a unique document ID, which can be used to request the status of the document and verify if it was successfully accepted at the destination.&lt;br&gt;&lt;br&gt;Furthermore, the unique ID enables the download of a copy of the generated document for reference purposes.
     * @param requestOptions Object which represents the options available for a given API/request
     * @return ApiResponse&lt;DocumentSubmitResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocumentSubmitResponse> submitDocumentWithHttpInfo(SubmitDocumentRequest requestParameters) throws ApiException {
        okhttp3.Call localVarCall = submitDocumentValidateBeforeCall(requestParameters, null);
        Type localVarReturnType = new TypeToken<DocumentSubmitResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Submits a document to Avalara E-Invoicing API (asynchronously)
     * When a UBL document is sent to this endpoint, it generates a document in the required format as mandated by the specified country. Additionally, it initiates the workflow to transmit the generated document to the relevant tax authority, if necessary.&lt;br&gt;&lt;br&gt;The response from the endpoint contains a unique document ID, which can be used to request the status of the document and verify if it was successfully accepted at the destination.&lt;br&gt;&lt;br&gt;Furthermore, the unique ID enables the download of a copy of the generated document for reference purposes.
     * @param requestOptions Object which represents the options available for a given API/request
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitDocumentAsync(SubmitDocumentRequest requestParameters, final ApiCallback<DocumentSubmitResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitDocumentValidateBeforeCall(requestParameters, _callback);
        Type localVarReturnType = new TypeToken<DocumentSubmitResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
    * Represents the Request object for the SubmitDocument API
    *
    * @param avalaraVersion The HTTP Header meant to specify the version of the API intended to be used</param>
    * @param metadata </param>
    * @param data The document to be submitted, as indicated by the metadata fields 'dataFormat' and 'dataFormatVersion'</param>
    * @param xAvalaraClient You can freely use any text you wish for this value. This feature can help you diagnose and solve problems with your software. The header can be treated like a fingerprint. (optional)</param>
    */
    public class SubmitDocumentRequest {
        private String avalaraVersion;
        private SubmitDocumentMetadata metadata;
        private Object data;
        private String xAvalaraClient;

        public SubmitDocumentRequest () {
        }

        public String getAvalaraVersion() { return (avalaraVersion != null) ? avalaraVersion : "1.4"; }
        public void setAvalaraVersion(String avalaraVersion) { this.avalaraVersion = avalaraVersion; }
        public SubmitDocumentMetadata getMetadata() { return metadata; }
        public void setMetadata(SubmitDocumentMetadata metadata) { this.metadata = metadata; }
        public Object getData() { return data; }
        public void setData(Object data) { this.data = data; }
        public String getXAvalaraClient() { return xAvalaraClient; }
        public void setXAvalaraClient(String xAvalaraClient) { this.xAvalaraClient = xAvalaraClient; }
    }

    /**
    * Getter function to instantiate Request class
    * @returns SubmitDocumentRequest
    */
    public SubmitDocumentRequest getSubmitDocumentRequest() {
        return this.new SubmitDocumentRequest();
    }

    private void SetConfiguration(ApiClient client) {
        if (client == null) throw new MissingFormatArgumentException("client");
        this.localVarApiClient.setSdkVersion("25.8.0");
    }
}

