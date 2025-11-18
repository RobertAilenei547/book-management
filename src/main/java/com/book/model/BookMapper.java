package com.book.model;

import book.management.model.Book;
import book.management.model.BookRequest;
import book.management.model.PageContent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toBook(BookEntity entity);
    BookEntity toBookEntity(BookRequest model);
    BookEntity toBookEntity(Book model);
    @Mapping(target = "pageSize", source = "pageSize")
    @Mapping(target = "pageNumber", source = "pageNumber")
    @Mapping(target = "totalPages", source = "totalPages")
    @Mapping(target = "totalItems", source = "totalItems")
    @Mapping(target = "content", source = "books")
    PageContent toPageContent(Integer pageSize,
                              Integer pageNumber,
                              Integer totalPages,
                              Long totalItems,
                              List<Book> books);
}
