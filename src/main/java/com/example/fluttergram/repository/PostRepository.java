package com.example.fluttergram.repository;

import com.example.fluttergram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findPostByUser_id(Long id);

    void deletePostById(Long id);

}
