package com.demo.spring.aop.api.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import com.demo.spring.aop.api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.aop.api.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> addProduct(List<Product> products) {
		return repository.saveAll(products);
	}

	public List<Product> findAllProducts() {
		return repository.findAll();
	}

}
