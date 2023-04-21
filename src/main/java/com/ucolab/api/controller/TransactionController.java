package com.ucolab.api.controller;

import java.util.List;

import com.ucolab.api.common.Result;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ucolab.api.model.dao.Transaction;
import com.ucolab.api.model.dto.TransactionDTO;
import com.ucolab.api.model.mapper.TransactionMapper;

@RestController
@RequestMapping(path="/transaction")
public class TransactionController {
    @Autowired
    private TransactionMapper transactionTrapper;

    @PostMapping(path="/get_list", produces="application/json")
    public @ResponseBody Result getTransactions(@RequestBody TransactionDTO transactionDTO) {
        List<Transaction> transactions = transactionTrapper.getTransactions(transactionDTO);
        return Result.success(transactions);
    }

    @PostMapping(path="/get_total", produces="application/json")
    public @ResponseBody Result getTotal(@RequestBody TransactionDTO transactionDTO) {
        int total = transactionTrapper.getTotal(transactionDTO);
        return Result.success(total);
    }

    @PostMapping(path="/get_recent_list", produces="application/json")
    public @ResponseBody Result getRecentTransactions(@RequestBody TransactionDTO transactionDTO) {
        List<Transaction> transactions = transactionTrapper.getTransactions(transactionDTO);
        return Result.success(transactions);
    }
}
