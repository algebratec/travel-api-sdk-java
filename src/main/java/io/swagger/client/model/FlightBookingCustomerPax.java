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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * FlightBookingCustomerPax
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-27T12:15:25.449Z[GMT]")
public class FlightBookingCustomerPax {
  @SerializedName("age")
  private BigDecimal age = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("husbands_name")
  private String husbandsName = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("surname")
  private String surname = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private String type = null;

  public FlightBookingCustomerPax age(BigDecimal age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @Schema(description = "")
  public BigDecimal getAge() {
    return age;
  }

  public void setAge(BigDecimal age) {
    this.age = age;
  }

  public FlightBookingCustomerPax firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @Schema(description = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public FlightBookingCustomerPax gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @Schema(description = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public FlightBookingCustomerPax husbandsName(String husbandsName) {
    this.husbandsName = husbandsName;
    return this;
  }

   /**
   * Get husbandsName
   * @return husbandsName
  **/
  @Schema(description = "")
  public String getHusbandsName() {
    return husbandsName;
  }

  public void setHusbandsName(String husbandsName) {
    this.husbandsName = husbandsName;
  }

  public FlightBookingCustomerPax id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public FlightBookingCustomerPax lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @Schema(description = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public FlightBookingCustomerPax name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FlightBookingCustomerPax surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @Schema(description = "")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public FlightBookingCustomerPax title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FlightBookingCustomerPax type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightBookingCustomerPax flightBookingCustomerPax = (FlightBookingCustomerPax) o;
    return Objects.equals(this.age, flightBookingCustomerPax.age) &&
        Objects.equals(this.firstname, flightBookingCustomerPax.firstname) &&
        Objects.equals(this.gender, flightBookingCustomerPax.gender) &&
        Objects.equals(this.husbandsName, flightBookingCustomerPax.husbandsName) &&
        Objects.equals(this.id, flightBookingCustomerPax.id) &&
        Objects.equals(this.lastname, flightBookingCustomerPax.lastname) &&
        Objects.equals(this.name, flightBookingCustomerPax.name) &&
        Objects.equals(this.surname, flightBookingCustomerPax.surname) &&
        Objects.equals(this.title, flightBookingCustomerPax.title) &&
        Objects.equals(this.type, flightBookingCustomerPax.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, firstname, gender, husbandsName, id, lastname, name, surname, title, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightBookingCustomerPax {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    husbandsName: ").append(toIndentedString(husbandsName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
