package com.todo.bookexchange.repository;

import com.todo.bookexchange.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
