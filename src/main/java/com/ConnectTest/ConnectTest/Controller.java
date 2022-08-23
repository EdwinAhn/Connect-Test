package com.ConnectTest.ConnectTest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Controller {

    @GetMapping("/")
    public String Test() {
        return "Hello";
    }
}
