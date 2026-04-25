package com.example.lab13.repo;

import java.util.Optional;

import com.example.lab13.model.Book;

public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);
    void save(Book book);
}

