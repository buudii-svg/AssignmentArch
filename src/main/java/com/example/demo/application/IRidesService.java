package com.example.demo.application;

import java.util.List;

import com.example.demo.Offer;
import com.example.demo.Core.Ride;
import com.example.demo.observers.Driver;

public interface IRidesService {
    boolean add(Ride person);

    Ride get(int id);

    List<Ride> getAll();

    boolean delete(int id);

    List<Ride> getRideHistory(int userId);

    public boolean addRate(Ride r);

    boolean requestRide(String source, String dest, Ride r);
    
    // public boolean addOffer(int rideId, Offer offer, Driver d);

    // public List<Offer> getAllOffers(int rideId);
}
