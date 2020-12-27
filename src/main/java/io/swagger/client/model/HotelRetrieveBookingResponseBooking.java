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
 * HotelRetrieveBookingResponseBooking
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class HotelRetrieveBookingResponseBooking {
  @SerializedName("reference")
  private String reference = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CONFIRMED("confirmed"),
    PENDING("pending"),
    CANCELLED("cancelled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("bookingDate")
  private LocalDate bookingDate = null;

  @SerializedName("comments")
  private LocalDate comments = null;

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

  public HotelRetrieveBookingResponseBooking reference(String reference) {
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

  public HotelRetrieveBookingResponseBooking status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public HotelRetrieveBookingResponseBooking bookingDate(LocalDate bookingDate) {
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

  public HotelRetrieveBookingResponseBooking comments(LocalDate comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @Schema(description = "")
  public LocalDate getComments() {
    return comments;
  }

  public void setComments(LocalDate comments) {
    this.comments = comments;
  }

  public HotelRetrieveBookingResponseBooking totalPrice(Integer totalPrice) {
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

  public HotelRetrieveBookingResponseBooking currency(String currency) {
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

  public HotelRetrieveBookingResponseBooking checkIn(LocalDate checkIn) {
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

  public HotelRetrieveBookingResponseBooking checkOut(LocalDate checkOut) {
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

  public HotelRetrieveBookingResponseBooking holder(HotelConfirmationRequestHolder holder) {
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

  public HotelRetrieveBookingResponseBooking hotel(HotelCancellationResponseBookingHotel hotel) {
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
    HotelRetrieveBookingResponseBooking hotelRetrieveBookingResponseBooking = (HotelRetrieveBookingResponseBooking) o;
    return Objects.equals(this.reference, hotelRetrieveBookingResponseBooking.reference) &&
        Objects.equals(this.status, hotelRetrieveBookingResponseBooking.status) &&
        Objects.equals(this.bookingDate, hotelRetrieveBookingResponseBooking.bookingDate) &&
        Objects.equals(this.comments, hotelRetrieveBookingResponseBooking.comments) &&
        Objects.equals(this.totalPrice, hotelRetrieveBookingResponseBooking.totalPrice) &&
        Objects.equals(this.currency, hotelRetrieveBookingResponseBooking.currency) &&
        Objects.equals(this.checkIn, hotelRetrieveBookingResponseBooking.checkIn) &&
        Objects.equals(this.checkOut, hotelRetrieveBookingResponseBooking.checkOut) &&
        Objects.equals(this.holder, hotelRetrieveBookingResponseBooking.holder) &&
        Objects.equals(this.hotel, hotelRetrieveBookingResponseBooking.hotel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, status, bookingDate, comments, totalPrice, currency, checkIn, checkOut, holder, hotel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRetrieveBookingResponseBooking {\n");
    
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
