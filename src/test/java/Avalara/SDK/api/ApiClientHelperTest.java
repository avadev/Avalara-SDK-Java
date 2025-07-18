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
 * @version    0.0.1
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.api;

import Avalara.SDK.*;
import io.github.cdimascio.dotenv.Dotenv;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ApiClientHelperTest {
    private final Configuration configuration;

    public ApiClientHelperTest() {
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
        configuration.setTestBasePath("https://localhost:3000");
        return configuration;
    }


    @Test
    @Disabled("Not currently supported")
    void verifyDeviceAuthorizationFlow() throws Exception {
        DeviceAuthResponse response = ApiClientHelper.initiateDeviceAuthorizationOAuth(null, configuration);
        DeviceAccessTokenResponse tokenResponse = ApiClientHelper.getAccessTokenForDeviceFlow(response.getDeviceCode(), configuration);
        Assertions.assertEquals("authorization_pending", tokenResponse.getErrorMessage());
    }

    @Test
    @Disabled("For this test to run, you need to authenticate manually using user code by pausing the flow at line 145 and then proceed")
    void verifyRefreshTokenFlow() throws Exception {
        DeviceAuthResponse response = ApiClientHelper.initiateDeviceAuthorizationOAuth(null, configuration);
        DeviceAccessTokenResponse tokenResponse = ApiClientHelper.getAccessTokenForDeviceFlow(response.getDeviceCode(), configuration);
        String refreshToken = tokenResponse.getRefreshToken();
        tokenResponse = ApiClientHelper.getAccessTokenUsingRefreshTokenForDeviceCodeFlow(refreshToken, configuration);
        Assertions.assertNotNull(tokenResponse.getIdToken());
        Assertions.assertNotNull(tokenResponse.getAccessToken());
    }
}