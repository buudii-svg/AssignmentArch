package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Calculator;
import com.example.demo.Harvesine;
import com.example.demo.Offer;
import com.example.demo.googleMapsApi;
import com.example.demo.Controllers.FavAreaController;
import com.example.demo.Core.Ride;
import com.example.demo.observers.FavouriteArea;

public class ArrayRidesPersistence implements RidesPersistence {

    private static List<Ride> allRides = new ArrayList<Ride>();
    private FavouriteArea fArea = new FavouriteArea();
    private FavAreaController fController = new FavAreaController();
    private static int callsCounter = 0;

    @Override
    public int getNextId() {
        return allRides.size();
    }

    @Override
    public boolean add(Ride ride) {
        return allRides.add(ride);
    }

    @Override
    public Ride get(int id) {
        for (Ride ride : allRides) {
            if (ride.getId() == id) {
                return ride;
            }
        }
        return null;
    }

    @Override
    public List<Ride> getAll() {
        return allRides;
    }

    @Override
    public boolean delete(int id) {
        for (Ride ride : allRides) {
            if (ride.getId() == id) {
                return allRides.remove(ride);
            }
        }

        return false;
    }

    public List<Ride> getRideHistory(int userId) {
        List<Ride> r = new ArrayList<>();
        for (Ride ride : allRides) {
            if (ride.getPassengerId() == userId || ride.getDriverId() == userId) {
                r.add(ride);
            }
        }
        return r;
    }

    public boolean addRate(Ride r) {
        for (Ride ride : allRides) {
            if (ride.getId() == r.getId()) {
                ride.setRate(r.getRate());
                return true;
            }
        }
        return false;
    }

    public boolean requestRide(String source, String dest, Ride r) {
        r.setDest(dest);
        r.setSource(source);
        add(r);
        fArea.setName(source);
        fController.addFavArea(fArea);
        return true;
    }

    // public boolean addOffer(int rideId,Offer offer, Driver d)
    // {
    // for(Ride r : allRides)
    // {
    // if(rideId == r.getId())
    // {
    // offer.setDriver(d);
    // r.setOffers(offer);
    // return true;
    // }
    // }
    // return false;
    // }

    public List<Offer> getAllOffers(int rideId) {
        for (Ride r : allRides) {
            if (rideId == r.getId()) {
                return r.getOffers();
            }
        }
        return null;
    }

    public double calcETA() {
        Calculator calc = new googleMapsApi();
        if (callsCounter > 6) {
            calc = new Harvesine(20, 20);
            return calc.calculateETA();
        }
        callsCounter++;
        return calc.calculateETA();
    }
    // public List<Offer> getOffers(Ride r)
    // {
    // return r.getOffers();
    // }
}