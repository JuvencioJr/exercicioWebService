package com.exercicio.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.webservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
