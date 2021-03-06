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
import io.swagger.client.model.HotelCancellationResponseBookingHotel;
import io.swagger.client.model.HotelConfirmationRequestHolder;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.LocalDate;
/**
 * HotelCancellationResponseBooking
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class HotelCancellationResponseBooking {
  @SerializedName("reference")
  private String reference = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("bookingDate")
  private LocalDate bookingDate = null;

  @SerializedName("comments")
  private Integer comments = null;

  @SerializedName("totalPrice")
  private Integer totalPrice = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("checkIn")
  private LocalDate checkIn = null;

  @SerializedName("checkOut")
  private LocalDate checkOut = null;

  @SerializedName("holder")
  private HotelConfirmationRequestHolder holder = null;

  @SerializedName("hotel")
  private HotelCancellationResponseBookingHotel hotel = null;

  public HotelCancellationResponseBooking reference(String reference) {
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

  public HotelCancellationResponseBooking status(String status) {
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

  public HotelCancellationResponseBooking bookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

   /**
   * Get bookingDate
   * @return bookingDate
  **/
  @Schema(description = "")
  public LocalDate getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
  }

  public HotelCancellationResponseBooking comments(Integer comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @Schema(description = "")
  public Integer getComments() {
    return comments;
  }

  public void setComments(Integer comments) {
    this.comments = comments;
  }

  public HotelCancellationResponseBooking totalPrice(Integer totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

   /**
   * Get totalPrice
   * @return totalPrice
  **/
  @Schema(description = "")
  public Integer getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Integer totalPrice) {
    this.totalPrice = totalPrice;
  }

  public HotelCancellationResponseBooking currency(String currency) {
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

  public HotelCancellationResponseBooking checkIn(LocalDate checkIn) {
    this.checkIn = checkIn;
    return this;
  }

   /**
   * Get checkIn
   * @return checkIn
  **/
  @Schema(description = "")
  public LocalDate getCheckIn() {
    return checkIn;
  }

  public void setCheckIn(LocalDate checkIn) {
    this.checkIn = checkIn;
  }

  public HotelCancellationResponseBooking checkOut(LocalDate checkOut) {
    this.checkOut = checkOut;
    return this;
  }

   /**
   * Get checkOut
   * @return checkOut
  **/
  @Schema(description = "")
  public LocalDate getCheckOut() {
    return checkOut;
  }

  public void setCheckOut(LocalDate checkOut) {
    this.checkOut = checkOut;
  }

  public HotelCancellationResponseBooking holder(HotelConfirmationRequestHolder holder) {
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

  public HotelCancellationResponseBooking hotel(HotelCancellationResponseBookingHotel hotel) {
    this.hotel = hotel;
    return this;
  }

   /**
   * Get hotel
   * @return hotel
  **/
  @Schema(description = "")
  public HotelCancellationResponseBookingHotel getHotel() {
    return hotel;
  }

  public void setHotel(HotelCancellationResponseBookingHotel hotel) {
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
    HotelCancellationResponseBooking hotelCancellationResponseBooking = (HotelCancellationResponseBooking) o;
    return Objects.equals(this.reference, hotelCancellationResponseBooking.reference) &&
        Objects.equals(this.status, hotelCancellationResponseBooking.status) &&
        Objects.equals(this.bookingDate, hotelCancellationResponseBooking.bookingDate) &&
        Objects.equals(this.comments, hotelCancellationResponseBooking.comments) &&
        Objects.equals(this.totalPrice, hotelCancellationResponseBooking.totalPrice) &&
        Objects.equals(this.currency, hotelCancellationResponseBooking.currency) &&
        Objects.equals(this.checkIn, hotelCancellationResponseBooking.checkIn) &&
        Objects.equals(this.checkOut, hotelCancellationResponseBooking.checkOut) &&
        Objects.equals(this.holder, hotelCancellationResponseBooking.holder) &&
        Objects.equals(this.hotel, hotelCancellationResponseBooking.hotel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, status, bookingDate, comments, totalPrice, currency, checkIn, checkOut, holder, hotel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelCancellationResponseBooking {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
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
