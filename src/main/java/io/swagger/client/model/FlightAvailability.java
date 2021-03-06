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
import io.swagger.client.model.FlightAirport;
import io.swagger.client.model.FlightAvailabilityGroupOfFlights;
import io.swagger.client.model.FlightRecommendation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * FlightAvailability
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class FlightAvailability {
  @SerializedName("airlineDictionary")
  private List<FlightAirline> airlineDictionary = null;

  @SerializedName("airportDictionary")
  private List<FlightAirport> airportDictionary = null;

  @SerializedName("bestPrice")
  private Integer bestPrice = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("flightNeedExchangeDocuments")
  private Boolean flightNeedExchangeDocuments = null;

  @SerializedName("groupOfFlights")
  private FlightAvailabilityGroupOfFlights groupOfFlights = null;

  @SerializedName("isDomesticFlight")
  private Boolean isDomesticFlight = null;

  @SerializedName("recommendations")
  private List<FlightRecommendation> recommendations = null;

  public FlightAvailability airlineDictionary(List<FlightAirline> airlineDictionary) {
    this.airlineDictionary = airlineDictionary;
    return this;
  }

  public FlightAvailability addAirlineDictionaryItem(FlightAirline airlineDictionaryItem) {
    if (this.airlineDictionary == null) {
      this.airlineDictionary = new ArrayList<FlightAirline>();
    }
    this.airlineDictionary.add(airlineDictionaryItem);
    return this;
  }

   /**
   * Get airlineDictionary
   * @return airlineDictionary
  **/
  @Schema(example = "{\"AF\":{\"airline\":\"Air France\",\"bestPrice\":26597,\"callsign\":\"Airfrans\",\"code\":\"AF\",\"country_of_Origin\":\"France\",\"iata\":\"AF\",\"icao\":\"AFR\",\"name\":\"Air France\"},\"AH\":{\"airline\":\"Air Algerie\",\"bestPrice\":24951,\"callsign\":\"Air Algerie\",\"code\":\"AH\",\"country_of_Origin\":\"Algeria\",\"iata\":\"AH\",\"icao\":\"DAH\",\"name\":\"Air Algerie\"},\"AT\":{\"airline\":\"Royal Air Maroc\",\"bestPrice\":66151,\"callsign\":\"Royalair Maroc\",\"code\":\"AT\",\"country_of_Origin\":\"Morocco\",\"iata\":\"AT\",\"icao\":\"RAM\",\"name\":\"Royal Air Maroc\"},\"EK\":{\"airline\":\"Emirates\",\"bestPrice\":151918,\"callsign\":\"Emirates\",\"code\":\"EK\",\"country_of_Origin\":\"United Arab Emirates\",\"iata\":\"EK\",\"icao\":\"UAE\",\"name\":\"Emirates\"},\"TK\":{\"airline\":\"Turkish Airlines\",\"bestPrice\":100074,\"callsign\":\"Turk Air\",\"code\":\"TK\",\"country_of_Origin\":\"Turkey\",\"iata\":\"TK\",\"icao\":\"THY\",\"name\":\"Turkish Airlines\"}}", description = "")
  public List<FlightAirline> getAirlineDictionary() {
    return airlineDictionary;
  }

  public void setAirlineDictionary(List<FlightAirline> airlineDictionary) {
    this.airlineDictionary = airlineDictionary;
  }

  public FlightAvailability airportDictionary(List<FlightAirport> airportDictionary) {
    this.airportDictionary = airportDictionary;
    return this;
  }

  public FlightAvailability addAirportDictionaryItem(FlightAirport airportDictionaryItem) {
    if (this.airportDictionary == null) {
      this.airportDictionary = new ArrayList<FlightAirport>();
    }
    this.airportDictionary.add(airportDictionaryItem);
    return this;
  }

   /**
   * Get airportDictionary
   * @return airportDictionary
  **/
  @Schema(example = "{\"AAE\":{\"city_code\":\"AAE\",\"city_name\":\"Annaba\",\"country_code\":\"DZ\",\"country_name\":\"ALGERIA\",\"display\":\"Annaba Airport, Annaba, ALGERIA (AAE)\",\"iata\":\"AAE\",\"name\":\"Annaba Airport\",\"number_of_airports_in_the_city\":1},\"ALG\":{\"city_code\":\"ALG\",\"city_name\":\"Algiers\",\"country_code\":\"DZ\",\"country_name\":\"ALGERIA\",\"display\":\"Houari Boumediene Airport, Algiers, ALGERIA (ALG)\",\"iata\":\"ALG\",\"name\":\"Houari Boumediene Airport\",\"number_of_airports_in_the_city\":1},\"CDG\":{\"city_code\":\"PAR\",\"city_name\":\"Paris\",\"country_code\":\"FR\",\"country_name\":\"FRANCE\",\"display\":\"Charles de Gaulle International Airport, Paris, FRANCE (CDG)\",\"iata\":\"CDG\",\"name\":\"Charles de Gaulle International Airport\",\"number_of_airports_in_the_city\":7},\"CMN\":{\"city_code\":\"CAS\",\"city_name\":\"Casablanca\",\"country_code\":\"MA\",\"country_name\":\"MOROCCO\",\"display\":\"Mohammed V International Airport, Casablanca, MOROCCO (CMN)\",\"iata\":\"CMN\",\"name\":\"Mohammed V International Airport\",\"number_of_airports_in_the_city\":2},\"CZL\":{\"city_code\":\"CZL\",\"city_name\":\"Constantine\",\"country_code\":\"DZ\",\"country_name\":\"ALGERIA\",\"display\":\"Mohamed Boudiaf International Airport, Constantine, ALGERIA (CZL)\",\"iata\":\"CZL\",\"name\":\"Mohamed Boudiaf International Airport\",\"number_of_airports_in_the_city\":1},\"DXB\":{\"city_code\":\"DXB\",\"city_name\":\"Dubai\",\"country_code\":\"AE\",\"country_name\":\"UNITED ARAB EMIRATES\",\"display\":\"Dubai International Airport, Dubai, UNITED ARAB EMIRATES (DXB)\",\"iata\":\"DXB\",\"name\":\"Dubai International Airport\",\"number_of_airports_in_the_city\":3},\"IST\":{\"city_code\":\"IST\",\"city_name\":\"Istanbul\",\"country_code\":\"TR\",\"country_name\":\"TURKEY\",\"display\":\"Istanbul Airport, Istanbul, TURKEY (IST)\",\"iata\":\"IST\",\"name\":\"Istanbul Airport\",\"number_of_airports_in_the_city\":3},\"MRS\":{\"city_code\":\"MRS\",\"city_name\":\"Marseille\",\"country_code\":\"FR\",\"country_name\":\"FRANCE\",\"display\":\"Marseille Provence Airport, Marseille, FRANCE (MRS)\",\"iata\":\"MRS\",\"name\":\"Marseille Provence Airport\",\"number_of_airports_in_the_city\":2},\"ORN\":{\"city_code\":\"ORN\",\"city_name\":\"Oran\",\"country_code\":\"DZ\",\"country_name\":\"ALGERIA\",\"display\":\"Es Senia Airport, Oran, ALGERIA (ORN)\",\"iata\":\"ORN\",\"name\":\"Es Senia Airport\",\"number_of_airports_in_the_city\":1},\"ORY\":{\"city_code\":\"PAR\",\"city_name\":\"Paris\",\"country_code\":\"FR\",\"country_name\":\"FRANCE\",\"display\":\"Paris-Orly Airport, Paris, FRANCE (ORY)\",\"iata\":\"ORY\",\"name\":\"Paris-Orly Airport\",\"number_of_airports_in_the_city\":7},\"TLS\":{\"city_code\":\"TLS\",\"city_name\":\"Toulouse\",\"country_code\":\"FR\",\"country_name\":\"FRANCE\",\"display\":\"Toulouse-Blagnac Airport, Toulouse, FRANCE (TLS)\",\"iata\":\"TLS\",\"name\":\"Toulouse-Blagnac Airport\",\"number_of_airports_in_the_city\":1}}", description = "")
  public List<FlightAirport> getAirportDictionary() {
    return airportDictionary;
  }

  public void setAirportDictionary(List<FlightAirport> airportDictionary) {
    this.airportDictionary = airportDictionary;
  }

  public FlightAvailability bestPrice(Integer bestPrice) {
    this.bestPrice = bestPrice;
    return this;
  }

   /**
   * Get bestPrice
   * @return bestPrice
  **/
  @Schema(description = "")
  public Integer getBestPrice() {
    return bestPrice;
  }

  public void setBestPrice(Integer bestPrice) {
    this.bestPrice = bestPrice;
  }

  public FlightAvailability currency(String currency) {
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

  public FlightAvailability flightNeedExchangeDocuments(Boolean flightNeedExchangeDocuments) {
    this.flightNeedExchangeDocuments = flightNeedExchangeDocuments;
    return this;
  }

   /**
   * Get flightNeedExchangeDocuments
   * @return flightNeedExchangeDocuments
  **/
  @Schema(description = "")
  public Boolean isFlightNeedExchangeDocuments() {
    return flightNeedExchangeDocuments;
  }

  public void setFlightNeedExchangeDocuments(Boolean flightNeedExchangeDocuments) {
    this.flightNeedExchangeDocuments = flightNeedExchangeDocuments;
  }

  public FlightAvailability groupOfFlights(FlightAvailabilityGroupOfFlights groupOfFlights) {
    this.groupOfFlights = groupOfFlights;
    return this;
  }

   /**
   * Get groupOfFlights
   * @return groupOfFlights
  **/
  @Schema(description = "")
  public FlightAvailabilityGroupOfFlights getGroupOfFlights() {
    return groupOfFlights;
  }

  public void setGroupOfFlights(FlightAvailabilityGroupOfFlights groupOfFlights) {
    this.groupOfFlights = groupOfFlights;
  }

  public FlightAvailability isDomesticFlight(Boolean isDomesticFlight) {
    this.isDomesticFlight = isDomesticFlight;
    return this;
  }

   /**
   * Get isDomesticFlight
   * @return isDomesticFlight
  **/
  @Schema(description = "")
  public Boolean isIsDomesticFlight() {
    return isDomesticFlight;
  }

  public void setIsDomesticFlight(Boolean isDomesticFlight) {
    this.isDomesticFlight = isDomesticFlight;
  }

  public FlightAvailability recommendations(List<FlightRecommendation> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  public FlightAvailability addRecommendationsItem(FlightRecommendation recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new ArrayList<FlightRecommendation>();
    }
    this.recommendations.add(recommendationsItem);
    return this;
  }

   /**
   * Get recommendations
   * @return recommendations
  **/
  @Schema(description = "")
  public List<FlightRecommendation> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<FlightRecommendation> recommendations) {
    this.recommendations = recommendations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightAvailability flightAvailability = (FlightAvailability) o;
    return Objects.equals(this.airlineDictionary, flightAvailability.airlineDictionary) &&
        Objects.equals(this.airportDictionary, flightAvailability.airportDictionary) &&
        Objects.equals(this.bestPrice, flightAvailability.bestPrice) &&
        Objects.equals(this.currency, flightAvailability.currency) &&
        Objects.equals(this.flightNeedExchangeDocuments, flightAvailability.flightNeedExchangeDocuments) &&
        Objects.equals(this.groupOfFlights, flightAvailability.groupOfFlights) &&
        Objects.equals(this.isDomesticFlight, flightAvailability.isDomesticFlight) &&
        Objects.equals(this.recommendations, flightAvailability.recommendations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlineDictionary, airportDictionary, bestPrice, currency, flightNeedExchangeDocuments, groupOfFlights, isDomesticFlight, recommendations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightAvailability {\n");
    
    sb.append("    airlineDictionary: ").append(toIndentedString(airlineDictionary)).append("\n");
    sb.append("    airportDictionary: ").append(toIndentedString(airportDictionary)).append("\n");
    sb.append("    bestPrice: ").append(toIndentedString(bestPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    flightNeedExchangeDocuments: ").append(toIndentedString(flightNeedExchangeDocuments)).append("\n");
    sb.append("    groupOfFlights: ").append(toIndentedString(groupOfFlights)).append("\n");
    sb.append("    isDomesticFlight: ").append(toIndentedString(isDomesticFlight)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
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
