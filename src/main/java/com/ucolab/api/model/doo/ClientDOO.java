package com.ucolab.api.model.doo;

import java.io.Serializable;

import lombok.Data;
import jakarta.persistence.Id;
import lombok.experimental.Accessors;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Accessors(chain = true)
public class ClientDOO implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer clientId;

    private String username;

    private String email;

    private String phone;

    private String token;

    private Boolean status;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setToken(Boolean status) {
        this.status = status;
    }
}