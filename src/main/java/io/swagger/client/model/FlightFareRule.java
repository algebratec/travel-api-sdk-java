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
import java.util.ArrayList;
import java.util.List;
/**
 * FlightFareRule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-24T22:56:10.425Z[GMT]")
public class FlightFareRule {
  @SerializedName("Flight_Conditions")
  private List<String> flightConditions = null;

  public FlightFareRule flightConditions(List<String> flightConditions) {
    this.flightConditions = flightConditions;
    return this;
  }

  public FlightFareRule addFlightConditionsItem(String flightConditionsItem) {
    if (this.flightConditions == null) {
      this.flightConditions = new ArrayList<String>();
    }
    this.flightConditions.add(flightConditionsItem);
    return this;
  }

   /**
   * Get flightConditions
   * @return flightConditions
  **/
  @Schema(example = "[\"CANCELLATIONS\",\"ANY TIME\"]", description = "")
  public List<String> getFlightConditions() {
    return flightConditions;
  }

  public void setFlightConditions(List<String> flightConditions) {
    this.flightConditions = flightConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightFareRule flightFareRule = (FlightFareRule) o;
    return Objects.equals(this.flightConditions, flightFareRule.flightConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flightConditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightFareRule {\n");
    
    sb.append("    flightConditions: ").append(toIndentedString(flightConditions)).append("\n");
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