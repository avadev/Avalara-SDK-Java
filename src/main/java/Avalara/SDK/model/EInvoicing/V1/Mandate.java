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
import Avalara.SDK.model.EInvoicing.V1.InputDataFormats;
import Avalara.SDK.model.EInvoicing.V1.OutputDataFormats;
import Avalara.SDK.model.EInvoicing.V1.WorkflowIds;
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
 * Mandate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Mandate {
  public static final String SERIALIZED_NAME_MANDATE_ID = "mandateId";
  @SerializedName(SERIALIZED_NAME_MANDATE_ID)
  private String mandateId;

  public static final String SERIALIZED_NAME_COUNTRY_MANDATE = "countryMandate";
  @SerializedName(SERIALIZED_NAME_COUNTRY_MANDATE)
  private String countryMandate;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUPPORTED_BY_E_L_R_A_P_I = "supportedByELRAPI";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_BY_E_L_R_A_P_I)
  private Boolean supportedByELRAPI;

  public static final String SERIALIZED_NAME_MANDATE_FORMAT = "mandateFormat";
  @SerializedName(SERIALIZED_NAME_MANDATE_FORMAT)
  private String mandateFormat;

  public static final String SERIALIZED_NAME_E_INVOICING_FLOW = "eInvoicingFlow";
  @SerializedName(SERIALIZED_NAME_E_INVOICING_FLOW)
  private String eInvoicingFlow;

  public static final String SERIALIZED_NAME_E_INVOICING_FLOW_DOCUMENTATION_LINK = "eInvoicingFlowDocumentationLink";
  @SerializedName(SERIALIZED_NAME_E_INVOICING_FLOW_DOCUMENTATION_LINK)
  private String eInvoicingFlowDocumentationLink;

  public static final String SERIALIZED_NAME_GET_INVOICE_AVAILABLE_MEDIA_TYPE = "getInvoiceAvailableMediaType";
  @SerializedName(SERIALIZED_NAME_GET_INVOICE_AVAILABLE_MEDIA_TYPE)
  private List<String> getInvoiceAvailableMediaType;

  public static final String SERIALIZED_NAME_SUPPORTS_INBOUND_DIGITAL_DOCUMENT = "supportsInboundDigitalDocument";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_INBOUND_DIGITAL_DOCUMENT)
  private String supportsInboundDigitalDocument;

  public static final String SERIALIZED_NAME_INPUT_DATA_FORMATS = "inputDataFormats";
  @SerializedName(SERIALIZED_NAME_INPUT_DATA_FORMATS)
  private List<InputDataFormats> inputDataFormats;

  public static final String SERIALIZED_NAME_OUTPUT_DATA_FORMATS = "outputDataFormats";
  @SerializedName(SERIALIZED_NAME_OUTPUT_DATA_FORMATS)
  private List<OutputDataFormats> outputDataFormats;

  public static final String SERIALIZED_NAME_WORKFLOW_IDS = "workflowIds";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_IDS)
  private List<WorkflowIds> workflowIds;

  public Mandate() {
  }

  public Mandate mandateId(String mandateId) {
    this.mandateId = mandateId;
    return this;
  }

  /**
   * The &#x60;mandateId&#x60; is comprised of the country code, mandate type, and the network or regulation type (for example, AU-B2G-PEPPOL). Keep in mind the following when specifying a &#x60;mandateId&#x60;. - A country can have multiple mandate types (B2C, B2B, B2G). - A entity/company can opt in for multiple mandates. - A &#x60;mandateId&#x60; is the combination of country + mandate type + network/regulation.
   * @return mandateId
   */
  @javax.annotation.Nullable
  public String getMandateId() {
    return mandateId;
  }

  public void setMandateId(String mandateId) {
    this.mandateId = mandateId;
  }


  public Mandate countryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
    return this;
  }

  /**
   * **[LEGACY]** This field is retained for backward compatibility. It is recommended to use &#x60;mandateId&#x60; instead. The &#x60;countryMandate&#x60; similar to the &#x60;mandateId&#x60; is comprised of the country code, mandate type, and the network or regulation type (for example, AU-B2G-PEPPOL). 
   * @return countryMandate
   */
  @javax.annotation.Nullable
  public String getCountryMandate() {
    return countryMandate;
  }

  public void setCountryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
  }


  public Mandate countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Mandate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Mandate description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Mandate supportedByELRAPI(Boolean supportedByELRAPI) {
    this.supportedByELRAPI = supportedByELRAPI;
    return this;
  }

  /**
   * Indicates whether this mandate supported by the ELR API
   * @return supportedByELRAPI
   */
  @javax.annotation.Nullable
  public Boolean getSupportedByELRAPI() {
    return supportedByELRAPI;
  }

  public void setSupportedByELRAPI(Boolean supportedByELRAPI) {
    this.supportedByELRAPI = supportedByELRAPI;
  }


  public Mandate mandateFormat(String mandateFormat) {
    this.mandateFormat = mandateFormat;
    return this;
  }

  /**
   * Mandate format
   * @return mandateFormat
   */
  @javax.annotation.Nullable
  public String getMandateFormat() {
    return mandateFormat;
  }

  public void setMandateFormat(String mandateFormat) {
    this.mandateFormat = mandateFormat;
  }


  public Mandate eInvoicingFlow(String eInvoicingFlow) {
    this.eInvoicingFlow = eInvoicingFlow;
    return this;
  }

  /**
   * The type of e-invoicing flow for this mandate
   * @return eInvoicingFlow
   */
  @javax.annotation.Nullable
  public String geteInvoicingFlow() {
    return eInvoicingFlow;
  }

  public void seteInvoicingFlow(String eInvoicingFlow) {
    this.eInvoicingFlow = eInvoicingFlow;
  }


  public Mandate eInvoicingFlowDocumentationLink(String eInvoicingFlowDocumentationLink) {
    this.eInvoicingFlowDocumentationLink = eInvoicingFlowDocumentationLink;
    return this;
  }

  /**
   * Link to the documentation for this mandate&#39;s e-invoicing flow
   * @return eInvoicingFlowDocumentationLink
   */
  @javax.annotation.Nullable
  public String geteInvoicingFlowDocumentationLink() {
    return eInvoicingFlowDocumentationLink;
  }

  public void seteInvoicingFlowDocumentationLink(String eInvoicingFlowDocumentationLink) {
    this.eInvoicingFlowDocumentationLink = eInvoicingFlowDocumentationLink;
  }


  public Mandate getInvoiceAvailableMediaType(List<String> getInvoiceAvailableMediaType) {
    this.getInvoiceAvailableMediaType = getInvoiceAvailableMediaType;
    return this;
  }

  public Mandate addGetInvoiceAvailableMediaTypeItem(String getInvoiceAvailableMediaTypeItem) {
    if (this.getInvoiceAvailableMediaType == null) {
      this.getInvoiceAvailableMediaType = new ArrayList<>();
    }
    this.getInvoiceAvailableMediaType.add(getInvoiceAvailableMediaTypeItem);
    return this;
  }

  /**
   * List of available media types for downloading invoices for this mandate
   * @return getInvoiceAvailableMediaType
   */
  @javax.annotation.Nullable
  public List<String> getGetInvoiceAvailableMediaType() {
    return getInvoiceAvailableMediaType;
  }

  public void setGetInvoiceAvailableMediaType(List<String> getInvoiceAvailableMediaType) {
    this.getInvoiceAvailableMediaType = getInvoiceAvailableMediaType;
  }


  public Mandate supportsInboundDigitalDocument(String supportsInboundDigitalDocument) {
    this.supportsInboundDigitalDocument = supportsInboundDigitalDocument;
    return this;
  }

  /**
   * Indicates whether this mandate supports inbound digital documents
   * @return supportsInboundDigitalDocument
   */
  @javax.annotation.Nullable
  public String getSupportsInboundDigitalDocument() {
    return supportsInboundDigitalDocument;
  }

  public void setSupportsInboundDigitalDocument(String supportsInboundDigitalDocument) {
    this.supportsInboundDigitalDocument = supportsInboundDigitalDocument;
  }


  public Mandate inputDataFormats(List<InputDataFormats> inputDataFormats) {
    this.inputDataFormats = inputDataFormats;
    return this;
  }

  public Mandate addInputDataFormatsItem(InputDataFormats inputDataFormatsItem) {
    if (this.inputDataFormats == null) {
      this.inputDataFormats = new ArrayList<>();
    }
    this.inputDataFormats.add(inputDataFormatsItem);
    return this;
  }

  /**
   * Format and version used when inputting the data
   * @return inputDataFormats
   */
  @javax.annotation.Nullable
  public List<InputDataFormats> getInputDataFormats() {
    return inputDataFormats;
  }

  public void setInputDataFormats(List<InputDataFormats> inputDataFormats) {
    this.inputDataFormats = inputDataFormats;
  }


  public Mandate outputDataFormats(List<OutputDataFormats> outputDataFormats) {
    this.outputDataFormats = outputDataFormats;
    return this;
  }

  public Mandate addOutputDataFormatsItem(OutputDataFormats outputDataFormatsItem) {
    if (this.outputDataFormats == null) {
      this.outputDataFormats = new ArrayList<>();
    }
    this.outputDataFormats.add(outputDataFormatsItem);
    return this;
  }

  /**
   * Lists the supported output document formats for the country mandate. For countries where specifying an output document format is required (e.g., France), this array will contain the applicable formats. For other countries where output format selection is not necessary, the array will be empty.
   * @return outputDataFormats
   */
  @javax.annotation.Nullable
  public List<OutputDataFormats> getOutputDataFormats() {
    return outputDataFormats;
  }

  public void setOutputDataFormats(List<OutputDataFormats> outputDataFormats) {
    this.outputDataFormats = outputDataFormats;
  }


  public Mandate workflowIds(List<WorkflowIds> workflowIds) {
    this.workflowIds = workflowIds;
    return this;
  }

  public Mandate addWorkflowIdsItem(WorkflowIds workflowIdsItem) {
    if (this.workflowIds == null) {
      this.workflowIds = new ArrayList<>();
    }
    this.workflowIds.add(workflowIdsItem);
    return this;
  }

  /**
   * Workflow ID list
   * @return workflowIds
   */
  @javax.annotation.Nullable
  public List<WorkflowIds> getWorkflowIds() {
    return workflowIds;
  }

  public void setWorkflowIds(List<WorkflowIds> workflowIds) {
    this.workflowIds = workflowIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mandate mandate = (Mandate) o;
    return Objects.equals(this.mandateId, mandate.mandateId) &&
        Objects.equals(this.countryMandate, mandate.countryMandate) &&
        Objects.equals(this.countryCode, mandate.countryCode) &&
        Objects.equals(this.description, mandate.description) &&
        Objects.equals(this.supportedByELRAPI, mandate.supportedByELRAPI) &&
        Objects.equals(this.mandateFormat, mandate.mandateFormat) &&
        Objects.equals(this.eInvoicingFlow, mandate.eInvoicingFlow) &&
        Objects.equals(this.eInvoicingFlowDocumentationLink, mandate.eInvoicingFlowDocumentationLink) &&
        Objects.equals(this.getInvoiceAvailableMediaType, mandate.getInvoiceAvailableMediaType) &&
        Objects.equals(this.supportsInboundDigitalDocument, mandate.supportsInboundDigitalDocument) &&
        Objects.equals(this.inputDataFormats, mandate.inputDataFormats) &&
        Objects.equals(this.outputDataFormats, mandate.outputDataFormats) &&
        Objects.equals(this.workflowIds, mandate.workflowIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandateId, countryMandate, countryCode, description, supportedByELRAPI, mandateFormat, eInvoicingFlow, eInvoicingFlowDocumentationLink, getInvoiceAvailableMediaType, supportsInboundDigitalDocument, inputDataFormats, outputDataFormats, workflowIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandate {\n");
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    countryMandate: ").append(toIndentedString(countryMandate)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    supportedByELRAPI: ").append(toIndentedString(supportedByELRAPI)).append("\n");
    sb.append("    mandateFormat: ").append(toIndentedString(mandateFormat)).append("\n");
    sb.append("    eInvoicingFlow: ").append(toIndentedString(eInvoicingFlow)).append("\n");
    sb.append("    eInvoicingFlowDocumentationLink: ").append(toIndentedString(eInvoicingFlowDocumentationLink)).append("\n");
    sb.append("    getInvoiceAvailableMediaType: ").append(toIndentedString(getInvoiceAvailableMediaType)).append("\n");
    sb.append("    supportsInboundDigitalDocument: ").append(toIndentedString(supportsInboundDigitalDocument)).append("\n");
    sb.append("    inputDataFormats: ").append(toIndentedString(inputDataFormats)).append("\n");
    sb.append("    outputDataFormats: ").append(toIndentedString(outputDataFormats)).append("\n");
    sb.append("    workflowIds: ").append(toIndentedString(workflowIds)).append("\n");
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
    openapiFields.add("mandateId");
    openapiFields.add("countryMandate");
    openapiFields.add("countryCode");
    openapiFields.add("description");
    openapiFields.add("supportedByELRAPI");
    openapiFields.add("mandateFormat");
    openapiFields.add("eInvoicingFlow");
    openapiFields.add("eInvoicingFlowDocumentationLink");
    openapiFields.add("getInvoiceAvailableMediaType");
    openapiFields.add("supportsInboundDigitalDocument");
    openapiFields.add("inputDataFormats");
    openapiFields.add("outputDataFormats");
    openapiFields.add("workflowIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Mandate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Mandate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Mandate is not found in the empty JSON string", Mandate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Mandate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Mandate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("mandateId") != null && !jsonObj.get("mandateId").isJsonNull()) && !jsonObj.get("mandateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mandateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mandateId").toString()));
      }
      if ((jsonObj.get("countryMandate") != null && !jsonObj.get("countryMandate").isJsonNull()) && !jsonObj.get("countryMandate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryMandate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryMandate").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("mandateFormat") != null && !jsonObj.get("mandateFormat").isJsonNull()) && !jsonObj.get("mandateFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mandateFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mandateFormat").toString()));
      }
      if ((jsonObj.get("eInvoicingFlow") != null && !jsonObj.get("eInvoicingFlow").isJsonNull()) && !jsonObj.get("eInvoicingFlow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eInvoicingFlow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eInvoicingFlow").toString()));
      }
      if ((jsonObj.get("eInvoicingFlowDocumentationLink") != null && !jsonObj.get("eInvoicingFlowDocumentationLink").isJsonNull()) && !jsonObj.get("eInvoicingFlowDocumentationLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eInvoicingFlowDocumentationLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eInvoicingFlowDocumentationLink").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("getInvoiceAvailableMediaType") != null && !jsonObj.get("getInvoiceAvailableMediaType").isJsonNull() && !jsonObj.get("getInvoiceAvailableMediaType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `getInvoiceAvailableMediaType` to be an array in the JSON string but got `%s`", jsonObj.get("getInvoiceAvailableMediaType").toString()));
      }
      if ((jsonObj.get("supportsInboundDigitalDocument") != null && !jsonObj.get("supportsInboundDigitalDocument").isJsonNull()) && !jsonObj.get("supportsInboundDigitalDocument").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportsInboundDigitalDocument` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportsInboundDigitalDocument").toString()));
      }
      if (jsonObj.get("inputDataFormats") != null && !jsonObj.get("inputDataFormats").isJsonNull()) {
        JsonArray jsonArrayinputDataFormats = jsonObj.getAsJsonArray("inputDataFormats");
        if (jsonArrayinputDataFormats != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inputDataFormats").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inputDataFormats` to be an array in the JSON string but got `%s`", jsonObj.get("inputDataFormats").toString()));
          }

          // validate the optional field `inputDataFormats` (array)
          for (int i = 0; i < jsonArrayinputDataFormats.size(); i++) {
            InputDataFormats.validateJsonElement(jsonArrayinputDataFormats.get(i));
          };
        }
      }
      if (jsonObj.get("outputDataFormats") != null && !jsonObj.get("outputDataFormats").isJsonNull()) {
        JsonArray jsonArrayoutputDataFormats = jsonObj.getAsJsonArray("outputDataFormats");
        if (jsonArrayoutputDataFormats != null) {
          // ensure the json data is an array
          if (!jsonObj.get("outputDataFormats").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `outputDataFormats` to be an array in the JSON string but got `%s`", jsonObj.get("outputDataFormats").toString()));
          }

          // validate the optional field `outputDataFormats` (array)
          for (int i = 0; i < jsonArrayoutputDataFormats.size(); i++) {
            OutputDataFormats.validateJsonElement(jsonArrayoutputDataFormats.get(i));
          };
        }
      }
      if (jsonObj.get("workflowIds") != null && !jsonObj.get("workflowIds").isJsonNull()) {
        JsonArray jsonArrayworkflowIds = jsonObj.getAsJsonArray("workflowIds");
        if (jsonArrayworkflowIds != null) {
          // ensure the json data is an array
          if (!jsonObj.get("workflowIds").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `workflowIds` to be an array in the JSON string but got `%s`", jsonObj.get("workflowIds").toString()));
          }

          // validate the optional field `workflowIds` (array)
          for (int i = 0; i < jsonArrayworkflowIds.size(); i++) {
            WorkflowIds.validateJsonElement(jsonArrayworkflowIds.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Mandate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Mandate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Mandate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Mandate.class));

       return (TypeAdapter<T>) new TypeAdapter<Mandate>() {
           @Override
           public void write(JsonWriter out, Mandate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Mandate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Mandate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Mandate
   * @throws IOException if the JSON string is invalid with respect to Mandate
   */
  public static Mandate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Mandate.class);
  }

  /**
   * Convert an instance of Mandate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

