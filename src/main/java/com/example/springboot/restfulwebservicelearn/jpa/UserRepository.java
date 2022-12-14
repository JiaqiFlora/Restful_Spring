package com.example.springboot.restfulwebservicelearn.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.restfulwebservicelearn.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
