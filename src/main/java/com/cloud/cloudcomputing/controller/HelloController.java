package com.cloud.cloudcomputing.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello World "+name;

    }
    @GetMapping("/healthcheck")
        public ResponseEntity<Void> healthcheck() {
            return ResponseEntity.ok().build();  // Returns 200 OK with no response body
        }    }

