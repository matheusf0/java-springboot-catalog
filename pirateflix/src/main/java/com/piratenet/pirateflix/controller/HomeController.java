package com.piratenet.pirateflix.controller;
import com.piratenet.pirateflix.controller.model.LoginDto;
import com.piratenet.pirateflix.service.AuthService;
import com.piratenet.pirateflix.service.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private AuthService authService;

    @GetMapping("/helloworld")
    public ResponseEntity<String> homeTest(){
        return ResponseEntity.of(Optional.of("Hello"));
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginDto user){
        return authService.login(user);
    }

    @PostMapping("/teste")
    public String login(){
        return "oi";
    }

}
