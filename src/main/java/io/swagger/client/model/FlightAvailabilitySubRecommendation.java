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
import io.swagger.client.model.FlightBaggageAllowance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FlightAvailabilitySubRecommendation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-25T18:44:13.943Z[GMT]")
public class FlightAvailabilitySubRecommendation {
  @SerializedName("baggage")
  private FlightBaggageAllowance baggage = null;

  @SerializedName("bounds")
  private List<FlightAvailabilitySubRecommendationBounds> bounds = null;

  @SerializedName("fareRules")
  private List<String> fareRules = null;

  public FlightAvailabilitySubRecommendation baggage(FlightBaggageAllowance baggage) {
    this.baggage = baggage;
    return this;
  }

   /**
   * Get baggage
   * @return baggage
  **/
  @Schema(description = "")
  public FlightBaggageAllowance getBaggage() {
    return baggage;
  }

  public void setBaggage(FlightBaggageAllowance baggage) {
    this.baggage = baggage;
  }

  public FlightAvailabilitySubRecommendation bounds(List<FlightAvailabilitySubRecommendationBounds> bounds) {
    this.bounds = bounds;
    return this;
  }

  public FlightAvailabilitySubRecommendation addBoundsItem(FlightAvailabilitySubRecommendationBounds boundsItem) {
    if (this.bounds == null) {
      this.bounds = new ArrayList<FlightAvailabilitySubRecommendationBounds>();
    }
    this.bounds.add(boundsItem);
    return this;
  }

   /**
   * Get bounds
   * @return bounds
  **/
  @Schema(description = "")
  public List<FlightAvailabilitySubRecommendationBounds> getBounds() {
    return bounds;
  }

  public void setBounds(List<FlightAvailabilitySubRecommendationBounds> bounds) {
    this.bounds = bounds;
  }

  public FlightAvailabilitySubRecommendation fareRules(List<String> fareRules) {
    this.fareRules = fareRules;
    return this;
  }

  public FlightAvailabilitySubRecommendation addFareRulesItem(String fareRulesItem) {
    if (this.fareRules == null) {
      this.fareRules = new ArrayList<String>();
    }
    this.fareRules.add(fareRulesItem);
    return this;
  }

   /**
   * Get fareRules
   * @return fareRules
  **/
  @Schema(description = "")
  public List<String> getFareRules() {
    return fareRules;
  }

  public void setFareRules(List<String> fareRules) {
    this.fareRules = fareRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightAvailabilitySubRecommendation flightAvailabilitySubRecommendation = (FlightAvailabilitySubRecommendation) o;
    return Objects.equals(this.baggage, flightAvailabilitySubRecommendation.baggage) &&
        Objects.equals(this.bounds, flightAvailabilitySubRecommendation.bounds) &&
        Objects.equals(this.fareRules, flightAvailabilitySubRecommendation.fareRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baggage, bounds, fareRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightAvailabilitySubRecommendation {\n");
    
    sb.append("    baggage: ").append(toIndentedString(baggage)).append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
    sb.append("    fareRules: ").append(toIndentedString(fareRules)).append("\n");
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
