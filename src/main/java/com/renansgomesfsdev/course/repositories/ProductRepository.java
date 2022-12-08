package com.renansgomesfsdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansgomesfsdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}