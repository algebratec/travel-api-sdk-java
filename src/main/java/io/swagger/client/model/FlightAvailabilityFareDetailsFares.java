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
 * FlightAvailabilityFareDetailsFares
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-25T18:44:13.943Z[GMT]")
public class FlightAvailabilityFareDetailsFares {
  @SerializedName("fareAdvise")
  private List<String> fareAdvise = null;

  @SerializedName("fareBasis")
  private String fareBasis = null;

  public FlightAvailabilityFareDetailsFares fareAdvise(List<String> fareAdvise) {
    this.fareAdvise = fareAdvise;
    return this;
  }

  public FlightAvailabilityFareDetailsFares addFareAdviseItem(String fareAdviseItem) {
    if (this.fareAdvise == null) {
      this.fareAdvise = new ArrayList<String>();
    }
    this.fareAdvise.add(fareAdviseItem);
    return this;
  }

   /**
   * Get fareAdvise
   * @return fareAdvise
  **/
  @Schema(description = "")
  public List<String> getFareAdvise() {
    return fareAdvise;
  }

  public void setFareAdvise(List<String> fareAdvise) {
    this.fareAdvise = fareAdvise;
  }

  public FlightAvailabilityFareDetailsFares fareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
    return this;
  }

   /**
   * Get fareBasis
   * @return fareBasis
  **/
  @Schema(description = "")
  public String getFareBasis() {
    return fareBasis;
  }

  public void setFareBasis(String fareBasis) {
    this.fareBasis = fareBasis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightAvailabilityFareDetailsFares flightAvailabilityFareDetailsFares = (FlightAvailabilityFareDetailsFares) o;
    return Objects.equals(this.fareAdvise, flightAvailabilityFareDetailsFares.fareAdvise) &&
        Objects.equals(this.fareBasis, flightAvailabilityFareDetailsFares.fareBasis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareAdvise, fareBasis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightAvailabilityFareDetailsFares {\n");
    
    sb.append("    fareAdvise: ").append(toIndentedString(fareAdvise)).append("\n");
    sb.append("    fareBasis: ").append(toIndentedString(fareBasis)).append("\n");
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
