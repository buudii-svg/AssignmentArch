package com.example.demo.Persistence;

import java.util.List;

import com.example.demo.Offer;
import com.example.demo.Core.Ride;
import com.example.demo.observers.Driver;

public interface RidesPersistence {

    public int getNextId();

    boolean add(Ride ride);

    Ride get(int id);

    List<Ride> getAll();

    boolean delete(int id);

    List<Ride> getRideHistory(int userId);

    boolean addRate(Ride r);

    public boolean requestRide(String source, String dest, Ride r);

    public List<Offer> getAllOffers(int rideId);

    public double calcETA();

}