package com.ucolab.api.controller;

import com.ucolab.api.model.doo.ClientDOO;
import com.ucolab.api.model.dto.ClientRegisterDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import com.ucolab.api.until.Func;
import com.ucolab.api.common.Result;
import com.ucolab.api.model.dao.Client;
import com.ucolab.api.model.dto.ClientDTO;
import com.ucolab.api.model.dto.ClientLoginDTO;
import com.ucolab.api.model.mapper.ClientMapper;

@RestController
@RequestMapping(path="/client")
public class ClientController {
	@Autowired
	private ClientMapper clientMapper;

	@PostMapping(path="/login", produces="application/json")
	public @ResponseBody Result login(@RequestBody ClientLoginDTO clientLoginDTO) {
		Optional<ClientDOO> optionalClient = clientMapper.login(clientLoginDTO);

		if(optionalClient.isPresent()) {
			ClientDOO client = optionalClient.get();

			int clientId = client.getClientId();
			String token = Func.getClientToken(40);
			clientMapper.updateToken(clientId, token);

			client.setToken(token);

			return Result.success(client);
		} else {
			return Result.error(5001, "login fail");
		}
	}

	@PostMapping(path="/register", produces="application/json")
	public @ResponseBody Result register(@RequestBody ClientRegisterDTO clientRegisterDTO) {
		int debug = clientMapper.register(clientRegisterDTO);

		System.out.println(debug);

		if(true) {
			return Result.success(null);
		} else {
			return Result.error(5004, "register fail");
		}
	}

	@GetMapping(path="/refresh")
	public @ResponseBody Result refresh (@RequestHeader("Authorization") String token) {
		Optional<ClientDOO> optionalClient = clientMapper.getByToken(token);

		if(optionalClient.isPresent()) {
			return Result.success(optionalClient.get());
		} else {
			return Result.error(5002, "refresh fail");
		}
	}

	@PostMapping(path="/update", produces="application/json")
	public @ResponseBody Result update(@RequestBody ClientDTO clientDTO) {
		Boolean success = clientMapper.update(clientDTO);

		if(success) {
			return Result.success(clientDTO);
		} else {
			return Result.error(5002, "update fail");
		}
	}

	@GetMapping(path="/get/{clientId}")
	public @ResponseBody Result getClient(@PathVariable("clientId") int clientId) {
		Client client = clientMapper.get(clientId);
		return Result.success(client);
	}
}
