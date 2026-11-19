package com.exercicio.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.webservice.entity.Category;

public interface CategoryRepository  extends JpaRepository<Category,Long >{

}
