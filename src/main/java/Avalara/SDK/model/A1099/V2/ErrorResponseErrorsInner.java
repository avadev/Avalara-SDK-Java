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
import Avalara.SDK.model.A1099.V2.HttpValidationProblemDetails;
import Avalara.SDK.model.A1099.V2.ProblemDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class ErrorResponseErrorsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ErrorResponseErrorsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ErrorResponseErrorsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ErrorResponseErrorsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ProblemDetails> adapterProblemDetails = gson.getDelegateAdapter(this, TypeToken.get(ProblemDetails.class));
            final TypeAdapter<HttpValidationProblemDetails> adapterHttpValidationProblemDetails = gson.getDelegateAdapter(this, TypeToken.get(HttpValidationProblemDetails.class));

            return (TypeAdapter<T>) new TypeAdapter<ErrorResponseErrorsInner>() {
                @Override
                public void write(JsonWriter out, ErrorResponseErrorsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ProblemDetails`
                    if (value.getActualInstance() instanceof ProblemDetails) {
                        JsonElement element = adapterProblemDetails.toJsonTree((ProblemDetails)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `HttpValidationProblemDetails`
                    if (value.getActualInstance() instanceof HttpValidationProblemDetails) {
                        JsonElement element = adapterHttpValidationProblemDetails.toJsonTree((HttpValidationProblemDetails)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: HttpValidationProblemDetails, ProblemDetails");
                }

                @Override
                public ErrorResponseErrorsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ProblemDetails
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ProblemDetails.validateJsonElement(jsonElement);
                        actualAdapter = adapterProblemDetails;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ProblemDetails'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ProblemDetails failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ProblemDetails'", e);
                    }
                    // deserialize HttpValidationProblemDetails
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HttpValidationProblemDetails.validateJsonElement(jsonElement);
                        actualAdapter = adapterHttpValidationProblemDetails;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HttpValidationProblemDetails'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HttpValidationProblemDetails failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HttpValidationProblemDetails'", e);
                    }

                    if (match == 1) {
                        ErrorResponseErrorsInner ret = new ErrorResponseErrorsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ErrorResponseErrorsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ErrorResponseErrorsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public ErrorResponseErrorsInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ProblemDetails", ProblemDetails.class);
        schemas.put("HttpValidationProblemDetails", HttpValidationProblemDetails.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ErrorResponseErrorsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * HttpValidationProblemDetails, ProblemDetails
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ProblemDetails) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof HttpValidationProblemDetails) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be HttpValidationProblemDetails, ProblemDetails");
    }

    /**
     * Get the actual instance, which can be the following:
     * HttpValidationProblemDetails, ProblemDetails
     *
     * @return The actual instance (HttpValidationProblemDetails, ProblemDetails)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProblemDetails`. If the actual instance is not `ProblemDetails`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProblemDetails`
     * @throws ClassCastException if the instance is not `ProblemDetails`
     */
    public ProblemDetails getProblemDetails() throws ClassCastException {
        return (ProblemDetails)super.getActualInstance();
    }
    /**
     * Get the actual instance of `HttpValidationProblemDetails`. If the actual instance is not `HttpValidationProblemDetails`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HttpValidationProblemDetails`
     * @throws ClassCastException if the instance is not `HttpValidationProblemDetails`
     */
    public HttpValidationProblemDetails getHttpValidationProblemDetails() throws ClassCastException {
        return (HttpValidationProblemDetails)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ErrorResponseErrorsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with ProblemDetails
        try {
            ProblemDetails.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ProblemDetails failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with HttpValidationProblemDetails
        try {
            HttpValidationProblemDetails.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for HttpValidationProblemDetails failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ErrorResponseErrorsInner with oneOf schemas: HttpValidationProblemDetails, ProblemDetails. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ErrorResponseErrorsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ErrorResponseErrorsInner
     * @throws IOException if the JSON string is invalid with respect to ErrorResponseErrorsInner
     */
    public static ErrorResponseErrorsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ErrorResponseErrorsInner.class);
    }

    /**
     * Convert an instance of ErrorResponseErrorsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

