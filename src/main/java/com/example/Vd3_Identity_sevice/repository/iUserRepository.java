/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Vd3_Identity_sevice.repository;

import com.example.Vd3_Identity_sevice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dohoainho
 */
@Repository
public interface iUserRepository extends JpaRepository<User, String>{

    User getById(int id);

    User findById(int id);
}
