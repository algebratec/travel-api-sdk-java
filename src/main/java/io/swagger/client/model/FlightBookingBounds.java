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
import io.swagger.client.model.FlightBookingSegments;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FlightBookingBounds
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class FlightBookingBounds {
  @SerializedName("arrival_date")
  private String arrivalDate = null;

  @SerializedName("arrival_location")
  private FlightBookingArrivalLocation arrivalLocation = null;

  @SerializedName("arrival_time")
  private String arrivalTime = null;

  @SerializedName("booking_class")
  private List<String> bookingClass = null;

  @SerializedName("departure_date")
  private String departureDate = null;

  @SerializedName("departure_location")
  private FlightBookingArrivalLocation departureLocation = null;

  @SerializedName("departure_time")
  private String departureTime = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("origin")
  private String origin = null;

  @SerializedName("segments")
  private List<FlightBookingSegments> segments = null;

  public FlightBookingBounds arrivalDate(String arrivalDate) {
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

  public FlightBookingBounds arrivalLocation(FlightBookingArrivalLocation arrivalLocation) {
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

  public FlightBookingBounds arrivalTime(String arrivalTime) {
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

  public FlightBookingBounds bookingClass(List<String> bookingClass) {
    this.bookingClass = bookingClass;
    return this;
  }

  public FlightBookingBounds addBookingClassItem(String bookingClassItem) {
    if (this.bookingClass == null) {
      this.bookingClass = new ArrayList<String>();
    }
    this.bookingClass.add(bookingClassItem);
    return this;
  }

   /**
   * Get bookingClass
   * @return bookingClass
  **/
  @Schema(description = "")
  public List<String> getBookingClass() {
    return bookingClass;
  }

  public void setBookingClass(List<String> bookingClass) {
    this.bookingClass = bookingClass;
  }

  public FlightBookingBounds departureDate(String departureDate) {
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

  public FlightBookingBounds departureLocation(FlightBookingArrivalLocation departureLocation) {
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

  public FlightBookingBounds departureTime(String departureTime) {
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

  public FlightBookingBounds destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @Schema(description = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public FlightBookingBounds origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @Schema(description = "")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public FlightBookingBounds segments(List<FlightBookingSegments> segments) {
    this.segments = segments;
    return this;
  }

  public FlightBookingBounds addSegmentsItem(FlightBookingSegments segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<FlightBookingSegments>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @Schema(description = "")
  public List<FlightBookingSegments> getSegments() {
    return segments;
  }

  public void setSegments(List<FlightBookingSegments> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightBookingBounds flightBookingBounds = (FlightBookingBounds) o;
    return Objects.equals(this.arrivalDate, flightBookingBounds.arrivalDate) &&
        Objects.equals(this.arrivalLocation, flightBookingBounds.arrivalLocation) &&
        Objects.equals(this.arrivalTime, flightBookingBounds.arrivalTime) &&
        Objects.equals(this.bookingClass, flightBookingBounds.bookingClass) &&
        Objects.equals(this.departureDate, flightBookingBounds.departureDate) &&
        Objects.equals(this.departureLocation, flightBookingBounds.departureLocation) &&
        Objects.equals(this.departureTime, flightBookingBounds.departureTime) &&
        Objects.equals(this.destination, flightBookingBounds.destination) &&
        Objects.equals(this.origin, flightBookingBounds.origin) &&
        Objects.equals(this.segments, flightBookingBounds.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalDate, arrivalLocation, arrivalTime, bookingClass, departureDate, departureLocation, departureTime, destination, origin, segments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightBookingBounds {\n");
    
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    arrivalLocation: ").append(toIndentedString(arrivalLocation)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    departureLocation: ").append(toIndentedString(departureLocation)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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
