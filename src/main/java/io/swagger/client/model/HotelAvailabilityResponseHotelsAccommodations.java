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
import io.swagger.client.model.HotelAvailabilityResponseHotelsRates;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HotelAvailabilityResponseHotelsAccommodations
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class HotelAvailabilityResponseHotelsAccommodations {
  @SerializedName("adults")
  private Integer adults = null;

  @SerializedName("children")
  private Integer children = null;

  @SerializedName("ages")
  private List<Integer> ages = null;

  @SerializedName("roomCode")
  private String roomCode = null;

  @SerializedName("rates")
  private List<HotelAvailabilityResponseHotelsRates> rates = null;

  public HotelAvailabilityResponseHotelsAccommodations adults(Integer adults) {
    this.adults = adults;
    return this;
  }

   /**
   * Get adults
   * @return adults
  **/
  @Schema(description = "")
  public Integer getAdults() {
    return adults;
  }

  public void setAdults(Integer adults) {
    this.adults = adults;
  }

  public HotelAvailabilityResponseHotelsAccommodations children(Integer children) {
    this.children = children;
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @Schema(description = "")
  public Integer getChildren() {
    return children;
  }

  public void setChildren(Integer children) {
    this.children = children;
  }

  public HotelAvailabilityResponseHotelsAccommodations ages(List<Integer> ages) {
    this.ages = ages;
    return this;
  }

  public HotelAvailabilityResponseHotelsAccommodations addAgesItem(Integer agesItem) {
    if (this.ages == null) {
      this.ages = new ArrayList<Integer>();
    }
    this.ages.add(agesItem);
    return this;
  }

   /**
   * Get ages
   * @return ages
  **/
  @Schema(description = "")
  public List<Integer> getAges() {
    return ages;
  }

  public void setAges(List<Integer> ages) {
    this.ages = ages;
  }

  public HotelAvailabilityResponseHotelsAccommodations roomCode(String roomCode) {
    this.roomCode = roomCode;
    return this;
  }

   /**
   * Get roomCode
   * @return roomCode
  **/
  @Schema(description = "")
  public String getRoomCode() {
    return roomCode;
  }

  public void setRoomCode(String roomCode) {
    this.roomCode = roomCode;
  }

  public HotelAvailabilityResponseHotelsAccommodations rates(List<HotelAvailabilityResponseHotelsRates> rates) {
    this.rates = rates;
    return this;
  }

  public HotelAvailabilityResponseHotelsAccommodations addRatesItem(HotelAvailabilityResponseHotelsRates ratesItem) {
    if (this.rates == null) {
      this.rates = new ArrayList<HotelAvailabilityResponseHotelsRates>();
    }
    this.rates.add(ratesItem);
    return this;
  }

   /**
   * Get rates
   * @return rates
  **/
  @Schema(description = "")
  public List<HotelAvailabilityResponseHotelsRates> getRates() {
    return rates;
  }

  public void setRates(List<HotelAvailabilityResponseHotelsRates> rates) {
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
    HotelAvailabilityResponseHotelsAccommodations hotelAvailabilityResponseHotelsAccommodations = (HotelAvailabilityResponseHotelsAccommodations) o;
    return Objects.equals(this.adults, hotelAvailabilityResponseHotelsAccommodations.adults) &&
        Objects.equals(this.children, hotelAvailabilityResponseHotelsAccommodations.children) &&
        Objects.equals(this.ages, hotelAvailabilityResponseHotelsAccommodations.ages) &&
        Objects.equals(this.roomCode, hotelAvailabilityResponseHotelsAccommodations.roomCode) &&
        Objects.equals(this.rates, hotelAvailabilityResponseHotelsAccommodations.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adults, children, ages, roomCode, rates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelAvailabilityResponseHotelsAccommodations {\n");
    
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    ages: ").append(toIndentedString(ages)).append("\n");
    sb.append("    roomCode: ").append(toIndentedString(roomCode)).append("\n");
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
