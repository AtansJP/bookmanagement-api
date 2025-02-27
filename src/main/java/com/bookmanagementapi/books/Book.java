package com.bookmanagementapi.books;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;
    private String author;
    private String isbn;
    private BigDecimal price;
    private Instant publicationDate;

    // Constructors
    public Book() {
    }

    public Book(String title, String author, String isbn, BigDecimal price, Instant publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.publicationDate = publicationDate;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Instant getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Instant publicationDate) {
        this.publicationDate = publicationDate;
    }
}