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
import io.swagger.client.model.HotelCancellationPolicy;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HotelCheckRatesResponseHotelRates
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class HotelCheckRatesResponseHotelRates {
  @SerializedName("rateKey")
  private String rateKey = null;

  @SerializedName("boardName")
  private String boardName = null;

  @SerializedName("boardCode")
  private String boardCode = null;

  @SerializedName("net")
  private Integer net = null;

  @SerializedName("adults")
  private Integer adults = null;

  @SerializedName("children")
  private Integer children = null;

  @SerializedName("cancellationPolicies")
  private List<HotelCancellationPolicy> cancellationPolicies = null;

  public HotelCheckRatesResponseHotelRates rateKey(String rateKey) {
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

  public HotelCheckRatesResponseHotelRates boardName(String boardName) {
    this.boardName = boardName;
    return this;
  }

   /**
   * Get boardName
   * @return boardName
  **/
  @Schema(description = "")
  public String getBoardName() {
    return boardName;
  }

  public void setBoardName(String boardName) {
    this.boardName = boardName;
  }

  public HotelCheckRatesResponseHotelRates boardCode(String boardCode) {
    this.boardCode = boardCode;
    return this;
  }

   /**
   * Get boardCode
   * @return boardCode
  **/
  @Schema(description = "")
  public String getBoardCode() {
    return boardCode;
  }

  public void setBoardCode(String boardCode) {
    this.boardCode = boardCode;
  }

  public HotelCheckRatesResponseHotelRates net(Integer net) {
    this.net = net;
    return this;
  }

   /**
   * Get net
   * @return net
  **/
  @Schema(description = "")
  public Integer getNet() {
    return net;
  }

  public void setNet(Integer net) {
    this.net = net;
  }

  public HotelCheckRatesResponseHotelRates adults(Integer adults) {
    this.adults = adults;
    return this;
  }

   /**
   * Get adults
   * @return adults
  **/
  @Schema(description = "")
  public Integer getAdults() {
    return adults;
  }

  public void setAdults(Integer adults) {
    this.adults = adults;
  }

  public HotelCheckRatesResponseHotelRates children(Integer children) {
    this.children = children;
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @Schema(description = "")
  public Integer getChildren() {
    return children;
  }

  public void setChildren(Integer children) {
    this.children = children;
  }

  public HotelCheckRatesResponseHotelRates cancellationPolicies(List<HotelCancellationPolicy> cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
    return this;
  }

  public HotelCheckRatesResponseHotelRates addCancellationPoliciesItem(HotelCancellationPolicy cancellationPoliciesItem) {
    if (this.cancellationPolicies == null) {
      this.cancellationPolicies = new ArrayList<HotelCancellationPolicy>();
    }
    this.cancellationPolicies.add(cancellationPoliciesItem);
    return this;
  }

   /**
   * Get cancellationPolicies
   * @return cancellationPolicies
  **/
  @Schema(description = "")
  public List<HotelCancellationPolicy> getCancellationPolicies() {
    return cancellationPolicies;
  }

  public void setCancellationPolicies(List<HotelCancellationPolicy> cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelCheckRatesResponseHotelRates hotelCheckRatesResponseHotelRates = (HotelCheckRatesResponseHotelRates) o;
    return Objects.equals(this.rateKey, hotelCheckRatesResponseHotelRates.rateKey) &&
        Objects.equals(this.boardName, hotelCheckRatesResponseHotelRates.boardName) &&
        Objects.equals(this.boardCode, hotelCheckRatesResponseHotelRates.boardCode) &&
        Objects.equals(this.net, hotelCheckRatesResponseHotelRates.net) &&
        Objects.equals(this.adults, hotelCheckRatesResponseHotelRates.adults) &&
        Objects.equals(this.children, hotelCheckRatesResponseHotelRates.children) &&
        Objects.equals(this.cancellationPolicies, hotelCheckRatesResponseHotelRates.cancellationPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateKey, boardName, boardCode, net, adults, children, cancellationPolicies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelCheckRatesResponseHotelRates {\n");
    
    sb.append("    rateKey: ").append(toIndentedString(rateKey)).append("\n");
    sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
    sb.append("    boardCode: ").append(toIndentedString(boardCode)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    cancellationPolicies: ").append(toIndentedString(cancellationPolicies)).append("\n");
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
