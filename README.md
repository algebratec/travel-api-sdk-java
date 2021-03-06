# swagger-java-client

Algebratec API
- API version: 1.0.0
  - Build date: 2020-12-27T12:15:25.449Z[GMT]

Learn and test our api with ease


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FlightApi;

import java.io.File;
import java.util.*;

public class FlightApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_auth
        ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
        api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_auth.setApiKeyPrefix("Token");

        FlightApi apiInstance = new FlightApi();
        String term = "term_example"; // String | 
        try {
            FlightAirportAutocompleteResponse result = apiInstance.flightAirportAutocomplete(term);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlightApi#flightAirportAutocomplete");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FlightApi;

import java.io.File;
import java.util.*;

public class FlightApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_auth
        ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
        api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_auth.setApiKeyPrefix("Token");

        FlightApi apiInstance = new FlightApi();
        FlightAvailabilityRequest body = new FlightAvailabilityRequest(); // FlightAvailabilityRequest | 
        try {
            FlightAvailabilityResponse result = apiInstance.flightAvailability(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlightApi#flightAvailability");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FlightApi;

import java.io.File;
import java.util.*;

public class FlightApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_auth
        ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
        api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_auth.setApiKeyPrefix("Token");

        FlightApi apiInstance = new FlightApi();
        FlightConfirmationRequest body = new FlightConfirmationRequest(); // FlightConfirmationRequest | 
        try {
            FlightBookingResponse result = apiInstance.flightBookingConfirmaiton(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlightApi#flightBookingConfirmaiton");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FlightApi;

import java.io.File;
import java.util.*;

public class FlightApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_auth
        ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
        api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_auth.setApiKeyPrefix("Token");

        FlightApi apiInstance = new FlightApi();
        FlightBookingKeyRequest body = new FlightBookingKeyRequest(); // FlightBookingKeyRequest | 
        try {
            FlightFareResponse result = apiInstance.flightFare(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlightApi#flightFare");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FlightApi;

import java.io.File;
import java.util.*;

public class FlightApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_auth
        ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
        api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_auth.setApiKeyPrefix("Token");

        FlightApi apiInstance = new FlightApi();
        FlightBookingKeyRequest body = new FlightBookingKeyRequest(); // FlightBookingKeyRequest | 
        try {
            FlightFareRulesResponse result = apiInstance.flightFareRules(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlightApi#flightFareRules");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FlightApi;

import java.io.File;
import java.util.*;

public class FlightApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_auth
        ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
        api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_auth.setApiKeyPrefix("Token");

        FlightApi apiInstance = new FlightApi();
        String bookingId = "bookingId_example"; // String | 
        try {
            FlightBookingResponse result = apiInstance.flightOnHoldBookingConfirmation(bookingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlightApi#flightOnHoldBookingConfirmation");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FlightApi;

import java.io.File;
import java.util.*;

public class FlightApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_auth
        ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
        api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_auth.setApiKeyPrefix("Token");

        FlightApi apiInstance = new FlightApi();
        String bookingId = "bookingId_example"; // String | 
        try {
            FlightBookingResponse result = apiInstance.flightRefreshPNR(bookingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlightApi#flightRefreshPNR");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FlightApi;

import java.io.File;
import java.util.*;

public class FlightApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_auth
        ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
        api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_auth.setApiKeyPrefix("Token");

        FlightApi apiInstance = new FlightApi();
        String recordLocator = "recordLocator_example"; // String | 
        try {
            FlightBookingResponse result = apiInstance.flightRetrievePNR(recordLocator);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlightApi#flightRetrievePNR");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FlightApi;

import java.io.File;
import java.util.*;

public class FlightApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_auth
        ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
        api_auth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_auth.setApiKeyPrefix("Token");

        FlightApi apiInstance = new FlightApi();
        String bookingId = "bookingId_example"; // String | 
        try {
            FlightBookingResponse result = apiInstance.flightVoidPNR(bookingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FlightApi#flightVoidPNR");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/alswagger/algebratecAPI/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FlightApi* | [**flightAirportAutocomplete**](docs/FlightApi.md#flightAirportAutocomplete) | **GET** /v1/flight/booking/airport/{term} | airport autocomplete service
*FlightApi* | [**flightAvailability**](docs/FlightApi.md#flightAvailability) | **POST** /v1/flight/booking/availability | flight availability service
*FlightApi* | [**flightBookingConfirmaiton**](docs/FlightApi.md#flightBookingConfirmaiton) | **POST** /v1/flight/booking/confirmation | confirm flight booking
*FlightApi* | [**flightFare**](docs/FlightApi.md#flightFare) | **POST** /v1/flight/booking/fare | fare service to check if flight is still bookable
*FlightApi* | [**flightFareRules**](docs/FlightApi.md#flightFareRules) | **POST** /v1/flight/booking/fareRules | flight fare rules service, this service provide the airline fare rules
*FlightApi* | [**flightOnHoldBookingConfirmation**](docs/FlightApi.md#flightOnHoldBookingConfirmation) | **POST** /v1/flight/booking/confirmOnHoldBooking/{bookingId} | confirm on hold flight booking
*FlightApi* | [**flightRefreshPNR**](docs/FlightApi.md#flightRefreshPNR) | **POST** /v1/flight/booking/refresh/{bookingId} | Refresh flight booking using booking id
*FlightApi* | [**flightRetrievePNR**](docs/FlightApi.md#flightRetrievePNR) | **GET** /v1/flight/booking/retrievePNR/{recordLocator} | retrieve PNR using PNR record
*FlightApi* | [**flightVoidPNR**](docs/FlightApi.md#flightVoidPNR) | **DELETE** /v1/flight/booking/voidPNR/{bookingId} | void PNR service, this service should be used in non BSP market to cancel the PNR before midnight
*HotelApi* | [**hotelAvailability**](docs/HotelApi.md#hotelAvailability) | **POST** /v1/hotel/booking/availability | list bookable hotels
*HotelApi* | [**hotelBookingCancellation**](docs/HotelApi.md#hotelBookingCancellation) | **DELETE** /v1/hotel/booking/cancellation/{reference} | cancel hotel booking
*HotelApi* | [**hotelBookingConfirmation**](docs/HotelApi.md#hotelBookingConfirmation) | **POST** /v1/hotel/booking/confirmation | confirm hotel booking
*HotelApi* | [**hotelCheckRate**](docs/HotelApi.md#hotelCheckRate) | **POST** /v1/hotel/booking/checkrate | check hotel rating
*HotelApi* | [**hotelRetrieveBooking**](docs/HotelApi.md#hotelRetrieveBooking) | **POST** /v1/hotel/booking/{reference} | retrieve hotel booking

## Documentation for Models

 - [AlgebratecResponse](docs/AlgebratecResponse.md)
 - [Error](docs/Error.md)
 - [ErrorFields](docs/ErrorFields.md)
 - [FlightAirline](docs/FlightAirline.md)
 - [FlightAirport](docs/FlightAirport.md)
 - [FlightAirportAutocomplete](docs/FlightAirportAutocomplete.md)
 - [FlightAirportAutocompleteResponse](docs/FlightAirportAutocompleteResponse.md)
 - [FlightAvailability](docs/FlightAvailability.md)
 - [FlightAvailabilityFareDetails](docs/FlightAvailabilityFareDetails.md)
 - [FlightAvailabilityFareDetailsFares](docs/FlightAvailabilityFareDetailsFares.md)
 - [FlightAvailabilityGroupOfFlights](docs/FlightAvailabilityGroupOfFlights.md)
 - [FlightAvailabilityRequest](docs/FlightAvailabilityRequest.md)
 - [FlightAvailabilityRequestBound](docs/FlightAvailabilityRequestBound.md)
 - [FlightAvailabilityResponse](docs/FlightAvailabilityResponse.md)
 - [FlightAvailabilityResponseBound](docs/FlightAvailabilityResponseBound.md)
 - [FlightAvailabilitySegment](docs/FlightAvailabilitySegment.md)
 - [FlightAvailabilitySubRecommendation](docs/FlightAvailabilitySubRecommendation.md)
 - [FlightAvailabilitySubRecommendationBounds](docs/FlightAvailabilitySubRecommendationBounds.md)
 - [FlightBaggageAllowance](docs/FlightBaggageAllowance.md)
 - [FlightBaseTraveller](docs/FlightBaseTraveller.md)
 - [FlightBooking](docs/FlightBooking.md)
 - [FlightBookingArrivalLocation](docs/FlightBookingArrivalLocation.md)
 - [FlightBookingBounds](docs/FlightBookingBounds.md)
 - [FlightBookingCustomer](docs/FlightBookingCustomer.md)
 - [FlightBookingCustomerPax](docs/FlightBookingCustomerPax.md)
 - [FlightBookingEtickets](docs/FlightBookingEtickets.md)
 - [FlightBookingHistory](docs/FlightBookingHistory.md)
 - [FlightBookingKeyRequest](docs/FlightBookingKeyRequest.md)
 - [FlightBookingResponse](docs/FlightBookingResponse.md)
 - [FlightBookingSegments](docs/FlightBookingSegments.md)
 - [FlightConfirmationRequest](docs/FlightConfirmationRequest.md)
 - [FlightCustomer](docs/FlightCustomer.md)
 - [FlightDepartureAndArrivale](docs/FlightDepartureAndArrivale.md)
 - [FlightDetailedPrice](docs/FlightDetailedPrice.md)
 - [FlightFare](docs/FlightFare.md)
 - [FlightFareResponse](docs/FlightFareResponse.md)
 - [FlightFareRule](docs/FlightFareRule.md)
 - [FlightFareRulesResponse](docs/FlightFareRulesResponse.md)
 - [FlightPaxTypePrice](docs/FlightPaxTypePrice.md)
 - [FlightRecommendation](docs/FlightRecommendation.md)
 - [FlightTraveller](docs/FlightTraveller.md)
 - [HotelAvailabilityRequest](docs/HotelAvailabilityRequest.md)
 - [HotelAvailabilityRequestFilter](docs/HotelAvailabilityRequestFilter.md)
 - [HotelAvailabilityRequestGeolocation](docs/HotelAvailabilityRequestGeolocation.md)
 - [HotelAvailabilityRequestOccupancies](docs/HotelAvailabilityRequestOccupancies.md)
 - [HotelAvailabilityRequestPaxes](docs/HotelAvailabilityRequestPaxes.md)
 - [HotelAvailabilityRequestStay](docs/HotelAvailabilityRequestStay.md)
 - [HotelAvailabilityResponse](docs/HotelAvailabilityResponse.md)
 - [HotelAvailabilityResponseHotels](docs/HotelAvailabilityResponseHotels.md)
 - [HotelAvailabilityResponseHotelsAccommodations](docs/HotelAvailabilityResponseHotelsAccommodations.md)
 - [HotelAvailabilityResponseHotelsCancellationPolicies](docs/HotelAvailabilityResponseHotelsCancellationPolicies.md)
 - [HotelAvailabilityResponseHotelsCombinations](docs/HotelAvailabilityResponseHotelsCombinations.md)
 - [HotelAvailabilityResponseHotelsExtras](docs/HotelAvailabilityResponseHotelsExtras.md)
 - [HotelAvailabilityResponseHotelsHotels](docs/HotelAvailabilityResponseHotelsHotels.md)
 - [HotelAvailabilityResponseHotelsImages](docs/HotelAvailabilityResponseHotelsImages.md)
 - [HotelAvailabilityResponseHotelsRates](docs/HotelAvailabilityResponseHotelsRates.md)
 - [HotelAvailabilityResponseHotelsRooms](docs/HotelAvailabilityResponseHotelsRooms.md)
 - [HotelAvailabilityResponseHotelsTaxes](docs/HotelAvailabilityResponseHotelsTaxes.md)
 - [HotelAvailabilityResponseHotelsThemes](docs/HotelAvailabilityResponseHotelsThemes.md)
 - [HotelCancellationPolicy](docs/HotelCancellationPolicy.md)
 - [HotelCancellationResponse](docs/HotelCancellationResponse.md)
 - [HotelCancellationResponseBooking](docs/HotelCancellationResponseBooking.md)
 - [HotelCancellationResponseBookingHotel](docs/HotelCancellationResponseBookingHotel.md)
 - [HotelCancellationResponseBookingHotelRooms](docs/HotelCancellationResponseBookingHotelRooms.md)
 - [HotelCheckRatesRequest](docs/HotelCheckRatesRequest.md)
 - [HotelCheckRatesRequestRooms](docs/HotelCheckRatesRequestRooms.md)
 - [HotelCheckRatesResponse](docs/HotelCheckRatesResponse.md)
 - [HotelCheckRatesResponseHotel](docs/HotelCheckRatesResponseHotel.md)
 - [HotelCheckRatesResponseHotelRates](docs/HotelCheckRatesResponseHotelRates.md)
 - [HotelCheckRatesResponseHotelRooms](docs/HotelCheckRatesResponseHotelRooms.md)
 - [HotelConfirmationRequest](docs/HotelConfirmationRequest.md)
 - [HotelConfirmationRequestHolder](docs/HotelConfirmationRequestHolder.md)
 - [HotelConfirmationRequestPaxes](docs/HotelConfirmationRequestPaxes.md)
 - [HotelConfirmationRequestPayment](docs/HotelConfirmationRequestPayment.md)
 - [HotelConfirmationRequestRooms](docs/HotelConfirmationRequestRooms.md)
 - [HotelConfirmationResponse](docs/HotelConfirmationResponse.md)
 - [HotelConfirmationResponseBooking](docs/HotelConfirmationResponseBooking.md)
 - [HotelConfirmationResponseBookingHotel](docs/HotelConfirmationResponseBookingHotel.md)
 - [HotelConfirmationResponseBookingHotelExtras](docs/HotelConfirmationResponseBookingHotelExtras.md)
 - [HotelConfirmationResponseBookingHotelPaxes](docs/HotelConfirmationResponseBookingHotelPaxes.md)
 - [HotelConfirmationResponseBookingHotelRooms](docs/HotelConfirmationResponseBookingHotelRooms.md)
 - [HotelRetrieveBookingResponse](docs/HotelRetrieveBookingResponse.md)
 - [HotelRetrieveBookingResponseBooking](docs/HotelRetrieveBookingResponseBooking.md)
 - [Provider](docs/Provider.md)
 - [Supplier](docs/Supplier.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### api_auth

- **Type**: API key
- **API key parameter name**: X-AUTHORIZATION
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@algebratec.com
