package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Book
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-04T11:39:18.491115100+02:00[Europe/Bucharest]", comments = "Generator version: 7.8.0")
public class Book {

  private BigDecimal id;

  private String name;

  private Double price = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate releaseDate;

  private String genre;

  public Book id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public Book name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Size(max = 50) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Book releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
   */
  @Valid 
  @Schema(name = "releaseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseDate")
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Book genre(String genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Get genre
   * @return genre
   */
  @Size(max = 30) 
  @Schema(name = "genre", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("genre")
  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.name, book.name) &&
        Objects.equals(this.price, book.price) &&
        Objects.equals(this.releaseDate, book.releaseDate) &&
        Objects.equals(this.genre, book.genre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, releaseDate, genre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

