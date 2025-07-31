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
import Avalara.SDK.model.A1099.V2.Form1042SList;
import Avalara.SDK.model.A1099.V2.Form1095BList;
import Avalara.SDK.model.A1099.V2.Form1095CList;
import Avalara.SDK.model.A1099.V2.Form1099DivList;
import Avalara.SDK.model.A1099.V2.Form1099KList;
import Avalara.SDK.model.A1099.V2.Form1099MiscList;
import Avalara.SDK.model.A1099.V2.Form1099NecList;
import Avalara.SDK.model.A1099.V2.Form1099RList;
import Avalara.SDK.model.A1099.V2.Form1099RListItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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
public class BulkUpsert1099FormsRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(BulkUpsert1099FormsRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!BulkUpsert1099FormsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'BulkUpsert1099FormsRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Form1042SList> adapterForm1042SList = gson.getDelegateAdapter(this, TypeToken.get(Form1042SList.class));
            final TypeAdapter<Form1095BList> adapterForm1095BList = gson.getDelegateAdapter(this, TypeToken.get(Form1095BList.class));
            final TypeAdapter<Form1095CList> adapterForm1095CList = gson.getDelegateAdapter(this, TypeToken.get(Form1095CList.class));
            final TypeAdapter<Form1099DivList> adapterForm1099DivList = gson.getDelegateAdapter(this, TypeToken.get(Form1099DivList.class));
            final TypeAdapter<Form1099KList> adapterForm1099KList = gson.getDelegateAdapter(this, TypeToken.get(Form1099KList.class));
            final TypeAdapter<Form1099MiscList> adapterForm1099MiscList = gson.getDelegateAdapter(this, TypeToken.get(Form1099MiscList.class));
            final TypeAdapter<Form1099NecList> adapterForm1099NecList = gson.getDelegateAdapter(this, TypeToken.get(Form1099NecList.class));
            final TypeAdapter<Form1099RList> adapterForm1099RList = gson.getDelegateAdapter(this, TypeToken.get(Form1099RList.class));

            return (TypeAdapter<T>) new TypeAdapter<BulkUpsert1099FormsRequest>() {
                @Override
                public void write(JsonWriter out, BulkUpsert1099FormsRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Form1042SList`
                    if (value.getActualInstance() instanceof Form1042SList) {
                        JsonElement element = adapterForm1042SList.toJsonTree((Form1042SList)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1095BList`
                    if (value.getActualInstance() instanceof Form1095BList) {
                        JsonElement element = adapterForm1095BList.toJsonTree((Form1095BList)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1095CList`
                    if (value.getActualInstance() instanceof Form1095CList) {
                        JsonElement element = adapterForm1095CList.toJsonTree((Form1095CList)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099DivList`
                    if (value.getActualInstance() instanceof Form1099DivList) {
                        JsonElement element = adapterForm1099DivList.toJsonTree((Form1099DivList)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099KList`
                    if (value.getActualInstance() instanceof Form1099KList) {
                        JsonElement element = adapterForm1099KList.toJsonTree((Form1099KList)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099MiscList`
                    if (value.getActualInstance() instanceof Form1099MiscList) {
                        JsonElement element = adapterForm1099MiscList.toJsonTree((Form1099MiscList)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099NecList`
                    if (value.getActualInstance() instanceof Form1099NecList) {
                        JsonElement element = adapterForm1099NecList.toJsonTree((Form1099NecList)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099RList`
                    if (value.getActualInstance() instanceof Form1099RList) {
                        JsonElement element = adapterForm1099RList.toJsonTree((Form1099RList)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Form1042SList, Form1095BList, Form1095CList, Form1099DivList, Form1099KList, Form1099MiscList, Form1099NecList, Form1099RList");
                }

                @Override
                public BulkUpsert1099FormsRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Form1042SList
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1042SList.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1042SList;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1042SList'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1042SList failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1042SList'", e);
                    }
                    // deserialize Form1095BList
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1095BList.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1095BList;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1095BList'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1095BList failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1095BList'", e);
                    }
                    // deserialize Form1095CList
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1095CList.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1095CList;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1095CList'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1095CList failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1095CList'", e);
                    }
                    // deserialize Form1099DivList
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099DivList.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099DivList;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099DivList'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099DivList failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099DivList'", e);
                    }
                    // deserialize Form1099KList
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099KList.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099KList;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099KList'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099KList failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099KList'", e);
                    }
                    // deserialize Form1099MiscList
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099MiscList.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099MiscList;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099MiscList'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099MiscList failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099MiscList'", e);
                    }
                    // deserialize Form1099NecList
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099NecList.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099NecList;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099NecList'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099NecList failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099NecList'", e);
                    }
                    // deserialize Form1099RList
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099RList.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099RList;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099RList'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099RList failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099RList'", e);
                    }

                    if (match == 1) {
                        BulkUpsert1099FormsRequest ret = new BulkUpsert1099FormsRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for BulkUpsert1099FormsRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public BulkUpsert1099FormsRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public BulkUpsert1099FormsRequest(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Form1042SList", Form1042SList.class);
        schemas.put("Form1095BList", Form1095BList.class);
        schemas.put("Form1095CList", Form1095CList.class);
        schemas.put("Form1099DivList", Form1099DivList.class);
        schemas.put("Form1099KList", Form1099KList.class);
        schemas.put("Form1099MiscList", Form1099MiscList.class);
        schemas.put("Form1099NecList", Form1099NecList.class);
        schemas.put("Form1099RList", Form1099RList.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return BulkUpsert1099FormsRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Form1042SList, Form1095BList, Form1095CList, Form1099DivList, Form1099KList, Form1099MiscList, Form1099NecList, Form1099RList
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Form1042SList) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1095BList) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1095CList) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099DivList) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099KList) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099MiscList) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099NecList) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099RList) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Form1042SList, Form1095BList, Form1095CList, Form1099DivList, Form1099KList, Form1099MiscList, Form1099NecList, Form1099RList");
    }

    /**
     * Get the actual instance, which can be the following:
     * Form1042SList, Form1095BList, Form1095CList, Form1099DivList, Form1099KList, Form1099MiscList, Form1099NecList, Form1099RList
     *
     * @return The actual instance (Form1042SList, Form1095BList, Form1095CList, Form1099DivList, Form1099KList, Form1099MiscList, Form1099NecList, Form1099RList)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Form1042SList`. If the actual instance is not `Form1042SList`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1042SList`
     * @throws ClassCastException if the instance is not `Form1042SList`
     */
    public Form1042SList getForm1042SList() throws ClassCastException {
        return (Form1042SList)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1095BList`. If the actual instance is not `Form1095BList`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1095BList`
     * @throws ClassCastException if the instance is not `Form1095BList`
     */
    public Form1095BList getForm1095BList() throws ClassCastException {
        return (Form1095BList)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1095CList`. If the actual instance is not `Form1095CList`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1095CList`
     * @throws ClassCastException if the instance is not `Form1095CList`
     */
    public Form1095CList getForm1095CList() throws ClassCastException {
        return (Form1095CList)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099DivList`. If the actual instance is not `Form1099DivList`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099DivList`
     * @throws ClassCastException if the instance is not `Form1099DivList`
     */
    public Form1099DivList getForm1099DivList() throws ClassCastException {
        return (Form1099DivList)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099KList`. If the actual instance is not `Form1099KList`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099KList`
     * @throws ClassCastException if the instance is not `Form1099KList`
     */
    public Form1099KList getForm1099KList() throws ClassCastException {
        return (Form1099KList)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099MiscList`. If the actual instance is not `Form1099MiscList`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099MiscList`
     * @throws ClassCastException if the instance is not `Form1099MiscList`
     */
    public Form1099MiscList getForm1099MiscList() throws ClassCastException {
        return (Form1099MiscList)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099NecList`. If the actual instance is not `Form1099NecList`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099NecList`
     * @throws ClassCastException if the instance is not `Form1099NecList`
     */
    public Form1099NecList getForm1099NecList() throws ClassCastException {
        return (Form1099NecList)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099RList`. If the actual instance is not `Form1099RList`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099RList`
     * @throws ClassCastException if the instance is not `Form1099RList`
     */
    public Form1099RList getForm1099RList() throws ClassCastException {
        return (Form1099RList)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to BulkUpsert1099FormsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Form1042SList
        try {
            Form1042SList.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1042SList failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1095BList
        try {
            Form1095BList.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1095BList failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1095CList
        try {
            Form1095CList.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1095CList failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099DivList
        try {
            Form1099DivList.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099DivList failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099KList
        try {
            Form1099KList.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099KList failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099MiscList
        try {
            Form1099MiscList.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099MiscList failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099NecList
        try {
            Form1099NecList.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099NecList failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099RList
        try {
            Form1099RList.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099RList failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for BulkUpsert1099FormsRequest with oneOf schemas: Form1042SList, Form1095BList, Form1095CList, Form1099DivList, Form1099KList, Form1099MiscList, Form1099NecList, Form1099RList. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of BulkUpsert1099FormsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of BulkUpsert1099FormsRequest
     * @throws IOException if the JSON string is invalid with respect to BulkUpsert1099FormsRequest
     */
    public static BulkUpsert1099FormsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, BulkUpsert1099FormsRequest.class);
    }

    /**
     * Convert an instance of BulkUpsert1099FormsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

