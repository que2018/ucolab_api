package com.ucolab.api.model.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ClientRegisterDTO implements Serializable {

    private String first_name;

    private String last_name;

    private String email;

    private String password;

}
