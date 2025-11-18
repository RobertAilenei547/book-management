package com.book.dao;

import book.management.model.Book;
import book.management.model.BookRequest;
import lombok.AllArgsConstructor;
import com.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {

    private final BookRepository bookRepository;


    @Override
    public List<Book> findAll(int pageNumber, int pageSize) {
//        return bookRepository.findAll(PageRequest.of(pageNumber, pageSize)).getContent();
        return null;
    }

    @Override
    public Optional<Book> findById(BigDecimal id) {
        return null;
    }

    @Override
    public Book save(BookRequest book) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public void delete(BigDecimal id) {
//        bookRepository.deleteById(id);
    }
}

