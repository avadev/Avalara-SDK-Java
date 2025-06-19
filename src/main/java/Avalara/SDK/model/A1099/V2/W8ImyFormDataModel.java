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
 * ## 🔐 Authentication  Use **username/password** or generate a **license key** from: *Avalara Portal → Settings → License and API Keys*.  [More on authentication methods](https://developer.avalara.com/avatax-dm-combined-erp/common-setup/authentication/authentication-methods/)  [Test your credentials](https://developer.avalara.com/avatax/test-credentials/)  ## 📘 API & SDK Documentation  [Avalara SDK (.NET) on GitHub](https://github.com/avadev/Avalara-SDK-DotNet#avalarasdk--the-unified-c-library-for-next-gen-avalara-services)  [Code Examples – 1099 API](https://github.com/avadev/Avalara-SDK-DotNet/blob/main/docs/A1099/V2/Class1099IssuersApi.md#call1099issuersget)
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.A1099.V2;

import java.util.Objects;
import Avalara.SDK.model.A1099.V2.W8BenESubstantialUsOwnerDataModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * W-8 IMY form
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class W8ImyFormDataModel {
  /**
   * Type of the form, always W8IMY for this model.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    W9("w9"),
    
    W4("w4"),
    
    W8IMY("w8imy"),
    
    W8BEN("w8ben"),
    
    W8BENE("w8bene");

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

  public static final String SERIALIZED_NAME_SIGNED_DATE = "signedDate";
  @SerializedName(SERIALIZED_NAME_SIGNED_DATE)
  private OffsetDateTime signedDate;

  public static final String SERIALIZED_NAME_DISREGARDED_ENTITY_CHAPTER4_FATCA_STATUS = "disregardedEntityChapter4FatcaStatus";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_ENTITY_CHAPTER4_FATCA_STATUS)
  private String disregardedEntityChapter4FatcaStatus;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_TYPE_OF_TIN = "typeOfTin";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_TIN)
  private String typeOfTin;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CITIZENSHIP_COUNTRY = "citizenshipCountry";
  @SerializedName(SERIALIZED_NAME_CITIZENSHIP_COUNTRY)
  private String citizenshipCountry;

  public static final String SERIALIZED_NAME_CHAPTER3_ENTITY_TYPE = "chapter3EntityType";
  @SerializedName(SERIALIZED_NAME_CHAPTER3_ENTITY_TYPE)
  private String chapter3EntityType;

  public static final String SERIALIZED_NAME_CHAPTER4_FATCA_STATUS = "chapter4FatcaStatus";
  @SerializedName(SERIALIZED_NAME_CHAPTER4_FATCA_STATUS)
  private String chapter4FatcaStatus;

  public static final String SERIALIZED_NAME_RESIDENCE_ADDRESS = "residenceAddress";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_ADDRESS)
  private String residenceAddress;

  public static final String SERIALIZED_NAME_RESIDENCE_CITY = "residenceCity";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_CITY)
  private String residenceCity;

  public static final String SERIALIZED_NAME_RESIDENCE_STATE = "residenceState";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_STATE)
  private String residenceState;

  public static final String SERIALIZED_NAME_RESIDENCE_POSTAL_CODE = "residencePostalCode";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_POSTAL_CODE)
  private String residencePostalCode;

  public static final String SERIALIZED_NAME_RESIDENCE_COUNTRY = "residenceCountry";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_COUNTRY)
  private String residenceCountry;

  public static final String SERIALIZED_NAME_RESIDENCE_IS_MAILING = "residenceIsMailing";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_IS_MAILING)
  private Boolean residenceIsMailing;

  public static final String SERIALIZED_NAME_MAILING_ADDRESS = "mailingAddress";
  @SerializedName(SERIALIZED_NAME_MAILING_ADDRESS)
  private String mailingAddress;

  public static final String SERIALIZED_NAME_MAILING_CITY = "mailingCity";
  @SerializedName(SERIALIZED_NAME_MAILING_CITY)
  private String mailingCity;

  public static final String SERIALIZED_NAME_MAILING_STATE = "mailingState";
  @SerializedName(SERIALIZED_NAME_MAILING_STATE)
  private String mailingState;

  public static final String SERIALIZED_NAME_MAILING_POSTAL_CODE = "mailingPostalCode";
  @SerializedName(SERIALIZED_NAME_MAILING_POSTAL_CODE)
  private String mailingPostalCode;

  public static final String SERIALIZED_NAME_MAILING_COUNTRY = "mailingCountry";
  @SerializedName(SERIALIZED_NAME_MAILING_COUNTRY)
  private String mailingCountry;

  public static final String SERIALIZED_NAME_DISREGARDED_ENTITY = "disregardedEntity";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_ENTITY)
  private String disregardedEntity;

  public static final String SERIALIZED_NAME_DISREGARDED_ADDRESS = "disregardedAddress";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_ADDRESS)
  private String disregardedAddress;

  public static final String SERIALIZED_NAME_DISREGARDED_CITY = "disregardedCity";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_CITY)
  private String disregardedCity;

  public static final String SERIALIZED_NAME_DISREGARDED_STATE = "disregardedState";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_STATE)
  private String disregardedState;

  public static final String SERIALIZED_NAME_DISREGARDED_POSTAL_CODE = "disregardedPostalCode";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_POSTAL_CODE)
  private String disregardedPostalCode;

  public static final String SERIALIZED_NAME_DISREGARDED_COUNTRY = "disregardedCountry";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_COUNTRY)
  private String disregardedCountry;

  public static final String SERIALIZED_NAME_DISREGARDED_ENTITY_GIIN = "disregardedEntityGiin";
  @SerializedName(SERIALIZED_NAME_DISREGARDED_ENTITY_GIIN)
  private String disregardedEntityGiin;

  public static final String SERIALIZED_NAME_EIN = "ein";
  @SerializedName(SERIALIZED_NAME_EIN)
  private String ein;

  public static final String SERIALIZED_NAME_EIN_TYPE = "einType";
  @SerializedName(SERIALIZED_NAME_EIN_TYPE)
  private String einType;

  public static final String SERIALIZED_NAME_GIIN = "giin";
  @SerializedName(SERIALIZED_NAME_GIIN)
  private String giin;

  public static final String SERIALIZED_NAME_FOREIGN_TIN = "foreignTin";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TIN)
  private String foreignTin;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_CERTIFY_BOX14 = "certifyBox14";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX14)
  private Boolean certifyBox14;

  public static final String SERIALIZED_NAME_CERTIFY_BOX15_A = "certifyBox15A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX15_A)
  private Boolean certifyBox15A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX15_B = "certifyBox15B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX15_B)
  private Boolean certifyBox15B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX15_C = "certifyBox15C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX15_C)
  private Boolean certifyBox15C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX15_D = "certifyBox15D";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX15_D)
  private Boolean certifyBox15D;

  public static final String SERIALIZED_NAME_CERTIFY_BOX15_E = "certifyBox15E";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX15_E)
  private Boolean certifyBox15E;

  public static final String SERIALIZED_NAME_CERTIFY_BOX15_F = "certifyBox15F";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX15_F)
  private Boolean certifyBox15F;

  public static final String SERIALIZED_NAME_CERTIFY_BOX15_G = "certifyBox15G";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX15_G)
  private Boolean certifyBox15G;

  public static final String SERIALIZED_NAME_CERTIFY_BOX15_H = "certifyBox15H";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX15_H)
  private Boolean certifyBox15H;

  public static final String SERIALIZED_NAME_CERTIFY_BOX15_I = "certifyBox15I";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX15_I)
  private Boolean certifyBox15I;

  public static final String SERIALIZED_NAME_CERTIFY_BOX16_A = "certifyBox16A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX16_A)
  private Boolean certifyBox16A;

  public static final String SERIALIZED_NAME_BOX16_B_QDD_CORPORATE = "box16BQddCorporate";
  @SerializedName(SERIALIZED_NAME_BOX16_B_QDD_CORPORATE)
  private Boolean box16BQddCorporate;

  public static final String SERIALIZED_NAME_BOX16_B_QDD_PARTNERSHIP = "box16BQddPartnership";
  @SerializedName(SERIALIZED_NAME_BOX16_B_QDD_PARTNERSHIP)
  private Boolean box16BQddPartnership;

  public static final String SERIALIZED_NAME_BOX16_B_QDD_DISREGARDED_ENTITY = "box16BQddDisregardedEntity";
  @SerializedName(SERIALIZED_NAME_BOX16_B_QDD_DISREGARDED_ENTITY)
  private Boolean box16BQddDisregardedEntity;

  public static final String SERIALIZED_NAME_CERTIFY_BOX17_A = "certifyBox17A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX17_A)
  private Boolean certifyBox17A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX17_B = "certifyBox17B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX17_B)
  private Boolean certifyBox17B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX17_C = "certifyBox17C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX17_C)
  private Boolean certifyBox17C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX17_D = "certifyBox17D";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX17_D)
  private Boolean certifyBox17D;

  public static final String SERIALIZED_NAME_CERTIFY_BOX17_E = "certifyBox17E";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX17_E)
  private Boolean certifyBox17E;

  public static final String SERIALIZED_NAME_CERTIFY_BOX18_A = "certifyBox18A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX18_A)
  private Boolean certifyBox18A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX18_B = "certifyBox18B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX18_B)
  private Boolean certifyBox18B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX18_C = "certifyBox18C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX18_C)
  private Boolean certifyBox18C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX18_D = "certifyBox18D";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX18_D)
  private Boolean certifyBox18D;

  public static final String SERIALIZED_NAME_CERTIFY_BOX18_E = "certifyBox18E";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX18_E)
  private Boolean certifyBox18E;

  public static final String SERIALIZED_NAME_CERTIFY_BOX18_F = "certifyBox18F";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX18_F)
  private Boolean certifyBox18F;

  public static final String SERIALIZED_NAME_CERTIFY_BOX19_A = "certifyBox19A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX19_A)
  private Boolean certifyBox19A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX19_B = "certifyBox19B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX19_B)
  private Boolean certifyBox19B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX19_C = "certifyBox19C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX19_C)
  private Boolean certifyBox19C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX19_D = "certifyBox19D";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX19_D)
  private Boolean certifyBox19D;

  public static final String SERIALIZED_NAME_CERTIFY_BOX19_E = "certifyBox19E";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX19_E)
  private Boolean certifyBox19E;

  public static final String SERIALIZED_NAME_CERTIFY_BOX19_F = "certifyBox19F";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX19_F)
  private Boolean certifyBox19F;

  public static final String SERIALIZED_NAME_CERTIFY_BOX20 = "certifyBox20";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX20)
  private Boolean certifyBox20;

  public static final String SERIALIZED_NAME_CERTIFY_BOX21_A = "certifyBox21A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX21_A)
  private Boolean certifyBox21A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX21_B = "certifyBox21B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX21_B)
  private Boolean certifyBox21B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX21_C = "certifyBox21C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX21_C)
  private Boolean certifyBox21C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX21_D = "certifyBox21D";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX21_D)
  private Boolean certifyBox21D;

  public static final String SERIALIZED_NAME_CERTIFY_BOX21_E = "certifyBox21E";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX21_E)
  private Boolean certifyBox21E;

  public static final String SERIALIZED_NAME_CERTIFY_BOX21_F = "certifyBox21F";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX21_F)
  private Boolean certifyBox21F;

  public static final String SERIALIZED_NAME_CERTIFY_BOX22 = "certifyBox22";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX22)
  private Boolean certifyBox22;

  public static final String SERIALIZED_NAME_BOX23_A_NAME_SPONSORING_ENTITY = "box23ANameSponsoringEntity";
  @SerializedName(SERIALIZED_NAME_BOX23_A_NAME_SPONSORING_ENTITY)
  private String box23ANameSponsoringEntity;

  public static final String SERIALIZED_NAME_CERTIFY_BOX23_B = "certifyBox23B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX23_B)
  private Boolean certifyBox23B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX23_C = "certifyBox23C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX23_C)
  private Boolean certifyBox23C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX24_A = "certifyBox24A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX24_A)
  private Boolean certifyBox24A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX24_B = "certifyBox24B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX24_B)
  private Boolean certifyBox24B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX24_C = "certifyBox24C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX24_C)
  private Boolean certifyBox24C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX25 = "certifyBox25";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX25)
  private Boolean certifyBox25;

  public static final String SERIALIZED_NAME_CERTIFY_BOX26 = "certifyBox26";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX26)
  private Boolean certifyBox26;

  public static final String SERIALIZED_NAME_BOX27_A_NAME_SPONSORING_ENTITY = "box27ANameSponsoringEntity";
  @SerializedName(SERIALIZED_NAME_BOX27_A_NAME_SPONSORING_ENTITY)
  private String box27ANameSponsoringEntity;

  public static final String SERIALIZED_NAME_CERTIFY_BOX27_B = "certifyBox27B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX27_B)
  private Boolean certifyBox27B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX28 = "certifyBox28";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX28)
  private Boolean certifyBox28;

  public static final String SERIALIZED_NAME_CERTIFY_BOX29 = "certifyBox29";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX29)
  private Boolean certifyBox29;

  public static final String SERIALIZED_NAME_CERTIFY_BOX30_A = "certifyBox30A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX30_A)
  private Boolean certifyBox30A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX30_B = "certifyBox30B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX30_B)
  private Boolean certifyBox30B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX30_C = "certifyBox30C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX30_C)
  private Boolean certifyBox30C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX31 = "certifyBox31";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX31)
  private Boolean certifyBox31;

  public static final String SERIALIZED_NAME_CERTIFY_BOX32 = "certifyBox32";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX32)
  private Boolean certifyBox32;

  public static final String SERIALIZED_NAME_BOX32_IGA_COUNTRY = "box32IgaCountry";
  @SerializedName(SERIALIZED_NAME_BOX32_IGA_COUNTRY)
  private String box32IgaCountry;

  public static final String SERIALIZED_NAME_BOX32_IGA_TYPE = "box32IgaType";
  @SerializedName(SERIALIZED_NAME_BOX32_IGA_TYPE)
  private String box32IgaType;

  public static final String SERIALIZED_NAME_BOX32_IGA_TREATED_AS = "box32IgaTreatedAs";
  @SerializedName(SERIALIZED_NAME_BOX32_IGA_TREATED_AS)
  private String box32IgaTreatedAs;

  public static final String SERIALIZED_NAME_BOX32_TRUSTEE_OR_SPONSOR = "box32TrusteeOrSponsor";
  @SerializedName(SERIALIZED_NAME_BOX32_TRUSTEE_OR_SPONSOR)
  private String box32TrusteeOrSponsor;

  public static final String SERIALIZED_NAME_BOX32_TRUSTEE_IS_FOREIGN = "box32TrusteeIsForeign";
  @SerializedName(SERIALIZED_NAME_BOX32_TRUSTEE_IS_FOREIGN)
  private Boolean box32TrusteeIsForeign;

  public static final String SERIALIZED_NAME_CERTIFY_BOX33_A = "certifyBox33A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX33_A)
  private Boolean certifyBox33A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX33_B = "certifyBox33B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX33_B)
  private Boolean certifyBox33B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX33_C = "certifyBox33C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX33_C)
  private Boolean certifyBox33C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX33_D = "certifyBox33D";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX33_D)
  private Boolean certifyBox33D;

  public static final String SERIALIZED_NAME_CERTIFY_BOX33_E = "certifyBox33E";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX33_E)
  private Boolean certifyBox33E;

  public static final String SERIALIZED_NAME_CERTIFY_BOX33_F = "certifyBox33F";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX33_F)
  private Boolean certifyBox33F;

  public static final String SERIALIZED_NAME_CERTIFY_BOX34 = "certifyBox34";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX34)
  private Boolean certifyBox34;

  public static final String SERIALIZED_NAME_CERTIFY_BOX35 = "certifyBox35";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX35)
  private Boolean certifyBox35;

  public static final String SERIALIZED_NAME_CERTIFY_BOX36 = "certifyBox36";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX36)
  private Boolean certifyBox36;

  public static final String SERIALIZED_NAME_CERTIFY_BOX37_A = "certifyBox37A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX37_A)
  private Boolean certifyBox37A;

  public static final String SERIALIZED_NAME_BOX37_A_SECURITIES_MARKET = "box37ASecuritiesMarket";
  @SerializedName(SERIALIZED_NAME_BOX37_A_SECURITIES_MARKET)
  private String box37ASecuritiesMarket;

  public static final String SERIALIZED_NAME_CERTIFY_BOX37_B = "certifyBox37B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX37_B)
  private Boolean certifyBox37B;

  public static final String SERIALIZED_NAME_BOX37_B_NAME_OF_ENTITY = "box37BNameOfEntity";
  @SerializedName(SERIALIZED_NAME_BOX37_B_NAME_OF_ENTITY)
  private String box37BNameOfEntity;

  public static final String SERIALIZED_NAME_BOX37_B_SECURITIES_MARKET = "box37BSecuritiesMarket";
  @SerializedName(SERIALIZED_NAME_BOX37_B_SECURITIES_MARKET)
  private String box37BSecuritiesMarket;

  public static final String SERIALIZED_NAME_CERTIFY_BOX38 = "certifyBox38";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX38)
  private Boolean certifyBox38;

  public static final String SERIALIZED_NAME_CERTIFY_BOX39 = "certifyBox39";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX39)
  private Boolean certifyBox39;

  public static final String SERIALIZED_NAME_CERTIFY_BOX40 = "certifyBox40";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX40)
  private Boolean certifyBox40;

  public static final String SERIALIZED_NAME_BOX41_SPONSORING_ENTITY = "box41SponsoringEntity";
  @SerializedName(SERIALIZED_NAME_BOX41_SPONSORING_ENTITY)
  private String box41SponsoringEntity;

  public static final String SERIALIZED_NAME_CERTIFY_BOX42 = "certifyBox42";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX42)
  private Boolean certifyBox42;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT = "eDeliveryConsentedAt";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT)
  private OffsetDateTime eDeliveryConsentedAt;

  public static final String SERIALIZED_NAME_BOX35_FORMED_ON_DATE = "box35FormedOnDate";
  @SerializedName(SERIALIZED_NAME_BOX35_FORMED_ON_DATE)
  private OffsetDateTime box35FormedOnDate;

  public static final String SERIALIZED_NAME_BOX36_FILED_ON_DATE = "box36FiledOnDate";
  @SerializedName(SERIALIZED_NAME_BOX36_FILED_ON_DATE)
  private OffsetDateTime box36FiledOnDate;

  public static final String SERIALIZED_NAME_EMPLOYEE_FIRST_NAME = "employeeFirstName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_FIRST_NAME)
  private String employeeFirstName;

  public static final String SERIALIZED_NAME_EMPLOYEE_MIDDLE_NAME = "employeeMiddleName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_MIDDLE_NAME)
  private String employeeMiddleName;

  public static final String SERIALIZED_NAME_EMPLOYEE_LAST_NAME = "employeeLastName";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_LAST_NAME)
  private String employeeLastName;

  public static final String SERIALIZED_NAME_EMPLOYEE_NAME_SUFFIX = "employeeNameSuffix";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NAME_SUFFIX)
  private String employeeNameSuffix;

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

  public static final String SERIALIZED_NAME_BOX3_MARITAL_STATUS = "box3MaritalStatus";
  @SerializedName(SERIALIZED_NAME_BOX3_MARITAL_STATUS)
  private String box3MaritalStatus;

  public static final String SERIALIZED_NAME_BOX4_LAST_NAME_DIFFERS = "box4LastNameDiffers";
  @SerializedName(SERIALIZED_NAME_BOX4_LAST_NAME_DIFFERS)
  private Boolean box4LastNameDiffers;

  public static final String SERIALIZED_NAME_BOX5_NUM_ALLOWANCES = "box5NumAllowances";
  @SerializedName(SERIALIZED_NAME_BOX5_NUM_ALLOWANCES)
  private Integer box5NumAllowances;

  public static final String SERIALIZED_NAME_OTHER_DEPENDENTS = "otherDependents";
  @SerializedName(SERIALIZED_NAME_OTHER_DEPENDENTS)
  private Integer otherDependents;

  public static final String SERIALIZED_NAME_NON_JOB_INCOME = "nonJobIncome";
  @SerializedName(SERIALIZED_NAME_NON_JOB_INCOME)
  private Double nonJobIncome;

  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private Double deductions;

  public static final String SERIALIZED_NAME_BOX6_ADDITIONAL_WITHHELD = "box6AdditionalWithheld";
  @SerializedName(SERIALIZED_NAME_BOX6_ADDITIONAL_WITHHELD)
  private Double box6AdditionalWithheld;

  public static final String SERIALIZED_NAME_BOX7_EXEMPT_FROM_WITHHOLDING = "box7ExemptFromWithholding";
  @SerializedName(SERIALIZED_NAME_BOX7_EXEMPT_FROM_WITHHOLDING)
  private Boolean box7ExemptFromWithholding;

  public static final String SERIALIZED_NAME_OFFICE_CODE = "officeCode";
  @SerializedName(SERIALIZED_NAME_OFFICE_CODE)
  private String officeCode;

  public static final String SERIALIZED_NAME_FTIN_NOT_REQUIRED = "ftinNotRequired";
  @SerializedName(SERIALIZED_NAME_FTIN_NOT_REQUIRED)
  private Boolean ftinNotRequired;

  public static final String SERIALIZED_NAME_BENEFIT_LIMITATION = "benefitLimitation";
  @SerializedName(SERIALIZED_NAME_BENEFIT_LIMITATION)
  private String benefitLimitation;

  public static final String SERIALIZED_NAME_PART4_SPONSORING_ENTITY = "part4SponsoringEntity";
  @SerializedName(SERIALIZED_NAME_PART4_SPONSORING_ENTITY)
  private String part4SponsoringEntity;

  public static final String SERIALIZED_NAME_PART4_SPONSORING_ENTITY_GIIN = "part4SponsoringEntityGiin";
  @SerializedName(SERIALIZED_NAME_PART4_SPONSORING_ENTITY_GIIN)
  private String part4SponsoringEntityGiin;

  public static final String SERIALIZED_NAME_PART7_SPONSORING_ENTITY = "part7SponsoringEntity";
  @SerializedName(SERIALIZED_NAME_PART7_SPONSORING_ENTITY)
  private String part7SponsoringEntity;

  public static final String SERIALIZED_NAME_PART12_IGA_COUNTRY = "part12IgaCountry";
  @SerializedName(SERIALIZED_NAME_PART12_IGA_COUNTRY)
  private String part12IgaCountry;

  public static final String SERIALIZED_NAME_PART12_IGA_TYPE = "part12IgaType";
  @SerializedName(SERIALIZED_NAME_PART12_IGA_TYPE)
  private String part12IgaType;

  public static final String SERIALIZED_NAME_PART12_FATCA_STATUS_UNDER_IGA_ANNEX_II = "part12FatcaStatusUnderIgaAnnexIi";
  @SerializedName(SERIALIZED_NAME_PART12_FATCA_STATUS_UNDER_IGA_ANNEX_II)
  private String part12FatcaStatusUnderIgaAnnexIi;

  public static final String SERIALIZED_NAME_PART12_TRUSTEE_NAME = "part12TrusteeName";
  @SerializedName(SERIALIZED_NAME_PART12_TRUSTEE_NAME)
  private String part12TrusteeName;

  public static final String SERIALIZED_NAME_PART12_TRUSTEE_IS_FOREIGN = "part12TrusteeIsForeign";
  @SerializedName(SERIALIZED_NAME_PART12_TRUSTEE_IS_FOREIGN)
  private Boolean part12TrusteeIsForeign;

  public static final String SERIALIZED_NAME_PART12_MODEL2_IGA_GIIN = "part12Model2IgaGiin";
  @SerializedName(SERIALIZED_NAME_PART12_MODEL2_IGA_GIIN)
  private String part12Model2IgaGiin;

  public static final String SERIALIZED_NAME_BOX37_A_EXCHANGE = "box37AExchange";
  @SerializedName(SERIALIZED_NAME_BOX37_A_EXCHANGE)
  private String box37AExchange;

  public static final String SERIALIZED_NAME_BOX37_B_EXCHANGE = "box37BExchange";
  @SerializedName(SERIALIZED_NAME_BOX37_B_EXCHANGE)
  private String box37BExchange;

  public static final String SERIALIZED_NAME_BOX37_B_ENTITY = "box37BEntity";
  @SerializedName(SERIALIZED_NAME_BOX37_B_ENTITY)
  private String box37BEntity;

  public static final String SERIALIZED_NAME_PART28_SPONSORING_ENTITY = "part28SponsoringEntity";
  @SerializedName(SERIALIZED_NAME_PART28_SPONSORING_ENTITY)
  private String part28SponsoringEntity;

  public static final String SERIALIZED_NAME_PART28_SPONSORING_ENTITY_GIIN = "part28SponsoringEntityGiin";
  @SerializedName(SERIALIZED_NAME_PART28_SPONSORING_ENTITY_GIIN)
  private String part28SponsoringEntityGiin;

  public static final String SERIALIZED_NAME_MAKING_TREATY_CLAIM = "makingTreatyClaim";
  @SerializedName(SERIALIZED_NAME_MAKING_TREATY_CLAIM)
  private Boolean makingTreatyClaim;

  public static final String SERIALIZED_NAME_TREATY_COUNTRY = "treatyCountry";
  @SerializedName(SERIALIZED_NAME_TREATY_COUNTRY)
  private String treatyCountry;

  public static final String SERIALIZED_NAME_TREATY_ARTICLE = "treatyArticle";
  @SerializedName(SERIALIZED_NAME_TREATY_ARTICLE)
  private String treatyArticle;

  public static final String SERIALIZED_NAME_WITHHOLDING_RATE = "withholdingRate";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_RATE)
  private String withholdingRate;

  public static final String SERIALIZED_NAME_INCOME_TYPE = "incomeType";
  @SerializedName(SERIALIZED_NAME_INCOME_TYPE)
  private String incomeType;

  public static final String SERIALIZED_NAME_TREATY_REASONS = "treatyReasons";
  @SerializedName(SERIALIZED_NAME_TREATY_REASONS)
  private String treatyReasons;

  public static final String SERIALIZED_NAME_CERTIFY_BOX14_A = "certifyBox14A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX14_A)
  private Boolean certifyBox14A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX14_B = "certifyBox14B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX14_B)
  private Boolean certifyBox14B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX14_C = "certifyBox14C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX14_C)
  private Boolean certifyBox14C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX171 = "certifyBox17_1";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX171)
  private Boolean certifyBox171;

  public static final String SERIALIZED_NAME_CERTIFY_BOX172 = "certifyBox17_2";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX172)
  private Boolean certifyBox172;

  public static final String SERIALIZED_NAME_CERTIFY_BOX18 = "certifyBox18";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX18)
  private Boolean certifyBox18;

  public static final String SERIALIZED_NAME_CERTIFY_BOX19 = "certifyBox19";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX19)
  private Boolean certifyBox19;

  public static final String SERIALIZED_NAME_CERTIFY_BOX21 = "certifyBox21";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX21)
  private Boolean certifyBox21;

  public static final String SERIALIZED_NAME_CERTIFY_BOX23 = "certifyBox23";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX23)
  private Boolean certifyBox23;

  public static final String SERIALIZED_NAME_CERTIFY_BOX24_D = "certifyBox24D";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX24_D)
  private Boolean certifyBox24D;

  public static final String SERIALIZED_NAME_CERTIFY_BOX25_A = "certifyBox25A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX25_A)
  private Boolean certifyBox25A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX25_B = "certifyBox25B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX25_B)
  private Boolean certifyBox25B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX25_C = "certifyBox25C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX25_C)
  private Boolean certifyBox25C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX27 = "certifyBox27";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX27)
  private Boolean certifyBox27;

  public static final String SERIALIZED_NAME_CERTIFY_BOX28_A = "certifyBox28A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX28_A)
  private Boolean certifyBox28A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX28_B = "certifyBox28B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX28_B)
  private Boolean certifyBox28B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX29_A = "certifyBox29A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX29_A)
  private Boolean certifyBox29A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX29_B = "certifyBox29B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX29_B)
  private Boolean certifyBox29B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX29_C = "certifyBox29C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX29_C)
  private Boolean certifyBox29C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX29_D = "certifyBox29D";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX29_D)
  private Boolean certifyBox29D;

  public static final String SERIALIZED_NAME_CERTIFY_BOX29_E = "certifyBox29E";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX29_E)
  private Boolean certifyBox29E;

  public static final String SERIALIZED_NAME_CERTIFY_BOX29_F = "certifyBox29F";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX29_F)
  private Boolean certifyBox29F;

  public static final String SERIALIZED_NAME_CERTIFY_BOX30 = "certifyBox30";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX30)
  private Boolean certifyBox30;

  public static final String SERIALIZED_NAME_CERTIFY_BOX33 = "certifyBox33";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX33)
  private Boolean certifyBox33;

  public static final String SERIALIZED_NAME_CERTIFY_BOX40_A = "certifyBox40A";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX40_A)
  private Boolean certifyBox40A;

  public static final String SERIALIZED_NAME_CERTIFY_BOX40_B = "certifyBox40B";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX40_B)
  private Boolean certifyBox40B;

  public static final String SERIALIZED_NAME_CERTIFY_BOX40_C = "certifyBox40C";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX40_C)
  private Boolean certifyBox40C;

  public static final String SERIALIZED_NAME_CERTIFY_BOX41 = "certifyBox41";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX41)
  private Boolean certifyBox41;

  public static final String SERIALIZED_NAME_CERTIFY_BOX43 = "certifyBox43";
  @SerializedName(SERIALIZED_NAME_CERTIFY_BOX43)
  private Boolean certifyBox43;

  public static final String SERIALIZED_NAME_CERTIFY_PART29_SIGNATURE = "certifyPart29Signature";
  @SerializedName(SERIALIZED_NAME_CERTIFY_PART29_SIGNATURE)
  private Boolean certifyPart29Signature;

  public static final String SERIALIZED_NAME_PART19_FORMATION_OR_RESOLUTION_DATE = "part19FormationOrResolutionDate";
  @SerializedName(SERIALIZED_NAME_PART19_FORMATION_OR_RESOLUTION_DATE)
  private OffsetDateTime part19FormationOrResolutionDate;

  public static final String SERIALIZED_NAME_PART20_FILING_DATE = "part20FilingDate";
  @SerializedName(SERIALIZED_NAME_PART20_FILING_DATE)
  private OffsetDateTime part20FilingDate;

  public static final String SERIALIZED_NAME_PART21_DETERMINATION_DATE = "part21DeterminationDate";
  @SerializedName(SERIALIZED_NAME_PART21_DETERMINATION_DATE)
  private OffsetDateTime part21DeterminationDate;

  public static final String SERIALIZED_NAME_SUBSTANTIAL_US_OWNERS = "substantialUsOwners";
  @SerializedName(SERIALIZED_NAME_SUBSTANTIAL_US_OWNERS)
  private List<W8BenESubstantialUsOwnerDataModel> substantialUsOwners = new ArrayList<>();

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private String birthday;

  public static final String SERIALIZED_NAME_FOREIGN_TIN_NOT_REQUIRED = "foreignTinNotRequired";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TIN_NOT_REQUIRED)
  private Boolean foreignTinNotRequired;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_SIGNER_CAPACITY = "signerCapacity";
  @SerializedName(SERIALIZED_NAME_SIGNER_CAPACITY)
  private String signerCapacity;

  public static final String SERIALIZED_NAME_TIN_MATCH_STATUS = "tinMatchStatus";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH_STATUS)
  private String tinMatchStatus;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_BUSINESS_CLASSIFICATION = "businessClassification";
  @SerializedName(SERIALIZED_NAME_BUSINESS_CLASSIFICATION)
  private String businessClassification;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "businessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_BUSINESS_OTHER = "businessOther";
  @SerializedName(SERIALIZED_NAME_BUSINESS_OTHER)
  private String businessOther;

  public static final String SERIALIZED_NAME_EXEMPT_PAYEE_CODE = "exemptPayeeCode";
  @SerializedName(SERIALIZED_NAME_EXEMPT_PAYEE_CODE)
  private String exemptPayeeCode;

  public static final String SERIALIZED_NAME_EXEMPT_FATCA_CODE = "exemptFatcaCode";
  @SerializedName(SERIALIZED_NAME_EXEMPT_FATCA_CODE)
  private String exemptFatcaCode;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_FOREIGN_COUNTRY_INDICATOR = "foreignCountryIndicator";
  @SerializedName(SERIALIZED_NAME_FOREIGN_COUNTRY_INDICATOR)
  private Boolean foreignCountryIndicator;

  public static final String SERIALIZED_NAME_FOREIGN_ADDRESS = "foreignAddress";
  @SerializedName(SERIALIZED_NAME_FOREIGN_ADDRESS)
  private String foreignAddress;

  public static final String SERIALIZED_NAME_BACKUP_WITHHOLDING = "backupWithholding";
  @SerializedName(SERIALIZED_NAME_BACKUP_WITHHOLDING)
  private Boolean backupWithholding;

  public static final String SERIALIZED_NAME_IS1099ABLE = "is1099able";
  @SerializedName(SERIALIZED_NAME_IS1099ABLE)
  private Boolean is1099able;

  public static final String SERIALIZED_NAME_FOREIGN_PARTNER_OWNER_OR_BENEFICIARY = "foreignPartnerOwnerOrBeneficiary";
  @SerializedName(SERIALIZED_NAME_FOREIGN_PARTNER_OWNER_OR_BENEFICIARY)
  private Boolean foreignPartnerOwnerOrBeneficiary;

  public W8ImyFormDataModel() {
  }

  public W8ImyFormDataModel(
     TypeEnum type
  ) {
    this();
    this.type = type;
  }

  /**
   * Type of the form, always W8IMY for this model.
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }



  public W8ImyFormDataModel signedDate(OffsetDateTime signedDate) {
    this.signedDate = signedDate;
    return this;
  }

  /**
   * The date the form was signed.
   * @return signedDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSignedDate() {
    return signedDate;
  }

  public void setSignedDate(OffsetDateTime signedDate) {
    this.signedDate = signedDate;
  }


  public W8ImyFormDataModel disregardedEntityChapter4FatcaStatus(String disregardedEntityChapter4FatcaStatus) {
    this.disregardedEntityChapter4FatcaStatus = disregardedEntityChapter4FatcaStatus;
    return this;
  }

  /**
   * The FATCA status for disregarded entities under Chapter 4.
   * @return disregardedEntityChapter4FatcaStatus
   */
  @javax.annotation.Nullable
  public String getDisregardedEntityChapter4FatcaStatus() {
    return disregardedEntityChapter4FatcaStatus;
  }

  public void setDisregardedEntityChapter4FatcaStatus(String disregardedEntityChapter4FatcaStatus) {
    this.disregardedEntityChapter4FatcaStatus = disregardedEntityChapter4FatcaStatus;
  }


  public W8ImyFormDataModel createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The creation date of the form.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public W8ImyFormDataModel updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The last updated date of the form.
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public W8ImyFormDataModel displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name associated with the form.
   * @return displayName
   */
  @javax.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public W8ImyFormDataModel email(String email) {
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


  public W8ImyFormDataModel tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * The taxpayer identification number (TIN) of the employee.
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public W8ImyFormDataModel typeOfTin(String typeOfTin) {
    this.typeOfTin = typeOfTin;
    return this;
  }

  /**
   * The type of TIN provided.
   * @return typeOfTin
   */
  @javax.annotation.Nullable
  public String getTypeOfTin() {
    return typeOfTin;
  }

  public void setTypeOfTin(String typeOfTin) {
    this.typeOfTin = typeOfTin;
  }


  public W8ImyFormDataModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the individual or entity associated with the form.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public W8ImyFormDataModel citizenshipCountry(String citizenshipCountry) {
    this.citizenshipCountry = citizenshipCountry;
    return this;
  }

  /**
   * The country of citizenship.
   * @return citizenshipCountry
   */
  @javax.annotation.Nullable
  public String getCitizenshipCountry() {
    return citizenshipCountry;
  }

  public void setCitizenshipCountry(String citizenshipCountry) {
    this.citizenshipCountry = citizenshipCountry;
  }


  public W8ImyFormDataModel chapter3EntityType(String chapter3EntityType) {
    this.chapter3EntityType = chapter3EntityType;
    return this;
  }

  /**
   * The Chapter 3 entity type.
   * @return chapter3EntityType
   */
  @javax.annotation.Nullable
  public String getChapter3EntityType() {
    return chapter3EntityType;
  }

  public void setChapter3EntityType(String chapter3EntityType) {
    this.chapter3EntityType = chapter3EntityType;
  }


  public W8ImyFormDataModel chapter4FatcaStatus(String chapter4FatcaStatus) {
    this.chapter4FatcaStatus = chapter4FatcaStatus;
    return this;
  }

  /**
   * The Chapter 4 FATCA status.
   * @return chapter4FatcaStatus
   */
  @javax.annotation.Nullable
  public String getChapter4FatcaStatus() {
    return chapter4FatcaStatus;
  }

  public void setChapter4FatcaStatus(String chapter4FatcaStatus) {
    this.chapter4FatcaStatus = chapter4FatcaStatus;
  }


  public W8ImyFormDataModel residenceAddress(String residenceAddress) {
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


  public W8ImyFormDataModel residenceCity(String residenceCity) {
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


  public W8ImyFormDataModel residenceState(String residenceState) {
    this.residenceState = residenceState;
    return this;
  }

  /**
   * The state of residence.
   * @return residenceState
   */
  @javax.annotation.Nullable
  public String getResidenceState() {
    return residenceState;
  }

  public void setResidenceState(String residenceState) {
    this.residenceState = residenceState;
  }


  public W8ImyFormDataModel residencePostalCode(String residencePostalCode) {
    this.residencePostalCode = residencePostalCode;
    return this;
  }

  /**
   * The postal code of the residence.
   * @return residencePostalCode
   */
  @javax.annotation.Nullable
  public String getResidencePostalCode() {
    return residencePostalCode;
  }

  public void setResidencePostalCode(String residencePostalCode) {
    this.residencePostalCode = residencePostalCode;
  }


  public W8ImyFormDataModel residenceCountry(String residenceCountry) {
    this.residenceCountry = residenceCountry;
    return this;
  }

  /**
   * The country of residence.
   * @return residenceCountry
   */
  @javax.annotation.Nullable
  public String getResidenceCountry() {
    return residenceCountry;
  }

  public void setResidenceCountry(String residenceCountry) {
    this.residenceCountry = residenceCountry;
  }


  public W8ImyFormDataModel residenceIsMailing(Boolean residenceIsMailing) {
    this.residenceIsMailing = residenceIsMailing;
    return this;
  }

  /**
   * Indicates whether the residence address is also the mailing address.
   * @return residenceIsMailing
   */
  @javax.annotation.Nullable
  public Boolean getResidenceIsMailing() {
    return residenceIsMailing;
  }

  public void setResidenceIsMailing(Boolean residenceIsMailing) {
    this.residenceIsMailing = residenceIsMailing;
  }


  public W8ImyFormDataModel mailingAddress(String mailingAddress) {
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


  public W8ImyFormDataModel mailingCity(String mailingCity) {
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


  public W8ImyFormDataModel mailingState(String mailingState) {
    this.mailingState = mailingState;
    return this;
  }

  /**
   * The state of the mailing address.
   * @return mailingState
   */
  @javax.annotation.Nullable
  public String getMailingState() {
    return mailingState;
  }

  public void setMailingState(String mailingState) {
    this.mailingState = mailingState;
  }


  public W8ImyFormDataModel mailingPostalCode(String mailingPostalCode) {
    this.mailingPostalCode = mailingPostalCode;
    return this;
  }

  /**
   * The postal code of the mailing address.
   * @return mailingPostalCode
   */
  @javax.annotation.Nullable
  public String getMailingPostalCode() {
    return mailingPostalCode;
  }

  public void setMailingPostalCode(String mailingPostalCode) {
    this.mailingPostalCode = mailingPostalCode;
  }


  public W8ImyFormDataModel mailingCountry(String mailingCountry) {
    this.mailingCountry = mailingCountry;
    return this;
  }

  /**
   * The country of the mailing address.
   * @return mailingCountry
   */
  @javax.annotation.Nullable
  public String getMailingCountry() {
    return mailingCountry;
  }

  public void setMailingCountry(String mailingCountry) {
    this.mailingCountry = mailingCountry;
  }


  public W8ImyFormDataModel disregardedEntity(String disregardedEntity) {
    this.disregardedEntity = disregardedEntity;
    return this;
  }

  /**
   * The disregarded entity information.
   * @return disregardedEntity
   */
  @javax.annotation.Nullable
  public String getDisregardedEntity() {
    return disregardedEntity;
  }

  public void setDisregardedEntity(String disregardedEntity) {
    this.disregardedEntity = disregardedEntity;
  }


  public W8ImyFormDataModel disregardedAddress(String disregardedAddress) {
    this.disregardedAddress = disregardedAddress;
    return this;
  }

  /**
   * The address for disregarded entities.
   * @return disregardedAddress
   */
  @javax.annotation.Nullable
  public String getDisregardedAddress() {
    return disregardedAddress;
  }

  public void setDisregardedAddress(String disregardedAddress) {
    this.disregardedAddress = disregardedAddress;
  }


  public W8ImyFormDataModel disregardedCity(String disregardedCity) {
    this.disregardedCity = disregardedCity;
    return this;
  }

  /**
   * The city for disregarded entities.
   * @return disregardedCity
   */
  @javax.annotation.Nullable
  public String getDisregardedCity() {
    return disregardedCity;
  }

  public void setDisregardedCity(String disregardedCity) {
    this.disregardedCity = disregardedCity;
  }


  public W8ImyFormDataModel disregardedState(String disregardedState) {
    this.disregardedState = disregardedState;
    return this;
  }

  /**
   * The state for disregarded entities.
   * @return disregardedState
   */
  @javax.annotation.Nullable
  public String getDisregardedState() {
    return disregardedState;
  }

  public void setDisregardedState(String disregardedState) {
    this.disregardedState = disregardedState;
  }


  public W8ImyFormDataModel disregardedPostalCode(String disregardedPostalCode) {
    this.disregardedPostalCode = disregardedPostalCode;
    return this;
  }

  /**
   * The postal code for disregarded entities.
   * @return disregardedPostalCode
   */
  @javax.annotation.Nullable
  public String getDisregardedPostalCode() {
    return disregardedPostalCode;
  }

  public void setDisregardedPostalCode(String disregardedPostalCode) {
    this.disregardedPostalCode = disregardedPostalCode;
  }


  public W8ImyFormDataModel disregardedCountry(String disregardedCountry) {
    this.disregardedCountry = disregardedCountry;
    return this;
  }

  /**
   * The country for disregarded entities.
   * @return disregardedCountry
   */
  @javax.annotation.Nullable
  public String getDisregardedCountry() {
    return disregardedCountry;
  }

  public void setDisregardedCountry(String disregardedCountry) {
    this.disregardedCountry = disregardedCountry;
  }


  public W8ImyFormDataModel disregardedEntityGiin(String disregardedEntityGiin) {
    this.disregardedEntityGiin = disregardedEntityGiin;
    return this;
  }

  /**
   * The GIIN for disregarded entities.
   * @return disregardedEntityGiin
   */
  @javax.annotation.Nullable
  public String getDisregardedEntityGiin() {
    return disregardedEntityGiin;
  }

  public void setDisregardedEntityGiin(String disregardedEntityGiin) {
    this.disregardedEntityGiin = disregardedEntityGiin;
  }


  public W8ImyFormDataModel ein(String ein) {
    this.ein = ein;
    return this;
  }

  /**
   * The employer identification number (EIN).
   * @return ein
   */
  @javax.annotation.Nullable
  public String getEin() {
    return ein;
  }

  public void setEin(String ein) {
    this.ein = ein;
  }


  public W8ImyFormDataModel einType(String einType) {
    this.einType = einType;
    return this;
  }

  /**
   * The type of employer identification number (EIN).
   * @return einType
   */
  @javax.annotation.Nullable
  public String getEinType() {
    return einType;
  }

  public void setEinType(String einType) {
    this.einType = einType;
  }


  public W8ImyFormDataModel giin(String giin) {
    this.giin = giin;
    return this;
  }

  /**
   * The global intermediary identification number (GIIN).
   * @return giin
   */
  @javax.annotation.Nullable
  public String getGiin() {
    return giin;
  }

  public void setGiin(String giin) {
    this.giin = giin;
  }


  public W8ImyFormDataModel foreignTin(String foreignTin) {
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


  public W8ImyFormDataModel referenceNumber(String referenceNumber) {
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


  public W8ImyFormDataModel certifyBox14(Boolean certifyBox14) {
    this.certifyBox14 = certifyBox14;
    return this;
  }

  /**
   * Indicates certification for box 14.
   * @return certifyBox14
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox14() {
    return certifyBox14;
  }

  public void setCertifyBox14(Boolean certifyBox14) {
    this.certifyBox14 = certifyBox14;
  }


  public W8ImyFormDataModel certifyBox15A(Boolean certifyBox15A) {
    this.certifyBox15A = certifyBox15A;
    return this;
  }

  /**
   * Indicates certification for box 15A.
   * @return certifyBox15A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox15A() {
    return certifyBox15A;
  }

  public void setCertifyBox15A(Boolean certifyBox15A) {
    this.certifyBox15A = certifyBox15A;
  }


  public W8ImyFormDataModel certifyBox15B(Boolean certifyBox15B) {
    this.certifyBox15B = certifyBox15B;
    return this;
  }

  /**
   * Indicates certification for box 15B.
   * @return certifyBox15B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox15B() {
    return certifyBox15B;
  }

  public void setCertifyBox15B(Boolean certifyBox15B) {
    this.certifyBox15B = certifyBox15B;
  }


  public W8ImyFormDataModel certifyBox15C(Boolean certifyBox15C) {
    this.certifyBox15C = certifyBox15C;
    return this;
  }

  /**
   * Indicates certification for box 15C.
   * @return certifyBox15C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox15C() {
    return certifyBox15C;
  }

  public void setCertifyBox15C(Boolean certifyBox15C) {
    this.certifyBox15C = certifyBox15C;
  }


  public W8ImyFormDataModel certifyBox15D(Boolean certifyBox15D) {
    this.certifyBox15D = certifyBox15D;
    return this;
  }

  /**
   * Indicates certification for box 15D.
   * @return certifyBox15D
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox15D() {
    return certifyBox15D;
  }

  public void setCertifyBox15D(Boolean certifyBox15D) {
    this.certifyBox15D = certifyBox15D;
  }


  public W8ImyFormDataModel certifyBox15E(Boolean certifyBox15E) {
    this.certifyBox15E = certifyBox15E;
    return this;
  }

  /**
   * Indicates certification for box 15E.
   * @return certifyBox15E
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox15E() {
    return certifyBox15E;
  }

  public void setCertifyBox15E(Boolean certifyBox15E) {
    this.certifyBox15E = certifyBox15E;
  }


  public W8ImyFormDataModel certifyBox15F(Boolean certifyBox15F) {
    this.certifyBox15F = certifyBox15F;
    return this;
  }

  /**
   * Indicates certification for box 15F.
   * @return certifyBox15F
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox15F() {
    return certifyBox15F;
  }

  public void setCertifyBox15F(Boolean certifyBox15F) {
    this.certifyBox15F = certifyBox15F;
  }


  public W8ImyFormDataModel certifyBox15G(Boolean certifyBox15G) {
    this.certifyBox15G = certifyBox15G;
    return this;
  }

  /**
   * Indicates certification for box 15G.
   * @return certifyBox15G
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox15G() {
    return certifyBox15G;
  }

  public void setCertifyBox15G(Boolean certifyBox15G) {
    this.certifyBox15G = certifyBox15G;
  }


  public W8ImyFormDataModel certifyBox15H(Boolean certifyBox15H) {
    this.certifyBox15H = certifyBox15H;
    return this;
  }

  /**
   * Indicates certification for box 15H.
   * @return certifyBox15H
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox15H() {
    return certifyBox15H;
  }

  public void setCertifyBox15H(Boolean certifyBox15H) {
    this.certifyBox15H = certifyBox15H;
  }


  public W8ImyFormDataModel certifyBox15I(Boolean certifyBox15I) {
    this.certifyBox15I = certifyBox15I;
    return this;
  }

  /**
   * Indicates certification for box 15I.
   * @return certifyBox15I
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox15I() {
    return certifyBox15I;
  }

  public void setCertifyBox15I(Boolean certifyBox15I) {
    this.certifyBox15I = certifyBox15I;
  }


  public W8ImyFormDataModel certifyBox16A(Boolean certifyBox16A) {
    this.certifyBox16A = certifyBox16A;
    return this;
  }

  /**
   * Indicates certification for box 16A.
   * @return certifyBox16A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox16A() {
    return certifyBox16A;
  }

  public void setCertifyBox16A(Boolean certifyBox16A) {
    this.certifyBox16A = certifyBox16A;
  }


  public W8ImyFormDataModel box16BQddCorporate(Boolean box16BQddCorporate) {
    this.box16BQddCorporate = box16BQddCorporate;
    return this;
  }

  /**
   * Indicates certification for box 16B as a QDD corporate entity.
   * @return box16BQddCorporate
   */
  @javax.annotation.Nullable
  public Boolean getBox16BQddCorporate() {
    return box16BQddCorporate;
  }

  public void setBox16BQddCorporate(Boolean box16BQddCorporate) {
    this.box16BQddCorporate = box16BQddCorporate;
  }


  public W8ImyFormDataModel box16BQddPartnership(Boolean box16BQddPartnership) {
    this.box16BQddPartnership = box16BQddPartnership;
    return this;
  }

  /**
   * Indicates certification for box 16B as a QDD partnership.
   * @return box16BQddPartnership
   */
  @javax.annotation.Nullable
  public Boolean getBox16BQddPartnership() {
    return box16BQddPartnership;
  }

  public void setBox16BQddPartnership(Boolean box16BQddPartnership) {
    this.box16BQddPartnership = box16BQddPartnership;
  }


  public W8ImyFormDataModel box16BQddDisregardedEntity(Boolean box16BQddDisregardedEntity) {
    this.box16BQddDisregardedEntity = box16BQddDisregardedEntity;
    return this;
  }

  /**
   * Indicates certification for box 16B as a QDD disregarded entity.
   * @return box16BQddDisregardedEntity
   */
  @javax.annotation.Nullable
  public Boolean getBox16BQddDisregardedEntity() {
    return box16BQddDisregardedEntity;
  }

  public void setBox16BQddDisregardedEntity(Boolean box16BQddDisregardedEntity) {
    this.box16BQddDisregardedEntity = box16BQddDisregardedEntity;
  }


  public W8ImyFormDataModel certifyBox17A(Boolean certifyBox17A) {
    this.certifyBox17A = certifyBox17A;
    return this;
  }

  /**
   * Indicates certification for box 17A.
   * @return certifyBox17A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox17A() {
    return certifyBox17A;
  }

  public void setCertifyBox17A(Boolean certifyBox17A) {
    this.certifyBox17A = certifyBox17A;
  }


  public W8ImyFormDataModel certifyBox17B(Boolean certifyBox17B) {
    this.certifyBox17B = certifyBox17B;
    return this;
  }

  /**
   * Indicates certification for box 17B.
   * @return certifyBox17B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox17B() {
    return certifyBox17B;
  }

  public void setCertifyBox17B(Boolean certifyBox17B) {
    this.certifyBox17B = certifyBox17B;
  }


  public W8ImyFormDataModel certifyBox17C(Boolean certifyBox17C) {
    this.certifyBox17C = certifyBox17C;
    return this;
  }

  /**
   * Indicates certification for box 17C.
   * @return certifyBox17C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox17C() {
    return certifyBox17C;
  }

  public void setCertifyBox17C(Boolean certifyBox17C) {
    this.certifyBox17C = certifyBox17C;
  }


  public W8ImyFormDataModel certifyBox17D(Boolean certifyBox17D) {
    this.certifyBox17D = certifyBox17D;
    return this;
  }

  /**
   * Indicates certification for box 17D.
   * @return certifyBox17D
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox17D() {
    return certifyBox17D;
  }

  public void setCertifyBox17D(Boolean certifyBox17D) {
    this.certifyBox17D = certifyBox17D;
  }


  public W8ImyFormDataModel certifyBox17E(Boolean certifyBox17E) {
    this.certifyBox17E = certifyBox17E;
    return this;
  }

  /**
   * Indicates certification for box 17E.
   * @return certifyBox17E
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox17E() {
    return certifyBox17E;
  }

  public void setCertifyBox17E(Boolean certifyBox17E) {
    this.certifyBox17E = certifyBox17E;
  }


  public W8ImyFormDataModel certifyBox18A(Boolean certifyBox18A) {
    this.certifyBox18A = certifyBox18A;
    return this;
  }

  /**
   * Indicates certification for box 18A.
   * @return certifyBox18A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox18A() {
    return certifyBox18A;
  }

  public void setCertifyBox18A(Boolean certifyBox18A) {
    this.certifyBox18A = certifyBox18A;
  }


  public W8ImyFormDataModel certifyBox18B(Boolean certifyBox18B) {
    this.certifyBox18B = certifyBox18B;
    return this;
  }

  /**
   * Indicates certification for box 18B.
   * @return certifyBox18B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox18B() {
    return certifyBox18B;
  }

  public void setCertifyBox18B(Boolean certifyBox18B) {
    this.certifyBox18B = certifyBox18B;
  }


  public W8ImyFormDataModel certifyBox18C(Boolean certifyBox18C) {
    this.certifyBox18C = certifyBox18C;
    return this;
  }

  /**
   * Indicates certification for box 18C.
   * @return certifyBox18C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox18C() {
    return certifyBox18C;
  }

  public void setCertifyBox18C(Boolean certifyBox18C) {
    this.certifyBox18C = certifyBox18C;
  }


  public W8ImyFormDataModel certifyBox18D(Boolean certifyBox18D) {
    this.certifyBox18D = certifyBox18D;
    return this;
  }

  /**
   * Indicates certification for box 18D.
   * @return certifyBox18D
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox18D() {
    return certifyBox18D;
  }

  public void setCertifyBox18D(Boolean certifyBox18D) {
    this.certifyBox18D = certifyBox18D;
  }


  public W8ImyFormDataModel certifyBox18E(Boolean certifyBox18E) {
    this.certifyBox18E = certifyBox18E;
    return this;
  }

  /**
   * Indicates certification for box 18E.
   * @return certifyBox18E
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox18E() {
    return certifyBox18E;
  }

  public void setCertifyBox18E(Boolean certifyBox18E) {
    this.certifyBox18E = certifyBox18E;
  }


  public W8ImyFormDataModel certifyBox18F(Boolean certifyBox18F) {
    this.certifyBox18F = certifyBox18F;
    return this;
  }

  /**
   * Indicates certification for box 18F.
   * @return certifyBox18F
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox18F() {
    return certifyBox18F;
  }

  public void setCertifyBox18F(Boolean certifyBox18F) {
    this.certifyBox18F = certifyBox18F;
  }


  public W8ImyFormDataModel certifyBox19A(Boolean certifyBox19A) {
    this.certifyBox19A = certifyBox19A;
    return this;
  }

  /**
   * Indicates certification for box 19A.
   * @return certifyBox19A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox19A() {
    return certifyBox19A;
  }

  public void setCertifyBox19A(Boolean certifyBox19A) {
    this.certifyBox19A = certifyBox19A;
  }


  public W8ImyFormDataModel certifyBox19B(Boolean certifyBox19B) {
    this.certifyBox19B = certifyBox19B;
    return this;
  }

  /**
   * Indicates certification for box 19B.
   * @return certifyBox19B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox19B() {
    return certifyBox19B;
  }

  public void setCertifyBox19B(Boolean certifyBox19B) {
    this.certifyBox19B = certifyBox19B;
  }


  public W8ImyFormDataModel certifyBox19C(Boolean certifyBox19C) {
    this.certifyBox19C = certifyBox19C;
    return this;
  }

  /**
   * Indicates certification for box 19C.
   * @return certifyBox19C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox19C() {
    return certifyBox19C;
  }

  public void setCertifyBox19C(Boolean certifyBox19C) {
    this.certifyBox19C = certifyBox19C;
  }


  public W8ImyFormDataModel certifyBox19D(Boolean certifyBox19D) {
    this.certifyBox19D = certifyBox19D;
    return this;
  }

  /**
   * Indicates certification for box 19D.
   * @return certifyBox19D
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox19D() {
    return certifyBox19D;
  }

  public void setCertifyBox19D(Boolean certifyBox19D) {
    this.certifyBox19D = certifyBox19D;
  }


  public W8ImyFormDataModel certifyBox19E(Boolean certifyBox19E) {
    this.certifyBox19E = certifyBox19E;
    return this;
  }

  /**
   * Indicates certification for box 19E.
   * @return certifyBox19E
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox19E() {
    return certifyBox19E;
  }

  public void setCertifyBox19E(Boolean certifyBox19E) {
    this.certifyBox19E = certifyBox19E;
  }


  public W8ImyFormDataModel certifyBox19F(Boolean certifyBox19F) {
    this.certifyBox19F = certifyBox19F;
    return this;
  }

  /**
   * Indicates certification for box 19F.
   * @return certifyBox19F
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox19F() {
    return certifyBox19F;
  }

  public void setCertifyBox19F(Boolean certifyBox19F) {
    this.certifyBox19F = certifyBox19F;
  }


  public W8ImyFormDataModel certifyBox20(Boolean certifyBox20) {
    this.certifyBox20 = certifyBox20;
    return this;
  }

  /**
   * Indicates certification for box 20.
   * @return certifyBox20
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox20() {
    return certifyBox20;
  }

  public void setCertifyBox20(Boolean certifyBox20) {
    this.certifyBox20 = certifyBox20;
  }


  public W8ImyFormDataModel certifyBox21A(Boolean certifyBox21A) {
    this.certifyBox21A = certifyBox21A;
    return this;
  }

  /**
   * Indicates certification for box 21A.
   * @return certifyBox21A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox21A() {
    return certifyBox21A;
  }

  public void setCertifyBox21A(Boolean certifyBox21A) {
    this.certifyBox21A = certifyBox21A;
  }


  public W8ImyFormDataModel certifyBox21B(Boolean certifyBox21B) {
    this.certifyBox21B = certifyBox21B;
    return this;
  }

  /**
   * Indicates certification for box 21B.
   * @return certifyBox21B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox21B() {
    return certifyBox21B;
  }

  public void setCertifyBox21B(Boolean certifyBox21B) {
    this.certifyBox21B = certifyBox21B;
  }


  public W8ImyFormDataModel certifyBox21C(Boolean certifyBox21C) {
    this.certifyBox21C = certifyBox21C;
    return this;
  }

  /**
   * Indicates certification for box 21C.
   * @return certifyBox21C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox21C() {
    return certifyBox21C;
  }

  public void setCertifyBox21C(Boolean certifyBox21C) {
    this.certifyBox21C = certifyBox21C;
  }


  public W8ImyFormDataModel certifyBox21D(Boolean certifyBox21D) {
    this.certifyBox21D = certifyBox21D;
    return this;
  }

  /**
   * Indicates certification for box 21D.
   * @return certifyBox21D
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox21D() {
    return certifyBox21D;
  }

  public void setCertifyBox21D(Boolean certifyBox21D) {
    this.certifyBox21D = certifyBox21D;
  }


  public W8ImyFormDataModel certifyBox21E(Boolean certifyBox21E) {
    this.certifyBox21E = certifyBox21E;
    return this;
  }

  /**
   * Indicates certification for box 21E.
   * @return certifyBox21E
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox21E() {
    return certifyBox21E;
  }

  public void setCertifyBox21E(Boolean certifyBox21E) {
    this.certifyBox21E = certifyBox21E;
  }


  public W8ImyFormDataModel certifyBox21F(Boolean certifyBox21F) {
    this.certifyBox21F = certifyBox21F;
    return this;
  }

  /**
   * Indicates certification for box 21F.
   * @return certifyBox21F
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox21F() {
    return certifyBox21F;
  }

  public void setCertifyBox21F(Boolean certifyBox21F) {
    this.certifyBox21F = certifyBox21F;
  }


  public W8ImyFormDataModel certifyBox22(Boolean certifyBox22) {
    this.certifyBox22 = certifyBox22;
    return this;
  }

  /**
   * Indicates certification for box 22.
   * @return certifyBox22
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox22() {
    return certifyBox22;
  }

  public void setCertifyBox22(Boolean certifyBox22) {
    this.certifyBox22 = certifyBox22;
  }


  public W8ImyFormDataModel box23ANameSponsoringEntity(String box23ANameSponsoringEntity) {
    this.box23ANameSponsoringEntity = box23ANameSponsoringEntity;
    return this;
  }

  /**
   * The name of the sponsoring entity for box 23A.
   * @return box23ANameSponsoringEntity
   */
  @javax.annotation.Nullable
  public String getBox23ANameSponsoringEntity() {
    return box23ANameSponsoringEntity;
  }

  public void setBox23ANameSponsoringEntity(String box23ANameSponsoringEntity) {
    this.box23ANameSponsoringEntity = box23ANameSponsoringEntity;
  }


  public W8ImyFormDataModel certifyBox23B(Boolean certifyBox23B) {
    this.certifyBox23B = certifyBox23B;
    return this;
  }

  /**
   * Indicates certification for box 23B.
   * @return certifyBox23B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox23B() {
    return certifyBox23B;
  }

  public void setCertifyBox23B(Boolean certifyBox23B) {
    this.certifyBox23B = certifyBox23B;
  }


  public W8ImyFormDataModel certifyBox23C(Boolean certifyBox23C) {
    this.certifyBox23C = certifyBox23C;
    return this;
  }

  /**
   * Indicates certification for box 23C.
   * @return certifyBox23C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox23C() {
    return certifyBox23C;
  }

  public void setCertifyBox23C(Boolean certifyBox23C) {
    this.certifyBox23C = certifyBox23C;
  }


  public W8ImyFormDataModel certifyBox24A(Boolean certifyBox24A) {
    this.certifyBox24A = certifyBox24A;
    return this;
  }

  /**
   * Indicates certification for box 24A.
   * @return certifyBox24A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox24A() {
    return certifyBox24A;
  }

  public void setCertifyBox24A(Boolean certifyBox24A) {
    this.certifyBox24A = certifyBox24A;
  }


  public W8ImyFormDataModel certifyBox24B(Boolean certifyBox24B) {
    this.certifyBox24B = certifyBox24B;
    return this;
  }

  /**
   * Indicates certification for box 24B.
   * @return certifyBox24B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox24B() {
    return certifyBox24B;
  }

  public void setCertifyBox24B(Boolean certifyBox24B) {
    this.certifyBox24B = certifyBox24B;
  }


  public W8ImyFormDataModel certifyBox24C(Boolean certifyBox24C) {
    this.certifyBox24C = certifyBox24C;
    return this;
  }

  /**
   * Indicates certification for box 24C.
   * @return certifyBox24C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox24C() {
    return certifyBox24C;
  }

  public void setCertifyBox24C(Boolean certifyBox24C) {
    this.certifyBox24C = certifyBox24C;
  }


  public W8ImyFormDataModel certifyBox25(Boolean certifyBox25) {
    this.certifyBox25 = certifyBox25;
    return this;
  }

  /**
   * Indicates certification for box 25.
   * @return certifyBox25
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox25() {
    return certifyBox25;
  }

  public void setCertifyBox25(Boolean certifyBox25) {
    this.certifyBox25 = certifyBox25;
  }


  public W8ImyFormDataModel certifyBox26(Boolean certifyBox26) {
    this.certifyBox26 = certifyBox26;
    return this;
  }

  /**
   * Indicates certification for box 26.
   * @return certifyBox26
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox26() {
    return certifyBox26;
  }

  public void setCertifyBox26(Boolean certifyBox26) {
    this.certifyBox26 = certifyBox26;
  }


  public W8ImyFormDataModel box27ANameSponsoringEntity(String box27ANameSponsoringEntity) {
    this.box27ANameSponsoringEntity = box27ANameSponsoringEntity;
    return this;
  }

  /**
   * The name of the sponsoring entity for box 27A.
   * @return box27ANameSponsoringEntity
   */
  @javax.annotation.Nullable
  public String getBox27ANameSponsoringEntity() {
    return box27ANameSponsoringEntity;
  }

  public void setBox27ANameSponsoringEntity(String box27ANameSponsoringEntity) {
    this.box27ANameSponsoringEntity = box27ANameSponsoringEntity;
  }


  public W8ImyFormDataModel certifyBox27B(Boolean certifyBox27B) {
    this.certifyBox27B = certifyBox27B;
    return this;
  }

  /**
   * Indicates certification for box 27B.
   * @return certifyBox27B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox27B() {
    return certifyBox27B;
  }

  public void setCertifyBox27B(Boolean certifyBox27B) {
    this.certifyBox27B = certifyBox27B;
  }


  public W8ImyFormDataModel certifyBox28(Boolean certifyBox28) {
    this.certifyBox28 = certifyBox28;
    return this;
  }

  /**
   * Indicates certification for box 28.
   * @return certifyBox28
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox28() {
    return certifyBox28;
  }

  public void setCertifyBox28(Boolean certifyBox28) {
    this.certifyBox28 = certifyBox28;
  }


  public W8ImyFormDataModel certifyBox29(Boolean certifyBox29) {
    this.certifyBox29 = certifyBox29;
    return this;
  }

  /**
   * Indicates certification for box 29.
   * @return certifyBox29
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox29() {
    return certifyBox29;
  }

  public void setCertifyBox29(Boolean certifyBox29) {
    this.certifyBox29 = certifyBox29;
  }


  public W8ImyFormDataModel certifyBox30A(Boolean certifyBox30A) {
    this.certifyBox30A = certifyBox30A;
    return this;
  }

  /**
   * Indicates certification for box 30A.
   * @return certifyBox30A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox30A() {
    return certifyBox30A;
  }

  public void setCertifyBox30A(Boolean certifyBox30A) {
    this.certifyBox30A = certifyBox30A;
  }


  public W8ImyFormDataModel certifyBox30B(Boolean certifyBox30B) {
    this.certifyBox30B = certifyBox30B;
    return this;
  }

  /**
   * Indicates certification for box 30B.
   * @return certifyBox30B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox30B() {
    return certifyBox30B;
  }

  public void setCertifyBox30B(Boolean certifyBox30B) {
    this.certifyBox30B = certifyBox30B;
  }


  public W8ImyFormDataModel certifyBox30C(Boolean certifyBox30C) {
    this.certifyBox30C = certifyBox30C;
    return this;
  }

  /**
   * Indicates certification for box 30C.
   * @return certifyBox30C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox30C() {
    return certifyBox30C;
  }

  public void setCertifyBox30C(Boolean certifyBox30C) {
    this.certifyBox30C = certifyBox30C;
  }


  public W8ImyFormDataModel certifyBox31(Boolean certifyBox31) {
    this.certifyBox31 = certifyBox31;
    return this;
  }

  /**
   * Indicates certification for box 31.
   * @return certifyBox31
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox31() {
    return certifyBox31;
  }

  public void setCertifyBox31(Boolean certifyBox31) {
    this.certifyBox31 = certifyBox31;
  }


  public W8ImyFormDataModel certifyBox32(Boolean certifyBox32) {
    this.certifyBox32 = certifyBox32;
    return this;
  }

  /**
   * Indicates certification for box 32.
   * @return certifyBox32
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox32() {
    return certifyBox32;
  }

  public void setCertifyBox32(Boolean certifyBox32) {
    this.certifyBox32 = certifyBox32;
  }


  public W8ImyFormDataModel box32IgaCountry(String box32IgaCountry) {
    this.box32IgaCountry = box32IgaCountry;
    return this;
  }

  /**
   * The IGA country information for box 32.
   * @return box32IgaCountry
   */
  @javax.annotation.Nullable
  public String getBox32IgaCountry() {
    return box32IgaCountry;
  }

  public void setBox32IgaCountry(String box32IgaCountry) {
    this.box32IgaCountry = box32IgaCountry;
  }


  public W8ImyFormDataModel box32IgaType(String box32IgaType) {
    this.box32IgaType = box32IgaType;
    return this;
  }

  /**
   * The IGA type information for box 32.
   * @return box32IgaType
   */
  @javax.annotation.Nullable
  public String getBox32IgaType() {
    return box32IgaType;
  }

  public void setBox32IgaType(String box32IgaType) {
    this.box32IgaType = box32IgaType;
  }


  public W8ImyFormDataModel box32IgaTreatedAs(String box32IgaTreatedAs) {
    this.box32IgaTreatedAs = box32IgaTreatedAs;
    return this;
  }

  /**
   * The IGA treatment information for box 32.
   * @return box32IgaTreatedAs
   */
  @javax.annotation.Nullable
  public String getBox32IgaTreatedAs() {
    return box32IgaTreatedAs;
  }

  public void setBox32IgaTreatedAs(String box32IgaTreatedAs) {
    this.box32IgaTreatedAs = box32IgaTreatedAs;
  }


  public W8ImyFormDataModel box32TrusteeOrSponsor(String box32TrusteeOrSponsor) {
    this.box32TrusteeOrSponsor = box32TrusteeOrSponsor;
    return this;
  }

  /**
   * The trustee or sponsor information for box 32.
   * @return box32TrusteeOrSponsor
   */
  @javax.annotation.Nullable
  public String getBox32TrusteeOrSponsor() {
    return box32TrusteeOrSponsor;
  }

  public void setBox32TrusteeOrSponsor(String box32TrusteeOrSponsor) {
    this.box32TrusteeOrSponsor = box32TrusteeOrSponsor;
  }


  public W8ImyFormDataModel box32TrusteeIsForeign(Boolean box32TrusteeIsForeign) {
    this.box32TrusteeIsForeign = box32TrusteeIsForeign;
    return this;
  }

  /**
   * Indicates whether the trustee is foreign for box 32.
   * @return box32TrusteeIsForeign
   */
  @javax.annotation.Nullable
  public Boolean getBox32TrusteeIsForeign() {
    return box32TrusteeIsForeign;
  }

  public void setBox32TrusteeIsForeign(Boolean box32TrusteeIsForeign) {
    this.box32TrusteeIsForeign = box32TrusteeIsForeign;
  }


  public W8ImyFormDataModel certifyBox33A(Boolean certifyBox33A) {
    this.certifyBox33A = certifyBox33A;
    return this;
  }

  /**
   * Indicates certification for box 33A.
   * @return certifyBox33A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox33A() {
    return certifyBox33A;
  }

  public void setCertifyBox33A(Boolean certifyBox33A) {
    this.certifyBox33A = certifyBox33A;
  }


  public W8ImyFormDataModel certifyBox33B(Boolean certifyBox33B) {
    this.certifyBox33B = certifyBox33B;
    return this;
  }

  /**
   * Indicates certification for box 33B.
   * @return certifyBox33B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox33B() {
    return certifyBox33B;
  }

  public void setCertifyBox33B(Boolean certifyBox33B) {
    this.certifyBox33B = certifyBox33B;
  }


  public W8ImyFormDataModel certifyBox33C(Boolean certifyBox33C) {
    this.certifyBox33C = certifyBox33C;
    return this;
  }

  /**
   * Indicates certification for box 33C.
   * @return certifyBox33C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox33C() {
    return certifyBox33C;
  }

  public void setCertifyBox33C(Boolean certifyBox33C) {
    this.certifyBox33C = certifyBox33C;
  }


  public W8ImyFormDataModel certifyBox33D(Boolean certifyBox33D) {
    this.certifyBox33D = certifyBox33D;
    return this;
  }

  /**
   * Indicates certification for box 33D.
   * @return certifyBox33D
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox33D() {
    return certifyBox33D;
  }

  public void setCertifyBox33D(Boolean certifyBox33D) {
    this.certifyBox33D = certifyBox33D;
  }


  public W8ImyFormDataModel certifyBox33E(Boolean certifyBox33E) {
    this.certifyBox33E = certifyBox33E;
    return this;
  }

  /**
   * Indicates certification for box 33E.
   * @return certifyBox33E
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox33E() {
    return certifyBox33E;
  }

  public void setCertifyBox33E(Boolean certifyBox33E) {
    this.certifyBox33E = certifyBox33E;
  }


  public W8ImyFormDataModel certifyBox33F(Boolean certifyBox33F) {
    this.certifyBox33F = certifyBox33F;
    return this;
  }

  /**
   * Indicates certification for box 33F.
   * @return certifyBox33F
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox33F() {
    return certifyBox33F;
  }

  public void setCertifyBox33F(Boolean certifyBox33F) {
    this.certifyBox33F = certifyBox33F;
  }


  public W8ImyFormDataModel certifyBox34(Boolean certifyBox34) {
    this.certifyBox34 = certifyBox34;
    return this;
  }

  /**
   * Indicates certification for box 34.
   * @return certifyBox34
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox34() {
    return certifyBox34;
  }

  public void setCertifyBox34(Boolean certifyBox34) {
    this.certifyBox34 = certifyBox34;
  }


  public W8ImyFormDataModel certifyBox35(Boolean certifyBox35) {
    this.certifyBox35 = certifyBox35;
    return this;
  }

  /**
   * Indicates certification for box 35.
   * @return certifyBox35
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox35() {
    return certifyBox35;
  }

  public void setCertifyBox35(Boolean certifyBox35) {
    this.certifyBox35 = certifyBox35;
  }


  public W8ImyFormDataModel certifyBox36(Boolean certifyBox36) {
    this.certifyBox36 = certifyBox36;
    return this;
  }

  /**
   * Indicates certification for box 36.
   * @return certifyBox36
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox36() {
    return certifyBox36;
  }

  public void setCertifyBox36(Boolean certifyBox36) {
    this.certifyBox36 = certifyBox36;
  }


  public W8ImyFormDataModel certifyBox37A(Boolean certifyBox37A) {
    this.certifyBox37A = certifyBox37A;
    return this;
  }

  /**
   * Indicates certification for box 37A.
   * @return certifyBox37A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox37A() {
    return certifyBox37A;
  }

  public void setCertifyBox37A(Boolean certifyBox37A) {
    this.certifyBox37A = certifyBox37A;
  }


  public W8ImyFormDataModel box37ASecuritiesMarket(String box37ASecuritiesMarket) {
    this.box37ASecuritiesMarket = box37ASecuritiesMarket;
    return this;
  }

  /**
   * The securities market information for box 37A.
   * @return box37ASecuritiesMarket
   */
  @javax.annotation.Nullable
  public String getBox37ASecuritiesMarket() {
    return box37ASecuritiesMarket;
  }

  public void setBox37ASecuritiesMarket(String box37ASecuritiesMarket) {
    this.box37ASecuritiesMarket = box37ASecuritiesMarket;
  }


  public W8ImyFormDataModel certifyBox37B(Boolean certifyBox37B) {
    this.certifyBox37B = certifyBox37B;
    return this;
  }

  /**
   * Indicates certification for box 37B.
   * @return certifyBox37B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox37B() {
    return certifyBox37B;
  }

  public void setCertifyBox37B(Boolean certifyBox37B) {
    this.certifyBox37B = certifyBox37B;
  }


  public W8ImyFormDataModel box37BNameOfEntity(String box37BNameOfEntity) {
    this.box37BNameOfEntity = box37BNameOfEntity;
    return this;
  }

  /**
   * The name of the entity for box 37B.
   * @return box37BNameOfEntity
   */
  @javax.annotation.Nullable
  public String getBox37BNameOfEntity() {
    return box37BNameOfEntity;
  }

  public void setBox37BNameOfEntity(String box37BNameOfEntity) {
    this.box37BNameOfEntity = box37BNameOfEntity;
  }


  public W8ImyFormDataModel box37BSecuritiesMarket(String box37BSecuritiesMarket) {
    this.box37BSecuritiesMarket = box37BSecuritiesMarket;
    return this;
  }

  /**
   * The securities market information for box 37B.
   * @return box37BSecuritiesMarket
   */
  @javax.annotation.Nullable
  public String getBox37BSecuritiesMarket() {
    return box37BSecuritiesMarket;
  }

  public void setBox37BSecuritiesMarket(String box37BSecuritiesMarket) {
    this.box37BSecuritiesMarket = box37BSecuritiesMarket;
  }


  public W8ImyFormDataModel certifyBox38(Boolean certifyBox38) {
    this.certifyBox38 = certifyBox38;
    return this;
  }

  /**
   * Indicates certification for box 38.
   * @return certifyBox38
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox38() {
    return certifyBox38;
  }

  public void setCertifyBox38(Boolean certifyBox38) {
    this.certifyBox38 = certifyBox38;
  }


  public W8ImyFormDataModel certifyBox39(Boolean certifyBox39) {
    this.certifyBox39 = certifyBox39;
    return this;
  }

  /**
   * Indicates certification for box 39.
   * @return certifyBox39
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox39() {
    return certifyBox39;
  }

  public void setCertifyBox39(Boolean certifyBox39) {
    this.certifyBox39 = certifyBox39;
  }


  public W8ImyFormDataModel certifyBox40(Boolean certifyBox40) {
    this.certifyBox40 = certifyBox40;
    return this;
  }

  /**
   * Indicates certification for box 40.
   * @return certifyBox40
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox40() {
    return certifyBox40;
  }

  public void setCertifyBox40(Boolean certifyBox40) {
    this.certifyBox40 = certifyBox40;
  }


  public W8ImyFormDataModel box41SponsoringEntity(String box41SponsoringEntity) {
    this.box41SponsoringEntity = box41SponsoringEntity;
    return this;
  }

  /**
   * The sponsoring entity information for box 41.
   * @return box41SponsoringEntity
   */
  @javax.annotation.Nullable
  public String getBox41SponsoringEntity() {
    return box41SponsoringEntity;
  }

  public void setBox41SponsoringEntity(String box41SponsoringEntity) {
    this.box41SponsoringEntity = box41SponsoringEntity;
  }


  public W8ImyFormDataModel certifyBox42(Boolean certifyBox42) {
    this.certifyBox42 = certifyBox42;
    return this;
  }

  /**
   * Indicates certification for box 42.
   * @return certifyBox42
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox42() {
    return certifyBox42;
  }

  public void setCertifyBox42(Boolean certifyBox42) {
    this.certifyBox42 = certifyBox42;
  }


  public W8ImyFormDataModel signerName(String signerName) {
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


  public W8ImyFormDataModel eDeliveryConsentedAt(OffsetDateTime eDeliveryConsentedAt) {
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


  public W8ImyFormDataModel box35FormedOnDate(OffsetDateTime box35FormedOnDate) {
    this.box35FormedOnDate = box35FormedOnDate;
    return this;
  }

  /**
   * Get box35FormedOnDate
   * @return box35FormedOnDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getBox35FormedOnDate() {
    return box35FormedOnDate;
  }

  public void setBox35FormedOnDate(OffsetDateTime box35FormedOnDate) {
    this.box35FormedOnDate = box35FormedOnDate;
  }


  public W8ImyFormDataModel box36FiledOnDate(OffsetDateTime box36FiledOnDate) {
    this.box36FiledOnDate = box36FiledOnDate;
    return this;
  }

  /**
   * Get box36FiledOnDate
   * @return box36FiledOnDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getBox36FiledOnDate() {
    return box36FiledOnDate;
  }

  public void setBox36FiledOnDate(OffsetDateTime box36FiledOnDate) {
    this.box36FiledOnDate = box36FiledOnDate;
  }


  public W8ImyFormDataModel employeeFirstName(String employeeFirstName) {
    this.employeeFirstName = employeeFirstName;
    return this;
  }

  /**
   * The first name of the employee.
   * @return employeeFirstName
   */
  @javax.annotation.Nullable
  public String getEmployeeFirstName() {
    return employeeFirstName;
  }

  public void setEmployeeFirstName(String employeeFirstName) {
    this.employeeFirstName = employeeFirstName;
  }


  public W8ImyFormDataModel employeeMiddleName(String employeeMiddleName) {
    this.employeeMiddleName = employeeMiddleName;
    return this;
  }

  /**
   * The middle name of the employee.
   * @return employeeMiddleName
   */
  @javax.annotation.Nullable
  public String getEmployeeMiddleName() {
    return employeeMiddleName;
  }

  public void setEmployeeMiddleName(String employeeMiddleName) {
    this.employeeMiddleName = employeeMiddleName;
  }


  public W8ImyFormDataModel employeeLastName(String employeeLastName) {
    this.employeeLastName = employeeLastName;
    return this;
  }

  /**
   * The last name of the employee.
   * @return employeeLastName
   */
  @javax.annotation.Nullable
  public String getEmployeeLastName() {
    return employeeLastName;
  }

  public void setEmployeeLastName(String employeeLastName) {
    this.employeeLastName = employeeLastName;
  }


  public W8ImyFormDataModel employeeNameSuffix(String employeeNameSuffix) {
    this.employeeNameSuffix = employeeNameSuffix;
    return this;
  }

  /**
   * The name suffix of the employee.
   * @return employeeNameSuffix
   */
  @javax.annotation.Nullable
  public String getEmployeeNameSuffix() {
    return employeeNameSuffix;
  }

  public void setEmployeeNameSuffix(String employeeNameSuffix) {
    this.employeeNameSuffix = employeeNameSuffix;
  }


  public W8ImyFormDataModel address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The address of the individual or entity.
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public W8ImyFormDataModel city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city of the address.
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public W8ImyFormDataModel state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state of the address.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public W8ImyFormDataModel zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * The ZIP code of the address.
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  public W8ImyFormDataModel box3MaritalStatus(String box3MaritalStatus) {
    this.box3MaritalStatus = box3MaritalStatus;
    return this;
  }

  /**
   * The marital status of the employee.
   * @return box3MaritalStatus
   */
  @javax.annotation.Nullable
  public String getBox3MaritalStatus() {
    return box3MaritalStatus;
  }

  public void setBox3MaritalStatus(String box3MaritalStatus) {
    this.box3MaritalStatus = box3MaritalStatus;
  }


  public W8ImyFormDataModel box4LastNameDiffers(Boolean box4LastNameDiffers) {
    this.box4LastNameDiffers = box4LastNameDiffers;
    return this;
  }

  /**
   * Indicates whether the last name differs from prior records.
   * @return box4LastNameDiffers
   */
  @javax.annotation.Nullable
  public Boolean getBox4LastNameDiffers() {
    return box4LastNameDiffers;
  }

  public void setBox4LastNameDiffers(Boolean box4LastNameDiffers) {
    this.box4LastNameDiffers = box4LastNameDiffers;
  }


  public W8ImyFormDataModel box5NumAllowances(Integer box5NumAllowances) {
    this.box5NumAllowances = box5NumAllowances;
    return this;
  }

  /**
   * The number of allowances claimed by the employee.
   * @return box5NumAllowances
   */
  @javax.annotation.Nullable
  public Integer getBox5NumAllowances() {
    return box5NumAllowances;
  }

  public void setBox5NumAllowances(Integer box5NumAllowances) {
    this.box5NumAllowances = box5NumAllowances;
  }


  public W8ImyFormDataModel otherDependents(Integer otherDependents) {
    this.otherDependents = otherDependents;
    return this;
  }

  /**
   * The number of dependents other than allowances.
   * @return otherDependents
   */
  @javax.annotation.Nullable
  public Integer getOtherDependents() {
    return otherDependents;
  }

  public void setOtherDependents(Integer otherDependents) {
    this.otherDependents = otherDependents;
  }


  public W8ImyFormDataModel nonJobIncome(Double nonJobIncome) {
    this.nonJobIncome = nonJobIncome;
    return this;
  }

  /**
   * The amount of non-job income.
   * @return nonJobIncome
   */
  @javax.annotation.Nullable
  public Double getNonJobIncome() {
    return nonJobIncome;
  }

  public void setNonJobIncome(Double nonJobIncome) {
    this.nonJobIncome = nonJobIncome;
  }


  public W8ImyFormDataModel deductions(Double deductions) {
    this.deductions = deductions;
    return this;
  }

  /**
   * The amount of deductions claimed.
   * @return deductions
   */
  @javax.annotation.Nullable
  public Double getDeductions() {
    return deductions;
  }

  public void setDeductions(Double deductions) {
    this.deductions = deductions;
  }


  public W8ImyFormDataModel box6AdditionalWithheld(Double box6AdditionalWithheld) {
    this.box6AdditionalWithheld = box6AdditionalWithheld;
    return this;
  }

  /**
   * The additional amount withheld.
   * @return box6AdditionalWithheld
   */
  @javax.annotation.Nullable
  public Double getBox6AdditionalWithheld() {
    return box6AdditionalWithheld;
  }

  public void setBox6AdditionalWithheld(Double box6AdditionalWithheld) {
    this.box6AdditionalWithheld = box6AdditionalWithheld;
  }


  public W8ImyFormDataModel box7ExemptFromWithholding(Boolean box7ExemptFromWithholding) {
    this.box7ExemptFromWithholding = box7ExemptFromWithholding;
    return this;
  }

  /**
   * Indicates whether the employee is exempt from withholding.
   * @return box7ExemptFromWithholding
   */
  @javax.annotation.Nullable
  public Boolean getBox7ExemptFromWithholding() {
    return box7ExemptFromWithholding;
  }

  public void setBox7ExemptFromWithholding(Boolean box7ExemptFromWithholding) {
    this.box7ExemptFromWithholding = box7ExemptFromWithholding;
  }


  public W8ImyFormDataModel officeCode(String officeCode) {
    this.officeCode = officeCode;
    return this;
  }

  /**
   * The office code associated with the form.
   * @return officeCode
   */
  @javax.annotation.Nullable
  public String getOfficeCode() {
    return officeCode;
  }

  public void setOfficeCode(String officeCode) {
    this.officeCode = officeCode;
  }


  public W8ImyFormDataModel ftinNotRequired(Boolean ftinNotRequired) {
    this.ftinNotRequired = ftinNotRequired;
    return this;
  }

  /**
   * Indicates whether a foreign TIN is not required.
   * @return ftinNotRequired
   */
  @javax.annotation.Nullable
  public Boolean getFtinNotRequired() {
    return ftinNotRequired;
  }

  public void setFtinNotRequired(Boolean ftinNotRequired) {
    this.ftinNotRequired = ftinNotRequired;
  }


  public W8ImyFormDataModel benefitLimitation(String benefitLimitation) {
    this.benefitLimitation = benefitLimitation;
    return this;
  }

  /**
   * The benefit limitation for tax treaty claims.
   * @return benefitLimitation
   */
  @javax.annotation.Nullable
  public String getBenefitLimitation() {
    return benefitLimitation;
  }

  public void setBenefitLimitation(String benefitLimitation) {
    this.benefitLimitation = benefitLimitation;
  }


  public W8ImyFormDataModel part4SponsoringEntity(String part4SponsoringEntity) {
    this.part4SponsoringEntity = part4SponsoringEntity;
    return this;
  }

  /**
   * The sponsoring entity information for Part 4.
   * @return part4SponsoringEntity
   */
  @javax.annotation.Nullable
  public String getPart4SponsoringEntity() {
    return part4SponsoringEntity;
  }

  public void setPart4SponsoringEntity(String part4SponsoringEntity) {
    this.part4SponsoringEntity = part4SponsoringEntity;
  }


  public W8ImyFormDataModel part4SponsoringEntityGiin(String part4SponsoringEntityGiin) {
    this.part4SponsoringEntityGiin = part4SponsoringEntityGiin;
    return this;
  }

  /**
   * The GIIN for the sponsoring entity in Part 4.
   * @return part4SponsoringEntityGiin
   */
  @javax.annotation.Nullable
  public String getPart4SponsoringEntityGiin() {
    return part4SponsoringEntityGiin;
  }

  public void setPart4SponsoringEntityGiin(String part4SponsoringEntityGiin) {
    this.part4SponsoringEntityGiin = part4SponsoringEntityGiin;
  }


  public W8ImyFormDataModel part7SponsoringEntity(String part7SponsoringEntity) {
    this.part7SponsoringEntity = part7SponsoringEntity;
    return this;
  }

  /**
   * The sponsoring entity information for Part 7.
   * @return part7SponsoringEntity
   */
  @javax.annotation.Nullable
  public String getPart7SponsoringEntity() {
    return part7SponsoringEntity;
  }

  public void setPart7SponsoringEntity(String part7SponsoringEntity) {
    this.part7SponsoringEntity = part7SponsoringEntity;
  }


  public W8ImyFormDataModel part12IgaCountry(String part12IgaCountry) {
    this.part12IgaCountry = part12IgaCountry;
    return this;
  }

  /**
   * The IGA country information for Part 12.
   * @return part12IgaCountry
   */
  @javax.annotation.Nullable
  public String getPart12IgaCountry() {
    return part12IgaCountry;
  }

  public void setPart12IgaCountry(String part12IgaCountry) {
    this.part12IgaCountry = part12IgaCountry;
  }


  public W8ImyFormDataModel part12IgaType(String part12IgaType) {
    this.part12IgaType = part12IgaType;
    return this;
  }

  /**
   * The IGA type information for Part 12.
   * @return part12IgaType
   */
  @javax.annotation.Nullable
  public String getPart12IgaType() {
    return part12IgaType;
  }

  public void setPart12IgaType(String part12IgaType) {
    this.part12IgaType = part12IgaType;
  }


  public W8ImyFormDataModel part12FatcaStatusUnderIgaAnnexIi(String part12FatcaStatusUnderIgaAnnexIi) {
    this.part12FatcaStatusUnderIgaAnnexIi = part12FatcaStatusUnderIgaAnnexIi;
    return this;
  }

  /**
   * The FATCA status under IGA Annex II for Part 12.
   * @return part12FatcaStatusUnderIgaAnnexIi
   */
  @javax.annotation.Nullable
  public String getPart12FatcaStatusUnderIgaAnnexIi() {
    return part12FatcaStatusUnderIgaAnnexIi;
  }

  public void setPart12FatcaStatusUnderIgaAnnexIi(String part12FatcaStatusUnderIgaAnnexIi) {
    this.part12FatcaStatusUnderIgaAnnexIi = part12FatcaStatusUnderIgaAnnexIi;
  }


  public W8ImyFormDataModel part12TrusteeName(String part12TrusteeName) {
    this.part12TrusteeName = part12TrusteeName;
    return this;
  }

  /**
   * The trustee name for Part 12.
   * @return part12TrusteeName
   */
  @javax.annotation.Nullable
  public String getPart12TrusteeName() {
    return part12TrusteeName;
  }

  public void setPart12TrusteeName(String part12TrusteeName) {
    this.part12TrusteeName = part12TrusteeName;
  }


  public W8ImyFormDataModel part12TrusteeIsForeign(Boolean part12TrusteeIsForeign) {
    this.part12TrusteeIsForeign = part12TrusteeIsForeign;
    return this;
  }

  /**
   * Indicates whether the trustee is foreign for Part 12.
   * @return part12TrusteeIsForeign
   */
  @javax.annotation.Nullable
  public Boolean getPart12TrusteeIsForeign() {
    return part12TrusteeIsForeign;
  }

  public void setPart12TrusteeIsForeign(Boolean part12TrusteeIsForeign) {
    this.part12TrusteeIsForeign = part12TrusteeIsForeign;
  }


  public W8ImyFormDataModel part12Model2IgaGiin(String part12Model2IgaGiin) {
    this.part12Model2IgaGiin = part12Model2IgaGiin;
    return this;
  }

  /**
   * The GIIN for Model 2 IGA in Part 12.
   * @return part12Model2IgaGiin
   */
  @javax.annotation.Nullable
  public String getPart12Model2IgaGiin() {
    return part12Model2IgaGiin;
  }

  public void setPart12Model2IgaGiin(String part12Model2IgaGiin) {
    this.part12Model2IgaGiin = part12Model2IgaGiin;
  }


  public W8ImyFormDataModel box37AExchange(String box37AExchange) {
    this.box37AExchange = box37AExchange;
    return this;
  }

  /**
   * The exchange information for Box 37A.
   * @return box37AExchange
   */
  @javax.annotation.Nullable
  public String getBox37AExchange() {
    return box37AExchange;
  }

  public void setBox37AExchange(String box37AExchange) {
    this.box37AExchange = box37AExchange;
  }


  public W8ImyFormDataModel box37BExchange(String box37BExchange) {
    this.box37BExchange = box37BExchange;
    return this;
  }

  /**
   * The exchange information for Box 37B.
   * @return box37BExchange
   */
  @javax.annotation.Nullable
  public String getBox37BExchange() {
    return box37BExchange;
  }

  public void setBox37BExchange(String box37BExchange) {
    this.box37BExchange = box37BExchange;
  }


  public W8ImyFormDataModel box37BEntity(String box37BEntity) {
    this.box37BEntity = box37BEntity;
    return this;
  }

  /**
   * The entity information for Box 37B.
   * @return box37BEntity
   */
  @javax.annotation.Nullable
  public String getBox37BEntity() {
    return box37BEntity;
  }

  public void setBox37BEntity(String box37BEntity) {
    this.box37BEntity = box37BEntity;
  }


  public W8ImyFormDataModel part28SponsoringEntity(String part28SponsoringEntity) {
    this.part28SponsoringEntity = part28SponsoringEntity;
    return this;
  }

  /**
   * The sponsoring entity information for Part 28.
   * @return part28SponsoringEntity
   */
  @javax.annotation.Nullable
  public String getPart28SponsoringEntity() {
    return part28SponsoringEntity;
  }

  public void setPart28SponsoringEntity(String part28SponsoringEntity) {
    this.part28SponsoringEntity = part28SponsoringEntity;
  }


  public W8ImyFormDataModel part28SponsoringEntityGiin(String part28SponsoringEntityGiin) {
    this.part28SponsoringEntityGiin = part28SponsoringEntityGiin;
    return this;
  }

  /**
   * The GIIN for the sponsoring entity in Part 28.
   * @return part28SponsoringEntityGiin
   */
  @javax.annotation.Nullable
  public String getPart28SponsoringEntityGiin() {
    return part28SponsoringEntityGiin;
  }

  public void setPart28SponsoringEntityGiin(String part28SponsoringEntityGiin) {
    this.part28SponsoringEntityGiin = part28SponsoringEntityGiin;
  }


  public W8ImyFormDataModel makingTreatyClaim(Boolean makingTreatyClaim) {
    this.makingTreatyClaim = makingTreatyClaim;
    return this;
  }

  /**
   * Get makingTreatyClaim
   * @return makingTreatyClaim
   */
  @javax.annotation.Nullable
  public Boolean getMakingTreatyClaim() {
    return makingTreatyClaim;
  }

  public void setMakingTreatyClaim(Boolean makingTreatyClaim) {
    this.makingTreatyClaim = makingTreatyClaim;
  }


  public W8ImyFormDataModel treatyCountry(String treatyCountry) {
    this.treatyCountry = treatyCountry;
    return this;
  }

  /**
   * The country for which the treaty applies.
   * @return treatyCountry
   */
  @javax.annotation.Nullable
  public String getTreatyCountry() {
    return treatyCountry;
  }

  public void setTreatyCountry(String treatyCountry) {
    this.treatyCountry = treatyCountry;
  }


  public W8ImyFormDataModel treatyArticle(String treatyArticle) {
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


  public W8ImyFormDataModel withholdingRate(String withholdingRate) {
    this.withholdingRate = withholdingRate;
    return this;
  }

  /**
   * The withholding rate applied as per the treaty.
   * @return withholdingRate
   */
  @javax.annotation.Nullable
  public String getWithholdingRate() {
    return withholdingRate;
  }

  public void setWithholdingRate(String withholdingRate) {
    this.withholdingRate = withholdingRate;
  }


  public W8ImyFormDataModel incomeType(String incomeType) {
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


  public W8ImyFormDataModel treatyReasons(String treatyReasons) {
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


  public W8ImyFormDataModel certifyBox14A(Boolean certifyBox14A) {
    this.certifyBox14A = certifyBox14A;
    return this;
  }

  /**
   * Get certifyBox14A
   * @return certifyBox14A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox14A() {
    return certifyBox14A;
  }

  public void setCertifyBox14A(Boolean certifyBox14A) {
    this.certifyBox14A = certifyBox14A;
  }


  public W8ImyFormDataModel certifyBox14B(Boolean certifyBox14B) {
    this.certifyBox14B = certifyBox14B;
    return this;
  }

  /**
   * Get certifyBox14B
   * @return certifyBox14B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox14B() {
    return certifyBox14B;
  }

  public void setCertifyBox14B(Boolean certifyBox14B) {
    this.certifyBox14B = certifyBox14B;
  }


  public W8ImyFormDataModel certifyBox14C(Boolean certifyBox14C) {
    this.certifyBox14C = certifyBox14C;
    return this;
  }

  /**
   * Get certifyBox14C
   * @return certifyBox14C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox14C() {
    return certifyBox14C;
  }

  public void setCertifyBox14C(Boolean certifyBox14C) {
    this.certifyBox14C = certifyBox14C;
  }


  public W8ImyFormDataModel certifyBox171(Boolean certifyBox171) {
    this.certifyBox171 = certifyBox171;
    return this;
  }

  /**
   * Get certifyBox171
   * @return certifyBox171
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox171() {
    return certifyBox171;
  }

  public void setCertifyBox171(Boolean certifyBox171) {
    this.certifyBox171 = certifyBox171;
  }


  public W8ImyFormDataModel certifyBox172(Boolean certifyBox172) {
    this.certifyBox172 = certifyBox172;
    return this;
  }

  /**
   * Get certifyBox172
   * @return certifyBox172
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox172() {
    return certifyBox172;
  }

  public void setCertifyBox172(Boolean certifyBox172) {
    this.certifyBox172 = certifyBox172;
  }


  public W8ImyFormDataModel certifyBox18(Boolean certifyBox18) {
    this.certifyBox18 = certifyBox18;
    return this;
  }

  /**
   * Get certifyBox18
   * @return certifyBox18
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox18() {
    return certifyBox18;
  }

  public void setCertifyBox18(Boolean certifyBox18) {
    this.certifyBox18 = certifyBox18;
  }


  public W8ImyFormDataModel certifyBox19(Boolean certifyBox19) {
    this.certifyBox19 = certifyBox19;
    return this;
  }

  /**
   * Get certifyBox19
   * @return certifyBox19
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox19() {
    return certifyBox19;
  }

  public void setCertifyBox19(Boolean certifyBox19) {
    this.certifyBox19 = certifyBox19;
  }


  public W8ImyFormDataModel certifyBox21(Boolean certifyBox21) {
    this.certifyBox21 = certifyBox21;
    return this;
  }

  /**
   * Get certifyBox21
   * @return certifyBox21
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox21() {
    return certifyBox21;
  }

  public void setCertifyBox21(Boolean certifyBox21) {
    this.certifyBox21 = certifyBox21;
  }


  public W8ImyFormDataModel certifyBox23(Boolean certifyBox23) {
    this.certifyBox23 = certifyBox23;
    return this;
  }

  /**
   * Get certifyBox23
   * @return certifyBox23
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox23() {
    return certifyBox23;
  }

  public void setCertifyBox23(Boolean certifyBox23) {
    this.certifyBox23 = certifyBox23;
  }


  public W8ImyFormDataModel certifyBox24D(Boolean certifyBox24D) {
    this.certifyBox24D = certifyBox24D;
    return this;
  }

  /**
   * Get certifyBox24D
   * @return certifyBox24D
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox24D() {
    return certifyBox24D;
  }

  public void setCertifyBox24D(Boolean certifyBox24D) {
    this.certifyBox24D = certifyBox24D;
  }


  public W8ImyFormDataModel certifyBox25A(Boolean certifyBox25A) {
    this.certifyBox25A = certifyBox25A;
    return this;
  }

  /**
   * Get certifyBox25A
   * @return certifyBox25A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox25A() {
    return certifyBox25A;
  }

  public void setCertifyBox25A(Boolean certifyBox25A) {
    this.certifyBox25A = certifyBox25A;
  }


  public W8ImyFormDataModel certifyBox25B(Boolean certifyBox25B) {
    this.certifyBox25B = certifyBox25B;
    return this;
  }

  /**
   * Get certifyBox25B
   * @return certifyBox25B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox25B() {
    return certifyBox25B;
  }

  public void setCertifyBox25B(Boolean certifyBox25B) {
    this.certifyBox25B = certifyBox25B;
  }


  public W8ImyFormDataModel certifyBox25C(Boolean certifyBox25C) {
    this.certifyBox25C = certifyBox25C;
    return this;
  }

  /**
   * Get certifyBox25C
   * @return certifyBox25C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox25C() {
    return certifyBox25C;
  }

  public void setCertifyBox25C(Boolean certifyBox25C) {
    this.certifyBox25C = certifyBox25C;
  }


  public W8ImyFormDataModel certifyBox27(Boolean certifyBox27) {
    this.certifyBox27 = certifyBox27;
    return this;
  }

  /**
   * Get certifyBox27
   * @return certifyBox27
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox27() {
    return certifyBox27;
  }

  public void setCertifyBox27(Boolean certifyBox27) {
    this.certifyBox27 = certifyBox27;
  }


  public W8ImyFormDataModel certifyBox28A(Boolean certifyBox28A) {
    this.certifyBox28A = certifyBox28A;
    return this;
  }

  /**
   * Get certifyBox28A
   * @return certifyBox28A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox28A() {
    return certifyBox28A;
  }

  public void setCertifyBox28A(Boolean certifyBox28A) {
    this.certifyBox28A = certifyBox28A;
  }


  public W8ImyFormDataModel certifyBox28B(Boolean certifyBox28B) {
    this.certifyBox28B = certifyBox28B;
    return this;
  }

  /**
   * Get certifyBox28B
   * @return certifyBox28B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox28B() {
    return certifyBox28B;
  }

  public void setCertifyBox28B(Boolean certifyBox28B) {
    this.certifyBox28B = certifyBox28B;
  }


  public W8ImyFormDataModel certifyBox29A(Boolean certifyBox29A) {
    this.certifyBox29A = certifyBox29A;
    return this;
  }

  /**
   * Get certifyBox29A
   * @return certifyBox29A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox29A() {
    return certifyBox29A;
  }

  public void setCertifyBox29A(Boolean certifyBox29A) {
    this.certifyBox29A = certifyBox29A;
  }


  public W8ImyFormDataModel certifyBox29B(Boolean certifyBox29B) {
    this.certifyBox29B = certifyBox29B;
    return this;
  }

  /**
   * Get certifyBox29B
   * @return certifyBox29B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox29B() {
    return certifyBox29B;
  }

  public void setCertifyBox29B(Boolean certifyBox29B) {
    this.certifyBox29B = certifyBox29B;
  }


  public W8ImyFormDataModel certifyBox29C(Boolean certifyBox29C) {
    this.certifyBox29C = certifyBox29C;
    return this;
  }

  /**
   * Get certifyBox29C
   * @return certifyBox29C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox29C() {
    return certifyBox29C;
  }

  public void setCertifyBox29C(Boolean certifyBox29C) {
    this.certifyBox29C = certifyBox29C;
  }


  public W8ImyFormDataModel certifyBox29D(Boolean certifyBox29D) {
    this.certifyBox29D = certifyBox29D;
    return this;
  }

  /**
   * Get certifyBox29D
   * @return certifyBox29D
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox29D() {
    return certifyBox29D;
  }

  public void setCertifyBox29D(Boolean certifyBox29D) {
    this.certifyBox29D = certifyBox29D;
  }


  public W8ImyFormDataModel certifyBox29E(Boolean certifyBox29E) {
    this.certifyBox29E = certifyBox29E;
    return this;
  }

  /**
   * Get certifyBox29E
   * @return certifyBox29E
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox29E() {
    return certifyBox29E;
  }

  public void setCertifyBox29E(Boolean certifyBox29E) {
    this.certifyBox29E = certifyBox29E;
  }


  public W8ImyFormDataModel certifyBox29F(Boolean certifyBox29F) {
    this.certifyBox29F = certifyBox29F;
    return this;
  }

  /**
   * Get certifyBox29F
   * @return certifyBox29F
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox29F() {
    return certifyBox29F;
  }

  public void setCertifyBox29F(Boolean certifyBox29F) {
    this.certifyBox29F = certifyBox29F;
  }


  public W8ImyFormDataModel certifyBox30(Boolean certifyBox30) {
    this.certifyBox30 = certifyBox30;
    return this;
  }

  /**
   * Get certifyBox30
   * @return certifyBox30
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox30() {
    return certifyBox30;
  }

  public void setCertifyBox30(Boolean certifyBox30) {
    this.certifyBox30 = certifyBox30;
  }


  public W8ImyFormDataModel certifyBox33(Boolean certifyBox33) {
    this.certifyBox33 = certifyBox33;
    return this;
  }

  /**
   * Get certifyBox33
   * @return certifyBox33
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox33() {
    return certifyBox33;
  }

  public void setCertifyBox33(Boolean certifyBox33) {
    this.certifyBox33 = certifyBox33;
  }


  public W8ImyFormDataModel certifyBox40A(Boolean certifyBox40A) {
    this.certifyBox40A = certifyBox40A;
    return this;
  }

  /**
   * Get certifyBox40A
   * @return certifyBox40A
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox40A() {
    return certifyBox40A;
  }

  public void setCertifyBox40A(Boolean certifyBox40A) {
    this.certifyBox40A = certifyBox40A;
  }


  public W8ImyFormDataModel certifyBox40B(Boolean certifyBox40B) {
    this.certifyBox40B = certifyBox40B;
    return this;
  }

  /**
   * Get certifyBox40B
   * @return certifyBox40B
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox40B() {
    return certifyBox40B;
  }

  public void setCertifyBox40B(Boolean certifyBox40B) {
    this.certifyBox40B = certifyBox40B;
  }


  public W8ImyFormDataModel certifyBox40C(Boolean certifyBox40C) {
    this.certifyBox40C = certifyBox40C;
    return this;
  }

  /**
   * Get certifyBox40C
   * @return certifyBox40C
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox40C() {
    return certifyBox40C;
  }

  public void setCertifyBox40C(Boolean certifyBox40C) {
    this.certifyBox40C = certifyBox40C;
  }


  public W8ImyFormDataModel certifyBox41(Boolean certifyBox41) {
    this.certifyBox41 = certifyBox41;
    return this;
  }

  /**
   * Get certifyBox41
   * @return certifyBox41
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox41() {
    return certifyBox41;
  }

  public void setCertifyBox41(Boolean certifyBox41) {
    this.certifyBox41 = certifyBox41;
  }


  public W8ImyFormDataModel certifyBox43(Boolean certifyBox43) {
    this.certifyBox43 = certifyBox43;
    return this;
  }

  /**
   * Get certifyBox43
   * @return certifyBox43
   */
  @javax.annotation.Nullable
  public Boolean getCertifyBox43() {
    return certifyBox43;
  }

  public void setCertifyBox43(Boolean certifyBox43) {
    this.certifyBox43 = certifyBox43;
  }


  public W8ImyFormDataModel certifyPart29Signature(Boolean certifyPart29Signature) {
    this.certifyPart29Signature = certifyPart29Signature;
    return this;
  }

  /**
   * Get certifyPart29Signature
   * @return certifyPart29Signature
   */
  @javax.annotation.Nullable
  public Boolean getCertifyPart29Signature() {
    return certifyPart29Signature;
  }

  public void setCertifyPart29Signature(Boolean certifyPart29Signature) {
    this.certifyPart29Signature = certifyPart29Signature;
  }


  public W8ImyFormDataModel part19FormationOrResolutionDate(OffsetDateTime part19FormationOrResolutionDate) {
    this.part19FormationOrResolutionDate = part19FormationOrResolutionDate;
    return this;
  }

  /**
   * Get part19FormationOrResolutionDate
   * @return part19FormationOrResolutionDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getPart19FormationOrResolutionDate() {
    return part19FormationOrResolutionDate;
  }

  public void setPart19FormationOrResolutionDate(OffsetDateTime part19FormationOrResolutionDate) {
    this.part19FormationOrResolutionDate = part19FormationOrResolutionDate;
  }


  public W8ImyFormDataModel part20FilingDate(OffsetDateTime part20FilingDate) {
    this.part20FilingDate = part20FilingDate;
    return this;
  }

  /**
   * Get part20FilingDate
   * @return part20FilingDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getPart20FilingDate() {
    return part20FilingDate;
  }

  public void setPart20FilingDate(OffsetDateTime part20FilingDate) {
    this.part20FilingDate = part20FilingDate;
  }


  public W8ImyFormDataModel part21DeterminationDate(OffsetDateTime part21DeterminationDate) {
    this.part21DeterminationDate = part21DeterminationDate;
    return this;
  }

  /**
   * Get part21DeterminationDate
   * @return part21DeterminationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getPart21DeterminationDate() {
    return part21DeterminationDate;
  }

  public void setPart21DeterminationDate(OffsetDateTime part21DeterminationDate) {
    this.part21DeterminationDate = part21DeterminationDate;
  }


  public W8ImyFormDataModel substantialUsOwners(List<W8BenESubstantialUsOwnerDataModel> substantialUsOwners) {
    this.substantialUsOwners = substantialUsOwners;
    return this;
  }

  public W8ImyFormDataModel addSubstantialUsOwnersItem(W8BenESubstantialUsOwnerDataModel substantialUsOwnersItem) {
    if (this.substantialUsOwners == null) {
      this.substantialUsOwners = new ArrayList<>();
    }
    this.substantialUsOwners.add(substantialUsOwnersItem);
    return this;
  }

  /**
   * Get substantialUsOwners
   * @return substantialUsOwners
   */
  @javax.annotation.Nullable
  public List<W8BenESubstantialUsOwnerDataModel> getSubstantialUsOwners() {
    return substantialUsOwners;
  }

  public void setSubstantialUsOwners(List<W8BenESubstantialUsOwnerDataModel> substantialUsOwners) {
    this.substantialUsOwners = substantialUsOwners;
  }


  public W8ImyFormDataModel birthday(String birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * The birthday of the individual associated with the form.
   * @return birthday
   */
  @javax.annotation.Nullable
  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public W8ImyFormDataModel foreignTinNotRequired(Boolean foreignTinNotRequired) {
    this.foreignTinNotRequired = foreignTinNotRequired;
    return this;
  }

  /**
   * Indicates whether a foreign TIN is not required.
   * @return foreignTinNotRequired
   */
  @javax.annotation.Nullable
  public Boolean getForeignTinNotRequired() {
    return foreignTinNotRequired;
  }

  public void setForeignTinNotRequired(Boolean foreignTinNotRequired) {
    this.foreignTinNotRequired = foreignTinNotRequired;
  }


  public W8ImyFormDataModel archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Indicates whether the form is archived.
   * @return archived
   */
  @javax.annotation.Nullable
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  public W8ImyFormDataModel referenceId(String referenceId) {
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


  public W8ImyFormDataModel companyId(Integer companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The ID of the associated company.
   * @return companyId
   */
  @javax.annotation.Nullable
  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public W8ImyFormDataModel signerCapacity(String signerCapacity) {
    this.signerCapacity = signerCapacity;
    return this;
  }

  /**
   * The capacity in which the signer is signing the form.
   * @return signerCapacity
   */
  @javax.annotation.Nullable
  public String getSignerCapacity() {
    return signerCapacity;
  }

  public void setSignerCapacity(String signerCapacity) {
    this.signerCapacity = signerCapacity;
  }


  public W8ImyFormDataModel tinMatchStatus(String tinMatchStatus) {
    this.tinMatchStatus = tinMatchStatus;
    return this;
  }

  /**
   * The status of the TIN match.
   * @return tinMatchStatus
   */
  @javax.annotation.Nullable
  public String getTinMatchStatus() {
    return tinMatchStatus;
  }

  public void setTinMatchStatus(String tinMatchStatus) {
    this.tinMatchStatus = tinMatchStatus;
  }


  public W8ImyFormDataModel signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * The signature itself
   * @return signature
   */
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  public W8ImyFormDataModel businessClassification(String businessClassification) {
    this.businessClassification = businessClassification;
    return this;
  }

  /**
   * The classification of the business.
   * @return businessClassification
   */
  @javax.annotation.Nullable
  public String getBusinessClassification() {
    return businessClassification;
  }

  public void setBusinessClassification(String businessClassification) {
    this.businessClassification = businessClassification;
  }


  public W8ImyFormDataModel businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  /**
   * The name of the business associated with the form.
   * @return businessName
   */
  @javax.annotation.Nullable
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public W8ImyFormDataModel businessOther(String businessOther) {
    this.businessOther = businessOther;
    return this;
  }

  /**
   * Get businessOther
   * @return businessOther
   */
  @javax.annotation.Nullable
  public String getBusinessOther() {
    return businessOther;
  }

  public void setBusinessOther(String businessOther) {
    this.businessOther = businessOther;
  }


  public W8ImyFormDataModel exemptPayeeCode(String exemptPayeeCode) {
    this.exemptPayeeCode = exemptPayeeCode;
    return this;
  }

  /**
   * Get exemptPayeeCode
   * @return exemptPayeeCode
   */
  @javax.annotation.Nullable
  public String getExemptPayeeCode() {
    return exemptPayeeCode;
  }

  public void setExemptPayeeCode(String exemptPayeeCode) {
    this.exemptPayeeCode = exemptPayeeCode;
  }


  public W8ImyFormDataModel exemptFatcaCode(String exemptFatcaCode) {
    this.exemptFatcaCode = exemptFatcaCode;
    return this;
  }

  /**
   * Get exemptFatcaCode
   * @return exemptFatcaCode
   */
  @javax.annotation.Nullable
  public String getExemptFatcaCode() {
    return exemptFatcaCode;
  }

  public void setExemptFatcaCode(String exemptFatcaCode) {
    this.exemptFatcaCode = exemptFatcaCode;
  }


  public W8ImyFormDataModel accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number associated with the form.
   * @return accountNumber
   */
  @javax.annotation.Nullable
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public W8ImyFormDataModel foreignCountryIndicator(Boolean foreignCountryIndicator) {
    this.foreignCountryIndicator = foreignCountryIndicator;
    return this;
  }

  /**
   * Indicates whether the individual or entity is in a foreign country.
   * @return foreignCountryIndicator
   */
  @javax.annotation.Nullable
  public Boolean getForeignCountryIndicator() {
    return foreignCountryIndicator;
  }

  public void setForeignCountryIndicator(Boolean foreignCountryIndicator) {
    this.foreignCountryIndicator = foreignCountryIndicator;
  }


  public W8ImyFormDataModel foreignAddress(String foreignAddress) {
    this.foreignAddress = foreignAddress;
    return this;
  }

  /**
   * The foreign address of the individual or entity.
   * @return foreignAddress
   */
  @javax.annotation.Nullable
  public String getForeignAddress() {
    return foreignAddress;
  }

  public void setForeignAddress(String foreignAddress) {
    this.foreignAddress = foreignAddress;
  }


  public W8ImyFormDataModel backupWithholding(Boolean backupWithholding) {
    this.backupWithholding = backupWithholding;
    return this;
  }

  /**
   * Indicates whether backup withholding applies.
   * @return backupWithholding
   */
  @javax.annotation.Nullable
  public Boolean getBackupWithholding() {
    return backupWithholding;
  }

  public void setBackupWithholding(Boolean backupWithholding) {
    this.backupWithholding = backupWithholding;
  }


  public W8ImyFormDataModel is1099able(Boolean is1099able) {
    this.is1099able = is1099able;
    return this;
  }

  /**
   * Get is1099able
   * @return is1099able
   */
  @javax.annotation.Nullable
  public Boolean getIs1099able() {
    return is1099able;
  }

  public void setIs1099able(Boolean is1099able) {
    this.is1099able = is1099able;
  }


  public W8ImyFormDataModel foreignPartnerOwnerOrBeneficiary(Boolean foreignPartnerOwnerOrBeneficiary) {
    this.foreignPartnerOwnerOrBeneficiary = foreignPartnerOwnerOrBeneficiary;
    return this;
  }

  /**
   * Indicates whether the individual is a foreign partner, owner, or beneficiary.
   * @return foreignPartnerOwnerOrBeneficiary
   */
  @javax.annotation.Nullable
  public Boolean getForeignPartnerOwnerOrBeneficiary() {
    return foreignPartnerOwnerOrBeneficiary;
  }

  public void setForeignPartnerOwnerOrBeneficiary(Boolean foreignPartnerOwnerOrBeneficiary) {
    this.foreignPartnerOwnerOrBeneficiary = foreignPartnerOwnerOrBeneficiary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W8ImyFormDataModel w8ImyFormDataModel = (W8ImyFormDataModel) o;
    return Objects.equals(this.type, w8ImyFormDataModel.type) &&
        Objects.equals(this.signedDate, w8ImyFormDataModel.signedDate) &&
        Objects.equals(this.disregardedEntityChapter4FatcaStatus, w8ImyFormDataModel.disregardedEntityChapter4FatcaStatus) &&
        Objects.equals(this.createdAt, w8ImyFormDataModel.createdAt) &&
        Objects.equals(this.updatedAt, w8ImyFormDataModel.updatedAt) &&
        Objects.equals(this.displayName, w8ImyFormDataModel.displayName) &&
        Objects.equals(this.email, w8ImyFormDataModel.email) &&
        Objects.equals(this.tin, w8ImyFormDataModel.tin) &&
        Objects.equals(this.typeOfTin, w8ImyFormDataModel.typeOfTin) &&
        Objects.equals(this.name, w8ImyFormDataModel.name) &&
        Objects.equals(this.citizenshipCountry, w8ImyFormDataModel.citizenshipCountry) &&
        Objects.equals(this.chapter3EntityType, w8ImyFormDataModel.chapter3EntityType) &&
        Objects.equals(this.chapter4FatcaStatus, w8ImyFormDataModel.chapter4FatcaStatus) &&
        Objects.equals(this.residenceAddress, w8ImyFormDataModel.residenceAddress) &&
        Objects.equals(this.residenceCity, w8ImyFormDataModel.residenceCity) &&
        Objects.equals(this.residenceState, w8ImyFormDataModel.residenceState) &&
        Objects.equals(this.residencePostalCode, w8ImyFormDataModel.residencePostalCode) &&
        Objects.equals(this.residenceCountry, w8ImyFormDataModel.residenceCountry) &&
        Objects.equals(this.residenceIsMailing, w8ImyFormDataModel.residenceIsMailing) &&
        Objects.equals(this.mailingAddress, w8ImyFormDataModel.mailingAddress) &&
        Objects.equals(this.mailingCity, w8ImyFormDataModel.mailingCity) &&
        Objects.equals(this.mailingState, w8ImyFormDataModel.mailingState) &&
        Objects.equals(this.mailingPostalCode, w8ImyFormDataModel.mailingPostalCode) &&
        Objects.equals(this.mailingCountry, w8ImyFormDataModel.mailingCountry) &&
        Objects.equals(this.disregardedEntity, w8ImyFormDataModel.disregardedEntity) &&
        Objects.equals(this.disregardedAddress, w8ImyFormDataModel.disregardedAddress) &&
        Objects.equals(this.disregardedCity, w8ImyFormDataModel.disregardedCity) &&
        Objects.equals(this.disregardedState, w8ImyFormDataModel.disregardedState) &&
        Objects.equals(this.disregardedPostalCode, w8ImyFormDataModel.disregardedPostalCode) &&
        Objects.equals(this.disregardedCountry, w8ImyFormDataModel.disregardedCountry) &&
        Objects.equals(this.disregardedEntityGiin, w8ImyFormDataModel.disregardedEntityGiin) &&
        Objects.equals(this.ein, w8ImyFormDataModel.ein) &&
        Objects.equals(this.einType, w8ImyFormDataModel.einType) &&
        Objects.equals(this.giin, w8ImyFormDataModel.giin) &&
        Objects.equals(this.foreignTin, w8ImyFormDataModel.foreignTin) &&
        Objects.equals(this.referenceNumber, w8ImyFormDataModel.referenceNumber) &&
        Objects.equals(this.certifyBox14, w8ImyFormDataModel.certifyBox14) &&
        Objects.equals(this.certifyBox15A, w8ImyFormDataModel.certifyBox15A) &&
        Objects.equals(this.certifyBox15B, w8ImyFormDataModel.certifyBox15B) &&
        Objects.equals(this.certifyBox15C, w8ImyFormDataModel.certifyBox15C) &&
        Objects.equals(this.certifyBox15D, w8ImyFormDataModel.certifyBox15D) &&
        Objects.equals(this.certifyBox15E, w8ImyFormDataModel.certifyBox15E) &&
        Objects.equals(this.certifyBox15F, w8ImyFormDataModel.certifyBox15F) &&
        Objects.equals(this.certifyBox15G, w8ImyFormDataModel.certifyBox15G) &&
        Objects.equals(this.certifyBox15H, w8ImyFormDataModel.certifyBox15H) &&
        Objects.equals(this.certifyBox15I, w8ImyFormDataModel.certifyBox15I) &&
        Objects.equals(this.certifyBox16A, w8ImyFormDataModel.certifyBox16A) &&
        Objects.equals(this.box16BQddCorporate, w8ImyFormDataModel.box16BQddCorporate) &&
        Objects.equals(this.box16BQddPartnership, w8ImyFormDataModel.box16BQddPartnership) &&
        Objects.equals(this.box16BQddDisregardedEntity, w8ImyFormDataModel.box16BQddDisregardedEntity) &&
        Objects.equals(this.certifyBox17A, w8ImyFormDataModel.certifyBox17A) &&
        Objects.equals(this.certifyBox17B, w8ImyFormDataModel.certifyBox17B) &&
        Objects.equals(this.certifyBox17C, w8ImyFormDataModel.certifyBox17C) &&
        Objects.equals(this.certifyBox17D, w8ImyFormDataModel.certifyBox17D) &&
        Objects.equals(this.certifyBox17E, w8ImyFormDataModel.certifyBox17E) &&
        Objects.equals(this.certifyBox18A, w8ImyFormDataModel.certifyBox18A) &&
        Objects.equals(this.certifyBox18B, w8ImyFormDataModel.certifyBox18B) &&
        Objects.equals(this.certifyBox18C, w8ImyFormDataModel.certifyBox18C) &&
        Objects.equals(this.certifyBox18D, w8ImyFormDataModel.certifyBox18D) &&
        Objects.equals(this.certifyBox18E, w8ImyFormDataModel.certifyBox18E) &&
        Objects.equals(this.certifyBox18F, w8ImyFormDataModel.certifyBox18F) &&
        Objects.equals(this.certifyBox19A, w8ImyFormDataModel.certifyBox19A) &&
        Objects.equals(this.certifyBox19B, w8ImyFormDataModel.certifyBox19B) &&
        Objects.equals(this.certifyBox19C, w8ImyFormDataModel.certifyBox19C) &&
        Objects.equals(this.certifyBox19D, w8ImyFormDataModel.certifyBox19D) &&
        Objects.equals(this.certifyBox19E, w8ImyFormDataModel.certifyBox19E) &&
        Objects.equals(this.certifyBox19F, w8ImyFormDataModel.certifyBox19F) &&
        Objects.equals(this.certifyBox20, w8ImyFormDataModel.certifyBox20) &&
        Objects.equals(this.certifyBox21A, w8ImyFormDataModel.certifyBox21A) &&
        Objects.equals(this.certifyBox21B, w8ImyFormDataModel.certifyBox21B) &&
        Objects.equals(this.certifyBox21C, w8ImyFormDataModel.certifyBox21C) &&
        Objects.equals(this.certifyBox21D, w8ImyFormDataModel.certifyBox21D) &&
        Objects.equals(this.certifyBox21E, w8ImyFormDataModel.certifyBox21E) &&
        Objects.equals(this.certifyBox21F, w8ImyFormDataModel.certifyBox21F) &&
        Objects.equals(this.certifyBox22, w8ImyFormDataModel.certifyBox22) &&
        Objects.equals(this.box23ANameSponsoringEntity, w8ImyFormDataModel.box23ANameSponsoringEntity) &&
        Objects.equals(this.certifyBox23B, w8ImyFormDataModel.certifyBox23B) &&
        Objects.equals(this.certifyBox23C, w8ImyFormDataModel.certifyBox23C) &&
        Objects.equals(this.certifyBox24A, w8ImyFormDataModel.certifyBox24A) &&
        Objects.equals(this.certifyBox24B, w8ImyFormDataModel.certifyBox24B) &&
        Objects.equals(this.certifyBox24C, w8ImyFormDataModel.certifyBox24C) &&
        Objects.equals(this.certifyBox25, w8ImyFormDataModel.certifyBox25) &&
        Objects.equals(this.certifyBox26, w8ImyFormDataModel.certifyBox26) &&
        Objects.equals(this.box27ANameSponsoringEntity, w8ImyFormDataModel.box27ANameSponsoringEntity) &&
        Objects.equals(this.certifyBox27B, w8ImyFormDataModel.certifyBox27B) &&
        Objects.equals(this.certifyBox28, w8ImyFormDataModel.certifyBox28) &&
        Objects.equals(this.certifyBox29, w8ImyFormDataModel.certifyBox29) &&
        Objects.equals(this.certifyBox30A, w8ImyFormDataModel.certifyBox30A) &&
        Objects.equals(this.certifyBox30B, w8ImyFormDataModel.certifyBox30B) &&
        Objects.equals(this.certifyBox30C, w8ImyFormDataModel.certifyBox30C) &&
        Objects.equals(this.certifyBox31, w8ImyFormDataModel.certifyBox31) &&
        Objects.equals(this.certifyBox32, w8ImyFormDataModel.certifyBox32) &&
        Objects.equals(this.box32IgaCountry, w8ImyFormDataModel.box32IgaCountry) &&
        Objects.equals(this.box32IgaType, w8ImyFormDataModel.box32IgaType) &&
        Objects.equals(this.box32IgaTreatedAs, w8ImyFormDataModel.box32IgaTreatedAs) &&
        Objects.equals(this.box32TrusteeOrSponsor, w8ImyFormDataModel.box32TrusteeOrSponsor) &&
        Objects.equals(this.box32TrusteeIsForeign, w8ImyFormDataModel.box32TrusteeIsForeign) &&
        Objects.equals(this.certifyBox33A, w8ImyFormDataModel.certifyBox33A) &&
        Objects.equals(this.certifyBox33B, w8ImyFormDataModel.certifyBox33B) &&
        Objects.equals(this.certifyBox33C, w8ImyFormDataModel.certifyBox33C) &&
        Objects.equals(this.certifyBox33D, w8ImyFormDataModel.certifyBox33D) &&
        Objects.equals(this.certifyBox33E, w8ImyFormDataModel.certifyBox33E) &&
        Objects.equals(this.certifyBox33F, w8ImyFormDataModel.certifyBox33F) &&
        Objects.equals(this.certifyBox34, w8ImyFormDataModel.certifyBox34) &&
        Objects.equals(this.certifyBox35, w8ImyFormDataModel.certifyBox35) &&
        Objects.equals(this.certifyBox36, w8ImyFormDataModel.certifyBox36) &&
        Objects.equals(this.certifyBox37A, w8ImyFormDataModel.certifyBox37A) &&
        Objects.equals(this.box37ASecuritiesMarket, w8ImyFormDataModel.box37ASecuritiesMarket) &&
        Objects.equals(this.certifyBox37B, w8ImyFormDataModel.certifyBox37B) &&
        Objects.equals(this.box37BNameOfEntity, w8ImyFormDataModel.box37BNameOfEntity) &&
        Objects.equals(this.box37BSecuritiesMarket, w8ImyFormDataModel.box37BSecuritiesMarket) &&
        Objects.equals(this.certifyBox38, w8ImyFormDataModel.certifyBox38) &&
        Objects.equals(this.certifyBox39, w8ImyFormDataModel.certifyBox39) &&
        Objects.equals(this.certifyBox40, w8ImyFormDataModel.certifyBox40) &&
        Objects.equals(this.box41SponsoringEntity, w8ImyFormDataModel.box41SponsoringEntity) &&
        Objects.equals(this.certifyBox42, w8ImyFormDataModel.certifyBox42) &&
        Objects.equals(this.signerName, w8ImyFormDataModel.signerName) &&
        Objects.equals(this.eDeliveryConsentedAt, w8ImyFormDataModel.eDeliveryConsentedAt) &&
        Objects.equals(this.box35FormedOnDate, w8ImyFormDataModel.box35FormedOnDate) &&
        Objects.equals(this.box36FiledOnDate, w8ImyFormDataModel.box36FiledOnDate) &&
        Objects.equals(this.employeeFirstName, w8ImyFormDataModel.employeeFirstName) &&
        Objects.equals(this.employeeMiddleName, w8ImyFormDataModel.employeeMiddleName) &&
        Objects.equals(this.employeeLastName, w8ImyFormDataModel.employeeLastName) &&
        Objects.equals(this.employeeNameSuffix, w8ImyFormDataModel.employeeNameSuffix) &&
        Objects.equals(this.address, w8ImyFormDataModel.address) &&
        Objects.equals(this.city, w8ImyFormDataModel.city) &&
        Objects.equals(this.state, w8ImyFormDataModel.state) &&
        Objects.equals(this.zip, w8ImyFormDataModel.zip) &&
        Objects.equals(this.box3MaritalStatus, w8ImyFormDataModel.box3MaritalStatus) &&
        Objects.equals(this.box4LastNameDiffers, w8ImyFormDataModel.box4LastNameDiffers) &&
        Objects.equals(this.box5NumAllowances, w8ImyFormDataModel.box5NumAllowances) &&
        Objects.equals(this.otherDependents, w8ImyFormDataModel.otherDependents) &&
        Objects.equals(this.nonJobIncome, w8ImyFormDataModel.nonJobIncome) &&
        Objects.equals(this.deductions, w8ImyFormDataModel.deductions) &&
        Objects.equals(this.box6AdditionalWithheld, w8ImyFormDataModel.box6AdditionalWithheld) &&
        Objects.equals(this.box7ExemptFromWithholding, w8ImyFormDataModel.box7ExemptFromWithholding) &&
        Objects.equals(this.officeCode, w8ImyFormDataModel.officeCode) &&
        Objects.equals(this.ftinNotRequired, w8ImyFormDataModel.ftinNotRequired) &&
        Objects.equals(this.benefitLimitation, w8ImyFormDataModel.benefitLimitation) &&
        Objects.equals(this.part4SponsoringEntity, w8ImyFormDataModel.part4SponsoringEntity) &&
        Objects.equals(this.part4SponsoringEntityGiin, w8ImyFormDataModel.part4SponsoringEntityGiin) &&
        Objects.equals(this.part7SponsoringEntity, w8ImyFormDataModel.part7SponsoringEntity) &&
        Objects.equals(this.part12IgaCountry, w8ImyFormDataModel.part12IgaCountry) &&
        Objects.equals(this.part12IgaType, w8ImyFormDataModel.part12IgaType) &&
        Objects.equals(this.part12FatcaStatusUnderIgaAnnexIi, w8ImyFormDataModel.part12FatcaStatusUnderIgaAnnexIi) &&
        Objects.equals(this.part12TrusteeName, w8ImyFormDataModel.part12TrusteeName) &&
        Objects.equals(this.part12TrusteeIsForeign, w8ImyFormDataModel.part12TrusteeIsForeign) &&
        Objects.equals(this.part12Model2IgaGiin, w8ImyFormDataModel.part12Model2IgaGiin) &&
        Objects.equals(this.box37AExchange, w8ImyFormDataModel.box37AExchange) &&
        Objects.equals(this.box37BExchange, w8ImyFormDataModel.box37BExchange) &&
        Objects.equals(this.box37BEntity, w8ImyFormDataModel.box37BEntity) &&
        Objects.equals(this.part28SponsoringEntity, w8ImyFormDataModel.part28SponsoringEntity) &&
        Objects.equals(this.part28SponsoringEntityGiin, w8ImyFormDataModel.part28SponsoringEntityGiin) &&
        Objects.equals(this.makingTreatyClaim, w8ImyFormDataModel.makingTreatyClaim) &&
        Objects.equals(this.treatyCountry, w8ImyFormDataModel.treatyCountry) &&
        Objects.equals(this.treatyArticle, w8ImyFormDataModel.treatyArticle) &&
        Objects.equals(this.withholdingRate, w8ImyFormDataModel.withholdingRate) &&
        Objects.equals(this.incomeType, w8ImyFormDataModel.incomeType) &&
        Objects.equals(this.treatyReasons, w8ImyFormDataModel.treatyReasons) &&
        Objects.equals(this.certifyBox14A, w8ImyFormDataModel.certifyBox14A) &&
        Objects.equals(this.certifyBox14B, w8ImyFormDataModel.certifyBox14B) &&
        Objects.equals(this.certifyBox14C, w8ImyFormDataModel.certifyBox14C) &&
        Objects.equals(this.certifyBox171, w8ImyFormDataModel.certifyBox171) &&
        Objects.equals(this.certifyBox172, w8ImyFormDataModel.certifyBox172) &&
        Objects.equals(this.certifyBox18, w8ImyFormDataModel.certifyBox18) &&
        Objects.equals(this.certifyBox19, w8ImyFormDataModel.certifyBox19) &&
        Objects.equals(this.certifyBox21, w8ImyFormDataModel.certifyBox21) &&
        Objects.equals(this.certifyBox23, w8ImyFormDataModel.certifyBox23) &&
        Objects.equals(this.certifyBox24D, w8ImyFormDataModel.certifyBox24D) &&
        Objects.equals(this.certifyBox25A, w8ImyFormDataModel.certifyBox25A) &&
        Objects.equals(this.certifyBox25B, w8ImyFormDataModel.certifyBox25B) &&
        Objects.equals(this.certifyBox25C, w8ImyFormDataModel.certifyBox25C) &&
        Objects.equals(this.certifyBox27, w8ImyFormDataModel.certifyBox27) &&
        Objects.equals(this.certifyBox28A, w8ImyFormDataModel.certifyBox28A) &&
        Objects.equals(this.certifyBox28B, w8ImyFormDataModel.certifyBox28B) &&
        Objects.equals(this.certifyBox29A, w8ImyFormDataModel.certifyBox29A) &&
        Objects.equals(this.certifyBox29B, w8ImyFormDataModel.certifyBox29B) &&
        Objects.equals(this.certifyBox29C, w8ImyFormDataModel.certifyBox29C) &&
        Objects.equals(this.certifyBox29D, w8ImyFormDataModel.certifyBox29D) &&
        Objects.equals(this.certifyBox29E, w8ImyFormDataModel.certifyBox29E) &&
        Objects.equals(this.certifyBox29F, w8ImyFormDataModel.certifyBox29F) &&
        Objects.equals(this.certifyBox30, w8ImyFormDataModel.certifyBox30) &&
        Objects.equals(this.certifyBox33, w8ImyFormDataModel.certifyBox33) &&
        Objects.equals(this.certifyBox40A, w8ImyFormDataModel.certifyBox40A) &&
        Objects.equals(this.certifyBox40B, w8ImyFormDataModel.certifyBox40B) &&
        Objects.equals(this.certifyBox40C, w8ImyFormDataModel.certifyBox40C) &&
        Objects.equals(this.certifyBox41, w8ImyFormDataModel.certifyBox41) &&
        Objects.equals(this.certifyBox43, w8ImyFormDataModel.certifyBox43) &&
        Objects.equals(this.certifyPart29Signature, w8ImyFormDataModel.certifyPart29Signature) &&
        Objects.equals(this.part19FormationOrResolutionDate, w8ImyFormDataModel.part19FormationOrResolutionDate) &&
        Objects.equals(this.part20FilingDate, w8ImyFormDataModel.part20FilingDate) &&
        Objects.equals(this.part21DeterminationDate, w8ImyFormDataModel.part21DeterminationDate) &&
        Objects.equals(this.substantialUsOwners, w8ImyFormDataModel.substantialUsOwners) &&
        Objects.equals(this.birthday, w8ImyFormDataModel.birthday) &&
        Objects.equals(this.foreignTinNotRequired, w8ImyFormDataModel.foreignTinNotRequired) &&
        Objects.equals(this.archived, w8ImyFormDataModel.archived) &&
        Objects.equals(this.referenceId, w8ImyFormDataModel.referenceId) &&
        Objects.equals(this.companyId, w8ImyFormDataModel.companyId) &&
        Objects.equals(this.signerCapacity, w8ImyFormDataModel.signerCapacity) &&
        Objects.equals(this.tinMatchStatus, w8ImyFormDataModel.tinMatchStatus) &&
        Objects.equals(this.signature, w8ImyFormDataModel.signature) &&
        Objects.equals(this.businessClassification, w8ImyFormDataModel.businessClassification) &&
        Objects.equals(this.businessName, w8ImyFormDataModel.businessName) &&
        Objects.equals(this.businessOther, w8ImyFormDataModel.businessOther) &&
        Objects.equals(this.exemptPayeeCode, w8ImyFormDataModel.exemptPayeeCode) &&
        Objects.equals(this.exemptFatcaCode, w8ImyFormDataModel.exemptFatcaCode) &&
        Objects.equals(this.accountNumber, w8ImyFormDataModel.accountNumber) &&
        Objects.equals(this.foreignCountryIndicator, w8ImyFormDataModel.foreignCountryIndicator) &&
        Objects.equals(this.foreignAddress, w8ImyFormDataModel.foreignAddress) &&
        Objects.equals(this.backupWithholding, w8ImyFormDataModel.backupWithholding) &&
        Objects.equals(this.is1099able, w8ImyFormDataModel.is1099able) &&
        Objects.equals(this.foreignPartnerOwnerOrBeneficiary, w8ImyFormDataModel.foreignPartnerOwnerOrBeneficiary);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, signedDate, disregardedEntityChapter4FatcaStatus, createdAt, updatedAt, displayName, email, tin, typeOfTin, name, citizenshipCountry, chapter3EntityType, chapter4FatcaStatus, residenceAddress, residenceCity, residenceState, residencePostalCode, residenceCountry, residenceIsMailing, mailingAddress, mailingCity, mailingState, mailingPostalCode, mailingCountry, disregardedEntity, disregardedAddress, disregardedCity, disregardedState, disregardedPostalCode, disregardedCountry, disregardedEntityGiin, ein, einType, giin, foreignTin, referenceNumber, certifyBox14, certifyBox15A, certifyBox15B, certifyBox15C, certifyBox15D, certifyBox15E, certifyBox15F, certifyBox15G, certifyBox15H, certifyBox15I, certifyBox16A, box16BQddCorporate, box16BQddPartnership, box16BQddDisregardedEntity, certifyBox17A, certifyBox17B, certifyBox17C, certifyBox17D, certifyBox17E, certifyBox18A, certifyBox18B, certifyBox18C, certifyBox18D, certifyBox18E, certifyBox18F, certifyBox19A, certifyBox19B, certifyBox19C, certifyBox19D, certifyBox19E, certifyBox19F, certifyBox20, certifyBox21A, certifyBox21B, certifyBox21C, certifyBox21D, certifyBox21E, certifyBox21F, certifyBox22, box23ANameSponsoringEntity, certifyBox23B, certifyBox23C, certifyBox24A, certifyBox24B, certifyBox24C, certifyBox25, certifyBox26, box27ANameSponsoringEntity, certifyBox27B, certifyBox28, certifyBox29, certifyBox30A, certifyBox30B, certifyBox30C, certifyBox31, certifyBox32, box32IgaCountry, box32IgaType, box32IgaTreatedAs, box32TrusteeOrSponsor, box32TrusteeIsForeign, certifyBox33A, certifyBox33B, certifyBox33C, certifyBox33D, certifyBox33E, certifyBox33F, certifyBox34, certifyBox35, certifyBox36, certifyBox37A, box37ASecuritiesMarket, certifyBox37B, box37BNameOfEntity, box37BSecuritiesMarket, certifyBox38, certifyBox39, certifyBox40, box41SponsoringEntity, certifyBox42, signerName, eDeliveryConsentedAt, box35FormedOnDate, box36FiledOnDate, employeeFirstName, employeeMiddleName, employeeLastName, employeeNameSuffix, address, city, state, zip, box3MaritalStatus, box4LastNameDiffers, box5NumAllowances, otherDependents, nonJobIncome, deductions, box6AdditionalWithheld, box7ExemptFromWithholding, officeCode, ftinNotRequired, benefitLimitation, part4SponsoringEntity, part4SponsoringEntityGiin, part7SponsoringEntity, part12IgaCountry, part12IgaType, part12FatcaStatusUnderIgaAnnexIi, part12TrusteeName, part12TrusteeIsForeign, part12Model2IgaGiin, box37AExchange, box37BExchange, box37BEntity, part28SponsoringEntity, part28SponsoringEntityGiin, makingTreatyClaim, treatyCountry, treatyArticle, withholdingRate, incomeType, treatyReasons, certifyBox14A, certifyBox14B, certifyBox14C, certifyBox171, certifyBox172, certifyBox18, certifyBox19, certifyBox21, certifyBox23, certifyBox24D, certifyBox25A, certifyBox25B, certifyBox25C, certifyBox27, certifyBox28A, certifyBox28B, certifyBox29A, certifyBox29B, certifyBox29C, certifyBox29D, certifyBox29E, certifyBox29F, certifyBox30, certifyBox33, certifyBox40A, certifyBox40B, certifyBox40C, certifyBox41, certifyBox43, certifyPart29Signature, part19FormationOrResolutionDate, part20FilingDate, part21DeterminationDate, substantialUsOwners, birthday, foreignTinNotRequired, archived, referenceId, companyId, signerCapacity, tinMatchStatus, signature, businessClassification, businessName, businessOther, exemptPayeeCode, exemptFatcaCode, accountNumber, foreignCountryIndicator, foreignAddress, backupWithholding, is1099able, foreignPartnerOwnerOrBeneficiary);
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
    sb.append("class W8ImyFormDataModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    signedDate: ").append(toIndentedString(signedDate)).append("\n");
    sb.append("    disregardedEntityChapter4FatcaStatus: ").append(toIndentedString(disregardedEntityChapter4FatcaStatus)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    typeOfTin: ").append(toIndentedString(typeOfTin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    citizenshipCountry: ").append(toIndentedString(citizenshipCountry)).append("\n");
    sb.append("    chapter3EntityType: ").append(toIndentedString(chapter3EntityType)).append("\n");
    sb.append("    chapter4FatcaStatus: ").append(toIndentedString(chapter4FatcaStatus)).append("\n");
    sb.append("    residenceAddress: ").append(toIndentedString(residenceAddress)).append("\n");
    sb.append("    residenceCity: ").append(toIndentedString(residenceCity)).append("\n");
    sb.append("    residenceState: ").append(toIndentedString(residenceState)).append("\n");
    sb.append("    residencePostalCode: ").append(toIndentedString(residencePostalCode)).append("\n");
    sb.append("    residenceCountry: ").append(toIndentedString(residenceCountry)).append("\n");
    sb.append("    residenceIsMailing: ").append(toIndentedString(residenceIsMailing)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
    sb.append("    mailingCity: ").append(toIndentedString(mailingCity)).append("\n");
    sb.append("    mailingState: ").append(toIndentedString(mailingState)).append("\n");
    sb.append("    mailingPostalCode: ").append(toIndentedString(mailingPostalCode)).append("\n");
    sb.append("    mailingCountry: ").append(toIndentedString(mailingCountry)).append("\n");
    sb.append("    disregardedEntity: ").append(toIndentedString(disregardedEntity)).append("\n");
    sb.append("    disregardedAddress: ").append(toIndentedString(disregardedAddress)).append("\n");
    sb.append("    disregardedCity: ").append(toIndentedString(disregardedCity)).append("\n");
    sb.append("    disregardedState: ").append(toIndentedString(disregardedState)).append("\n");
    sb.append("    disregardedPostalCode: ").append(toIndentedString(disregardedPostalCode)).append("\n");
    sb.append("    disregardedCountry: ").append(toIndentedString(disregardedCountry)).append("\n");
    sb.append("    disregardedEntityGiin: ").append(toIndentedString(disregardedEntityGiin)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    einType: ").append(toIndentedString(einType)).append("\n");
    sb.append("    giin: ").append(toIndentedString(giin)).append("\n");
    sb.append("    foreignTin: ").append(toIndentedString(foreignTin)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    certifyBox14: ").append(toIndentedString(certifyBox14)).append("\n");
    sb.append("    certifyBox15A: ").append(toIndentedString(certifyBox15A)).append("\n");
    sb.append("    certifyBox15B: ").append(toIndentedString(certifyBox15B)).append("\n");
    sb.append("    certifyBox15C: ").append(toIndentedString(certifyBox15C)).append("\n");
    sb.append("    certifyBox15D: ").append(toIndentedString(certifyBox15D)).append("\n");
    sb.append("    certifyBox15E: ").append(toIndentedString(certifyBox15E)).append("\n");
    sb.append("    certifyBox15F: ").append(toIndentedString(certifyBox15F)).append("\n");
    sb.append("    certifyBox15G: ").append(toIndentedString(certifyBox15G)).append("\n");
    sb.append("    certifyBox15H: ").append(toIndentedString(certifyBox15H)).append("\n");
    sb.append("    certifyBox15I: ").append(toIndentedString(certifyBox15I)).append("\n");
    sb.append("    certifyBox16A: ").append(toIndentedString(certifyBox16A)).append("\n");
    sb.append("    box16BQddCorporate: ").append(toIndentedString(box16BQddCorporate)).append("\n");
    sb.append("    box16BQddPartnership: ").append(toIndentedString(box16BQddPartnership)).append("\n");
    sb.append("    box16BQddDisregardedEntity: ").append(toIndentedString(box16BQddDisregardedEntity)).append("\n");
    sb.append("    certifyBox17A: ").append(toIndentedString(certifyBox17A)).append("\n");
    sb.append("    certifyBox17B: ").append(toIndentedString(certifyBox17B)).append("\n");
    sb.append("    certifyBox17C: ").append(toIndentedString(certifyBox17C)).append("\n");
    sb.append("    certifyBox17D: ").append(toIndentedString(certifyBox17D)).append("\n");
    sb.append("    certifyBox17E: ").append(toIndentedString(certifyBox17E)).append("\n");
    sb.append("    certifyBox18A: ").append(toIndentedString(certifyBox18A)).append("\n");
    sb.append("    certifyBox18B: ").append(toIndentedString(certifyBox18B)).append("\n");
    sb.append("    certifyBox18C: ").append(toIndentedString(certifyBox18C)).append("\n");
    sb.append("    certifyBox18D: ").append(toIndentedString(certifyBox18D)).append("\n");
    sb.append("    certifyBox18E: ").append(toIndentedString(certifyBox18E)).append("\n");
    sb.append("    certifyBox18F: ").append(toIndentedString(certifyBox18F)).append("\n");
    sb.append("    certifyBox19A: ").append(toIndentedString(certifyBox19A)).append("\n");
    sb.append("    certifyBox19B: ").append(toIndentedString(certifyBox19B)).append("\n");
    sb.append("    certifyBox19C: ").append(toIndentedString(certifyBox19C)).append("\n");
    sb.append("    certifyBox19D: ").append(toIndentedString(certifyBox19D)).append("\n");
    sb.append("    certifyBox19E: ").append(toIndentedString(certifyBox19E)).append("\n");
    sb.append("    certifyBox19F: ").append(toIndentedString(certifyBox19F)).append("\n");
    sb.append("    certifyBox20: ").append(toIndentedString(certifyBox20)).append("\n");
    sb.append("    certifyBox21A: ").append(toIndentedString(certifyBox21A)).append("\n");
    sb.append("    certifyBox21B: ").append(toIndentedString(certifyBox21B)).append("\n");
    sb.append("    certifyBox21C: ").append(toIndentedString(certifyBox21C)).append("\n");
    sb.append("    certifyBox21D: ").append(toIndentedString(certifyBox21D)).append("\n");
    sb.append("    certifyBox21E: ").append(toIndentedString(certifyBox21E)).append("\n");
    sb.append("    certifyBox21F: ").append(toIndentedString(certifyBox21F)).append("\n");
    sb.append("    certifyBox22: ").append(toIndentedString(certifyBox22)).append("\n");
    sb.append("    box23ANameSponsoringEntity: ").append(toIndentedString(box23ANameSponsoringEntity)).append("\n");
    sb.append("    certifyBox23B: ").append(toIndentedString(certifyBox23B)).append("\n");
    sb.append("    certifyBox23C: ").append(toIndentedString(certifyBox23C)).append("\n");
    sb.append("    certifyBox24A: ").append(toIndentedString(certifyBox24A)).append("\n");
    sb.append("    certifyBox24B: ").append(toIndentedString(certifyBox24B)).append("\n");
    sb.append("    certifyBox24C: ").append(toIndentedString(certifyBox24C)).append("\n");
    sb.append("    certifyBox25: ").append(toIndentedString(certifyBox25)).append("\n");
    sb.append("    certifyBox26: ").append(toIndentedString(certifyBox26)).append("\n");
    sb.append("    box27ANameSponsoringEntity: ").append(toIndentedString(box27ANameSponsoringEntity)).append("\n");
    sb.append("    certifyBox27B: ").append(toIndentedString(certifyBox27B)).append("\n");
    sb.append("    certifyBox28: ").append(toIndentedString(certifyBox28)).append("\n");
    sb.append("    certifyBox29: ").append(toIndentedString(certifyBox29)).append("\n");
    sb.append("    certifyBox30A: ").append(toIndentedString(certifyBox30A)).append("\n");
    sb.append("    certifyBox30B: ").append(toIndentedString(certifyBox30B)).append("\n");
    sb.append("    certifyBox30C: ").append(toIndentedString(certifyBox30C)).append("\n");
    sb.append("    certifyBox31: ").append(toIndentedString(certifyBox31)).append("\n");
    sb.append("    certifyBox32: ").append(toIndentedString(certifyBox32)).append("\n");
    sb.append("    box32IgaCountry: ").append(toIndentedString(box32IgaCountry)).append("\n");
    sb.append("    box32IgaType: ").append(toIndentedString(box32IgaType)).append("\n");
    sb.append("    box32IgaTreatedAs: ").append(toIndentedString(box32IgaTreatedAs)).append("\n");
    sb.append("    box32TrusteeOrSponsor: ").append(toIndentedString(box32TrusteeOrSponsor)).append("\n");
    sb.append("    box32TrusteeIsForeign: ").append(toIndentedString(box32TrusteeIsForeign)).append("\n");
    sb.append("    certifyBox33A: ").append(toIndentedString(certifyBox33A)).append("\n");
    sb.append("    certifyBox33B: ").append(toIndentedString(certifyBox33B)).append("\n");
    sb.append("    certifyBox33C: ").append(toIndentedString(certifyBox33C)).append("\n");
    sb.append("    certifyBox33D: ").append(toIndentedString(certifyBox33D)).append("\n");
    sb.append("    certifyBox33E: ").append(toIndentedString(certifyBox33E)).append("\n");
    sb.append("    certifyBox33F: ").append(toIndentedString(certifyBox33F)).append("\n");
    sb.append("    certifyBox34: ").append(toIndentedString(certifyBox34)).append("\n");
    sb.append("    certifyBox35: ").append(toIndentedString(certifyBox35)).append("\n");
    sb.append("    certifyBox36: ").append(toIndentedString(certifyBox36)).append("\n");
    sb.append("    certifyBox37A: ").append(toIndentedString(certifyBox37A)).append("\n");
    sb.append("    box37ASecuritiesMarket: ").append(toIndentedString(box37ASecuritiesMarket)).append("\n");
    sb.append("    certifyBox37B: ").append(toIndentedString(certifyBox37B)).append("\n");
    sb.append("    box37BNameOfEntity: ").append(toIndentedString(box37BNameOfEntity)).append("\n");
    sb.append("    box37BSecuritiesMarket: ").append(toIndentedString(box37BSecuritiesMarket)).append("\n");
    sb.append("    certifyBox38: ").append(toIndentedString(certifyBox38)).append("\n");
    sb.append("    certifyBox39: ").append(toIndentedString(certifyBox39)).append("\n");
    sb.append("    certifyBox40: ").append(toIndentedString(certifyBox40)).append("\n");
    sb.append("    box41SponsoringEntity: ").append(toIndentedString(box41SponsoringEntity)).append("\n");
    sb.append("    certifyBox42: ").append(toIndentedString(certifyBox42)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    eDeliveryConsentedAt: ").append(toIndentedString(eDeliveryConsentedAt)).append("\n");
    sb.append("    box35FormedOnDate: ").append(toIndentedString(box35FormedOnDate)).append("\n");
    sb.append("    box36FiledOnDate: ").append(toIndentedString(box36FiledOnDate)).append("\n");
    sb.append("    employeeFirstName: ").append(toIndentedString(employeeFirstName)).append("\n");
    sb.append("    employeeMiddleName: ").append(toIndentedString(employeeMiddleName)).append("\n");
    sb.append("    employeeLastName: ").append(toIndentedString(employeeLastName)).append("\n");
    sb.append("    employeeNameSuffix: ").append(toIndentedString(employeeNameSuffix)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    box3MaritalStatus: ").append(toIndentedString(box3MaritalStatus)).append("\n");
    sb.append("    box4LastNameDiffers: ").append(toIndentedString(box4LastNameDiffers)).append("\n");
    sb.append("    box5NumAllowances: ").append(toIndentedString(box5NumAllowances)).append("\n");
    sb.append("    otherDependents: ").append(toIndentedString(otherDependents)).append("\n");
    sb.append("    nonJobIncome: ").append(toIndentedString(nonJobIncome)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    box6AdditionalWithheld: ").append(toIndentedString(box6AdditionalWithheld)).append("\n");
    sb.append("    box7ExemptFromWithholding: ").append(toIndentedString(box7ExemptFromWithholding)).append("\n");
    sb.append("    officeCode: ").append(toIndentedString(officeCode)).append("\n");
    sb.append("    ftinNotRequired: ").append(toIndentedString(ftinNotRequired)).append("\n");
    sb.append("    benefitLimitation: ").append(toIndentedString(benefitLimitation)).append("\n");
    sb.append("    part4SponsoringEntity: ").append(toIndentedString(part4SponsoringEntity)).append("\n");
    sb.append("    part4SponsoringEntityGiin: ").append(toIndentedString(part4SponsoringEntityGiin)).append("\n");
    sb.append("    part7SponsoringEntity: ").append(toIndentedString(part7SponsoringEntity)).append("\n");
    sb.append("    part12IgaCountry: ").append(toIndentedString(part12IgaCountry)).append("\n");
    sb.append("    part12IgaType: ").append(toIndentedString(part12IgaType)).append("\n");
    sb.append("    part12FatcaStatusUnderIgaAnnexIi: ").append(toIndentedString(part12FatcaStatusUnderIgaAnnexIi)).append("\n");
    sb.append("    part12TrusteeName: ").append(toIndentedString(part12TrusteeName)).append("\n");
    sb.append("    part12TrusteeIsForeign: ").append(toIndentedString(part12TrusteeIsForeign)).append("\n");
    sb.append("    part12Model2IgaGiin: ").append(toIndentedString(part12Model2IgaGiin)).append("\n");
    sb.append("    box37AExchange: ").append(toIndentedString(box37AExchange)).append("\n");
    sb.append("    box37BExchange: ").append(toIndentedString(box37BExchange)).append("\n");
    sb.append("    box37BEntity: ").append(toIndentedString(box37BEntity)).append("\n");
    sb.append("    part28SponsoringEntity: ").append(toIndentedString(part28SponsoringEntity)).append("\n");
    sb.append("    part28SponsoringEntityGiin: ").append(toIndentedString(part28SponsoringEntityGiin)).append("\n");
    sb.append("    makingTreatyClaim: ").append(toIndentedString(makingTreatyClaim)).append("\n");
    sb.append("    treatyCountry: ").append(toIndentedString(treatyCountry)).append("\n");
    sb.append("    treatyArticle: ").append(toIndentedString(treatyArticle)).append("\n");
    sb.append("    withholdingRate: ").append(toIndentedString(withholdingRate)).append("\n");
    sb.append("    incomeType: ").append(toIndentedString(incomeType)).append("\n");
    sb.append("    treatyReasons: ").append(toIndentedString(treatyReasons)).append("\n");
    sb.append("    certifyBox14A: ").append(toIndentedString(certifyBox14A)).append("\n");
    sb.append("    certifyBox14B: ").append(toIndentedString(certifyBox14B)).append("\n");
    sb.append("    certifyBox14C: ").append(toIndentedString(certifyBox14C)).append("\n");
    sb.append("    certifyBox171: ").append(toIndentedString(certifyBox171)).append("\n");
    sb.append("    certifyBox172: ").append(toIndentedString(certifyBox172)).append("\n");
    sb.append("    certifyBox18: ").append(toIndentedString(certifyBox18)).append("\n");
    sb.append("    certifyBox19: ").append(toIndentedString(certifyBox19)).append("\n");
    sb.append("    certifyBox21: ").append(toIndentedString(certifyBox21)).append("\n");
    sb.append("    certifyBox23: ").append(toIndentedString(certifyBox23)).append("\n");
    sb.append("    certifyBox24D: ").append(toIndentedString(certifyBox24D)).append("\n");
    sb.append("    certifyBox25A: ").append(toIndentedString(certifyBox25A)).append("\n");
    sb.append("    certifyBox25B: ").append(toIndentedString(certifyBox25B)).append("\n");
    sb.append("    certifyBox25C: ").append(toIndentedString(certifyBox25C)).append("\n");
    sb.append("    certifyBox27: ").append(toIndentedString(certifyBox27)).append("\n");
    sb.append("    certifyBox28A: ").append(toIndentedString(certifyBox28A)).append("\n");
    sb.append("    certifyBox28B: ").append(toIndentedString(certifyBox28B)).append("\n");
    sb.append("    certifyBox29A: ").append(toIndentedString(certifyBox29A)).append("\n");
    sb.append("    certifyBox29B: ").append(toIndentedString(certifyBox29B)).append("\n");
    sb.append("    certifyBox29C: ").append(toIndentedString(certifyBox29C)).append("\n");
    sb.append("    certifyBox29D: ").append(toIndentedString(certifyBox29D)).append("\n");
    sb.append("    certifyBox29E: ").append(toIndentedString(certifyBox29E)).append("\n");
    sb.append("    certifyBox29F: ").append(toIndentedString(certifyBox29F)).append("\n");
    sb.append("    certifyBox30: ").append(toIndentedString(certifyBox30)).append("\n");
    sb.append("    certifyBox33: ").append(toIndentedString(certifyBox33)).append("\n");
    sb.append("    certifyBox40A: ").append(toIndentedString(certifyBox40A)).append("\n");
    sb.append("    certifyBox40B: ").append(toIndentedString(certifyBox40B)).append("\n");
    sb.append("    certifyBox40C: ").append(toIndentedString(certifyBox40C)).append("\n");
    sb.append("    certifyBox41: ").append(toIndentedString(certifyBox41)).append("\n");
    sb.append("    certifyBox43: ").append(toIndentedString(certifyBox43)).append("\n");
    sb.append("    certifyPart29Signature: ").append(toIndentedString(certifyPart29Signature)).append("\n");
    sb.append("    part19FormationOrResolutionDate: ").append(toIndentedString(part19FormationOrResolutionDate)).append("\n");
    sb.append("    part20FilingDate: ").append(toIndentedString(part20FilingDate)).append("\n");
    sb.append("    part21DeterminationDate: ").append(toIndentedString(part21DeterminationDate)).append("\n");
    sb.append("    substantialUsOwners: ").append(toIndentedString(substantialUsOwners)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    foreignTinNotRequired: ").append(toIndentedString(foreignTinNotRequired)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    signerCapacity: ").append(toIndentedString(signerCapacity)).append("\n");
    sb.append("    tinMatchStatus: ").append(toIndentedString(tinMatchStatus)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    businessClassification: ").append(toIndentedString(businessClassification)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessOther: ").append(toIndentedString(businessOther)).append("\n");
    sb.append("    exemptPayeeCode: ").append(toIndentedString(exemptPayeeCode)).append("\n");
    sb.append("    exemptFatcaCode: ").append(toIndentedString(exemptFatcaCode)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    foreignCountryIndicator: ").append(toIndentedString(foreignCountryIndicator)).append("\n");
    sb.append("    foreignAddress: ").append(toIndentedString(foreignAddress)).append("\n");
    sb.append("    backupWithholding: ").append(toIndentedString(backupWithholding)).append("\n");
    sb.append("    is1099able: ").append(toIndentedString(is1099able)).append("\n");
    sb.append("    foreignPartnerOwnerOrBeneficiary: ").append(toIndentedString(foreignPartnerOwnerOrBeneficiary)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("signedDate");
    openapiFields.add("createdAt");
    openapiFields.add("employeeFirstName");
    openapiFields.add("employeeMiddleName");
    openapiFields.add("employeeLastName");
    openapiFields.add("employeeNameSuffix");
    openapiFields.add("address");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("typeOfTin");
    openapiFields.add("tin");
    openapiFields.add("box3MaritalStatus");
    openapiFields.add("box4LastNameDiffers");
    openapiFields.add("box5NumAllowances");
    openapiFields.add("otherDependents");
    openapiFields.add("nonJobIncome");
    openapiFields.add("deductions");
    openapiFields.add("box6AdditionalWithheld");
    openapiFields.add("box7ExemptFromWithholding");
    openapiFields.add("officeCode");
    openapiFields.add("eDeliveryConsentedAt");
    openapiFields.add("disregardedEntityChapter4FatcaStatus");
    openapiFields.add("name");
    openapiFields.add("residenceAddress");
    openapiFields.add("residenceCity");
    openapiFields.add("residenceState");
    openapiFields.add("residencePostalCode");
    openapiFields.add("residenceCountry");
    openapiFields.add("mailingAddress");
    openapiFields.add("mailingCity");
    openapiFields.add("mailingState");
    openapiFields.add("mailingPostalCode");
    openapiFields.add("mailingCountry");
    openapiFields.add("disregardedAddress");
    openapiFields.add("disregardedCity");
    openapiFields.add("disregardedState");
    openapiFields.add("disregardedPostalCode");
    openapiFields.add("disregardedCountry");
    openapiFields.add("foreignTin");
    openapiFields.add("ftinNotRequired");
    openapiFields.add("referenceNumber");
    openapiFields.add("giin");
    openapiFields.add("chapter3EntityType");
    openapiFields.add("chapter4FatcaStatus");
    openapiFields.add("disregardedEntity");
    openapiFields.add("disregardedEntityGiin");
    openapiFields.add("benefitLimitation");
    openapiFields.add("part4SponsoringEntity");
    openapiFields.add("part4SponsoringEntityGiin");
    openapiFields.add("part7SponsoringEntity");
    openapiFields.add("part12IgaCountry");
    openapiFields.add("part12IgaType");
    openapiFields.add("part12FatcaStatusUnderIgaAnnexIi");
    openapiFields.add("part12TrusteeName");
    openapiFields.add("part12TrusteeIsForeign");
    openapiFields.add("part12Model2IgaGiin");
    openapiFields.add("box37AExchange");
    openapiFields.add("box37BExchange");
    openapiFields.add("box37BEntity");
    openapiFields.add("part28SponsoringEntity");
    openapiFields.add("part28SponsoringEntityGiin");
    openapiFields.add("signerName");
    openapiFields.add("residenceIsMailing");
    openapiFields.add("citizenshipCountry");
    openapiFields.add("makingTreatyClaim");
    openapiFields.add("treatyCountry");
    openapiFields.add("treatyArticle");
    openapiFields.add("withholdingRate");
    openapiFields.add("incomeType");
    openapiFields.add("treatyReasons");
    openapiFields.add("certifyBox14A");
    openapiFields.add("certifyBox14B");
    openapiFields.add("certifyBox14C");
    openapiFields.add("certifyBox17_1");
    openapiFields.add("certifyBox17_2");
    openapiFields.add("certifyBox18");
    openapiFields.add("certifyBox19");
    openapiFields.add("certifyBox21");
    openapiFields.add("certifyBox22");
    openapiFields.add("certifyBox23");
    openapiFields.add("certifyBox24A");
    openapiFields.add("certifyBox24B");
    openapiFields.add("certifyBox24C");
    openapiFields.add("certifyBox24D");
    openapiFields.add("certifyBox25A");
    openapiFields.add("certifyBox25B");
    openapiFields.add("certifyBox25C");
    openapiFields.add("certifyBox26");
    openapiFields.add("certifyBox27");
    openapiFields.add("certifyBox28A");
    openapiFields.add("certifyBox28B");
    openapiFields.add("certifyBox29A");
    openapiFields.add("certifyBox29B");
    openapiFields.add("certifyBox29C");
    openapiFields.add("certifyBox29D");
    openapiFields.add("certifyBox29E");
    openapiFields.add("certifyBox29F");
    openapiFields.add("certifyBox30");
    openapiFields.add("certifyBox31");
    openapiFields.add("certifyBox32");
    openapiFields.add("certifyBox33");
    openapiFields.add("certifyBox34");
    openapiFields.add("certifyBox35");
    openapiFields.add("certifyBox36");
    openapiFields.add("certifyBox37A");
    openapiFields.add("certifyBox37B");
    openapiFields.add("certifyBox38");
    openapiFields.add("certifyBox39");
    openapiFields.add("certifyBox40A");
    openapiFields.add("certifyBox40B");
    openapiFields.add("certifyBox40C");
    openapiFields.add("certifyBox41");
    openapiFields.add("certifyBox43");
    openapiFields.add("certifyPart29Signature");
    openapiFields.add("part19FormationOrResolutionDate");
    openapiFields.add("part20FilingDate");
    openapiFields.add("part21DeterminationDate");
    openapiFields.add("substantialUsOwners");
    openapiFields.add("birthday");
    openapiFields.add("foreignTinNotRequired");
    openapiFields.add("archived");
    openapiFields.add("referenceId");
    openapiFields.add("companyId");
    openapiFields.add("displayName");
    openapiFields.add("email");
    openapiFields.add("signerCapacity");
    openapiFields.add("updatedAt");
    openapiFields.add("ein");
    openapiFields.add("einType");
    openapiFields.add("certifyBox14");
    openapiFields.add("certifyBox15A");
    openapiFields.add("certifyBox15B");
    openapiFields.add("certifyBox15C");
    openapiFields.add("certifyBox15D");
    openapiFields.add("certifyBox15E");
    openapiFields.add("certifyBox15F");
    openapiFields.add("certifyBox15G");
    openapiFields.add("certifyBox15H");
    openapiFields.add("certifyBox15I");
    openapiFields.add("certifyBox16A");
    openapiFields.add("box16BQddCorporate");
    openapiFields.add("box16BQddPartnership");
    openapiFields.add("box16BQddDisregardedEntity");
    openapiFields.add("certifyBox17A");
    openapiFields.add("certifyBox17B");
    openapiFields.add("certifyBox17C");
    openapiFields.add("certifyBox17D");
    openapiFields.add("certifyBox17E");
    openapiFields.add("certifyBox18A");
    openapiFields.add("certifyBox18B");
    openapiFields.add("certifyBox18C");
    openapiFields.add("certifyBox18D");
    openapiFields.add("certifyBox18E");
    openapiFields.add("certifyBox18F");
    openapiFields.add("certifyBox19A");
    openapiFields.add("certifyBox19B");
    openapiFields.add("certifyBox19C");
    openapiFields.add("certifyBox19D");
    openapiFields.add("certifyBox19E");
    openapiFields.add("certifyBox19F");
    openapiFields.add("certifyBox20");
    openapiFields.add("certifyBox21A");
    openapiFields.add("certifyBox21B");
    openapiFields.add("certifyBox21C");
    openapiFields.add("certifyBox21D");
    openapiFields.add("certifyBox21E");
    openapiFields.add("certifyBox21F");
    openapiFields.add("box23ANameSponsoringEntity");
    openapiFields.add("certifyBox23B");
    openapiFields.add("certifyBox23C");
    openapiFields.add("certifyBox25");
    openapiFields.add("box27ANameSponsoringEntity");
    openapiFields.add("certifyBox27B");
    openapiFields.add("certifyBox28");
    openapiFields.add("certifyBox29");
    openapiFields.add("certifyBox30A");
    openapiFields.add("certifyBox30B");
    openapiFields.add("certifyBox30C");
    openapiFields.add("box32IgaCountry");
    openapiFields.add("box32IgaType");
    openapiFields.add("box32IgaTreatedAs");
    openapiFields.add("box32TrusteeOrSponsor");
    openapiFields.add("box32TrusteeIsForeign");
    openapiFields.add("certifyBox33A");
    openapiFields.add("certifyBox33B");
    openapiFields.add("certifyBox33C");
    openapiFields.add("certifyBox33D");
    openapiFields.add("certifyBox33E");
    openapiFields.add("certifyBox33F");
    openapiFields.add("box37ASecuritiesMarket");
    openapiFields.add("box37BNameOfEntity");
    openapiFields.add("box37BSecuritiesMarket");
    openapiFields.add("certifyBox40");
    openapiFields.add("box41SponsoringEntity");
    openapiFields.add("certifyBox42");
    openapiFields.add("box35FormedOnDate");
    openapiFields.add("box36FiledOnDate");
    openapiFields.add("tinMatchStatus");
    openapiFields.add("signature");
    openapiFields.add("businessClassification");
    openapiFields.add("businessName");
    openapiFields.add("businessOther");
    openapiFields.add("exemptPayeeCode");
    openapiFields.add("exemptFatcaCode");
    openapiFields.add("accountNumber");
    openapiFields.add("foreignCountryIndicator");
    openapiFields.add("foreignAddress");
    openapiFields.add("backupWithholding");
    openapiFields.add("is1099able");
    openapiFields.add("foreignPartnerOwnerOrBeneficiary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to W8ImyFormDataModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!W8ImyFormDataModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in W8ImyFormDataModel is not found in the empty JSON string", W8ImyFormDataModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!W8ImyFormDataModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `W8ImyFormDataModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("disregardedEntityChapter4FatcaStatus") != null && !jsonObj.get("disregardedEntityChapter4FatcaStatus").isJsonNull()) && !jsonObj.get("disregardedEntityChapter4FatcaStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedEntityChapter4FatcaStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedEntityChapter4FatcaStatus").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("typeOfTin") != null && !jsonObj.get("typeOfTin").isJsonNull()) && !jsonObj.get("typeOfTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeOfTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeOfTin").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("citizenshipCountry") != null && !jsonObj.get("citizenshipCountry").isJsonNull()) && !jsonObj.get("citizenshipCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `citizenshipCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("citizenshipCountry").toString()));
      }
      if ((jsonObj.get("chapter3EntityType") != null && !jsonObj.get("chapter3EntityType").isJsonNull()) && !jsonObj.get("chapter3EntityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chapter3EntityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chapter3EntityType").toString()));
      }
      if ((jsonObj.get("chapter4FatcaStatus") != null && !jsonObj.get("chapter4FatcaStatus").isJsonNull()) && !jsonObj.get("chapter4FatcaStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chapter4FatcaStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chapter4FatcaStatus").toString()));
      }
      if ((jsonObj.get("residenceAddress") != null && !jsonObj.get("residenceAddress").isJsonNull()) && !jsonObj.get("residenceAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceAddress").toString()));
      }
      if ((jsonObj.get("residenceCity") != null && !jsonObj.get("residenceCity").isJsonNull()) && !jsonObj.get("residenceCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceCity").toString()));
      }
      if ((jsonObj.get("residenceState") != null && !jsonObj.get("residenceState").isJsonNull()) && !jsonObj.get("residenceState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceState").toString()));
      }
      if ((jsonObj.get("residencePostalCode") != null && !jsonObj.get("residencePostalCode").isJsonNull()) && !jsonObj.get("residencePostalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residencePostalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residencePostalCode").toString()));
      }
      if ((jsonObj.get("residenceCountry") != null && !jsonObj.get("residenceCountry").isJsonNull()) && !jsonObj.get("residenceCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `residenceCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("residenceCountry").toString()));
      }
      if ((jsonObj.get("mailingAddress") != null && !jsonObj.get("mailingAddress").isJsonNull()) && !jsonObj.get("mailingAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingAddress").toString()));
      }
      if ((jsonObj.get("mailingCity") != null && !jsonObj.get("mailingCity").isJsonNull()) && !jsonObj.get("mailingCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingCity").toString()));
      }
      if ((jsonObj.get("mailingState") != null && !jsonObj.get("mailingState").isJsonNull()) && !jsonObj.get("mailingState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingState").toString()));
      }
      if ((jsonObj.get("mailingPostalCode") != null && !jsonObj.get("mailingPostalCode").isJsonNull()) && !jsonObj.get("mailingPostalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingPostalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingPostalCode").toString()));
      }
      if ((jsonObj.get("mailingCountry") != null && !jsonObj.get("mailingCountry").isJsonNull()) && !jsonObj.get("mailingCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mailingCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mailingCountry").toString()));
      }
      if ((jsonObj.get("disregardedEntity") != null && !jsonObj.get("disregardedEntity").isJsonNull()) && !jsonObj.get("disregardedEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedEntity").toString()));
      }
      if ((jsonObj.get("disregardedAddress") != null && !jsonObj.get("disregardedAddress").isJsonNull()) && !jsonObj.get("disregardedAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedAddress").toString()));
      }
      if ((jsonObj.get("disregardedCity") != null && !jsonObj.get("disregardedCity").isJsonNull()) && !jsonObj.get("disregardedCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedCity").toString()));
      }
      if ((jsonObj.get("disregardedState") != null && !jsonObj.get("disregardedState").isJsonNull()) && !jsonObj.get("disregardedState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedState").toString()));
      }
      if ((jsonObj.get("disregardedPostalCode") != null && !jsonObj.get("disregardedPostalCode").isJsonNull()) && !jsonObj.get("disregardedPostalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedPostalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedPostalCode").toString()));
      }
      if ((jsonObj.get("disregardedCountry") != null && !jsonObj.get("disregardedCountry").isJsonNull()) && !jsonObj.get("disregardedCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedCountry").toString()));
      }
      if ((jsonObj.get("disregardedEntityGiin") != null && !jsonObj.get("disregardedEntityGiin").isJsonNull()) && !jsonObj.get("disregardedEntityGiin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disregardedEntityGiin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disregardedEntityGiin").toString()));
      }
      if ((jsonObj.get("ein") != null && !jsonObj.get("ein").isJsonNull()) && !jsonObj.get("ein").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ein` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ein").toString()));
      }
      if ((jsonObj.get("einType") != null && !jsonObj.get("einType").isJsonNull()) && !jsonObj.get("einType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `einType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("einType").toString()));
      }
      if ((jsonObj.get("giin") != null && !jsonObj.get("giin").isJsonNull()) && !jsonObj.get("giin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `giin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("giin").toString()));
      }
      if ((jsonObj.get("foreignTin") != null && !jsonObj.get("foreignTin").isJsonNull()) && !jsonObj.get("foreignTin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignTin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignTin").toString()));
      }
      if ((jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonNull()) && !jsonObj.get("referenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceNumber").toString()));
      }
      if ((jsonObj.get("box23ANameSponsoringEntity") != null && !jsonObj.get("box23ANameSponsoringEntity").isJsonNull()) && !jsonObj.get("box23ANameSponsoringEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box23ANameSponsoringEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box23ANameSponsoringEntity").toString()));
      }
      if ((jsonObj.get("box27ANameSponsoringEntity") != null && !jsonObj.get("box27ANameSponsoringEntity").isJsonNull()) && !jsonObj.get("box27ANameSponsoringEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box27ANameSponsoringEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box27ANameSponsoringEntity").toString()));
      }
      if ((jsonObj.get("box32IgaCountry") != null && !jsonObj.get("box32IgaCountry").isJsonNull()) && !jsonObj.get("box32IgaCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box32IgaCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box32IgaCountry").toString()));
      }
      if ((jsonObj.get("box32IgaType") != null && !jsonObj.get("box32IgaType").isJsonNull()) && !jsonObj.get("box32IgaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box32IgaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box32IgaType").toString()));
      }
      if ((jsonObj.get("box32IgaTreatedAs") != null && !jsonObj.get("box32IgaTreatedAs").isJsonNull()) && !jsonObj.get("box32IgaTreatedAs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box32IgaTreatedAs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box32IgaTreatedAs").toString()));
      }
      if ((jsonObj.get("box32TrusteeOrSponsor") != null && !jsonObj.get("box32TrusteeOrSponsor").isJsonNull()) && !jsonObj.get("box32TrusteeOrSponsor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box32TrusteeOrSponsor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box32TrusteeOrSponsor").toString()));
      }
      if ((jsonObj.get("box37ASecuritiesMarket") != null && !jsonObj.get("box37ASecuritiesMarket").isJsonNull()) && !jsonObj.get("box37ASecuritiesMarket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box37ASecuritiesMarket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box37ASecuritiesMarket").toString()));
      }
      if ((jsonObj.get("box37BNameOfEntity") != null && !jsonObj.get("box37BNameOfEntity").isJsonNull()) && !jsonObj.get("box37BNameOfEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box37BNameOfEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box37BNameOfEntity").toString()));
      }
      if ((jsonObj.get("box37BSecuritiesMarket") != null && !jsonObj.get("box37BSecuritiesMarket").isJsonNull()) && !jsonObj.get("box37BSecuritiesMarket").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box37BSecuritiesMarket` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box37BSecuritiesMarket").toString()));
      }
      if ((jsonObj.get("box41SponsoringEntity") != null && !jsonObj.get("box41SponsoringEntity").isJsonNull()) && !jsonObj.get("box41SponsoringEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box41SponsoringEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box41SponsoringEntity").toString()));
      }
      if ((jsonObj.get("signerName") != null && !jsonObj.get("signerName").isJsonNull()) && !jsonObj.get("signerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerName").toString()));
      }
      if ((jsonObj.get("employeeFirstName") != null && !jsonObj.get("employeeFirstName").isJsonNull()) && !jsonObj.get("employeeFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeFirstName").toString()));
      }
      if ((jsonObj.get("employeeMiddleName") != null && !jsonObj.get("employeeMiddleName").isJsonNull()) && !jsonObj.get("employeeMiddleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeMiddleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeMiddleName").toString()));
      }
      if ((jsonObj.get("employeeLastName") != null && !jsonObj.get("employeeLastName").isJsonNull()) && !jsonObj.get("employeeLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeLastName").toString()));
      }
      if ((jsonObj.get("employeeNameSuffix") != null && !jsonObj.get("employeeNameSuffix").isJsonNull()) && !jsonObj.get("employeeNameSuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeNameSuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeNameSuffix").toString()));
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
      if ((jsonObj.get("box3MaritalStatus") != null && !jsonObj.get("box3MaritalStatus").isJsonNull()) && !jsonObj.get("box3MaritalStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box3MaritalStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box3MaritalStatus").toString()));
      }
      if ((jsonObj.get("officeCode") != null && !jsonObj.get("officeCode").isJsonNull()) && !jsonObj.get("officeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `officeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("officeCode").toString()));
      }
      if ((jsonObj.get("benefitLimitation") != null && !jsonObj.get("benefitLimitation").isJsonNull()) && !jsonObj.get("benefitLimitation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefitLimitation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefitLimitation").toString()));
      }
      if ((jsonObj.get("part4SponsoringEntity") != null && !jsonObj.get("part4SponsoringEntity").isJsonNull()) && !jsonObj.get("part4SponsoringEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part4SponsoringEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part4SponsoringEntity").toString()));
      }
      if ((jsonObj.get("part4SponsoringEntityGiin") != null && !jsonObj.get("part4SponsoringEntityGiin").isJsonNull()) && !jsonObj.get("part4SponsoringEntityGiin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part4SponsoringEntityGiin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part4SponsoringEntityGiin").toString()));
      }
      if ((jsonObj.get("part7SponsoringEntity") != null && !jsonObj.get("part7SponsoringEntity").isJsonNull()) && !jsonObj.get("part7SponsoringEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part7SponsoringEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part7SponsoringEntity").toString()));
      }
      if ((jsonObj.get("part12IgaCountry") != null && !jsonObj.get("part12IgaCountry").isJsonNull()) && !jsonObj.get("part12IgaCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part12IgaCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part12IgaCountry").toString()));
      }
      if ((jsonObj.get("part12IgaType") != null && !jsonObj.get("part12IgaType").isJsonNull()) && !jsonObj.get("part12IgaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part12IgaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part12IgaType").toString()));
      }
      if ((jsonObj.get("part12FatcaStatusUnderIgaAnnexIi") != null && !jsonObj.get("part12FatcaStatusUnderIgaAnnexIi").isJsonNull()) && !jsonObj.get("part12FatcaStatusUnderIgaAnnexIi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part12FatcaStatusUnderIgaAnnexIi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part12FatcaStatusUnderIgaAnnexIi").toString()));
      }
      if ((jsonObj.get("part12TrusteeName") != null && !jsonObj.get("part12TrusteeName").isJsonNull()) && !jsonObj.get("part12TrusteeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part12TrusteeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part12TrusteeName").toString()));
      }
      if ((jsonObj.get("part12Model2IgaGiin") != null && !jsonObj.get("part12Model2IgaGiin").isJsonNull()) && !jsonObj.get("part12Model2IgaGiin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part12Model2IgaGiin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part12Model2IgaGiin").toString()));
      }
      if ((jsonObj.get("box37AExchange") != null && !jsonObj.get("box37AExchange").isJsonNull()) && !jsonObj.get("box37AExchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box37AExchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box37AExchange").toString()));
      }
      if ((jsonObj.get("box37BExchange") != null && !jsonObj.get("box37BExchange").isJsonNull()) && !jsonObj.get("box37BExchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box37BExchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box37BExchange").toString()));
      }
      if ((jsonObj.get("box37BEntity") != null && !jsonObj.get("box37BEntity").isJsonNull()) && !jsonObj.get("box37BEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `box37BEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("box37BEntity").toString()));
      }
      if ((jsonObj.get("part28SponsoringEntity") != null && !jsonObj.get("part28SponsoringEntity").isJsonNull()) && !jsonObj.get("part28SponsoringEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part28SponsoringEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part28SponsoringEntity").toString()));
      }
      if ((jsonObj.get("part28SponsoringEntityGiin") != null && !jsonObj.get("part28SponsoringEntityGiin").isJsonNull()) && !jsonObj.get("part28SponsoringEntityGiin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `part28SponsoringEntityGiin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("part28SponsoringEntityGiin").toString()));
      }
      if ((jsonObj.get("treatyCountry") != null && !jsonObj.get("treatyCountry").isJsonNull()) && !jsonObj.get("treatyCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `treatyCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("treatyCountry").toString()));
      }
      if ((jsonObj.get("treatyArticle") != null && !jsonObj.get("treatyArticle").isJsonNull()) && !jsonObj.get("treatyArticle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `treatyArticle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("treatyArticle").toString()));
      }
      if ((jsonObj.get("withholdingRate") != null && !jsonObj.get("withholdingRate").isJsonNull()) && !jsonObj.get("withholdingRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `withholdingRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("withholdingRate").toString()));
      }
      if ((jsonObj.get("incomeType") != null && !jsonObj.get("incomeType").isJsonNull()) && !jsonObj.get("incomeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `incomeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("incomeType").toString()));
      }
      if ((jsonObj.get("treatyReasons") != null && !jsonObj.get("treatyReasons").isJsonNull()) && !jsonObj.get("treatyReasons").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `treatyReasons` to be a primitive type in the JSON string but got `%s`", jsonObj.get("treatyReasons").toString()));
      }
      if (jsonObj.get("substantialUsOwners") != null && !jsonObj.get("substantialUsOwners").isJsonNull()) {
        JsonArray jsonArraysubstantialUsOwners = jsonObj.getAsJsonArray("substantialUsOwners");
        if (jsonArraysubstantialUsOwners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("substantialUsOwners").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `substantialUsOwners` to be an array in the JSON string but got `%s`", jsonObj.get("substantialUsOwners").toString()));
          }

          // validate the optional field `substantialUsOwners` (array)
          for (int i = 0; i < jsonArraysubstantialUsOwners.size(); i++) {
            W8BenESubstantialUsOwnerDataModel.validateJsonElement(jsonArraysubstantialUsOwners.get(i));
          };
        }
      }
      if ((jsonObj.get("birthday") != null && !jsonObj.get("birthday").isJsonNull()) && !jsonObj.get("birthday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birthday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birthday").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("signerCapacity") != null && !jsonObj.get("signerCapacity").isJsonNull()) && !jsonObj.get("signerCapacity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signerCapacity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signerCapacity").toString()));
      }
      if ((jsonObj.get("tinMatchStatus") != null && !jsonObj.get("tinMatchStatus").isJsonNull()) && !jsonObj.get("tinMatchStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinMatchStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinMatchStatus").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      if ((jsonObj.get("businessClassification") != null && !jsonObj.get("businessClassification").isJsonNull()) && !jsonObj.get("businessClassification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessClassification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessClassification").toString()));
      }
      if ((jsonObj.get("businessName") != null && !jsonObj.get("businessName").isJsonNull()) && !jsonObj.get("businessName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessName").toString()));
      }
      if ((jsonObj.get("businessOther") != null && !jsonObj.get("businessOther").isJsonNull()) && !jsonObj.get("businessOther").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessOther` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessOther").toString()));
      }
      if ((jsonObj.get("exemptPayeeCode") != null && !jsonObj.get("exemptPayeeCode").isJsonNull()) && !jsonObj.get("exemptPayeeCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptPayeeCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptPayeeCode").toString()));
      }
      if ((jsonObj.get("exemptFatcaCode") != null && !jsonObj.get("exemptFatcaCode").isJsonNull()) && !jsonObj.get("exemptFatcaCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exemptFatcaCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exemptFatcaCode").toString()));
      }
      if ((jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonNull()) && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if ((jsonObj.get("foreignAddress") != null && !jsonObj.get("foreignAddress").isJsonNull()) && !jsonObj.get("foreignAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W8ImyFormDataModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W8ImyFormDataModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W8ImyFormDataModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W8ImyFormDataModel.class));

       return (TypeAdapter<T>) new TypeAdapter<W8ImyFormDataModel>() {
           @Override
           public void write(JsonWriter out, W8ImyFormDataModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public W8ImyFormDataModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of W8ImyFormDataModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of W8ImyFormDataModel
   * @throws IOException if the JSON string is invalid with respect to W8ImyFormDataModel
   */
  public static W8ImyFormDataModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W8ImyFormDataModel.class);
  }

  /**
   * Convert an instance of W8ImyFormDataModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

