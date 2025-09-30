

# W9FormRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The form type (always \&quot;w9\&quot; for this model). |  [optional] [readonly] |
|**name** | **String** | The name of the individual or entity associated with the form. |  |
|**businessName** | **String** | The name of the business associated with the form. |  [optional] |
|**businessClassification** | [**BusinessClassificationEnum**](#BusinessClassificationEnum) | The classification of the business.  Available values:  - Individual: Individual/sole proprietor  - C Corporation: C Corporation  - S Corporation: S Corporation  - Partnership: Partnership  - Trust/estate: Trust/estate  - LLC-C: Limited liability company (C Corporation)  - LLC-S: Limited liability company (S Corporation)  - LLC-P: Limited liability company (Partnership)  - Other: Other (requires BusinessOther field to be populated) |  |
|**businessOther** | **String** | The classification description when \&quot;businessClassification\&quot; is \&quot;Other\&quot;. |  [optional] |
|**foreignPartnerOwnerOrBeneficiary** | **Boolean** | Indicates whether the individual is a foreign partner, owner, or beneficiary. |  [optional] |
|**exemptPayeeCode** | **String** | The exempt payee code. Allowed values (1–13):  - 1 — Organization exempt under §501(a) or IRA; custodial account under §403(b)(7)  - 2 — U.S. government or its agencies/instrumentalities  - 3 — U.S. state, DC, U.S. territory/possession, or their political subdivisions/agencies/instrumentalities  - 4 — Foreign government or its political subdivisions/agencies/instrumentalities  - 5 — Corporation  - 6 — Dealer in securities or commodities required to register in the U.S., DC, or U.S. territory/possession  - 7 — Futures commission merchant registered with the CFTC  - 8 — Real estate investment trust (REIT)  - 9 — Entity registered at all times during the tax year under the Investment Company Act of 1940  - 10 — Common trust fund operated by a bank under §584(a)  - 11 — Financial institution (see §581)  - 12 — Broker (nominee/custodian)  - 13 — Trust exempt under §664 or described in §4947 |  [optional] |
|**exemptFatcaCode** | **String** | The exemption from FATCA reporting code. Allowed values (A–M):  - A — Tax‑exempt organization under §501(a) or IRA (§7701(a)(37))  - B — U.S. government or any of its agencies/instrumentalities  - C — U.S. state, DC, territory/possession, or their political subdivisions/instrumentalities  - D — Corporation whose stock is regularly traded on an established securities market  - E — Corporation that is a member of the same expanded affiliated group as a D corporation  - F — Registered dealer in securities/commodities/derivatives  - G — REIT (Real Estate Investment Trust)  - H — Regulated investment company (§851) or entity registered all year under the Investment Company Act of 1940  - I — Common trust fund (§584(a))  - J — Bank (§581)  - K — Broker  - L — Charitable remainder trust (§664) or trust described in §4947(a)(1)  - M — Trust under §403(b) plan or §457(g) plan |  [optional] |
|**foreignCountryIndicator** | **Boolean** | Indicates whether the individual or entity is in a foreign country. |  [optional] |
|**address** | **String** | The address of the individual or entity. |  |
|**foreignAddress** | **String** | The foreign address of the individual or entity. |  [optional] |
|**city** | **String** | The city of the address. |  |
|**state** | [**StateEnum**](#StateEnum) | The state of the address. |  |
|**zip** | **String** | The ZIP code of the address. |  |
|**accountNumber** | **String** | The account number associated with the form. |  [optional] |
|**tinType** | **String** | Tax Identification Number (TIN) type. SSN/ITIN (for individuals) and EIN (for businesses). |  |
|**tin** | **String** | The taxpayer identification number (TIN). |  |
|**backupWithholding** | **Boolean** | Indicates whether backup withholding applies. |  [optional] |
|**is1099able** | **Boolean** | Indicates whether the individual or entity should be issued a 1099 form. |  [optional] |
|**eDeliveryConsentedAt** | **OffsetDateTime** | The date when e-delivery was consented. |  [optional] |
|**signature** | **String** | The signature of the form. |  [optional] |
|**companyId** | **String** | The ID of the associated company. Required when creating a form. |  [optional] |
|**referenceId** | **String** | A reference identifier for the form. |  [optional] |
|**email** | **String** | The email address of the individual associated with the form. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| W4 | &quot;W4&quot; |
| W8_BEN | &quot;W8Ben&quot; |
| W8_BEN_E | &quot;W8BenE&quot; |
| W8_IMY | &quot;W8Imy&quot; |
| W9 | &quot;W9&quot; |



## Enum: BusinessClassificationEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;Individual&quot; |
| C_CORPORATION | &quot;CCorporation&quot; |
| S_CORPORATION | &quot;SCorporation&quot; |
| PARTNERSHIP | &quot;Partnership&quot; |
| TRUST_ESTATE | &quot;TrustEstate&quot; |
| LLC_C | &quot;LlcC&quot; |
| LLC_S | &quot;LlcS&quot; |
| LLC_P | &quot;LlcP&quot; |
| OTHER | &quot;Other&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| AA | &quot;AA&quot; |
| AE | &quot;AE&quot; |
| AK | &quot;AK&quot; |
| AL | &quot;AL&quot; |
| AP | &quot;AP&quot; |
| AR | &quot;AR&quot; |
| AS | &quot;AS&quot; |
| AZ | &quot;AZ&quot; |
| CA | &quot;CA&quot; |
| CO | &quot;CO&quot; |
| CT | &quot;CT&quot; |
| DC | &quot;DC&quot; |
| DE | &quot;DE&quot; |
| FL | &quot;FL&quot; |
| FM | &quot;FM&quot; |
| GA | &quot;GA&quot; |
| GU | &quot;GU&quot; |
| HI | &quot;HI&quot; |
| IA | &quot;IA&quot; |
| ID | &quot;ID&quot; |
| IL | &quot;IL&quot; |
| IN | &quot;IN&quot; |
| KS | &quot;KS&quot; |
| KY | &quot;KY&quot; |
| LA | &quot;LA&quot; |
| MA | &quot;MA&quot; |
| MD | &quot;MD&quot; |
| ME | &quot;ME&quot; |
| MH | &quot;MH&quot; |
| MI | &quot;MI&quot; |
| MN | &quot;MN&quot; |
| MO | &quot;MO&quot; |
| MP | &quot;MP&quot; |
| MS | &quot;MS&quot; |
| MT | &quot;MT&quot; |
| NC | &quot;NC&quot; |
| ND | &quot;ND&quot; |
| NE | &quot;NE&quot; |
| NH | &quot;NH&quot; |
| NJ | &quot;NJ&quot; |
| NM | &quot;NM&quot; |
| NV | &quot;NV&quot; |
| NY | &quot;NY&quot; |
| OH | &quot;OH&quot; |
| OK | &quot;OK&quot; |
| OR | &quot;OR&quot; |
| PA | &quot;PA&quot; |
| PR | &quot;PR&quot; |
| PW | &quot;PW&quot; |
| RI | &quot;RI&quot; |
| SC | &quot;SC&quot; |
| SD | &quot;SD&quot; |
| TN | &quot;TN&quot; |
| TX | &quot;TX&quot; |
| UT | &quot;UT&quot; |
| VA | &quot;VA&quot; |
| VI | &quot;VI&quot; |
| VT | &quot;VT&quot; |
| WA | &quot;WA&quot; |
| WI | &quot;WI&quot; |
| WV | &quot;WV&quot; |
| WY | &quot;WY&quot; |



