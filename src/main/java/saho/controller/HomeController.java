package saho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("")
    public String home(){
        return "Hello World Spring Boot!\n OSTM Welcomes you ";
    }
}
