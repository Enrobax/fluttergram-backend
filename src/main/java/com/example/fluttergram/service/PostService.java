package com.example.fluttergram.service;

import com.example.fluttergram.model.Post;
import com.example.fluttergram.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> findAllPosts(){
        return postRepository.findAll();
    }


}
