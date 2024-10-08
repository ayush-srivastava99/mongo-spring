package com.ayush.mongodemo.controller;

import com.ayush.mongodemo.domain.Product;
import com.ayush.mongodemo.service.ProductService;
import jakarta.websocket.server.PathParam;
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
    public ResponseEntity<String> save(@RequestBody Product product)
    {
        return ResponseEntity.ok(service.save(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable("id") String id)
    {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll()
    {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id)
    {
        service.delete(id);
        return ResponseEntity.accepted().build();
    }
}
