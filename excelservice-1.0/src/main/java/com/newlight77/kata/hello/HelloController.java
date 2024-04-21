package com.newlight77.kata.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    private static final String message = "Hello World!";

    @GetMapping(value = "/hello")
    public ResponseEntity<String> writeHello() {
        return ResponseEntity.ok(message);
    }
}
