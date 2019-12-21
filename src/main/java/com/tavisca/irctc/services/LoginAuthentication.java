package com.tavisca.irctc.services;

import com.tavisca.irctc.dao.UserRepo;
import com.tavisca.irctc.enums.Role;
import com.tavisca.irctc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginAuthentication {

    @Autowired
    UserRepo userRepo;

    public String authenticate(User user) {
        Optional<User> userDetails=userRepo.findByEmail(user.getEmail());

        if(!userDetails.isPresent())
            return "Invalid email Id";

        if(userDetails.get().getPassword().equals(user.getPassword()))
        {
            if(userDetails.get().getRole().equals(Role.Admin))
                return "Logged In as "+user.getRole();
            if(userDetails.get().getRole().equals(Role.GeneralUser)&&user.getRole().equals(Role.Admin))
                return "you are not an Admin";
            else
               return "Logged In";

        }
        else
            return "Wrong Password";
    }
}
