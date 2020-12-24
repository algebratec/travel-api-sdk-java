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
import io.swagger.client.model.FlightAvailibilityRequestBound;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FlightAvailabilityRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-24T22:56:10.425Z[GMT]")
public class FlightAvailabilityRequest {
  /**
   * Gets or Sets language
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    EN("EN"),
    FR("FR"),
    AR("AR");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LanguageEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("language")
  private LanguageEnum language = null;

  @SerializedName("bounds")
  private List<FlightAvailibilityRequestBound> bounds = null;

  /**
   * M &#x3D; ECONOMY STANDARD &lt;br&gt; Y &#x3D; ECONOMY &lt;br&gt; W &#x3D; ECONOMY PREMIUM &lt;br&gt; C &#x3D; BUSINESS &lt;br&gt; F &#x3D; FIRST
   */
  @JsonAdapter(CabinClassEnum.Adapter.class)
  public enum CabinClassEnum {
    M("M"),
    Y("Y"),
    W("W"),
    C("C"),
    F("F");

    private String value;

    CabinClassEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CabinClassEnum fromValue(String text) {
      for (CabinClassEnum b : CabinClassEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CabinClassEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CabinClassEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CabinClassEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CabinClassEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("cabinClass")
  private CabinClassEnum cabinClass = null;

  /**
   * Gets or Sets tripType
   */
  @JsonAdapter(TripTypeEnum.Adapter.class)
  public enum TripTypeEnum {
    RT("rt"),
    OW("ow"),
    MD("md");

    private String value;

    TripTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TripTypeEnum fromValue(String text) {
      for (TripTypeEnum b : TripTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TripTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TripTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TripTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TripTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("tripType")
  private TripTypeEnum tripType = null;

  @SerializedName("flexible")
  private Boolean flexible = null;

  @SerializedName("range")
  private Integer range = null;

  @SerializedName("nrOfAdult")
  private Integer nrOfAdult = null;

  @SerializedName("nrOfChild")
  private Integer nrOfChild = null;

  @SerializedName("nrOfInfant")
  private Integer nrOfInfant = null;

  @SerializedName("nrOfInfantWithSeat")
  private Integer nrOfInfantWithSeat = null;

  @SerializedName("nrOfSenior")
  private Integer nrOfSenior = null;

  @SerializedName("nrOfYouth")
  private Integer nrOfYouth = null;

  @SerializedName("requestedFlightNonStop")
  private Boolean requestedFlightNonStop = null;

  @SerializedName("requestedMultiCity")
  private Boolean requestedMultiCity = null;

  public FlightAvailabilityRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @Schema(description = "")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public FlightAvailabilityRequest bounds(List<FlightAvailibilityRequestBound> bounds) {
    this.bounds = bounds;
    return this;
  }

  public FlightAvailabilityRequest addBoundsItem(FlightAvailibilityRequestBound boundsItem) {
    if (this.bounds == null) {
      this.bounds = new ArrayList<FlightAvailibilityRequestBound>();
    }
    this.bounds.add(boundsItem);
    return this;
  }

   /**
   * Get bounds
   * @return bounds
  **/
  @Schema(example = "[{\"departureDate\":\"2022-01-13\",\"destination\":\"PAR\",\"origin\":\"ALG\"},{\"departureDate\":\"2022-01-20\",\"destination\":\"ALG\",\"origin\":\"PAR\"}]", description = "")
  public List<FlightAvailibilityRequestBound> getBounds() {
    return bounds;
  }

  public void setBounds(List<FlightAvailibilityRequestBound> bounds) {
    this.bounds = bounds;
  }

  public FlightAvailabilityRequest cabinClass(CabinClassEnum cabinClass) {
    this.cabinClass = cabinClass;
    return this;
  }

   /**
   * M &#x3D; ECONOMY STANDARD &lt;br&gt; Y &#x3D; ECONOMY &lt;br&gt; W &#x3D; ECONOMY PREMIUM &lt;br&gt; C &#x3D; BUSINESS &lt;br&gt; F &#x3D; FIRST
   * @return cabinClass
  **/
  @Schema(description = "M = ECONOMY STANDARD <br> Y = ECONOMY <br> W = ECONOMY PREMIUM <br> C = BUSINESS <br> F = FIRST")
  public CabinClassEnum getCabinClass() {
    return cabinClass;
  }

  public void setCabinClass(CabinClassEnum cabinClass) {
    this.cabinClass = cabinClass;
  }

  public FlightAvailabilityRequest tripType(TripTypeEnum tripType) {
    this.tripType = tripType;
    return this;
  }

   /**
   * Get tripType
   * @return tripType
  **/
  @Schema(description = "")
  public TripTypeEnum getTripType() {
    return tripType;
  }

  public void setTripType(TripTypeEnum tripType) {
    this.tripType = tripType;
  }

  public FlightAvailabilityRequest flexible(Boolean flexible) {
    this.flexible = flexible;
    return this;
  }

   /**
   * Get flexible
   * @return flexible
  **/
  @Schema(description = "")
  public Boolean isFlexible() {
    return flexible;
  }

  public void setFlexible(Boolean flexible) {
    this.flexible = flexible;
  }

  public FlightAvailabilityRequest range(Integer range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @Schema(description = "")
  public Integer getRange() {
    return range;
  }

  public void setRange(Integer range) {
    this.range = range;
  }

  public FlightAvailabilityRequest nrOfAdult(Integer nrOfAdult) {
    this.nrOfAdult = nrOfAdult;
    return this;
  }

   /**
   * Get nrOfAdult
   * @return nrOfAdult
  **/
  @Schema(description = "")
  public Integer getNrOfAdult() {
    return nrOfAdult;
  }

  public void setNrOfAdult(Integer nrOfAdult) {
    this.nrOfAdult = nrOfAdult;
  }

  public FlightAvailabilityRequest nrOfChild(Integer nrOfChild) {
    this.nrOfChild = nrOfChild;
    return this;
  }

   /**
   * Get nrOfChild
   * @return nrOfChild
  **/
  @Schema(description = "")
  public Integer getNrOfChild() {
    return nrOfChild;
  }

  public void setNrOfChild(Integer nrOfChild) {
    this.nrOfChild = nrOfChild;
  }

  public FlightAvailabilityRequest nrOfInfant(Integer nrOfInfant) {
    this.nrOfInfant = nrOfInfant;
    return this;
  }

   /**
   * Get nrOfInfant
   * @return nrOfInfant
  **/
  @Schema(description = "")
  public Integer getNrOfInfant() {
    return nrOfInfant;
  }

  public void setNrOfInfant(Integer nrOfInfant) {
    this.nrOfInfant = nrOfInfant;
  }

  public FlightAvailabilityRequest nrOfInfantWithSeat(Integer nrOfInfantWithSeat) {
    this.nrOfInfantWithSeat = nrOfInfantWithSeat;
    return this;
  }

   /**
   * Get nrOfInfantWithSeat
   * @return nrOfInfantWithSeat
  **/
  @Schema(description = "")
  public Integer getNrOfInfantWithSeat() {
    return nrOfInfantWithSeat;
  }

  public void setNrOfInfantWithSeat(Integer nrOfInfantWithSeat) {
    this.nrOfInfantWithSeat = nrOfInfantWithSeat;
  }

  public FlightAvailabilityRequest nrOfSenior(Integer nrOfSenior) {
    this.nrOfSenior = nrOfSenior;
    return this;
  }

   /**
   * Get nrOfSenior
   * @return nrOfSenior
  **/
  @Schema(description = "")
  public Integer getNrOfSenior() {
    return nrOfSenior;
  }

  public void setNrOfSenior(Integer nrOfSenior) {
    this.nrOfSenior = nrOfSenior;
  }

  public FlightAvailabilityRequest nrOfYouth(Integer nrOfYouth) {
    this.nrOfYouth = nrOfYouth;
    return this;
  }

   /**
   * Get nrOfYouth
   * @return nrOfYouth
  **/
  @Schema(description = "")
  public Integer getNrOfYouth() {
    return nrOfYouth;
  }

  public void setNrOfYouth(Integer nrOfYouth) {
    this.nrOfYouth = nrOfYouth;
  }

  public FlightAvailabilityRequest requestedFlightNonStop(Boolean requestedFlightNonStop) {
    this.requestedFlightNonStop = requestedFlightNonStop;
    return this;
  }

   /**
   * Get requestedFlightNonStop
   * @return requestedFlightNonStop
  **/
  @Schema(description = "")
  public Boolean isRequestedFlightNonStop() {
    return requestedFlightNonStop;
  }

  public void setRequestedFlightNonStop(Boolean requestedFlightNonStop) {
    this.requestedFlightNonStop = requestedFlightNonStop;
  }

  public FlightAvailabilityRequest requestedMultiCity(Boolean requestedMultiCity) {
    this.requestedMultiCity = requestedMultiCity;
    return this;
  }

   /**
   * Get requestedMultiCity
   * @return requestedMultiCity
  **/
  @Schema(description = "")
  public Boolean isRequestedMultiCity() {
    return requestedMultiCity;
  }

  public void setRequestedMultiCity(Boolean requestedMultiCity) {
    this.requestedMultiCity = requestedMultiCity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightAvailabilityRequest flightAvailabilityRequest = (FlightAvailabilityRequest) o;
    return Objects.equals(this.language, flightAvailabilityRequest.language) &&
        Objects.equals(this.bounds, flightAvailabilityRequest.bounds) &&
        Objects.equals(this.cabinClass, flightAvailabilityRequest.cabinClass) &&
        Objects.equals(this.tripType, flightAvailabilityRequest.tripType) &&
        Objects.equals(this.flexible, flightAvailabilityRequest.flexible) &&
        Objects.equals(this.range, flightAvailabilityRequest.range) &&
        Objects.equals(this.nrOfAdult, flightAvailabilityRequest.nrOfAdult) &&
        Objects.equals(this.nrOfChild, flightAvailabilityRequest.nrOfChild) &&
        Objects.equals(this.nrOfInfant, flightAvailabilityRequest.nrOfInfant) &&
        Objects.equals(this.nrOfInfantWithSeat, flightAvailabilityRequest.nrOfInfantWithSeat) &&
        Objects.equals(this.nrOfSenior, flightAvailabilityRequest.nrOfSenior) &&
        Objects.equals(this.nrOfYouth, flightAvailabilityRequest.nrOfYouth) &&
        Objects.equals(this.requestedFlightNonStop, flightAvailabilityRequest.requestedFlightNonStop) &&
        Objects.equals(this.requestedMultiCity, flightAvailabilityRequest.requestedMultiCity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, bounds, cabinClass, tripType, flexible, range, nrOfAdult, nrOfChild, nrOfInfant, nrOfInfantWithSeat, nrOfSenior, nrOfYouth, requestedFlightNonStop, requestedMultiCity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightAvailabilityRequest {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
    sb.append("    cabinClass: ").append(toIndentedString(cabinClass)).append("\n");
    sb.append("    tripType: ").append(toIndentedString(tripType)).append("\n");
    sb.append("    flexible: ").append(toIndentedString(flexible)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    nrOfAdult: ").append(toIndentedString(nrOfAdult)).append("\n");
    sb.append("    nrOfChild: ").append(toIndentedString(nrOfChild)).append("\n");
    sb.append("    nrOfInfant: ").append(toIndentedString(nrOfInfant)).append("\n");
    sb.append("    nrOfInfantWithSeat: ").append(toIndentedString(nrOfInfantWithSeat)).append("\n");
    sb.append("    nrOfSenior: ").append(toIndentedString(nrOfSenior)).append("\n");
    sb.append("    nrOfYouth: ").append(toIndentedString(nrOfYouth)).append("\n");
    sb.append("    requestedFlightNonStop: ").append(toIndentedString(requestedFlightNonStop)).append("\n");
    sb.append("    requestedMultiCity: ").append(toIndentedString(requestedMultiCity)).append("\n");
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
