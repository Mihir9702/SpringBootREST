package com.springbootapp.app.controller;

import com.springbootapp.app.entity.Product;
import com.springbootapp.app.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @Autowired
  private ProductService service;

  // post
  @PostMapping("/addproduct")
  public Product addProduct(@RequestBody Product product) {
    return service.saveProduct(product);
  }

  @PostMapping("/addproducts")
  public List<Product> addProducts(@RequestBody List<Product> products) {
    return service.saveProducts(products);
  }

  // get
  @GetMapping("/products")
  public List<Product> findAllProducts() {
    return service.getProducts();
  }

  @GetMapping("/products/{id}")
  public Product findProductById(@PathVariable int id) {
    return service.getProductById(id);
  }

  @GetMapping("/products/{name}")
  public Product findProductbyName(@PathVariable String name) {
    return service.getProductByName(name);
  }

  // put
  @PutMapping("/update")
  public Product updateProduct(@RequestBody Product product) {
    return service.updateProduct(product);
  }

  // delete
  @DeleteMapping
  public String deleteProduct(@PathVariable int id) {
    return service.deleteProduct(id);
  }
}
