package com.bookmanagementapi.service;

import com.bookmanagementapi.model.Book;
import com.bookmanagementapi.repository.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(UUID id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(UUID id, Book updatedBook) {
        Book existingBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setIsbn(updatedBook.getIsbn());
        existingBook.setPrice(updatedBook.getPrice());
        existingBook.setPublicationDate(updatedBook.getPublicationDate());
        return bookRepository.save(existingBook);
    }

    public void deleteBook(UUID id) {
        bookRepository.deleteById(id);
    }
}