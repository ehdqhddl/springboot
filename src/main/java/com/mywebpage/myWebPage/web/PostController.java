package com.mywebpage.myWebPage.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
}
