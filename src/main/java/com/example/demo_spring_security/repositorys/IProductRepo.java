package com.example.demo_spring_security.repositorys;

import com.example.demo_spring_security.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product,Long> {
}
