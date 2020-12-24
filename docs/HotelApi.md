# HotelApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hotelAvailability**](HotelApi.md#hotelAvailability) | **POST** /v1/hotel/booking/availability | list bookable hotels
[**hotelBookingCancellation**](HotelApi.md#hotelBookingCancellation) | **DELETE** /v1/hotel/booking/cancellation/{reference} | cancel hotel booking
[**hotelBookingConfirmation**](HotelApi.md#hotelBookingConfirmation) | **POST** /v1/hotel/booking/confirmation | confirm hotel booking
[**hotelCheckRate**](HotelApi.md#hotelCheckRate) | **POST** /v1/hotel/booking/checkrate | check hotel rating
[**hotelRetrieveBooking**](HotelApi.md#hotelRetrieveBooking) | **POST** /v1/hotel/booking/{reference} | retrieve hotel booking

<a name="hotelAvailability"></a>
# **hotelAvailability**
> HotelAvailabilityResponse hotelAvailability(body)

list bookable hotels

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HotelApi;


HotelApi apiInstance = new HotelApi();
HotelAvailabilityRequest body = new HotelAvailabilityRequest(); // HotelAvailabilityRequest | 
try {
    HotelAvailabilityResponse result = apiInstance.hotelAvailability(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#hotelAvailability");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HotelAvailabilityRequest**](HotelAvailabilityRequest.md)|  | [optional]

### Return type

[**HotelAvailabilityResponse**](HotelAvailabilityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: json

<a name="hotelBookingCancellation"></a>
# **hotelBookingCancellation**
> HotelCancellationResponse hotelBookingCancellation(reference, SIMULATION, language)

cancel hotel booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HotelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_auth
ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
api_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_auth.setApiKeyPrefix("Token");

HotelApi apiInstance = new HotelApi();
String reference = "reference_example"; // String | 
Boolean SIMULATION = true; // Boolean | 
String language = "language_example"; // String | 
try {
    HotelCancellationResponse result = apiInstance.hotelBookingCancellation(reference, SIMULATION, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#hotelBookingCancellation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **String**|  |
 **SIMULATION** | **Boolean**|  |
 **language** | **String**|  | [optional]

### Return type

[**HotelCancellationResponse**](HotelCancellationResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: json

<a name="hotelBookingConfirmation"></a>
# **hotelBookingConfirmation**
> HotelConfirmationResponse hotelBookingConfirmation(body)

confirm hotel booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HotelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_auth
ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
api_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_auth.setApiKeyPrefix("Token");

HotelApi apiInstance = new HotelApi();
HotelConfirmationRequest body = new HotelConfirmationRequest(); // HotelConfirmationRequest | 
try {
    HotelConfirmationResponse result = apiInstance.hotelBookingConfirmation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#hotelBookingConfirmation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HotelConfirmationRequest**](HotelConfirmationRequest.md)|  | [optional]

### Return type

[**HotelConfirmationResponse**](HotelConfirmationResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: json

<a name="hotelCheckRate"></a>
# **hotelCheckRate**
> HotelCheckRatesResponse hotelCheckRate(body)

check hotel rating

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HotelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_auth
ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
api_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_auth.setApiKeyPrefix("Token");

HotelApi apiInstance = new HotelApi();
HotelCheckRatesRequest body = new HotelCheckRatesRequest(); // HotelCheckRatesRequest | 
try {
    HotelCheckRatesResponse result = apiInstance.hotelCheckRate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#hotelCheckRate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HotelCheckRatesRequest**](HotelCheckRatesRequest.md)|  | [optional]

### Return type

[**HotelCheckRatesResponse**](HotelCheckRatesResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: json

<a name="hotelRetrieveBooking"></a>
# **hotelRetrieveBooking**
> HotelRetrieveBookingResponse hotelRetrieveBooking(reference, language)

retrieve hotel booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HotelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_auth
ApiKeyAuth api_auth = (ApiKeyAuth) defaultClient.getAuthentication("api_auth");
api_auth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_auth.setApiKeyPrefix("Token");

HotelApi apiInstance = new HotelApi();
String reference = "reference_example"; // String | 
String language = "language_example"; // String | 
try {
    HotelRetrieveBookingResponse result = apiInstance.hotelRetrieveBooking(reference, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelApi#hotelRetrieveBooking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **String**|  |
 **language** | **String**|  | [optional]

### Return type

[**HotelRetrieveBookingResponse**](HotelRetrieveBookingResponse.md)

### Authorization

[api_auth](../README.md#api_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: json

