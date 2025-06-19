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
import Avalara.SDK.model.A1099.V2.Form1099DivListItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Avalara.SDK.JSON;

/**
 * Form1099DivList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Form1099DivList {
  public static final String SERIALIZED_NAME_FORMS = "forms";
  @SerializedName(SERIALIZED_NAME_FORMS)
  private List<Form1099DivListItem> forms = new ArrayList<>();

  public static final String SERIALIZED_NAME_FORM_TYPE = "formType";
  @SerializedName(SERIALIZED_NAME_FORM_TYPE)
  private String formType;

  public Form1099DivList() {
  }

  public Form1099DivList forms(List<Form1099DivListItem> forms) {
    this.forms = forms;
    return this;
  }

  public Form1099DivList addFormsItem(Form1099DivListItem formsItem) {
    if (this.forms == null) {
      this.forms = new ArrayList<>();
    }
    this.forms.add(formsItem);
    return this;
  }

  /**
   * Get forms
   * @return forms
   */
  @javax.annotation.Nullable
  public List<Form1099DivListItem> getForms() {
    return forms;
  }

  public void setForms(List<Form1099DivListItem> forms) {
    this.forms = forms;
  }


  public Form1099DivList formType(String formType) {
    this.formType = formType;
    return this;
  }

  /**
   * Get formType
   * @return formType
   */
  @javax.annotation.Nullable
  public String getFormType() {
    return formType;
  }

  public void setFormType(String formType) {
    this.formType = formType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form1099DivList form1099DivList = (Form1099DivList) o;
    return Objects.equals(this.forms, form1099DivList.forms) &&
        Objects.equals(this.formType, form1099DivList.formType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forms, formType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form1099DivList {\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    formType: ").append(toIndentedString(formType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("formType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Form1099DivList
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Form1099DivList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Form1099DivList is not found in the empty JSON string", Form1099DivList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Form1099DivList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Form1099DivList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("forms") != null && !jsonObj.get("forms").isJsonNull()) {
        JsonArray jsonArrayforms = jsonObj.getAsJsonArray("forms");
        if (jsonArrayforms != null) {
          // ensure the json data is an array
          if (!jsonObj.get("forms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `forms` to be an array in the JSON string but got `%s`", jsonObj.get("forms").toString()));
          }

          // validate the optional field `forms` (array)
          for (int i = 0; i < jsonArrayforms.size(); i++) {
            Form1099DivListItem.validateJsonElement(jsonArrayforms.get(i));
          };
        }
      }
      if ((jsonObj.get("formType") != null && !jsonObj.get("formType").isJsonNull()) && !jsonObj.get("formType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Form1099DivList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Form1099DivList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Form1099DivList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Form1099DivList.class));

       return (TypeAdapter<T>) new TypeAdapter<Form1099DivList>() {
           @Override
           public void write(JsonWriter out, Form1099DivList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Form1099DivList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Form1099DivList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Form1099DivList
   * @throws IOException if the JSON string is invalid with respect to Form1099DivList
   */
  public static Form1099DivList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Form1099DivList.class);
  }

  /**
   * Convert an instance of Form1099DivList to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

