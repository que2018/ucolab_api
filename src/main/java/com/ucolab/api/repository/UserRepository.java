package com.ucolab.api.repository;

import com.ucolab.api.model.dao.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
