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
import io.swagger.client.model.FlightAirportAutocomplete;
import io.swagger.client.model.Provider;
import io.swagger.client.model.Supplier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FlightAirportAutocompleteResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-25T18:44:13.943Z[GMT]")
public class FlightAirportAutocompleteResponse extends AlgebratecResponse {
  @SerializedName("predictions")
  private List<FlightAirportAutocomplete> predictions = null;

  public FlightAirportAutocompleteResponse predictions(List<FlightAirportAutocomplete> predictions) {
    this.predictions = predictions;
    return this;
  }

  public FlightAirportAutocompleteResponse addPredictionsItem(FlightAirportAutocomplete predictionsItem) {
    if (this.predictions == null) {
      this.predictions = new ArrayList<FlightAirportAutocomplete>();
    }
    this.predictions.add(predictionsItem);
    return this;
  }

   /**
   * Get predictions
   * @return predictions
  **/
  @Schema(description = "")
  public List<FlightAirportAutocomplete> getPredictions() {
    return predictions;
  }

  public void setPredictions(List<FlightAirportAutocomplete> predictions) {
    this.predictions = predictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightAirportAutocompleteResponse flightAirportAutocompleteResponse = (FlightAirportAutocompleteResponse) o;
    return Objects.equals(this.predictions, flightAirportAutocompleteResponse.predictions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predictions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightAirportAutocompleteResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    predictions: ").append(toIndentedString(predictions)).append("\n");
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
