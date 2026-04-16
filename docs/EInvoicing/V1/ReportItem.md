

# ReportItem

Represents a single report with full details including metadata and associated transaction IDs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportId** | **String** | The unique ID for this report. |  [optional] |
|**jobId** | **String** | The unique ID of the job that generated this report. |  [optional] |
|**reportGenerateDate** | **OffsetDateTime** | The date and time when the report was generated. |  [optional] |
|**reportFrom** | **LocalDate** | The start date of the reporting period. |  [optional] |
|**reportTo** | **LocalDate** | The end date of the reporting period. |  [optional] |
|**countryCode** | **String** | The two-letter ISO-3166 country code for which this report was generated. |  [optional] |
|**countryMandate** | **String** | The e-invoicing mandate for the specified country. |  [optional] |
|**documentType** | **String** | The type of document covered by this report. |  [optional] |
|**documentSubType** | **String** | The sub-type of the document. |  [optional] |
|**reportReference** | **String** | An internal reference path for the report. |  [optional] |
|**reportName** | **String** | The name of the report file. |  [optional] |
|**status** | **String** | The current status of the report. Possible values include: PENDING, PROCESSING, COMPLETED, FAILED, SENT_TO_PPF, ERROR. |  [optional] |
|**reportFormatMimetypes** | **String** | The MIME type of the report file. |  [optional] |
|**tenantId** | **String** | The tenant identifier associated with this report. |  [optional] |
|**taName** | **String** | The name of the tax authority for this report. |  [optional] |
|**taxInvoiceAmount** | **BigDecimal** | The total invoice amount covered by this report. |  [optional] |
|**totalTaxAmount** | **BigDecimal** | The total tax amount covered by this report. |  [optional] |
|**metadata** | **Object** | Additional report metadata (free-form JSON). Contents vary by country mandate. |  [optional] |
|**transactionIds** | **List&lt;String&gt;** | List of transaction IDs associated with this report. |  [optional] |



