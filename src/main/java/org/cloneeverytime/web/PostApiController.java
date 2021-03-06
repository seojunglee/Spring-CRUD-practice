package org.cloneeverytime.web;


import lombok.RequiredArgsConstructor;
import org.cloneeverytime.domain.post.Post;
import org.cloneeverytime.domain.post.PostRepository;
import org.cloneeverytime.web.dto.PostSaveRequestDto;
import org.springframework.web.bind.annotation.*;


//POST/post   저장
//request body에 title, ...등의 정보를 보냄
//
//GET/post/id    조회
//response body에..
//
//DELETE/post/id  삭제
//response header (http status code)
//
//PUT/post/id  수정
//request body에..

@RequiredArgsConstructor
@RestController
public class PostApiController{

    private final PostRepository postRepository;

    @PostMapping("/post")
    public Long save(@RequestBody PostSaveRequestDto postSaveRequestDto){
        Post post = postRepository.save(postSaveRequestDto.toEntity());
        return post.getId();
    }

    @GetMapping("/post/{id}")
    public Post getPost(@PathVariable Long id){
        return postRepository.findById(id).get();
    }


}