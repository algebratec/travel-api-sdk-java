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
 * FlightDepartureAndArrivale
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-24T22:56:10.425Z[GMT]")
public class FlightDepartureAndArrivale {
  @SerializedName("date")
  private String date = null;

  @SerializedName("full_date")
  private String fullDate = null;

  @SerializedName("locationId")
  private String locationId = null;

  @SerializedName("time")
  private String time = null;

  public FlightDepartureAndArrivale date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(description = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public FlightDepartureAndArrivale fullDate(String fullDate) {
    this.fullDate = fullDate;
    return this;
  }

   /**
   * Get fullDate
   * @return fullDate
  **/
  @Schema(description = "")
  public String getFullDate() {
    return fullDate;
  }

  public void setFullDate(String fullDate) {
    this.fullDate = fullDate;
  }

  public FlightDepartureAndArrivale locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @Schema(description = "")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public FlightDepartureAndArrivale time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(description = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightDepartureAndArrivale flightDepartureAndArrivale = (FlightDepartureAndArrivale) o;
    return Objects.equals(this.date, flightDepartureAndArrivale.date) &&
        Objects.equals(this.fullDate, flightDepartureAndArrivale.fullDate) &&
        Objects.equals(this.locationId, flightDepartureAndArrivale.locationId) &&
        Objects.equals(this.time, flightDepartureAndArrivale.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, fullDate, locationId, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightDepartureAndArrivale {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fullDate: ").append(toIndentedString(fullDate)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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