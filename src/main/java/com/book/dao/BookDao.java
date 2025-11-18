package com.book.dao;

import book.management.model.Book;
import book.management.model.BookRequest;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface BookDao {
    List<Book> findAll(int pageNumber, int pageSize);

    Optional<Book> findById(BigDecimal id);

    Book save(BookRequest book);

    Book update(Book book);

    void delete(BigDecimal id);
}
