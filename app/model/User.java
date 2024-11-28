package com.example.blockchainvoting.model;

import jakarta.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> roles;

    private String confirmationToken;  
    public User() {}

    public User(String username, String password, Set<String> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.confirmationToken = UUID.randomUUID().toString();
    }

  

    public Long getId() {
        return id;
    }

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

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }
}
