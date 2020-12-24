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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * HotelAvailabilityResponseHotelsExtras
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-24T22:56:10.425Z[GMT]")
public class HotelAvailabilityResponseHotelsExtras {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("price")
  private Integer price = null;

  /**
   * Gets or Sets per
   */
  @JsonAdapter(PerEnum.Adapter.class)
  public enum PerEnum {
    PERSON("PER_PERSON"),
    BOOKING("PER_BOOKING"),
    NIGHT("PER_NIGHT");

    private String value;

    PerEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PerEnum fromValue(String text) {
      for (PerEnum b : PerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PerEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("per")
  private PerEnum per = null;

  public HotelAvailabilityResponseHotelsExtras id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public HotelAvailabilityResponseHotelsExtras name(String name) {
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

  public HotelAvailabilityResponseHotelsExtras price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public HotelAvailabilityResponseHotelsExtras per(PerEnum per) {
    this.per = per;
    return this;
  }

   /**
   * Get per
   * @return per
  **/
  @Schema(description = "")
  public PerEnum getPer() {
    return per;
  }

  public void setPer(PerEnum per) {
    this.per = per;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelAvailabilityResponseHotelsExtras hotelAvailabilityResponseHotelsExtras = (HotelAvailabilityResponseHotelsExtras) o;
    return Objects.equals(this.id, hotelAvailabilityResponseHotelsExtras.id) &&
        Objects.equals(this.name, hotelAvailabilityResponseHotelsExtras.name) &&
        Objects.equals(this.price, hotelAvailabilityResponseHotelsExtras.price) &&
        Objects.equals(this.per, hotelAvailabilityResponseHotelsExtras.per);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, per);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelAvailabilityResponseHotelsExtras {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    per: ").append(toIndentedString(per)).append("\n");
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
