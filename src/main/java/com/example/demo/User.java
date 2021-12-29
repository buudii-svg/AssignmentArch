package com.example.demo;

public class User {
    private String name;
    private String mobileNum;
    private String email;
    private String password;


    public User(String name, String mobileNum, String email, String password) {
        this.name = name;
        this.mobileNum = mobileNum;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
