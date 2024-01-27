package com.mmdevs.br.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmdevs.br.dto.UserRequest;
import com.mmdevs.br.entity.User;
import com.mmdevs.br.services.UserServices;

@RestController

@RequestMapping("/user")

public class UserController {

  @Autowired
  private UserServices userServices;

  @PostMapping
  public ResponseEntity<User> registerUser(@RequestBody UserRequest userRequest) {
    User user = userRequest.toModel();

    User userSaved = userServices.registerUser(user);

    return ResponseEntity.ok().body(userSaved);
  }

}