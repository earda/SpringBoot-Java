package com.pazartsepeti.pazarsepeti.resources;


import com.pazartsepeti.pazarsepeti.model.Users;
import com.pazartsepeti.pazarsepeti.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RequestMapping(value="/pazarsepeti")
public class UserResources {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users){
        userRepository.save(users);
        return userRepository.findAll();
    }
}
