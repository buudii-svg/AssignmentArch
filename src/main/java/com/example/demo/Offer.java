package com.example.demo;

public class Offer {
    private double price;
    private Driver driver;


    public Offer(double price, Driver driver){
        this.price = price;
        this.driver = driver;
    }
    public Driver getDriver()
    {
        return driver;
    }
    public double getPrice()
    {
        return price;
    }
}
