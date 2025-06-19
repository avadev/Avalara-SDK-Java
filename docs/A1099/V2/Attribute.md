

# Attribute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** |  |  [optional] |
|**upsert** | **Boolean** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**totalProcessed** | **Integer** |  |  [optional] |
|**totalRows** | **Integer** |  |  [optional] |
|**updatedValid** | **Integer** |  |  [optional] |
|**updatedNoEmail** | **Integer** |  |  [optional] |
|**updatedInvalid** | **Integer** |  |  [optional] |
|**skippedDuplicate** | **Integer** |  |  [optional] |
|**skippedInvalid** | **Integer** |  |  [optional] |
|**skippedMultipleMatches** | **Integer** |  |  [optional] |
|**notFound** | **Integer** |  |  [optional] |
|**createdInvalid** | **Integer** |  |  [optional] |
|**createdNoEmail** | **Integer** |  |  [optional] |
|**createdValid** | **Integer** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;InProgress&quot; |
| SUCCESS | &quot;Success&quot; |
| FAILED | &quot;Failed&quot; |



