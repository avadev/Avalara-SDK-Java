/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2025 Avalara, Inc.
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
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.EInvoicing.V1;

import java.util.Objects;
import Avalara.SDK.model.EInvoicing.V1.CodeListValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
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
 * Represents a versioned definition of a code list for a specific jurisdiction and date range
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CodeListVersion {
  public static final String SERIALIZED_NAME_VERSION_REASONS = "versionReasons";
  @SerializedName(SERIALIZED_NAME_VERSION_REASONS)
  private List<String> versionReasons;

  public static final String SERIALIZED_NAME_JURIS_EFFECTIVE_DATE = "jurisEffectiveDate";
  @SerializedName(SERIALIZED_NAME_JURIS_EFFECTIVE_DATE)
  private LocalDate jurisEffectiveDate;

  public static final String SERIALIZED_NAME_JURIS_SUNSET_DATE = "jurisSunsetDate";
  @SerializedName(SERIALIZED_NAME_JURIS_SUNSET_DATE)
  private LocalDate jurisSunsetDate;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<CodeListValue> values;

  public CodeListVersion() {
  }

  public CodeListVersion versionReasons(List<String> versionReasons) {
    this.versionReasons = versionReasons;
    return this;
  }

  public CodeListVersion addVersionReasonsItem(String versionReasonsItem) {
    if (this.versionReasons == null) {
      this.versionReasons = new ArrayList<>();
    }
    this.versionReasons.add(versionReasonsItem);
    return this;
  }

  /**
   * List of free-text reasons explaining why this version of the code list exists (for example, initial introduction, regulatory update, addition/deprecation of codes). Useful for audit and change tracking.
   * @return versionReasons
   */
  @javax.annotation.Nullable
  public List<String> getVersionReasons() {
    return versionReasons;
  }

  public void setVersionReasons(List<String> versionReasons) {
    this.versionReasons = versionReasons;
  }


  public CodeListVersion jurisEffectiveDate(LocalDate jurisEffectiveDate) {
    this.jurisEffectiveDate = jurisEffectiveDate;
    return this;
  }

  /**
   * Date from which this version of the code list becomes legally or operationally effective in the jurisdiction. Typically corresponds to a go-live, mandate, or release date.
   * @return jurisEffectiveDate
   */
  @javax.annotation.Nullable
  public LocalDate getJurisEffectiveDate() {
    return jurisEffectiveDate;
  }

  public void setJurisEffectiveDate(LocalDate jurisEffectiveDate) {
    this.jurisEffectiveDate = jurisEffectiveDate;
  }


  public CodeListVersion jurisSunsetDate(LocalDate jurisSunsetDate) {
    this.jurisSunsetDate = jurisSunsetDate;
    return this;
  }

  /**
   * Date after which this version of the code list must no longer be used in the jurisdiction. Use a far-future date (e.g., 9999-12-31) when the sunset is not yet known.
   * @return jurisSunsetDate
   */
  @javax.annotation.Nullable
  public LocalDate getJurisSunsetDate() {
    return jurisSunsetDate;
  }

  public void setJurisSunsetDate(LocalDate jurisSunsetDate) {
    this.jurisSunsetDate = jurisSunsetDate;
  }


  public CodeListVersion locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Language–region locale identifier indicating the language and regional variant for descriptions in this version of the code list. Follows BCP-47 format such as en-US, fr-FR, de-DE.
   * @return locale
   */
  @javax.annotation.Nullable
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  public CodeListVersion values(List<CodeListValue> values) {
    this.values = values;
    return this;
  }

  public CodeListVersion addValuesItem(CodeListValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Array of code entries defined in this version of the code list. Each entry contains the machine-readable code value and its human-readable description in the given locale.
   * @return values
   */
  @javax.annotation.Nullable
  public List<CodeListValue> getValues() {
    return values;
  }

  public void setValues(List<CodeListValue> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeListVersion codeListVersion = (CodeListVersion) o;
    return Objects.equals(this.versionReasons, codeListVersion.versionReasons) &&
        Objects.equals(this.jurisEffectiveDate, codeListVersion.jurisEffectiveDate) &&
        Objects.equals(this.jurisSunsetDate, codeListVersion.jurisSunsetDate) &&
        Objects.equals(this.locale, codeListVersion.locale) &&
        Objects.equals(this.values, codeListVersion.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionReasons, jurisEffectiveDate, jurisSunsetDate, locale, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeListVersion {\n");
    sb.append("    versionReasons: ").append(toIndentedString(versionReasons)).append("\n");
    sb.append("    jurisEffectiveDate: ").append(toIndentedString(jurisEffectiveDate)).append("\n");
    sb.append("    jurisSunsetDate: ").append(toIndentedString(jurisSunsetDate)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("versionReasons");
    openapiFields.add("jurisEffectiveDate");
    openapiFields.add("jurisSunsetDate");
    openapiFields.add("locale");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CodeListVersion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CodeListVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodeListVersion is not found in the empty JSON string", CodeListVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CodeListVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodeListVersion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("versionReasons") != null && !jsonObj.get("versionReasons").isJsonNull() && !jsonObj.get("versionReasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionReasons` to be an array in the JSON string but got `%s`", jsonObj.get("versionReasons").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            CodeListValue.validateJsonElement(jsonArrayvalues.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodeListVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodeListVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodeListVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodeListVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<CodeListVersion>() {
           @Override
           public void write(JsonWriter out, CodeListVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodeListVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CodeListVersion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CodeListVersion
   * @throws IOException if the JSON string is invalid with respect to CodeListVersion
   */
  public static CodeListVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodeListVersion.class);
  }

  /**
   * Convert an instance of CodeListVersion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

