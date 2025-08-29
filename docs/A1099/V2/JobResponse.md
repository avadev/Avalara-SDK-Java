

# JobResponse

Response model for job operations

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier for the job |  [optional] |
|**type** | **String** | Job type identifier. Will always be \&quot;update_job\&quot; for bulk upsert operations |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the job (e.g., Success, Failed, InProgress) |  [optional] |
|**errorMessage** | **String** | Error message if the job failed, null otherwise |  [optional] |
|**totalProcessed** | **Integer** | Total number of forms processed. Value can be 0 or another value based on what the job has available |  [optional] |
|**totalRows** | **Integer** | Total number of forms in the request. Value can be 0 or another value based on what the job has available |  [optional] |
|**updatedValid** | **Integer** | Number of forms updated and valid for e-filing and e-delivery. Value can be 0 or another value based on what the job has available |  [optional] |
|**updatedNoEmail** | **Integer** | Number of forms updated and valid for e-filing but missing email or email is undeliverable. Value can be 0 or another value based on what the job has available |  [optional] |
|**updatedInvalid** | **Integer** | Number of forms updated but invalid for e-filing. Value can be 0 or another value based on what the job has available |  [optional] |
|**skippedDuplicate** | **Integer** | Number of forms skipped because they would have updated a record already updated once in the request. Value can be 0 or another value based on what the job has available |  [optional] |
|**skippedInvalid** | **Integer** | Number of forms skipped because they would have made a form invalid and the form is already e-filed or scheduled for e-filing. Value can be 0 or another value based on what the job has available |  [optional] |
|**skippedMultipleMatches** | **Integer** | Number of forms skipped because they matched multiple forms. Value can be 0 or another value based on what the job has available |  [optional] |
|**notFound** | **Integer** | Number of forms skipped because no matching form or issuer could be found. Value can be 0 or another value based on what the job has available |  [optional] |
|**createdInvalid** | **Integer** | Number of new forms created because no matching form could be found (and &#x60;upsert&#x60; was true) - with errors. Value can be 0 or another value based on what the job has available |  [optional] |
|**createdNoEmail** | **Integer** | Number of new forms created because no matching form could be found (and &#x60;upsert&#x60; was true) - valid for e-filing but missing email or email is undeliverable. Value can be 0 or another value based on what the job has available |  [optional] |
|**createdValid** | **Integer** | Number of new forms created because no matching form could be found (and &#x60;upsert&#x60; was true) - valid for e-filing and e-delivery. Value can be 0 or another value based on what the job has available |  [optional] |
|**dryRun** | **Boolean** | Dry run. If &#x60;true&#x60;, this job only simulates the changes but doesn&#39;t actually persist them. |  [optional] |
|**upsert** | **Boolean** | Upsert. If &#x60;true&#x60;, this job will first attempt to update existing records if matches can be found. Matches are done in the following order: Form ID, Form Reference ID and tax year, Form TIN and tax year. |  [optional] |
|**link** | **String** | Link to access the job details |  [optional] |
|**processedForms** | [**List&lt;Get1099Form200Response&gt;**](Get1099Form200Response.md) | List of processed forms returned when bulk-upsert processes ≤1000 records. Same format as GET /1099/forms response. Only available in bulk-upsert endpoint responses. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;InProgress&quot; |
| SUCCESS | &quot;Success&quot; |
| FAILED | &quot;Failed&quot; |



