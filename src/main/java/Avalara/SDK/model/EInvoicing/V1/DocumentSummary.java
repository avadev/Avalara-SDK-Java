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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * Displays a summary of information about the document
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class DocumentSummary {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROCESS_DATE_TIME = "processDateTime";
  @SerializedName(SERIALIZED_NAME_PROCESS_DATE_TIME)
  private String processDateTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUPPLIER_NAME = "supplierName";
  @SerializedName(SERIALIZED_NAME_SUPPLIER_NAME)
  private String supplierName;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customerName";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_DOCUMENT_VERSION = "documentVersion";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_VERSION)
  private String documentVersion;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "documentNumber";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  private String documentNumber;

  public static final String SERIALIZED_NAME_DOCUMENT_DATE = "documentDate";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_DATE)
  private String documentDate;

  public static final String SERIALIZED_NAME_FLOW = "flow";
  @SerializedName(SERIALIZED_NAME_FLOW)
  private String flow;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_COUNTRY_MANDATE = "countryMandate";
  @SerializedName(SERIALIZED_NAME_COUNTRY_MANDATE)
  private String countryMandate;

  public static final String SERIALIZED_NAME_INTERFACE = "interface";
  @SerializedName(SERIALIZED_NAME_INTERFACE)
  private String _interface;

  public static final String SERIALIZED_NAME_RECEIVER = "receiver";
  @SerializedName(SERIALIZED_NAME_RECEIVER)
  private String receiver;

  public DocumentSummary() {
  }

  public DocumentSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID for this document
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public DocumentSummary processDateTime(String processDateTime) {
    this.processDateTime = processDateTime;
    return this;
  }

  /**
   * The date and time when the document was processed, displayed in the format YYYY-MM-DDThh:mm:ss
   * @return processDateTime
   */
  @javax.annotation.Nullable
  public String getProcessDateTime() {
    return processDateTime;
  }

  public void setProcessDateTime(String processDateTime) {
    this.processDateTime = processDateTime;
  }


  public DocumentSummary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The Document status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public DocumentSummary supplierName(String supplierName) {
    this.supplierName = supplierName;
    return this;
  }

  /**
   * The name of the supplier in the transaction
   * @return supplierName
   */
  @javax.annotation.Nullable
  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }


  public DocumentSummary customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * The name of the customer in the transaction
   * @return customerName
   */
  @javax.annotation.Nullable
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public DocumentSummary documentType(String documentType) {
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


  public DocumentSummary documentVersion(String documentVersion) {
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


  public DocumentSummary documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * The document number
   * @return documentNumber
   */
  @javax.annotation.Nullable
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public DocumentSummary documentDate(String documentDate) {
    this.documentDate = documentDate;
    return this;
  }

  /**
   * The document issue date
   * @return documentDate
   */
  @javax.annotation.Nullable
  public String getDocumentDate() {
    return documentDate;
  }

  public void setDocumentDate(String documentDate) {
    this.documentDate = documentDate;
  }


  public DocumentSummary flow(String flow) {
    this.flow = flow;
    return this;
  }

  /**
   * The document direction, where issued &#x3D; &#x60;out&#x60; and received &#x3D; &#x60;in&#x60;
   * @return flow
   */
  @javax.annotation.Nullable
  public String getFlow() {
    return flow;
  }

  public void setFlow(String flow) {
    this.flow = flow;
  }


  public DocumentSummary countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The two-letter ISO-3166 country code for the country where the document is being submitted
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public DocumentSummary countryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
    return this;
  }

  /**
   * The e-invoicing mandate for the specified country
   * @return countryMandate
   */
  @javax.annotation.Nullable
  public String getCountryMandate() {
    return countryMandate;
  }

  public void setCountryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
  }


  public DocumentSummary _interface(String _interface) {
    this._interface = _interface;
    return this;
  }

  /**
   * The interface where the document is sent
   * @return _interface
   */
  @javax.annotation.Nullable
  public String getInterface() {
    return _interface;
  }

  public void setInterface(String _interface) {
    this._interface = _interface;
  }


  public DocumentSummary receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

  /**
   * The document recipient based on the interface
   * @return receiver
   */
  @javax.annotation.Nullable
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentSummary documentSummary = (DocumentSummary) o;
    return Objects.equals(this.id, documentSummary.id) &&
        Objects.equals(this.processDateTime, documentSummary.processDateTime) &&
        Objects.equals(this.status, documentSummary.status) &&
        Objects.equals(this.supplierName, documentSummary.supplierName) &&
        Objects.equals(this.customerName, documentSummary.customerName) &&
        Objects.equals(this.documentType, documentSummary.documentType) &&
        Objects.equals(this.documentVersion, documentSummary.documentVersion) &&
        Objects.equals(this.documentNumber, documentSummary.documentNumber) &&
        Objects.equals(this.documentDate, documentSummary.documentDate) &&
        Objects.equals(this.flow, documentSummary.flow) &&
        Objects.equals(this.countryCode, documentSummary.countryCode) &&
        Objects.equals(this.countryMandate, documentSummary.countryMandate) &&
        Objects.equals(this._interface, documentSummary._interface) &&
        Objects.equals(this.receiver, documentSummary.receiver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processDateTime, status, supplierName, customerName, documentType, documentVersion, documentNumber, documentDate, flow, countryCode, countryMandate, _interface, receiver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDateTime: ").append(toIndentedString(processDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supplierName: ").append(toIndentedString(supplierName)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    documentDate: ").append(toIndentedString(documentDate)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryMandate: ").append(toIndentedString(countryMandate)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
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
    openapiFields.add("processDateTime");
    openapiFields.add("status");
    openapiFields.add("supplierName");
    openapiFields.add("customerName");
    openapiFields.add("documentType");
    openapiFields.add("documentVersion");
    openapiFields.add("documentNumber");
    openapiFields.add("documentDate");
    openapiFields.add("flow");
    openapiFields.add("countryCode");
    openapiFields.add("countryMandate");
    openapiFields.add("interface");
    openapiFields.add("receiver");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentSummary is not found in the empty JSON string", DocumentSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("processDateTime") != null && !jsonObj.get("processDateTime").isJsonNull()) && !jsonObj.get("processDateTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processDateTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processDateTime").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("supplierName") != null && !jsonObj.get("supplierName").isJsonNull()) && !jsonObj.get("supplierName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplierName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supplierName").toString()));
      }
      if ((jsonObj.get("customerName") != null && !jsonObj.get("customerName").isJsonNull()) && !jsonObj.get("customerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerName").toString()));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if ((jsonObj.get("documentVersion") != null && !jsonObj.get("documentVersion").isJsonNull()) && !jsonObj.get("documentVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentVersion").toString()));
      }
      if ((jsonObj.get("documentNumber") != null && !jsonObj.get("documentNumber").isJsonNull()) && !jsonObj.get("documentNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentNumber").toString()));
      }
      if ((jsonObj.get("documentDate") != null && !jsonObj.get("documentDate").isJsonNull()) && !jsonObj.get("documentDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentDate").toString()));
      }
      if ((jsonObj.get("flow") != null && !jsonObj.get("flow").isJsonNull()) && !jsonObj.get("flow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("countryMandate") != null && !jsonObj.get("countryMandate").isJsonNull()) && !jsonObj.get("countryMandate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryMandate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryMandate").toString()));
      }
      if ((jsonObj.get("interface") != null && !jsonObj.get("interface").isJsonNull()) && !jsonObj.get("interface").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interface` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interface").toString()));
      }
      if ((jsonObj.get("receiver") != null && !jsonObj.get("receiver").isJsonNull()) && !jsonObj.get("receiver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiver").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentSummary>() {
           @Override
           public void write(JsonWriter out, DocumentSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentSummary
   * @throws IOException if the JSON string is invalid with respect to DocumentSummary
   */
  public static DocumentSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentSummary.class);
  }

  /**
   * Convert an instance of DocumentSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

