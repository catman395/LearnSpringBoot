/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Vd3_Identity_sevice.Controller;

import com.example.Vd3_Identity_sevice.dto.request.UserCreationRequest;
import com.example.Vd3_Identity_sevice.entity.User;
import com.example.Vd3_Identity_sevice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author dohoainho
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody UserCreationRequest userCreationRequest){
    return userService.createUser(userCreationRequest);
    }

    @GetMapping
    public List<User> getAllUser(){
        return  userService.findAll();
    }
    @GetMapping("/{userID}")
    public User getUserById(@PathVariable String userID){
        return userService.findById(userID);
    }
}
