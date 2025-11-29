package com.todo.bookexchange.model;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;
    private String password;

    // ===== GETTERS =====
    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    // ===== SETTERS =====
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
