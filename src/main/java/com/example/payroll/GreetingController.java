package com.example.payroll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting() {
        return new Greeting("Welcome to the Payroll App!");
    }
}