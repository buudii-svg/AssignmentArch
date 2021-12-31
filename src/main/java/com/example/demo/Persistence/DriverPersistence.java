package com.example.demo.Persistence;

import java.util.List;

import com.example.demo.Offer;
import com.example.demo.Core.Driver;

public interface DriverPersistence {

    public boolean add(Driver d);

    public Driver get(int id);

    public List<Driver> getAll();

    public int getNextId();

    public boolean delete(int id);

    public boolean update(Driver d);

    public boolean login(Driver d);

    public boolean addOffer(Offer offer, int rideId);

}
