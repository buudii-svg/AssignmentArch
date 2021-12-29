package com.example.demo.Core;

import java.util.ArrayList;

public class User {
    private String name;
    private String mobileNum;
    private String email;
    private String password;
    private int age;
    private int id;
    ArrayList<Ride> rideHistory = new ArrayList<>();

    public User(int age, String name, String mobileNum, String email, String password) {
        this.age = age;
        this.name = name;
        this.mobileNum = mobileNum;
        this.email = email;
        this.password = password;
    }

    public void addToRideHistory(Ride ride)
    {
        rideHistory.add(ride);
    }

    public ArrayList<Ride> getRideHistory()
    {
        return rideHistory;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
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
