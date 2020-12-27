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
import io.swagger.client.model.HotelConfirmationRequestHolder;
import io.swagger.client.model.HotelConfirmationResponseBookingHotel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * HotelConfirmationResponseBooking
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class HotelConfirmationResponseBooking {
  @SerializedName("status")
  private String status = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("totalPrice")
  private String totalPrice = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("checkIn")
  private String checkIn = null;

  @SerializedName("checkOut")
  private String checkOut = null;

  @SerializedName("holder")
  private HotelConfirmationRequestHolder holder = null;

  @SerializedName("hotel")
  private HotelConfirmationResponseBookingHotel hotel = null;

  public HotelConfirmationResponseBooking status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HotelConfirmationResponseBooking created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public HotelConfirmationResponseBooking reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @Schema(description = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public HotelConfirmationResponseBooking comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @Schema(description = "")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public HotelConfirmationResponseBooking totalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @Schema(description = "")
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  public HotelConfirmationResponseBooking currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public HotelConfirmationResponseBooking checkIn(String checkIn) {
    this.checkIn = checkIn;
    return this;
  }

   /**
   * Get checkIn
   * @return checkIn
  **/
  @Schema(description = "")
  public String getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(String checkIn) {
    this.checkIn = checkIn;
  }

  public HotelConfirmationResponseBooking checkOut(String checkOut) {
    this.checkOut = checkOut;
    return this;
  }

   /**
   * Get checkOut
   * @return checkOut
  **/
  @Schema(description = "")
  public String getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(String checkOut) {
    this.checkOut = checkOut;
  }

  public HotelConfirmationResponseBooking holder(HotelConfirmationRequestHolder holder) {
    this.holder = holder;
    return this;
  }

   /**
   * Get holder
   * @return holder
  **/
  @Schema(description = "")
  public HotelConfirmationRequestHolder getHolder() {
    return holder;
  }

  public void setHolder(HotelConfirmationRequestHolder holder) {
    this.holder = holder;
  }

  public HotelConfirmationResponseBooking hotel(HotelConfirmationResponseBookingHotel hotel) {
    this.hotel = hotel;
    return this;
  }

   /**
   * Get hotel
   * @return hotel
  **/
  @Schema(description = "")
  public HotelConfirmationResponseBookingHotel getHotel() {
    return hotel;
  }

  public void setHotel(HotelConfirmationResponseBookingHotel hotel) {
    this.hotel = hotel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelConfirmationResponseBooking hotelConfirmationResponseBooking = (HotelConfirmationResponseBooking) o;
    return Objects.equals(this.status, hotelConfirmationResponseBooking.status) &&
        Objects.equals(this.created, hotelConfirmationResponseBooking.created) &&
        Objects.equals(this.reference, hotelConfirmationResponseBooking.reference) &&
        Objects.equals(this.comments, hotelConfirmationResponseBooking.comments) &&
        Objects.equals(this.totalPrice, hotelConfirmationResponseBooking.totalPrice) &&
        Objects.equals(this.currency, hotelConfirmationResponseBooking.currency) &&
        Objects.equals(this.checkIn, hotelConfirmationResponseBooking.checkIn) &&
        Objects.equals(this.checkOut, hotelConfirmationResponseBooking.checkOut) &&
        Objects.equals(this.holder, hotelConfirmationResponseBooking.holder) &&
        Objects.equals(this.hotel, hotelConfirmationResponseBooking.hotel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, created, reference, comments, totalPrice, currency, checkIn, checkOut, holder, hotel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelConfirmationResponseBooking {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("    checkOut: ").append(toIndentedString(checkOut)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    hotel: ").append(toIndentedString(hotel)).append("\n");
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
