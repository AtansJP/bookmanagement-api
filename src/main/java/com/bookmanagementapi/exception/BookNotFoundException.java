package com.bookmanagementapi.exception;

import java.util.UUID;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(UUID bookId) {
        super("Book not found with ID: " + bookId);
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}