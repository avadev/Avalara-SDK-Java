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
 * > **Note:** You must have an active Avalara 1099 & W-9 subscription to authenticate and use these APIs. If you don't have a subscription, please contact our [Sales team](https://www.avalara.com/us/en/products/1099/request-a-demo.html).  ## Authentication  The Avalara 1099 & W-9 API uses **Bearer Token Authentication**. To authenticate, acquire a bearer token using a **Client ID** and **Client Secret** that you generate in the Avalara 1099 & W-9 web application.  The sample cURL commands below use **production** URLs. For **sandbox**, replace them with the sandbox URLs listed in the Sandbox Environment table.  ### Option 1 — Client ID and Client Secret (recommended)  **Step 1: Create API credentials in the Avalara 1099 & W-9 web app**  For a full walkthrough, see the [Avalara 1099 & W-9 integration guide](https://developer.avalara.com/products/avalara-1099-and-w9/integration-guides/1099-and-w-9/siu2796410674799/).  > **Note:** To enable credential creation you must first enter a valid company address in **Account Settings > Account** and enable two-factor authentication in **Account Settings > Security**.  1. In Avalara 1099 & W-9, open **Account Settings** (gear icon, top-right of any page) and select **API**. 2. Click **Create new credentials** (a valid company address and 2FA are required). 3. Copy your **Client Id** and **Client Secret** securely — they will not be shown again after you leave the screen.  **Step 2: Request a bearer token**  ```bash curl -X POST 'https://identity.avalara.com/connect/token' \\   --header 'Content-Type: application/x-www-form-urlencoded' \\   --data-urlencode 'grant_type=client_credentials' \\   --data-urlencode 'client_id={{client_id}}' \\   --data-urlencode 'client_secret={{client_secret}}' ```  ### Option 2 — Account ID and License Key  If your organization already uses other Avalara products (AvaTax, CertCapture) and has access to the logged-in area of Avalara.com, you can generate the bearer token using your **Account ID** and **License Key**.  > **Note:** If you already have a license key for other Avalara products you can reuse it. Generating a new key will reset any previously created key.  1. Log in to Avalara.com. 2. Go to **Settings → License and API Keys**. 3. Click **Generate New Key**. 4. Note your **Account ID** from the Account menu.  ```bash curl -X POST 'https://identity.avalara.com/connect/token' \\   --header 'Content-Type: application/x-www-form-urlencoded' \\   --data-urlencode 'grant_type=client_credentials' \\   --data-urlencode 'client_id={{accountId}}' \\   --data-urlencode 'client_secret={{licenseKey}}' ```  ### Using and renewing the bearer token  Include the token in the `Authorization` header on every request:  ```http Authorization: Bearer {access_token} ```  Tokens expire after the number of seconds in the `expires_in` field of the token response. Your integration must renew the token before it expires.  **Example token response**  ```json {   \"access_token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI...\",   \"expires_in\": 3600,   \"token_type\": \"Bearer\",   \"scope\": \"avatax_api iam-ds\" } ```  ### Sandbox Environment  Use the same steps as production, replacing the base URLs:  | Purpose | Production | Sandbox | | --- | --- | --- | | Account & License Key management (web) | `https://www.avalara.com` | `https://sandbox.admin.avalara.com` | | Account & License Key management (API) | `https://rest.avatax.com` | `https://sandbox-rest.avatax.com` | | Token generation | `https://identity.avalara.com` | `https://ai-sbx.avlr.sh` |  ## Environments  #### Production - **Avalara 1099 API URL:** [`https://api.avalara.com/avalara1099`](https://api.avalara.com/avalara1099) - **Identity Token URL:** [`https://identity.avalara.com/connect/token`](https://identity.avalara.com/connect/token)  #### Sandbox - **Avalara 1099 API URL:** [`https://api.sbx.avalara.com/avalara1099`](https://api.sbx.avalara.com/avalara1099) - **Identity Token URL:** [`https://ai-sbx.avlr.sh/connect/token`](https://ai-sbx.avlr.sh/connect/token)  ---  ## API & SDK Documentation  [Avalara 1099 API Reference](https://developer.avalara.com/api-reference/avalara1099/avalara1099/)  [Avalara SDKs](https://developer.avalara.com/sdk/)  [Swagger](https://api.avalara.com/avalara1099/swagger/index.html?api-version=2.0)
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
 * StateAndLocalWithholding
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class StateAndLocalWithholding {
  public static final String SERIALIZED_NAME_STATE_TAX_WITHHELD = "stateTaxWithheld";
  @SerializedName(SERIALIZED_NAME_STATE_TAX_WITHHELD)
  private Double stateTaxWithheld;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATE_ID = "stateId";
  @SerializedName(SERIALIZED_NAME_STATE_ID)
  private String stateId;

  public static final String SERIALIZED_NAME_STATE_INCOME = "stateIncome";
  @SerializedName(SERIALIZED_NAME_STATE_INCOME)
  private Double stateIncome;

  public static final String SERIALIZED_NAME_LOCAL_TAX_WITHHELD = "localTaxWithheld";
  @SerializedName(SERIALIZED_NAME_LOCAL_TAX_WITHHELD)
  private Double localTaxWithheld;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_LOCALITY_ID = "localityId";
  @SerializedName(SERIALIZED_NAME_LOCALITY_ID)
  private String localityId;

  public static final String SERIALIZED_NAME_LOCAL_INCOME = "localIncome";
  @SerializedName(SERIALIZED_NAME_LOCAL_INCOME)
  private Double localIncome;

  public StateAndLocalWithholding() {
  }

  public StateAndLocalWithholding stateTaxWithheld(Double stateTaxWithheld) {
    this.stateTaxWithheld = stateTaxWithheld;
    return this;
  }

  /**
   * Amount of state tax that was withheld
   * @return stateTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getStateTaxWithheld() {
    return stateTaxWithheld;
  }

  public void setStateTaxWithheld(Double stateTaxWithheld) {
    this.stateTaxWithheld = stateTaxWithheld;
  }


  public StateAndLocalWithholding state(String state) {
    this.state = state;
    return this;
  }

  /**
   * US state
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public StateAndLocalWithholding stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * State ID of the entity issuing the form
   * @return stateId
   */
  @javax.annotation.Nullable
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }


  public StateAndLocalWithholding stateIncome(Double stateIncome) {
    this.stateIncome = stateIncome;
    return this;
  }

  /**
   * Amount of state income
   * @return stateIncome
   */
  @javax.annotation.Nullable
  public Double getStateIncome() {
    return stateIncome;
  }

  public void setStateIncome(Double stateIncome) {
    this.stateIncome = stateIncome;
  }


  public StateAndLocalWithholding localTaxWithheld(Double localTaxWithheld) {
    this.localTaxWithheld = localTaxWithheld;
    return this;
  }

  /**
   * Amount of local tax that was withheld
   * @return localTaxWithheld
   */
  @javax.annotation.Nullable
  public Double getLocalTaxWithheld() {
    return localTaxWithheld;
  }

  public void setLocalTaxWithheld(Double localTaxWithheld) {
    this.localTaxWithheld = localTaxWithheld;
  }


  public StateAndLocalWithholding locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Locality name
   * @return locality
   */
  @javax.annotation.Nullable
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }


  public StateAndLocalWithholding localityId(String localityId) {
    this.localityId = localityId;
    return this;
  }

  /**
   * Locality ID of the entity issuing the form
   * @return localityId
   */
  @javax.annotation.Nullable
  public String getLocalityId() {
    return localityId;
  }

  public void setLocalityId(String localityId) {
    this.localityId = localityId;
  }


  public StateAndLocalWithholding localIncome(Double localIncome) {
    this.localIncome = localIncome;
    return this;
  }

  /**
   * Amount of local income
   * @return localIncome
   */
  @javax.annotation.Nullable
  public Double getLocalIncome() {
    return localIncome;
  }

  public void setLocalIncome(Double localIncome) {
    this.localIncome = localIncome;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateAndLocalWithholding stateAndLocalWithholding = (StateAndLocalWithholding) o;
    return Objects.equals(this.stateTaxWithheld, stateAndLocalWithholding.stateTaxWithheld) &&
        Objects.equals(this.state, stateAndLocalWithholding.state) &&
        Objects.equals(this.stateId, stateAndLocalWithholding.stateId) &&
        Objects.equals(this.stateIncome, stateAndLocalWithholding.stateIncome) &&
        Objects.equals(this.localTaxWithheld, stateAndLocalWithholding.localTaxWithheld) &&
        Objects.equals(this.locality, stateAndLocalWithholding.locality) &&
        Objects.equals(this.localityId, stateAndLocalWithholding.localityId) &&
        Objects.equals(this.localIncome, stateAndLocalWithholding.localIncome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateTaxWithheld, state, stateId, stateIncome, localTaxWithheld, locality, localityId, localIncome);
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
    sb.append("class StateAndLocalWithholding {\n");
    sb.append("    stateTaxWithheld: ").append(toIndentedString(stateTaxWithheld)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    stateIncome: ").append(toIndentedString(stateIncome)).append("\n");
    sb.append("    localTaxWithheld: ").append(toIndentedString(localTaxWithheld)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    localityId: ").append(toIndentedString(localityId)).append("\n");
    sb.append("    localIncome: ").append(toIndentedString(localIncome)).append("\n");
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
    openapiFields.add("stateTaxWithheld");
    openapiFields.add("state");
    openapiFields.add("stateId");
    openapiFields.add("stateIncome");
    openapiFields.add("localTaxWithheld");
    openapiFields.add("locality");
    openapiFields.add("localityId");
    openapiFields.add("localIncome");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StateAndLocalWithholding
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StateAndLocalWithholding.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StateAndLocalWithholding is not found in the empty JSON string", StateAndLocalWithholding.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StateAndLocalWithholding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StateAndLocalWithholding` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("stateId") != null && !jsonObj.get("stateId").isJsonNull()) && !jsonObj.get("stateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateId").toString()));
      }
      if ((jsonObj.get("locality") != null && !jsonObj.get("locality").isJsonNull()) && !jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if ((jsonObj.get("localityId") != null && !jsonObj.get("localityId").isJsonNull()) && !jsonObj.get("localityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localityId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StateAndLocalWithholding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StateAndLocalWithholding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StateAndLocalWithholding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StateAndLocalWithholding.class));

       return (TypeAdapter<T>) new TypeAdapter<StateAndLocalWithholding>() {
           @Override
           public void write(JsonWriter out, StateAndLocalWithholding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StateAndLocalWithholding read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StateAndLocalWithholding given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StateAndLocalWithholding
   * @throws IOException if the JSON string is invalid with respect to StateAndLocalWithholding
   */
  public static StateAndLocalWithholding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StateAndLocalWithholding.class);
  }

  /**
   * Convert an instance of StateAndLocalWithholding to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

