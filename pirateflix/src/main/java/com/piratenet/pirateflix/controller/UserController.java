package com.piratenet.pirateflix.controller;


import com.piratenet.pirateflix.controller.model.UserDto;
import com.piratenet.pirateflix.entity.User;
import com.piratenet.pirateflix.repository.UserRepository;
import com.piratenet.pirateflix.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public void createUser(@RequestBody @Validated UserDto userDto) {
        var user = new User(userDto.getName(), userDto.getUsername(), userDto.getPassword(), userDto.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userRepository.save(user);
    }

    @GetMapping("/list")
    public ResponseEntity<List<User>> listUsers(){
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping("/delete")
    public ResponseEntity<?> deleteUser(User user){
        userRepository.delete(user);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
