package se.nackademin.domain;

import java.util.UUID;

public class User {
    private String username;
    private String password;
    private UUID id;
    
    public User(String username, String password) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UUID getId() {
        return id;
    }
    
    
}
