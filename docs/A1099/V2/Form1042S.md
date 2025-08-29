

# Form1042S

Form 1042-S: Foreign Person's U.S. Source Income Subject to Withholding

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) |  |  [optional] [readonly] |
|**uniqueFormId** | **String** | Unique form identifier |  |
|**recipientDateOfBirth** | **LocalDate** | Recipient&#39;s date of birth |  [optional] |
|**recipientGiin** | **String** | Recipient&#39;s Global Intermediary Identification Number (GIIN). A valid GIIN looks like &#39;XXXXXX.XXXXX.XX.XXX&#39;. |  [optional] |
|**recipientForeignTin** | **String** | Recipient&#39;s foreign TIN. Required if email is specified, must fill either this or Chap3StatusCode. |  [optional] |
|**lobCode** | [**LobCodeEnum**](#LobCodeEnum) | Limitation on Benefits (LOB) code for tax treaty purposes.  Available values:  - 01: Individual (Deprecated - valid only for tax years prior to 2019)  - 02: Government - contracting state/political subdivision/local authority  - 03: Tax exempt pension trust/Pension fund  - 04: Tax exempt/Charitable organization  - 05: Publicly-traded corporation  - 06: Subsidiary of publicly-traded corporation  - 07: Company that meets the ownership and base erosion test  - 08: Company that meets the derivative benefits test  - 09: Company with an item of income that meets the active trade or business test  - 10: Discretionary determination  - 11: Other  - 12: No LOB article in treaty |  [optional] |
|**incomeCode** | [**IncomeCodeEnum**](#IncomeCodeEnum) | Income code.  Available values:    Interest:  - 01: Interest paid by US obligors - general  - 02: Interest paid on real property mortgages  - 03: Interest paid to controlling foreign corporations  - 04: Interest paid by foreign corporations  - 05: Interest on tax-free covenant bonds  - 22: Interest paid on deposit with a foreign branch of a domestic corporation or partnership  - 29: Deposit interest  - 30: Original issue discount (OID)  - 31: Short-term OID  - 33: Substitute payment - interest  - 51: Interest paid on certain actively traded or publicly offered securities(1)  - 54: Substitute payments - interest from certain actively traded or publicly offered securities(1)    Dividend:  - 06: Dividends paid by U.S. corporations - general  - 07: Dividends qualifying for direct dividend rate  - 08: Dividends paid by foreign corporations  - 34: Substitute payment - dividends  - 40: Other dividend equivalents under IRC section 871(m) (formerly 871(l))  - 52: Dividends paid on certain actively traded or publicly offered securities(1)  - 53: Substitute payments - dividends from certain actively traded or publicly offered securities(1)  - 56: Dividend equivalents under IRC section 871(m) as a result of applying the combined transaction rules    Other:  - 09: Capital gains  - 10: Industrial royalties  - 11: Motion picture or television copyright royalties  - 12: Other royalties (for example, copyright, software, broadcasting, endorsement payments)  - 13: Royalties paid on certain publicly offered securities(1)  - 14: Real property income and natural resources royalties  - 15: Pensions, annuities, alimony, and/or insurance premiums  - 16: Scholarship or fellowship grants  - 17: Compensation for independent personal services(2)  - 18: Compensation for dependent personal services(2)  - 19: Compensation for teaching(2)  - 20: Compensation during studying and training(2)  - 23: Other income  - 24: Qualified investment entity (QIE) distributions of capital gains  - 25: Trust distributions subject to IRC section 1445  - 26: Unsevered growing crops and timber distributions by a trust subject to IRC section 1445  - 27: Publicly traded partnership distributions subject to IRC section 1446  - 28: Gambling winnings(3)  - 32: Notional principal contract income(4)  - 35: Substitute payment - other  - 36: Capital gains distributions  - 37: Return of capital  - 38: Eligible deferred compensation items subject to IRC section 877A(d)(1)  - 39: Distributions from a nongrantor trust subject to IRC section 877A(f)(1)  - 41: Guarantee of indebtedness  - 42: Earnings as an artist or athlete - no central withholding agreement(5)  - 43: Earnings as an artist or athlete - central withholding agreement(5)  - 44: Specified Federal procurement payments  - 50: Income previously reported under escrow procedure(6)  - 55: Taxable death benefits on life insurance contracts  - 57: Amount realized under IRC section 1446(f)  - 58: Publicly traded partnership distributions-undetermined |  |
|**grossIncome** | **Double** | Gross income |  |
|**withholdingIndicator** | [**WithholdingIndicatorEnum**](#WithholdingIndicatorEnum) | Withholding indicator  Available values:  - 3: Chapter 3  - 4: Chapter 4 |  |
|**taxCountryCode** | **String** | Country code |  |
|**exemptionCodeChap3** | [**ExemptionCodeChap3Enum**](#ExemptionCodeChap3Enum) | Exemption code (Chapter 3). Required if WithholdingIndicator is 3 (Chapter 3). Required when using TaxRateChap3.  Available values:  - Empty: Tax rate is due to backup withholding  - 00: Not exempt  - 01: Effectively connected income  - 02: Exempt under IRC (other than portfolio interest)  - 03: Income is not from US sources  - 04: Exempt under tax treaty  - 05: Portfolio interest exempt under IRC  - 06: QI that assumes primary withholding responsibility  - 07: WFP or WFT  - 08: U.S. branch treated as U.S. Person  - 09: Territory FI treated as U.S. Person  - 10: QI represents that income is exempt  - 11: QSL that assumes primary withholding responsibility  - 12: Payee subjected to chapter 4 withholding  - 22: QDD that assumes primary withholding responsibility  - 23: Exempt under section 897(l)  - 24: Exempt under section 892 |  [optional] |
|**exemptionCodeChap4** | [**ExemptionCodeChap4Enum**](#ExemptionCodeChap4Enum) | Exemption code (Chapter 4). Required if WithholdingIndicator is 4 (Chapter 4).  Available values:  - 00: Not exempt  - 13: Grandfathered payment  - 14: Effectively connected income  - 15: Payee not subject to chapter 4 withholding  - 16: Excluded nonfinancial payment  - 17: Foreign Entity that assumes primary withholding responsibility  - 18: U.S. Payees - of participating FFI or registered deemed - compliant FFI  - 19: Exempt from withholding under IGA(6)  - 20: Dormant account(7)  - 21: Other - payment not subject to chapter 4 withholding |  [optional] |
|**taxRateChap3** | [**TaxRateChap3Enum**](#TaxRateChap3Enum) | Tax rate (Chapter 3) - Required if WithholdingIndicator is 3 (Chapter 3).  Available values:  - 00.00: 0.00%  - 02.00: 2.00%  - 04.00: 4.00%  - 04.90: 4.90%  - 04.95: 4.95%  - 05.00: 5.00%  - 07.00: 7.00%  - 08.00: 8.00%  - 10.00: 10.00%  - 12.00: 12.00%  - 12.50: 12.50%  - 14.00: 14.00%  - 15.00: 15.00%  - 17.50: 17.50%  - 20.00: 20.00%  - 21.00: 21.00%  - 24.00: 24.00%  - 25.00: 25.00%  - 27.50: 27.50%  - 28.00: 28.00%  - 30.00: 30.00%  - 37.00: 37.00% |  [optional] |
|**withholdingAllowance** | **Double** | Withholding allowance |  [optional] |
|**federalTaxWithheld** | **Double** | Federal tax withheld |  [optional] |
|**taxNotDepositedIndicator** | **Boolean** | Tax not deposited indicator |  [optional] |
|**academicIndicator** | **Boolean** | Academic indicator |  [optional] |
|**taxWithheldOtherAgents** | **Double** | Tax withheld by other agents |  [optional] |
|**amountRepaid** | **Double** | Amount repaid to recipient |  [optional] |
|**taxPaidAgent** | **Double** | Tax paid by withholding agent |  [optional] |
|**chap3StatusCode** | [**Chap3StatusCodeEnum**](#Chap3StatusCodeEnum) | Chapter 3 status code - Required if WithholdingIndicator is 3 (Chapter 3)  Available values:  - 01: U.S. Withholding Agent - FI (Deprecated - valid only for tax years prior to 2020)  - 02: U.S. Withholding Agent - Other (Deprecated - valid only for tax years prior to 2020)  - 03: Territory FI - treated as U.S. Person  - 04: Territory FI - not treated as U.S. Person  - 05: U.S. branch - treated as U.S. Person  - 06: U.S. branch - not treated as U.S. Person  - 07: U.S. branch - ECI presumption applied  - 08: Partnership other than Withholding Foreign Partnership  - 09: Withholding Foreign Partnership  - 10: Trust other than Withholding Foreign Trust  - 11: Withholding Foreign Trust  - 12: Qualified Intermediary  - 13: Qualified Securities Lender - Qualified Intermediary  - 14: Qualified Securities Lender - Other  - 15: Corporation  - 16: Individual  - 17: Estate  - 18: Private Foundation  - 19: Government or International Organization  - 20: Tax Exempt Organization (Section 501(c) entities)  - 21: Unknown Recipient  - 22: Artist or Athlete  - 23: Pension  - 24: Foreign Central Bank of Issue  - 25: Nonqualified Intermediary  - 26: Hybrid entity making Treaty Claim  - 27: Withholding Rate Pool - General  - 28: Withholding Rate Pool - Exempt Organization  - 29: PAI Withholding Rate Pool - General  - 30: PAI Withholding Rate Pool - Exempt Organization  - 31: Agency Withholding Rate Pool - General  - 32: Agency Withholding Rate Pool - Exempt Organization  - 34: U.S. Withholding Agent-Foreign branch of FI (Deprecated - valid only for tax years prior to 2020)  - 35: Qualified Derivatives Dealer  - 36: Foreign Government - Integral Part  - 37: Foreign Government - Controlled Entity  - 38: Publicly Traded Partnership  - 39: Disclosing Qualified Intermediary |  [optional] |
|**chap4StatusCode** | [**Chap4StatusCodeEnum**](#Chap4StatusCodeEnum) | Chapter 4 status code. Required if WithholdingIndicator is 4 (Chapter 4). Required if email is specified, must fill either this or RecipientForeignTin.  Available values:  - 01: U.S. Withholding Agent - FI  - 02: U.S. Withholding Agent - Other  - 03: Territory FI - not treated as U.S. Person  - 04: Territory FI - treated as U.S. Person  - 05: Participating FFI - Other  - 06: Participating FFI - Reporting Model 2 FFI  - 07: Registered Deemed - Compliant FFI-Reporting Model 1 FFI  - 08: Registered Deemed - Compliant FFI-Sponsored Entity  - 09: Registered Deemed - Compliant FFI-Other  - 10: Certified Deemed - Compliant FFI-Other  - 11: Certified Deemed - Compliant FFI-FFI with Low Value Accounts  - 12: Certified Deemed - Compliant FFI-Non-Registering Local Bank  - 13: Certified Deemed - Compliant FFI-Sponsored Entity  - 14: Certified Deemed - Compliant FFI-Investment Advisor or Investment Manager  - 15: Nonparticipating FFI  - 16: Owner-Documented FFI  - 17: U.S. Branch - treated as U.S. person  - 18: U.S. Branch - not treated as U.S. person (reporting under section 1471)  - 19: Passive NFFE identifying Substantial U.S. Owners  - 20: Passive NFFE with no Substantial U.S. Owners  - 21: Publicly Traded NFFE or Affiliate of Publicly Traded NFFE  - 22: Active NFFE  - 23: Individual  - 24: Section 501(c) Entities  - 25: Excepted Territory NFFE  - 26: Excepted NFFE - Other  - 27: Exempt Beneficial Owner  - 28: Entity Wholly Owned by Exempt Beneficial Owners  - 29: Unknown Recipient  - 30: Recalcitrant Account Holder  - 31: Nonreporting IGA FFI  - 32: Direct reporting NFFE  - 33: U.S. reportable account  - 34: Non-consenting U.S. account  - 35: Sponsored direct reporting NFFE  - 36: Excepted Inter-affiliate FFI  - 37: Undocumented Preexisting Obligation  - 38: U.S. Branch - ECI presumption applied  - 39: Account Holder of Excluded Financial Account  - 40: Passive NFFE reported by FFI  - 41: NFFE subject to 1472 withholding  - 42: Recalcitrant Pool - No U.S. Indicia  - 43: Recalcitrant Pool - U.S. Indicia  - 44: Recalcitrant Pool - Dormant Account  - 45: Recalcitrant Pool - U.S. Persons  - 46: Recalcitrant Pool - Passive NFFEs  - 47: Nonparticipating FFI Pool  - 48: U.S. Payees Pool  - 49: QI - Recalcitrant Pool-General  - 50: U.S. Withholding Agent-Foreign branch of FI |  [optional] |
|**primaryWithholdingAgent** | [**PrimaryWithholdingAgent**](PrimaryWithholdingAgent.md) | Primary withholding agent information |  [optional] |
|**intermediaryOrFlowThrough** | [**IntermediaryOrFlowThrough**](IntermediaryOrFlowThrough.md) | Intermediary or flow-through entity information |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Form type |  |
|**id** | **String** | Form ID. Unique identifier set when the record is created. |  [optional] [readonly] |
|**issuerId** | **String** | Issuer ID - only required when creating forms |  [optional] |
|**issuerReferenceId** | **String** | Issuer Reference ID - only required when creating forms |  [optional] |
|**issuerTin** | **String** | Issuer TIN - readonly |  [optional] |
|**taxYear** | **Integer** | Tax Year - only required when creating forms |  [optional] |
|**referenceId** | **String** | Internal reference ID. Never shown to any agency or recipient. |  [optional] |
|**tin** | **String** | Recipient&#39;s Federal Tax Identification Number (TIN). |  [optional] |
|**recipientName** | **String** | Recipient name |  |
|**recipientSecondName** | **String** | Recipient second name |  [optional] |
|**address** | **String** | Address. |  |
|**address2** | **String** | Address line 2. |  [optional] |
|**city** | **String** | City. |  |
|**state** | **String** | Two-letter US state or Canadian province code (required for US/CA addresses). |  [optional] |
|**zip** | **String** | ZIP/postal code. |  [optional] |
|**email** | **String** | Recipient&#39;s Contact email address. |  [optional] |
|**accountNumber** | **String** | Account number |  [optional] |
|**officeCode** | **String** | Office code |  [optional] |
|**nonUsProvince** | **String** | Province or region for non-US/CA addresses. |  [optional] |
|**countryCode** | **String** | Two-letter IRS country code (e.g., &#39;US&#39;, &#39;CA&#39;), as defined at https://www.irs.gov/e-file-providers/country-codes. |  |
|**federalEfileDate** | **LocalDate** | Date when federal e-filing should be scheduled for this form |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEfileDate** | **LocalDate** | Date when state e-filing should be scheduled for this form |  [optional] |
|**recipientEdeliveryDate** | **LocalDate** | Date when recipient e-delivery should be scheduled for this form |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**noTin** | **Boolean** | No TIN indicator |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholding**](StateAndLocalWithholding.md) | State and local withholding information |  [optional] |
|**secondTinNotice** | **Boolean** | Second TIN notice |  [optional] |
|**federalEfileStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Federal e-file status |  [optional] [readonly] |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetail&gt;**](StateEfileStatusDetail.md) | State e-file status |  [optional] [readonly] |
|**postalMailStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Postal mail to recipient status |  [optional] [readonly] |
|**tinMatchStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | TIN Match status |  [optional] [readonly] |
|**addressVerificationStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Address verification status |  [optional] [readonly] |
|**eDeliveryStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | EDelivery status |  [optional] [readonly] |
|**validationErrors** | [**List&lt;ValidationError&gt;**](ValidationError.md) | Validation errors |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Date time when the record was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Date time when the record was last updated. |  [optional] [readonly] |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;Empty&quot; |
| EIN | &quot;EIN&quot; |
| SSN | &quot;SSN&quot; |
| ITIN | &quot;ITIN&quot; |
| ATIN | &quot;ATIN&quot; |



## Enum: LobCodeEnum

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



## Enum: IncomeCodeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _22 | &quot;22&quot; |
| _29 | &quot;29&quot; |
| _30 | &quot;30&quot; |
| _31 | &quot;31&quot; |
| _33 | &quot;33&quot; |
| _51 | &quot;51&quot; |
| _54 | &quot;54&quot; |
| _06 | &quot;06&quot; |
| _07 | &quot;07&quot; |
| _08 | &quot;08&quot; |
| _34 | &quot;34&quot; |
| _40 | &quot;40&quot; |
| _52 | &quot;52&quot; |
| _53 | &quot;53&quot; |
| _56 | &quot;56&quot; |
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
| _23 | &quot;23&quot; |
| _24 | &quot;24&quot; |
| _25 | &quot;25&quot; |
| _26 | &quot;26&quot; |
| _27 | &quot;27&quot; |
| _28 | &quot;28&quot; |
| _32 | &quot;32&quot; |
| _35 | &quot;35&quot; |
| _36 | &quot;36&quot; |
| _37 | &quot;37&quot; |
| _38 | &quot;38&quot; |
| _39 | &quot;39&quot; |
| _41 | &quot;41&quot; |
| _42 | &quot;42&quot; |
| _43 | &quot;43&quot; |
| _44 | &quot;44&quot; |
| _50 | &quot;50&quot; |
| _55 | &quot;55&quot; |
| _57 | &quot;57&quot; |
| _58 | &quot;58&quot; |



## Enum: WithholdingIndicatorEnum

| Name | Value |
|---- | -----|
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |



## Enum: ExemptionCodeChap3Enum

| Name | Value |
|---- | -----|
| _00 | &quot;00&quot; |
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
| _22 | &quot;22&quot; |
| _23 | &quot;23&quot; |
| _24 | &quot;24&quot; |



## Enum: ExemptionCodeChap4Enum

| Name | Value |
|---- | -----|
| _00 | &quot;00&quot; |
| _13 | &quot;13&quot; |
| _14 | &quot;14&quot; |
| _15 | &quot;15&quot; |
| _16 | &quot;16&quot; |
| _17 | &quot;17&quot; |
| _18 | &quot;18&quot; |
| _19 | &quot;19&quot; |
| _20 | &quot;20&quot; |
| _21 | &quot;21&quot; |



## Enum: TaxRateChap3Enum

| Name | Value |
|---- | -----|
| _00_00 | &quot;00.00&quot; |
| _02_00 | &quot;02.00&quot; |
| _04_00 | &quot;04.00&quot; |
| _04_90 | &quot;04.90&quot; |
| _04_95 | &quot;04.95&quot; |
| _05_00 | &quot;05.00&quot; |
| _07_00 | &quot;07.00&quot; |
| _08_00 | &quot;08.00&quot; |
| _10_00 | &quot;10.00&quot; |
| _12_00 | &quot;12.00&quot; |
| _12_50 | &quot;12.50&quot; |
| _14_00 | &quot;14.00&quot; |
| _15_00 | &quot;15.00&quot; |
| _17_50 | &quot;17.50&quot; |
| _20_00 | &quot;20.00&quot; |
| _21_00 | &quot;21.00&quot; |
| _24_00 | &quot;24.00&quot; |
| _25_00 | &quot;25.00&quot; |
| _27_50 | &quot;27.50&quot; |
| _28_00 | &quot;28.00&quot; |
| _30_00 | &quot;30.00&quot; |
| _37_00 | &quot;37.00&quot; |



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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| _1099_NEC | &quot;1099-NEC&quot; |
| _1099_MISC | &quot;1099-MISC&quot; |
| _1099_DIV | &quot;1099-DIV&quot; |
| _1099_R | &quot;1099-R&quot; |
| _1099_K | &quot;1099-K&quot; |
| _1095_B | &quot;1095-B&quot; |
| _1042_S | &quot;1042-S&quot; |
| _1095_C | &quot;1095-C&quot; |
| _1099_INT | &quot;1099-INT&quot; |



