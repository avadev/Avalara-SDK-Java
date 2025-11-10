

# Get1099Form200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tinType** | [**TinTypeEnum**](#TinTypeEnum) | Tax Identification Number (TIN) type.  Available values: - EIN: Employer Identification Number - SSN: Social Security Number - ITIN: Individual Taxpayer Identification Number - ATIN: Adoption Taxpayer Identification Number |  [optional] |
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
|**chap3StatusCode** | [**Chap3StatusCodeEnum**](#Chap3StatusCodeEnum) | Chapter 3 status code - Required if WithholdingIndicator is 3 (Chapter 3). Available values: - 01: U.S. Withholding Agent - FI (Deprecated - valid only for tax years prior to 2020) - 02: U.S. Withholding Agent - Other (Deprecated - valid only for tax years prior to 2020) - 03: Territory FI - treated as U.S. Person - 04: Territory FI - not treated as U.S. Person - 05: U.S. branch - treated as U.S. Person - 06: U.S. branch - not treated as U.S. Person - 07: U.S. branch - ECI presumption applied - 08: Partnership other than Withholding Foreign Partnership - 09: Withholding Foreign Partnership - 10: Trust other than Withholding Foreign Trust - 11: Withholding Foreign Trust - 12: Qualified Intermediary - 13: Qualified Securities Lender - Qualified Intermediary - 14: Qualified Securities Lender - Other - 15: Corporation - 16: Individual - 17: Estate - 18: Private Foundation - 19: Government or International Organization - 20: Tax Exempt Organization (Section 501(c) entities) - 21: Unknown Recipient - 22: Artist or Athlete - 23: Pension - 24: Foreign Central Bank of Issue - 25: Nonqualified Intermediary - 26: Hybrid entity making Treaty Claim - 27: Withholding Rate Pool - General - 28: Withholding Rate Pool - Exempt Organization - 29: PAI Withholding Rate Pool - General - 30: PAI Withholding Rate Pool - Exempt Organization - 31: Agency Withholding Rate Pool - General - 32: Agency Withholding Rate Pool - Exempt Organization - 34: U.S. Withholding Agent-Foreign branch of FI (Deprecated - valid only for tax years prior to 2020) - 35: Qualified Derivatives Dealer - 36: Foreign Government - Integral Part - 37: Foreign Government - Controlled Entity - 38: Publicly Traded Partnership - 39: Disclosing Qualified Intermediary |  [optional] |
|**chap4StatusCode** | [**Chap4StatusCodeEnum**](#Chap4StatusCodeEnum) | Chapter 4 status code. Required if WithholdingIndicator is 4 (Chapter 4). Required if email is specified, must fill either this or RecipientForeignTin. Available values: - 01: U.S. Withholding Agent - FI - 02: U.S. Withholding Agent - Other - 03: Territory FI - not treated as U.S. Person - 04: Territory FI - treated as U.S. Person - 05: Participating FFI - Other - 06: Participating FFI - Reporting Model 2 FFI - 07: Registered Deemed - Compliant FFI-Reporting Model 1 FFI - 08: Registered Deemed - Compliant FFI-Sponsored Entity - 09: Registered Deemed - Compliant FFI-Other - 10: Certified Deemed - Compliant FFI-Other - 11: Certified Deemed - Compliant FFI-FFI with Low Value Accounts - 12: Certified Deemed - Compliant FFI-Non-Registering Local Bank - 13: Certified Deemed - Compliant FFI-Sponsored Entity - 14: Certified Deemed - Compliant FFI-Investment Advisor or Investment Manager - 15: Nonparticipating FFI - 16: Owner-Documented FFI - 17: U.S. Branch - treated as U.S. person - 18: U.S. Branch - not treated as U.S. person (reporting under section 1471) - 19: Passive NFFE identifying Substantial U.S. Owners - 20: Passive NFFE with no Substantial U.S. Owners - 21: Publicly Traded NFFE or Affiliate of Publicly Traded NFFE - 22: Active NFFE - 23: Individual - 24: Section 501(c) Entities - 25: Excepted Territory NFFE - 26: Excepted NFFE - Other - 27: Exempt Beneficial Owner - 28: Entity Wholly Owned by Exempt Beneficial Owners - 29: Unknown Recipient - 30: Recalcitrant Account Holder - 31: Nonreporting IGA FFI - 32: Direct reporting NFFE - 33: U.S. reportable account - 34: Non-consenting U.S. account - 35: Sponsored direct reporting NFFE - 36: Excepted Inter-affiliate FFI - 37: Undocumented Preexisting Obligation - 38: U.S. Branch - ECI presumption applied - 39: Account Holder of Excluded Financial Account - 40: Passive NFFE reported by FFI - 41: NFFE subject to 1472 withholding - 42: Recalcitrant Pool - No U.S. Indicia - 43: Recalcitrant Pool - U.S. Indicia - 44: Recalcitrant Pool - Dormant Account - 45: Recalcitrant Pool - U.S. Persons - 46: Recalcitrant Pool - Passive NFFEs - 47: Nonparticipating FFI Pool - 48: U.S. Payees Pool - 49: QI - Recalcitrant Pool-General - 50: U.S. Withholding Agent-Foreign branch of FI |  [optional] |
|**primaryWithholdingAgent** | [**PrimaryWithholdingAgent**](PrimaryWithholdingAgent.md) | Primary withholding agent information |  [optional] |
|**intermediaryOrFlowThrough** | [**IntermediaryOrFlowThrough**](IntermediaryOrFlowThrough.md) | Intermediary or flow-through entity information |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Form type. |  |
|**id** | **String** | Form ID. Unique identifier set when the record is created. |  [optional] [readonly] |
|**issuerId** | **String** | Issuer ID - only required when creating forms |  [optional] |
|**issuerReferenceId** | **String** | Issuer Reference ID - only required when creating forms via $bulk-upsert |  [optional] |
|**issuerTin** | **String** | Issuer TIN - readonly |  [optional] |
|**taxYear** | **Integer** | Tax Year - only required when creating forms via $bulk-upsert |  [optional] |
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
|**federalEfileDate** | **LocalDate** | Date when federal e-filing should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled. |  [optional] |
|**postalMail** | **Boolean** | Boolean indicating that postal mailing to the recipient should be scheduled for this form |  [optional] |
|**stateEfileDate** | **LocalDate** | Date when state e-filing should be scheduled. Must be on or after federalEfileDate. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled. |  [optional] |
|**recipientEdeliveryDate** | **LocalDate** | Date when recipient e-delivery should be scheduled. If set between current date and beginning of blackout period, scheduled to that date. If in the past or blackout period, scheduled to next available date. For blackout period information, see https://www.track1099.com/info/IRS_info. Set to null to leave unscheduled. |  [optional] |
|**tinMatch** | **Boolean** | Boolean indicating that TIN Matching should be scheduled for this form |  [optional] |
|**noTin** | **Boolean** | No TIN indicator |  [optional] |
|**addressVerification** | **Boolean** | Boolean indicating that address verification should be scheduled for this form |  [optional] |
|**stateAndLocalWithholding** | [**StateAndLocalWithholding**](StateAndLocalWithholding.md) | State and local withholding information |  [optional] |
|**secondTinNotice** | **Boolean** | Second TIN notice |  [optional] |
|**federalEfileStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Federal e-file status.  Available values:  - unscheduled: Form has not been scheduled for federal e-filing  - scheduled: Form is scheduled for federal e-filing  - airlock: Form is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - sent: Form has been sent to the IRS  - accepted: Form was accepted by the IRS  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlock: Correction is in process of being uploaded to the IRS (forms exist in this state for a very short period and cannot be updated while in this state)  - corrected: A correction has been sent to the IRS  - corrected_accepted: Correction was accepted by the IRS  - rejected: Form was rejected by the IRS  - corrected_rejected: Correction was rejected by the IRS  - held: Form is held and will not be submitted to IRS (used for certain forms submitted only to states) |  [optional] [readonly] |
|**stateEfileStatus** | [**List&lt;StateEfileStatusDetail&gt;**](StateEfileStatusDetail.md) | State e-file status.  Available values:  - unscheduled: Form has not been scheduled for state e-filing  - scheduled: Form is scheduled for state e-filing  - airlocked: Form is in process of being uploaded to the state  - sent: Form has been sent to the state  - rejected: Form was rejected by the state  - accepted: Form was accepted by the state  - corrected_scheduled: Correction is scheduled to be sent  - corrected_airlocked: Correction is in process of being uploaded to the state  - corrected_sent: Correction has been sent to the state  - corrected_rejected: Correction was rejected by the state  - corrected_accepted: Correction was accepted by the state |  [optional] [readonly] |
|**postalMailStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Postal mail to recipient status.  Available values:  - unscheduled: Postal mail has not been scheduled  - pending: Postal mail is pending to be sent  - sent: Postal mail has been sent  - delivered: Postal mail has been delivered |  [optional] [readonly] |
|**tinMatchStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | TIN Match status.  Available values:  - none: TIN matching has not been performed  - pending: TIN matching request is pending  - matched: Name/TIN combination matches IRS records  - unknown: TIN is missing, invalid, or request contains errors  - rejected: Name/TIN combination does not match IRS records or TIN not currently issued |  [optional] [readonly] |
|**addressVerificationStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | Address verification status.  Available values:  - unknown: Address verification has not been checked  - pending: Address verification is in progress  - failed: Address verification failed  - incomplete: Address verification is incomplete  - unchanged: User declined address changes  - verified: Address has been verified and accepted |  [optional] [readonly] |
|**eDeliveryStatus** | [**Form1099StatusDetail**](Form1099StatusDetail.md) | EDelivery status.  Available values:  - unscheduled: E-delivery has not been scheduled  - scheduled: E-delivery is scheduled to be sent  - sent: E-delivery has been sent to recipient  - bounced: E-delivery bounced back (invalid email)  - refused: E-delivery was refused by recipient  - bad_verify: E-delivery failed verification  - accepted: E-delivery was accepted by recipient  - bad_verify_limit: E-delivery failed verification limit reached  - second_delivery: Second e-delivery attempt  - undelivered: E-delivery is undelivered (temporary state allowing resend) |  [optional] [readonly] |
|**validationErrors** | [**List&lt;ValidationError&gt;**](ValidationError.md) | Validation errors |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | Date time when the record was created. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | Date time when the record was last updated. |  [optional] [readonly] |
|**employeeFirstName** | **String** | Employee&#39;s first name |  |
|**employeeMiddleName** | **String** | Employee&#39;s middle name |  [optional] |
|**employeeLastName** | **String** | Employee&#39;s last name |  |
|**employeeNameSuffix** | **String** | Employee&#39;s name suffix |  [optional] |
|**employeeDateOfBirth** | **LocalDate** | Employee&#39;s date of birth |  [optional] |
|**originOfHealthCoverageCode** | [**OriginOfHealthCoverageCodeEnum**](#OriginOfHealthCoverageCodeEnum) | Origin of health coverage code.    Available values:  - A: Small Business Health Options Program (SHOP)  - B: Employer-sponsored coverage  - C: Government-sponsored program  - D: Individual market insurance  - E: Multiemployer plan  - F: Other designated minimum essential coverage  - G: Employer-sponsored coverage that is an individual coverage HRA (valid for tax years 2020 and later) |  |
|**coveredIndividuals** | [**List&lt;CoveredIndividual&gt;**](CoveredIndividual.md) | Covered individuals information |  [optional] |
|**planStartMonth** | [**PlanStartMonthEnum**](#PlanStartMonthEnum) | Plan start month.  The calendar month during which the plan year begins of the health plan in which the employee is offered coverage (or would be offered coverage if the employee were eligible to participate in the plan).  Available values:  - 00: None  - 01: January  - 02: February  - 03: March  - 04: April  - 05: May  - 06: June  - 07: July  - 08: August  - 09: September  - 10: October  - 11: November  - 12: December |  |
|**employerProvidedSiCoverage** | **Boolean** | Employer provided self-insured coverage |  [optional] |
|**offerAndCoverages** | [**List&lt;OfferAndCoverage&gt;**](OfferAndCoverage.md) | Offer and coverage information |  |
|**totalOrdinaryDividends** | **Double** | Total ordinary dividends |  [optional] |
|**qualifiedDividends** | **Double** | Qualified dividends |  [optional] |
|**totalCapitalGainDistributions** | **Double** | Total capital gain distributions |  [optional] |
|**unrecapturedSection1250Gain** | **Double** | Unrecaptured Section 1250 gain |  [optional] |
|**section1202Gain** | **Double** | Section 1202 gain |  [optional] |
|**collectiblesGain** | **Double** | Collectibles (28%) gain |  [optional] |
|**section897OrdinaryDividends** | **Double** | Section 897 ordinary dividends |  [optional] |
|**section897CapitalGain** | **Double** | Section 897 capital gain |  [optional] |
|**nondividendDistributions** | **Double** | Nondividend distributions |  [optional] |
|**federalIncomeTaxWithheld** | **Double** | Federal income tax withheld |  [optional] |
|**section199ADividends** | **Double** | Section 199A dividends |  [optional] |
|**investmentExpenses** | **Double** | Investment Expenses |  [optional] |
|**foreignTaxPaid** | **Double** | Foreign tax paid |  [optional] |
|**foreignCountryOrUSPossession** | **String** | Foreign country or U.S. possession |  [optional] |
|**cashLiquidationDistributions** | **Double** | Cash liquidation distributions |  [optional] |
|**noncashLiquidationDistributions** | **Double** | Noncash liquidation distributions |  [optional] |
|**exemptInterestDividends** | **Double** | Exempt-interest dividends |  [optional] |
|**specifiedPrivateActivityBondInterestDividends** | **Double** | Specified private activity bond interest dividends |  [optional] |
|**fatcaFilingRequirement** | **Boolean** | FATCA filing requirement. |  [optional] |
|**interestIncome** | **Double** | Interest Income |  [optional] |
|**earlyWithdrawalPenalty** | **Double** | Early Withdrawal Penalty |  [optional] |
|**usSavingsBondsInterest** | **Double** | Interest on U.S. Savings Bonds and Treasury obligations |  [optional] |
|**foreignCountry** | **String** | Foreign country or U.S. possession |  [optional] |
|**taxExemptInterest** | **Double** | Tax-Exempt Interest |  [optional] |
|**specifiedPrivateActivityBondInterest** | **Double** | Specified Private activity |  [optional] |
|**marketDiscount** | **Double** | Market Discount |  [optional] |
|**bondPremium** | **Double** | Bond Premium |  [optional] |
|**bondPremiumOnTreasuryObligations** | **Double** | Bond Premium on Treasury obligations |  [optional] |
|**bondPremiumOnTaxExemptBond** | **Double** | Bond Premium on tax exempt bond |  [optional] |
|**taxExemptBondCusipNumber** | **String** | Tax exempt bond CUSIP no.   Enter VARIOUS if the tax-exempt interest is reported in the aggregate for multiple bonds or accounts. |  [optional] |
|**filerType** | [**FilerTypeEnum**](#FilerTypeEnum) | Filer type for tax reporting purposes.  Available values:  - PSE: Payment Settlement Entity  - EPF: Electronic Payment Facilitator or other third party |  |
|**paymentType** | [**PaymentTypeEnum**](#PaymentTypeEnum) | Payment type for transaction classification.  Available values:  - PaymentCard: Payment card transactions  - ThirdPartyNetwork: Third party network transactions |  |
|**paymentSettlementEntityNamePhoneNumber** | **String** | Payment settlement entity name and phone number, if different from Filer&#39;s |  [optional] |
|**grossAmountPaymentCard** | **Double** | Gross amount of payment card/third party network transactions. This value must equal the total of all monthly payment amounts (January through December). |  |
|**cardNotPresentTransactions** | **Double** | Card not present transactions |  [optional] |
|**merchantCategoryCode** | **String** | Merchant category code (4 numbers) |  [optional] |
|**paymentTransactionNumber** | **Double** | Number of payment transactions |  |
|**january** | **Double** | January gross payments |  [optional] |
|**february** | **Double** | February gross payments |  [optional] |
|**march** | **Double** | March gross payments |  [optional] |
|**april** | **Double** | April gross payments |  [optional] |
|**may** | **Double** | May gross payments |  [optional] |
|**june** | **Double** | June gross payments |  [optional] |
|**july** | **Double** | July gross payments |  [optional] |
|**august** | **Double** | August gross payments |  [optional] |
|**september** | **Double** | September gross payments |  [optional] |
|**october** | **Double** | October gross payments |  [optional] |
|**november** | **Double** | November gross payments |  [optional] |
|**december** | **Double** | December gross payments |  [optional] |
|**rents** | **Double** | Rents |  [optional] |
|**royalties** | **Double** | Royalties |  [optional] |
|**otherIncome** | **Double** | Other income |  [optional] |
|**fishingBoatProceeds** | **Double** | Fishing boat proceeds |  [optional] |
|**medicalAndHealthCarePayments** | **Double** | Medical and health care payments |  [optional] |
|**directSalesIndicator** | **Boolean** | Payer made direct sales totaling $5,000 or more of consumer products to recipient for resale. Should be true if Nonemployee compensation is not provided. |  [optional] |
|**substitutePayments** | **Double** | Substitute payments in lieu of dividends or interest |  [optional] |
|**cropInsuranceProceeds** | **Double** | Crop insurance proceeds |  [optional] |
|**grossProceedsPaidToAttorney** | **Double** | Gross proceeds paid to an attorney |  [optional] |
|**fishPurchasedForResale** | **Double** | Fish purchased for resale |  [optional] |
|**section409ADeferrals** | **Double** | Section 409A deferrals |  [optional] |
|**excessGoldenParachutePayments** | **Double** | Excess golden parachute payments - Available only for tax year 2025 and later |  [optional] |
|**nonqualifiedDeferredCompensation** | **Double** | Nonqualified deferred compensation |  [optional] |
|**nonemployeeCompensation** | **Double** | Nonemployee compensation. Required if DirectSalesIndicator is false. |  |
|**grossDistribution** | **Double** | Gross distribution |  [optional] |
|**taxableAmount** | **Double** | Taxable amount |  [optional] |
|**taxableAmountNotDetermined** | **Boolean** | Taxable amount not determined |  [optional] |
|**totalDistributionDetermined** | **Boolean** | Total distribution |  [optional] |
|**capitalGain** | **Double** | Capital gain (included in Box 2a) |  [optional] |
|**employeeContributionsOrDesignatedRothOrInsurancePremiums** | **Double** | Employee contributions/Designated Roth contributions or insurance premiums |  [optional] |
|**netUnrealizedAppreciationInEmployerSecurities** | **Double** | Net unrealized appreciation in employer&#39;s securities |  [optional] |
|**distributionCode** | [**DistributionCodeEnum**](#DistributionCodeEnum) | Distribution code.    Available values:  - 1: Early distribution, no known exception (in most cases, under age 59½)  - 2: Early distribution, exception applies (under age 59½)  - 3: Disability  - 4: Death  - 5: Prohibited transaction  - 6: Section 1035 exchange (a tax-free exchange of life insurance, annuity, qualified long-term care insurance, or endowment contracts)  - 7: Normal distribution  - 8: Excess contributions plus earnings/excess deferrals (and/or earnings) taxable in payment year  - 9: Cost of current life insurance protection (premiums paid by a trustee or custodian for current insurance protection)  - A: May be eligible for 10-year tax option  - B: Designated Roth account distribution  - C: Reportable Death Benefits Under Section 6050Y(c)  - D: Annuity payments from nonqualified annuity payments and distributions from life insurance contracts that may be subject to tax under section 1411  - E: Distribution under Employee Plans Compliance Resolution System (EPCRS)  - F: Charitable gift annuity  - G: Direct rollover and rollover contribution  - H: Direct rollover of distribution from a designated Roth account to a Roth IRA  - J: Early distribution from a Roth IRA (This code may be used with a Code 8 or P)  - K: Distribution of IRA Assets Not Having A Readily Available FMV  - L: Loans treated as deemed distributions under section 72(p)  - M: Qualified Plan Loan Offsets  - N: Recharacterized IRA contribution made for year following payment year  - P: Excess contributions plus earnings/excess deferrals taxable for year prior to payment year  - Q: Qualified distribution from a Roth IRA (Distribution from a Roth IRA when the 5-year holding period has been met, and the recipient has reached 59½, has died, or is disabled)  - R: Recharacterized IRA contribution made for year prior to payment year  - S: Early distribution from a SIMPLE IRA in first 2 years no known exceptions  - T: Roth IRA distribution exception applies because participant has reached 59½, died or is disabled, but it is unknown if the 5-year period has been met  - U: Distribution from ESOP under Section 404(k)  - W: Charges or payments for purchasing qualified long-term care insurance contracts under combined arrangements  - Y: Qualified charitable distribution (QCD) claimed under section 408(d)(8) (Available for 2025 on) |  |
|**secondDistributionCode** | [**SecondDistributionCodeEnum**](#SecondDistributionCodeEnum) | Second distribution code. Must be a valid combination with the first distribution code.  See DistributionCode property documentation for code descriptions.    Valid combinations based on first distribution code:  - 1: _, 8, B, D, K, L, M, P  - 2: _, 8, B, D, K, L, M, P  - 3: _, D  - 4: _, 8, A, B, D, G, H, K, L, M, P  - 5: _  - 6: _, W  - 7: _, A, B, D, K, L, M  - 8: _, 1, 2, 4, B, J, K  - 9: _  - A: 4, 7  - B: _, 1, 2, 4, 7, 8, G, L, M, P, U  - C: _, D  - D: 1, 2, 3, 4, 7, C  - E: _  - F: _  - G: _, 4, B, K  - H: _, 4  - J: _, 8, P  - K: 1, 2, 4, 7, 8, G  - L: _, 1, 2, 4, 7, B  - M: _, 1, 2, 4, 7, B  - N: _  - P: _, 1, 2, 4, B, J  - Q: _  - R: _  - S: _  - T: _  - U: _, B  - W: _, 6  - Y: 4, 7, K                (_ indicates no second distribution code)    (format: firstDistributionCode: availableSecondDistributionCodes) |  [optional] |
|**iraSepSimple** | **Boolean** | IRA/SEP/SIMPLE |  [optional] |
|**traditionalIraSepSimpleOrRothConversionAmount** | **Double** | Traditional IRA/SEP/SIMPLE or Roth conversion amount |  [optional] |
|**otherAmount** | **Double** | Other amount |  [optional] |
|**otherPercentage** | **String** | Other percentage |  [optional] |
|**totalDistributionPercentage** | **String** | Total distribution percentage |  [optional] |
|**totalEmployeeContributions** | **Double** | Total employee contributions |  [optional] |
|**amountAllocableToIrrWithin5Years** | **Double** | Amount allocable to IRR within 5 years |  [optional] |
|**firstYearOfDesignatedRothContribution** | **String** | First year of designated Roth contribution |  [optional] |
|**dateOfPayment** | **LocalDate** | Date of payment |  [optional] |



## Enum: TinTypeEnum

| Name | Value |
|---- | -----|
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
| _1042_S | &quot;1042-S&quot; |
| _1095_B | &quot;1095-B&quot; |
| _1095_C | &quot;1095-C&quot; |
| _1099_DIV | &quot;1099-DIV&quot; |
| _1099_INT | &quot;1099-INT&quot; |
| _1099_K | &quot;1099-K&quot; |
| _1099_MISC | &quot;1099-MISC&quot; |
| _1099_NEC | &quot;1099-NEC&quot; |
| _1099_R | &quot;1099-R&quot; |



## Enum: OriginOfHealthCoverageCodeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| E | &quot;E&quot; |
| F | &quot;F&quot; |
| G | &quot;G&quot; |



## Enum: PlanStartMonthEnum

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



## Enum: FilerTypeEnum

| Name | Value |
|---- | -----|
| PSE | &quot;PSE&quot; |
| EPF | &quot;EPF&quot; |



## Enum: PaymentTypeEnum

| Name | Value |
|---- | -----|
| PAYMENT_CARD | &quot;PaymentCard&quot; |
| THIRD_PARTY_NETWORK | &quot;ThirdPartyNetwork&quot; |



## Enum: DistributionCodeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| E | &quot;E&quot; |
| F | &quot;F&quot; |
| G | &quot;G&quot; |
| H | &quot;H&quot; |
| J | &quot;J&quot; |
| K | &quot;K&quot; |
| L | &quot;L&quot; |
| M | &quot;M&quot; |
| N | &quot;N&quot; |
| P | &quot;P&quot; |
| Q | &quot;Q&quot; |
| R | &quot;R&quot; |
| S | &quot;S&quot; |
| T | &quot;T&quot; |
| U | &quot;U&quot; |
| W | &quot;W&quot; |
| Y | &quot;Y&quot; |



## Enum: SecondDistributionCodeEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| E | &quot;E&quot; |
| F | &quot;F&quot; |
| G | &quot;G&quot; |
| H | &quot;H&quot; |
| J | &quot;J&quot; |
| K | &quot;K&quot; |
| L | &quot;L&quot; |
| M | &quot;M&quot; |
| N | &quot;N&quot; |
| P | &quot;P&quot; |
| Q | &quot;Q&quot; |
| R | &quot;R&quot; |
| S | &quot;S&quot; |
| T | &quot;T&quot; |
| U | &quot;U&quot; |
| W | &quot;W&quot; |



