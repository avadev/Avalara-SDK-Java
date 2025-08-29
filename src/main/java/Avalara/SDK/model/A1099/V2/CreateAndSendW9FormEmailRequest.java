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
 * ## 🔐 Authentication  Generate a **license key** from: *[Avalara Portal](https://www.avalara.com/us/en/signin.html) → Settings → License and API Keys*.  [More on authentication methods](https://developer.avalara.com/avatax-dm-combined-erp/common-setup/authentication/authentication-methods/)  [Test your credentials](https://developer.avalara.com/avatax/test-credentials/)  ## 📘 API & SDK Documentation  [Avalara SDK (.NET) on GitHub](https://github.com/avadev/Avalara-SDK-DotNet#avalarasdk--the-unified-c-library-for-next-gen-avalara-services)  [Code Examples – 1099 API](https://github.com/avadev/Avalara-SDK-DotNet/blob/main/docs/A1099/V2/Class1099IssuersApi.md#call1099issuersget)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import Avalara.SDK.model.A1099.V2.W4FormMinimalRequest;
import Avalara.SDK.model.A1099.V2.W8BenEFormMinimalRequest;
import Avalara.SDK.model.A1099.V2.W8BenFormMinimalRequest;
import Avalara.SDK.model.A1099.V2.W8ImyFormMinimalRequest;
import Avalara.SDK.model.A1099.V2.W9FormMinimalRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
public class CreateAndSendW9FormEmailRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateAndSendW9FormEmailRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateAndSendW9FormEmailRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateAndSendW9FormEmailRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<W4FormMinimalRequest> adapterW4FormMinimalRequest = gson.getDelegateAdapter(this, TypeToken.get(W4FormMinimalRequest.class));
            final TypeAdapter<W8BenEFormMinimalRequest> adapterW8BenEFormMinimalRequest = gson.getDelegateAdapter(this, TypeToken.get(W8BenEFormMinimalRequest.class));
            final TypeAdapter<W8BenFormMinimalRequest> adapterW8BenFormMinimalRequest = gson.getDelegateAdapter(this, TypeToken.get(W8BenFormMinimalRequest.class));
            final TypeAdapter<W8ImyFormMinimalRequest> adapterW8ImyFormMinimalRequest = gson.getDelegateAdapter(this, TypeToken.get(W8ImyFormMinimalRequest.class));
            final TypeAdapter<W9FormMinimalRequest> adapterW9FormMinimalRequest = gson.getDelegateAdapter(this, TypeToken.get(W9FormMinimalRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateAndSendW9FormEmailRequest>() {
                @Override
                public void write(JsonWriter out, CreateAndSendW9FormEmailRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `W4FormMinimalRequest`
                    if (value.getActualInstance() instanceof W4FormMinimalRequest) {
                        JsonElement element = adapterW4FormMinimalRequest.toJsonTree((W4FormMinimalRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8BenEFormMinimalRequest`
                    if (value.getActualInstance() instanceof W8BenEFormMinimalRequest) {
                        JsonElement element = adapterW8BenEFormMinimalRequest.toJsonTree((W8BenEFormMinimalRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8BenFormMinimalRequest`
                    if (value.getActualInstance() instanceof W8BenFormMinimalRequest) {
                        JsonElement element = adapterW8BenFormMinimalRequest.toJsonTree((W8BenFormMinimalRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8ImyFormMinimalRequest`
                    if (value.getActualInstance() instanceof W8ImyFormMinimalRequest) {
                        JsonElement element = adapterW8ImyFormMinimalRequest.toJsonTree((W8ImyFormMinimalRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W9FormMinimalRequest`
                    if (value.getActualInstance() instanceof W9FormMinimalRequest) {
                        JsonElement element = adapterW9FormMinimalRequest.toJsonTree((W9FormMinimalRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: W4FormMinimalRequest, W8BenEFormMinimalRequest, W8BenFormMinimalRequest, W8ImyFormMinimalRequest, W9FormMinimalRequest");
                }

                @Override
                public CreateAndSendW9FormEmailRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize W4FormMinimalRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W4FormMinimalRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW4FormMinimalRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W4FormMinimalRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W4FormMinimalRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W4FormMinimalRequest'", e);
                    }
                    // deserialize W8BenEFormMinimalRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8BenEFormMinimalRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8BenEFormMinimalRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8BenEFormMinimalRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8BenEFormMinimalRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8BenEFormMinimalRequest'", e);
                    }
                    // deserialize W8BenFormMinimalRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8BenFormMinimalRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8BenFormMinimalRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8BenFormMinimalRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8BenFormMinimalRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8BenFormMinimalRequest'", e);
                    }
                    // deserialize W8ImyFormMinimalRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8ImyFormMinimalRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8ImyFormMinimalRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8ImyFormMinimalRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8ImyFormMinimalRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8ImyFormMinimalRequest'", e);
                    }
                    // deserialize W9FormMinimalRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W9FormMinimalRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterW9FormMinimalRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W9FormMinimalRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W9FormMinimalRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W9FormMinimalRequest'", e);
                    }

                    if (match == 1) {
                        CreateAndSendW9FormEmailRequest ret = new CreateAndSendW9FormEmailRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateAndSendW9FormEmailRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateAndSendW9FormEmailRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateAndSendW9FormEmailRequest(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("W4FormMinimalRequest", W4FormMinimalRequest.class);
        schemas.put("W8BenEFormMinimalRequest", W8BenEFormMinimalRequest.class);
        schemas.put("W8BenFormMinimalRequest", W8BenFormMinimalRequest.class);
        schemas.put("W8ImyFormMinimalRequest", W8ImyFormMinimalRequest.class);
        schemas.put("W9FormMinimalRequest", W9FormMinimalRequest.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateAndSendW9FormEmailRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * W4FormMinimalRequest, W8BenEFormMinimalRequest, W8BenFormMinimalRequest, W8ImyFormMinimalRequest, W9FormMinimalRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof W4FormMinimalRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8BenEFormMinimalRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8BenFormMinimalRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8ImyFormMinimalRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W9FormMinimalRequest) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be W4FormMinimalRequest, W8BenEFormMinimalRequest, W8BenFormMinimalRequest, W8ImyFormMinimalRequest, W9FormMinimalRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * W4FormMinimalRequest, W8BenEFormMinimalRequest, W8BenFormMinimalRequest, W8ImyFormMinimalRequest, W9FormMinimalRequest
     *
     * @return The actual instance (W4FormMinimalRequest, W8BenEFormMinimalRequest, W8BenFormMinimalRequest, W8ImyFormMinimalRequest, W9FormMinimalRequest)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `W4FormMinimalRequest`. If the actual instance is not `W4FormMinimalRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W4FormMinimalRequest`
     * @throws ClassCastException if the instance is not `W4FormMinimalRequest`
     */
    public W4FormMinimalRequest getW4FormMinimalRequest() throws ClassCastException {
        return (W4FormMinimalRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8BenEFormMinimalRequest`. If the actual instance is not `W8BenEFormMinimalRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8BenEFormMinimalRequest`
     * @throws ClassCastException if the instance is not `W8BenEFormMinimalRequest`
     */
    public W8BenEFormMinimalRequest getW8BenEFormMinimalRequest() throws ClassCastException {
        return (W8BenEFormMinimalRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8BenFormMinimalRequest`. If the actual instance is not `W8BenFormMinimalRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8BenFormMinimalRequest`
     * @throws ClassCastException if the instance is not `W8BenFormMinimalRequest`
     */
    public W8BenFormMinimalRequest getW8BenFormMinimalRequest() throws ClassCastException {
        return (W8BenFormMinimalRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8ImyFormMinimalRequest`. If the actual instance is not `W8ImyFormMinimalRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8ImyFormMinimalRequest`
     * @throws ClassCastException if the instance is not `W8ImyFormMinimalRequest`
     */
    public W8ImyFormMinimalRequest getW8ImyFormMinimalRequest() throws ClassCastException {
        return (W8ImyFormMinimalRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W9FormMinimalRequest`. If the actual instance is not `W9FormMinimalRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W9FormMinimalRequest`
     * @throws ClassCastException if the instance is not `W9FormMinimalRequest`
     */
    public W9FormMinimalRequest getW9FormMinimalRequest() throws ClassCastException {
        return (W9FormMinimalRequest)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateAndSendW9FormEmailRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with W4FormMinimalRequest
        try {
            W4FormMinimalRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W4FormMinimalRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8BenEFormMinimalRequest
        try {
            W8BenEFormMinimalRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8BenEFormMinimalRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8BenFormMinimalRequest
        try {
            W8BenFormMinimalRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8BenFormMinimalRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8ImyFormMinimalRequest
        try {
            W8ImyFormMinimalRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8ImyFormMinimalRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W9FormMinimalRequest
        try {
            W9FormMinimalRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W9FormMinimalRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateAndSendW9FormEmailRequest with oneOf schemas: W4FormMinimalRequest, W8BenEFormMinimalRequest, W8BenFormMinimalRequest, W8ImyFormMinimalRequest, W9FormMinimalRequest. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateAndSendW9FormEmailRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateAndSendW9FormEmailRequest
     * @throws IOException if the JSON string is invalid with respect to CreateAndSendW9FormEmailRequest
     */
    public static CreateAndSendW9FormEmailRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateAndSendW9FormEmailRequest.class);
    }

    /**
     * Convert an instance of CreateAndSendW9FormEmailRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

