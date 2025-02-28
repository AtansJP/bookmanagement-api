package com.bookmanagementapi.dto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class BookResponse {

    private UUID id;
    private String title;
    private String author;
    private String isbn;
    private BigDecimal price;
    private Instant publicationDate;

    // Constructor
    public BookResponse(UUID id, String title, String author, String isbn, BigDecimal price, Instant publicationDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.publicationDate = publicationDate;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Instant getPublicationDate() {
        return publicationDate;
    }
}