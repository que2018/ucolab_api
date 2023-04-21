package com.ucolab.api.model.doo;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AccountDOO implements Serializable {

    private int accountId;

    private String routingNumber;

    private String accountNumber;


    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
