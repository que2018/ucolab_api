package com.ucolab.api.repository;

import com.ucolab.api.model.dao.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Integer> {

}
