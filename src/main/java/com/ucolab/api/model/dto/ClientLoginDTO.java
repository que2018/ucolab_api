package com.ucolab.api.model.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class ClientLoginDTO implements Serializable {
    private String email;

    private String password;

    private String token;
}
