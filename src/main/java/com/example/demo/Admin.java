package com.example.demo;

import java.util.ArrayList;

import com.example.demo.Core.Driver;
import com.example.demo.Persistence.ArrayDriverPersistence;
import com.example.demo.Persistence.DriverPersistence;

public class Admin {

    ArrayList<Driver> pendingRegistrations = new ArrayList<>();
    DriverPersistence dp = new ArrayDriverPersistence();

    public ArrayList<Driver> listDriverPendingRegisteration() {
        for (Driver d : dp.getAll()) {
            if (d.isPending() == true) {
                pendingRegistrations.add(d);
            }
        }
        return pendingRegistrations;
    }

    public boolean verifyDriver(int id) {
        for (Driver d : pendingRegistrations) {
            if (d.getId() == id) {
                d.setPending(false);
                pendingRegistrations.remove(d);
                return true;
            }
        }
        return false;
    }

}
