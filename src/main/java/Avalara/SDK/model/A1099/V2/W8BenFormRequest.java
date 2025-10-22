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
import java.time.LocalDate;
import java.time.OffsetDateTime;
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
 * W8BenFormRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class W8BenFormRequest {
  /**
   * The form type (always \&quot;w8ben\&quot; for this model).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    W4("W4"),
    
    W8_BEN("W8Ben"),
    
    W8_BEN_E("W8BenE"),
    
    W8_IMY("W8Imy"),
    
    W9("W9");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The country of citizenship.. Allowed values: US, AF, AX, AL, AG, AQ, AN, AO, AV, AY (and 248 more)
   */
  @JsonAdapter(CitizenshipCountryEnum.Adapter.class)
  public enum CitizenshipCountryEnum {
    US("US"),
    
    AF("AF"),
    
    AX("AX"),
    
    AL("AL"),
    
    AG("AG"),
    
    AQ("AQ"),
    
    AN("AN"),
    
    AO("AO"),
    
    AV("AV"),
    
    AY("AY"),
    
    AC("AC"),
    
    AR("AR"),
    
    AM("AM"),
    
    AA("AA"),
    
    AT("AT"),
    
    AS("AS"),
    
    AU("AU"),
    
    AJ("AJ"),
    
    BF("BF"),
    
    BA("BA"),
    
    FQ("FQ"),
    
    BG("BG"),
    
    BB("BB"),
    
    BO("BO"),
    
    BE("BE"),
    
    BH("BH"),
    
    BN("BN"),
    
    BD("BD"),
    
    BT("BT"),
    
    BL("BL"),
    
    BK("BK"),
    
    BC("BC"),
    
    BV("BV"),
    
    BR("BR"),
    
    IO("IO"),
    
    VI("VI"),
    
    BX("BX"),
    
    BU("BU"),
    
    UV("UV"),
    
    BM("BM"),
    
    BY("BY"),
    
    CB("CB"),
    
    CM("CM"),
    
    CA("CA"),
    
    CV("CV"),
    
    CJ("CJ"),
    
    CT("CT"),
    
    CD("CD"),
    
    CI("CI"),
    
    CH("CH"),
    
    KT("KT"),
    
    IP("IP"),
    
    CK("CK"),
    
    CO("CO"),
    
    CN("CN"),
    
    CF("CF"),
    
    CG("CG"),
    
    CW("CW"),
    
    CR("CR"),
    
    CS("CS"),
    
    IV("IV"),
    
    HR("HR"),
    
    CU("CU"),
    
    UC("UC"),
    
    CY("CY"),
    
    EZ("EZ"),
    
    DA("DA"),
    
    DX("DX"),
    
    DJ("DJ"),
    
    DO("DO"),
    
    DR("DR"),
    
    TT("TT"),
    
    EC("EC"),
    
    EG("EG"),
    
    ES("ES"),
    
    EK("EK"),
    
    ER("ER"),
    
    EN("EN"),
    
    ET("ET"),
    
    FK("FK"),
    
    FO("FO"),
    
    FM("FM"),
    
    FJ("FJ"),
    
    FI("FI"),
    
    FR("FR"),
    
    FP("FP"),
    
    FS("FS"),
    
    GB("GB"),
    
    GA("GA"),
    
    GG("GG"),
    
    GM("GM"),
    
    GH("GH"),
    
    GI("GI"),
    
    GR("GR"),
    
    GL("GL"),
    
    GJ("GJ"),
    
    GQ("GQ"),
    
    GT("GT"),
    
    GK("GK"),
    
    GV("GV"),
    
    PU("PU"),
    
    GY("GY"),
    
    HA("HA"),
    
    HM("HM"),
    
    VT("VT"),
    
    HO("HO"),
    
    HK("HK"),
    
    HQ("HQ"),
    
    HU("HU"),
    
    IC("IC"),
    
    IN("IN"),
    
    ID("ID"),
    
    IR("IR"),
    
    IZ("IZ"),
    
    EI("EI"),
    
    IS("IS"),
    
    IT("IT"),
    
    JM("JM"),
    
    JN("JN"),
    
    JA("JA"),
    
    DQ("DQ"),
    
    JE("JE"),
    
    JQ("JQ"),
    
    JO("JO"),
    
    KZ("KZ"),
    
    KE("KE"),
    
    KQ("KQ"),
    
    KR("KR"),
    
    KN("KN"),
    
    KS("KS"),
    
    KV("KV"),
    
    KU("KU"),
    
    KG("KG"),
    
    LA("LA"),
    
    LG("LG"),
    
    LE("LE"),
    
    LT("LT"),
    
    LI("LI"),
    
    LY("LY"),
    
    LS("LS"),
    
    LH("LH"),
    
    LU("LU"),
    
    MC("MC"),
    
    MK("MK"),
    
    MA("MA"),
    
    MI("MI"),
    
    MY("MY"),
    
    MV("MV"),
    
    ML("ML"),
    
    MT("MT"),
    
    IM("IM"),
    
    RM("RM"),
    
    MR("MR"),
    
    MP("MP"),
    
    MX("MX"),
    
    MQ("MQ"),
    
    MD("MD"),
    
    MN("MN"),
    
    MG("MG"),
    
    MJ("MJ"),
    
    MH("MH"),
    
    MO("MO"),
    
    MZ("MZ"),
    
    WA("WA"),
    
    NR("NR"),
    
    BQ("BQ"),
    
    NP("NP"),
    
    NL("NL"),
    
    NC("NC"),
    
    NZ("NZ"),
    
    NU("NU"),
    
    NG("NG"),
    
    NI("NI"),
    
    NE("NE"),
    
    NF("NF"),
    
    CQ("CQ"),
    
    NO("NO"),
    
    MU("MU"),
    
    OC("OC"),
    
    PK("PK"),
    
    PS("PS"),
    
    LQ("LQ"),
    
    PM("PM"),
    
    PP("PP"),
    
    PF("PF"),
    
    PA("PA"),
    
    PE("PE"),
    
    RP("RP"),
    
    PC("PC"),
    
    PL("PL"),
    
    PO("PO"),
    
    RQ("RQ"),
    
    QA("QA"),
    
    RO("RO"),
    
    RS("RS"),
    
    RW("RW"),
    
    TB("TB"),
    
    RN("RN"),
    
    WS("WS"),
    
    SM("SM"),
    
    TP("TP"),
    
    SA("SA"),
    
    SG("SG"),
    
    RI("RI"),
    
    SE("SE"),
    
    SL("SL"),
    
    SN("SN"),
    
    NN("NN"),
    
    LO("LO"),
    
    SI("SI"),
    
    BP("BP"),
    
    SO("SO"),
    
    SF("SF"),
    
    SX("SX"),
    
    SP("SP"),
    
    PG("PG"),
    
    CE("CE"),
    
    SH("SH"),
    
    SC("SC"),
    
    ST("ST"),
    
    SB("SB"),
    
    VC("VC"),
    
    SU("SU"),
    
    NS("NS"),
    
    SV("SV"),
    
    WZ("WZ"),
    
    SW("SW"),
    
    SZ("SZ"),
    
    SY("SY"),
    
    TW("TW"),
    
    TI("TI"),
    
    TZ("TZ"),
    
    TH("TH"),
    
    TO("TO"),
    
    TL("TL"),
    
    TN("TN"),
    
    TD("TD"),
    
    TS("TS"),
    
    TU("TU"),
    
    TX("TX"),
    
    TK("TK"),
    
    TV("TV"),
    
    UG("UG"),
    
    UP("UP"),
    
    AE("AE"),
    
    UK("UK"),
    
    UY("UY"),
    
    UZ("UZ"),
    
    NH("NH"),
    
    VE("VE"),
    
    VM("VM"),
    
    VQ("VQ"),
    
    WQ("WQ"),
    
    WF("WF"),
    
    WI("WI"),
    
    YM("YM"),
    
    ZA("ZA"),
    
    ZI("ZI");

    private String value;

    CitizenshipCountryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CitizenshipCountryEnum fromValue(String value) {
      for (CitizenshipCountryEnum b : CitizenshipCountryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CitizenshipCountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CitizenshipCountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CitizenshipCountryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CitizenshipCountryEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CitizenshipCountryEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CITIZENSHIP_COUNTRY = "citizenshipCountry";
  @SerializedName(SERIALIZED_NAME_CITIZENSHIP_COUNTRY)
  private CitizenshipCountryEnum citizenshipCountry;

  public static final String SERIALIZED_NAME_RESIDENCE_ADDRESS = "residenceAddress";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_ADDRESS)
  private String residenceAddress;

  public static final String SERIALIZED_NAME_RESIDENCE_CITY = "residenceCity";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_CITY)
  private String residenceCity;

  /**
   * The state of residence. Required for US and Canada.. Allowed values: AA, AE, AK, AL, AP, AR, AS, AZ, CA, CO (and 65 more)
   */
  @JsonAdapter(ResidenceStateEnum.Adapter.class)
  public enum ResidenceStateEnum {
    AA("AA"),
    
    AE("AE"),
    
    AK("AK"),
    
    AL("AL"),
    
    AP("AP"),
    
    AR("AR"),
    
    AS("AS"),
    
    AZ("AZ"),
    
    CA("CA"),
    
    CO("CO"),
    
    CT("CT"),
    
    DC("DC"),
    
    DE("DE"),
    
    FL("FL"),
    
    FM("FM"),
    
    GA("GA"),
    
    GU("GU"),
    
    HI("HI"),
    
    IA("IA"),
    
    ID("ID"),
    
    IL("IL"),
    
    IN("IN"),
    
    KS("KS"),
    
    KY("KY"),
    
    LA("LA"),
    
    MA("MA"),
    
    MD("MD"),
    
    ME("ME"),
    
    MH("MH"),
    
    MI("MI"),
    
    MN("MN"),
    
    MO("MO"),
    
    MP("MP"),
    
    MS("MS"),
    
    MT("MT"),
    
    NC("NC"),
    
    ND("ND"),
    
    NE("NE"),
    
    NH("NH"),
    
    NJ("NJ"),
    
    NM("NM"),
    
    NV("NV"),
    
    NY("NY"),
    
    OH("OH"),
    
    OK("OK"),
    
    OR("OR"),
    
    PA("PA"),
    
    PR("PR"),
    
    PW("PW"),
    
    RI("RI"),
    
    SC("SC"),
    
    SD("SD"),
    
    TN("TN"),
    
    TX("TX"),
    
    UT("UT"),
    
    VA("VA"),
    
    VI("VI"),
    
    VT("VT"),
    
    WA("WA"),
    
    WI("WI"),
    
    WV("WV"),
    
    WY("WY"),
    
    AB("AB"),
    
    BC("BC"),
    
    MB("MB"),
    
    NB("NB"),
    
    NL("NL"),
    
    NS("NS"),
    
    NT("NT"),
    
    NU("NU"),
    
    ON("ON"),
    
    PE("PE"),
    
    QC("QC"),
    
    SK("SK"),
    
    YT("YT");

    private String value;

    ResidenceStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResidenceStateEnum fromValue(String value) {
      for (ResidenceStateEnum b : ResidenceStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ResidenceStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResidenceStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResidenceStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResidenceStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ResidenceStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESIDENCE_STATE = "residenceState";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_STATE)
  private ResidenceStateEnum residenceState;

  public static final String SERIALIZED_NAME_RESIDENCE_ZIP = "residenceZip";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_ZIP)
  private String residenceZip;

  /**
   * The country of residence.. Allowed values: US, AF, AX, AL, AG, AQ, AN, AO, AV, AY (and 248 more)
   */
  @JsonAdapter(ResidenceCountryEnum.Adapter.class)
  public enum ResidenceCountryEnum {
    US("US"),
    
    AF("AF"),
    
    AX("AX"),
    
    AL("AL"),
    
    AG("AG"),
    
    AQ("AQ"),
    
    AN("AN"),
    
    AO("AO"),
    
    AV("AV"),
    
    AY("AY"),
    
    AC("AC"),
    
    AR("AR"),
    
    AM("AM"),
    
    AA("AA"),
    
    AT("AT"),
    
    AS("AS"),
    
    AU("AU"),
    
    AJ("AJ"),
    
    BF("BF"),
    
    BA("BA"),
    
    FQ("FQ"),
    
    BG("BG"),
    
    BB("BB"),
    
    BO("BO"),
    
    BE("BE"),
    
    BH("BH"),
    
    BN("BN"),
    
    BD("BD"),
    
    BT("BT"),
    
    BL("BL"),
    
    BK("BK"),
    
    BC("BC"),
    
    BV("BV"),
    
    BR("BR"),
    
    IO("IO"),
    
    VI("VI"),
    
    BX("BX"),
    
    BU("BU"),
    
    UV("UV"),
    
    BM("BM"),
    
    BY("BY"),
    
    CB("CB"),
    
    CM("CM"),
    
    CA("CA"),
    
    CV("CV"),
    
    CJ("CJ"),
    
    CT("CT"),
    
    CD("CD"),
    
    CI("CI"),
    
    CH("CH"),
    
    KT("KT"),
    
    IP("IP"),
    
    CK("CK"),
    
    CO("CO"),
    
    CN("CN"),
    
    CF("CF"),
    
    CG("CG"),
    
    CW("CW"),
    
    CR("CR"),
    
    CS("CS"),
    
    IV("IV"),
    
    HR("HR"),
    
    CU("CU"),
    
    UC("UC"),
    
    CY("CY"),
    
    EZ("EZ"),
    
    DA("DA"),
    
    DX("DX"),
    
    DJ("DJ"),
    
    DO("DO"),
    
    DR("DR"),
    
    TT("TT"),
    
    EC("EC"),
    
    EG("EG"),
    
    ES("ES"),
    
    EK("EK"),
    
    ER("ER"),
    
    EN("EN"),
    
    ET("ET"),
    
    FK("FK"),
    
    FO("FO"),
    
    FM("FM"),
    
    FJ("FJ"),
    
    FI("FI"),
    
    FR("FR"),
    
    FP("FP"),
    
    FS("FS"),
    
    GB("GB"),
    
    GA("GA"),
    
    GG("GG"),
    
    GM("GM"),
    
    GH("GH"),
    
    GI("GI"),
    
    GR("GR"),
    
    GL("GL"),
    
    GJ("GJ"),
    
    GQ("GQ"),
    
    GT("GT"),
    
    GK("GK"),
    
    GV("GV"),
    
    PU("PU"),
    
    GY("GY"),
    
    HA("HA"),
    
    HM("HM"),
    
    VT("VT"),
    
    HO("HO"),
    
    HK("HK"),
    
    HQ("HQ"),
    
    HU("HU"),
    
    IC("IC"),
    
    IN("IN"),
    
    ID("ID"),
    
    IR("IR"),
    
    IZ("IZ"),
    
    EI("EI"),
    
    IS("IS"),
    
    IT("IT"),
    
    JM("JM"),
    
    JN("JN"),
    
    JA("JA"),
    
    DQ("DQ"),
    
    JE("JE"),
    
    JQ("JQ"),
    
    JO("JO"),
    
    KZ("KZ"),
    
    KE("KE"),
    
    KQ("KQ"),
    
    KR("KR"),
    
    KN("KN"),
    
    KS("KS"),
    
    KV("KV"),
    
    KU("KU"),
    
    KG("KG"),
    
    LA("LA"),
    
    LG("LG"),
    
    LE("LE"),
    
    LT("LT"),
    
    LI("LI"),
    
    LY("LY"),
    
    LS("LS"),
    
    LH("LH"),
    
    LU("LU"),
    
    MC("MC"),
    
    MK("MK"),
    
    MA("MA"),
    
    MI("MI"),
    
    MY("MY"),
    
    MV("MV"),
    
    ML("ML"),
    
    MT("MT"),
    
    IM("IM"),
    
    RM("RM"),
    
    MR("MR"),
    
    MP("MP"),
    
    MX("MX"),
    
    MQ("MQ"),
    
    MD("MD"),
    
    MN("MN"),
    
    MG("MG"),
    
    MJ("MJ"),
    
    MH("MH"),
    
    MO("MO"),
    
    MZ("MZ"),
    
    WA("WA"),
    
    NR("NR"),
    
    BQ("BQ"),
    
    NP("NP"),
    
    NL("NL"),
    
    NC("NC"),
    
    NZ("NZ"),
    
    NU("NU"),
    
    NG("NG"),
    
    NI("NI"),
    
    NE("NE"),
    
    NF("NF"),
    
    CQ("CQ"),
    
    NO("NO"),
    
    MU("MU"),
    
    OC("OC"),
    
    PK("PK"),
    
    PS("PS"),
    
    LQ("LQ"),
    
    PM("PM"),
    
    PP("PP"),
    
    PF("PF"),
    
    PA("PA"),
    
    PE("PE"),
    
    RP("RP"),
    
    PC("PC"),
    
    PL("PL"),
    
    PO("PO"),
    
    RQ("RQ"),
    
    QA("QA"),
    
    RO("RO"),
    
    RS("RS"),
    
    RW("RW"),
    
    TB("TB"),
    
    RN("RN"),
    
    WS("WS"),
    
    SM("SM"),
    
    TP("TP"),
    
    SA("SA"),
    
    SG("SG"),
    
    RI("RI"),
    
    SE("SE"),
    
    SL("SL"),
    
    SN("SN"),
    
    NN("NN"),
    
    LO("LO"),
    
    SI("SI"),
    
    BP("BP"),
    
    SO("SO"),
    
    SF("SF"),
    
    SX("SX"),
    
    SP("SP"),
    
    PG("PG"),
    
    CE("CE"),
    
    SH("SH"),
    
    SC("SC"),
    
    ST("ST"),
    
    SB("SB"),
    
    VC("VC"),
    
    SU("SU"),
    
    NS("NS"),
    
    SV("SV"),
    
    WZ("WZ"),
    
    SW("SW"),
    
    SZ("SZ"),
    
    SY("SY"),
    
    TW("TW"),
    
    TI("TI"),
    
    TZ("TZ"),
    
    TH("TH"),
    
    TO("TO"),
    
    TL("TL"),
    
    TN("TN"),
    
    TD("TD"),
    
    TS("TS"),
    
    TU("TU"),
    
    TX("TX"),
    
    TK("TK"),
    
    TV("TV"),
    
    UG("UG"),
    
    UP("UP"),
    
    AE("AE"),
    
    UK("UK"),
    
    UY("UY"),
    
    UZ("UZ"),
    
    NH("NH"),
    
    VE("VE"),
    
    VM("VM"),
    
    VQ("VQ"),
    
    WQ("WQ"),
    
    WF("WF"),
    
    WI("WI"),
    
    YM("YM"),
    
    ZA("ZA"),
    
    ZI("ZI");

    private String value;

    ResidenceCountryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResidenceCountryEnum fromValue(String value) {
      for (ResidenceCountryEnum b : ResidenceCountryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResidenceCountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResidenceCountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResidenceCountryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResidenceCountryEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ResidenceCountryEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RESIDENCE_COUNTRY = "residenceCountry";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_COUNTRY)
  private ResidenceCountryEnum residenceCountry;

  public static final String SERIALIZED_NAME_RESIDENCE_IS_MAILING = "residenceIsMailing";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_IS_MAILING)
  private Boolean residenceIsMailing;

  public static final String SERIALIZED_NAME_MAILING_ADDRESS = "mailingAddress";
  @SerializedName(SERIALIZED_NAME_MAILING_ADDRESS)
  private String mailingAddress;

  public static final String SERIALIZED_NAME_MAILING_CITY = "mailingCity";
  @SerializedName(SERIALIZED_NAME_MAILING_CITY)
  private String mailingCity;

  /**
   * The state of the mailing address. Required for US and Canada.. Allowed values: AA, AE, AK, AL, AP, AR, AS, AZ, CA, CO (and 65 more)
   */
  @JsonAdapter(MailingStateEnum.Adapter.class)
  public enum MailingStateEnum {
    AA("AA"),
    
    AE("AE"),
    
    AK("AK"),
    
    AL("AL"),
    
    AP("AP"),
    
    AR("AR"),
    
    AS("AS"),
    
    AZ("AZ"),
    
    CA("CA"),
    
    CO("CO"),
    
    CT("CT"),
    
    DC("DC"),
    
    DE("DE"),
    
    FL("FL"),
    
    FM("FM"),
    
    GA("GA"),
    
    GU("GU"),
    
    HI("HI"),
    
    IA("IA"),
    
    ID("ID"),
    
    IL("IL"),
    
    IN("IN"),
    
    KS("KS"),
    
    KY("KY"),
    
    LA("LA"),
    
    MA("MA"),
    
    MD("MD"),
    
    ME("ME"),
    
    MH("MH"),
    
    MI("MI"),
    
    MN("MN"),
    
    MO("MO"),
    
    MP("MP"),
    
    MS("MS"),
    
    MT("MT"),
    
    NC("NC"),
    
    ND("ND"),
    
    NE("NE"),
    
    NH("NH"),
    
    NJ("NJ"),
    
    NM("NM"),
    
    NV("NV"),
    
    NY("NY"),
    
    OH("OH"),
    
    OK("OK"),
    
    OR("OR"),
    
    PA("PA"),
    
    PR("PR"),
    
    PW("PW"),
    
    RI("RI"),
    
    SC("SC"),
    
    SD("SD"),
    
    TN("TN"),
    
    TX("TX"),
    
    UT("UT"),
    
    VA("VA"),
    
    VI("VI"),
    
    VT("VT"),
    
    WA("WA"),
    
    WI("WI"),
    
    WV("WV"),
    
    WY("WY"),
    
    AB("AB"),
    
    BC("BC"),
    
    MB("MB"),
    
    NB("NB"),
    
    NL("NL"),
    
    NS("NS"),
    
    NT("NT"),
    
    NU("NU"),
    
    ON("ON"),
    
    PE("PE"),
    
    QC("QC"),
    
    SK("SK"),
    
    YT("YT");

    private String value;

    MailingStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MailingStateEnum fromValue(String value) {
      for (MailingStateEnum b : MailingStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MailingStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MailingStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MailingStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MailingStateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MailingStateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MAILING_STATE = "mailingState";
  @SerializedName(SERIALIZED_NAME_MAILING_STATE)
  private MailingStateEnum mailingState;

  public static final String SERIALIZED_NAME_MAILING_ZIP = "mailingZip";
  @SerializedName(SERIALIZED_NAME_MAILING_ZIP)
  private String mailingZip;

  /**
   * The country of the mailing address.. Allowed values: US, AF, AX, AL, AG, AQ, AN, AO, AV, AY (and 248 more)
   */
  @JsonAdapter(MailingCountryEnum.Adapter.class)
  public enum MailingCountryEnum {
    US("US"),
    
    AF("AF"),
    
    AX("AX"),
    
    AL("AL"),
    
    AG("AG"),
    
    AQ("AQ"),
    
    AN("AN"),
    
    AO("AO"),
    
    AV("AV"),
    
    AY("AY"),
    
    AC("AC"),
    
    AR("AR"),
    
    AM("AM"),
    
    AA("AA"),
    
    AT("AT"),
    
    AS("AS"),
    
    AU("AU"),
    
    AJ("AJ"),
    
    BF("BF"),
    
    BA("BA"),
    
    FQ("FQ"),
    
    BG("BG"),
    
    BB("BB"),
    
    BO("BO"),
    
    BE("BE"),
    
    BH("BH"),
    
    BN("BN"),
    
    BD("BD"),
    
    BT("BT"),
    
    BL("BL"),
    
    BK("BK"),
    
    BC("BC"),
    
    BV("BV"),
    
    BR("BR"),
    
    IO("IO"),
    
    VI("VI"),
    
    BX("BX"),
    
    BU("BU"),
    
    UV("UV"),
    
    BM("BM"),
    
    BY("BY"),
    
    CB("CB"),
    
    CM("CM"),
    
    CA("CA"),
    
    CV("CV"),
    
    CJ("CJ"),
    
    CT("CT"),
    
    CD("CD"),
    
    CI("CI"),
    
    CH("CH"),
    
    KT("KT"),
    
    IP("IP"),
    
    CK("CK"),
    
    CO("CO"),
    
    CN("CN"),
    
    CF("CF"),
    
    CG("CG"),
    
    CW("CW"),
    
    CR("CR"),
    
    CS("CS"),
    
    IV("IV"),
    
    HR("HR"),
    
    CU("CU"),
    
    UC("UC"),
    
    CY("CY"),
    
    EZ("EZ"),
    
    DA("DA"),
    
    DX("DX"),
    
    DJ("DJ"),
    
    DO("DO"),
    
    DR("DR"),
    
    TT("TT"),
    
    EC("EC"),
    
    EG("EG"),
    
    ES("ES"),
    
    EK("EK"),
    
    ER("ER"),
    
    EN("EN"),
    
    ET("ET"),
    
    FK("FK"),
    
    FO("FO"),
    
    FM("FM"),
    
    FJ("FJ"),
    
    FI("FI"),
    
    FR("FR"),
    
    FP("FP"),
    
    FS("FS"),
    
    GB("GB"),
    
    GA("GA"),
    
    GG("GG"),
    
    GM("GM"),
    
    GH("GH"),
    
    GI("GI"),
    
    GR("GR"),
    
    GL("GL"),
    
    GJ("GJ"),
    
    GQ("GQ"),
    
    GT("GT"),
    
    GK("GK"),
    
    GV("GV"),
    
    PU("PU"),
    
    GY("GY"),
    
    HA("HA"),
    
    HM("HM"),
    
    VT("VT"),
    
    HO("HO"),
    
    HK("HK"),
    
    HQ("HQ"),
    
    HU("HU"),
    
    IC("IC"),
    
    IN("IN"),
    
    ID("ID"),
    
    IR("IR"),
    
    IZ("IZ"),
    
    EI("EI"),
    
    IS("IS"),
    
    IT("IT"),
    
    JM("JM"),
    
    JN("JN"),
    
    JA("JA"),
    
    DQ("DQ"),
    
    JE("JE"),
    
    JQ("JQ"),
    
    JO("JO"),
    
    KZ("KZ"),
    
    KE("KE"),
    
    KQ("KQ"),
    
    KR("KR"),
    
    KN("KN"),
    
    KS("KS"),
    
    KV("KV"),
    
    KU("KU"),
    
    KG("KG"),
    
    LA("LA"),
    
    LG("LG"),
    
    LE("LE"),
    
    LT("LT"),
    
    LI("LI"),
    
    LY("LY"),
    
    LS("LS"),
    
    LH("LH"),
    
    LU("LU"),
    
    MC("MC"),
    
    MK("MK"),
    
    MA("MA"),
    
    MI("MI"),
    
    MY("MY"),
    
    MV("MV"),
    
    ML("ML"),
    
    MT("MT"),
    
    IM("IM"),
    
    RM("RM"),
    
    MR("MR"),
    
    MP("MP"),
    
    MX("MX"),
    
    MQ("MQ"),
    
    MD("MD"),
    
    MN("MN"),
    
    MG("MG"),
    
    MJ("MJ"),
    
    MH("MH"),
    
    MO("MO"),
    
    MZ("MZ"),
    
    WA("WA"),
    
    NR("NR"),
    
    BQ("BQ"),
    
    NP("NP"),
    
    NL("NL"),
    
    NC("NC"),
    
    NZ("NZ"),
    
    NU("NU"),
    
    NG("NG"),
    
    NI("NI"),
    
    NE("NE"),
    
    NF("NF"),
    
    CQ("CQ"),
    
    NO("NO"),
    
    MU("MU"),
    
    OC("OC"),
    
    PK("PK"),
    
    PS("PS"),
    
    LQ("LQ"),
    
    PM("PM"),
    
    PP("PP"),
    
    PF("PF"),
    
    PA("PA"),
    
    PE("PE"),
    
    RP("RP"),
    
    PC("PC"),
    
    PL("PL"),
    
    PO("PO"),
    
    RQ("RQ"),
    
    QA("QA"),
    
    RO("RO"),
    
    RS("RS"),
    
    RW("RW"),
    
    TB("TB"),
    
    RN("RN"),
    
    WS("WS"),
    
    SM("SM"),
    
    TP("TP"),
    
    SA("SA"),
    
    SG("SG"),
    
    RI("RI"),
    
    SE("SE"),
    
    SL("SL"),
    
    SN("SN"),
    
    NN("NN"),
    
    LO("LO"),
    
    SI("SI"),
    
    BP("BP"),
    
    SO("SO"),
    
    SF("SF"),
    
    SX("SX"),
    
    SP("SP"),
    
    PG("PG"),
    
    CE("CE"),
    
    SH("SH"),
    
    SC("SC"),
    
    ST("ST"),
    
    SB("SB"),
    
    VC("VC"),
    
    SU("SU"),
    
    NS("NS"),
    
    SV("SV"),
    
    WZ("WZ"),
    
    SW("SW"),
    
    SZ("SZ"),
    
    SY("SY"),
    
    TW("TW"),
    
    TI("TI"),
    
    TZ("TZ"),
    
    TH("TH"),
    
    TO("TO"),
    
    TL("TL"),
    
    TN("TN"),
    
    TD("TD"),
    
    TS("TS"),
    
    TU("TU"),
    
    TX("TX"),
    
    TK("TK"),
    
    TV("TV"),
    
    UG("UG"),
    
    UP("UP"),
    
    AE("AE"),
    
    UK("UK"),
    
    UY("UY"),
    
    UZ("UZ"),
    
    NH("NH"),
    
    VE("VE"),
    
    VM("VM"),
    
    VQ("VQ"),
    
    WQ("WQ"),
    
    WF("WF"),
    
    WI("WI"),
    
    YM("YM"),
    
    ZA("ZA"),
    
    ZI("ZI");

    private String value;

    MailingCountryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MailingCountryEnum fromValue(String value) {
      for (MailingCountryEnum b : MailingCountryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MailingCountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MailingCountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MailingCountryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MailingCountryEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MailingCountryEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MAILING_COUNTRY = "mailingCountry";
  @SerializedName(SERIALIZED_NAME_MAILING_COUNTRY)
  private MailingCountryEnum mailingCountry;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_FOREIGN_TIN_NOT_REQUIRED = "foreignTinNotRequired";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TIN_NOT_REQUIRED)
  private Boolean foreignTinNotRequired;

  public static final String SERIALIZED_NAME_FOREIGN_TIN = "foreignTin";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TIN)
  private String foreignTin;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private LocalDate birthday;

  /**
   * The country for which the treaty applies.. Allowed values: US, AF, AX, AL, AG, AQ, AN, AO, AV, AY (and 248 more)
   */
  @JsonAdapter(TreatyCountryEnum.Adapter.class)
  public enum TreatyCountryEnum {
    US("US"),
    
    AF("AF"),
    
    AX("AX"),
    
    AL("AL"),
    
    AG("AG"),
    
    AQ("AQ"),
    
    AN("AN"),
    
    AO("AO"),
    
    AV("AV"),
    
    AY("AY"),
    
    AC("AC"),
    
    AR("AR"),
    
    AM("AM"),
    
    AA("AA"),
    
    AT("AT"),
    
    AS("AS"),
    
    AU("AU"),
    
    AJ("AJ"),
    
    BF("BF"),
    
    BA("BA"),
    
    FQ("FQ"),
    
    BG("BG"),
    
    BB("BB"),
    
    BO("BO"),
    
    BE("BE"),
    
    BH("BH"),
    
    BN("BN"),
    
    BD("BD"),
    
    BT("BT"),
    
    BL("BL"),
    
    BK("BK"),
    
    BC("BC"),
    
    BV("BV"),
    
    BR("BR"),
    
    IO("IO"),
    
    VI("VI"),
    
    BX("BX"),
    
    BU("BU"),
    
    UV("UV"),
    
    BM("BM"),
    
    BY("BY"),
    
    CB("CB"),
    
    CM("CM"),
    
    CA("CA"),
    
    CV("CV"),
    
    CJ("CJ"),
    
    CT("CT"),
    
    CD("CD"),
    
    CI("CI"),
    
    CH("CH"),
    
    KT("KT"),
    
    IP("IP"),
    
    CK("CK"),
    
    CO("CO"),
    
    CN("CN"),
    
    CF("CF"),
    
    CG("CG"),
    
    CW("CW"),
    
    CR("CR"),
    
    CS("CS"),
    
    IV("IV"),
    
    HR("HR"),
    
    CU("CU"),
    
    UC("UC"),
    
    CY("CY"),
    
    EZ("EZ"),
    
    DA("DA"),
    
    DX("DX"),
    
    DJ("DJ"),
    
    DO("DO"),
    
    DR("DR"),
    
    TT("TT"),
    
    EC("EC"),
    
    EG("EG"),
    
    ES("ES"),
    
    EK("EK"),
    
    ER("ER"),
    
    EN("EN"),
    
    ET("ET"),
    
    FK("FK"),
    
    FO("FO"),
    
    FM("FM"),
    
    FJ("FJ"),
    
    FI("FI"),
    
    FR("FR"),
    
    FP("FP"),
    
    FS("FS"),
    
    GB("GB"),
    
    GA("GA"),
    
    GG("GG"),
    
    GM("GM"),
    
    GH("GH"),
    
    GI("GI"),
    
    GR("GR"),
    
    GL("GL"),
    
    GJ("GJ"),
    
    GQ("GQ"),
    
    GT("GT"),
    
    GK("GK"),
    
    GV("GV"),
    
    PU("PU"),
    
    GY("GY"),
    
    HA("HA"),
    
    HM("HM"),
    
    VT("VT"),
    
    HO("HO"),
    
    HK("HK"),
    
    HQ("HQ"),
    
    HU("HU"),
    
    IC("IC"),
    
    IN("IN"),
    
    ID("ID"),
    
    IR("IR"),
    
    IZ("IZ"),
    
    EI("EI"),
    
    IS("IS"),
    
    IT("IT"),
    
    JM("JM"),
    
    JN("JN"),
    
    JA("JA"),
    
    DQ("DQ"),
    
    JE("JE"),
    
    JQ("JQ"),
    
    JO("JO"),
    
    KZ("KZ"),
    
    KE("KE"),
    
    KQ("KQ"),
    
    KR("KR"),
    
    KN("KN"),
    
    KS("KS"),
    
    KV("KV"),
    
    KU("KU"),
    
    KG("KG"),
    
    LA("LA"),
    
    LG("LG"),
    
    LE("LE"),
    
    LT("LT"),
    
    LI("LI"),
    
    LY("LY"),
    
    LS("LS"),
    
    LH("LH"),
    
    LU("LU"),
    
    MC("MC"),
    
    MK("MK"),
    
    MA("MA"),
    
    MI("MI"),
    
    MY("MY"),
    
    MV("MV"),
    
    ML("ML"),
    
    MT("MT"),
    
    IM("IM"),
    
    RM("RM"),
    
    MR("MR"),
    
    MP("MP"),
    
    MX("MX"),
    
    MQ("MQ"),
    
    MD("MD"),
    
    MN("MN"),
    
    MG("MG"),
    
    MJ("MJ"),
    
    MH("MH"),
    
    MO("MO"),
    
    MZ("MZ"),
    
    WA("WA"),
    
    NR("NR"),
    
    BQ("BQ"),
    
    NP("NP"),
    
    NL("NL"),
    
    NC("NC"),
    
    NZ("NZ"),
    
    NU("NU"),
    
    NG("NG"),
    
    NI("NI"),
    
    NE("NE"),
    
    NF("NF"),
    
    CQ("CQ"),
    
    NO("NO"),
    
    MU("MU"),
    
    OC("OC"),
    
    PK("PK"),
    
    PS("PS"),
    
    LQ("LQ"),
    
    PM("PM"),
    
    PP("PP"),
    
    PF("PF"),
    
    PA("PA"),
    
    PE("PE"),
    
    RP("RP"),
    
    PC("PC"),
    
    PL("PL"),
    
    PO("PO"),
    
    RQ("RQ"),
    
    QA("QA"),
    
    RO("RO"),
    
    RS("RS"),
    
    RW("RW"),
    
    TB("TB"),
    
    RN("RN"),
    
    WS("WS"),
    
    SM("SM"),
    
    TP("TP"),
    
    SA("SA"),
    
    SG("SG"),
    
    RI("RI"),
    
    SE("SE"),
    
    SL("SL"),
    
    SN("SN"),
    
    NN("NN"),
    
    LO("LO"),
    
    SI("SI"),
    
    BP("BP"),
    
    SO("SO"),
    
    SF("SF"),
    
    SX("SX"),
    
    SP("SP"),
    
    PG("PG"),
    
    CE("CE"),
    
    SH("SH"),
    
    SC("SC"),
    
    ST("ST"),
    
    SB("SB"),
    
    VC("VC"),
    
    SU("SU"),
    
    NS("NS"),
    
    SV("SV"),
    
    WZ("WZ"),
    
    SW("SW"),
    
    SZ("SZ"),
    
    SY("SY"),
    
    TW("TW"),
    
    TI("TI"),
    
    TZ("TZ"),
    
    TH("TH"),
    
    TO("TO"),
    
    TL("TL"),
    
    TN("TN"),
    
    TD("TD"),
    
    TS("TS"),
    
    TU("TU"),
    
    TX("TX"),
    
    TK("TK"),
    
    TV("TV"),
    
    UG("UG"),
    
    UP("UP"),
    
    AE("AE"),
    
    UK("UK"),
    
    UY("UY"),
    
    UZ("UZ"),
    
    NH("NH"),
    
    VE("VE"),
    
    VM("VM"),
    
    VQ("VQ"),
    
    WQ("WQ"),
    
    WF("WF"),
    
    WI("WI"),
    
    YM("YM"),
    
    ZA("ZA"),
    
    ZI("ZI");

    private String value;

    TreatyCountryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TreatyCountryEnum fromValue(String value) {
      for (TreatyCountryEnum b : TreatyCountryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TreatyCountryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TreatyCountryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TreatyCountryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TreatyCountryEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TreatyCountryEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TREATY_COUNTRY = "treatyCountry";
  @SerializedName(SERIALIZED_NAME_TREATY_COUNTRY)
  private TreatyCountryEnum treatyCountry;

  public static final String SERIALIZED_NAME_TREATY_ARTICLE = "treatyArticle";
  @SerializedName(SERIALIZED_NAME_TREATY_ARTICLE)
  private String treatyArticle;

  public static final String SERIALIZED_NAME_TREATY_REASONS = "treatyReasons";
  @SerializedName(SERIALIZED_NAME_TREATY_REASONS)
  private String treatyReasons;

  /**
   * The withholding rate applied as per the treaty. Must be a percentage with up to two decimals (e.g., 12.50, 0).. Allowed values: 0, 0.0, 0.00, 5, 5.5, 10, 12.50, 15, 20, 25 (and 1 more)
   */
  @JsonAdapter(WithholdingRateEnum.Adapter.class)
  public enum WithholdingRateEnum {
    _0("0"),
    
    _0_0("0.0"),
    
    _0_00("0.00"),
    
    _5("5"),
    
    _5_5("5.5"),
    
    _10("10"),
    
    _12_50("12.50"),
    
    _15("15"),
    
    _20("20"),
    
    _25("25"),
    
    _30("30");

    private String value;

    WithholdingRateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WithholdingRateEnum fromValue(String value) {
      for (WithholdingRateEnum b : WithholdingRateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WithholdingRateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WithholdingRateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WithholdingRateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WithholdingRateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WithholdingRateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WITHHOLDING_RATE = "withholdingRate";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_RATE)
  private WithholdingRateEnum withholdingRate;

  public static final String SERIALIZED_NAME_INCOME_TYPE = "incomeType";
  @SerializedName(SERIALIZED_NAME_INCOME_TYPE)
  private String incomeType;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT = "eDeliveryConsentedAt";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT)
  private OffsetDateTime eDeliveryConsentedAt;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public W8BenFormRequest() {
  }

  public W8BenFormRequest(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  /**
   * The form type (always \&quot;w8ben\&quot; for this model).
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }



  public W8BenFormRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the individual or entity associated with the form.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public W8BenFormRequest citizenshipCountry(CitizenshipCountryEnum citizenshipCountry) {
    this.citizenshipCountry = citizenshipCountry;
    return this;
  }

  /**
   * The country of citizenship.. Allowed values: US, AF, AX, AL, AG, AQ, AN, AO, AV, AY (and 248 more)
   * @return citizenshipCountry
   */
  @javax.annotation.Nonnull
  public CitizenshipCountryEnum getCitizenshipCountry() {
    return citizenshipCountry;
  }

  public void setCitizenshipCountry(CitizenshipCountryEnum citizenshipCountry) {
    this.citizenshipCountry = citizenshipCountry;
  }


  public W8BenFormRequest residenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
    return this;
  }

  /**
   * The residential address of the individual or entity.
   * @return residenceAddress
   */
  @javax.annotation.Nullable
  public String getResidenceAddress() {
    return residenceAddress;
  }

  public void setResidenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
  }


  public W8BenFormRequest residenceCity(String residenceCity) {
    this.residenceCity = residenceCity;
    return this;
  }

  /**
   * The city of residence.
   * @return residenceCity
   */
  @javax.annotation.Nullable
  public String getResidenceCity() {
    return residenceCity;
  }

  public void setResidenceCity(String residenceCity) {
    this.residenceCity = residenceCity;
  }


  public W8BenFormRequest residenceState(ResidenceStateEnum residenceState) {
    this.residenceState = residenceState;
    return this;
  }

  /**
   * The state of residence. Required for US and Canada.. Allowed values: AA, AE, AK, AL, AP, AR, AS, AZ, CA, CO (and 65 more)
   * @return residenceState
   */
  @javax.annotation.Nullable
  public ResidenceStateEnum getResidenceState() {
    return residenceState;
  }

  public void setResidenceState(ResidenceStateEnum residenceState) {
    this.residenceState = residenceState;
  }


  public W8BenFormRequest residenceZip(String residenceZip) {
    this.residenceZip = residenceZip;
    return this;
  }

  /**
   * The ZIP code of the residence.
   * @return residenceZip
   */
  @javax.annotation.Nullable
  public String getResidenceZip() {
    return residenceZip;
  }

  public void setResidenceZip(String residenceZip) {
    this.residenceZip = residenceZip;
  }


  public W8BenFormRequest residenceCountry(ResidenceCountryEnum residenceCountry) {
    this.residenceCountry = residenceCountry;
    return this;
  }

  /**
   * The country of residence.. Allowed values: US, AF, AX, AL, AG, AQ, AN, AO, AV, AY (and 248 more)
   * @return residenceCountry
   */
  @javax.annotation.Nonnull
  public ResidenceCountryEnum getResidenceCountry() {
    return residenceCountry;
  }

  public void setResidenceCountry(ResidenceCountryEnum residenceCountry) {
    this.residenceCountry = residenceCountry;
  }


  public W8BenFormRequest residenceIsMailing(Boolean residenceIsMailing) {
    this.residenceIsMailing = residenceIsMailing;
    return this;
  }

  /**
   * Indicates whether the residence address is the mailing address.
   * @return residenceIsMailing
   */
  @javax.annotation.Nullable
  public Boolean getResidenceIsMailing() {
    return residenceIsMailing;
  }

  public void setResidenceIsMailing(Boolean residenceIsMailing) {
    this.residenceIsMailing = residenceIsMailing;
  }


  public W8BenFormRequest mailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
    return this;
  }

  /**
   * The mailing address.
   * @return mailingAddress
   */
  @javax.annotation.Nullable
  public String getMailingAddress() {
    return mailingAddress;
  }

  public void setMailingAddress(String mailingAddress) {
    this.mailingAddress = mailingAddress;
  }


  public W8BenFormRequest mailingCity(String mailingCity) {
    this.mailingCity = mailingCity;
    return this;
  }

  /**
   * The city of the mailing address.
   * @return mailingCity
   */
  @javax.annotation.Nullable
  public String getMailingCity() {
    return mailingCity;
  }

  public void setMailingCity(String mailingCity) {
    this.mailingCity = mailingCity;
  }


  public W8BenFormRequest mailingState(MailingStateEnum mailingState) {
    this.mailingState = mailingState;
    return this;
  }

  /**
   * The state of the mailing address. Required for US and Canada.. Allowed values: AA, AE, AK, AL, AP, AR, AS, AZ, CA, CO (and 65 more)
   * @return mailingState
   */
  @javax.annotation.Nullable
  public MailingStateEnum getMailingState() {
    return mailingState;
  }

  public void setMailingState(MailingStateEnum mailingState) {
    this.mailingState = mailingState;
  }


  public W8BenFormRequest mailingZip(String mailingZip) {
    this.mailingZip = mailingZip;
    return this;
  }

  /**
   * The ZIP code of the mailing address.
   * @return mailingZip
   */
  @javax.annotation.Nullable
  public String getMailingZip() {
    return mailingZip;
  }

  public void setMailingZip(String mailingZip) {
    this.mailingZip = mailingZip;
  }


  public W8BenFormRequest mailingCountry(MailingCountryEnum mailingCountry) {
    this.mailingCountry = mailingCountry;
    return this;
  }

  /**
   * The country of the mailing address.. Allowed values: US, AF, AX, AL, AG, AQ, AN, AO, AV, AY (and 248 more)
   * @return mailingCountry
   */
  @javax.annotation.Nullable
  public MailingCountryEnum getMailingCountry() {
    return mailingCountry;
  }

  public void setMailingCountry(MailingCountryEnum mailingCountry) {
    this.mailingCountry = mailingCountry;
  }


  public W8BenFormRequest tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * The taxpayer identification number (TIN).
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public W8BenFormRequest foreignTinNotRequired(Boolean foreignTinNotRequired) {
    this.foreignTinNotRequired = foreignTinNotRequired;
    return this;
  }

  /**
   * Indicates whether a foreign TIN is not legally required.
   * @return foreignTinNotRequired
   */
  @javax.annotation.Nullable
  public Boolean getForeignTinNotRequired() {
    return foreignTinNotRequired;
  }

  public void setForeignTinNotRequired(Boolean foreignTinNotRequired) {
    this.foreignTinNotRequired = foreignTinNotRequired;
  }


  public W8BenFormRequest foreignTin(String foreignTin) {
    this.foreignTin = foreignTin;
    return this;
  }

  /**
   * The foreign taxpayer identification number (TIN).
   * @return foreignTin
   */
  @javax.annotation.Nullable
  public String getForeignTin() {
    return foreignTin;
  }

  public void setForeignTin(String foreignTin) {
    this.foreignTin = foreignTin;
  }


  public W8BenFormRequest referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * A reference number for the form.
   * @return referenceNumber
   */
  @javax.annotation.Nullable
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public W8BenFormRequest birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * The birthday of the individual associated with the form.
   * @return birthday
   */
  @javax.annotation.Nullable
  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }


  public W8BenFormRequest treatyCountry(TreatyCountryEnum treatyCountry) {
    this.treatyCountry = treatyCountry;
    return this;
  }

  /**
   * The country for which the treaty applies.. Allowed values: US, AF, AX, AL, AG, AQ, AN, AO, AV, AY (and 248 more)
   * @return treatyCountry
   */
  @javax.annotation.Nullable
  public TreatyCountryEnum getTreatyCountry() {
    return treatyCountry;
  }

  public void setTreatyCountry(TreatyCountryEnum treatyCountry) {
    this.treatyCountry = treatyCountry;
  }


  public W8BenFormRequest treatyArticle(String treatyArticle) {
    this.treatyArticle = treatyArticle;
    return this;
  }

  /**
   * The specific article of the treaty being claimed.
   * @return treatyArticle
   */
  @javax.annotation.Nullable
  public String getTreatyArticle() {
    return treatyArticle;
  }

  public void setTreatyArticle(String treatyArticle) {
    this.treatyArticle = treatyArticle;
  }


  public W8BenFormRequest treatyReasons(String treatyReasons) {
    this.treatyReasons = treatyReasons;
    return this;
  }

  /**
   * The reasons for claiming treaty benefits.
   * @return treatyReasons
   */
  @javax.annotation.Nullable
  public String getTreatyReasons() {
    return treatyReasons;
  }

  public void setTreatyReasons(String treatyReasons) {
    this.treatyReasons = treatyReasons;
  }


  public W8BenFormRequest withholdingRate(WithholdingRateEnum withholdingRate) {
    this.withholdingRate = withholdingRate;
    return this;
  }

  /**
   * The withholding rate applied as per the treaty. Must be a percentage with up to two decimals (e.g., 12.50, 0).. Allowed values: 0, 0.0, 0.00, 5, 5.5, 10, 12.50, 15, 20, 25 (and 1 more)
   * @return withholdingRate
   */
  @javax.annotation.Nullable
  public WithholdingRateEnum getWithholdingRate() {
    return withholdingRate;
  }

  public void setWithholdingRate(WithholdingRateEnum withholdingRate) {
    this.withholdingRate = withholdingRate;
  }


  public W8BenFormRequest incomeType(String incomeType) {
    this.incomeType = incomeType;
    return this;
  }

  /**
   * The type of income covered by the treaty.
   * @return incomeType
   */
  @javax.annotation.Nullable
  public String getIncomeType() {
    return incomeType;
  }

  public void setIncomeType(String incomeType) {
    this.incomeType = incomeType;
  }


  public W8BenFormRequest signerName(String signerName) {
    this.signerName = signerName;
    return this;
  }

  /**
   * The name of the signer of the form.
   * @return signerName
   */
  @javax.annotation.Nullable
  public String getSignerName() {
    return signerName;
  }

  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


  public W8BenFormRequest eDeliveryConsentedAt(OffsetDateTime eDeliveryConsentedAt) {
    this.eDeliveryConsentedAt = eDeliveryConsentedAt;
    return this;
  }

  /**
   * The date when e-delivery was consented.
   * @return eDeliveryConsentedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime geteDeliveryConsentedAt() {
    return eDeliveryConsentedAt;
  }

  public void seteDeliveryConsentedAt(OffsetDateTime eDeliveryConsentedAt) {
    this.eDeliveryConsentedAt = eDeliveryConsentedAt;
  }


  public W8BenFormRequest signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * The signature of the form.
   * @return signature
   */
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  public W8BenFormRequest companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The ID of the associated company. Required when creating a form.
   * @return companyId
   */
  @javax.annotation.Nullable
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public W8BenFormRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * A reference identifier for the form.
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public W8BenFormRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the individual associated with the form.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W8BenFormRequest w8BenFormRequest = (W8BenFormRequest) o;
    return Objects.equals(this.type, w8BenFormRequest.type) &&
        Objects.equals(this.name, w8BenFormRequest.name) &&
        Objects.equals(this.citizenshipCountry, w8BenFormRequest.citizenshipCountry) &&
        Objects.equals(this.residenceAddress, w8BenFormRequest.residenceAddress) &&
        Objects.equals(this.residenceCity, w8BenFormRequest.residenceCity) &&
        Objects.equals(this.residenceState, w8BenFormRequest.residenceState) &&
        Objects.equals(this.residenceZip, w8BenFormRequest.residenceZip) &&
        Objects.equals(this.residenceCountry, w8BenFormRequest.residenceCountry) &&
        Objects.equals(this.residenceIsMailing, w8BenFormRequest.residenceIsMailing) &&
        Objects.equals(this.mailingAddress, w8BenFormRequest.mailingAddress) &&
        Objects.equals(this.mailingCity, w8BenFormRequest.mailingCity) &&
        Objects.equals(this.mailingState, w8BenFormRequest.mailingState) &&
        Objects.equals(this.mailingZip, w8BenFormRequest.mailingZip) &&
        Objects.equals(this.mailingCountry, w8BenFormRequest.mailingCountry) &&
        Objects.equals(this.tin, w8BenFormRequest.tin) &&
        Objects.equals(this.foreignTinNotRequired, w8BenFormRequest.foreignTinNotRequired) &&
        Objects.equals(this.foreignTin, w8BenFormRequest.foreignTin) &&
        Objects.equals(this.referenceNumber, w8BenFormRequest.referenceNumber) &&
        Objects.equals(this.birthday, w8BenFormRequest.birthday) &&
        Objects.equals(this.treatyCountry, w8BenFormRequest.treatyCountry) &&
        Objects.equals(this.treatyArticle, w8BenFormRequest.treatyArticle) &&
        Objects.equals(this.treatyReasons, w8BenFormRequest.treatyReasons) &&
        Objects.equals(this.withholdingRate, w8BenFormRequest.withholdingRate) &&
        Objects.equals(this.incomeType, w8BenFormRequest.incomeType) &&
        Objects.equals(this.signerName, w8BenFormRequest.signerName) &&
        Objects.equals(this.eDeliveryConsentedAt, w8BenFormRequest.eDeliveryConsentedAt) &&
        Objects.equals(this.signature, w8BenFormRequest.signature) &&
        Objects.equals(this.companyId, w8BenFormRequest.companyId) &&
        Objects.equals(this.referenceId, w8BenFormRequest.referenceId) &&
        Objects.equals(this.email, w8BenFormRequest.email);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, citizenshipCountry, residenceAddress, residenceCity, residenceState, residenceZip, residenceCountry, residenceIsMailing, mailingAddress, mailingCity, mailingState, mailingZip, mailingCountry, tin, foreignTinNotRequired, foreignTin, referenceNumber, birthday, treatyCountry, treatyArticle, treatyReasons, withholdingRate, incomeType, signerName, eDeliveryConsentedAt, signature, companyId, referenceId, email);
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
    sb.append("class W8BenFormRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    citizenshipCountry: ").append(toIndentedString(citizenshipCountry)).append("\n");
    sb.append("    residenceAddress: ").append(toIndentedString(residenceAddress)).append("\n");
    sb.append("    residenceCity: ").append(toIndentedString(residenceCity)).append("\n");
    sb.append("    residenceState: ").append(toIndentedString(residenceState)).append("\n");
    sb.append("    residenceZip: ").append(toIndentedString(residenceZip)).append("\n");
    sb.append("    residenceCountry: ").append(toIndentedString(residenceCountry)).append("\n");
    sb.append("    residenceIsMailing: ").append(toIndentedString(residenceIsMailing)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
    sb.append("    mailingCity: ").append(toIndentedString(mailingCity)).append("\n");
    sb.append("    mailingState: ").append(toIndentedString(mailingState)).append("\n");
    sb.append("    mailingZip: ").append(toIndentedString(mailingZip)).append("\n");
    sb.append("    mailingCountry: ").append(toIndentedString(mailingCountry)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    foreignTinNotRequired: ").append(toIndentedString(foreignTinNotRequired)).append("\n");
    sb.append("    foreignTin: ").append(toIndentedString(foreignTin)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    treatyCountry: ").append(toIndentedString(treatyCountry)).append("\n");
    sb.append("    treatyArticle: ").append(toIndentedString(treatyArticle)).append("\n");
    sb.append("    treatyReasons: ").append(toIndentedString(treatyReasons)).append("\n");
    sb.append("    withholdingRate: ").append(toIndentedString(withholdingRate)).append("\n");
    sb.append("    incomeType: ").append(toIndentedString(incomeType)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    eDeliveryConsentedAt: ").append(toIndentedString(eDeliveryConsentedAt)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("eDeliveryConsentedAt");
    openapiFields.add("signature");
    openapiFields.add("type");
    openapiFields.add("companyId");
    openapiFields.add("referenceId");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("citizenshipCountry");
    openapiRequiredFields.add("residenceCountry");
    openapiRequiredFields.add("mailingCountry");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to W8BenFormRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!W8BenFormRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in W8BenFormRequest is not found in the empty JSON string", W8BenFormRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!W8BenFormRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `W8BenFormRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : W8BenFormRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("citizenshipCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `citizenshipCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("citizenshipCountry").toString()));
      }
      // validate the required field `citizenshipCountry`
      CitizenshipCountryEnum.validateJsonElement(jsonObj.get("citizenshipCountry"));
      if ((jsonObj.get("residenceAddress") != null && !jsonObj.get("residenceAddress").isJsonNull()) && !jsonObj.get("residenceAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceAddress").toString()));
      }
      if ((jsonObj.get("residenceCity") != null && !jsonObj.get("residenceCity").isJsonNull()) && !jsonObj.get("residenceCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceCity").toString()));
      }
      if ((jsonObj.get("residenceState") != null && !jsonObj.get("residenceState").isJsonNull()) && !jsonObj.get("residenceState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceState").toString()));
      }
      // validate the optional field `residenceState`
      if (jsonObj.get("residenceState") != null && !jsonObj.get("residenceState").isJsonNull()) {
        ResidenceStateEnum.validateJsonElement(jsonObj.get("residenceState"));
      }
      if ((jsonObj.get("residenceZip") != null && !jsonObj.get("residenceZip").isJsonNull()) && !jsonObj.get("residenceZip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceZip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceZip").toString()));
      }
      if (!jsonObj.get("residenceCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceCountry").toString()));
      }
      // validate the required field `residenceCountry`
      ResidenceCountryEnum.validateJsonElement(jsonObj.get("residenceCountry"));
      if ((jsonObj.get("mailingAddress") != null && !jsonObj.get("mailingAddress").isJsonNull()) && !jsonObj.get("mailingAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingAddress").toString()));
      }
      if ((jsonObj.get("mailingCity") != null && !jsonObj.get("mailingCity").isJsonNull()) && !jsonObj.get("mailingCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingCity").toString()));
      }
      if ((jsonObj.get("mailingState") != null && !jsonObj.get("mailingState").isJsonNull()) && !jsonObj.get("mailingState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingState").toString()));
      }
      // validate the optional field `mailingState`
      if (jsonObj.get("mailingState") != null && !jsonObj.get("mailingState").isJsonNull()) {
        MailingStateEnum.validateJsonElement(jsonObj.get("mailingState"));
      }
      if ((jsonObj.get("mailingZip") != null && !jsonObj.get("mailingZip").isJsonNull()) && !jsonObj.get("mailingZip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingZip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingZip").toString()));
      }
      if ((jsonObj.get("mailingCountry") != null && !jsonObj.get("mailingCountry").isJsonNull()) && !jsonObj.get("mailingCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingCountry").toString()));
      }
      // validate the required field `mailingCountry`
      MailingCountryEnum.validateJsonElement(jsonObj.get("mailingCountry"));
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("foreignTin") != null && !jsonObj.get("foreignTin").isJsonNull()) && !jsonObj.get("foreignTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignTin").toString()));
      }
      if ((jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonNull()) && !jsonObj.get("referenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceNumber").toString()));
      }
      if ((jsonObj.get("treatyCountry") != null && !jsonObj.get("treatyCountry").isJsonNull()) && !jsonObj.get("treatyCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `treatyCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("treatyCountry").toString()));
      }
      // validate the optional field `treatyCountry`
      if (jsonObj.get("treatyCountry") != null && !jsonObj.get("treatyCountry").isJsonNull()) {
        TreatyCountryEnum.validateJsonElement(jsonObj.get("treatyCountry"));
      }
      if ((jsonObj.get("treatyArticle") != null && !jsonObj.get("treatyArticle").isJsonNull()) && !jsonObj.get("treatyArticle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `treatyArticle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("treatyArticle").toString()));
      }
      if ((jsonObj.get("treatyReasons") != null && !jsonObj.get("treatyReasons").isJsonNull()) && !jsonObj.get("treatyReasons").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `treatyReasons` to be a primitive type in the JSON string but got `%s`", jsonObj.get("treatyReasons").toString()));
      }
      if ((jsonObj.get("withholdingRate") != null && !jsonObj.get("withholdingRate").isJsonNull()) && !jsonObj.get("withholdingRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withholdingRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withholdingRate").toString()));
      }
      // validate the optional field `withholdingRate`
      if (jsonObj.get("withholdingRate") != null && !jsonObj.get("withholdingRate").isJsonNull()) {
        WithholdingRateEnum.validateJsonElement(jsonObj.get("withholdingRate"));
      }
      if ((jsonObj.get("incomeType") != null && !jsonObj.get("incomeType").isJsonNull()) && !jsonObj.get("incomeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incomeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incomeType").toString()));
      }
      if ((jsonObj.get("signerName") != null && !jsonObj.get("signerName").isJsonNull()) && !jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W8BenFormRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W8BenFormRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W8BenFormRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W8BenFormRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<W8BenFormRequest>() {
           @Override
           public void write(JsonWriter out, W8BenFormRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public W8BenFormRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of W8BenFormRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of W8BenFormRequest
   * @throws IOException if the JSON string is invalid with respect to W8BenFormRequest
   */
  public static W8BenFormRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W8BenFormRequest.class);
  }

  /**
   * Convert an instance of W8BenFormRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

