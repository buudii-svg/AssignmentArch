package com.example.demo;

import java.util.ArrayList;

public class FavouriteArea implements FavAreaSubject{
    private String name;
    private ArrayList<DriverObserver> observers;


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
