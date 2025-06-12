/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara Shipping Verification for Beverage Alcohol
 *
 * API for evaluating transactions against direct-to-consumer Beverage Alcohol shipping regulations.  This API is currently in beta.
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    2.4.22
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.api.EInvoicing.V1;

import Avalara.SDK.*;
import Avalara.SDK.model.EInvoicing.V1.DocumentListResponse;
import Avalara.SDK.model.EInvoicing.V1.MandatesResponse;
import io.github.cdimascio.dotenv.Dotenv;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

/**
 * API tests for UtilitiesApi
 */
public class EInvoicingTest {
    private Configuration configuration;

    public EInvoicingTest() {
        configuration = getConfiguration();
    }

    @NotNull
    private Configuration getConfiguration() {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().ignoreIfMalformed().load();
        Configuration configuration = new Configuration();
        configuration.setAppName("Test");
        configuration.setAppVersion("1.0");
        configuration.setMachineName("LocalBox");
        configuration.setTimeout(5000);
        configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
        configuration.setBearerToken(
                "eyJhbGciOiJSUzI1NiIsImtpZCI6IkRFMjlBOUU2MTQ1OUNDRjAxNjAxQzk1RTk5NzkwMDg1NjUzRTQwRTFSUzI1NiIsInR5cCI6ImF0K2p3dCIsIng1dCI6IjNpbXA1aFJaelBBV0FjbGVtWGtBaFdVLVFPRSJ9.eyJuYmYiOjE3NDk3NTYwNTMsImV4cCI6MTc0OTc1OTY1MywiaXNzIjoiaHR0cHM6Ly9haS1zYnguYXZsci5zaCIsImNsaWVudF9pZCI6IjhjYzk1ZjY5ZTcxZTRjNDE5NzA1NTFlNmZjMDVkMjhmIiwib3JnIjoiNjRjOGZmNzAxNjM0YWNjZGZiM2I1MDgyIiwidGlkIjoiNjRjOGZmNzAzNTU2MTViNTU0YTEyOTgxIiwiYXBwSWQiOiI2NGM4ZmY3NTE2MzRhY2NkZmIzYjUwODUiLCJ0LWdydCI6IntcInVybjphdmFsYXJhOnN5c3RlbXM6ZGVzXCI6W3tcInBcIjpbXCJkb2N1bWVudF9zdWJtaXRcIixcImRvY3VtZW50X3JlYWRcIixcImRvY3VtZW50X3NlYXJjaFwiLFwiZG9jdW1lbnRfc3RhdHVzXCIsXCJkZWZpbml0aW9uc192aWV3XCIsXCJkaXJlY3Rvcnlfc2VhcmNoXCIsXCJ3ZWJob29rX2NyZWF0ZVwiLFwid2ViaG9va19yZWFkXCIsXCJ3ZWJob29rX2RlbGV0ZVwiXSxcImNcIjpcIlwifV0sXCJ1cm46YXZhbGFyYTpzeXN0ZW1zOm9ybFwiOlt7XCJwXCI6W1wiUmVnaXN0cmF0aW9uX3JlYWRcIl0sXCJjXCI6XCJyZWdpc3RyYXRpb25UeXBlIEVRICdFLUludm9pY2UnXCJ9XSxcInVybjphdmFsYXJhOnN5c3RlbXM6Y29tcGFueVwiOlt7XCJwXCI6W1wiQ29tcGFueV9jcmVhdGVcIixcIkNvbXBhbnlfdXBkYXRlXCIsXCJDb21wYW55X2ZldGNoXCJdLFwiY1wiOlwiVGVuYW50SWQgRVEgdG9rZW4vdGVuYW50SWRcIn0se1wicFwiOltcImNvbXBhbnlfYXNwZWN0X2NyZWF0ZVwiLFwiY29tcGFueV9hc3BlY3RfZmV0Y2hcIixcImNvbXBhbnlfYXNwZWN0X3VwZGF0ZVwiLFwiY29tcGFueV9hc3BlY3RfZGVsZXRlXCJdLFwiY1wiOlwiXCJ9XX0iLCJjLWdydCI6Int9Iiwicm9sZXMiOiJ7XCJ1cm46YXZhbGFyYTpzeXN0ZW1zOmRlc1wiOltcIkRFUy1BUEktQ29uc3VtZXJcIl0sXCJ1cm46YXZhbGFyYTpzeXN0ZW1zOm9ybFwiOltcIlZpZXdlclwiXSxcInVybjphdmFsYXJhOnN5c3RlbXM6Y29tcGFueVwiOltcIk9QVVNSb2xlXCJdfSIsImp0aSI6Ijc2QjZBODU2MzJCNEE2N0QwN0Y5RUY2NEIwRjBBNDREIiwiaWF0IjoxNzQ5NzU2MDUzLCJzY29wZSI6WyJkZXNfYXBpIiwib3JsX2FwaSIsInNjcyJdfQ.g-xS7BzA0mmRjmlwj8FlXomoThjqROlkY4qinBVO_CR4NprAG5gMS3c8pxCRkrvrqadYF6bDTvScJARpFlyc2rsM_00iXgRsXwAnpftfK2DytDh3_b9hdX5-t2GbmAFQbj8Rm_nVXeak096JEV_h7AdvSwIAHpVMBAb0JTZtD-9pdBBIsFZeiS6IxFPhzaPlo8RZE1u6t_gGK1swQO9h3q1nW4JwTZCgJ5mmJb7ibSC6EXgcb-UiZ1ot22KxfC6QubEaze3OU2Xar9aux14uLfJBv6STXy7atHRz2rxHQlXoMz8-LG2gg_k_dGdWUs6giaAa5DwnApInsrgPNvLrbw");
        return configuration;
    }

    @Test
    public void testGetDocuments() throws Exception {
        ApiClient apiClient = new ApiClient(configuration);
        Avalara.SDK.api.EInvoicing.V1.DocumentsApi apiInstance = new DocumentsApi(apiClient);
        DocumentsApi.GetDocumentListRequest request = apiInstance.getGetDocumentListRequest();
        DocumentListResponse result = apiInstance.getDocumentList(request);
        Assert.assertNotNull(result);
    }

    @Test
    public void testGetMandates() throws Exception {
        ApiClient apiClient = new ApiClient(configuration);
        Avalara.SDK.api.EInvoicing.V1.MandatesApi apiInstance = new MandatesApi(apiClient);
        MandatesApi.GetMandatesRequest request = apiInstance.getGetMandatesRequest();
        MandatesResponse result = apiInstance.getMandates(request);
        Assert.assertNotNull(result.getValue());
    }
}