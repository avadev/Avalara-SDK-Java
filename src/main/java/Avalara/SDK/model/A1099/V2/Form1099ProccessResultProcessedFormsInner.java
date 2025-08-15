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
import Avalara.SDK.model.A1099.V2.CoveredIndividualReference;
import Avalara.SDK.model.A1099.V2.Form1042S;
import Avalara.SDK.model.A1099.V2.Form1095B;
import Avalara.SDK.model.A1099.V2.Form1099Div;
import Avalara.SDK.model.A1099.V2.Form1099Int;
import Avalara.SDK.model.A1099.V2.Form1099K;
import Avalara.SDK.model.A1099.V2.Form1099Misc;
import Avalara.SDK.model.A1099.V2.Form1099Nec;
import Avalara.SDK.model.A1099.V2.Form1099R;
import Avalara.SDK.model.A1099.V2.Form1099StatusDetail;
import Avalara.SDK.model.A1099.V2.IntermediaryOrFlowThrough;
import Avalara.SDK.model.A1099.V2.PrimaryWithholdingAgent;
import Avalara.SDK.model.A1099.V2.StateAndLocalWithholding;
import Avalara.SDK.model.A1099.V2.StateEfileStatusDetail;
import Avalara.SDK.model.A1099.V2.ValidationError;
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
public class Form1099ProccessResultProcessedFormsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Form1099ProccessResultProcessedFormsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Form1099ProccessResultProcessedFormsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Form1099ProccessResultProcessedFormsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Form1042S> adapterForm1042S = gson.getDelegateAdapter(this, TypeToken.get(Form1042S.class));
            final TypeAdapter<Form1095B> adapterForm1095B = gson.getDelegateAdapter(this, TypeToken.get(Form1095B.class));
            final TypeAdapter<Form1099Div> adapterForm1099Div = gson.getDelegateAdapter(this, TypeToken.get(Form1099Div.class));
            final TypeAdapter<Form1099Int> adapterForm1099Int = gson.getDelegateAdapter(this, TypeToken.get(Form1099Int.class));
            final TypeAdapter<Form1099K> adapterForm1099K = gson.getDelegateAdapter(this, TypeToken.get(Form1099K.class));
            final TypeAdapter<Form1099Misc> adapterForm1099Misc = gson.getDelegateAdapter(this, TypeToken.get(Form1099Misc.class));
            final TypeAdapter<Form1099Nec> adapterForm1099Nec = gson.getDelegateAdapter(this, TypeToken.get(Form1099Nec.class));
            final TypeAdapter<Form1099R> adapterForm1099R = gson.getDelegateAdapter(this, TypeToken.get(Form1099R.class));

            return (TypeAdapter<T>) new TypeAdapter<Form1099ProccessResultProcessedFormsInner>() {
                @Override
                public void write(JsonWriter out, Form1099ProccessResultProcessedFormsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Form1042S`
                    if (value.getActualInstance() instanceof Form1042S) {
                        JsonElement element = adapterForm1042S.toJsonTree((Form1042S)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1095B`
                    if (value.getActualInstance() instanceof Form1095B) {
                        JsonElement element = adapterForm1095B.toJsonTree((Form1095B)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099Div`
                    if (value.getActualInstance() instanceof Form1099Div) {
                        JsonElement element = adapterForm1099Div.toJsonTree((Form1099Div)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099Int`
                    if (value.getActualInstance() instanceof Form1099Int) {
                        JsonElement element = adapterForm1099Int.toJsonTree((Form1099Int)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099K`
                    if (value.getActualInstance() instanceof Form1099K) {
                        JsonElement element = adapterForm1099K.toJsonTree((Form1099K)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099Misc`
                    if (value.getActualInstance() instanceof Form1099Misc) {
                        JsonElement element = adapterForm1099Misc.toJsonTree((Form1099Misc)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099Nec`
                    if (value.getActualInstance() instanceof Form1099Nec) {
                        JsonElement element = adapterForm1099Nec.toJsonTree((Form1099Nec)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Form1099R`
                    if (value.getActualInstance() instanceof Form1099R) {
                        JsonElement element = adapterForm1099R.toJsonTree((Form1099R)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Form1042S, Form1095B, Form1099Div, Form1099Int, Form1099K, Form1099Misc, Form1099Nec, Form1099R");
                }

                @Override
                public Form1099ProccessResultProcessedFormsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Form1042S
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1042S.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1042S;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1042S'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1042S failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1042S'", e);
                    }
                    // deserialize Form1095B
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1095B.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1095B;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1095B'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1095B failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1095B'", e);
                    }
                    // deserialize Form1099Div
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099Div.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099Div;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099Div'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099Div failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099Div'", e);
                    }
                    // deserialize Form1099Int
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099Int.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099Int;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099Int'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099Int failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099Int'", e);
                    }
                    // deserialize Form1099K
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099K.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099K;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099K'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099K failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099K'", e);
                    }
                    // deserialize Form1099Misc
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099Misc.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099Misc;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099Misc'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099Misc failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099Misc'", e);
                    }
                    // deserialize Form1099Nec
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099Nec.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099Nec;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099Nec'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099Nec failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099Nec'", e);
                    }
                    // deserialize Form1099R
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Form1099R.validateJsonElement(jsonElement);
                        actualAdapter = adapterForm1099R;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Form1099R'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Form1099R failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Form1099R'", e);
                    }

                    if (match == 1) {
                        Form1099ProccessResultProcessedFormsInner ret = new Form1099ProccessResultProcessedFormsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Form1099ProccessResultProcessedFormsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Form1099ProccessResultProcessedFormsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public Form1099ProccessResultProcessedFormsInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Form1042S", Form1042S.class);
        schemas.put("Form1095B", Form1095B.class);
        schemas.put("Form1099Div", Form1099Div.class);
        schemas.put("Form1099Int", Form1099Int.class);
        schemas.put("Form1099K", Form1099K.class);
        schemas.put("Form1099Misc", Form1099Misc.class);
        schemas.put("Form1099Nec", Form1099Nec.class);
        schemas.put("Form1099R", Form1099R.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Form1099ProccessResultProcessedFormsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Form1042S, Form1095B, Form1099Div, Form1099Int, Form1099K, Form1099Misc, Form1099Nec, Form1099R
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Form1042S) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1095B) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099Div) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099Int) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099K) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099Misc) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099Nec) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Form1099R) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Form1042S, Form1095B, Form1099Div, Form1099Int, Form1099K, Form1099Misc, Form1099Nec, Form1099R");
    }

    /**
     * Get the actual instance, which can be the following:
     * Form1042S, Form1095B, Form1099Div, Form1099Int, Form1099K, Form1099Misc, Form1099Nec, Form1099R
     *
     * @return The actual instance (Form1042S, Form1095B, Form1099Div, Form1099Int, Form1099K, Form1099Misc, Form1099Nec, Form1099R)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Form1042S`. If the actual instance is not `Form1042S`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1042S`
     * @throws ClassCastException if the instance is not `Form1042S`
     */
    public Form1042S getForm1042S() throws ClassCastException {
        return (Form1042S)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1095B`. If the actual instance is not `Form1095B`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1095B`
     * @throws ClassCastException if the instance is not `Form1095B`
     */
    public Form1095B getForm1095B() throws ClassCastException {
        return (Form1095B)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099Div`. If the actual instance is not `Form1099Div`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099Div`
     * @throws ClassCastException if the instance is not `Form1099Div`
     */
    public Form1099Div getForm1099Div() throws ClassCastException {
        return (Form1099Div)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099Int`. If the actual instance is not `Form1099Int`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099Int`
     * @throws ClassCastException if the instance is not `Form1099Int`
     */
    public Form1099Int getForm1099Int() throws ClassCastException {
        return (Form1099Int)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099K`. If the actual instance is not `Form1099K`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099K`
     * @throws ClassCastException if the instance is not `Form1099K`
     */
    public Form1099K getForm1099K() throws ClassCastException {
        return (Form1099K)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099Misc`. If the actual instance is not `Form1099Misc`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099Misc`
     * @throws ClassCastException if the instance is not `Form1099Misc`
     */
    public Form1099Misc getForm1099Misc() throws ClassCastException {
        return (Form1099Misc)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099Nec`. If the actual instance is not `Form1099Nec`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099Nec`
     * @throws ClassCastException if the instance is not `Form1099Nec`
     */
    public Form1099Nec getForm1099Nec() throws ClassCastException {
        return (Form1099Nec)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Form1099R`. If the actual instance is not `Form1099R`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Form1099R`
     * @throws ClassCastException if the instance is not `Form1099R`
     */
    public Form1099R getForm1099R() throws ClassCastException {
        return (Form1099R)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Form1099ProccessResultProcessedFormsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Form1042S
        try {
            Form1042S.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1042S failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1095B
        try {
            Form1095B.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1095B failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099Div
        try {
            Form1099Div.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099Div failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099Int
        try {
            Form1099Int.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099Int failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099K
        try {
            Form1099K.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099K failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099Misc
        try {
            Form1099Misc.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099Misc failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099Nec
        try {
            Form1099Nec.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099Nec failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Form1099R
        try {
            Form1099R.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Form1099R failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for Form1099ProccessResultProcessedFormsInner with oneOf schemas: Form1042S, Form1095B, Form1099Div, Form1099Int, Form1099K, Form1099Misc, Form1099Nec, Form1099R. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of Form1099ProccessResultProcessedFormsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Form1099ProccessResultProcessedFormsInner
     * @throws IOException if the JSON string is invalid with respect to Form1099ProccessResultProcessedFormsInner
     */
    public static Form1099ProccessResultProcessedFormsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Form1099ProccessResultProcessedFormsInner.class);
    }

    /**
     * Convert an instance of Form1099ProccessResultProcessedFormsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

