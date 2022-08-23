package com.ConnectTest.ConnectTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String Test() {
        return "Hello";
    }
}
