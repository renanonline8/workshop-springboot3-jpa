package com.renansgomesfsdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansgomesfsdev.course.entities.OrderItem;
import com.renansgomesfsdev.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
