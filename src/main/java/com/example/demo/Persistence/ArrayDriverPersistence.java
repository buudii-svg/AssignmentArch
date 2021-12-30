package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.observers.Driver;

public class ArrayDriverPersistence implements DriverPersistence {
    private static List<Driver> drivers = new ArrayList<Driver>();

    @Override
    public boolean add(Driver d) {
        return drivers.add(d);
    }

    public int getNextId() {
        return drivers.size();
    }

    @Override
    public Driver get(String name) {
        for (Driver d : drivers) {
            if (d.getName().equals(name)) {
                return d;
            }
        }
        return null;
    }

    @Override
    public List<Driver> getAll() {
        return drivers;
    }

    @Override
    public boolean delete(String name) {
        for (Driver d : drivers) {
            if (d.getName().equals(name)) {
                return drivers.remove(d);
            }
        }
        return false;
    }

    @Override
    public boolean update(Driver d) {
        for (Driver driver : drivers) {
            if (driver.getName().equals(d.getName())) {
                driver.setAge(d.getAge());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(Driver d) {
        for (Driver driver : drivers) {
            if (driver.getPassword().equals(d.getPassword()) && driver.getId() == d.getId()) {
                return true;
            }
        }
        return false;
    }
}
