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
import io.swagger.client.model.FlightAvailability;
import io.swagger.client.model.Provider;
import io.swagger.client.model.Supplier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;
/**
 * FlightAvailabilityResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-25T11:48:12.193Z[GMT]")
public class FlightAvailabilityResponse extends AlgebratecResponse {
  @SerializedName("availability")
  private FlightAvailability availability = null;

  public FlightAvailabilityResponse availability(FlightAvailability availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @Schema(description = "")
  public FlightAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(FlightAvailability availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightAvailabilityResponse flightAvailabilityResponse = (FlightAvailabilityResponse) o;
    return Objects.equals(this.availability, flightAvailabilityResponse.availability) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightAvailabilityResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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
