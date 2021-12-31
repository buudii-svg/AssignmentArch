package com.example.demo.application;

import java.util.List;

import com.example.demo.observers.Driver;

public interface IDriverService {
    boolean add(Driver d);

    Driver get(String name);

    List<Driver> getAll();

    boolean delete(int id);

    boolean update(Driver d);

    boolean login(Driver d);
}