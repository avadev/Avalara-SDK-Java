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

  public static final String SERIALIZED_NAME_STATE_ID_NUMBER = "stateIdNumber";
  @SerializedName(SERIALIZED_NAME_STATE_ID_NUMBER)
  private String stateIdNumber;

  public static final String SERIALIZED_NAME_STATE_INCOME = "stateIncome";
  @SerializedName(SERIALIZED_NAME_STATE_INCOME)
  private Double stateIncome;

  public static final String SERIALIZED_NAME_LOCAL_TAX_WITHHELD = "localTaxWithheld";
  @SerializedName(SERIALIZED_NAME_LOCAL_TAX_WITHHELD)
  private Double localTaxWithheld;

  public static final String SERIALIZED_NAME_LOCALITY = "locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_LOCALITY_ID_NUMBER = "localityIdNumber";
  @SerializedName(SERIALIZED_NAME_LOCALITY_ID_NUMBER)
  private String localityIdNumber;

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


  public StateAndLocalWithholding stateIdNumber(String stateIdNumber) {
    this.stateIdNumber = stateIdNumber;
    return this;
  }

  /**
   * State ID number of the entity issuing the form
   * @return stateIdNumber
   */
  @javax.annotation.Nullable
  public String getStateIdNumber() {
    return stateIdNumber;
  }

  public void setStateIdNumber(String stateIdNumber) {
    this.stateIdNumber = stateIdNumber;
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


  public StateAndLocalWithholding localityIdNumber(String localityIdNumber) {
    this.localityIdNumber = localityIdNumber;
    return this;
  }

  /**
   * Locality ID number of the entity issuing the form
   * @return localityIdNumber
   */
  @javax.annotation.Nullable
  public String getLocalityIdNumber() {
    return localityIdNumber;
  }

  public void setLocalityIdNumber(String localityIdNumber) {
    this.localityIdNumber = localityIdNumber;
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
        Objects.equals(this.stateIdNumber, stateAndLocalWithholding.stateIdNumber) &&
        Objects.equals(this.stateIncome, stateAndLocalWithholding.stateIncome) &&
        Objects.equals(this.localTaxWithheld, stateAndLocalWithholding.localTaxWithheld) &&
        Objects.equals(this.locality, stateAndLocalWithholding.locality) &&
        Objects.equals(this.localityIdNumber, stateAndLocalWithholding.localityIdNumber) &&
        Objects.equals(this.localIncome, stateAndLocalWithholding.localIncome);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateTaxWithheld, state, stateIdNumber, stateIncome, localTaxWithheld, locality, localityIdNumber, localIncome);
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
    sb.append("    stateIdNumber: ").append(toIndentedString(stateIdNumber)).append("\n");
    sb.append("    stateIncome: ").append(toIndentedString(stateIncome)).append("\n");
    sb.append("    localTaxWithheld: ").append(toIndentedString(localTaxWithheld)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    localityIdNumber: ").append(toIndentedString(localityIdNumber)).append("\n");
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
    openapiFields.add("stateIdNumber");
    openapiFields.add("stateIncome");
    openapiFields.add("localTaxWithheld");
    openapiFields.add("locality");
    openapiFields.add("localityIdNumber");
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
      if ((jsonObj.get("stateIdNumber") != null && !jsonObj.get("stateIdNumber").isJsonNull()) && !jsonObj.get("stateIdNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateIdNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateIdNumber").toString()));
      }
      if ((jsonObj.get("locality") != null && !jsonObj.get("locality").isJsonNull()) && !jsonObj.get("locality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locality").toString()));
      }
      if ((jsonObj.get("localityIdNumber") != null && !jsonObj.get("localityIdNumber").isJsonNull()) && !jsonObj.get("localityIdNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localityIdNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localityIdNumber").toString()));
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

