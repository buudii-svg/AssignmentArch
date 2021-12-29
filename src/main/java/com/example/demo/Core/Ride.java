package com.example.demo.Core;

import java.util.ArrayList;

import com.example.demo.RideSubject;
import com.example.demo.Offer;
import com.example.demo.PassengerObserver;

public class Ride implements RideSubject {

    private int id;
    private String source;
    private String dest;
    private ArrayList<Offer> offers;
    private ArrayList<PassengerObserver> observers;
    private float rate;
    private int passengerId;
    private int driverId;


    public Ride(String source, String dest, int passengerId) {
        this.source = source;
        this.dest = dest;
        this.passengerId = passengerId;
        observers = new ArrayList<>();
    }
    public int getPassengerId() {
        return passengerId;
    }
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setOffers(Offer offer) {
        if (offer != null) {
            this.offers.add(offer);
            notifyObservers();
        }
    }

    public ArrayList<Offer> getOffers() {
        return offers;
    }

    public void requestRide() {
        notifyObservers();
    }

    public void notifyObservers() {
        for (PassengerObserver o : observers) {
            // o.update(this.source, this.dest, this.offers);
        }
    }

    public void registerObserver(PassengerObserver o) {
        observers.add(o);
    }

    public void removeObserver(PassengerObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

}
