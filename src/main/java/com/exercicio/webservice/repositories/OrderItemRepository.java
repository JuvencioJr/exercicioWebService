package com.exercicio.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.webservice.entity.OrderItem;
import com.exercicio.webservice.entity.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
