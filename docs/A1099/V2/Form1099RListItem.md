

# Form1099RListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stateAndLocalWithholding** | [**StateAndLocalWithholding**](StateAndLocalWithholding.md) |  |  [optional] |
|**grossDistribution** | **Double** |  |  [optional] |
|**taxableAmount** | **Double** |  |  [optional] |
|**taxableAmountNotDetermined** | **Boolean** |  |  [optional] |
|**totalDistributionDetermined** | **Boolean** |  |  [optional] |
|**capitalGain** | **Double** |  |  [optional] |
|**federalIncomeTaxWithheld** | **Double** |  |  [optional] |
|**employeeContributionsOrDesignatedRothOrInsurancePremiums** | **Double** |  |  [optional] |
|**netUnrealizedAppreciationInEmployerSecurities** | **Double** |  |  [optional] |
|**distributionCode** | [**DistributionCodeEnum**](#DistributionCodeEnum) |  |  [optional] |
|**secondDistributionCode** | [**SecondDistributionCodeEnum**](#SecondDistributionCodeEnum) |  |  [optional] |
|**iraSepSimple** | **Boolean** |  |  [optional] |
|**traditionalIraSepSimpleOrRothConversionAmount** | **Double** |  |  [optional] |
|**otherAmount** | **Double** |  |  [optional] |
|**otherPercentage** | **String** |  |  [optional] |
|**totalDistributionPercentage** | **String** |  |  [optional] |
|**totalEmployeeContributions** | **Double** |  |  [optional] |
|**amountAllocableToIrrWithin5Years** | **Double** |  |  [optional] |
|**firstYearOfDesignatedRothContribution** | **Integer** |  |  [optional] |
|**fatcaFilingRequirement** | **Boolean** |  |  [optional] |
|**dateOfPayment** | **OffsetDateTime** |  |  [optional] |
|**issuerId** | **String** |  |  [optional] |
|**issuerReferenceId** | **String** |  |  [optional] |
|**issuerTin** | **String** |  |  [optional] |
|**taxYear** | **Integer** |  |  [optional] |
|**referenceId** | **String** |  |  [optional] |
|**recipientName** | **String** |  |  [optional] |
|**recipientTin** | **String** |  |  [optional] |
|**tinType** | **Integer** |  |  [optional] |
|**recipientSecondName** | **String** |  |  [optional] |
|**streetAddress** | **String** |  |  [optional] |
|**streetAddressLine2** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**zip** | **String** |  |  [optional] |
|**recipientEmail** | **String** |  |  [optional] |
|**accountNumber** | **String** |  |  [optional] |
|**officeCode** | **String** |  |  [optional] |
|**recipientNonUsProvince** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**federalEFile** | **Boolean** |  |  [optional] |
|**postalMail** | **Boolean** |  |  [optional] |
|**stateEFile** | **Boolean** |  |  [optional] |
|**tinMatch** | **Boolean** |  |  [optional] |
|**addressVerification** | **Boolean** |  |  [optional] |



## Enum: DistributionCodeEnum

| Name | Value |
|---- | -----|
| EARLY_DISTRIBUTION_NO_EXCEPTION | &quot;EarlyDistributionNoException&quot; |
| EARLY_DISTRIBUTION_WITH_EXCEPTION | &quot;EarlyDistributionWithException&quot; |
| DISABILITY | &quot;Disability&quot; |
| DEATH | &quot;Death&quot; |
| PROHIBITED_TRANSACTION | &quot;ProhibitedTransaction&quot; |
| SECTION1035_EXCHANGE | &quot;Section1035Exchange&quot; |
| NORMAL_DISTRIBUTION | &quot;NormalDistribution&quot; |
| EXCESS_CONTRIBUTIONS_CURRENT_YEAR | &quot;ExcessContributionsCurrentYear&quot; |
| CURRENT_LIFE_INSURANCE_PROTECTION_COST | &quot;CurrentLifeInsuranceProtectionCost&quot; |
| TEN_YEAR_TAX_OPTION | &quot;TenYearTaxOption&quot; |
| DESIGNATED_ROTH_DISTRIBUTION | &quot;DesignatedRothDistribution&quot; |
| REPORTABLE_DEATH_BENEFITS | &quot;ReportableDeathBenefits&quot; |
| NONQUALIFIED_ANNUITY_PAYMENTS | &quot;NonqualifiedAnnuityPayments&quot; |
| EPCRS_DISTRIBUTION | &quot;EPCRSDistribution&quot; |
| CHARITABLE_GIFT_ANNUITY | &quot;CharitableGiftAnnuity&quot; |
| DIRECT_ROLLOVER | &quot;DirectRollover&quot; |
| ROTH_ACCOUNT_TO_IRA_DIRECT_ROLLOVER | &quot;RothAccountToIRADirectRollover&quot; |
| EARLY_ROTH_IRA_DISTRIBUTION | &quot;EarlyRothIRADistribution&quot; |
| IRA_ASSETS_NO_FMV | &quot;IRAAssetsNoFMV&quot; |
| LOANS_DEEMED_DISTRIBUTIONS | &quot;LoansDeemedDistributions&quot; |
| QUALIFIED_PLAN_LOAN_OFFSETS | &quot;QualifiedPlanLoanOffsets&quot; |
| RECHARACTERIZED_IRA_NEXT_YEAR | &quot;RecharacterizedIRANextYear&quot; |
| EXCESS_CONTRIBUTIONS_PREVIOUS_YEAR | &quot;ExcessContributionsPreviousYear&quot; |
| QUALIFIED_ROTH_IRA_DISTRIBUTION | &quot;QualifiedRothIRADistribution&quot; |
| RECHARACTERIZED_IRA_PREVIOUS_YEAR | &quot;RecharacterizedIRAPreviousYear&quot; |
| EARLY_SIMPLE_IRA_DISTRIBUTION | &quot;EarlySimpleIRADistribution&quot; |
| ROTH_IRA_DISTRIBUTION_EXCEPTION | &quot;RothIRADistributionException&quot; |
| ESOP_DISTRIBUTION | &quot;ESOPDistribution&quot; |
| LONG_TERM_CARE_INSURANCE | &quot;LongTermCareInsurance&quot; |



## Enum: SecondDistributionCodeEnum

| Name | Value |
|---- | -----|
| EARLY_DISTRIBUTION_NO_EXCEPTION | &quot;EarlyDistributionNoException&quot; |
| EARLY_DISTRIBUTION_WITH_EXCEPTION | &quot;EarlyDistributionWithException&quot; |
| DISABILITY | &quot;Disability&quot; |
| DEATH | &quot;Death&quot; |
| PROHIBITED_TRANSACTION | &quot;ProhibitedTransaction&quot; |
| SECTION1035_EXCHANGE | &quot;Section1035Exchange&quot; |
| NORMAL_DISTRIBUTION | &quot;NormalDistribution&quot; |
| EXCESS_CONTRIBUTIONS_CURRENT_YEAR | &quot;ExcessContributionsCurrentYear&quot; |
| CURRENT_LIFE_INSURANCE_PROTECTION_COST | &quot;CurrentLifeInsuranceProtectionCost&quot; |
| TEN_YEAR_TAX_OPTION | &quot;TenYearTaxOption&quot; |
| DESIGNATED_ROTH_DISTRIBUTION | &quot;DesignatedRothDistribution&quot; |
| REPORTABLE_DEATH_BENEFITS | &quot;ReportableDeathBenefits&quot; |
| NONQUALIFIED_ANNUITY_PAYMENTS | &quot;NonqualifiedAnnuityPayments&quot; |
| EPCRS_DISTRIBUTION | &quot;EPCRSDistribution&quot; |
| CHARITABLE_GIFT_ANNUITY | &quot;CharitableGiftAnnuity&quot; |
| DIRECT_ROLLOVER | &quot;DirectRollover&quot; |
| ROTH_ACCOUNT_TO_IRA_DIRECT_ROLLOVER | &quot;RothAccountToIRADirectRollover&quot; |
| EARLY_ROTH_IRA_DISTRIBUTION | &quot;EarlyRothIRADistribution&quot; |
| IRA_ASSETS_NO_FMV | &quot;IRAAssetsNoFMV&quot; |
| LOANS_DEEMED_DISTRIBUTIONS | &quot;LoansDeemedDistributions&quot; |
| QUALIFIED_PLAN_LOAN_OFFSETS | &quot;QualifiedPlanLoanOffsets&quot; |
| RECHARACTERIZED_IRA_NEXT_YEAR | &quot;RecharacterizedIRANextYear&quot; |
| EXCESS_CONTRIBUTIONS_PREVIOUS_YEAR | &quot;ExcessContributionsPreviousYear&quot; |
| QUALIFIED_ROTH_IRA_DISTRIBUTION | &quot;QualifiedRothIRADistribution&quot; |
| RECHARACTERIZED_IRA_PREVIOUS_YEAR | &quot;RecharacterizedIRAPreviousYear&quot; |
| EARLY_SIMPLE_IRA_DISTRIBUTION | &quot;EarlySimpleIRADistribution&quot; |
| ROTH_IRA_DISTRIBUTION_EXCEPTION | &quot;RothIRADistributionException&quot; |
| ESOP_DISTRIBUTION | &quot;ESOPDistribution&quot; |
| LONG_TERM_CARE_INSURANCE | &quot;LongTermCareInsurance&quot; |



