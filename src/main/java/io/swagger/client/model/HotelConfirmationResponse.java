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
import io.swagger.client.model.AlgebratecResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.HotelConfirmationResponseBooking;
import io.swagger.client.model.Provider;
import io.swagger.client.model.Supplier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * HotelConfirmationResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class HotelConfirmationResponse extends AlgebratecResponse {
  @SerializedName("booking")
  private HotelConfirmationResponseBooking booking = null;

  public HotelConfirmationResponse booking(HotelConfirmationResponseBooking booking) {
    this.booking = booking;
    return this;
  }

   /**
   * Get booking
   * @return booking
  **/
  @Schema(description = "")
  public HotelConfirmationResponseBooking getBooking() {
    return booking;
  }

  public void setBooking(HotelConfirmationResponseBooking booking) {
    this.booking = booking;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelConfirmationResponse hotelConfirmationResponse = (HotelConfirmationResponse) o;
    return Objects.equals(this.booking, hotelConfirmationResponse.booking) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booking, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelConfirmationResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    booking: ").append(toIndentedString(booking)).append("\n");
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
