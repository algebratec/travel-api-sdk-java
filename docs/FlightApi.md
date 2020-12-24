# FlightApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**flightAirRevalidate**](FlightApi.md#flightAirRevalidate) | **POST** /v1/flight/booking/fare | airRevalidate service to check if flight is still bookable
[**flightAirportAutocomplete**](FlightApi.md#flightAirportAutocomplete) | **GET** /v1/flight/booking/airport/{term} | airport autocomplete service
[**flightAvailability**](FlightApi.md#flightAvailability) | **POST** /v1/flight/booking/availability | flight availability service
[**flightBookingConfirmaiton**](FlightApi.md#flightBookingConfirmaiton) | **POST** /v1/flight/booking/confirmation | confirm flight booking
[**flightFare**](FlightApi.md#flightFare) | **POST** /v1/flight/booking/fareRules | flight fare service, this service provide the airline fare rules
[**flightOnHoldBookingConfirmation**](FlightApi.md#flightOnHoldBookingConfirmation) | **POST** /v1/flight/booking/confirmOnHoldBooking/{bookingId} | confirm on hold flight booking
[**flightRefreshPNR**](FlightApi.md#flightRefreshPNR) | **POST** /v1/flight/booking/refresh/{bookingId} | Refresh flight booking using booking id
[**flightRetrievePNR**](FlightApi.md#flightRetrievePNR) | **GET** /v1/flight/booking/retrievePNR/{recordLocator} | retrieve PNR using PNR record
[**flightVoidPNR**](FlightApi.md#flightVoidPNR) | **DELETE** /v1/flight/booking/voidPNR/{bookingId} | void PNR service, this service should be used in non BSP market to cancel the PNR before midnight

<a name="flightAirRevalidate"></a>
# **flightAirRevalidate**
> FlightFareResponse flightAirRevalidate(body)

airRevalidate service to check if flight is still bookable

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlightApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_auth
ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
api_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_auth.setApiKeyPrefix("Token");

FlightApi apiInstance = new FlightApi();
FlightBookingKeyRequest body = new FlightBookingKeyRequest(); // FlightBookingKeyRequest | 
try {
    FlightFareResponse result = apiInstance.flightAirRevalidate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlightApi#flightAirRevalidate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlightBookingKeyRequest**](FlightBookingKeyRequest.md)|  | [optional]

### Return type

[**FlightFareResponse**](FlightFareResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: json

<a name="flightAirportAutocomplete"></a>
# **flightAirportAutocomplete**
> FlightAirportAutocompleteResponse flightAirportAutocomplete(term)

airport autocomplete service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlightApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **String**|  |

### Return type

[**FlightAirportAutocompleteResponse**](FlightAirportAutocompleteResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: json

<a name="flightAvailability"></a>
# **flightAvailability**
> FlightAvailabilityResponse flightAvailability(body)

flight availability service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlightApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlightAvailabilityRequest**](FlightAvailabilityRequest.md)|  | [optional]

### Return type

[**FlightAvailabilityResponse**](FlightAvailabilityResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: json

<a name="flightBookingConfirmaiton"></a>
# **flightBookingConfirmaiton**
> FlightBookingResponse flightBookingConfirmaiton(body)

confirm flight booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlightApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlightConfirmationRequest**](FlightConfirmationRequest.md)|  | [optional]

### Return type

[**FlightBookingResponse**](FlightBookingResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: json

<a name="flightFare"></a>
# **flightFare**
> FlightFareRulesResponse flightFare(body)

flight fare service, this service provide the airline fare rules

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlightApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_auth
ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
api_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_auth.setApiKeyPrefix("Token");

FlightApi apiInstance = new FlightApi();
FlightBookingKeyRequest body = new FlightBookingKeyRequest(); // FlightBookingKeyRequest | 
try {
    FlightFareRulesResponse result = apiInstance.flightFare(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlightApi#flightFare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlightBookingKeyRequest**](FlightBookingKeyRequest.md)|  | [optional]

### Return type

[**FlightFareRulesResponse**](FlightFareRulesResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: json

<a name="flightOnHoldBookingConfirmation"></a>
# **flightOnHoldBookingConfirmation**
> FlightBookingResponse flightOnHoldBookingConfirmation(bookingId)

confirm on hold flight booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlightApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **String**|  |

### Return type

[**FlightBookingResponse**](FlightBookingResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: json

<a name="flightRefreshPNR"></a>
# **flightRefreshPNR**
> FlightBookingResponse flightRefreshPNR(bookingId)

Refresh flight booking using booking id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlightApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **String**|  |

### Return type

[**FlightBookingResponse**](FlightBookingResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: json

<a name="flightRetrievePNR"></a>
# **flightRetrievePNR**
> FlightBookingResponse flightRetrievePNR(recordLocator)

retrieve PNR using PNR record

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlightApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordLocator** | **String**|  |

### Return type

[**FlightBookingResponse**](FlightBookingResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: json

<a name="flightVoidPNR"></a>
# **flightVoidPNR**
> FlightBookingResponse flightVoidPNR(bookingId)

void PNR service, this service should be used in non BSP market to cancel the PNR before midnight

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlightApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **String**|  |

### Return type

[**FlightBookingResponse**](FlightBookingResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: json

