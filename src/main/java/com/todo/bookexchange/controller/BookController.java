package com.todo.bookexchange.controller;

import com.todo.bookexchange.model.Book;
import com.todo.bookexchange.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        book.setStatus("AVAILABLE");
        return bookRepository.save(book);
    }

    @GetMapping("/available")
    public List<Book> getAvailableBooks(){
        return bookRepository.findByStatus("AVAILABLE");
    }
    @GetMapping("/category/{category}")
    public List<Book> getBooksByCategory(@PathVariable String category) {
        return bookRepository.findByCategoryIgnoreCase(category);
    }



    @PutMapping("/buy/{id}")
    public Book buyBook(@PathVariable Long id, @RequestParam String buyer){
        Book b = bookRepository.findById(id).orElseThrow();
        b.setBuyerMobile(buyer);
        b.setStatus("TAKEN");
        return bookRepository.save(b);
    }
}
