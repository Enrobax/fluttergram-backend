package com.example.fluttergram.controller;

import com.example.fluttergram.model.Post;
import com.example.fluttergram.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/all")
    public List<Post> getAllPosts(){
        return postService.findAllPosts();
    }

    @GetMapping("/find/{id}")
    public List<Post> findPostByUser_id(@PathVariable("id") Long id){
        return postService.findPostByUser_id(id);
    }

    @PostMapping("/add")
    public Post addPost(@RequestBody Post post){
        return postService.addPost(post);
    }

    @Transactional
    @DeleteMapping("delete/{id}")
    public void deletePost(@PathVariable("id") Long id){
        postService.deletePost(id);
    }
}
