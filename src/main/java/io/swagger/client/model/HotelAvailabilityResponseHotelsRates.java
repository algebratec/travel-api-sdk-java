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
import io.swagger.client.model.HotelAvailabilityResponseHotelsCancellationPolicies;
import io.swagger.client.model.HotelAvailabilityResponseHotelsTaxes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * HotelAvailabilityResponseHotelsRates
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-25T18:44:13.943Z[GMT]")
public class HotelAvailabilityResponseHotelsRates {
  @SerializedName("boardName")
  private String boardName = null;

  @SerializedName("boardCode")
  private String boardCode = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("rateKey")
  private String rateKey = null;

  @SerializedName("rateComment")
  private String rateComment = null;

  @SerializedName("taxes")
  private List<HotelAvailabilityResponseHotelsTaxes> taxes = null;

  @SerializedName("cancellationPolicies")
  private List<HotelAvailabilityResponseHotelsCancellationPolicies> cancellationPolicies = null;

  public HotelAvailabilityResponseHotelsRates boardName(String boardName) {
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

  public HotelAvailabilityResponseHotelsRates boardCode(String boardCode) {
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

  public HotelAvailabilityResponseHotelsRates price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public HotelAvailabilityResponseHotelsRates rateKey(String rateKey) {
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

  public HotelAvailabilityResponseHotelsRates rateComment(String rateComment) {
    this.rateComment = rateComment;
    return this;
  }

   /**
   * Get rateComment
   * @return rateComment
  **/
  @Schema(description = "")
  public String getRateComment() {
    return rateComment;
  }

  public void setRateComment(String rateComment) {
    this.rateComment = rateComment;
  }

  public HotelAvailabilityResponseHotelsRates taxes(List<HotelAvailabilityResponseHotelsTaxes> taxes) {
    this.taxes = taxes;
    return this;
  }

  public HotelAvailabilityResponseHotelsRates addTaxesItem(HotelAvailabilityResponseHotelsTaxes taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<HotelAvailabilityResponseHotelsTaxes>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @Schema(description = "")
  public List<HotelAvailabilityResponseHotelsTaxes> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<HotelAvailabilityResponseHotelsTaxes> taxes) {
    this.taxes = taxes;
  }

  public HotelAvailabilityResponseHotelsRates cancellationPolicies(List<HotelAvailabilityResponseHotelsCancellationPolicies> cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
    return this;
  }

  public HotelAvailabilityResponseHotelsRates addCancellationPoliciesItem(HotelAvailabilityResponseHotelsCancellationPolicies cancellationPoliciesItem) {
    if (this.cancellationPolicies == null) {
      this.cancellationPolicies = new ArrayList<HotelAvailabilityResponseHotelsCancellationPolicies>();
    }
    this.cancellationPolicies.add(cancellationPoliciesItem);
    return this;
  }

   /**
   * Get cancellationPolicies
   * @return cancellationPolicies
  **/
  @Schema(description = "")
  public List<HotelAvailabilityResponseHotelsCancellationPolicies> getCancellationPolicies() {
    return cancellationPolicies;
  }

  public void setCancellationPolicies(List<HotelAvailabilityResponseHotelsCancellationPolicies> cancellationPolicies) {
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
    HotelAvailabilityResponseHotelsRates hotelAvailabilityResponseHotelsRates = (HotelAvailabilityResponseHotelsRates) o;
    return Objects.equals(this.boardName, hotelAvailabilityResponseHotelsRates.boardName) &&
        Objects.equals(this.boardCode, hotelAvailabilityResponseHotelsRates.boardCode) &&
        Objects.equals(this.price, hotelAvailabilityResponseHotelsRates.price) &&
        Objects.equals(this.rateKey, hotelAvailabilityResponseHotelsRates.rateKey) &&
        Objects.equals(this.rateComment, hotelAvailabilityResponseHotelsRates.rateComment) &&
        Objects.equals(this.taxes, hotelAvailabilityResponseHotelsRates.taxes) &&
        Objects.equals(this.cancellationPolicies, hotelAvailabilityResponseHotelsRates.cancellationPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardName, boardCode, price, rateKey, rateComment, taxes, cancellationPolicies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelAvailabilityResponseHotelsRates {\n");
    
    sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
    sb.append("    boardCode: ").append(toIndentedString(boardCode)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    rateKey: ").append(toIndentedString(rateKey)).append("\n");
    sb.append("    rateComment: ").append(toIndentedString(rateComment)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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
