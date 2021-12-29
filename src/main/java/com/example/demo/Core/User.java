package com.example.demo.Core;

public class User {
    private String name;
    private String mobileNum;
    private String email;
    private String password;
    private int age;


    public User(int age,String name, String mobileNum, String email, String password) {
        this.age = age;
        this.name = name;
        this.mobileNum = mobileNum;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
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
