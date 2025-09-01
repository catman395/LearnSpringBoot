/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Vd3_Identity_sevice.Exception;

import com.example.Vd3_Identity_sevice.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author dohoainho
 */
@ControllerAdvice
public class GobalHandingException {
    
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<String> handingRuntimeExc(RuntimeException e){     
        return ResponseEntity.badRequest().body(e.getMessage());
       
        
    }
    
}
