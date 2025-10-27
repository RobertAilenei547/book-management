package com.book.model;

import com.baeldung.openapi.model.Book;
import com.baeldung.openapi.model.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toBook(BookEntity entity);
    BookEntity toBookEntity(BookRequest model);

    BookEntity toBookEntity(Book model);
}
