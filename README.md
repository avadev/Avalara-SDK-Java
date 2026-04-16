# Avalara.SDK - the Unified Java SDK for next gen Avalara services.

Unified SDK consists of services on top of which the Avalara Compliance Cloud platform is built. These services are foundational and provide functionality such as einvoicing.

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>net.avalara</groupId>
  <artifactId>avalara-sdk</artifactId>
  <version>24.12.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
  mavenCentral()
  mavenLocal()
}

dependencies {
  implementation 'net.avalara:avalara-sdk:24.12.0'
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import Avalara.SDK.*;
import Avalara.SDK.api.EInvoicing.V1.*;
import Avalara.SDK.model.EInvoicing.V1.*;

public class MandatesApiExample {

  public static void main(String[] args) {
      Configuration configuration = new Configuration();
      configuration.setAppName("Test");
      configuration.setAppVersion("1.0");
      configuration.setMachineName("LocalBox");
      configuration.setTimeout(5000);
      configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
      // Configure OAuth2 access token for authorization
      configuration.setBearerToken("YOUR ACCESS TOKEN");

      try {
          ApiClient apiClient = new ApiClient(configuration);
          Avalara.SDK.api.EInvoicing.V1.MandatesApi apiInstance = new MandatesApi(apiClient);
          String xAvalaraClient = "Swagger UI; 22.7.0; Custom; 1.0"; // String | Identifies the software you are using to call this API.  For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
          MandatesApi.GetMandatesRequest request = apiInstance.getGetMandatesRequest();
          request.setXAvalaraClient(xAvalaraClient);
          MandatesResponse result = apiInstance.getMandates(request);
          System.out.println(result);
      } catch (ApiException e) {
          System.err.println("Exception when calling MandatesAPI#getMandates");
          System.err.println("Status code: " + e.getCode());
          System.err.println("Reason: " + e.getResponseBody());
          System.err.println("Response headers: " + e.getResponseHeaders());
          e.printStackTrace();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}

```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

<a name="documentation-for-EInvoicing-V1-api-endpoints"></a>
### EInvoicing V1 API Documentation

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CodeListsApi* | [**getCodeList**](docs/EInvoicing/V1/CodeListsApi.md#getcodelist) | **GET** /codelists/{codelistId} | Retrieves a code list by ID for a specific country
*CodeListsApi* | [**getCodeListList**](docs/EInvoicing/V1/CodeListsApi.md#getcodelistlist) | **GET** /codelists | Returns a list of code lists for a specific country
*DataInputFieldsApi* | [**getDataInputFields**](docs/EInvoicing/V1/DataInputFieldsApi.md#getdatainputfields) | **GET** /data-input-fields | Returns the optionality of document fields for different country mandates
*DocumentsApi* | [**downloadDocument**](docs/EInvoicing/V1/DocumentsApi.md#downloaddocument) | **GET** /documents/{documentId}/$download | Returns a copy of the document
*DocumentsApi* | [**fetchDocuments**](docs/EInvoicing/V1/DocumentsApi.md#fetchdocuments) | **POST** /documents/$fetch | Fetch the inbound document from a tax authority
*DocumentsApi* | [**getDocumentList**](docs/EInvoicing/V1/DocumentsApi.md#getdocumentlist) | **GET** /documents | Returns a summary of documents for a date range
*DocumentsApi* | [**getDocumentStatus**](docs/EInvoicing/V1/DocumentsApi.md#getdocumentstatus) | **GET** /documents/{documentId}/status | Checks the status of a document
*DocumentsApi* | [**submitDocument**](docs/EInvoicing/V1/DocumentsApi.md#submitdocument) | **POST** /documents | Submits a document to Avalara E-Invoicing API
*InteropApi* | [**submitInteropDocument**](docs/EInvoicing/V1/InteropApi.md#submitinteropdocument) | **POST** /interop/documents | Submit a document
*MandatesApi* | [**getMandateDataInputFields**](docs/EInvoicing/V1/MandatesApi.md#getmandatedatainputfields) | **GET** /mandates/{mandateId}/data-input-fields | Returns document field information for a country mandate, a selected document type, and its version
*MandatesApi* | [**getMandates**](docs/EInvoicing/V1/MandatesApi.md#getmandates) | **GET** /mandates | List country mandates that are supported by the Avalara E-Invoicing platform
*ReportsApi* | [**downloadReport**](docs/EInvoicing/V1/ReportsApi.md#downloadreport) | **GET** /reports/{reportId}/$download | Returns a pre-signed download URL for a report
*ReportsApi* | [**getReportById**](docs/EInvoicing/V1/ReportsApi.md#getreportbyid) | **GET** /reports/{reportId}/status | Retrieves a report by its unique ID
*ReportsApi* | [**getReports**](docs/EInvoicing/V1/ReportsApi.md#getreports) | **GET** /reports | Returns a list of reports
*SubscriptionsApi* | [**createWebhookSubscription**](docs/EInvoicing/V1/SubscriptionsApi.md#createwebhooksubscription) | **POST** /webhooks/subscriptions | Create a subscription to events
*SubscriptionsApi* | [**deleteWebhookSubscription**](docs/EInvoicing/V1/SubscriptionsApi.md#deletewebhooksubscription) | **DELETE** /webhooks/subscriptions/{subscriptionId} | Unsubscribe from events
*SubscriptionsApi* | [**getWebhookSubscription**](docs/EInvoicing/V1/SubscriptionsApi.md#getwebhooksubscription) | **GET** /webhooks/subscriptions/{subscriptionId} | Get details of a subscription
*SubscriptionsApi* | [**listWebhookSubscriptions**](docs/EInvoicing/V1/SubscriptionsApi.md#listwebhooksubscriptions) | **GET** /webhooks/subscriptions | List all subscriptions
*TaxIdentifiersApi* | [**taxIdentifierSchemaByCountry**](docs/EInvoicing/V1/TaxIdentifiersApi.md#taxidentifierschemabycountry) | **GET** /tax-identifiers/schema | Returns the tax identifier request and response schema for a specific country.
*TaxIdentifiersApi* | [**validateTaxIdentifier**](docs/EInvoicing/V1/TaxIdentifiersApi.md#validatetaxidentifier) | **POST** /tax-identifiers/validate | Validates a tax identifier.
*TradingPartnersApi* | [**batchSearchParticipants**](docs/EInvoicing/V1/TradingPartnersApi.md#batchsearchparticipants) | **POST** /trading-partners/batch-searches | Handles batch search requests by uploading a file containing search parameters.
*TradingPartnersApi* | [**createTradingPartner**](docs/EInvoicing/V1/TradingPartnersApi.md#createtradingpartner) | **POST** /trading-partners | Creates a new trading partner.
*TradingPartnersApi* | [**createTradingPartnersBatch**](docs/EInvoicing/V1/TradingPartnersApi.md#createtradingpartnersbatch) | **POST** /trading-partners/batch | Creates a batch of multiple trading partners.
*TradingPartnersApi* | [**deleteTradingPartner**](docs/EInvoicing/V1/TradingPartnersApi.md#deletetradingpartner) | **DELETE** /trading-partners/{id} | Deletes a trading partner using ID.
*TradingPartnersApi* | [**downloadBatchSearchReport**](docs/EInvoicing/V1/TradingPartnersApi.md#downloadbatchsearchreport) | **GET** /trading-partners/batch-searches/{id}/$download-results | Downloads batch search results in a csv file.
*TradingPartnersApi* | [**getBatchSearchDetail**](docs/EInvoicing/V1/TradingPartnersApi.md#getbatchsearchdetail) | **GET** /trading-partners/batch-searches/{id} | Returns the batch search details using ID.
*TradingPartnersApi* | [**listBatchSearches**](docs/EInvoicing/V1/TradingPartnersApi.md#listbatchsearches) | **GET** /trading-partners/batch-searches | Lists all batch searches that were previously submitted.
*TradingPartnersApi* | [**searchParticipants**](docs/EInvoicing/V1/TradingPartnersApi.md#searchparticipants) | **GET** /trading-partners | Returns a list of participants matching the input query.
*TradingPartnersApi* | [**updateTradingPartner**](docs/EInvoicing/V1/TradingPartnersApi.md#updatetradingpartner) | **PUT** /trading-partners/{id} | Updates a trading partner using ID.

<a name="documentation-for-models"></a>
## Documentation for Models

<a name="documentation-for-EInvoicing-V1-models"></a>
### EInvoicing V1 Model Documentation

 - [Avalara.SDK.model.EInvoicing.V1.Address](docs/EInvoicing/V1/Address.md)
 - [Avalara.SDK.model.EInvoicing.V1.BadDownloadRequest](docs/EInvoicing/V1/BadDownloadRequest.md)
 - [Avalara.SDK.model.EInvoicing.V1.BadRequest](docs/EInvoicing/V1/BadRequest.md)
 - [Avalara.SDK.model.EInvoicing.V1.BatchErrorDetail](docs/EInvoicing/V1/BatchErrorDetail.md)
 - [Avalara.SDK.model.EInvoicing.V1.BatchSearch](docs/EInvoicing/V1/BatchSearch.md)
 - [Avalara.SDK.model.EInvoicing.V1.BatchSearchListResponse](docs/EInvoicing/V1/BatchSearchListResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.BatchSearchParticipants202Response](docs/EInvoicing/V1/BatchSearchParticipants202Response.md)
 - [Avalara.SDK.model.EInvoicing.V1.CodeListListResponse](docs/EInvoicing/V1/CodeListListResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.CodeListResponse](docs/EInvoicing/V1/CodeListResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.CodeListSummary](docs/EInvoicing/V1/CodeListSummary.md)
 - [Avalara.SDK.model.EInvoicing.V1.CodeListValue](docs/EInvoicing/V1/CodeListValue.md)
 - [Avalara.SDK.model.EInvoicing.V1.CodeListVersion](docs/EInvoicing/V1/CodeListVersion.md)
 - [Avalara.SDK.model.EInvoicing.V1.ConditionalForField](docs/EInvoicing/V1/ConditionalForField.md)
 - [Avalara.SDK.model.EInvoicing.V1.Consents](docs/EInvoicing/V1/Consents.md)
 - [Avalara.SDK.model.EInvoicing.V1.CreateTradingPartner201Response](docs/EInvoicing/V1/CreateTradingPartner201Response.md)
 - [Avalara.SDK.model.EInvoicing.V1.CreateTradingPartnersBatch200Response](docs/EInvoicing/V1/CreateTradingPartnersBatch200Response.md)
 - [Avalara.SDK.model.EInvoicing.V1.CreateTradingPartnersBatch200ResponseValueInner](docs/EInvoicing/V1/CreateTradingPartnersBatch200ResponseValueInner.md)
 - [Avalara.SDK.model.EInvoicing.V1.CreateTradingPartnersBatchRequest](docs/EInvoicing/V1/CreateTradingPartnersBatchRequest.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputField](docs/EInvoicing/V1/DataInputField.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputFieldNotUsedFor](docs/EInvoicing/V1/DataInputFieldNotUsedFor.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputFieldOptionalFor](docs/EInvoicing/V1/DataInputFieldOptionalFor.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputFieldRequiredFor](docs/EInvoicing/V1/DataInputFieldRequiredFor.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputFieldsResponse](docs/EInvoicing/V1/DataInputFieldsResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentFetch](docs/EInvoicing/V1/DocumentFetch.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentListResponse](docs/EInvoicing/V1/DocumentListResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentStatusResponse](docs/EInvoicing/V1/DocumentStatusResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentSubmissionError](docs/EInvoicing/V1/DocumentSubmissionError.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentSubmitResponse](docs/EInvoicing/V1/DocumentSubmitResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentSummary](docs/EInvoicing/V1/DocumentSummary.md)
 - [Avalara.SDK.model.EInvoicing.V1.ErrorResponse](docs/EInvoicing/V1/ErrorResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.EventId](docs/EInvoicing/V1/EventId.md)
 - [Avalara.SDK.model.EInvoicing.V1.EventMessage](docs/EInvoicing/V1/EventMessage.md)
 - [Avalara.SDK.model.EInvoicing.V1.EventPayload](docs/EInvoicing/V1/EventPayload.md)
 - [Avalara.SDK.model.EInvoicing.V1.EventSubscription](docs/EInvoicing/V1/EventSubscription.md)
 - [Avalara.SDK.model.EInvoicing.V1.Extension](docs/EInvoicing/V1/Extension.md)
 - [Avalara.SDK.model.EInvoicing.V1.FetchDocumentsRequest](docs/EInvoicing/V1/FetchDocumentsRequest.md)
 - [Avalara.SDK.model.EInvoicing.V1.FetchDocumentsRequestDataInner](docs/EInvoicing/V1/FetchDocumentsRequestDataInner.md)
 - [Avalara.SDK.model.EInvoicing.V1.FetchDocumentsRequestMetadata](docs/EInvoicing/V1/FetchDocumentsRequestMetadata.md)
 - [Avalara.SDK.model.EInvoicing.V1.ForbiddenError](docs/EInvoicing/V1/ForbiddenError.md)
 - [Avalara.SDK.model.EInvoicing.V1.HmacSignature](docs/EInvoicing/V1/HmacSignature.md)
 - [Avalara.SDK.model.EInvoicing.V1.HmacSignatureValue](docs/EInvoicing/V1/HmacSignatureValue.md)
 - [Avalara.SDK.model.EInvoicing.V1.Id](docs/EInvoicing/V1/Id.md)
 - [Avalara.SDK.model.EInvoicing.V1.Identifier](docs/EInvoicing/V1/Identifier.md)
 - [Avalara.SDK.model.EInvoicing.V1.InputDataFormats](docs/EInvoicing/V1/InputDataFormats.md)
 - [Avalara.SDK.model.EInvoicing.V1.InternalServerError](docs/EInvoicing/V1/InternalServerError.md)
 - [Avalara.SDK.model.EInvoicing.V1.Mandate](docs/EInvoicing/V1/Mandate.md)
 - [Avalara.SDK.model.EInvoicing.V1.MandateDataInputField](docs/EInvoicing/V1/MandateDataInputField.md)
 - [Avalara.SDK.model.EInvoicing.V1.MandateDataInputFieldNamespace](docs/EInvoicing/V1/MandateDataInputFieldNamespace.md)
 - [Avalara.SDK.model.EInvoicing.V1.MandatesResponse](docs/EInvoicing/V1/MandatesResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.NotFoundError](docs/EInvoicing/V1/NotFoundError.md)
 - [Avalara.SDK.model.EInvoicing.V1.NotUsedForField](docs/EInvoicing/V1/NotUsedForField.md)
 - [Avalara.SDK.model.EInvoicing.V1.OutputDataFormats](docs/EInvoicing/V1/OutputDataFormats.md)
 - [Avalara.SDK.model.EInvoicing.V1.Pagination](docs/EInvoicing/V1/Pagination.md)
 - [Avalara.SDK.model.EInvoicing.V1.ReportDownloadResponse](docs/EInvoicing/V1/ReportDownloadResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.ReportItem](docs/EInvoicing/V1/ReportItem.md)
 - [Avalara.SDK.model.EInvoicing.V1.ReportListResponse](docs/EInvoicing/V1/ReportListResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.RequiredWhenField](docs/EInvoicing/V1/RequiredWhenField.md)
 - [Avalara.SDK.model.EInvoicing.V1.SearchParticipants200Response](docs/EInvoicing/V1/SearchParticipants200Response.md)
 - [Avalara.SDK.model.EInvoicing.V1.Signature](docs/EInvoicing/V1/Signature.md)
 - [Avalara.SDK.model.EInvoicing.V1.SignatureSignature](docs/EInvoicing/V1/SignatureSignature.md)
 - [Avalara.SDK.model.EInvoicing.V1.SignatureValue](docs/EInvoicing/V1/SignatureValue.md)
 - [Avalara.SDK.model.EInvoicing.V1.SignatureValueSignature](docs/EInvoicing/V1/SignatureValueSignature.md)
 - [Avalara.SDK.model.EInvoicing.V1.StatusEvent](docs/EInvoicing/V1/StatusEvent.md)
 - [Avalara.SDK.model.EInvoicing.V1.SubmitDocumentMetadata](docs/EInvoicing/V1/SubmitDocumentMetadata.md)
 - [Avalara.SDK.model.EInvoicing.V1.SubmitInteropDocument202Response](docs/EInvoicing/V1/SubmitInteropDocument202Response.md)
 - [Avalara.SDK.model.EInvoicing.V1.SubscriptionCommon](docs/EInvoicing/V1/SubscriptionCommon.md)
 - [Avalara.SDK.model.EInvoicing.V1.SubscriptionDetail](docs/EInvoicing/V1/SubscriptionDetail.md)
 - [Avalara.SDK.model.EInvoicing.V1.SubscriptionListResponse](docs/EInvoicing/V1/SubscriptionListResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.SubscriptionRegistration](docs/EInvoicing/V1/SubscriptionRegistration.md)
 - [Avalara.SDK.model.EInvoicing.V1.SuccessResponse](docs/EInvoicing/V1/SuccessResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.SupportedDocumentStatuses](docs/EInvoicing/V1/SupportedDocumentStatuses.md)
 - [Avalara.SDK.model.EInvoicing.V1.SupportedDocumentTypes](docs/EInvoicing/V1/SupportedDocumentTypes.md)
 - [Avalara.SDK.model.EInvoicing.V1.TaxIdentifierRequest](docs/EInvoicing/V1/TaxIdentifierRequest.md)
 - [Avalara.SDK.model.EInvoicing.V1.TaxIdentifierResponse](docs/EInvoicing/V1/TaxIdentifierResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.TaxIdentifierResponseValue](docs/EInvoicing/V1/TaxIdentifierResponseValue.md)
 - [Avalara.SDK.model.EInvoicing.V1.TaxIdentifierSchemaByCountry200Response](docs/EInvoicing/V1/TaxIdentifierSchemaByCountry200Response.md)
 - [Avalara.SDK.model.EInvoicing.V1.TradingPartner](docs/EInvoicing/V1/TradingPartner.md)
 - [Avalara.SDK.model.EInvoicing.V1.UpdateTradingPartner200Response](docs/EInvoicing/V1/UpdateTradingPartner200Response.md)
 - [Avalara.SDK.model.EInvoicing.V1.ValidationError](docs/EInvoicing/V1/ValidationError.md)
 - [Avalara.SDK.model.EInvoicing.V1.WebhookInvocation](docs/EInvoicing/V1/WebhookInvocation.md)
 - [Avalara.SDK.model.EInvoicing.V1.WebhooksErrorInfo](docs/EInvoicing/V1/WebhooksErrorInfo.md)
 - [Avalara.SDK.model.EInvoicing.V1.WebhooksErrorResponse](docs/EInvoicing/V1/WebhooksErrorResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.WorkflowIds](docs/EInvoicing/V1/WorkflowIds.md)
