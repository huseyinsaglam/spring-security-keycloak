package com.example.springsecuritykeycloak.repository;

import com.example.springsecuritykeycloak.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
