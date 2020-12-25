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
 * HotelCheckRatesRequestRooms
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-25T18:44:13.943Z[GMT]")
public class HotelCheckRatesRequestRooms {
  @SerializedName("rateKey")
  private String rateKey = null;

  @SerializedName("extras")
  private List<Integer> extras = null;

  public HotelCheckRatesRequestRooms rateKey(String rateKey) {
    this.rateKey = rateKey;
    return this;
  }

   /**
   * Get rateKey
   * @return rateKey
  **/
  @Schema(description = "")
  public String getRateKey() {
    return rateKey;
  }

  public void setRateKey(String rateKey) {
    this.rateKey = rateKey;
  }

  public HotelCheckRatesRequestRooms extras(List<Integer> extras) {
    this.extras = extras;
    return this;
  }

  public HotelCheckRatesRequestRooms addExtrasItem(Integer extrasItem) {
    if (this.extras == null) {
      this.extras = new ArrayList<Integer>();
    }
    this.extras.add(extrasItem);
    return this;
  }

   /**
   * Get extras
   * @return extras
  **/
  @Schema(description = "")
  public List<Integer> getExtras() {
    return extras;
  }

  public void setExtras(List<Integer> extras) {
    this.extras = extras;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelCheckRatesRequestRooms hotelCheckRatesRequestRooms = (HotelCheckRatesRequestRooms) o;
    return Objects.equals(this.rateKey, hotelCheckRatesRequestRooms.rateKey) &&
        Objects.equals(this.extras, hotelCheckRatesRequestRooms.extras);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateKey, extras);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelCheckRatesRequestRooms {\n");
    
    sb.append("    rateKey: ").append(toIndentedString(rateKey)).append("\n");
    sb.append("    extras: ").append(toIndentedString(extras)).append("\n");
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
