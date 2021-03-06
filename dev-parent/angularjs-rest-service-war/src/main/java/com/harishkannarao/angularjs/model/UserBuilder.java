package com.harishkannarao.angularjs.model;

import com.harishkannarao.angularjs.constants.Roles;

import java.util.ArrayList;
import java.util.List;

public class UserBuilder {
    private String username;
    private String password;
    private List<Roles> authRoles;

    private UserBuilder() {}

    public static UserBuilder newBuilder() {
        return new UserBuilder();
    }

    public User build() {
        User result = new User();
        result.setUsername(username);
        result.setPassword(password);
        result.setAuthRoles(authRoles);
        return result;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setAuthRoles(List<Roles> authRoles) {
        this.authRoles = authRoles;
        return this;
    }

    public UserBuilder setAuthRolesAsEmptyList() {
        this.authRoles = new ArrayList<>();
        return this;
    }

    public UserBuilder addAuthRole(Roles authRole) {
        if(this.authRoles == null) {
            this.authRoles = new ArrayList<>();
        }
        this.authRoles.add(authRole);
        return this;
    }
}
