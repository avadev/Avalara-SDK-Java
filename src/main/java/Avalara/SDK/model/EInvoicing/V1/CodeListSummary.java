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
import Avalara.SDK.model.EInvoicing.V1.CodeListVersion;
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
 * Displays a summary of information about a code list
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class CodeListSummary {
  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_CODE_LIST_ID = "codeListId";
  @SerializedName(SERIALIZED_NAME_CODE_LIST_ID)
  private String codeListId;

  public static final String SERIALIZED_NAME_CODE_LIST_NAME = "codeListName";
  @SerializedName(SERIALIZED_NAME_CODE_LIST_NAME)
  private String codeListName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STANDARD = "standard";
  @SerializedName(SERIALIZED_NAME_STANDARD)
  private String standard;

  public static final String SERIALIZED_NAME_VERSIONS = "versions";
  @SerializedName(SERIALIZED_NAME_VERSIONS)
  private List<CodeListVersion> versions;

  public CodeListSummary() {
  }

  public CodeListSummary countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Two-letter ISO 3166-1 alpha-2 country code indicating the jurisdiction this code list applies to.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public CodeListSummary codeListId(String codeListId) {
    this.codeListId = codeListId;
    return this;
  }

  /**
   * System-generated unique identifier of the code list definition. Typically a UUID used to reference this code list internally or via APIs.
   * @return codeListId
   */
  @javax.annotation.Nullable
  public String getCodeListId() {
    return codeListId;
  }

  public void setCodeListId(String codeListId) {
    this.codeListId = codeListId;
  }


  public CodeListSummary codeListName(String codeListName) {
    this.codeListName = codeListName;
    return this;
  }

  /**
   * Human-readable name of the code list, usually describing what the codes represent (for example, document types, tax categories, currencies).
   * @return codeListName
   */
  @javax.annotation.Nullable
  public String getCodeListName() {
    return codeListName;
  }

  public void setCodeListName(String codeListName) {
    this.codeListName = codeListName;
  }


  public CodeListSummary description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Textual description of the code list, including what it is used for and whether it represents a global standard (e.g., UN/CEFACT, ISO, EN16931) or a jurisdiction-specific/local extension of that standard.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public CodeListSummary standard(String standard) {
    this.standard = standard;
    return this;
  }

  /**
   * Identifier of the underlying standard or authoritative source for this code list. This may be a formal code list name (e.g., UNCL1001), a standard reference (e.g., EN16931), or an internal standard identifier.
   * @return standard
   */
  @javax.annotation.Nullable
  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }


  public CodeListSummary versions(List<CodeListVersion> versions) {
    this.versions = versions;
    return this;
  }

  public CodeListSummary addVersionsItem(CodeListVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * Array of versioned definitions of this code list for the given jurisdiction. Each entry represents a version that is valid for a specific effective/sunset date range, optionally per locale.
   * @return versions
   */
  @javax.annotation.Nullable
  public List<CodeListVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<CodeListVersion> versions) {
    this.versions = versions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeListSummary codeListSummary = (CodeListSummary) o;
    return Objects.equals(this.countryCode, codeListSummary.countryCode) &&
        Objects.equals(this.codeListId, codeListSummary.codeListId) &&
        Objects.equals(this.codeListName, codeListSummary.codeListName) &&
        Objects.equals(this.description, codeListSummary.description) &&
        Objects.equals(this.standard, codeListSummary.standard) &&
        Objects.equals(this.versions, codeListSummary.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, codeListId, codeListName, description, standard, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeListSummary {\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    codeListId: ").append(toIndentedString(codeListId)).append("\n");
    sb.append("    codeListName: ").append(toIndentedString(codeListName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
    openapiFields.add("countryCode");
    openapiFields.add("codeListId");
    openapiFields.add("codeListName");
    openapiFields.add("description");
    openapiFields.add("standard");
    openapiFields.add("versions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CodeListSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CodeListSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodeListSummary is not found in the empty JSON string", CodeListSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CodeListSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodeListSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("codeListId") != null && !jsonObj.get("codeListId").isJsonNull()) && !jsonObj.get("codeListId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codeListId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codeListId").toString()));
      }
      if ((jsonObj.get("codeListName") != null && !jsonObj.get("codeListName").isJsonNull()) && !jsonObj.get("codeListName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codeListName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codeListName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("standard") != null && !jsonObj.get("standard").isJsonNull()) && !jsonObj.get("standard").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard").toString()));
      }
      if (jsonObj.get("versions") != null && !jsonObj.get("versions").isJsonNull()) {
        JsonArray jsonArrayversions = jsonObj.getAsJsonArray("versions");
        if (jsonArrayversions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("versions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `versions` to be an array in the JSON string but got `%s`", jsonObj.get("versions").toString()));
          }

          // validate the optional field `versions` (array)
          for (int i = 0; i < jsonArrayversions.size(); i++) {
            CodeListVersion.validateJsonElement(jsonArrayversions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodeListSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodeListSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodeListSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodeListSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<CodeListSummary>() {
           @Override
           public void write(JsonWriter out, CodeListSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodeListSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CodeListSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CodeListSummary
   * @throws IOException if the JSON string is invalid with respect to CodeListSummary
   */
  public static CodeListSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodeListSummary.class);
  }

  /**
   * Convert an instance of CodeListSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

