package com.mywebpage.myWebPage.web;

import com.mywebpage.myWebPage.domain.posts.PostsRepository;
import com.mywebpage.myWebPage.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
/*
    @AllArgsConstructor는 Lombok의 annotation으로 생성자를 생성해준다.
    해당 클래스의 의존성 관계가 변경될때마다 생성자 코드를 계속해서 수정하지 않아도 된다.
 */
public class PostController {

    private PostsRepository postsRepository;

    @GetMapping("/home")
    public String home(){
        return "This page is main.";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}
