package com.bookmanagementapi.books;

import com.bookmanagementapi.books.Book; // Import the Book class from the root package
import com.bookmanagementapi.books.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void getBookById_ShouldReturnBook() throws Exception {
        // Given
        UUID bookId = UUID.randomUUID();
        Book book = new Book("1984","George Orwell","2024", new BigDecimal(10.24),Instant.now());
        ReflectionTestUtils.setField(book, "id", bookId);
        given(bookService.getBookById(bookId)).willReturn(book); 

        // When/Then
        mockMvc.perform(get("/api/books/{id}", bookId))
               .andExpect(status().isOk()) // Verify HTTP status
               .andExpect(content().json("{'id': " + bookId + ", 'title': '1984', 'author': 'George Orwell'}")); // Verify response body
    }
}