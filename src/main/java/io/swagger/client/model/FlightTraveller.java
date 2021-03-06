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
import io.swagger.client.model.FlightBaseTraveller;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.LocalDate;
/**
 * FlightTraveller
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class FlightTraveller extends FlightBaseTraveller {
  /**
   * ADT &#x3D; Adult &lt;br&gt; CHD &#x3D; Child &lt;br&gt; INF &#x3D; Infant &lt;br&gt; INS &#x3D; Infant with seat &lt;br&gt; YTH &#x3D; Youth &lt;br&gt; SNR &#x3D; Senior
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ADT("ADT"),
    CHD("CHD"),
    INF("INF"),
    INS("INS"),
    YTH("YTH"),
    SNR("SNR");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * BBML &#x3D; INFANT/BABY FOOD &lt;br&gt; CHML &#x3D; CHILD MEAL &lt;br&gt; MOML &#x3D; HALAL MEAL &lt;br&gt; VGML &#x3D; VEGETARIAN MEAL &lt;br&gt; WCHR &#x3D; Wheelchair &lt;br&gt; WCHS &#x3D; Wheelchair with assistance &lt;br&gt; WCHC &#x3D; Passenger is completely motionless
   */
  @JsonAdapter(SpecialServiceEnum.Adapter.class)
  public enum SpecialServiceEnum {
    BBML("BBML"),
    CHML("CHML"),
    MOML("MOML"),
    VGML("VGML"),
    WCHR("WCHR"),
    WCHS("WCHS"),
    WCHC("WCHC");

    private String value;

    SpecialServiceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SpecialServiceEnum fromValue(String text) {
      for (SpecialServiceEnum b : SpecialServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SpecialServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpecialServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpecialServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SpecialServiceEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("specialService")
  private SpecialServiceEnum specialService = null;

  @SerializedName("infant")
  private FlightBaseTraveller infant = null;

  public FlightTraveller type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * ADT &#x3D; Adult &lt;br&gt; CHD &#x3D; Child &lt;br&gt; INF &#x3D; Infant &lt;br&gt; INS &#x3D; Infant with seat &lt;br&gt; YTH &#x3D; Youth &lt;br&gt; SNR &#x3D; Senior
   * @return type
  **/
  @Schema(description = "ADT = Adult <br> CHD = Child <br> INF = Infant <br> INS = Infant with seat <br> YTH = Youth <br> SNR = Senior")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FlightTraveller specialService(SpecialServiceEnum specialService) {
    this.specialService = specialService;
    return this;
  }

   /**
   * BBML &#x3D; INFANT/BABY FOOD &lt;br&gt; CHML &#x3D; CHILD MEAL &lt;br&gt; MOML &#x3D; HALAL MEAL &lt;br&gt; VGML &#x3D; VEGETARIAN MEAL &lt;br&gt; WCHR &#x3D; Wheelchair &lt;br&gt; WCHS &#x3D; Wheelchair with assistance &lt;br&gt; WCHC &#x3D; Passenger is completely motionless
   * @return specialService
  **/
  @Schema(description = "BBML = INFANT/BABY FOOD <br> CHML = CHILD MEAL <br> MOML = HALAL MEAL <br> VGML = VEGETARIAN MEAL <br> WCHR = Wheelchair <br> WCHS = Wheelchair with assistance <br> WCHC = Passenger is completely motionless")
  public SpecialServiceEnum getSpecialService() {
    return specialService;
  }

  public void setSpecialService(SpecialServiceEnum specialService) {
    this.specialService = specialService;
  }

  public FlightTraveller infant(FlightBaseTraveller infant) {
    this.infant = infant;
    return this;
  }

   /**
   * Get infant
   * @return infant
  **/
  @Schema(description = "")
  public FlightBaseTraveller getInfant() {
    return infant;
  }

  public void setInfant(FlightBaseTraveller infant) {
    this.infant = infant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightTraveller flightTraveller = (FlightTraveller) o;
    return Objects.equals(this.type, flightTraveller.type) &&
        Objects.equals(this.specialService, flightTraveller.specialService) &&
        Objects.equals(this.infant, flightTraveller.infant) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, specialService, infant, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightTraveller {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    specialService: ").append(toIndentedString(specialService)).append("\n");
    sb.append("    infant: ").append(toIndentedString(infant)).append("\n");
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
