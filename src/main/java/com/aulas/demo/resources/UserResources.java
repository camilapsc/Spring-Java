package com.aulas.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulas.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
@GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria","maria@gmail.com", "99988197845", "1234");
        return ResponseEntity.ok().body(u);
    }
    
}
