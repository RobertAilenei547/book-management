package com.book.controller;

import com.baeldung.openapi.api.BooksApi;
import com.baeldung.openapi.model.Book;
import com.baeldung.openapi.model.BookRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.book.service.BookService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController implements BooksApi {

    private final BookService bookService;

    @Override
    public ResponseEntity<List<Book>> getBooksPage() {
        // delegate to service with default pagination (or you can read RequestParam via BooksApi default signature)
        List<Book> books = bookService.getAllBooks(0, 5);
        return ResponseEntity.ok(books);
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
