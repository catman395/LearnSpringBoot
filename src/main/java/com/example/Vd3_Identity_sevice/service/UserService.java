/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Vd3_Identity_sevice.service;

import com.example.Vd3_Identity_sevice.dto.request.UserCreationRequest;
import com.example.Vd3_Identity_sevice.entity.User;
import com.example.Vd3_Identity_sevice.repository.iUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author dohoainho
 */
@Service
public class UserService {
    @Autowired
    iUserRepository userRepository;
    
    public User createUser(UserCreationRequest rq){
        User user = new User();
        user.setUsername(rq.getUsername());
        user.setPassword(rq.getPassword());
        user.setFirstname(rq.getFirstname());
        user.setLastname(rq.getLastname());
        user.setDob(rq.getDob());
        
         return userRepository.save(user);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User findById(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
