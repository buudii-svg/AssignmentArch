package com.example.demo;

import java.util.ArrayList;

import com.example.demo.Core.User;

public class Passenger extends User implements PassengerObserver {

    private int userID;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Passenger(int age, String name, String mobileNum, String email, String password) {
        super(age,name, mobileNum, email, password);
    }


    @Override
    public void update(String source, String dest, ArrayList<Offer> offers) {
        System.out.println(offers.get(offers.size() - 1).getPrice());
        System.out.println(offers.get(offers.size() - 1).getDriver().getName());
    }


}
