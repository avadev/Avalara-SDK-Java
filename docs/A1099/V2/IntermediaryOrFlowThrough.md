

# IntermediaryOrFlowThrough

Intermediary or flow-through entity information for tax forms

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ein** | **String** | EIN (Employer Identification Number) of the intermediary or flow-through entity |  [optional] |
|**chap3StatusCode** | [**Chap3StatusCodeEnum**](#Chap3StatusCodeEnum) | Chapter 3 status code for the intermediary or flow-through entity. Available values: - 01: U.S. Withholding Agent - FI (Deprecated - valid only for tax years prior to 2020) - 02: U.S. Withholding Agent - Other (Deprecated - valid only for tax years prior to 2020) - 03: Territory FI - treated as U.S. Person - 04: Territory FI - not treated as U.S. Person - 05: U.S. branch - treated as U.S. Person - 06: U.S. branch - not treated as U.S. Person - 07: U.S. branch - ECI presumption applied - 08: Partnership other than Withholding Foreign Partnership - 09: Withholding Foreign Partnership - 10: Trust other than Withholding Foreign Trust - 11: Withholding Foreign Trust - 12: Qualified Intermediary - 13: Qualified Securities Lender - Qualified Intermediary - 14: Qualified Securities Lender - Other - 15: Corporation - 16: Individual - 17: Estate - 18: Private Foundation - 19: Government or International Organization - 20: Tax Exempt Organization (Section 501(c) entities) - 21: Unknown Recipient - 22: Artist or Athlete - 23: Pension - 24: Foreign Central Bank of Issue - 25: Nonqualified Intermediary - 26: Hybrid entity making Treaty Claim - 27: Withholding Rate Pool - General - 28: Withholding Rate Pool - Exempt Organization - 29: PAI Withholding Rate Pool - General - 30: PAI Withholding Rate Pool - Exempt Organization - 31: Agency Withholding Rate Pool - General - 32: Agency Withholding Rate Pool - Exempt Organization - 34: U.S. Withholding Agent-Foreign branch of FI (Deprecated - valid only for tax years prior to 2020) - 35: Qualified Derivatives Dealer - 36: Foreign Government - Integral Part - 37: Foreign Government - Controlled Entity - 38: Publicly Traded Partnership - 39: Disclosing Qualified Intermediary |  [optional] |
|**chap4StatusCode** | [**Chap4StatusCodeEnum**](#Chap4StatusCodeEnum) | Chapter 4 status code for the intermediary or flow-through entity. Available values: - 01: U.S. Withholding Agent - FI - 02: U.S. Withholding Agent - Other - 03: Territory FI - not treated as U.S. Person - 04: Territory FI - treated as U.S. Person - 05: Participating FFI - Other - 06: Participating FFI - Reporting Model 2 FFI - 07: Registered Deemed - Compliant FFI-Reporting Model 1 FFI - 08: Registered Deemed - Compliant FFI-Sponsored Entity - 09: Registered Deemed - Compliant FFI-Other - 10: Certified Deemed - Compliant FFI-Other - 11: Certified Deemed - Compliant FFI-FFI with Low Value Accounts - 12: Certified Deemed - Compliant FFI-Non-Registering Local Bank - 13: Certified Deemed - Compliant FFI-Sponsored Entity - 14: Certified Deemed - Compliant FFI-Investment Advisor or Investment Manager - 15: Nonparticipating FFI - 16: Owner-Documented FFI - 17: U.S. Branch - treated as U.S. person - 18: U.S. Branch - not treated as U.S. person (reporting under section 1471) - 19: Passive NFFE identifying Substantial U.S. Owners - 20: Passive NFFE with no Substantial U.S. Owners - 21: Publicly Traded NFFE or Affiliate of Publicly Traded NFFE - 22: Active NFFE - 23: Individual - 24: Section 501(c) Entities - 25: Excepted Territory NFFE - 26: Excepted NFFE - Other - 27: Exempt Beneficial Owner - 28: Entity Wholly Owned by Exempt Beneficial Owners - 29: Unknown Recipient - 30: Recalcitrant Account Holder - 31: Nonreporting IGA FFI - 32: Direct reporting NFFE - 33: U.S. reportable account - 34: Non-consenting U.S. account - 35: Sponsored direct reporting NFFE - 36: Excepted Inter-affiliate FFI - 37: Undocumented Preexisting Obligation - 38: U.S. Branch - ECI presumption applied - 39: Account Holder of Excluded Financial Account - 40: Passive NFFE reported by FFI - 41: NFFE subject to 1472 withholding - 42: Recalcitrant Pool - No U.S. Indicia - 43: Recalcitrant Pool - U.S. Indicia - 44: Recalcitrant Pool - Dormant Account - 45: Recalcitrant Pool - U.S. Persons - 46: Recalcitrant Pool - Passive NFFEs - 47: Nonparticipating FFI Pool - 48: U.S. Payees Pool - 49: QI - Recalcitrant Pool-General - 50: U.S. Withholding Agent-Foreign branch of FI |  [optional] |
|**name** | **String** | Name of the intermediary or flow-through entity |  [optional] |
|**giin** | **String** | GIIN (Global Intermediary Identification Number) of the intermediary or flow-through entity |  [optional] |
|**countryCode** | **String** | Country code for the intermediary or flow-through entity |  [optional] |
|**foreignTin** | **String** | Foreign TIN of the intermediary or flow-through entity |  [optional] |
|**address** | **String** | Address of the intermediary or flow-through entity |  [optional] |
|**city** | **String** | City of the intermediary or flow-through entity |  [optional] |
|**state** | **String** | State of the intermediary or flow-through entity |  [optional] |
|**zip** | **String** | Zip code of the intermediary or flow-through entity |  [optional] |



## Enum: Chap3StatusCodeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _34 | &quot;34&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |
| _07 | &quot;07&quot; |
| _08 | &quot;08&quot; |
| _09 | &quot;09&quot; |
| _10 | &quot;10&quot; |
| _11 | &quot;11&quot; |
| _12 | &quot;12&quot; |
| _13 | &quot;13&quot; |
| _14 | &quot;14&quot; |
| _15 | &quot;15&quot; |
| _16 | &quot;16&quot; |
| _17 | &quot;17&quot; |
| _18 | &quot;18&quot; |
| _19 | &quot;19&quot; |
| _20 | &quot;20&quot; |
| _21 | &quot;21&quot; |
| _22 | &quot;22&quot; |
| _23 | &quot;23&quot; |
| _24 | &quot;24&quot; |
| _25 | &quot;25&quot; |
| _26 | &quot;26&quot; |
| _27 | &quot;27&quot; |
| _28 | &quot;28&quot; |
| _29 | &quot;29&quot; |
| _30 | &quot;30&quot; |
| _31 | &quot;31&quot; |
| _32 | &quot;32&quot; |
| _35 | &quot;35&quot; |
| _36 | &quot;36&quot; |
| _37 | &quot;37&quot; |
| _38 | &quot;38&quot; |
| _39 | &quot;39&quot; |



## Enum: Chap4StatusCodeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |
| _07 | &quot;07&quot; |
| _08 | &quot;08&quot; |
| _09 | &quot;09&quot; |
| _10 | &quot;10&quot; |
| _11 | &quot;11&quot; |
| _12 | &quot;12&quot; |
| _13 | &quot;13&quot; |
| _14 | &quot;14&quot; |
| _15 | &quot;15&quot; |
| _16 | &quot;16&quot; |
| _17 | &quot;17&quot; |
| _18 | &quot;18&quot; |
| _19 | &quot;19&quot; |
| _20 | &quot;20&quot; |
| _21 | &quot;21&quot; |
| _22 | &quot;22&quot; |
| _23 | &quot;23&quot; |
| _24 | &quot;24&quot; |
| _25 | &quot;25&quot; |
| _26 | &quot;26&quot; |
| _27 | &quot;27&quot; |
| _28 | &quot;28&quot; |
| _29 | &quot;29&quot; |
| _30 | &quot;30&quot; |
| _31 | &quot;31&quot; |
| _32 | &quot;32&quot; |
| _33 | &quot;33&quot; |
| _34 | &quot;34&quot; |
| _35 | &quot;35&quot; |
| _36 | &quot;36&quot; |
| _37 | &quot;37&quot; |
| _38 | &quot;38&quot; |
| _39 | &quot;39&quot; |
| _40 | &quot;40&quot; |
| _41 | &quot;41&quot; |
| _42 | &quot;42&quot; |
| _43 | &quot;43&quot; |
| _44 | &quot;44&quot; |
| _45 | &quot;45&quot; |
| _46 | &quot;46&quot; |
| _47 | &quot;47&quot; |
| _48 | &quot;48&quot; |
| _49 | &quot;49&quot; |
| _50 | &quot;50&quot; |



