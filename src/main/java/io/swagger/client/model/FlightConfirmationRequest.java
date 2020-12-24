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
import io.swagger.client.model.FlightBookingKeyRequest;
import io.swagger.client.model.FlightCustomer;
import io.swagger.client.model.FlightTraveller;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FlightConfirmationRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-24T22:56:10.425Z[GMT]")
public class FlightConfirmationRequest extends FlightBookingKeyRequest {
  @SerializedName("customer")
  private FlightCustomer customer = null;

  @SerializedName("onholdbooking")
  private Boolean onholdbooking = null;

  @SerializedName("travellers")
  private List<FlightTraveller> travellers = null;

  public FlightConfirmationRequest customer(FlightCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @Schema(description = "")
  public FlightCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(FlightCustomer customer) {
    this.customer = customer;
  }

  public FlightConfirmationRequest onholdbooking(Boolean onholdbooking) {
    this.onholdbooking = onholdbooking;
    return this;
  }

   /**
   * Get onholdbooking
   * @return onholdbooking
  **/
  @Schema(description = "")
  public Boolean isOnholdbooking() {
    return onholdbooking;
  }

  public void setOnholdbooking(Boolean onholdbooking) {
    this.onholdbooking = onholdbooking;
  }

  public FlightConfirmationRequest travellers(List<FlightTraveller> travellers) {
    this.travellers = travellers;
    return this;
  }

  public FlightConfirmationRequest addTravellersItem(FlightTraveller travellersItem) {
    if (this.travellers == null) {
      this.travellers = new ArrayList<FlightTraveller>();
    }
    this.travellers.add(travellersItem);
    return this;
  }

   /**
   * Get travellers
   * @return travellers
  **/
  @Schema(description = "")
  public List<FlightTraveller> getTravellers() {
    return travellers;
  }

  public void setTravellers(List<FlightTraveller> travellers) {
    this.travellers = travellers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightConfirmationRequest flightConfirmationRequest = (FlightConfirmationRequest) o;
    return Objects.equals(this.customer, flightConfirmationRequest.customer) &&
        Objects.equals(this.onholdbooking, flightConfirmationRequest.onholdbooking) &&
        Objects.equals(this.travellers, flightConfirmationRequest.travellers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, onholdbooking, travellers, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightConfirmationRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    onholdbooking: ").append(toIndentedString(onholdbooking)).append("\n");
    sb.append("    travellers: ").append(toIndentedString(travellers)).append("\n");
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