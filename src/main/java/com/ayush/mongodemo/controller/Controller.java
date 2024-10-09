package com.ayush.mongodemo.controller;

import com.ayush.mongodemo.domain.Product;
import com.ayush.mongodemo.dto.ProductDTO;
import com.ayush.mongodemo.response.ProductResponse;
import com.ayush.mongodemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class Controller {

    @Autowired
    private ProductService service;

    @PostMapping("/")
    public ResponseEntity<String> save(@RequestBody ProductDTO productDTO) {
        Product product = Product.of(productDTO);
        return ResponseEntity.ok(service.save(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getById(@PathVariable("id") String id) {
        Product product=service.findById(id);
        return ResponseEntity.ok(ProductResponse.of(product));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductResponse>> getAll() {
        List<Product> productList=service.findAll();
        List<ProductResponse> responseList=productList.stream().map(ProductResponse::of).toList();
        return ResponseEntity.ok(responseList);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        service.delete(id);
        return ResponseEntity.accepted().build();
    }
}
