package com.example.springsecuritykeycloak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springsecuritykeycloak.entity.Roles;
@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {

}
