package com.example.demo.Core;

import java.util.ArrayList;

import com.example.demo.Offer;
import com.example.demo.observers.PassengerObserver;

public class Passenger extends User implements PassengerObserver {

    public Passenger(int age, String name, String mobileNum, String email, String password) {
        super(age, name, mobileNum, email, password);
    }

    // @Override
    // public void update(String source, String dest, ArrayList<Offer> offers) {
    // System.out.println(offers.get(offers.size() - 1).getPrice());
    // System.out.println(offers.get(offers.size() - 1).getDriver().getName());
    // }

    @Override
    public void update(ArrayList<Offer> offers) {
        
    }

}
