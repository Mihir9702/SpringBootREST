package com.springbootapp.app.repository;

import com.springbootapp.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
  int getId();
  String getName();
  int getQuantity();
  double getPrice();
  Product findByName(String name);
}
