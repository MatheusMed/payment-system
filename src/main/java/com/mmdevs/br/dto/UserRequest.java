package com.mmdevs.br.dto;

import com.mmdevs.br.entity.User;

public record UserRequest(String name, String email, String password) {

  public User toModel() {
    return new User(name, email, password);
  }

}