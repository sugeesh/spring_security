package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sugeesh Chandraweera
 */
@RestController
@RequestMapping("/rest/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello World";
    }

}
