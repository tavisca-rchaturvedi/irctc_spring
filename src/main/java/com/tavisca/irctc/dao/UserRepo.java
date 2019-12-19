package com.tavisca.irctc.dao;

import com.tavisca.irctc.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
