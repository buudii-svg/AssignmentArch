package com.example.demo.Persistence;

import java.util.List;
import com.example.demo.observers.Driver;

public interface DriverPersistence {

    public boolean add(Driver d);

    public Driver get(String name);

    public List<Driver> getAll();

    public int getNextId();

    public boolean delete(String name);

    public boolean update(Driver d);

    public boolean login(Driver d);

}
