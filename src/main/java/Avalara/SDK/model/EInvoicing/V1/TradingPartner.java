/*
 * AvaTax Software Development Kit for Java (JRE)
 *
 * (c) 2004-2025 Avalara, Inc.
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
 * @copyright  2004-2025 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/Avalara-SDK-Java
 */

package Avalara.SDK.model.EInvoicing.V1;

import java.util.Objects;
import Avalara.SDK.model.EInvoicing.V1.Address;
import Avalara.SDK.model.EInvoicing.V1.Consents;
import Avalara.SDK.model.EInvoicing.V1.Extension;
import Avalara.SDK.model.EInvoicing.V1.Identifier;
import Avalara.SDK.model.EInvoicing.V1.SupportedDocumentTypes;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Represents a participant in the Avalara directory.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class TradingPartner {
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
  private String registrationDate;

  public static final String SERIALIZED_NAME_IDENTIFIERS = "identifiers";
  @SerializedName(SERIALIZED_NAME_IDENTIFIERS)
  private List<Identifier> identifiers;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<Address> addresses;

  public static final String SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES = "supportedDocumentTypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_DOCUMENT_TYPES)
  private List<SupportedDocumentTypes> supportedDocumentTypes;

  public static final String SERIALIZED_NAME_CONSENTS = "consents";
  @SerializedName(SERIALIZED_NAME_CONSENTS)
  private Consents consents;

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private List<Extension> extensions;

  public TradingPartner() {
  }

  public TradingPartner(
     String id, 
     String network
  ) {
    this();
    this.id = id;
    this.network = network;
  }

  /**
   * Avalara unique ID of the participant in the directory.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }



  public TradingPartner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the participant (typically, the name of the business entity).
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  /**
   * The network where the participant is present. When creating or updating a trading partner, the value provided for the attribute &#39;network&#39; will be ignored.
   * @return network
   */
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }



  public TradingPartner registrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
    return this;
  }

  /**
   * Registration date of the participant if available.
   * @return registrationDate
   */
  @javax.annotation.Nullable
  public String getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(String registrationDate) {
    this.registrationDate = registrationDate;
  }


  public TradingPartner identifiers(List<Identifier> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public TradingPartner addIdentifiersItem(Identifier identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

  /**
   * A list of identifiers associated with the trading partner. Each identifier should consistently include the fields name, and value to maintain clarity and ensure consistent structure across entries. When creating or updating a trading partner, the attribute &#39;name&#39; must be agreed upon with Avalara to ensure consistency. Failing to adhere to the agreed values will result in a validation error. Further, when creating or updating a trading partner, the value provided for the attribute &#39;displayName&#39; will be ignored and instead retrieved from the standard set of display names maintained.
   * @return identifiers
   */
  @javax.annotation.Nonnull
  public List<Identifier> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(List<Identifier> identifiers) {
    this.identifiers = identifiers;
  }


  public TradingPartner addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public TradingPartner addAddressesItem(Address addressesItem) {
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
  @javax.annotation.Nonnull
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  public TradingPartner supportedDocumentTypes(List<SupportedDocumentTypes> supportedDocumentTypes) {
    this.supportedDocumentTypes = supportedDocumentTypes;
    return this;
  }

  public TradingPartner addSupportedDocumentTypesItem(SupportedDocumentTypes supportedDocumentTypesItem) {
    if (this.supportedDocumentTypes == null) {
      this.supportedDocumentTypes = new ArrayList<>();
    }
    this.supportedDocumentTypes.add(supportedDocumentTypesItem);
    return this;
  }

  /**
   * A list of document types supported by the trading partner for exchange. Each document type identifier value must match the standard list maintained by Avalara, which includes Peppol and other public network document type identifier schemes and values, as well as any approved partner-specific identifiers. The &#39;value&#39; field must exactly match an entry from the provided document identifier list. Any attempt to submit unsupported document types will result in a validation error. Further, when creating or updating a trading partner, the value provided for the attributes &#39;name&#39; and &#39;supportedByAvalara&#39; will be ignored.
   * @return supportedDocumentTypes
   */
  @javax.annotation.Nonnull
  public List<SupportedDocumentTypes> getSupportedDocumentTypes() {
    return supportedDocumentTypes;
  }

  public void setSupportedDocumentTypes(List<SupportedDocumentTypes> supportedDocumentTypes) {
    this.supportedDocumentTypes = supportedDocumentTypes;
  }


  public TradingPartner consents(Consents consents) {
    this.consents = consents;
    return this;
  }

  /**
   * Get consents
   * @return consents
   */
  @javax.annotation.Nullable
  public Consents getConsents() {
    return consents;
  }

  public void setConsents(Consents consents) {
    this.consents = consents;
  }


  public TradingPartner extensions(List<Extension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public TradingPartner addExtensionsItem(Extension extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

  /**
   * Optional array used to carry additional metadata or configuration values that may be required by specific networks. When creating or updating a trading partner, the keys provided in the &#39;extensions&#39; attribute must be selected from a predefined list of supported extensions. Using any unsupported keys will result in a validation error.
   * @return extensions
   */
  @javax.annotation.Nullable
  public List<Extension> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Extension> extensions) {
    this.extensions = extensions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradingPartner tradingPartner = (TradingPartner) o;
    return Objects.equals(this.id, tradingPartner.id) &&
        Objects.equals(this.name, tradingPartner.name) &&
        Objects.equals(this.network, tradingPartner.network) &&
        Objects.equals(this.registrationDate, tradingPartner.registrationDate) &&
        Objects.equals(this.identifiers, tradingPartner.identifiers) &&
        Objects.equals(this.addresses, tradingPartner.addresses) &&
        Objects.equals(this.supportedDocumentTypes, tradingPartner.supportedDocumentTypes) &&
        Objects.equals(this.consents, tradingPartner.consents) &&
        Objects.equals(this.extensions, tradingPartner.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, network, registrationDate, identifiers, addresses, supportedDocumentTypes, consents, extensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradingPartner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    supportedDocumentTypes: ").append(toIndentedString(supportedDocumentTypes)).append("\n");
    sb.append("    consents: ").append(toIndentedString(consents)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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
    openapiFields.add("consents");
    openapiFields.add("extensions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("identifiers");
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("supportedDocumentTypes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TradingPartner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TradingPartner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TradingPartner is not found in the empty JSON string", TradingPartner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TradingPartner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TradingPartner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TradingPartner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if ((jsonObj.get("registrationDate") != null && !jsonObj.get("registrationDate").isJsonNull()) && !jsonObj.get("registrationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrationDate").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("identifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `identifiers` to be an array in the JSON string but got `%s`", jsonObj.get("identifiers").toString()));
      }

      JsonArray jsonArrayidentifiers = jsonObj.getAsJsonArray("identifiers");
      // validate the required field `identifiers` (array)
      for (int i = 0; i < jsonArrayidentifiers.size(); i++) {
        Identifier.validateJsonElement(jsonArrayidentifiers.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }

      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      // validate the required field `addresses` (array)
      for (int i = 0; i < jsonArrayaddresses.size(); i++) {
        Address.validateJsonElement(jsonArrayaddresses.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("supportedDocumentTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportedDocumentTypes` to be an array in the JSON string but got `%s`", jsonObj.get("supportedDocumentTypes").toString()));
      }

      JsonArray jsonArraysupportedDocumentTypes = jsonObj.getAsJsonArray("supportedDocumentTypes");
      // validate the required field `supportedDocumentTypes` (array)
      for (int i = 0; i < jsonArraysupportedDocumentTypes.size(); i++) {
        SupportedDocumentTypes.validateJsonElement(jsonArraysupportedDocumentTypes.get(i));
      };
      // validate the optional field `consents`
      if (jsonObj.get("consents") != null && !jsonObj.get("consents").isJsonNull()) {
        Consents.validateJsonElement(jsonObj.get("consents"));
      }
      if (jsonObj.get("extensions") != null && !jsonObj.get("extensions").isJsonNull()) {
        JsonArray jsonArrayextensions = jsonObj.getAsJsonArray("extensions");
        if (jsonArrayextensions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extensions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extensions` to be an array in the JSON string but got `%s`", jsonObj.get("extensions").toString()));
          }

          // validate the optional field `extensions` (array)
          for (int i = 0; i < jsonArrayextensions.size(); i++) {
            Extension.validateJsonElement(jsonArrayextensions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TradingPartner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TradingPartner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TradingPartner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TradingPartner.class));

       return (TypeAdapter<T>) new TypeAdapter<TradingPartner>() {
           @Override
           public void write(JsonWriter out, TradingPartner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TradingPartner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TradingPartner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TradingPartner
   * @throws IOException if the JSON string is invalid with respect to TradingPartner
   */
  public static TradingPartner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TradingPartner.class);
  }

  /**
   * Convert an instance of TradingPartner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

