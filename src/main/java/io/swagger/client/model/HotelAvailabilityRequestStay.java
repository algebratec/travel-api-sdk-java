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
import org.threeten.bp.LocalDate;
/**
 * HotelAvailabilityRequestStay
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-25T18:44:13.943Z[GMT]")
public class HotelAvailabilityRequestStay {
  @SerializedName("checkIn")
  private LocalDate checkIn = null;

  @SerializedName("checkOut")
  private LocalDate checkOut = null;

  public HotelAvailabilityRequestStay checkIn(LocalDate checkIn) {
    this.checkIn = checkIn;
    return this;
  }

   /**
   * Get checkIn
   * @return checkIn
  **/
  @Schema(description = "")
  public LocalDate getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(LocalDate checkIn) {
    this.checkIn = checkIn;
  }

  public HotelAvailabilityRequestStay checkOut(LocalDate checkOut) {
    this.checkOut = checkOut;
    return this;
  }

   /**
   * Get checkOut
   * @return checkOut
  **/
  @Schema(description = "")
  public LocalDate getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(LocalDate checkOut) {
    this.checkOut = checkOut;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelAvailabilityRequestStay hotelAvailabilityRequestStay = (HotelAvailabilityRequestStay) o;
    return Objects.equals(this.checkIn, hotelAvailabilityRequestStay.checkIn) &&
        Objects.equals(this.checkOut, hotelAvailabilityRequestStay.checkOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkIn, checkOut);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelAvailabilityRequestStay {\n");
    
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("    checkOut: ").append(toIndentedString(checkOut)).append("\n");
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
