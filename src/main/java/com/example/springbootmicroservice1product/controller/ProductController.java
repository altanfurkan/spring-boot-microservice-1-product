package com.example.springbootmicroservice1product.controller;

import com.example.springbootmicroservice1product.model.Product;
import com.example.springbootmicroservice1product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
   private IProductService productService;

    @PostMapping // -> api/product
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{ProductId}") // -> api/product/productID
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId){

        productService.deleteProduct(productId);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping // -> api/product
    public ResponseEntity<?> getAllProduct(){

        return ResponseEntity.ok(productService.findAllProduct());
    }
}
