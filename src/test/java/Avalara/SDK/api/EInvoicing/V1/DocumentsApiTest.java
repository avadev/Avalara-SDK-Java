package Avalara.SDK.api.EInvoicing.V1;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathMatching;

import Avalara.SDK.ApiClient;
import Avalara.SDK.ApiResponse;
import Avalara.SDK.AvaTaxEnvironment;
import Avalara.SDK.Configuration;
import Avalara.SDK.api.EInvoicing.V1.DocumentsApi.DownloadDocumentRequest;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.List;
import okhttp3.Call;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wiremock.org.apache.commons.io.FileUtils;

@WireMockTest
class DocumentsApiTest {


    public static final byte[] RESPONSE_CONTENT = "Example".getBytes();
    public static final String TRANSACTION_ID = "transactionId";
    public static final String X_AVALARA_CLIENT = "X_AVALARA_CLIENT";
    public static final String AVALARA_VERSION = "1.3";
    public static final String CONTENT_TYPE = "Content-Type";

    @Test
    void shouldDownloadDocumentWithoutInputCheckAndNoAcceptHeaderDefined(WireMockRuntimeInfo wireMockRuntimeInfo) throws Exception {
        // given
        // setup wiremock
        String contentType = "application/json";
        setUpWiremock_OkWithAcceptedHeader(contentType);

        // create documentApi
        DocumentsApi documentsApi = setupDocumentApi(wireMockRuntimeInfo);

        // when
        DownloadDocumentRequest request = documentsApi.getDownloadDocumentRequest();
        request.setDocumentId(TRANSACTION_ID);
        request.setXAvalaraClient(X_AVALARA_CLIENT);
        request.setAvalaraVersion(AVALARA_VERSION);
        Call call = documentsApi.downloadDocumentCall(request, null);
        ApiResponse<File> fileApiResponse = documentsApi.getApiClient().execute(call, new TypeToken<File>() {}.getType());


        // then
        Assertions.assertEquals(200, fileApiResponse.getStatusCode());
        Assertions.assertEquals(List.of(contentType), fileApiResponse.getHeaders().get(CONTENT_TYPE));
        File file = fileApiResponse.getData();
        byte[] bytes = FileUtils.readFileToByteArray(file);
        Assertions.assertArrayEquals(RESPONSE_CONTENT, bytes);
    }


    @Test
    void shouldDownloadDocumentWithHttpInfoAsPdf(WireMockRuntimeInfo wireMockRuntimeInfo) throws Exception {
        // given
        // setup wiremock
        String contentType = "application/pdf";
        setUpWiremock_OkWithAcceptedHeader(contentType);

        // create documentApi
        DocumentsApi documentsApi = setupDocumentApi(wireMockRuntimeInfo);

        // when
        DownloadDocumentRequest request = documentsApi.getDownloadDocumentRequest();
        request.setDocumentId(TRANSACTION_ID);
        request.setXAvalaraClient(X_AVALARA_CLIENT);
        request.setAvalaraVersion(AVALARA_VERSION);
        request.setAccept(contentType);
        ApiResponse<File> fileApiResponse = documentsApi.downloadDocumentWithHttpInfo(request);

        // then
        Assertions.assertEquals(200, fileApiResponse.getStatusCode());
        Assertions.assertEquals(List.of(contentType), fileApiResponse.getHeaders().get(CONTENT_TYPE));
        File file = fileApiResponse.getData();
        byte[] bytes = FileUtils.readFileToByteArray(file);
        Assertions.assertArrayEquals(RESPONSE_CONTENT, bytes);
    }

    @Test
    void shouldDownloadDocumentWithHttpInfoAsXml(WireMockRuntimeInfo wireMockRuntimeInfo) throws Exception {
        // given
        // setup wiremock
        String contentType = "application/xml";
        setUpWiremock_OkWithAcceptedHeader(contentType);

        // create documentApi
        DocumentsApi documentsApi = setupDocumentApi(wireMockRuntimeInfo);

        // when
        DownloadDocumentRequest request = documentsApi.getDownloadDocumentRequest();
        request.setDocumentId(TRANSACTION_ID);
        request.setXAvalaraClient(X_AVALARA_CLIENT);
        request.setAvalaraVersion(AVALARA_VERSION);
        request.setAccept(contentType);
        ApiResponse<File> fileApiResponse = documentsApi.downloadDocumentWithHttpInfo(request);

        // then
        Assertions.assertEquals(200, fileApiResponse.getStatusCode());
        Assertions.assertEquals(List.of(contentType), fileApiResponse.getHeaders().get(CONTENT_TYPE));
        File file = fileApiResponse.getData();
        byte[] bytes = FileUtils.readFileToByteArray(file);
        Assertions.assertArrayEquals(RESPONSE_CONTENT, bytes);
    }

    private static DocumentsApi setupDocumentApi(WireMockRuntimeInfo wireMockRuntimeInfo) throws Exception {
        String httpBaseUrl = wireMockRuntimeInfo.getHttpBaseUrl();
        Configuration configuration = new Configuration();
        String bearerToken = "BearerToken";
        configuration.setBearerToken(bearerToken);
        configuration.setAppName("AppName");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("MachineName");
        configuration.setTimeout(20000);
        configuration.setEnvironment(AvaTaxEnvironment.Test);
        configuration.setTokenUrl(httpBaseUrl);
        configuration.setTestBasePath(httpBaseUrl);
        ApiClient apiClient = new ApiClient(configuration);
        DocumentsApi documentsApi = new DocumentsApi(apiClient);
        return documentsApi;
    }

    private static void setUpWiremock_OkWithAcceptedHeader(String contentType) {
        MappingBuilder mappingBuilder = WireMock.get(urlPathMatching("/einvoicing/documents/transactionId/\\$download"))
                .withHeader("Accept", equalTo(contentType));
        ResponseDefinitionBuilder responseBuilder = aResponse().withStatus(200)
                .withHeader(CONTENT_TYPE, contentType)
                .withBody(RESPONSE_CONTENT);
        stubFor(mappingBuilder.willReturn(responseBuilder));
    }
}