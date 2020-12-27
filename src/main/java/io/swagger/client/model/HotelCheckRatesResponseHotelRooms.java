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
import io.swagger.client.model.HotelCheckRatesResponseHotelRates;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HotelCheckRatesResponseHotelRooms
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class HotelCheckRatesResponseHotelRooms {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rates")
  private List<HotelCheckRatesResponseHotelRates> rates = null;

  public HotelCheckRatesResponseHotelRooms code(String code) {
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

  public HotelCheckRatesResponseHotelRooms name(String name) {
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

  public HotelCheckRatesResponseHotelRooms rates(List<HotelCheckRatesResponseHotelRates> rates) {
    this.rates = rates;
    return this;
  }

  public HotelCheckRatesResponseHotelRooms addRatesItem(HotelCheckRatesResponseHotelRates ratesItem) {
    if (this.rates == null) {
      this.rates = new ArrayList<HotelCheckRatesResponseHotelRates>();
    }
    this.rates.add(ratesItem);
    return this;
  }

   /**
   * Get rates
   * @return rates
  **/
  @Schema(description = "")
  public List<HotelCheckRatesResponseHotelRates> getRates() {
    return rates;
  }

  public void setRates(List<HotelCheckRatesResponseHotelRates> rates) {
    this.rates = rates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelCheckRatesResponseHotelRooms hotelCheckRatesResponseHotelRooms = (HotelCheckRatesResponseHotelRooms) o;
    return Objects.equals(this.code, hotelCheckRatesResponseHotelRooms.code) &&
        Objects.equals(this.name, hotelCheckRatesResponseHotelRooms.name) &&
        Objects.equals(this.rates, hotelCheckRatesResponseHotelRooms.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, rates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelCheckRatesResponseHotelRooms {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
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
