
package com.company.usermanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.company.usermanagement.entity.User;
import com.company.usermanagement.repository.UserRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {

 @Autowired
 private UserRepository userRepository;

 @GetMapping("/users")
 public List<User> getAllUsers(){
  return userRepository.findAll();
 }

 @PostMapping("/users")
 public User createUser(@RequestBody User user){
  return userRepository.save(user);
 }

 @DeleteMapping("/users/{id}")
 public void deleteUser(@PathVariable Long id){
  userRepository.deleteById(id);
 }
}
