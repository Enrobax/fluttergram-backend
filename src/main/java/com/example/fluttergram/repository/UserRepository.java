package com.example.fluttergram.repository;

import com.example.fluttergram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
