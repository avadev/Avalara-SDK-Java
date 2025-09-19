/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2025 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara 1099 & W-9 API Definition
 *
 * ## 🔐 Authentication  Generate a **license key** from: *[Avalara Portal](https://www.avalara.com/us/en/signin.html) → Settings → License and API Keys*.  [More on authentication methods](https://developer.avalara.com/avatax-dm-combined-erp/common-setup/authentication/authentication-methods/)  [Test your credentials](https://developer.avalara.com/avatax/test-credentials/)  ## 📘 API & SDK Documentation  [Avalara SDK (.NET) on GitHub](https://github.com/avadev/Avalara-SDK-DotNet#avalarasdk--the-unified-c-library-for-next-gen-avalara-services)  [Code Examples – 1099 API](https://github.com/avadev/Avalara-SDK-DotNet/blob/main/docs/A1099/V2/Class1099IssuersApi.md#call1099issuersget)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Avalara.SDK.JSON;

/**
 * Intermediary or flow-through entity information for tax forms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class IntermediaryOrFlowThrough {
  public static final String SERIALIZED_NAME_EIN = "ein";
  @SerializedName(SERIALIZED_NAME_EIN)
  private String ein;

  /**
   * Chapter 3 status code for the intermediary or flow-through entity. Available values: - 01: U.S. Withholding Agent - FI (Deprecated - valid only for tax years prior to 2020) - 02: U.S. Withholding Agent - Other (Deprecated - valid only for tax years prior to 2020) - 03: Territory FI - treated as U.S. Person - 04: Territory FI - not treated as U.S. Person - 05: U.S. branch - treated as U.S. Person - 06: U.S. branch - not treated as U.S. Person - 07: U.S. branch - ECI presumption applied - 08: Partnership other than Withholding Foreign Partnership - 09: Withholding Foreign Partnership - 10: Trust other than Withholding Foreign Trust - 11: Withholding Foreign Trust - 12: Qualified Intermediary - 13: Qualified Securities Lender - Qualified Intermediary - 14: Qualified Securities Lender - Other - 15: Corporation - 16: Individual - 17: Estate - 18: Private Foundation - 19: Government or International Organization - 20: Tax Exempt Organization (Section 501(c) entities) - 21: Unknown Recipient - 22: Artist or Athlete - 23: Pension - 24: Foreign Central Bank of Issue - 25: Nonqualified Intermediary - 26: Hybrid entity making Treaty Claim - 27: Withholding Rate Pool - General - 28: Withholding Rate Pool - Exempt Organization - 29: PAI Withholding Rate Pool - General - 30: PAI Withholding Rate Pool - Exempt Organization - 31: Agency Withholding Rate Pool - General - 32: Agency Withholding Rate Pool - Exempt Organization - 34: U.S. Withholding Agent-Foreign branch of FI (Deprecated - valid only for tax years prior to 2020) - 35: Qualified Derivatives Dealer - 36: Foreign Government - Integral Part - 37: Foreign Government - Controlled Entity - 38: Publicly Traded Partnership - 39: Disclosing Qualified Intermediary
   */
  @JsonAdapter(Chap3StatusCodeEnum.Adapter.class)
  public enum Chap3StatusCodeEnum {
    _01("01"),
    
    _02("02"),
    
    _34("34"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _09("09"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12"),
    
    _13("13"),
    
    _14("14"),
    
    _15("15"),
    
    _16("16"),
    
    _17("17"),
    
    _18("18"),
    
    _19("19"),
    
    _20("20"),
    
    _21("21"),
    
    _22("22"),
    
    _23("23"),
    
    _24("24"),
    
    _25("25"),
    
    _26("26"),
    
    _27("27"),
    
    _28("28"),
    
    _29("29"),
    
    _30("30"),
    
    _31("31"),
    
    _32("32"),
    
    _35("35"),
    
    _36("36"),
    
    _37("37"),
    
    _38("38"),
    
    _39("39");

    private String value;

    Chap3StatusCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Chap3StatusCodeEnum fromValue(String value) {
      for (Chap3StatusCodeEnum b : Chap3StatusCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<Chap3StatusCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Chap3StatusCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Chap3StatusCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return Chap3StatusCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      Chap3StatusCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CHAP3_STATUS_CODE = "chap3StatusCode";
  @SerializedName(SERIALIZED_NAME_CHAP3_STATUS_CODE)
  private Chap3StatusCodeEnum chap3StatusCode;

  /**
   * Chapter 4 status code for the intermediary or flow-through entity. Available values: - 01: U.S. Withholding Agent - FI - 02: U.S. Withholding Agent - Other - 03: Territory FI - not treated as U.S. Person - 04: Territory FI - treated as U.S. Person - 05: Participating FFI - Other - 06: Participating FFI - Reporting Model 2 FFI - 07: Registered Deemed - Compliant FFI-Reporting Model 1 FFI - 08: Registered Deemed - Compliant FFI-Sponsored Entity - 09: Registered Deemed - Compliant FFI-Other - 10: Certified Deemed - Compliant FFI-Other - 11: Certified Deemed - Compliant FFI-FFI with Low Value Accounts - 12: Certified Deemed - Compliant FFI-Non-Registering Local Bank - 13: Certified Deemed - Compliant FFI-Sponsored Entity - 14: Certified Deemed - Compliant FFI-Investment Advisor or Investment Manager - 15: Nonparticipating FFI - 16: Owner-Documented FFI - 17: U.S. Branch - treated as U.S. person - 18: U.S. Branch - not treated as U.S. person (reporting under section 1471) - 19: Passive NFFE identifying Substantial U.S. Owners - 20: Passive NFFE with no Substantial U.S. Owners - 21: Publicly Traded NFFE or Affiliate of Publicly Traded NFFE - 22: Active NFFE - 23: Individual - 24: Section 501(c) Entities - 25: Excepted Territory NFFE - 26: Excepted NFFE - Other - 27: Exempt Beneficial Owner - 28: Entity Wholly Owned by Exempt Beneficial Owners - 29: Unknown Recipient - 30: Recalcitrant Account Holder - 31: Nonreporting IGA FFI - 32: Direct reporting NFFE - 33: U.S. reportable account - 34: Non-consenting U.S. account - 35: Sponsored direct reporting NFFE - 36: Excepted Inter-affiliate FFI - 37: Undocumented Preexisting Obligation - 38: U.S. Branch - ECI presumption applied - 39: Account Holder of Excluded Financial Account - 40: Passive NFFE reported by FFI - 41: NFFE subject to 1472 withholding - 42: Recalcitrant Pool - No U.S. Indicia - 43: Recalcitrant Pool - U.S. Indicia - 44: Recalcitrant Pool - Dormant Account - 45: Recalcitrant Pool - U.S. Persons - 46: Recalcitrant Pool - Passive NFFEs - 47: Nonparticipating FFI Pool - 48: U.S. Payees Pool - 49: QI - Recalcitrant Pool-General - 50: U.S. Withholding Agent-Foreign branch of FI
   */
  @JsonAdapter(Chap4StatusCodeEnum.Adapter.class)
  public enum Chap4StatusCodeEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _09("09"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12"),
    
    _13("13"),
    
    _14("14"),
    
    _15("15"),
    
    _16("16"),
    
    _17("17"),
    
    _18("18"),
    
    _19("19"),
    
    _20("20"),
    
    _21("21"),
    
    _22("22"),
    
    _23("23"),
    
    _24("24"),
    
    _25("25"),
    
    _26("26"),
    
    _27("27"),
    
    _28("28"),
    
    _29("29"),
    
    _30("30"),
    
    _31("31"),
    
    _32("32"),
    
    _33("33"),
    
    _34("34"),
    
    _35("35"),
    
    _36("36"),
    
    _37("37"),
    
    _38("38"),
    
    _39("39"),
    
    _40("40"),
    
    _41("41"),
    
    _42("42"),
    
    _43("43"),
    
    _44("44"),
    
    _45("45"),
    
    _46("46"),
    
    _47("47"),
    
    _48("48"),
    
    _49("49"),
    
    _50("50");

    private String value;

    Chap4StatusCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Chap4StatusCodeEnum fromValue(String value) {
      for (Chap4StatusCodeEnum b : Chap4StatusCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<Chap4StatusCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Chap4StatusCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Chap4StatusCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return Chap4StatusCodeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      Chap4StatusCodeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CHAP4_STATUS_CODE = "chap4StatusCode";
  @SerializedName(SERIALIZED_NAME_CHAP4_STATUS_CODE)
  private Chap4StatusCodeEnum chap4StatusCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GIIN = "giin";
  @SerializedName(SERIALIZED_NAME_GIIN)
  private String giin;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_FOREIGN_TIN = "foreignTin";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TIN)
  private String foreignTin;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public IntermediaryOrFlowThrough() {
  }

  public IntermediaryOrFlowThrough ein(String ein) {
    this.ein = ein;
    return this;
  }

  /**
   * EIN (Employer Identification Number) of the intermediary or flow-through entity
   * @return ein
   */
  @javax.annotation.Nullable
  public String getEin() {
    return ein;
  }

  public void setEin(String ein) {
    this.ein = ein;
  }


  public IntermediaryOrFlowThrough chap3StatusCode(Chap3StatusCodeEnum chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
    return this;
  }

  /**
   * Chapter 3 status code for the intermediary or flow-through entity. Available values: - 01: U.S. Withholding Agent - FI (Deprecated - valid only for tax years prior to 2020) - 02: U.S. Withholding Agent - Other (Deprecated - valid only for tax years prior to 2020) - 03: Territory FI - treated as U.S. Person - 04: Territory FI - not treated as U.S. Person - 05: U.S. branch - treated as U.S. Person - 06: U.S. branch - not treated as U.S. Person - 07: U.S. branch - ECI presumption applied - 08: Partnership other than Withholding Foreign Partnership - 09: Withholding Foreign Partnership - 10: Trust other than Withholding Foreign Trust - 11: Withholding Foreign Trust - 12: Qualified Intermediary - 13: Qualified Securities Lender - Qualified Intermediary - 14: Qualified Securities Lender - Other - 15: Corporation - 16: Individual - 17: Estate - 18: Private Foundation - 19: Government or International Organization - 20: Tax Exempt Organization (Section 501(c) entities) - 21: Unknown Recipient - 22: Artist or Athlete - 23: Pension - 24: Foreign Central Bank of Issue - 25: Nonqualified Intermediary - 26: Hybrid entity making Treaty Claim - 27: Withholding Rate Pool - General - 28: Withholding Rate Pool - Exempt Organization - 29: PAI Withholding Rate Pool - General - 30: PAI Withholding Rate Pool - Exempt Organization - 31: Agency Withholding Rate Pool - General - 32: Agency Withholding Rate Pool - Exempt Organization - 34: U.S. Withholding Agent-Foreign branch of FI (Deprecated - valid only for tax years prior to 2020) - 35: Qualified Derivatives Dealer - 36: Foreign Government - Integral Part - 37: Foreign Government - Controlled Entity - 38: Publicly Traded Partnership - 39: Disclosing Qualified Intermediary
   * @return chap3StatusCode
   */
  @javax.annotation.Nullable
  public Chap3StatusCodeEnum getChap3StatusCode() {
    return chap3StatusCode;
  }

  public void setChap3StatusCode(Chap3StatusCodeEnum chap3StatusCode) {
    this.chap3StatusCode = chap3StatusCode;
  }


  public IntermediaryOrFlowThrough chap4StatusCode(Chap4StatusCodeEnum chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
    return this;
  }

  /**
   * Chapter 4 status code for the intermediary or flow-through entity. Available values: - 01: U.S. Withholding Agent - FI - 02: U.S. Withholding Agent - Other - 03: Territory FI - not treated as U.S. Person - 04: Territory FI - treated as U.S. Person - 05: Participating FFI - Other - 06: Participating FFI - Reporting Model 2 FFI - 07: Registered Deemed - Compliant FFI-Reporting Model 1 FFI - 08: Registered Deemed - Compliant FFI-Sponsored Entity - 09: Registered Deemed - Compliant FFI-Other - 10: Certified Deemed - Compliant FFI-Other - 11: Certified Deemed - Compliant FFI-FFI with Low Value Accounts - 12: Certified Deemed - Compliant FFI-Non-Registering Local Bank - 13: Certified Deemed - Compliant FFI-Sponsored Entity - 14: Certified Deemed - Compliant FFI-Investment Advisor or Investment Manager - 15: Nonparticipating FFI - 16: Owner-Documented FFI - 17: U.S. Branch - treated as U.S. person - 18: U.S. Branch - not treated as U.S. person (reporting under section 1471) - 19: Passive NFFE identifying Substantial U.S. Owners - 20: Passive NFFE with no Substantial U.S. Owners - 21: Publicly Traded NFFE or Affiliate of Publicly Traded NFFE - 22: Active NFFE - 23: Individual - 24: Section 501(c) Entities - 25: Excepted Territory NFFE - 26: Excepted NFFE - Other - 27: Exempt Beneficial Owner - 28: Entity Wholly Owned by Exempt Beneficial Owners - 29: Unknown Recipient - 30: Recalcitrant Account Holder - 31: Nonreporting IGA FFI - 32: Direct reporting NFFE - 33: U.S. reportable account - 34: Non-consenting U.S. account - 35: Sponsored direct reporting NFFE - 36: Excepted Inter-affiliate FFI - 37: Undocumented Preexisting Obligation - 38: U.S. Branch - ECI presumption applied - 39: Account Holder of Excluded Financial Account - 40: Passive NFFE reported by FFI - 41: NFFE subject to 1472 withholding - 42: Recalcitrant Pool - No U.S. Indicia - 43: Recalcitrant Pool - U.S. Indicia - 44: Recalcitrant Pool - Dormant Account - 45: Recalcitrant Pool - U.S. Persons - 46: Recalcitrant Pool - Passive NFFEs - 47: Nonparticipating FFI Pool - 48: U.S. Payees Pool - 49: QI - Recalcitrant Pool-General - 50: U.S. Withholding Agent-Foreign branch of FI
   * @return chap4StatusCode
   */
  @javax.annotation.Nullable
  public Chap4StatusCodeEnum getChap4StatusCode() {
    return chap4StatusCode;
  }

  public void setChap4StatusCode(Chap4StatusCodeEnum chap4StatusCode) {
    this.chap4StatusCode = chap4StatusCode;
  }


  public IntermediaryOrFlowThrough name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the intermediary or flow-through entity
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public IntermediaryOrFlowThrough giin(String giin) {
    this.giin = giin;
    return this;
  }

  /**
   * GIIN (Global Intermediary Identification Number) of the intermediary or flow-through entity
   * @return giin
   */
  @javax.annotation.Nullable
  public String getGiin() {
    return giin;
  }

  public void setGiin(String giin) {
    this.giin = giin;
  }


  public IntermediaryOrFlowThrough countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code for the intermediary or flow-through entity
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public IntermediaryOrFlowThrough foreignTin(String foreignTin) {
    this.foreignTin = foreignTin;
    return this;
  }

  /**
   * Foreign TIN of the intermediary or flow-through entity
   * @return foreignTin
   */
  @javax.annotation.Nullable
  public String getForeignTin() {
    return foreignTin;
  }

  public void setForeignTin(String foreignTin) {
    this.foreignTin = foreignTin;
  }


  public IntermediaryOrFlowThrough address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address of the intermediary or flow-through entity
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public IntermediaryOrFlowThrough city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City of the intermediary or flow-through entity
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public IntermediaryOrFlowThrough state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State of the intermediary or flow-through entity
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public IntermediaryOrFlowThrough zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Zip code of the intermediary or flow-through entity
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntermediaryOrFlowThrough intermediaryOrFlowThrough = (IntermediaryOrFlowThrough) o;
    return Objects.equals(this.ein, intermediaryOrFlowThrough.ein) &&
        Objects.equals(this.chap3StatusCode, intermediaryOrFlowThrough.chap3StatusCode) &&
        Objects.equals(this.chap4StatusCode, intermediaryOrFlowThrough.chap4StatusCode) &&
        Objects.equals(this.name, intermediaryOrFlowThrough.name) &&
        Objects.equals(this.giin, intermediaryOrFlowThrough.giin) &&
        Objects.equals(this.countryCode, intermediaryOrFlowThrough.countryCode) &&
        Objects.equals(this.foreignTin, intermediaryOrFlowThrough.foreignTin) &&
        Objects.equals(this.address, intermediaryOrFlowThrough.address) &&
        Objects.equals(this.city, intermediaryOrFlowThrough.city) &&
        Objects.equals(this.state, intermediaryOrFlowThrough.state) &&
        Objects.equals(this.zip, intermediaryOrFlowThrough.zip);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ein, chap3StatusCode, chap4StatusCode, name, giin, countryCode, foreignTin, address, city, state, zip);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntermediaryOrFlowThrough {\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    chap3StatusCode: ").append(toIndentedString(chap3StatusCode)).append("\n");
    sb.append("    chap4StatusCode: ").append(toIndentedString(chap4StatusCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    giin: ").append(toIndentedString(giin)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    foreignTin: ").append(toIndentedString(foreignTin)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ein");
    openapiFields.add("chap3StatusCode");
    openapiFields.add("chap4StatusCode");
    openapiFields.add("name");
    openapiFields.add("giin");
    openapiFields.add("countryCode");
    openapiFields.add("foreignTin");
    openapiFields.add("address");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IntermediaryOrFlowThrough
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntermediaryOrFlowThrough.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntermediaryOrFlowThrough is not found in the empty JSON string", IntermediaryOrFlowThrough.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntermediaryOrFlowThrough.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntermediaryOrFlowThrough` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ein") != null && !jsonObj.get("ein").isJsonNull()) && !jsonObj.get("ein").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ein` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ein").toString()));
      }
      if ((jsonObj.get("chap3StatusCode") != null && !jsonObj.get("chap3StatusCode").isJsonNull()) && !jsonObj.get("chap3StatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chap3StatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chap3StatusCode").toString()));
      }
      // validate the optional field `chap3StatusCode`
      if (jsonObj.get("chap3StatusCode") != null && !jsonObj.get("chap3StatusCode").isJsonNull()) {
        Chap3StatusCodeEnum.validateJsonElement(jsonObj.get("chap3StatusCode"));
      }
      if ((jsonObj.get("chap4StatusCode") != null && !jsonObj.get("chap4StatusCode").isJsonNull()) && !jsonObj.get("chap4StatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chap4StatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chap4StatusCode").toString()));
      }
      // validate the optional field `chap4StatusCode`
      if (jsonObj.get("chap4StatusCode") != null && !jsonObj.get("chap4StatusCode").isJsonNull()) {
        Chap4StatusCodeEnum.validateJsonElement(jsonObj.get("chap4StatusCode"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("giin") != null && !jsonObj.get("giin").isJsonNull()) && !jsonObj.get("giin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `giin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("giin").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("foreignTin") != null && !jsonObj.get("foreignTin").isJsonNull()) && !jsonObj.get("foreignTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignTin").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntermediaryOrFlowThrough.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntermediaryOrFlowThrough' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntermediaryOrFlowThrough> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntermediaryOrFlowThrough.class));

       return (TypeAdapter<T>) new TypeAdapter<IntermediaryOrFlowThrough>() {
           @Override
           public void write(JsonWriter out, IntermediaryOrFlowThrough value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntermediaryOrFlowThrough read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IntermediaryOrFlowThrough given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IntermediaryOrFlowThrough
   * @throws IOException if the JSON string is invalid with respect to IntermediaryOrFlowThrough
   */
  public static IntermediaryOrFlowThrough fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntermediaryOrFlowThrough.class);
  }

  /**
   * Convert an instance of IntermediaryOrFlowThrough to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

