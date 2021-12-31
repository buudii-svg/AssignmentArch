package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Offer;
import com.example.demo.Core.Ride;
import com.example.demo.observers.Driver;

public class ArrayDriverPersistence implements DriverPersistence {
    private static List<Driver> drivers = new ArrayList<Driver>();
    private RidesPersistence ridesPersistence = new ArrayRidesPersistence();
    @Override
    public boolean add(Driver d) {
        return drivers.add(d);
    }

    public int getNextId() {
        return drivers.size();
    }

    @Override
    public Driver get(int id) {
        for (Driver d : drivers) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }

    @Override
    public List<Driver> getAll() {
        return drivers;
    }

    @Override
    public boolean delete(int id) {
        for (Driver d : drivers) {
            if (d.getId() == id) {
                return drivers.remove(d);
            }
        }
        return false;
    }

    @Override
    public boolean update(Driver d) {
        for (Driver driver : drivers) {
            if (driver.getName().equals(d.getName())) {
                driver.setAge(d.getAge());
                driver.getMobileNum().equals(d.getMobileNum());
                driver.getEmail().equals(d.getEmail());
                driver.getPassword().equals(d.getPassword());
                driver.setId(d.getId());
                driver.setDriverBalance(d.getDriverBalance());
                driver.getRideHistory().equals(d.getRideHistory());
                driver.getDriverLicense().equals(d.getDriverLicense());
                driver.getNational_Id().equals(d.getNational_Id());
                driver.setFavArea(d.getFavArea());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(Driver d) {
        for (Driver driver : drivers) {
            if (driver.getPassword().equals(d.getPassword()) && driver.getId() == d.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addOffer(Offer offer, int rideId)
    {
        int i = 0;
        for(Ride r:ridesPersistence.getAll())
        {
            if(r.getId() == rideId)
            {
                ridesPersistence.getAll().get(i).setOffers(offer);
                return true;
            }
            i++;
        }
        return false;
    }

}
