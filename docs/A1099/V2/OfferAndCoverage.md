

# OfferAndCoverage

Offer and coverage information for health coverage forms

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Id |  [optional] [readonly] |
|**month** | [**MonthEnum**](#MonthEnum) | Month of coverage.  Available values:  - All: All months  - January: January  - February: February  - March: March  - April: April  - May: May  - June: June  - July: July  - August: August  - September: September  - October: October  - November: November  - December: December |  [optional] |
|**offerCode** | [**OfferCodeEnum**](#OfferCodeEnum) | Offer of Coverage Code. Required if Share has a value, including zero.  Available values:    Pre-ICHRA Codes (available before 2020):  - 1A: Qualifying offer: minimum essential coverage providing minimum value offered to full-time employee with employee required contribution ≤ 9.5% (as adjusted) of mainland single federal poverty line and at least minimum essential coverage offered to spouse and dependent(s)  - 1B: Minimum essential coverage providing minimum value offered to employee only  - 1C: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage offered to dependent(s) (not spouse)  - 1D: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage offered to spouse (not dependent(s))  - 1E: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage offered to dependent(s) and spouse  - 1F: Minimum essential coverage NOT providing minimum value offered to employee; employee and spouse or dependent(s); or employee, spouse, and dependents  - 1G: Offer of coverage to an individual who was not an employee or not a full-time employee and who enrolled in self-insured coverage  - 1H: No offer of coverage (employee not offered any health coverage or employee offered coverage that is not minimum essential coverage)  - 1J: Minimum essential coverage providing minimum value offered to employee and at least minimum essential coverage conditionally offered to spouse; minimum essential coverage not offered to dependent(s)  - 1K: Minimum essential coverage providing minimum value offered to employee; at least minimum essential coverage offered to dependents; and at least minimum essential coverage conditionally offered to spouse                ICHRA Codes (introduced 2020, require ZIP code):  - 1L: Individual coverage HRA offered to employee only  - 1M: Individual coverage HRA offered to employee and dependent(s) (not spouse)  - 1N: Individual coverage HRA offered to employee, spouse, and dependent(s)  - 1O: Individual coverage HRA offered to employee only using employment site ZIP code affordability safe harbor  - 1P: Individual coverage HRA offered to employee and dependent(s) (not spouse) using employment site ZIP code affordability safe harbor  - 1Q: Individual coverage HRA offered to employee, spouse, and dependent(s) using employment site ZIP code affordability safe harbor  - 1R: Individual coverage HRA that is NOT affordable  - 1S: Individual coverage HRA offered to an individual who was not a full-time employee  - 1T: Individual coverage HRA offered to employee and spouse (not dependents)  - 1U: Individual coverage HRA offered to employee and spouse (not dependents) using employment site ZIP code affordability safe harbor    Note: Codes 1B, 1C, 1D, 1E, 1J, 1K, 1L, 1M, 1N, 1O, 1P, 1Q, 1T, 1U require employee share amount (0.00 is a valid value). |  [optional] |
|**share** | **Double** | Employee required contribution share - Employee Share of Lowest Cost Monthly Premium, for Self-Only Minimum Value Coverage - May not exceed 3499.99 |  [optional] |
|**safeHarborCode** | [**SafeHarborCodeEnum**](#SafeHarborCodeEnum) | Safe harbor code - Applicable Section 4980H Safe Harbor Code.  Available values:  - 2A: Form W-2 safe harbor  - 2B: Federal poverty line safe harbor  - 2C: Rate of pay safe harbor  - 2D: Part-time employee safe harbor for employees who were not full-time for any month of the year  - 2E: Multiemployer interim rule relief  - 2F: Qualifying offer method  - 2G: Qualifying offer transition relief  - 2H: Other affordability safe harbor |  [optional] |
|**zipCode** | **String** | ZIP/postal code. For coverage area (optional, unless codes 1L to 1U are used). |  [optional] |



## Enum: MonthEnum

| Name | Value |
|---- | -----|
| ALL | &quot;All&quot; |
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



## Enum: OfferCodeEnum

| Name | Value |
|---- | -----|
| _1_A | &quot;1A&quot; |
| _1_B | &quot;1B&quot; |
| _1_C | &quot;1C&quot; |
| _1_D | &quot;1D&quot; |
| _1_E | &quot;1E&quot; |
| _1_F | &quot;1F&quot; |
| _1_G | &quot;1G&quot; |
| _1_H | &quot;1H&quot; |
| _1_J | &quot;1J&quot; |
| _1_K | &quot;1K&quot; |
| _1_L | &quot;1L&quot; |
| _1_M | &quot;1M&quot; |
| _1_N | &quot;1N&quot; |
| _1_O | &quot;1O&quot; |
| _1_P | &quot;1P&quot; |
| _1_Q | &quot;1Q&quot; |
| _1_R | &quot;1R&quot; |
| _1_S | &quot;1S&quot; |
| _1_T | &quot;1T&quot; |
| _1_U | &quot;1U&quot; |



## Enum: SafeHarborCodeEnum

| Name | Value |
|---- | -----|
| _2_A | &quot;2A&quot; |
| _2_B | &quot;2B&quot; |
| _2_C | &quot;2C&quot; |
| _2_D | &quot;2D&quot; |
| _2_E | &quot;2E&quot; |
| _2_F | &quot;2F&quot; |
| _2_G | &quot;2G&quot; |
| _2_H | &quot;2H&quot; |



