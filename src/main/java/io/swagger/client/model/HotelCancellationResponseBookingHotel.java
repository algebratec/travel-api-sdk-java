/*
 * Algebratec API
 * Learn and test our api with ease
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@algebratec.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.HotelCancellationResponseBookingHotelRooms;
import io.swagger.client.model.HotelConfirmationResponseBookingHotelExtras;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HotelCancellationResponseBookingHotel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class HotelCancellationResponseBookingHotel {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("providerName")
  private String providerName = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("mail")
  private String mail = null;

  @SerializedName("fax")
  private String fax = null;

  @SerializedName("image")
  private String image = null;

  /**
   * Gets or Sets category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    _1EST("1est"),
    _2EST("2est"),
    _3SET("3set"),
    _4EST("4est"),
    _5EST("5est");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("zoneCode")
  private String zoneCode = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  @SerializedName("zoneName")
  private String zoneName = null;

  @SerializedName("rooms")
  private List<HotelCancellationResponseBookingHotelRooms> rooms = null;

  @SerializedName("Extras")
  private List<HotelConfirmationResponseBookingHotelExtras> extras = null;

  public HotelCancellationResponseBookingHotel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public HotelCancellationResponseBookingHotel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HotelCancellationResponseBookingHotel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HotelCancellationResponseBookingHotel providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Get providerName
   * @return providerName
  **/
  @Schema(description = "")
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public HotelCancellationResponseBookingHotel address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public HotelCancellationResponseBookingHotel country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public HotelCancellationResponseBookingHotel phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(description = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public HotelCancellationResponseBookingHotel mail(String mail) {
    this.mail = mail;
    return this;
  }

   /**
   * Get mail
   * @return mail
  **/
  @Schema(description = "")
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public HotelCancellationResponseBookingHotel fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @Schema(description = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public HotelCancellationResponseBookingHotel image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @Schema(description = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public HotelCancellationResponseBookingHotel category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public HotelCancellationResponseBookingHotel zoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
    return this;
  }

   /**
   * Get zoneCode
   * @return zoneCode
  **/
  @Schema(description = "")
  public String getZoneCode() {
    return zoneCode;
  }

  public void setZoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
  }

  public HotelCancellationResponseBookingHotel latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @Schema(description = "")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public HotelCancellationResponseBookingHotel longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @Schema(description = "")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public HotelCancellationResponseBookingHotel zoneName(String zoneName) {
    this.zoneName = zoneName;
    return this;
  }

   /**
   * Get zoneName
   * @return zoneName
  **/
  @Schema(description = "")
  public String getZoneName() {
    return zoneName;
  }

  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }

  public HotelCancellationResponseBookingHotel rooms(List<HotelCancellationResponseBookingHotelRooms> rooms) {
    this.rooms = rooms;
    return this;
  }

  public HotelCancellationResponseBookingHotel addRoomsItem(HotelCancellationResponseBookingHotelRooms roomsItem) {
    if (this.rooms == null) {
      this.rooms = new ArrayList<HotelCancellationResponseBookingHotelRooms>();
    }
    this.rooms.add(roomsItem);
    return this;
  }

   /**
   * Get rooms
   * @return rooms
  **/
  @Schema(description = "")
  public List<HotelCancellationResponseBookingHotelRooms> getRooms() {
    return rooms;
  }

  public void setRooms(List<HotelCancellationResponseBookingHotelRooms> rooms) {
    this.rooms = rooms;
  }

  public HotelCancellationResponseBookingHotel extras(List<HotelConfirmationResponseBookingHotelExtras> extras) {
    this.extras = extras;
    return this;
  }

  public HotelCancellationResponseBookingHotel addExtrasItem(HotelConfirmationResponseBookingHotelExtras extrasItem) {
    if (this.extras == null) {
      this.extras = new ArrayList<HotelConfirmationResponseBookingHotelExtras>();
    }
    this.extras.add(extrasItem);
    return this;
  }

   /**
   * Get extras
   * @return extras
  **/
  @Schema(description = "")
  public List<HotelConfirmationResponseBookingHotelExtras> getExtras() {
    return extras;
  }

  public void setExtras(List<HotelConfirmationResponseBookingHotelExtras> extras) {
    this.extras = extras;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelCancellationResponseBookingHotel hotelCancellationResponseBookingHotel = (HotelCancellationResponseBookingHotel) o;
    return Objects.equals(this.code, hotelCancellationResponseBookingHotel.code) &&
        Objects.equals(this.name, hotelCancellationResponseBookingHotel.name) &&
        Objects.equals(this.description, hotelCancellationResponseBookingHotel.description) &&
        Objects.equals(this.providerName, hotelCancellationResponseBookingHotel.providerName) &&
        Objects.equals(this.address, hotelCancellationResponseBookingHotel.address) &&
        Objects.equals(this.country, hotelCancellationResponseBookingHotel.country) &&
        Objects.equals(this.phone, hotelCancellationResponseBookingHotel.phone) &&
        Objects.equals(this.mail, hotelCancellationResponseBookingHotel.mail) &&
        Objects.equals(this.fax, hotelCancellationResponseBookingHotel.fax) &&
        Objects.equals(this.image, hotelCancellationResponseBookingHotel.image) &&
        Objects.equals(this.category, hotelCancellationResponseBookingHotel.category) &&
        Objects.equals(this.zoneCode, hotelCancellationResponseBookingHotel.zoneCode) &&
        Objects.equals(this.latitude, hotelCancellationResponseBookingHotel.latitude) &&
        Objects.equals(this.longitude, hotelCancellationResponseBookingHotel.longitude) &&
        Objects.equals(this.zoneName, hotelCancellationResponseBookingHotel.zoneName) &&
        Objects.equals(this.rooms, hotelCancellationResponseBookingHotel.rooms) &&
        Objects.equals(this.extras, hotelCancellationResponseBookingHotel.extras);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description, providerName, address, country, phone, mail, fax, image, category, zoneCode, latitude, longitude, zoneName, rooms, extras);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelCancellationResponseBookingHotel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    zoneCode: ").append(toIndentedString(zoneCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
