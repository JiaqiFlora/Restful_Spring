package com.example.springboot.restfulwebservicelearn.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.restfulwebservicelearn.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
