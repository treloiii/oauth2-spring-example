package com.trelloiii.repository;

import com.trelloiii.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {
    Users findByLogin(String login);
}
