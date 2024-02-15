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
        configuration.setBearerToken(dotenv.get("token"));
        return configuration;
    }

    @Test
    public void testGetDocuments() throws Exception {
        ApiClient apiClient = new ApiClient(configuration);
        Avalara.SDK.api.EInvoicing.V1.DocumentsApi apiInstance = new DocumentsApi(apiClient);
        DocumentsApi.GetDocumentListRequest request = apiInstance.getGetDocumentListRequest();
        request.setAvalaraVersion("1.0");
        DocumentListResponse result = apiInstance.getDocumentList(request);
        Assert.assertNotNull(result);
    }
}