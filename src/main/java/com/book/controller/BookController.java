package com.book.controller;

import com.baeldung.openapi.api.BooksApi;
import com.baeldung.openapi.model.Book;
import com.baeldung.openapi.model.BookRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.book.service.BookService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController implements BooksApi {

    private final BookService bookService;

//
//    @GetMapping
//    public ResponseEntity<List<Book>> getBooks(
//            @RequestParam(defaultValue = "0") int pageNumber,
//            @RequestParam(defaultValue = "5") int pageSize) {
//        List<Book> books = bookService.getAllBooks(pageNumber, pageSize);
//        return ResponseEntity.ok(books);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Book> getBook(@PathVariable String id) {
//        Optional<Book> book = bookService.getBookById(id);
//        return book.map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<Book> createBook(@RequestBody Book book) {
//        return ResponseEntity.ok(bookService.createBook(book));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book book) {
//        Book updated = bookService.updateBook(id, book);
//        if (updated == null) return ResponseEntity.notFound().build();
//        return ResponseEntity.ok(updated);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteBook(@PathVariable String id) {
//        bookService.deleteBook(id);
//        return ResponseEntity.noContent().build();
//    }


    //    @Override
//    public ResponseEntity<List<Book>> getBooksPage(@RequestParam(defaultValue = "0") int pageNumber,
//          @RequestParam(defaultValue = "5") int pageSize) {
//        List<Book> books = bookService.getAllBooks(pageNumber, pageSize);
//        return ResponseEntity.ok(books);
//    }
    @Override
    public ResponseEntity<List<Book>> getBooksPage() {
        return BooksApi.super.getBooksPage();
    }


    @Override
    public ResponseEntity<Book> getBookById(BigDecimal id) {
        return BooksApi.super.getBookById(id);
    }

    @Override
    public ResponseEntity<Book> addBook(@Valid BookRequest book) {
        return ResponseEntity.ok(bookService.createBook(book));
    }

    @Override
    public ResponseEntity<Void> deleteBook(@NotNull @Valid BigDecimal id) {
        return BooksApi.super.deleteBook(id);
    }

    @Override
    public ResponseEntity<Void> updateBook(@Valid Book book) {
        Book updated = bookService.updateBook(book);
        if (updated == null) return ResponseEntity.notFound().build();
        return BooksApi.super.updateBook(book);
    }
}
