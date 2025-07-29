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
 * IssuerResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class IssuerResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_DBA = "nameDba";
  @SerializedName(SERIALIZED_NAME_NAME_DBA)
  private String nameDba;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_TELEPHONE = "telephone";
  @SerializedName(SERIALIZED_NAME_TELEPHONE)
  private String telephone;

  public static final String SERIALIZED_NAME_TAX_YEAR = "taxYear";
  @SerializedName(SERIALIZED_NAME_TAX_YEAR)
  private Integer taxYear;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

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

  public static final String SERIALIZED_NAME_FOREIGN_PROVINCE = "foreignProvince";
  @SerializedName(SERIALIZED_NAME_FOREIGN_PROVINCE)
  private String foreignProvince;

  public static final String SERIALIZED_NAME_TRANSFER_AGENT_NAME = "transferAgentName";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AGENT_NAME)
  private String transferAgentName;

  public static final String SERIALIZED_NAME_LAST_FILING = "lastFiling";
  @SerializedName(SERIALIZED_NAME_LAST_FILING)
  private Boolean lastFiling;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public IssuerResponse() {
  }

  public IssuerResponse(
     String id, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  /**
   * Unique identifier set when the record is created
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public IssuerResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Legal name, not DBA
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public IssuerResponse nameDba(String nameDba) {
    this.nameDba = nameDba;
    return this;
  }

  /**
   * Optional DBA name or continuation of a long legal name
   * @return nameDba
   */
  @javax.annotation.Nullable
  public String getNameDba() {
    return nameDba;
  }

  public void setNameDba(String nameDba) {
    this.nameDba = nameDba;
  }


  public IssuerResponse tin(String tin) {
    this.tin = tin;
    return this;
  }

  /**
   * Tax identification number
   * @return tin
   */
  @javax.annotation.Nullable
  public String getTin() {
    return tin;
  }

  public void setTin(String tin) {
    this.tin = tin;
  }


  public IssuerResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Optional identifier for your reference, never shown to any agency or recipient.  We will also prefix download filenames with this value, if present.  Can only include letters, numbers, dashes, underscores and spaces.
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public IssuerResponse telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Telephone number
   * @return telephone
   */
  @javax.annotation.Nullable
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public IssuerResponse taxYear(Integer taxYear) {
    this.taxYear = taxYear;
    return this;
  }

  /**
   * Tax year
   * @return taxYear
   */
  @javax.annotation.Nullable
  public Integer getTaxYear() {
    return taxYear;
  }

  public void setTaxYear(Integer taxYear) {
    this.taxYear = taxYear;
  }


  public IssuerResponse countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * If there is a transfer agent, use the address of the transfer agent.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public IssuerResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public IssuerResponse address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address
   * @return address
   */
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public IssuerResponse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public IssuerResponse state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public IssuerResponse zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * Zip code
   * @return zip
   */
  @javax.annotation.Nullable
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  public IssuerResponse foreignProvince(String foreignProvince) {
    this.foreignProvince = foreignProvince;
    return this;
  }

  /**
   * Foreign province
   * @return foreignProvince
   */
  @javax.annotation.Nullable
  public String getForeignProvince() {
    return foreignProvince;
  }

  public void setForeignProvince(String foreignProvince) {
    this.foreignProvince = foreignProvince;
  }


  public IssuerResponse transferAgentName(String transferAgentName) {
    this.transferAgentName = transferAgentName;
    return this;
  }

  /**
   * Transfer Agent&#39;s Name
   * @return transferAgentName
   */
  @javax.annotation.Nullable
  public String getTransferAgentName() {
    return transferAgentName;
  }

  public void setTransferAgentName(String transferAgentName) {
    this.transferAgentName = transferAgentName;
  }


  public IssuerResponse lastFiling(Boolean lastFiling) {
    this.lastFiling = lastFiling;
    return this;
  }

  /**
   * Last year of filing for this payer
   * @return lastFiling
   */
  @javax.annotation.Nullable
  public Boolean getLastFiling() {
    return lastFiling;
  }

  public void setLastFiling(Boolean lastFiling) {
    this.lastFiling = lastFiling;
  }


  /**
   * Date time when the issuer was created
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  /**
   * Date time when the issuer was updated
   * @return updatedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuerResponse issuerResponse = (IssuerResponse) o;
    return Objects.equals(this.id, issuerResponse.id) &&
        Objects.equals(this.name, issuerResponse.name) &&
        Objects.equals(this.nameDba, issuerResponse.nameDba) &&
        Objects.equals(this.tin, issuerResponse.tin) &&
        Objects.equals(this.referenceId, issuerResponse.referenceId) &&
        Objects.equals(this.telephone, issuerResponse.telephone) &&
        Objects.equals(this.taxYear, issuerResponse.taxYear) &&
        Objects.equals(this.countryCode, issuerResponse.countryCode) &&
        Objects.equals(this.email, issuerResponse.email) &&
        Objects.equals(this.address, issuerResponse.address) &&
        Objects.equals(this.city, issuerResponse.city) &&
        Objects.equals(this.state, issuerResponse.state) &&
        Objects.equals(this.zip, issuerResponse.zip) &&
        Objects.equals(this.foreignProvince, issuerResponse.foreignProvince) &&
        Objects.equals(this.transferAgentName, issuerResponse.transferAgentName) &&
        Objects.equals(this.lastFiling, issuerResponse.lastFiling) &&
        Objects.equals(this.createdAt, issuerResponse.createdAt) &&
        Objects.equals(this.updatedAt, issuerResponse.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, nameDba, tin, referenceId, telephone, taxYear, countryCode, email, address, city, state, zip, foreignProvince, transferAgentName, lastFiling, createdAt, updatedAt);
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
    sb.append("class IssuerResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameDba: ").append(toIndentedString(nameDba)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    foreignProvince: ").append(toIndentedString(foreignProvince)).append("\n");
    sb.append("    transferAgentName: ").append(toIndentedString(transferAgentName)).append("\n");
    sb.append("    lastFiling: ").append(toIndentedString(lastFiling)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssuerResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssuerResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssuerResponse is not found in the empty JSON string", IssuerResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssuerResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssuerResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("nameDba") != null && !jsonObj.get("nameDba").isJsonNull()) && !jsonObj.get("nameDba").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameDba` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameDba").toString()));
      }
      if ((jsonObj.get("tin") != null && !jsonObj.get("tin").isJsonNull()) && !jsonObj.get("tin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tin").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("telephone") != null && !jsonObj.get("telephone").isJsonNull()) && !jsonObj.get("telephone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephone").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
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
      if ((jsonObj.get("foreignProvince") != null && !jsonObj.get("foreignProvince").isJsonNull()) && !jsonObj.get("foreignProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignProvince").toString()));
      }
      if ((jsonObj.get("transferAgentName") != null && !jsonObj.get("transferAgentName").isJsonNull()) && !jsonObj.get("transferAgentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferAgentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferAgentName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssuerResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssuerResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssuerResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssuerResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<IssuerResponse>() {
           @Override
           public void write(JsonWriter out, IssuerResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssuerResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IssuerResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssuerResponse
   * @throws IOException if the JSON string is invalid with respect to IssuerResponse
   */
  public static IssuerResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuerResponse.class);
  }

  /**
   * Convert an instance of IssuerResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

