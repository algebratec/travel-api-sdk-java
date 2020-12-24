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
import io.swagger.client.model.HotelAvailabilityRequestPaxes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HotelAvailabilityRequestOccupancies
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-24T22:56:10.425Z[GMT]")
public class HotelAvailabilityRequestOccupancies {
  @SerializedName("adults")
  private Integer adults = null;

  @SerializedName("children")
  private Integer children = null;

  @SerializedName("paxes")
  private List<HotelAvailabilityRequestPaxes> paxes = null;

  public HotelAvailabilityRequestOccupancies adults(Integer adults) {
    this.adults = adults;
    return this;
  }

   /**
   * Get adults
   * @return adults
  **/
  @Schema(example = "1", description = "")
  public Integer getAdults() {
    return adults;
  }

  public void setAdults(Integer adults) {
    this.adults = adults;
  }

  public HotelAvailabilityRequestOccupancies children(Integer children) {
    this.children = children;
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @Schema(example = "1", description = "")
  public Integer getChildren() {
    return children;
  }

  public void setChildren(Integer children) {
    this.children = children;
  }

  public HotelAvailabilityRequestOccupancies paxes(List<HotelAvailabilityRequestPaxes> paxes) {
    this.paxes = paxes;
    return this;
  }

  public HotelAvailabilityRequestOccupancies addPaxesItem(HotelAvailabilityRequestPaxes paxesItem) {
    if (this.paxes == null) {
      this.paxes = new ArrayList<HotelAvailabilityRequestPaxes>();
    }
    this.paxes.add(paxesItem);
    return this;
  }

   /**
   * Get paxes
   * @return paxes
  **/
  @Schema(description = "")
  public List<HotelAvailabilityRequestPaxes> getPaxes() {
    return paxes;
  }

  public void setPaxes(List<HotelAvailabilityRequestPaxes> paxes) {
    this.paxes = paxes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelAvailabilityRequestOccupancies hotelAvailabilityRequestOccupancies = (HotelAvailabilityRequestOccupancies) o;
    return Objects.equals(this.adults, hotelAvailabilityRequestOccupancies.adults) &&
        Objects.equals(this.children, hotelAvailabilityRequestOccupancies.children) &&
        Objects.equals(this.paxes, hotelAvailabilityRequestOccupancies.paxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adults, children, paxes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelAvailabilityRequestOccupancies {\n");
    
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    paxes: ").append(toIndentedString(paxes)).append("\n");
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
