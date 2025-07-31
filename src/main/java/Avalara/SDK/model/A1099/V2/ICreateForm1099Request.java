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
import Avalara.SDK.model.A1099.V2.Form1099DivRequest;
import Avalara.SDK.model.A1099.V2.Form1099KRequest;
import Avalara.SDK.model.A1099.V2.Form1099MiscRequest;
import Avalara.SDK.model.A1099.V2.Form1099NecRequest;
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholdingRequest;
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
public class ICreateForm1099Request extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ICreateForm1099Request.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ICreateForm1099Request.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ICreateForm1099Request' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Form1099DivRequest> adapterForm1099DivRequest = gson.getDelegateAdapter(this, TypeToken.get(Form1099DivRequest.class));
            final TypeAdapter<Form1099MiscRequest> adapterForm1099MiscRequest = gson.getDelegateAdapter(this, TypeToken.get(Form1099MiscRequest.class));
            final TypeAdapter<Form1099KRequest> adapterForm1099KRequest = gson.getDelegateAdapter(this, TypeToken.get(Form1099KRequest.class));
            final TypeAdapter<Form1099NecRequest> adapterForm1099NecRequest = gson.getDelegateAdapter(this, TypeToken.get(Form1099NecRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<ICreateForm1099Request>() {
                @Override
                public void write(JsonWriter out, ICreateForm1099Request value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Form1099DivRequest`
                    if (value.getActualInstance() instanceof Form1099DivRequest) {
                        JsonElement element = adapterForm1099DivRequest.toJsonTree((Form1099DivRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099MiscRequest`
                    if (value.getActualInstance() instanceof Form1099MiscRequest) {
                        JsonElement element = adapterForm1099MiscRequest.toJsonTree((Form1099MiscRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099KRequest`
                    if (value.getActualInstance() instanceof Form1099KRequest) {
                        JsonElement element = adapterForm1099KRequest.toJsonTree((Form1099KRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099NecRequest`
                    if (value.getActualInstance() instanceof Form1099NecRequest) {
                        JsonElement element = adapterForm1099NecRequest.toJsonTree((Form1099NecRequest)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Form1099DivRequest, Form1099KRequest, Form1099MiscRequest, Form1099NecRequest");
                }

                @Override
                public ICreateForm1099Request read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Form1099DivRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099DivRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099DivRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099DivRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099DivRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099DivRequest'", e);
                    }
                    // deserialize Form1099MiscRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099MiscRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099MiscRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099MiscRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099MiscRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099MiscRequest'", e);
                    }
                    // deserialize Form1099KRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099KRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099KRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099KRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099KRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099KRequest'", e);
                    }
                    // deserialize Form1099NecRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099NecRequest.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099NecRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099NecRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099NecRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099NecRequest'", e);
                    }

                    if (match == 1) {
                        ICreateForm1099Request ret = new ICreateForm1099Request();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ICreateForm1099Request: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ICreateForm1099Request() {
        super("oneOf", Boolean.FALSE);
    }

    public ICreateForm1099Request(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Form1099DivRequest", Form1099DivRequest.class);
        schemas.put("Form1099MiscRequest", Form1099MiscRequest.class);
        schemas.put("Form1099KRequest", Form1099KRequest.class);
        schemas.put("Form1099NecRequest", Form1099NecRequest.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ICreateForm1099Request.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Form1099DivRequest, Form1099KRequest, Form1099MiscRequest, Form1099NecRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Form1099DivRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099MiscRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099KRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099NecRequest) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Form1099DivRequest, Form1099KRequest, Form1099MiscRequest, Form1099NecRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * Form1099DivRequest, Form1099KRequest, Form1099MiscRequest, Form1099NecRequest
     *
     * @return The actual instance (Form1099DivRequest, Form1099KRequest, Form1099MiscRequest, Form1099NecRequest)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Form1099DivRequest`. If the actual instance is not `Form1099DivRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099DivRequest`
     * @throws ClassCastException if the instance is not `Form1099DivRequest`
     */
    public Form1099DivRequest getForm1099DivRequest() throws ClassCastException {
        return (Form1099DivRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099MiscRequest`. If the actual instance is not `Form1099MiscRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099MiscRequest`
     * @throws ClassCastException if the instance is not `Form1099MiscRequest`
     */
    public Form1099MiscRequest getForm1099MiscRequest() throws ClassCastException {
        return (Form1099MiscRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099KRequest`. If the actual instance is not `Form1099KRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099KRequest`
     * @throws ClassCastException if the instance is not `Form1099KRequest`
     */
    public Form1099KRequest getForm1099KRequest() throws ClassCastException {
        return (Form1099KRequest)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099NecRequest`. If the actual instance is not `Form1099NecRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099NecRequest`
     * @throws ClassCastException if the instance is not `Form1099NecRequest`
     */
    public Form1099NecRequest getForm1099NecRequest() throws ClassCastException {
        return (Form1099NecRequest)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ICreateForm1099Request
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Form1099DivRequest
        try {
            Form1099DivRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099DivRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099MiscRequest
        try {
            Form1099MiscRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099MiscRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099KRequest
        try {
            Form1099KRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099KRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099NecRequest
        try {
            Form1099NecRequest.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099NecRequest failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ICreateForm1099Request with oneOf schemas: Form1099DivRequest, Form1099KRequest, Form1099MiscRequest, Form1099NecRequest. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ICreateForm1099Request given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ICreateForm1099Request
     * @throws IOException if the JSON string is invalid with respect to ICreateForm1099Request
     */
    public static ICreateForm1099Request fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ICreateForm1099Request.class);
    }

    /**
     * Convert an instance of ICreateForm1099Request to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

