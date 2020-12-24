# HotelRetrieveBookingResponseBooking

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reference** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**bookingDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**comments** | [**LocalDate**](LocalDate.md) |  |  [optional]
**totalPrice** | **Integer** |  |  [optional]
**currency** | **String** |  |  [optional]
**checkIn** | [**LocalDate**](LocalDate.md) |  |  [optional]
**checkOut** | [**LocalDate**](LocalDate.md) |  |  [optional]
**holder** | [**HotelConfirmationRequestHolder**](HotelConfirmationRequestHolder.md) |  |  [optional]
**hotel** | [**HotelCancellationResponseBookingHotel**](HotelCancellationResponseBookingHotel.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CONFIRMED | &quot;confirmed&quot;
PENDING | &quot;pending&quot;
CANCELLED | &quot;cancelled&quot;
