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
 * W9FormBaseResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class W9FormBaseResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ENTRY_STATUS = "entryStatus";
  @SerializedName(SERIALIZED_NAME_ENTRY_STATUS)
  private String entryStatus;

  public static final String SERIALIZED_NAME_ENTRY_STATUS_DATE = "entryStatusDate";
  @SerializedName(SERIALIZED_NAME_ENTRY_STATUS_DATE)
  private OffsetDateTime entryStatusDate;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_SIGNED_DATE = "signedDate";
  @SerializedName(SERIALIZED_NAME_SIGNED_DATE)
  private OffsetDateTime signedDate;

  public static final String SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT = "eDeliveryConsentedAt";
  @SerializedName(SERIALIZED_NAME_E_DELIVERY_CONSENTED_AT)
  private OffsetDateTime eDeliveryConsentedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public W9FormBaseResponse() {
  }

  public W9FormBaseResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the form.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public W9FormBaseResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The form type.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public W9FormBaseResponse entryStatus(String entryStatus) {
    this.entryStatus = entryStatus;
    return this;
  }

  /**
   * The form status.
   * @return entryStatus
   */
  @javax.annotation.Nullable
  public String getEntryStatus() {
    return entryStatus;
  }

  public void setEntryStatus(String entryStatus) {
    this.entryStatus = entryStatus;
  }


  public W9FormBaseResponse entryStatusDate(OffsetDateTime entryStatusDate) {
    this.entryStatusDate = entryStatusDate;
    return this;
  }

  /**
   * The timestamp for the latest status update.
   * @return entryStatusDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getEntryStatusDate() {
    return entryStatusDate;
  }

  public void setEntryStatusDate(OffsetDateTime entryStatusDate) {
    this.entryStatusDate = entryStatusDate;
  }


  public W9FormBaseResponse referenceId(String referenceId) {
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


  public W9FormBaseResponse companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * The ID of the associated company.
   * @return companyId
   */
  @javax.annotation.Nullable
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public W9FormBaseResponse displayName(String displayName) {
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


  public W9FormBaseResponse email(String email) {
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


  public W9FormBaseResponse archived(Boolean archived) {
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


  public W9FormBaseResponse signature(String signature) {
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


  public W9FormBaseResponse signedDate(OffsetDateTime signedDate) {
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


  public W9FormBaseResponse eDeliveryConsentedAt(OffsetDateTime eDeliveryConsentedAt) {
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


  public W9FormBaseResponse createdAt(OffsetDateTime createdAt) {
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


  public W9FormBaseResponse updatedAt(OffsetDateTime updatedAt) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W9FormBaseResponse w9FormBaseResponse = (W9FormBaseResponse) o;
    return Objects.equals(this.id, w9FormBaseResponse.id) &&
        Objects.equals(this.type, w9FormBaseResponse.type) &&
        Objects.equals(this.entryStatus, w9FormBaseResponse.entryStatus) &&
        Objects.equals(this.entryStatusDate, w9FormBaseResponse.entryStatusDate) &&
        Objects.equals(this.referenceId, w9FormBaseResponse.referenceId) &&
        Objects.equals(this.companyId, w9FormBaseResponse.companyId) &&
        Objects.equals(this.displayName, w9FormBaseResponse.displayName) &&
        Objects.equals(this.email, w9FormBaseResponse.email) &&
        Objects.equals(this.archived, w9FormBaseResponse.archived) &&
        Objects.equals(this.signature, w9FormBaseResponse.signature) &&
        Objects.equals(this.signedDate, w9FormBaseResponse.signedDate) &&
        Objects.equals(this.eDeliveryConsentedAt, w9FormBaseResponse.eDeliveryConsentedAt) &&
        Objects.equals(this.createdAt, w9FormBaseResponse.createdAt) &&
        Objects.equals(this.updatedAt, w9FormBaseResponse.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, entryStatus, entryStatusDate, referenceId, companyId, displayName, email, archived, signature, signedDate, eDeliveryConsentedAt, createdAt, updatedAt);
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
    sb.append("class W9FormBaseResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    entryStatus: ").append(toIndentedString(entryStatus)).append("\n");
    sb.append("    entryStatusDate: ").append(toIndentedString(entryStatusDate)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    signedDate: ").append(toIndentedString(signedDate)).append("\n");
    sb.append("    eDeliveryConsentedAt: ").append(toIndentedString(eDeliveryConsentedAt)).append("\n");
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
   * @throws IOException if the JSON Element is invalid with respect to W9FormBaseResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!W9FormBaseResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in W9FormBaseResponse is not found in the empty JSON string", W9FormBaseResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!W9FormBaseResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `W9FormBaseResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("entryStatus") != null && !jsonObj.get("entryStatus").isJsonNull()) && !jsonObj.get("entryStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entryStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entryStatus").toString()));
      }
      if ((jsonObj.get("referenceId") != null && !jsonObj.get("referenceId").isJsonNull()) && !jsonObj.get("referenceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceId").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!W9FormBaseResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'W9FormBaseResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<W9FormBaseResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(W9FormBaseResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<W9FormBaseResponse>() {
           @Override
           public void write(JsonWriter out, W9FormBaseResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public W9FormBaseResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of W9FormBaseResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of W9FormBaseResponse
   * @throws IOException if the JSON string is invalid with respect to W9FormBaseResponse
   */
  public static W9FormBaseResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, W9FormBaseResponse.class);
  }

  /**
   * Convert an instance of W9FormBaseResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

