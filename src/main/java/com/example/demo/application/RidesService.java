package com.example.demo.application;

import java.util.List;

import com.example.demo.Offer;
import com.example.demo.Core.Driver;
import com.example.demo.Core.Ride;
import com.example.demo.Persistence.ArrayRidesPersistence;
import com.example.demo.Persistence.RidesPersistence;

public class RidesService implements IRidesService {
    private RidesPersistence persistence = new ArrayRidesPersistence();

    @Override
    public boolean add(Ride ride) {
        ride.setId(persistence.getNextId());
        return persistence.add(ride);
    }

    @Override
    public Ride get(int id) {
        return persistence.get(id);
    }

    @Override
    public List<Ride> getAll() {
        return persistence.getAll();
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    public List<Ride> getRideHistory(int userId) {
        return persistence.getRideHistory(userId);
    }

    public boolean addRate(Ride r) {
        return persistence.addRate(r);
    }

    public boolean requestRide(String source, String dest, Ride r)
        {
        return persistence.requestRide(source, dest,r);
    }

    public double calcETA()
    {
        return persistence.calcETA();
    }

    // public boolean addOffer(int rideId, Offer offer, Driver d)
    // {
    //     return persistence.addOffer(rideId, offer, d);
    // }

    // public List<Offer> getAllOffers(int rideId)
    // {
    //     return persistence.getAllOffers(rideId);
    // }

}
