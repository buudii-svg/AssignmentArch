package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.example.demo.Core.Ride;

public class ArrayRidesPersistence implements RidesPersistence {

    private static List<Ride> allRides = new ArrayList<Ride>();

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


    public boolean addRate(Ride r)
    {
        for (Ride ride : allRides) {
            if (ride.getId() == r.getId()) {
                ride.setRate(r.getRate());
                return true;
            }
        }
        return false;
    }

}