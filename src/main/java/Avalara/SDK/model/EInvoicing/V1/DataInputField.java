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
import Avalara.SDK.model.EInvoicing.V1.ConditionalForField;
import Avalara.SDK.model.EInvoicing.V1.DataInputFieldNotUsedFor;
import Avalara.SDK.model.EInvoicing.V1.DataInputFieldOptionalFor;
import Avalara.SDK.model.EInvoicing.V1.DataInputFieldRequiredFor;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DataInputField {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId;

  public static final String SERIALIZED_NAME_APPLICABLE_DOCUMENT_ROOTS = "applicableDocumentRoots";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_DOCUMENT_ROOTS)
  private List<Object> applicableDocumentRoots;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_NAME_SPACE = "nameSpace";
  @SerializedName(SERIALIZED_NAME_NAME_SPACE)
  private String nameSpace;

  public static final String SERIALIZED_NAME_FIELD_NAME = "fieldName";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_EXAMPLE_OR_FIXED_VALUE = "exampleOrFixedValue";
  @SerializedName(SERIALIZED_NAME_EXAMPLE_OR_FIXED_VALUE)
  private String exampleOrFixedValue;

  public static final String SERIALIZED_NAME_ACCEPTED_VALUES = "acceptedValues";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_VALUES)
  private Object acceptedValues;

  public static final String SERIALIZED_NAME_DOCUMENTATION_LINK = "documentationLink";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATION_LINK)
  private String documentationLink;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_SEGMENT = "isSegment";
  @SerializedName(SERIALIZED_NAME_IS_SEGMENT)
  private Boolean isSegment;

  public static final String SERIALIZED_NAME_REQUIRED_FOR = "requiredFor";
  @SerializedName(SERIALIZED_NAME_REQUIRED_FOR)
  private DataInputFieldRequiredFor requiredFor;

  public static final String SERIALIZED_NAME_CONDITIONAL_FOR = "conditionalFor";
  @SerializedName(SERIALIZED_NAME_CONDITIONAL_FOR)
  private List<ConditionalForField> conditionalFor;

  public static final String SERIALIZED_NAME_NOT_USED_FOR = "notUsedFor";
  @SerializedName(SERIALIZED_NAME_NOT_USED_FOR)
  private DataInputFieldNotUsedFor notUsedFor;

  public static final String SERIALIZED_NAME_OPTIONAL_FOR = "optionalFor";
  @SerializedName(SERIALIZED_NAME_OPTIONAL_FOR)
  private DataInputFieldOptionalFor optionalFor;

  public DataInputField() {
  }

  public DataInputField id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Field UUID
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public DataInputField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Field ID
   * @return fieldId
  **/
  @javax.annotation.Nullable
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  public DataInputField applicableDocumentRoots(List<Object> applicableDocumentRoots) {
    this.applicableDocumentRoots = applicableDocumentRoots;
    return this;
  }

  public DataInputField addApplicableDocumentRootsItem(Object applicableDocumentRootsItem) {
    if (this.applicableDocumentRoots == null) {
      this.applicableDocumentRoots = new ArrayList<>();
    }
    this.applicableDocumentRoots.add(applicableDocumentRootsItem);
    return this;
  }

   /**
   * Get applicableDocumentRoots
   * @return applicableDocumentRoots
  **/
  @javax.annotation.Nullable
  public List<Object> getApplicableDocumentRoots() {
    return applicableDocumentRoots;
  }

  public void setApplicableDocumentRoots(List<Object> applicableDocumentRoots) {
    this.applicableDocumentRoots = applicableDocumentRoots;
  }


  public DataInputField path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path to this field
   * @return path
  **/
  @javax.annotation.Nullable
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public DataInputField nameSpace(String nameSpace) {
    this.nameSpace = nameSpace;
    return this;
  }

   /**
   * Namespace of this field
   * @return nameSpace
  **/
  @javax.annotation.Nullable
  public String getNameSpace() {
    return nameSpace;
  }

  public void setNameSpace(String nameSpace) {
    this.nameSpace = nameSpace;
  }


  public DataInputField fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Field name
   * @return fieldName
  **/
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public DataInputField exampleOrFixedValue(String exampleOrFixedValue) {
    this.exampleOrFixedValue = exampleOrFixedValue;
    return this;
  }

   /**
   * An example of the content for this field
   * @return exampleOrFixedValue
  **/
  @javax.annotation.Nullable
  public String getExampleOrFixedValue() {
    return exampleOrFixedValue;
  }

  public void setExampleOrFixedValue(String exampleOrFixedValue) {
    this.exampleOrFixedValue = exampleOrFixedValue;
  }


  public DataInputField acceptedValues(Object acceptedValues) {
    this.acceptedValues = acceptedValues;
    return this;
  }

   /**
   * An object representing the acceptable values for this field
   * @return acceptedValues
  **/
  @javax.annotation.Nullable
  public Object getAcceptedValues() {
    return acceptedValues;
  }

  public void setAcceptedValues(Object acceptedValues) {
    this.acceptedValues = acceptedValues;
  }


  public DataInputField documentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
    return this;
  }

   /**
   * An example of the content for this field
   * @return documentationLink
  **/
  @javax.annotation.Nullable
  public String getDocumentationLink() {
    return documentationLink;
  }

  public void setDocumentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
  }


  public DataInputField description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of this field
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public DataInputField isSegment(Boolean isSegment) {
    this.isSegment = isSegment;
    return this;
  }

   /**
   * Is this a segment of the schema
   * @return isSegment
  **/
  @javax.annotation.Nullable
  public Boolean getIsSegment() {
    return isSegment;
  }

  public void setIsSegment(Boolean isSegment) {
    this.isSegment = isSegment;
  }


  public DataInputField requiredFor(DataInputFieldRequiredFor requiredFor) {
    this.requiredFor = requiredFor;
    return this;
  }

   /**
   * Get requiredFor
   * @return requiredFor
  **/
  @javax.annotation.Nullable
  public DataInputFieldRequiredFor getRequiredFor() {
    return requiredFor;
  }

  public void setRequiredFor(DataInputFieldRequiredFor requiredFor) {
    this.requiredFor = requiredFor;
  }


  public DataInputField conditionalFor(List<ConditionalForField> conditionalFor) {
    this.conditionalFor = conditionalFor;
    return this;
  }

  public DataInputField addConditionalForItem(ConditionalForField conditionalForItem) {
    if (this.conditionalFor == null) {
      this.conditionalFor = new ArrayList<>();
    }
    this.conditionalFor.add(conditionalForItem);
    return this;
  }

   /**
   * Get conditionalFor
   * @return conditionalFor
  **/
  @javax.annotation.Nullable
  public List<ConditionalForField> getConditionalFor() {
    return conditionalFor;
  }

  public void setConditionalFor(List<ConditionalForField> conditionalFor) {
    this.conditionalFor = conditionalFor;
  }


  public DataInputField notUsedFor(DataInputFieldNotUsedFor notUsedFor) {
    this.notUsedFor = notUsedFor;
    return this;
  }

   /**
   * Get notUsedFor
   * @return notUsedFor
  **/
  @javax.annotation.Nullable
  public DataInputFieldNotUsedFor getNotUsedFor() {
    return notUsedFor;
  }

  public void setNotUsedFor(DataInputFieldNotUsedFor notUsedFor) {
    this.notUsedFor = notUsedFor;
  }


  public DataInputField optionalFor(DataInputFieldOptionalFor optionalFor) {
    this.optionalFor = optionalFor;
    return this;
  }

   /**
   * Get optionalFor
   * @return optionalFor
  **/
  @javax.annotation.Nullable
  public DataInputFieldOptionalFor getOptionalFor() {
    return optionalFor;
  }

  public void setOptionalFor(DataInputFieldOptionalFor optionalFor) {
    this.optionalFor = optionalFor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataInputField dataInputField = (DataInputField) o;
    return Objects.equals(this.id, dataInputField.id) &&
        Objects.equals(this.fieldId, dataInputField.fieldId) &&
        Objects.equals(this.applicableDocumentRoots, dataInputField.applicableDocumentRoots) &&
        Objects.equals(this.path, dataInputField.path) &&
        Objects.equals(this.nameSpace, dataInputField.nameSpace) &&
        Objects.equals(this.fieldName, dataInputField.fieldName) &&
        Objects.equals(this.exampleOrFixedValue, dataInputField.exampleOrFixedValue) &&
        Objects.equals(this.acceptedValues, dataInputField.acceptedValues) &&
        Objects.equals(this.documentationLink, dataInputField.documentationLink) &&
        Objects.equals(this.description, dataInputField.description) &&
        Objects.equals(this.isSegment, dataInputField.isSegment) &&
        Objects.equals(this.requiredFor, dataInputField.requiredFor) &&
        Objects.equals(this.conditionalFor, dataInputField.conditionalFor) &&
        Objects.equals(this.notUsedFor, dataInputField.notUsedFor) &&
        Objects.equals(this.optionalFor, dataInputField.optionalFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fieldId, applicableDocumentRoots, path, nameSpace, fieldName, exampleOrFixedValue, acceptedValues, documentationLink, description, isSegment, requiredFor, conditionalFor, notUsedFor, optionalFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataInputField {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    applicableDocumentRoots: ").append(toIndentedString(applicableDocumentRoots)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    nameSpace: ").append(toIndentedString(nameSpace)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    exampleOrFixedValue: ").append(toIndentedString(exampleOrFixedValue)).append("\n");
    sb.append("    acceptedValues: ").append(toIndentedString(acceptedValues)).append("\n");
    sb.append("    documentationLink: ").append(toIndentedString(documentationLink)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isSegment: ").append(toIndentedString(isSegment)).append("\n");
    sb.append("    requiredFor: ").append(toIndentedString(requiredFor)).append("\n");
    sb.append("    conditionalFor: ").append(toIndentedString(conditionalFor)).append("\n");
    sb.append("    notUsedFor: ").append(toIndentedString(notUsedFor)).append("\n");
    sb.append("    optionalFor: ").append(toIndentedString(optionalFor)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("fieldId");
    openapiFields.add("applicableDocumentRoots");
    openapiFields.add("path");
    openapiFields.add("nameSpace");
    openapiFields.add("fieldName");
    openapiFields.add("exampleOrFixedValue");
    openapiFields.add("acceptedValues");
    openapiFields.add("documentationLink");
    openapiFields.add("description");
    openapiFields.add("isSegment");
    openapiFields.add("requiredFor");
    openapiFields.add("conditionalFor");
    openapiFields.add("notUsedFor");
    openapiFields.add("optionalFor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataInputField
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataInputField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataInputField is not found in the empty JSON string", DataInputField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataInputField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataInputField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("fieldId") != null && !jsonObj.get("fieldId").isJsonNull()) && !jsonObj.get("fieldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("applicableDocumentRoots") != null && !jsonObj.get("applicableDocumentRoots").isJsonNull() && !jsonObj.get("applicableDocumentRoots").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicableDocumentRoots` to be an array in the JSON string but got `%s`", jsonObj.get("applicableDocumentRoots").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("nameSpace") != null && !jsonObj.get("nameSpace").isJsonNull()) && !jsonObj.get("nameSpace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameSpace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameSpace").toString()));
      }
      if ((jsonObj.get("fieldName") != null && !jsonObj.get("fieldName").isJsonNull()) && !jsonObj.get("fieldName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldName").toString()));
      }
      if ((jsonObj.get("exampleOrFixedValue") != null && !jsonObj.get("exampleOrFixedValue").isJsonNull()) && !jsonObj.get("exampleOrFixedValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exampleOrFixedValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exampleOrFixedValue").toString()));
      }
      if ((jsonObj.get("documentationLink") != null && !jsonObj.get("documentationLink").isJsonNull()) && !jsonObj.get("documentationLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentationLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentationLink").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `requiredFor`
      if (jsonObj.get("requiredFor") != null && !jsonObj.get("requiredFor").isJsonNull()) {
        DataInputFieldRequiredFor.validateJsonElement(jsonObj.get("requiredFor"));
      }
      if (jsonObj.get("conditionalFor") != null && !jsonObj.get("conditionalFor").isJsonNull()) {
        JsonArray jsonArrayconditionalFor = jsonObj.getAsJsonArray("conditionalFor");
        if (jsonArrayconditionalFor != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditionalFor").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditionalFor` to be an array in the JSON string but got `%s`", jsonObj.get("conditionalFor").toString()));
          }

          // validate the optional field `conditionalFor` (array)
          for (int i = 0; i < jsonArrayconditionalFor.size(); i++) {
            ConditionalForField.validateJsonElement(jsonArrayconditionalFor.get(i));
          };
        }
      }
      // validate the optional field `notUsedFor`
      if (jsonObj.get("notUsedFor") != null && !jsonObj.get("notUsedFor").isJsonNull()) {
        DataInputFieldNotUsedFor.validateJsonElement(jsonObj.get("notUsedFor"));
      }
      // validate the optional field `optionalFor`
      if (jsonObj.get("optionalFor") != null && !jsonObj.get("optionalFor").isJsonNull()) {
        DataInputFieldOptionalFor.validateJsonElement(jsonObj.get("optionalFor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataInputField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataInputField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataInputField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataInputField.class));

       return (TypeAdapter<T>) new TypeAdapter<DataInputField>() {
           @Override
           public void write(JsonWriter out, DataInputField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataInputField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataInputField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataInputField
  * @throws IOException if the JSON string is invalid with respect to DataInputField
  */
  public static DataInputField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataInputField.class);
  }

 /**
  * Convert an instance of DataInputField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

