package com.tavisca.irctc.dao;

import com.tavisca.irctc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,String> {
    Optional<User> findByEmail(String email);
}
