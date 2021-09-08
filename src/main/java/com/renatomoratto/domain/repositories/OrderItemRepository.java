package com.renatomoratto.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatomoratto.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
