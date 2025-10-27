package com.book.service;

import com.baeldung.openapi.model.Book;
import com.baeldung.openapi.model.BookRequest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks(int pageNumber, int pageSize);
    Optional<Book> getBookById(BigDecimal id);
    Book createBook(BookRequest book);
    Book updateBook(Book book);
    void deleteBook(BigDecimal id);
}
