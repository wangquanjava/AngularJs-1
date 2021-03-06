package com.harishkannarao.angularjs.service;

import com.harishkannarao.angularjs.constants.Roles;
import com.harishkannarao.angularjs.model.User;
import com.harishkannarao.angularjs.model.UserBuilder;

import javax.ejb.Stateless;
import java.util.*;

@Stateless
public class UserService {

    private static Map<String, User> users = createUsers();

    private static Map<String, User> createUsers() {
        Map<String, User> users = new HashMap<>();

        User user1 = UserBuilder.newBuilder()
                .setUsername("user1")
                .setPassword("pass1")
                .addAuthRole(Roles.ROLE1)
                .addAuthRole(Roles.ROLE2)
                .addAuthRole(Roles.ROLE3)
                .build();
        User user2 = UserBuilder.newBuilder()
                .setUsername("user2")
                .setPassword("pass2")
                .addAuthRole(Roles.ROLE1)
                .build();
        User user3 = UserBuilder.newBuilder()
                .setUsername("user3")
                .setPassword("pass3")
                .setAuthRolesAsEmptyList()
                .build();
        User user4 = UserBuilder.newBuilder()
                .setUsername("user4")
                .setPassword("pass4")
                .addAuthRole(Roles.ROLE3)
                .build();
        User user5 = UserBuilder.newBuilder()
                .setUsername("user5")
                .setPassword("pass5")
                .addAuthRole(Roles.ROLE2)
                .build();

        users.put(user1.getUsername(), user1);
        users.put(user2.getUsername(), user2);
        users.put(user3.getUsername(), user3);
        users.put(user4.getUsername(), user4);
        users.put(user5.getUsername(), user5);

        return users;
    }

    public Optional<User> findByUsernameAndPassword(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return Optional.of(user);
        } else {
            return Optional.empty();
        }
    }

    public Optional<User> getUser(String username) {
        return Optional.ofNullable(users.get(username));
    }
}
