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
import Avalara.SDK.model.EInvoicing.V1.MandateDataInputFieldNamespace;
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
 * The Data Input Field
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class MandateDataInputField {
  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_DOCUMENT_VERSION = "documentVersion";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_VERSION)
  private String documentVersion;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PATH_TYPE = "pathType";
  @SerializedName(SERIALIZED_NAME_PATH_TYPE)
  private String pathType;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private MandateDataInputFieldNamespace namespace;

  public static final String SERIALIZED_NAME_EXAMPLE_OR_FIXED_VALUE = "exampleOrFixedValue";
  @SerializedName(SERIALIZED_NAME_EXAMPLE_OR_FIXED_VALUE)
  private String exampleOrFixedValue;

  public static final String SERIALIZED_NAME_ACCEPTED_VALUES = "acceptedValues";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_VALUES)
  private List<String> acceptedValues = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOCUMENTATION_LINK = "documentationLink";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATION_LINK)
  private String documentationLink;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_OPTIONALITY = "optionality";
  @SerializedName(SERIALIZED_NAME_OPTIONALITY)
  private String optionality;

  public static final String SERIALIZED_NAME_CARDINALITY = "cardinality";
  @SerializedName(SERIALIZED_NAME_CARDINALITY)
  private String cardinality;

  public MandateDataInputField() {
  }

  public MandateDataInputField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * Field ID
   * @return fieldId
   */
  @javax.annotation.Nullable
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  public MandateDataInputField documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * The document type
   * @return documentType
   */
  @javax.annotation.Nullable
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public MandateDataInputField documentVersion(String documentVersion) {
    this.documentVersion = documentVersion;
    return this;
  }

  /**
   * The document version
   * @return documentVersion
   */
  @javax.annotation.Nullable
  public String getDocumentVersion() {
    return documentVersion;
  }

  public void setDocumentVersion(String documentVersion) {
    this.documentVersion = documentVersion;
  }


  public MandateDataInputField path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to this field
   * @return path
   */
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public MandateDataInputField pathType(String pathType) {
    this.pathType = pathType;
    return this;
  }

  /**
   * The type of path
   * @return pathType
   */
  @javax.annotation.Nullable
  public String getPathType() {
    return pathType;
  }

  public void setPathType(String pathType) {
    this.pathType = pathType;
  }


  public MandateDataInputField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Field name
   * @return fieldName
   */
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public MandateDataInputField namespace(MandateDataInputFieldNamespace namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   */
  @javax.annotation.Nullable
  public MandateDataInputFieldNamespace getNamespace() {
    return namespace;
  }

  public void setNamespace(MandateDataInputFieldNamespace namespace) {
    this.namespace = namespace;
  }


  public MandateDataInputField exampleOrFixedValue(String exampleOrFixedValue) {
    this.exampleOrFixedValue = exampleOrFixedValue;
    return this;
  }

  /**
   * An example of the content for this field
   * @return exampleOrFixedValue
   */
  @javax.annotation.Nullable
  public String getExampleOrFixedValue() {
    return exampleOrFixedValue;
  }

  public void setExampleOrFixedValue(String exampleOrFixedValue) {
    this.exampleOrFixedValue = exampleOrFixedValue;
  }


  public MandateDataInputField acceptedValues(List<String> acceptedValues) {
    this.acceptedValues = acceptedValues;
    return this;
  }

  public MandateDataInputField addAcceptedValuesItem(String acceptedValuesItem) {
    if (this.acceptedValues == null) {
      this.acceptedValues = new ArrayList<>();
    }
    this.acceptedValues.add(acceptedValuesItem);
    return this;
  }

  /**
   * An Array representing the acceptable values for this field
   * @return acceptedValues
   */
  @javax.annotation.Nullable
  public List<String> getAcceptedValues() {
    return acceptedValues;
  }

  public void setAcceptedValues(List<String> acceptedValues) {
    this.acceptedValues = acceptedValues;
  }


  public MandateDataInputField documentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
    return this;
  }

  /**
   * An example of the content for this field
   * @return documentationLink
   */
  @javax.annotation.Nullable
  public String getDocumentationLink() {
    return documentationLink;
  }

  public void setDocumentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
  }


  public MandateDataInputField dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * The data type of this field.
   * @return dataType
   */
  @javax.annotation.Nullable
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public MandateDataInputField description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of this field
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public MandateDataInputField optionality(String optionality) {
    this.optionality = optionality;
    return this;
  }

  /**
   * Determines if the field if Required/Conditional/Optional or not required.
   * @return optionality
   */
  @javax.annotation.Nullable
  public String getOptionality() {
    return optionality;
  }

  public void setOptionality(String optionality) {
    this.optionality = optionality;
  }


  public MandateDataInputField cardinality(String cardinality) {
    this.cardinality = cardinality;
    return this;
  }

  /**
   * Represents the number of times an element can appear within the document
   * @return cardinality
   */
  @javax.annotation.Nullable
  public String getCardinality() {
    return cardinality;
  }

  public void setCardinality(String cardinality) {
    this.cardinality = cardinality;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateDataInputField mandateDataInputField = (MandateDataInputField) o;
    return Objects.equals(this.fieldId, mandateDataInputField.fieldId) &&
        Objects.equals(this.documentType, mandateDataInputField.documentType) &&
        Objects.equals(this.documentVersion, mandateDataInputField.documentVersion) &&
        Objects.equals(this.path, mandateDataInputField.path) &&
        Objects.equals(this.pathType, mandateDataInputField.pathType) &&
        Objects.equals(this.fieldName, mandateDataInputField.fieldName) &&
        Objects.equals(this.namespace, mandateDataInputField.namespace) &&
        Objects.equals(this.exampleOrFixedValue, mandateDataInputField.exampleOrFixedValue) &&
        Objects.equals(this.acceptedValues, mandateDataInputField.acceptedValues) &&
        Objects.equals(this.documentationLink, mandateDataInputField.documentationLink) &&
        Objects.equals(this.dataType, mandateDataInputField.dataType) &&
        Objects.equals(this.description, mandateDataInputField.description) &&
        Objects.equals(this.optionality, mandateDataInputField.optionality) &&
        Objects.equals(this.cardinality, mandateDataInputField.cardinality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, documentType, documentVersion, path, pathType, fieldName, namespace, exampleOrFixedValue, acceptedValues, documentationLink, dataType, description, optionality, cardinality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateDataInputField {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathType: ").append(toIndentedString(pathType)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    exampleOrFixedValue: ").append(toIndentedString(exampleOrFixedValue)).append("\n");
    sb.append("    acceptedValues: ").append(toIndentedString(acceptedValues)).append("\n");
    sb.append("    documentationLink: ").append(toIndentedString(documentationLink)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    optionality: ").append(toIndentedString(optionality)).append("\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
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
    openapiFields.add("fieldId");
    openapiFields.add("documentType");
    openapiFields.add("documentVersion");
    openapiFields.add("path");
    openapiFields.add("pathType");
    openapiFields.add("fieldName");
    openapiFields.add("namespace");
    openapiFields.add("exampleOrFixedValue");
    openapiFields.add("acceptedValues");
    openapiFields.add("documentationLink");
    openapiFields.add("dataType");
    openapiFields.add("description");
    openapiFields.add("optionality");
    openapiFields.add("cardinality");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MandateDataInputField
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MandateDataInputField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MandateDataInputField is not found in the empty JSON string", MandateDataInputField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MandateDataInputField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MandateDataInputField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fieldId") != null && !jsonObj.get("fieldId").isJsonNull()) && !jsonObj.get("fieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldId").toString()));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if ((jsonObj.get("documentVersion") != null && !jsonObj.get("documentVersion").isJsonNull()) && !jsonObj.get("documentVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentVersion").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("pathType") != null && !jsonObj.get("pathType").isJsonNull()) && !jsonObj.get("pathType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pathType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pathType").toString()));
      }
      if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull()) && !jsonObj.get("fieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldName").toString()));
      }
      // validate the optional field `namespace`
      if (jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) {
        MandateDataInputFieldNamespace.validateJsonElement(jsonObj.get("namespace"));
      }
      if ((jsonObj.get("exampleOrFixedValue") != null && !jsonObj.get("exampleOrFixedValue").isJsonNull()) && !jsonObj.get("exampleOrFixedValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exampleOrFixedValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exampleOrFixedValue").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("acceptedValues") != null && !jsonObj.get("acceptedValues").isJsonNull() && !jsonObj.get("acceptedValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptedValues` to be an array in the JSON string but got `%s`", jsonObj.get("acceptedValues").toString()));
      }
      if ((jsonObj.get("documentationLink") != null && !jsonObj.get("documentationLink").isJsonNull()) && !jsonObj.get("documentationLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentationLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentationLink").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("optionality") != null && !jsonObj.get("optionality").isJsonNull()) && !jsonObj.get("optionality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optionality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optionality").toString()));
      }
      if ((jsonObj.get("cardinality") != null && !jsonObj.get("cardinality").isJsonNull()) && !jsonObj.get("cardinality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardinality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardinality").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MandateDataInputField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MandateDataInputField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MandateDataInputField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MandateDataInputField.class));

       return (TypeAdapter<T>) new TypeAdapter<MandateDataInputField>() {
           @Override
           public void write(JsonWriter out, MandateDataInputField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MandateDataInputField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MandateDataInputField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MandateDataInputField
   * @throws IOException if the JSON string is invalid with respect to MandateDataInputField
   */
  public static MandateDataInputField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MandateDataInputField.class);
  }

  /**
   * Convert an instance of MandateDataInputField to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

