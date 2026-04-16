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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Represents a single report with full details including metadata and associated transaction IDs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ReportItem {
  public static final String SERIALIZED_NAME_REPORT_ID = "reportId";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private String reportId;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_REPORT_GENERATE_DATE = "reportGenerateDate";
  @SerializedName(SERIALIZED_NAME_REPORT_GENERATE_DATE)
  private OffsetDateTime reportGenerateDate;

  public static final String SERIALIZED_NAME_REPORT_FROM = "reportFrom";
  @SerializedName(SERIALIZED_NAME_REPORT_FROM)
  private LocalDate reportFrom;

  public static final String SERIALIZED_NAME_REPORT_TO = "reportTo";
  @SerializedName(SERIALIZED_NAME_REPORT_TO)
  private LocalDate reportTo;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_COUNTRY_MANDATE = "countryMandate";
  @SerializedName(SERIALIZED_NAME_COUNTRY_MANDATE)
  private String countryMandate;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private String documentType;

  public static final String SERIALIZED_NAME_DOCUMENT_SUB_TYPE = "documentSubType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_SUB_TYPE)
  private String documentSubType;

  public static final String SERIALIZED_NAME_REPORT_REFERENCE = "reportReference";
  @SerializedName(SERIALIZED_NAME_REPORT_REFERENCE)
  private String reportReference;

  public static final String SERIALIZED_NAME_REPORT_NAME = "reportName";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private String reportName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_REPORT_FORMAT_MIMETYPES = "reportFormatMimetypes";
  @SerializedName(SERIALIZED_NAME_REPORT_FORMAT_MIMETYPES)
  private String reportFormatMimetypes;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_TA_NAME = "taName";
  @SerializedName(SERIALIZED_NAME_TA_NAME)
  private String taName;

  public static final String SERIALIZED_NAME_TAX_INVOICE_AMOUNT = "taxInvoiceAmount";
  @SerializedName(SERIALIZED_NAME_TAX_INVOICE_AMOUNT)
  private BigDecimal taxInvoiceAmount;

  public static final String SERIALIZED_NAME_TOTAL_TAX_AMOUNT = "totalTaxAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX_AMOUNT)
  private BigDecimal totalTaxAmount;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_TRANSACTION_IDS = "transactionIds";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_IDS)
  private List<String> transactionIds;

  public ReportItem() {
  }

  public ReportItem reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * The unique ID for this report.
   * @return reportId
   */
  @javax.annotation.Nullable
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  public ReportItem jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * The unique ID of the job that generated this report.
   * @return jobId
   */
  @javax.annotation.Nullable
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public ReportItem reportGenerateDate(OffsetDateTime reportGenerateDate) {
    this.reportGenerateDate = reportGenerateDate;
    return this;
  }

  /**
   * The date and time when the report was generated.
   * @return reportGenerateDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getReportGenerateDate() {
    return reportGenerateDate;
  }

  public void setReportGenerateDate(OffsetDateTime reportGenerateDate) {
    this.reportGenerateDate = reportGenerateDate;
  }


  public ReportItem reportFrom(LocalDate reportFrom) {
    this.reportFrom = reportFrom;
    return this;
  }

  /**
   * The start date of the reporting period.
   * @return reportFrom
   */
  @javax.annotation.Nullable
  public LocalDate getReportFrom() {
    return reportFrom;
  }

  public void setReportFrom(LocalDate reportFrom) {
    this.reportFrom = reportFrom;
  }


  public ReportItem reportTo(LocalDate reportTo) {
    this.reportTo = reportTo;
    return this;
  }

  /**
   * The end date of the reporting period.
   * @return reportTo
   */
  @javax.annotation.Nullable
  public LocalDate getReportTo() {
    return reportTo;
  }

  public void setReportTo(LocalDate reportTo) {
    this.reportTo = reportTo;
  }


  public ReportItem countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The two-letter ISO-3166 country code for which this report was generated.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public ReportItem countryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
    return this;
  }

  /**
   * The e-invoicing mandate for the specified country.
   * @return countryMandate
   */
  @javax.annotation.Nullable
  public String getCountryMandate() {
    return countryMandate;
  }

  public void setCountryMandate(String countryMandate) {
    this.countryMandate = countryMandate;
  }


  public ReportItem documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * The type of document covered by this report.
   * @return documentType
   */
  @javax.annotation.Nullable
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }


  public ReportItem documentSubType(String documentSubType) {
    this.documentSubType = documentSubType;
    return this;
  }

  /**
   * The sub-type of the document.
   * @return documentSubType
   */
  @javax.annotation.Nullable
  public String getDocumentSubType() {
    return documentSubType;
  }

  public void setDocumentSubType(String documentSubType) {
    this.documentSubType = documentSubType;
  }


  public ReportItem reportReference(String reportReference) {
    this.reportReference = reportReference;
    return this;
  }

  /**
   * An internal reference path for the report.
   * @return reportReference
   */
  @javax.annotation.Nullable
  public String getReportReference() {
    return reportReference;
  }

  public void setReportReference(String reportReference) {
    this.reportReference = reportReference;
  }


  public ReportItem reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * The name of the report file.
   * @return reportName
   */
  @javax.annotation.Nullable
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }


  public ReportItem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of the report. Possible values include: PENDING, PROCESSING, COMPLETED, FAILED, SENT_TO_PPF, ERROR.
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public ReportItem reportFormatMimetypes(String reportFormatMimetypes) {
    this.reportFormatMimetypes = reportFormatMimetypes;
    return this;
  }

  /**
   * The MIME type of the report file.
   * @return reportFormatMimetypes
   */
  @javax.annotation.Nullable
  public String getReportFormatMimetypes() {
    return reportFormatMimetypes;
  }

  public void setReportFormatMimetypes(String reportFormatMimetypes) {
    this.reportFormatMimetypes = reportFormatMimetypes;
  }


  public ReportItem tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant identifier associated with this report.
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public ReportItem taName(String taName) {
    this.taName = taName;
    return this;
  }

  /**
   * The name of the tax authority for this report.
   * @return taName
   */
  @javax.annotation.Nullable
  public String getTaName() {
    return taName;
  }

  public void setTaName(String taName) {
    this.taName = taName;
  }


  public ReportItem taxInvoiceAmount(BigDecimal taxInvoiceAmount) {
    this.taxInvoiceAmount = taxInvoiceAmount;
    return this;
  }

  /**
   * The total invoice amount covered by this report.
   * @return taxInvoiceAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getTaxInvoiceAmount() {
    return taxInvoiceAmount;
  }

  public void setTaxInvoiceAmount(BigDecimal taxInvoiceAmount) {
    this.taxInvoiceAmount = taxInvoiceAmount;
  }


  public ReportItem totalTaxAmount(BigDecimal totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

  /**
   * The total tax amount covered by this report.
   * @return totalTaxAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }


  public ReportItem metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Additional report metadata (free-form JSON). Contents vary by country mandate.
   * @return metadata
   */
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public ReportItem transactionIds(List<String> transactionIds) {
    this.transactionIds = transactionIds;
    return this;
  }

  public ReportItem addTransactionIdsItem(String transactionIdsItem) {
    if (this.transactionIds == null) {
      this.transactionIds = new ArrayList<>();
    }
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

  /**
   * List of transaction IDs associated with this report.
   * @return transactionIds
   */
  @javax.annotation.Nullable
  public List<String> getTransactionIds() {
    return transactionIds;
  }

  public void setTransactionIds(List<String> transactionIds) {
    this.transactionIds = transactionIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportItem reportItem = (ReportItem) o;
    return Objects.equals(this.reportId, reportItem.reportId) &&
        Objects.equals(this.jobId, reportItem.jobId) &&
        Objects.equals(this.reportGenerateDate, reportItem.reportGenerateDate) &&
        Objects.equals(this.reportFrom, reportItem.reportFrom) &&
        Objects.equals(this.reportTo, reportItem.reportTo) &&
        Objects.equals(this.countryCode, reportItem.countryCode) &&
        Objects.equals(this.countryMandate, reportItem.countryMandate) &&
        Objects.equals(this.documentType, reportItem.documentType) &&
        Objects.equals(this.documentSubType, reportItem.documentSubType) &&
        Objects.equals(this.reportReference, reportItem.reportReference) &&
        Objects.equals(this.reportName, reportItem.reportName) &&
        Objects.equals(this.status, reportItem.status) &&
        Objects.equals(this.reportFormatMimetypes, reportItem.reportFormatMimetypes) &&
        Objects.equals(this.tenantId, reportItem.tenantId) &&
        Objects.equals(this.taName, reportItem.taName) &&
        Objects.equals(this.taxInvoiceAmount, reportItem.taxInvoiceAmount) &&
        Objects.equals(this.totalTaxAmount, reportItem.totalTaxAmount) &&
        Objects.equals(this.metadata, reportItem.metadata) &&
        Objects.equals(this.transactionIds, reportItem.transactionIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, jobId, reportGenerateDate, reportFrom, reportTo, countryCode, countryMandate, documentType, documentSubType, reportReference, reportName, status, reportFormatMimetypes, tenantId, taName, taxInvoiceAmount, totalTaxAmount, metadata, transactionIds);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportItem {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    reportGenerateDate: ").append(toIndentedString(reportGenerateDate)).append("\n");
    sb.append("    reportFrom: ").append(toIndentedString(reportFrom)).append("\n");
    sb.append("    reportTo: ").append(toIndentedString(reportTo)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryMandate: ").append(toIndentedString(countryMandate)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentSubType: ").append(toIndentedString(documentSubType)).append("\n");
    sb.append("    reportReference: ").append(toIndentedString(reportReference)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reportFormatMimetypes: ").append(toIndentedString(reportFormatMimetypes)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    taName: ").append(toIndentedString(taName)).append("\n");
    sb.append("    taxInvoiceAmount: ").append(toIndentedString(taxInvoiceAmount)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
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
    openapiFields.add("reportId");
    openapiFields.add("jobId");
    openapiFields.add("reportGenerateDate");
    openapiFields.add("reportFrom");
    openapiFields.add("reportTo");
    openapiFields.add("countryCode");
    openapiFields.add("countryMandate");
    openapiFields.add("documentType");
    openapiFields.add("documentSubType");
    openapiFields.add("reportReference");
    openapiFields.add("reportName");
    openapiFields.add("status");
    openapiFields.add("reportFormatMimetypes");
    openapiFields.add("tenantId");
    openapiFields.add("taName");
    openapiFields.add("taxInvoiceAmount");
    openapiFields.add("totalTaxAmount");
    openapiFields.add("metadata");
    openapiFields.add("transactionIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReportItem
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportItem is not found in the empty JSON string", ReportItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("reportId") != null && !jsonObj.get("reportId").isJsonNull()) && !jsonObj.get("reportId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportId").toString()));
      }
      if ((jsonObj.get("jobId") != null && !jsonObj.get("jobId").isJsonNull()) && !jsonObj.get("jobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobId").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("countryMandate") != null && !jsonObj.get("countryMandate").isJsonNull()) && !jsonObj.get("countryMandate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryMandate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryMandate").toString()));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if ((jsonObj.get("documentSubType") != null && !jsonObj.get("documentSubType").isJsonNull()) && !jsonObj.get("documentSubType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentSubType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentSubType").toString()));
      }
      if ((jsonObj.get("reportReference") != null && !jsonObj.get("reportReference").isJsonNull()) && !jsonObj.get("reportReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportReference").toString()));
      }
      if ((jsonObj.get("reportName") != null && !jsonObj.get("reportName").isJsonNull()) && !jsonObj.get("reportName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportName").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("reportFormatMimetypes") != null && !jsonObj.get("reportFormatMimetypes").isJsonNull()) && !jsonObj.get("reportFormatMimetypes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportFormatMimetypes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportFormatMimetypes").toString()));
      }
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("taName") != null && !jsonObj.get("taName").isJsonNull()) && !jsonObj.get("taName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("transactionIds") != null && !jsonObj.get("transactionIds").isJsonNull() && !jsonObj.get("transactionIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionIds` to be an array in the JSON string but got `%s`", jsonObj.get("transactionIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportItem>() {
           @Override
           public void write(JsonWriter out, ReportItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReportItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportItem
   * @throws IOException if the JSON string is invalid with respect to ReportItem
   */
  public static ReportItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportItem.class);
  }

  /**
   * Convert an instance of ReportItem to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

