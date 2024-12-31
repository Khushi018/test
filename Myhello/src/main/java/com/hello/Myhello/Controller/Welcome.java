package com.hello.Myhello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Welcome {

    @GetMapping
    public String hello(){
        System.out.println("Hello world");
        return "Hello, World!";
    }
}
