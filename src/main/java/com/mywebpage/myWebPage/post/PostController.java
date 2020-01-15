package com.mywebpage.myWebPage.post;


import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

}
