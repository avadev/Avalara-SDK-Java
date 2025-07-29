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
import Avalara.SDK.model.EInvoicing.V1.ValidationError;
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
 * Represents detailed error information for an individual entry in a batch request. Includes the index of the failed item and associated validation errors.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class BatchErrorDetail {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<ValidationError> validationErrors;

  public BatchErrorDetail() {
  }

  public BatchErrorDetail index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The index of the request that caused the error in the batch.
   * @return index
   */
  @javax.annotation.Nullable
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  public BatchErrorDetail validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public BatchErrorDetail addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Get validationErrors
   * @return validationErrors
   */
  @javax.annotation.Nullable
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchErrorDetail batchErrorDetail = (BatchErrorDetail) o;
    return Objects.equals(this.index, batchErrorDetail.index) &&
        Objects.equals(this.validationErrors, batchErrorDetail.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchErrorDetail {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
    openapiFields.add("index");
    openapiFields.add("validationErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BatchErrorDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchErrorDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchErrorDetail is not found in the empty JSON string", BatchErrorDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchErrorDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchErrorDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("validationErrors") != null && !jsonObj.get("validationErrors").isJsonNull()) {
        JsonArray jsonArrayvalidationErrors = jsonObj.getAsJsonArray("validationErrors");
        if (jsonArrayvalidationErrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("validationErrors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `validationErrors` to be an array in the JSON string but got `%s`", jsonObj.get("validationErrors").toString()));
          }

          // validate the optional field `validationErrors` (array)
          for (int i = 0; i < jsonArrayvalidationErrors.size(); i++) {
            ValidationError.validateJsonElement(jsonArrayvalidationErrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchErrorDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchErrorDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchErrorDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchErrorDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchErrorDetail>() {
           @Override
           public void write(JsonWriter out, BatchErrorDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchErrorDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchErrorDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchErrorDetail
   * @throws IOException if the JSON string is invalid with respect to BatchErrorDetail
   */
  public static BatchErrorDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchErrorDetail.class);
  }

  /**
   * Convert an instance of BatchErrorDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

