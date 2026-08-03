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

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import Avalara.SDK.model.A1099.V2.EntryStatusResponse;
import Avalara.SDK.model.A1099.V2.SubstantialUsOwnerResponse;
import Avalara.SDK.model.A1099.V2.TinMatchStatusResponse;
import Avalara.SDK.model.A1099.V2.W4FormResponse;
import Avalara.SDK.model.A1099.V2.W8BenEFormResponse;
import Avalara.SDK.model.A1099.V2.W8BenFormResponse;
import Avalara.SDK.model.A1099.V2.W8ImyFormResponse;
import Avalara.SDK.model.A1099.V2.W9FormResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import Avalara.SDK.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CreateW9Form201Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateW9Form201Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateW9Form201Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateW9Form201Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<W4FormResponse> adapterW4FormResponse = gson.getDelegateAdapter(this, TypeToken.get(W4FormResponse.class));
            final TypeAdapter<W8BenEFormResponse> adapterW8BenEFormResponse = gson.getDelegateAdapter(this, TypeToken.get(W8BenEFormResponse.class));
            final TypeAdapter<W8BenFormResponse> adapterW8BenFormResponse = gson.getDelegateAdapter(this, TypeToken.get(W8BenFormResponse.class));
            final TypeAdapter<W8ImyFormResponse> adapterW8ImyFormResponse = gson.getDelegateAdapter(this, TypeToken.get(W8ImyFormResponse.class));
            final TypeAdapter<W9FormResponse> adapterW9FormResponse = gson.getDelegateAdapter(this, TypeToken.get(W9FormResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateW9Form201Response>() {
                @Override
                public void write(JsonWriter out, CreateW9Form201Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `W4FormResponse`
                    if (value.getActualInstance() instanceof W4FormResponse) {
                        JsonElement element = adapterW4FormResponse.toJsonTree((W4FormResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8BenEFormResponse`
                    if (value.getActualInstance() instanceof W8BenEFormResponse) {
                        JsonElement element = adapterW8BenEFormResponse.toJsonTree((W8BenEFormResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8BenFormResponse`
                    if (value.getActualInstance() instanceof W8BenFormResponse) {
                        JsonElement element = adapterW8BenFormResponse.toJsonTree((W8BenFormResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8ImyFormResponse`
                    if (value.getActualInstance() instanceof W8ImyFormResponse) {
                        JsonElement element = adapterW8ImyFormResponse.toJsonTree((W8ImyFormResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W9FormResponse`
                    if (value.getActualInstance() instanceof W9FormResponse) {
                        JsonElement element = adapterW9FormResponse.toJsonTree((W9FormResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: W4FormResponse, W8BenEFormResponse, W8BenFormResponse, W8ImyFormResponse, W9FormResponse");
                }

                @Override
                public CreateW9Form201Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize W4FormResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W4FormResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterW4FormResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W4FormResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W4FormResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W4FormResponse'", e);
                    }
                    // deserialize W8BenEFormResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8BenEFormResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8BenEFormResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8BenEFormResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8BenEFormResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8BenEFormResponse'", e);
                    }
                    // deserialize W8BenFormResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8BenFormResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8BenFormResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8BenFormResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8BenFormResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8BenFormResponse'", e);
                    }
                    // deserialize W8ImyFormResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8ImyFormResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8ImyFormResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8ImyFormResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8ImyFormResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8ImyFormResponse'", e);
                    }
                    // deserialize W9FormResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W9FormResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterW9FormResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W9FormResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W9FormResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W9FormResponse'", e);
                    }

                    if (match == 1) {
                        CreateW9Form201Response ret = new CreateW9Form201Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateW9Form201Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateW9Form201Response() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateW9Form201Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("W4FormResponse", W4FormResponse.class);
        schemas.put("W8BenEFormResponse", W8BenEFormResponse.class);
        schemas.put("W8BenFormResponse", W8BenFormResponse.class);
        schemas.put("W8ImyFormResponse", W8ImyFormResponse.class);
        schemas.put("W9FormResponse", W9FormResponse.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateW9Form201Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * W4FormResponse, W8BenEFormResponse, W8BenFormResponse, W8ImyFormResponse, W9FormResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof W4FormResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8BenEFormResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8BenFormResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8ImyFormResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W9FormResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be W4FormResponse, W8BenEFormResponse, W8BenFormResponse, W8ImyFormResponse, W9FormResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * W4FormResponse, W8BenEFormResponse, W8BenFormResponse, W8ImyFormResponse, W9FormResponse
     *
     * @return The actual instance (W4FormResponse, W8BenEFormResponse, W8BenFormResponse, W8ImyFormResponse, W9FormResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `W4FormResponse`. If the actual instance is not `W4FormResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W4FormResponse`
     * @throws ClassCastException if the instance is not `W4FormResponse`
     */
    public W4FormResponse getW4FormResponse() throws ClassCastException {
        return (W4FormResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8BenEFormResponse`. If the actual instance is not `W8BenEFormResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8BenEFormResponse`
     * @throws ClassCastException if the instance is not `W8BenEFormResponse`
     */
    public W8BenEFormResponse getW8BenEFormResponse() throws ClassCastException {
        return (W8BenEFormResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8BenFormResponse`. If the actual instance is not `W8BenFormResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8BenFormResponse`
     * @throws ClassCastException if the instance is not `W8BenFormResponse`
     */
    public W8BenFormResponse getW8BenFormResponse() throws ClassCastException {
        return (W8BenFormResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8ImyFormResponse`. If the actual instance is not `W8ImyFormResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8ImyFormResponse`
     * @throws ClassCastException if the instance is not `W8ImyFormResponse`
     */
    public W8ImyFormResponse getW8ImyFormResponse() throws ClassCastException {
        return (W8ImyFormResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W9FormResponse`. If the actual instance is not `W9FormResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W9FormResponse`
     * @throws ClassCastException if the instance is not `W9FormResponse`
     */
    public W9FormResponse getW9FormResponse() throws ClassCastException {
        return (W9FormResponse)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateW9Form201Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with W4FormResponse
        try {
            W4FormResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W4FormResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8BenEFormResponse
        try {
            W8BenEFormResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8BenEFormResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8BenFormResponse
        try {
            W8BenFormResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8BenFormResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8ImyFormResponse
        try {
            W8ImyFormResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8ImyFormResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W9FormResponse
        try {
            W9FormResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W9FormResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateW9Form201Response with oneOf schemas: W4FormResponse, W8BenEFormResponse, W8BenFormResponse, W8ImyFormResponse, W9FormResponse. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateW9Form201Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateW9Form201Response
     * @throws IOException if the JSON string is invalid with respect to CreateW9Form201Response
     */
    public static CreateW9Form201Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateW9Form201Response.class);
    }

    /**
     * Convert an instance of CreateW9Form201Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

