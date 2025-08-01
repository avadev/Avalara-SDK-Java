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
*DataInputFieldsApi* | [**getDataInputFields**](docs/EInvoicing/V1/DataInputFieldsApi.md#getdatainputfields) | **GET** /data-input-fields | Returns the optionality of document fields for different country mandates
*DocumentsApi* | [**downloadDocument**](docs/EInvoicing/V1/DocumentsApi.md#downloaddocument) | **GET** /documents/{documentId}/$download | Returns a copy of the document
*DocumentsApi* | [**fetchDocuments**](docs/EInvoicing/V1/DocumentsApi.md#fetchdocuments) | **POST** /documents/$fetch | Fetch the inbound document from a tax authority
*DocumentsApi* | [**getDocumentList**](docs/EInvoicing/V1/DocumentsApi.md#getdocumentlist) | **GET** /documents | Returns a summary of documents for a date range
*DocumentsApi* | [**getDocumentStatus**](docs/EInvoicing/V1/DocumentsApi.md#getdocumentstatus) | **GET** /documents/{documentId}/status | Checks the status of a document
*DocumentsApi* | [**submitDocument**](docs/EInvoicing/V1/DocumentsApi.md#submitdocument) | **POST** /documents | Submits a document to Avalara E-Invoicing API
*InteropApi* | [**submitInteropDocument**](docs/EInvoicing/V1/InteropApi.md#submitinteropdocument) | **POST** /interop/documents | Submit a document
*MandatesApi* | [**getMandateDataInputFields**](docs/EInvoicing/V1/MandatesApi.md#getmandatedatainputfields) | **GET** /mandates/{mandateId}/data-input-fields | Returns document field information for a country mandate, a selected document type, and its version
*MandatesApi* | [**getMandates**](docs/EInvoicing/V1/MandatesApi.md#getmandates) | **GET** /mandates | List country mandates that are supported by the Avalara E-Invoicing platform
*SubscriptionsApi* | [**createWebhookSubscription**](docs/EInvoicing/V1/SubscriptionsApi.md#createwebhooksubscription) | **POST** /webhooks/subscriptions | Create a subscription to events
*SubscriptionsApi* | [**deleteWebhookSubscription**](docs/EInvoicing/V1/SubscriptionsApi.md#deletewebhooksubscription) | **DELETE** /webhooks/subscriptions/{subscription-id} | Unsubscribe from events
*SubscriptionsApi* | [**getWebhookSubscription**](docs/EInvoicing/V1/SubscriptionsApi.md#getwebhooksubscription) | **GET** /webhooks/subscriptions/{subscription-id} | Get details of a subscription
*SubscriptionsApi* | [**listWebhookSubscriptions**](docs/EInvoicing/V1/SubscriptionsApi.md#listwebhooksubscriptions) | **GET** /webhooks/subscriptions | List all subscriptions
*TaxIdentifiersApi* | [**taxIdentifierSchemaByCountry**](docs/EInvoicing/V1/TaxIdentifiersApi.md#taxidentifierschemabycountry) | **GET** /tax-identifiers/schema | Returns the tax identifier request & response schema for a specific country.
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

<a name="documentation-for-A1099-V2-api-endpoints"></a>
### A1099 V2 API Documentation

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompaniesW9Api* | [**createCompany**](docs/A1099/V2/CompaniesW9Api.md#createcompany) | **POST** /w9/companies | Create a company
*CompaniesW9Api* | [**deleteCompany**](docs/A1099/V2/CompaniesW9Api.md#deletecompany) | **DELETE** /w9/companies/{id} | Delete a company
*CompaniesW9Api* | [**getCompanies**](docs/A1099/V2/CompaniesW9Api.md#getcompanies) | **GET** /w9/companies | List companies
*CompaniesW9Api* | [**getCompany**](docs/A1099/V2/CompaniesW9Api.md#getcompany) | **GET** /w9/companies/{id} | Retrieve a company
*CompaniesW9Api* | [**updateCompany**](docs/A1099/V2/CompaniesW9Api.md#updatecompany) | **PUT** /w9/companies/{id} | Update a company
*Forms1099Api* | [**bulkUpsert1099Forms**](docs/A1099/V2/Forms1099Api.md#bulkupsert1099forms) | **POST** /1099/forms/$bulk-upsert | Create or update multiple 1099/1095/W2/1042S forms
*Forms1099Api* | [**create1099Form**](docs/A1099/V2/Forms1099Api.md#create1099form) | **POST** /1099/forms | Create a 1099/1095/W2/1042S form
*Forms1099Api* | [**delete1099Form**](docs/A1099/V2/Forms1099Api.md#delete1099form) | **DELETE** /1099/forms/{id} | Delete a 1099/1095/W2/1042S form
*Forms1099Api* | [**get1099Form**](docs/A1099/V2/Forms1099Api.md#get1099form) | **GET** /1099/forms/{id} | Retrieve a 1099/1095/W2/1042S form
*Forms1099Api* | [**get1099FormPdf**](docs/A1099/V2/Forms1099Api.md#get1099formpdf) | **GET** /1099/forms/{id}/pdf | Retrieve the PDF file for a 1099/1095/W2/1042S form
*Forms1099Api* | [**list1099Forms**](docs/A1099/V2/Forms1099Api.md#list1099forms) | **GET** /1099/forms | List 1099/1095/W2/1042S forms
*Forms1099Api* | [**update1099Form**](docs/A1099/V2/Forms1099Api.md#update1099form) | **PUT** /1099/forms/{id} | Update a 1099/1095/W2/1042S form
*FormsW9Api* | [**createW9Form**](docs/A1099/V2/FormsW9Api.md#createw9form) | **POST** /w9/forms | Create a W9/W4/W8 form
*FormsW9Api* | [**deleteW9Form**](docs/A1099/V2/FormsW9Api.md#deletew9form) | **DELETE** /w9/forms/{id} | Delete a W9/W4/W8 form
*FormsW9Api* | [**getW9Form**](docs/A1099/V2/FormsW9Api.md#getw9form) | **GET** /w9/forms/{id} | Retrieve a W9/W4/W8 form
*FormsW9Api* | [**listW9Forms**](docs/A1099/V2/FormsW9Api.md#listw9forms) | **GET** /w9/forms | List W9/W4/W8 forms
*FormsW9Api* | [**sendW9FormEmail**](docs/A1099/V2/FormsW9Api.md#sendw9formemail) | **POST** /w9/forms/{id}/$send-email | Send an email to the vendor/payee requesting they fill out a W9/W4/W8 form
*FormsW9Api* | [**updateW9Form**](docs/A1099/V2/FormsW9Api.md#updatew9form) | **PUT** /w9/forms/{id} | Update a W9/W4/W8 form
*FormsW9Api* | [**uploadW9Files**](docs/A1099/V2/FormsW9Api.md#uploadw9files) | **POST** /w9/forms/{id}/attachment | Replace the PDF file for a W9/W4/W8 form
*Issuers1099Api* | [**createIssuer**](docs/A1099/V2/Issuers1099Api.md#createissuer) | **POST** /1099/issuers | Create an issuer
*Issuers1099Api* | [**deleteIssuer**](docs/A1099/V2/Issuers1099Api.md#deleteissuer) | **DELETE** /1099/issuers/{id} | Delete an issuer
*Issuers1099Api* | [**getIssuer**](docs/A1099/V2/Issuers1099Api.md#getissuer) | **GET** /1099/issuers/{id} | Retrieve an issuer
*Issuers1099Api* | [**getIssuers**](docs/A1099/V2/Issuers1099Api.md#getissuers) | **GET** /1099/issuers | List issuers
*Issuers1099Api* | [**updateIssuer**](docs/A1099/V2/Issuers1099Api.md#updateissuer) | **PUT** /1099/issuers/{id} | Update an issuer
*Jobs1099Api* | [**getJob**](docs/A1099/V2/Jobs1099Api.md#getjob) | **GET** /1099/jobs/{id} | Retrieves information about the job

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


<a name="documentation-for-A1099-V2-models"></a>
### A1099 V2 Model Documentation

 - [Avalara.SDK.model.A1099.V2.Attribute](docs/A1099/V2/Attribute.md)
 - [Avalara.SDK.model.A1099.V2.AuthorizedApiRequestModel](docs/A1099/V2/AuthorizedApiRequestModel.md)
 - [Avalara.SDK.model.A1099.V2.AuthorizedApiRequestV2DataModel](docs/A1099/V2/AuthorizedApiRequestV2DataModel.md)
 - [Avalara.SDK.model.A1099.V2.BaseCompanyModel](docs/A1099/V2/BaseCompanyModel.md)
 - [Avalara.SDK.model.A1099.V2.BaseFormListRequest](docs/A1099/V2/BaseFormListRequest.md)
 - [Avalara.SDK.model.A1099.V2.BulkUpsert1099FormsRequest](docs/A1099/V2/BulkUpsert1099FormsRequest.md)
 - [Avalara.SDK.model.A1099.V2.CompanyCreateUpdateRequestModel](docs/A1099/V2/CompanyCreateUpdateRequestModel.md)
 - [Avalara.SDK.model.A1099.V2.CompanyModel](docs/A1099/V2/CompanyModel.md)
 - [Avalara.SDK.model.A1099.V2.CompanyResponse](docs/A1099/V2/CompanyResponse.md)
 - [Avalara.SDK.model.A1099.V2.CompanyResponseModel](docs/A1099/V2/CompanyResponseModel.md)
 - [Avalara.SDK.model.A1099.V2.CoveredIndividualReferenceResponse](docs/A1099/V2/CoveredIndividualReferenceResponse.md)
 - [Avalara.SDK.model.A1099.V2.CoveredIndividualRequest](docs/A1099/V2/CoveredIndividualRequest.md)
 - [Avalara.SDK.model.A1099.V2.Create1099Form201Response](docs/A1099/V2/Create1099Form201Response.md)
 - [Avalara.SDK.model.A1099.V2.CreateW9Form201Response](docs/A1099/V2/CreateW9Form201Response.md)
 - [Avalara.SDK.model.A1099.V2.CreateW9FormRequest](docs/A1099/V2/CreateW9FormRequest.md)
 - [Avalara.SDK.model.A1099.V2.Data](docs/A1099/V2/Data.md)
 - [Avalara.SDK.model.A1099.V2.ErrorModel](docs/A1099/V2/ErrorModel.md)
 - [Avalara.SDK.model.A1099.V2.ErrorResponse](docs/A1099/V2/ErrorResponse.md)
 - [Avalara.SDK.model.A1099.V2.ErrorResponseErrorsInner](docs/A1099/V2/ErrorResponseErrorsInner.md)
 - [Avalara.SDK.model.A1099.V2.Form1042SList](docs/A1099/V2/Form1042SList.md)
 - [Avalara.SDK.model.A1099.V2.Form1042SListItem](docs/A1099/V2/Form1042SListItem.md)
 - [Avalara.SDK.model.A1099.V2.Form1042SListItemResponse](docs/A1099/V2/Form1042SListItemResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1042SRequest](docs/A1099/V2/Form1042SRequest.md)
 - [Avalara.SDK.model.A1099.V2.Form1042SResponse](docs/A1099/V2/Form1042SResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1095BList](docs/A1099/V2/Form1095BList.md)
 - [Avalara.SDK.model.A1099.V2.Form1095BListItem](docs/A1099/V2/Form1095BListItem.md)
 - [Avalara.SDK.model.A1099.V2.Form1095BListItemResponse](docs/A1099/V2/Form1095BListItemResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1095BRequest](docs/A1099/V2/Form1095BRequest.md)
 - [Avalara.SDK.model.A1099.V2.Form1095CList](docs/A1099/V2/Form1095CList.md)
 - [Avalara.SDK.model.A1099.V2.Form1095CListItem](docs/A1099/V2/Form1095CListItem.md)
 - [Avalara.SDK.model.A1099.V2.Form1099BaseResponse](docs/A1099/V2/Form1099BaseResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099DivList](docs/A1099/V2/Form1099DivList.md)
 - [Avalara.SDK.model.A1099.V2.Form1099DivListItem](docs/A1099/V2/Form1099DivListItem.md)
 - [Avalara.SDK.model.A1099.V2.Form1099DivListItemResponse](docs/A1099/V2/Form1099DivListItemResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099DivRequest](docs/A1099/V2/Form1099DivRequest.md)
 - [Avalara.SDK.model.A1099.V2.Form1099DivResponse](docs/A1099/V2/Form1099DivResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099KList](docs/A1099/V2/Form1099KList.md)
 - [Avalara.SDK.model.A1099.V2.Form1099KListItem](docs/A1099/V2/Form1099KListItem.md)
 - [Avalara.SDK.model.A1099.V2.Form1099KListItemResponse](docs/A1099/V2/Form1099KListItemResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099KRequest](docs/A1099/V2/Form1099KRequest.md)
 - [Avalara.SDK.model.A1099.V2.Form1099KResponse](docs/A1099/V2/Form1099KResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099ListResponse](docs/A1099/V2/Form1099ListResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099ListResponseValueInner](docs/A1099/V2/Form1099ListResponseValueInner.md)
 - [Avalara.SDK.model.A1099.V2.Form1099MiscList](docs/A1099/V2/Form1099MiscList.md)
 - [Avalara.SDK.model.A1099.V2.Form1099MiscListItem](docs/A1099/V2/Form1099MiscListItem.md)
 - [Avalara.SDK.model.A1099.V2.Form1099MiscListItemResponse](docs/A1099/V2/Form1099MiscListItemResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099MiscRequest](docs/A1099/V2/Form1099MiscRequest.md)
 - [Avalara.SDK.model.A1099.V2.Form1099MiscResponse](docs/A1099/V2/Form1099MiscResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099NecList](docs/A1099/V2/Form1099NecList.md)
 - [Avalara.SDK.model.A1099.V2.Form1099NecListItem](docs/A1099/V2/Form1099NecListItem.md)
 - [Avalara.SDK.model.A1099.V2.Form1099NecListItemResponse](docs/A1099/V2/Form1099NecListItemResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099NecRequest](docs/A1099/V2/Form1099NecRequest.md)
 - [Avalara.SDK.model.A1099.V2.Form1099NecResponse](docs/A1099/V2/Form1099NecResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099ProccessResult](docs/A1099/V2/Form1099ProccessResult.md)
 - [Avalara.SDK.model.A1099.V2.Form1099RList](docs/A1099/V2/Form1099RList.md)
 - [Avalara.SDK.model.A1099.V2.Form1099RListItem](docs/A1099/V2/Form1099RListItem.md)
 - [Avalara.SDK.model.A1099.V2.Form1099RListItemResponse](docs/A1099/V2/Form1099RListItemResponse.md)
 - [Avalara.SDK.model.A1099.V2.Form1099RRequest](docs/A1099/V2/Form1099RRequest.md)
 - [Avalara.SDK.model.A1099.V2.FormRequestBase](docs/A1099/V2/FormRequestBase.md)
 - [Avalara.SDK.model.A1099.V2.FormRequestListItemBase](docs/A1099/V2/FormRequestListItemBase.md)
 - [Avalara.SDK.model.A1099.V2.FormResponseBase](docs/A1099/V2/FormResponseBase.md)
 - [Avalara.SDK.model.A1099.V2.FormSingleRequestBase](docs/A1099/V2/FormSingleRequestBase.md)
 - [Avalara.SDK.model.A1099.V2.Get1099Form200Response](docs/A1099/V2/Get1099Form200Response.md)
 - [Avalara.SDK.model.A1099.V2.HttpValidationProblemDetails](docs/A1099/V2/HttpValidationProblemDetails.md)
 - [Avalara.SDK.model.A1099.V2.ICreateForm1099Request](docs/A1099/V2/ICreateForm1099Request.md)
 - [Avalara.SDK.model.A1099.V2.IUpdateForm1099Request](docs/A1099/V2/IUpdateForm1099Request.md)
 - [Avalara.SDK.model.A1099.V2.IW9FormDataModelsOneOf](docs/A1099/V2/IW9FormDataModelsOneOf.md)
 - [Avalara.SDK.model.A1099.V2.IntermediaryOrFlowThrough](docs/A1099/V2/IntermediaryOrFlowThrough.md)
 - [Avalara.SDK.model.A1099.V2.IntermediaryOrFlowThroughRequest](docs/A1099/V2/IntermediaryOrFlowThroughRequest.md)
 - [Avalara.SDK.model.A1099.V2.IntermediaryOrFlowThroughResponse](docs/A1099/V2/IntermediaryOrFlowThroughResponse.md)
 - [Avalara.SDK.model.A1099.V2.IrsResponse](docs/A1099/V2/IrsResponse.md)
 - [Avalara.SDK.model.A1099.V2.IssuerCommand](docs/A1099/V2/IssuerCommand.md)
 - [Avalara.SDK.model.A1099.V2.IssuerResponse](docs/A1099/V2/IssuerResponse.md)
 - [Avalara.SDK.model.A1099.V2.JobResult](docs/A1099/V2/JobResult.md)
 - [Avalara.SDK.model.A1099.V2.Link](docs/A1099/V2/Link.md)
 - [Avalara.SDK.model.A1099.V2.OfferAndCoverageRequest](docs/A1099/V2/OfferAndCoverageRequest.md)
 - [Avalara.SDK.model.A1099.V2.PaginatedQueryResultModel](docs/A1099/V2/PaginatedQueryResultModel.md)
 - [Avalara.SDK.model.A1099.V2.PaginatedQueryResultModelCompanyResponse](docs/A1099/V2/PaginatedQueryResultModelCompanyResponse.md)
 - [Avalara.SDK.model.A1099.V2.PaginatedQueryResultModelIssuerResponse](docs/A1099/V2/PaginatedQueryResultModelIssuerResponse.md)
 - [Avalara.SDK.model.A1099.V2.PaginatedW9FormsModel](docs/A1099/V2/PaginatedW9FormsModel.md)
 - [Avalara.SDK.model.A1099.V2.PrimaryWithholdingAgent](docs/A1099/V2/PrimaryWithholdingAgent.md)
 - [Avalara.SDK.model.A1099.V2.PrimaryWithholdingAgentRequest](docs/A1099/V2/PrimaryWithholdingAgentRequest.md)
 - [Avalara.SDK.model.A1099.V2.PrimaryWithholdingAgentResponse](docs/A1099/V2/PrimaryWithholdingAgentResponse.md)
 - [Avalara.SDK.model.A1099.V2.ProblemDetails](docs/A1099/V2/ProblemDetails.md)
 - [Avalara.SDK.model.A1099.V2.StateAndLocalWithholdingRequest](docs/A1099/V2/StateAndLocalWithholdingRequest.md)
 - [Avalara.SDK.model.A1099.V2.StateAndLocalWithholdingResponse](docs/A1099/V2/StateAndLocalWithholdingResponse.md)
 - [Avalara.SDK.model.A1099.V2.StateEfileStatusDetailResponse](docs/A1099/V2/StateEfileStatusDetailResponse.md)
 - [Avalara.SDK.model.A1099.V2.StatusDetail](docs/A1099/V2/StatusDetail.md)
 - [Avalara.SDK.model.A1099.V2.SubstantialUsOwnerRequest](docs/A1099/V2/SubstantialUsOwnerRequest.md)
 - [Avalara.SDK.model.A1099.V2.SubstantialUsOwnerResponse](docs/A1099/V2/SubstantialUsOwnerResponse.md)
 - [Avalara.SDK.model.A1099.V2.TinMatchStatusResponse](docs/A1099/V2/TinMatchStatusResponse.md)
 - [Avalara.SDK.model.A1099.V2.Update1099Form200Response](docs/A1099/V2/Update1099Form200Response.md)
 - [Avalara.SDK.model.A1099.V2.ValidationErrorResponse](docs/A1099/V2/ValidationErrorResponse.md)
 - [Avalara.SDK.model.A1099.V2.W4FormDataModel](docs/A1099/V2/W4FormDataModel.md)
 - [Avalara.SDK.model.A1099.V2.W4FormRequest](docs/A1099/V2/W4FormRequest.md)
 - [Avalara.SDK.model.A1099.V2.W4FormResponse](docs/A1099/V2/W4FormResponse.md)
 - [Avalara.SDK.model.A1099.V2.W8BenEFormRequest](docs/A1099/V2/W8BenEFormRequest.md)
 - [Avalara.SDK.model.A1099.V2.W8BenEFormResponse](docs/A1099/V2/W8BenEFormResponse.md)
 - [Avalara.SDK.model.A1099.V2.W8BenESubstantialUsOwnerDataModel](docs/A1099/V2/W8BenESubstantialUsOwnerDataModel.md)
 - [Avalara.SDK.model.A1099.V2.W8BenFormDataModel](docs/A1099/V2/W8BenFormDataModel.md)
 - [Avalara.SDK.model.A1099.V2.W8BenFormRequest](docs/A1099/V2/W8BenFormRequest.md)
 - [Avalara.SDK.model.A1099.V2.W8BenFormResponse](docs/A1099/V2/W8BenFormResponse.md)
 - [Avalara.SDK.model.A1099.V2.W8BeneFormDataModel](docs/A1099/V2/W8BeneFormDataModel.md)
 - [Avalara.SDK.model.A1099.V2.W8ImyFormDataModel](docs/A1099/V2/W8ImyFormDataModel.md)
 - [Avalara.SDK.model.A1099.V2.W8ImyFormRequest](docs/A1099/V2/W8ImyFormRequest.md)
 - [Avalara.SDK.model.A1099.V2.W8ImyFormResponse](docs/A1099/V2/W8ImyFormResponse.md)
 - [Avalara.SDK.model.A1099.V2.W9FormBaseRequest](docs/A1099/V2/W9FormBaseRequest.md)
 - [Avalara.SDK.model.A1099.V2.W9FormBaseResponse](docs/A1099/V2/W9FormBaseResponse.md)
 - [Avalara.SDK.model.A1099.V2.W9FormDataModel](docs/A1099/V2/W9FormDataModel.md)
 - [Avalara.SDK.model.A1099.V2.W9FormRequest](docs/A1099/V2/W9FormRequest.md)
 - [Avalara.SDK.model.A1099.V2.W9FormResponse](docs/A1099/V2/W9FormResponse.md)
