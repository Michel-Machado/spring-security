package com.estudos.springsec.repositories;

import com.estudos.springsec.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, String> {
}
