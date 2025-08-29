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
import Avalara.SDK.model.A1099.V2.IssuerCommand;
import Avalara.SDK.model.A1099.V2.IssuerResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
public class CreateIssuerRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateIssuerRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateIssuerRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateIssuerRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<IssuerCommand> adapterIssuerCommand = gson.getDelegateAdapter(this, TypeToken.get(IssuerCommand.class));
            final TypeAdapter<IssuerResponse> adapterIssuerResponse = gson.getDelegateAdapter(this, TypeToken.get(IssuerResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateIssuerRequest>() {
                @Override
                public void write(JsonWriter out, CreateIssuerRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `IssuerCommand`
                    if (value.getActualInstance() instanceof IssuerCommand) {
                        JsonElement element = adapterIssuerCommand.toJsonTree((IssuerCommand)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `IssuerResponse`
                    if (value.getActualInstance() instanceof IssuerResponse) {
                        JsonElement element = adapterIssuerResponse.toJsonTree((IssuerResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: IssuerCommand, IssuerResponse");
                }

                @Override
                public CreateIssuerRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize IssuerCommand
                    try {
                        // validate the JSON object to see if any exception is thrown
                        IssuerCommand.validateJsonElement(jsonElement);
                        actualAdapter = adapterIssuerCommand;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'IssuerCommand'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for IssuerCommand failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'IssuerCommand'", e);
                    }
                    // deserialize IssuerResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        IssuerResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterIssuerResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'IssuerResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for IssuerResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'IssuerResponse'", e);
                    }

                    if (match == 1) {
                        CreateIssuerRequest ret = new CreateIssuerRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateIssuerRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateIssuerRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateIssuerRequest(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("IssuerCommand", IssuerCommand.class);
        schemas.put("IssuerResponse", IssuerResponse.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateIssuerRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * IssuerCommand, IssuerResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof IssuerCommand) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof IssuerResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be IssuerCommand, IssuerResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * IssuerCommand, IssuerResponse
     *
     * @return The actual instance (IssuerCommand, IssuerResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `IssuerCommand`. If the actual instance is not `IssuerCommand`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IssuerCommand`
     * @throws ClassCastException if the instance is not `IssuerCommand`
     */
    public IssuerCommand getIssuerCommand() throws ClassCastException {
        return (IssuerCommand)super.getActualInstance();
    }
    /**
     * Get the actual instance of `IssuerResponse`. If the actual instance is not `IssuerResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IssuerResponse`
     * @throws ClassCastException if the instance is not `IssuerResponse`
     */
    public IssuerResponse getIssuerResponse() throws ClassCastException {
        return (IssuerResponse)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateIssuerRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with IssuerCommand
        try {
            IssuerCommand.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for IssuerCommand failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with IssuerResponse
        try {
            IssuerResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for IssuerResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateIssuerRequest with oneOf schemas: IssuerCommand, IssuerResponse. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateIssuerRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateIssuerRequest
     * @throws IOException if the JSON string is invalid with respect to CreateIssuerRequest
     */
    public static CreateIssuerRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateIssuerRequest.class);
    }

    /**
     * Convert an instance of CreateIssuerRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

