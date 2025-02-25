package com.bookmanagementapi.repository;

import com.bookmanagementapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}