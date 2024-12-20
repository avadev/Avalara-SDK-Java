/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2022 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * Avalara E-Invoicing API
 *
 * An API that supports sending data for an E-Invoicing compliance use-case.
 *
 * @author     Sachin Baijal <sachin.baijal@avalara.com>
 * @author     Jonathan Wenger <jonathan.wenger@avalara.com>
 * @copyright  2004-2022 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    
 * @link       https://github.com/avadev/AvaTax-REST-V3-JRE-SDK
 */

package Avalara.SDK.model.EInvoicing.V1;

import java.util.Objects;
import Avalara.SDK.model.EInvoicing.V1.DirectorySearchResponseValueInnerAddressesInner;
import Avalara.SDK.model.EInvoicing.V1.DirectorySearchResponseValueInnerIdentifiersInner;
import Avalara.SDK.model.EInvoicing.V1.DirectorySearchResponseValueInnerSupportedDocumentTypesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * DirectorySearchResponseValueInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class DirectorySearchResponseValueInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_REGISTRATION_DATE = "registrationDate";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_DATE)
  private LocalDate registrationDate;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<DirectorySearchResponseValueInnerIdentifiersInner> identifiers = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<DirectorySearchResponseValueInnerAddressesInner> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES = "supportedDocumentTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES)
  private List<DirectorySearchResponseValueInnerSupportedDocumentTypesInner> supportedDocumentTypes = new ArrayList<>();

  public DirectorySearchResponseValueInner() {
  }

  public DirectorySearchResponseValueInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Avalara unique ID of the participant in the directory.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public DirectorySearchResponseValueInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the participant (typically, the name of the business entity).
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public DirectorySearchResponseValueInner network(String network) {
    this.network = network;
    return this;
  }

  /**
   * The network where the participant is present.
   * @return network
   */
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }


  public DirectorySearchResponseValueInner registrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Registration date of the participant if available
   * @return registrationDate
   */
  @javax.annotation.Nullable
  public LocalDate getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(LocalDate registrationDate) {
    this.registrationDate = registrationDate;
  }


  public DirectorySearchResponseValueInner identifiers(List<DirectorySearchResponseValueInnerIdentifiersInner> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public DirectorySearchResponseValueInner addIdentifiersItem(DirectorySearchResponseValueInnerIdentifiersInner identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

  /**
   * Get identifiers
   * @return identifiers
   */
  @javax.annotation.Nullable
  public List<DirectorySearchResponseValueInnerIdentifiersInner> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(List<DirectorySearchResponseValueInnerIdentifiersInner> identifiers) {
    this.identifiers = identifiers;
  }


  public DirectorySearchResponseValueInner addresses(List<DirectorySearchResponseValueInnerAddressesInner> addresses) {
    this.addresses = addresses;
    return this;
  }

  public DirectorySearchResponseValueInner addAddressesItem(DirectorySearchResponseValueInnerAddressesInner addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
   */
  @javax.annotation.Nullable
  public List<DirectorySearchResponseValueInnerAddressesInner> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<DirectorySearchResponseValueInnerAddressesInner> addresses) {
    this.addresses = addresses;
  }


  public DirectorySearchResponseValueInner supportedDocumentTypes(List<DirectorySearchResponseValueInnerSupportedDocumentTypesInner> supportedDocumentTypes) {
    this.supportedDocumentTypes = supportedDocumentTypes;
    return this;
  }

  public DirectorySearchResponseValueInner addSupportedDocumentTypesItem(DirectorySearchResponseValueInnerSupportedDocumentTypesInner supportedDocumentTypesItem) {
    if (this.supportedDocumentTypes == null) {
      this.supportedDocumentTypes = new ArrayList<>();
    }
    this.supportedDocumentTypes.add(supportedDocumentTypesItem);
    return this;
  }

  /**
   * Get supportedDocumentTypes
   * @return supportedDocumentTypes
   */
  @javax.annotation.Nullable
  public List<DirectorySearchResponseValueInnerSupportedDocumentTypesInner> getSupportedDocumentTypes() {
    return supportedDocumentTypes;
  }

  public void setSupportedDocumentTypes(List<DirectorySearchResponseValueInnerSupportedDocumentTypesInner> supportedDocumentTypes) {
    this.supportedDocumentTypes = supportedDocumentTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectorySearchResponseValueInner directorySearchResponseValueInner = (DirectorySearchResponseValueInner) o;
    return Objects.equals(this.id, directorySearchResponseValueInner.id) &&
        Objects.equals(this.name, directorySearchResponseValueInner.name) &&
        Objects.equals(this.network, directorySearchResponseValueInner.network) &&
        Objects.equals(this.registrationDate, directorySearchResponseValueInner.registrationDate) &&
        Objects.equals(this.identifiers, directorySearchResponseValueInner.identifiers) &&
        Objects.equals(this.addresses, directorySearchResponseValueInner.addresses) &&
        Objects.equals(this.supportedDocumentTypes, directorySearchResponseValueInner.supportedDocumentTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, network, registrationDate, identifiers, addresses, supportedDocumentTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectorySearchResponseValueInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    supportedDocumentTypes: ").append(toIndentedString(supportedDocumentTypes)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("network");
    openapiFields.add("registrationDate");
    openapiFields.add("identifiers");
    openapiFields.add("addresses");
    openapiFields.add("supportedDocumentTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DirectorySearchResponseValueInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DirectorySearchResponseValueInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DirectorySearchResponseValueInner is not found in the empty JSON string", DirectorySearchResponseValueInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DirectorySearchResponseValueInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DirectorySearchResponseValueInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if (jsonObj.get("identifiers") != null && !jsonObj.get("identifiers").isJsonNull()) {
        JsonArray jsonArrayidentifiers = jsonObj.getAsJsonArray("identifiers");
        if (jsonArrayidentifiers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("identifiers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("identifiers").toString()));
          }

          // validate the optional field `identifiers` (array)
          for (int i = 0; i < jsonArrayidentifiers.size(); i++) {
            DirectorySearchResponseValueInnerIdentifiersInner.validateJsonElement(jsonArrayidentifiers.get(i));
          };
        }
      }
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonNull()) {
        JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
        if (jsonArrayaddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
          }

          // validate the optional field `addresses` (array)
          for (int i = 0; i < jsonArrayaddresses.size(); i++) {
            DirectorySearchResponseValueInnerAddressesInner.validateJsonElement(jsonArrayaddresses.get(i));
          };
        }
      }
      if (jsonObj.get("supportedDocumentTypes") != null && !jsonObj.get("supportedDocumentTypes").isJsonNull()) {
        JsonArray jsonArraysupportedDocumentTypes = jsonObj.getAsJsonArray("supportedDocumentTypes");
        if (jsonArraysupportedDocumentTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("supportedDocumentTypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `supportedDocumentTypes` to be an array in the JSON string but got `%s`", jsonObj.get("supportedDocumentTypes").toString()));
          }

          // validate the optional field `supportedDocumentTypes` (array)
          for (int i = 0; i < jsonArraysupportedDocumentTypes.size(); i++) {
            DirectorySearchResponseValueInnerSupportedDocumentTypesInner.validateJsonElement(jsonArraysupportedDocumentTypes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DirectorySearchResponseValueInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DirectorySearchResponseValueInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DirectorySearchResponseValueInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DirectorySearchResponseValueInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DirectorySearchResponseValueInner>() {
           @Override
           public void write(JsonWriter out, DirectorySearchResponseValueInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DirectorySearchResponseValueInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DirectorySearchResponseValueInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DirectorySearchResponseValueInner
   * @throws IOException if the JSON string is invalid with respect to DirectorySearchResponseValueInner
   */
  public static DirectorySearchResponseValueInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DirectorySearchResponseValueInner.class);
  }

  /**
   * Convert an instance of DirectorySearchResponseValueInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

