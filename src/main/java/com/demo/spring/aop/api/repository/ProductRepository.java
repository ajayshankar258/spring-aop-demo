package com.demo.spring.aop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.aop.api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
}
