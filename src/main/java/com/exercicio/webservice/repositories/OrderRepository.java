package com.exercicio.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.webservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
