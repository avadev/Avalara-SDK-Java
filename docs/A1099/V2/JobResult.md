

# JobResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**dryRun** | **Boolean** | Dry run. If &#x60;true&#x60;, this job only simulates the changes but doesn&#39;t actually persist them. |  [optional] |
|**upsert** | **Boolean** | Upsert. If &#x60;true&#x60;, this job will first attempt to update existing records if matches can be found. Matches are done in the following order:  * Form ID  * Form Reference ID and tax year  * Form TIN and tax year |  [optional] |
|**status** | **String** | Status of the job |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**totalProcessed** | **Integer** | Total number of forms processed |  [optional] |
|**totalRows** | **Integer** | Total number of forms in the request |  [optional] |
|**updatedValid** | **Integer** | Number of forms updated and valid for e-filing and e-delivery |  [optional] |
|**updatedNoEmail** | **Integer** | Number of forms updated and valid for e-filing but missing email or email is undeliverable |  [optional] |
|**updatedInvalid** | **Integer** | Number of forms updated but invalid for e-filing |  [optional] |
|**skippedDuplicate** | **Integer** | Number of forms skipped because they would have updated a record already updated once in the request |  [optional] |
|**skippedInvalid** | **Integer** | Number of forms skipped because they would have made a form invalid and the form is already e-filed or scheduled for e-filing |  [optional] |
|**skippedMultipleMatches** | **Integer** | Number of forms skipped because they matched multiple forms |  [optional] |
|**notFound** | **Integer** | Number of forms skipped because no matching form or issuer could be found |  [optional] |
|**createdInvalid** | **Integer** | Number of new forms created because no matching form could be found (and &#x60;upsert&#x60; was true) - with errors |  [optional] |
|**createdNoEmail** | **Integer** | Number of new forms created because no matching form could be found (and &#x60;upsert&#x60; was true) - valid for e-filing but missing email or email is undeliverable |  [optional] |
|**createdValid** | **Integer** | Number of new forms created because no matching form could be found (and &#x60;upsert&#x60; was true) - valid for e-filing and e-delivery |  [optional] |



