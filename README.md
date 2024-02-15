# Avalara.SDK

Avalara Shipping Verification only

- API version: 3.1.0

API for evaluating transactions against direct-to-consumer Beverage Alcohol shipping regulations.

This API is currently in beta.



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
  <groupId>Avalara.SDK</groupId>
  <artifactId>Avalara.SDK</artifactId>
  <version>2.4.29</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
  mavenCentral()     // Needed if the 'Avalara.SDK' jar has been published to maven central.
  mavenLocal()       // Needed if the 'Avalara.SDK' jar has been published to the local maven repo.
}

dependencies {
  implementation "Avalara.SDK:Avalara.SDK:2.4.29"
}
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/Avalara.SDK-2.4.29.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import Avalara.SDK.*;
import Avalara.SDK.auth.*;
import Avalara.SDK.model.Avatax.*;
import Avalara.SDK.api.Avatax.AddressesApi;

public class AddressesApiExample {

  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.setAppName("Test");
    configuration.setAppVersion("1.0");
    configuration.setMachineName("LocalBox");
    configuration.setTimeout(5000);
    configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
    // Configure HTTP basic authorization
    configuration.setUsername("YOUR USERNAME");
    configuration.setPassword("YOUR PASSWORD");
    // Configure OAuth2 access token for authorization
    configuration.setBearerToken("YOUR ACCESS TOKEN");

    ApiClient apiClient = new ApiClient(configuration);
    AddressesApi apiInstance = new AddressesApi(apiClient);
    String xAvalaraClient = "Swagger UI; 22.7.0; Custom; 1.0"; // String | Identifies the software you are using to call this API.  For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
    AddressValidationInfo body = new AddressValidationInfo(); // AddressValidationInfo | The address to resolve
    try {
      AddressResolutionModel result = apiInstance.resolveAddressPost(xAvalaraClient, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#resolveAddressPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for Authorization

Authentication schemes defined for the API:
<a name="OAuth Client Credentials Flow"></a>
### OAuth Client Credentials

- **Type**: OAuth
- **Flow**: client_credentials
- **Scopes**:
  - avatax_api: avatax_api scope.

```java
import Avalara.SDK.*;
import Avalara.SDK.auth.*;
import Avalara.SDK.model.Avatax.*;
import Avalara.SDK.api.Avatax.AddressesApi;

public class AddressesApiExample {

  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.setAppName("Test");
    configuration.setAppVersion("1.0");
    configuration.setMachineName("LocalBox");
    configuration.setTimeout(5000);
    configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
    // Configure OAUTH2 Client Credentials flow
    configuration.setClientId("YOUR CLIENT_ID");
    configuration.setClientSecret("YOUR CLIENT_SECRET");

    ApiClient apiClient = new ApiClient(configuration);
    AddressesApi apiInstance = new AddressesApi(apiClient);
    String xAvalaraClient = "Swagger UI; 22.7.0; Custom; 1.0"; // String | Identifies the software you are using to call this API.  For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
    AddressValidationInfo body = new AddressValidationInfo(); // AddressValidationInfo | The address to resolve
    try {
      // SDK will fetch OAuth token using client creds flow with Avalara Identity and append Authorization header to the request with the access token.
      AddressResolutionModel result = apiInstance.resolveAddressPost(xAvalaraClient, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#resolveAddressPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

<a name="OAuth Device Code Flow"></a>
### OAuth Device Code Flow

- **Type**: OAuth
- **Flow**: device_code
- **Scopes**:
  - avatax_api: avatax_api scope.

```java
import Avalara.SDK.*;
import Avalara.SDK.auth.*;
import Avalara.SDK.model.Avatax.*;
import Avalara.SDK.api.Avatax.AddressesApi;

public class AddressesApiExample {

  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.setAppName("Test");
    configuration.setAppVersion("1.0");
    configuration.setMachineName("LocalBox");
    configuration.setTimeout(5000);
    configuration.setEnvironment(AvaTaxEnvironment.Sandbox);
    // Configure OAUTH2 Device code flow
    configuration.setClientId("YOUR CLIENT_ID");

    DeviceAuthResponse response = ApiClientHelper.initiateDeviceAuthorizationOAuth(null, configuration);
    DeviceAccessTokenResponse tokenResponse = ApiClientHelper.getAccessTokenForDeviceFlow(response.getDeviceCode(), configuration);
    configuration.setBearerToken(tokenResponse.getAccessToken());

    ApiClient apiClient = new ApiClient(configuration);
    AddressesApi apiInstance = new AddressesApi(apiClient);
    String xAvalaraClient = "Swagger UI; 22.7.0; Custom; 1.0"; // String | Identifies the software you are using to call this API.  For more information on the client header, see [Client Headers](https://developer.avalara.com/avatax/client-headers/) .
    AddressValidationInfo body = new AddressValidationInfo(); // AddressValidationInfo | The address to resolve
    try {
      // SDK will fetch OAuth token using client creds flow with Avalara Identity and append Authorization header to the request with the access token.
      AddressResolutionModel result = apiInstance.resolveAddressPost(xAvalaraClient, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressesApi#resolveAddressPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

<a name="documentation-for-EInvoicing-V1-api-endpoints"></a>
### EInvoicing V1 API Documentation

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataInputFieldsApi* | [**getDataInputFields**](docs/EInvoicing/V1/DataInputFieldsApi.md#getdatainputfields) | **GET** /data-input-fields | Returns the mandatory and conditional invoice or creditnote input fields for different country mandates
*DocumentsApi* | [**downloadDocument**](docs/EInvoicing/V1/DocumentsApi.md#downloaddocument) | **GET** /documents/{documentId}/$download | Returns a copy of the document
*DocumentsApi* | [**getDocumentList**](docs/EInvoicing/V1/DocumentsApi.md#getdocumentlist) | **GET** /documents | Returns a summary of documents for a date range
*DocumentsApi* | [**getDocumentStatus**](docs/EInvoicing/V1/DocumentsApi.md#getdocumentstatus) | **GET** /document/{documentId}/status | Checks the status of a document
*DocumentsApi* | [**submitDocument**](docs/EInvoicing/V1/DocumentsApi.md#submitdocument) | **POST** /documents | Submits a document to Avalara E-Invoicing API
*MandatesApi* | [**getMandates**](docs/EInvoicing/V1/MandatesApi.md#getmandates) | **GET** /mandates | List country mandates that are supported by the Avalara E-Invoicing platform

<a name="documentation-for-models"></a>
## Documentation for Models

<a name="documentation-for-EInvoicing-V1-models"></a>
### EInvoicing V1 Model Documentation

 - [Avalara.SDK.model.EInvoicing.V1.BadDownloadRequest](docs/EInvoicing/V1/BadDownloadRequest.md)
 - [Avalara.SDK.model.EInvoicing.V1.BadRequest](docs/EInvoicing/V1/BadRequest.md)
 - [Avalara.SDK.model.EInvoicing.V1.ConditionalForField](docs/EInvoicing/V1/ConditionalForField.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputField](docs/EInvoicing/V1/DataInputField.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputFieldNotUsedFor](docs/EInvoicing/V1/DataInputFieldNotUsedFor.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputFieldOptionalFor](docs/EInvoicing/V1/DataInputFieldOptionalFor.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputFieldRequiredFor](docs/EInvoicing/V1/DataInputFieldRequiredFor.md)
 - [Avalara.SDK.model.EInvoicing.V1.DataInputFieldsResponse](docs/EInvoicing/V1/DataInputFieldsResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentListResponse](docs/EInvoicing/V1/DocumentListResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentStatusResponse](docs/EInvoicing/V1/DocumentStatusResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentSubmissionError](docs/EInvoicing/V1/DocumentSubmissionError.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentSubmitResponse](docs/EInvoicing/V1/DocumentSubmitResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.DocumentSummary](docs/EInvoicing/V1/DocumentSummary.md)
 - [Avalara.SDK.model.EInvoicing.V1.ForbiddenError](docs/EInvoicing/V1/ForbiddenError.md)
 - [Avalara.SDK.model.EInvoicing.V1.InputDataFormats](docs/EInvoicing/V1/InputDataFormats.md)
 - [Avalara.SDK.model.EInvoicing.V1.InternalServerError](docs/EInvoicing/V1/InternalServerError.md)
 - [Avalara.SDK.model.EInvoicing.V1.Mandate](docs/EInvoicing/V1/Mandate.md)
 - [Avalara.SDK.model.EInvoicing.V1.MandatesResponse](docs/EInvoicing/V1/MandatesResponse.md)
 - [Avalara.SDK.model.EInvoicing.V1.NotFoundError](docs/EInvoicing/V1/NotFoundError.md)
 - [Avalara.SDK.model.EInvoicing.V1.NotUsedForField](docs/EInvoicing/V1/NotUsedForField.md)
 - [Avalara.SDK.model.EInvoicing.V1.RequiredWhenField](docs/EInvoicing/V1/RequiredWhenField.md)
 - [Avalara.SDK.model.EInvoicing.V1.StatusEvent](docs/EInvoicing/V1/StatusEvent.md)
 - [Avalara.SDK.model.EInvoicing.V1.SubmitDocumentData](docs/EInvoicing/V1/SubmitDocumentData.md)
 - [Avalara.SDK.model.EInvoicing.V1.SubmitDocumentMetadata](docs/EInvoicing/V1/SubmitDocumentMetadata.md)
 - [Avalara.SDK.model.EInvoicing.V1.WorkflowIds](docs/EInvoicing/V1/WorkflowIds.md)
