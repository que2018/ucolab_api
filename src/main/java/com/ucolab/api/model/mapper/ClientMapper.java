package com.ucolab.api.model.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.ucolab.api.model.dao.Client;
import com.ucolab.api.model.dto.ClientDTO;
import com.ucolab.api.model.doo.ClientDOO;
import com.ucolab.api.model.dto.ClientLoginDTO;
import com.ucolab.api.model.dto.ClientRegisterDTO;

@Mapper
public interface ClientMapper {
    Client get(int clientId);

    Optional<ClientDOO> login(ClientLoginDTO clientLoginDTO);

    int register(ClientRegisterDTO clientRegisterDTO);

    Boolean update(ClientDTO clientDTO);

    Optional<ClientDOO> getByToken(String token);

    Boolean updateToken(int clientId, String token);

}