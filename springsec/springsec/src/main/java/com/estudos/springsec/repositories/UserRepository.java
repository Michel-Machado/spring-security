package com.estudos.springsec.repositories;

import com.estudos.springsec.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel, String> {

    UserDetails findByLogin(String login);
}
