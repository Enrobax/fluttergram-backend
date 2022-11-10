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

    public List<Post> findPostByUser_id(Long id){
        return postRepository.findPostByUser_id(id);
    }

    public Post addPost(Post post){
        return postRepository.save(post);
    }

    public void deletePost(Long id){
        postRepository.deletePostById(id);
    }
}
