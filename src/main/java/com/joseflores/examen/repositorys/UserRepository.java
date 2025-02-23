package com.joseflores.examen.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.joseflores.examen.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
}
