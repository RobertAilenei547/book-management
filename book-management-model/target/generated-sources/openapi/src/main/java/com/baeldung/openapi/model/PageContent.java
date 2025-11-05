package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.Book;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PageContent
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-04T11:39:18.491115100+02:00[Europe/Bucharest]", comments = "Generator version: 7.8.0")
public class PageContent {

  private Integer totalItems;

  private Integer totalNumberOfPages;

  private Integer page;

  private Integer size;

  @Valid
  private List<@Valid Book> content = new ArrayList<>();

  public PageContent totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * Get totalItems
   * @return totalItems
   */
  
  @Schema(name = "totalItems", example = "1124", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalItems")
  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public PageContent totalNumberOfPages(Integer totalNumberOfPages) {
    this.totalNumberOfPages = totalNumberOfPages;
    return this;
  }

  /**
   * Get totalNumberOfPages
   * @return totalNumberOfPages
   */
  
  @Schema(name = "totalNumberOfPages", example = "35", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalNumberOfPages")
  public Integer getTotalNumberOfPages() {
    return totalNumberOfPages;
  }

  public void setTotalNumberOfPages(Integer totalNumberOfPages) {
    this.totalNumberOfPages = totalNumberOfPages;
  }

  public PageContent page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  
  @Schema(name = "page", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public PageContent size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  
  @Schema(name = "size", example = "34", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageContent content(List<@Valid Book> content) {
    this.content = content;
    return this;
  }

  public PageContent addContentItem(Book contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
   */
  @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid Book> getContent() {
    return content;
  }

  public void setContent(List<@Valid Book> content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageContent pageContent = (PageContent) o;
    return Objects.equals(this.totalItems, pageContent.totalItems) &&
        Objects.equals(this.totalNumberOfPages, pageContent.totalNumberOfPages) &&
        Objects.equals(this.page, pageContent.page) &&
        Objects.equals(this.size, pageContent.size) &&
        Objects.equals(this.content, pageContent.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalItems, totalNumberOfPages, page, size, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageContent {\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalNumberOfPages: ").append(toIndentedString(totalNumberOfPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

