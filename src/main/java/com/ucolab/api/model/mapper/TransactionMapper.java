package com.ucolab.api.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ucolab.api.model.dao.Transaction;
import com.ucolab.api.model.dto.TransactionDTO;

@Mapper
public interface TransactionMapper {
    List<Transaction> getTransactions(TransactionDTO transactionDTO);
    int getTotal(TransactionDTO transactionDTO);
}