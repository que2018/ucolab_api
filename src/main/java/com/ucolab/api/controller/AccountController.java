package com.ucolab.api.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.ucolab.api.common.Result;
import com.ucolab.api.model.doo.AccountDOO;
import com.ucolab.api.model.mapper.AccountMapper;

@RestController
@RequestMapping(path="/account")
public class AccountController {

	@Autowired
	private AccountMapper accountMapper;
	@GetMapping(path="/get/{accountId}")
	public @ResponseBody Result getAccount (@PathVariable("accountId") int accountId) {
		Optional<AccountDOO>  accountDOO = accountMapper.get(accountId);

		if(accountDOO.isPresent()) {
			return Result.success(accountDOO.get());
		} else {
			return Result.error(6002, "get account fail");
		}
	}
}
