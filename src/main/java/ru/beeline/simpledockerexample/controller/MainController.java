package ru.beeline.simpledockerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1.0/hello")
public class MainController {
    @GetMapping("/")
    public String greet() {
        return "Hello, world!";
    }
}
