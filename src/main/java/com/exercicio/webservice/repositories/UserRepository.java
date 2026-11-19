package com.exercicio.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.webservice.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
