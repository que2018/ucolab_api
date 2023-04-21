package com.ucolab.api.model.dto;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class ClientDTO implements Serializable {

    private String clientId;

    private String username;

    private String email;

    private String phone;

    private Boolean status;
}
