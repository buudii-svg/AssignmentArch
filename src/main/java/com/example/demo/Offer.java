package com.example.demo;

import com.example.demo.Core.Driver;



public class Offer {
    private int price;
    private Driver driver;

    public Offer() {}

    public Offer(int price, Driver driver) {
        this.price = price;
        this.driver = driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public Driver getDriver() {
         return driver;
    }

    public int getPrice() {
        return price;
    }
}
