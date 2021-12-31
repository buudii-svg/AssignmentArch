package com.example.demo;

public class Harvesine implements Calculator {
    private double time;
    private double distance;
    private double speed;

    public Harvesine( double distance, double speed) {
        this.distance = distance;
        this.speed = speed;
    }

    @Override
    public double calculateDistance() {
        return distance;
    }

    @Override
    public double calculateETA() {
        time = distance / speed;
        return time;
    }
}
