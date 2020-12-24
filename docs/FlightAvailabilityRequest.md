# FlightAvailabilityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional]
**bounds** | [**List&lt;FlightAvailibilityRequestBound&gt;**](FlightAvailibilityRequestBound.md) |  |  [optional]
**cabinClass** | [**CabinClassEnum**](#CabinClassEnum) | M &#x3D; ECONOMY STANDARD &lt;br&gt; Y &#x3D; ECONOMY &lt;br&gt; W &#x3D; ECONOMY PREMIUM &lt;br&gt; C &#x3D; BUSINESS &lt;br&gt; F &#x3D; FIRST |  [optional]
**tripType** | [**TripTypeEnum**](#TripTypeEnum) |  |  [optional]
**flexible** | **Boolean** |  |  [optional]
**range** | **Integer** |  |  [optional]
**nrOfAdult** | **Integer** |  |  [optional]
**nrOfChild** | **Integer** |  |  [optional]
**nrOfInfant** | **Integer** |  |  [optional]
**nrOfInfantWithSeat** | **Integer** |  |  [optional]
**nrOfSenior** | **Integer** |  |  [optional]
**nrOfYouth** | **Integer** |  |  [optional]
**requestedFlightNonStop** | **Boolean** |  |  [optional]
**requestedMultiCity** | **Boolean** |  |  [optional]

<a name="LanguageEnum"></a>
## Enum: LanguageEnum
Name | Value
---- | -----
EN | &quot;EN&quot;
FR | &quot;FR&quot;
AR | &quot;AR&quot;

<a name="CabinClassEnum"></a>
## Enum: CabinClassEnum
Name | Value
---- | -----
M | &quot;M&quot;
Y | &quot;Y&quot;
W | &quot;W&quot;
C | &quot;C&quot;
F | &quot;F&quot;

<a name="TripTypeEnum"></a>
## Enum: TripTypeEnum
Name | Value
---- | -----
RT | &quot;rt&quot;
OW | &quot;ow&quot;
MD | &quot;md&quot;
