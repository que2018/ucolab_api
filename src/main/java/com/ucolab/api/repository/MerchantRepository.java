package com.ucolab.api.repository;

import com.ucolab.api.model.dao.Merchant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MerchantRepository extends CrudRepository<Merchant, Integer> {
    @Query(value = "select count(merchant_id) from merchant", nativeQuery = true)
    public long getTotalMerchant();
}
