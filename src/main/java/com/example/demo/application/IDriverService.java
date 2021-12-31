package com.example.demo.application;

import java.util.List;

import com.example.demo.Offer;
import com.example.demo.Core.Driver;

public interface IDriverService {
    boolean add(Driver d);

    Driver get(int id);

    List<Driver> getAll();

    boolean delete(int id);

    boolean update(Driver d);

    boolean login(Driver d);

    boolean addOffer(Offer offer, int rideId);
}