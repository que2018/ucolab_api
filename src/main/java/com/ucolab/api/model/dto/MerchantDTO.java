package com.ucolab.api.model.dto;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class MerchantDTO implements Serializable {

    private Integer merchantId;

    private String username;

    private String firstname;

    private String lastname;

    private String email;

    private Boolean status;
}
