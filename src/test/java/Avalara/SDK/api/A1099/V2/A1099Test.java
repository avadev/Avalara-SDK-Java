package Avalara.SDK.api.A1099.V2;

import Avalara.SDK.*;
import Avalara.SDK.api.A1099.V2.Issuers1099Api;
import Avalara.SDK.api.A1099.V2.CompaniesW9Api;
import Avalara.SDK.api.A1099.V2.Forms1099Api;
import Avalara.SDK.api.A1099.V2.FormsW9Api;
import Avalara.SDK.model.A1099.V2.*;
import io.github.cdimascio.dotenv.Dotenv;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for A1099 endpoints using JUnit.
 */
public class A1099Test {
    private ApiClient apiClient;
    private Issuers1099Api issuersApi;
    private CompaniesW9Api companiesApi;
    private Forms1099Api forms1099Api;

    @Before
    public void setUp() throws Exception {
        // Load environment variables
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        configuration.setBearerToken(dotenv.get("BEARER_TOKEN_A1099"));
        configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
        // Override base URL if needed:
        // configuration.setTestBasePath(dotenv.get("A1099_BASE_URL"));

        apiClient = new ApiClient(configuration);
        issuersApi = new Issuers1099Api(apiClient);
        companiesApi = new CompaniesW9Api(apiClient);
        forms1099Api = new Forms1099Api(apiClient);
    }

    @Test
    public void testGetIssuers() throws Exception {
        Issuers1099Api.GetIssuersRequest request = issuersApi.getGetIssuersRequest();
        request.set$top(10);
        request.set$skip(0);
        request.setCount(true);
        request.setXCorrelationId("2bbbed41-2466-4cf6-9cca-a3258bdc8eba");

        PaginatedQueryResultModelIssuerResponse response = issuersApi.getIssuers(request);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getValue());
    }

    @Test
    public void testGetCompanies() throws Exception {
        CompaniesW9Api.GetCompaniesRequest request = companiesApi.getGetCompaniesRequest();
        request.set$top(10);
        request.set$skip(0);
        request.setCount(true);
        request.setXCorrelationId("2bbbed41-2466-4cf6-9cca-a3258bdc8eba");

        PaginatedQueryResultModelCompanyResponse response = companiesApi.getCompanies(request);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getValue());
    }

    // @Test
    // public void testList1099Forms() throws Exception {
    // Forms1099Api.List1099FormsRequest request =
    // forms1099Api.getList1099FormsRequest();
    // request.set$top(10);
    // request.set$skip(0);
    // request.setXCorrelationId("2bbbed41-2466-4cf6-9cca-a3258bdc8eba");

    // Form1099List response = forms1099Api.list1099Forms(request);
    // Assert.assertNotNull(response);
    // Assert.assertNotNull(response.getData());
    // }

    // @Test
    // public void testListW9Forms() throws Exception {
    // FormsW9Api.ListW9FormsRequest request = formsW9Api.getListW9FormsRequest();
    // request.setTop(10);
    // request.setSkip(0);

    // ListW9FormsResponse response = formsW9Api.listW9Forms(request);
    // Assert.assertNotNull(response);
    // Assert.assertNotNull(response.getValue());
    // }
}
