package com.todo.bookexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.todo.bookexchange.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByMobile(String mobile);
}
