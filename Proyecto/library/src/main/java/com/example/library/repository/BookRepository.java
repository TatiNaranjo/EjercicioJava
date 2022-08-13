package com.example.library.repository;

import java.util.List;

import com.example.library.model.Book;

public interface BookRepository {
    public List<Book> getAll();
    public Book get(String bookId);
    public List<Book> findByAuthor(String author);
    public List<Book> findBytitle(String title);
    public Book save(Book book);
    public Book delete(String bookId);


    
}
