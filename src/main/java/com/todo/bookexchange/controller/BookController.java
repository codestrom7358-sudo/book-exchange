package com.todo.bookexchange.controller;

import com.todo.bookexchange.model.Book;
import com.todo.bookexchange.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // ADD BOOK
    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        book.setStatus("Available");
        return bookRepository.save(book);
    }

    // GET ALL BOOKS
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
