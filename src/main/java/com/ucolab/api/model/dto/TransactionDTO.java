package com.ucolab.api.model.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class TransactionDTO implements Serializable {

    private String q;
    private String type;

}
