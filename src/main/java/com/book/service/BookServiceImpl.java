package com.book.service;

import book.management.model.BookRequest;
import book.management.model.Book;
import book.management.model.PageContent;
import com.book.model.BookEntity;
import lombok.AllArgsConstructor;
import com.book.model.BookMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.book.repository.BookRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;


    @Override
    public PageContent getAllBooks(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        var page = bookRepository.findAll(pageable);
        List<Book> books = page.stream()
                .map(bookMapper::toBook)
                .toList();
        long totalItems = page.getTotalElements();
        int totalPages = page.getTotalPages();
        PageContent pageContent = bookMapper.toPageContent(
                pageSize,
                pageNumber,
                totalPages,
                totalItems,
                books
        );
        pageContent.setTotalNumberOfPages(page.getTotalPages());
        return pageContent;
    }

    @Override
    public Optional<Book> getBookById(BigDecimal id) {
        return bookRepository.findById(id).map(bookMapper::toBook);
    }

    @Override
    public Book createBook(BookRequest bookRequest) {
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
