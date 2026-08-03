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
import Avalara.SDK.model.A1099.V2.SubstantialUsOwnerRequest;
import Avalara.SDK.model.A1099.V2.W4FormRequest;
import Avalara.SDK.model.A1099.V2.W8BenEFormRequest;
import Avalara.SDK.model.A1099.V2.W8BenFormRequest;
import Avalara.SDK.model.A1099.V2.W8ImyFormRequest;
import Avalara.SDK.model.A1099.V2.W9FormRequest;
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
public class CreateW9FormRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateW9FormRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateW9FormRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateW9FormRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<W9FormRequest> adapterW9FormRequest = gson.getDelegateAdapter(this, TypeToken.get(W9FormRequest.class));
            final TypeAdapter<W8ImyFormRequest> adapterW8ImyFormRequest = gson.getDelegateAdapter(this, TypeToken.get(W8ImyFormRequest.class));
            final TypeAdapter<W8BenEFormRequest> adapterW8BenEFormRequest = gson.getDelegateAdapter(this, TypeToken.get(W8BenEFormRequest.class));
            final TypeAdapter<W8BenFormRequest> adapterW8BenFormRequest = gson.getDelegateAdapter(this, TypeToken.get(W8BenFormRequest.class));
            final TypeAdapter<W4FormRequest> adapterW4FormRequest = gson.getDelegateAdapter(this, TypeToken.get(W4FormRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateW9FormRequest>() {
                @Override
                public void write(JsonWriter out, CreateW9FormRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `W9FormRequest`
                    if (value.getActualInstance() instanceof W9FormRequest) {
                        JsonElement element = adapterW9FormRequest.toJsonTree((W9FormRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8ImyFormRequest`
                    if (value.getActualInstance() instanceof W8ImyFormRequest) {
                        JsonElement element = adapterW8ImyFormRequest.toJsonTree((W8ImyFormRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8BenEFormRequest`
                    if (value.getActualInstance() instanceof W8BenEFormRequest) {
                        JsonElement element = adapterW8BenEFormRequest.toJsonTree((W8BenEFormRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8BenFormRequest`
                    if (value.getActualInstance() instanceof W8BenFormRequest) {
                        JsonElement element = adapterW8BenFormRequest.toJsonTree((W8BenFormRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W4FormRequest`
                    if (value.getActualInstance() instanceof W4FormRequest) {
                        JsonElement element = adapterW4FormRequest.toJsonTree((W4FormRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: W4FormRequest, W8BenEFormRequest, W8BenFormRequest, W8ImyFormRequest, W9FormRequest");
                }

                @Override
                public CreateW9FormRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize W9FormRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W9FormRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW9FormRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W9FormRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W9FormRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W9FormRequest'", e);
                    }
                    // deserialize W8ImyFormRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8ImyFormRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8ImyFormRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8ImyFormRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8ImyFormRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8ImyFormRequest'", e);
                    }
                    // deserialize W8BenEFormRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8BenEFormRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8BenEFormRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8BenEFormRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8BenEFormRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8BenEFormRequest'", e);
                    }
                    // deserialize W8BenFormRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8BenFormRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8BenFormRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8BenFormRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8BenFormRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8BenFormRequest'", e);
                    }
                    // deserialize W4FormRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W4FormRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW4FormRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W4FormRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W4FormRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W4FormRequest'", e);
                    }

                    if (match == 1) {
                        CreateW9FormRequest ret = new CreateW9FormRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateW9FormRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateW9FormRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateW9FormRequest(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("W9FormRequest", W9FormRequest.class);
        schemas.put("W8ImyFormRequest", W8ImyFormRequest.class);
        schemas.put("W8BenEFormRequest", W8BenEFormRequest.class);
        schemas.put("W8BenFormRequest", W8BenFormRequest.class);
        schemas.put("W4FormRequest", W4FormRequest.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateW9FormRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * W4FormRequest, W8BenEFormRequest, W8BenFormRequest, W8ImyFormRequest, W9FormRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof W9FormRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8ImyFormRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8BenEFormRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8BenFormRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W4FormRequest) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be W4FormRequest, W8BenEFormRequest, W8BenFormRequest, W8ImyFormRequest, W9FormRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * W4FormRequest, W8BenEFormRequest, W8BenFormRequest, W8ImyFormRequest, W9FormRequest
     *
     * @return The actual instance (W4FormRequest, W8BenEFormRequest, W8BenFormRequest, W8ImyFormRequest, W9FormRequest)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `W9FormRequest`. If the actual instance is not `W9FormRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W9FormRequest`
     * @throws ClassCastException if the instance is not `W9FormRequest`
     */
    public W9FormRequest getW9FormRequest() throws ClassCastException {
        return (W9FormRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8ImyFormRequest`. If the actual instance is not `W8ImyFormRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8ImyFormRequest`
     * @throws ClassCastException if the instance is not `W8ImyFormRequest`
     */
    public W8ImyFormRequest getW8ImyFormRequest() throws ClassCastException {
        return (W8ImyFormRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8BenEFormRequest`. If the actual instance is not `W8BenEFormRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8BenEFormRequest`
     * @throws ClassCastException if the instance is not `W8BenEFormRequest`
     */
    public W8BenEFormRequest getW8BenEFormRequest() throws ClassCastException {
        return (W8BenEFormRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8BenFormRequest`. If the actual instance is not `W8BenFormRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8BenFormRequest`
     * @throws ClassCastException if the instance is not `W8BenFormRequest`
     */
    public W8BenFormRequest getW8BenFormRequest() throws ClassCastException {
        return (W8BenFormRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W4FormRequest`. If the actual instance is not `W4FormRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W4FormRequest`
     * @throws ClassCastException if the instance is not `W4FormRequest`
     */
    public W4FormRequest getW4FormRequest() throws ClassCastException {
        return (W4FormRequest)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateW9FormRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with W9FormRequest
        try {
            W9FormRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W9FormRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8ImyFormRequest
        try {
            W8ImyFormRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8ImyFormRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8BenEFormRequest
        try {
            W8BenEFormRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8BenEFormRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8BenFormRequest
        try {
            W8BenFormRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8BenFormRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W4FormRequest
        try {
            W4FormRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W4FormRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateW9FormRequest with oneOf schemas: W4FormRequest, W8BenEFormRequest, W8BenFormRequest, W8ImyFormRequest, W9FormRequest. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateW9FormRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateW9FormRequest
     * @throws IOException if the JSON string is invalid with respect to CreateW9FormRequest
     */
    public static CreateW9FormRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateW9FormRequest.class);
    }

    /**
     * Convert an instance of CreateW9FormRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

