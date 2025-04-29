package com.example.demo_db;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @PostMapping
    public ResponseEntity<UserEntity> addUser(@RequestParam("name") String name, @RequestParam("password") String password) {
        UserEntity user = new UserEntity(name, password);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }


}
