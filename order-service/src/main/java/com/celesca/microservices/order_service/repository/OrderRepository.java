package com.celesca.microservices.order_service.repository;

import com.celesca.microservices.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
