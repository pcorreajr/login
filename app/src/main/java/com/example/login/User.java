package com.example.login;
public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String createdAt;
    private String updatedAt;

    public User(int id, String name, String username, String password, String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
