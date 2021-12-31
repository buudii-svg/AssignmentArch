package com.example.demo.observers;

import java.util.ArrayList;

import com.example.demo.Core.Driver;

public class FavouriteArea implements FavAreaSubject {
    private String name;
    private ArrayList<DriverObserver> observers;
    private ArrayList<Driver> drivers;

    public void setDriver(Driver d) {
        drivers.add(d);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void notifyObservers() {
        for (DriverObserver o : observers) {
            o.update(this.name);
        }
    }

    public void registerObserver(DriverObserver o) {
        observers.add(o);
    }

    public void removeObserver(DriverObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

}
