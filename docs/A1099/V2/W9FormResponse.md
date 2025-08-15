

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



