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
import io.swagger.client.model.FlightAvailabilityFareDetailsFares;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FlightAvailabilityFareDetails
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class FlightAvailabilityFareDetails {
  @SerializedName("availableStatus")
  private String availableStatus = null;

  @SerializedName("cabin")
  private String cabin = null;

  @SerializedName("fares")
  private FlightAvailabilityFareDetailsFares fares = null;

  @SerializedName("reservationClass")
  private String reservationClass = null;

  public FlightAvailabilityFareDetails availableStatus(String availableStatus) {
    this.availableStatus = availableStatus;
    return this;
  }

   /**
   * Get availableStatus
   * @return availableStatus
  **/
  @Schema(description = "")
  public String getAvailableStatus() {
    return availableStatus;
  }

  public void setAvailableStatus(String availableStatus) {
    this.availableStatus = availableStatus;
  }

  public FlightAvailabilityFareDetails cabin(String cabin) {
    this.cabin = cabin;
    return this;
  }

   /**
   * Get cabin
   * @return cabin
  **/
  @Schema(description = "")
  public String getCabin() {
    return cabin;
  }

  public void setCabin(String cabin) {
    this.cabin = cabin;
  }

  public FlightAvailabilityFareDetails fares(FlightAvailabilityFareDetailsFares fares) {
    this.fares = fares;
    return this;
  }

   /**
   * Get fares
   * @return fares
  **/
  @Schema(description = "")
  public FlightAvailabilityFareDetailsFares getFares() {
    return fares;
  }

  public void setFares(FlightAvailabilityFareDetailsFares fares) {
    this.fares = fares;
  }

  public FlightAvailabilityFareDetails reservationClass(String reservationClass) {
    this.reservationClass = reservationClass;
    return this;
  }

   /**
   * Get reservationClass
   * @return reservationClass
  **/
  @Schema(description = "")
  public String getReservationClass() {
    return reservationClass;
  }

  public void setReservationClass(String reservationClass) {
    this.reservationClass = reservationClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightAvailabilityFareDetails flightAvailabilityFareDetails = (FlightAvailabilityFareDetails) o;
    return Objects.equals(this.availableStatus, flightAvailabilityFareDetails.availableStatus) &&
        Objects.equals(this.cabin, flightAvailabilityFareDetails.cabin) &&
        Objects.equals(this.fares, flightAvailabilityFareDetails.fares) &&
        Objects.equals(this.reservationClass, flightAvailabilityFareDetails.reservationClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableStatus, cabin, fares, reservationClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightAvailabilityFareDetails {\n");
    
    sb.append("    availableStatus: ").append(toIndentedString(availableStatus)).append("\n");
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    fares: ").append(toIndentedString(fares)).append("\n");
    sb.append("    reservationClass: ").append(toIndentedString(reservationClass)).append("\n");
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
