package com.piratenet.pirateflix.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/")

public class HomeController {

    @GetMapping
    public ResponseEntity<String> homeTest(){
        return ResponseEntity.of(Optional.of("Hello"));
    }
}
