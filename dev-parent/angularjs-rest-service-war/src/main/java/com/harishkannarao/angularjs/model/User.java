package com.harishkannarao.angularjs.model;

import java.util.List;

public class User {
    private String username;
    private String password;
    private List<String> authRoles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<String> getAuthRoles() {
        return authRoles;
    }

    public void setAuthRoles(List<String> authRoles) {
        this.authRoles = authRoles;
    }
}
