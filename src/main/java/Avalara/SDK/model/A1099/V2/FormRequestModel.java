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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;

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
 * FormRequestModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class FormRequestModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FORM_REQUEST("FormRequest");

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

  /**
   * \&quot;W9\&quot; is currently the only supported value
   */
  @JsonAdapter(FormTypeEnum.Adapter.class)
  public enum FormTypeEnum {
    W9("W9");

    private String value;

    FormTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormTypeEnum fromValue(String value) {
      for (FormTypeEnum b : FormTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FormTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FORM_TYPE = "formType";
  @SerializedName(SERIALIZED_NAME_FORM_TYPE)
  private FormTypeEnum formType;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_COMPANY_EMAIL = "companyEmail";
  @SerializedName(SERIALIZED_NAME_COMPANY_EMAIL)
  private String companyEmail;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_SIGNED_AT = "signedAt";
  @SerializedName(SERIALIZED_NAME_SIGNED_AT)
  private OffsetDateTime signedAt;

  /**
   * Result of IRS TIN match query for name and TIN in the last signed form, null if signed_at is null
   */
  @JsonAdapter(TinMatchStatusEnum.Adapter.class)
  public enum TinMatchStatusEnum {
    NONE("None"),
    
    MATCHED("Matched");

    private String value;

    TinMatchStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TinMatchStatusEnum fromValue(String value) {
      for (TinMatchStatusEnum b : TinMatchStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TinMatchStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TinMatchStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TinMatchStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TinMatchStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TinMatchStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TIN_MATCH_STATUS = "tinMatchStatus";
  @SerializedName(SERIALIZED_NAME_TIN_MATCH_STATUS)
  private TinMatchStatusEnum tinMatchStatus;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expiresAt";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_SIGNED_PDF = "signedPdf";
  @SerializedName(SERIALIZED_NAME_SIGNED_PDF)
  private String signedPdf;

  public FormRequestModel() {
  }

  public FormRequestModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public FormRequestModel type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public FormRequestModel formType(FormTypeEnum formType) {
    this.formType = formType;
    return this;
  }

  /**
   * \&quot;W9\&quot; is currently the only supported value
   * @return formType
   */
  @javax.annotation.Nullable
  public FormTypeEnum getFormType() {
    return formType;
  }

  public void setFormType(FormTypeEnum formType) {
    this.formType = formType;
  }


  public FormRequestModel companyId(Integer companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Track1099&#39;s ID of your company, found in the W-9 UI
   * @return companyId
   */
  @javax.annotation.Nullable
  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public FormRequestModel companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Name of your company, set in the W-9 UI
   * @return companyName
   */
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public FormRequestModel companyEmail(String companyEmail) {
    this.companyEmail = companyEmail;
    return this;
  }

  /**
   * Contact email of your company, set in the W-9 UI
   * @return companyEmail
   */
  @javax.annotation.Nullable
  public String getCompanyEmail() {
    return companyEmail;
  }

  public void setCompanyEmail(String companyEmail) {
    this.companyEmail = companyEmail;
  }


  public FormRequestModel referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Your internal identifier for the vendor from whom you are requesting a form
   * @return referenceId
   */
  @javax.annotation.Nullable
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public FormRequestModel signedAt(OffsetDateTime signedAt) {
    this.signedAt = signedAt;
    return this;
  }

  /**
   * The timestamp this vendor (identified by your ReferenceId) last signed a complete W-9, null if you did not include a ReferenceId or the vendor has not yet signed a W-9 in Track1099
   * @return signedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(OffsetDateTime signedAt) {
    this.signedAt = signedAt;
  }


  public FormRequestModel tinMatchStatus(TinMatchStatusEnum tinMatchStatus) {
    this.tinMatchStatus = tinMatchStatus;
    return this;
  }

  /**
   * Result of IRS TIN match query for name and TIN in the last signed form, null if signed_at is null
   * @return tinMatchStatus
   */
  @javax.annotation.Nullable
  public TinMatchStatusEnum getTinMatchStatus() {
    return tinMatchStatus;
  }

  public void setTinMatchStatus(TinMatchStatusEnum tinMatchStatus) {
    this.tinMatchStatus = tinMatchStatus;
  }


  public FormRequestModel expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Timestamp when this FormRequest will expire, ttl (or 3600) seconds from creation
   * @return expiresAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public FormRequestModel signedPdf(String signedPdf) {
    this.signedPdf = signedPdf;
    return this;
  }

  /**
   * URL of PDF representation of just-signed form, otherwise null. Integrations may use this value to offer a \&quot;download for your records\&quot; function after a vendor completes and signs a form. Link expires at the same time as this FormRequest. Treat the format of this URL as opaque and expect it to change in the future.
   * @return signedPdf
   */
  @javax.annotation.Nullable
  public String getSignedPdf() {
    return signedPdf;
  }

  public void setSignedPdf(String signedPdf) {
    this.signedPdf = signedPdf;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormRequestModel formRequestModel = (FormRequestModel) o;
    return Objects.equals(this.id, formRequestModel.id) &&
        Objects.equals(this.type, formRequestModel.type) &&
        Objects.equals(this.formType, formRequestModel.formType) &&
        Objects.equals(this.companyId, formRequestModel.companyId) &&
        Objects.equals(this.companyName, formRequestModel.companyName) &&
        Objects.equals(this.companyEmail, formRequestModel.companyEmail) &&
        Objects.equals(this.referenceId, formRequestModel.referenceId) &&
        Objects.equals(this.signedAt, formRequestModel.signedAt) &&
        Objects.equals(this.tinMatchStatus, formRequestModel.tinMatchStatus) &&
        Objects.equals(this.expiresAt, formRequestModel.expiresAt) &&
        Objects.equals(this.signedPdf, formRequestModel.signedPdf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, formType, companyId, companyName, companyEmail, referenceId, signedAt, tinMatchStatus, expiresAt, signedPdf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormRequestModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    formType: ").append(toIndentedString(formType)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyEmail: ").append(toIndentedString(companyEmail)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
    sb.append("    tinMatchStatus: ").append(toIndentedString(tinMatchStatus)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    signedPdf: ").append(toIndentedString(signedPdf)).append("\n");
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
   * @throws IOException if the JSON Element is invalid with respect to FormRequestModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FormRequestModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FormRequestModel is not found in the empty JSON string", FormRequestModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FormRequestModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FormRequestModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("formType") != null && !jsonObj.get("formType").isJsonNull()) && !jsonObj.get("formType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formType").toString()));
      }
      // validate the optional field `formType`
      if (jsonObj.get("formType") != null && !jsonObj.get("formType").isJsonNull()) {
        FormTypeEnum.validateJsonElement(jsonObj.get("formType"));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if ((jsonObj.get("companyEmail") != null && !jsonObj.get("companyEmail").isJsonNull()) && !jsonObj.get("companyEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyEmail").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("tinMatchStatus") != null && !jsonObj.get("tinMatchStatus").isJsonNull()) && !jsonObj.get("tinMatchStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tinMatchStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tinMatchStatus").toString()));
      }
      // validate the optional field `tinMatchStatus`
      if (jsonObj.get("tinMatchStatus") != null && !jsonObj.get("tinMatchStatus").isJsonNull()) {
        TinMatchStatusEnum.validateJsonElement(jsonObj.get("tinMatchStatus"));
      }
      if ((jsonObj.get("signedPdf") != null && !jsonObj.get("signedPdf").isJsonNull()) && !jsonObj.get("signedPdf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signedPdf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signedPdf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FormRequestModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FormRequestModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FormRequestModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FormRequestModel.class));

       return (TypeAdapter<T>) new TypeAdapter<FormRequestModel>() {
           @Override
           public void write(JsonWriter out, FormRequestModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FormRequestModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FormRequestModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FormRequestModel
   * @throws IOException if the JSON string is invalid with respect to FormRequestModel
   */
  public static FormRequestModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FormRequestModel.class);
  }

  /**
   * Convert an instance of FormRequestModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

