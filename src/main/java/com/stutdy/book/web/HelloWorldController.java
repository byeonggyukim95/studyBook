package com.stutdy.book.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloWolrd")
    public String HelloWorld(){
        return "HelloWolrd";
    }
}
