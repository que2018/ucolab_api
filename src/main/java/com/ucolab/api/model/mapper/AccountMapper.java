package com.ucolab.api.model.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.ucolab.api.model.doo.AccountDOO;

@Mapper
public interface AccountMapper {
    Optional<AccountDOO> get(int clientId);
}