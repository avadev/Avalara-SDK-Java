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
 * ## 🔐 Authentication  Use **username/password** or generate a **license key** from: *Avalara Portal → Settings → License and API Keys*.  [More on authentication methods](https://developer.avalara.com/avatax-dm-combined-erp/common-setup/authentication/authentication-methods/)  [Test your credentials](https://developer.avalara.com/avatax/test-credentials/)  ## 📘 API & SDK Documentation  [Avalara SDK (.NET) on GitHub](https://github.com/avadev/Avalara-SDK-DotNet#avalarasdk--the-unified-c-library-for-next-gen-avalara-services)  [Code Examples – 1099 API](https://github.com/avadev/Avalara-SDK-DotNet/blob/main/docs/A1099/V2/Class1099IssuersApi.md#call1099issuersget)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import Avalara.SDK.model.A1099.V2.W4FormDataModel;
import Avalara.SDK.model.A1099.V2.W8BenESubstantialUsOwnerDataModel;
import Avalara.SDK.model.A1099.V2.W8BenFormDataModel;
import Avalara.SDK.model.A1099.V2.W8BeneFormDataModel;
import Avalara.SDK.model.A1099.V2.W8ImyFormDataModel;
import Avalara.SDK.model.A1099.V2.W9FormDataModel;
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
public class IW9FormDataModelsOneOf extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(IW9FormDataModelsOneOf.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!IW9FormDataModelsOneOf.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'IW9FormDataModelsOneOf' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<W4FormDataModel> adapterW4FormDataModel = gson.getDelegateAdapter(this, TypeToken.get(W4FormDataModel.class));
            final TypeAdapter<W8BeneFormDataModel> adapterW8BeneFormDataModel = gson.getDelegateAdapter(this, TypeToken.get(W8BeneFormDataModel.class));
            final TypeAdapter<W8BenFormDataModel> adapterW8BenFormDataModel = gson.getDelegateAdapter(this, TypeToken.get(W8BenFormDataModel.class));
            final TypeAdapter<W8ImyFormDataModel> adapterW8ImyFormDataModel = gson.getDelegateAdapter(this, TypeToken.get(W8ImyFormDataModel.class));
            final TypeAdapter<W9FormDataModel> adapterW9FormDataModel = gson.getDelegateAdapter(this, TypeToken.get(W9FormDataModel.class));

            return (TypeAdapter<T>) new TypeAdapter<IW9FormDataModelsOneOf>() {
                @Override
                public void write(JsonWriter out, IW9FormDataModelsOneOf value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `W4FormDataModel`
                    if (value.getActualInstance() instanceof W4FormDataModel) {
                        JsonElement element = adapterW4FormDataModel.toJsonTree((W4FormDataModel)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8BeneFormDataModel`
                    if (value.getActualInstance() instanceof W8BeneFormDataModel) {
                        JsonElement element = adapterW8BeneFormDataModel.toJsonTree((W8BeneFormDataModel)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8BenFormDataModel`
                    if (value.getActualInstance() instanceof W8BenFormDataModel) {
                        JsonElement element = adapterW8BenFormDataModel.toJsonTree((W8BenFormDataModel)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W8ImyFormDataModel`
                    if (value.getActualInstance() instanceof W8ImyFormDataModel) {
                        JsonElement element = adapterW8ImyFormDataModel.toJsonTree((W8ImyFormDataModel)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `W9FormDataModel`
                    if (value.getActualInstance() instanceof W9FormDataModel) {
                        JsonElement element = adapterW9FormDataModel.toJsonTree((W9FormDataModel)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: W4FormDataModel, W8BenFormDataModel, W8BeneFormDataModel, W8ImyFormDataModel, W9FormDataModel");
                }

                @Override
                public IW9FormDataModelsOneOf read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize W4FormDataModel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W4FormDataModel.validateJsonElement(jsonElement);
                        actualAdapter = adapterW4FormDataModel;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W4FormDataModel'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W4FormDataModel failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W4FormDataModel'", e);
                    }
                    // deserialize W8BeneFormDataModel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8BeneFormDataModel.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8BeneFormDataModel;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8BeneFormDataModel'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8BeneFormDataModel failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8BeneFormDataModel'", e);
                    }
                    // deserialize W8BenFormDataModel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8BenFormDataModel.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8BenFormDataModel;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8BenFormDataModel'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8BenFormDataModel failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8BenFormDataModel'", e);
                    }
                    // deserialize W8ImyFormDataModel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W8ImyFormDataModel.validateJsonElement(jsonElement);
                        actualAdapter = adapterW8ImyFormDataModel;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W8ImyFormDataModel'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W8ImyFormDataModel failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W8ImyFormDataModel'", e);
                    }
                    // deserialize W9FormDataModel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        W9FormDataModel.validateJsonElement(jsonElement);
                        actualAdapter = adapterW9FormDataModel;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'W9FormDataModel'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for W9FormDataModel failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'W9FormDataModel'", e);
                    }

                    if (match == 1) {
                        IW9FormDataModelsOneOf ret = new IW9FormDataModelsOneOf();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for IW9FormDataModelsOneOf: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public IW9FormDataModelsOneOf() {
        super("oneOf", Boolean.FALSE);
    }

    public IW9FormDataModelsOneOf(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("W4FormDataModel", W4FormDataModel.class);
        schemas.put("W8BeneFormDataModel", W8BeneFormDataModel.class);
        schemas.put("W8BenFormDataModel", W8BenFormDataModel.class);
        schemas.put("W8ImyFormDataModel", W8ImyFormDataModel.class);
        schemas.put("W9FormDataModel", W9FormDataModel.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return IW9FormDataModelsOneOf.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * W4FormDataModel, W8BenFormDataModel, W8BeneFormDataModel, W8ImyFormDataModel, W9FormDataModel
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof W4FormDataModel) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8BeneFormDataModel) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8BenFormDataModel) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W8ImyFormDataModel) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof W9FormDataModel) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be W4FormDataModel, W8BenFormDataModel, W8BeneFormDataModel, W8ImyFormDataModel, W9FormDataModel");
    }

    /**
     * Get the actual instance, which can be the following:
     * W4FormDataModel, W8BenFormDataModel, W8BeneFormDataModel, W8ImyFormDataModel, W9FormDataModel
     *
     * @return The actual instance (W4FormDataModel, W8BenFormDataModel, W8BeneFormDataModel, W8ImyFormDataModel, W9FormDataModel)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `W4FormDataModel`. If the actual instance is not `W4FormDataModel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W4FormDataModel`
     * @throws ClassCastException if the instance is not `W4FormDataModel`
     */
    public W4FormDataModel getW4FormDataModel() throws ClassCastException {
        return (W4FormDataModel)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8BeneFormDataModel`. If the actual instance is not `W8BeneFormDataModel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8BeneFormDataModel`
     * @throws ClassCastException if the instance is not `W8BeneFormDataModel`
     */
    public W8BeneFormDataModel getW8BeneFormDataModel() throws ClassCastException {
        return (W8BeneFormDataModel)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8BenFormDataModel`. If the actual instance is not `W8BenFormDataModel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8BenFormDataModel`
     * @throws ClassCastException if the instance is not `W8BenFormDataModel`
     */
    public W8BenFormDataModel getW8BenFormDataModel() throws ClassCastException {
        return (W8BenFormDataModel)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W8ImyFormDataModel`. If the actual instance is not `W8ImyFormDataModel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W8ImyFormDataModel`
     * @throws ClassCastException if the instance is not `W8ImyFormDataModel`
     */
    public W8ImyFormDataModel getW8ImyFormDataModel() throws ClassCastException {
        return (W8ImyFormDataModel)super.getActualInstance();
    }
    /**
     * Get the actual instance of `W9FormDataModel`. If the actual instance is not `W9FormDataModel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `W9FormDataModel`
     * @throws ClassCastException if the instance is not `W9FormDataModel`
     */
    public W9FormDataModel getW9FormDataModel() throws ClassCastException {
        return (W9FormDataModel)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to IW9FormDataModelsOneOf
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with W4FormDataModel
        try {
            W4FormDataModel.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W4FormDataModel failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8BeneFormDataModel
        try {
            W8BeneFormDataModel.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8BeneFormDataModel failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8BenFormDataModel
        try {
            W8BenFormDataModel.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8BenFormDataModel failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W8ImyFormDataModel
        try {
            W8ImyFormDataModel.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W8ImyFormDataModel failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with W9FormDataModel
        try {
            W9FormDataModel.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for W9FormDataModel failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for IW9FormDataModelsOneOf with oneOf schemas: W4FormDataModel, W8BenFormDataModel, W8BeneFormDataModel, W8ImyFormDataModel, W9FormDataModel. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of IW9FormDataModelsOneOf given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of IW9FormDataModelsOneOf
     * @throws IOException if the JSON string is invalid with respect to IW9FormDataModelsOneOf
     */
    public static IW9FormDataModelsOneOf fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, IW9FormDataModelsOneOf.class);
    }

    /**
     * Convert an instance of IW9FormDataModelsOneOf to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

