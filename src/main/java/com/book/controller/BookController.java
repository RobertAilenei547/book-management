package com.book.controller;

import book.management.openapi.BooksApi;
import book.management.model.Book;
import book.management.model.BookRequest;
import book.management.model.PageContent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.book.service.BookService;


import java.math.BigDecimal;


@RestController
@RequiredArgsConstructor
public class BookController implements BooksApi {

    private final BookService bookService;

    @Override
    public ResponseEntity<PageContent> getBooksPage(@Valid Integer page, @Valid Integer size) {
        PageContent response = bookService.getAllBooks(page,size);
        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<Book> getBookById(BigDecimal id) {
        return bookService.getBookById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Book> addBook(@Valid BookRequest book) {
        return ResponseEntity.ok(bookService.createBook(book));
    }

    @Override
    public ResponseEntity<Void> deleteBook(@NotNull @Valid BigDecimal id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Void> updateBook(@Valid Book book) {
        Book updated = bookService.updateBook(book);
        if (updated == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().build();
    }
}
