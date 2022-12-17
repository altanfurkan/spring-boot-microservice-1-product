package com.example.springbootmicroservice1product.repository;

import com.example.springbootmicroservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
