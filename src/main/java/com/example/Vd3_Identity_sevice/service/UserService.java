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
      public User findById(String id) {
        return userRepository.findById(id)
                .orElse(null);
    }
      public User updateUser(String id, UserCreationRequest rq) {
      return  userRepository.findById(id)
              .map(u -> {
              u.setFirstname(rq.getFirstname());
              u.setLastname(rq.getLastname());
              u.setUsername(rq.getUsername());
              u.setPassword(rq.getPassword());
              u.setDob(rq.getDob());
              return userRepository.save(u);
              }).orElse(null);
      }

    public void deleteUser(String id) {
    if (!userRepository.existsById(id)) {
        throw new RuntimeException("User not found with id: " + id);
    }
    userRepository.deleteById(id);
}

}
