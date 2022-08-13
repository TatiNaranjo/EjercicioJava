package com.example.library.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@Component
public class DummyBookFilter {
    private final BookService bookService;

    public DummyBookFilter(BookService bookService){
        this.bookService = bookService;
    }
    
    @PostConstruct
    public void init()
    {
        bookService.addBook(new Book(null, "Las Cronicas de Narnia", "Primer libro de la saga", "C.S.Lewis", 500, 2));
        try {Thread.sleep(100);} catch(InterruptedException e)  {}
        bookService.addBook(new Book(null, "La Orden del Dragon", "Libro Nuevo", "Jenn Bennett", 450, 5));
        try {Thread.sleep(100);} catch(InterruptedException e)  {}
        bookService.addBook(new Book(null, "Multiverso", "Libro Nuevo", "Leonardo Patrignani", 250, 4));
        try {Thread.sleep(100);} catch(InterruptedException e)  {}
        bookService.addBook(new Book(null, "El Hogar de Miss Peregrine para Niños Peculiares", "Miss Peregrine", "Ransom Riggs", 300, 3));
        try {Thread.sleep(100);} catch(InterruptedException e)  {}
    }
}
