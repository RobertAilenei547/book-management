package com.book.service;

import book.management.model.Book;
import book.management.model.BookRequest;
import book.management.model.PageContent;
import java.math.BigDecimal;
import java.util.Optional;

public interface BookService {
    PageContent getAllBooks(int pageNumber, int pageSize);
    Optional<Book> getBookById(BigDecimal id);
    Book createBook(BookRequest book);
    Book updateBook(Book book);
    void deleteBook(BigDecimal id);
}
