package com.book.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "book")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigDecimal id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "release_date", columnDefinition = "DATE")
    private LocalDate releaseDate;
    @Column(name = "genre")
    private String genre;

}
