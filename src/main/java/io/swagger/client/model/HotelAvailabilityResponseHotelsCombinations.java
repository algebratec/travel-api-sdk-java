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
import io.swagger.client.model.FlightAvailabilitySubRecommendationBounds;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HotelAvailabilityResponseHotelsCombinations
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class HotelAvailabilityResponseHotelsCombinations {
  @SerializedName("rooms")
  private List<FlightAvailabilitySubRecommendationBounds> rooms = null;

  public HotelAvailabilityResponseHotelsCombinations rooms(List<FlightAvailabilitySubRecommendationBounds> rooms) {
    this.rooms = rooms;
    return this;
  }

  public HotelAvailabilityResponseHotelsCombinations addRoomsItem(FlightAvailabilitySubRecommendationBounds roomsItem) {
    if (this.rooms == null) {
      this.rooms = new ArrayList<FlightAvailabilitySubRecommendationBounds>();
    }
    this.rooms.add(roomsItem);
    return this;
  }

   /**
   * Get rooms
   * @return rooms
  **/
  @Schema(description = "")
  public List<FlightAvailabilitySubRecommendationBounds> getRooms() {
    return rooms;
  }

  public void setRooms(List<FlightAvailabilitySubRecommendationBounds> rooms) {
    this.rooms = rooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelAvailabilityResponseHotelsCombinations hotelAvailabilityResponseHotelsCombinations = (HotelAvailabilityResponseHotelsCombinations) o;
    return Objects.equals(this.rooms, hotelAvailabilityResponseHotelsCombinations.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rooms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelAvailabilityResponseHotelsCombinations {\n");
    
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
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
