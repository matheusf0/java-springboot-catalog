package com.piratenet.pirateflix.controller;

import com.piratenet.pirateflix.controller.dto.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @PostMapping
    public boolean login(@RequestBody User user){

        return true;
    }
}
