package com.example.demo_spring_security.repositorys;

import com.example.demo_spring_security.models.Role;
import org.springframework.data.repository.CrudRepository;

public interface IRoleRepo extends CrudRepository<Role,Long> {
}
