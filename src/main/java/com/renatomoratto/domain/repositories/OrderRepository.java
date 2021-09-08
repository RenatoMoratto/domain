package com.renatomoratto.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatomoratto.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
