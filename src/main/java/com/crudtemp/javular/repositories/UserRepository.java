package com.crudtemp.javular.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudtemp.javular.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}