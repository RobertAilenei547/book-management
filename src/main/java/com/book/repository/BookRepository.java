package com.book.repository;

import com.book.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, BigDecimal> {
//    Page<BookEntity> findAll(Pageable pageable);
//
//    Optional<Book> findById(BigDecimal id);
//
//    void deleteById(BigDecimal id);
}
