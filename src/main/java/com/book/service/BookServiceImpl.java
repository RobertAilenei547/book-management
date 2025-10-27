package com.book.service;

import com.baeldung.openapi.model.BookRequest;
import com.baeldung.openapi.model.Book;
import lombok.RequiredArgsConstructor;
import com.book.model.BookEntity;
import com.book.model.BookMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.book.repository.BookRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<Book> getAllBooks(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return bookRepository.findAll(pageable)
                .stream()
                .map(bookMapper::toBook)
                .toList();
    }

    @Override
    public Optional<Book> getBookById(BigDecimal id) {
        return bookRepository.findById(id).map(bookMapper::toBook);
    }

    @Override
    public Book createBook(BookRequest bookRequest) {
//        BookEntity entity = new BookEntity();
//        entity.setName(bookRequest.getName());
//        entity.setPrice(bookRequest.getPrice());
//        entity.setReleaseDate(bookRequest.getReleaseDate());
//        entity.setGenre(bookRequest.getGenre());
        BookEntity entity = bookMapper.toBookEntity(bookRequest);
        BookEntity saved = bookRepository.save(entity);
        return bookMapper.toBook(saved);
    }

    @Override
    public Book updateBook(Book updatedBook) {
        Optional<BookEntity> savedBook = bookRepository.findById(updatedBook.getId());
        if (savedBook.isEmpty()) return null;

        BookEntity updateEntity = bookMapper.toBookEntity(updatedBook);
        BookEntity updatedEntity = bookRepository.save(updateEntity);
        return bookMapper.toBook(updatedEntity);
    }

    @Override
    public void deleteBook(BigDecimal id) {bookRepository.deleteById(id);}
}
