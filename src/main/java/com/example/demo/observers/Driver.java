package com.example.demo.observers;

import java.util.ArrayList;

import com.example.demo.Core.User;

public class Driver extends User implements DriverObserver {

    private String driverLicense;
    private String national_Id;
    private ArrayList<FavouriteArea> favAreas;
    private boolean pending = true;
    private double driverBalance;

    public double getDriverBalance() {
        return driverBalance;
    }

    public void setFavArea(ArrayList<FavouriteArea> favAreas) {
        this.favAreas = favAreas;
    }

    public ArrayList<FavouriteArea> getFavArea() {
        return favAreas;
    }

    public void setDriverBalance(double driverBalance) {
        this.driverBalance += driverBalance;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    public Driver(int age, String name, String mobileNum, String email, String password, String driverLicense,
            String national_Id) {
        super(age, name, mobileNum, email, password);
        this.driverLicense = driverLicense;
        this.national_Id = national_Id;
    }

    // public void addFavArea(FavouriteArea fav) {
    // favAreas.add(fav);
    // }

    public String getDriverLicense() {
        return driverLicense;
    }

    public String getNational_Id() {
        return national_Id;
    }

    // public void listFavAreas() {
    // for (int i = 0; i < favAreas.size(); i++) {
    // System.out.println(favAreas.get(i));
    // }
    // }

    @Override
    public void update(String area) {
        for (FavouriteArea i : favAreas)
            if (i.getName() == area) {
                System.out.println("Fav Area detected" + area);
            }
    }
}
