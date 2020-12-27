# FlightAvailabilityRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | [**LanguageEnum**](#LanguageEnum) | EN &#x3D; English &lt;br&gt; FR &#x3D; French &lt;br&gt; AR &#x3D; Arabic |  [optional]
**bounds** | [**List&lt;FlightAvailabilityRequestBound&gt;**](FlightAvailabilityRequestBound.md) |  |  [optional]
**cabinClass** | [**CabinClassEnum**](#CabinClassEnum) | M &#x3D; ECONOMY STANDARD &lt;br&gt; Y &#x3D; ECONOMY &lt;br&gt; W &#x3D; ECONOMY PREMIUM &lt;br&gt; C &#x3D; BUSINESS &lt;br&gt; F &#x3D; FIRST |  [optional]
**tripType** | [**TripTypeEnum**](#TripTypeEnum) | rt &#x3D; Roundtrip &lt;br&gt; ow &#x3D; Oneway &lt;br&gt; md &#x3D; multidestination |  [optional]
**flexible** | **Boolean** |  |  [optional]
**range** | **Integer** |  |  [optional]
**nrOfAdult** | **Integer** |  |  [optional]
**nrOfChild** | **Integer** |  |  [optional]
**nrOfInfant** | **Integer** |  |  [optional]
**nrOfInfantWithSeat** | **Integer** |  |  [optional]
**nrOfSenior** | **Integer** |  |  [optional]
**nrOfYouth** | **Integer** |  |  [optional]
**directFlight** | **Boolean** | if true, the system will reply with direct flights only |  [optional]
**withBaggage** | **Boolean** | if true, the system will reply with recommendations with baggage only |  [optional]

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
