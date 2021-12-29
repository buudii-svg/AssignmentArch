package com.example.demo.observers;

import java.util.ArrayList;

import com.example.demo.Offer;

public interface PassengerObserver {
    // this is observer

    public void update(ArrayList<Offer> offers);
}
