package com.example.demo;

public interface FavAreaSubject {
    public void registerObserver(DriverObserver o);
    public void removeObserver(DriverObserver o);
    public void notifyObservers();
}
