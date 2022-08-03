package com.example.demo_spring_security.repositorys;

import com.example.demo_spring_security.models.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface IAppUserRepo extends CrudRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
