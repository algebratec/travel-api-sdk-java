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
 * FlightBookingArrivalLocation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-25T18:44:13.943Z[GMT]")
public class FlightBookingArrivalLocation {
  @SerializedName("airport")
  private String airport = null;

  @SerializedName("city_and_country")
  private String cityAndCountry = null;

  public FlightBookingArrivalLocation airport(String airport) {
    this.airport = airport;
    return this;
  }

   /**
   * Get airport
   * @return airport
  **/
  @Schema(description = "")
  public String getAirport() {
    return airport;
  }

  public void setAirport(String airport) {
    this.airport = airport;
  }

  public FlightBookingArrivalLocation cityAndCountry(String cityAndCountry) {
    this.cityAndCountry = cityAndCountry;
    return this;
  }

   /**
   * Get cityAndCountry
   * @return cityAndCountry
  **/
  @Schema(description = "")
  public String getCityAndCountry() {
    return cityAndCountry;
  }

  public void setCityAndCountry(String cityAndCountry) {
    this.cityAndCountry = cityAndCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightBookingArrivalLocation flightBookingArrivalLocation = (FlightBookingArrivalLocation) o;
    return Objects.equals(this.airport, flightBookingArrivalLocation.airport) &&
        Objects.equals(this.cityAndCountry, flightBookingArrivalLocation.cityAndCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airport, cityAndCountry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightBookingArrivalLocation {\n");
    
    sb.append("    airport: ").append(toIndentedString(airport)).append("\n");
    sb.append("    cityAndCountry: ").append(toIndentedString(cityAndCountry)).append("\n");
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
