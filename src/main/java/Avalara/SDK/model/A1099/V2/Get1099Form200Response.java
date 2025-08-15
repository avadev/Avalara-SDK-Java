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
import Avalara.SDK.model.A1099.V2.CoveredIndividualReferenceResponse;
import Avalara.SDK.model.A1099.V2.Form1042SListItemResponse;
import Avalara.SDK.model.A1099.V2.Form1095BListItemResponse;
import Avalara.SDK.model.A1099.V2.Form1099BaseResponse;
import Avalara.SDK.model.A1099.V2.Form1099DivListItemResponse;
import Avalara.SDK.model.A1099.V2.Form1099IntListItemResponse;
import Avalara.SDK.model.A1099.V2.Form1099KListItemResponse;
import Avalara.SDK.model.A1099.V2.Form1099MiscListItemResponse;
import Avalara.SDK.model.A1099.V2.Form1099NecListItemResponse;
import Avalara.SDK.model.A1099.V2.Form1099RListItemResponse;
import Avalara.SDK.model.A1099.V2.IntermediaryOrFlowThroughResponse;
import Avalara.SDK.model.A1099.V2.PrimaryWithholdingAgentResponse;
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
public class Get1099Form200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Get1099Form200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Get1099Form200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Get1099Form200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Form1099BaseResponse> adapterForm1099BaseResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099BaseResponse.class));
            final TypeAdapter<Form1042SListItemResponse> adapterForm1042SListItemResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1042SListItemResponse.class));
            final TypeAdapter<Form1095BListItemResponse> adapterForm1095BListItemResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1095BListItemResponse.class));
            final TypeAdapter<Form1099DivListItemResponse> adapterForm1099DivListItemResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099DivListItemResponse.class));
            final TypeAdapter<Form1099IntListItemResponse> adapterForm1099IntListItemResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099IntListItemResponse.class));
            final TypeAdapter<Form1099KListItemResponse> adapterForm1099KListItemResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099KListItemResponse.class));
            final TypeAdapter<Form1099MiscListItemResponse> adapterForm1099MiscListItemResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099MiscListItemResponse.class));
            final TypeAdapter<Form1099NecListItemResponse> adapterForm1099NecListItemResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099NecListItemResponse.class));
            final TypeAdapter<Form1099RListItemResponse> adapterForm1099RListItemResponse = gson.getDelegateAdapter(this, TypeToken.get(Form1099RListItemResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<Get1099Form200Response>() {
                @Override
                public void write(JsonWriter out, Get1099Form200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Form1099BaseResponse`
                    if (value.getActualInstance() instanceof Form1099BaseResponse) {
                        JsonElement element = adapterForm1099BaseResponse.toJsonTree((Form1099BaseResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1042SListItemResponse`
                    if (value.getActualInstance() instanceof Form1042SListItemResponse) {
                        JsonElement element = adapterForm1042SListItemResponse.toJsonTree((Form1042SListItemResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1095BListItemResponse`
                    if (value.getActualInstance() instanceof Form1095BListItemResponse) {
                        JsonElement element = adapterForm1095BListItemResponse.toJsonTree((Form1095BListItemResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099DivListItemResponse`
                    if (value.getActualInstance() instanceof Form1099DivListItemResponse) {
                        JsonElement element = adapterForm1099DivListItemResponse.toJsonTree((Form1099DivListItemResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099IntListItemResponse`
                    if (value.getActualInstance() instanceof Form1099IntListItemResponse) {
                        JsonElement element = adapterForm1099IntListItemResponse.toJsonTree((Form1099IntListItemResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099KListItemResponse`
                    if (value.getActualInstance() instanceof Form1099KListItemResponse) {
                        JsonElement element = adapterForm1099KListItemResponse.toJsonTree((Form1099KListItemResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099MiscListItemResponse`
                    if (value.getActualInstance() instanceof Form1099MiscListItemResponse) {
                        JsonElement element = adapterForm1099MiscListItemResponse.toJsonTree((Form1099MiscListItemResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099NecListItemResponse`
                    if (value.getActualInstance() instanceof Form1099NecListItemResponse) {
                        JsonElement element = adapterForm1099NecListItemResponse.toJsonTree((Form1099NecListItemResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099RListItemResponse`
                    if (value.getActualInstance() instanceof Form1099RListItemResponse) {
                        JsonElement element = adapterForm1099RListItemResponse.toJsonTree((Form1099RListItemResponse)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Form1042SListItemResponse, Form1095BListItemResponse, Form1099BaseResponse, Form1099DivListItemResponse, Form1099IntListItemResponse, Form1099KListItemResponse, Form1099MiscListItemResponse, Form1099NecListItemResponse, Form1099RListItemResponse");
                }

                @Override
                public Get1099Form200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Form1099BaseResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099BaseResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099BaseResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099BaseResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099BaseResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099BaseResponse'", e);
                    }
                    // deserialize Form1042SListItemResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1042SListItemResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1042SListItemResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1042SListItemResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1042SListItemResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1042SListItemResponse'", e);
                    }
                    // deserialize Form1095BListItemResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1095BListItemResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1095BListItemResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1095BListItemResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1095BListItemResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1095BListItemResponse'", e);
                    }
                    // deserialize Form1099DivListItemResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099DivListItemResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099DivListItemResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099DivListItemResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099DivListItemResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099DivListItemResponse'", e);
                    }
                    // deserialize Form1099IntListItemResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099IntListItemResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099IntListItemResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099IntListItemResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099IntListItemResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099IntListItemResponse'", e);
                    }
                    // deserialize Form1099KListItemResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099KListItemResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099KListItemResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099KListItemResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099KListItemResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099KListItemResponse'", e);
                    }
                    // deserialize Form1099MiscListItemResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099MiscListItemResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099MiscListItemResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099MiscListItemResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099MiscListItemResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099MiscListItemResponse'", e);
                    }
                    // deserialize Form1099NecListItemResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099NecListItemResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099NecListItemResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099NecListItemResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099NecListItemResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099NecListItemResponse'", e);
                    }
                    // deserialize Form1099RListItemResponse
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099RListItemResponse.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099RListItemResponse;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099RListItemResponse'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099RListItemResponse failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099RListItemResponse'", e);
                    }

                    if (match == 1) {
                        Get1099Form200Response ret = new Get1099Form200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Get1099Form200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Get1099Form200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public Get1099Form200Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Form1099BaseResponse", Form1099BaseResponse.class);
        schemas.put("Form1042SListItemResponse", Form1042SListItemResponse.class);
        schemas.put("Form1095BListItemResponse", Form1095BListItemResponse.class);
        schemas.put("Form1099DivListItemResponse", Form1099DivListItemResponse.class);
        schemas.put("Form1099IntListItemResponse", Form1099IntListItemResponse.class);
        schemas.put("Form1099KListItemResponse", Form1099KListItemResponse.class);
        schemas.put("Form1099MiscListItemResponse", Form1099MiscListItemResponse.class);
        schemas.put("Form1099NecListItemResponse", Form1099NecListItemResponse.class);
        schemas.put("Form1099RListItemResponse", Form1099RListItemResponse.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Get1099Form200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Form1042SListItemResponse, Form1095BListItemResponse, Form1099BaseResponse, Form1099DivListItemResponse, Form1099IntListItemResponse, Form1099KListItemResponse, Form1099MiscListItemResponse, Form1099NecListItemResponse, Form1099RListItemResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Form1099BaseResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1042SListItemResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1095BListItemResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099DivListItemResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099IntListItemResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099KListItemResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099MiscListItemResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099NecListItemResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099RListItemResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Form1042SListItemResponse, Form1095BListItemResponse, Form1099BaseResponse, Form1099DivListItemResponse, Form1099IntListItemResponse, Form1099KListItemResponse, Form1099MiscListItemResponse, Form1099NecListItemResponse, Form1099RListItemResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * Form1042SListItemResponse, Form1095BListItemResponse, Form1099BaseResponse, Form1099DivListItemResponse, Form1099IntListItemResponse, Form1099KListItemResponse, Form1099MiscListItemResponse, Form1099NecListItemResponse, Form1099RListItemResponse
     *
     * @return The actual instance (Form1042SListItemResponse, Form1095BListItemResponse, Form1099BaseResponse, Form1099DivListItemResponse, Form1099IntListItemResponse, Form1099KListItemResponse, Form1099MiscListItemResponse, Form1099NecListItemResponse, Form1099RListItemResponse)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Form1099BaseResponse`. If the actual instance is not `Form1099BaseResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099BaseResponse`
     * @throws ClassCastException if the instance is not `Form1099BaseResponse`
     */
    public Form1099BaseResponse getForm1099BaseResponse() throws ClassCastException {
        return (Form1099BaseResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1042SListItemResponse`. If the actual instance is not `Form1042SListItemResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1042SListItemResponse`
     * @throws ClassCastException if the instance is not `Form1042SListItemResponse`
     */
    public Form1042SListItemResponse getForm1042SListItemResponse() throws ClassCastException {
        return (Form1042SListItemResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1095BListItemResponse`. If the actual instance is not `Form1095BListItemResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1095BListItemResponse`
     * @throws ClassCastException if the instance is not `Form1095BListItemResponse`
     */
    public Form1095BListItemResponse getForm1095BListItemResponse() throws ClassCastException {
        return (Form1095BListItemResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099DivListItemResponse`. If the actual instance is not `Form1099DivListItemResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099DivListItemResponse`
     * @throws ClassCastException if the instance is not `Form1099DivListItemResponse`
     */
    public Form1099DivListItemResponse getForm1099DivListItemResponse() throws ClassCastException {
        return (Form1099DivListItemResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099IntListItemResponse`. If the actual instance is not `Form1099IntListItemResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099IntListItemResponse`
     * @throws ClassCastException if the instance is not `Form1099IntListItemResponse`
     */
    public Form1099IntListItemResponse getForm1099IntListItemResponse() throws ClassCastException {
        return (Form1099IntListItemResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099KListItemResponse`. If the actual instance is not `Form1099KListItemResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099KListItemResponse`
     * @throws ClassCastException if the instance is not `Form1099KListItemResponse`
     */
    public Form1099KListItemResponse getForm1099KListItemResponse() throws ClassCastException {
        return (Form1099KListItemResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099MiscListItemResponse`. If the actual instance is not `Form1099MiscListItemResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099MiscListItemResponse`
     * @throws ClassCastException if the instance is not `Form1099MiscListItemResponse`
     */
    public Form1099MiscListItemResponse getForm1099MiscListItemResponse() throws ClassCastException {
        return (Form1099MiscListItemResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099NecListItemResponse`. If the actual instance is not `Form1099NecListItemResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099NecListItemResponse`
     * @throws ClassCastException if the instance is not `Form1099NecListItemResponse`
     */
    public Form1099NecListItemResponse getForm1099NecListItemResponse() throws ClassCastException {
        return (Form1099NecListItemResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099RListItemResponse`. If the actual instance is not `Form1099RListItemResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099RListItemResponse`
     * @throws ClassCastException if the instance is not `Form1099RListItemResponse`
     */
    public Form1099RListItemResponse getForm1099RListItemResponse() throws ClassCastException {
        return (Form1099RListItemResponse)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Get1099Form200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Form1099BaseResponse
        try {
            Form1099BaseResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099BaseResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1042SListItemResponse
        try {
            Form1042SListItemResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1042SListItemResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1095BListItemResponse
        try {
            Form1095BListItemResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1095BListItemResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099DivListItemResponse
        try {
            Form1099DivListItemResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099DivListItemResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099IntListItemResponse
        try {
            Form1099IntListItemResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099IntListItemResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099KListItemResponse
        try {
            Form1099KListItemResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099KListItemResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099MiscListItemResponse
        try {
            Form1099MiscListItemResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099MiscListItemResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099NecListItemResponse
        try {
            Form1099NecListItemResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099NecListItemResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099RListItemResponse
        try {
            Form1099RListItemResponse.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099RListItemResponse failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for Get1099Form200Response with oneOf schemas: Form1042SListItemResponse, Form1095BListItemResponse, Form1099BaseResponse, Form1099DivListItemResponse, Form1099IntListItemResponse, Form1099KListItemResponse, Form1099MiscListItemResponse, Form1099NecListItemResponse, Form1099RListItemResponse. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of Get1099Form200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Get1099Form200Response
     * @throws IOException if the JSON string is invalid with respect to Get1099Form200Response
     */
    public static Get1099Form200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Get1099Form200Response.class);
    }

    /**
     * Convert an instance of Get1099Form200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

