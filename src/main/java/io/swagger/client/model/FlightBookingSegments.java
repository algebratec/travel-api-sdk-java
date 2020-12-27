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
import io.swagger.client.model.FlightBookingArrivalLocation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FlightBookingSegments
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class FlightBookingSegments {
  @SerializedName("arrivalTerminal")
  private String arrivalTerminal = null;

  @SerializedName("arrival_date")
  private String arrivalDate = null;

  @SerializedName("arrival_location")
  private FlightBookingArrivalLocation arrivalLocation = null;

  @SerializedName("arrival_time")
  private String arrivalTime = null;

  @SerializedName("baggage_info")
  private String baggageInfo = null;

  @SerializedName("booking_class")
  private String bookingClass = null;

  @SerializedName("bound_id")
  private Integer boundId = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("departureTerminal")
  private String departureTerminal = null;

  @SerializedName("departure_date")
  private String departureDate = null;

  @SerializedName("departure_location")
  private FlightBookingArrivalLocation departureLocation = null;

  @SerializedName("departure_time")
  private String departureTime = null;

  @SerializedName("flight_equipment")
  private String flightEquipment = null;

  @SerializedName("flight_number")
  private String flightNumber = null;

  @SerializedName("id")
  private Integer id = null;

  public FlightBookingSegments arrivalTerminal(String arrivalTerminal) {
    this.arrivalTerminal = arrivalTerminal;
    return this;
  }

   /**
   * Get arrivalTerminal
   * @return arrivalTerminal
  **/
  @Schema(description = "")
  public String getArrivalTerminal() {
    return arrivalTerminal;
  }

  public void setArrivalTerminal(String arrivalTerminal) {
    this.arrivalTerminal = arrivalTerminal;
  }

  public FlightBookingSegments arrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
    return this;
  }

   /**
   * Get arrivalDate
   * @return arrivalDate
  **/
  @Schema(description = "")
  public String getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public FlightBookingSegments arrivalLocation(FlightBookingArrivalLocation arrivalLocation) {
    this.arrivalLocation = arrivalLocation;
    return this;
  }

   /**
   * Get arrivalLocation
   * @return arrivalLocation
  **/
  @Schema(description = "")
  public FlightBookingArrivalLocation getArrivalLocation() {
    return arrivalLocation;
  }

  public void setArrivalLocation(FlightBookingArrivalLocation arrivalLocation) {
    this.arrivalLocation = arrivalLocation;
  }

  public FlightBookingSegments arrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

   /**
   * Get arrivalTime
   * @return arrivalTime
  **/
  @Schema(description = "")
  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public FlightBookingSegments baggageInfo(String baggageInfo) {
    this.baggageInfo = baggageInfo;
    return this;
  }

   /**
   * Get baggageInfo
   * @return baggageInfo
  **/
  @Schema(description = "")
  public String getBaggageInfo() {
    return baggageInfo;
  }

  public void setBaggageInfo(String baggageInfo) {
    this.baggageInfo = baggageInfo;
  }

  public FlightBookingSegments bookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
    return this;
  }

   /**
   * Get bookingClass
   * @return bookingClass
  **/
  @Schema(description = "")
  public String getBookingClass() {
    return bookingClass;
  }

  public void setBookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
  }

  public FlightBookingSegments boundId(Integer boundId) {
    this.boundId = boundId;
    return this;
  }

   /**
   * Get boundId
   * @return boundId
  **/
  @Schema(description = "")
  public Integer getBoundId() {
    return boundId;
  }

  public void setBoundId(Integer boundId) {
    this.boundId = boundId;
  }

  public FlightBookingSegments carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @Schema(description = "")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public FlightBookingSegments departureTerminal(String departureTerminal) {
    this.departureTerminal = departureTerminal;
    return this;
  }

   /**
   * Get departureTerminal
   * @return departureTerminal
  **/
  @Schema(description = "")
  public String getDepartureTerminal() {
    return departureTerminal;
  }

  public void setDepartureTerminal(String departureTerminal) {
    this.departureTerminal = departureTerminal;
  }

  public FlightBookingSegments departureDate(String departureDate) {
    this.departureDate = departureDate;
    return this;
  }

   /**
   * Get departureDate
   * @return departureDate
  **/
  @Schema(description = "")
  public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(String departureDate) {
    this.departureDate = departureDate;
  }

  public FlightBookingSegments departureLocation(FlightBookingArrivalLocation departureLocation) {
    this.departureLocation = departureLocation;
    return this;
  }

   /**
   * Get departureLocation
   * @return departureLocation
  **/
  @Schema(description = "")
  public FlightBookingArrivalLocation getDepartureLocation() {
    return departureLocation;
  }

  public void setDepartureLocation(FlightBookingArrivalLocation departureLocation) {
    this.departureLocation = departureLocation;
  }

  public FlightBookingSegments departureTime(String departureTime) {
    this.departureTime = departureTime;
    return this;
  }

   /**
   * Get departureTime
   * @return departureTime
  **/
  @Schema(description = "")
  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public FlightBookingSegments flightEquipment(String flightEquipment) {
    this.flightEquipment = flightEquipment;
    return this;
  }

   /**
   * Get flightEquipment
   * @return flightEquipment
  **/
  @Schema(description = "")
  public String getFlightEquipment() {
    return flightEquipment;
  }

  public void setFlightEquipment(String flightEquipment) {
    this.flightEquipment = flightEquipment;
  }

  public FlightBookingSegments flightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }

   /**
   * Get flightNumber
   * @return flightNumber
  **/
  @Schema(description = "")
  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public FlightBookingSegments id(Integer id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightBookingSegments flightBookingSegments = (FlightBookingSegments) o;
    return Objects.equals(this.arrivalTerminal, flightBookingSegments.arrivalTerminal) &&
        Objects.equals(this.arrivalDate, flightBookingSegments.arrivalDate) &&
        Objects.equals(this.arrivalLocation, flightBookingSegments.arrivalLocation) &&
        Objects.equals(this.arrivalTime, flightBookingSegments.arrivalTime) &&
        Objects.equals(this.baggageInfo, flightBookingSegments.baggageInfo) &&
        Objects.equals(this.bookingClass, flightBookingSegments.bookingClass) &&
        Objects.equals(this.boundId, flightBookingSegments.boundId) &&
        Objects.equals(this.carrier, flightBookingSegments.carrier) &&
        Objects.equals(this.departureTerminal, flightBookingSegments.departureTerminal) &&
        Objects.equals(this.departureDate, flightBookingSegments.departureDate) &&
        Objects.equals(this.departureLocation, flightBookingSegments.departureLocation) &&
        Objects.equals(this.departureTime, flightBookingSegments.departureTime) &&
        Objects.equals(this.flightEquipment, flightBookingSegments.flightEquipment) &&
        Objects.equals(this.flightNumber, flightBookingSegments.flightNumber) &&
        Objects.equals(this.id, flightBookingSegments.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalTerminal, arrivalDate, arrivalLocation, arrivalTime, baggageInfo, bookingClass, boundId, carrier, departureTerminal, departureDate, departureLocation, departureTime, flightEquipment, flightNumber, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightBookingSegments {\n");
    
    sb.append("    arrivalTerminal: ").append(toIndentedString(arrivalTerminal)).append("\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    arrivalLocation: ").append(toIndentedString(arrivalLocation)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    baggageInfo: ").append(toIndentedString(baggageInfo)).append("\n");
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    boundId: ").append(toIndentedString(boundId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    departureTerminal: ").append(toIndentedString(departureTerminal)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    departureLocation: ").append(toIndentedString(departureLocation)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    flightEquipment: ").append(toIndentedString(flightEquipment)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
