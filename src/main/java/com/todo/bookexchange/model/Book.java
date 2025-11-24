package com.todo.bookexchange.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookType;   // ENGINEERING, ARTS, MEDICAL
    private String bookName;
    private String semester;
    private String description;

    private String giverMobile;
    private String buyerMobile;
    private String category;

    @Column(name = "category")

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    private String status;  // AVAILABLE, TAKEN
}
