# FlightTraveller

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | ADT &#x3D; Adult &lt;br&gt; CHD &#x3D; Child &lt;br&gt; INF &#x3D; Infant &lt;br&gt; INS &#x3D; Infant with seat &lt;br&gt; YTH &#x3D; Youth &lt;br&gt; SNR &#x3D; Senior |  [optional]
**specialService** | [**SpecialServiceEnum**](#SpecialServiceEnum) | BBML &#x3D; INFANT/BABY FOOD &lt;br&gt; CHML &#x3D; CHILD MEAL &lt;br&gt; MOML &#x3D; HALAL MEAL &lt;br&gt; VGML &#x3D; VEGETARIAN MEAL &lt;br&gt; WCHR &#x3D; Wheelchair &lt;br&gt; WCHS &#x3D; Wheelchair with assistance &lt;br&gt; WCHC &#x3D; Passenger is completely motionless |  [optional]
**infant** | [**FlightBaseTraveller**](FlightBaseTraveller.md) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ADT | &quot;ADT&quot;
CHD | &quot;CHD&quot;
INF | &quot;INF&quot;
INS | &quot;INS&quot;
YTH | &quot;YTH&quot;
SNR | &quot;SNR&quot;

<a name="SpecialServiceEnum"></a>
## Enum: SpecialServiceEnum
Name | Value
---- | -----
BBML | &quot;BBML&quot;
CHML | &quot;CHML&quot;
MOML | &quot;MOML&quot;
VGML | &quot;VGML&quot;
WCHR | &quot;WCHR&quot;
WCHS | &quot;WCHS&quot;
WCHC | &quot;WCHC&quot;
