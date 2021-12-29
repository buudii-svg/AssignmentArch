package com.example.demo;

public interface RideSubject {
    public void registerObserver(PassengerObserver o);
    public void removeObserver(PassengerObserver o);
    public void notifyObservers();
}
// this is subject
