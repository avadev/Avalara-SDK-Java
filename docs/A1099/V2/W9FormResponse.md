

# W9FormResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the individual or entity associated with the form. |  [optional] |
|**businessName** | **String** | The name of the business associated with the form. |  [optional] |
|**businessClassification** | **String** | The classification of the business. |  [optional] |
|**businessOther** | **String** | The classification description when \&quot;businessClassification\&quot; is \&quot;Other\&quot;. |  [optional] |
|**foreignPartnerOwnerOrBeneficiary** | **Boolean** | Indicates whether the individual is a foreign partner, owner, or beneficiary. |  [optional] |
|**exemptPayeeCode** | **String** | The exempt payee code. |  [optional] |
|**exemptFatcaCode** | **String** | The exemption from FATCA reporting code. |  [optional] |
|**foreignCountryIndicator** | **Boolean** | Indicates whether the individual or entity is in a foreign country. |  [optional] |
|**address** | **String** | The address of the individual or entity. |  [optional] |
|**foreignAddress** | **String** | The foreign address of the individual or entity. |  [optional] |
|**city** | **String** | The city of the address. |  [optional] |
|**state** | **String** | The state of the address. |  [optional] |
|**zip** | **String** | The ZIP code of the address. |  [optional] |
|**accountNumber** | **String** | The account number associated with the form. |  [optional] |
|**tinType** | **String** | The type of TIN provided. |  [optional] |
|**tin** | **String** | The taxpayer identification number (TIN). |  [optional] |
|**backupWithholding** | **Boolean** | Indicates whether backup withholding applies. |  [optional] |
|**is1099able** | **Boolean** | Indicates whether the individual or entity should be issued a 1099 form. |  [optional] |
|**tinMatchStatus** | [**TinMatchStatusResponse**](TinMatchStatusResponse.md) | The TIN Match status from IRS. |  [optional] |
|**id** | **String** | The unique identifier for the form. |  [optional] |
|**type** | **String** | The form type. |  [optional] |
|**entryStatus** | **String** | The form status. |  [optional] |
|**entryStatusDate** | **OffsetDateTime** | The timestamp for the latest status update. |  [optional] |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |
|**companyId** | **String** | The ID of the associated company. |  [optional] |
|**displayName** | **String** | The display name associated with the form. |  [optional] |
|**email** | **String** | The email address of the individual associated with the form. |  [optional] |
|**archived** | **Boolean** | Indicates whether the form is archived. |  [optional] |
|**signature** | **String** | The signature of the form. |  [optional] |
|**signedDate** | **OffsetDateTime** | The date the form was signed. |  [optional] |
|**eDeliveryConsentedAt** | **OffsetDateTime** | The date when e-delivery was consented. |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation date of the form. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The last updated date of the form. |  [optional] |



