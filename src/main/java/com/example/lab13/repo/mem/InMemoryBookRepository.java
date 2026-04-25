package com.example.lab13.repo.mem;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.example.lab13.model.Book;
import com.example.lab13.repo.BookRepository;

public class InMemoryBookRepository implements BookRepository {
    private final Map<String, Book> data = new HashMap<>();

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return Optional.ofNullable(data.get(isbn));
    }

    @Override
    public void save(Book book) {
        data.put(book.getIsbn(), book);
    }
}
