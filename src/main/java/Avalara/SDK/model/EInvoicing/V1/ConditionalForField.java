/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara E-Invoicing API
 *
 * An API that supports sending data for an E-Invoicing compliance use-case.
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.model.EInvoicing.V1;

import java.util.Objects;
import Avalara.SDK.model.EInvoicing.V1.RequiredWhenField;
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
 * Mandates for which this field is conditional
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConditionalForField {
  public static final String SERIALIZED_NAME_COUNTRY_MANDATE = "countryMandate";
  @SerializedName(SERIALIZED_NAME_COUNTRY_MANDATE)
  private String countryMandate;

  public static final String SERIALIZED_NAME_REQUIRED_WHEN = "requiredWhen";
  @SerializedName(SERIALIZED_NAME_REQUIRED_WHEN)
  private List<RequiredWhenField> requiredWhen;

  public ConditionalForField() {
  }

  public ConditionalForField countryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
    return this;
  }

   /**
   * Get countryMandate
   * @return countryMandate
  **/
  @javax.annotation.Nullable
  public String getCountryMandate() {
    return countryMandate;
  }

  public void setCountryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
  }


  public ConditionalForField requiredWhen(List<RequiredWhenField> requiredWhen) {
    this.requiredWhen = requiredWhen;
    return this;
  }

  public ConditionalForField addRequiredWhenItem(RequiredWhenField requiredWhenItem) {
    if (this.requiredWhen == null) {
      this.requiredWhen = new ArrayList<>();
    }
    this.requiredWhen.add(requiredWhenItem);
    return this;
  }

   /**
   * Array of scenarios which describe when a particular field is conditional for a country mandate
   * @return requiredWhen
  **/
  @javax.annotation.Nullable
  public List<RequiredWhenField> getRequiredWhen() {
    return requiredWhen;
  }

  public void setRequiredWhen(List<RequiredWhenField> requiredWhen) {
    this.requiredWhen = requiredWhen;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalForField conditionalForField = (ConditionalForField) o;
    return Objects.equals(this.countryMandate, conditionalForField.countryMandate) &&
        Objects.equals(this.requiredWhen, conditionalForField.requiredWhen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryMandate, requiredWhen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalForField {\n");
    sb.append("    countryMandate: ").append(toIndentedString(countryMandate)).append("\n");
    sb.append("    requiredWhen: ").append(toIndentedString(requiredWhen)).append("\n");
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
    openapiFields.add("countryMandate");
    openapiFields.add("requiredWhen");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConditionalForField
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConditionalForField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConditionalForField is not found in the empty JSON string", ConditionalForField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConditionalForField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConditionalForField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("countryMandate") != null && !jsonObj.get("countryMandate").isJsonNull()) && !jsonObj.get("countryMandate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryMandate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryMandate").toString()));
      }
      if (jsonObj.get("requiredWhen") != null && !jsonObj.get("requiredWhen").isJsonNull()) {
        JsonArray jsonArrayrequiredWhen = jsonObj.getAsJsonArray("requiredWhen");
        if (jsonArrayrequiredWhen != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requiredWhen").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requiredWhen` to be an array in the JSON string but got `%s`", jsonObj.get("requiredWhen").toString()));
          }

          // validate the optional field `requiredWhen` (array)
          for (int i = 0; i < jsonArrayrequiredWhen.size(); i++) {
            RequiredWhenField.validateJsonElement(jsonArrayrequiredWhen.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConditionalForField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConditionalForField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConditionalForField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConditionalForField.class));

       return (TypeAdapter<T>) new TypeAdapter<ConditionalForField>() {
           @Override
           public void write(JsonWriter out, ConditionalForField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConditionalForField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConditionalForField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConditionalForField
  * @throws IOException if the JSON string is invalid with respect to ConditionalForField
  */
  public static ConditionalForField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConditionalForField.class);
  }

 /**
  * Convert an instance of ConditionalForField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

