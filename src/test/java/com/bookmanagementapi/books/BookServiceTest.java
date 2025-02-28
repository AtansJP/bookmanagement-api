package com.bookmanagementapi.books;

import com.bookmanagementapi.books.Book;
import com.bookmanagementapi.books.BookService;
import com.bookmanagementapi.books.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    public void getBookById_ShouldReturnBook() {
        // Given
        UUID bookId = UUID.randomUUID();
        Book book = new Book("1984", "George Orwell", "978-0451524935", new BigDecimal("10.24"), Instant.now());
        book.setId(bookId); // Set the ID using the setId method

        given(bookRepository.findById(bookId)).willReturn(Optional.of(book));

        // When
        Book result = bookService.getBookById(bookId);

        // Then
        assertEquals(bookId, result.getId());
        assertEquals("1984", result.getTitle());
        assertEquals("George Orwell", result.getAuthor());
    }
}