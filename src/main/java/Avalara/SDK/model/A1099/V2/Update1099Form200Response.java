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
import Avalara.SDK.model.A1099.V2.Form1042SResponse;
import Avalara.SDK.model.A1099.V2.Form1099DivResponse;
import Avalara.SDK.model.A1099.V2.Form1099KResponse;
import Avalara.SDK.model.A1099.V2.Form1099MiscResponse;
import Avalara.SDK.model.A1099.V2.Form1099NecResponse;
import Avalara.SDK.model.A1099.V2.FormResponseBase;
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholdingResponse;
import Avalara.SDK.model.A1099.V2.StateEfileStatusDetailResponse;
import Avalara.SDK.model.A1099.V2.StatusDetail;
import Avalara.SDK.model.A1099.V2.ValidationErrorResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
public class Update1099Form200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Update1099Form200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Update1099Form200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Update1099Form200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FormResponseBase> adapterFormResponseBase = gson.getDelegateAdapter(this, TypeToken.get(FormResponseBase.class));
            final TypeAdapter<Form1042SResponse> adapterForm1042SResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1042SResponse.class));
            final TypeAdapter<Form1099DivResponse> adapterForm1099DivResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099DivResponse.class));
            final TypeAdapter<Form1099KResponse> adapterForm1099KResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099KResponse.class));
            final TypeAdapter<Form1099MiscResponse> adapterForm1099MiscResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099MiscResponse.class));
            final TypeAdapter<Form1099NecResponse> adapterForm1099NecResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099NecResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<Update1099Form200Response>() {
                @Override
                public void write(JsonWriter out, Update1099Form200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FormResponseBase`
                    if (value.getActualInstance() instanceof FormResponseBase) {
                        JsonElement element = adapterFormResponseBase.toJsonTree((FormResponseBase)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1042SResponse`
                    if (value.getActualInstance() instanceof Form1042SResponse) {
                        JsonElement element = adapterForm1042SResponse.toJsonTree((Form1042SResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099DivResponse`
                    if (value.getActualInstance() instanceof Form1099DivResponse) {
                        JsonElement element = adapterForm1099DivResponse.toJsonTree((Form1099DivResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099KResponse`
                    if (value.getActualInstance() instanceof Form1099KResponse) {
                        JsonElement element = adapterForm1099KResponse.toJsonTree((Form1099KResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099MiscResponse`
                    if (value.getActualInstance() instanceof Form1099MiscResponse) {
                        JsonElement element = adapterForm1099MiscResponse.toJsonTree((Form1099MiscResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099NecResponse`
                    if (value.getActualInstance() instanceof Form1099NecResponse) {
                        JsonElement element = adapterForm1099NecResponse.toJsonTree((Form1099NecResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Form1042SResponse, Form1099DivResponse, Form1099KResponse, Form1099MiscResponse, Form1099NecResponse, FormResponseBase");
                }

                @Override
                public Update1099Form200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize FormResponseBase
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FormResponseBase.validateJsonElement(jsonElement);
                        actualAdapter = adapterFormResponseBase;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FormResponseBase'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FormResponseBase failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FormResponseBase'", e);
                    }
                    // deserialize Form1042SResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1042SResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1042SResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1042SResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1042SResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1042SResponse'", e);
                    }
                    // deserialize Form1099DivResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099DivResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099DivResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099DivResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099DivResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099DivResponse'", e);
                    }
                    // deserialize Form1099KResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099KResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099KResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099KResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099KResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099KResponse'", e);
                    }
                    // deserialize Form1099MiscResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099MiscResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099MiscResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099MiscResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099MiscResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099MiscResponse'", e);
                    }
                    // deserialize Form1099NecResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099NecResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099NecResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099NecResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099NecResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099NecResponse'", e);
                    }

                    if (match == 1) {
                        Update1099Form200Response ret = new Update1099Form200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Update1099Form200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Update1099Form200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public Update1099Form200Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FormResponseBase", FormResponseBase.class);
        schemas.put("Form1042SResponse", Form1042SResponse.class);
        schemas.put("Form1099DivResponse", Form1099DivResponse.class);
        schemas.put("Form1099KResponse", Form1099KResponse.class);
        schemas.put("Form1099MiscResponse", Form1099MiscResponse.class);
        schemas.put("Form1099NecResponse", Form1099NecResponse.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Update1099Form200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Form1042SResponse, Form1099DivResponse, Form1099KResponse, Form1099MiscResponse, Form1099NecResponse, FormResponseBase
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FormResponseBase) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1042SResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099DivResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099KResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099MiscResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099NecResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Form1042SResponse, Form1099DivResponse, Form1099KResponse, Form1099MiscResponse, Form1099NecResponse, FormResponseBase");
    }

    /**
     * Get the actual instance, which can be the following:
     * Form1042SResponse, Form1099DivResponse, Form1099KResponse, Form1099MiscResponse, Form1099NecResponse, FormResponseBase
     *
     * @return The actual instance (Form1042SResponse, Form1099DivResponse, Form1099KResponse, Form1099MiscResponse, Form1099NecResponse, FormResponseBase)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FormResponseBase`. If the actual instance is not `FormResponseBase`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FormResponseBase`
     * @throws ClassCastException if the instance is not `FormResponseBase`
     */
    public FormResponseBase getFormResponseBase() throws ClassCastException {
        return (FormResponseBase)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1042SResponse`. If the actual instance is not `Form1042SResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1042SResponse`
     * @throws ClassCastException if the instance is not `Form1042SResponse`
     */
    public Form1042SResponse getForm1042SResponse() throws ClassCastException {
        return (Form1042SResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099DivResponse`. If the actual instance is not `Form1099DivResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099DivResponse`
     * @throws ClassCastException if the instance is not `Form1099DivResponse`
     */
    public Form1099DivResponse getForm1099DivResponse() throws ClassCastException {
        return (Form1099DivResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099KResponse`. If the actual instance is not `Form1099KResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099KResponse`
     * @throws ClassCastException if the instance is not `Form1099KResponse`
     */
    public Form1099KResponse getForm1099KResponse() throws ClassCastException {
        return (Form1099KResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099MiscResponse`. If the actual instance is not `Form1099MiscResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099MiscResponse`
     * @throws ClassCastException if the instance is not `Form1099MiscResponse`
     */
    public Form1099MiscResponse getForm1099MiscResponse() throws ClassCastException {
        return (Form1099MiscResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099NecResponse`. If the actual instance is not `Form1099NecResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099NecResponse`
     * @throws ClassCastException if the instance is not `Form1099NecResponse`
     */
    public Form1099NecResponse getForm1099NecResponse() throws ClassCastException {
        return (Form1099NecResponse)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Update1099Form200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with FormResponseBase
        try {
            FormResponseBase.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FormResponseBase failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1042SResponse
        try {
            Form1042SResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1042SResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099DivResponse
        try {
            Form1099DivResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099DivResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099KResponse
        try {
            Form1099KResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099KResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099MiscResponse
        try {
            Form1099MiscResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099MiscResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099NecResponse
        try {
            Form1099NecResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099NecResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for Update1099Form200Response with oneOf schemas: Form1042SResponse, Form1099DivResponse, Form1099KResponse, Form1099MiscResponse, Form1099NecResponse, FormResponseBase. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of Update1099Form200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Update1099Form200Response
     * @throws IOException if the JSON string is invalid with respect to Update1099Form200Response
     */
    public static Update1099Form200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Update1099Form200Response.class);
    }

    /**
     * Convert an instance of Update1099Form200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

