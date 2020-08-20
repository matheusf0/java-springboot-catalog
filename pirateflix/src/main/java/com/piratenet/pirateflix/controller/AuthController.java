package com.piratenet.pirateflix.controller;

import com.piratenet.pirateflix.controller.model.RegisterRequest;
import com.piratenet.pirateflix.controller.model.LoginDto;
import com.piratenet.pirateflix.service.AuthService;
import com.piratenet.pirateflix.service.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {


    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(RegisterRequest registerRequest){
         authService.signup(registerRequest);
         return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginDto user){
        return authService.login(user);
    }
}
