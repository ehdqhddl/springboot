package com.mywebpage.myWebPage.dto.posts;

import com.mywebpage.myWebPage.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static com.mywebpage.myWebPage.domain.posts.Posts.*;

@Getter
@Setter
@NoArgsConstructor

public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
