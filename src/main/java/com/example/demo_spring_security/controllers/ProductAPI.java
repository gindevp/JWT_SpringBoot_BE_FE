package com.example.demo_spring_security.controllers;


import com.example.demo_spring_security.models.Product;
import com.example.demo_spring_security.repositorys.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
@CrossOrigin("*")
public class ProductAPI {
    @Autowired
    IProductRepo productRepo;

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>((List<Product>) productRepo.findAll(), HttpStatus.OK);
    }
}
