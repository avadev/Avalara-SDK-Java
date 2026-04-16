

# CodeListVersion

Represents a versioned definition of a code list for a specific jurisdiction and date range

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**versionReasons** | **List&lt;String&gt;** | List of free-text reasons explaining why this version of the code list exists (for example, initial introduction, regulatory update, addition/deprecation of codes). Useful for audit and change tracking. |  [optional] |
|**jurisEffectiveDate** | **LocalDate** | Date from which this version of the code list becomes legally or operationally effective in the jurisdiction. Typically corresponds to a go-live, mandate, or release date. |  [optional] |
|**jurisSunsetDate** | **LocalDate** | Date after which this version of the code list must no longer be used in the jurisdiction. Use a far-future date (e.g., 9999-12-31) when the sunset is not yet known. |  [optional] |
|**locale** | **String** | Language–region locale identifier indicating the language and regional variant for descriptions in this version of the code list. Follows BCP-47 format such as en-US, fr-FR, de-DE. |  [optional] |
|**values** | [**List&lt;CodeListValue&gt;**](CodeListValue.md) | Array of code entries defined in this version of the code list. Each entry contains the machine-readable code value and its human-readable description in the given locale. |  [optional] |



