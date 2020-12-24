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
import io.swagger.client.model.FlightAirline;
import io.swagger.client.model.FlightBookingBounds;
import io.swagger.client.model.FlightBookingCustomer;
import io.swagger.client.model.FlightBookingEtickets;
import io.swagger.client.model.FlightBookingHistory;
import io.swagger.client.model.FlightDetailedPrice;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FlightBooking
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-24T22:56:10.425Z[GMT]")
public class FlightBooking {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("airlines")
  private List<FlightAirline> airlines = null;

  @SerializedName("booking_can_be_void")
  private Boolean bookingCanBeVoid = null;

  @SerializedName("booking_class")
  private String bookingClass = null;

  @SerializedName("booking_date")
  private String bookingDate = null;

  @SerializedName("booking_need_exchange_documents")
  private Boolean bookingNeedExchangeDocuments = null;

  @SerializedName("bounds")
  private List<FlightBookingBounds> bounds = null;

  @SerializedName("canceled")
  private Boolean canceled = null;

  @SerializedName("confirmed")
  private Boolean confirmed = null;

  @SerializedName("could_not_retrieve_etickets")
  private Boolean couldNotRetrieveEtickets = null;

  @SerializedName("customer")
  private FlightBookingCustomer customer = null;

  @SerializedName("customer_id")
  private Integer customerId = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("etickets")
  private List<FlightBookingEtickets> etickets = null;

  @SerializedName("history")
  private List<FlightBookingHistory> history = null;

  @SerializedName("modified")
  private Boolean modified = null;

  @SerializedName("offline")
  private Boolean offline = null;

  @SerializedName("option_deadline")
  private String optionDeadline = null;

  @SerializedName("origin")
  private String origin = null;

  @SerializedName("pax_number")
  private Integer paxNumber = null;

  @SerializedName("pending")
  private Boolean pending = null;

  @SerializedName("pnr")
  private String pnr = null;

  @SerializedName("price")
  private FlightDetailedPrice price = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("queued")
  private Boolean queued = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("refund")
  private FlightDetailedPrice refund = null;

  @SerializedName("routing")
  private String routing = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("ticketed")
  private Boolean ticketed = null;

  @SerializedName("trip_type")
  private String tripType = null;

  @SerializedName("validating_carrier")
  private String validatingCarrier = null;

  public FlightBooking id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public FlightBooking airlines(List<FlightAirline> airlines) {
    this.airlines = airlines;
    return this;
  }

  public FlightBooking addAirlinesItem(FlightAirline airlinesItem) {
    if (this.airlines == null) {
      this.airlines = new ArrayList<FlightAirline>();
    }
    this.airlines.add(airlinesItem);
    return this;
  }

   /**
   * Get airlines
   * @return airlines
  **/
  @Schema(description = "")
  public List<FlightAirline> getAirlines() {
    return airlines;
  }

  public void setAirlines(List<FlightAirline> airlines) {
    this.airlines = airlines;
  }

  public FlightBooking bookingCanBeVoid(Boolean bookingCanBeVoid) {
    this.bookingCanBeVoid = bookingCanBeVoid;
    return this;
  }

   /**
   * Get bookingCanBeVoid
   * @return bookingCanBeVoid
  **/
  @Schema(description = "")
  public Boolean isBookingCanBeVoid() {
    return bookingCanBeVoid;
  }

  public void setBookingCanBeVoid(Boolean bookingCanBeVoid) {
    this.bookingCanBeVoid = bookingCanBeVoid;
  }

  public FlightBooking bookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
    return this;
  }

   /**
   * Get bookingClass
   * @return bookingClass
  **/
  @Schema(description = "")
  public String getBookingClass() {
    return bookingClass;
  }

  public void setBookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
  }

  public FlightBooking bookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

   /**
   * Get bookingDate
   * @return bookingDate
  **/
  @Schema(description = "")
  public String getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }

  public FlightBooking bookingNeedExchangeDocuments(Boolean bookingNeedExchangeDocuments) {
    this.bookingNeedExchangeDocuments = bookingNeedExchangeDocuments;
    return this;
  }

   /**
   * Get bookingNeedExchangeDocuments
   * @return bookingNeedExchangeDocuments
  **/
  @Schema(description = "")
  public Boolean isBookingNeedExchangeDocuments() {
    return bookingNeedExchangeDocuments;
  }

  public void setBookingNeedExchangeDocuments(Boolean bookingNeedExchangeDocuments) {
    this.bookingNeedExchangeDocuments = bookingNeedExchangeDocuments;
  }

  public FlightBooking bounds(List<FlightBookingBounds> bounds) {
    this.bounds = bounds;
    return this;
  }

  public FlightBooking addBoundsItem(FlightBookingBounds boundsItem) {
    if (this.bounds == null) {
      this.bounds = new ArrayList<FlightBookingBounds>();
    }
    this.bounds.add(boundsItem);
    return this;
  }

   /**
   * Get bounds
   * @return bounds
  **/
  @Schema(description = "")
  public List<FlightBookingBounds> getBounds() {
    return bounds;
  }

  public void setBounds(List<FlightBookingBounds> bounds) {
    this.bounds = bounds;
  }

  public FlightBooking canceled(Boolean canceled) {
    this.canceled = canceled;
    return this;
  }

   /**
   * Get canceled
   * @return canceled
  **/
  @Schema(description = "")
  public Boolean isCanceled() {
    return canceled;
  }

  public void setCanceled(Boolean canceled) {
    this.canceled = canceled;
  }

  public FlightBooking confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @Schema(description = "")
  public Boolean isConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public FlightBooking couldNotRetrieveEtickets(Boolean couldNotRetrieveEtickets) {
    this.couldNotRetrieveEtickets = couldNotRetrieveEtickets;
    return this;
  }

   /**
   * Get couldNotRetrieveEtickets
   * @return couldNotRetrieveEtickets
  **/
  @Schema(description = "")
  public Boolean isCouldNotRetrieveEtickets() {
    return couldNotRetrieveEtickets;
  }

  public void setCouldNotRetrieveEtickets(Boolean couldNotRetrieveEtickets) {
    this.couldNotRetrieveEtickets = couldNotRetrieveEtickets;
  }

  public FlightBooking customer(FlightBookingCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @Schema(description = "")
  public FlightBookingCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(FlightBookingCustomer customer) {
    this.customer = customer;
  }

  public FlightBooking customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @Schema(description = "")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public FlightBooking destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @Schema(description = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public FlightBooking etickets(List<FlightBookingEtickets> etickets) {
    this.etickets = etickets;
    return this;
  }

  public FlightBooking addEticketsItem(FlightBookingEtickets eticketsItem) {
    if (this.etickets == null) {
      this.etickets = new ArrayList<FlightBookingEtickets>();
    }
    this.etickets.add(eticketsItem);
    return this;
  }

   /**
   * Get etickets
   * @return etickets
  **/
  @Schema(description = "")
  public List<FlightBookingEtickets> getEtickets() {
    return etickets;
  }

  public void setEtickets(List<FlightBookingEtickets> etickets) {
    this.etickets = etickets;
  }

  public FlightBooking history(List<FlightBookingHistory> history) {
    this.history = history;
    return this;
  }

  public FlightBooking addHistoryItem(FlightBookingHistory historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<FlightBookingHistory>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @Schema(description = "")
  public List<FlightBookingHistory> getHistory() {
    return history;
  }

  public void setHistory(List<FlightBookingHistory> history) {
    this.history = history;
  }

  public FlightBooking modified(Boolean modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @Schema(description = "")
  public Boolean isModified() {
    return modified;
  }

  public void setModified(Boolean modified) {
    this.modified = modified;
  }

  public FlightBooking offline(Boolean offline) {
    this.offline = offline;
    return this;
  }

   /**
   * Get offline
   * @return offline
  **/
  @Schema(description = "")
  public Boolean isOffline() {
    return offline;
  }

  public void setOffline(Boolean offline) {
    this.offline = offline;
  }

  public FlightBooking optionDeadline(String optionDeadline) {
    this.optionDeadline = optionDeadline;
    return this;
  }

   /**
   * Get optionDeadline
   * @return optionDeadline
  **/
  @Schema(description = "")
  public String getOptionDeadline() {
    return optionDeadline;
  }

  public void setOptionDeadline(String optionDeadline) {
    this.optionDeadline = optionDeadline;
  }

  public FlightBooking origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @Schema(description = "")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public FlightBooking paxNumber(Integer paxNumber) {
    this.paxNumber = paxNumber;
    return this;
  }

   /**
   * Get paxNumber
   * @return paxNumber
  **/
  @Schema(description = "")
  public Integer getPaxNumber() {
    return paxNumber;
  }

  public void setPaxNumber(Integer paxNumber) {
    this.paxNumber = paxNumber;
  }

  public FlightBooking pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @Schema(description = "")
  public Boolean isPending() {
    return pending;
  }

  public void setPending(Boolean pending) {
    this.pending = pending;
  }

  public FlightBooking pnr(String pnr) {
    this.pnr = pnr;
    return this;
  }

   /**
   * Get pnr
   * @return pnr
  **/
  @Schema(description = "")
  public String getPnr() {
    return pnr;
  }

  public void setPnr(String pnr) {
    this.pnr = pnr;
  }

  public FlightBooking price(FlightDetailedPrice price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public FlightDetailedPrice getPrice() {
    return price;
  }

  public void setPrice(FlightDetailedPrice price) {
    this.price = price;
  }

  public FlightBooking provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @Schema(description = "")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public FlightBooking queued(Boolean queued) {
    this.queued = queued;
    return this;
  }

   /**
   * Get queued
   * @return queued
  **/
  @Schema(description = "")
  public Boolean isQueued() {
    return queued;
  }

  public void setQueued(Boolean queued) {
    this.queued = queued;
  }

  public FlightBooking reference(String reference) {
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

  public FlightBooking refund(FlightDetailedPrice refund) {
    this.refund = refund;
    return this;
  }

   /**
   * Get refund
   * @return refund
  **/
  @Schema(description = "")
  public FlightDetailedPrice getRefund() {
    return refund;
  }

  public void setRefund(FlightDetailedPrice refund) {
    this.refund = refund;
  }

  public FlightBooking routing(String routing) {
    this.routing = routing;
    return this;
  }

   /**
   * Get routing
   * @return routing
  **/
  @Schema(description = "")
  public String getRouting() {
    return routing;
  }

  public void setRouting(String routing) {
    this.routing = routing;
  }

  public FlightBooking status(String status) {
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

  public FlightBooking ticketed(Boolean ticketed) {
    this.ticketed = ticketed;
    return this;
  }

   /**
   * Get ticketed
   * @return ticketed
  **/
  @Schema(description = "")
  public Boolean isTicketed() {
    return ticketed;
  }

  public void setTicketed(Boolean ticketed) {
    this.ticketed = ticketed;
  }

  public FlightBooking tripType(String tripType) {
    this.tripType = tripType;
    return this;
  }

   /**
   * Get tripType
   * @return tripType
  **/
  @Schema(description = "")
  public String getTripType() {
    return tripType;
  }

  public void setTripType(String tripType) {
    this.tripType = tripType;
  }

  public FlightBooking validatingCarrier(String validatingCarrier) {
    this.validatingCarrier = validatingCarrier;
    return this;
  }

   /**
   * Get validatingCarrier
   * @return validatingCarrier
  **/
  @Schema(description = "")
  public String getValidatingCarrier() {
    return validatingCarrier;
  }

  public void setValidatingCarrier(String validatingCarrier) {
    this.validatingCarrier = validatingCarrier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightBooking flightBooking = (FlightBooking) o;
    return Objects.equals(this.id, flightBooking.id) &&
        Objects.equals(this.airlines, flightBooking.airlines) &&
        Objects.equals(this.bookingCanBeVoid, flightBooking.bookingCanBeVoid) &&
        Objects.equals(this.bookingClass, flightBooking.bookingClass) &&
        Objects.equals(this.bookingDate, flightBooking.bookingDate) &&
        Objects.equals(this.bookingNeedExchangeDocuments, flightBooking.bookingNeedExchangeDocuments) &&
        Objects.equals(this.bounds, flightBooking.bounds) &&
        Objects.equals(this.canceled, flightBooking.canceled) &&
        Objects.equals(this.confirmed, flightBooking.confirmed) &&
        Objects.equals(this.couldNotRetrieveEtickets, flightBooking.couldNotRetrieveEtickets) &&
        Objects.equals(this.customer, flightBooking.customer) &&
        Objects.equals(this.customerId, flightBooking.customerId) &&
        Objects.equals(this.destination, flightBooking.destination) &&
        Objects.equals(this.etickets, flightBooking.etickets) &&
        Objects.equals(this.history, flightBooking.history) &&
        Objects.equals(this.modified, flightBooking.modified) &&
        Objects.equals(this.offline, flightBooking.offline) &&
        Objects.equals(this.optionDeadline, flightBooking.optionDeadline) &&
        Objects.equals(this.origin, flightBooking.origin) &&
        Objects.equals(this.paxNumber, flightBooking.paxNumber) &&
        Objects.equals(this.pending, flightBooking.pending) &&
        Objects.equals(this.pnr, flightBooking.pnr) &&
        Objects.equals(this.price, flightBooking.price) &&
        Objects.equals(this.provider, flightBooking.provider) &&
        Objects.equals(this.queued, flightBooking.queued) &&
        Objects.equals(this.reference, flightBooking.reference) &&
        Objects.equals(this.refund, flightBooking.refund) &&
        Objects.equals(this.routing, flightBooking.routing) &&
        Objects.equals(this.status, flightBooking.status) &&
        Objects.equals(this.ticketed, flightBooking.ticketed) &&
        Objects.equals(this.tripType, flightBooking.tripType) &&
        Objects.equals(this.validatingCarrier, flightBooking.validatingCarrier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, airlines, bookingCanBeVoid, bookingClass, bookingDate, bookingNeedExchangeDocuments, bounds, canceled, confirmed, couldNotRetrieveEtickets, customer, customerId, destination, etickets, history, modified, offline, optionDeadline, origin, paxNumber, pending, pnr, price, provider, queued, reference, refund, routing, status, ticketed, tripType, validatingCarrier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightBooking {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    airlines: ").append(toIndentedString(airlines)).append("\n");
    sb.append("    bookingCanBeVoid: ").append(toIndentedString(bookingCanBeVoid)).append("\n");
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    bookingNeedExchangeDocuments: ").append(toIndentedString(bookingNeedExchangeDocuments)).append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    couldNotRetrieveEtickets: ").append(toIndentedString(couldNotRetrieveEtickets)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    etickets: ").append(toIndentedString(etickets)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    optionDeadline: ").append(toIndentedString(optionDeadline)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    paxNumber: ").append(toIndentedString(paxNumber)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    pnr: ").append(toIndentedString(pnr)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ticketed: ").append(toIndentedString(ticketed)).append("\n");
    sb.append("    tripType: ").append(toIndentedString(tripType)).append("\n");
    sb.append("    validatingCarrier: ").append(toIndentedString(validatingCarrier)).append("\n");
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