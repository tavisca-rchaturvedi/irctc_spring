package com.tavisca.irctc.controllers;

import com.tavisca.irctc.enums.Gender;
import com.tavisca.irctc.models.User;
import com.tavisca.irctc.services.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @Autowired
    UserLoginService userLoginService;

    @PostMapping("/addUsers")
    public User addUser(@RequestBody User user){

//        User user=new User("Krishna",23, Gender.MALE,"krishna@gmail.com","1234");

       return  userLoginService.registerUser(user);
    }

    @PostMapping("/loginUser")
    public String loginUser(@RequestBody User user){
        return userLoginService.loginUser(user);
    }

}
