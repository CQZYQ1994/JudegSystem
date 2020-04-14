package com.judgesystem.entity;

import lombok.Data;

@Data
public class Role {
    private int id;
    private String role;
    private String role_name;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
