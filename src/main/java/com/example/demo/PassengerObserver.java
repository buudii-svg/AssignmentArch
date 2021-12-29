package com.example.demo;

import java.util.ArrayList;

public interface PassengerObserver {
//this is observer

    public void update(String source, String dest, ArrayList<Offer> offers);
}
