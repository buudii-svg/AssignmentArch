package com.example.demo.application;

import java.util.List;
import com.example.demo.Persistence.ArrayDriverPersistence;
import com.example.demo.Persistence.DriverPersistence;
import com.example.demo.observers.Driver;

public class DriverService implements IDriverService {
    private DriverPersistence persistence = new ArrayDriverPersistence();

    public boolean add(Driver d) {
        d.setId(persistence.getNextId());
        return persistence.add(d);
    }

    public Driver get(String name) {
        return (Driver) persistence.get(name);
    }

    public List<Driver> getAll() {
        return persistence.getAll();
    }

    public boolean delete(int id) {
        return persistence.delete(id);
    }

    public boolean update(Driver d) {
        return persistence.update(d);
    }

    public boolean login(Driver d) {
        return persistence.login(d);
    }
}
