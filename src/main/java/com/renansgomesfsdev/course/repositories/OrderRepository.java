package com.renansgomesfsdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansgomesfsdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
