package com.jpa.test.repository;

import org.springframework.data.repository.CrudRepository;
import com.jpa.test.model.User;
 
public interface UserRepository extends CrudRepository<User, Integer> {

}
