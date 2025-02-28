package com.bookmanagementapi.mapper;

import com.bookmanagementapi.books.Book;
import com.bookmanagementapi.dto.BookResponse;

public class BookMapper {

    public static BookResponse toBookResponse(Book book) {
        return new BookResponse(
            book.getId(),
            book.getTitle(),
            book.getAuthor(),
            book.getIsbn(),
            book.getPrice(),
            book.getPublicationDate()
        );
    }
}