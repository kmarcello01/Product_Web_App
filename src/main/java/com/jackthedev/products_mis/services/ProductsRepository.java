package com.jackthedev.products_mis.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jackthedev.products_mis.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
