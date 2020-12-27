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
import io.swagger.client.model.FlightFareRule;
import io.swagger.client.model.Provider;
import io.swagger.client.model.Supplier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FlightFareRulesResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class FlightFareRulesResponse extends AlgebratecResponse {
  @SerializedName("fareRules")
  private List<FlightFareRule> fareRules = null;

  public FlightFareRulesResponse fareRules(List<FlightFareRule> fareRules) {
    this.fareRules = fareRules;
    return this;
  }

  public FlightFareRulesResponse addFareRulesItem(FlightFareRule fareRulesItem) {
    if (this.fareRules == null) {
      this.fareRules = new ArrayList<FlightFareRule>();
    }
    this.fareRules.add(fareRulesItem);
    return this;
  }

   /**
   * Get fareRules
   * @return fareRules
  **/
  @Schema(description = "")
  public List<FlightFareRule> getFareRules() {
    return fareRules;
  }

  public void setFareRules(List<FlightFareRule> fareRules) {
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
    FlightFareRulesResponse flightFareRulesResponse = (FlightFareRulesResponse) o;
    return Objects.equals(this.fareRules, flightFareRulesResponse.fareRules) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fareRules, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightFareRulesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
