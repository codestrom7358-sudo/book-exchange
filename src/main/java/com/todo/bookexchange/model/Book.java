package com.todo.bookexchange.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;
    private String semester;
    private String description;

    private String giverMobile;
    private String buyerMobile;

    private String status;  // AVAILABLE, TAKEN
}
