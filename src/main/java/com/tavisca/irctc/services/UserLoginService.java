package com.tavisca.irctc.services;

import com.tavisca.irctc.dao.UserRepo;
import com.tavisca.irctc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    LoginAuthentication loginAuthentication;

    public User registerUser(User user) {
       return userRepo.save(user);
    }

    public String  loginUser(User user) {
        return loginAuthentication.authenticate(user);
    }
}
