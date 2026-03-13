
package com.company.usermanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.usermanagement.entity.User;
import com.company.usermanagement.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

 @Autowired
 private UserRepository userRepository;

 @GetMapping("/{id}")
 public User getProfile(@PathVariable Long id){
  return userRepository.findById(id).orElse(null);
 }
}
