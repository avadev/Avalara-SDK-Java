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
import Avalara.SDK.model.A1099.V2.W9FormBaseResponse;
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
 * W8BenFormResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class W8BenFormResponse extends W9FormBaseResponse {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CITIZENSHIP_COUNTRY = "citizenshipCountry";
  @SerializedName(SERIALIZED_NAME_CITIZENSHIP_COUNTRY)
  private String citizenshipCountry;

  public static final String SERIALIZED_NAME_RESIDENCE_ADDRESS = "residenceAddress";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_ADDRESS)
  private String residenceAddress;

  public static final String SERIALIZED_NAME_RESIDENCE_CITY = "residenceCity";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_CITY)
  private String residenceCity;

  public static final String SERIALIZED_NAME_RESIDENCE_STATE = "residenceState";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_STATE)
  private String residenceState;

  public static final String SERIALIZED_NAME_RESIDENCE_ZIP = "residenceZip";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_ZIP)
  private String residenceZip;

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

  public static final String SERIALIZED_NAME_MAILING_ZIP = "mailingZip";
  @SerializedName(SERIALIZED_NAME_MAILING_ZIP)
  private String mailingZip;

  public static final String SERIALIZED_NAME_MAILING_COUNTRY = "mailingCountry";
  @SerializedName(SERIALIZED_NAME_MAILING_COUNTRY)
  private String mailingCountry;

  public static final String SERIALIZED_NAME_TIN_TYPE = "tinType";
  @SerializedName(SERIALIZED_NAME_TIN_TYPE)
  private String tinType;

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

  public static final String SERIALIZED_NAME_TREATY_COUNTRY = "treatyCountry";
  @SerializedName(SERIALIZED_NAME_TREATY_COUNTRY)
  private String treatyCountry;

  public static final String SERIALIZED_NAME_TREATY_ARTICLE = "treatyArticle";
  @SerializedName(SERIALIZED_NAME_TREATY_ARTICLE)
  private String treatyArticle;

  public static final String SERIALIZED_NAME_TREATY_REASONS = "treatyReasons";
  @SerializedName(SERIALIZED_NAME_TREATY_REASONS)
  private String treatyReasons;

  public static final String SERIALIZED_NAME_WITHHOLDING_RATE = "withholdingRate";
  @SerializedName(SERIALIZED_NAME_WITHHOLDING_RATE)
  private String withholdingRate;

  public static final String SERIALIZED_NAME_INCOME_TYPE = "incomeType";
  @SerializedName(SERIALIZED_NAME_INCOME_TYPE)
  private String incomeType;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "signerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName;

  public static final String SERIALIZED_NAME_SIGNER_CAPACITY = "signerCapacity";
  @SerializedName(SERIALIZED_NAME_SIGNER_CAPACITY)
  private String signerCapacity;

  public W8BenFormResponse() {
    this.type = this.getClass().getSimpleName();
  }

  public W8BenFormResponse name(String name) {
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


  public W8BenFormResponse citizenshipCountry(String citizenshipCountry) {
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


  public W8BenFormResponse residenceAddress(String residenceAddress) {
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


  public W8BenFormResponse residenceCity(String residenceCity) {
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


  public W8BenFormResponse residenceState(String residenceState) {
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


  public W8BenFormResponse residenceZip(String residenceZip) {
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


  public W8BenFormResponse residenceCountry(String residenceCountry) {
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


  public W8BenFormResponse residenceIsMailing(Boolean residenceIsMailing) {
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


  public W8BenFormResponse mailingAddress(String mailingAddress) {
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


  public W8BenFormResponse mailingCity(String mailingCity) {
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


  public W8BenFormResponse mailingState(String mailingState) {
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


  public W8BenFormResponse mailingZip(String mailingZip) {
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


  public W8BenFormResponse mailingCountry(String mailingCountry) {
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


  public W8BenFormResponse tinType(String tinType) {
    this.tinType = tinType;
    return this;
  }

  /**
   * The type of TIN provided.
   * @return tinType
   */
  @javax.annotation.Nullable
  public String getTinType() {
    return tinType;
  }

  public void setTinType(String tinType) {
    this.tinType = tinType;
  }


  public W8BenFormResponse tin(String tin) {
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


  public W8BenFormResponse foreignTinNotRequired(Boolean foreignTinNotRequired) {
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


  public W8BenFormResponse foreignTin(String foreignTin) {
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


  public W8BenFormResponse referenceNumber(String referenceNumber) {
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


  public W8BenFormResponse birthday(LocalDate birthday) {
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


  public W8BenFormResponse treatyCountry(String treatyCountry) {
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


  public W8BenFormResponse treatyArticle(String treatyArticle) {
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


  public W8BenFormResponse treatyReasons(String treatyReasons) {
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


  public W8BenFormResponse withholdingRate(String withholdingRate) {
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


  public W8BenFormResponse incomeType(String incomeType) {
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


  public W8BenFormResponse signerName(String signerName) {
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


  public W8BenFormResponse signerCapacity(String signerCapacity) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W8BenFormResponse w8BenFormResponse = (W8BenFormResponse) o;
    return Objects.equals(this.name, w8BenFormResponse.name) &&
        Objects.equals(this.citizenshipCountry, w8BenFormResponse.citizenshipCountry) &&
        Objects.equals(this.residenceAddress, w8BenFormResponse.residenceAddress) &&
        Objects.equals(this.residenceCity, w8BenFormResponse.residenceCity) &&
        Objects.equals(this.residenceState, w8BenFormResponse.residenceState) &&
        Objects.equals(this.residenceZip, w8BenFormResponse.residenceZip) &&
        Objects.equals(this.residenceCountry, w8BenFormResponse.residenceCountry) &&
        Objects.equals(this.residenceIsMailing, w8BenFormResponse.residenceIsMailing) &&
        Objects.equals(this.mailingAddress, w8BenFormResponse.mailingAddress) &&
        Objects.equals(this.mailingCity, w8BenFormResponse.mailingCity) &&
        Objects.equals(this.mailingState, w8BenFormResponse.mailingState) &&
        Objects.equals(this.mailingZip, w8BenFormResponse.mailingZip) &&
        Objects.equals(this.mailingCountry, w8BenFormResponse.mailingCountry) &&
        Objects.equals(this.tinType, w8BenFormResponse.tinType) &&
        Objects.equals(this.tin, w8BenFormResponse.tin) &&
        Objects.equals(this.foreignTinNotRequired, w8BenFormResponse.foreignTinNotRequired) &&
        Objects.equals(this.foreignTin, w8BenFormResponse.foreignTin) &&
        Objects.equals(this.referenceNumber, w8BenFormResponse.referenceNumber) &&
        Objects.equals(this.birthday, w8BenFormResponse.birthday) &&
        Objects.equals(this.treatyCountry, w8BenFormResponse.treatyCountry) &&
        Objects.equals(this.treatyArticle, w8BenFormResponse.treatyArticle) &&
        Objects.equals(this.treatyReasons, w8BenFormResponse.treatyReasons) &&
        Objects.equals(this.withholdingRate, w8BenFormResponse.withholdingRate) &&
        Objects.equals(this.incomeType, w8BenFormResponse.incomeType) &&
        Objects.equals(this.signerName, w8BenFormResponse.signerName) &&
        Objects.equals(this.signerCapacity, w8BenFormResponse.signerCapacity) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, citizenshipCountry, residenceAddress, residenceCity, residenceState, residenceZip, residenceCountry, residenceIsMailing, mailingAddress, mailingCity, mailingState, mailingZip, mailingCountry, tinType, tin, foreignTinNotRequired, foreignTin, referenceNumber, birthday, treatyCountry, treatyArticle, treatyReasons, withholdingRate, incomeType, signerName, signerCapacity, super.hashCode());
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
    sb.append("class W8BenFormResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
    sb.append("    tinType: ").append(toIndentedString(tinType)).append("\n");
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
    sb.append("    signerCapacity: ").append(toIndentedString(signerCapacity)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("entryStatus");
    openapiFields.add("entryStatusDate");
    openapiFields.add("referenceId");
    openapiFields.add("companyId");
    openapiFields.add("displayName");
    openapiFields.add("email");
    openapiFields.add("archived");
    openapiFields.add("signature");
    openapiFields.add("signedDate");
    openapiFields.add("eDeliveryConsentedAt");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to W8BenFormResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!W8BenFormResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in W8BenFormResponse is not found in the empty JSON string", W8BenFormResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!W8BenFormResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `W8BenFormResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W8BenFormResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W8BenFormResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W8BenFormResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W8BenFormResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<W8BenFormResponse>() {
           @Override
           public void write(JsonWriter out, W8BenFormResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public W8BenFormResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of W8BenFormResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of W8BenFormResponse
   * @throws IOException if the JSON string is invalid with respect to W8BenFormResponse
   */
  public static W8BenFormResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W8BenFormResponse.class);
  }

  /**
   * Convert an instance of W8BenFormResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

