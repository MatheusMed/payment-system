package com.mmdevs.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.mmdevs.br.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

  UserDetails findByEmail(String email);

}