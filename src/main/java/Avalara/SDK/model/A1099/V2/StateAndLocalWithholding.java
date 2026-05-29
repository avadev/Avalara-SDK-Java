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
 * ## Authentication  #### Step 1: Generate API Credentials  Generate a *client ID* and *client secret* from your [Avalara1099 account](https://sbx.track1099.com/api_tokens): *Your Profile → API*.  #### Step 2: Get an Identity Token  Send a `POST` request to the **Identity Token URL** with your *client ID* and *client secret* from Step 1 as form-encoded parameters:  ```http POST https://identity.avalara.com/connect/token Content-Type: application/x-www-form-urlencoded  grant_type=client_credentials client_id=<your client ID> client_secret=<your client secret> ```  **Body parameters** - `grant_type` — Always `client_credentials` - `client_id` — Your *client ID* from Step 1 - `client_secret` — Your *client secret* from Step 1  **Successful response**  ```json {   \"access_token\": \"eyJhbGci...\",   \"expires_in\": 3600,   \"token_type\": \"Bearer\" } ```  Use the `access_token` as a bearer token in the `Authorization` header on every A1099 API request:  ```http Authorization: Bearer <access_token> ```  ---  For more on authenticating requests, see the [A1099 authentication guide](https://developer.avalara.com/1099-and-w-9/kny2997001535374/).  ---  ## Environments  #### Production - **Avalara 1099 API URL:** [`https://api.avalara.com/avalara1099`](https://api.avalara.com/avalara1099) - **Identity Token URL:** [`https://identity.avalara.com/connect/token`](https://identity.avalara.com/connect/token)  #### Sandbox - **Avalara 1099 API URL:** [`https://api.sbx.avalara.com/avalara1099`](https://api.sbx.avalara.com/avalara1099) - **Identity Token URL:** [`https://ai-sbx.avlr.sh/connect/token`](https://ai-sbx.avlr.sh/connect/token)  ---  ## API & SDK Documentation  [Avalara 1099 API Reference](https://developer.avalara.com/api-reference/avalara1099/avalara1099/)  [Avalara SDKs](https://developer.avalara.com/sdk/)  [Swagger](https://api.avalara.com/avalara1099/swagger/index.html?api-version=2.0)
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

